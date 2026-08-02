package defpackage;

import android.app.Activity;
import androidx.fragment.app.y;
import com.connectsdk.service.config.ServiceDescription;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes3.dex */
public final class s3e extends m18 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s3e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        fcc fccVar;
        int i = this.b;
        mqsVar.getClass();
        switch (i) {
            case 0:
                u3e u3eVar = (u3e) this.c;
                rmb rmbVar = u3eVar.g;
                wjb wjbVar = wjb.BottomsheetScreen;
                thj thjVar = (thj) this.f;
                mdc mdcVar = (mdc) this.d;
                if (mdcVar != null) {
                    ArrayList arrayList = mdcVar.a;
                    int i2 = mdcVar.b;
                    hcc hccVar = (hcc) arrayList.get(i2);
                    hccVar.getClass();
                    fccVar = new fcc(ServiceDescription.KEY_FILTER, hccVar.a, i2 + 1);
                } else {
                    fccVar = null;
                }
                rmb.j(rmbVar, wjbVar, thjVar, fccVar, 8);
                rdk rdkVar = u3eVar.e;
                cvl cvlVar = u3eVar.c;
                cvlVar.getClass();
                int ordinal = ((ezb) l18.b.b(hag.I(ezb.class), true).getValue()).a().ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        b6e.s();
                        break;
                    } else if (mqsVar.i() != null) {
                    }
                }
                rre.Z(mqsVar, zus.b, y5g.w0(cvlVar), new ve(muo.PLAYLIST, zqt.b), (Activity) rdkVar.b, (y) rdkVar.d, (kxi) rdkVar.e, (PlaybackScope) ((jyr) rdkVar.c).getValue(), null, null, cvlVar, 768);
                break;
            default:
                List list = (List) this.c;
                rmb.j((rmb) this.f, wjb.BottomsheetScreen, szf.M(mqsVar, 0, list.indexOf(mqsVar)), null, 12);
                qzl qzlVar = (qzl) this.d;
                cxl cxlVar = qzlVar.b;
                cvl cvlVar2 = qzlVar.d;
                cvlVar2.getClass();
                int ordinal2 = ((ezb) l18.b.b(hag.I(ezb.class), true).getValue()).a().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        b6e.s();
                        break;
                    } else if (mqsVar.i() != null) {
                    }
                }
                rre.Z(mqsVar, zus.b, y5g.w0(cvlVar2), new ve(muo.PLAYLIST, zqt.b), cxlVar.a, cxlVar.b, cxlVar.f, cxlVar.c, null, new nvs(cvlVar2, list), cvlVar2, 256);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019f  */
    @Override // defpackage.ag5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(mqs mqsVar) {
        String str;
        c g;
        hcc hccVar;
        switch (this.b) {
            case 0:
                mdc mdcVar = (mdc) this.d;
                thj thjVar = (thj) this.f;
                mqsVar.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                boolean h = ((x35) ((byb) qdcVar.C(I)).c(ern.a(x35.class))).h();
                u3e u3eVar = (u3e) this.c;
                rdk rdkVar = u3eVar.e;
                if (h) {
                    a0g.G((Activity) rdkVar.b, mqsVar, new vd(27, u3eVar, (mqs) this.e, thjVar));
                    break;
                } else {
                    cvl cvlVar = u3eVar.c;
                    Continuation continuation = null;
                    q3e q3eVar = new q3e(u3eVar, continuation, 1);
                    if (mdcVar != null && (hccVar = (hcc) mdcVar.a.get(mdcVar.b)) != null) {
                        String str2 = hccVar.a;
                        if (!str2.equals("all")) {
                            str = str2;
                            p3e p3eVar = new p3e(1, u3eVar, thjVar, mdcVar);
                            cvlVar.getClass();
                            String str3 = cvlVar.a;
                            drt drtVar = cvlVar.c;
                            bd5 zc5Var = (str != null || StringsKt.U(str)) ? new zc5(drtVar.a, str3) : new ad5(drtVar.a, str3, str);
                            e eVar = (e) rdkVar.g;
                            PlaybackScope playbackScope = (PlaybackScope) ((jyr) rdkVar.c).getValue();
                            p3q p3qVar = new p3q(zc5Var, o3q.b, new n3q(cvlVar.b));
                            eVar.getClass();
                            g = e.g(playbackScope, p3qVar);
                            String t = weo.t();
                            if (!((z5l) rdkVar.f).c(g, mqsVar, false)) {
                                ((z5l) rdkVar.f).i(false);
                                break;
                            } else {
                                sfm sfmVar = new sfm(new hv0(new hv0(q3eVar, continuation, 8), continuation, 27));
                                a6l a = ((kxi) rdkVar.e).a(t);
                                a0g.G((Activity) rdkVar.b, mqsVar, new ye(rdkVar, new se5(new ubn(), g, sfmVar, null, 0, null, mqsVar, -1, -1L, new pe5(new v80(g.a(), a.a, a.b), null), new tb(cvlVar), false, str, new r0q(0)), p3eVar, t, 17));
                                break;
                            }
                        }
                    }
                    str = null;
                    p3e p3eVar2 = new p3e(1, u3eVar, thjVar, mdcVar);
                    cvlVar.getClass();
                    String str32 = cvlVar.a;
                    drt drtVar2 = cvlVar.c;
                    if (str != null) {
                    }
                    e eVar2 = (e) rdkVar.g;
                    PlaybackScope playbackScope2 = (PlaybackScope) ((jyr) rdkVar.c).getValue();
                    p3q p3qVar2 = new p3q(zc5Var, o3q.b, new n3q(cvlVar.b));
                    eVar2.getClass();
                    g = e.g(playbackScope2, p3qVar2);
                    String t2 = weo.t();
                    if (!((z5l) rdkVar.f).c(g, mqsVar, false)) {
                    }
                }
                break;
            default:
                mqsVar.getClass();
                List list = (List) this.c;
                int indexOf = list.indexOf(mqsVar);
                thj M = szf.M(mqsVar, 0, indexOf);
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                boolean h2 = ((k94) ((byb) qdcVar2.C(I2)).c(ern.a(k94.class))).h();
                qzl qzlVar = (qzl) this.d;
                cxl cxlVar = qzlVar.b;
                if (!h2) {
                    cvl cvlVar2 = qzlVar.d;
                    hcc hccVar2 = (hcc) this.e;
                    String str4 = null;
                    if (hccVar2 != null) {
                        String str5 = hccVar2.a;
                        if (!str5.equals("all")) {
                            str4 = str5;
                        }
                    }
                    ae5 ae5Var = new ae5((rmb) this.f, M, 1);
                    cvlVar2.getClass();
                    c d = cxlVar.d(cvlVar2, str4);
                    String t3 = weo.t();
                    if (!((z5l) cxlVar.h.getValue()).c(d, mqsVar, false)) {
                        qe5 h3 = l3l.h(d, list, cxlVar.f.a(t3));
                        h3.c(cvlVar2);
                        h3.l = str4;
                        h3.g = mqsVar;
                        h3.e = -1;
                        a0g.G(cxlVar.a, mqsVar, new h0l(cxlVar, h3.b(), ae5Var, t3, 1));
                        break;
                    } else if (!((z5l) cxlVar.h.getValue()).i(false)) {
                        ae5Var.invoke(Boolean.TRUE, t3);
                        break;
                    } else {
                        ae5Var.invoke(Boolean.FALSE, t3);
                        break;
                    }
                } else {
                    a0g.G(cxlVar.a, mqsVar, new gk1(qzlVar, indexOf, (List) this.c, (rmb) this.f, M));
                    break;
                }
        }
    }
}
