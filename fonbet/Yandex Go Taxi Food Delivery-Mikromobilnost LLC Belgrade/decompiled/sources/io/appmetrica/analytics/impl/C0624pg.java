package io.appmetrica.analytics.impl;

import defpackage.rzo;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: io.appmetrica.analytics.impl.pg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0624pg implements Function {
    public final C0681rg a;
    public final C0595og b;

    public C0624pg(C0681rg c0681rg, C0595og c0595og) {
        this.a = c0681rg;
        this.b = c0595og;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0015, B:13:0x0020, B:19:0x002c, B:29:0x001a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String apply(File file) {
        byte[] bArr;
        FileInputStream fileInputStream;
        try {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                try {
                    fileInputStream = new FileInputStream(new File(absolutePath));
                } catch (Throwable unused) {
                    fileInputStream = null;
                }
                try {
                    bArr = rzo.R(fileInputStream);
                    Or.a((Closeable) fileInputStream);
                } catch (Throwable unused2) {
                    Or.a((Closeable) fileInputStream);
                    bArr = null;
                    if (bArr == null) {
                    }
                }
                if (bArr == null) {
                    return null;
                }
                if (bArr.length == 0) {
                    bArr = null;
                }
                if (bArr != null) {
                    return Base64Utils.compressBase64(MessageNano.toByteArray(this.b.fromModel(new C0768ug(bArr, this.a))));
                }
                return null;
            }
            bArr = null;
            if (bArr == null) {
            }
        } catch (Throwable unused3) {
            return null;
        }
    }
}
