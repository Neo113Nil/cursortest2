package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class f7f extends z6 {
    public final q5f f;
    public final mhp g;
    public int h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7f(x3f x3fVar, q5f q5fVar, String str, mhp mhpVar) {
        super(x3fVar, str);
        x3fVar.getClass();
        q5fVar.getClass();
        this.f = q5fVar;
        this.g = mhpVar;
    }

    @Override // defpackage.z6, defpackage.eg7
    public final boolean C() {
        return !this.i && super.C();
    }

    @Override // defpackage.z6
    public w4f I(String str) {
        str.getClass();
        return (w4f) uah.c(str, W());
    }

    @Override // defpackage.z6
    public String U(mhp mhpVar, int i) {
        mhpVar.getClass();
        x3f x3fVar = this.c;
        c3x.O(x3fVar, mhpVar);
        String f = mhpVar.f(i);
        if (this.e.i && !W().a.keySet().contains(f)) {
            ozw ozwVar = x3fVar.c;
            kjn kjnVar = c3x.g;
            zya zyaVar = new zya(21, mhpVar, x3fVar);
            ozwVar.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ozwVar.b;
            Map map = (Map) concurrentHashMap.get(mhpVar);
            Object obj = null;
            Object obj2 = map != null ? map.get(kjnVar) : null;
            if (obj2 == null) {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = zyaVar.invoke();
                Object obj3 = concurrentHashMap.get(mhpVar);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(mhpVar, obj3);
                }
                ((Map) obj3).put(kjnVar, obj2);
            }
            Map map2 = (Map) obj2;
            Iterator it = W().a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return f;
    }

    @Override // defpackage.z6, defpackage.tq5
    public void b(mhp mhpVar) {
        Set i;
        mhpVar.getClass();
        x3f x3fVar = this.c;
        if (c3x.K(x3fVar, mhpVar) || (mhpVar.a() instanceof igm)) {
            return;
        }
        c3x.O(x3fVar, mhpVar);
        if (this.e.i) {
            Set J = gld.J(mhpVar);
            ozw ozwVar = x3fVar.c;
            kjn kjnVar = c3x.g;
            ozwVar.getClass();
            Map map = (Map) ((ConcurrentHashMap) ozwVar.b).get(mhpVar);
            Object obj = map != null ? map.get(kjnVar) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set keySet = map2 != null ? map2.keySet() : null;
            if (keySet == null) {
                keySet = q5b.a;
            }
            i = wop.i(J, keySet);
        } else {
            i = gld.J(mhpVar);
        }
        for (String str : W().a.keySet()) {
            if (!i.contains(str) && !Intrinsics.d(str, this.d)) {
                StringBuilder u = ouj.u("Encountered an unknown key '", str, "' at element: ");
                u.append(Y());
                u.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                u.append((Object) ghh.z(-1, W().toString()));
                throw ghh.i(-1, u.toString());
            }
        }
    }

    @Override // defpackage.z6
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public q5f W() {
        return this.f;
    }

    @Override // defpackage.z6, defpackage.eg7
    public final tq5 c(mhp mhpVar) {
        mhpVar.getClass();
        mhp mhpVar2 = this.g;
        if (mhpVar != mhpVar2) {
            return super.c(mhpVar);
        }
        w4f J = J();
        String i = mhpVar2.i();
        if (J instanceof q5f) {
            return new f7f(this.c, (q5f) J, this.d, mhpVar2);
        }
        throw ghh.j("Expected " + ern.a(q5f.class).h() + ", but had " + ern.a(J.getClass()).h() + " as the serialized body of " + i + " at element: " + Y(), J.toString(), -1);
    }

    public final boolean c0(mhp mhpVar, int i) {
        boolean z = (this.c.a.e || mhpVar.j(i) || !mhpVar.h(i).c()) ? false : true;
        this.i = z;
        return z;
    }

    @Override // defpackage.tq5
    public int w(mhp mhpVar) {
        mhpVar.getClass();
        while (this.h < mhpVar.e()) {
            int i = this.h;
            this.h = i + 1;
            String V = V(mhpVar, i);
            int i2 = this.h - 1;
            this.i = false;
            if (W().containsKey(V) || c0(mhpVar, i2)) {
                if (this.e.g) {
                    boolean j = mhpVar.j(i2);
                    mhp h = mhpVar.h(i2);
                    if (!j || h.c() || !(((w4f) W().get(V)) instanceof m5f)) {
                        if (Intrinsics.d(h.a(), thp.b) && (!h.c() || !(((w4f) W().get(V)) instanceof m5f))) {
                            w4f w4fVar = (w4f) W().get(V);
                            String str = null;
                            v6f v6fVar = w4fVar instanceof v6f ? (v6f) w4fVar : null;
                            if (v6fVar != null) {
                                ome omeVar = x4f.a;
                                if (!(v6fVar instanceof m5f)) {
                                    str = v6fVar.a();
                                }
                            }
                            if (str != null) {
                                x3f x3fVar = this.c;
                                int I = c3x.I(h, x3fVar, str);
                                boolean z = !x3fVar.a.e && h.c();
                                if (I == -3 && ((j || z) && !c0(mhpVar, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    public /* synthetic */ f7f(x3f x3fVar, q5f q5fVar, String str, int i) {
        this(x3fVar, q5fVar, (i & 4) != 0 ? null : str, (mhp) null);
    }
}
