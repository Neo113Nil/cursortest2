package androidx.core.app;

import android.app.Application;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((d) this.b).a = this.c;
                return;
            case 1:
                ((Application) this.c).unregisterActivityLifecycleCallbacks((d) this.b);
                return;
            case 2:
                try {
                    Method method = e.d;
                    Object obj = this.b;
                    Object obj2 = this.c;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 3:
                com.yandex.passport.legacy.lx.b bVar = (com.yandex.passport.legacy.lx.b) this.b;
                if (bVar.b.a) {
                    return;
                }
                bVar.c.mo1b(this.c);
                return;
            default:
                com.yandex.passport.legacy.lx.b bVar2 = (com.yandex.passport.legacy.lx.b) this.c;
                if (bVar2.b.a) {
                    return;
                }
                bVar2.c.mo1b((Throwable) this.b);
                return;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
