package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wo9 implements xfu {
    public final e23 a;
    public final pm9 b;
    public final yb8 c;
    public final w2s d;
    public final wh9 e;
    public vo9 f;

    public wo9(e23 e23Var, pm9 pm9Var, yb8 yb8Var, w2s w2sVar, wh9 wh9Var, vo9 vo9Var) {
        this.a = e23Var;
        this.b = pm9Var;
        this.c = yb8Var;
        this.d = w2sVar;
        this.e = wh9Var;
        this.f = vo9Var;
    }

    @Override // defpackage.xfu
    public final void b(int i) {
        this.c.c(i);
        e23 e23Var = this.a;
        gc8 gc8Var = e23Var.a;
        String str = gc8Var.getDataTag().a;
        pm9 pm9Var = this.b;
        String c = pm9Var.c();
        LinkedHashMap linkedHashMap = this.d.a;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new LinkedHashMap();
            linkedHashMap.put(str, obj);
        }
        ((Map) obj).put(c, Integer.valueOf(i));
        vo9 vo9Var = this.f;
        xzb xzbVar = e23Var.b;
        wh9 wh9Var = this.e;
        wh9Var.getClass();
        d0c i2 = gc8Var.getRuntimeStore$div_release().i(xzbVar);
        if (i2 == null) {
            return;
        }
        wh9Var.f(vo9Var, gc8Var, pm9Var, i2);
    }

    @Override // defpackage.xfu
    public final void c(int i) {
    }

    @Override // defpackage.xfu
    public final void a(int i, float f, int i2) {
    }
}
