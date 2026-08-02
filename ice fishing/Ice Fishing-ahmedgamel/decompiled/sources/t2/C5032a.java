package t2;

import android.os.Bundle;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import java.util.List;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5032a extends AbstractC0549a implements InterfaceC5034c {
    @Override // t2.InterfaceC5034c
    public final void endSession(Y2.a aVar, String str) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        F02.writeString(str);
        d1(F02, 2);
    }

    @Override // t2.InterfaceC5034c
    public final void open(Y2.a aVar, String str, String str2, Bundle bundle, boolean z6, g gVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        F02.writeString(str);
        F02.writeString(str2);
        AbstractC3411j8.c(F02, bundle);
        F02.writeInt(z6 ? 1 : 0);
        AbstractC3411j8.e(F02, gVar);
        d1(F02, 3);
    }

    @Override // t2.InterfaceC5034c
    public final void prewarm(Y2.a aVar, List list, e eVar) {
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        F02.writeTypedList(list);
        AbstractC3411j8.e(F02, eVar);
        d1(F02, 1);
    }
}
