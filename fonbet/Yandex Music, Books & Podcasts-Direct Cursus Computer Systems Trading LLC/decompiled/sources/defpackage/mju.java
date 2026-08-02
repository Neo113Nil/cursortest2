package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class mju implements pun {
    public final String[] a;

    public /* synthetic */ mju(w8c w8cVar, String[] strArr) {
        this.a = strArr;
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        efx efxVar = new efx(2, (i8s) obj2);
        f1x f1xVar = (f1x) ((dix) obj).s();
        Parcel M0 = f1xVar.M0();
        y4x.d(M0, efxVar);
        M0.writeStringArray(this.a);
        f1xVar.P0(M0, 7);
    }

    public mju(String[] strArr) {
        this.a = strArr;
    }
}
