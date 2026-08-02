package defpackage;

import android.app.Activity;
import com.yandex.music.shared.artist.screen.network.ArtistSkeletonApi;
import com.yandex.music.shared.artists.top.data.ArtistsTopApi;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.list_player_manager.model.Stream;
import ru.yandex.video.m3.list_player_manager.model.StreamType;

/* loaded from: classes4.dex */
public final /* synthetic */ class ri1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ri1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        htr htrVar;
        boolean z = false;
        Object[] objArr = 0;
        int i = 9;
        jyr jyrVar = null;
        switch (this.a) {
            case 0:
                si1 si1Var = (si1) this.b;
                jyr jyrVar2 = si1Var.b;
                ((y18) jyrVar2.getValue()).getClass();
                b9s[] b9sVarArr = d9s.a;
                if (d9s.a(b9s.f)) {
                    y18 y18Var = (y18) jyrVar2.getValue();
                    Activity activity = si1Var.a;
                    y18Var.getClass();
                    z = !a28.a(activity);
                }
                return Boolean.valueOf(z);
            case 1:
                tj1 tj1Var = (tj1) this.b;
                return new s11((upq) tj1Var.a.a.getValue(), tj1Var.c, tj1Var.d, tj1Var.b);
            case 2:
                rdk rdkVar = (rdk) this.b;
                return (ArtistSkeletonApi) upq.b((upq) rdkVar.f, null, new v5(i, rdkVar), 1).a.b(ArtistSkeletonApi.class);
            case 3:
                List list = ((sk1) this.b).b.i;
                return list == null ? c5b.a : list;
            case 4:
                return new pm1((rm1) this.b);
            case 5:
                ((rm1) ((zl) this.b).b).getClass();
                quk qukVar = htr.f;
                String language = swf.I().getLanguage();
                language.getClass();
                qukVar.getClass();
                int hashCode = language.hashCode();
                if (hashCode == 3424) {
                    if (language.equals("kk")) {
                        htrVar = htr.j;
                    }
                    htrVar = htr.g;
                } else if (hashCode != 3651) {
                    if (hashCode == 3749 && language.equals("uz")) {
                        htrVar = htr.i;
                    }
                    htrVar = htr.g;
                } else {
                    if (language.equals("ru")) {
                        htrVar = htr.h;
                    }
                    htrVar = htr.g;
                }
                return htrVar.c;
            case 6:
                return (ArtistsTopApi) ((e0j) ((arf) this.b).getValue()).a.b(ArtistsTopApi.class);
            case 7:
                return ((dc7) ((jp1) this.b).a).b("artists_top");
            case 8:
                c4 c4Var = (c4) this.b;
                return new y3((qp1) c4Var.d, (wn5) c4Var.e);
            case 9:
                return asq.K(((nv1) this.b).a, new uv1(objArr == true ? 1 : 0));
            case 10:
                iw1 iw1Var = (iw1) this.b;
                mal.a();
                if (iw1Var.g != null) {
                    iw1Var.i();
                    iw1Var.g = null;
                }
                return Unit.a;
            case 11:
                return krh.d(((px1) this.b).a);
            case 12:
                return l1b.c(((rx1) this.b).a);
            case 13:
                a32 a32Var = (a32) this.b;
                return new tnb(a32Var.a, a32Var.b, jyrVar, 28);
            case 14:
                e32 e32Var = (e32) this.b;
                return new vnb(e32Var.a, e32Var.b.a);
            case 15:
                ((t32) this.b).k.getClass();
                return new q12();
            case 16:
                return ((w42) this.b).c.a();
            case 17:
                return (pjc) ((s72) this.b).a.r.getValue();
            case 18:
                return ((h82) this.b).c.a();
            case 19:
                return ((za2) this.b).d.a();
            case 20:
                return new wjg(2, new kme((gnq) this.b));
            case 21:
                bb2 bb2Var = (bb2) this.b;
                erf erfVar = new erf(new j3(26));
                upq d = bb2Var.a.d();
                hnq hnqVar = hnq.a;
                d.getClass();
                return new cjf("CarPlay_main", d, erfVar, null, hnqVar, null);
            case 22:
                qe2 qe2Var = (qe2) this.b;
                grc grcVar = frc.a;
                grcVar.getClass();
                grcVar.a.remove(qe2Var);
                return Unit.a;
            case 23:
                return new og2(((e00) this.b).b(hag.I(kg2.class), true));
            case 24:
                yj2 yj2Var = (yj2) this.b;
                String str = yj2Var.g;
                String str2 = yj2Var.b;
                String str3 = yj2Var.c;
                if (str == null || StringsKt.U(str) || !yj2Var.i) {
                    List c = t75.c(new Stream(StreamType.HLS, yj2Var.a));
                    c.getClass();
                    return new imh(str3, str2, null, c);
                }
                c5b c5bVar = c5b.a;
                c5bVar.getClass();
                return new imh(str3, str2, str, c5bVar);
            case 25:
                return (vo2) ((ri1) this.b).invoke();
            case 26:
                l13 l13Var = ((jn2) ((e00) this.b).b).a;
                e00 e00Var = ((oo2) l13Var.a.D(hag.I(oo2.class), l13Var, l13Var.b)).a;
                l13 l13Var2 = ((in2) e00Var.b).a;
                return new yo2((xm2) ((en2) l13Var2.a.D(hag.I(en2.class), l13Var2, l13Var2.b)).a.getValue(), e00Var.b(hag.I(sm2.class), true), e00Var.b(hag.I(fzi.class), true));
            case 27:
                jt2 jt2Var = (jt2) this.b;
                ez ezVar = new ez(jt2Var.a.c, 19);
                u21 u21Var = jt2Var.c.e;
                y4s y4sVar = new y4s(frc.a.g, 3);
                xdr xdrVar = jt2Var.e;
                t5s t5sVar = jt2Var.b;
                return zsd.b0(lg3.L(ezVar, u21Var, y4sVar, xdrVar, new mpq(i, t5sVar.f.getData(), t5sVar), new cz(jt2Var.d.d(), jt2Var, 14), new gt2(7, 4, jt2.class, jt2Var, "isShowNeed", "isShowNeed(ZLcom/yandex/music/screen/charge/domain/model/BatteryStatus;ZJZZ)Z")));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((dc7) ((lx2) this.b).a).b("battery_permissions");
            default:
                ((zx4) ((x83) this.b).m.getValue()).getClass();
                return new u83();
        }
    }
}
