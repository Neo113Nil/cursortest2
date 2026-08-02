package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class p8 implements t9f {
    public t9f a(tq5 tq5Var, String str) {
        uhp a = tq5Var.a();
        f9f c = c();
        a.getClass();
        c.getClass();
        Map map = (Map) a.d.get(c);
        t9f t9fVar = map != null ? (t9f) map.get(str) : null;
        if (!(t9fVar instanceof t9f)) {
            t9fVar = null;
        }
        if (t9fVar != null) {
            return t9fVar;
        }
        Object obj = a.e.get(c);
        Function1 function1 = wct.D(1, obj) ? (Function1) obj : null;
        if (function1 != null) {
            return (t9f) function1.invoke(str);
        }
        return null;
    }

    public t9f b(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        obj.getClass();
        return l6bVar.a().c(c(), obj);
    }

    public abstract f9f c();

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        Object obj;
        eg7Var.getClass();
        mhp descriptor = getDescriptor();
        tq5 c = eg7Var.c(descriptor);
        xqn xqnVar = new xqn();
        if (c.m()) {
            obj = c.z(getDescriptor(), 1, hyf.C(this, c, c.g(getDescriptor(), 0)), null);
        } else {
            Object obj2 = null;
            while (true) {
                int w = c.w(getDescriptor());
                if (w != -1) {
                    if (w != 0) {
                        Object obj3 = xqnVar.a;
                        if (w != 1) {
                            StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                            String str = (String) obj3;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(w);
                            throw new zhp(sb.toString());
                        }
                        if (obj3 == null) {
                            xq0.x("Cannot read polymorphic value before its type token");
                            return null;
                        }
                        xqnVar.a = obj3;
                        obj2 = c.z(getDescriptor(), w, hyf.C(this, c, (String) obj3), null);
                    } else {
                        xqnVar.a = c.g(getDescriptor(), w);
                    }
                } else {
                    if (obj2 == null) {
                        l1j.p((String) xqnVar.a, "Polymorphic value has not been read for class ");
                        return null;
                    }
                    obj = obj2;
                }
            }
        }
        c.b(descriptor);
        return obj;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        obj.getClass();
        t9f D = hyf.D(this, l6bVar, obj);
        mhp descriptor = getDescriptor();
        wq5 c = l6bVar.c(descriptor);
        c.p(getDescriptor(), 0, D.getDescriptor().i());
        c.k(getDescriptor(), 1, D, obj);
        c.b(descriptor);
    }
}
