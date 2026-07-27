package M2;

import P2.L;
import P2.w;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class m extends c3.g implements L {

    /* renamed from: u, reason: collision with root package name */
    public final int f1858u;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 0);
        w.b(bArr.length == 25);
        this.f1858u = Arrays.hashCode(bArr);
    }

    public static byte[] F0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override // c3.g
    public final boolean S(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            W2.b bVar = new W2.b(w0());
            parcel2.writeNoException();
            c3.h.b(parcel2, bVar);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f1858u);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof L) {
            try {
                L l9 = (L) obj;
                if (((m) l9).f1858u == this.f1858u) {
                    return Arrays.equals(w0(), (byte[]) W2.b.F0(new W2.b(((m) l9).w0())));
                }
            } catch (RemoteException e9) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1858u;
    }

    public abstract byte[] w0();
}
