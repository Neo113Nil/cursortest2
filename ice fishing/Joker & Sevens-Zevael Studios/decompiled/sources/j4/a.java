package j4;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f3526e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3527a;

    /* renamed from: b, reason: collision with root package name */
    public final File f3528b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f3529c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f3530d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        this.f3527a = z10;
        this.f3528b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = f3526e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3529c = lock;
    }

    public final void a(boolean z10) {
        this.f3529c.lock();
        if (z10) {
            File file = this.f3528b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f3530d = channel;
            } catch (IOException e10) {
                this.f3530d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f3530d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f3529c.unlock();
    }
}
