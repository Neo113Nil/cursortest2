package defpackage;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class tnt {
    public final Context a;
    public final cut b;
    public final rtl c;

    public tnt(Context context, cut cutVar, rtl rtlVar) {
        this.a = context;
        this.b = cutVar;
        this.c = rtlVar;
    }

    public static Object c(rj6 rj6Var) {
        if (rj6Var instanceof pj6) {
            r7o r7oVar = z7o.b;
            return qgg.J(((pj6) rj6Var).a());
        }
        if (rj6Var instanceof qj6) {
            r7o r7oVar2 = z7o.b;
            return ((qj6) rj6Var).a;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, cg6 cg6Var) {
        pnt pntVar;
        int i;
        tnt tntVar;
        if (cg6Var instanceof pnt) {
            pntVar = (pnt) cg6Var;
            int i2 = pntVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pntVar.m = i2 - Integer.MIN_VALUE;
                Object obj = pntVar.k;
                nm6 nm6Var = nm6.a;
                i = pntVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    pntVar.j = this;
                    pntVar.m = 1;
                    obj = this.b.c(str, str2, pntVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    tntVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tntVar = pntVar.j;
                    qgg.h0(obj);
                }
                tntVar.getClass();
                return c((rj6) obj);
            }
        }
        pntVar = new pnt(this, cg6Var);
        Object obj2 = pntVar.k;
        nm6 nm6Var2 = nm6.a;
        i = pntVar.m;
        if (i != 0) {
        }
        tntVar.getClass();
        return c((rj6) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, a0g a0gVar, cg6 cg6Var) {
        qnt qntVar;
        int i;
        Object a;
        z7o z7oVar;
        z7o z7oVar2;
        if (cg6Var instanceof qnt) {
            qntVar = (qnt) cg6Var;
            int i2 = qntVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qntVar.n = i2 - Integer.MIN_VALUE;
                Object obj = qntVar.l;
                Object obj2 = nm6.a;
                i = qntVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (a0gVar instanceof dnt) {
                        Uri uri = ((dnt) a0gVar).a;
                        qntVar.n = 1;
                        a = e(str, str2, uri, qntVar);
                    } else if (a0gVar instanceof bnt) {
                        File file = ((bnt) a0gVar).a;
                        qntVar.n = 2;
                        a = d(str, str2, file, qntVar);
                    } else {
                        if (!(a0gVar instanceof cnt)) {
                            b6e.s();
                            return null;
                        }
                        qntVar.n = 3;
                        a = a(str, str2, qntVar);
                    }
                } else {
                    if (i != 1 && i != 2 && i != 3) {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z7oVar2 = qntVar.j;
                        qgg.h0(obj);
                        z7oVar = z7oVar2;
                        return z7oVar.a;
                    }
                    qgg.h0(obj);
                    a = ((z7o) obj).a;
                }
                z7oVar = new z7o(a);
                if (!(a instanceof t7o)) {
                    cvl cvlVar = (cvl) a;
                    String str3 = ((frt) l18.b.c(hag.I(frt.class))).c().a;
                    str3.getClass();
                    nvl g = cvlVar.g();
                    tn6 tn6Var = cvlVar.p;
                    qntVar.j = z7oVar;
                    qntVar.k = a;
                    qntVar.n = 4;
                    if (this.c.l(str3, g, tn6Var, qntVar) != obj2) {
                        z7oVar2 = z7oVar;
                        z7oVar = z7oVar2;
                    }
                    return obj2;
                }
                return z7oVar.a;
            }
        }
        qntVar = new qnt(this, cg6Var);
        Object obj3 = qntVar.l;
        Object obj22 = nm6.a;
        i = qntVar.n;
        if (i != 0) {
        }
        z7oVar = new z7o(a);
        if (!(a instanceof t7o)) {
        }
        return z7oVar.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, File file, cg6 cg6Var) {
        rnt rntVar;
        int i;
        tnt tntVar;
        File file2;
        try {
            if (cg6Var instanceof rnt) {
                rntVar = (rnt) cg6Var;
                int i2 = rntVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rntVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = rntVar.l;
                    nm6 nm6Var = nm6.a;
                    i = rntVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        Context context = this.a;
                        file.getClass();
                        File b0 = wdp.b0(context, wdp.k0(new ExifInterface(file.getAbsolutePath())), new eo6(file, 0), new eo6(file, 1));
                        cut cutVar = this.b;
                        rntVar.j = b0;
                        rntVar.k = this;
                        rntVar.n = 1;
                        obj = cutVar.q(str, str2, b0, rntVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        tntVar = this;
                        file2 = b0;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tntVar = rntVar.k;
                        file2 = rntVar.j;
                        qgg.h0(obj);
                    }
                    tntVar.getClass();
                    Object c = c((rj6) obj);
                    file2.delete();
                    return c;
                }
            }
            if (i != 0) {
            }
            tntVar.getClass();
            Object c2 = c((rj6) obj);
            file2.delete();
            return c2;
        } catch (IOException e) {
            r7o r7oVar = z7o.b;
            return new t7o(e);
        }
        rntVar = new rnt(this, cg6Var);
        Object obj2 = rntVar.l;
        nm6 nm6Var2 = nm6.a;
        i = rntVar.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, Uri uri, cg6 cg6Var) {
        snt sntVar;
        int i;
        tnt tntVar;
        File file;
        try {
            if (cg6Var instanceof snt) {
                sntVar = (snt) cg6Var;
                int i2 = sntVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sntVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = sntVar.l;
                    nm6 nm6Var = nm6.a;
                    i = sntVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        File c0 = wdp.c0(this.a, uri);
                        cut cutVar = this.b;
                        sntVar.j = c0;
                        sntVar.k = this;
                        sntVar.n = 1;
                        obj = cutVar.q(str, str2, c0, sntVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        tntVar = this;
                        file = c0;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tntVar = sntVar.k;
                        file = sntVar.j;
                        qgg.h0(obj);
                    }
                    tntVar.getClass();
                    Object c = c((rj6) obj);
                    file.delete();
                    return c;
                }
            }
            if (i != 0) {
            }
            tntVar.getClass();
            Object c2 = c((rj6) obj);
            file.delete();
            return c2;
        } catch (IOException e) {
            r7o r7oVar = z7o.b;
            return new t7o(e);
        }
        sntVar = new snt(this, cg6Var);
        Object obj2 = sntVar.l;
        nm6 nm6Var2 = nm6.a;
        i = sntVar.n;
    }
}
