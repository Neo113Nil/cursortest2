package defpackage;

/* loaded from: classes7.dex */
public final class qf60 implements xbi0 {
    public Object a;

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        Object obj2 = this.a;
        if (obj2 != null) {
            return obj2;
        }
        vg10.s("Property ", kgxVar.getName(), " should be initialized before get.");
        return null;
    }

    @Override // defpackage.xbi0
    public final void setValue(Object obj, kgx kgxVar, Object obj2) {
        this.a = obj2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NotNullProperty(");
        if (this.a != null) {
            str = "value=" + this.a;
        } else {
            str = "value not initialized yet";
        }
        return b64.p(sb, str, ')');
    }
}
