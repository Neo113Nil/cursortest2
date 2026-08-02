package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.common.network.n;
import com.yandex.passport.internal.analytics.l0;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.methods.a0;
import com.yandex.passport.internal.methods.a4;
import com.yandex.passport.internal.methods.a5;
import com.yandex.passport.internal.methods.b0;
import com.yandex.passport.internal.methods.b4;
import com.yandex.passport.internal.methods.b5;
import com.yandex.passport.internal.methods.c0;
import com.yandex.passport.internal.methods.c4;
import com.yandex.passport.internal.methods.c5;
import com.yandex.passport.internal.methods.d0;
import com.yandex.passport.internal.methods.d3;
import com.yandex.passport.internal.methods.d4;
import com.yandex.passport.internal.methods.d5;
import com.yandex.passport.internal.methods.e0;
import com.yandex.passport.internal.methods.e3;
import com.yandex.passport.internal.methods.e4;
import com.yandex.passport.internal.methods.e5;
import com.yandex.passport.internal.methods.f0;
import com.yandex.passport.internal.methods.f3;
import com.yandex.passport.internal.methods.f4;
import com.yandex.passport.internal.methods.f5;
import com.yandex.passport.internal.methods.g0;
import com.yandex.passport.internal.methods.g3;
import com.yandex.passport.internal.methods.g4;
import com.yandex.passport.internal.methods.g5;
import com.yandex.passport.internal.methods.h0;
import com.yandex.passport.internal.methods.h3;
import com.yandex.passport.internal.methods.h4;
import com.yandex.passport.internal.methods.h5;
import com.yandex.passport.internal.methods.i3;
import com.yandex.passport.internal.methods.i4;
import com.yandex.passport.internal.methods.i5;
import com.yandex.passport.internal.methods.j3;
import com.yandex.passport.internal.methods.j4;
import com.yandex.passport.internal.methods.j5;
import com.yandex.passport.internal.methods.k3;
import com.yandex.passport.internal.methods.k4;
import com.yandex.passport.internal.methods.k5;
import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.methods.l4;
import com.yandex.passport.internal.methods.l5;
import com.yandex.passport.internal.methods.m3;
import com.yandex.passport.internal.methods.m4;
import com.yandex.passport.internal.methods.m5;
import com.yandex.passport.internal.methods.n3;
import com.yandex.passport.internal.methods.n4;
import com.yandex.passport.internal.methods.n5;
import com.yandex.passport.internal.methods.o3;
import com.yandex.passport.internal.methods.o4;
import com.yandex.passport.internal.methods.o5;
import com.yandex.passport.internal.methods.p3;
import com.yandex.passport.internal.methods.p4;
import com.yandex.passport.internal.methods.p5;
import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.passport.internal.methods.performer.w0;
import com.yandex.passport.internal.methods.performer.x0;
import com.yandex.passport.internal.methods.performer.y0;
import com.yandex.passport.internal.methods.performer.z0;
import com.yandex.passport.internal.methods.q3;
import com.yandex.passport.internal.methods.q4;
import com.yandex.passport.internal.methods.q5;
import com.yandex.passport.internal.methods.r3;
import com.yandex.passport.internal.methods.r4;
import com.yandex.passport.internal.methods.r5;
import com.yandex.passport.internal.methods.requester.f;
import com.yandex.passport.internal.methods.s3;
import com.yandex.passport.internal.methods.s4;
import com.yandex.passport.internal.methods.s5;
import com.yandex.passport.internal.methods.t3;
import com.yandex.passport.internal.methods.t4;
import com.yandex.passport.internal.methods.t5;
import com.yandex.passport.internal.methods.u3;
import com.yandex.passport.internal.methods.u4;
import com.yandex.passport.internal.methods.u5;
import com.yandex.passport.internal.methods.v3;
import com.yandex.passport.internal.methods.v4;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.methods.w3;
import com.yandex.passport.internal.methods.w4;
import com.yandex.passport.internal.methods.x3;
import com.yandex.passport.internal.methods.x4;
import com.yandex.passport.internal.methods.y;
import com.yandex.passport.internal.methods.y3;
import com.yandex.passport.internal.methods.y4;
import com.yandex.passport.internal.methods.z;
import com.yandex.passport.internal.methods.z3;
import com.yandex.passport.internal.methods.z4;
import com.yandex.passport.internal.provider.a;
import com.yandex.passport.internal.report.diary.m0;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.rotation.h;
import com.yandex.passport.internal.storage.m;
import com.yandex.passport.internal.util.l;
import com.yandex.passport.sloth.command.d;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.command.w;
import com.yandex.passport.sloth.ui.a1;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.di.c;
import com.yandex.plus.bdui.t;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes4.dex */
public final /* synthetic */ class hav implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hav(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z0 z0Var;
        n nVar;
        int i = this.a;
        char c = 1;
        char c2 = 1;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new y3((jnq) obj2, (goq) obj);
            case 1:
                cr crVar = (cr) obj2;
                LinkedHashSet u = crVar.u();
                HashMap hashMap = (HashMap) crVar.d;
                ArrayList arrayList = (ArrayList) crVar.b;
                arrayList.remove((ndv) obj);
                Set<String> h = wop.h(u, crVar.u());
                if (arrayList.isEmpty()) {
                    hashMap.clear();
                    crVar.e = null;
                }
                for (String str : h) {
                    hashMap.remove(str);
                    List list = (List) ((HashMap) crVar.c).get(str);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((mlt) it.next()).b();
                        }
                    }
                }
                return Unit.a;
            case 2:
                SslError sslError = (SslError) obj;
                ssg.a(6, ((iev) obj2).c, k5r.l("error while loading ", sslError.getPrimaryError(), sslError.getUrl(), " with "), null);
                return Unit.a;
            case 3:
                l13 l13Var = (l13) obj;
                knn knnVar = new knn(19, (xdr) obj2);
                bdt I = hag.I(oq7.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                oq7 oq7Var = (oq7) qdcVar.D(I, l13Var, set);
                bdt I2 = hag.I(z5l.class);
                qdc qdcVar2 = l13Var.a;
                return new mbb(new kbb(knnVar, oq7Var, (z5l) qdcVar2.D(I2, l13Var, set), (e) qdcVar2.D(hag.I(e.class), l13Var, set), (cut) qdcVar2.D(hag.I(cut.class), l13Var, set), (ay) qdcVar2.D(hag.I(ay.class), l13Var, set), (k21) qdcVar2.D(hag.I(k21.class), l13Var, set), new lum((Context) qdcVar2.D(hag.I(Context.class), l13Var, set))), new mbb((oq7) qdcVar2.D(hag.I(oq7.class), l13Var, set), (g0l) qdcVar2.D(hag.I(g0l.class), l13Var, set), new vlv(1, wlv.a, wlv.class, "widgetEntityOldFrom", "widgetEntityOldFrom(Lru/yandex/music/data/domainitem/EntityDomainItem;)Ljava/lang/String;", 0, 0)), new h8v(17));
            case 4:
                knv knvVar = (knv) obj2;
                return new pov(knvVar.a, (vnv) knvVar.b.getValue(), (oq7) knvVar.c.getValue(), knvVar.f, (lmv) knvVar.d.getValue(), (cnv) obj, knvVar.e, knvVar.g);
            case 5:
                ((Function1) obj2).invoke((uht) obj);
                return Unit.a;
            case 6:
                ((View) obj2).performHapticFeedback(6);
                ((psv) obj).b();
                return Unit.a;
            case 7:
                wvv wvvVar = (wvv) obj;
                if (((aqi) obj2).getValue() instanceof f0w) {
                    ((j1w) ((cyv) wvvVar.c.b).c.a).a.j0();
                }
                return Unit.a;
            case 8:
                geh gehVar = (geh) obj2;
                jtv a = ((yyv) ((sdr) obj).getValue()).c.a();
                return Float.valueOf(Intrinsics.d(gehVar, a != null ? hag.G(a) : null) ? 1.0f : 0.0f);
            case 9:
                mxv mxvVar = (mxv) obj2;
                cq4 F = ot0.F((t1w) obj);
                pzl pzlVar = mxvVar.a;
                l13 l13Var2 = mxvVar.b;
                b3w b3wVar = b3w.BOTH_DIMENSIONS;
                duv duvVar = new duv();
                n0w n0wVar = (n0w) l13Var2.a.D(hag.I(n0w.class), l13Var2, l13Var2.b);
                dx5 dx5Var = (dx5) pzlVar.b;
                p51 p51Var = (p51) dx5Var.b.getValue();
                frt frtVar = (frt) dx5Var.c.getValue();
                p51Var.getClass();
                frtVar.getClass();
                dxr dxrVar = new dxr();
                dxrVar.a = p51Var;
                dxrVar.b = frtVar;
                return new auv(duvVar, n0wVar, dxrVar, F);
            case 10:
                j3w j3wVar = (j3w) obj2;
                t1w t1wVar = (t1w) obj;
                xdr xdrVar = t1wVar.r0().e;
                cq4 F2 = ot0.F(t1wVar);
                vzo vzoVar = j3wVar.a;
                ia0 ia0Var = j3wVar.b;
                xdrVar.getClass();
                return new y1w(vzoVar, (z66) ia0Var.i, xdrVar, F2);
            case 11:
                return new p0w((kxi) obj2, (fi1) obj);
            case 12:
                return new j3w((vzo) obj2, (ia0) obj);
            case 13:
                return new m2w((cc7) ((ia0) obj2).h, (frt) obj);
            case 14:
                cr crVar2 = (cr) obj;
                return new mdw((uiq) obj2, (efw) ((hgp) crVar2.c).a, (ydw) crVar2.d, (vtm) crVar2.h, (dgw) crVar2.g);
            case 15:
                return new blw((l13) obj2, (naw) obj);
            case 16:
                return (wlw) new z2m(btf.b(new hav(15, (l13) obj2, (naw) ((clw) obj).b.getValue()))).c.getValue();
            case 17:
                return new rmw(((epw) obj2).a(), new dxv(24, (ikg) obj));
            case 18:
                return new yow((h4q) obj2, ((epw) obj).a().b());
            case 19:
                return new xow((qmw) obj2, ((epw) obj).a().b());
            case 20:
                x97.y((tf6) obj2, null, null, new duw((fuw) obj, objArr == true ? 1 : 0, 7), 3);
                return Unit.a;
            case 21:
                y0 y0Var = (y0) obj2;
                v5 v5Var = (v5) obj;
                m0 m0Var = y0Var.b;
                m0Var.getClass();
                if (((Boolean) m0Var.a.b(o.G)).booleanValue()) {
                    x97.y(m0Var.e, null, null, new we(m0Var, v5Var, objArr2 == true ? 1 : 0, c2 == true ? 1 : 0), 3);
                }
                a aVar = y0Var.a;
                if (v5Var instanceof i3) {
                    z0Var = x0.a;
                } else if (v5Var instanceof p3) {
                    z0Var = y0Var.z;
                } else if (v5Var instanceof m3) {
                    z0Var = y0Var.A;
                } else if (v5Var instanceof l3) {
                    z0Var = y0Var.B;
                } else if (v5Var instanceof k3) {
                    z0Var = y0Var.D;
                } else if (v5Var instanceof q4) {
                    z0Var = y0Var.n;
                } else if (v5Var.equals(y3.c)) {
                    z0Var = y0Var.C;
                } else if (v5Var instanceof k5) {
                    z0Var = y0Var.m;
                } else if (v5Var instanceof m4) {
                    z0Var = y0Var.G;
                } else {
                    if (v5Var instanceof g3) {
                        nVar = new n(aVar, w0.j);
                    } else if (v5Var instanceof h3) {
                        z0Var = y0Var.j;
                    } else if (v5Var instanceof c0) {
                        z0Var = y0Var.w;
                    } else if (v5Var instanceof d0) {
                        z0Var = y0Var.v;
                    } else if (v5Var instanceof s3) {
                        z0Var = y0Var.e0;
                    } else if (v5Var instanceof w3) {
                        z0Var = y0Var.r;
                    } else if (v5Var instanceof x3) {
                        z0Var = y0Var.d;
                    } else if (v5Var instanceof v3) {
                        z0Var = y0Var.I;
                    } else if (v5Var instanceof v4) {
                        z0Var = y0Var.f;
                    } else if (v5Var instanceof m5) {
                        nVar = new n(aVar, w0.k);
                    } else if (v5Var instanceof n5) {
                        nVar = new n(aVar, w0.l);
                    } else if (v5Var instanceof p5) {
                        z0Var = y0Var.J;
                    } else if (v5Var instanceof s4) {
                        nVar = new n(aVar, w0.m);
                    } else if (v5Var instanceof e5) {
                        z0Var = y0Var.k;
                    } else if (v5Var instanceof f5) {
                        z0Var = y0Var.h0;
                    } else if (v5Var instanceof i5) {
                        nVar = new n(aVar, w0.n);
                    } else if (v5Var instanceof a0) {
                        z0Var = y0Var.H;
                    } else if (v5Var instanceof d3) {
                        z0Var = y0Var.i;
                    } else if (v5Var instanceof f3) {
                        nVar = new n(aVar, w0.o);
                    } else if (v5Var instanceof d4) {
                        nVar = new n(aVar, w0.p);
                    } else if (v5Var instanceof b5) {
                        nVar = new n(aVar, w0.q);
                    } else if (v5Var instanceof g5) {
                        nVar = new n(aVar, w0.b);
                    } else if (v5Var instanceof h0) {
                        z0Var = y0Var.p;
                    } else if (v5Var.equals(z3.c)) {
                        nVar = new n(aVar, new v0(i2));
                    } else if (v5Var instanceof h4) {
                        z0Var = y0Var.l;
                    } else if (v5Var.equals(t4.c)) {
                        nVar = new n(aVar, new v0(c == true ? 1 : 0));
                    } else if (v5Var instanceof y4) {
                        z0Var = y0Var.W;
                    } else if (v5Var instanceof z4) {
                        z0Var = y0Var.V;
                    } else if (v5Var instanceof j3) {
                        z0Var = y0Var.h;
                    } else if (v5Var instanceof j5) {
                        nVar = new n(aVar, w0.c);
                    } else if (v5Var instanceof r5) {
                        z0Var = y0Var.x;
                    } else if (v5Var instanceof s5) {
                        nVar = new n(aVar, w0.d);
                    } else if (v5Var instanceof z) {
                        z0Var = y0Var.F;
                    } else if (v5Var instanceof e0) {
                        z0Var = y0Var.u;
                    } else if (v5Var instanceof a4) {
                        z0Var = y0Var.t;
                    } else if (v5Var instanceof e4) {
                        z0Var = y0Var.K;
                    } else if (v5Var instanceof c5) {
                        z0Var = y0Var.g;
                    } else if (v5Var instanceof y) {
                        nVar = new n(aVar, w0.e);
                    } else if (v5Var instanceof g0) {
                        z0Var = y0Var.s;
                    } else if (v5Var instanceof n3) {
                        nVar = new n(aVar, w0.f);
                    } else if (v5Var instanceof q3) {
                        nVar = new n(aVar, w0.g);
                    } else if (v5Var instanceof p4) {
                        nVar = new n(aVar, w0.h);
                    } else if (v5Var instanceof a5) {
                        nVar = new n(aVar, w0.i);
                    } else if (v5Var instanceof h5) {
                        z0Var = y0Var.q;
                    } else if (v5Var instanceof o3) {
                        z0Var = y0Var.c;
                    } else if (v5Var instanceof w4) {
                        z0Var = y0Var.e;
                    } else if (v5Var instanceof f0) {
                        z0Var = y0Var.o;
                    } else if (v5Var.equals(u5.c)) {
                        z0Var = y0Var.y;
                    } else if (v5Var instanceof u4) {
                        z0Var = y0Var.E;
                    } else if (v5Var instanceof o4) {
                        z0Var = y0Var.L;
                    } else if (v5Var instanceof j4) {
                        z0Var = y0Var.M;
                    } else if (v5Var instanceof b0) {
                        z0Var = y0Var.N;
                    } else if (v5Var instanceof n4) {
                        z0Var = y0Var.O;
                    } else if (v5Var instanceof q5) {
                        z0Var = y0Var.P;
                    } else if (v5Var instanceof r3) {
                        z0Var = y0Var.Q;
                    } else if (v5Var instanceof c4) {
                        z0Var = y0Var.R;
                    } else if (v5Var instanceof f4) {
                        z0Var = y0Var.S;
                    } else if (v5Var instanceof b4) {
                        z0Var = y0Var.T;
                    } else if (v5Var instanceof t5) {
                        z0Var = y0Var.U;
                    } else if (v5Var instanceof i4) {
                        z0Var = y0Var.X;
                    } else if (v5Var.equals(l4.c)) {
                        z0Var = y0Var.Y;
                    } else if (v5Var.equals(k4.c)) {
                        z0Var = y0Var.Z;
                    } else if (v5Var instanceof e3) {
                        z0Var = y0Var.a0;
                    } else if (v5Var instanceof o5) {
                        z0Var = y0Var.b0;
                    } else if (v5Var instanceof t3) {
                        z0Var = y0Var.c0;
                    } else if (v5Var instanceof d5) {
                        z0Var = y0Var.d0;
                    } else if (v5Var instanceof r4) {
                        z0Var = y0Var.f0;
                    } else if (v5Var instanceof g4) {
                        z0Var = y0Var.g0;
                    } else if (v5Var instanceof u3) {
                        z0Var = y0Var.i0;
                    } else if (v5Var instanceof x4) {
                        z0Var = y0Var.j0;
                    } else {
                        if (!(v5Var instanceof l5)) {
                            b6e.s();
                            return null;
                        }
                        z0Var = y0Var.k0;
                    }
                    z0Var = nVar;
                }
                if (z0Var == null) {
                    z0Var = null;
                }
                if (z0Var == null) {
                    xq0.q("Internal error: performer type mismatch");
                    return null;
                }
                Object u2 = z0Var.u(v5Var);
                z7o z7oVar = new z7o(u2);
                b bVar = b.b;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(bVar, null, "performMethod resulted in " + ((Object) z7o.b(u2)), 10);
                }
                return z7oVar;
            case 22:
                Context context = (Context) obj2;
                ContentResolver contentResolver = context.getContentResolver();
                contentResolver.getClass();
                Uri a2 = l.a(context.getPackageName());
                a2.getClass();
                return new f(new n(12, contentResolver, a2), new com.yandex.passport.internal.autologin.ui.a((IReporterYandex) ((jyr) ((com.yandex.passport.internal.push.z0) obj).c).getValue()));
            case 23:
                try {
                    return y6b.a((String) ((h) obj2).b.getValue(), (Context) obj, w6b.b, x6b.b);
                } catch (Exception unused) {
                    return null;
                }
            case 24:
                com.yandex.passport.internal.sloth.performers.f fVar = (com.yandex.passport.internal.sloth.performers.f) obj2;
                n0 n0Var = fVar.c;
                gm5 gm5Var = (gm5) obj;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(b.b, null, "Internal broadcast about SMS received", 8);
                }
                com.yandex.passport.internal.smsretriever.b bVar2 = fVar.b;
                n0Var.getClass();
                com.yandex.passport.internal.analytics.m0 m0Var2 = com.yandex.passport.internal.analytics.m0.SMS_CODE_ENTRY;
                l0 l0Var = l0.SMS_RETRIEVER_TRIGGERED;
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                n0Var.c(m0Var2, l0Var, e5bVar);
                m mVar = bVar2.b;
                jp0 jp0Var = mVar.f;
                s9f[] s9fVarArr = m.m;
                String str2 = (String) jp0Var.getValue(mVar, s9fVarArr[4]);
                com.yandex.passport.internal.analytics.m0 m0Var3 = com.yandex.passport.internal.analytics.m0.NONE;
                l0 l0Var2 = l0.WEBAM_SMS_RECEIVED;
                m mVar2 = bVar2.b;
                n0Var.c(m0Var3, l0Var2, uah.e(new Pair("code_from", String.valueOf((String) mVar2.g.getValue(mVar2, s9fVarArr[5]))), new Pair("have_code", String.valueOf(str2 != null))));
                if (str2 != null) {
                    gm5Var.U(new l2b(new w(str2)));
                } else {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(b.e, null, "We received SMS meant for us, but there was no code in it", 8);
                    }
                    d dVar = d.e;
                    gm5Var.U(dVar instanceof s ? new l2b(dVar) : new m2b(dVar));
                }
                return Unit.a;
            case 25:
                com.yandex.passport.internal.utils.b bVar3 = (com.yandex.passport.internal.utils.b) obj;
                try {
                    ((ConnectivityManager) obj2).unregisterNetworkCallback(bVar3);
                    com.yandex.plus.core.network.api.utils.a.i(bVar3.hashCode(), "unregisterNetworkCallback");
                } catch (Exception e) {
                    com.yandex.plus.core.network.api.utils.a.j(bVar3.hashCode(), e, "unregisterNetworkCallback");
                }
                return Unit.a;
            case 26:
                x97.y((com.yandex.passport.sloth.ui.b0) obj2, null, null, new com.yandex.passport.sloth.ui.a0((a1) obj, objArr3 == true ? 1 : 0, i2), 3);
                return Unit.a;
            case 27:
                ((com.yandex.plus.acquisition.sdk.button.section.ui.impl.di.b) ((c) obj2).b.getValue()).getClass();
                return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.f((Context) obj, null, R.attr.acquisition_sdk_buttonSectionStyle, R.style.AcquisitionSdk_Widget_ButtonSection);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Context context2 = (Context) ((n) obj2).c;
                context2.getClass();
                String str3 = ((com.yandex.plus.acquisition.sdk.button.section.ui.impl.legals.a) obj).c;
                str3.getClass();
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str3));
                    intent.setFlags(268435456);
                    context2.startActivity(intent);
                } catch (ActivityNotFoundException unused2) {
                }
                return Unit.a;
            default:
                Set e2 = vop.e(((com.yandex.plus.bdui.action.b) obj2).a);
                e2.getClass();
                return com.yandex.plus.core.network.api.utils.a.y(tah.b(new Pair(t.a, e2)), (Map) obj);
        }
    }
}
