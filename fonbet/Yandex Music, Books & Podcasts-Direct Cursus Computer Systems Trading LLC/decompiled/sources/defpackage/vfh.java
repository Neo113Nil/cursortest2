package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class vfh {
    public final float a;
    public final float b;
    public final amr c;
    public final float d;
    public final fq4 e;
    public final fq4 f;
    public final fq4 g;
    public final fq4 h;
    public final fq4 i;
    public final ufh j;
    public final ufh k;
    public final ufh l;
    public final ufh m;
    public final ufh n;

    /* JADX WARN: Type inference failed for: r6v5, types: [ufh] */
    /* JADX WARN: Type inference failed for: r6v6, types: [ufh] */
    /* JADX WARN: Type inference failed for: r6v7, types: [ufh] */
    /* JADX WARN: Type inference failed for: r6v8, types: [ufh] */
    /* JADX WARN: Type inference failed for: r6v9, types: [ufh] */
    public vfh(float f, float f2, amr amrVar) {
        this.a = f;
        this.b = f2;
        this.c = amrVar;
        float f3 = 2;
        float f4 = f2 / f3;
        this.d = f4;
        float f5 = f - f2;
        float f6 = (float) (f4 * 3.141592653589793d);
        float f7 = (f3 * f6) + (f3 * f5);
        float f8 = (f5 / f3) / f7;
        float f9 = f6 / f7;
        float f10 = f9 + f8;
        float f11 = (f5 / f7) + f10;
        float f12 = f9 + f11;
        this.e = new fq4(0.0f, f8);
        this.f = new fq4(f8, f10);
        this.g = new fq4(f10, f11);
        this.h = new fq4(f11, f12);
        this.i = new fq4(f12, f8 + f12);
        final int i = 0;
        this.j = new Function2(this) { // from class: ufh
            public final /* synthetic */ vfh b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        eak eakVar = (eak) obj;
                        hq4 hq4Var = (hq4) obj2;
                        eakVar.getClass();
                        hq4Var.getClass();
                        vfh vfhVar = this.b;
                        fq4 fq4Var = vfhVar.e;
                        float f13 = vfhVar.a;
                        wdg.D(eakVar, hq4Var, fq4Var, f13 / 2, 0.0f, f13 - vfhVar.d, 0.0f);
                        break;
                    case 1:
                        eak eakVar2 = (eak) obj;
                        hq4 hq4Var2 = (hq4) obj2;
                        eakVar2.getClass();
                        hq4Var2.getClass();
                        vfh vfhVar2 = this.b;
                        fq4 fq4Var2 = vfhVar2.f;
                        float f14 = vfhVar2.a;
                        float f15 = vfhVar2.d;
                        wdg.B(eakVar2, hq4Var2, fq4Var2, swf.i(f14 - f15, f15), 270.0f, vfhVar2.d);
                        break;
                    case 2:
                        eak eakVar3 = (eak) obj;
                        hq4 hq4Var3 = (hq4) obj2;
                        eakVar3.getClass();
                        hq4Var3.getClass();
                        vfh vfhVar3 = this.b;
                        fq4 fq4Var3 = vfhVar3.g;
                        float f16 = vfhVar3.a;
                        float f17 = vfhVar3.d;
                        float f18 = vfhVar3.b;
                        wdg.D(eakVar3, hq4Var3, fq4Var3, f16 - f17, f18, f17, f18);
                        break;
                    case 3:
                        eak eakVar4 = (eak) obj;
                        hq4 hq4Var4 = (hq4) obj2;
                        eakVar4.getClass();
                        hq4Var4.getClass();
                        vfh vfhVar4 = this.b;
                        fq4 fq4Var4 = vfhVar4.h;
                        float f19 = vfhVar4.d;
                        wdg.B(eakVar4, hq4Var4, fq4Var4, swf.i(f19, vfhVar4.b - f19), 90.0f, vfhVar4.d);
                        break;
                    default:
                        eak eakVar5 = (eak) obj;
                        hq4 hq4Var5 = (hq4) obj2;
                        eakVar5.getClass();
                        hq4Var5.getClass();
                        vfh vfhVar5 = this.b;
                        wdg.D(eakVar5, hq4Var5, vfhVar5.i, vfhVar5.d, 0.0f, vfhVar5.a / 2, 0.0f);
                        break;
                }
                return Unit.a;
            }
        };
        final int i2 = 1;
        this.k = new Function2(this) { // from class: ufh
            public final /* synthetic */ vfh b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        eak eakVar = (eak) obj;
                        hq4 hq4Var = (hq4) obj2;
                        eakVar.getClass();
                        hq4Var.getClass();
                        vfh vfhVar = this.b;
                        fq4 fq4Var = vfhVar.e;
                        float f13 = vfhVar.a;
                        wdg.D(eakVar, hq4Var, fq4Var, f13 / 2, 0.0f, f13 - vfhVar.d, 0.0f);
                        break;
                    case 1:
                        eak eakVar2 = (eak) obj;
                        hq4 hq4Var2 = (hq4) obj2;
                        eakVar2.getClass();
                        hq4Var2.getClass();
                        vfh vfhVar2 = this.b;
                        fq4 fq4Var2 = vfhVar2.f;
                        float f14 = vfhVar2.a;
                        float f15 = vfhVar2.d;
                        wdg.B(eakVar2, hq4Var2, fq4Var2, swf.i(f14 - f15, f15), 270.0f, vfhVar2.d);
                        break;
                    case 2:
                        eak eakVar3 = (eak) obj;
                        hq4 hq4Var3 = (hq4) obj2;
                        eakVar3.getClass();
                        hq4Var3.getClass();
                        vfh vfhVar3 = this.b;
                        fq4 fq4Var3 = vfhVar3.g;
                        float f16 = vfhVar3.a;
                        float f17 = vfhVar3.d;
                        float f18 = vfhVar3.b;
                        wdg.D(eakVar3, hq4Var3, fq4Var3, f16 - f17, f18, f17, f18);
                        break;
                    case 3:
                        eak eakVar4 = (eak) obj;
                        hq4 hq4Var4 = (hq4) obj2;
                        eakVar4.getClass();
                        hq4Var4.getClass();
                        vfh vfhVar4 = this.b;
                        fq4 fq4Var4 = vfhVar4.h;
                        float f19 = vfhVar4.d;
                        wdg.B(eakVar4, hq4Var4, fq4Var4, swf.i(f19, vfhVar4.b - f19), 90.0f, vfhVar4.d);
                        break;
                    default:
                        eak eakVar5 = (eak) obj;
                        hq4 hq4Var5 = (hq4) obj2;
                        eakVar5.getClass();
                        hq4Var5.getClass();
                        vfh vfhVar5 = this.b;
                        wdg.D(eakVar5, hq4Var5, vfhVar5.i, vfhVar5.d, 0.0f, vfhVar5.a / 2, 0.0f);
                        break;
                }
                return Unit.a;
            }
        };
        final int i3 = 2;
        this.l = new Function2(this) { // from class: ufh
            public final /* synthetic */ vfh b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        eak eakVar = (eak) obj;
                        hq4 hq4Var = (hq4) obj2;
                        eakVar.getClass();
                        hq4Var.getClass();
                        vfh vfhVar = this.b;
                        fq4 fq4Var = vfhVar.e;
                        float f13 = vfhVar.a;
                        wdg.D(eakVar, hq4Var, fq4Var, f13 / 2, 0.0f, f13 - vfhVar.d, 0.0f);
                        break;
                    case 1:
                        eak eakVar2 = (eak) obj;
                        hq4 hq4Var2 = (hq4) obj2;
                        eakVar2.getClass();
                        hq4Var2.getClass();
                        vfh vfhVar2 = this.b;
                        fq4 fq4Var2 = vfhVar2.f;
                        float f14 = vfhVar2.a;
                        float f15 = vfhVar2.d;
                        wdg.B(eakVar2, hq4Var2, fq4Var2, swf.i(f14 - f15, f15), 270.0f, vfhVar2.d);
                        break;
                    case 2:
                        eak eakVar3 = (eak) obj;
                        hq4 hq4Var3 = (hq4) obj2;
                        eakVar3.getClass();
                        hq4Var3.getClass();
                        vfh vfhVar3 = this.b;
                        fq4 fq4Var3 = vfhVar3.g;
                        float f16 = vfhVar3.a;
                        float f17 = vfhVar3.d;
                        float f18 = vfhVar3.b;
                        wdg.D(eakVar3, hq4Var3, fq4Var3, f16 - f17, f18, f17, f18);
                        break;
                    case 3:
                        eak eakVar4 = (eak) obj;
                        hq4 hq4Var4 = (hq4) obj2;
                        eakVar4.getClass();
                        hq4Var4.getClass();
                        vfh vfhVar4 = this.b;
                        fq4 fq4Var4 = vfhVar4.h;
                        float f19 = vfhVar4.d;
                        wdg.B(eakVar4, hq4Var4, fq4Var4, swf.i(f19, vfhVar4.b - f19), 90.0f, vfhVar4.d);
                        break;
                    default:
                        eak eakVar5 = (eak) obj;
                        hq4 hq4Var5 = (hq4) obj2;
                        eakVar5.getClass();
                        hq4Var5.getClass();
                        vfh vfhVar5 = this.b;
                        wdg.D(eakVar5, hq4Var5, vfhVar5.i, vfhVar5.d, 0.0f, vfhVar5.a / 2, 0.0f);
                        break;
                }
                return Unit.a;
            }
        };
        final int i4 = 3;
        this.m = new Function2(this) { // from class: ufh
            public final /* synthetic */ vfh b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i4) {
                    case 0:
                        eak eakVar = (eak) obj;
                        hq4 hq4Var = (hq4) obj2;
                        eakVar.getClass();
                        hq4Var.getClass();
                        vfh vfhVar = this.b;
                        fq4 fq4Var = vfhVar.e;
                        float f13 = vfhVar.a;
                        wdg.D(eakVar, hq4Var, fq4Var, f13 / 2, 0.0f, f13 - vfhVar.d, 0.0f);
                        break;
                    case 1:
                        eak eakVar2 = (eak) obj;
                        hq4 hq4Var2 = (hq4) obj2;
                        eakVar2.getClass();
                        hq4Var2.getClass();
                        vfh vfhVar2 = this.b;
                        fq4 fq4Var2 = vfhVar2.f;
                        float f14 = vfhVar2.a;
                        float f15 = vfhVar2.d;
                        wdg.B(eakVar2, hq4Var2, fq4Var2, swf.i(f14 - f15, f15), 270.0f, vfhVar2.d);
                        break;
                    case 2:
                        eak eakVar3 = (eak) obj;
                        hq4 hq4Var3 = (hq4) obj2;
                        eakVar3.getClass();
                        hq4Var3.getClass();
                        vfh vfhVar3 = this.b;
                        fq4 fq4Var3 = vfhVar3.g;
                        float f16 = vfhVar3.a;
                        float f17 = vfhVar3.d;
                        float f18 = vfhVar3.b;
                        wdg.D(eakVar3, hq4Var3, fq4Var3, f16 - f17, f18, f17, f18);
                        break;
                    case 3:
                        eak eakVar4 = (eak) obj;
                        hq4 hq4Var4 = (hq4) obj2;
                        eakVar4.getClass();
                        hq4Var4.getClass();
                        vfh vfhVar4 = this.b;
                        fq4 fq4Var4 = vfhVar4.h;
                        float f19 = vfhVar4.d;
                        wdg.B(eakVar4, hq4Var4, fq4Var4, swf.i(f19, vfhVar4.b - f19), 90.0f, vfhVar4.d);
                        break;
                    default:
                        eak eakVar5 = (eak) obj;
                        hq4 hq4Var5 = (hq4) obj2;
                        eakVar5.getClass();
                        hq4Var5.getClass();
                        vfh vfhVar5 = this.b;
                        wdg.D(eakVar5, hq4Var5, vfhVar5.i, vfhVar5.d, 0.0f, vfhVar5.a / 2, 0.0f);
                        break;
                }
                return Unit.a;
            }
        };
        final int i5 = 4;
        this.n = new Function2(this) { // from class: ufh
            public final /* synthetic */ vfh b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i5) {
                    case 0:
                        eak eakVar = (eak) obj;
                        hq4 hq4Var = (hq4) obj2;
                        eakVar.getClass();
                        hq4Var.getClass();
                        vfh vfhVar = this.b;
                        fq4 fq4Var = vfhVar.e;
                        float f13 = vfhVar.a;
                        wdg.D(eakVar, hq4Var, fq4Var, f13 / 2, 0.0f, f13 - vfhVar.d, 0.0f);
                        break;
                    case 1:
                        eak eakVar2 = (eak) obj;
                        hq4 hq4Var2 = (hq4) obj2;
                        eakVar2.getClass();
                        hq4Var2.getClass();
                        vfh vfhVar2 = this.b;
                        fq4 fq4Var2 = vfhVar2.f;
                        float f14 = vfhVar2.a;
                        float f15 = vfhVar2.d;
                        wdg.B(eakVar2, hq4Var2, fq4Var2, swf.i(f14 - f15, f15), 270.0f, vfhVar2.d);
                        break;
                    case 2:
                        eak eakVar3 = (eak) obj;
                        hq4 hq4Var3 = (hq4) obj2;
                        eakVar3.getClass();
                        hq4Var3.getClass();
                        vfh vfhVar3 = this.b;
                        fq4 fq4Var3 = vfhVar3.g;
                        float f16 = vfhVar3.a;
                        float f17 = vfhVar3.d;
                        float f18 = vfhVar3.b;
                        wdg.D(eakVar3, hq4Var3, fq4Var3, f16 - f17, f18, f17, f18);
                        break;
                    case 3:
                        eak eakVar4 = (eak) obj;
                        hq4 hq4Var4 = (hq4) obj2;
                        eakVar4.getClass();
                        hq4Var4.getClass();
                        vfh vfhVar4 = this.b;
                        fq4 fq4Var4 = vfhVar4.h;
                        float f19 = vfhVar4.d;
                        wdg.B(eakVar4, hq4Var4, fq4Var4, swf.i(f19, vfhVar4.b - f19), 90.0f, vfhVar4.d);
                        break;
                    default:
                        eak eakVar5 = (eak) obj;
                        hq4 hq4Var5 = (hq4) obj2;
                        eakVar5.getClass();
                        hq4Var5.getClass();
                        vfh vfhVar5 = this.b;
                        wdg.D(eakVar5, hq4Var5, vfhVar5.i, vfhVar5.d, 0.0f, vfhVar5.a / 2, 0.0f);
                        break;
                }
                return Unit.a;
            }
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfh)) {
            return false;
        }
        vfh vfhVar = (vfh) obj;
        return Float.compare(this.a, vfhVar.a) == 0 && Float.compare(this.b, vfhVar.b) == 0 && this.c.equals(vfhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + eta.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "Measures(width=" + this.a + ", height=" + this.b + ", stroke=" + this.c + ")";
    }
}
