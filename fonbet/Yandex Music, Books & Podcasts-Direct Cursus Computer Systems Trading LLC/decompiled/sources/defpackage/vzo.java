package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class vzo {
    public final v2p a;
    public final g5p b;
    public final rw5 c;

    public vzo(v2p v2pVar, g5p g5pVar, rw5 rw5Var) {
        this.a = v2pVar;
        this.b = g5pVar;
        this.c = rw5Var;
    }

    public static /* synthetic */ Object c(vzo vzoVar, i8q i8qVar, int i, boolean z, cg6 cg6Var, int i2) {
        rzo rzoVar = rzo.b;
        if ((i2 & 4) != 0) {
            rzoVar = rzo.a;
        }
        return vzoVar.b(i8qVar, i, rzoVar, z, cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        szo szoVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof szo) {
            szoVar = (szo) cg6Var;
            int i2 = szoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                szoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = szoVar.j;
                nm6 nm6Var = nm6.a;
                i = szoVar.l;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    szoVar.l = 1;
                    obj = this.a.a(szoVar);
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
                if (!(rj6Var instanceof qj6)) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(3, "Search:Center", "Error get search history", ((pj6) rj6Var).a());
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        szoVar = new szo(this, cg6Var);
        Object obj2 = szoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = szoVar.l;
        boolean z2 = true;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(i8q i8qVar, int i, rzo rzoVar, boolean z, cg6 cg6Var) {
        tzo tzoVar;
        int i2;
        rj6 rj6Var;
        if (cg6Var instanceof tzo) {
            tzoVar = (tzo) cg6Var;
            int i3 = tzoVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tzoVar.l = i3 - Integer.MIN_VALUE;
                tzo tzoVar2 = tzoVar;
                Object obj = tzoVar2.j;
                nm6 nm6Var = nm6.a;
                i2 = tzoVar2.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    String str = i8qVar.a;
                    boolean z2 = i8qVar.b;
                    c0p c0pVar = i8qVar.c;
                    String str2 = i8qVar.d;
                    String str3 = i8qVar.e;
                    Long a = this.c.a();
                    String valueOf = a != null ? String.valueOf(a.longValue()) : null;
                    tzoVar2.l = 1;
                    obj = this.b.a(str, z2, c0pVar, str2, str3, i, rzoVar, z, valueOf, tzoVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return (k8q) ((qj6) rj6Var).a;
                }
                if (rj6Var instanceof pj6) {
                    return null;
                }
                b6e.s();
                return null;
            }
        }
        tzoVar = new tzo(this, cg6Var);
        tzo tzoVar22 = tzoVar;
        Object obj2 = tzoVar22.j;
        nm6 nm6Var2 = nm6.a;
        i2 = tzoVar22.l;
        if (i2 != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(c0p c0pVar, qzo qzoVar, cg6 cg6Var) {
        uzo uzoVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof uzo) {
            uzoVar = (uzo) cg6Var;
            int i2 = uzoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uzoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = uzoVar.j;
                nm6 nm6Var = nm6.a;
                i = uzoVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    uzoVar.l = 1;
                    obj = this.a.b(c0pVar, qzoVar, uzoVar);
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
                if (!(rj6Var instanceof qj6)) {
                    return (List) ((qj6) rj6Var).a;
                }
                if (rj6Var instanceof pj6) {
                    ssg.a(3, "Search:Center", "Error get search history", ((pj6) rj6Var).a());
                    return null;
                }
                b6e.s();
                return null;
            }
        }
        uzoVar = new uzo(this, cg6Var);
        Object obj2 = uzoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = uzoVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }
}
