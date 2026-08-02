package com.yandex.passport.internal.push;

import android.content.Context;
import com.yandex.passport.api.v2;
import com.yandex.passport.internal.methods.k4;
import com.yandex.passport.internal.methods.l4;
import com.yandex.passport.internal.report.jb;
import defpackage.a4g;
import defpackage.b6;
import defpackage.bqi;
import defpackage.btf;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.dq7;
import defpackage.equ;
import defpackage.gld;
import defpackage.hav;
import defpackage.im6;
import defpackage.j5h;
import defpackage.jp0;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.s9f;
import defpackage.uah;
import defpackage.xdr;
import defpackage.xq0;
import io.appmetrica.analytics.IReporterYandex;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class z0 implements s {
    public static final t e = new t();
    public static volatile z0 f;
    public final Object a;
    public final Object b;
    public final Serializable c;
    public final Serializable d;

    public z0(Context context) {
        equ equVar = new equ(this);
        this.a = equVar;
        new com.yandex.passport.internal.ui.util.j(context, equVar);
        this.b = btf.b(new w0(0));
        btf.b(new w0(1));
        final int i = 0;
        this.c = btf.b(new x0(context, 0));
        btf.b(new Function0(this) { // from class: com.yandex.passport.internal.push.y0
            public final /* synthetic */ z0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                z0 z0Var = this.b;
                switch (i2) {
                    case 0:
                        dq7 dq7Var = ca8.a;
                        return gld.e(j5h.a.plus(a4g.n()).plus(new im6("com.yandex.passport.internal.push.SilentPushController")).plus((equ) z0Var.a));
                    case 1:
                        com.yandex.passport.internal.methods.requester.f fVar = (com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue();
                        fVar.getClass();
                        return new com.yandex.passport.internal.methods.requester.c(fVar, 0);
                    case 2:
                        return new com.yandex.passport.internal.methods.requester.a((com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue(), l4.c);
                    case 3:
                        return new com.yandex.passport.internal.methods.requester.a((com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue(), k4.c);
                    default:
                        com.yandex.passport.internal.methods.requester.f fVar2 = (com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue();
                        fVar2.getClass();
                        return new com.yandex.passport.internal.methods.requester.c(fVar2, 1);
                }
            }
        });
        this.d = btf.b(new hav(22, context, this));
        final int i2 = 1;
        btf.b(new Function0(this) { // from class: com.yandex.passport.internal.push.y0
            public final /* synthetic */ z0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                z0 z0Var = this.b;
                switch (i22) {
                    case 0:
                        dq7 dq7Var = ca8.a;
                        return gld.e(j5h.a.plus(a4g.n()).plus(new im6("com.yandex.passport.internal.push.SilentPushController")).plus((equ) z0Var.a));
                    case 1:
                        com.yandex.passport.internal.methods.requester.f fVar = (com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue();
                        fVar.getClass();
                        return new com.yandex.passport.internal.methods.requester.c(fVar, 0);
                    case 2:
                        return new com.yandex.passport.internal.methods.requester.a((com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue(), l4.c);
                    case 3:
                        return new com.yandex.passport.internal.methods.requester.a((com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue(), k4.c);
                    default:
                        com.yandex.passport.internal.methods.requester.f fVar2 = (com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue();
                        fVar2.getClass();
                        return new com.yandex.passport.internal.methods.requester.c(fVar2, 1);
                }
            }
        });
        final int i3 = 2;
        btf.b(new Function0(this) { // from class: com.yandex.passport.internal.push.y0
            public final /* synthetic */ z0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                z0 z0Var = this.b;
                switch (i22) {
                    case 0:
                        dq7 dq7Var = ca8.a;
                        return gld.e(j5h.a.plus(a4g.n()).plus(new im6("com.yandex.passport.internal.push.SilentPushController")).plus((equ) z0Var.a));
                    case 1:
                        com.yandex.passport.internal.methods.requester.f fVar = (com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue();
                        fVar.getClass();
                        return new com.yandex.passport.internal.methods.requester.c(fVar, 0);
                    case 2:
                        return new com.yandex.passport.internal.methods.requester.a((com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue(), l4.c);
                    case 3:
                        return new com.yandex.passport.internal.methods.requester.a((com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue(), k4.c);
                    default:
                        com.yandex.passport.internal.methods.requester.f fVar2 = (com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue();
                        fVar2.getClass();
                        return new com.yandex.passport.internal.methods.requester.c(fVar2, 1);
                }
            }
        });
        final int i4 = 3;
        btf.b(new Function0(this) { // from class: com.yandex.passport.internal.push.y0
            public final /* synthetic */ z0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                z0 z0Var = this.b;
                switch (i22) {
                    case 0:
                        dq7 dq7Var = ca8.a;
                        return gld.e(j5h.a.plus(a4g.n()).plus(new im6("com.yandex.passport.internal.push.SilentPushController")).plus((equ) z0Var.a));
                    case 1:
                        com.yandex.passport.internal.methods.requester.f fVar = (com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue();
                        fVar.getClass();
                        return new com.yandex.passport.internal.methods.requester.c(fVar, 0);
                    case 2:
                        return new com.yandex.passport.internal.methods.requester.a((com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue(), l4.c);
                    case 3:
                        return new com.yandex.passport.internal.methods.requester.a((com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue(), k4.c);
                    default:
                        com.yandex.passport.internal.methods.requester.f fVar2 = (com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue();
                        fVar2.getClass();
                        return new com.yandex.passport.internal.methods.requester.c(fVar2, 1);
                }
            }
        });
        final int i5 = 4;
        btf.b(new Function0(this) { // from class: com.yandex.passport.internal.push.y0
            public final /* synthetic */ z0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                z0 z0Var = this.b;
                switch (i22) {
                    case 0:
                        dq7 dq7Var = ca8.a;
                        return gld.e(j5h.a.plus(a4g.n()).plus(new im6("com.yandex.passport.internal.push.SilentPushController")).plus((equ) z0Var.a));
                    case 1:
                        com.yandex.passport.internal.methods.requester.f fVar = (com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue();
                        fVar.getClass();
                        return new com.yandex.passport.internal.methods.requester.c(fVar, 0);
                    case 2:
                        return new com.yandex.passport.internal.methods.requester.a((com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue(), l4.c);
                    case 3:
                        return new com.yandex.passport.internal.methods.requester.a((com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue(), k4.c);
                    default:
                        com.yandex.passport.internal.methods.requester.f fVar2 = (com.yandex.passport.internal.methods.requester.f) ((jyr) z0Var.d).getValue();
                        fVar2.getClass();
                        return new com.yandex.passport.internal.methods.requester.c(fVar2, 1);
                }
            }
        });
    }

    public void a(h0 h0Var) {
        h0Var.getClass();
        jb jbVar = jb.d;
        boolean b = m0.b(h0Var);
        Pair pair = new Pair("uid", String.valueOf(h0Var.f));
        String str = h0Var.g;
        if (str == null) {
            str = "";
        }
        Pair pair2 = new Pair("push_id", str);
        String str2 = h0Var.p;
        String x = str2 != null ? com.yandex.plus.core.locale.b.x(str2) : null;
        b(jbVar, uah.e(pair, pair2, new Pair("track_id", x != null ? x : ""), new Pair("is_actual", String.valueOf(b))));
        xdr xdrVar = (xdr) ((bqi) ((jyr) this.b).getValue());
        xdrVar.getClass();
        xdrVar.m(null, h0Var);
    }

    public void b(b6 b6Var, Map map) {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.a, "[METRICA EVENT]", b6Var + ": " + map, 8);
        }
        ((IReporterYandex) ((jyr) this.c).getValue()).reportEvent(b6Var.toString(), (Map<String, Object>) map);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:18|19))(3:20|21|(1:23))|11|(1:13)|15|16))|25|6|7|(0)(0)|11|(0)|15|16) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #0 {Exception -> 0x0068, blocks: (B:10:0x002b, B:11:0x004e, B:13:0x0061, B:21:0x0039), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.yandex.passport.internal.push.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(Continuation continuation) {
        u uVar;
        int i;
        jp0 jp0Var;
        s9f[] s9fVarArr;
        com.yandex.passport.internal.storage.m mVar = (com.yandex.passport.internal.storage.m) this.b;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i2 = uVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.l = i2 - Integer.MIN_VALUE;
                Object obj = uVar.j;
                nm6 nm6Var = nm6.a;
                i = uVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    g gVar = (g) this.a;
                    v2 v2Var = (v2) this.c;
                    String str = (String) this.d;
                    uVar.l = 1;
                    if (gVar.g(v2Var, str, uVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                jp0Var = mVar.b;
                s9fVarArr = com.yandex.passport.internal.storage.m.m;
                if (!"7.54.1".equals((String) jp0Var.getValue(mVar, s9fVarArr[0]))) {
                    mVar.b.setValue(mVar, s9fVarArr[0], "7.54.1");
                }
                return Unit.a;
            }
        }
        uVar = new u(this, (cg6) continuation);
        Object obj2 = uVar.j;
        nm6 nm6Var2 = nm6.a;
        i = uVar.l;
        if (i != 0) {
        }
        jp0Var = mVar.b;
        s9fVarArr = com.yandex.passport.internal.storage.m.m;
        if (!"7.54.1".equals((String) jp0Var.getValue(mVar, s9fVarArr[0]))) {
        }
        return Unit.a;
    }

    public z0(g gVar, com.yandex.passport.internal.storage.m mVar, v2 v2Var, String str) {
        gVar.getClass();
        mVar.getClass();
        this.a = gVar;
        this.b = mVar;
        this.c = v2Var;
        this.d = str;
    }
}
