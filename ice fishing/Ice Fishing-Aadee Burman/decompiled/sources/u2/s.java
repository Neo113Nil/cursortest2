package u2;

import a3.AbstractC0432a;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import s2.C4971a;

/* loaded from: classes.dex */
public final class s extends AbstractC0432a implements t {
    @Override // u2.t
    public final boolean zze(W2.a aVar, String str, String str2) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        H02.writeString(str);
        H02.writeString(str2);
        Parcel M02 = M0(H02, 1);
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }

    @Override // u2.t
    public final void zzf(W2.a aVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        f1(H02, 2);
    }

    @Override // u2.t
    public final boolean zzg(W2.a aVar, C4971a c4971a) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, c4971a);
        Parcel M02 = M0(H02, 3);
        boolean z3 = M02.readInt() != 0;
        M02.recycle();
        return z3;
    }
}
