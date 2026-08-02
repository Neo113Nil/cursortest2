package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class wt4 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ wt4(long j, Function0 function0) {
        this.b = j;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (jpaVar.y0() & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (jpaVar.e() >> 32));
                float intBitsToFloat3 = Float.intBitsToFloat((int) (jpaVar.y0() & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                int i = (int) (floatToRawIntBits >> 32);
                float f = hrg.f((Number) this.c.invoke(), Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)) - Float.intBitsToFloat(i), Float.intBitsToFloat(i));
                float intBitsToFloat4 = Float.intBitsToFloat((int) (jpaVar.y0() & 4294967295L));
                jpaVar.s(this.b, floatToRawIntBits, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), (r18 & 8) != 0 ? 0.0f : Float.intBitsToFloat((int) (4294967295L & jpaVar.e())), (r18 & 16) != 0 ? 0 : 1);
                break;
            default:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                ou3 ou3Var = opfVar.a;
                long e = ou3Var.e();
                float floatValue = ((Number) this.c.invoke()).floatValue() * Float.intBitsToFloat((int) (ou3Var.e() >> 32));
                float intBitsToFloat5 = Float.intBitsToFloat((int) (e & 4294967295L));
                jpa.B(opfVar, this.b, 0L, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(intBitsToFloat5) & 4294967295L), 0.0f, null, 0, 122);
                opfVar.a();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ wt4(Function0 function0, long j) {
        this.c = function0;
        this.b = j;
    }
}
