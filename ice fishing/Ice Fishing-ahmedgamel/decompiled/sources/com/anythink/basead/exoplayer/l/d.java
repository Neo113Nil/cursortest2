package com.anythink.basead.exoplayer.l;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.t;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f9355a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9356b;

    private d(List<byte[]> list, int i) {
        this.f9355a = list;
        this.f9356b = i;
    }

    public static d a(s sVar) {
        try {
            sVar.d(21);
            int d9 = sVar.d() & 3;
            int d10 = sVar.d();
            int c9 = sVar.c();
            int i = 0;
            for (int i4 = 0; i4 < d10; i4++) {
                sVar.d(1);
                int e9 = sVar.e();
                for (int i6 = 0; i6 < e9; i6++) {
                    int e10 = sVar.e();
                    i += e10 + 4;
                    sVar.d(e10);
                }
            }
            sVar.c(c9);
            byte[] bArr = new byte[i];
            int i9 = 0;
            for (int i10 = 0; i10 < d10; i10++) {
                sVar.d(1);
                int e11 = sVar.e();
                for (int i11 = 0; i11 < e11; i11++) {
                    int e12 = sVar.e();
                    byte[] bArr2 = p.f9258a;
                    System.arraycopy(bArr2, 0, bArr, i9, bArr2.length);
                    int length = i9 + bArr2.length;
                    System.arraycopy(sVar.f9288a, sVar.c(), bArr, length, e12);
                    i9 = length + e12;
                    sVar.d(e12);
                }
            }
            return new d(i == 0 ? null : Collections.singletonList(bArr), d9 + 1);
        } catch (ArrayIndexOutOfBoundsException e13) {
            throw new t("Error parsing HEVC config", e13);
        }
    }
}
