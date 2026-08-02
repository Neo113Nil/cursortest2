package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class rzn {
    public final opi a;
    public final int b;
    public final Set c;
    public Object d;
    public uif e;

    public rzn(opi opiVar, int i, LinkedHashSet linkedHashSet) {
        linkedHashSet.getClass();
        this.a = opiVar;
        this.b = i;
        this.c = linkedHashSet;
    }

    public final boolean a() {
        return this.d != null;
    }

    public final void b(Object obj) {
        obj.getClass();
        this.d = obj;
    }
}
