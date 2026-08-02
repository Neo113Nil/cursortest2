package X1;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;
import com.anythink.basead.exoplayer.k.p;

/* loaded from: classes.dex */
public final class d extends W1.a {
    public final /* synthetic */ int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i) {
        super(1);
        this.Y = i;
    }

    @Override // W1.e
    public final ValueAnimator d() {
        W1.d dVar = W1.e.f3542O;
        W1.d dVar2 = W1.e.f3540M;
        switch (this.Y) {
            case 0:
                Float valueOf = Float.valueOf(1.0f);
                float[] fArr = {0.0f, 0.35f, 0.7f, 1.0f};
                U1.e eVar = new U1.e(this);
                eVar.c(fArr, W1.e.f3546S, new Float[]{valueOf, Float.valueOf(0.0f), valueOf, valueOf});
                eVar.f3287c = 1300L;
                eVar.b(fArr);
                return eVar.a();
            case 1:
                float[] fArr2 = {0.0f, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
                U1.e eVar2 = new U1.e(this);
                Integer valueOf2 = Integer.valueOf(p.f9259b);
                eVar2.d(fArr2, W1.e.f3547T, new Integer[]{0, 0, valueOf2, valueOf2, 0, 0});
                eVar2.d(fArr2, dVar2, new Integer[]{-180, -180, 0, 0, 0, 0});
                eVar2.d(fArr2, dVar, new Integer[]{0, 0, 0, 0, 180, 180});
                eVar2.f3287c = 2400L;
                eVar2.f3286b = new LinearInterpolator();
                return eVar2.a();
            case 2:
                float[] fArr3 = {0.0f, 0.5f, 1.0f};
                U1.e eVar3 = new U1.e(this);
                eVar3.d(fArr3, dVar2, new Integer[]{0, -180, -180});
                eVar3.d(fArr3, dVar, new Integer[]{0, 0, -180});
                eVar3.f3287c = 1200L;
                eVar3.b(fArr3);
                return eVar3.a();
            default:
                Float valueOf3 = Float.valueOf(0.4f);
                float[] fArr4 = {0.0f, 0.2f, 0.4f, 1.0f};
                U1.e eVar4 = new U1.e(this);
                eVar4.c(fArr4, W1.e.f3545R, new Float[]{valueOf3, Float.valueOf(1.0f), valueOf3, valueOf3});
                eVar4.f3287c = 1200L;
                eVar4.b(fArr4);
                return eVar4.a();
        }
    }

    @Override // W1.e, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.Y) {
            case 2:
                Rect a9 = W1.e.a(rect);
                f(a9.left, a9.top, a9.right, a9.bottom);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }
}
