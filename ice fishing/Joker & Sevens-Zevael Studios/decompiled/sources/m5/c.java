package m5;

import a0.a0;
import androidx.lifecycle.o;
import bc.m;
import bc.n;
import d8.t;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import m0.i0;
import m0.l;
import m0.l1;
import m0.r;
import m0.x1;
import m0.z;
import pc.u;
import pc.x;
import w0.q;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4878a;

    /* renamed from: b, reason: collision with root package name */
    public final v0.c f4879b;

    /* renamed from: c, reason: collision with root package name */
    public final c f4880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f4881d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4882e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f4883f;

    /* renamed from: g, reason: collision with root package name */
    public final i5.b f4884g;

    /* renamed from: h, reason: collision with root package name */
    public final i5.a f4885h;

    public c(List list, String str, v0.c cVar, d dVar, c cVar2) {
        pc.j.e(list, "screens");
        pc.j.e(cVar, "stateHolder");
        this.f4878a = str;
        this.f4879b = cVar;
        this.f4880c = cVar2;
        this.f4881d = new t(list);
        this.f4882e = cVar2 != null ? cVar2.f4882e + 1 : 0;
        this.f4883f = z.n(new a(this, 0));
        this.f4884g = new i5.b();
        this.f4885h = new i5.a();
    }

    public final void a(k5.a aVar) {
        pc.j.e(aVar, "screen");
        i5.a aVar2 = j5.k.f3546a;
        j5.j jVar = (j5.j) aVar2.f3195g.remove(aVar.getKey());
        if (jVar != null) {
            jVar.f(aVar);
        }
        i5.a aVar3 = j5.k.f3547b;
        i5.a aVar4 = (i5.a) aVar3.f3195g.remove(aVar.getKey());
        if (aVar4 != null) {
            Iterator it = aVar4.entrySet().iterator();
            while (it.hasNext()) {
                ((j5.j) ((Map.Entry) it.next()).getValue()).f(aVar);
            }
        }
        i5.b bVar = this.f4884g;
        wc.c cVar = new wc.c(new wc.d(0, new bc.t(0, m.i0(bVar)), new a0(15, aVar)));
        while (cVar.hasNext()) {
            String str = (String) cVar.next();
            this.f4879b.b(str);
            bVar.remove(str);
        }
    }

    public final List b() {
        return (List) ((i0) this.f4881d.f1818c).getValue();
    }

    public final boolean c() {
        t tVar = this.f4881d;
        if (!tVar.j()) {
            return false;
        }
        q qVar = (q) tVar.f1816a;
        pc.j.e(qVar, "<this>");
        if (qVar.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        qVar.remove(n.K(qVar));
        ((l1) tVar.f1817b).setValue(l5.b.f4161i);
        return true;
    }

    public final void d(k5.a aVar) {
        t tVar = this.f4881d;
        q qVar = (q) tVar.f1816a;
        l1 l1Var = (l1) tVar.f1817b;
        if (qVar.isEmpty()) {
            ((q) tVar.f1816a).add(aVar);
            l1Var.setValue(l5.b.f4159g);
        } else {
            qVar.set(n.K(qVar), aVar);
        }
        l1Var.setValue(l5.b.f4160h);
    }

    public final void e(String str, k5.a aVar, u0.d dVar, r rVar, int i10, int i11) {
        rVar.Z(-1421478789);
        k5.a aVar2 = (i11 & 2) != 0 ? (k5.a) this.f4883f.getValue() : aVar;
        String str2 = aVar2.getKey() + ':' + str;
        this.f4884g.add(str2);
        rVar.Y(1014940995);
        Object key = aVar2.getKey();
        rVar.Y(1157296644);
        boolean f10 = rVar.f(key);
        Object M = rVar.M();
        Object obj = l.f4646a;
        if (f10 || M == obj) {
            M = j5.b.f3532g;
            rVar.i0(M);
        }
        rVar.q(false);
        Object obj2 = (j5.j) M;
        rVar.q(false);
        rVar.Y(2046230470);
        Object key2 = aVar2.getKey();
        rVar.Y(1157296644);
        boolean f11 = rVar.f(key2);
        Object M2 = rVar.M();
        if (f11 || M2 == obj) {
            o[] oVarArr = h5.d.f2853m;
            i5.a aVar3 = j5.k.f3546a;
            u uVar = pc.t.f5684a;
            pc.e a6 = pc.t.a(h5.d.class);
            List list = Collections.EMPTY_LIST;
            uVar.getClass();
            x xVar = new x(a6);
            i5.a aVar4 = j5.k.f3547b;
            String key3 = aVar2.getKey();
            Object obj3 = aVar4.f3195g.get(key3);
            Object obj4 = obj3;
            if (obj3 == null) {
                i5.a aVar5 = new i5.a();
                pc.j.e(aVar2.getKey(), "it");
                aVar5.put(xVar, new h5.d());
                aVar4.put(key3, aVar5);
                obj4 = aVar5;
            }
            Map map = (Map) obj4;
            Object obj5 = map.get(xVar);
            if (obj5 == null) {
                pc.j.e(aVar2.getKey(), "it");
                obj5 = new h5.d();
                map.put(xVar, obj5);
            }
            M2 = i7.b.z((h5.d) ((j5.j) obj5));
            rVar.i0(M2);
        }
        rVar.q(false);
        List list2 = (List) M2;
        rVar.q(false);
        rVar.Y(511388516);
        boolean f12 = rVar.f(obj2) | rVar.f(list2);
        Object M3 = rVar.M();
        if (f12 || M3 == obj) {
            M3 = m.a0(i7.b.z(obj2), list2);
            rVar.i0(M3);
        }
        rVar.q(false);
        j5.d.b((List) M3, u0.e.b(rVar, -1585690675, new j5.f(1, str2, this)), u0.e.b(rVar, -720851089, new j5.e(this, str2, dVar)), rVar, 440);
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new b(this, str, aVar2, dVar, i10, i11);
        }
    }
}
