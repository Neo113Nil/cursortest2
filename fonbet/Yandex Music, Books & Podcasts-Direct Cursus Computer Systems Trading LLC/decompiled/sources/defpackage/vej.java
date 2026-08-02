package defpackage;

/* loaded from: classes5.dex */
public final class vej implements xjn {
    public Object a;

    @Override // defpackage.sjn
    public final Object getValue(Object obj, s9f s9fVar) {
        s9fVar.getClass();
        Object obj2 = this.a;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + s9fVar.getName() + " should be initialized before get.");
    }

    @Override // defpackage.xjn
    public final void setValue(Object obj, s9f s9fVar, Object obj2) {
        s9fVar.getClass();
        obj2.getClass();
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
        return dfi.i(sb, str, ')');
    }
}
