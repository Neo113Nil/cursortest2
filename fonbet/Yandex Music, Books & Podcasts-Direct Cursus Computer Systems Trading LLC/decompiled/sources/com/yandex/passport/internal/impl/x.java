package com.yandex.passport.internal.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.CookieManager;
import com.yandex.passport.R;
import com.yandex.passport.api.v2;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.methods.h3;
import com.yandex.passport.internal.methods.k5;
import com.yandex.passport.internal.methods.l5;
import com.yandex.passport.internal.methods.m3;
import com.yandex.passport.internal.methods.m4;
import com.yandex.passport.internal.methods.o5;
import com.yandex.passport.internal.methods.p3;
import com.yandex.passport.internal.methods.q5;
import com.yandex.passport.internal.methods.r3;
import com.yandex.passport.internal.methods.s3;
import com.yandex.passport.internal.methods.u4;
import com.yandex.passport.internal.methods.y3;
import com.yandex.passport.internal.methods.y4;
import com.yandex.passport.internal.methods.z4;
import com.yandex.passport.internal.provider.InternalProvider;
import com.yandex.passport.internal.push.z0;
import defpackage.a4g;
import defpackage.avf;
import defpackage.btf;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.dq7;
import defpackage.ern;
import defpackage.f9f;
import defpackage.ff7;
import defpackage.gld;
import defpackage.jyr;
import defpackage.knn;
import defpackage.mn7;
import defpackage.mvg;
import defpackage.nm6;
import defpackage.ocu;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.qyf;
import defpackage.r7o;
import defpackage.rzm;
import defpackage.s9f;
import defpackage.sh;
import defpackage.t7o;
import defpackage.tug;
import defpackage.uah;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.z4b;
import defpackage.z7o;
import defpackage.zsd;
import io.appmetrica.analytics.IReporterYandex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class x implements com.yandex.passport.api.g, a {
    public final Context a;
    public final IReporterYandex b;
    public final String c;
    public final boolean d;
    public final com.yandex.passport.internal.autologin.ui.a e;
    public final com.yandex.passport.internal.methods.requester.f f;
    public final jyr g;
    public final jyr h;
    public final jyr i;

    public x(Context context, IReporterYandex iReporterYandex) {
        context.getClass();
        this.a = context;
        this.b = iReporterYandex;
        String string = context.getResources().getString(R.string.passport_process_name);
        string.getClass();
        this.c = string;
        this.d = StringsKt.U(string);
        com.yandex.passport.internal.autologin.ui.a aVar = new com.yandex.passport.internal.autologin.ui.a(iReporterYandex);
        this.e = aVar;
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        Uri a = com.yandex.passport.internal.util.l.a(context.getPackageName());
        a.getClass();
        this.f = new com.yandex.passport.internal.methods.requester.f(new com.yandex.passport.common.network.n(12, contentResolver, a), aVar);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.impl.b
            public final /* synthetic */ x b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                x xVar = this.b;
                switch (i2) {
                    case 0:
                        return new y(xVar.a, xVar);
                    case 1:
                        return new t0((y) xVar.g.getValue());
                    case 2:
                        com.yandex.passport.internal.upgrader.g gVar = com.yandex.passport.internal.upgrader.g.a;
                        com.yandex.passport.internal.methods.requester.f fVar = xVar.f;
                        com.yandex.passport.internal.autologin.ui.a aVar2 = xVar.e;
                        gVar.getClass();
                        fVar.getClass();
                        aVar2.getClass();
                        knn knnVar = com.yandex.passport.internal.upgrader.g.c;
                        s9f[] s9fVarArr = com.yandex.passport.internal.upgrader.g.b;
                        com.yandex.passport.internal.upgrader.h hVar = (com.yandex.passport.internal.upgrader.h) knnVar.getValue(gVar, s9fVarArr[0]);
                        if (hVar != null) {
                            return hVar;
                        }
                        com.yandex.passport.internal.serialization.a aVar3 = com.yandex.passport.internal.serialization.a.a;
                        tug.a.getClass();
                        ff7.o(aVar3, mvg.a);
                        gld.e(ca8.a.plus(a4g.n()));
                        y0q.b(0, 0, null, 7);
                        new CopyOnWriteArraySet();
                        com.yandex.passport.internal.upgrader.h hVar2 = new com.yandex.passport.internal.upgrader.h();
                        knnVar.setValue(gVar, s9fVarArr[0], hVar2);
                        return hVar2;
                    case 3:
                        com.yandex.passport.internal.link_auth.b bVar = com.yandex.passport.internal.link_auth.b.a;
                        com.yandex.passport.internal.methods.requester.f fVar2 = xVar.f;
                        bVar.getClass();
                        fVar2.getClass();
                        knn knnVar2 = com.yandex.passport.internal.link_auth.b.c;
                        s9f[] s9fVarArr2 = com.yandex.passport.internal.link_auth.b.b;
                        com.yandex.passport.internal.link_auth.a aVar4 = (com.yandex.passport.internal.link_auth.a) knnVar2.getValue(bVar, s9fVarArr2[0]);
                        if (aVar4 != null) {
                            return aVar4;
                        }
                        dq7 dq7Var = ca8.a;
                        mn7.d.getClass();
                        com.yandex.passport.internal.link_auth.a aVar5 = new com.yandex.passport.internal.link_auth.a();
                        knnVar2.setValue(bVar, s9fVarArr2[0], aVar5);
                        return aVar5;
                    default:
                        return new f0(xVar);
                }
            }
        });
        final int i2 = 1;
        this.h = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.impl.b
            public final /* synthetic */ x b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                x xVar = this.b;
                switch (i22) {
                    case 0:
                        return new y(xVar.a, xVar);
                    case 1:
                        return new t0((y) xVar.g.getValue());
                    case 2:
                        com.yandex.passport.internal.upgrader.g gVar = com.yandex.passport.internal.upgrader.g.a;
                        com.yandex.passport.internal.methods.requester.f fVar = xVar.f;
                        com.yandex.passport.internal.autologin.ui.a aVar2 = xVar.e;
                        gVar.getClass();
                        fVar.getClass();
                        aVar2.getClass();
                        knn knnVar = com.yandex.passport.internal.upgrader.g.c;
                        s9f[] s9fVarArr = com.yandex.passport.internal.upgrader.g.b;
                        com.yandex.passport.internal.upgrader.h hVar = (com.yandex.passport.internal.upgrader.h) knnVar.getValue(gVar, s9fVarArr[0]);
                        if (hVar != null) {
                            return hVar;
                        }
                        com.yandex.passport.internal.serialization.a aVar3 = com.yandex.passport.internal.serialization.a.a;
                        tug.a.getClass();
                        ff7.o(aVar3, mvg.a);
                        gld.e(ca8.a.plus(a4g.n()));
                        y0q.b(0, 0, null, 7);
                        new CopyOnWriteArraySet();
                        com.yandex.passport.internal.upgrader.h hVar2 = new com.yandex.passport.internal.upgrader.h();
                        knnVar.setValue(gVar, s9fVarArr[0], hVar2);
                        return hVar2;
                    case 3:
                        com.yandex.passport.internal.link_auth.b bVar = com.yandex.passport.internal.link_auth.b.a;
                        com.yandex.passport.internal.methods.requester.f fVar2 = xVar.f;
                        bVar.getClass();
                        fVar2.getClass();
                        knn knnVar2 = com.yandex.passport.internal.link_auth.b.c;
                        s9f[] s9fVarArr2 = com.yandex.passport.internal.link_auth.b.b;
                        com.yandex.passport.internal.link_auth.a aVar4 = (com.yandex.passport.internal.link_auth.a) knnVar2.getValue(bVar, s9fVarArr2[0]);
                        if (aVar4 != null) {
                            return aVar4;
                        }
                        dq7 dq7Var = ca8.a;
                        mn7.d.getClass();
                        com.yandex.passport.internal.link_auth.a aVar5 = new com.yandex.passport.internal.link_auth.a();
                        knnVar2.setValue(bVar, s9fVarArr2[0], aVar5);
                        return aVar5;
                    default:
                        return new f0(xVar);
                }
            }
        });
        final int i3 = 2;
        btf.b(new Function0(this) { // from class: com.yandex.passport.internal.impl.b
            public final /* synthetic */ x b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                x xVar = this.b;
                switch (i22) {
                    case 0:
                        return new y(xVar.a, xVar);
                    case 1:
                        return new t0((y) xVar.g.getValue());
                    case 2:
                        com.yandex.passport.internal.upgrader.g gVar = com.yandex.passport.internal.upgrader.g.a;
                        com.yandex.passport.internal.methods.requester.f fVar = xVar.f;
                        com.yandex.passport.internal.autologin.ui.a aVar2 = xVar.e;
                        gVar.getClass();
                        fVar.getClass();
                        aVar2.getClass();
                        knn knnVar = com.yandex.passport.internal.upgrader.g.c;
                        s9f[] s9fVarArr = com.yandex.passport.internal.upgrader.g.b;
                        com.yandex.passport.internal.upgrader.h hVar = (com.yandex.passport.internal.upgrader.h) knnVar.getValue(gVar, s9fVarArr[0]);
                        if (hVar != null) {
                            return hVar;
                        }
                        com.yandex.passport.internal.serialization.a aVar3 = com.yandex.passport.internal.serialization.a.a;
                        tug.a.getClass();
                        ff7.o(aVar3, mvg.a);
                        gld.e(ca8.a.plus(a4g.n()));
                        y0q.b(0, 0, null, 7);
                        new CopyOnWriteArraySet();
                        com.yandex.passport.internal.upgrader.h hVar2 = new com.yandex.passport.internal.upgrader.h();
                        knnVar.setValue(gVar, s9fVarArr[0], hVar2);
                        return hVar2;
                    case 3:
                        com.yandex.passport.internal.link_auth.b bVar = com.yandex.passport.internal.link_auth.b.a;
                        com.yandex.passport.internal.methods.requester.f fVar2 = xVar.f;
                        bVar.getClass();
                        fVar2.getClass();
                        knn knnVar2 = com.yandex.passport.internal.link_auth.b.c;
                        s9f[] s9fVarArr2 = com.yandex.passport.internal.link_auth.b.b;
                        com.yandex.passport.internal.link_auth.a aVar4 = (com.yandex.passport.internal.link_auth.a) knnVar2.getValue(bVar, s9fVarArr2[0]);
                        if (aVar4 != null) {
                            return aVar4;
                        }
                        dq7 dq7Var = ca8.a;
                        mn7.d.getClass();
                        com.yandex.passport.internal.link_auth.a aVar5 = new com.yandex.passport.internal.link_auth.a();
                        knnVar2.setValue(bVar, s9fVarArr2[0], aVar5);
                        return aVar5;
                    default:
                        return new f0(xVar);
                }
            }
        });
        final int i4 = 3;
        btf.b(new Function0(this) { // from class: com.yandex.passport.internal.impl.b
            public final /* synthetic */ x b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                x xVar = this.b;
                switch (i22) {
                    case 0:
                        return new y(xVar.a, xVar);
                    case 1:
                        return new t0((y) xVar.g.getValue());
                    case 2:
                        com.yandex.passport.internal.upgrader.g gVar = com.yandex.passport.internal.upgrader.g.a;
                        com.yandex.passport.internal.methods.requester.f fVar = xVar.f;
                        com.yandex.passport.internal.autologin.ui.a aVar2 = xVar.e;
                        gVar.getClass();
                        fVar.getClass();
                        aVar2.getClass();
                        knn knnVar = com.yandex.passport.internal.upgrader.g.c;
                        s9f[] s9fVarArr = com.yandex.passport.internal.upgrader.g.b;
                        com.yandex.passport.internal.upgrader.h hVar = (com.yandex.passport.internal.upgrader.h) knnVar.getValue(gVar, s9fVarArr[0]);
                        if (hVar != null) {
                            return hVar;
                        }
                        com.yandex.passport.internal.serialization.a aVar3 = com.yandex.passport.internal.serialization.a.a;
                        tug.a.getClass();
                        ff7.o(aVar3, mvg.a);
                        gld.e(ca8.a.plus(a4g.n()));
                        y0q.b(0, 0, null, 7);
                        new CopyOnWriteArraySet();
                        com.yandex.passport.internal.upgrader.h hVar2 = new com.yandex.passport.internal.upgrader.h();
                        knnVar.setValue(gVar, s9fVarArr[0], hVar2);
                        return hVar2;
                    case 3:
                        com.yandex.passport.internal.link_auth.b bVar = com.yandex.passport.internal.link_auth.b.a;
                        com.yandex.passport.internal.methods.requester.f fVar2 = xVar.f;
                        bVar.getClass();
                        fVar2.getClass();
                        knn knnVar2 = com.yandex.passport.internal.link_auth.b.c;
                        s9f[] s9fVarArr2 = com.yandex.passport.internal.link_auth.b.b;
                        com.yandex.passport.internal.link_auth.a aVar4 = (com.yandex.passport.internal.link_auth.a) knnVar2.getValue(bVar, s9fVarArr2[0]);
                        if (aVar4 != null) {
                            return aVar4;
                        }
                        dq7 dq7Var = ca8.a;
                        mn7.d.getClass();
                        com.yandex.passport.internal.link_auth.a aVar5 = new com.yandex.passport.internal.link_auth.a();
                        knnVar2.setValue(bVar, s9fVarArr2[0], aVar5);
                        return aVar5;
                    default:
                        return new f0(xVar);
                }
            }
        });
        final int i5 = 4;
        this.i = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.impl.b
            public final /* synthetic */ x b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                x xVar = this.b;
                switch (i22) {
                    case 0:
                        return new y(xVar.a, xVar);
                    case 1:
                        return new t0((y) xVar.g.getValue());
                    case 2:
                        com.yandex.passport.internal.upgrader.g gVar = com.yandex.passport.internal.upgrader.g.a;
                        com.yandex.passport.internal.methods.requester.f fVar = xVar.f;
                        com.yandex.passport.internal.autologin.ui.a aVar2 = xVar.e;
                        gVar.getClass();
                        fVar.getClass();
                        aVar2.getClass();
                        knn knnVar = com.yandex.passport.internal.upgrader.g.c;
                        s9f[] s9fVarArr = com.yandex.passport.internal.upgrader.g.b;
                        com.yandex.passport.internal.upgrader.h hVar = (com.yandex.passport.internal.upgrader.h) knnVar.getValue(gVar, s9fVarArr[0]);
                        if (hVar != null) {
                            return hVar;
                        }
                        com.yandex.passport.internal.serialization.a aVar3 = com.yandex.passport.internal.serialization.a.a;
                        tug.a.getClass();
                        ff7.o(aVar3, mvg.a);
                        gld.e(ca8.a.plus(a4g.n()));
                        y0q.b(0, 0, null, 7);
                        new CopyOnWriteArraySet();
                        com.yandex.passport.internal.upgrader.h hVar2 = new com.yandex.passport.internal.upgrader.h();
                        knnVar.setValue(gVar, s9fVarArr[0], hVar2);
                        return hVar2;
                    case 3:
                        com.yandex.passport.internal.link_auth.b bVar = com.yandex.passport.internal.link_auth.b.a;
                        com.yandex.passport.internal.methods.requester.f fVar2 = xVar.f;
                        bVar.getClass();
                        fVar2.getClass();
                        knn knnVar2 = com.yandex.passport.internal.link_auth.b.c;
                        s9f[] s9fVarArr2 = com.yandex.passport.internal.link_auth.b.b;
                        com.yandex.passport.internal.link_auth.a aVar4 = (com.yandex.passport.internal.link_auth.a) knnVar2.getValue(bVar, s9fVarArr2[0]);
                        if (aVar4 != null) {
                            return aVar4;
                        }
                        dq7 dq7Var = ca8.a;
                        mn7.d.getClass();
                        com.yandex.passport.internal.link_auth.a aVar5 = new com.yandex.passport.internal.link_auth.a();
                        knnVar2.setValue(bVar, s9fVarArr2[0], aVar5);
                        return aVar5;
                    default:
                        return new f0(xVar);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(z1 z1Var, cg6 cg6Var) {
        n nVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        RuntimeException runtimeException2;
        Throwable a;
        if (cg6Var instanceof n) {
            nVar = (n) cg6Var;
            int i2 = nVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.m = i2 - Integer.MIN_VALUE;
                Object obj = nVar.k;
                nm6 nm6Var = nm6.a;
                i = nVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    q();
                    try {
                        com.yandex.passport.internal.methods.requester.f fVar = this.f;
                        try {
                            z1Var.getClass();
                            com.yandex.passport.api.impl.b b = com.yandex.passport.api.impl.b.b(z1Var.a);
                            b.getClass();
                            u4 u4Var = new u4(new z1(b, z1Var.b));
                            try {
                                f9f[] f9fVarArr = {ern.a(com.yandex.passport.api.exception.b.class), ern.a(com.yandex.passport.api.exception.a.class)};
                                dq7 dq7Var = ca8.a;
                                ocu ocuVar = new ocu(fVar, u4Var, f9fVarArr, (Continuation) null, 21);
                                nVar.j = this;
                                nVar.m = 1;
                                obj = x97.V(dq7Var, ocuVar, nVar);
                                if (obj == nm6Var) {
                                    return nm6Var;
                                }
                                xVar = this;
                            } catch (RuntimeException e) {
                                runtimeException2 = e;
                                runtimeException = runtimeException2;
                                xVar = this;
                                xVar.r(runtimeException);
                                throw runtimeException;
                            }
                        } catch (RuntimeException e2) {
                            runtimeException2 = e2;
                        }
                    } catch (RuntimeException e3) {
                        runtimeException = e3;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = nVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (RuntimeException e4) {
                        runtimeException = e4;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj2;
            }
        }
        nVar = new n(this, cg6Var);
        Object obj3 = nVar.k;
        nm6 nm6Var2 = nm6.a;
        i = nVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.passport.api.p0 p0Var, Continuation continuation) {
        g gVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        Throwable a;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.m = i2 - Integer.MIN_VALUE;
                Object obj = gVar.k;
                nm6 nm6Var = nm6.a;
                i = gVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    q();
                    try {
                        dq7 dq7Var = ca8.a;
                        ocu ocuVar = new ocu(this.f, new p3(com.yandex.passport.internal.ui.a.s(p0Var)), new f9f[0], (Continuation) null, 21);
                        gVar.j = this;
                        gVar.m = 1;
                        obj = x97.V(dq7Var, ocuVar, gVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        xVar = this;
                    } catch (RuntimeException e) {
                        runtimeException = e;
                        xVar = this;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = gVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj2;
            }
        }
        gVar = new g(this, (cg6) continuation);
        Object obj3 = gVar.k;
        nm6 nm6Var2 = nm6.a;
        i = gVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: RuntimeException -> 0x002b, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x002b, blocks: (B:11:0x0027, B:12:0x008c, B:14:0x0094, B:25:0x00bc, B:26:0x00c3, B:28:0x00c7, B:29:0x00cd, B:31:0x00d3, B:33:0x00d7, B:16:0x0097, B:17:0x00a3, B:19:0x00a9, B:21:0x00b8), top: B:10:0x0027, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7 A[Catch: RuntimeException -> 0x002b, TryCatch #3 {RuntimeException -> 0x002b, blocks: (B:11:0x0027, B:12:0x008c, B:14:0x0094, B:25:0x00bc, B:26:0x00c3, B:28:0x00c7, B:29:0x00cd, B:31:0x00d3, B:33:0x00d7, B:16:0x0097, B:17:0x00a3, B:19:0x00a9, B:21:0x00b8), top: B:10:0x0027, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(z1 z1Var, String str, Continuation continuation) {
        m mVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        Object obj;
        Throwable a;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = mVar.k;
                nm6 nm6Var = nm6.a;
                i = mVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    q();
                    try {
                        com.yandex.passport.internal.methods.requester.f fVar = this.f;
                        r3 r3Var = new r3(com.yandex.passport.internal.ui.a.D(z1Var), str);
                        try {
                            f9f[] f9fVarArr = {ern.a(com.yandex.passport.api.exception.k.class), ern.a(com.yandex.passport.api.exception.p.class), ern.a(com.yandex.passport.api.exception.t.class), ern.a(com.yandex.passport.api.exception.r.class), ern.a(com.yandex.passport.api.exception.q.class)};
                            dq7 dq7Var = ca8.a;
                            ocu ocuVar = new ocu(fVar, r3Var, f9fVarArr, (Continuation) null, 21);
                            mVar.j = this;
                            mVar.m = 1;
                            obj2 = x97.V(dq7Var, ocuVar, mVar);
                            if (obj2 == nm6Var) {
                                return nm6Var;
                            }
                            xVar = this;
                        } catch (RuntimeException e) {
                            runtimeException = e;
                            xVar = this;
                            xVar.r(runtimeException);
                            throw runtimeException;
                        }
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = mVar.j;
                    try {
                        qgg.h0(obj2);
                    } catch (RuntimeException e3) {
                        runtimeException = e3;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    com.yandex.passport.internal.entities.c cVar = (com.yandex.passport.internal.entities.c) obj;
                    try {
                        CookieManager cookieManager = CookieManager.getInstance();
                        Iterator it = cVar.b.iterator();
                        while (it.hasNext()) {
                            cookieManager.setCookie(cVar.c, (String) it.next());
                        }
                        cookieManager.flush();
                    } catch (Exception e4) {
                        new com.yandex.passport.api.exception.t(e4);
                        r7o r7oVar = z7o.b;
                    }
                }
                if (!(obj instanceof t7o)) {
                    r7o r7oVar2 = z7o.b;
                    obj = Unit.a;
                }
                a = z7o.a(obj);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj;
            }
        }
        mVar = new m(this, (cg6) continuation);
        Object obj22 = mVar.k;
        nm6 nm6Var2 = nm6.a;
        i = mVar.m;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(com.yandex.passport.internal.properties.g0 g0Var, Continuation continuation) {
        s sVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        com.yandex.passport.internal.methods.requester.f fVar;
        o5 o5Var;
        Throwable a;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i2 = sVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.m = i2 - Integer.MIN_VALUE;
                Object obj = sVar.k;
                nm6 nm6Var = nm6.a;
                i = sVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    q();
                    try {
                        fVar = this.f;
                        o5Var = new o5(com.yandex.passport.internal.ui.a.D(g0Var.a), g0Var.b, g0Var.c);
                    } catch (RuntimeException e) {
                        runtimeException = e;
                    }
                    try {
                        f9f[] f9fVarArr = {ern.a(com.yandex.passport.api.exception.p.class), ern.a(com.yandex.passport.api.exception.i.class), ern.a(com.yandex.passport.api.exception.b.class), ern.a(com.yandex.passport.api.exception.a.class), ern.a(com.yandex.passport.api.exception.t.class)};
                        dq7 dq7Var = ca8.a;
                        ocu ocuVar = new ocu(fVar, o5Var, f9fVarArr, (Continuation) null, 21);
                        sVar.j = this;
                        sVar.m = 1;
                        obj = x97.V(dq7Var, ocuVar, sVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        xVar = this;
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                        xVar = this;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = sVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (RuntimeException e3) {
                        runtimeException = e3;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj2;
            }
        }
        sVar = new s(this, (cg6) continuation);
        Object obj3 = sVar.k;
        nm6 nm6Var2 = nm6.a;
        i = sVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(z1 z1Var, cg6 cg6Var) {
        j jVar;
        int i;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jVar.j;
                Object obj2 = nm6.a;
                i = jVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    jVar.l = 1;
                    Object u = u(z1Var, null, jVar);
                    return u == obj2 ? obj2 : u;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return ((z7o) obj).a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        jVar = new j(this, cg6Var);
        Object obj3 = jVar.j;
        Object obj22 = nm6.a;
        i = jVar.l;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Continuation continuation) {
        i iVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        Throwable a;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.m = i2 - Integer.MIN_VALUE;
                Object obj = iVar.k;
                nm6 nm6Var = nm6.a;
                i = iVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    q();
                    try {
                        dq7 dq7Var = ca8.a;
                        ocu ocuVar = new ocu(this.f, y3.c, new f9f[0], (Continuation) null, 21);
                        iVar.j = this;
                        iVar.m = 1;
                        obj = x97.V(dq7Var, ocuVar, iVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        xVar = this;
                    } catch (RuntimeException e) {
                        runtimeException = e;
                        xVar = this;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = iVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj2;
            }
        }
        iVar = new i(this, (cg6) continuation);
        Object obj3 = iVar.k;
        nm6 nm6Var2 = nm6.a;
        i = iVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(z1 z1Var, String str, String str2, Continuation continuation) {
        c cVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        com.yandex.passport.internal.methods.requester.f fVar;
        com.yandex.passport.internal.methods.z zVar;
        Throwable a;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cVar.k;
                nm6 nm6Var = nm6.a;
                i = cVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    q();
                    try {
                        fVar = this.f;
                        zVar = new com.yandex.passport.internal.methods.z(com.yandex.passport.internal.ui.a.D(z1Var), str, str2);
                    } catch (RuntimeException e) {
                        runtimeException = e;
                    }
                    try {
                        f9f[] f9fVarArr = {ern.a(com.yandex.passport.api.exception.p.class), ern.a(com.yandex.passport.api.exception.b.class), ern.a(com.yandex.passport.api.exception.a.class), ern.a(com.yandex.passport.api.exception.k.class)};
                        dq7 dq7Var = ca8.a;
                        ocu ocuVar = new ocu(fVar, zVar, f9fVarArr, (Continuation) null, 21);
                        cVar.j = this;
                        cVar.m = 1;
                        obj = x97.V(dq7Var, ocuVar, cVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        xVar = this;
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                        xVar = this;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = cVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (RuntimeException e3) {
                        runtimeException = e3;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj2;
            }
        }
        cVar = new c(this, (cg6) continuation);
        Object obj3 = cVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj22;
    }

    @Override // com.yandex.passport.api.g
    public final q0 h(sh shVar, qyf qyfVar) {
        shVar.getClass();
        return new q0(i(), (y) this.g.getValue(), shVar, qyfVar, (f0) this.i.getValue(), this, this.a);
    }

    @Override // com.yandex.passport.api.g
    public final t0 i() {
        return (t0) this.h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(z1 z1Var, String str, Continuation continuation) {
        u uVar;
        int i;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i2 = uVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.l = i2 - Integer.MIN_VALUE;
                Object obj = uVar.j;
                Object obj2 = nm6.a;
                i = uVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    uVar.l = 1;
                    Object z = z(z1Var, str, true, uVar);
                    return z == obj2 ? obj2 : z;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return ((z7o) obj).a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        uVar = new u(this, (cg6) continuation);
        Object obj3 = uVar.j;
        Object obj22 = nm6.a;
        i = uVar.l;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Function1 function1, cg6 cg6Var) {
        h hVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        RuntimeException runtimeException2;
        Throwable a;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.m = i2 - Integer.MIN_VALUE;
                Object obj = hVar.k;
                nm6 nm6Var = nm6.a;
                i = hVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    q();
                    try {
                        com.yandex.passport.internal.methods.requester.f fVar = this.f;
                        try {
                            com.yandex.passport.internal.properties.d dVar = new com.yandex.passport.internal.properties.d();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            dVar.d = linkedHashMap;
                            function1.invoke(dVar);
                            try {
                                z1 z1Var = dVar.a;
                                if (z1Var == null) {
                                    Intrinsics.j("uid");
                                    throw null;
                                }
                                z1 D = com.yandex.passport.internal.ui.a.D(z1Var);
                                String str = dVar.b;
                                if (str == null) {
                                    Intrinsics.j("returnUrl");
                                    throw null;
                                }
                                String str2 = dVar.c;
                                if (str2 == null) {
                                    Intrinsics.j("tld");
                                    throw null;
                                }
                                s3 s3Var = new s3(new com.yandex.passport.internal.properties.e(D, str, str2, linkedHashMap));
                                try {
                                    f9f[] f9fVarArr = {ern.a(com.yandex.passport.api.exception.b.class), ern.a(com.yandex.passport.api.exception.a.class), ern.a(com.yandex.passport.api.exception.p.class)};
                                    dq7 dq7Var = ca8.a;
                                    ocu ocuVar = new ocu(fVar, s3Var, f9fVarArr, (Continuation) null, 21);
                                    hVar.j = this;
                                    hVar.m = 1;
                                    obj = x97.V(dq7Var, ocuVar, hVar);
                                    if (obj == nm6Var) {
                                        return nm6Var;
                                    }
                                    xVar = this;
                                } catch (RuntimeException e) {
                                    runtimeException2 = e;
                                    runtimeException = runtimeException2;
                                    xVar = this;
                                    xVar.r(runtimeException);
                                    throw runtimeException;
                                }
                            } catch (RuntimeException e2) {
                                runtimeException2 = e2;
                            }
                        } catch (RuntimeException e3) {
                            runtimeException2 = e3;
                        }
                    } catch (RuntimeException e4) {
                        runtimeException = e4;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = hVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (RuntimeException e5) {
                        runtimeException = e5;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj2;
            }
        }
        hVar = new h(this, cg6Var);
        Object obj3 = hVar.k;
        nm6 nm6Var2 = nm6.a;
        i = hVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(z1 z1Var, com.yandex.passport.internal.credentials.f fVar, cg6 cg6Var) {
        k kVar;
        int i;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.l = i2 - Integer.MIN_VALUE;
                Object obj = kVar.j;
                Object obj2 = nm6.a;
                i = kVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    kVar.l = 1;
                    Object u = u(z1Var, fVar, kVar);
                    return u == obj2 ? obj2 : u;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return ((z7o) obj).a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kVar = new k(this, cg6Var);
        Object obj3 = kVar.j;
        Object obj22 = nm6.a;
        i = kVar.l;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(z1 z1Var, Continuation continuation) {
        f fVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        m3 m3Var;
        RuntimeException runtimeException2;
        Throwable a;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.m = i2 - Integer.MIN_VALUE;
                Object obj = fVar.k;
                nm6 nm6Var = nm6.a;
                i = fVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    q();
                    try {
                        com.yandex.passport.internal.methods.requester.f fVar2 = this.f;
                        try {
                            z1Var.getClass();
                            com.yandex.passport.api.impl.b b = com.yandex.passport.api.impl.b.b(z1Var.a);
                            b.getClass();
                            m3Var = new m3(new z1(b, z1Var.b));
                        } catch (RuntimeException e) {
                            runtimeException2 = e;
                        }
                        try {
                            f9f[] f9fVarArr = {ern.a(com.yandex.passport.api.exception.b.class)};
                            dq7 dq7Var = ca8.a;
                            ocu ocuVar = new ocu(fVar2, m3Var, f9fVarArr, (Continuation) null, 21);
                            fVar.j = this;
                            fVar.m = 1;
                            obj = x97.V(dq7Var, ocuVar, fVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            xVar = this;
                        } catch (RuntimeException e2) {
                            runtimeException2 = e2;
                            runtimeException = runtimeException2;
                            xVar = this;
                            xVar.r(runtimeException);
                            throw runtimeException;
                        }
                    } catch (RuntimeException e3) {
                        runtimeException = e3;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = fVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (RuntimeException e4) {
                        runtimeException = e4;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj2;
            }
        }
        fVar = new f(this, (cg6) continuation);
        Object obj3 = fVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj22;
    }

    @Override // com.yandex.passport.api.g
    public final com.yandex.passport.internal.t n() {
        pjc pjcVar;
        com.yandex.passport.internal.provider.communication.e eVar;
        com.yandex.passport.internal.flags.experiments.p pVar = com.yandex.passport.internal.provider.communication.d.d;
        if (pVar == null || (eVar = (com.yandex.passport.internal.provider.communication.e) ((rzm) pVar.b).get()) == null || (pjcVar = eVar.b) == null) {
            pjcVar = z4b.a;
        }
        return new com.yandex.passport.internal.t(zsd.b0(pjcVar), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(v2 v2Var, Continuation continuation) {
        o oVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        Throwable a;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.m = i2 - Integer.MIN_VALUE;
                Object obj = oVar.k;
                nm6 nm6Var = nm6.a;
                i = oVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    q();
                    try {
                        dq7 dq7Var = ca8.a;
                        ocu ocuVar = new ocu(this.f, new y4(v2Var, null), new f9f[0], (Continuation) null, 21);
                        oVar.j = this;
                        oVar.m = 1;
                        obj = x97.V(dq7Var, ocuVar, oVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        xVar = this;
                    } catch (RuntimeException e) {
                        runtimeException = e;
                        xVar = this;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = oVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj2;
            }
        }
        oVar = new o(this, (cg6) continuation);
        Object obj3 = oVar.k;
        nm6 nm6Var2 = nm6.a;
        i = oVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Continuation continuation) {
        d dVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        Throwable a;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dVar.k;
                nm6 nm6Var = nm6.a;
                i = dVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    q();
                    try {
                        com.yandex.passport.internal.methods.requester.f fVar = this.f;
                        l5 l5Var = new l5(true);
                        f9f[] f9fVarArr = {ern.a(com.yandex.passport.api.exception.c.class), ern.a(com.yandex.passport.api.exception.t.class)};
                        dq7 dq7Var = ca8.a;
                        ocu ocuVar = new ocu(fVar, l5Var, f9fVarArr, (Continuation) null, 21);
                        dVar.j = this;
                        dVar.m = 1;
                        obj = x97.V(dq7Var, ocuVar, dVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        xVar = this;
                    } catch (RuntimeException e) {
                        runtimeException = e;
                        xVar = this;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = dVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj2;
            }
        }
        dVar = new d(this, (cg6) continuation);
        Object obj3 = dVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj22;
    }

    @Override // com.yandex.passport.internal.impl.a
    public final void q() {
        boolean z = InternalProvider.d;
        if (!InternalProvider.d || this.d) {
            return;
        }
        this.b.reportEvent(com.yandex.passport.internal.analytics.m.p.b, uah.e(new Pair("passport_process_name", dfi.i(new StringBuilder("'"), this.c, '\'')), new Pair("am_version", "7.54.1"), new Pair("error", Log.getStackTraceString(new RuntimeException("This method must not be called from ':passport' process")))));
    }

    @Override // com.yandex.passport.internal.impl.a
    public final void r(RuntimeException runtimeException) {
        this.b.reportError(com.yandex.passport.internal.analytics.v.a.b, runtimeException);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(String str, Bundle bundle, Continuation continuation) {
        p pVar;
        int i;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i2 = pVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.l = i2 - Integer.MIN_VALUE;
                Object obj = pVar.j;
                Object obj2 = nm6.a;
                i = pVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pVar.l = 1;
                    Object v = v(str, bundle, pVar);
                    return v == obj2 ? obj2 : v;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return ((z7o) obj).a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        pVar = new p(this, (cg6) continuation);
        Object obj3 = pVar.j;
        Object obj22 = nm6.a;
        i = pVar.l;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.api.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(String str, cg6 cg6Var) {
        e eVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        Throwable a;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i2 = eVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.m = i2 - Integer.MIN_VALUE;
                Object obj = eVar.k;
                nm6 nm6Var = nm6.a;
                i = eVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    q();
                    try {
                        if (StringsKt.U(str)) {
                            w(0L, "dropToken");
                        }
                        com.yandex.passport.internal.methods.requester.f fVar = this.f;
                        try {
                            dq7 dq7Var = ca8.a;
                            ocu ocuVar = new ocu(fVar, new h3(new com.yandex.passport.internal.entities.e(str, "")), new f9f[0], (Continuation) null, 21);
                            eVar.j = this;
                            eVar.m = 1;
                            obj = x97.V(dq7Var, ocuVar, eVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            xVar = this;
                        } catch (RuntimeException e) {
                            runtimeException = e;
                            xVar = this;
                            xVar.r(runtimeException);
                            throw runtimeException;
                        }
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = eVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (RuntimeException e3) {
                        runtimeException = e3;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj2;
            }
        }
        eVar = new e(this, cg6Var);
        Object obj3 = eVar.k;
        nm6 nm6Var2 = nm6.a;
        i = eVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(z1 z1Var, com.yandex.passport.internal.credentials.f fVar, cg6 cg6Var) {
        l lVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        RuntimeException runtimeException2;
        com.yandex.passport.internal.credentials.f fVar2;
        z1 z1Var2;
        Object obj;
        Throwable a;
        if (cg6Var instanceof l) {
            lVar = (l) cg6Var;
            int i2 = lVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = lVar.l;
                nm6 nm6Var = nm6.a;
                i = lVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    q();
                    try {
                        com.yandex.passport.internal.methods.requester.f fVar3 = this.f;
                        z1 D = com.yandex.passport.internal.ui.a.D(z1Var);
                        Continuation continuation = null;
                        if (fVar != null) {
                            try {
                                fVar2 = new com.yandex.passport.internal.credentials.f(fVar.a, fVar.b);
                            } catch (RuntimeException e) {
                                runtimeException2 = e;
                                runtimeException = runtimeException2;
                                xVar = this;
                                xVar.r(runtimeException);
                                throw runtimeException;
                            }
                        } else {
                            fVar2 = null;
                        }
                        m4 m4Var = new m4(D, fVar2);
                        try {
                            f9f[] f9fVarArr = {ern.a(com.yandex.passport.api.exception.b.class), ern.a(com.yandex.passport.api.exception.a.class), ern.a(com.yandex.passport.api.exception.h.class), ern.a(com.yandex.passport.api.exception.c.class), ern.a(com.yandex.passport.api.exception.p.class), ern.a(com.yandex.passport.api.exception.t.class)};
                            dq7 dq7Var = ca8.a;
                            ocu ocuVar = new ocu(fVar3, m4Var, f9fVarArr, continuation, 21);
                            lVar.j = z1Var;
                            lVar.k = this;
                            lVar.n = 1;
                            obj2 = x97.V(dq7Var, ocuVar, lVar);
                            if (obj2 == nm6Var) {
                                return nm6Var;
                            }
                            z1Var2 = z1Var;
                            xVar = this;
                        } catch (RuntimeException e2) {
                            runtimeException2 = e2;
                            runtimeException = runtimeException2;
                            xVar = this;
                            xVar.r(runtimeException);
                            throw runtimeException;
                        }
                    } catch (RuntimeException e3) {
                        runtimeException = e3;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = lVar.k;
                    z1Var2 = lVar.j;
                    try {
                        qgg.h0(obj2);
                    } catch (RuntimeException e4) {
                        runtimeException = e4;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    try {
                        r7o r7oVar = z7o.b;
                        com.yandex.passport.internal.entities.e eVar = (com.yandex.passport.internal.entities.e) obj;
                        if (StringsKt.U(eVar.a)) {
                            w(z1Var2.b, "getToken");
                            throw new com.yandex.passport.api.exception.a();
                        }
                        String str = eVar.a;
                        str.getClass();
                        obj = new com.yandex.passport.api.k(str);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        obj = new t7o(th);
                    }
                }
                a = z7o.a(obj);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj;
            }
        }
        lVar = new l(this, cg6Var);
        Object obj22 = lVar.l;
        nm6 nm6Var2 = nm6.a;
        i = lVar.n;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[Catch: RuntimeException -> 0x002d, TryCatch #1 {RuntimeException -> 0x002d, blocks: (B:11:0x0029, B:12:0x008a, B:14:0x0092, B:16:0x009d, B:18:0x00a8, B:24:0x00bf, B:28:0x00c1, B:29:0x00c2, B:31:0x00c3, B:32:0x00c6, B:34:0x00d4, B:36:0x00d8, B:20:0x00a9, B:22:0x00ad), top: B:10:0x0029, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4 A[Catch: RuntimeException -> 0x002d, TryCatch #1 {RuntimeException -> 0x002d, blocks: (B:11:0x0029, B:12:0x008a, B:14:0x0092, B:16:0x009d, B:18:0x00a8, B:24:0x00bf, B:28:0x00c1, B:29:0x00c2, B:31:0x00c3, B:32:0x00c6, B:34:0x00d4, B:36:0x00d8, B:20:0x00a9, B:22:0x00ad), top: B:10:0x0029, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(String str, Bundle bundle, cg6 cg6Var) {
        q qVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        Bundle bundle2;
        long j;
        Throwable a;
        Object obj;
        if (cg6Var instanceof q) {
            qVar = (q) cg6Var;
            int i2 = qVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = qVar.m;
                nm6 nm6Var = nm6.a;
                i = qVar.o;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj2);
                    q();
                    try {
                        str.getClass();
                        bundle.getClass();
                        if (!kotlin.text.c.v(str, "1087931301371", false) && !kotlin.text.c.v(str, "410800666107", false) && !bundle.containsKey("passp_am_proto")) {
                            xVar = this;
                            z = false;
                            Object u = avf.u(Boolean.valueOf(z));
                            a = z7o.a(u);
                            if (a != null && (a instanceof RuntimeException)) {
                                xVar.r((RuntimeException) a);
                            }
                            return u;
                        }
                        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        dq7 dq7Var = ca8.a;
                        ocu ocuVar = new ocu(this.f, new z4(bundle, str), new f9f[0], (Continuation) null, 21);
                        qVar.j = bundle;
                        qVar.k = this;
                        qVar.l = elapsedRealtimeNanos;
                        qVar.o = 1;
                        obj2 = x97.V(dq7Var, ocuVar, qVar);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                        xVar = this;
                        bundle2 = bundle;
                        j = elapsedRealtimeNanos;
                    } catch (RuntimeException e) {
                        runtimeException = e;
                        xVar = this;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = qVar.l;
                    xVar = qVar.k;
                    bundle2 = qVar.j;
                    try {
                        qgg.h0(obj2);
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    com.yandex.passport.internal.push.j0 j0Var = (com.yandex.passport.internal.push.j0) obj;
                    com.yandex.passport.internal.push.m0.d(this.b, bundle2, j, j0Var);
                    com.yandex.passport.internal.push.h0 h0Var = j0Var.a;
                    if (h0Var != null) {
                        com.yandex.passport.internal.push.t tVar = z0.e;
                        Context context = this.a;
                        context.getClass();
                        z0 z0Var = z0.f;
                        if (z0Var == null) {
                            synchronized (tVar) {
                                z0Var = z0.f;
                                if (z0Var == null) {
                                    Context applicationContext = context.getApplicationContext();
                                    applicationContext.getClass();
                                    z0Var = new z0(applicationContext);
                                    z0.f = z0Var;
                                }
                            }
                        }
                        z0Var.a(h0Var);
                    }
                }
                Object u2 = avf.u(Boolean.valueOf(z));
                a = z7o.a(u2);
                if (a != null) {
                    xVar.r((RuntimeException) a);
                }
                return u2;
            }
        }
        qVar = new q(this, cg6Var);
        Object obj22 = qVar.m;
        nm6 nm6Var2 = nm6.a;
        i = qVar.o;
        boolean z2 = true;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        Object u22 = avf.u(Boolean.valueOf(z2));
        a = z7o.a(u22);
        if (a != null) {
        }
        return u22;
    }

    public final void w(long j, String str) {
        HashMap r = com.appsflyer.internal.k.r("method_name", str);
        r.put("uid", String.valueOf(j));
        r.put("am_version", "7.54.1");
        this.b.reportEvent(com.yandex.passport.internal.analytics.m.i.b, r);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(z1 z1Var, cg6 cg6Var) {
        r rVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        com.yandex.passport.internal.methods.requester.f fVar;
        k5 k5Var;
        Continuation continuation;
        Throwable a;
        if (cg6Var instanceof r) {
            rVar = (r) cg6Var;
            int i2 = rVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.m = i2 - Integer.MIN_VALUE;
                Object obj = rVar.k;
                nm6 nm6Var = nm6.a;
                i = rVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    q();
                    try {
                        fVar = this.f;
                        continuation = null;
                        k5Var = new k5(z1Var != null ? com.yandex.passport.internal.ui.a.D(z1Var) : null);
                    } catch (RuntimeException e) {
                        runtimeException = e;
                    }
                    try {
                        f9f[] f9fVarArr = {ern.a(com.yandex.passport.api.exception.b.class)};
                        dq7 dq7Var = ca8.a;
                        ocu ocuVar = new ocu(fVar, k5Var, f9fVarArr, continuation, 21);
                        rVar.j = this;
                        rVar.m = 1;
                        obj = x97.V(dq7Var, ocuVar, rVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        xVar = this;
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                        xVar = this;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = rVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (RuntimeException e3) {
                        runtimeException = e3;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj2;
            }
        }
        rVar = new r(this, cg6Var);
        Object obj3 = rVar.k;
        nm6 nm6Var2 = nm6.a;
        i = rVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(z1 z1Var, cg6 cg6Var) {
        t tVar;
        int i;
        if (cg6Var instanceof t) {
            tVar = (t) cg6Var;
            int i2 = tVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.l = i2 - Integer.MIN_VALUE;
                Object obj = tVar.j;
                Object obj2 = nm6.a;
                i = tVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    tVar.l = 1;
                    Object x = x(z1Var, tVar);
                    return x == obj2 ? obj2 : x;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return ((z7o) obj).a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        tVar = new t(this, cg6Var);
        Object obj3 = tVar.j;
        Object obj22 = nm6.a;
        i = tVar.l;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(z1 z1Var, String str, boolean z, cg6 cg6Var) {
        v vVar;
        int i;
        RuntimeException runtimeException;
        x xVar;
        com.yandex.passport.internal.methods.requester.f fVar;
        q5 q5Var;
        Throwable a;
        if (cg6Var instanceof v) {
            vVar = (v) cg6Var;
            int i2 = vVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.m = i2 - Integer.MIN_VALUE;
                Object obj = vVar.k;
                nm6 nm6Var = nm6.a;
                i = vVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    q();
                    try {
                        fVar = this.f;
                        q5Var = new q5(com.yandex.passport.internal.ui.a.D(z1Var), str, z);
                    } catch (RuntimeException e) {
                        runtimeException = e;
                    }
                    try {
                        f9f[] f9fVarArr = {ern.a(com.yandex.passport.api.exception.a.class), ern.a(com.yandex.passport.api.exception.b.class), ern.a(com.yandex.passport.api.exception.k.class), ern.a(com.yandex.passport.api.exception.p.class), ern.a(com.yandex.passport.api.exception.t.class), ern.a(com.yandex.passport.api.exception.q.class)};
                        dq7 dq7Var = ca8.a;
                        ocu ocuVar = new ocu(fVar, q5Var, f9fVarArr, (Continuation) null, 21);
                        vVar.j = this;
                        vVar.m = 1;
                        obj = x97.V(dq7Var, ocuVar, vVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        xVar = this;
                    } catch (RuntimeException e2) {
                        runtimeException = e2;
                        xVar = this;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = vVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (RuntimeException e3) {
                        runtimeException = e3;
                        xVar.r(runtimeException);
                        throw runtimeException;
                    }
                }
                Object obj2 = ((z7o) obj).a;
                a = z7o.a(obj2);
                if (a != null && (a instanceof RuntimeException)) {
                    xVar.r((RuntimeException) a);
                }
                return obj2;
            }
        }
        vVar = new v(this, cg6Var);
        Object obj3 = vVar.k;
        nm6 nm6Var2 = nm6.a;
        i = vVar.m;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        a = z7o.a(obj22);
        if (a != null) {
            xVar.r((RuntimeException) a);
        }
        return obj22;
    }
}
