package com.anythink.basead.exoplayer.l;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.t;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f8569a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8570b;

    private d(List<byte[]> list, int i) {
        this.f8569a = list;
        this.f8570b = i;
    }

    public static d a(s sVar) {
        try {
            sVar.d(21);
            int d2 = sVar.d() & 3;
            int d9 = sVar.d();
            int c9 = sVar.c();
            int i = 0;
            for (int i6 = 0; i6 < d9; i6++) {
                sVar.d(1);
                int e9 = sVar.e();
                for (int i9 = 0; i9 < e9; i9++) {
                    int e10 = sVar.e();
                    i += e10 + 4;
                    sVar.d(e10);
                }
            }
            sVar.c(c9);
            byte[] bArr = new byte[i];
            int i10 = 0;
            for (int i11 = 0; i11 < d9; i11++) {
                sVar.d(1);
                int e11 = sVar.e();
                for (int i12 = 0; i12 < e11; i12++) {
                    int e12 = sVar.e();
                    byte[] bArr2 = p.f8472a;
                    System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                    int length = i10 + bArr2.length;
                    System.arraycopy(sVar.f8502a, sVar.c(), bArr, length, e12);
                    i10 = length + e12;
                    sVar.d(e12);
                }
            }
            return new d(i == 0 ? null : Collections.singletonList(bArr), d2 + 1);
        } catch (ArrayIndexOutOfBoundsException e13) {
            throw new t("Error parsing HEVC config", e13);
        }
    }
}
