package H3;

import X0.EnumC0414a;
import android.animation.ValueAnimator;
import android.view.View;
import f1.C4499b;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1123n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1124u;

    public /* synthetic */ i(int i, Object obj) {
        this.f1123n = i;
        this.f1124u = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1123n) {
            case 0:
                m mVar = (m) this.f1124u;
                mVar.getClass();
                mVar.f1174d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                X0.v vVar = (X0.v) this.f1124u;
                EnumC0414a enumC0414a = vVar.f3695r0;
                if (enumC0414a == null) {
                    enumC0414a = EnumC0414a.f3591n;
                }
                if (enumC0414a != EnumC0414a.f3592u) {
                    C4499b c4499b = vVar.f3673H;
                    if (c4499b != null) {
                        c4499b.r(vVar.f3698u.h());
                        break;
                    }
                } else {
                    vVar.invalidateSelf();
                    break;
                }
                break;
            default:
                com.onesignal.inAppMessages.internal.display.impl.j.animateViewColor$lambda$0((View) this.f1124u, valueAnimator);
                break;
        }
    }
}
