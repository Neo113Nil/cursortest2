package m6;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p6.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class m extends a7.a implements s {

    /* renamed from: d, reason: collision with root package name */
    public final int f4926d;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f4926d = Arrays.hashCode(bArr);
    }

    public static byte[] c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // a7.a
    public final boolean b(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f4926d);
            return true;
        }
        w6.a aVar = new w6.a(d());
        parcel2.writeNoException();
        int i11 = a7.b.f264a;
        parcel2.writeStrongBinder(aVar);
        return true;
    }

    public abstract byte[] d();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof s)) {
            try {
                s sVar = (s) obj;
                if (((m) sVar).f4926d == this.f4926d) {
                    return Arrays.equals(d(), (byte[]) new w6.a(((m) sVar).d()).f7708d);
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4926d;
    }
}
