package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.data.UtilsKt;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorCustomer;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.util.cash.ColorsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public abstract class DrawableCompat {
    public static void applyTheme(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static void canApplyTheme(Drawable drawable) {
        drawable.canApplyTheme();
    }

    public static int getAlpha(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static ColorFilter getColorFilter(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewPayEmail.deepLinkSpecs;
    }

    public static int getLayoutDirection(VectorDrawableCompat vectorDrawableCompat) {
        return vectorDrawableCompat.getLayoutDirection();
    }

    public static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean isAutoMirrored(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void jumpToCurrentState(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void setAutoMirrored(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static void setHotspot(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void setHotspotBounds(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void setTint(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void setTintList(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static Recipient transform(String str, String str2, String str3, int i, int i2, RecipientSelectorCustomer recipientSelectorCustomer, SuggestionStrategy suggestionStrategy, ArrayList arrayList, Set set) {
        List list;
        Boolean bool;
        str2.getClass();
        recipientSelectorCustomer.getClass();
        set.getClass();
        RecipientSelectorCustomer.Metadata metadata = recipientSelectorCustomer.metadata;
        String str4 = recipientSelectorCustomer.token;
        boolean z = false;
        boolean areEqual = metadata != null ? Intrinsics.areEqual(metadata.is_cash_customer, Boolean.FALSE) : false;
        String str5 = recipientSelectorCustomer.token;
        Avatar avatar = recipientSelectorCustomer.avatar;
        String str6 = recipientSelectorCustomer.full_name;
        Cashtag cashtag = recipientSelectorCustomer.cashtag;
        String valueOf = cashtag != null ? String.valueOf(cashtag.name) : null;
        String str7 = (areEqual && str.equals("email")) ? str2 : null;
        String str8 = (areEqual && str.equals("sms")) ? str2 : null;
        Region region = recipientSelectorCustomer.region;
        Boolean bool2 = recipientSelectorCustomer.is_verified;
        boolean booleanValue = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = recipientSelectorCustomer.is_business;
        boolean booleanValue2 = bool3 != null ? bool3.booleanValue() : false;
        Long l = recipientSelectorCustomer.credit_card_fee_bps;
        long longValue = l != null ? l.longValue() : 0L;
        Boolean bool4 = recipientSelectorCustomer.can_accept_payments;
        boolean booleanValue3 = bool4 != null ? bool4.booleanValue() : false;
        if (metadata != null && (bool = metadata.is_cash_customer) != null) {
            z = bool.booleanValue();
        }
        return new Recipient(null, false, false, str5, null, valueOf, z, booleanValue, booleanValue2, str7, str8, avatar, null, null, null, booleanValue3, longValue, Intrinsics.areEqual(recipientSelectorCustomer.is_blocked, Boolean.TRUE) ? BlockState.BLOCKED : BlockState.NOT_BLOCKED, null, false, null, null, region, null, null, str6, null, null, false, null, new Recipient.Analytics(null, null, null, null, null, null, str3, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(str2.length()), metadata != null ? metadata.match_length : null, suggestionStrategy, str, recipientSelectorCustomer.token, (metadata == null || (list = metadata.match_fields) == null) ? null : CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new OpenSourceKt$$ExternalSyntheticLambda8(23), 30), metadata != null ? metadata.query_token : null, metadata != null ? metadata.is_c4b_account : null, metadata != null ? metadata.is_multiple_account_holder : null, metadata != null ? metadata.is_first_linked_account : null, recipientSelectorCustomer.account_holder_token, metadata != null ? metadata.is_linked_account : null, 397375), arrayList.contains(str4 == null ? str2 : str4), CollectionsKt.contains(set, str4), null, 1035759639, 2);
    }

    public static com.squareup.cash.db.contacts.Recipient transform(Recipient recipient) {
        String uri;
        recipient.getClass();
        String str = recipient.lookupKey;
        boolean z = recipient.alreadyInvited;
        boolean z2 = recipient.hasMultipleCustomers;
        String str2 = recipient.customerId;
        String str3 = recipient.threadedCustomerId;
        String str4 = recipient.cashtag;
        boolean z3 = recipient.isCashCustomer;
        boolean z4 = recipient.isVerified;
        boolean z5 = recipient.isBusiness;
        String str5 = recipient.email;
        String str6 = recipient.sms;
        Image image = recipient.photo;
        if (image == null) {
            Uri createContactAvatarRequestUri = UtilsKt.createContactAvatarRequestUri(str, str5, str6);
            image = (createContactAvatarRequestUri == null || (uri = createContactAvatarRequestUri.toString()) == null) ? null : new Image(uri, uri, 4);
        }
        String str7 = recipient.emailAddresses;
        Image image2 = image;
        String str8 = recipient.smsNumbers;
        boolean z6 = recipient.canAcceptPayments;
        long j = recipient.creditCardFee;
        BlockState blockState = recipient.blockState;
        MerchantData merchantData = recipient.merchantData;
        boolean z7 = recipient.isRecent;
        String str9 = recipient.rawAccentColor;
        return new com.squareup.cash.db.contacts.Recipient(str, z, z2, str2, str3, str4, z3, z4, z5, str5, str6, image2, str7, str8, z6, j, blockState, merchantData, z7, str9, str9 != null ? ColorsKt.toColor(str9) : null, recipient.region, recipient.category, recipient.joined_on, recipient.fullName, recipient.contactName, recipient.investmentEntityToken, null, recipient.isInContacts, null, recipient.isFavorited, recipient.isSponsorAllowlisted, null, null, 671088640, 63);
    }

    public static Recipient transform(com.squareup.cash.db.contacts.Recipient recipient, List list, Set set) {
        String uri;
        list.getClass();
        set.getClass();
        String str = recipient.lookupKey;
        String str2 = recipient.customerId;
        boolean z = recipient.alreadyInvited;
        boolean z2 = recipient.hasMultipleCustomers;
        String str3 = recipient.threadedCustomerId;
        String str4 = recipient.cashtag;
        boolean z3 = recipient.isCashCustomer;
        boolean z4 = recipient.isVerified;
        boolean z5 = recipient.isBusiness;
        String str5 = recipient.email;
        String str6 = recipient.sms;
        Image image = recipient.photo;
        if (image == null) {
            Uri createContactAvatarRequestUri = UtilsKt.createContactAvatarRequestUri(str, str5, str6);
            image = (createContactAvatarRequestUri == null || (uri = createContactAvatarRequestUri.toString()) == null) ? null : new Image(uri, uri, 4);
        }
        String str7 = recipient.emailAddresses;
        String str8 = recipient.smsNumbers;
        boolean z6 = recipient.canAcceptPayments;
        long j = recipient.creditCardFee;
        BlockState blockState = recipient.blockState;
        MerchantData merchantData = recipient.merchantData;
        boolean z7 = recipient.isRecent;
        String str9 = recipient.rawAccentColor;
        return new Recipient(str, z, z2, str2, str3, str4, z3, z4, z5, str5, str6, null, image, str7, str8, z6, j, blockState, merchantData, z7, str9, str9 != null ? ColorsKt.toColor(str9) : null, recipient.region, recipient.category, recipient.joined_on, recipient.fullName, recipient.contactName, recipient.investmentEntityToken, recipient.isInContacts, null, null, CollectionsKt.contains(list, str2 == null ? str : str2), CollectionsKt.contains(set, str2 == null ? str : str2), null, 1610614784, 2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 com.squareup.cash.recipients.data.Recipient, still in use, count: 3, list:
          (r3v0 com.squareup.cash.recipients.data.Recipient) from 0x006d: MOVE (r17v0 com.squareup.cash.recipients.data.Recipient) = (r3v0 com.squareup.cash.recipients.data.Recipient)
          (r3v0 com.squareup.cash.recipients.data.Recipient) from 0x0066: MOVE (r17v3 com.squareup.cash.recipients.data.Recipient) = (r3v0 com.squareup.cash.recipients.data.Recipient)
          (r3v0 com.squareup.cash.recipients.data.Recipient) from 0x005a: MOVE (r17v4 com.squareup.cash.recipients.data.Recipient) = (r3v0 com.squareup.cash.recipients.data.Recipient)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static java.util.ArrayList transform(java.util.ArrayList r60, java.util.List r61, java.util.Set r62) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.DrawableCompat.transform(java.util.ArrayList, java.util.List, java.util.Set):java.util.ArrayList");
    }
}
