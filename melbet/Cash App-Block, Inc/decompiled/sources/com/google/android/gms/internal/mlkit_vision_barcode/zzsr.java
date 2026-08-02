package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import app.cash.arcade.viewmodels.AvatarViewModel$$ExternalSyntheticLambda0;
import app.cash.local.presenters.brand.checkout.CheckoutPaymentMethodMapperKt$WhenMappings;
import app.cash.local.primitives.Cart;
import app.cash.local.primitives.CartPaymentSummary;
import app.cash.local.primitives.PaymentMethod;
import app.cash.local.primitives.PaymentMethodToken;
import app.cash.local.viewmodels.LocalCheckoutPaymentMethodViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.work.service.api.LoginEssentialsService;
import com.squareup.cash.work.service.api.PayrollWebService;
import com.squareup.cash.work.service.api.passcode.PasscodeService;
import com.squareup.cash.work.service.api.payroll.PayrollJsonService;
import com.squareup.cash.work.service.api.payroll.PayrollService;
import com.squareup.cash.work.service.api.scheduling.SchedulingService;
import com.squareup.cash.work.service.api.taxforms.TaxFormsService;
import com.squareup.cash.work.service.api.timecards.TimecardsService;
import com.squareup.protos.cash.local.client.v1.CardBrandType;
import com.squareup.protos.cash.local.client.v1.LocalStoredInstrument;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import retrofit2.Retrofit;

