package com.squareup.cash.account.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.account.components.customer.EditCustomerProfileKt;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$EditCustomerProfileViewModel;
import com.squareup.cash.account.settings.viewmodels.ViewMode;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final /* synthetic */ class EditProfileUiViewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EditProfileViewModel$EditCustomerProfileViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EditProfileUiViewKt$$ExternalSyntheticLambda3(EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = editProfileViewModel$EditCustomerProfileViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$1;
        EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel = this.f$0;
        switch (i) {
            case 0:
                ViewMode viewMode = (ViewMode) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                viewMode.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(viewMode.ordinal()) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    int ordinal = viewMode.ordinal();
                    if (ordinal == 0) {
                        gapComposer.startReplaceGroup(-1349529628);
                        if (editProfileViewModel$EditCustomerProfileViewModel == null) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -182080546, false);
                        }
                        gapComposer.startReplaceGroup(-1349449338);
                        EditCustomerProfileKt.EditCustomerProfile(MLKEMEngine.KyberPolyBytes, gapComposer, SizeKt.fillMaxSize(companion, 1.0f), editProfileViewModel$EditCustomerProfileViewModel, function1);
                        gapComposer.end(false);
                        gapComposer.end(false);
                    } else {
                        if (ordinal != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -182081333, false);
                        }
                        gapComposer.startReplaceGroup(-1349223751);
                        if (editProfileViewModel$EditCustomerProfileViewModel == null) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -182070679, false);
                        }
                        gapComposer.startReplaceGroup(-1349143461);
                        AccountToDoKt.CustomerProfilePreview(editProfileViewModel$EditCustomerProfileViewModel.previewModel, editProfileViewModel$EditCustomerProfileViewModel.avatar, editProfileViewModel$EditCustomerProfileViewModel.fullname, editProfileViewModel$EditCustomerProfileViewModel.cashtag, editProfileViewModel$EditCustomerProfileViewModel.isManagedAccount, editProfileViewModel$EditCustomerProfileViewModel.canEditPhoto, editProfileViewModel$EditCustomerProfileViewModel.previewTrustIndicators, SizeKt.fillMaxSize(companion, 1.0f), gapComposer, 12582912);
                        gapComposer.end(false);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 17) != 16)) {
                    EditProfileViewModel$EditCustomerProfileViewModel.BusinessUpgradeModel businessUpgradeModel = editProfileViewModel$EditCustomerProfileViewModel.businessUpgradeModel;
                    if (businessUpgradeModel == null) {
                        gapComposer2.startReplaceGroup(1877283793);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1877283794);
                        ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed = gapComposer2.changed(function1) | gapComposer2.changedInstance(editProfileViewModel$EditCustomerProfileViewModel);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(8, function1, editProfileViewModel$EditCustomerProfileViewModel);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-131826149, new BalanceFeedKt$$ExternalSyntheticLambda9(businessUpgradeModel, r2), gapComposer2), gapComposer2, 1573296, 56);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
