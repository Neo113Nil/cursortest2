package defpackage;

/* loaded from: classes5.dex */
public abstract class k4f implements t9f {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public k4f(lm4 lm4Var) {
        this.b = lm4Var;
        this.c = avf.y("JsonContentPolymorphicSerializer<" + lm4Var.h() + '>', igm.c, new mhp[0]);
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj);

    public abstract t9f c(w4f w4fVar);

    public abstract Object d(Object obj, Object obj2);

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        Object d;
        switch (this.a) {
            case 0:
                eg7Var.getClass();
                s4f r = ltg.r(eg7Var);
                w4f f = r.f();
                t9f c = c(f);
                c.getClass();
                return r.d().a(c, f);
            default:
                Object obj = xv.j;
                t9f t9fVar = (t9f) this.c;
                t9f t9fVar2 = (t9f) this.b;
                eg7Var.getClass();
                mhp descriptor = getDescriptor();
                tq5 c2 = eg7Var.c(descriptor);
                if (c2.m()) {
                    d = d(c2.z(getDescriptor(), 0, t9fVar2, null), c2.z(getDescriptor(), 1, t9fVar, null));
                } else {
                    Object obj2 = obj;
                    Object obj3 = obj2;
                    while (true) {
                        int w = c2.w(getDescriptor());
                        if (w != -1) {
                            if (w == 0) {
                                obj2 = c2.z(getDescriptor(), 0, t9fVar2, null);
                            } else {
                                if (w != 1) {
                                    throw new zhp(k5r.i(w, "Invalid index: "));
                                }
                                obj3 = c2.z(getDescriptor(), 1, t9fVar, null);
                            }
                        } else {
                            if (obj2 == obj) {
                                throw new zhp("Element 'key' is missing");
                            }
                            if (obj3 == obj) {
                                throw new zhp("Element 'value' is missing");
                            }
                            d = d(obj2, obj3);
                        }
                    }
                }
                c2.b(descriptor);
                return d;
        }
    }

    @Override // defpackage.t9f
    public mhp getDescriptor() {
        return (ohp) this.c;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        int i = this.a;
        l6bVar.getClass();
        switch (i) {
            case 0:
                obj.getClass();
                uhp a = l6bVar.a();
                lm4 lm4Var = (lm4) this.b;
                t9f c = a.c(lm4Var, obj);
                if (c == null) {
                    t9f i0 = swf.i0(ern.a(obj.getClass()));
                    if (i0 == null) {
                        lm4 a2 = ern.a(obj.getClass());
                        String h = a2.h();
                        if (h == null) {
                            h = String.valueOf(a2);
                        }
                        throw new zhp(hrg.s("Class '", h, "' is not registered for polymorphic serialization ", "in the scope of '" + lm4Var.h() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
                    }
                    c = i0;
                }
                c.serialize(l6bVar, obj);
                return;
            default:
                wq5 c2 = l6bVar.c(getDescriptor());
                c2.k(getDescriptor(), 0, (t9f) this.b, a(obj));
                c2.k(getDescriptor(), 1, (t9f) this.c, b(obj));
                c2.b(getDescriptor());
                return;
        }
    }

    public k4f(t9f t9fVar, t9f t9fVar2) {
        this.b = t9fVar;
        this.c = t9fVar2;
    }
}
