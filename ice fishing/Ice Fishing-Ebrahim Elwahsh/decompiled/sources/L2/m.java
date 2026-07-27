package L2;

import O2.L;
import O2.w;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class m extends b3.g implements L {

    /* renamed from: n, reason: collision with root package name */
    public final int f1740n;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        w.b(bArr.length == 25);
        this.f1740n = Arrays.hashCode(bArr);
    }

    public static byte[] A0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof L) {
            try {
                L l9 = (L) obj;
                if (((m) l9).f1740n == this.f1740n) {
                    return Arrays.equals(u0(), (byte[]) V2.b.A0(new V2.b(((m) l9).u0())));
                }
            } catch (RemoteException e6) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e6);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1740n;
    }

    @Override // b3.g
    public final boolean i0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            V2.b bVar = new V2.b(u0());
            parcel2.writeNoException();
            b3.h.b(parcel2, bVar);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f1740n);
        return true;
    }

    public abstract byte[] u0();
}
