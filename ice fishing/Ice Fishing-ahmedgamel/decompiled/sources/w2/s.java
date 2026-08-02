package w2;

import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import u2.C5067a;

/* loaded from: classes.dex */
public final class s extends AbstractC0549a implements t {
    @Override // w2.t
    public final boolean zze(Y2.a aVar, String str, String str2) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        F02.writeString(str);
        F02.writeString(str2);
        Parcel K02 = K0(F02, 1);
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }

    @Override // w2.t
    public final void zzf(Y2.a aVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        d1(F02, 2);
    }

    @Override // w2.t
    public final boolean zzg(Y2.a aVar, C5067a c5067a) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, c5067a);
        Parcel K02 = K0(F02, 3);
        boolean z6 = K02.readInt() != 0;
        K02.recycle();
        return z6;
    }
}
