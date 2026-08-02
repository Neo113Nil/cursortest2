package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class nex extends pww implements IInterface {
    public final int h;

    public nex(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 4);
        y1g.z(bArr.length == 25);
        this.h = Arrays.hashCode(bArr);
    }

    public static byte[] S0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            xq0.w(e);
            return null;
        }
    }

    @Override // defpackage.pww
    public final boolean Q0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zhj zhjVar = new zhj(T0());
            parcel2.writeNoException();
            z4x.c(parcel2, zhjVar);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.h);
        return true;
    }

    public abstract byte[] T0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof nex)) {
            try {
                nex nexVar = (nex) obj;
                if (nexVar.h == this.h) {
                    return Arrays.equals(T0(), (byte[]) zhj.T0(new zhj(nexVar.T0())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.h;
    }
}
