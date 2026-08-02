package defpackage;

import android.content.Context;
import android.util.AtomicFile;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public abstract class vju {
    public static final ReentrantLock a = new ReentrantLock();

    public static void a(Context context, String str) {
        Object t7oVar;
        str.getClass();
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            quj.i0(context).mkdir();
            AtomicFile atomicFile = new AtomicFile(new File(quj.i0(context), "puid"));
            FileOutputStream fileOutputStream = null;
            try {
                r7o r7oVar = z7o.b;
                fileOutputStream = atomicFile.startWrite();
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                bytes.getClass();
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                atomicFile.finishWrite(fileOutputStream);
                t7oVar = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a2 = z7o.a(t7oVar);
            if (a2 != null) {
                if (fileOutputStream != null) {
                    atomicFile.failWrite(fileOutputStream);
                }
                ssg.a(7, "VpnGatePuidDataSource", "Can't save puid ".concat(str), a2);
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
