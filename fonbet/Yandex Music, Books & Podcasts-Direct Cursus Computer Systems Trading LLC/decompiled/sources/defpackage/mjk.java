package defpackage;

import android.content.Context;
import android.os.Build;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.pulse.metrics.o;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.api.AlbumApi;

/* loaded from: classes3.dex */
public final /* synthetic */ class mjk implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ mjk(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new ljk(l13Var);
            case 1:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new pjk(l13Var2);
            case 2:
                ((l13) obj).getClass();
                return new njk();
            case 3:
                ((l13) obj).getClass();
                return new ojk();
            case 4:
                vz1.e((o18) obj, r18.class).D(new mjk(5));
                return Unit.a;
            case 5:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                v3i v3iVar = (v3i) l13Var3.a.D(hag.I(v3i.class), l13Var3, l13Var3.b);
                String z = avf.z(Build.MANUFACTURER);
                String str = Build.MODEL;
                if (str == null || z == null) {
                    xq0.x("String is null");
                    return null;
                }
                Locale locale = Locale.US;
                if (!str.toLowerCase(locale).contains(z.toLowerCase(locale))) {
                    str = ouj.o(z, StringUtil.SPACE, str);
                }
                return new r18(v3iVar, str);
            case 6:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, hlk.class).E(new mjk(7));
                o18Var.b(hag.I(glk.class)).E(new mjk(8));
                o18Var.b(hag.I(h1o.class)).E(new mjk(9));
                return Unit.a;
            case 7:
                ((l13) obj).getClass();
                return new hlk();
            case 8:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new glk((hlk) l13Var4.a.D(hag.I(hlk.class), l13Var4, l13Var4.b));
            case 9:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return (h1o) ((glk) l13Var5.a.D(hag.I(glk.class), l13Var5, l13Var5.b)).b.getValue();
            case 10:
                ((l13) obj).getClass();
                return new klk();
            case 11:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new tkk(l13Var6.b(hag.I(klk.class), true));
            case 12:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new flk((tkk) l13Var7.a.D(hag.I(tkk.class), l13Var7, l13Var7.b));
            case 13:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return new h1o((Context) l13Var8.a.D(hag.I(Context.class), l13Var8, l13Var8.b), l13Var8.b(hag.I(klk.class), true));
            case 14:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, aoi.class).E(new mjk(20));
                o18Var2.b(hag.I(ss.class)).E(new mjk(25));
                o18Var2.b(hag.I(ay.class)).E(new mjk(26));
                o18Var2.b(hag.I(ms.class)).E(new mjk(27));
                o18Var2.b(hag.I(v7a.class)).D(new mjk(28));
                o18Var2.b(hag.I(jhq.class)).D(new mjk(15));
                o18Var2.b(hag.I(hh1.class)).E(new mjk(16));
                o18Var2.b(hag.I(g51.class)).E(new mjk(17));
                o18Var2.b(hag.I(o21.class)).E(new mjk(18));
                o18Var2.b(hag.I(kvn.class)).E(new mjk(19));
                o18Var2.b(hag.I(klg.class)).E(new mjk(21));
                o18Var2.b(hag.I(nsl.class)).E(new mjk(22));
                o18Var2.b(hag.I(y8s.class)).E(new mjk(23));
                o18Var2.b(hag.I(z8s.class)).E(new mjk(24));
                return Unit.a;
            case 15:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return new jhq((e0j) l13Var9.a(hag.I(e0j.class)));
            case 16:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return new hh1((aoi) l13Var10.a.D(hag.I(aoi.class), l13Var10, l13Var10.b));
            case 17:
                ((l13) obj).getClass();
                return new g51();
            case 18:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                bdt I = hag.I(hh1.class);
                qdc qdcVar = l13Var11.a;
                Set set = l13Var11.b;
                return new o21((hh1) qdcVar.D(I, l13Var11, set), (z66) qdcVar.D(hag.I(z66.class), l13Var11, set));
            case 19:
                ((l13) obj).getClass();
                return new kvn();
            case 20:
                ((l13) obj).getClass();
                aoi c = aoi.c();
                c.getClass();
                return c;
            case 21:
                ((l13) obj).getClass();
                return new klg();
            case 22:
                l13 l13Var12 = (l13) obj;
                l13Var12.getClass();
                return new nsl(l13Var12.b(hag.I(kvn.class), true), l13Var12.b(hag.I(klg.class), true), l13Var12.b(hag.I(frt.class), true), l13Var12.b(hag.I(z66.class), true));
            case 23:
                l13 l13Var13 = (l13) obj;
                l13Var13.getClass();
                return new y8s(new gug((frt) l13Var13.a.D(hag.I(frt.class), l13Var13, l13Var13.b), 1));
            case 24:
                ((l13) obj).getClass();
                return new z8s();
            case 25:
                ((l13) obj).getClass();
                return new ss();
            case 26:
                l13 l13Var14 = (l13) obj;
                l13Var14.getClass();
                bdt I2 = hag.I(ss.class);
                qdc qdcVar2 = l13Var14.a;
                Set set2 = l13Var14.b;
                return new ay((ss) qdcVar2.D(I2, l13Var14, set2), (aoi) qdcVar2.D(hag.I(aoi.class), l13Var14, set2), (b20) qdcVar2.D(hag.I(b20.class), l13Var14, set2), (AlbumApi) qdcVar2.D(hag.I(AlbumApi.class), l13Var14, set2), (yr) qdcVar2.D(hag.I(yr.class), l13Var14, set2));
            case 27:
                l13 l13Var15 = (l13) obj;
                l13Var15.getClass();
                bdt I3 = hag.I(ay.class);
                qdc qdcVar3 = l13Var15.a;
                Set set3 = l13Var15.b;
                return new ms((ay) qdcVar3.D(I3, l13Var15, set3), (z66) qdcVar3.D(hag.I(z66.class), l13Var15, set3));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var16 = (l13) obj;
                l13Var16.getClass();
                return new v7a((e0j) l13Var16.a.D(hag.I(e0j.class), l13Var16, l13Var16.b));
            default:
                o18 o18Var3 = (o18) obj;
                vz1.e(o18Var3, pnk.class).E(new qnk(0));
                o18Var3.b(hag.I(g2q.class)).D(new san(28));
                o18Var3.b(hag.I(yws.class)).D(new san(29));
                o18Var3.b(hag.I(cu.class)).D(new snk(0));
                o18Var3.b(hag.I(dc1.class)).D(new snk(1));
                o18Var3.b(hag.I(tvl.class)).D(new snk(2));
                o18Var3.b(hag.I(u4u.class)).D(new snk(3));
                return Unit.a;
        }
    }
}
