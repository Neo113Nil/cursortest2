package D;

import L1.AbstractC0018t;
import O.K;
import R1.l;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import v1.j;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105a;

    /* renamed from: b, reason: collision with root package name */
    public Object f106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f107c;

    public /* synthetic */ b(Object obj, int i, Object obj2) {
        this.f105a = i;
        this.f106b = obj;
        this.f107c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q1.h hVar;
        Object obj = this.f107c;
        switch (this.f105a) {
            case 0:
                ((c) this.f106b).f108a = obj;
                return;
            case 1:
                ((Application) obj).unregisterActivityLifecycleCallbacks((c) this.f106b);
                return;
            case 2:
                try {
                    Method method = d.f116d;
                    Object obj2 = this.f106b;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        d.e.invoke(obj, obj2, Boolean.FALSE);
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
                F.b bVar = (F.b) ((B.b) this.f106b).f10b;
                if (bVar != null) {
                    bVar.h((Typeface) obj);
                    return;
                }
                return;
            case 4:
                ((L.g) this.f106b).accept(obj);
                return;
            case 5:
                int i = 0;
                do {
                    try {
                        ((Runnable) this.f106b).run();
                    } catch (Throwable th2) {
                        AbstractC0018t.b(th2, j.f4497a);
                    }
                    hVar = (Q1.h) obj;
                    Runnable h2 = hVar.h();
                    if (h2 == null) {
                        return;
                    }
                    this.f106b = h2;
                    i++;
                } while (i < 16);
                l lVar = hVar.f949c;
                lVar.getClass();
                lVar.b(hVar, this);
                return;
            default:
                U.e eVar = ((SwipeDismissBehavior) obj).f2360a;
                if (eVar == null || !eVar.h()) {
                    return;
                }
                WeakHashMap weakHashMap = K.f747a;
                ((View) this.f106b).postOnAnimation(this);
                return;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, int i, boolean z2) {
        this.f105a = i;
        this.f107c = obj;
        this.f106b = obj2;
    }

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f105a = 6;
        this.f107c = swipeDismissBehavior;
        this.f106b = view;
    }
}
