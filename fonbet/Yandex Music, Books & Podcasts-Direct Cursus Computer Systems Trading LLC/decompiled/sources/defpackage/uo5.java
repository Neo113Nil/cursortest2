package defpackage;

import com.google.gson.GsonBuilder;
import com.yandex.music.shared.concert.catalog.ui.logic.network.ConcertCatalogItemDto;
import com.yandex.music.shared.concert.catalog.ui.logic.network.ConcertCatalogItemDtoGsonDeserializer;
import com.yandex.pulse.metrics.o;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class uo5 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ uo5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).booleanValue();
                break;
            case 1:
                ((Integer) obj).intValue();
                break;
            case 2:
                ((Integer) obj).intValue();
                break;
            case 3:
                ((Integer) obj).intValue();
                break;
            case 4:
                ((Integer) obj).intValue();
                break;
            case 5:
                ((Integer) obj).intValue();
                break;
            case 6:
                ((Float) obj).floatValue();
                break;
            case 7:
                ((Float) obj).floatValue();
                break;
            case 8:
                ((Float) obj).floatValue();
                break;
            case 9:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                jpa.B(opfVar, c3x.h(4287221203L), 0L, 0L, 0.0f, null, 0, 126);
                break;
            case 10:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(ConcertCatalogItemDto.class, new ConcertCatalogItemDtoGsonDeserializer());
                break;
            case 11:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, hu5.class).E(new uo5(16));
                o18Var.b(hag.I(fw5.class)).E(new uo5(20));
                o18Var.b(hag.I(o36.class)).E(new uo5(21));
                o18Var.b(hag.I(y16.class)).E(new uo5(22));
                o18Var.b(hag.I(e26.class)).E(new uo5(23));
                o18Var.b(hag.I(ot5.class)).E(new uo5(24));
                o18Var.b(hag.I(vt5.class)).E(new uo5(12));
                o18Var.b(hag.I(cx5.class)).E(new uo5(13));
                o18Var.b(hag.I(ax5.class)).E(new uo5(14));
                o18Var.b(hag.I(f06.class)).E(new uo5(15));
                o18Var.b(hag.I(rw5.class)).E(new uo5(17));
                o18Var.b(hag.I(xy5.class)).E(new uo5(18));
                o18Var.b(hag.I(uv5.class)).E(new uo5(19));
                break;
            case 12:
                ((l13) obj).getClass();
                break;
            case 13:
                ((l13) obj).getClass();
                break;
            case 14:
                ((l13) obj).getClass();
                break;
            case 15:
                ((l13) obj).getClass();
                break;
            case 16:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                break;
            case 17:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                break;
            case 18:
                ((l13) obj).getClass();
                break;
            case 19:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                break;
            case 20:
                ((l13) obj).getClass();
                break;
            case 21:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                break;
            case 22:
                ((l13) obj).getClass();
                break;
            case 23:
                ((l13) obj).getClass();
                break;
            case 24:
                ((l13) obj).getClass();
                break;
            case 25:
                Pair pair = (Pair) obj;
                pair.getClass();
                break;
            case 26:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                break;
            case 27:
                ((jfp) obj).getClass();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.e(jfpVar);
                break;
            default:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.e(jfpVar2);
                break;
        }
        return Unit.a;
    }
}
