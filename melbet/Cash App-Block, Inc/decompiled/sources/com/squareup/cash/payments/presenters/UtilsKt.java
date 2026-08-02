package com.squareup.cash.payments.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.TextRange;
import androidx.core.net.UriKt;
import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.cdf.asset.AssetSendPersonalizationButtonTapped;
import com.squareup.cash.cdf.asset.EntryPoint;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.cdf.asset.PersonalizationOrigin;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.payments.presenters.CryptoPaymentManager;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.HeaderAvatar;
import com.squareup.cash.presenters.AccentColorsKt;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Region;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public abstract class UtilsKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ContactsStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ContactsStatus contactsStatus = ContactsStatus.IN_CONTACTS;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ContactsStatus contactsStatus2 = ContactsStatus.IN_CONTACTS;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.squareup.protos.franklin.ui.ContactsStatus.values().length];
            try {
                iArr2[com.squareup.protos.franklin.ui.ContactsStatus.IN_CONTACTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.squareup.protos.franklin.ui.ContactsStatus.NOT_IN_CONTACTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.squareup.protos.franklin.ui.ContactsStatus.CONTACTS_DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getClipboardRecipient(String str, CryptoPaymentOrigin cryptoPaymentOrigin, CryptoPaymentManager cryptoPaymentManager, AndroidStringManager androidStringManager, CryptoPaymentManager.SelectedRecipient selectedRecipient, List list, ContinuationImpl continuationImpl) {
        UtilsKt$getClipboardRecipient$1 utilsKt$getClipboardRecipient$1;
        int i;
        AndroidStringManager androidStringManager2;
        CryptoPaymentManager.SelectedRecipient selectedRecipient2;
        Object obj;
        List list2;
        CryptoPaymentManager.SelectedRecipient selectedRecipient3;
        Recipient.CryptoRecipientPayment solana;
        String str2 = str;
        if (continuationImpl instanceof UtilsKt$getClipboardRecipient$1) {
            utilsKt$getClipboardRecipient$1 = (UtilsKt$getClipboardRecipient$1) continuationImpl;
            int i2 = utilsKt$getClipboardRecipient$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                utilsKt$getClipboardRecipient$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = utilsKt$getClipboardRecipient$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = utilsKt$getClipboardRecipient$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    utilsKt$getClipboardRecipient$1.L$0 = str2;
                    androidStringManager2 = androidStringManager;
                    utilsKt$getClipboardRecipient$1.L$3 = androidStringManager2;
                    utilsKt$getClipboardRecipient$1.L$4 = selectedRecipient;
                    utilsKt$getClipboardRecipient$1.L$5 = list;
                    utilsKt$getClipboardRecipient$1.label = 1;
                    Object parseInvoice = cryptoPaymentManager.parseInvoice(cryptoPaymentOrigin, str2, utilsKt$getClipboardRecipient$1);
                    if (parseInvoice == obj3) {
                        return obj3;
                    }
                    selectedRecipient2 = selectedRecipient;
                    obj = parseInvoice;
                    list2 = list;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = utilsKt$getClipboardRecipient$1.L$5;
                    selectedRecipient2 = utilsKt$getClipboardRecipient$1.L$4;
                    AndroidStringManager androidStringManager3 = utilsKt$getClipboardRecipient$1.L$3;
                    String str3 = utilsKt$getClipboardRecipient$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    list2 = list3;
                    str2 = str3;
                    obj = obj2;
                    androidStringManager2 = androidStringManager3;
                }
                selectedRecipient3 = (CryptoPaymentManager.SelectedRecipient) obj;
                if (selectedRecipient3 == null) {
                    selectedRecipient2 = selectedRecipient3;
                } else if (selectedRecipient2 == null || !StringsKt__StringsJVMKt.startsWith(selectedRecipient2.getData(), str2, false)) {
                    selectedRecipient2 = null;
                }
                if (selectedRecipient2 != null) {
                    String data = selectedRecipient2.getData();
                    String truncateAtMiddle$default = truncateAtMiddle$default(selectedRecipient2.getData());
                    if (selectedRecipient2 instanceof CryptoPaymentManager.SelectedRecipient.BitcoinPaymentRecipient) {
                        solana = new Recipient.CryptoRecipientPayment.Bitcoin(((CryptoPaymentManager.SelectedRecipient.BitcoinPaymentRecipient) selectedRecipient2).invoice);
                    } else if (selectedRecipient2 instanceof CryptoPaymentManager.SelectedRecipient.SolanaPaymentRecipient) {
                        solana = new Recipient.CryptoRecipientPayment.Solana(((CryptoPaymentManager.SelectedRecipient.SolanaPaymentRecipient) selectedRecipient2).address);
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                    Recipient recipient = new Recipient(null, false, false, data, null, null, false, false, false, null, null, null, null, null, null, false, 0L, null, null, false, null, null, null, null, null, truncateAtMiddle$default, null, null, false, null, null, false, false, solana, -33554441, 1);
                    return new RecipientViewModel(selectedRecipient2.getData(), recipient, truncateAtMiddle$default(selectedRecipient2.getData()), UriKt.getRecipientAvatar(recipient, null), null, androidStringManager2.get(selectedRecipient2.getSubtitleId()), list2.contains(UriKt.getCustomerId(recipient)), false, false, null, false, 7056);
                }
                return null;
            }
        }
        utilsKt$getClipboardRecipient$1 = new UtilsKt$getClipboardRecipient$1(continuationImpl);
        Object obj22 = utilsKt$getClipboardRecipient$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = utilsKt$getClipboardRecipient$1.label;
        if (i != 0) {
        }
        selectedRecipient3 = (CryptoPaymentManager.SelectedRecipient) obj;
        if (selectedRecipient3 == null) {
        }
        if (selectedRecipient2 != null) {
        }
        return null;
    }

    public static final boolean isPersonalizedPaymentButtonEnabled(boolean z, boolean z2, boolean z3, List list, Region region) {
        list.getClass();
        if (!z || !z2 || !z3 || list.size() != 1 || region != Region.USA) {
            return false;
        }
        List<PaymentRecipient> list2 = list;
        if (!list2.isEmpty()) {
            for (PaymentRecipient paymentRecipient : list2) {
                if (Intrinsics.areEqual(paymentRecipient.sendableUiCustomer.is_cash_customer, Boolean.FALSE)) {
                    return false;
                }
                Region region2 = paymentRecipient.sendableUiCustomer.region;
                if (region2 == null) {
                    region2 = Region.USA;
                }
                if (region2 != Region.USA) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final void showPersonalizePayments(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, CurrencyCode currencyCode, Navigator navigator, AndroidStringManager androidStringManager, MoneyFormatter moneyFormatter, PaymentScreens.PersonalizePayment personalizePayment, Analytics analytics, EntryPoint entryPoint, String str2, PersonalizationOrigin personalizationOrigin, PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion personalizePaymentQuestion) {
        boolean z9;
        str.getClass();
        currencyCode.getClass();
        navigator.getClass();
        moneyFormatter.getClass();
        str2.getClass();
        Redacted redacted = personalizePayment.note;
        Redacted redacted2 = personalizePayment.recipients;
        Money money = personalizePayment.amount;
        boolean z10 = true;
        if (((CharSequence) redacted.getValue()).length() > 0) {
            z9 = true;
        } else {
            z9 = true;
            z10 = false;
        }
        if (!z7) {
            showWarningDialog(navigator, androidStringManager.get(R.string.confirm_personalized_payment_offline_send_title), androidStringManager.get(R.string.send_payment_personalize_offline), analytics, str, entryPoint, z9 ^ ((Collection) redacted2.getValue()).isEmpty(), money.amount != null ? z9 : false, z10, str2, androidStringManager.get(R.string.payment_recipient_selection_warning_dismiss));
            return;
        }
        if (!z) {
            showWarningDialog(navigator, null, androidStringManager.get(R.string.send_payment_personalize_error_no_recipients), analytics, str, entryPoint, false, money.amount != null ? z9 : false, z10, str2, androidStringManager.get(R.string.send_payment_personalize_error_button_text));
            return;
        }
        if (z2) {
            showWarningDialog(navigator, androidStringManager.get(R.string.send_payment_personalize_error_title), androidStringManager.get(R.string.send_payment_personalize_error_multiple_recipients), analytics, str, entryPoint, z9 ^ ((Collection) redacted2.getValue()).isEmpty(), money.amount != null ? z9 : false, z10, str2, null);
            return;
        }
        if (!z3) {
            showWarningDialog(navigator, androidStringManager.get(R.string.send_payment_personalize_error_title), androidStringManager.get(R.string.send_payment_personalize_error_send_only), analytics, str, entryPoint, z9 ^ ((Collection) redacted2.getValue()).isEmpty(), money.amount != null ? z9 : false, z10, str2, null);
            return;
        }
        if (!z4) {
            showWarningDialog(navigator, androidStringManager.get(R.string.send_payment_personalize_error_title), androidStringManager.get(R.string.send_payment_personalize_error_cash_users_only), analytics, str, entryPoint, z9 ^ ((Collection) redacted2.getValue()).isEmpty(), money.amount != null ? z9 : false, z10, str2, null);
            return;
        }
        if (!z5) {
            showWarningDialog(navigator, androidStringManager.get(R.string.send_payment_personalize_error_title), androidStringManager.get(R.string.send_payment_personalize_error_cross_border), analytics, str, entryPoint, z9 ^ ((Collection) redacted2.getValue()).isEmpty(), money.amount != null ? z9 : false, z10, str2, null);
            return;
        }
        if (z8) {
            String str3 = androidStringManager.get(R.string.send_payment_personalize_error_title);
            String format2 = moneyFormatter.format(new Money(Long.valueOf((long) Moneys.displayDivisor(currencyCode)), (CurrencyCode) null, 6));
            format2.getClass();
            Resources resources = androidStringManager.resources;
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.minimum_amount_send_error)).format(new Object[]{format2});
            format3.getClass();
            showWarningDialog(navigator, str3, format3, analytics, str, entryPoint, z9 ^ ((Collection) redacted2.getValue()).isEmpty(), money.amount != null ? z9 : false, z10, str2, null);
            return;
        }
        if (z6) {
            showWarningDialog(navigator, androidStringManager.get(R.string.send_payment_personalize_error_title), androidStringManager.get(R.string.send_payment_invalid_payment_amount), analytics, str, entryPoint, z9 ^ ((Collection) redacted2.getValue()).isEmpty(), false, z10, str2, null);
            return;
        }
        boolean z11 = ((CharSequence) redacted.getValue()).length() > 0 ? z9 : false;
        ExperienceType experienceType = ExperienceType.LEGACY;
        Boolean bool = Boolean.TRUE;
        analytics.track(new AssetSendPersonalizationButtonTapped(str2, personalizationOrigin, entryPoint, bool, bool, Boolean.valueOf(z11), bool, str, null, experienceType, 256), null);
        if (personalizePaymentQuestion != null) {
            navigator.askQuestion(personalizePaymentQuestion, new UtilsKt$$ExternalSyntheticLambda0(personalizePayment, r7 ? 1 : 0));
        } else {
            navigator.goTo(personalizePayment);
        }
    }

    public static final void showWarningDialog(Navigator navigator, String str, String str2, Analytics analytics, String str3, EntryPoint entryPoint, boolean z, boolean z2, boolean z3, String str4, String str5) {
        navigator.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        analytics.track(new AssetSendPersonalizationButtonTapped(str4, null, entryPoint, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.FALSE, str3, str2, ExperienceType.LEGACY, 2), null);
        navigator.goTo(new PaymentScreens.WarningDialog(str != null ? new RedactedString(str) : null, new RedactedString(str2), str5 != null ? new RedactedString(str5) : null, 8));
    }

    public static final HeaderAvatar toHeaderAvatar(com.squareup.cash.db.contacts.Recipient recipient) {
        recipient.getClass();
        String firstName = recipient.getFirstName();
        String str = recipient.displayName;
        return new HeaderAvatar(recipient, firstName, str != null ? Character.valueOf(Character.toUpperCase(str.charAt(0))) : null, AccentColorsKt.getAccentColor(recipient), recipient.photo);
    }

    public static final com.squareup.protos.franklin.ui.ContactsStatus toProto(ContactsStatus contactsStatus) {
        contactsStatus.getClass();
        int ordinal = contactsStatus.ordinal();
        if (ordinal == 0) {
            return com.squareup.protos.franklin.ui.ContactsStatus.IN_CONTACTS;
        }
        if (ordinal == 1) {
            return com.squareup.protos.franklin.ui.ContactsStatus.NOT_IN_CONTACTS;
        }
        if (ordinal == 2) {
            return com.squareup.protos.franklin.ui.ContactsStatus.CONTACTS_DISABLED;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static String truncateAtMiddle$default(String str) {
        str.getClass();
        return str.length() > "...".length() + 12 ? Recorder$$ExternalSyntheticOutline2.m(StringsKt___StringsKt.take(6, str), "...", StringsKt___StringsKt.takeLast(6, str)) : str;
    }

    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m3702updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m988getLengthimpl;
        int m990getMinimpl = TextRange.m990getMinimpl(j);
        int m989getMaximpl = TextRange.m989getMaximpl(j);
        if ((TextRange.m990getMinimpl(j2) < TextRange.m989getMaximpl(j)) && (TextRange.m990getMinimpl(j) < TextRange.m989getMaximpl(j2))) {
            if (TextRange.m984contains5zctL8(j2, j)) {
                m990getMinimpl = TextRange.m990getMinimpl(j2);
                m989getMaximpl = m990getMinimpl;
            } else {
                if (TextRange.m984contains5zctL8(j, j2)) {
                    m988getLengthimpl = TextRange.m988getLengthimpl(j2);
                } else {
                    int m990getMinimpl2 = TextRange.m990getMinimpl(j2);
                    if (m990getMinimpl >= TextRange.m989getMaximpl(j2) || m990getMinimpl2 > m990getMinimpl) {
                        m989getMaximpl = TextRange.m990getMinimpl(j2);
                    } else {
                        m990getMinimpl = TextRange.m990getMinimpl(j2);
                        m988getLengthimpl = TextRange.m988getLengthimpl(j2);
                    }
                }
                m989getMaximpl -= m988getLengthimpl;
            }
        } else if (m989getMaximpl > TextRange.m990getMinimpl(j2)) {
            m990getMinimpl -= TextRange.m988getLengthimpl(j2);
            m988getLengthimpl = TextRange.m988getLengthimpl(j2);
            m989getMaximpl -= m988getLengthimpl;
        }
        return SizeKt.TextRange(m990getMinimpl, m989getMaximpl);
    }
}
