package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class dk4 {
    public final Context a;
    public final xdr b = ydr.a(new hxc(s84.f));
    public final xdr c = ydr.a(null);
    public final x0q d = y0q.b(0, 1, null, 5);
    public final sld e = new sld(17, new ix6(16, this));
    public final jyr f = l18.b.b(hag.I(jk4.class), true);
    public jmp g;

    public dk4(Context context) {
        this.a = context;
    }

    public final pjc a() {
        return zsd.b0(new d64(this.b, 1));
    }

    public final void b() {
        jmp jmpVar = this.g;
        if (jmpVar != null) {
            try {
                jmpVar.b(true);
            } catch (RemoteException e) {
                ssg.a(5, "ChromeCastCenter", "endCurrentSession() thrown an exception", e);
            } catch (Exception e2) {
                Assertions.throwOrSkip("ChromeCastCenter", new FailedAssertionException("endCurrentSession() thrown an unexpected exception", e2));
            }
        }
    }

    public final jk4 c() {
        return (jk4) this.f.getValue();
    }

    public final void d() {
        r93 r93Var = new r93(17, this);
        if (lbr.a.get() == gcr.c) {
            r93Var.invoke();
            return;
        }
        ReentrantLock reentrantLock = lbr.e;
        reentrantLock.lock();
        try {
            lbr.f.add(r93Var);
            reentrantLock.unlock();
            lbr.b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean e(Activity activity) {
        activity.getClass();
        pmd pmdVar = pmd.e;
        if (pmdVar.b(activity, qmd.a) == 0) {
            d();
            return true;
        }
        pmdVar.c(activity).addOnCompleteListener(new n(13, this));
        return false;
    }
}
