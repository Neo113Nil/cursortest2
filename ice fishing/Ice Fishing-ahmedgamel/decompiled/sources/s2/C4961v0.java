package s2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import java.util.ArrayList;
import java.util.List;

/* renamed from: s2.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4961v0 extends AbstractC0549a implements InterfaceC4963w0 {
    public C4961v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo", 1);
    }

    @Override // s2.InterfaceC4963w0
    public final String d() {
        Parcel K02 = K0(F0(), 1);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // s2.InterfaceC4963w0
    public final String e() {
        Parcel K02 = K0(F0(), 2);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // s2.InterfaceC4963w0
    public final h1 g() {
        Parcel K02 = K0(F0(), 4);
        h1 h1Var = (h1) AbstractC3411j8.b(K02, h1.CREATOR);
        K02.recycle();
        return h1Var;
    }

    @Override // s2.InterfaceC4963w0
    public final List h() {
        Parcel K02 = K0(F0(), 3);
        ArrayList createTypedArrayList = K02.createTypedArrayList(h1.CREATOR);
        K02.recycle();
        return createTypedArrayList;
    }

    @Override // s2.InterfaceC4963w0
    public final String j() {
        Parcel K02 = K0(F0(), 6);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // s2.InterfaceC4963w0
    public final Bundle n() {
        Parcel K02 = K0(F0(), 5);
        Bundle bundle = (Bundle) AbstractC3411j8.b(K02, Bundle.CREATOR);
        K02.recycle();
        return bundle;
    }
}
