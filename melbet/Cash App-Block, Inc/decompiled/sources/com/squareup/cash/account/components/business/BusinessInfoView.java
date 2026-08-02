package com.squareup.cash.account.components.business;

import android.content.Context;
import androidx.appcompat.app.LocaleOverlayHelper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.components.AccountToDoKt$$ExternalSyntheticLambda0;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewModel;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.sheet.ComposeBottomSheetKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes5.dex */
public final class BusinessInfoView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessInfoView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(BusinessInfoViewModel businessInfoViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-794014435);
        int i2 = i | (gapComposer.changedInstance(businessInfoViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (businessInfoViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            LocaleOverlayHelper.BusinessAccountInfo(null, businessInfoViewModel, function1, gapComposer, (i2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
            BusinessInfoViewModel.ConfirmationSheetViewModel confirmationSheetViewModel = businessInfoViewModel.confirmationSheetViewModel;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AccountToDoKt$$ExternalSyntheticLambda0(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ComposeBottomSheetKt.BottomSheet(null, confirmationSheetViewModel, (Function0) rememberedValue, false, false, 1200, null, null, Expect_jvmKt.rememberComposableLambda(445341090, new BrandSheetViewKt$$ExternalSyntheticLambda6(10, function1), gapComposer), gapComposer, 100859904, EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8((Object) this, (Object) businessInfoViewModel, function1, i, 1);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((BusinessInfoViewModel) obj, function1, gapComposer, 0);
    }
}
