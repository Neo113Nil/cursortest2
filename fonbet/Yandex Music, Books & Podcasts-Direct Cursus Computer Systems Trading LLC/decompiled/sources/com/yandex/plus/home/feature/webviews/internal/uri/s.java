package com.yandex.plus.home.feature.webviews.internal.uri;

import defpackage.cg6;
import defpackage.hrg;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.xqn;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class s implements k {
    public final k[] a;

    public s(k... kVarArr) {
        this.a = kVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:10:0x006a). Please report as a decompilation issue!!! */
    @Override // com.yandex.plus.home.feature.webviews.internal.uri.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f fVar, Continuation continuation) {
        p pVar;
        int i;
        int i2;
        xqn xqnVar;
        k[] kVarArr;
        int i3;
        int i4;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i5 = pVar.r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                pVar.r = i5 - Integer.MIN_VALUE;
                Object obj = pVar.p;
                nm6 nm6Var = nm6.a;
                i = pVar.r;
                if (i != 0) {
                    xqn i6 = hrg.i(obj);
                    i6.a = fVar;
                    i2 = 0;
                    xqnVar = i6;
                    kVarArr = this.a;
                    i3 = 0;
                    i4 = 1;
                    if (i3 < i4) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = pVar.o;
                    i3 = pVar.n;
                    i2 = pVar.m;
                    xqnVar = pVar.l;
                    kVarArr = (k[]) pVar.k;
                    xqn xqnVar2 = pVar.j;
                    qgg.h0(obj);
                    xqnVar.a = obj;
                    i3++;
                    xqnVar = xqnVar2;
                    if (i3 < i4) {
                        k kVar = kVarArr[i3];
                        f fVar2 = (f) xqnVar.a;
                        pVar.j = xqnVar;
                        pVar.k = kVarArr;
                        pVar.l = xqnVar;
                        pVar.m = i2;
                        pVar.n = i3;
                        pVar.o = i4;
                        pVar.r = 1;
                        obj = kVar.a(fVar2, pVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        xqnVar2 = xqnVar;
                        xqnVar.a = obj;
                        i3++;
                        xqnVar = xqnVar2;
                        if (i3 < i4) {
                            return xqnVar.a;
                        }
                    }
                }
            }
        }
        pVar = new p(this, (cg6) continuation);
        Object obj2 = pVar.p;
        nm6 nm6Var2 = nm6.a;
        i = pVar.r;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0067 -> B:10:0x0068). Please report as a decompilation issue!!! */
    @Override // com.yandex.plus.home.feature.webviews.internal.uri.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(e eVar, cg6 cg6Var) {
        r rVar;
        int i;
        int i2;
        xqn xqnVar;
        k[] kVarArr;
        int i3;
        int i4;
        if (cg6Var instanceof r) {
            rVar = (r) cg6Var;
            int i5 = rVar.r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                rVar.r = i5 - Integer.MIN_VALUE;
                Object obj = rVar.p;
                nm6 nm6Var = nm6.a;
                i = rVar.r;
                if (i != 0) {
                    xqn i6 = hrg.i(obj);
                    i6.a = eVar;
                    i2 = 0;
                    xqnVar = i6;
                    kVarArr = this.a;
                    i3 = 0;
                    i4 = 1;
                    if (i3 < i4) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = rVar.o;
                    i3 = rVar.n;
                    i2 = rVar.m;
                    xqnVar = rVar.l;
                    kVarArr = (k[]) rVar.k;
                    xqn xqnVar2 = rVar.j;
                    qgg.h0(obj);
                    xqnVar.a = obj;
                    i3++;
                    xqnVar = xqnVar2;
                    if (i3 < i4) {
                        k kVar = kVarArr[i3];
                        e eVar2 = (e) xqnVar.a;
                        rVar.j = xqnVar;
                        rVar.k = kVarArr;
                        rVar.l = xqnVar;
                        rVar.m = i2;
                        rVar.n = i3;
                        rVar.o = i4;
                        rVar.r = 1;
                        obj = kVar.b(eVar2, rVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        xqnVar2 = xqnVar;
                        xqnVar.a = obj;
                        i3++;
                        xqnVar = xqnVar2;
                        if (i3 < i4) {
                            return xqnVar.a;
                        }
                    }
                }
            }
        }
        rVar = new r(this, cg6Var);
        Object obj2 = rVar.p;
        nm6 nm6Var2 = nm6.a;
        i = rVar.r;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0067 -> B:10:0x0068). Please report as a decompilation issue!!! */
    @Override // com.yandex.plus.home.feature.webviews.internal.uri.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(g gVar, cg6 cg6Var) {
        q qVar;
        int i;
        int i2;
        xqn xqnVar;
        k[] kVarArr;
        int i3;
        int i4;
        if (cg6Var instanceof q) {
            qVar = (q) cg6Var;
            int i5 = qVar.r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                qVar.r = i5 - Integer.MIN_VALUE;
                Object obj = qVar.p;
                nm6 nm6Var = nm6.a;
                i = qVar.r;
                if (i != 0) {
                    xqn i6 = hrg.i(obj);
                    i6.a = gVar;
                    i2 = 0;
                    xqnVar = i6;
                    kVarArr = this.a;
                    i3 = 0;
                    i4 = 1;
                    if (i3 < i4) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = qVar.o;
                    i3 = qVar.n;
                    i2 = qVar.m;
                    xqnVar = qVar.l;
                    kVarArr = (k[]) qVar.k;
                    xqn xqnVar2 = qVar.j;
                    qgg.h0(obj);
                    xqnVar.a = obj;
                    i3++;
                    xqnVar = xqnVar2;
                    if (i3 < i4) {
                        k kVar = kVarArr[i3];
                        g gVar2 = (g) xqnVar.a;
                        qVar.j = xqnVar;
                        qVar.k = kVarArr;
                        qVar.l = xqnVar;
                        qVar.m = i2;
                        qVar.n = i3;
                        qVar.o = i4;
                        qVar.r = 1;
                        obj = kVar.c(gVar2, qVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        xqnVar2 = xqnVar;
                        xqnVar.a = obj;
                        i3++;
                        xqnVar = xqnVar2;
                        if (i3 < i4) {
                            return xqnVar.a;
                        }
                    }
                }
            }
        }
        qVar = new q(this, cg6Var);
        Object obj2 = qVar.p;
        nm6 nm6Var2 = nm6.a;
        i = qVar.r;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:10:0x006a). Please report as a decompilation issue!!! */
    @Override // com.yandex.plus.home.feature.webviews.internal.uri.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(b bVar, Continuation continuation) {
        o oVar;
        int i;
        int i2;
        xqn xqnVar;
        k[] kVarArr;
        int i3;
        int i4;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i5 = oVar.r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                oVar.r = i5 - Integer.MIN_VALUE;
                Object obj = oVar.p;
                nm6 nm6Var = nm6.a;
                i = oVar.r;
                if (i != 0) {
                    xqn i6 = hrg.i(obj);
                    i6.a = bVar;
                    i2 = 0;
                    xqnVar = i6;
                    kVarArr = this.a;
                    i3 = 0;
                    i4 = 1;
                    if (i3 < i4) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = oVar.o;
                    i3 = oVar.n;
                    i2 = oVar.m;
                    xqnVar = oVar.l;
                    kVarArr = (k[]) oVar.k;
                    xqn xqnVar2 = oVar.j;
                    qgg.h0(obj);
                    xqnVar.a = obj;
                    i3++;
                    xqnVar = xqnVar2;
                    if (i3 < i4) {
                        k kVar = kVarArr[i3];
                        b bVar2 = (b) xqnVar.a;
                        oVar.j = xqnVar;
                        oVar.k = kVarArr;
                        oVar.l = xqnVar;
                        oVar.m = i2;
                        oVar.n = i3;
                        oVar.o = i4;
                        oVar.r = 1;
                        obj = kVar.d(bVar2, oVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        xqnVar2 = xqnVar;
                        xqnVar.a = obj;
                        i3++;
                        xqnVar = xqnVar2;
                        if (i3 < i4) {
                            return xqnVar.a;
                        }
                    }
                }
            }
        }
        oVar = new o(this, (cg6) continuation);
        Object obj2 = oVar.p;
        nm6 nm6Var2 = nm6.a;
        i = oVar.r;
        if (i != 0) {
        }
    }
}
