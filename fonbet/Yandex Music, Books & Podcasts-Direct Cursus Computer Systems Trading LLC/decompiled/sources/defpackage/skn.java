package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class skn implements cce {
    public final Context a;
    public final yp7 b;
    public final jyr c;
    public final jyr d;
    public final Object e;
    public final dce f;
    public final tf6 g;
    public final lum h;
    public final on5 i;
    public final ArrayList j;

    /* JADX WARN: Multi-variable type inference failed */
    public skn(Context context, yp7 yp7Var, jyr jyrVar, jyr jyrVar2, arf arfVar, on5 on5Var, dce dceVar) {
        Object n20Var;
        this.a = context;
        this.b = yp7Var;
        this.c = jyrVar;
        this.d = jyrVar2;
        this.e = arfVar;
        this.f = dceVar;
        wqr n = a4g.n();
        dq7 dq7Var = ca8.a;
        this.g = gld.e(e.c(n, j5h.a.g).plus(new b43(this)));
        czr czrVar = new czr(this);
        lum lumVar = new lum();
        lumVar.a = this;
        lumVar.b = czrVar;
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        char c = 1;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i < 26) {
            boolean z2 = e.a;
        } else if (!e.a) {
            n20Var = (i == 26 || i == 27) ? new h1b() : new n20(z);
            lumVar.c = n20Var;
            this.h = lumVar;
            dn9 dn9Var = new dn9(on5Var);
            dn9Var.h(new em3(2), u7e.class);
            int i3 = 5;
            dn9Var.h(new em3(i3), String.class);
            dn9Var.h(new em3(c == true ? 1 : 0), Uri.class);
            int i4 = 4;
            dn9Var.h(new em3(i4), Uri.class);
            int i5 = 3;
            dn9Var.h(new em3(i5), Integer.class);
            dn9Var.h(new em3(i2), byte[].class);
            fpt fptVar = new fpt();
            ArrayList arrayList = (ArrayList) dn9Var.d;
            arrayList.add(new Pair(fptVar, Uri.class));
            arrayList.add(new Pair(new aac(dceVar.a), File.class));
            dn9Var.i(new o7e(arfVar, jyrVar2, dceVar.c), Uri.class);
            dn9Var.i(new cr1(i3), File.class);
            dn9Var.i(new cr1(objArr2 == true ? 1 : 0), Uri.class);
            dn9Var.i(new cr1(i5), Uri.class);
            dn9Var.i(new cr1(6), Uri.class);
            dn9Var.i(new cr1(i4), Drawable.class);
            dn9Var.i(new cr1(1), Bitmap.class);
            dn9Var.i(new cr1(2), ByteBuffer.class);
            e33 e33Var = new e33(dceVar.d, dceVar.e);
            ArrayList arrayList2 = (ArrayList) dn9Var.f;
            arrayList2.add(e33Var);
            List L = xee.L((ArrayList) dn9Var.b);
            this.i = new on5(L, xee.L((ArrayList) dn9Var.c), xee.L(arrayList), xee.L((ArrayList) dn9Var.e), xee.L(arrayList2));
            this.j = CollectionsKt.h0(L, new c8b(this, czrVar, lumVar));
            new AtomicBoolean(false);
        }
        n20Var = new n20(objArr == true ? 1 : 0);
        lumVar.c = n20Var;
        this.h = lumVar;
        dn9 dn9Var2 = new dn9(on5Var);
        dn9Var2.h(new em3(2), u7e.class);
        int i32 = 5;
        dn9Var2.h(new em3(i32), String.class);
        dn9Var2.h(new em3(c == true ? 1 : 0), Uri.class);
        int i42 = 4;
        dn9Var2.h(new em3(i42), Uri.class);
        int i52 = 3;
        dn9Var2.h(new em3(i52), Integer.class);
        dn9Var2.h(new em3(i2), byte[].class);
        fpt fptVar2 = new fpt();
        ArrayList arrayList3 = (ArrayList) dn9Var2.d;
        arrayList3.add(new Pair(fptVar2, Uri.class));
        arrayList3.add(new Pair(new aac(dceVar.a), File.class));
        dn9Var2.i(new o7e(arfVar, jyrVar2, dceVar.c), Uri.class);
        dn9Var2.i(new cr1(i32), File.class);
        dn9Var2.i(new cr1(objArr2 == true ? 1 : 0), Uri.class);
        dn9Var2.i(new cr1(i52), Uri.class);
        dn9Var2.i(new cr1(6), Uri.class);
        dn9Var2.i(new cr1(i42), Drawable.class);
        dn9Var2.i(new cr1(1), Bitmap.class);
        dn9Var2.i(new cr1(2), ByteBuffer.class);
        e33 e33Var2 = new e33(dceVar.d, dceVar.e);
        ArrayList arrayList22 = (ArrayList) dn9Var2.f;
        arrayList22.add(e33Var2);
        List L2 = xee.L((ArrayList) dn9Var2.b);
        this.i = new on5(L2, xee.L((ArrayList) dn9Var2.c), xee.L(arrayList3), xee.L((ArrayList) dn9Var2.e), xee.L(arrayList22));
        this.j = CollectionsKt.h0(L2, new c8b(this, czrVar, lumVar));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0155, code lost:
    
        if (r5 != null) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2 A[Catch: all -> 0x00d9, TryCatch #5 {all -> 0x00d9, blocks: (B:24:0x00dc, B:26:0x00e2, B:27:0x00e5, B:29:0x00f3, B:30:0x00f6, B:15:0x00bb, B:17:0x00c1, B:19:0x00c6, B:80:0x0199, B:81:0x01a0), top: B:14:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3 A[Catch: all -> 0x00d9, TryCatch #5 {all -> 0x00d9, blocks: (B:24:0x00dc, B:26:0x00e2, B:27:0x00e5, B:29:0x00f3, B:30:0x00f6, B:15:0x00bb, B:17:0x00c1, B:19:0x00c6, B:80:0x0199, B:81:0x01a0), top: B:14:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145 A[Catch: all -> 0x017d, TryCatch #6 {all -> 0x017d, blocks: (B:41:0x013f, B:43:0x0145, B:46:0x0157, B:47:0x016f, B:49:0x0176, B:52:0x015b, B:55:0x0169, B:56:0x017f, B:58:0x0183), top: B:40:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0176 A[Catch: all -> 0x017d, TryCatch #6 {all -> 0x017d, blocks: (B:41:0x013f, B:43:0x0145, B:46:0x0157, B:47:0x016f, B:49:0x0176, B:52:0x015b, B:55:0x0169, B:56:0x017f, B:58:0x0183), top: B:40:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017f A[Catch: all -> 0x017d, TryCatch #6 {all -> 0x017d, blocks: (B:41:0x013f, B:43:0x0145, B:46:0x0157, B:47:0x016f, B:49:0x0176, B:52:0x015b, B:55:0x0169, B:56:0x017f, B:58:0x0183), top: B:40:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a5 A[Catch: all -> 0x01b7, TRY_LEAVE, TryCatch #4 {all -> 0x01b7, blocks: (B:64:0x01a1, B:66:0x01a5, B:69:0x01b9, B:70:0x01c1), top: B:63:0x01a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b9 A[Catch: all -> 0x01b7, TRY_ENTER, TryCatch #4 {all -> 0x01b7, blocks: (B:64:0x01a1, B:66:0x01a5, B:69:0x01b9, B:70:0x01c1), top: B:63:0x01a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0077  */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [hib, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [rce] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6, types: [q0o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(skn sknVar, rce rceVar, int i, cg6 cg6Var) {
        rkn rknVar;
        nm6 nm6Var;
        int i2;
        ?? r2;
        hib hibVar;
        ?? r3;
        ?? r4;
        Bitmap bitmap;
        hib hibVar2;
        rce rceVar2;
        q0o q0oVar;
        skn sknVar2;
        hib hibVar3;
        q0o q0oVar2;
        rce rceVar3;
        hib hibVar4;
        q0o q0oVar3;
        rce rceVar4;
        sce sceVar;
        qce qceVar;
        hib hibVar5;
        Object V;
        q0o q0oVar4;
        rce rceVar5;
        i6s i6sVar;
        Object s;
        skn sknVar3 = sknVar;
        rce rceVar6 = rceVar;
        if (cg6Var instanceof rkn) {
            rknVar = (rkn) cg6Var;
            int i3 = rknVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rknVar.q = i3 - Integer.MIN_VALUE;
                rkn rknVar2 = rknVar;
                Object obj = rknVar2.o;
                nm6Var = nm6.a;
                i2 = rknVar2.q;
                if (i2 == 0) {
                    try {
                        if (i2 == 1) {
                            hib hibVar6 = rknVar2.m;
                            rce rceVar7 = rknVar2.l;
                            q0o q0oVar5 = rknVar2.k;
                            skn sknVar4 = rknVar2.j;
                            qgg.h0(obj);
                            hibVar = hibVar6;
                            sknVar3 = sknVar4;
                            rceVar5 = rceVar7;
                            q0oVar4 = q0oVar5;
                        } else if (i2 == 2) {
                            Bitmap bitmap2 = rknVar2.n;
                            hib hibVar7 = rknVar2.m;
                            rce rceVar8 = rknVar2.l;
                            q0o q0oVar6 = rknVar2.k;
                            skn sknVar5 = rknVar2.j;
                            try {
                                qgg.h0(obj);
                                bitmap = bitmap2;
                                hibVar2 = hibVar7;
                                rceVar2 = rceVar8;
                                q0oVar = q0oVar6;
                                sknVar2 = sknVar5;
                                try {
                                    hibVar2.getClass();
                                    a aVar = rceVar2.t;
                                    ckg ckgVar = new ckg(rceVar2, sknVar2, (lmq) obj, hibVar2, bitmap, null, 24);
                                    hibVar5 = hibVar2;
                                    try {
                                        rknVar2.j = sknVar2;
                                        rknVar2.k = q0oVar;
                                        rknVar2.l = rceVar2;
                                        rknVar2.m = hibVar5;
                                        rknVar2.n = null;
                                        rknVar2.q = 3;
                                        V = x97.V(aVar, ckgVar, rknVar2);
                                        if (V != nm6Var) {
                                            hibVar3 = hibVar5;
                                            rceVar4 = rceVar2;
                                            obj = V;
                                            q0oVar3 = q0oVar;
                                            sceVar = (sce) obj;
                                            if (!(sceVar instanceof bqr)) {
                                            }
                                            return sceVar;
                                        }
                                        return nm6Var;
                                    } catch (Throwable th) {
                                        th = th;
                                        rceVar3 = rceVar2;
                                        hibVar4 = hibVar5;
                                        q0oVar2 = q0oVar;
                                        sknVar3 = sknVar2;
                                        r2 = hibVar4;
                                        r3 = rceVar3;
                                        r4 = q0oVar2;
                                        if (th instanceof CancellationException) {
                                            sknVar3.h.getClass();
                                            pgb E = lum.E(r3, th);
                                            g(E, r3.c, r2);
                                            return E;
                                        }
                                        sknVar3.getClass();
                                        r2.getClass();
                                        qce qceVar2 = r3.d;
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    hibVar5 = hibVar2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r2 = hibVar7;
                                r3 = rceVar8;
                                r4 = q0oVar6;
                                sknVar3 = sknVar5;
                                if (th instanceof CancellationException) {
                                }
                            }
                        } else {
                            if (i2 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hibVar3 = rknVar2.m;
                            rce rceVar9 = rknVar2.l;
                            q0o q0oVar7 = rknVar2.k;
                            skn sknVar6 = rknVar2.j;
                            qgg.h0(obj);
                            sknVar2 = sknVar6;
                            rceVar4 = rceVar9;
                            q0oVar3 = q0oVar7;
                            try {
                                sceVar = (sce) obj;
                                if (!(sceVar instanceof bqr)) {
                                    bqr bqrVar = (bqr) sceVar;
                                    i6s i6sVar2 = rceVar4.c;
                                    sknVar2.getClass();
                                    rce rceVar10 = bqrVar.b;
                                    Drawable drawable = bqrVar.a;
                                    if (i6sVar2 instanceof z8t) {
                                        c8t a = rceVar10.j.a((z8t) i6sVar2, bqrVar);
                                        if (a instanceof iej) {
                                            i6sVar2.f(drawable);
                                            hibVar3.getClass();
                                            qceVar = rceVar10.d;
                                            if (qceVar != null) {
                                                qceVar.G(rceVar10, bqrVar);
                                            }
                                        } else {
                                            hibVar3.getClass();
                                            a.a();
                                            hibVar3.getClass();
                                            qceVar = rceVar10.d;
                                            if (qceVar != null) {
                                            }
                                        }
                                    }
                                } else if (sceVar instanceof pgb) {
                                    i6s i6sVar3 = rceVar4.c;
                                    sknVar2.getClass();
                                    g((pgb) sceVar, i6sVar3, hibVar3);
                                }
                                return sceVar;
                            } catch (Throwable th4) {
                                th = th4;
                                hibVar4 = hibVar3;
                                rceVar3 = rceVar4;
                                q0oVar2 = q0oVar3;
                                sknVar3 = sknVar2;
                                r2 = hibVar4;
                                r3 = rceVar3;
                                r4 = q0oVar2;
                                try {
                                    if (th instanceof CancellationException) {
                                    }
                                } finally {
                                    r4.g();
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r2 = sknVar3;
                        sknVar3 = -2147483648;
                        r3 = i2;
                        r4 = rceVar6;
                    }
                } else {
                    qgg.h0(obj);
                    lum lumVar = sknVar3.h;
                    r2f Q = saf.Q(rknVar2.getContext());
                    lumVar.getClass();
                    nyf nyfVar = rceVar6.x;
                    i6s i6sVar4 = rceVar6.c;
                    q0o nhuVar = i6sVar4 instanceof lhu ? new nhu((skn) lumVar.a, rceVar6, (lhu) i6sVar4, nyfVar, Q) : new ct2(nyfVar, Q);
                    nhuVar.I();
                    pce a2 = rce.a(rceVar);
                    a2.b = sknVar3.b;
                    a2.B = null;
                    rce a3 = a2.a();
                    hib hibVar8 = hib.a;
                    try {
                        if (a3.b == klx.g) {
                            throw new sgj("The request's data is null.");
                        }
                        nhuVar.start();
                        hibVar = hibVar8;
                        rceVar5 = a3;
                        q0oVar4 = nhuVar;
                        if (i == 0) {
                            nyf nyfVar2 = a3.x;
                            rknVar2.j = sknVar3;
                            rknVar2.k = nhuVar;
                            rknVar2.l = a3;
                            rknVar2.m = hibVar8;
                            rknVar2.q = 1;
                            hibVar = hibVar8;
                            rceVar5 = a3;
                            q0oVar4 = nhuVar;
                            if (ltg.u(nyfVar2, rknVar2) == nm6Var) {
                                return nm6Var;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r2 = hibVar8;
                        r3 = a3;
                        r4 = nhuVar;
                        if (th instanceof CancellationException) {
                        }
                    }
                }
                if (sknVar3.f() != null) {
                    rceVar5.getClass();
                }
                Drawable b = i.b(rceVar5, null, rceVar5.B, rceVar5.F.j);
                i6sVar = rceVar5.c;
                if (i6sVar != null) {
                    i6sVar.j(b);
                }
                hibVar.getClass();
                bnq bnqVar = rceVar5.y;
                rknVar2.j = sknVar3;
                rknVar2.k = q0oVar4;
                rknVar2.l = rceVar5;
                rknVar2.m = hibVar;
                rknVar2.n = null;
                rknVar2.q = 2;
                s = bnqVar.s(rknVar2);
                if (s != nm6Var) {
                    sknVar2 = sknVar3;
                    hibVar2 = hibVar;
                    rceVar2 = rceVar5;
                    obj = s;
                    bitmap = null;
                    q0oVar = q0oVar4;
                    hibVar2.getClass();
                    a aVar2 = rceVar2.t;
                    ckg ckgVar2 = new ckg(rceVar2, sknVar2, (lmq) obj, hibVar2, bitmap, null, 24);
                    hibVar5 = hibVar2;
                    rknVar2.j = sknVar2;
                    rknVar2.k = q0oVar;
                    rknVar2.l = rceVar2;
                    rknVar2.m = hibVar5;
                    rknVar2.n = null;
                    rknVar2.q = 3;
                    V = x97.V(aVar2, ckgVar2, rknVar2);
                    if (V != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        rknVar = new rkn(sknVar3, cg6Var);
        rkn rknVar22 = rknVar;
        Object obj2 = rknVar22.o;
        nm6Var = nm6.a;
        i2 = rknVar22.q;
        if (i2 == 0) {
        }
        if (sknVar3.f() != null) {
        }
        Drawable b2 = i.b(rceVar5, null, rceVar5.B, rceVar5.F.j);
        i6sVar = rceVar5.c;
        if (i6sVar != null) {
        }
        hibVar.getClass();
        bnq bnqVar2 = rceVar5.y;
        rknVar22.j = sknVar3;
        rknVar22.k = q0oVar4;
        rknVar22.l = rceVar5;
        rknVar22.m = hibVar;
        rknVar22.n = null;
        rknVar22.q = 2;
        s = bnqVar2.s(rknVar22);
        if (s != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r5 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(pgb pgbVar, i6s i6sVar, hib hibVar) {
        rce rceVar = pgbVar.b;
        Drawable drawable = pgbVar.a;
        if (i6sVar instanceof z8t) {
            c8t a = rceVar.j.a((z8t) i6sVar, pgbVar);
            if (!(a instanceof iej)) {
                hibVar.getClass();
                a.a();
            }
            i6sVar.p(drawable);
        }
        hibVar.getClass();
        qce qceVar = rceVar.d;
        if (qceVar != null) {
            qceVar.E(rceVar, pgbVar);
        }
    }

    @Override // defpackage.cce
    public final Object a(rce rceVar, Continuation continuation) {
        return gld.Q(new c5l(rceVar, this, (Continuation) null, 26), continuation);
    }

    @Override // defpackage.cce
    public final yp7 b() {
        return this.b;
    }

    @Override // defpackage.cce
    public final pkn c() {
        return (pkn) this.d.getValue();
    }

    @Override // defpackage.cce
    public final la8 d(rce rceVar) {
        ou7 p = x97.p(this.g, null, null, new qkn(this, rceVar, null, 0), 3);
        i6s i6sVar = rceVar.c;
        return i6sVar instanceof lhu ? k.c(((lhu) i6sVar).getView()).d(p) : new rrj(p);
    }

    public final vkn f() {
        return (vkn) this.c.getValue();
    }
}
