package s2;

import android.os.Parcel;
import c3.AbstractC0549a;

/* renamed from: s2.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4940k0 extends AbstractC0549a implements InterfaceC4942l0 {
    @Override // s2.InterfaceC4942l0
    public final String d() {
        Parcel K02 = K0(F0(), 1);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }

    @Override // s2.InterfaceC4942l0
    public final String e() {
        Parcel K02 = K0(F0(), 2);
        String readString = K02.readString();
        K02.recycle();
        return readString;
    }
}
