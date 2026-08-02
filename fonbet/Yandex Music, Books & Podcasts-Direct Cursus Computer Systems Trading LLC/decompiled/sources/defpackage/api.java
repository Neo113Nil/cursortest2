package defpackage;

/* loaded from: classes.dex */
public final class api extends k9h implements m9f {
    public final j7 d;
    public Object e;

    public api(j7 j7Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.d = j7Var;
        this.e = obj2;
    }

    @Override // defpackage.k9h, java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // defpackage.k9h, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        ylk ylkVar = (ylk) this.d.b;
        xlk xlkVar = ylkVar.d;
        Object obj3 = this.b;
        if (!xlkVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z = ylkVar.c;
        if (!z) {
            xlkVar.put(obj3, obj);
        } else {
            if (!z) {
                wvs.n();
                return null;
            }
            bat batVar = ylkVar.a[ylkVar.b];
            Object obj4 = batVar.a[batVar.c];
            xlkVar.put(obj3, obj);
            ylkVar.c(obj4 != null ? obj4.hashCode() : 0, xlkVar.c, obj4, 0);
        }
        ylkVar.g = xlkVar.e;
        return obj2;
    }
}
