package D0;

import V0.k;
import android.animation.ValueAnimator;
import android.view.View;
import h.M;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f125b;

    public /* synthetic */ b(int i, Object obj) {
        this.f124a = i;
        this.f125b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f124a) {
            case 0:
                d dVar = (d) this.f125b;
                dVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar.j.setAlpha((int) (255.0f * floatValue));
                dVar.f148x = floatValue;
                break;
            case 1:
                ((View) ((M) ((B.b) this.f125b).f10b).f3159d.getParent()).invalidate();
                break;
            default:
                k kVar = (k) this.f125b;
                kVar.getClass();
                kVar.f1321d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ b(B.b bVar, View view) {
        this.f124a = 1;
        this.f125b = bVar;
    }
}
