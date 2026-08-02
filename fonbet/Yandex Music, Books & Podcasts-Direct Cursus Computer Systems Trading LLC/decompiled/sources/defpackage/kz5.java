package defpackage;

import android.content.Context;
import com.google.gson.GsonBuilder;
import com.yandex.music.shared.concert.landing.ui.logic.impl.network.model.ConcertsFeedItemDto;
import com.yandex.music.shared.concert.landing.ui.logic.impl.network.model.ConcertsFeedItemDtoGsonDeserializer;
import com.yandex.music.shared.skeleton.continuelisten.ContinueListenBlockPlayedItemJsonAdapter;
import com.yandex.music.shared.skeleton.continuelisten.dto.PlayedItemDto;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class kz5 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ kz5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.e(jfpVar);
                return Unit.a;
            case 1:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.e(jfpVar2);
                return Unit.a;
            case 2:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.w(jfpVar3);
                wfp.x(jfpVar3, -2.0f);
                return Unit.a;
            case 3:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.g(jfpVar4);
                return Unit.a;
            case 4:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.i(jfpVar5, new ky4(0, 0));
                return Unit.a;
            case 5:
                ((IntRange) obj).getClass();
                return Unit.a;
            case 6:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(ConcertsFeedItemDto.class, new ConcertsFeedItemDtoGsonDeserializer());
                return Unit.a;
            case 7:
                jfp jfpVar6 = (jfp) obj;
                jfpVar6.getClass();
                wfp.g(jfpVar6);
                return Unit.a;
            case 8:
                jfp jfpVar7 = (jfp) obj;
                jfpVar7.getClass();
                wfp.g(jfpVar7);
                return Unit.a;
            case 9:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, f56.class).D(new kz5(10));
                o18Var.b(hag.I(e56.class)).E(new kz5(11));
                o18Var.b(hag.I(l56.class)).D(new kz5(12));
                o18Var.b(hag.I(k56.class)).E(new kz5(13));
                return Unit.a;
            case 10:
                ((l13) obj).getClass();
                return new f56();
            case 11:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new e56((f56) l13Var.a.D(hag.I(f56.class), l13Var, l13Var.b));
            case 12:
                ((l13) obj).getClass();
                return new l56();
            case 13:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new k56((l56) l13Var2.a.D(hag.I(l56.class), l13Var2, l13Var2.b));
            case 14:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, z66.class).E(new kz5(15));
                o18Var2.b(hag.I(a1j.class)).E(new kz5(16));
                o18Var2.b(hag.I(d76.class)).D(new kz5(17));
                return Unit.a;
            case 15:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                Set set = l13Var3.b;
                qdc qdcVar = l13Var3.a;
                u66 u66Var = new u66();
                if (ku7.e.get()) {
                    jyr b = l13Var3.b(hag.I(a1j.class), true);
                    return new z66((Context) qdcVar.D(hag.I(Context.class), l13Var3, set), btf.b(new c76(b, 0)), new c76(b, 1), u66Var);
                }
                a1j a1jVar = (a1j) qdcVar.D(hag.I(a1j.class), l13Var3, set);
                Context context = (Context) qdcVar.D(hag.I(Context.class), l13Var3, set);
                wvt y = ivf.y(a1jVar);
                return new z66(context, btf.b(new r25(26, y)), new cp5(16, a1jVar), u66Var);
            case 16:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                bdt I = hag.I(Context.class);
                qdc qdcVar2 = l13Var4.a;
                Set set2 = l13Var4.b;
                return new a1j((Context) qdcVar2.D(I, l13Var4, set2), (uju) qdcVar2.D(hag.I(uju.class), l13Var4, set2), (av0) qdcVar2.D(hag.I(av0.class), l13Var4, set2));
            case 17:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new d76(l13Var5);
            case 18:
                jfp jfpVar8 = (jfp) obj;
                jfpVar8.getClass();
                wfp.e(jfpVar8);
                return Unit.a;
            case 19:
                jfp jfpVar9 = (jfp) obj;
                jfpVar9.getClass();
                wfp.q(jfpVar9, 0);
                return Unit.a;
            case 20:
                jfp jfpVar10 = (jfp) obj;
                jfpVar10.getClass();
                wfp.q(jfpVar10, 0);
                return Unit.a;
            case 21:
                jfp jfpVar11 = (jfp) obj;
                jfpVar11.getClass();
                wfp.q(jfpVar11, 0);
                return Unit.a;
            case 22:
                GsonBuilder gsonBuilder2 = (GsonBuilder) obj;
                gsonBuilder2.getClass();
                gsonBuilder2.b(PlayedItemDto.class, new ContinueListenBlockPlayedItemJsonAdapter());
                return Unit.a;
            case 23:
                ((jfp) obj).getClass();
                return Unit.a;
            case 24:
                ((cds) obj).getClass();
                return Unit.a;
            case 25:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof a) {
                    return (a) element;
                }
                return null;
            case 26:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.a(0.99f);
                return Unit.a;
            case 27:
                zco zcoVar2 = (zco) obj;
                zcoVar2.getClass();
                zcoVar2.c(false);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                vz1.e((o18) obj, tnt.class).E(new kz5(29));
                return Unit.a;
            default:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                bdt I2 = hag.I(Context.class);
                qdc qdcVar3 = l13Var6.a;
                Set set3 = l13Var6.b;
                return new tnt((Context) qdcVar3.D(I2, l13Var6, set3), (cut) qdcVar3.D(hag.I(cut.class), l13Var6, set3), (rtl) qdcVar3.D(hag.I(rtl.class), l13Var6, set3));
        }
    }
}
