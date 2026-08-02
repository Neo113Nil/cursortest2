package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class aep extends uif implements Function0 {
    public final /* synthetic */ idp r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ qep u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aep(idp idpVar, int i, int i2, qep qepVar, arf arfVar) {
        super(0);
        this.r = idpVar;
        this.s = i;
        this.t = i2;
        this.u = qepVar;
        this.v = arfVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [arf, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int intValue = ((Number) this.v.getValue()).intValue();
        qep qepVar = this.u;
        boolean a = qepVar.a();
        boolean z = qepVar.e() == iu6.a;
        idp idpVar = this.r;
        cds cdsVar = idpVar.f;
        int i = this.s;
        long h = cdsVar.h(i);
        cds cdsVar2 = idpVar.f;
        ogi ogiVar = cdsVar2.b;
        int i2 = rds.c;
        int i3 = (int) (h >> 32);
        int e = ogiVar.e(i3);
        int i4 = ogiVar.f;
        if (e != intValue) {
            i3 = intValue >= i4 ? cdsVar2.e(i4 - 1) : cdsVar2.e(intValue);
        }
        int i5 = (int) (h & 4294967295L);
        if (ogiVar.e(i5) != intValue) {
            i5 = intValue >= i4 ? ogiVar.d(i4 - 1, false) : ogiVar.d(intValue, false);
        }
        int i6 = this.t;
        if (i3 == i6) {
            return idpVar.a(i5);
        }
        if (i5 == i6) {
            return idpVar.a(i3);
        }
        if (!(a ^ z) ? i >= i3 : i > i5) {
            i3 = i5;
        }
        return idpVar.a(i3);
    }
}
