package J3;

import Z0.EnumC0418a;
import android.animation.ValueAnimator;
import android.view.View;
import h1.C4564b;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1479n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1480u;

    public /* synthetic */ i(int i, Object obj) {
        this.f1479n = i;
        this.f1480u = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1479n) {
            case 0:
                m mVar = (m) this.f1480u;
                mVar.getClass();
                mVar.f1530d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                Z0.v vVar = (Z0.v) this.f1480u;
                EnumC0418a enumC0418a = vVar.m0;
                if (enumC0418a == null) {
                    enumC0418a = EnumC0418a.f3943n;
                }
                if (enumC0418a != EnumC0418a.f3944u) {
                    C4564b c4564b = vVar.f4025H;
                    if (c4564b != null) {
                        c4564b.r(vVar.f4053u.h());
                        break;
                    }
                } else {
                    vVar.invalidateSelf();
                    break;
                }
                break;
            default:
                com.onesignal.inAppMessages.internal.display.impl.j.animateViewColor$lambda$0((View) this.f1480u, valueAnimator);
                break;
        }
    }
}
