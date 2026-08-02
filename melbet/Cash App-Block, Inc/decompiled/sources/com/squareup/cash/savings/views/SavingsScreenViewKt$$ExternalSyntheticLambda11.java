package com.squareup.cash.savings.views;

import android.content.Context;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.ViewKt;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.marketing.components.CardUpsellIllustration;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import squareup.cash.savings.bespoke_elements.CardImage;

/* loaded from: classes7.dex */
public final /* synthetic */ class SavingsScreenViewKt$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SavingsScreenViewModel.Content.SavingsScreenElement f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ SavingsScreenViewKt$$ExternalSyntheticLambda11(SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement, Function1 function1, Modifier modifier) {
        this.$r8$classId = 3;
        this.f$0 = savingsScreenElement;
        this.f$2 = function1;
        this.f$1 = modifier;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        Modifier modifier = this.f$1;
        SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ButtonGroupKt.ButtonGroup((SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup) savingsScreenElement, modifier, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    SavingsScreenViewKt.Disclosure((SavingsScreenViewModel.Content.SavingsScreenElement.Disclosure) savingsScreenElement, modifier, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ButtonGroupKt.GoalFolderList((SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList) savingsScreenElement, modifier, function1, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(939899952, new SheetKt$$ExternalSyntheticLambda6(savingsScreenElement, 5), gapComposer4);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1300751271, new ButtonGroupKt$$ExternalSyntheticLambda11(savingsScreenElement, 17), gapComposer4);
                    boolean changedInstance = gapComposer4.changedInstance(savingsScreenElement) | gapComposer4.changed(function1);
                    Object rememberedValue = gapComposer4.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(14, (Object) savingsScreenElement, function1);
                        gapComposer4.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    CardImage cardImage = ((SavingsScreenViewModel.Content.SavingsScreenElement.CompactCard) savingsScreenElement).image;
                    CardUpsellIllustration cardUpsellIllustration = null;
                    if (cardImage != null) {
                        gapComposer4.startReplaceGroup(1611011509);
                        Context context = (Context) gapComposer4.consume(AndroidCompositionLocals_androidKt.LocalContext);
                        context.getClass();
                        switch (cardImage) {
                            case CARD_IMAGE_UNRECOGNIZED:
                            case PERCENTAGE:
                                break;
                            case CASH_CARD:
                                cardUpsellIllustration = ViewKt.fromDrawableRes(context, 2131232756, 2131232756, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE);
                                break;
                            case PIGGY_BANK:
                                cardUpsellIllustration = ViewKt.fromDrawableRes(context, R.drawable.icon_upsell_savings_yield, R.drawable.icon_upsell_savings_yield, EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 131);
                                break;
                            case RAKE:
                                cardUpsellIllustration = ViewKt.fromDrawableRes(context, R.drawable.icon_upsell_rake_light, R.drawable.icon_upsell_rake_dark, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, 151);
                                break;
                            case KEYS:
                                cardUpsellIllustration = ViewKt.fromDrawableRes(context, R.drawable.icon_upsell_keys, R.drawable.icon_upsell_keys, 115, 115);
                                break;
                            case PROPAGATION:
                                cardUpsellIllustration = ViewKt.fromDrawableRes(context, R.drawable.icon_upsell_propogation, R.drawable.icon_upsell_propogation, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE);
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                        }
                    } else {
                        gapComposer4.startReplaceGroup(-1598250772);
                    }
                    gapComposer4.end(false);
                    CardUpsellKt.CardUpsellSmall(rememberComposableLambda, rememberComposableLambda2, function0, m300paddingVpY3zN4$default, null, cardUpsellIllustration, gapComposer4, 54, 16);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(1 & intValue5, (intValue5 & 3) != 2)) {
                    ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    SavingsScreenViewKt.UpsellCard((SavingsScreenViewModel.Content.SavingsScreenElement.Card) savingsScreenElement, SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2), function1, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            default:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    ButtonGroupKt.SavingsCellDefault(((SavingsScreenViewModel.Content.CellDefaultElement) savingsScreenElement).cell, modifier, function1, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SavingsScreenViewKt$$ExternalSyntheticLambda11(SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement, Modifier modifier, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = savingsScreenElement;
        this.f$1 = modifier;
        this.f$2 = function1;
    }
}
