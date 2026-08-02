package androidx.core.net;

import android.net.Uri;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.analytics.RecipientAnalyticsKt;
import com.squareup.cash.recipients.analytics.SectionHeaderNameAnalytics;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.data.Section;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.recipients.viewmodels.SectionViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.Region;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.Regions;
import com.squareup.wire.GrpcStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class UriKt {
    public static final ProfileScreens.ProfileScreen.Customer buildCustomerFromRecipient(Recipient recipient) {
        RedactedString redactedString;
        recipient.getClass();
        String str = recipient.customerId;
        String str2 = recipient.lookupKey;
        String str3 = recipient.sms;
        String str4 = recipient.email;
        if (str == null) {
            if (str3 != null) {
                return new ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithPhoneNumber(str3, str2);
            }
            if (str4 != null) {
                return new ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithEmail(str4, str2);
            }
            a$$ExternalSyntheticBUOutline0.m$1((Object) "Expecting the avatar to not be clickable for a customer with no aliases!");
            return null;
        }
        RedactedString redactedString2 = new RedactedString(str);
        boolean z = recipient.isBusiness;
        String str5 = recipient.fullName;
        if (str5 != null) {
            redactedString = new RedactedString(str5);
        } else if (str4 != null) {
            redactedString = new RedactedString(str4);
        } else {
            redactedString = str3 != null ? new RedactedString(str3) : null;
            if (redactedString == null) {
                redactedString = new RedactedString("");
            }
        }
        RedactedString redactedString3 = redactedString;
        String str6 = recipient.cashtag;
        RedactedString redactedString4 = str6 != null ? new RedactedString(str6) : null;
        RedactedString redactedString5 = str4 != null ? new RedactedString(str4) : null;
        RedactedString redactedString6 = str3 != null ? new RedactedString(str3) : null;
        Color color = recipient.themedAccentColor;
        return new ProfileScreens.ProfileScreen.Customer.CashCustomer(redactedString2, new ProfileScreens.ProfileScreen.Customer.CashCustomer.CashCustomerData(redactedString3, redactedString4, redactedString5, redactedString6, recipient.photo, color, recipient.region, recipient.isCashCustomer, z, recipient.isVerified, Long.valueOf(recipient.creditCardFee), recipient.blockState, null, true), z, 8);
    }

    public static final String getCustomerId(Recipient recipient) {
        recipient.getClass();
        String str = recipient.customerId;
        if (str != null || (str = recipient.lookupKey) != null || (str = recipient.email) != null) {
            return str;
        }
        String str2 = recipient.sms;
        return str2 == null ? "" : str2;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewProfileSwitcherToRerouteDestination.deepLinkSpecs;
    }

    public static final RecipientViewModel.Avatar getRecipientAvatar(Recipient recipient, Section.Type type2) {
        Character firstOrNull;
        Recipient.CryptoRecipientPayment cryptoRecipientPayment = recipient.invoice;
        String str = recipient.displayName;
        if (cryptoRecipientPayment instanceof Recipient.CryptoRecipientPayment.Bitcoin) {
            return RecipientViewModel.Avatar.BitcoinAddressAvatar.INSTANCE;
        }
        if (type2 != null && type2 == Section.Type.RESULTS && !recipient.isCashCustomer && str != null) {
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isLetter(str.charAt(i))) {
                }
            }
            return RecipientViewModel.Avatar.PlaceholderAvatar.INSTANCE;
        }
        if (str == null || (firstOrNull = StringsKt___StringsKt.firstOrNull(str)) == null || Character.isLetter(firstOrNull.charValue())) {
            return new RecipientViewModel.Avatar.PhotoImageAvatar(recipient.photo);
        }
        return RecipientViewModel.Avatar.PlaceholderAvatar.INSTANCE;
    }

    public static final String getRecipientSubtitle(Recipient recipient, Region region, AndroidStringManager androidStringManager) {
        Recipient.CryptoRecipientPayment cryptoRecipientPayment = recipient.invoice;
        String str = recipient.cashtag;
        if (cryptoRecipientPayment instanceof Recipient.CryptoRecipientPayment.Solana) {
            return androidStringManager.get(R.string.solana_recipient_selector_crypto_invoice);
        }
        if (cryptoRecipientPayment instanceof Recipient.CryptoRecipientPayment.Stablecoin) {
            return ((Recipient.CryptoRecipientPayment.Stablecoin) cryptoRecipientPayment).option.network.truncatedAddress;
        }
        if (str != null) {
            String str2 = recipient.fullName;
            if (str2 == null || StringsKt.isBlank(str2)) {
                return null;
            }
            Region region2 = recipient.region;
            if (region2 == null) {
                region2 = Region.XXL;
            }
            return Cashtags.fromString(str, region2);
        }
        if (!recipient.hasMultipleCustomers || region == null) {
            if (recipient.isCashCustomer) {
                return androidStringManager.get(recipient.isRecent ? R.string.send_payment_recipient_recent : R.string.send_payment_recipient_existing);
            }
            return androidStringManager.get(R.string.recipient_non_cash_invite_subtitle);
        }
        String[] strArr = {PhoneNumbers.format(recipient.sms, Regions.toCountry(region).name(), null), recipient.email};
        for (int i = 0; i < 2; i++) {
            String str3 = strArr[i];
            if (str3 != null ? !StringsKt.isBlank(str3) : false) {
                return str3;
            }
        }
        return null;
    }

    public static ArrayList mapSectionsToViewModels$default(List list, List list2, Region region, AndroidStringManager androidStringManager) {
        String str;
        SectionViewModel.Type type2;
        AndroidStringManager androidStringManager2 = androidStringManager;
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Section section = (Section) it.next();
            List list3 = section.recipients;
            Section.Type type3 = section.f1192type;
            SectionViewModel sectionViewModel = null;
            if (!list3.isEmpty()) {
                int ordinal = type3.ordinal();
                if (ordinal == 0) {
                    str = androidStringManager2.get(R.string.recipients_header_suggested);
                } else if (ordinal == 1) {
                    str = androidStringManager2.get(R.string.recipients_header_contacts);
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str = androidStringManager2.get(R.string.recipients_header_results);
                }
                String str2 = str;
                int ordinal2 = type3.ordinal();
                if (ordinal2 == 0) {
                    type2 = SectionViewModel.Type.SUGGESTED;
                } else if (ordinal2 == 1) {
                    type2 = SectionViewModel.Type.CONTACTS;
                } else {
                    if (ordinal2 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    type2 = SectionViewModel.Type.RESULTS;
                }
                SectionViewModel.Type type4 = type2;
                List list4 = section.recipients;
                list4.getClass();
                str2.getClass();
                List list5 = list4;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                int i = 0;
                for (Object obj : list5) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    Recipient recipient = (Recipient) obj;
                    arrayList2.add(toRecipientViewModel(recipient, str2 + i, type3, region, androidStringManager2, true, list2.contains(getCustomerId(recipient))));
                    androidStringManager2 = androidStringManager;
                    i = i2;
                }
                sectionViewModel = new SectionViewModel(str2, type4, arrayList2, null, null);
            }
            if (sectionViewModel != null) {
                arrayList.add(sectionViewModel);
            }
            androidStringManager2 = androidStringManager;
        }
        return arrayList;
    }

    public static final File toFile(Uri uri) {
        if (!Intrinsics.areEqual(uri.getScheme(), "file")) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Uri lacks 'file' scheme: "));
            return null;
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Uri path is null: "));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final RecipientViewModel toRecipientViewModel(Recipient recipient, String str, Section.Type type2, Region region, AndroidStringManager androidStringManager, boolean z, boolean z2) {
        Recipient.Analytics analytics;
        Character ch;
        Character ch2;
        String str2;
        String str3;
        Map map = RecipientAnalyticsKt.SEARCH_TYPES;
        Recipient.Analytics analytics2 = recipient.analytics;
        Character ch3 = null;
        if (analytics2 != null) {
            int ordinal = type2.ordinal();
            if (ordinal == 0) {
                SectionHeaderNameAnalytics[] sectionHeaderNameAnalyticsArr = SectionHeaderNameAnalytics.$VALUES;
                str2 = "suggested";
            } else if (ordinal != 1) {
                str3 = null;
                analytics = Recipient.Analytics.copy$default(analytics2, null, str3, null, null, 16777151);
            } else {
                SectionHeaderNameAnalytics[] sectionHeaderNameAnalyticsArr2 = SectionHeaderNameAnalytics.$VALUES;
                str2 = "contacts";
            }
            str3 = str2;
            analytics = Recipient.Analytics.copy$default(analytics2, null, str3, null, null, 16777151);
        } else {
            analytics = null;
        }
        Recipient copy$default = Recipient.copy$default(recipient, null, null, null, null, null, null, analytics, false, false, -1073741825, 3);
        String str4 = recipient.displayName;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        String recipientSubtitle = getRecipientSubtitle(recipient, region, androidStringManager);
        RecipientViewModel.Avatar recipientAvatar = getRecipientAvatar(recipient, type2);
        String str6 = recipient.fullName;
        if (str6 != null) {
            if (StringsKt.isBlank(str6)) {
                str6 = null;
            }
            if (str6 != null) {
                ch = GrpcStatus.Companion.monogram(str6);
            }
        }
        String str7 = recipient.cashtag;
        if (str7 != null) {
            if (StringsKt.isBlank(str7)) {
                str7 = null;
            }
            if (str7 != null) {
                ch = GrpcStatus.Companion.monogram(str7);
                if (ch == null) {
                    String str8 = recipient.email;
                    if (str8 != null) {
                        if (StringsKt.isBlank(str8)) {
                            str8 = null;
                        }
                        if (str8 != null) {
                            ch3 = GrpcStatus.Companion.monogram(str8);
                        }
                    }
                    ch2 = ch3;
                    return new RecipientViewModel(str, copy$default, str5, recipientAvatar, ch2, recipientSubtitle, z2, recipient.isVerified, recipient.isBusiness, recipient.getAccentColor(), z, 4096);
                }
                ch2 = ch;
                return new RecipientViewModel(str, copy$default, str5, recipientAvatar, ch2, recipientSubtitle, z2, recipient.isVerified, recipient.isBusiness, recipient.getAccentColor(), z, 4096);
            }
        }
        ch = null;
        if (ch == null) {
        }
        ch2 = ch;
        return new RecipientViewModel(str, copy$default, str5, recipientAvatar, ch2, recipientSubtitle, z2, recipient.isVerified, recipient.isBusiness, recipient.getAccentColor(), z, 4096);
    }
}
