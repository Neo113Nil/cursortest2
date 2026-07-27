package C2;

import android.os.RemoteException;
import q2.InterfaceC4893l0;

/* renamed from: C2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f391a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final String f392b;

    public String toString() {
        switch (this.f391a) {
            case 1:
                return this.f392b;
            default:
                return super.toString();
        }
    }

    public C0281n(InterfaceC4893l0 interfaceC4893l0) {
        String str;
        try {
            str = interfaceC4893l0.d();
        } catch (RemoteException e9) {
            v2.i.d("", e9);
            str = null;
        }
        this.f392b = str;
    }
}
