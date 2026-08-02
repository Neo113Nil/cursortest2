package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class w8j {
    public final r8j a;
    public final qe3 b;
    public final s8j c;
    public final xdr d = ydr.a(x8j.a);
    public oq e;
    public final jyr f;
    public final jyr g;
    public final jyr h;

    public w8j(lt ltVar, oq oqVar, r8j r8jVar, qe3 qe3Var, s8j s8jVar, mm6 mm6Var) {
        this.a = r8jVar;
        this.b = qe3Var;
        this.c = s8jVar;
        this.e = oqVar;
        final int i = 0;
        this.f = btf.b(new Function0(this) { // from class: t8j
            public final /* synthetic */ w8j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        w8j w8jVar = this.b;
                        r8j r8jVar2 = w8jVar.a;
                        return new h10((f7l) r8jVar2.j.getValue(), (k1l) r8jVar2.k.getValue(), (k1l) r8jVar2.l.getValue(), w8jVar.b.a, new sui(0, r8jVar2, r8j.class, "generateFrom", "generateFrom()Ljava/lang/String;", 0, 26));
                    case 1:
                        w8j w8jVar2 = this.b;
                        r8j r8jVar3 = w8jVar2.a;
                        return new vbb((raa) r8jVar3.o.getValue(), (xba) r8jVar3.p.getValue(), (z66) r8jVar3.q.getValue(), w8jVar2.b);
                    default:
                        r8j r8jVar4 = this.b.a;
                        return new bab((xba) r8jVar4.p.getValue(), (uaa) r8jVar4.n.getValue());
                }
            }
        });
        final int i2 = 1;
        this.g = btf.b(new Function0(this) { // from class: t8j
            public final /* synthetic */ w8j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        w8j w8jVar = this.b;
                        r8j r8jVar2 = w8jVar.a;
                        return new h10((f7l) r8jVar2.j.getValue(), (k1l) r8jVar2.k.getValue(), (k1l) r8jVar2.l.getValue(), w8jVar.b.a, new sui(0, r8jVar2, r8j.class, "generateFrom", "generateFrom()Ljava/lang/String;", 0, 26));
                    case 1:
                        w8j w8jVar2 = this.b;
                        r8j r8jVar3 = w8jVar2.a;
                        return new vbb((raa) r8jVar3.o.getValue(), (xba) r8jVar3.p.getValue(), (z66) r8jVar3.q.getValue(), w8jVar2.b);
                    default:
                        r8j r8jVar4 = this.b.a;
                        return new bab((xba) r8jVar4.p.getValue(), (uaa) r8jVar4.n.getValue());
                }
            }
        });
        final int i3 = 2;
        this.h = btf.b(new Function0(this) { // from class: t8j
            public final /* synthetic */ w8j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        w8j w8jVar = this.b;
                        r8j r8jVar2 = w8jVar.a;
                        return new h10((f7l) r8jVar2.j.getValue(), (k1l) r8jVar2.k.getValue(), (k1l) r8jVar2.l.getValue(), w8jVar.b.a, new sui(0, r8jVar2, r8j.class, "generateFrom", "generateFrom()Ljava/lang/String;", 0, 26));
                    case 1:
                        w8j w8jVar2 = this.b;
                        r8j r8jVar3 = w8jVar2.a;
                        return new vbb((raa) r8jVar3.o.getValue(), (xba) r8jVar3.p.getValue(), (z66) r8jVar3.q.getValue(), w8jVar2.b);
                    default:
                        r8j r8jVar4 = this.b.a;
                        return new bab((xba) r8jVar4.p.getValue(), (uaa) r8jVar4.n.getValue());
                }
            }
        });
        x97.y(mm6Var, dm6.b, null, new ckg(mm6Var, oqVar, this, ltVar, (Continuation) null, 8), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007c -> B:10:0x007f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(w8j w8jVar, oq oqVar, cg6 cg6Var) {
        v8j v8jVar;
        int i;
        int i2;
        Iterator it;
        Collection collection;
        int i3;
        int i4;
        String str;
        if (cg6Var instanceof v8j) {
            v8jVar = (v8j) cg6Var;
            int i5 = v8jVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                v8jVar.q = i5 - Integer.MIN_VALUE;
                Object obj = v8jVar.o;
                nm6 nm6Var = nm6.a;
                i = v8jVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    ArrayList m = lxe.m(oqVar.h());
                    ArrayList arrayList = new ArrayList();
                    i2 = 0;
                    it = m.iterator();
                    collection = arrayList;
                    i3 = 0;
                    i4 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = v8jVar.n;
                    i2 = v8jVar.m;
                    i4 = v8jVar.l;
                    it = v8jVar.k;
                    collection = v8jVar.j;
                    qgg.h0(obj);
                    a58 a58Var = (a58) obj;
                    String str2 = (a58Var != null || (str = a58Var.d) == null) ? null : (String) avf.Q(str);
                    if (str2 != null) {
                        collection.add(str2);
                    }
                    if (it.hasNext()) {
                        hs5 hs5Var = (hs5) it.next();
                        k68 k68Var = (k68) w8jVar.a.g.getValue();
                        v8jVar.j = collection;
                        v8jVar.k = it;
                        v8jVar.l = i4;
                        v8jVar.m = i2;
                        v8jVar.n = i3;
                        v8jVar.q = 1;
                        obj = k68Var.a(hs5Var, v8jVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        a58 a58Var2 = (a58) obj;
                        if (a58Var2 != null) {
                        }
                        if (str2 != null) {
                        }
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        v8jVar = new v8j(w8jVar, cg6Var);
        Object obj2 = v8jVar.o;
        nm6 nm6Var2 = nm6.a;
        i = v8jVar.q;
        if (i != 0) {
        }
    }

    public final List b() {
        LinkedList linkedList;
        oq oqVar = this.e;
        if (oqVar == null || (linkedList = oqVar.F) == null) {
            return c5b.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (((mqs) obj).k == dg2.b) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
