package com.google.android.gms.internal.common;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.trifle.KeyHandle;
import app.cash.trifle.protos.api.alpha.Certificate;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.model.Address;
import com.stripe.android.model.Card;
import com.stripe.android.model.ClientAttributionMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenizationMethod;
import com.stripe.android.model.parsers.TokenJsonParser;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.text.Charsets;
import okio.ByteString;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class zzx {
    public static PaymentMethodCreateParams createFromGooglePay(JSONObject jSONObject, ClientAttributionMetadata clientAttributionMetadata) {
        Card card;
        TokenizationMethod tokenizationMethod;
        JSONObject jSONObject2 = jSONObject.getJSONObject("paymentMethodData");
        Token parse = TokenJsonParser.parse(new JSONObject(jSONObject2.getJSONObject("tokenizationData").getString("token")));
        JSONObject optJSONObject = jSONObject2.getJSONObject("info").optJSONObject("billingAddress");
        String str = null;
        Address address = optJSONObject != null ? new Address(StripeJsonUtils.optString("locality", optJSONObject), StripeJsonUtils.optString("countryCode", optJSONObject), StripeJsonUtils.optString("address1", optJSONObject), StripeJsonUtils.optString("address2", optJSONObject), StripeJsonUtils.optString("postalCode", optJSONObject), StripeJsonUtils.optString("administrativeArea", optJSONObject)) : null;
        String optString = StripeJsonUtils.optString("name", optJSONObject);
        String optString2 = StripeJsonUtils.optString("email", jSONObject);
        String optString3 = StripeJsonUtils.optString("phoneNumber", optJSONObject);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("shippingAddress");
        if (optJSONObject2 != null) {
            StripeJsonUtils.optString("address1", optJSONObject2);
            StripeJsonUtils.optString("address2", optJSONObject2);
            StripeJsonUtils.optString("postalCode", optJSONObject2);
            StripeJsonUtils.optString("locality", optJSONObject2);
            StripeJsonUtils.optString("administrativeArea", optJSONObject2);
            StripeJsonUtils.optString("countryCode", optJSONObject2);
            StripeJsonUtils.optString("name", optJSONObject2);
            StripeJsonUtils.optString("phoneNumber", optJSONObject2);
        }
        String str2 = parse != null ? parse.id : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        if (parse != null && (card = parse.card) != null && (tokenizationMethod = card.tokenizationMethod) != null) {
            str = tokenizationMethod.toString();
        }
        return new PaymentMethodCreateParams(PaymentMethod.Type.Card, new PaymentMethodCreateParams.Card(null, null, null, null, str3, str != null ? SetsKt__SetsJVMKt.setOf(str) : EmptySet.INSTANCE, null), new PaymentMethod.BillingDetails(address, optString2, optString, optString3), clientAttributionMetadata, 696316);
    }

    public static final ArrayList mapToTrifleCertificates(List list) {
        List<byte[]> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (byte[] bArr : list2) {
            bArr.getClass();
            Certificate certificate = (Certificate) Certificate.ADAPTER.decode(bArr);
            Integer num = certificate.version;
            if (num == null || num.intValue() != 0) {
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                return null;
            }
            ByteString byteString = certificate.certificate;
            if (byteString == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return null;
            }
            arrayList.add(new app.cash.trifle.Certificate(byteString.toByteArray(), certificate.version.intValue()));
        }
        return arrayList;
    }

    public static final KeyHandle toKeyHandle(byte[] bArr) {
        bArr.getClass();
        KeyStore keyStore = KeyHandle.KEY_STORE;
        bArr.getClass();
        String str = new String(bArr, Charsets.UTF_8);
        if (KeyHandle.KEY_STORE.containsAlias(str)) {
            return new KeyHandle(str);
        }
        throw new IllegalStateException(String.format("Android KeyStore does not contain a keypair corresponding to the %s tag", Arrays.copyOf(new Object[]{str}, 1)));
    }

    public static String zza(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(zzb(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(zzb(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String zzb(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String m = Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(m.length() + 8 + name2.length() + 1);
            Boxes$$ExternalSyntheticOutline1.m(sb, "<", m, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }
}
