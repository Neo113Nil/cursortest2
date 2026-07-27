package q2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q2.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4919v0 extends Z2.a implements InterfaceC4921w0 {
    public C4919v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo", 2);
    }

    @Override // q2.InterfaceC4921w0
    public final String c() {
        Parcel D02 = D0(A0(), 1);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // q2.InterfaceC4921w0
    public final List e() {
        Parcel D02 = D0(A0(), 3);
        ArrayList createTypedArrayList = D02.createTypedArrayList(i1.CREATOR);
        D02.recycle();
        return createTypedArrayList;
    }

    @Override // q2.InterfaceC4921w0
    public final String f() {
        Parcel D02 = D0(A0(), 2);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // q2.InterfaceC4921w0
    public final i1 g() {
        Parcel D02 = D0(A0(), 4);
        i1 i1Var = (i1) AbstractC3241g8.b(D02, i1.CREATOR);
        D02.recycle();
        return i1Var;
    }

    @Override // q2.InterfaceC4921w0
    public final String h() {
        Parcel D02 = D0(A0(), 6);
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // q2.InterfaceC4921w0
    public final Bundle l() {
        Parcel D02 = D0(A0(), 5);
        Bundle bundle = (Bundle) AbstractC3241g8.b(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle;
    }
}
