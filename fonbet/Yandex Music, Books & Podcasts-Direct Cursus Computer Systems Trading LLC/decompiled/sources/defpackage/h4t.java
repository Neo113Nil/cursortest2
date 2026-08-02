package defpackage;

import android.content.Context;
import android.database.DatabaseUtils;
import com.google.gson.GsonBuilder;
import com.yandex.music.shared.trailers.api.data.TrackWithSmartPreviewJsonDeserializer;
import com.yandex.music.shared.trailers.api.model.TrackWithSmartPreviewDto;
import com.yandex.pulse.metrics.o;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KTypeProjection;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes3.dex */
public final /* synthetic */ class h4t implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ h4t(yct yctVar) {
        this.a = 15;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        n7q n7qVar;
        drt drtVar;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                String sqlEscapeString = DatabaseUtils.sqlEscapeString(str);
                sqlEscapeString.getClass();
                return sqlEscapeString;
            case 1:
                e6l e6lVar = (e6l) obj;
                e6lVar.getClass();
                d6l x = p6g.x(e6lVar);
                return Integer.valueOf((x == null || (n7qVar = x.a) == null) ? 0 : f8g.F(n7qVar));
            case 2:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.x(jfpVar, 2.0f);
                return Unit.a;
            case 3:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.w(jfpVar2);
                return Unit.a;
            case 4:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.x(jfpVar3, 0.0f);
                return Unit.a;
            case 5:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.x(jfpVar4, 1.0f);
                return Unit.a;
            case 6:
                ((jfp) obj).getClass();
                return Unit.a;
            case 7:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new k6t((i0j) l13Var.a.D(hag.I(i0j.class), l13Var, l13Var.b));
            case 8:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(oq7.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new b5t(((oq7) qdcVar.C(I)).a, (z5l) l13Var2.a.D(hag.I(z5l.class), l13Var2, l13Var2.b), (e) l13Var2.a.D(hag.I(e.class), l13Var2, l13Var2.b), (g0l) l13Var2.a.D(hag.I(g0l.class), l13Var2, l13Var2.b), (cut) l13Var2.a.D(hag.I(cut.class), l13Var2, l13Var2.b), (k21) l13Var2.a.D(hag.I(k21.class), l13Var2, l13Var2.b), (ay) l13Var2.a.D(hag.I(ay.class), l13Var2, l13Var2.b), (t3g) l13Var2.a.D(hag.I(t3g.class), l13Var2, l13Var2.b), new lum((Context) l13Var2.a.D(hag.I(Context.class), l13Var2, l13Var2.b)), (z4c) l13Var2.a.D(hag.I(z4c.class), l13Var2, l13Var2.b));
            case 9:
                vz1.e((o18) obj, x5t.class).D(new h4t(10));
                return Unit.a;
            case 10:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new x5t((Context) l13Var3.a.D(hag.I(Context.class), l13Var3, l13Var3.b));
            case 11:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(TrackWithSmartPreviewDto.class, new TrackWithSmartPreviewJsonDeserializer());
                return Unit.a;
            case 12:
                cko ckoVar = (cko) obj;
                ckoVar.getClass();
                return Boolean.valueOf(ckoVar.q());
            case 13:
                cko ckoVar2 = (cko) obj;
                ckoVar2.getClass();
                mnp mnpVar = new mnp();
                while (ckoVar2.q()) {
                    mnpVar.add(Integer.valueOf((int) ckoVar2.getLong(0)));
                }
                return uop.a(mnpVar);
            case 14:
                ((jfp) obj).getClass();
                return Unit.a;
            case 15:
                ((KTypeProjection) obj).getClass();
                return "*";
            case 16:
                ((psf) obj).getClass();
                return new ypd(fgq.o(psf.c));
            case 17:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, mjt.class).E(new h4t(18));
                o18Var.b(hag.I(wjt.class)).E(new h4t(19));
                o18Var.b(hag.I(zjt.class)).E(new h4t(20));
                return Unit.a;
            case 18:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new mjt((e0j) l13Var4.a.D(hag.I(e0j.class), l13Var4, l13Var4.b));
            case 19:
                ((l13) obj).getClass();
                return new wjt();
            case 20:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new zjt((mjt) l13Var5.a.D(hag.I(mjt.class), l13Var5, l13Var5.b));
            case 21:
                yxc yxcVar = (yxc) obj;
                return new Pair((yxcVar == null || (drtVar = yxcVar.a) == null) ? null : Boolean.valueOf(drtVar.d), yxcVar != null ? Boolean.valueOf(yxcVar.h) : null);
            case 22:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, tc.class).E(new h4t(23));
                o18Var2.b(hag.I(gst.class)).E(new h4t(24));
                o18Var2.b(hag.I(frt.class)).E(new h4t(25));
                o18Var2.b(hag.I(dqi.class)).E(new h4t(26));
                o18Var2.b(hag.I(jv0.class)).E(new h4t(27));
                o18Var2.b(hag.I(irt.class)).D(new h4t(28));
                o18Var2.b(hag.I(gos.class)).E(new h4t(29));
                o18Var2.b(hag.I(cpr.class)).E(new grt(0));
                return Unit.a;
            case 23:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new tc((e0j) l13Var6.a(hag.I(e0j.class)));
            case 24:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new gst(l13Var7.b(hag.I(av0.class), true), l13Var7.b(hag.I(tc.class), true));
            case 25:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return (dqi) ((ani) l13Var8.a.D(hag.I(ani.class), l13Var8, l13Var8.b)).h.getValue();
            case 26:
                return (dqi) vz1.l((l13) obj, av0.class);
            case 27:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return new jv0(l13Var9.b(hag.I(cc7.class), true), l13Var9.b(hag.I(uz1.class), true));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((l13) obj).getClass();
                return new irt();
            default:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return new gos(0);
        }
    }

    public /* synthetic */ h4t(int i) {
        this.a = i;
    }
}
