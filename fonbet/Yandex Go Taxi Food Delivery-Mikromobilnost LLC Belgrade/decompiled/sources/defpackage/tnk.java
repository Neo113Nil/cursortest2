package defpackage;

import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tnk implements c4x {
    public final List a;
    public final List b;
    public Integer c;

    public tnk(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0044, code lost:
    
        if (r1 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(tnk tnkVar, rvo rvoVar, rvo rvoVar2) {
        if (tnkVar == null) {
            return false;
        }
        List list = tnkVar.a;
        List list2 = this.a;
        if (list2 != null) {
            if (list != null && list2.size() == list.size()) {
                int i = 0;
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    if (!((v3k) obj).a((v3k) list.get(i), rvoVar, rvoVar2)) {
                        break;
                    }
                    i = i2;
                }
                List list3 = tnkVar.b;
                List list4 = this.b;
                if (list4 != null) {
                    if (list3 != null && list4.size() == list3.size()) {
                        int i3 = 0;
                        for (Object obj2 : list4) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                scc.m();
                                throw null;
                            }
                            if (((v3k) obj2).a((v3k) list3.get(i3), rvoVar, rvoVar2)) {
                                i3 = i4;
                            }
                        }
                        return true;
                    }
                } else if (list3 == null) {
                    return true;
                }
            }
            return false;
        }
    }

    public final int b() {
        int i;
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(tnk.class).hashCode();
        int i2 = 0;
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((v3k) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        List list2 = this.b;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                i2 += ((v3k) it2.next()).b();
            }
        }
        int i4 = i3 + i2;
        this.c = Integer.valueOf(i4);
        return i4;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((unk) ft6.b.a3.getValue()).b(ft6.a, this);
    }

    public tnk() {
        this(null, null);
    }
}
