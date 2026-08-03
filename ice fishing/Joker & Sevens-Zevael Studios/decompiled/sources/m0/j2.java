package m0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j2 implements Iterable, qc.a {

    /* renamed from: h, reason: collision with root package name */
    public int f4632h;

    /* renamed from: j, reason: collision with root package name */
    public int f4634j;

    /* renamed from: k, reason: collision with root package name */
    public int f4635k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4637m;

    /* renamed from: n, reason: collision with root package name */
    public int f4638n;

    /* renamed from: p, reason: collision with root package name */
    public HashMap f4640p;

    /* renamed from: q, reason: collision with root package name */
    public s.u f4641q;

    /* renamed from: g, reason: collision with root package name */
    public int[] f4631g = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public Object[] f4633i = new Object[0];

    /* renamed from: l, reason: collision with root package name */
    public final Object f4636l = new Object();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f4639o = new ArrayList();

    public final int a(a aVar) {
        if (this.f4637m) {
            t.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!aVar.a()) {
            s1.a("Anchor refers to a group that was removed");
        }
        return aVar.f4509a;
    }

    public final void b() {
        this.f4640p = new HashMap();
    }

    public final i2 c() {
        if (this.f4637m) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f4635k++;
        return new i2(this);
    }

    public final m2 d() {
        if (this.f4637m) {
            t.c("Cannot start a writer when another writer is pending");
        }
        if (this.f4635k > 0) {
            t.c("Cannot start a writer when a reader is pending");
        }
        this.f4637m = true;
        this.f4638n++;
        return new m2(this);
    }

    public final boolean e(a aVar) {
        int e10;
        return aVar.a() && (e10 = l2.e(this.f4639o, aVar.f4509a, this.f4632h)) >= 0 && pc.j.a(this.f4639o.get(e10), aVar);
    }

    public final q0 f(int i10) {
        int i11;
        ArrayList arrayList;
        int e10;
        HashMap hashMap = this.f4640p;
        if (hashMap != null) {
            if (this.f4637m) {
                t.c("use active SlotWriter to crate an anchor for location instead");
            }
            a aVar = (i10 < 0 || i10 >= (i11 = this.f4632h) || (e10 = l2.e((arrayList = this.f4639o), i10, i11)) < 0) ? null : (a) arrayList.get(e10);
            if (aVar != null) {
                return (q0) hashMap.get(aVar);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p0(this, 0, this.f4632h);
    }
}
