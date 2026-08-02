package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class sij implements xjn {
    private Object value;

    public sij(Object obj) {
        this.value = obj;
    }

    public abstract void afterChange(s9f s9fVar, Object obj, Object obj2);

    public boolean beforeChange(@NotNull s9f s9fVar, Object obj, Object obj2) {
        s9fVar.getClass();
        return true;
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, @NotNull s9f s9fVar) {
        s9fVar.getClass();
        return this.value;
    }

    @Override // defpackage.xjn
    public void setValue(Object obj, @NotNull s9f s9fVar, Object obj2) {
        s9fVar.getClass();
        Object obj3 = this.value;
        if (beforeChange(s9fVar, obj3, obj2)) {
            this.value = obj2;
            afterChange(s9fVar, obj3, obj2);
        }
    }

    @NotNull
    public String toString() {
        return f1d.j(new StringBuilder("ObservableProperty(value="), this.value, ')');
    }
}
