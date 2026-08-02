package O2;

import R2.L;
import R2.w;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class m extends e3.g implements L {

    /* renamed from: u, reason: collision with root package name */
    public final int f2284u;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 0);
        w.b(bArr.length == 25);
        this.f2284u = Arrays.hashCode(bArr);
    }

    public static byte[] D0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override // e3.g
    public final boolean S(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Y2.b bVar = new Y2.b(t0());
            parcel2.writeNoException();
            e3.h.b(parcel2, bVar);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f2284u);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof L) {
            try {
                L l9 = (L) obj;
                if (((m) l9).f2284u == this.f2284u) {
                    return Arrays.equals(t0(), (byte[]) Y2.b.D0(new Y2.b(((m) l9).t0())));
                }
            } catch (RemoteException e9) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2284u;
    }

    public abstract byte[] t0();
}
