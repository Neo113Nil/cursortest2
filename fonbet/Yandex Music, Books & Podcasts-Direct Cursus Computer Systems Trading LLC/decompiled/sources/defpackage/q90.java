package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class q90 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ja0 b;

    public /* synthetic */ q90(ja0 ja0Var, int i) {
        this.a = i;
        this.b = ja0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
    
        if (r0 > 0.999999f) goto L52;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        float f;
        switch (this.a) {
            case 0:
                ja0 ja0Var = this.b;
                x6k x6kVar = ja0Var.l;
                x6k x6kVar2 = ja0Var.g;
                t6k t6kVar = ja0Var.j;
                Object value = x6kVar.getValue();
                if (value != null) {
                    return value;
                }
                if (Float.isNaN(t6kVar.e())) {
                    return x6kVar2.getValue();
                }
                Object a = ja0Var.c().a(t6kVar.e());
                return a == null ? x6kVar2.getValue() : a;
            case 1:
                ja0 ja0Var2 = this.b;
                float d = ja0Var2.c().d(ja0Var2.h.getValue());
                float d2 = ja0Var2.c().d(ja0Var2.i.getValue()) - d;
                float abs = Math.abs(d2);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    f = (ja0Var2.g() - d) / d2;
                    if (f >= 1.0E-6f) {
                        break;
                    } else {
                        f = 0.0f;
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 2:
                return this.b.c();
            case 3:
                ja0 ja0Var3 = this.b;
                return new Pair(ja0Var3.c(), ja0Var3.i.getValue());
            case 4:
                float D = zc4.D(this.b);
                return D == 0.0f ? avm.a : D >= 0.9f ? avm.c : avm.b;
            case 5:
                return Float.valueOf(this.b.j.e());
            case 6:
                return Float.valueOf(zc4.B(this.b));
            case 7:
                return Float.valueOf(zc4.B(this.b));
            case 8:
                return Float.valueOf(zc4.B(this.b));
            case 9:
                return Float.valueOf(zc4.D(this.b));
            case 10:
                return Float.valueOf(zc4.B(this.b));
            case 11:
                return Boolean.valueOf(zc4.D(this.b) < 0.5f);
            default:
                t6k t6kVar2 = this.b.j;
                return Boolean.valueOf((t6kVar2.e() == 0.0f || Float.isNaN(t6kVar2.e())) ? false : true);
        }
    }
}
