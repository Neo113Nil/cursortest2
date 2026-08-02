package com.yandex.plus.home.datasource.local.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.rqi;
import defpackage.t9f;
import defpackage.x3f;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class j {
    public final String a;
    public final String b;
    public final t9f c;
    public final x3f d;
    public final kotlinx.coroutines.a e;
    public final SharedPreferences f;
    public final qqi g;
    public final LinkedHashMap h;

    public j(Context context, String str, String str2, t9f t9fVar, x3f x3fVar, kotlinx.coroutines.a aVar) {
        str2.getClass();
        t9fVar.getClass();
        x3fVar.getClass();
        aVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = t9fVar;
        this.d = x3fVar;
        this.e = aVar;
        this.f = context.getSharedPreferences(str, 0);
        this.g = rqi.a();
        this.h = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        b bVar;
        int i;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                Object obj2 = nm6.a;
                i = bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    bVar.l = 1;
                    Object c = c(null, bVar);
                    return c == obj2 ? obj2 : c;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return ((z7o) obj).a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj3 = bVar.j;
        Object obj22 = nm6.a;
        i = bVar.l;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        c cVar;
        int i;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                Object obj2 = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    cVar.l = 1;
                    Object c = c(str, cVar);
                    return c == obj2 ? obj2 : c;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return ((z7o) obj).a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj3 = cVar.j;
        Object obj22 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        d dVar;
        int i;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dVar.j;
                nm6 nm6Var = nm6.a;
                i = dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    e eVar = new e(this, str, null);
                    dVar.l = 1;
                    obj = x97.V(this.e, eVar, dVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((z7o) obj).a;
            }
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Object obj, cg6 cg6Var) {
        g gVar;
        int i;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = gVar.j;
                Object obj3 = nm6.a;
                i = gVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    gVar.l = 1;
                    Object f = f(str, obj, gVar);
                    return f == obj3 ? obj3 : f;
                }
                if (i == 1) {
                    qgg.h0(obj2);
                    return ((z7o) obj2).a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        gVar = new g(this, cg6Var);
        Object obj22 = gVar.j;
        Object obj32 = nm6.a;
        i = gVar.l;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, cg6 cg6Var) {
        f fVar;
        int i;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = fVar.j;
                Object obj3 = nm6.a;
                i = fVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    fVar.l = 1;
                    Object f = f(null, obj, fVar);
                    return f == obj3 ? obj3 : f;
                }
                if (i == 1) {
                    qgg.h0(obj2);
                    return ((z7o) obj2).a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        fVar = new f(this, cg6Var);
        Object obj22 = fVar.j;
        Object obj32 = nm6.a;
        i = fVar.l;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, Object obj, cg6 cg6Var) {
        h hVar;
        int i;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = hVar.j;
                nm6 nm6Var = nm6.a;
                i = hVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    i iVar = new i(obj, this, str, null);
                    hVar.l = 1;
                    obj2 = x97.V(this.e, iVar, hVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return ((z7o) obj2).a;
            }
        }
        hVar = new h(this, cg6Var);
        Object obj22 = hVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hVar.l;
        if (i != 0) {
        }
        return ((z7o) obj22).a;
    }
}
