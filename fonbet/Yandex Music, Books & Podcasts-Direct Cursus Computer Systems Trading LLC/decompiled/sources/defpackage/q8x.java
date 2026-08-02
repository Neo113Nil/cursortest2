package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final /* synthetic */ class q8x implements pun, u0x {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ q8x(w8c w8cVar, String[] strArr) {
        this.a = 0;
        this.b = strArr;
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        efx efxVar = new efx(1, (i8s) obj2);
        f1x f1xVar = (f1x) ((dix) obj).s();
        String[] strArr = (String[]) this.b;
        Parcel M0 = f1xVar.M0();
        y4x.d(M0, efxVar);
        M0.writeStringArray(strArr);
        f1xVar.P0(M0, 6);
    }

    @Override // defpackage.u0x
    public Object d() {
        switch (this.a) {
            case 1:
                tax taxVar = (tax) ((u0x) this.b).d();
                if (taxVar != null) {
                    return taxVar;
                }
                jj4.j("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new xlx(((k81) ((c5p) this.b).b).a);
        }
    }

    public /* synthetic */ q8x(u0x u0xVar, int i) {
        this.a = i;
        this.b = u0xVar;
    }
}
