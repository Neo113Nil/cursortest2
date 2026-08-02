package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;

/* loaded from: classes5.dex */
public final class qg extends x5 {
    public final /* synthetic */ int b;
    public final mhp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(int i) {
        super(1);
        this.b = i;
        switch (i) {
            case 1:
                super(1);
                this.c = q5f.Companion.serializer().getDescriptor();
                break;
            case 2:
                super(1);
                this.c = q5f.Companion.serializer().getDescriptor();
                break;
            case 3:
                super(1);
                this.c = q5f.Companion.serializer().getDescriptor();
                break;
            case 4:
                super(1);
                this.c = x5a.Companion.serializer().getDescriptor();
                break;
            case 5:
                super(1);
                this.c = q5f.Companion.serializer().getDescriptor();
                break;
            case 6:
                super(1);
                this.c = w4f.Companion.serializer().getDescriptor();
                break;
            case 7:
                super(1);
                this.c = x8t.Companion.serializer().getDescriptor();
                break;
            default:
                this.c = ug.Companion.serializer().getDescriptor();
                break;
        }
    }

    public static o2a l(w8t w8tVar) {
        m2a m2aVar;
        if (w8tVar.c == null) {
            return null;
        }
        double d = w8tVar.a * 1000;
        t8t t8tVar = w8tVar.b;
        int i = t8tVar == null ? -1 : y8t.a[t8tVar.ordinal()];
        if (i == -1) {
            m2aVar = m2a.a;
        } else if (i == 1) {
            m2aVar = m2a.a;
        } else if (i == 2) {
            m2aVar = m2a.b;
        } else if (i == 3) {
            m2aVar = m2a.c;
        } else {
            if (i != 4) {
                b6e.s();
                return null;
            }
            m2aVar = m2a.d;
        }
        if (y8t.b[w8tVar.c.ordinal()] == 1) {
            return new o2a(d, m2aVar, n2a.a);
        }
        b6e.s();
        return null;
    }

    public static l2a m(x3f x3fVar, q5f q5fVar) {
        w4f w4fVar = (w4f) q5fVar.get("actions");
        if (w4fVar instanceof q5f) {
            return (l2a) x3fVar.a(ff7.C(swf.X(x3fVar.b, ern.a(l2a.class))), w4fVar);
        }
        if ((w4fVar instanceof m5f) || w4fVar == null) {
            return null;
        }
        throw new gic(new pt0(56, "Actions should be json object but actual value: " + w4fVar, (Throwable) null));
    }

    public static kb6 n(x3f x3fVar, q5f q5fVar) {
        w4f w4fVar = (w4f) q5fVar.get("ui");
        if (w4fVar instanceof q5f) {
            return (kb6) x3fVar.a(swf.X(x3fVar.b, ern.a(kb6.class)), (q5f) w4fVar);
        }
        if (w4fVar != null) {
            throw new gic(new pt0(56, "Content should be json object but actual value: " + w4fVar, (Throwable) null));
        }
        throw new gic(new pt0(56, "Missing mandatory field 'ui' (existing keys: " + q5fVar.a.keySet() + ")", (Throwable) null));
    }

    public static bsj o(x3f x3fVar, q5f q5fVar) {
        w4f w4fVar = (w4f) q5fVar.get("context");
        if (w4fVar instanceof q5f) {
            return (bsj) x3fVar.a(ff7.C(swf.X(x3fVar.b, ern.a(bsj.class))), w4fVar);
        }
        if ((w4fVar instanceof m5f) || w4fVar == null) {
            return null;
        }
        throw new gic(new pt0(56, "Context should be json object but actual value: " + w4fVar, (Throwable) null));
    }

    public static sro p(x3f x3fVar, q5f q5fVar) {
        w4f w4fVar = (w4f) q5fVar.get("scaffold");
        if (w4fVar instanceof q5f) {
            return (sro) x3fVar.a(ff7.C(swf.X(x3fVar.b, ern.a(sro.class))), w4fVar);
        }
        if ((w4fVar instanceof m5f) || w4fVar == null) {
            return null;
        }
        throw new gic(new pt0(56, "Scaffold should be json object but actual value: " + w4fVar, (Throwable) null));
    }

    public static f0q q(x3f x3fVar, q5f q5fVar) {
        w4f w4fVar = (w4f) q5fVar.get("shared");
        if (w4fVar instanceof q5f) {
            return (f0q) x3fVar.a(swf.X(x3fVar.b, ern.a(f0q.class)), w4fVar);
        }
        if ((w4fVar instanceof m5f) || w4fVar == null) {
            return f0q.b;
        }
        throw new gic(new pt0(56, "Shared should be json object but actual value: " + w4fVar, (Throwable) null));
    }

    public static p2a r(x3f x3fVar, q5f q5fVar) {
        w4f w4fVar = (w4f) q5fVar.get("transitionSettings");
        if (w4fVar instanceof q5f) {
            return (p2a) x3fVar.a(ff7.C(swf.X(x3fVar.b, ern.a(p2a.class))), w4fVar);
        }
        if ((w4fVar instanceof m5f) || w4fVar == null) {
            return null;
        }
        throw new gic(new pt0(56, "TransitionSettings should be json object but actual value: " + w4fVar, (Throwable) null));
    }

