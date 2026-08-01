package com.anythink.core.common.w;

import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.v.l;
import com.anythink.core.common.v.p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private List<bv> f17131a;

    public i(List<bv> list) {
        ArrayList arrayList = new ArrayList();
        this.f17131a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    private static double b(bv bvVar) {
        if (bvVar.aZ() == 2) {
            return 0.0d;
        }
        return p.a(bvVar);
    }

    public final synchronized List<bv> a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f17131a);
        return arrayList;
    }

    public final synchronized void a(bv bvVar) {
        List<bv> list = this.f17131a;
        if (list != null) {
            if (list.size() == 0) {
                bvVar.H(0);
                this.f17131a.add(bvVar);
                a(bvVar, 0, null);
                return;
            }
            for (int i = 0; i < this.f17131a.size(); i++) {
                bv bvVar2 = this.f17131a.get(i);
                if (l.a(bvVar, bvVar2) < 0) {
                    bvVar.H(i);
                    this.f17131a.add(i, bvVar);
                    a(bvVar, i, bvVar2);
                    int i6 = i + 1;
                    List<bv> list2 = this.f17131a;
                    if (list2 != null && i6 < list2.size()) {
                        while (i6 < list2.size()) {
                            bv bvVar3 = list2.get(i6);
                            if (bvVar3 != null) {
                                bvVar3.H(i6);
                            }
                            i6++;
                        }
                    }
                    return;
                }
            }
            bvVar.H(this.f17131a.size());
            this.f17131a.add(bvVar);
            a(bvVar, this.f17131a.size() - 1, null);
        }
    }

    private static void a(int i, List<bv> list) {
        if (list != null && i < list.size()) {
            while (i < list.size()) {
                bv bvVar = list.get(i);
                if (bvVar != null) {
                    bvVar.H(i);
                }
                i++;
            }
        }
    }

    private void a(bv bvVar, int i, bv bvVar2) {
        ad R8;
        ad R9;
        if (bvVar.o() && (R9 = bvVar.R()) != null) {
            if (bvVar2 != null) {
                R9.a(bvVar2, p.a(bvVar2));
            } else {
                R9.a(bvVar, b(bvVar));
            }
        }
        if (i > 0) {
            bv bvVar3 = this.f17131a.get(i - 1);
            if (!bvVar3.o() || (R8 = bvVar3.R()) == null) {
                return;
            }
            R8.a(bvVar, p.a(bvVar));
        }
    }
}
