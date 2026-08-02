package s2;

import android.os.IBinder;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.internal.ads.AbstractC3411j8;

/* renamed from: s2.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4955s0 extends AbstractC0549a implements InterfaceC4957t0 {
    public C4955s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 1);
    }

    @Override // s2.InterfaceC4957t0
    public final void E1(String str, Y2.a aVar, Y2.a aVar2) {
        Parcel F02 = F0();
        F02.writeString(str);
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.e(F02, aVar2);
        d1(F02, 1);
    }
}
