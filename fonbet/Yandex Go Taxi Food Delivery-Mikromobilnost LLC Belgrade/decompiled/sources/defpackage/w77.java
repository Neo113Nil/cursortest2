package defpackage;

import defpackage.c3f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes11.dex */
public final class w77 implements i450 {
    public final byte[] a;
    public final String b;
    public final String c;

    public w77(String str, String str2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.a = bArr;
    }

    @Override // defpackage.i450
    public final String a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.i450
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c3f.d.b b() {
        byte[] bArr;
        byte[] bArr2 = this.a;
        if (bArr2 != null && bArr2.length != 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bArr2);
                        gZIPOutputStream.finish();
                        bArr = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException unused) {
            }
            if (bArr != null) {
                return null;
            }
            j44 j44Var = new j44();
            j44Var.b = bArr;
            j44Var.a = this.b;
            return j44Var.a();
        }
        bArr = null;
        if (bArr != null) {
        }
    }

    @Override // defpackage.i450
    public final InputStream getStream() {
        byte[] bArr = this.a;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }
}
