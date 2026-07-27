package com.anythink.basead.exoplayer.l;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f8701a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8702b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8703c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8704d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8705e;

    private a(List<byte[]> list, int i, int i4, int i9, float f6) {
        this.f8701a = list;
        this.f8702b = i;
        this.f8703c = i4;
        this.f8704d = i9;
        this.f8705e = f6;
    }

    public static a a(s sVar) {
        float f6;
        int i;
        int i4;
        try {
            sVar.d(4);
            int d2 = (sVar.d() & 3) + 1;
            if (d2 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int d3 = sVar.d() & 31;
            for (int i9 = 0; i9 < d3; i9++) {
                arrayList.add(b(sVar));
            }
            int d9 = sVar.d();
            for (int i10 = 0; i10 < d9; i10++) {
                arrayList.add(b(sVar));
            }
            if (d3 > 0) {
                p.b a9 = p.a((byte[]) arrayList.get(0), d2, ((byte[]) arrayList.get(0)).length);
                int i11 = a9.f8641b;
                int i12 = a9.f8642c;
                f6 = a9.f8643d;
                i = i11;
                i4 = i12;
            } else {
                f6 = 1.0f;
                i = -1;
                i4 = -1;
            }
            return new a(arrayList, d2, i, i4, f6);
        } catch (ArrayIndexOutOfBoundsException e6) {
            throw new t("Error parsing AVC config", e6);
        }
    }

    private static byte[] b(s sVar) {
        int e6 = sVar.e();
        int c4 = sVar.c();
        sVar.d(e6);
        return com.anythink.basead.exoplayer.k.d.a(sVar.f8659a, c4, e6);
    }
}
