package com.squareup.cash.db2.recipients;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.icu.text.MessageFormat;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.primitives.BrandCollectionDataKt;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.booklet.ui.RealBookletGridScope;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.profile.documents.DocumentCategoryQueries$NameQuery;
import com.squareup.cash.db2.profile.documents.DocumentQueries$SelectForTokenQuery;
import com.squareup.cash.db2.referrals.RewardStatusQueries$select$2;
import com.squareup.cash.db2.security.PasswordInfo;
import com.squareup.cash.deposits.physical.db.PaperDepositBarcodeInfo;
import com.squareup.cash.deposits.physical.db.PhysicalDepositsBarcodeQueries$select$2;
import com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositBarcodeAndLogoView;
import com.squareup.cash.deposits.physical.view.barcode.PaperMoneyDepositExpiredBarcodeView;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewModel;
import com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewModel;
import com.squareup.cash.earningstracker.applets.views.EarningsAppletTile;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel;
import com.squareup.cash.elementboundsregistry.core.BoundsRegistry$Bounds;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.family.db.DependentLastSeenSavingsBalanceQueries$getDependentSavingsBalance$2;
import com.squareup.cash.family.db.GetDependentSavingsBalance;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.api.FamilyParsingErrorFactory;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlDependencies;
import com.squareup.cash.family.familyhub.presenters.PromotionsControlPresenter;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.fidesmo.views.StepTurnAnimationQueue;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewEvent$Click;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.offers.db.OffersSheet;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.aegis.sync_values.Dependent;
import com.squareup.protos.cash.aegis.sync_values.FamilyAccount;
import com.squareup.protos.cash.aegis.sync_values.FamilyAccount$Type$Dependent;
import com.squareup.protos.cash.aegis.sync_values.LockCardWarning;
import com.squareup.protos.cash.aegis.sync_values.SendCashCta;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipState;
import com.squareup.protos.cash.aegis.sync_values.Text;
import com.squareup.protos.cash.aegis.sync_values.UiFamilyAccount;
import com.squareup.protos.cash.cashbusinessaccounts.EarningsTrackerSummary;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.money.elements.BookletTile;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.ProfileRow;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.util.android.Views;
import com.squareup.util.android.Views$SCALE$1;
import com.squareup.util.cash.StringsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public final /* synthetic */ class RecipientQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ RecipientQueries$$ExternalSyntheticLambda0(GpsConfigQueries gpsConfigQueries, byte b) {
        this.$r8$classId = 9;
        int i = PhysicalDepositsBarcodeQueries$select$2.$r8$clinit;
        this.f$1 = gpsConfigQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v103, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v60, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v66, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v15, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v10, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v12, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v5, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BrandCollectionDataKt brandCollectionDataKt;
        String str;
        String str2;
        String str3;
        Icons icons;
        String str4;
        int i = this.$r8$classId;
        PromotedAppletTileViewEvent$Click promotedAppletTileViewEvent$Click = PromotedAppletTileViewEvent$Click.INSTANCE;
        int i2 = 20;
        Object obj2 = this.f$1;
        switch (i) {
            case 0:
                RecipientQueries$recipients$2 recipientQueries$recipients$2 = RecipientQueries$recipients$2.INSTANCE;
                ContactQueries contactQueries = (ContactQueries) obj2;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                String string2 = androidCursor.getString(0);
                String string3 = androidCursor.getString(1);
                Boolean bool = androidCursor.getBoolean(2);
                Boolean m = Matcher$$ExternalSyntheticOutline0.m(bool, androidCursor, 3);
                String string4 = androidCursor.getString(4);
                String string5 = androidCursor.getString(5);
                String string6 = androidCursor.getString(6);
                Boolean bool2 = androidCursor.getBoolean(7);
                Boolean m2 = Matcher$$ExternalSyntheticOutline0.m(bool2, androidCursor, 8);
                Boolean bool3 = androidCursor.getBoolean(9);
                bool3.getClass();
                String string7 = androidCursor.getString(10);
                String string8 = androidCursor.getString(11);
                ?? bytes = androidCursor.getBytes(12);
                Image image = bytes != 0 ? (Image) ((WireAdapter) contactQueries.customerAdapter.lazyFetcherFactories).decode(bytes) : null;
                String string9 = androidCursor.getString(13);
                String string10 = androidCursor.getString(14);
                String string11 = androidCursor.getString(15);
                Boolean bool4 = androidCursor.getBoolean(16);
                Boolean m3 = Matcher$$ExternalSyntheticOutline0.m(bool4, androidCursor, 17);
                Long l = androidCursor.getLong(18);
                l.getClass();
                String string12 = androidCursor.getString(19);
                BlockState blockState = string12 != null ? (BlockState) ((EnumColumnAdapter) contactQueries.customerAdapter.interceptors).decode(string12) : null;
                ?? bytes2 = androidCursor.getBytes(20);
                MerchantData merchantData = bytes2 != 0 ? (MerchantData) ((WireAdapter) contactQueries.customerAdapter.mappers).decode(bytes2) : null;
                ?? bytes3 = androidCursor.getBytes(21);
                Color color = bytes3 != 0 ? (Color) ((WireAdapter) contactQueries.customerAdapter.lazyDecoderFactories).decode(bytes3) : null;
                String string13 = androidCursor.getString(22);
                Object[] objArr = {string2, string3, bool, m, string4, string5, string6, bool2, m2, bool3, string7, string8, image, string9, string10, string11, bool4, m3, l, blockState, merchantData, color, string13 != null ? (Region) ((EnumColumnAdapter) contactQueries.customerAdapter.keyers).decode(string13) : null, androidCursor.getString(23), androidCursor.getLong(24), androidCursor.getString(25)};
                if (objArr.length == 26) {
                    return new RecentRecipient((String) objArr[0], (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), (String) objArr[4], (String) objArr[5], (String) objArr[6], ((Boolean) objArr[7]).booleanValue(), ((Boolean) objArr[8]).booleanValue(), ((Boolean) objArr[9]).booleanValue(), (String) objArr[10], (String) objArr[11], (Image) objArr[12], (String) objArr[13], (String) objArr[14], (String) objArr[15], ((Boolean) objArr[16]).booleanValue(), ((Boolean) objArr[17]).booleanValue(), ((Number) objArr[18]).longValue(), (BlockState) objArr[19], (MerchantData) objArr[20], (Color) objArr[21], (Region) objArr[22], (String) objArr[23], (Long) objArr[24], (String) objArr[25]);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Expected 26 arguments");
                return null;
            case 1:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, ((DocumentCategoryQueries$NameQuery) obj2).category_id);
                return Unit.INSTANCE;
            case 2:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, ((DocumentCategoryQueries$NameQuery) obj2).category_id);
                return Unit.INSTANCE;
            case 3:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, ((DocumentCategoryQueries$NameQuery) obj2).category_id);
                return Unit.INSTANCE;
            case 4:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, ((DocumentQueries$SelectForTokenQuery) obj2).token);
                return Unit.INSTANCE;
            case 5:
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindString(0, ((DocumentQueries$SelectForTokenQuery) obj2).token);
                return Unit.INSTANCE;
            case 6:
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                androidStatement6.bindString(0, (String) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key);
                return Unit.INSTANCE;
            case 7:
                RewardStatusQueries$select$2 rewardStatusQueries$select$2 = RewardStatusQueries$select$2.INSTANCE;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj2;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                ((OffersSheet.Adapter) gpsConfigQueries.gpsConfigAdapter).getClass();
                Long l2 = androidCursor2.getLong(0);
                l2.getClass();
                Integer valueOf = Integer.valueOf((int) l2.longValue());
                Boolean bool5 = androidCursor2.getBoolean(1);
                bool5.getClass();
                OffersSheet.Adapter adapter = (OffersSheet.Adapter) gpsConfigQueries.gpsConfigAdapter;
                adapter.getClass();
                Long l3 = androidCursor2.getLong(2);
                l3.getClass();
                Integer valueOf2 = Integer.valueOf((int) l3.longValue());
                Boolean bool6 = androidCursor2.getBoolean(3);
                bool6.getClass();
                String string14 = androidCursor2.getString(4);
                Long l4 = androidCursor2.getLong(5);
                l4.getClass();
                Integer valueOf3 = Integer.valueOf((int) l4.longValue());
                String string15 = androidCursor2.getString(6);
                String string16 = androidCursor2.getString(7);
                Long l5 = androidCursor2.getLong(8);
                l5.getClass();
                Integer valueOf4 = Integer.valueOf((int) l5.longValue());
                Long l6 = androidCursor2.getLong(9);
                l6.getClass();
                Integer valueOf5 = Integer.valueOf((int) l6.longValue());
                Object m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor2, 10, adapter.sheet_keyAdapter);
                String string17 = androidCursor2.getString(11);
                RewardStatus.Expiration expiration = string17 != null ? (RewardStatus.Expiration) adapter.offer_typeAdapter.decode(string17) : null;
                String string18 = androidCursor2.getString(12);
                ?? bytes4 = androidCursor2.getBytes(13);
                ProfileRow profileRow = bytes4 != 0 ? (ProfileRow) adapter.offers_sheet_responseAdapter.decode(bytes4) : null;
                int intValue = valueOf.intValue();
                boolean booleanValue = bool5.booleanValue();
                int intValue2 = valueOf2.intValue();
                boolean booleanValue2 = bool6.booleanValue();
                int intValue3 = valueOf3.intValue();
                int intValue4 = valueOf4.intValue();
                int intValue5 = valueOf5.intValue();
                Money money = (Money) m4;
                money.getClass();
                return new com.squareup.cash.db2.referrals.RewardStatus(intValue, booleanValue, intValue2, booleanValue2, string14, intValue3, string15, string16, intValue4, intValue5, money, expiration, string18, profileRow);
            case 8:
                AndroidStatement androidStatement7 = (AndroidStatement) obj;
                androidStatement7.getClass();
                androidStatement7.bindLong(0, Long.valueOf(((PasswordInfo) obj2).version));
                androidStatement7.bindLong(1, 1L);
                return Unit.INSTANCE;
            case 9:
                int i3 = PhysicalDepositsBarcodeQueries$select$2.$r8$clinit;
                GpsConfigQueries gpsConfigQueries2 = (GpsConfigQueries) obj2;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                Long l7 = androidCursor3.getLong(0);
                Long l8 = androidCursor3.getLong(1);
                ?? bytes5 = androidCursor3.getBytes(2);
                GetPaperCashDepositBarcodeResponse.Success success = bytes5 != 0 ? (GetPaperCashDepositBarcodeResponse.Success) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).pay_dataAdapter.decode(bytes5) : null;
                ?? bytes6 = androidCursor3.getBytes(3);
                return new PaperDepositBarcodeInfo(l7, l8, success, bytes6 != 0 ? (GetPaperCashDepositBarcodeResponse.Failure) ((RecipientConfig$Adapter) gpsConfigQueries2.gpsConfigAdapter).request_dataAdapter.decode(bytes6) : null);
            case 10:
                AndroidStatement androidStatement8 = (AndroidStatement) obj;
                androidStatement8.getClass();
                androidStatement8.bindLong(0, (Long) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key);
                return Unit.INSTANCE;
            case 11:
                PaperMoneyDepositBarcodeAndLogoView paperMoneyDepositBarcodeAndLogoView = (PaperMoneyDepositBarcodeAndLogoView) obj;
                paperMoneyDepositBarcodeAndLogoView.getClass();
                paperMoneyDepositBarcodeAndLogoView.setModel((PaperMoneyDepositBarcodeViewModel) obj2);
                return Unit.INSTANCE;
            case 12:
                ((Context) obj).getClass();
                return ((PaperMoneyDepositExpiredBarcodeView) obj2).formView;
            case 13:
                TextView textView = (TextView) obj2;
                Bitmap bitmap = (Bitmap) obj;
                bitmap.getClass();
                Resources resources = textView.getResources();
                resources.getClass();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
                Views$SCALE$1 views$SCALE$1 = Views.SCALE;
                Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
                compoundDrawablesRelative.getClass();
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], bitmapDrawable, compoundDrawablesRelative[3]);
                Context context = textView.getContext();
                context.getClass();
                textView.setCompoundDrawablePadding(Views.dip(context, 4));
                return Unit.INSTANCE;
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, ((EarningsHeaderViewModel.HeaderViewModel.Loaded) obj2).totalEarningsText);
                return Unit.INSTANCE;
            case 15:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, ((EarningsStreamDetailViewModel.Loaded) ((EarningsStreamDetailViewModel) obj2)).totalEarningsText);
                return Unit.INSTANCE;
            case 16:
                EarningsAppletTile earningsAppletTile = (EarningsAppletTile) obj2;
                PromotedAppletTileViewEvent$Click promotedAppletTileViewEvent$Click2 = (PromotedAppletTileViewEvent$Click) obj;
                promotedAppletTileViewEvent$Click2.getClass();
                if (promotedAppletTileViewEvent$Click2.equals(promotedAppletTileViewEvent$Click)) {
                    earningsAppletTile.onClick.invoke();
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 17:
                EarningsTrackerSummary earningsTrackerSummary = (EarningsTrackerSummary) obj;
                earningsTrackerSummary.getClass();
                Long l9 = earningsTrackerSummary.first_business_upgrade_at;
                l9.getClass();
                return DimensionKt.millisToLocalDate(l9.longValue(), ((AndroidClock) ((LocalPosCheckInPresenter) obj2).store).timeZone());
            case 18:
                AndroidStatement androidStatement9 = (AndroidStatement) obj;
                androidStatement9.getClass();
                androidStatement9.bindString(0, (String) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key);
                return Unit.INSTANCE;
            case 19:
                EducationStoryViewModel.Ready ready = (EducationStoryViewModel.Ready) obj2;
                WebView webView = (WebView) obj;
                webView.getClass();
                webView.setBackgroundColor(ready.backgroundColor);
                String str5 = ready.storyUrl;
                if (!str5.equals(webView.getUrl())) {
                    webView.loadUrl(str5);
                }
                return Unit.INSTANCE;
            case 20:
                Map map = (Map) obj;
                map.getClass();
                return (BoundsRegistry$Bounds) map.get((Enum) obj2);
            case 21:
                FamilyAppletTile familyAppletTile = (FamilyAppletTile) obj2;
                PromotedAppletTileViewEvent$Click promotedAppletTileViewEvent$Click3 = (PromotedAppletTileViewEvent$Click) obj;
                promotedAppletTileViewEvent$Click3.getClass();
                if (promotedAppletTileViewEvent$Click3.equals(promotedAppletTileViewEvent$Click)) {
                    ((TaxesAppletViewsModule$$ExternalSyntheticLambda1) familyAppletTile.onClick).invoke();
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 22:
                int i4 = DependentLastSeenSavingsBalanceQueries$getDependentSavingsBalance$2.$r8$clinit;
                GpsConfigQueries gpsConfigQueries3 = (GpsConfigQueries) obj2;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                ?? bytes7 = androidCursor4.getBytes(0);
                Money money2 = bytes7 != 0 ? (Money) ((RecipientConfig$Adapter) gpsConfigQueries3.gpsConfigAdapter).pay_dataAdapter.decode(bytes7) : null;
                ?? bytes8 = androidCursor4.getBytes(1);
                return new GetDependentSavingsBalance(money2, bytes8 != 0 ? (Money) ((RecipientConfig$Adapter) gpsConfigQueries3.gpsConfigAdapter).request_dataAdapter.decode(bytes8) : null);
            case 23:
                AndroidStatement androidStatement10 = (AndroidStatement) obj;
                androidStatement10.getClass();
                androidStatement10.bindString(0, (String) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key);
                return Unit.INSTANCE;
            case 24:
                RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) obj2;
                UiFamilyAccount uiFamilyAccount = (UiFamilyAccount) obj;
                uiFamilyAccount.getClass();
                FamilyAccount familyAccount = uiFamilyAccount.family_account;
                if (familyAccount == null || (brandCollectionDataKt = familyAccount.f1246type) == null) {
                    return null;
                }
                FamilyAccount$Type$Dependent familyAccount$Type$Dependent = brandCollectionDataKt instanceof FamilyAccount$Type$Dependent ? (FamilyAccount$Type$Dependent) brandCollectionDataKt : null;
                Dependent dependent = familyAccount$Type$Dependent != null ? familyAccount$Type$Dependent.value : null;
                if (dependent == null) {
                    return null;
                }
                FamilyParsingErrorFactory familyParsingErrorFactory = FamilyParsingErrorFactory.INSTANCE;
                try {
                    ProtoValidationScope protoValidationScope = new ProtoValidationScope(dependent, familyParsingErrorFactory, realFamilyAccountsManager);
                    SendCashCta sendCashCta = (SendCashCta) protoValidationScope.reportIfNullAndContinue("send_cash_cta", (String) null, dependent.send_cash_cta);
                    if (sendCashCta != null && (str = (String) protoValidationScope.reportIfNullAndContinue("customer_token", (String) null, dependent.customer_token)) != null && (str2 = (String) protoValidationScope.reportIfNullAndContinue("send_cash_cta.text", (String) null, sendCashCta.text)) != null && (str3 = (String) protoValidationScope.reportIfNullAndContinue("send_cash_cta.url", (String) null, sendCashCta.url)) != null) {
                        LockCardWarning lockCardWarning = dependent.lock_card_warning;
                        String str6 = lockCardWarning != null ? lockCardWarning.text : null;
                        Text text = dependent.lock_card_error;
                        String str7 = text != null ? text.text : null;
                        SponsorshipState sponsorshipState = (SponsorshipState) protoValidationScope.reportIfNullAndContinue("status", (String) null, dependent.status);
                        if (sponsorshipState == null) {
                            return null;
                        }
                        return new com.squareup.cash.family.familyhub.backend.api.Dependent(str, str2, str3, str6, str7, sponsorshipState, dependent.switching_identifier);
                    }
                    return null;
                } catch (Exception e) {
                    throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(Dependent.class), familyParsingErrorFactory, null);
                }
            case 25:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                BaseDependentControlDependencies baseDependentControlDependencies = ((PromotionsControlPresenter) obj2).deps;
                String str8 = baseDependentControlDependencies.stringManager.get(R.string.family_account_dependent_notifications_disabling_confirmation_dialog_title);
                AndroidStringManager androidStringManager = baseDependentControlDependencies.stringManager;
                return new ControlDisablingConfirmationScreen(str8, "", androidStringManager.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_confirm_button_title), androidStringManager.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_cancel_button_title), ControlType.NOTIFICATIONS, askedQuestion, 96);
            case 26:
                RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) obj2;
                FamilyProfile familyProfile = (FamilyProfile) obj;
                familyProfile.getClass();
                if (familyProfile.equals(FamilyProfile.Standard.INSTANCE)) {
                    return null;
                }
                if (!(familyProfile instanceof FamilyProfile.ManagedAccount)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                AndroidStringManager androidStringManager2 = realFamilyProfileManager.stringManager;
                Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("firstName", ((FamilyProfile.ManagedAccount) familyProfile).firstName));
                mapOf.getClass();
                Resources resources2 = androidStringManager2.resources;
                resources2.getClass();
                String format2 = new MessageFormat(resources2.getString(R.string.uninstalled_header_more_for_you_managed_account)).format(mapOf);
                format2.getClass();
                return format2;
            case 27:
                RealBookletGridScope realBookletGridScope = (RealBookletGridScope) obj;
                realBookletGridScope.getClass();
                for (BookletTile.GridContent.GridItem gridItem : ((BookletTile.GridContent) obj2).grid_items) {
                    Icon icon = gridItem.icon;
                    if (icon == null || (str4 = icon.arcade_id) == null) {
                        icons = null;
                    } else {
                        Icons.Companion.getClass();
                        icons = zzd.get(str4);
                    }
                    LocalizedString localizedString = gridItem.title_text;
                    localizedString.getClass();
                    String translated = StringsKt.translated(localizedString);
                    LocalizedString localizedString2 = gridItem.detail_text;
                    localizedString2.getClass();
                    realBookletGridScope.gridBlock(icons, translated, StringsKt.translated(localizedString2));
                }
                return Unit.INSTANCE;
            case 28:
                String str9 = (String) obj;
                str9.getClass();
                ((UriHandler) obj2).openUri(str9);
                return Unit.INSTANCE;
            default:
                ((DisposableEffectScope) obj).getClass();
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1((StepTurnAnimationQueue) obj2, i2);
        }
    }

    public /* synthetic */ RecipientQueries$$ExternalSyntheticLambda0(GpsConfigQueries gpsConfigQueries) {
        this.$r8$classId = 7;
        RewardStatusQueries$select$2 rewardStatusQueries$select$2 = RewardStatusQueries$select$2.INSTANCE;
        this.f$1 = gpsConfigQueries;
    }

    public /* synthetic */ RecipientQueries$$ExternalSyntheticLambda0(ContactQueries contactQueries) {
        this.$r8$classId = 0;
        RecipientQueries$recipients$2 recipientQueries$recipients$2 = RecipientQueries$recipients$2.INSTANCE;
        this.f$1 = contactQueries;
    }

    public /* synthetic */ RecipientQueries$$ExternalSyntheticLambda0(GpsConfigQueries gpsConfigQueries, char c) {
        this.$r8$classId = 22;
        int i = DependentLastSeenSavingsBalanceQueries$getDependentSavingsBalance$2.$r8$clinit;
        this.f$1 = gpsConfigQueries;
    }

    public /* synthetic */ RecipientQueries$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
    }
}
