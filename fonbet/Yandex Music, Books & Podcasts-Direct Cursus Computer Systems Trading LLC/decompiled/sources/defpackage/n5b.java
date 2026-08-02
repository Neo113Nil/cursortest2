package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.ui.layout.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n5b implements kfh {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ n5b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kfh
    public final lfh b(final mfh mfhVar, List list, long j) {
        Integer valueOf;
        ksk kskVar;
        switch (this.a) {
            case 0:
                mfhVar.getClass();
                list.getClass();
                int size = list.size();
                if (1 > size || size >= 3) {
                    xq0.x("Failed requirement.");
                    return null;
                }
                long b = ia6.b(ga6.i(j), 0, 13);
                Object Q = CollectionsKt.Q(list);
                if (list.size() != 2) {
                    Q = null;
                }
                ffh ffhVar = (ffh) Q;
                ksk M = ffhVar != null ? ffhVar.M(b) : null;
                final ksk M2 = ((ffh) CollectionsKt.Y(list)).M(b);
                int g = ia6.g(Math.max(M2.a, M != null ? M.a : 0), j);
                final int h = ga6.h(j);
                final int i = M != null ? M.b : 0;
                final int a = dfi.a(1, -0.5f, ((h - i) - M2.b) / 2.0f);
                final sjq sjqVar = (sjq) this.b;
                final ksk kskVar2 = M;
                return mfh.m0(mfhVar, g, h, new Function1() { // from class: m5b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        jsk jskVar = (jsk) obj;
                        jskVar.getClass();
                        ksk kskVar3 = M2;
                        int i2 = kskVar3.b;
                        int i3 = i;
                        int i4 = (i2 + i3) - h;
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        sjq sjqVar2 = sjq.this;
                        sjqVar2.b = i4;
                        if (sjqVar2.a() > i4) {
                            sjqVar2.a.setValue(Integer.valueOf(i4));
                        }
                        ksk kskVar4 = kskVar2;
                        if (kskVar4 != null) {
                            jskVar.d(kskVar4, 0, -sjqVar2.a(), 0.0f);
                        }
                        jskVar.d(kskVar3, 0, (-sjqVar2.a()) + i3 + a, 0.0f);
                        return Unit.a;
                    }
                });
            case 1:
                mfhVar.getClass();
                list.getClass();
                List list2 = list;
                final ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ffh) it.next()).M(ga6.b(j, 0, 0, 0, 0, 10)));
                }
                float n0 = mfhVar.n0(arrayList.size() <= 3 ? 32 : 24);
                final float f = 16;
                Iterator it2 = arrayList.iterator();
                Integer num = null;
                if (it2.hasNext()) {
                    valueOf = Integer.valueOf(((ksk) it2.next()).a);
                    while (it2.hasNext()) {
                        Integer valueOf2 = Integer.valueOf(((ksk) it2.next()).a);
                        if (valueOf.compareTo(valueOf2) < 0) {
                            valueOf = valueOf2;
                        }
                    }
                } else {
                    valueOf = null;
                }
                final int intValue = valueOf != null ? valueOf.intValue() : 0;
                int L = intValue - mfhVar.L(p9b.a);
                int size2 = arrayList.size() * intValue;
                int d = arrayList.size() > 1 ? yhn.d((((mfhVar.L(((c) this.b).d()) - size2) - (mfhVar.L(f) * 2)) / (arrayList.size() - 1)) - L, mfhVar.L(8), eeh.b(n0)) : 0;
                int L2 = (mfhVar.L(f) * 2) + ((arrayList.size() - 1) * d) + size2;
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    num = Integer.valueOf(((ksk) it3.next()).b);
                    while (it3.hasNext()) {
                        Integer valueOf3 = Integer.valueOf(((ksk) it3.next()).b);
                        if (num.compareTo(valueOf3) < 0) {
                            num = valueOf3;
                        }
                    }
                }
                int intValue2 = num != null ? num.intValue() : 0;
                final int i2 = d;
                return mfh.m0(mfhVar, L2, intValue2, new Function1() { // from class: o9b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        jsk jskVar = (jsk) obj;
                        jskVar.getClass();
                        int L3 = mfh.this.L(f);
                        int i3 = 0;
                        for (Object obj2 : arrayList) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                u75.n();
                                throw null;
                            }
                            ksk kskVar3 = (ksk) obj2;
                            if (i3 != 0) {
                                L3 += i2;
                            }
                            int i5 = (intValue - kskVar3.a) / 2;
                            int i6 = L3 + i5;
                            jskVar.d(kskVar3, i6, 0, 0.0f);
                            L3 = i6 + kskVar3.a + i5;
                            i3 = i4;
                        }
                        return Unit.a;
                    }
                });
            case 2:
                mfhVar.getClass();
                list.getClass();
                return ((enc) this.b).b(mfhVar, t75.c(list), j);
            case 3:
                mfhVar.getClass();
                list.getClass();
                return ((fnc) this.b).b(mfhVar, t75.c(list), j);
            case 4:
                mfhVar.getClass();
                list.getClass();
                return ((dnc) this.b).b(mfhVar, t75.c(list), j);
            case 5:
                return mfh.m0(mfhVar, ga6.i(j), ga6.h(j), new sea(list, this));
            default:
                if (((Function2) this.b) != null) {
                    int size3 = list.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ffh ffhVar2 = (ffh) list.get(i3);
                        if (Intrinsics.d(a.a(ffhVar2), "text")) {
                            kskVar = ffhVar2.M(ga6.b(j, 0, 0, 0, 0, 11));
                        }
                    }
                    wvs.h("Collection contains no element matching the predicate.");
                    return null;
                }
                kskVar = null;
                int max = Math.max(kskVar != null ? kskVar.a : 0, 0);
                int L3 = mfhVar.L(f1s.a);
                return mfh.m0(mfhVar, max, L3, new d1s(kskVar, null, mfhVar, max, L3, kskVar != null ? Integer.valueOf(kskVar.Y(j40.a)) : null, kskVar != null ? Integer.valueOf(kskVar.Y(j40.b)) : null));
        }
    }
}
