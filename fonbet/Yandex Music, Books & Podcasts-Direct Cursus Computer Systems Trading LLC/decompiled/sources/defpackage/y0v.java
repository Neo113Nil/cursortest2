package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class y0v implements ggi {
    public final /* synthetic */ onu a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;

    public y0v(onu onuVar, float f, boolean z, float f2, boolean z2) {
        this.a = onuVar;
        this.b = f;
        this.c = z;
        this.d = f2;
        this.e = z2;
    }

    @Override // defpackage.ggi
    public final lfh b(final mfh mfhVar, List list, long j) {
        ksk kskVar;
        ksk kskVar2;
        ffh ffhVar;
        ffh ffhVar2;
        int i;
        ffh ffhVar3;
        mfhVar.getClass();
        list.getClass();
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        final int i2 = ga6.i(j);
        onu onuVar = onu.c;
        onu onuVar2 = this.a;
        int L = onuVar2 != onuVar ? mfhVar.L(this.b) : 0;
        float f = z0v.c;
        int L2 = i2 - (mfhVar.L(f) * 2);
        if (L2 < 0) {
            L2 = 0;
        }
        int L3 = onuVar2 != onuVar ? mfhVar.L(z0v.b) : 0;
        final int L4 = mfhVar.L(f);
        int L5 = q5g.D(onuVar2) ? mfhVar.L(z0v.d) : 0;
        int i3 = this.c ? 0 : L - L3;
        int d = q5g.D(onuVar2) ? yhn.d((ga6.h(j) - i3) - L5, 0, i2) : 0;
        int L6 = q5g.D(onuVar2) ? mfhVar.L(this.d) : 0;
        int i4 = q5g.D(onuVar2) ? d + i3 + L5 : onuVar2 != onuVar ? L : 0;
        ksk kskVar3 = null;
        if (onuVar2 == onuVar || (ffhVar3 = (ffh) CollectionsKt.firstOrNull(list2)) == null) {
            kskVar = null;
        } else {
            if (!((L2 >= 0) & (L >= 0))) {
                ume.a("width and height must be >= 0");
            }
            kskVar = ffhVar3.M(ia6.h(L2, L2, L, L));
        }
        if (!q5g.D(onuVar2) || (ffhVar2 = (ffh) CollectionsKt.firstOrNull(list3)) == null) {
            kskVar2 = null;
        } else {
            if (this.e) {
                i = ((d - L6) + i3) - mfhVar.L(z0v.d);
                if (i < 0) {
                    i = 0;
                }
            } else {
                i = d;
            }
            if (!((i2 >= 0) & (i >= 0))) {
                ume.a("width and height must be >= 0");
            }
            kskVar2 = ffhVar2.M(ia6.h(i2, i2, i, i));
        }
        if (q5g.D(onuVar2) && (ffhVar = (ffh) CollectionsKt.firstOrNull(list4)) != null) {
            if (L6 < 0) {
                ume.a("height must be >= 0");
            }
            kskVar3 = ffhVar.M(ia6.h(0, Integer.MAX_VALUE, L6, L6));
        }
        final ksk kskVar4 = kskVar3;
        final ksk kskVar5 = kskVar2;
        final boolean z = this.e;
        final ksk kskVar6 = kskVar;
        final int i5 = i3;
        final int i6 = L5;
        final int i7 = d;
        return mfh.m0(mfhVar, i2, i4, new Function1() { // from class: x0v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i8;
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                ksk kskVar7 = ksk.this;
                if (kskVar7 != null) {
                    jsk.g(jskVar, kskVar7, L4, 0);
                }
                ksk kskVar8 = kskVar5;
                int i9 = i5;
                if (kskVar8 != null) {
                    if (z) {
                        i8 = mfhVar.L(z0v.d);
                    } else {
                        i8 = i9;
                    }
                    jsk.g(jskVar, kskVar8, 0, i8);
                }
                ksk kskVar9 = kskVar4;
                if (kskVar9 != null) {
                    jsk.g(jskVar, kskVar9, (i2 / 2) - (kskVar9.a / 2), ((i9 + i7) - kskVar9.b) + i6);
                }
                return Unit.a;
            }
        });
    }
}
