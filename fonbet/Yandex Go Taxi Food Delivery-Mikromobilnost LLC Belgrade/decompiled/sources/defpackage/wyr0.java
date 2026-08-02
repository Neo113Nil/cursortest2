package defpackage;

import com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo.response.SimplifiedPaymentStatus;
import com.yandex.go.shortcuts.models.ShortcutClickAction;
import com.yandex.go.slot.dto.SlotButtonDto;
import com.yandex.go.slot.dto.e0;
import com.yandex.go.slot.dto.f0;
import com.yandex.go.slot.dto.g0;
import com.yandex.go.slot.dto.h0;
import com.yandex.go.slot.dto.i0;
import com.yandex.go.slot.dto.p;
import com.yandex.go.slot.dto.q;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.ShowNavigationButton;
import ru.yandex.taxi.common_models.net.map_object.k0;
import ru.yandex.taxi.common_models.net.map_object.l0;

/* loaded from: classes13.dex */
public final /* synthetic */ class wyr0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ wyr0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        switch (this.a) {
            case 0:
                return vez0.g("com.yandex.go.shortcuts.models.ShortcutClickAction", ShortcutClickAction.values(), new String[]{"tap"}, new Annotation[][]{null});
            case 1:
                return new ArrayList(2);
            case 2:
                return new HashMap();
            case 3:
                o5s0 o5s0Var = p5s0.Companion;
                return new p53(auu0.a, 1);
            case 4:
                o5s0 o5s0Var2 = p5s0.Companion;
                return new p53(auu0.a, 1);
            case 5:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 6:
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 7:
                n7s0 n7s0Var = k0.Companion;
                return new p53(l0.a, 0);
            case 8:
                o7s0 o7s0Var = ShowNavigationButton.Companion;
                return ShowNavigationButton.Type.Companion.serializer();
            case 9:
                return vez0.g("ru.yandex.taxi.common_models.net.map_object.ShowNavigationButton.Type", ShowNavigationButton.Type.values(), new String[]{"reject", "confirm", null}, new Annotation[][]{null, null, null});
            case 10:
                return new oke(qoi0.a(ywl.class), null, new KSerializer[0]);
            case 11:
                return new p53(auu0.a, 1);
            case 12:
                return new p53(auu0.a, 1);
            case 13:
                x9s0 x9s0Var = y9s0.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, new k8u(auu0Var3, h6w.a, 1), 1);
            case 14:
                return vez0.g("com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo.response.SimplifiedPaymentStatus", SimplifiedPaymentStatus.values(), new String[]{"PENDING", "SUCCESS", "FAILED"}, new Annotation[][]{null, null, null});
            case 15:
                zy11Var = zy11.a;
                return zy11Var;
            case 16:
                return new oke(qoi0.a(tg2.class), null, new KSerializer[0]);
            case 17:
                p pVar = SlotButtonDto.Companion;
                return SlotButtonDto.WidthStrategy.Companion.serializer();
            case 18:
                q qVar = SlotButtonDto.Properties.Companion;
                return SlotButtonDto.Properties.Size.Companion.serializer();
            case 19:
                q qVar2 = SlotButtonDto.Properties.Companion;
                return SlotButtonDto.Properties.Style.Companion.serializer();
            case 20:
                q qVar3 = SlotButtonDto.Properties.Companion;
                return SlotButtonDto.Properties.Form.Companion.serializer();
            case 21:
                return vez0.g("com.yandex.go.slot.dto.SlotButtonDto.Properties.Form", SlotButtonDto.Properties.Form.values(), new String[]{"squircle", "circle"}, new Annotation[][]{null, null});
            case 22:
                return vez0.g("com.yandex.go.slot.dto.SlotButtonDto.Properties.Size", SlotButtonDto.Properties.Size.values(), new String[]{"xs", "s", "m", "l"}, new Annotation[][]{null, null, null, null});
            case 23:
                return vez0.g("com.yandex.go.slot.dto.SlotButtonDto.Properties.Style", SlotButtonDto.Properties.Style.values(), new String[]{"minor"}, new Annotation[][]{null});
            case 24:
                return vez0.g("com.yandex.go.slot.dto.SlotButtonDto.WidthStrategy", SlotButtonDto.WidthStrategy.values(), new String[]{"default", "fill"}, new Annotation[][]{null, null});
            case 25:
                return new o4o("com.yandex.go.slot.dto.SlotItemActionDto.AcceptEula", e0.INSTANCE, new Annotation[0]);
            case 26:
                return new o4o("com.yandex.go.slot.dto.SlotItemActionDto.ActivationWithOnboarding", f0.INSTANCE, new Annotation[0]);
            case 27:
                return new o4o("com.yandex.go.slot.dto.SlotItemActionDto.AddRoutePoint", g0.INSTANCE, new Annotation[0]);
            case 28:
                return new o4o("com.yandex.go.slot.dto.SlotItemActionDto.CallDriver", h0.INSTANCE, new Annotation[0]);
            default:
                return new o4o("com.yandex.go.slot.dto.SlotItemActionDto.CancelAltOption", i0.INSTANCE, new Annotation[0]);
        }
    }
}
