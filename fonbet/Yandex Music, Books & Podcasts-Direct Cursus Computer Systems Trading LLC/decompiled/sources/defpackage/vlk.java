package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.b;

/* loaded from: classes.dex */
public class vlk extends b implements dmk {
    public static final vlk f = new vlk(aat.e, 0);
    public final aat d;
    public final int e;

    public vlk(aat aatVar, int i) {
        this.d = aatVar;
        this.e = i;
    }

    @Override // kotlin.collections.b
    public final Set a() {
        return new bmk(this, 0);
    }

    @Override // kotlin.collections.b
    public final Set b() {
        return new bmk(this, 1);
    }

    @Override // kotlin.collections.b
    public final Collection c() {
        return new l7(2, this);
    }

    @Override // kotlin.collections.b, java.util.Map
    public boolean containsKey(Object obj) {
        return this.d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.dmk
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public xlk builder() {
        return new xlk(this);
    }

    @Override // kotlin.collections.b
    public final int f() {
        return this.e;
    }

    public final vlk g(Object obj, h8g h8gVar) {
        j4x u = this.d.u(obj != null ? obj.hashCode() : 0, obj, h8gVar, 0);
        return u == null ? this : new vlk((aat) u.c, this.e + u.b);
    }

    @Override // kotlin.collections.b, java.util.Map
    public Object get(Object obj) {
        return this.d.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
