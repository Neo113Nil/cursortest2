package defpackage;

import android.animation.Animator;
import android.content.Context;
import com.google.gson.GsonBuilder;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.SlideButtonDeserializer;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.SlideButtonDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.BottomBlockDeserializer;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.BottomBlockDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.BottomItemDeserializer;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.CarouselDeserializer;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.CarouselItemDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.SlideContentDeserializer;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.SlideContentDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.TopBlockDeserializer;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.TopBlockDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.TopItemDeserializer;
import com.yandex.music.shared.trailers.api.data.TrackWithSmartPreviewJsonDeserializer;
import com.yandex.music.shared.trailers.api.model.TrackWithSmartPreviewDto;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class xnq implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ xnq(bzq bzqVar) {
        this.a = 24;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                break;
            case 1:
                ((l13) obj).getClass();
                break;
            case 2:
                ((l13) obj).getClass();
                break;
            case 3:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(frt.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                break;
            case 4:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                break;
            case 5:
                ((l13) obj).getClass();
                break;
            case 6:
                ((l13) obj).getClass();
                break;
            case 7:
                ((l13) obj).getClass();
                break;
            case 8:
                ((l13) obj).getClass();
                break;
            case 9:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                break;
            case 10:
                ((l13) obj).getClass();
                break;
            case 11:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.x(jfpVar, 0.0f);
                break;
            case 12:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, cwq.class).E(new xnq(13));
                o18Var.b(hag.I(rvq.class)).E(new xnq(14));
                o18Var.b(hag.I(uvo.class)).E(new xnq(15));
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
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(SlideButtonDto.class, new SlideButtonDeserializer());
                gsonBuilder.b(SlideContentDto.class, new SlideContentDeserializer());
                gsonBuilder.b(TrackWithSmartPreviewDto.class, new TrackWithSmartPreviewJsonDeserializer());
                gsonBuilder.b(CarouselItemDto.class, new CarouselDeserializer());
                gsonBuilder.b(BottomBlockDto.class, new BottomBlockDeserializer());
                gsonBuilder.b(BottomBlockDto.BottomItemDto.class, new BottomItemDeserializer());
                gsonBuilder.b(TopBlockDto.class, new TopBlockDeserializer());
                gsonBuilder.b(TopBlockDto.TopItemDto.class, new TopItemDeserializer());
                break;
            case 17:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.x(jfpVar2, 1.0f);
                break;
            case 18:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.t(jfpVar3, "back_button");
                break;
            case 19:
                ((jfp) obj).getClass();
                break;
            case 20:
                ((jfp) obj).getClass();
                break;
            case 21:
                ((jfp) obj).getClass();
                break;
            case 22:
                ((jfp) obj).getClass();
                break;
            case 23:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                bdt I2 = hag.I(Context.class);
                qdc qdcVar2 = l13Var4.a;
                Set set2 = l13Var4.b;
                break;
            case 24:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                bdt I3 = hag.I(yyq.class);
                qdc qdcVar3 = l13Var5.a;
                Set set3 = l13Var5.b;
                int ordinal = ((yyq) qdcVar3.D(I3, l13Var5, set3)).a.ordinal();
                if (ordinal == 0) {
                    break;
                } else if (ordinal != 1) {
                    b6e.s();
                    break;
                } else {
                    xq0.x("MyVibeGeneratorRepository is required for VIBE_GENERATOR mode");
                    break;
                }
            case 25:
                Animator animator = (Animator) obj;
                animator.getClass();
                animator.cancel();
                break;
            case 26:
                Animator animator2 = (Animator) obj;
                animator2.getClass();
                animator2.pause();
                break;
            case 27:
                Animator animator3 = (Animator) obj;
                animator3.getClass();
                animator3.resume();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((jfp) obj).getClass();
                break;
            default:
                ((jfp) obj).getClass();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xnq(int i) {
        this.a = i;
    }
}
