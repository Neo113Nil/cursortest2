package com.anythink.basead.exoplayer.l;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f9330a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9331b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9332c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9333d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9334e;

    private a(List<byte[]> list, int i, int i4, int i6, float f2) {
        this.f9330a = list;
        this.f9331b = i;
        this.f9332c = i4;
        this.f9333d = i6;
        this.f9334e = f2;
    }

    public static a a(s sVar) {
        float f2;
        int i;
        int i4;
        try {
            sVar.d(4);
            int d9 = (sVar.d() & 3) + 1;
            if (d9 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int d10 = sVar.d() & 31;
            for (int i6 = 0; i6 < d10; i6++) {
                arrayList.add(b(sVar));
            }
            int d11 = sVar.d();
            for (int i9 = 0; i9 < d11; i9++) {
                arrayList.add(b(sVar));
            }
            if (d10 > 0) {
                p.b a9 = p.a((byte[]) arrayList.get(0), d9, ((byte[]) arrayList.get(0)).length);
                int i10 = a9.f9270b;
                int i11 = a9.f9271c;
                f2 = a9.f9272d;
                i = i10;
                i4 = i11;
            } else {
                f2 = 1.0f;
                i = -1;
                i4 = -1;
            }
            return new a(arrayList, d9, i, i4, f2);
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw new t("Error parsing AVC config", e9);
        }
    }

    private static byte[] b(s sVar) {
        int e9 = sVar.e();
        int c9 = sVar.c();
        sVar.d(e9);
        return com.anythink.basead.exoplayer.k.d.a(sVar.f9288a, c9, e9);
    }
}
