package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class p2d {
    public final jyr a;
    public final jyr b;

    public p2d(jyr jyrVar, jyr jyrVar2) {
        this.a = jyrVar;
        this.b = jyrVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        i2d i2dVar;
        int i;
        if (cg6Var instanceof i2d) {
            i2dVar = (i2d) cg6Var;
            int i2 = i2dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i2dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = i2dVar.j;
                nm6 nm6Var = nm6.a;
                i = i2dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    bca bcaVar = new bca(((dc7) ((cc7) this.a.getValue())).c(str, "gdpr_storage").getData(), 25);
                    i2dVar.l = 1;
                    obj = zsd.i0(bcaVar, i2dVar);
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
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        i2dVar = new i2d(this, cg6Var);
        Object obj2 = i2dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = i2dVar.l;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        k2d k2dVar;
        int i;
        if (cg6Var instanceof k2d) {
            k2dVar = (k2d) cg6Var;
            int i2 = k2dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k2dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = k2dVar.j;
                nm6 nm6Var = nm6.a;
                i = k2dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    bca bcaVar = new bca(((dc7) ((cc7) this.a.getValue())).b("gdpr_storage").getData(), 26);
                    k2dVar.l = 1;
                    obj = zsd.i0(bcaVar, k2dVar);
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
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        k2dVar = new k2d(this, cg6Var);
        Object obj2 = k2dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = k2dVar.l;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a8, code lost:
    
        if (r10 != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        m2d m2dVar;
        nm6 nm6Var;
        int i;
        int i2;
        xxq xxqVar;
        jyr jyrVar;
        Continuation continuation;
        Object a;
        if (cg6Var instanceof m2d) {
            m2dVar = (m2d) cg6Var;
            int i3 = m2dVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m2dVar.l = i3 - Integer.MIN_VALUE;
                Object obj = m2dVar.j;
                nm6Var = nm6.a;
                i = m2dVar.l;
                i2 = 2;
                if (i != 0) {
                    qgg.h0(obj);
                    m2dVar.l = 1;
                    obj = zsd.i0(((frt) this.b.getValue()).g(), m2dVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xxqVar = (xxq) obj;
                jyrVar = this.a;
                continuation = null;
                if (xxqVar == null && xxqVar.a()) {
                    String str = xxqVar.a;
                    m2dVar.l = 2;
                    Object a2 = lmm.a(((dc7) ((cc7) jyrVar.getValue())).c(str, "gdpr_storage"), new xc(i2, 18, continuation), m2dVar);
                    if (a2 != nm6Var) {
                        a2 = Unit.a;
                    }
                } else {
                    m2dVar.l = 3;
                    a = lmm.a(((dc7) ((cc7) jyrVar.getValue())).b("gdpr_storage"), new xc(i2, 19, continuation), m2dVar);
                    if (a != nm6Var) {
                        a = Unit.a;
                    }
                }
                return nm6Var;
            }
        }
        m2dVar = new m2d(this, cg6Var);
        Object obj2 = m2dVar.j;
        nm6Var = nm6.a;
        i = m2dVar.l;
        i2 = 2;
        if (i != 0) {
        }
        xxqVar = (xxq) obj2;
        jyrVar = this.a;
        continuation = null;
        if (xxqVar == null) {
        }
        m2dVar.l = 3;
        a = lmm.a(((dc7) ((cc7) jyrVar.getValue())).b("gdpr_storage"), new xc(i2, 19, continuation), m2dVar);
        if (a != nm6Var) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x010f, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.a, r1) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        if (r15 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0072, code lost:
    
        if (r15 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        o2d o2dVar;
        Object obj;
        int i;
        Object i0;
        xxq xxqVar;
        String str;
        Object b;
        String str2;
        Object a;
        String str3;
        xxq xxqVar2;
        if (cg6Var instanceof o2d) {
            o2dVar = (o2d) cg6Var;
            int i2 = o2dVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o2dVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = o2dVar.m;
                obj = nm6.a;
                i = o2dVar.o;
                jyr jyrVar = this.a;
                boolean z = false;
                if (i != 0) {
                    qgg.h0(obj2);
                    o2dVar.o = 1;
                    obj2 = zsd.i0(((frt) this.b.getValue()).g(), o2dVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            xxqVar = o2dVar.j;
                            qgg.h0(obj2);
                            str = (String) obj2;
                            if (xxqVar == null && xxqVar.a()) {
                                if (str == null) {
                                    String str4 = xxqVar.a;
                                    o2dVar.j = xxqVar;
                                    o2dVar.k = null;
                                    o2dVar.o = 3;
                                    Object a2 = lmm.a(((dc7) ((cc7) jyrVar.getValue())).b("gdpr_storage"), new n2d(this, str4, null), o2dVar);
                                    if (a2 != obj) {
                                        a2 = Unit.a;
                                    }
                                }
                                String str5 = xxqVar.a;
                                o2dVar.j = xxqVar;
                                o2dVar.k = null;
                                o2dVar.l = str;
                                o2dVar.o = 4;
                                a = a(str5, o2dVar);
                                if (a != obj) {
                                }
                            } else {
                                o2dVar.j = null;
                                o2dVar.k = str;
                                o2dVar.o = 5;
                                b = b(o2dVar);
                                if (b != obj) {
                                    str2 = str;
                                    obj2 = b;
                                    if (!((Boolean) obj2).booleanValue()) {
                                    }
                                    z = true;
                                    return Boolean.valueOf(z);
                                }
                            }
                            return obj;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                str3 = o2dVar.l;
                                xxqVar2 = o2dVar.j;
                                qgg.h0(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                }
                                z = true;
                                return Boolean.valueOf(z);
                            }
                            if (i != 5) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str2 = o2dVar.k;
                            qgg.h0(obj2);
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            z = true;
                            return Boolean.valueOf(z);
                        }
                        xxqVar = o2dVar.j;
                        qgg.h0(obj2);
                        str = xxqVar.a;
                        String str52 = xxqVar.a;
                        o2dVar.j = xxqVar;
                        o2dVar.k = null;
                        o2dVar.l = str;
                        o2dVar.o = 4;
                        a = a(str52, o2dVar);
                        if (a != obj) {
                            str3 = str;
                            obj2 = a;
                            xxqVar2 = xxqVar;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            z = true;
                            return Boolean.valueOf(z);
                        }
                        return obj;
                    }
                    qgg.h0(obj2);
                }
                xxq xxqVar3 = (xxq) obj2;
                o2dVar.j = xxqVar3;
                o2dVar.o = 2;
                i0 = zsd.i0(new ub7(19, ((dc7) ((cc7) jyrVar.getValue())).b("gdpr_storage").getData(), this), o2dVar);
                if (i0 != obj) {
                    xxqVar = xxqVar3;
                    obj2 = i0;
                    str = (String) obj2;
                    if (xxqVar == null) {
                    }
                    o2dVar.j = null;
                    o2dVar.k = str;
                    o2dVar.o = 5;
                    b = b(o2dVar);
                    if (b != obj) {
                    }
                }
                return obj;
            }
        }
        o2dVar = new o2d(this, cg6Var);
        Object obj22 = o2dVar.m;
        obj = nm6.a;
        i = o2dVar.o;
        jyr jyrVar2 = this.a;
        boolean z2 = false;
        if (i != 0) {
        }
        xxq xxqVar32 = (xxq) obj22;
        o2dVar.j = xxqVar32;
        o2dVar.o = 2;
        i0 = zsd.i0(new ub7(19, ((dc7) ((cc7) jyrVar2.getValue())).b("gdpr_storage").getData(), this), o2dVar);
        if (i0 != obj) {
        }
        return obj;
    }
}
