package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import ru.yandex.taxi.eatskit.c;

/* loaded from: classes2.dex */
public final class wgk implements DefaultLifecycleObserver {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public wgk(ep31 ep31Var) {
        this.a = 4;
        this.c = ep31Var;
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((xgk) obj2).a.remove((a3z) obj);
                break;
            case 1:
                ((bhk) obj2).a.remove((sls) obj);
                break;
            case 2:
                ((bhk) obj2).b.remove((u8g0) obj);
                break;
            case 3:
                ((c) obj2).c();
                ((Lifecycle) obj).d(this);
                break;
            default:
                peyVar.getLifecycle().d(this);
                ep31 ep31Var = (ep31) obj;
                if (!((Handler) obj2).post(new bh11(24, ep31Var))) {
                    if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
                        ny61.r("Trying attempt access to binding in background thread ");
                        break;
                    } else {
                        ep31Var.c = null;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ wgk(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
