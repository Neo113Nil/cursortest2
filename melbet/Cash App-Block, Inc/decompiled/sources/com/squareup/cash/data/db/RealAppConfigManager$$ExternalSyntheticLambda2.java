package com.squareup.cash.data.db;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.AndroidShader_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.HitTestResultKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextRange;
import app.cash.paraphrase.FormattedResource;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.StampSheetViewModel;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.cashapppay.viewmodels.StatusInterstitialViewModel;
import com.squareup.cash.cashapppay.views.StatusInterstitialSheetKt;
import com.squareup.cash.core.navigationcontainer.UiContainerKt$BottomSheet$1$sheetScope$1;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.offers.viewmodels.ArcadeOffersTimelineViewModels;
import com.squareup.cash.offers.viewmodels.OfferCountdownCaptionViewModel;
import com.squareup.cash.offers.viewmodels.OfferCountdownTemplateViewModel;
import com.squareup.cash.offers.views.FormattedCaptionViewModel;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerOptionsMenuViewModel;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewModel;
import com.squareup.cash.shopping.autofill.views.EditAutofillViewKt;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.util.cash.Countries;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealAppConfigManager$$ExternalSyntheticLambda2 implements Function5 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RealAppConfigManager$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        if (r11 == androidx.compose.runtime.Composer.Companion.Empty) goto L20;
     */
    @Override // kotlin.jvm.functions.Function5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object obj6;
        long j;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                List list = (List) obj3;
                List list2 = (List) obj4;
                List list3 = (List) obj5;
                if (str == null) {
                    str = "https://cash.me/scripts/payment-history.js";
                }
                String str3 = str;
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                List list4 = list;
                if (list2 == null) {
                    list2 = EmptyList.INSTANCE;
                }
                List list5 = list2;
                if (list3 == null) {
                    list3 = EmptyList.INSTANCE;
                }
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                TextRange textRange = (TextRange) obj5;
                String obj7 = ((CharSequence) obj4).subSequence(TextRange.m990getMinimpl(textRange.packedValue), TextRange.m989getMaximpl(textRange.packedValue)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj7);
                ((Context) obj).startActivity(className);
                break;
            case 2:
                ((Integer) obj5).intValue();
                ((UiContainerKt$BottomSheet$1$sheetScope$1) obj).getClass();
                ((Unit) obj2).getClass();
                ((Function1) obj3).getClass();
                SsnViewKt.GetFlowLoadingSheet((Composer) obj4, 0);
                break;
            case 3:
                StampSheetViewModel stampSheetViewModel = (StampSheetViewModel) obj2;
                Function1 function1 = (Function1) obj3;
                int intValue = ((Integer) obj5).intValue();
                ((UiContainerKt$BottomSheet$1$sheetScope$1) obj).getClass();
                stampSheetViewModel.getClass();
                function1.getClass();
                CanvasKt.StampSheet(stampSheetViewModel, function1, (Composer) obj4, (intValue >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 4:
                HeartScene heartScene = (HeartScene) obj;
                float floatValue = ((Float) obj2).floatValue();
                float floatValue2 = ((Float) obj3).floatValue();
                float floatValue3 = ((Float) obj4).floatValue();
                float floatValue4 = ((Float) obj5).floatValue();
                heartScene.getClass();
                break;
            case 5:
                MiniCardScene miniCardScene = (MiniCardScene) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                float floatValue6 = ((Float) obj3).floatValue();
                float floatValue7 = ((Float) obj4).floatValue();
                float floatValue8 = ((Float) obj5).floatValue();
                miniCardScene.getClass();
                break;
            case 6:
                WandScene wandScene = (WandScene) obj;
                float floatValue9 = ((Float) obj2).floatValue();
                float floatValue10 = ((Float) obj3).floatValue();
                float floatValue11 = ((Float) obj4).floatValue();
                float floatValue12 = ((Float) obj5).floatValue();
                wandScene.getClass();
                break;
            case 7:
                Function1 function12 = (Function1) obj3;
                int intValue2 = ((Integer) obj5).intValue();
                ((UiContainerKt$BottomSheet$1$sheetScope$1) obj).getClass();
                function12.getClass();
                StatusInterstitialSheetKt.StatusInterstitialSheetContent((StatusInterstitialViewModel) obj2, function12, (Composer) obj4, (intValue2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 8:
                ArcadeOffersTimelineViewModels arcadeOffersTimelineViewModels = (ArcadeOffersTimelineViewModels) obj2;
                Function1 function13 = (Function1) obj3;
                int intValue3 = ((Integer) obj5).intValue();
                ((UiContainerKt$BottomSheet$1$sheetScope$1) obj).getClass();
                arcadeOffersTimelineViewModels.getClass();
                function13.getClass();
                HitTestResultKt.OffersTimelineSheet(arcadeOffersTimelineViewModels, function13, (Composer) obj4, (intValue3 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            case 9:
                AndroidClock androidClock = (AndroidClock) obj;
                OfferCountdownTemplateViewModel offerCountdownTemplateViewModel = (OfferCountdownTemplateViewModel) obj2;
                Function1 function14 = (Function1) obj3;
                int intValue4 = ((Integer) obj5).intValue();
                androidClock.getClass();
                offerCountdownTemplateViewModel.getClass();
                function14.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj4);
                gapComposer.startReplaceGroup(-1373408279);
                OfferCountdownCaptionViewModel offerCountdownCaptionModels = AndroidShader_androidKt.offerCountdownCaptionModels(androidClock, offerCountdownTemplateViewModel, gapComposer, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                Boolean valueOf = Boolean.valueOf(offerCountdownCaptionModels.isExpired);
                boolean changedInstance = ((((intValue4 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(function14)) || (intValue4 & MLKEMEngine.KyberPolyBytes) == 256) | gapComposer.changedInstance(offerCountdownCaptionModels);
                Object rememberedValue = gapComposer.rememberedValue();
                if (!changedInstance) {
                    obj6 = rememberedValue;
                    break;
                }
                MainPaymentView$Content$2$1 mainPaymentView$Content$2$1 = new MainPaymentView$Content$2$1(offerCountdownCaptionModels, function14, z ? 1 : 0, 5);
                gapComposer.updateRememberedValue(mainPaymentView$Content$2$1);
                obj6 = mainPaymentView$Content$2$1;
                Updater.LaunchedEffect(gapComposer, valueOf, (Function2) obj6);
                Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
                FormattedResource formattedResource = offerCountdownCaptionModels.timeUntilExpirationFormattedResource;
                String string2 = formattedResource != null ? Countries.getString(context, formattedResource) : null;
                if (string2 == null) {
                    string2 = "";
                } else {
                    String str4 = offerCountdownCaptionModels.captionTemplate;
                    if (str4 != null) {
                        string2 = StringsKt__StringsJVMKt.replace$default(str4, offerCountdownCaptionModels.stringToReplace, string2);
                    }
                }
                Color composeColor = ComposeUtilsKt.toComposeColor(offerCountdownCaptionModels.captionColor, gapComposer);
                if (composeColor == null) {
                    gapComposer.startReplaceGroup(-1911211355);
                    j = MooncakeTheme.getColors(gapComposer).label;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1911213029);
                    gapComposer.end(false);
                    j = composeColor.value;
                }
                FormattedCaptionViewModel formattedCaptionViewModel = new FormattedCaptionViewModel(string2, j, offerCountdownCaptionModels.icon);
                gapComposer.end(false);
                break;
            case 10:
                AccountPickerOptionsMenuViewModel accountPickerOptionsMenuViewModel = (AccountPickerOptionsMenuViewModel) obj2;
                Function1 function15 = (Function1) obj3;
                int intValue5 = ((Integer) obj5).intValue();
                ((UiContainerKt$BottomSheet$1$sheetScope$1) obj).getClass();
                accountPickerOptionsMenuViewModel.getClass();
                function15.getClass();
                AliasPickerViewKt.AccountPickerOptionsMenu(accountPickerOptionsMenuViewModel, function15, null, (Composer) obj4, (intValue5 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
            default:
                EditAutofillViewModel editAutofillViewModel = (EditAutofillViewModel) obj2;
                Function1 function16 = (Function1) obj3;
                int intValue6 = ((Integer) obj5).intValue();
                ((UiContainerKt$BottomSheet$1$sheetScope$1) obj).getClass();
                editAutofillViewModel.getClass();
                function16.getClass();
                EditAutofillViewKt.EditAutofill(editAutofillViewModel, function16, (Composer) obj4, (intValue6 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                break;
        }
        return Unit.INSTANCE;
    }
}
