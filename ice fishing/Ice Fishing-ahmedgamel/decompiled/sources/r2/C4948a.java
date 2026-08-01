package r2;

import a3.AbstractC0432a;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import java.util.List;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4948a extends AbstractC0432a implements InterfaceC4950c {
    @Override // r2.InterfaceC4950c
    public final void endSession(W2.a aVar, String str) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        H02.writeString(str);
        f1(H02, 2);
    }

    @Override // r2.InterfaceC4950c
    public final void open(W2.a aVar, String str, String str2, Bundle bundle, boolean z3, g gVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        H02.writeString(str);
        H02.writeString(str2);
        AbstractC3388j8.c(H02, bundle);
        H02.writeInt(z3 ? 1 : 0);
        AbstractC3388j8.e(H02, gVar);
        f1(H02, 3);
    }

    @Override // r2.InterfaceC4950c
    public final void prewarm(W2.a aVar, List list, e eVar) {
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        H02.writeTypedList(list);
        AbstractC3388j8.e(H02, eVar);
        f1(H02, 1);
    }
}
