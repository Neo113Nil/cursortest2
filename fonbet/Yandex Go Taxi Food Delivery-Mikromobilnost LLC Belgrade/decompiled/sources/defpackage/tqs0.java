package defpackage;

import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.SortChoiceOptionDto$$serializer;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.SortDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.SortModalItemBlockDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.SortOptionItemDto$$serializer;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.s;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.t;
import com.yandex.go.quark.soul.experiments.SoulAiAssistantExperiment;
import com.yandex.go.quark.soul.experiments.a;
import com.yandex.go.quark.soul.experiments.c;
import com.yandex.go.slot.dto.SlotItemBodyDto;
import com.yandex.go.slot.dto.SlotItemBodyDto$$serializer;
import com.yandex.go.slot.dto.SlotItemBodyPropertiesDto;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.SlotItemLineDto;
import com.yandex.go.slot.dto.SlotItemLineDto$$serializer;
import com.yandex.go.slot.dto.SlotItemSizeDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$ButtonDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$IconSpotDto;
import com.yandex.go.slot.dto.c2;
import com.yandex.go.slot.dto.e2;
import com.yandex.go.slot.dto.f2;
import com.yandex.go.slot.dto.i2;
import com.yandex.go.slot.dto.l2;
import com.yandex.go.slot.dto.o2;
import com.yandex.go.slot.dto.r2;
import com.yandex.go.slot.dto.v2;
import com.yandex.go.slot.dto.w2;
import com.yandex.go.slot.dto.x2;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import com.yandex.go.something_wrong_screen.experiment.SomethingWrongScreenExperiment;
import com.yandex.go.something_wrong_screen.experiment.d;
import com.yandex.go.taxi.order.change.source.data.SourceChangeReason;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final /* synthetic */ class tqs0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ tqs0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        bdc transparentAttr_delegate$lambda$0;
        switch (this.a) {
            case 0:
                c2 c2Var = SlotItemBodyDto.Companion;
                return new p53(SlotItemLineDto$$serializer.INSTANCE, 0);
            case 1:
                e2 e2Var = SlotItemBodyPropertiesDto.Companion;
                return SlotItemBodyPropertiesDto.Align.Companion.serializer();
            case 2:
                return vez0.g("com.yandex.go.slot.dto.SlotItemBodyPropertiesDto.Align", SlotItemBodyPropertiesDto.Align.values(), new String[]{"start", "center", "end"}, new Annotation[][]{null, null, null});
            case 3:
                f2 f2Var = SlotItemDto.Companion;
                return SlotItemSizeDto.Companion.serializer();
            case 4:
                f2 f2Var2 = SlotItemDto.Companion;
                return new p53(SlotItemBodyDto$$serializer.INSTANCE, 0);
            case 5:
                f2 f2Var3 = SlotItemDto.Companion;
                return new p53(x2.Companion.serializer(), 0);
            case 6:
                return new o4o("com.yandex.go.slot.dto.SlotItemLeadDto.None", i2.INSTANCE, new Annotation[0]);
            case 7:
                l2 l2Var = SlotItemLineDto.Companion;
                return SlotItemLineDto.Ellipsis.Companion.serializer();
            case 8:
                return vez0.g("com.yandex.go.slot.dto.SlotItemLineDto.Ellipsis", SlotItemLineDto.Ellipsis.values(), new String[]{"center", "end"}, new Annotation[][]{null, null});
            case 9:
                return vez0.g("com.yandex.go.slot.dto.SlotItemSizeDto", SlotItemSizeDto.values(), new String[]{"xs", "s", "m", "l"}, new Annotation[][]{null, null, null, null});
            case 10:
                o2 o2Var = SlotItemTrailDto$ButtonDto.Companion;
                return SlotItemTrailDto$ButtonDto.Style.Companion.serializer();
            case 11:
                return vez0.g("com.yandex.go.slot.dto.SlotItemTrailDto.ButtonDto.Style", SlotItemTrailDto$ButtonDto.Style.values(), new String[]{"main", "outline", "action"}, new Annotation[][]{null, null, null});
            case 12:
                r2 r2Var = SlotItemTrailDto$IconSpotDto.Companion;
                return SlotItemTrailDto$IconSpotDto.SpotType.Companion.serializer();
            case 13:
                r2 r2Var2 = SlotItemTrailDto$IconSpotDto.Companion;
                return SlotItemTrailDto$IconSpotDto.Size.Companion.serializer();
            case 14:
                return vez0.g("com.yandex.go.slot.dto.SlotItemTrailDto.IconSpotDto.Size", SlotItemTrailDto$IconSpotDto.Size.values(), new String[]{"m"}, new Annotation[][]{null});
            case 15:
                return vez0.g("com.yandex.go.slot.dto.SlotItemTrailDto.IconSpotDto.SpotType", SlotItemTrailDto$IconSpotDto.SpotType.values(), new String[]{"fill"}, new Annotation[][]{null});
            case 16:
                return new o4o("com.yandex.go.slot.dto.SlotItemTrailDto.SwitchDto", v2.INSTANCE, new Annotation[0]);
            case 17:
                return new o4o("com.yandex.go.slot.dto.SlotItemTrailDto.Unknown", w2.INSTANCE, new Annotation[0]);
            case 18:
                transparentAttr_delegate$lambda$0 = SlotItemViewComponent.transparentAttr_delegate$lambda$0();
                return transparentAttr_delegate$lambda$0;
            case 19:
                s1t0 s1t0Var = t1t0.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 20:
                s1t0 s1t0Var2 = t1t0.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 21:
                s1t0 s1t0Var3 = t1t0.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 22:
                s1t0 s1t0Var4 = t1t0.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 23:
                d dVar = SomethingWrongScreenExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 24:
                s sVar = SortDto.Companion;
                return new p53(SortChoiceOptionDto$$serializer.INSTANCE, 0);
            case 25:
                t tVar = SortModalItemBlockDto.Companion;
                return new p53(SortOptionItemDto$$serializer.INSTANCE, 0);
            case 26:
                a aVar = SoulAiAssistantExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 27:
                c cVar = SoulAiAssistantExperiment.Navbar.Companion;
                return SoulAiAssistantExperiment.Navbar.Mode.Companion.serializer();
            case 28:
                return vez0.g("com.yandex.go.quark.soul.experiments.SoulAiAssistantExperiment.Navbar.Mode", SoulAiAssistantExperiment.Navbar.Mode.values(), new String[]{"native", "web"}, new Annotation[][]{null, null});
            default:
                return vez0.g("com.yandex.go.taxi.order.change.source.data.SourceChangeReason", SourceChangeReason.values(), new String[]{"pickup_point_manual", "altpin_suggest"}, new Annotation[][]{null, null});
        }
    }
}
