package L;

import O.T;
import O.X;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f436a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f437b;

    /* renamed from: c, reason: collision with root package name */
    public Object f438c;

    /* renamed from: d, reason: collision with root package name */
    public Object f439d;

    public /* synthetic */ m() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f436a) {
            case 0:
                try {
                    obj = ((f) this.f437b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f439d).post(new D.b((g) this.f438c, 4, obj));
                break;
            default:
                T.h((View) this.f437b, (F.i) this.f438c);
                ((ValueAnimator) this.f439d).start();
                break;
        }
    }

    public m(View view, X x2, F.i iVar, ValueAnimator valueAnimator) {
        this.f437b = view;
        this.f438c = iVar;
        this.f439d = valueAnimator;
    }
}