    public static l2a s(x3f x3fVar, w4f w4fVar) {
        if (!(w4fVar instanceof q5f)) {
            if (w4fVar instanceof m5f) {
                return new l2a(null, null, null, null, null, null);
            }
            throw new gic(new pt0(56, "Unexpected document actions format: " + w4fVar, (Throwable) null));
        }
        q5f q5fVar = (q5f) w4fVar;
        w4f w4fVar2 = (w4f) q5fVar.get("onAwake");
        md mdVar = w4fVar2 != null ? (md) x3fVar.a(ff7.C(swf.X(x3fVar.b, ern.a(md.class))), w4fVar2) : null;
        w4f w4fVar3 = (w4f) q5fVar.get("onApply");
        md mdVar2 = w4fVar3 != null ? (md) x3fVar.a(ff7.C(swf.X(x3fVar.b, ern.a(md.class))), w4fVar3) : null;
        w4f w4fVar4 = (w4f) q5fVar.get("onReload");
        md mdVar3 = w4fVar4 != null ? (md) x3fVar.a(ff7.C(swf.X(x3fVar.b, ern.a(md.class))), w4fVar4) : null;
        w4f w4fVar5 = (w4f) q5fVar.get("onFinish");
        md mdVar4 = w4fVar5 != null ? (md) x3fVar.a(ff7.C(swf.X(x3fVar.b, ern.a(md.class))), w4fVar5) : null;
        w4f w4fVar6 = (w4f) q5fVar.get("onReloadingFailed");
        md mdVar5 = w4fVar6 != null ? (md) x3fVar.a(ff7.C(swf.X(x3fVar.b, ern.a(md.class))), w4fVar6) : null;
        w4f w4fVar7 = (w4f) q5fVar.get("onError");
        return new l2a(mdVar, mdVar2, w4fVar7 != null ? (md) x3fVar.a(ff7.C(swf.X(x3fVar.b, ern.a(md.class))), w4fVar7) : null, mdVar3, mdVar4, mdVar5);
    }

    @Override // defpackage.x5
    public final Object g(x3f x3fVar, w4f w4fVar) {
        t5a t5aVar;
        switch (this.b) {
            case 0:
                ug ugVar = (ug) x3fVar.a(ug.Companion.serializer(), w4fVar);
                String str = ugVar.a;
                Map map = ugVar.b;
                if (map == null) {
                    map = e5b.a;
                    map.getClass();
                }
                return new pg(str, map, ugVar.c);
            case 1:
                q5f f = x4f.f(w4fVar);
                w4f w4fVar2 = (w4f) f.get("shared");
                q5f f2 = w4fVar2 != null ? x4f.f(w4fVar2) : null;
                f0q f0qVar = f2 != null ? (f0q) x3fVar.a(swf.X(x3fVar.b, ern.a(f0q.class)), f2) : f0q.b;
                w4f w4fVar3 = (w4f) f.get(Constants.KEY_ACTION);
                if (w4fVar3 != null) {
                    return new t7c((md) x3fVar.a(ff7.C(swf.X(x3fVar.b, ern.a(md.class))), x4f.f(w4fVar3)), f0qVar);
                }
                throw new zhp("Missing required field action when parsing action");
            case 2:
                try {
                    return s(x3fVar, w4fVar);
                } catch (Throwable unused) {
                    return new l2a(null, null, null, null, null, null);
                }
            case 3:
                w1g.w(x3fVar).b();
                try {
                    q5f f3 = x4f.f(w4fVar);
                    return new q2a(n(x3fVar, f3), p(x3fVar, f3), q(x3fVar, f3), m(x3fVar, f3), o(x3fVar, f3), r(x3fVar, f3));
                } finally {
                    w1g.w(x3fVar).d();
                }
            case 4:
                x5a x5aVar = (x5a) x3fVar.a(x5a.Companion.serializer(), w4fVar);
                String str2 = x5aVar.a;
                Map map2 = x5aVar.b;
                if (map2 == null) {
                    map2 = e5b.a;
                    map2.getClass();
                }
                return new t5a(str2, map2, x5aVar.c);
            case 5:
                u76 w = w1g.w(x3fVar);
                uhp uhpVar = x3fVar.b;
                u5a u5aVar = (u5a) w.g(ern.a(u5a.class));
                if (u5aVar != null && (t5aVar = u5aVar.a) != null) {
                    String str3 = t5aVar.a;
                }
                q2a q2aVar = (q2a) x3fVar.a(swf.X(uhpVar, ern.a(q2a.class)), w4fVar);
                w4f w4fVar4 = (w4f) x4f.f(w4fVar).get("query");
                q5f f4 = w4fVar4 != null ? x4f.f(w4fVar4) : null;
                return new b6a(q2aVar, f4 != null ? (t5a) x3fVar.a(ff7.C(swf.X(uhpVar, ern.a(t5a.class))), f4) : null);
            case 6:
                return new bsj(w4fVar);
            default:
                if (!(w4fVar instanceof q5f)) {
                    xq0.x("Failed requirement.");
                    return null;
                }
                x3fVar.getClass();
                x8t x8tVar = (x8t) x3fVar.a(x8t.Companion.serializer(), w4fVar);
                w8t w8tVar = x8tVar.a;
                o2a l = w8tVar != null ? l(w8tVar) : null;
                w8t w8tVar2 = x8tVar.b;
                return new p2a(l, w8tVar2 != null ? l(w8tVar2) : null);
        }
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        switch (this.b) {
        }
        return this.c;
    }
}
