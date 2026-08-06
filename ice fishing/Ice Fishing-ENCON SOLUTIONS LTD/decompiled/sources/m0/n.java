package m0;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p0.InterfaceC1019p;
import z0.AbstractC1102a;

/* loaded from: classes.dex */
public abstract class n extends C0.c implements InterfaceC1019p {

    /* renamed from: b, reason: collision with root package name */
    public final int f8188b;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f8188b = Arrays.hashCode(bArr);
    }

    public static byte[] e(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // C0.c
    public final boolean d(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            v0.a aVar = new v0.a(f());
            parcel2.writeNoException();
            int i3 = AbstractC1102a.f8619a;
            parcel2.writeStrongBinder(aVar);
        } else {
            if (i2 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f8188b);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC1019p)) {
            try {
                InterfaceC1019p interfaceC1019p = (InterfaceC1019p) obj;
                if (((n) interfaceC1019p).f8188b != this.f8188b) {
                    return false;
                }
                return Arrays.equals(f(), new v0.a(((n) interfaceC1019p).f()).f8508b);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public abstract byte[] f();

    public final int hashCode() {
        return this.f8188b;
    }
}
