package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.yandex.music.shared.network.retrypolicy.api.RetryPolicyDto;
import com.yandex.music.shared.player.download2.GetFileInfoException;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class i6o implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ i6o(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ((rmg) vz1.l((l13) obj, rmg.class)).c;
            case 1:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new umg((l6o) l13Var.a.D(hag.I(l6o.class), l13Var, l13Var.b));
            case 2:
                return ((rmg) vz1.l((l13) obj, rmg.class)).b;
            case 3:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                bdt I = hag.I(wmg.class);
                qdc qdcVar = l13Var2.a;
                Set set = l13Var2.b;
                return new b7o((wmg) qdcVar.D(I, l13Var2, set), (cbn) qdcVar.D(hag.I(cbn.class), l13Var2, set));
            case 4:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I2 = hag.I(l6o.class);
                qdc qdcVar2 = l13Var3.a;
                Set set2 = l13Var3.b;
                return new jmw((wmg) qdcVar2.D(hag.I(wmg.class), l13Var3, set2), (l6o) qdcVar2.D(I2, l13Var3, set2), (jmg) qdcVar2.D(hag.I(jmg.class), l13Var3, set2));
            case 5:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new xus(1, l13Var4.b(hag.I(frt.class), true));
            case 6:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new q8n((l6o) l13Var5.a.D(hag.I(l6o.class), l13Var5, l13Var5.b));
            case 7:
                ((l13) obj).getClass();
                return new t5v();
            case 8:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, n80.class).E(new i6o(9));
                o18Var.b(hag.I(lrc.class)).E(new i6o(10));
                o18Var.b(hag.I(cbn.class)).E(new i6o(11));
                o18Var.b(hag.I(s6o.class)).E(new i6o(12));
                o18Var.b(hag.I(aiw.class)).E(new i6o(13));
                o18Var.b(hag.I(l6o.class)).E(new i6o(14));
                o18Var.b(hag.I(g6o.class)).E(new i6o(15));
                o18Var.b(hag.I(kbn.class)).D(new snk(19));
                o18Var.b(hag.I(b9n.class)).D(new snk(20));
                o18Var.b(hag.I(jmw.class)).D(new snk(21));
                o18Var.b(hag.I(wmg.class)).D(new snk(22));
                o18Var.b(hag.I(jmg.class)).D(new snk(23));
                return Unit.a;
            case 9:
                ((l13) obj).getClass();
                return new n80();
            case 10:
                ((l13) obj).getClass();
                return new lrc();
            case 11:
                ((l13) obj).getClass();
                return new cbn();
            case 12:
                ((l13) obj).getClass();
                return new s6o();
            case 13:
                ((l13) obj).getClass();
                return new aiw();
            case 14:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new l6o(l13Var6.b(hag.I(i5h.class), true), l13Var6.b(hag.I(frt.class), true), l13Var6.b(hag.I(cc7.class), true), l13Var6.b(hag.I(oq7.class), true), l13Var6.b(hag.I(vnk.class), true), l13Var6.b(hag.I(n80.class), true), l13Var6.b(hag.I(lrc.class), true), l13Var6.b(hag.I(z66.class), true), l13Var6.b(hag.I(cbn.class), true), btf.b(new h4d(l13Var6, 11)), l13Var6.b(hag.I(s6o.class), true), l13Var6.b(hag.I(aiw.class), true));
            case 15:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new g6o((l6o) l13Var7.a.D(hag.I(l6o.class), l13Var7, l13Var7.b));
            case 16:
                ((InternalDownloadException) obj).getClass();
                return zao.b;
            case 17:
                ((GetFileInfoException) obj).getClass();
                return zao.b;
            case 18:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.e.add(new TypeAdapterFactory() { // from class: com.yandex.music.shared.network.retrypolicy.api.RetryPolicyDto$RetryPolicyDtoTypeAdapter$Companion$factory$1
                    @Override // com.google.gson.TypeAdapterFactory
                    public final TypeAdapter b(Gson gson, TypeToken typeToken) {
                        gson.getClass();
                        typeToken.getClass();
                        if (!RetryPolicyDto.class.isAssignableFrom(typeToken.getRawType())) {
                            return null;
                        }
                        TypeAdapter g = gson.g(this, typeToken);
                        g.getClass();
                        return new RetryPolicyDto.RetryPolicyDtoTypeAdapter(g, gson.f(TypeToken.get(JsonObject.class)));
                    }
                });
                return Unit.a;
            case 19:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.w(jfpVar);
                wfp.x(jfpVar, -3.0f);
                return Unit.a;
            case 20:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.t(jfpVar2, "round_button_text");
                return Unit.a;
            case 21:
                vz1.e((o18) obj, wvo.class).E(new i6o(22));
                return Unit.a;
            case 22:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                bdt I3 = hag.I(Context.class);
                qdc qdcVar3 = l13Var8.a;
                Set set3 = l13Var8.b;
                return new wvo(0);
            case 23:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.e(jfpVar3);
                return Unit.a;
            case 24:
                u51 u51Var = (u51) obj;
                u51Var.getClass();
                return u51Var.a;
            case 25:
                u51 u51Var2 = (u51) obj;
                u51Var2.getClass();
                return u51Var2.a;
            case 26:
                ((jfp) obj).getClass();
                return Unit.a;
            case 27:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, f0p.class).E(new i6o(28));
                o18Var2.b(hag.I(g0p.class)).D(new i6o(29));
                o18Var2.b(hag.I(h0p.class)).D(new d0p(0));
                o18Var2.b(hag.I(i0p.class)).E(new d0p(1));
                o18Var2.b(hag.I(j0p.class)).E(new d0p(2));
                o18Var2.b(hag.I(uln.class)).E(new d0p(3));
                o18Var2.b(hag.I(bbb.class)).E(new d0p(4));
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((l13) obj).getClass();
                return new f0p(l18.b.b(hag.I(frt.class), true));
            default:
                ((l13) obj).getClass();
                return new g0p();
        }
    }
}
