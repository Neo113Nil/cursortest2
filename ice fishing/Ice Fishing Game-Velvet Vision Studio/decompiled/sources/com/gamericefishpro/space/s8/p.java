package com.gamericefishpro.space.s8;

import com.gamericefishpro.space.v8.c0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Callable {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ o i;

    public /* synthetic */ p(boolean z, String str, o oVar) {
        this.d = z;
        this.e = str;
        this.i = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.d;
        String str = this.e;
        o oVar = this.i;
        String str2 = (z || !r.b(str, oVar, true, false).a) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        c0.g(messageDigest);
        byte[] bArrDigest = messageDigest.digest(oVar.f);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : bArrDigest) {
            char[] cArr2 = com.gamericefishpro.space.z8.b.b;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
    }
}
