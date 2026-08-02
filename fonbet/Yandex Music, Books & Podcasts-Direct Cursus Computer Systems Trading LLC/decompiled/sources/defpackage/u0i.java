package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class u0i extends s4k {
    public final /* synthetic */ int b = 1;
    public final String c;
    public final String d;
    public final jyr e;
    public final int f;
    public final Function1 g;
    public final Function0 h;

    public u0i(String str, String str2, lhd lhdVar, y0i y0iVar) {
        str.getClass();
        this.c = str;
        this.d = str2;
        this.g = lhdVar;
        this.h = y0iVar;
        this.e = l18.b.b(hag.I(k2i.class), true);
        this.f = 25;
    }

    @Override // defpackage.s4k
    public final Object c(t4k t4kVar) {
        switch (this.b) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    @Override // defpackage.s4k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(o4k o4kVar, cg6 cg6Var) {
        t0i t0iVar;
        int i;
        ap0 ap0Var;
        rj6 rj6Var;
        a2i a2iVar;
        int i2;
        ap0 ap0Var2;
        rj6 rj6Var2;
        switch (this.b) {
            case 0:
                if (cg6Var instanceof t0i) {
                    t0iVar = (t0i) cg6Var;
                    int i3 = t0iVar.m;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        t0iVar.m = i3 - Integer.MIN_VALUE;
                        t0i t0iVar2 = t0iVar;
                        Object obj = t0iVar2.k;
                        nm6 nm6Var = nm6.a;
                        i = t0iVar2.m;
                        if (i != 0) {
                            qgg.h0(obj);
                            Integer num = (Integer) o4kVar.a();
                            ap0 ap0Var3 = new ap0(num != null ? num.intValue() : 0, this.f);
                            k2i k2iVar = (k2i) this.e.getValue();
                            t0iVar2.j = ap0Var3;
                            t0iVar2.m = 1;
                            obj = k2iVar.a(this.c, this.d, ap0Var3, "week", t0iVar2);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            ap0Var = ap0Var3;
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ap0Var = t0iVar2.j;
                            qgg.h0(obj);
                        }
                        rj6Var = (rj6) obj;
                        if (rj6Var instanceof qj6) {
                            if (rj6Var instanceof pj6) {
                                ((y0i) this.h).invoke();
                                return new p4k(((pj6) rj6Var).a());
                            }
                            b6e.s();
                            return null;
                        }
                        o0i o0iVar = (o0i) ((qj6) rj6Var).a;
                        List list = o0iVar.c;
                        ((lhd) this.g).invoke(o0iVar.e);
                        Integer a = ap0Var.a();
                        if (list.isEmpty()) {
                            a = null;
                        }
                        return new q4k(list, a);
                    }
                }
                t0iVar = new t0i(this, cg6Var);
                t0i t0iVar22 = t0iVar;
                Object obj2 = t0iVar22.k;
                nm6 nm6Var2 = nm6.a;
                i = t0iVar22.m;
                if (i != 0) {
                }
                rj6Var = (rj6) obj2;
                if (rj6Var instanceof qj6) {
                }
            default:
                if (cg6Var instanceof a2i) {
                    a2iVar = (a2i) cg6Var;
                    int i4 = a2iVar.m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        a2iVar.m = i4 - Integer.MIN_VALUE;
                        Object obj3 = a2iVar.k;
                        nm6 nm6Var3 = nm6.a;
                        i2 = a2iVar.m;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            Integer num2 = (Integer) o4kVar.a();
                            ap0 ap0Var4 = new ap0(num2 != null ? num2.intValue() : 0, this.f);
                            k2i k2iVar2 = (k2i) this.e.getValue();
                            a2iVar.j = ap0Var4;
                            a2iVar.m = 1;
                            Object c = k2iVar2.c(this.c, this.d, ap0Var4, a2iVar);
                            if (c == nm6Var3) {
                                return nm6Var3;
                            }
                            obj3 = c;
                            ap0Var2 = ap0Var4;
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ap0Var2 = a2iVar.j;
                            qgg.h0(obj3);
                        }
                        rj6Var2 = (rj6) obj3;
                        if (rj6Var2 instanceof qj6) {
                            if (rj6Var2 instanceof pj6) {
                                ((e2i) this.h).invoke();
                                return new p4k(((pj6) rj6Var2).a());
                            }
                            b6e.s();
                            return null;
                        }
                        o0i o0iVar2 = (o0i) ((qj6) rj6Var2).a;
                        List list2 = o0iVar2.b;
                        ((lhd) this.g).invoke(o0iVar2.e);
                        Integer a2 = ap0Var2.a();
                        if (list2.isEmpty()) {
                            a2 = null;
                        }
                        return new q4k(list2, a2);
                    }
                }
                a2iVar = new a2i(this, cg6Var);
                Object obj32 = a2iVar.k;
                nm6 nm6Var32 = nm6.a;
                i2 = a2iVar.m;
                if (i2 != 0) {
                }
                rj6Var2 = (rj6) obj32;
                if (rj6Var2 instanceof qj6) {
                }
        }
    }

    public u0i(String str, String str2, lhd lhdVar, e2i e2iVar) {
        str.getClass();
        this.c = str;
        this.d = str2;
        this.g = lhdVar;
        this.h = e2iVar;
        this.e = l18.b.b(hag.I(k2i.class), true);
        this.f = 25;
    }
}
