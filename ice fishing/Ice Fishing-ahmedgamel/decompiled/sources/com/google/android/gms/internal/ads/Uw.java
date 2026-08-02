package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Uw {

    /* renamed from: a, reason: collision with root package name */
    public final C3251g8 f28840a;

    /* renamed from: b, reason: collision with root package name */
    public final File f28841b;

    /* renamed from: c, reason: collision with root package name */
    public final File f28842c;

    /* renamed from: d, reason: collision with root package name */
    public final File f28843d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f28844e;

    public Uw(C3251g8 c3251g8, File file, File file2, File file3) {
        this.f28840a = c3251g8;
        this.f28841b = file;
        this.f28842c = file3;
        this.f28843d = file2;
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
        if (this.f28844e == null) {
            try {
                fileInputStream = new FileInputStream(this.f28843d);
                try {
                    HK hk = JK.f26428u;
                    ArrayList arrayList = new ArrayList();
                    int i = 256;
                    while (true) {
                        byte[] bArr3 = new byte[i];
                        int i4 = 0;
                        while (i4 < i) {
                            int read = fileInputStream.read(bArr3, i4, i - i4);
                            if (read == -1) {
                                break;
                            }
                            i4 += read;
                        }
                        HK s9 = i4 == 0 ? null : JK.s(bArr3, 0, i4);
                        if (s9 == null) {
                            break;
                        }
                        arrayList.add(s9);
                        i = Math.min(i + i, 8192);
                    }
                    bArr2 = JK.u(arrayList).a();
                    V2.b.c(fileInputStream);
                } catch (IOException unused) {
                    V2.b.c(fileInputStream);
                    bArr2 = null;
                    this.f28844e = bArr2;
                    bArr = this.f28844e;
                    if (bArr != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    V2.b.c(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.f28844e = bArr2;
        }
        bArr = this.f28844e;
        if (bArr != null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
