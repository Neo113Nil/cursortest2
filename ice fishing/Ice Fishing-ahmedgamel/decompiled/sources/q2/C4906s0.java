package q2;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3388j8;

/* renamed from: q2.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4906s0 extends AbstractC0432a implements InterfaceC4908t0 {
    public C4906s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 2);
    }

    @Override // q2.InterfaceC4908t0
    public final void U2(String str, W2.a aVar, W2.a aVar2) {
        Parcel H02 = H0();
        H02.writeString(str);
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.e(H02, aVar2);
        f1(H02, 1);
    }
}
