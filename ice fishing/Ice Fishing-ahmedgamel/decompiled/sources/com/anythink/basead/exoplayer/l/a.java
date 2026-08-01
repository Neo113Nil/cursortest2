package com.anythink.basead.exoplayer.l;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.exoplayer.k.s;
import com.anythink.basead.exoplayer.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f8544a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8545b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8546c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8547d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8548e;

    private a(List<byte[]> list, int i, int i6, int i9, float f3) {
        this.f8544a = list;
        this.f8545b = i;
        this.f8546c = i6;
        this.f8547d = i9;
        this.f8548e = f3;
    }

    public static a a(s sVar) {
        float f3;
        int i;
        int i6;
        try {
            sVar.d(4);
            int d2 = (sVar.d() & 3) + 1;
            if (d2 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int d9 = sVar.d() & 31;
            for (int i9 = 0; i9 < d9; i9++) {
                arrayList.add(b(sVar));
            }
            int d10 = sVar.d();
            for (int i10 = 0; i10 < d10; i10++) {
                arrayList.add(b(sVar));
            }
            if (d9 > 0) {
                p.b a9 = p.a((byte[]) arrayList.get(0), d2, ((byte[]) arrayList.get(0)).length);
                int i11 = a9.f8484b;
                int i12 = a9.f8485c;
                f3 = a9.f8486d;
                i = i11;
                i6 = i12;
            } else {
                f3 = 1.0f;
                i = -1;
                i6 = -1;
            }
            return new a(arrayList, d2, i, i6, f3);
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw new t("Error parsing AVC config", e9);
        }
    }

    private static byte[] b(s sVar) {
        int e9 = sVar.e();
        int c9 = sVar.c();
        sVar.d(e9);
        return com.anythink.basead.exoplayer.k.d.a(sVar.f8502a, c9, e9);
    }
}
