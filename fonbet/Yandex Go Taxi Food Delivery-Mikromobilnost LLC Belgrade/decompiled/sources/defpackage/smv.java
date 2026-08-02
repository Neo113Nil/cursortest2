package defpackage;

import androidx.compose.runtime.f;
import com.yandex.fintechsdk.data.payment.method.api.model.CardBindingCurrency;
import com.yandex.go.masstransit.sdk.client_api.data.dto.InitTripRequestDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.p;
import com.yandex.go.order.state.instructions.InstructionItemButtonAction;
import com.yandex.go.order.state.instructions.InstructionItemButtonActionType;
import com.yandex.go.order.state.instructions.b;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$PurchaseProductClick$Type;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$MiniStoryControlType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$StoryNavigationType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseErrorTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import com.ybsdk.feature.savings.internal.screens.account.view.IncomeProgressView;
import defpackage.u4w;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.annotation.Annotation;

/* loaded from: classes2.dex */
public final /* synthetic */ class smv implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ smv(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        long j;
        switch (this.a) {
            case 0:
                return OfferTypeDto.Companion.serializer();
            case 1:
                return PurchaseTypeDto.Companion.serializer();
            case 2:
                return PurchaseStatusTypeDto.Companion.serializer();
            case 3:
                return PurchaseErrorTypeDto.Companion.serializer();
            case 4:
                return PurchaseTypeDto.Companion.serializer();
            case 5:
                return InMessage$PurchaseProductClick$Type.Companion.serializer();
            case 6:
                return vez0.g("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage.PurchaseProductClick.Type", InMessage$PurchaseProductClick$Type.values(), new String[]{"button", "card"}, new Annotation[][]{null, null});
            case 7:
                return PurchaseTypeDto.Companion.serializer();
            case 8:
                return PurchaseStatusTypeDto.Companion.serializer();
            case 9:
                return PurchaseErrorTypeDto.Companion.serializer();
            case 10:
                return PurchaseTypeDto.Companion.serializer();
            case 11:
                return PurchaseStatusTypeDto.Companion.serializer();
            case 12:
                return InMessage$StoryIsVisibleEvent$MiniStoryControlType.Companion.serializer();
            case 13:
                return InMessage$StoryIsVisibleEvent$StoryNavigationType.Companion.serializer();
            case 14:
                return vez0.g("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage.StoryIsVisibleEvent.MiniStoryControlType", InMessage$StoryIsVisibleEvent$MiniStoryControlType.values(), new String[]{"swipe", "tap"}, new Annotation[][]{null, null});
            case 15:
                return vez0.g("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage.StoryIsVisibleEvent.StoryNavigationType", InMessage$StoryIsVisibleEvent$StoryNavigationType.values(), new String[]{"next", "prev", StringUtils.UNDEFINED}, new Annotation[][]{null, null, null});
            case 16:
                return new p53(gd11.a, 0);
            case 17:
                return new p53(gd11.a, 0);
            case 18:
                zy11Var = zy11.a;
                return zy11Var;
            case 19:
                j = IncomeProgressView.DEFAULT_ANIMATION_DURATION_MS;
                return Long.valueOf(j);
            case 20:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 21:
                return f.g(0);
            case 22:
                p pVar = InitTripRequestDto.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 23:
                return new o4o("com.yandex.fintechsdk.data.payment.method.api.model.CardBindingCurrency", (Enum[]) CardBindingCurrency.values());
            case 24:
                return cwv.a;
            case 25:
                return new p53(auu0.a, 0);
            case 26:
                return new p53(auu0.a, 0);
            case 27:
                b bVar = InstructionItemButtonAction.Companion;
                return InstructionItemButtonActionType.Companion.serializer();
            case 28:
                return vez0.g("com.yandex.go.order.state.instructions.InstructionItemButtonActionType", InstructionItemButtonActionType.values(), new String[]{"remove_preorder", null}, new Annotation[][]{null, null});
            default:
                w4w w4wVar = u4w.b.Companion;
                return new p53(w7s.a, 0);
        }
    }
}
