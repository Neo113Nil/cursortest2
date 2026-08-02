package defpackage;

/* loaded from: classes.dex */
public final class u3k implements jic {
    public final s1r a;
    public final o3k b;

    public u3k(s1r s1rVar, o3k o3kVar) {
        this.a = s1rVar;
        this.b = o3kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.jic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rwo rwoVar, float f, cg6 cg6Var) {
        t3k t3kVar;
        int i;
        u3k u3kVar;
        o3k o3kVar;
        if (cg6Var instanceof t3k) {
            t3kVar = (t3k) cg6Var;
            int i2 = t3kVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t3kVar.m = i2 - Integer.MIN_VALUE;
                Object obj = t3kVar.k;
                nm6 nm6Var = nm6.a;
                i = t3kVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ybg ybgVar = new ybg(this, rwoVar);
                    t3kVar.j = this;
                    t3kVar.m = 1;
                    obj = this.a.d(rwoVar, f, ybgVar, t3kVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    u3kVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u3kVar = t3kVar.j;
                    qgg.h0(obj);
                }
                float floatValue = ((Number) obj).floatValue();
                o3kVar = u3kVar.b;
                if (o3kVar.k() != 0.0f && Math.abs(o3kVar.k()) < 0.001d) {
                    int j = o3kVar.j();
                    if (o3kVar.k.b()) {
                        x97.y(((y2k) o3kVar.p.getValue()).s, null, null, new t2k(2, o3kVar, null), 3);
                    }
                    o3kVar.w(0.0f, j, false);
                } else {
                    o3kVar.k();
                }
                return new Float(floatValue);
            }
        }
        t3kVar = new t3k(this, cg6Var);
        Object obj2 = t3kVar.k;
        nm6 nm6Var2 = nm6.a;
        i = t3kVar.m;
        if (i != 0) {
        }
        float floatValue2 = ((Number) obj2).floatValue();
        o3kVar = u3kVar.b;
        if (o3kVar.k() != 0.0f) {
            int j2 = o3kVar.j();
            if (o3kVar.k.b()) {
            }
            o3kVar.w(0.0f, j2, false);
            return new Float(floatValue2);
        }
        o3kVar.k();
        return new Float(floatValue2);
    }
}
