package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.Date;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class w4j extends qp7 implements ayd {
    public final /* synthetic */ byd d;
    public final s63 e;
    public final q43 f;
    public final p4j g;
    public final jyr h;
    public final zb5 i;
    public final m4j j;
    public final xdr k;
    public final String l;

    public w4j(s63 s63Var, q43 q43Var, p4j p4jVar, jyr jyrVar, jyr jyrVar2, zb5 zb5Var, cu cuVar) {
        drf drfVar = s63Var.a;
        wfm wfmVar = (wfm) drfVar;
        wfmVar.getClass();
        this.d = new byd(wfmVar, jyrVar2);
        this.e = s63Var;
        this.f = q43Var;
        this.g = p4jVar;
        this.h = jyrVar;
        this.i = zb5Var;
        this.j = (m4j) drfVar;
        this.k = ydr.a(new dgt(true));
        this.l = "Skeleton:NewReleasesBlock";
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.j;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        this.d.b(z);
    }

    @Override // defpackage.qp7
    public final boolean m() {
        return this.k.getValue() instanceof qgt;
    }

    @Override // defpackage.qp7
    public final String n() {
        return this.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01d8, code lost:
    
        if (r30.d.a(r2, r3) == r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01da, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0060, code lost:
    
        if (r2 == r4) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0042  */
    @Override // defpackage.qp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        v4j v4jVar;
        int i;
        rj6 rj6Var;
        ArrayList arrayList;
        f70 f70Var;
        boolean z2 = z;
        if (cg6Var instanceof v4j) {
            v4jVar = (v4j) cg6Var;
            int i2 = v4jVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v4jVar.m = i2 - Integer.MIN_VALUE;
                Object obj = v4jVar.k;
                nm6 nm6Var = nm6.a;
                i = v4jVar.m;
                xdr xdrVar = this.k;
                m4j m4jVar = this.j;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!m()) {
                        dgt dgtVar = new dgt(true);
                        xdrVar.getClass();
                        xdrVar.m(null, dgtVar);
                    }
                    v4jVar.j = z2;
                    v4jVar.m = 1;
                    obj = this.g.a(m4jVar, z2, v4jVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return new d73(m4jVar);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = v4jVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!m()) {
                        dgt dgtVar2 = new dgt(false);
                        xdrVar.getClass();
                        xdrVar.m(null, dgtVar2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(m4jVar);
                }
                b5j b5jVar = (b5j) ((qj6) rj6Var).a;
                ArrayList<c5j> arrayList2 = b5jVar.a;
                boolean isEmpty = arrayList2.isEmpty();
                if (isEmpty) {
                    if (!m()) {
                        dgt dgtVar3 = new dgt(false);
                        xdrVar.getClass();
                        xdrVar.m(null, dgtVar3);
                    }
                    arrayList = arrayList2;
                    f70Var = null;
                } else {
                    if (isEmpty) {
                        b6e.s();
                        return null;
                    }
                    ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                    for (c5j c5jVar : arrayList2) {
                        d5j d5jVar = (d5j) this.h.getValue();
                        d5jVar.getClass();
                        c5jVar.getClass();
                        ArrayList arrayList4 = c5jVar.b;
                        lt ltVar = c5jVar.a;
                        Date date = c5jVar.d;
                        String L = date != null ? saf.L(date) : null;
                        u9b u9bVar = c5jVar.c;
                        if (u9bVar == null) {
                            u51 u51Var = (u51) CollectionsKt.firstOrNull(arrayList4);
                            u9bVar = u51Var != null ? u51Var.c : null;
                        }
                        ArrayList arrayList5 = arrayList2;
                        Integer intOrNull = StringsKt.toIntOrNull(((u51) CollectionsKt.Q(arrayList4)).a);
                        int intValue = intOrNull != null ? intOrNull.intValue() : 0;
                        u9b b0 = u9bVar != null ? bg3.b0(u9bVar, intValue, false) : null;
                        u9b b02 = u9bVar != null ? bg3.b0(u9bVar, intValue, true) : null;
                        skr skrVar = (skr) d5jVar.a.getValue();
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(CollectionsKt.X(arrayList4, ", ", null, null, new m2j(6), 30));
                        arrayList6.add(etn.H(ltVar));
                        arrayList6.add(ltVar.c);
                        if (ltVar.d.b()) {
                            arrayList6.add(skrVar.c(R.string.explicit_element_content_description));
                        }
                        if (L != null) {
                            arrayList6.add(L);
                        }
                        String X = CollectionsKt.X(arrayList6, StringUtil.SPACE, null, null, null, 62);
                        u9b u9bVar2 = c5jVar.c;
                        Integer d = b0 != null ? b0.d() : null;
                        Integer d2 = b02 != null ? b02.d() : null;
                        u9b u9bVar3 = ltVar.e;
                        arrayList3.add(new l5j(u9bVar2, arrayList4, ltVar, L, d, d2, u9bVar3 != null ? u9bVar3.d() : null, b0, b02, X, c5jVar.e, c5jVar.f));
                        arrayList2 = arrayList5;
                    }
                    arrayList = arrayList2;
                    qgt qgtVar = new qgt(arrayList3);
                    xdrVar.getClass();
                    f70Var = null;
                    xdrVar.m(null, qgtVar);
                }
                int size = arrayList.size();
                p43 p43Var = b5jVar.b;
                String str = p43Var != null ? p43Var.a : f70Var;
                q43 q43Var = this.f;
                q43Var.b(q43Var.a, size, str, f70Var);
                boolean isEmpty2 = arrayList.isEmpty();
                v4jVar.j = z2;
                v4jVar.m = 2;
            }
        }
        v4jVar = new v4j(this, cg6Var);
        Object obj2 = v4jVar.k;
        nm6 nm6Var2 = nm6.a;
        i = v4jVar.m;
        xdr xdrVar2 = this.k;
        m4j m4jVar2 = this.j;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
