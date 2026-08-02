package defpackage;

import java.util.Iterator;
import kotlin.collections.c;

/* loaded from: classes.dex */
public final class emk extends c implements iee {
    public static final emk e;
    public final Object b;
    public final Object c;
    public final vlk d;

    static {
        qee qeeVar = qee.f;
        e = new emk(qeeVar, qeeVar, vlk.f);
    }

    public emk(Object obj, Object obj2, vlk vlkVar) {
        this.b = obj;
        this.c = obj2;
        this.d = vlkVar;
    }

    @Override // defpackage.w5, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.w5
    public final int f() {
        return this.d.e;
    }

    @Override // kotlin.collections.c, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new g5d(this.b, this.d);
    }
}
