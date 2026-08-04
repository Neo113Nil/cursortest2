package com.gamericefishpro.space.s8;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.v8.p0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends com.gamericefishpro.space.h9.h implements p0 {
    public final int e;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        c0.b(bArr.length == 25);
        this.e = Arrays.hashCode(bArr);
    }

    public static byte[] G(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.gamericefishpro.space.h9.h
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            com.gamericefishpro.space.c9.a aVarC = c();
            parcel2.writeNoException();
            com.gamericefishpro.space.h9.i.b(parcel2, aVarC);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.e);
        return true;
    }

    public abstract byte[] F();

    @Override // com.gamericefishpro.space.v8.p0
    public final int b() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.v8.p0
    public final com.gamericefishpro.space.c9.a c() {
        return new com.gamericefishpro.space.c9.b(F());
    }

    public final boolean equals(Object obj) {
        com.gamericefishpro.space.c9.a aVarC;
        if (obj instanceof p0) {
            try {
                p0 p0Var = (p0) obj;
                if (p0Var.b() == this.e && (aVarC = p0Var.c()) != null) {
                    return Arrays.equals(F(), (byte[]) com.gamericefishpro.space.c9.b.G(aVarC));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }
}
