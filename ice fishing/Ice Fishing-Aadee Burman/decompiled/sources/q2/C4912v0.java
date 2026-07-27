package q2;

import a3.AbstractC0432a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q2.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4912v0 extends AbstractC0432a implements InterfaceC4914w0 {
    public C4912v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo", 2);
    }

    @Override // q2.InterfaceC4914w0
    public final String d() {
        Parcel M02 = M0(H0(), 1);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // q2.InterfaceC4914w0
    public final String e() {
        Parcel M02 = M0(H0(), 2);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // q2.InterfaceC4914w0
    public final h1 g() {
        Parcel M02 = M0(H0(), 4);
        h1 h1Var = (h1) AbstractC3388j8.b(M02, h1.CREATOR);
        M02.recycle();
        return h1Var;
    }

    @Override // q2.InterfaceC4914w0
    public final List h() {
        Parcel M02 = M0(H0(), 3);
        ArrayList createTypedArrayList = M02.createTypedArrayList(h1.CREATOR);
        M02.recycle();
        return createTypedArrayList;
    }

    @Override // q2.InterfaceC4914w0
    public final String j() {
        Parcel M02 = M0(H0(), 6);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // q2.InterfaceC4914w0
    public final Bundle n() {
        Parcel M02 = M0(H0(), 5);
        Bundle bundle = (Bundle) AbstractC3388j8.b(M02, Bundle.CREATOR);
        M02.recycle();
        return bundle;
    }
}
