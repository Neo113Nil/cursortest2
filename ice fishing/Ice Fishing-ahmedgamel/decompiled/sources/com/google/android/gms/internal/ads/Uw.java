package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Uw {

    /* renamed from: a, reason: collision with root package name */
    public final C3228g8 f28043a;

    /* renamed from: b, reason: collision with root package name */
    public final File f28044b;

    /* renamed from: c, reason: collision with root package name */
    public final File f28045c;

    /* renamed from: d, reason: collision with root package name */
    public final File f28046d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f28047e;

    public Uw(C3228g8 c3228g8, File file, File file2, File file3) {
        this.f28043a = c3228g8;
        this.f28044b = file;
        this.f28045c = file3;
        this.f28046d = file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a() {
        byte[] bArr;
        FileInputStream fileInputStream;
        byte[] bArr2;
        FileInputStream fileInputStream2 = null;
        if (this.f28047e == null) {
            try {
                fileInputStream = new FileInputStream(this.f28046d);
                try {
                    HK hk = JK.f25675u;
                    ArrayList arrayList = new ArrayList();
                    int i = 256;
                    while (true) {
                        byte[] bArr3 = new byte[i];
                        int i6 = 0;
                        while (i6 < i) {
                            int read = fileInputStream.read(bArr3, i6, i - i6);
                            if (read == -1) {
                                break;
                            }
                            i6 += read;
                        }
                        HK s9 = i6 == 0 ? null : JK.s(bArr3, 0, i6);
                        if (s9 == null) {
                            break;
                        }
                        arrayList.add(s9);
                        i = Math.min(i + i, 8192);
                    }
                    bArr2 = JK.u(arrayList).a();
                    T2.b.c(fileInputStream);
                } catch (IOException unused) {
                    T2.b.c(fileInputStream);
                    bArr2 = null;
                    this.f28047e = bArr2;
                    bArr = this.f28047e;
                    if (bArr != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    T2.b.c(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.f28047e = bArr2;
        }
        bArr = this.f28047e;
        if (bArr != null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