/* loaded from: classes7.dex */
public abstract class zzsr {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCardSpendingInsight.deepLinkSpecs;
    }

    public static LoginEssentialsService provideLoginEssentialsService(Retrofit retrofit) {
        Object create = retrofit.create(LoginEssentialsService.class);
        create.getClass();
        return (LoginEssentialsService) create;
    }

    public static PasscodeService providePasscodeService(Retrofit retrofit) {
        Object create = retrofit.create(PasscodeService.class);
        create.getClass();
        return (PasscodeService) create;
    }

    public static PayrollJsonService providePayrollJsonService(Retrofit retrofit) {
        Object create = retrofit.create(PayrollJsonService.class);
        create.getClass();
        return (PayrollJsonService) create;
    }

    public static PayrollService providePayrollService(Retrofit retrofit) {
        Object create = retrofit.create(PayrollService.class);
        create.getClass();
        return (PayrollService) create;
    }

    public static PayrollWebService providePayrollWebService(Retrofit retrofit) {
        Object create = retrofit.create(PayrollWebService.class);
        create.getClass();
        return (PayrollWebService) create;
    }

    public static SchedulingService provideSchedulingService(Retrofit retrofit) {
        Object create = retrofit.create(SchedulingService.class);
        create.getClass();
        return (SchedulingService) create;
    }

    public static TaxFormsService provideTaxFormsService(Retrofit retrofit) {
        Object create = retrofit.create(TaxFormsService.class);
        create.getClass();
        return (TaxFormsService) create;
    }

    public static TimecardsService provideTimecardsService(Retrofit retrofit) {
        Object create = retrofit.create(TimecardsService.class);
        create.getClass();
        return (TimecardsService) create;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x02cc, code lost:
    
        if (r1 == r0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x038a, code lost:
    
        if (r10 == null) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x029d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v25, types: [app.cash.local.primitives.PaymentMethodToken] */
    /* JADX WARN: Type inference failed for: r10v36, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v45, types: [app.cash.local.primitives.PaymentMethodToken] */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r25v0, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final JWECryptoParts rememberCheckoutPaymentState(Cart cart, OrderBuilderModel.PaymentMethodConfig paymentMethodConfig, String str, boolean z, AndroidStringManager androidStringManager, GapComposer gapComposer, int i) {
        LocalCheckoutPaymentMethodViewModel.Icon icon;
        String str2;
        JWECryptoParts jWECryptoParts;
        String str3;
        NeverEqualPolicy neverEqualPolicy;
        String str4;
        Iterator it;
        String str5;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z2;
        LocalCheckoutPaymentMethodViewModel localCheckoutPaymentMethodViewModel;
        LocalCheckoutPaymentMethodViewModel.Icon icon2;
        String str6;
        JWECryptoParts jWECryptoParts2;
        LocalStoredInstrument.Type type2;
        String str7;
        NeverEqualPolicy neverEqualPolicy3;
        String str8;
        Object obj;
        cart.getClass();
        paymentMethodConfig.getClass();
        ArrayList arrayList = paymentMethodConfig.paymentMethods;
        CartPaymentSummary cartPaymentSummary = cart.paymentSummary;
        if (!z) {
            cartPaymentSummary = null;
        }
        boolean changed = gapComposer.changed(cartPaymentSummary) | gapComposer.changed(androidStringManager);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy4 = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy4) {
            if (cartPaymentSummary != null) {
                CardBrandType cardBrandType = cartPaymentSummary.cardBrand;
                int[] iArr = CheckoutPaymentMethodMapperKt$WhenMappings.$EnumSwitchMapping$2;
                switch (iArr[cardBrandType.ordinal()]) {
                    case 1:
                        icon = null;
                        break;
                    case 2:
                        icon = LocalCheckoutPaymentMethodViewModel.Icon.VISA;
                        break;
                    case 3:
                        icon = LocalCheckoutPaymentMethodViewModel.Icon.MASTERCARD;
                        break;
                    case 4:
                        icon = LocalCheckoutPaymentMethodViewModel.Icon.AMERICAN_EXPRESS;
                        break;
                    case 5:
                        icon = LocalCheckoutPaymentMethodViewModel.Icon.DISCOVER;
                        break;
                    case 6:
                        icon = LocalCheckoutPaymentMethodViewModel.Icon.DISCOVER_DINERS;
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                switch (iArr[cardBrandType.ordinal()]) {
                    case 1:
                        str2 = "";
                        break;
                    case 2:
                        str2 = "Visa";
                        break;
                    case 3:
                        str2 = "Mastercard";
                        break;
                    case 4:
                        str2 = "American Express";
                        break;
                    case 5:
                        str2 = "Discover";
                        break;
                    case 6:
                        str2 = "Discover Diners";
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                String str9 = cartPaymentSummary.last4;
                str9.getClass();
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.local_presenters_payment_label_card_ending_with)).format(new Object[]{str9});
                format2.getClass();
                rememberedValue = new LocalCheckoutPaymentMethodViewModel("OPEN_TAB_PREAUTHORIZED_PAYMENT", icon, str2, format2);
            } else {
                rememberedValue = null;
            }
            gapComposer.updateRememberedValue(rememberedValue);
        }
        LocalCheckoutPaymentMethodViewModel localCheckoutPaymentMethodViewModel2 = (LocalCheckoutPaymentMethodViewModel) rememberedValue;
        String str10 = localCheckoutPaymentMethodViewModel2 != null ? localCheckoutPaymentMethodViewModel2.token : null;
        boolean changed2 = gapComposer.changed(localCheckoutPaymentMethodViewModel2) | gapComposer.changed(arrayList) | gapComposer.changed(cartPaymentSummary) | gapComposer.changed(str) | gapComposer.changed(androidStringManager);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == neverEqualPolicy4) {
            List listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(localCheckoutPaymentMethodViewModel2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (true) {
                ?? r13 = 0;
                if (it2.hasNext()) {
                    Object next = it2.next();
                    PaymentMethod paymentMethod = (PaymentMethod) next;
                    if (cartPaymentSummary != null) {
                        paymentMethod.getClass();
                        jWECryptoParts2 = jWECryptoParts;
                        if (paymentMethod instanceof PaymentMethod.StoredInstrument) {
                            PaymentMethod.StoredInstrument storedInstrument = (PaymentMethod.StoredInstrument) paymentMethod;
                            LocalStoredInstrument.Type type3 = storedInstrument.f912type;
                            switch (CheckoutPaymentMethodMapperKt$WhenMappings.$EnumSwitchMapping$2[cartPaymentSummary.cardBrand.ordinal()]) {
                                case 1:
                                    type2 = LocalStoredInstrument.Type.TYPE_UNSPECIFIED;
                                    break;
                                case 2:
                                    type2 = LocalStoredInstrument.Type.TYPE_VISA;
                                    break;
                                case 3:
                                    type2 = LocalStoredInstrument.Type.TYPE_MASTERCARD;
                                    break;
                                case 4:
                                    type2 = LocalStoredInstrument.Type.TYPE_AMERICAN_EXPRESS;
                                    break;
                                case 5:
                                    type2 = LocalStoredInstrument.Type.TYPE_DISCOVER;
                                    break;
                                case 6:
                                    type2 = LocalStoredInstrument.Type.TYPE_DISCOVER_DINERS;
                                    break;
                                default:
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return jWECryptoParts2;
                            }
                            if (type3 == type2) {
                                String str11 = storedInstrument.displayName;
                                if (str11 != null) {
                                    StringBuilder sb = new StringBuilder();
                                    int length = str11.length();
                                    for (int i2 = 0; i2 < length; i2++) {
                                        char charAt = str11.charAt(i2);
                                        if (Character.isDigit(charAt)) {
                                            sb.append(charAt);
                                        }
                                    }
                                    str7 = StringsKt___StringsKt.takeLast(4, sb.toString());
                                } else {
                                    str7 = null;
                                }
                                jWECryptoParts = Intrinsics.areEqual(str7, cartPaymentSummary.last4) ? jWECryptoParts2 : null;
                            }
                        }
                    } else {
                        jWECryptoParts2 = jWECryptoParts;
                    }
                    arrayList2.add(next);
                } else {
                    JWECryptoParts jWECryptoParts3 = jWECryptoParts;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        PaymentMethod paymentMethod2 = (PaymentMethod) it3.next();
                        if (paymentMethod2 instanceof PaymentMethod.StoredInstrument) {
                            PaymentMethod.StoredInstrument storedInstrument2 = (PaymentMethod.StoredInstrument) paymentMethod2;
                            LocalStoredInstrument.Type type4 = storedInstrument2.f912type;
                            String str12 = storedInstrument2.token;
                            int ordinal = type4.ordinal();
                            if (ordinal == 0) {
                                icon2 = null;
                            } else if (ordinal == 1) {
                                icon2 = LocalCheckoutPaymentMethodViewModel.Icon.VISA;
                            } else if (ordinal == 2) {
                                icon2 = LocalCheckoutPaymentMethodViewModel.Icon.MASTERCARD;
                            } else if (ordinal == 3) {
                                icon2 = LocalCheckoutPaymentMethodViewModel.Icon.AMERICAN_EXPRESS;
                            } else if (ordinal == 4) {
                                icon2 = LocalCheckoutPaymentMethodViewModel.Icon.DISCOVER;
                            } else {
                                if (ordinal != 5) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return jWECryptoParts3;
                                }
                                icon2 = LocalCheckoutPaymentMethodViewModel.Icon.DISCOVER_DINERS;
                            }
                            String str13 = storedInstrument2.displayBrand;
                            if (str13 == null) {
                                String obj2 = type4.toString();
                                it = it3;
                                String replace = StringsKt__StringsJVMKt.replace(StringsKt.substringAfter(obj2, "TYPE_", obj2), '_', ' ', r13);
                                Locale locale = Locale.ROOT;
                                ?? lowerCase = replace.toLowerCase(locale);
                                lowerCase.getClass();
                                if (lowerCase.length() > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    str5 = str10;
                                    char charAt2 = lowerCase.charAt(r13);
                                    String valueOf = String.valueOf(charAt2);
                                    valueOf.getClass();
                                    String upperCase = valueOf.toUpperCase(locale);
                                    upperCase.getClass();
                                    neverEqualPolicy2 = neverEqualPolicy4;
                                    if (upperCase.length() <= 1) {
                                        z2 = false;
                                        upperCase = String.valueOf(Character.toTitleCase(charAt2));
                                    } else if (charAt2 == 329) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                        char charAt3 = upperCase.charAt(0);
                                        String lowerCase2 = upperCase.substring(1).toLowerCase(locale);
                                        lowerCase2.getClass();
                                        upperCase = charAt3 + lowerCase2;
                                    }
                                    sb2.append((Object) upperCase);
                                    sb2.append(lowerCase.substring(1));
                                    str6 = sb2.toString();
                                } else {
                                    str5 = str10;
                                    neverEqualPolicy2 = neverEqualPolicy4;
                                    z2 = r13;
                                    str6 = lowerCase;
                                }
                                str13 = str6;
                            } else {
                                it = it3;
                                str5 = str10;
                                neverEqualPolicy2 = neverEqualPolicy4;
                                z2 = r13;
                            }
                            localCheckoutPaymentMethodViewModel = new LocalCheckoutPaymentMethodViewModel(str12, icon2, str13, storedInstrument2.displayName);
                        } else {
                            it = it3;
                            str5 = str10;
                            neverEqualPolicy2 = neverEqualPolicy4;
                            z2 = r13;
                            if (!(paymentMethod2 instanceof PaymentMethod.Standalone)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return jWECryptoParts3;
                            }
                            PaymentMethod.Standalone standalone = (PaymentMethod.Standalone) paymentMethod2;
                            String str14 = standalone.token;
                            switch (CheckoutPaymentMethodMapperKt$WhenMappings.$EnumSwitchMapping$1[standalone.paymentOption.ordinal()]) {
                                case 1:
                                    Path$$ExternalSyntheticBUOutline0.m$1(paymentMethod2, "Unexpected Standalone payment method ");
                                    return jWECryptoParts3;
                                case 2:
                                    localCheckoutPaymentMethodViewModel = new LocalCheckoutPaymentMethodViewModel(str14, LocalCheckoutPaymentMethodViewModel.Icon.NEW_CARD, androidStringManager.get(R.string.local_presenters_payment_debit_card), null);
                                    if (localCheckoutPaymentMethodViewModel == null) {
                                        arrayList3.add(localCheckoutPaymentMethodViewModel);
                                    }
                                    r13 = z2;
                                    it3 = it;
                                    str10 = str5;
                                    neverEqualPolicy4 = neverEqualPolicy2;
                                case 3:
                                    localCheckoutPaymentMethodViewModel = new LocalCheckoutPaymentMethodViewModel(str14, LocalCheckoutPaymentMethodViewModel.Icon.GOOGLE_PAY, androidStringManager.get(R.string.local_presenters_payment_label_google_pay), null);
                                    if (localCheckoutPaymentMethodViewModel == null) {
                                    }
                                    r13 = z2;
                                    it3 = it;
                                    str10 = str5;
                                    neverEqualPolicy4 = neverEqualPolicy2;
                                    break;
                                case 4:
                                    localCheckoutPaymentMethodViewModel = new LocalCheckoutPaymentMethodViewModel(str14, LocalCheckoutPaymentMethodViewModel.Icon.CASH_APP, androidStringManager.get(R.string.local_presenters_payment_label_cash_app_pay), str);
                                    break;
                                case 5:
                                case 6:
                                case 7:
                                    localCheckoutPaymentMethodViewModel = null;
                                    if (localCheckoutPaymentMethodViewModel == null) {
                                    }
                                    r13 = z2;
                                    it3 = it;
                                    str10 = str5;
                                    neverEqualPolicy4 = neverEqualPolicy2;
                                    break;
                                case 8:
                                    throw new NotImplementedError(null, 1, null);
                                default:
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return jWECryptoParts3;
                            }
                        }
                        if (localCheckoutPaymentMethodViewModel == null) {
                        }
                        r13 = z2;
                        it3 = it;
                        str10 = str5;
                        neverEqualPolicy4 = neverEqualPolicy2;
                    }
                    str3 = str10;
                    neverEqualPolicy = neverEqualPolicy4;
                    str4 = null;
                    rememberedValue2 = CollectionsKt.plus((Iterable) arrayList3, (Collection) listOfNotNull);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
            }
        } else {
            str3 = str10;
            neverEqualPolicy = neverEqualPolicy4;
            str4 = null;
        }
        List list = (List) rememberedValue2;
        boolean changed3 = gapComposer.changed(list);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed3) {
            neverEqualPolicy3 = neverEqualPolicy;
        } else {
            neverEqualPolicy3 = neverEqualPolicy;
        }
        List list2 = list;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new PaymentMethodToken(((LocalCheckoutPaymentMethodViewModel) it4.next()).token));
        }
        rememberedValue3 = CollectionsKt.toSet(arrayList4);
        gapComposer.updateRememberedValue(rememberedValue3);
        Set set = (Set) rememberedValue3;
        String str15 = str3 == null ? paymentMethodConfig.selectedPaymentMethodToken : str3;
        if (str3 != null) {
            str8 = str3;
            obj = new PaymentMethodToken(str8);
        } else {
            str8 = str3;
            obj = str4;
        }
        Object[] objArr = {obj};
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy3) {
            rememberedValue4 = new AvatarViewModel$$ExternalSyntheticLambda0(13);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue4, gapComposer, 48);
        PaymentMethodToken paymentMethodToken = (PaymentMethodToken) mutableState.getValue();
        String str16 = paymentMethodToken != null ? paymentMethodToken.value : str4;
        String str17 = str16 == null ? str15 : str16;
        ?? r10 = new PaymentMethodToken(str17);
        if (!set.contains(new PaymentMethodToken(str17))) {
            r10 = str4;
        }
        String str18 = r10 != 0 ? r10.value : str4;
        if (str18 == null) {
            ?? r102 = new PaymentMethodToken(str15);
            if (!set.contains(new PaymentMethodToken(str15))) {
                r102 = str4;
            }
            str18 = r102 != 0 ? r102.value : str4;
            if (str18 == null) {
                LocalCheckoutPaymentMethodViewModel localCheckoutPaymentMethodViewModel3 = (LocalCheckoutPaymentMethodViewModel) CollectionsKt.firstOrNull(list);
                str18 = localCheckoutPaymentMethodViewModel3 != null ? localCheckoutPaymentMethodViewModel3.token : str4;
            }
        }
        str15 = str18;
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(new PaymentMethodToken(str15), gapComposer);
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(str8 != null ? new PaymentMethodToken(str8) : str4, gapComposer);
        MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(mutableState, gapComposer);
        Object paymentMethodToken2 = str16 != null ? new PaymentMethodToken(str16) : str4;
        Object paymentMethodToken3 = str8 != null ? new PaymentMethodToken(str8) : str4;
        boolean changed4 = gapComposer.changed(str16 != null ? new PaymentMethodToken(str16) : str4) | gapComposer.changedInstance(set) | gapComposer.changed(mutableState);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed4 || rememberedValue5 == neverEqualPolicy3) {
            AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2(str16, set, mutableState, str4, 9);
            gapComposer.updateRememberedValue(animatedImageDecoder$wrapDrawable$2);
            rememberedValue5 = animatedImageDecoder$wrapDrawable$2;
        }
        Updater.LaunchedEffect(paymentMethodToken2, paymentMethodToken3, set, (Function2) rememberedValue5, gapComposer);
        str15.getClass();
        list.getClass();
        JWECryptoParts jWECryptoParts4 = new JWECryptoParts();
        jWECryptoParts4.header = str15;
        jWECryptoParts4.encryptedKey = list;
        jWECryptoParts4.iv = rememberUpdatedState;
        jWECryptoParts4.cipherText = rememberUpdatedState2;
        jWECryptoParts4.authenticationTag = rememberUpdatedState3;
        return jWECryptoParts4;
    }
}
