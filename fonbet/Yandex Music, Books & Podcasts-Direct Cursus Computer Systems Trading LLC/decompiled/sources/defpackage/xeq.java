package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class xeq implements egc {
    public final List a;
    public final List b;
    public final jyr c;
    public final jyr d;

    public xeq(List list, List list2) {
        list.getClass();
        this.a = list;
        this.b = list2;
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: weq
            public final /* synthetic */ xeq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        List list3 = this.b.b;
                        int[] iArr = new int[list3.size()];
                        int i2 = 0;
                        for (Object obj : list3) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                u75.n();
                                throw null;
                            }
                            iArr[((Number) obj).intValue()] = i2;
                            i2 = i3;
                        }
                        return iArr;
                    default:
                        xeq xeqVar = this.b;
                        IntRange f = u75.f(xeqVar.a);
                        ArrayList arrayList = new ArrayList(v75.o(f, 10));
                        ype it = f.iterator();
                        while (it.c) {
                            arrayList.add(xeqVar.e(it.nextInt()));
                        }
                        return arrayList;
                }
            }
        });
        if (list.isEmpty()) {
            xq0.q("Error. elements list is empty");
            throw null;
        }
        if (list.size() != list2.size()) {
            wb8.h(dfi.f("Error. elements.size(", list.size(), list2.size(), " and shuffleMapping.size(", ") doesn't match"));
            throw null;
        }
        final int i2 = 1;
        this.d = btf.b(new Function0(this) { // from class: weq
            public final /* synthetic */ xeq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        List list3 = this.b.b;
                        int[] iArr = new int[list3.size()];
                        int i22 = 0;
                        for (Object obj : list3) {
                            int i3 = i22 + 1;
                            if (i22 < 0) {
                                u75.n();
                                throw null;
                            }
                            iArr[((Number) obj).intValue()] = i22;
                            i22 = i3;
                        }
                        return iArr;
                    default:
                        xeq xeqVar = this.b;
                        IntRange f = u75.f(xeqVar.a);
                        ArrayList arrayList = new ArrayList(v75.o(f, 10));
                        ype it = f.iterator();
                        while (it.c) {
                            arrayList.add(xeqVar.e(it.nextInt()));
                        }
                        return arrayList;
                }
            }
        });
    }

    @Override // defpackage.egc
    public final egc a() {
        List list = this.a;
        if (list instanceof kdo) {
            return this;
        }
        list.getClass();
        return new xeq(new kdo(list), this.b);
    }

    @Override // defpackage.egc
    public final boolean b() {
        return this.a instanceof kdo;
    }

    @Override // defpackage.egc
    public final int c(int i) {
        return ((Number) this.b.get(i)).intValue();
    }

    @Override // defpackage.egc
    public final int d(int i) {
        return ((int[]) this.c.getValue())[i];
    }

    @Override // defpackage.egc
    public final mwk e(int i) {
        return (mwk) this.a.get(c(i));
    }

    @Override // defpackage.egc
    public final List f() {
        return (List) this.d.getValue();
    }

    @Override // defpackage.egc
    public final egc g() {
        List list = this.a;
        return list instanceof kdo ? new xeq(((kdo) list).b, this.b) : this;
    }

    @Override // defpackage.egc
    public final List getElements() {
        return this.a;
    }
}
