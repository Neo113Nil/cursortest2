package defpackage;

import android.text.TextUtils;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.catalog.info.FullInfoActivity;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes3.dex */
public final /* synthetic */ class esl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qzl b;
    public final /* synthetic */ nab c;
    public final /* synthetic */ thj d;

    public /* synthetic */ esl(qzl qzlVar, nab nabVar, thj thjVar, int i) {
        this.a = i;
        this.b = qzlVar;
        this.c = nabVar;
        this.d = thjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        u0s u0sVar;
        String str;
        String str2;
        String str3 = null;
        switch (this.a) {
            case 0:
                qzl qzlVar = this.b;
                nab nabVar = this.c;
                thj thjVar = this.d;
                qzlVar.getClass();
                nabVar.getClass();
                thjVar.getClass();
                sjb D = irf.D((laa) qzlVar.q.getValue());
                if (D != null) {
                    rmb.a(qzlVar.h.a(nabVar, null), D, thjVar, null, 10);
                }
                n0m n0mVar = qzlVar.a;
                ayl aylVar = new ayl(0, qzlVar.b, cxl.class, "openPaywall", "openPaywall()V", 0, 7);
                n0mVar.getClass();
                n0mVar.s.F(aylVar);
                break;
            case 1:
                qzl qzlVar2 = this.b;
                nab nabVar2 = this.c;
                thj thjVar2 = this.d;
                qzlVar2.getClass();
                nabVar2.getClass();
                thjVar2.getClass();
                rmb.a(qzlVar2.h.a(nabVar2, null), ((Boolean) qzlVar2.m.getValue()).booleanValue() ? sjb.Unlike : sjb.Like, thjVar2, null, 10);
                qzlVar2.a.r.c();
                break;
            case 2:
                qzl qzlVar3 = this.b;
                nab nabVar3 = this.c;
                thj thjVar3 = this.d;
                qzlVar3.getClass();
                nabVar3.getClass();
                thjVar3.getClass();
                rmb.j(qzlVar3.h.a(nabVar3, null), wjb.TrailerScreen, thjVar3, null, 12);
                qzlVar3.b.c(qzlVar3.d.e());
                break;
            case 3:
                qzl qzlVar4 = this.b;
                nab nabVar4 = this.c;
                thj thjVar4 = this.d;
                qzlVar4.getClass();
                nabVar4.getClass();
                thjVar4.getClass();
                ndc ndcVar = (ndc) qzlVar4.v.getValue();
                ndcVar.getClass();
                if (!ndcVar.equals(hdc.a) && !ndcVar.equals(jdc.a)) {
                    if (!(ndcVar instanceof ldc)) {
                        b6e.s();
                        break;
                    } else {
                        ldc ldcVar = (ldc) ndcVar;
                        hcc hccVar = (hcc) ldcVar.a.get(ldcVar.b);
                        boolean z = ldcVar.c;
                        hccVar.getClass();
                        u0sVar = new u0s(hccVar.a, hccVar.c + 1, z);
                    }
                } else {
                    u0sVar = null;
                }
                rmb a = qzlVar4.h.a(nabVar4, u0sVar);
                n0m n0mVar2 = qzlVar4.a;
                n0mVar2.getClass();
                String t = weo.t();
                Boolean bool = (Boolean) n0mVar2.H.getValue();
                bool.getClass();
                yzk yzkVar = n0mVar2.L;
                if (yzkVar != null) {
                    yzkVar.h(t);
                }
                boolean booleanValue = bool.booleanValue();
                t.getClass();
                if (booleanValue) {
                    rmb.a(a, sjb.Pause, thjVar4, null, 10);
                } else {
                    a.m(null, thjVar4, t);
                }
                break;
            case 4:
                qzl qzlVar5 = this.b;
                nab nabVar5 = this.c;
                thj thjVar5 = this.d;
                qzlVar5.getClass();
                nabVar5.getClass();
                thjVar5.getClass();
                rmb.a(qzlVar5.h.a(nabVar5, null), sjb.Ok, thjVar5, null, 10);
                qzlVar5.a.s.E();
                break;
            case 5:
                qzl qzlVar6 = this.b;
                nab nabVar6 = this.c;
                thj thjVar6 = this.d;
                qzlVar6.getClass();
                nabVar6.getClass();
                thjVar6.getClass();
                rmb.j(qzlVar6.h.a(nabVar6, null), wjb.SearchScreen, thjVar6, null, 12);
                qzlVar6.b.b(qzlVar6.d, qzlVar6.f);
                break;
            case 6:
                this.b.e(this.c, this.d);
                break;
            case 7:
                qzl qzlVar7 = this.b;
                nab nabVar7 = this.c;
                thj thjVar7 = this.d;
                qzlVar7.getClass();
                nabVar7.getClass();
                thjVar7.getClass();
                rmb.j(qzlVar7.h.a(nabVar7, null), wjb.CoverScreen, thjVar7, null, 12);
                cxl cxlVar = qzlVar7.b;
                cvl cvlVar = qzlVar7.d;
                String str4 = qzlVar7.g;
                cvlVar.getClass();
                if (!cvlVar.d() && !"414787002:1076".equals(cvlVar.e())) {
                    int i = FullInfoActivity.g;
                    PlaylistScreenActivity playlistScreenActivity = cxlVar.a;
                    playlistScreenActivity.getClass();
                    drt drtVar = cvlVar.c;
                    if (!ivf.I(cvlVar) && !TextUtils.isEmpty(drtVar.c)) {
                        str3 = g3o.c(R.string.playlist_owner_pattern, drtVar.c);
                    }
                    String str5 = str3;
                    co6 c = op7.c(cvlVar);
                    String str6 = drtVar.a;
                    String str7 = cvlVar.a;
                    CoverPath coverPath = c.a;
                    qo6 qo6Var = c.b;
                    tn6 tn6Var = cvlVar.p;
                    String str8 = cvlVar.b;
                    int i2 = cvlVar.g;
                    long j = cvlVar.j;
                    if (i2 <= 0) {
                        str2 = g3o.b(R.string.play_list_empty_text);
                        str2.getClass();
                        str = str4;
                    } else {
                        l18 l18Var = l18.b;
                        bdt I = hag.I(skr.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        str = str4;
                        String b = ((skr) qdcVar.C(I)).b(R.plurals.plural_n_tracks_rtl_support, i2, Integer.valueOf(i2));
                        String M = saf.M(j);
                        if (j > 0) {
                            str2 = b + StringUtil.SPACE + g3o.b(R.string.dash) + StringUtil.SPACE + M;
                        } else {
                            str2 = b;
                        }
                    }
                    playlistScreenActivity.startActivity(wdp.l0(playlistScreenActivity, new ixc(str6, str7, coverPath, qo6Var, tn6Var, str8, str2.toString(), str5, str), false));
                }
                break;
            case 8:
                this.b.e(this.c, this.d);
                break;
            default:
                qzl qzlVar8 = this.b;
                nab nabVar8 = this.c;
                thj thjVar8 = this.d;
                qzlVar8.getClass();
                nabVar8.getClass();
                thjVar8.getClass();
                rmb.j(qzlVar8.h.a(nabVar8, null), wjb.TextScreen, thjVar8, null, 12);
                cxl cxlVar2 = qzlVar8.b;
                cvl cvlVar2 = qzlVar8.d;
                cvlVar2.getClass();
                ywf.F(cvlVar2, (dy7) cxlVar2.i.getValue(), cxlVar2.f, pd.t(new qzm[0]), cxlVar2.b);
                break;
        }
        return Unit.a;
    }
}
