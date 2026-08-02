package defpackage;

import com.yandex.music.databases.user.UserDatabase;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class p5l {
    public final dst a;

    public p5l(dst dstVar) {
        this.a = dstVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        m5l m5lVar;
        int i;
        if (cg6Var instanceof m5l) {
            m5lVar = (m5l) cg6Var;
            int i2 = m5lVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m5lVar.l = i2 - Integer.MIN_VALUE;
                Object obj = m5lVar.j;
                nm6 nm6Var = nm6.a;
                i = m5lVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    m5lVar.l = 1;
                    obj = this.a.b(str, m5lVar);
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
                return ((UserDatabase) obj).A();
            }
        }
        m5lVar = new m5l(this, cg6Var);
        Object obj2 = m5lVar.j;
        nm6 nm6Var2 = nm6.a;
        i = m5lVar.l;
        if (i != 0) {
        }
        return ((UserDatabase) obj2).A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, cg6 cg6Var) {
        n5l n5lVar;
        int i;
        if (cg6Var instanceof n5l) {
            n5lVar = (n5l) cg6Var;
            int i2 = n5lVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n5lVar.m = i2 - Integer.MIN_VALUE;
                Object obj = n5lVar.k;
                Object obj2 = nm6.a;
                i = n5lVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    n5lVar.j = str2;
                    n5lVar.m = 1;
                    obj = a(str, n5lVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        l5l l5lVar = (l5l) obj;
                        if (l5lVar != null) {
                            return new kzs(l5lVar.a, l5lVar.b);
                        }
                        return null;
                    }
                    str2 = n5lVar.j;
                    qgg.h0(obj);
                }
                n5lVar.j = null;
                n5lVar.m = 2;
                obj = up6.G(((k5l) obj).a, true, false, new q1h(str2, 11), n5lVar);
            }
        }
        n5lVar = new n5l(this, cg6Var);
        Object obj3 = n5lVar.k;
        Object obj22 = nm6.a;
        i = n5lVar.m;
        if (i != 0) {
        }
        n5lVar.j = null;
        n5lVar.m = 2;
        obj3 = up6.G(((k5l) obj3).a, true, false, new q1h(str2, 11), n5lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, kzs kzsVar, cg6 cg6Var) {
        o5l o5lVar;
        Object obj;
        int i;
        Object G;
        if (cg6Var instanceof o5l) {
            o5lVar = (o5l) cg6Var;
            int i2 = o5lVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o5lVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = o5lVar.k;
                obj = nm6.a;
                i = o5lVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    o5lVar.j = kzsVar;
                    o5lVar.m = 1;
                    obj2 = a(str, o5lVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kzsVar = o5lVar.j;
                    qgg.h0(obj2);
                }
                k5l k5lVar = (k5l) obj2;
                l5l l5lVar = new l5l(kzsVar.a, kzsVar.b);
                o5lVar.j = null;
                o5lVar.m = 2;
                G = up6.G(k5lVar.a, false, true, new avi(14, k5lVar, l5lVar), o5lVar);
                if (G != obj) {
                    G = Unit.a;
                }
            }
        }
        o5lVar = new o5l(this, cg6Var);
        Object obj22 = o5lVar.k;
        obj = nm6.a;
        i = o5lVar.m;
        if (i != 0) {
        }
        k5l k5lVar2 = (k5l) obj22;
        l5l l5lVar2 = new l5l(kzsVar.a, kzsVar.b);
        o5lVar.j = null;
        o5lVar.m = 2;
        G = up6.G(k5lVar2.a, false, true, new avi(14, k5lVar2, l5lVar2), o5lVar);
        if (G != obj) {
        }
    }
}
