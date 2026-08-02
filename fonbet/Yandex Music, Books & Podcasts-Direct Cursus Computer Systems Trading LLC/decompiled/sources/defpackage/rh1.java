package defpackage;

import android.net.Uri;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.plus.bdui.plus.analytics.f;
import com.yandex.plus.bdui.plus.analytics.g;
import com.yandex.plus.core.analytics.h;
import com.yandex.plus.log.api.b;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes3.dex */
public final /* synthetic */ class rh1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rh1(u51 u51Var, qi1 qi1Var, qnq qnqVar, String str, e00 e00Var) {
        this.a = 2;
        this.b = u51Var;
        this.c = qi1Var;
        this.d = qnqVar;
        this.e = str;
        this.f = e00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        int i = 1;
        switch (this.a) {
            case 0:
                return new sj1((hj1) this.d, (u51) this.b, (tmb) this.e, ((th1) this.c).b, (uh1) this.f);
            case 1:
                xpt xptVar = (xpt) this.c;
                bi1 bi1Var = (bi1) this.d;
                u51 u51Var = (u51) this.b;
                na1 na1Var = (na1) this.e;
                v5 v5Var = (v5) this.f;
                String t = weo.t();
                z = xptVar != null ? xptVar.f : false;
                z5l z5lVar = (z5l) ((jyr) bi1Var.p).getValue();
                e eVar = (e) ((jyr) bi1Var.q).getValue();
                PlaybackScope f = d.f(u51Var.a, u51Var.b);
                eVar.getClass();
                asq.t(z5l.h(z5lVar, f.e(u51Var), xptVar, null, na1Var.a(), ((kxi) bi1Var.d).a(t), 20), (np2) bi1Var.b, new ps(z, bi1Var, i));
                v5Var.invoke(t);
                return Unit.a;
            case 2:
                u51 u51Var2 = (u51) this.b;
                qi1 qi1Var = (qi1) this.c;
                qnq qnqVar = (qnq) this.d;
                String str = (String) this.e;
                e00 e00Var = (e00) this.f;
                kxi kxiVar = qnqVar.d;
                Object obj = e00Var.b;
                String str2 = u51Var2.a;
                bdt I = hag.I(gj1.class);
                qdc qdcVar = e00Var.a;
                qdcVar.getClass();
                gj1 gj1Var = (gj1) qdcVar.C(I);
                bdt I2 = hag.I(ab1.class);
                qdc qdcVar2 = e00Var.a;
                qdcVar2.getClass();
                ab1 ab1Var = (ab1) qdcVar2.C(I2);
                bdt I3 = hag.I(upq.class);
                qdc qdcVar3 = e00Var.a;
                qdcVar3.getClass();
                upq upqVar = (upq) qdcVar3.C(I3);
                bdt I4 = hag.I(xpq.class);
                qdc qdcVar4 = e00Var.a;
                qdcVar4.getClass();
                rdk rdkVar = new rdk(str2, gj1Var, ab1Var, upqVar, (gnq) qdcVar4.C(I4));
                bdt I5 = hag.I(xpq.class);
                qdc qdcVar5 = e00Var.a;
                qdcVar5.getClass();
                xpq xpqVar = (xpq) qdcVar5.C(I5);
                bdt I6 = hag.I(l63.class);
                qdc qdcVar6 = e00Var.a;
                qdcVar6.getClass();
                l63 l63Var = (l63) qdcVar6.C(I6);
                bdt I7 = hag.I(oj1.class);
                qdc qdcVar7 = e00Var.a;
                qdcVar7.getClass();
                return new mj1(u51Var2, qi1Var, kxiVar, str, new bk1(rdkVar, (oj1) qdcVar7.C(I7), xpqVar, l63Var), e00Var);
            case 3:
                String str3 = (String) this.c;
                g24 g24Var = (g24) this.d;
                hvq hvqVar = (hvq) this.b;
                zsq zsqVar = (zsq) this.e;
                j54 j54Var = (j54) this.f;
                if (str3 != null && g24Var != null) {
                    hvqVar.x(zsqVar);
                    j54Var.c(str3, g24Var);
                }
                return Unit.a;
            case 4:
                return new g01((String) this.c, (dy5) this.d, (i06) this.b, (tmb) this.e, (fp5) this.f);
            case 5:
                return new i61((jnq) this.c, (vg6) this.d, (kxi) this.b, (tmb) this.e, (fp5) this.f);
            case 6:
                try {
                    return xwd.a((xwd) this.c, (db7) ((xqn) this.d).a, (Uri) this.b, (nb7) this.e, ((tqn) this.f).a);
                } catch (SocketTimeoutException e) {
                    throw e;
                } catch (InterruptedIOException unused) {
                    b6e.h();
                    return null;
                }
            case 7:
                es6 es6Var = (es6) this.c;
                cvo cvoVar = (cvo) this.d;
                zh zhVar = (zh) this.b;
                String str4 = (String) this.e;
                cmf cmfVar = (cmf) this.f;
                l18 l18Var = l18.b;
                bdt I8 = hag.I(upq.class);
                qdc qdcVar8 = l18Var.a;
                qdcVar8.getClass();
                upq upqVar2 = (upq) qdcVar8.C(I8);
                hla hlaVar = new hla(((kxi) es6Var.b).a, cvoVar, (tmb) es6Var.a, zhVar);
                uvf uvfVar = (uvf) hlaVar.d;
                hnq hnqVar = hnq.a;
                uvfVar.getClass();
                return new uoq(str4, null, null, new cjf(str4, upqVar2, uvfVar, cmfVar, hnqVar, null), hlaVar);
            case 8:
                ud3 ud3Var = (ud3) this.c;
                zuq zuqVar = (zuq) this.d;
                hvq hvqVar2 = (hvq) this.b;
                zsq zsqVar2 = (zsq) this.e;
                aqi aqiVar = (aqi) this.f;
                if (ud3Var.d) {
                    zuqVar.a();
                    hvqVar2.A(((Boolean) aqiVar.getValue()).booleanValue(), zsqVar2);
                }
                return Unit.a;
            case 9:
                return new wkp((wsh) this.c, (f7l) this.d, (uol) this.b, (k1l) this.e, (zgh) this.f);
            case 10:
                return new wgh(ydr.a(Boolean.FALSE), ((eth) this.c).a, (f7l) this.d, (wsh) this.b, (wnh) ((jyr) this.e).getValue(), (ath) this.f);
            case 11:
                xpt xptVar2 = (xpt) this.c;
                bml bmlVar = (bml) this.d;
                cxl cxlVar = (cxl) this.b;
                cvl cvlVar = (cvl) this.e;
                List list = (List) this.f;
                String t2 = weo.t();
                z = xptVar2 != null ? xptVar2.f : false;
                bmlVar.invoke(t2);
                asq.t(z5l.h((z5l) cxlVar.h.getValue(), cxlVar.d(cvlVar, null), xptVar2, null, list, cxlVar.f.a(t2), 20), cxlVar.a, new ps(z, cxlVar, 7));
                return Unit.a;
            case 12:
                c3r c3rVar = (c3r) this.c;
                nru nruVar = (nru) this.d;
                gsu gsuVar = (gsu) this.b;
                String str5 = (String) this.e;
                sai saiVar = (sai) this.f;
                if (c3rVar != null) {
                    ((nw7) c3rVar).a();
                }
                nruVar.g(gsuVar, str5);
                saiVar.a();
                return Unit.a;
            case 13:
                Function1 function1 = (Function1) this.c;
                String str6 = (String) this.d;
                String str7 = (String) this.b;
                String str8 = (String) this.e;
                String str9 = (String) this.f;
                StringBuilder m = tlm.m(str6, StringUtil.LF);
                if (str7 != null) {
                    m.append(str7);
                    m.append(StringUtil.LF);
                }
                m.append(str8);
                m.append(StringUtil.LF);
                m.append(str9);
                function1.invoke(m.toString());
                return Unit.a;
            default:
                Function0 function0 = (Function0) this.c;
                b bVar = (b) this.d;
                h hVar = (h) this.b;
                return new com.yandex.plus.bdui.plus.analytics.h(u75.h(new f(function0, bVar), new g(hVar, bVar, null), new com.yandex.plus.bdui.plus.analytics.e(hVar, bVar, null, (byte) 0)), bVar, new gqj((Function0) this.e, (Function0) this.f, i));
        }
    }

    public /* synthetic */ rh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
