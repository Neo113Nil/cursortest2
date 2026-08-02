package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class u4j implements ggi {
    public final /* synthetic */ int a;

    public u4j(int i) {
        this.a = i;
    }

    @Override // defpackage.ggi
    public final lfh b(final mfh mfhVar, List list, final long j) {
        mfhVar.getClass();
        list.getClass();
        List list2 = (List) list.get(0);
        List list3 = (List) list.get(1);
        List list4 = (List) list.get(2);
        float f = 8;
        final int L = mfhVar.L(f);
        int i = L * 2;
        int i2 = ga6.i(j) - i;
        if (i2 < 0) {
            i2 = 0;
        }
        if (!((i2 >= 0) & (i2 >= 0))) {
            ume.a("width and height must be >= 0");
        }
        final ksk M = ((ffh) CollectionsKt.k0(list2)).M(ia6.h(i2, i2, i2, i2));
        ffh ffhVar = (ffh) CollectionsKt.k0(list3);
        int i3 = ga6.i(j);
        boolean z = i3 >= 0;
        int i4 = this.a;
        if (!((i4 >= 0) & z)) {
            ume.a("width and height must be >= 0");
        }
        final ksk M2 = ffhVar.M(ia6.h(i3, i3, i4, i4));
        int L2 = (i2 - (mfhVar.L(24) * 2)) - i;
        if (L2 < 0) {
            L2 = 0;
        }
        ffh ffhVar2 = (ffh) CollectionsKt.k0(list4);
        if (L2 < 0) {
            ume.a("width must be >= 0");
        }
        final ksk M3 = ffhVar2.M(ia6.h(L2, L2, 0, Integer.MAX_VALUE));
        int i5 = ga6.i(j);
        int L3 = ((M2.b / 2) + i2) - mfhVar.L(f);
        int i6 = L3 < 0 ? 0 : L3;
        final int i7 = i2;
        return mfh.m0(mfhVar, i5, i6, new Function1() { // from class: t4j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                ksk kskVar = ksk.this;
                int i8 = L;
                jskVar.d(kskVar, i8, i8, 0.0f);
                ksk kskVar2 = M2;
                int i9 = i7 - (kskVar2.b / 2);
                mfh mfhVar2 = mfhVar;
                int L4 = i9 - mfhVar2.L(8);
                if (L4 < 0) {
                    L4 = 0;
                }
                int i10 = ga6.i(j) / 2;
                ksk kskVar3 = M3;
                int i11 = i10 - (kskVar3.a / 2);
                if (i11 < 0) {
                    i11 = 0;
                }
                int L5 = (L4 - kskVar3.b) - mfhVar2.L(16);
                if (L5 < 0) {
                    L5 = 0;
                }
                jskVar.d(kskVar2, 0, L4, 0.0f);
                jskVar.d(kskVar3, i11, L5, 0.0f);
                return Unit.a;
            }
        });
    }
}
