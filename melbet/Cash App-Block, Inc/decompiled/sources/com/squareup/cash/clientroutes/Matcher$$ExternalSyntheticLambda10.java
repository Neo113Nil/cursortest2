package com.squareup.cash.clientroutes;

import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.PendingIntentCompat;
import androidx.core.content.ContextCompat$Api28Impl;
import androidx.core.content.PermissionChecker;
import androidx.core.graphics.PaintCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.net.UriKt;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.TypedValueCompat;
import androidx.room.TransactorKt;
import coil3.network.internal.Utils_androidKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahx;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.google.android.gms.internal.mlkit_vision_face.zzjo;
import com.squareup.cash.clientroutes.AccountRequirement;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.profile.components.ProfilePhotoKt;
import com.squareup.cash.recipients.data.UtilsKt;
import com.squareup.cash.sheet.RealSheetStateKt;
import com.squareup.cash.sheet.SheetStateKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyIterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class Matcher$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Matcher$$ExternalSyntheticLambda10(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Uri uri = (Uri) obj;
                uri.getClass();
                ClientRouteSpec clientRouteSpec = ClientRouteSpec.cashInReview;
                ClientRouteSpec viewInvestingContactSettings = zzjo.getViewInvestingContactSettings();
                Matcher matcher = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters = TransactorKt.matchWithAllParameters(uri, "^/dl/view/investing-contact-settings/?$", false, viewInvestingContactSettings.getParameterNames());
                AccountRequirement accountRequirement = TransactorKt.accountRequirement(uri, viewInvestingContactSettings);
                String matchAccountIdentifier = TransactorKt.matchAccountIdentifier(uri, accountRequirement);
                if (accountRequirement.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier == null) {
                    return null;
                }
                ClientRouteSpec copy$default = ClientRouteSpec.copy$default(viewInvestingContactSettings, accountRequirement, TransactorKt.authentication(uri, viewInvestingContactSettings), viewInvestingContactSettings.isDeprecated());
                EmptyList emptyList = ClientRoute.ViewInvestingContactSettings.deepLinkSpecs;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(Utils_androidKt.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters != null) {
                    return new ClientRoute.ViewInvestingContactSettings(copy$default, arrayList, matchAccountIdentifier);
                }
                return null;
            case 1:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("boostConfig");
                return Unit.INSTANCE;
            case 2:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("orderedRewardToken");
                return Unit.INSTANCE;
            case 3:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("rewardMerchant");
                return Unit.INSTANCE;
            case 4:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("reward");
                return Unit.INSTANCE;
            case 5:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("rewardSelection");
                return Unit.INSTANCE;
            case 6:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("rewardSlot");
                return Unit.INSTANCE;
            case 7:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("selectableReward");
                return Unit.INSTANCE;
            case 8:
                Function1 function18 = (Function1) obj;
                function18.getClass();
                function18.invoke("selectedReward");
                return Unit.INSTANCE;
            case 9:
                Function1 function19 = (Function1) obj;
                function19.getClass();
                function19.invoke("userRewardsData");
                return Unit.INSTANCE;
            case 10:
                Uri uri2 = (Uri) obj;
                uri2.getClass();
                ClientRouteSpec clientRouteSpec2 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewBusinessProfile = zzjo.getDeprecatedViewBusinessProfile();
                Matcher matcher2 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters2 = TransactorKt.matchWithAllParameters(uri2, "^/dl/view/profile/business/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/?$", false, deprecatedViewBusinessProfile.getParameterNames());
                AccountRequirement accountRequirement2 = TransactorKt.accountRequirement(uri2, deprecatedViewBusinessProfile);
                String matchAccountIdentifier2 = TransactorKt.matchAccountIdentifier(uri2, accountRequirement2);
                if (accountRequirement2.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier2 == null) {
                    return null;
                }
                ClientRouteSpec copy$default2 = ClientRouteSpec.copy$default(deprecatedViewBusinessProfile, accountRequirement2, TransactorKt.authentication(uri2, deprecatedViewBusinessProfile), deprecatedViewBusinessProfile.isDeprecated());
                EmptyList emptyList2 = ClientRoute.DeprecatedViewBusinessProfile.deepLinkSpecs;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(ProfilePhotoKt.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters2 == null) {
                    return null;
                }
                Object obj2 = matchWithAllParameters2.get("entity_token");
                obj2.getClass();
                return new ClientRoute.DeprecatedViewBusinessProfile(copy$default2, arrayList2, matchAccountIdentifier2, (String) obj2);
            case 11:
                Uri uri3 = (Uri) obj;
                uri3.getClass();
                ClientRouteSpec clientRouteSpec3 = ClientRouteSpec.cashInReview;
                ClientRouteSpec noOperation = zzjo.getNoOperation();
                Matcher matcher3 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters3 = TransactorKt.matchWithAllParameters(uri3, "^/dl/noop/?$", false, noOperation.getParameterNames());
                AccountRequirement accountRequirement3 = TransactorKt.accountRequirement(uri3, noOperation);
                String matchAccountIdentifier3 = TransactorKt.matchAccountIdentifier(uri3, accountRequirement3);
                if (accountRequirement3.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier3 == null) {
                    return null;
                }
                ClientRouteSpec copy$default3 = ClientRouteSpec.copy$default(noOperation, accountRequirement3, TransactorKt.authentication(uri3, noOperation), noOperation.isDeprecated());
                List list = ClientRoute.NoOperation.deepLinkSpecs;
                List<DeepLinkSpec> deepLinkSpecs = RealSheetStateKt.getDeepLinkSpecs();
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(deepLinkSpecs, 10));
                for (DeepLinkSpec deepLinkSpec : deepLinkSpecs) {
                    arrayList3.add(new DeepLinkSpec(deepLinkSpec.getName(), deepLinkSpec.getPathFormat(), copy$default3));
                }
                if (matchWithAllParameters3 != null) {
                    return new ClientRoute.NoOperation(copy$default3, arrayList3, matchAccountIdentifier3);
                }
                return null;
            case 12:
                Uri uri4 = (Uri) obj;
                uri4.getClass();
                ClientRouteSpec clientRouteSpec4 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewCancelPendingSingleUsePayment = zzjo.getDeprecatedViewCancelPendingSingleUsePayment();
                Matcher matcher4 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters4 = TransactorKt.matchWithAllParameters(uri4, "^/dl/view/cancel_pending_sup/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/?$", false, deprecatedViewCancelPendingSingleUsePayment.getParameterNames());
                AccountRequirement accountRequirement4 = TransactorKt.accountRequirement(uri4, deprecatedViewCancelPendingSingleUsePayment);
                String matchAccountIdentifier4 = TransactorKt.matchAccountIdentifier(uri4, accountRequirement4);
                if (accountRequirement4.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier4 == null) {
                    return null;
                }
                ClientRouteSpec copy$default4 = ClientRouteSpec.copy$default(deprecatedViewCancelPendingSingleUsePayment, accountRequirement4, TransactorKt.authentication(uri4, deprecatedViewCancelPendingSingleUsePayment), deprecatedViewCancelPendingSingleUsePayment.isDeprecated());
                EmptyList emptyList3 = ClientRoute.DeprecatedViewCancelPendingSingleUsePayment.deepLinkSpecs;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(CurveFit.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters4 == null) {
                    return null;
                }
                Object obj3 = matchWithAllParameters4.get("payment_token");
                obj3.getClass();
                return new ClientRoute.DeprecatedViewCancelPendingSingleUsePayment(copy$default4, arrayList4, matchAccountIdentifier4, (String) obj3);
            case 13:
                Uri uri5 = (Uri) obj;
                uri5.getClass();
                ClientRouteSpec clientRouteSpec5 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewCashAppPayOfferInAppBrowser = zzjo.getDeprecatedViewCashAppPayOfferInAppBrowser();
                Matcher matcher5 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters5 = TransactorKt.matchWithAllParameters(uri5, "^/dl/view/cash-app-pay-offer-browser/([0123456789\\.]+)/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\\+\\-/=\\._]+)/?$", false, deprecatedViewCashAppPayOfferInAppBrowser.getParameterNames());
                AccountRequirement accountRequirement5 = TransactorKt.accountRequirement(uri5, deprecatedViewCashAppPayOfferInAppBrowser);
                String matchAccountIdentifier5 = TransactorKt.matchAccountIdentifier(uri5, accountRequirement5);
                if (accountRequirement5.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier5 == null) {
                    return null;
                }
                ClientRouteSpec copy$default5 = ClientRouteSpec.copy$default(deprecatedViewCashAppPayOfferInAppBrowser, accountRequirement5, TransactorKt.authentication(uri5, deprecatedViewCashAppPayOfferInAppBrowser), deprecatedViewCashAppPayOfferInAppBrowser.isDeprecated());
                EmptyList emptyList4 = ClientRoute.DeprecatedViewCashAppPayOfferInAppBrowser.deepLinkSpecs;
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(zzaky.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters5 == null) {
                    return null;
                }
                Object obj4 = matchWithAllParameters5.get("discountPct");
                obj4.getClass();
                String str = (String) obj4;
                Object obj5 = matchWithAllParameters5.get("base64_encoded_shop_url");
                obj5.getClass();
                return new ClientRoute.DeprecatedViewCashAppPayOfferInAppBrowser(copy$default5, matchAccountIdentifier5, str, (String) obj5, arrayList5);
            case 14:
                Uri uri6 = (Uri) obj;
                uri6.getClass();
                ClientRouteSpec clientRouteSpec6 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewCashAppPayOfferInAppBrowserV2 = zzjo.getDeprecatedViewCashAppPayOfferInAppBrowserV2();
                Matcher matcher6 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters6 = TransactorKt.matchWithAllParameters(uri6, "^/dl/view/cash-pay-offer-browser/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\\+\\-/=\\._]+)/?$", false, deprecatedViewCashAppPayOfferInAppBrowserV2.getParameterNames());
                AccountRequirement accountRequirement6 = TransactorKt.accountRequirement(uri6, deprecatedViewCashAppPayOfferInAppBrowserV2);
                String matchAccountIdentifier6 = TransactorKt.matchAccountIdentifier(uri6, accountRequirement6);
                if (accountRequirement6.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier6 == null) {
                    return null;
                }
                ClientRouteSpec copy$default6 = ClientRouteSpec.copy$default(deprecatedViewCashAppPayOfferInAppBrowserV2, accountRequirement6, TransactorKt.authentication(uri6, deprecatedViewCashAppPayOfferInAppBrowserV2), deprecatedViewCashAppPayOfferInAppBrowserV2.isDeprecated());
                EmptyList emptyList5 = ClientRoute.DeprecatedViewCashAppPayOfferInAppBrowserV2.deepLinkSpecs;
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(CustomSupport.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters6 == null) {
                    return null;
                }
                Object obj6 = matchWithAllParameters6.get("b64_encoded_proto");
                obj6.getClass();
                return new ClientRoute.DeprecatedViewCashAppPayOfferInAppBrowserV2(copy$default6, arrayList6, matchAccountIdentifier6, (String) obj6);
            case 15:
                Uri uri7 = (Uri) obj;
                uri7.getClass();
                ClientRouteSpec clientRouteSpec7 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewCustomerProfileEmail = zzjo.getDeprecatedViewCustomerProfileEmail();
                Matcher matcher7 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters7 = TransactorKt.matchWithAllParameters(uri7, "^/dl/view/profile/customer-email/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/?$", false, deprecatedViewCustomerProfileEmail.getParameterNames());
                AccountRequirement accountRequirement7 = TransactorKt.accountRequirement(uri7, deprecatedViewCustomerProfileEmail);
                String matchAccountIdentifier7 = TransactorKt.matchAccountIdentifier(uri7, accountRequirement7);
                if (accountRequirement7.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier7 == null) {
                    return null;
                }
                ClientRouteSpec copy$default7 = ClientRouteSpec.copy$default(deprecatedViewCustomerProfileEmail, accountRequirement7, TransactorKt.authentication(uri7, deprecatedViewCustomerProfileEmail), deprecatedViewCustomerProfileEmail.isDeprecated());
                EmptyList emptyList6 = ClientRoute.DeprecatedViewCustomerProfileEmail.deepLinkSpecs;
                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(Debug.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters7 == null) {
                    return null;
                }
                Object obj7 = matchWithAllParameters7.get("email");
                obj7.getClass();
                return new ClientRoute.DeprecatedViewCustomerProfileEmail(copy$default7, arrayList7, matchAccountIdentifier7, (String) obj7);
            case 16:
                Uri uri8 = (Uri) obj;
                uri8.getClass();
                ClientRouteSpec clientRouteSpec8 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewCustomerProfileSms = zzjo.getDeprecatedViewCustomerProfileSms();
                Matcher matcher8 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters8 = TransactorKt.matchWithAllParameters(uri8, "^/dl/view/profile/customer-sms/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/?$", false, deprecatedViewCustomerProfileSms.getParameterNames());
                AccountRequirement accountRequirement8 = TransactorKt.accountRequirement(uri8, deprecatedViewCustomerProfileSms);
                String matchAccountIdentifier8 = TransactorKt.matchAccountIdentifier(uri8, accountRequirement8);
                if (accountRequirement8.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier8 == null) {
                    return null;
                }
                ClientRouteSpec copy$default8 = ClientRouteSpec.copy$default(deprecatedViewCustomerProfileSms, accountRequirement8, TransactorKt.authentication(uri8, deprecatedViewCustomerProfileSms), deprecatedViewCustomerProfileSms.isDeprecated());
                EmptyList emptyList7 = ClientRoute.DeprecatedViewCustomerProfileSms.deepLinkSpecs;
                ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(NotificationCompat.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters8 == null) {
                    return null;
                }
                Object obj8 = matchWithAllParameters8.get("sms");
                obj8.getClass();
                return new ClientRoute.DeprecatedViewCustomerProfileSms(copy$default8, arrayList8, matchAccountIdentifier8, (String) obj8);
            case 17:
                Uri uri9 = (Uri) obj;
                uri9.getClass();
                ClientRouteSpec clientRouteSpec9 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewGroupDetails = zzjo.getDeprecatedViewGroupDetails();
                Matcher matcher9 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters9 = TransactorKt.matchWithAllParameters(uri9, "^/dl/view/groups/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/?$", false, deprecatedViewGroupDetails.getParameterNames());
                AccountRequirement accountRequirement9 = TransactorKt.accountRequirement(uri9, deprecatedViewGroupDetails);
                String matchAccountIdentifier9 = TransactorKt.matchAccountIdentifier(uri9, accountRequirement9);
                if (accountRequirement9.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier9 == null) {
                    return null;
                }
                ClientRouteSpec copy$default9 = ClientRouteSpec.copy$default(deprecatedViewGroupDetails, accountRequirement9, TransactorKt.authentication(uri9, deprecatedViewGroupDetails), deprecatedViewGroupDetails.isDeprecated());
                EmptyList emptyList8 = ClientRoute.DeprecatedViewGroupDetails.deepLinkSpecs;
                ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(NotificationManagerCompat.Api28Impl.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters9 == null) {
                    return null;
                }
                Object obj9 = matchWithAllParameters9.get("group_token");
                obj9.getClass();
                return new ClientRoute.DeprecatedViewGroupDetails(copy$default9, arrayList9, matchAccountIdentifier9, (String) obj9);
            case 18:
                Uri uri10 = (Uri) obj;
                uri10.getClass();
                ClientRouteSpec clientRouteSpec10 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewGroupExpense = zzjo.getDeprecatedViewGroupExpense();
                Matcher matcher10 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters10 = TransactorKt.matchWithAllParameters(uri10, "^/dl/view/groups/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/expenses/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/?$", false, deprecatedViewGroupExpense.getParameterNames());
                AccountRequirement accountRequirement10 = TransactorKt.accountRequirement(uri10, deprecatedViewGroupExpense);
                String matchAccountIdentifier10 = TransactorKt.matchAccountIdentifier(uri10, accountRequirement10);
                if (accountRequirement10.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier10 == null) {
                    return null;
                }
                ClientRouteSpec copy$default10 = ClientRouteSpec.copy$default(deprecatedViewGroupExpense, accountRequirement10, TransactorKt.authentication(uri10, deprecatedViewGroupExpense), deprecatedViewGroupExpense.isDeprecated());
                EmptyList emptyList9 = ClientRoute.DeprecatedViewGroupExpense.deepLinkSpecs;
                ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(PendingIntentCompat.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters10 == null) {
                    return null;
                }
                Object obj10 = matchWithAllParameters10.get("group_token");
                obj10.getClass();
                String str2 = (String) obj10;
                Object obj11 = matchWithAllParameters10.get("expense_token");
                obj11.getClass();
                return new ClientRoute.DeprecatedViewGroupExpense(copy$default10, matchAccountIdentifier10, str2, (String) obj11, arrayList10);
            case 19:
                Uri uri11 = (Uri) obj;
                uri11.getClass();
                ClientRouteSpec clientRouteSpec11 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewLocalBrandCollection = zzjo.getDeprecatedViewLocalBrandCollection();
                Matcher matcher11 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters11 = TransactorKt.matchWithAllParameters(uri11, "^/dl/local/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/collection/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/?$", false, deprecatedViewLocalBrandCollection.getParameterNames());
                AccountRequirement accountRequirement11 = TransactorKt.accountRequirement(uri11, deprecatedViewLocalBrandCollection);
                String matchAccountIdentifier11 = TransactorKt.matchAccountIdentifier(uri11, accountRequirement11);
                if (accountRequirement11.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier11 == null) {
                    return null;
                }
                ClientRouteSpec copy$default11 = ClientRouteSpec.copy$default(deprecatedViewLocalBrandCollection, accountRequirement11, TransactorKt.authentication(uri11, deprecatedViewLocalBrandCollection), deprecatedViewLocalBrandCollection.isDeprecated());
                List list2 = ClientRoute.DeprecatedViewLocalBrandCollection.deepLinkSpecs;
                List<DeepLinkSpec> deepLinkSpecs2 = ContextCompat$Api28Impl.getDeepLinkSpecs();
                ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(deepLinkSpecs2, 10));
                for (DeepLinkSpec deepLinkSpec2 : deepLinkSpecs2) {
                    arrayList11.add(new DeepLinkSpec(deepLinkSpec2.getName(), deepLinkSpec2.getPathFormat(), copy$default11));
                }
                if (matchWithAllParameters11 == null) {
                    return null;
                }
                Object obj12 = matchWithAllParameters11.get("brand_collection_short_token");
                obj12.getClass();
                String str3 = (String) obj12;
                Object obj13 = matchWithAllParameters11.get("attribution_key");
                obj13.getClass();
                return new ClientRoute.DeprecatedViewLocalBrandCollection(copy$default11, matchAccountIdentifier11, str3, (String) obj13, arrayList11);
            case 20:
                Uri uri12 = (Uri) obj;
                uri12.getClass();
                ClientRouteSpec clientRouteSpec12 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewLoyaltyProgram = zzjo.getDeprecatedViewLoyaltyProgram();
                Matcher matcher12 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters12 = TransactorKt.matchWithAllParameters(uri12, "^/dl/view/loyalty/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/?$", false, deprecatedViewLoyaltyProgram.getParameterNames());
                AccountRequirement accountRequirement12 = TransactorKt.accountRequirement(uri12, deprecatedViewLoyaltyProgram);
                String matchAccountIdentifier12 = TransactorKt.matchAccountIdentifier(uri12, accountRequirement12);
                if (accountRequirement12.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier12 == null) {
                    return null;
                }
                ClientRouteSpec copy$default12 = ClientRouteSpec.copy$default(deprecatedViewLoyaltyProgram, accountRequirement12, TransactorKt.authentication(uri12, deprecatedViewLoyaltyProgram), deprecatedViewLoyaltyProgram.isDeprecated());
                List list3 = ClientRoute.DeprecatedViewLoyaltyProgram.deepLinkSpecs;
                List<DeepLinkSpec> deepLinkSpecs3 = PermissionChecker.getDeepLinkSpecs();
                ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(deepLinkSpecs3, 10));
                for (DeepLinkSpec deepLinkSpec3 : deepLinkSpecs3) {
                    arrayList12.add(new DeepLinkSpec(deepLinkSpec3.getName(), deepLinkSpec3.getPathFormat(), copy$default12));
                }
                if (matchWithAllParameters12 == null) {
                    return null;
                }
                Object obj14 = matchWithAllParameters12.get("loyalty_program_deep_link_token");
                obj14.getClass();
                return new ClientRoute.DeprecatedViewLoyaltyProgram(copy$default12, arrayList12, matchAccountIdentifier12, (String) obj14);
            case 21:
                Uri uri13 = (Uri) obj;
                uri13.getClass();
                ClientRouteSpec clientRouteSpec13 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewLoyaltyReward = zzjo.getDeprecatedViewLoyaltyReward();
                Matcher matcher13 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters13 = TransactorKt.matchWithAllParameters(uri13, "^/dl/view/loyalty/merchant/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/reward/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/?$", false, deprecatedViewLoyaltyReward.getParameterNames());
                AccountRequirement accountRequirement13 = TransactorKt.accountRequirement(uri13, deprecatedViewLoyaltyReward);
                String matchAccountIdentifier13 = TransactorKt.matchAccountIdentifier(uri13, accountRequirement13);
                if (accountRequirement13.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier13 == null) {
                    return null;
                }
                ClientRouteSpec copy$default13 = ClientRouteSpec.copy$default(deprecatedViewLoyaltyReward, accountRequirement13, TransactorKt.authentication(uri13, deprecatedViewLoyaltyReward), deprecatedViewLoyaltyReward.isDeprecated());
                EmptyList emptyList10 = ClientRoute.DeprecatedViewLoyaltyReward.deepLinkSpecs;
                ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(PaintCompat.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters13 == null) {
                    return null;
                }
                Object obj15 = matchWithAllParameters13.get("merchant_token");
                obj15.getClass();
                String str4 = (String) obj15;
                Object obj16 = matchWithAllParameters13.get("reward_token");
                obj16.getClass();
                return new ClientRoute.DeprecatedViewLoyaltyReward(copy$default13, matchAccountIdentifier13, str4, (String) obj16, arrayList13);
            case 22:
                Uri uri14 = (Uri) obj;
                uri14.getClass();
                ClientRouteSpec clientRouteSpec14 = ClientRouteSpec.cashInReview;
                ClientRouteSpec noOperationWithCallback = zzjo.getNoOperationWithCallback();
                Matcher matcher14 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters14 = TransactorKt.matchWithAllParameters(uri14, "^/dl/noop-callback/?$", false, noOperationWithCallback.getParameterNames());
                AccountRequirement accountRequirement14 = TransactorKt.accountRequirement(uri14, noOperationWithCallback);
                String matchAccountIdentifier14 = TransactorKt.matchAccountIdentifier(uri14, accountRequirement14);
                if (accountRequirement14.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier14 == null) {
                    return null;
                }
                ClientRouteSpec copy$default14 = ClientRouteSpec.copy$default(noOperationWithCallback, accountRequirement14, TransactorKt.authentication(uri14, noOperationWithCallback), noOperationWithCallback.isDeprecated());
                EmptyList emptyList11 = ClientRoute.NoOperationWithCallback.deepLinkSpecs;
                ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(SheetStateKt.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters14 != null) {
                    return new ClientRoute.NoOperationWithCallback(copy$default14, arrayList14, matchAccountIdentifier14, new Matcher$Companion$viewCashOutClientRoute$1$result$1$1());
                }
                return null;
            case 23:
                Uri uri15 = (Uri) obj;
                uri15.getClass();
                ClientRouteSpec clientRouteSpec15 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deactivateTag = zzjo.getDeactivateTag();
                Matcher matcher15 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters15 = TransactorKt.matchWithAllParameters(uri15, "^/dl/deactivate-tag/?$", false, deactivateTag.getParameterNames());
                AccountRequirement accountRequirement15 = TransactorKt.accountRequirement(uri15, deactivateTag);
                String matchAccountIdentifier15 = TransactorKt.matchAccountIdentifier(uri15, accountRequirement15);
                if (accountRequirement15.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier15 == null) {
                    return null;
                }
                ClientRouteSpec copy$default15 = ClientRouteSpec.copy$default(deactivateTag, accountRequirement15, TransactorKt.authentication(uri15, deactivateTag), deactivateTag.isDeprecated());
                List list4 = ClientRoute.DeactivateTag.deepLinkSpecs;
                List<DeepLinkSpec> deepLinkSpecs4 = zzahx.getDeepLinkSpecs();
                ArrayList arrayList15 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(deepLinkSpecs4, 10));
                for (DeepLinkSpec deepLinkSpec4 : deepLinkSpecs4) {
                    arrayList15.add(new DeepLinkSpec(deepLinkSpec4.getName(), deepLinkSpec4.getPathFormat(), copy$default15));
                }
                if (matchWithAllParameters15 != null) {
                    return new ClientRoute.DeactivateTag(copy$default15, arrayList15, matchAccountIdentifier15);
                }
                return null;
            case 24:
                Uri uri16 = (Uri) obj;
                uri16.getClass();
                ClientRouteSpec clientRouteSpec16 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewOffersSheet = zzjo.getDeprecatedViewOffersSheet();
                Matcher matcher16 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters16 = TransactorKt.matchWithAllParameters(uri16, "^/dl/view/offers/sheet/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\\+\\-/=\\._]+)/?$", false, deprecatedViewOffersSheet.getParameterNames());
                AccountRequirement accountRequirement16 = TransactorKt.accountRequirement(uri16, deprecatedViewOffersSheet);
                String matchAccountIdentifier16 = TransactorKt.matchAccountIdentifier(uri16, accountRequirement16);
                if (accountRequirement16.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier16 == null) {
                    return null;
                }
                ClientRouteSpec copy$default16 = ClientRouteSpec.copy$default(deprecatedViewOffersSheet, accountRequirement16, TransactorKt.authentication(uri16, deprecatedViewOffersSheet), deprecatedViewOffersSheet.isDeprecated());
                EmptyList emptyList12 = ClientRoute.DeprecatedViewOffersSheet.deepLinkSpecs;
                ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(TypefaceCompatUtil.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters16 == null) {
                    return null;
                }
                Object obj17 = matchWithAllParameters16.get("b64_encoded_proto");
                obj17.getClass();
                return new ClientRoute.DeprecatedViewOffersSheet(copy$default16, arrayList16, matchAccountIdentifier16, (String) obj17);
            case 25:
                Uri uri17 = (Uri) obj;
                uri17.getClass();
                ClientRouteSpec clientRouteSpec17 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewPayEmail = zzjo.getDeprecatedViewPayEmail();
                Matcher matcher17 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters17 = TransactorKt.matchWithAllParameters(uri17, "^/dl/view/pay-email/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/?$", false, deprecatedViewPayEmail.getParameterNames());
                AccountRequirement accountRequirement17 = TransactorKt.accountRequirement(uri17, deprecatedViewPayEmail);
                String matchAccountIdentifier17 = TransactorKt.matchAccountIdentifier(uri17, accountRequirement17);
                if (accountRequirement17.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier17 == null) {
                    return null;
                }
                ClientRouteSpec copy$default17 = ClientRouteSpec.copy$default(deprecatedViewPayEmail, accountRequirement17, TransactorKt.authentication(uri17, deprecatedViewPayEmail), deprecatedViewPayEmail.isDeprecated());
                ClientRouteSpec clientRouteSpec18 = ClientRoute.DeprecatedViewPayEmail.spec;
                ArrayList arrayList17 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(DrawableCompat.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters17 == null) {
                    return null;
                }
                Object obj18 = matchWithAllParameters17.get("email");
                obj18.getClass();
                return new ClientRoute.DeprecatedViewPayEmail(copy$default17, arrayList17, matchAccountIdentifier17, (String) obj18);
            case 26:
                Uri uri18 = (Uri) obj;
                uri18.getClass();
                ClientRouteSpec clientRouteSpec19 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewPaySms = zzjo.getDeprecatedViewPaySms();
                Matcher matcher18 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters18 = TransactorKt.matchWithAllParameters(uri18, "^/dl/view/pay-sms/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/?$", false, deprecatedViewPaySms.getParameterNames());
                AccountRequirement accountRequirement18 = TransactorKt.accountRequirement(uri18, deprecatedViewPaySms);
                String matchAccountIdentifier18 = TransactorKt.matchAccountIdentifier(uri18, accountRequirement18);
                if (accountRequirement18.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier18 == null) {
                    return null;
                }
                ClientRouteSpec copy$default18 = ClientRouteSpec.copy$default(deprecatedViewPaySms, accountRequirement18, TransactorKt.authentication(uri18, deprecatedViewPaySms), deprecatedViewPaySms.isDeprecated());
                ClientRouteSpec clientRouteSpec20 = ClientRoute.DeprecatedViewPaySms.spec;
                ArrayList arrayList18 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(UtilsKt.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters18 == null) {
                    return null;
                }
                Object obj19 = matchWithAllParameters18.get("sms");
                obj19.getClass();
                return new ClientRoute.DeprecatedViewPaySms(copy$default18, arrayList18, matchAccountIdentifier18, (String) obj19);
            case 27:
                Uri uri19 = (Uri) obj;
                uri19.getClass();
                ClientRouteSpec clientRouteSpec21 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewProfileSwitcherToRerouteDestination = zzjo.getDeprecatedViewProfileSwitcherToRerouteDestination();
                Matcher matcher19 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters19 = TransactorKt.matchWithAllParameters(uri19, "^/dl/view/profiles/switcher-to-destination/?$", false, deprecatedViewProfileSwitcherToRerouteDestination.getParameterNames());
                AccountRequirement accountRequirement19 = TransactorKt.accountRequirement(uri19, deprecatedViewProfileSwitcherToRerouteDestination);
                String matchAccountIdentifier19 = TransactorKt.matchAccountIdentifier(uri19, accountRequirement19);
                if (accountRequirement19.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier19 == null) {
                    return null;
                }
                ClientRouteSpec copy$default19 = ClientRouteSpec.copy$default(deprecatedViewProfileSwitcherToRerouteDestination, accountRequirement19, TransactorKt.authentication(uri19, deprecatedViewProfileSwitcherToRerouteDestination), deprecatedViewProfileSwitcherToRerouteDestination.isDeprecated());
                EmptyList emptyList13 = ClientRoute.DeprecatedViewProfileSwitcherToRerouteDestination.deepLinkSpecs;
                ArrayList arrayList19 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(UriKt.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters19 == null) {
                    return null;
                }
                Object obj20 = matchWithAllParameters19.get("destination_route");
                obj20.getClass();
                return new ClientRoute.DeprecatedViewProfileSwitcherToRerouteDestination(copy$default19, arrayList19, matchAccountIdentifier19, (String) obj20, new Matcher$Companion$viewCashOutClientRoute$1$result$1$1());
            case 28:
                Uri uri20 = (Uri) obj;
                uri20.getClass();
                ClientRouteSpec clientRouteSpec22 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewSavingsAddCash = zzjo.getDeprecatedViewSavingsAddCash();
                Matcher matcher20 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters20 = TransactorKt.matchWithAllParameters(uri20, "^/dl/view/savings/transfer-cash/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/?$", false, deprecatedViewSavingsAddCash.getParameterNames());
                AccountRequirement accountRequirement20 = TransactorKt.accountRequirement(uri20, deprecatedViewSavingsAddCash);
                String matchAccountIdentifier20 = TransactorKt.matchAccountIdentifier(uri20, accountRequirement20);
                if (accountRequirement20.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier20 == null) {
                    return null;
                }
                ClientRouteSpec copy$default20 = ClientRouteSpec.copy$default(deprecatedViewSavingsAddCash, accountRequirement20, TransactorKt.authentication(uri20, deprecatedViewSavingsAddCash), deprecatedViewSavingsAddCash.isDeprecated());
                List list5 = ClientRoute.DeprecatedViewSavingsAddCash.deepLinkSpecs;
                List<DeepLinkSpec> deepLinkSpecs5 = FontsContractCompat.getDeepLinkSpecs();
                ArrayList arrayList20 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(deepLinkSpecs5, 10));
                for (DeepLinkSpec deepLinkSpec5 : deepLinkSpecs5) {
                    arrayList20.add(new DeepLinkSpec(deepLinkSpec5.getName(), deepLinkSpec5.getPathFormat(), copy$default20));
                }
                if (matchWithAllParameters20 == null) {
                    return null;
                }
                Object obj21 = matchWithAllParameters20.get("context");
                obj21.getClass();
                return new ClientRoute.DeprecatedViewSavingsAddCash(copy$default20, arrayList20, matchAccountIdentifier20, (String) obj21);
            default:
                Uri uri21 = (Uri) obj;
                uri21.getClass();
                ClientRouteSpec clientRouteSpec23 = ClientRouteSpec.cashInReview;
                ClientRouteSpec deprecatedViewShopCategory = zzjo.getDeprecatedViewShopCategory();
                Matcher matcher21 = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters21 = TransactorKt.matchWithAllParameters(uri21, "^/dl/view/shop/category/([abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789%\\-\\._~:\\?\\#\\[\\]@!\\$&'\\(\\)\\*\\+,;=\\{\\}]+)/?$", false, deprecatedViewShopCategory.getParameterNames());
                AccountRequirement accountRequirement21 = TransactorKt.accountRequirement(uri21, deprecatedViewShopCategory);
                String matchAccountIdentifier21 = TransactorKt.matchAccountIdentifier(uri21, accountRequirement21);
                if (accountRequirement21.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier21 == null) {
                    return null;
                }
                ClientRouteSpec copy$default21 = ClientRouteSpec.copy$default(deprecatedViewShopCategory, accountRequirement21, TransactorKt.authentication(uri21, deprecatedViewShopCategory), deprecatedViewShopCategory.isDeprecated());
                EmptyList emptyList14 = ClientRoute.DeprecatedViewShopCategory.deepLinkSpecs;
                ArrayList arrayList21 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(TypedValueCompat.getDeepLinkSpecs(), 10));
                EmptyIterator.INSTANCE.getClass();
                if (matchWithAllParameters21 == null) {
                    return null;
                }
                Object obj22 = matchWithAllParameters21.get("token");
                obj22.getClass();
                return new ClientRoute.DeprecatedViewShopCategory(copy$default21, arrayList21, matchAccountIdentifier21, (String) obj22);
        }
    }
}
