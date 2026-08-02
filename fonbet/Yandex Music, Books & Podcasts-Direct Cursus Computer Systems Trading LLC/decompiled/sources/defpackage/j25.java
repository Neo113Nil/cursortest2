package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class j25 {
    public final bnd a;
    public final sld b;
    public final fkn c;

    public j25(o0s o0sVar, ArrayList arrayList, bnd bndVar, sld sldVar) {
        this.a = bndVar;
        this.b = sldVar;
        jyr b = l18.b.b(hag.I(z66.class), true);
        xdr a = ydr.a(new l25(c5b.a, false));
        this.c = new fkn(a);
        boolean isEmpty = arrayList.isEmpty();
        boolean h = ((z66) b.getValue()).h();
        if (isEmpty && h) {
            a.m(null, k25.b);
        } else if (isEmpty && o0sVar == o0s.b) {
            a.m(null, k25.a);
        } else {
            a.m(null, new l25(arrayList, o0sVar == o0s.a && !h));
        }
    }
}
