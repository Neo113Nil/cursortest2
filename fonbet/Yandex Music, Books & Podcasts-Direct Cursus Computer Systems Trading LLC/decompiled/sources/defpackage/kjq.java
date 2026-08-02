package defpackage;

import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class kjq extends qp7 {
    public final s63 d;
    public final hjq e;
    public final q43 f;
    public final djq g;
    public final xdr h;
    public final String i;

    public kjq(s63 s63Var, hjq hjqVar, q43 q43Var) {
        this.d = s63Var;
        this.e = hjqVar;
        this.f = q43Var;
        djq djqVar = (djq) s63Var.a;
        this.g = djqVar;
        this.h = ydr.a(new mjq(true, djqVar.f()));
        this.i = "Skeleton:SimplePlaylistBlock";
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.g;
    }

    @Override // defpackage.qp7
    public final boolean m() {
        return this.h.getValue() instanceof njq;
    }

    @Override // defpackage.qp7
    public final String n() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.qp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        jjq jjqVar;
        int i;
        rj6 rj6Var;
        String str;
        String e;
        if (cg6Var instanceof jjq) {
            jjqVar = (jjq) cg6Var;
            int i2 = jjqVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jjqVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jjqVar.j;
                nm6 nm6Var = nm6.a;
                i = jjqVar.l;
                xdr xdrVar = this.h;
                djq djqVar = this.g;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!m()) {
                        mjq mjqVar = new mjq(true, djqVar.f());
                        xdrVar.getClass();
                        xdrVar.m(null, mjqVar);
                    }
                    jjqVar.l = 1;
                    obj = this.e.d(djqVar, z, jjqVar);
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
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!m()) {
                        mjq mjqVar2 = new mjq(false, djqVar.f());
                        xdrVar.getClass();
                        xdrVar.m(null, mjqVar2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(djqVar);
                }
                String str2 = djqVar.d;
                String str3 = djqVar.e;
                ljq ljqVar = (ljq) ((qj6) rj6Var).a;
                eul eulVar = ljqVar.a;
                int ordinal = djqVar.c.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        u9b u9bVar = ljqVar.a.d;
                        if (u9bVar != null) {
                            e = u9bVar.e(wct.s(), WebPath$Storage.AVATARS);
                            str = e;
                        }
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        u9b u9bVar2 = ljqVar.b;
                        if (u9bVar2 != null) {
                            e = u9bVar2.e(wct.s(), WebPath$Storage.AVATARS);
                            str = e;
                        }
                    }
                    njq njqVar = new njq(eulVar, str2, str3, str, ljqVar.c);
                    xdrVar.getClass();
                    xdrVar.m(null, njqVar);
                    q43 q43Var = this.f;
                    q43Var.b(q43Var.a, 1, null, null);
                    return new d73(djqVar);
                }
                str = null;
                njq njqVar2 = new njq(eulVar, str2, str3, str, ljqVar.c);
                xdrVar.getClass();
                xdrVar.m(null, njqVar2);
                q43 q43Var2 = this.f;
                q43Var2.b(q43Var2.a, 1, null, null);
                return new d73(djqVar);
            }
        }
        jjqVar = new jjq(this, cg6Var);
        Object obj2 = jjqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jjqVar.l;
        xdr xdrVar2 = this.h;
        djq djqVar2 = this.g;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
