package A0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f6e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7a;

    /* renamed from: b, reason: collision with root package name */
    public final File f8b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f9c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f10d;

    public a(String str, File file, boolean z8) {
        Lock lock;
        this.f7a = z8;
        File file2 = new File(file, str.concat(".lck"));
        this.f8b = file2;
        String absolutePath = file2.getAbsolutePath();
        h.d(absolutePath, "lockFile.absolutePath");
        HashMap hashMap = f6e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(absolutePath);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(absolutePath, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9c = lock;
    }

    public final void a(boolean z8) {
        this.f9c.lock();
        if (z8) {
            File file = this.f8b;
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f10d = channel;
            } catch (IOException e6) {
                this.f10d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e6);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f10d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f9c.unlock();
    }
}
