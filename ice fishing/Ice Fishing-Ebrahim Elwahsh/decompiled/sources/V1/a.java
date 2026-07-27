package V1;

import android.animation.ValueAnimator;
import com.anythink.basead.exoplayer.k.p;

/* loaded from: classes.dex */
public final class a extends U1.a {
    public final /* synthetic */ int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, boolean z8) {
        super(0);
        this.Y = i;
    }

    @Override // U1.e
    public final ValueAnimator d() {
        U1.d dVar = U1.e.f3256T;
        U1.c cVar = U1.e.f3255S;
        switch (this.Y) {
            case 0:
                Float valueOf = Float.valueOf(0.0f);
                float[] fArr = {0.0f, 0.5f, 1.0f};
                S1.e eVar = new S1.e(this);
                eVar.c(fArr, cVar, new Float[]{valueOf, Float.valueOf(1.0f), valueOf});
                eVar.f2960c = com.anythink.basead.exoplayer.i.a.f8040f;
                eVar.b(fArr);
                return eVar.a();
            case 1:
                Float valueOf2 = Float.valueOf(0.0f);
                float[] fArr2 = {0.0f, 0.5f, 1.0f};
                S1.e eVar2 = new S1.e(this);
                eVar2.c(fArr2, cVar, new Float[]{valueOf2, Float.valueOf(1.0f), valueOf2});
                eVar2.f2960c = 1200L;
                eVar2.b(fArr2);
                return eVar2.a();
            case 2:
                Float valueOf3 = Float.valueOf(0.0f);
                float[] fArr3 = {0.0f, 0.5f, 1.0f};
                S1.e eVar3 = new S1.e(this);
                eVar3.c(fArr3, cVar, new Float[]{valueOf3, Float.valueOf(1.0f), valueOf3});
                eVar3.f2960c = com.anythink.basead.exoplayer.i.a.f8040f;
                eVar3.b(fArr3);
                return eVar3.a();
            case 3:
                float[] fArr4 = {0.0f, 0.39f, 0.4f, 1.0f};
                S1.e eVar4 = new S1.e(this);
                eVar4.d(fArr4, dVar, new Integer[]{0, 0, Integer.valueOf(p.f8630b), 0});
                eVar4.f2960c = 1200L;
                eVar4.b(fArr4);
                return eVar4.a();
            case 4:
                float[] fArr5 = {0.0f, 1.0f};
                S1.e eVar5 = new S1.e(this);
                eVar5.c(fArr5, cVar, new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)});
                eVar5.d(fArr5, dVar, new Integer[]{Integer.valueOf(p.f8630b), 0});
                eVar5.f2960c = 1000L;
                eVar5.b(fArr5);
                return eVar5.a();
            case 5:
                float[] fArr6 = {0.0f, 0.5f, 1.0f};
                S1.e eVar6 = new S1.e(this);
                eVar6.d(fArr6, U1.e.f3249M, new Integer[]{0, -180, -180});
                eVar6.d(fArr6, U1.e.f3251O, new Integer[]{0, 0, -180});
                eVar6.f2960c = 1200L;
                eVar6.b(fArr6);
                return eVar6.a();
            default:
                Float valueOf4 = Float.valueOf(0.0f);
                float[] fArr7 = {0.0f, 0.4f, 0.8f, 1.0f};
                S1.e eVar7 = new S1.e(this);
                eVar7.c(fArr7, cVar, new Float[]{valueOf4, Float.valueOf(1.0f), valueOf4, valueOf4});
                eVar7.f2960c = 1400L;
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
