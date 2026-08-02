package X1;

import android.animation.ValueAnimator;
import com.anythink.basead.exoplayer.k.p;

/* loaded from: classes.dex */
public final class a extends W1.a {
    public final /* synthetic */ int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, boolean z6) {
        super(0);
        this.Y = i;
    }

    @Override // W1.e
    public final ValueAnimator d() {
        W1.d dVar = W1.e.f3547T;
        W1.c cVar = W1.e.f3546S;
        switch (this.Y) {
            case 0:
                Float valueOf = Float.valueOf(0.0f);
                float[] fArr = {0.0f, 0.5f, 1.0f};
                U1.e eVar = new U1.e(this);
                eVar.c(fArr, cVar, new Float[]{valueOf, Float.valueOf(1.0f), valueOf});
                eVar.f3287c = com.anythink.basead.exoplayer.i.a.f8669f;
                eVar.b(fArr);
                return eVar.a();
            case 1:
                Float valueOf2 = Float.valueOf(0.0f);
                float[] fArr2 = {0.0f, 0.5f, 1.0f};
                U1.e eVar2 = new U1.e(this);
                eVar2.c(fArr2, cVar, new Float[]{valueOf2, Float.valueOf(1.0f), valueOf2});
                eVar2.f3287c = 1200L;
                eVar2.b(fArr2);
                return eVar2.a();
            case 2:
                Float valueOf3 = Float.valueOf(0.0f);
                float[] fArr3 = {0.0f, 0.5f, 1.0f};
                U1.e eVar3 = new U1.e(this);
                eVar3.c(fArr3, cVar, new Float[]{valueOf3, Float.valueOf(1.0f), valueOf3});
                eVar3.f3287c = com.anythink.basead.exoplayer.i.a.f8669f;
                eVar3.b(fArr3);
                return eVar3.a();
            case 3:
                float[] fArr4 = {0.0f, 0.39f, 0.4f, 1.0f};
                U1.e eVar4 = new U1.e(this);
                eVar4.d(fArr4, dVar, new Integer[]{0, 0, Integer.valueOf(p.f9259b), 0});
                eVar4.f3287c = 1200L;
                eVar4.b(fArr4);
                return eVar4.a();
            case 4:
                float[] fArr5 = {0.0f, 1.0f};
                U1.e eVar5 = new U1.e(this);
                eVar5.c(fArr5, cVar, new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)});
                eVar5.d(fArr5, dVar, new Integer[]{Integer.valueOf(p.f9259b), 0});
                eVar5.f3287c = 1000L;
                eVar5.b(fArr5);
                return eVar5.a();
            case 5:
                float[] fArr6 = {0.0f, 0.5f, 1.0f};
                U1.e eVar6 = new U1.e(this);
                eVar6.d(fArr6, W1.e.f3540M, new Integer[]{0, -180, -180});
                eVar6.d(fArr6, W1.e.f3542O, new Integer[]{0, 0, -180});
                eVar6.f3287c = 1200L;
                eVar6.b(fArr6);
                return eVar6.a();
            default:
                Float valueOf4 = Float.valueOf(0.0f);
                float[] fArr7 = {0.0f, 0.4f, 0.8f, 1.0f};
                U1.e eVar7 = new U1.e(this);
                eVar7.c(fArr7, cVar, new Float[]{valueOf4, Float.valueOf(1.0f), valueOf4, valueOf4});
                eVar7.f3287c = 1400L;
                eVar7.b(fArr7);
                return eVar7.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i) {
        super(0);
        this.Y = i;
        switch (i) {
            case 2:
                super(0);
                setAlpha(153);
                g(0.0f);
                break;
            case 3:
            case 5:
            default:
                g(0.0f);
                break;
            case 4:
                super(0);
                g(0.0f);
                break;
            case 6:
                super(0);
                g(0.0f);
                break;
        }
    }
}
