package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class g10 {
    public final oq a;
    public final p0t b;
    public final lwc c;
    public final f7l d;

    public g10(oq oqVar, p0t p0tVar, lwc lwcVar, f7l f7lVar) {
        oqVar.getClass();
        p0tVar.getClass();
        lwcVar.getClass();
        f7lVar.getClass();
        this.a = oqVar;
        this.b = p0tVar;
        this.c = lwcVar;
        this.d = f7lVar;
    }

    public final n8g a() {
        n7q n7qVar;
        Object obj;
        Object obj2;
        boolean z;
        n8g b = t75.b();
        oq oqVar = this.a;
        LinkedList linkedList = oqVar.F;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : linkedList) {
            if (((mqs) obj3).k == dg2.b) {
                arrayList.add(obj3);
            }
        }
        b.add(shi.a);
        boolean z2 = false;
        if (!arrayList.isEmpty() && u2x.I(oqVar)) {
            Boolean bool = Boolean.TRUE;
            Pair pair = new Pair(bool, bool);
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                boolean z3 = true;
                obj = pair.b;
                obj2 = pair.a;
                if (!hasNext) {
                    break;
                }
                mqs mqsVar = (mqs) it.next();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    p0t p0tVar = this.b;
                    p0tVar.getClass();
                    mqsVar.getClass();
                    r1l r1lVar = (r1l) p0tVar.a.getValue();
                    r1lVar.getClass();
                    Boolean d = r1lVar.d(mqsVar.a);
                    if (d != null ? d.booleanValue() : false) {
                        z = true;
                        Boolean valueOf = Boolean.valueOf(z);
                        if (booleanValue2 || !mqsVar.l) {
                            z3 = false;
                        }
                        pair = new Pair(valueOf, Boolean.valueOf(z3));
                    }
                }
                z = false;
                Boolean valueOf2 = Boolean.valueOf(z);
                if (booleanValue2) {
                }
                z3 = false;
                pair = new Pair(valueOf2, Boolean.valueOf(z3));
            }
            boolean booleanValue3 = ((Boolean) obj2).booleanValue();
            if (((Boolean) obj).booleanValue()) {
                if (booleanValue3) {
                    b.add(shi.c);
                } else {
                    if (booleanValue3) {
                        b6e.s();
                        return null;
                    }
                    b.add(shi.b);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            d6l x = p6g.x((e6l) this.d.c.getValue());
            if (x != null && (n7qVar = x.a) != null) {
                z2 = vut.E(n7qVar);
            }
            if (z2) {
                b.add(shi.d);
                b.add(shi.e);
            }
        }
        if (!this.c.a()) {
            b.add(shi.f);
        }
        return t75.a(b);
    }
}
