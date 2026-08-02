package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class keh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rxv b;

    public /* synthetic */ keh(rxv rxvVar, int i) {
        this.a = i;
        this.b = rxvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.p(false);
                return Unit.a;
            case 1:
                this.b.p(false);
                return Unit.a;
            case 2:
                return Float.valueOf(this.b.h.e());
            case 3:
                Boolean bool = (Boolean) this.b.w.getValue();
                bool.booleanValue();
                return bool;
            case 4:
                Boolean bool2 = (Boolean) this.b.y.getValue();
                bool2.booleanValue();
                return bool2;
            case 5:
                Boolean bool3 = (Boolean) this.b.x.getValue();
                bool3.booleanValue();
                return bool3;
            case 6:
                Boolean bool4 = (Boolean) this.b.z.getValue();
                bool4.booleanValue();
                return bool4;
            case 7:
                Boolean bool5 = (Boolean) this.b.A.getValue();
                bool5.booleanValue();
                return bool5;
            case 8:
                return Float.valueOf((int) (this.b.d() & 4294967295L));
            case 9:
                return Float.valueOf(this.b.i.e());
            case 10:
                Boolean bool6 = (Boolean) this.b.D.getValue();
                bool6.getClass();
                return bool6;
            case 11:
                Boolean bool7 = (Boolean) this.b.E.getValue();
                bool7.getClass();
                return bool7;
            default:
                rxv rxvVar = this.b;
                return Boolean.valueOf(((Boolean) rxvVar.j.getValue()).booleanValue() && rxvVar.h.e() == 1.0f);
        }
    }
}
