package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcelable;
import android.util.Base64;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.recipients.data.Recipient;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.TransactionStatus;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import com.stripe.android.stripe3ds2.transactions.UiType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes8.dex */
public abstract class zzba {
    public static String decodeHtml(String str) {
        Object failure;
        if (str == null) {
            return null;
        }
        Parcelable.Creator<ChallengeResponseData> creator = ChallengeResponseData.CREATOR;
        try {
            Result.Companion companion = Result.Companion;
            byte[] decode = Base64.decode(str, 8);
            decode.getClass();
            failure = new String(decode, Charsets.UTF_8);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        return (String) (failure instanceof Result.Failure ? null : failure);
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0445, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r22) == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0448, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0534, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r0) == false) goto L235;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x054f  */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ChallengeResponseData fromJson$3ds2sdk_release(JSONObject jSONObject) {
        boolean z;
        ArrayList arrayList;
        ?? r0;
        UiType fromCode$3ds2sdk_release;
        String str;
        boolean z2;
        String str2;
        String str3;
        ArrayList arrayList2;
        UiType uiType;
        String str4;
        ChallengeResponseData.Image image;
        String str5;
        List list;
        boolean z3;
        TransactionStatus transactionStatus;
        boolean z4;
        Object failure;
        if (!"CRes".equals(jSONObject.optString("messageType"))) {
            ProtocolError[] protocolErrorArr = ProtocolError.$VALUES;
            throw new ChallengeResponseParseException(101, "Message is not CRes", "Invalid Message Type");
        }
        boolean z5 = true;
        boolean yesNoValue$3ds2sdk_release = getYesNoValue$3ds2sdk_release("challengeCompletionInd", jSONObject, true);
        SdkTransactionId sdkTransactionId = new SdkTransactionId(getTransactionId$3ds2sdk_release("sdkTransID", jSONObject));
        String uuid = getTransactionId$3ds2sdk_release("threeDSServerTransID", jSONObject).toString();
        uuid.getClass();
        String uuid2 = getTransactionId$3ds2sdk_release("acsTransID", jSONObject).toString();
        uuid2.getClass();
        String optString = jSONObject.optString("messageVersion");
        optString.getClass();
        String str6 = !StringsKt.isBlank(optString) ? optString : null;
        if (str6 == null) {
            int i = ChallengeResponseParseException.$r8$clinit;
            throw zzap.createRequiredDataElementMissing("messageVersion");
        }
        Parcelable.Creator<MessageExtension> creator = MessageExtension.CREATOR;
        JSONArray optJSONArray = jSONObject.optJSONArray("messageExtension");
        int i2 = 64;
        if (optJSONArray == null) {
            z = true;
            arrayList = null;
        } else {
            IntRange until = RangesKt___RangesKt.until(0, optJSONArray.length());
            ArrayList arrayList3 = new ArrayList();
            IntProgressionIterator it = until.iterator();
            while (it.hasNext) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(it.nextInt());
                if (optJSONObject != null) {
                    arrayList3.add(optJSONObject);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it2.next();
                Parcelable.Creator<MessageExtension> creator2 = MessageExtension.CREATOR;
                String optString2 = jSONObject2.optString("name");
                if (optString2.length() > i2) {
                    int i3 = ChallengeResponseParseException.$r8$clinit;
                    throw zzap.createInvalidDataElementFormat("messageExtension.name");
                }
                String optString3 = jSONObject2.optString("id");
                if (optString3.length() > i2) {
                    int i4 = ChallengeResponseParseException.$r8$clinit;
                    throw zzap.createInvalidDataElementFormat("messageExtension.id");
                }
                HashMap hashMap = new HashMap();
                boolean z6 = z5;
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                if (optJSONObject2 != null) {
                    Iterator<String> keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString4 = optJSONObject2.optString(next);
                        if (optString4.length() > 8059) {
                            int i5 = ChallengeResponseParseException.$r8$clinit;
                            throw zzap.createInvalidDataElementFormat("messageExtension.data.value");
                        }
                        hashMap.put(next, optString4);
                    }
                }
                arrayList4.add(new MessageExtension(optString2, optString3, jSONObject2.optBoolean("criticalityIndicator"), hashMap));
                z5 = z6;
                i2 = 64;
            }
            z = z5;
            if (arrayList4.size() > 10) {
                int i6 = ChallengeResponseParseException.$r8$clinit;
                throw zzap.createInvalidDataElementFormat("messageExtensions");
            }
            arrayList = arrayList4;
        }
        if (arrayList != null) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : arrayList) {
                if (((MessageExtension) obj).criticalityIndicator) {
                    MessageExtension.SUPPORTED_MESSAGE_EXTENSIONS.getClass();
                    arrayList5.add(obj);
                }
            }
            if (!arrayList5.isEmpty()) {
                ProtocolError[] protocolErrorArr2 = ProtocolError.$VALUES;
                throw new ChallengeResponseParseException(EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, "Critical message extension not recognised.", CollectionsKt.joinToString$default(arrayList5, ",", null, null, 0, null, null, 62));
            }
        }
        boolean yesNoValue$3ds2sdk_release2 = getYesNoValue$3ds2sdk_release("challengeInfoTextIndicator", jSONObject, false);
        String string2 = jSONObject.has("resendInformationLabel") ? jSONObject.getString("resendInformationLabel") : null;
        if (string2 != null && string2.length() == 0) {
            int i7 = ChallengeResponseParseException.$r8$clinit;
            throw zzap.createInvalidDataElementFormat("resendInformationLabel");
        }
        JSONObject jSONObject3 = jSONObject.has("challengeSelectInfo") ? jSONObject : null;
        if (jSONObject3 != null) {
            Parcelable.Creator<ChallengeResponseData> creator3 = ChallengeResponseData.CREATOR;
            try {
                Result.Companion companion = Result.Companion;
                failure = jSONObject3.getJSONArray("challengeSelectInfo");
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (Result.m4120exceptionOrNullimpl(failure) != null) {
                int i8 = ChallengeResponseParseException.$r8$clinit;
                throw zzap.createInvalidDataElementFormat("challengeSelectInfo");
            }
            r0 = (JSONArray) failure;
        } else {
            r0 = null;
        }
        if (yesNoValue$3ds2sdk_release) {
            fromCode$3ds2sdk_release = null;
        } else {
            String optString5 = jSONObject.optString("acsUiType");
            if (optString5 == null || StringsKt.isBlank(optString5)) {
                int i9 = ChallengeResponseParseException.$r8$clinit;
                throw zzap.createRequiredDataElementMissing("acsUiType");
            }
            UiType.Companion.getClass();
            fromCode$3ds2sdk_release = KClasses$$Lambda$1.fromCode$3ds2sdk_release(optString5);
            if (fromCode$3ds2sdk_release == null) {
                int i10 = ChallengeResponseParseException.$r8$clinit;
                throw zzap.createInvalidDataElementFormat("acsUiType");
            }
        }
        if (fromCode$3ds2sdk_release != null) {
            Parcelable.Creator<ChallengeResponseData> creator4 = ChallengeResponseData.CREATOR;
            String string3 = jSONObject.has("submitAuthenticationLabel") ? jSONObject.getString("submitAuthenticationLabel") : null;
            if ((string3 == null || StringsKt.isBlank(string3)) && fromCode$3ds2sdk_release.requiresSubmitButton) {
                int i11 = ChallengeResponseParseException.$r8$clinit;
                throw zzap.createRequiredDataElementMissing("submitAuthenticationLabel");
            }
            str = string3;
        } else {
            str = null;
        }
        if (fromCode$3ds2sdk_release != null) {
            Parcelable.Creator<ChallengeResponseData> creator5 = ChallengeResponseData.CREATOR;
            String string4 = jSONObject.has("acsHTML") ? jSONObject.getString("acsHTML") : null;
            if ((string4 == null || StringsKt.isBlank(string4)) && fromCode$3ds2sdk_release == UiType.Html) {
                int i12 = ChallengeResponseParseException.$r8$clinit;
                throw zzap.createRequiredDataElementMissing("acsHTML");
            }
            if (string4 != null) {
                z2 = false;
                z2 = false;
                z2 = false;
                z2 = false;
                z2 = false;
                if (!StringsKt.contains((CharSequence) string4, (CharSequence) "\n", false) && !StringsKt.contains((CharSequence) string4, (CharSequence) " ", false) && !StringsKt.contains((CharSequence) string4, (CharSequence) Marker.ANY_NON_NULL_MARKER, false) && !StringsKt.contains((CharSequence) string4, (CharSequence) "/", false)) {
                    z4 = false;
                    boolean z7 = (string4 == null && StringsKt__StringsJVMKt.endsWith(string4, "=", z2)) ? z : z2;
                    if (fromCode$3ds2sdk_release != UiType.Html && (z4 || z7)) {
                        int i13 = ChallengeResponseParseException.$r8$clinit;
                        throw zzap.createInvalidDataElementFormat("acsHTML");
                    }
                    str2 = decodeHtml(string4);
                }
            } else {
                z2 = false;
            }
            z4 = z;
            if (string4 == null) {
            }
            if (fromCode$3ds2sdk_release != UiType.Html) {
            }
            str2 = decodeHtml(string4);
        } else {
            z2 = false;
            str2 = null;
        }
        if (fromCode$3ds2sdk_release != null) {
            Parcelable.Creator<ChallengeResponseData> creator6 = ChallengeResponseData.CREATOR;
            String optString6 = jSONObject.optString("oobContinueLabel");
            if ((optString6 == null || StringsKt.isBlank(optString6)) && fromCode$3ds2sdk_release == UiType.OutOfBand) {
                int i14 = ChallengeResponseParseException.$r8$clinit;
                throw zzap.createRequiredDataElementMissing("oobContinueLabel");
            }
            str3 = optString6;
        } else {
            str3 = null;
        }
        if (r0 == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList6 = new ArrayList();
            int length = r0.length();
            for (?? r12 = z2; r12 < length; r12++) {
                JSONObject optJSONObject3 = r0.optJSONObject(r12);
                if (optJSONObject3 != null) {
                    String next2 = optJSONObject3.keys().next();
                    String optString7 = optJSONObject3.optString(next2);
                    next2.getClass();
                    optString7.getClass();
                    arrayList6.add(new ChallengeResponseData.ChallengeSelectOption(next2, optString7));
                }
            }
            arrayList2 = arrayList6;
        }
        String decodeHtml = yesNoValue$3ds2sdk_release ? null : decodeHtml(jSONObject.optString("acsHTMLRefresh"));
        String optString8 = yesNoValue$3ds2sdk_release ? null : jSONObject.optString("challengeInfoHeader");
        String optString9 = yesNoValue$3ds2sdk_release ? null : jSONObject.optString("challengeInfoLabel");
        String optString10 = yesNoValue$3ds2sdk_release ? null : jSONObject.optString("challengeInfoText");
        String optString11 = yesNoValue$3ds2sdk_release ? null : jSONObject.optString("challengeAddInfo");
        String optString12 = yesNoValue$3ds2sdk_release ? null : jSONObject.optString("whitelistingInfoText");
        String optString13 = yesNoValue$3ds2sdk_release ? null : jSONObject.optString("whyInfoLabel");
        String optString14 = yesNoValue$3ds2sdk_release ? null : jSONObject.optString("whyInfoText");
        String optString15 = yesNoValue$3ds2sdk_release ? null : jSONObject.optString("expandInfoLabel");
        String optString16 = yesNoValue$3ds2sdk_release ? null : jSONObject.optString("expandInfoText");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("issuerImage");
        String str7 = str2;
        if (optJSONObject4 != null) {
            uiType = fromCode$3ds2sdk_release;
            str4 = decodeHtml;
            image = new ChallengeResponseData.Image(optJSONObject4.optString("medium"), optJSONObject4.optString("high"), optJSONObject4.optString("extraHigh"));
        } else {
            uiType = fromCode$3ds2sdk_release;
            str4 = decodeHtml;
            image = null;
        }
        String optString17 = yesNoValue$3ds2sdk_release ? null : jSONObject.optString("oobAppURL");
        String optString18 = yesNoValue$3ds2sdk_release ? null : jSONObject.optString("oobAppLabel");
        JSONObject optJSONObject5 = jSONObject.optJSONObject("psImage");
        String str8 = optString17;
        ChallengeResponseData.Image image2 = optJSONObject5 != null ? new ChallengeResponseData.Image(optJSONObject5.optString("medium"), optJSONObject5.optString("high"), optJSONObject5.optString("extraHigh")) : null;
        if (yesNoValue$3ds2sdk_release) {
            String optString19 = jSONObject.optString("transStatus");
            if (optString19 == null || StringsKt.isBlank(optString19)) {
                int i15 = ChallengeResponseParseException.$r8$clinit;
                throw zzap.createRequiredDataElementMissing("transStatus");
            }
            TransactionStatus.Companion.getClass();
            Iterator it3 = TransactionStatus.$ENTRIES.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    transactionStatus = null;
                    break;
                }
                ?? next3 = it3.next();
                if (((TransactionStatus) next3).code.equals(optString19)) {
                    transactionStatus = next3;
                    break;
                }
            }
            TransactionStatus transactionStatus2 = transactionStatus;
            if (transactionStatus2 == null) {
                int i16 = ChallengeResponseParseException.$r8$clinit;
                throw zzap.createInvalidDataElementFormat("transStatus");
            }
            str5 = transactionStatus2.code;
        } else {
            str5 = "";
        }
        ArrayList arrayList7 = arrayList;
        UiType uiType2 = uiType;
        boolean z8 = false;
        ChallengeResponseData challengeResponseData = new ChallengeResponseData(uuid, uuid2, str7, str4, uiType2, yesNoValue$3ds2sdk_release, optString8, optString9, optString10, optString11, yesNoValue$3ds2sdk_release2, arrayList2, optString15, optString16, image, arrayList7, str6, str8, optString18, str3, image2, string2, sdkTransactionId, str, optString12, optString13, optString14, str5);
        String str9 = optString8;
        String str10 = str3;
        if (uiType2 != null) {
            if (uiType2 != UiType.Html) {
                if (uiType2 == UiType.Text || uiType2 == UiType.SingleSelect || uiType2 == UiType.MultiSelect) {
                    Set<String> set = ArraysKt___ArraysKt.toSet(new String[]{str9, optString9, optString10});
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        for (String str11 : set) {
                            if (str11 == null || StringsKt.isBlank(str11)) {
                                break;
                            }
                        }
                    }
                }
                if (uiType2 == UiType.OutOfBand) {
                    Set<String> set2 = ArraysKt___ArraysKt.toSet(new String[]{str9, optString10});
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        for (String str12 : set2) {
                            if (str12 == null || StringsKt.isBlank(str12)) {
                                break;
                            }
                        }
                    }
                }
                if (str10 == null || str10.length() == 0 || ((str9 != null && str9.length() != 0) || (optString10 != null && optString10.length() != 0))) {
                    if (uiType2 == UiType.OutOfBand) {
                        Set<String> set3 = ArraysKt___ArraysKt.toSet(new String[]{challengeResponseData.oobAppLabel, challengeResponseData.oobAppUrl, str10});
                        if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                            for (String str13 : set3) {
                                if (str13 == null || StringsKt.isBlank(str13)) {
                                }
                            }
                        }
                    } else if ((uiType2 != UiType.SingleSelect && uiType2 != UiType.MultiSelect) || ((list = challengeResponseData.challengeSelectOptions) != null && !list.isEmpty())) {
                        String str14 = challengeResponseData.submitAuthenticationLabel;
                        if (str14 != null) {
                        }
                        z3 = z;
                    }
                }
                if (!z8) {
                    int i17 = ChallengeResponseParseException.$r8$clinit;
                    throw zzap.createRequiredDataElementMissing("UI fields missing");
                }
                String str15 = challengeResponseData.whitelistingInfoText;
                if (str15 == null || str15.length() <= 64) {
                    return challengeResponseData;
                }
                int i18 = ChallengeResponseParseException.$r8$clinit;
                throw zzap.createInvalidDataElementFormat("Whitelisting info text exceeds length.");
            }
            if (str7 != null) {
            }
            z3 = z;
            z8 = !z3;
            if (!z8) {
            }
        }
        z8 = z;
        if (!z8) {
        }
    }

    public static final ArrayList getEmailAddressList(Recipient recipient) {
        recipient.getClass();
        String str = recipient.emailAddresses;
        List split$default = str != null ? StringsKt__StringsKt.split$default(str, new String[]{","}, false, 0, 6, null) : null;
        if (split$default == null) {
            split$default = EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList getSmsNumberList(Recipient recipient) {
        recipient.getClass();
        String str = recipient.smsNumbers;
        List split$default = str != null ? StringsKt__StringsKt.split$default(str, new String[]{","}, false, 0, 6, null) : null;
        if (split$default == null) {
            split$default = EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static UUID getTransactionId$3ds2sdk_release(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (optString == null || StringsKt.isBlank(optString)) {
            int i = ChallengeResponseParseException.$r8$clinit;
            throw zzap.createRequiredDataElementMissing(str);
        }
        try {
            Result.Companion companion = Result.Companion;
            UUID fromString = UUID.fromString(optString);
            fromString.getClass();
            return fromString;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            if (Result.m4120exceptionOrNullimpl(new Result.Failure(th)) == null) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            }
            int i2 = ChallengeResponseParseException.$r8$clinit;
            throw zzap.createInvalidDataElementFormat(str);
        }
    }

    public static boolean getYesNoValue$3ds2sdk_release(String str, JSONObject jSONObject, boolean z) {
        String string2;
        if (!z) {
            string2 = jSONObject.has(str) ? jSONObject.getString(str) : null;
        } else {
            if (!jSONObject.has(str)) {
                int i = ChallengeResponseParseException.$r8$clinit;
                throw zzap.createRequiredDataElementMissing(str);
            }
            string2 = jSONObject.getString(str);
        }
        if (string2 == null || ChallengeResponseData.YES_NO_VALUES.contains(string2)) {
            return "Y".equals(string2);
        }
        if (z && StringsKt.isBlank(string2)) {
            int i2 = ChallengeResponseParseException.$r8$clinit;
            throw zzap.createRequiredDataElementMissing(str);
        }
        int i3 = ChallengeResponseParseException.$r8$clinit;
        throw zzap.createInvalidDataElementFormat(str);
    }

    public static String zzb(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String m;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                m = "null";
            } else {
                try {
                    m = obj.toString();
                } catch (Exception e) {
                    String m2 = Recorder$$ExternalSyntheticOutline2.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m2), (Throwable) e);
                    m = Boxes$$ExternalSyntheticOutline1.m("<", m2, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = m;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
