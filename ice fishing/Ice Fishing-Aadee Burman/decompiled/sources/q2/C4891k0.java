package q2;

import a3.AbstractC0432a;
import android.os.Parcel;

/* renamed from: q2.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4891k0 extends AbstractC0432a implements InterfaceC4893l0 {
    @Override // q2.InterfaceC4893l0
    public final String d() {
        Parcel M02 = M0(H0(), 1);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }

    @Override // q2.InterfaceC4893l0
    public final String e() {
        Parcel M02 = M0(H0(), 2);
        String readString = M02.readString();
        M02.recycle();
        return readString;
    }
}
