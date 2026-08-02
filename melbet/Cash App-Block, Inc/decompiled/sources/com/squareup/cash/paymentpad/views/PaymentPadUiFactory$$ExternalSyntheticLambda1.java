package com.squareup.cash.paymentpad.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzie;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.education.stories.screens.EducationStoryScreen;
import com.squareup.cash.education.stories.screens.EducationStoryViewPagerScreen;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewPagerViewModel;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.paymentpad.screens.LitePaymentPadSheetScreen;
import com.squareup.cash.paymentpad.viewmodels.LitePaymentPadViewModel;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerConfirmRemoveDevicesScreen;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.stripe.android.model.parsers.TokenJsonParser;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final /* synthetic */ class PaymentPadUiFactory$$ExternalSyntheticLambda1 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Screen f$0;

    public /* synthetic */ PaymentPadUiFactory$$ExternalSyntheticLambda1(int i, Screen screen) {
        this.$r8$classId = i;
        this.f$0 = screen;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Screen screen = this.f$0;
        switch (i) {
            case 0:
                LitePaymentPadViewModel litePaymentPadViewModel = (LitePaymentPadViewModel) obj;
                Function1 function1 = (Function1) obj2;
                int intValue = ((Integer) obj4).intValue();
                litePaymentPadViewModel.getClass();
                function1.getClass();
                HomeViewKt.LitePaymentPad(litePaymentPadViewModel, ((LitePaymentPadSheetScreen) screen).animateEntrance, function1, (Composer) obj3, ((intValue << 3) & 896) | (intValue & 14));
                break;
            case 1:
                EducationStoryViewModel educationStoryViewModel = (EducationStoryViewModel) obj;
                Function1 function12 = (Function1) obj2;
                Composer composer = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                function12.getClass();
                EducationStoryScreen educationStoryScreen = (EducationStoryScreen) screen;
                int i2 = educationStoryScreen.initialSceneIndex;
                ColorModel colorModel = educationStoryScreen.accentColor;
                if (colorModel == null) {
                    colorModel = ColorModel.CashGreen.INSTANCE;
                }
                zzie.EducationStoryContent(i2, educationStoryViewModel, function12, colorModel, composer, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                break;
            case 2:
                EducationStoryViewPagerViewModel educationStoryViewPagerViewModel = (EducationStoryViewPagerViewModel) obj;
                int intValue3 = ((Integer) obj4).intValue();
                educationStoryViewPagerViewModel.getClass();
                ((Function1) obj2).getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj3);
                gapComposer.startReplaceGroup(-1919753318);
                EducationStoryViewPagerScreen educationStoryViewPagerScreen = (EducationStoryViewPagerScreen) screen;
                TokenJsonParser.EducationStoryViewPagerContent(educationStoryViewPagerScreen.initialStoryIndex, educationStoryViewPagerViewModel, educationStoryViewPagerScreen.accentColor, gapComposer, (intValue3 << 3) & 112);
                gapComposer.end(false);
                break;
            case 3:
                Function1 function13 = (Function1) obj2;
                Composer composer2 = (Composer) obj3;
                int m = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function13);
                if ((m & 48) == 0) {
                    m |= ((GapComposer) composer2).changedInstance(function13) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(m & 1, (m & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    AliasPickerViewKt.ConfirmAccountRemovalContent(function13, (OnboardingConfirmAccountRemovalScreen) screen, gapComposer2, (m >> 3) & 14);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Function1 function14 = (Function1) obj2;
                Composer composer3 = (Composer) obj3;
                int m2 = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function14);
                if ((m2 & 48) == 0) {
                    m2 |= ((GapComposer) composer3).changedInstance(function14) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(m2 & 1, (m2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    DeviceManagerListViewKt.ConfirmRemoveDevicesContent((DeviceManagerConfirmRemoveDevicesScreen) screen, function14, null, gapComposer3, m2 & 112);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
