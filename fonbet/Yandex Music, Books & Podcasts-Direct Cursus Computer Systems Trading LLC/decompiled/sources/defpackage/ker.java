package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class ker implements Map.Entry, m9f {
    public final Object a;
    public Object b;
    public final /* synthetic */ ler c;

    public ker(ler lerVar) {
        this.c = lerVar;
        Map.Entry entry = lerVar.d;
        entry.getClass();
        this.a = entry.getKey();
        Map.Entry entry2 = lerVar.d;
        entry2.getClass();
        this.b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        ler lerVar = this.c;
        u2r u2rVar = lerVar.a;
        if (u2rVar.c().d != lerVar.c) {
            xq0.i();
            return null;
        }
        Object obj2 = this.b;
        u2rVar.put(this.a, obj);
        this.b = obj;
        return obj2;
    }
}
