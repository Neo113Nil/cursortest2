package androidx.core.math;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.InvestmentEntityData;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.ProtoDefaults;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class MathUtils {
    public static float clamp(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewPrepurchaseAfterpayApplet.deepLinkSpecs;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Recipient toDbRecipient(UiCustomer uiCustomer) {
        Color color;
        Image image;
        BlockState blockState;
        uiCustomer.getClass();
        String str = uiCustomer.email_address;
        String str2 = uiCustomer.sms_number;
        String str3 = uiCustomer.cashtag;
        String str4 = uiCustomer.id;
        str4.getClass();
        String str5 = uiCustomer.threaded_customer_id;
        Boolean bool = uiCustomer.can_accept_payments;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        String str6 = uiCustomer.full_name;
        MerchantData merchantData = uiCustomer.merchant_data;
        Region region = uiCustomer.region;
        String str7 = merchantData != null ? merchantData.category : null;
        Color color2 = uiCustomer.themed_accent_color;
        if (color2 == null) {
            String str8 = uiCustomer.accent_color;
            if (str8 == null) {
                color = null;
                Long l = uiCustomer.credit_card_fee_bps;
                long longValue = l == null ? l.longValue() : 0L;
                Boolean bool2 = uiCustomer.is_verified_account;
                boolean booleanValue2 = bool2 == null ? bool2.booleanValue() : false;
                Boolean bool3 = uiCustomer.is_business;
                boolean booleanValue3 = bool3 == null ? bool3.booleanValue() : false;
                Boolean bool4 = uiCustomer.is_cash_customer;
                boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                image = uiCustomer.photo;
                if (image == null) {
                    String str9 = uiCustomer.photo_url;
                    image = str9 != null ? new Image(str9, str9, 4) : null;
                }
                String str10 = uiCustomer.email_address;
                blockState = uiCustomer.block_state;
                if (blockState == null) {
                    blockState = ProtoDefaults.UI_CUSTOMER_BLOCK_STATE;
                }
                String str11 = uiCustomer.sms_number;
                InvestmentEntityData investmentEntityData = uiCustomer.investment_entity_data;
                return new Recipient(null, false, false, str4, str5, str3, booleanValue4, booleanValue2, booleanValue3, str, str2, image, str10, str11, booleanValue, longValue, blockState, merchantData, false, null, color, region, str7, uiCustomer.customer_joined_on, str6, null, investmentEntityData == null ? investmentEntityData.investment_entity_token : null, null, false, null, false, false, null, null, -99876857, 63);
            }
            color2 = ColorsKt.toColor(str8);
        }
        color = color2;
        Long l2 = uiCustomer.credit_card_fee_bps;
        long longValue2 = l2 == null ? l2.longValue() : 0L;
        Boolean bool22 = uiCustomer.is_verified_account;
        if (bool22 == null) {
        }
        Boolean bool32 = uiCustomer.is_business;
        if (bool32 == null) {
        }
        Boolean bool42 = uiCustomer.is_cash_customer;
        if (bool42 != null) {
        }
        image = uiCustomer.photo;
        if (image == null) {
        }
        String str102 = uiCustomer.email_address;
        blockState = uiCustomer.block_state;
        if (blockState == null) {
        }
        String str112 = uiCustomer.sms_number;
        InvestmentEntityData investmentEntityData2 = uiCustomer.investment_entity_data;
        return new Recipient(null, false, false, str4, str5, str3, booleanValue4, booleanValue2, booleanValue3, str, str2, image, str102, str112, booleanValue, longValue2, blockState, merchantData, false, null, color, region, str7, uiCustomer.customer_joined_on, str6, null, investmentEntityData2 == null ? investmentEntityData2.investment_entity_token : null, null, false, null, false, false, null, null, -99876857, 63);
    }

    public static final com.squareup.cash.recipients.data.Recipient toRecipient(Recipient recipient) {
        recipient.getClass();
        String str = recipient.lookupKey;
        boolean z = recipient.alreadyInvited;
        boolean z2 = recipient.hasMultipleCustomers;
        String str2 = recipient.customerId;
        String str3 = recipient.threadedCustomerId;
        if (str3 == null) {
            str3 = str2;
        }
        return new com.squareup.cash.recipients.data.Recipient(str, z, z2, str2, str3, recipient.cashtag, recipient.isCashCustomer, recipient.isVerified, recipient.isBusiness, recipient.email, recipient.sms, null, recipient.photo, recipient.emailAddresses, recipient.smsNumbers, recipient.canAcceptPayments, recipient.creditCardFee, recipient.blockState, recipient.merchantData, recipient.isRecent, recipient.rawAccentColor, recipient.themedAccentColor, recipient.region, recipient.category, recipient.joined_on, recipient.fullName, recipient.contactName, recipient.investmentEntityToken, recipient.isInContacts, null, null, recipient.isFavorite, false, null, 1610614784, 3);
    }

    public static int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }
}
