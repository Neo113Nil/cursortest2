package com.braze.ui;

import android.content.Context;
import android.webkit.JavascriptInterface;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.RowScopeInstance$$ExternalSyntheticLambda0;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import bo.app.xg$$ExternalSyntheticLambda9;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.appsflyer.AdRevenueScheme;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils$$ExternalSyntheticLambda2;
import com.braze.support.c$$ExternalSyntheticLambda2;
import com.braze.ui.support.UriUtils$$ExternalSyntheticLambda2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 B2\u00020\u0001:\u0001BB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\tH\u0007J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0007J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0012\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\tH\u0007J \u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%H\u0007J\u001a\u0010&\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0007J\u0018\u0010*\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0007J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0007J \u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tH\u0007J\u0018\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\tH\u0007J\u0010\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\tH\u0007J\u0010\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\tH\u0007J\u0012\u00106\u001a\u0004\u0018\u0001072\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u0014\u00108\u001a\u0004\u0018\u0001092\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0007J(\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020<2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%H\u0007J!\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010>2\b\u0010'\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010\u000f\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/braze/ui/UserJavascriptInterfaceBase;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "setFirstName", "", "firstName", "", "setLastName", "lastName", "setEmail", "email", "setGender", "genderString", "setDateOfBirth", "year", "month", "day", "setCountry", AdRevenueScheme.COUNTRY, "setLanguage", "language", "setHomeCity", "homeCity", "setEmailNotificationSubscriptionType", "subscriptionType", "setPushNotificationSubscriptionType", "setPhoneNumber", "phoneNumber", "setLineId", "lineId", "setCustomUserAttributeJSON", "key", "jsonStringValue", "merge", "", "setCustomUserAttributeArray", "jsonArrayString", "addToCustomAttributeArray", "value", "removeFromCustomAttributeArray", "incrementCustomUserAttribute", "attribute", "setCustomLocationAttribute", "latitude", "longitude", "addAlias", "alias", AnnotatedPrivateKey.LABEL, "addToSubscriptionGroup", "subscriptionGroupId", "removeFromSubscriptionGroup", "monthFromInt", "Lcom/braze/enums/Month;", "subscriptionTypeFromJavascriptString", "Lcom/braze/enums/NotificationSubscriptionType;", "setCustomAttribute", "user", "Lcom/braze/BrazeUser;", "parseStringArrayFromJsonString", "", "(Ljava/lang/String;)[Ljava/lang/String;", "parseGender", "Lcom/braze/enums/Gender;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UserJavascriptInterfaceBase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context context;

    public UserJavascriptInterfaceBase(Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addAlias$lambda$0(String str, String str2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.addAlias(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToCustomAttributeArray$lambda$0(String str, String str2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.addToCustomAttributeArray(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToSubscriptionGroup$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.addToSubscriptionGroup(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementCustomUserAttribute$lambda$0(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to parse incrementCustomUserAttribute increment value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incrementCustomUserAttribute$lambda$1(String str, Integer num, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.incrementCustomUserAttribute(str, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseStringArrayFromJsonString$lambda$1() {
        return "Failed to parse custom attribute array";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromCustomAttributeArray$lambda$0(String str, String str2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.removeFromCustomAttributeArray(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromSubscriptionGroup$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.removeFromSubscriptionGroup(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCountry$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setCountry(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$0(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Failed to parse custom attribute type for key: ", str, " and json string value: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$1(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Failed to parse custom attribute type for key: ", str, " and json string value: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomLocationAttribute$lambda$0(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to parse setCustomLocationAttribute latitude value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomLocationAttribute$lambda$1(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to parse setCustomLocationAttribute longitude value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomLocationAttribute$lambda$2(String str, Double d, Double d2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setLocationCustomAttribute(str, d.doubleValue(), d2.doubleValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeArray$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to set custom attribute array for key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeArray$lambda$1(String str, String[] strArr, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setCustomAttributeArray(str, strArr);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeJSON$lambda$0(UserJavascriptInterfaceBase userJavascriptInterfaceBase, String str, String str2, boolean z, BrazeUser brazeUser) {
        brazeUser.getClass();
        userJavascriptInterfaceBase.setCustomAttribute(brazeUser, str, str2, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$0(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to parse setDateOfBirth year value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to parse setDateOfBirth month for value ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$2(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to parse setDateOfBirth day value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDateOfBirth$lambda$3(Integer num, Month month, Integer num2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setDateOfBirth(num.intValue(), month, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmail$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setEmail(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmailNotificationSubscriptionType$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmailNotificationSubscriptionType$lambda$1(NotificationSubscriptionType notificationSubscriptionType, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setEmailNotificationSubscriptionType(notificationSubscriptionType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFirstName$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setFirstName(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGender$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to parse gender in Braze HTML in-app message javascript interface with gender: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setGender$lambda$1(Gender gender, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setGender(gender);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHomeCity$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setHomeCity(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLanguage$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setLanguage(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLastName$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setLastName(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLineId$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setLineId(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPhoneNumber$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setPhoneNumber(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPushNotificationSubscriptionType$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPushNotificationSubscriptionType$lambda$1(NotificationSubscriptionType notificationSubscriptionType, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setPushNotificationSubscriptionType(notificationSubscriptionType);
        return Unit.INSTANCE;
    }

    @JavascriptInterface
    public final void addAlias(String alias, String label) {
        alias.getClass();
        label.getClass();
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(alias, label, 0));
    }

    @JavascriptInterface
    public final void addToCustomAttributeArray(String key, String value) {
        key.getClass();
        value.getClass();
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(key, value, 5));
    }

    @JavascriptInterface
    public final void addToSubscriptionGroup(String subscriptionGroupId) {
        subscriptionGroupId.getClass();
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(subscriptionGroupId, 2));
    }

    @JavascriptInterface
    public final void incrementCustomUserAttribute(String attribute, String value) {
        attribute.getClass();
        value.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(value);
        if (intOrNull == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(value, 8), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new CombinedModifier$$ExternalSyntheticLambda0(5, attribute, intOrNull));
        }
    }

    public final Month monthFromInt(String month) {
        int intValue;
        month.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(month);
        if (intOrNull == null || (intValue = intOrNull.intValue()) < 1 || intValue > 12) {
            return null;
        }
        return Month.INSTANCE.getMonth(intValue - 1);
    }

    public final Gender parseGender(String genderString) {
        genderString.getClass();
        Locale locale = Locale.US;
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, genderString, locale);
        Gender gender = Gender.MALE;
        if (Intrinsics.areEqual(m, gender.getValue())) {
            return gender;
        }
        Gender gender2 = Gender.FEMALE;
        if (Intrinsics.areEqual(m, gender2.getValue())) {
            return gender2;
        }
        Gender gender3 = Gender.OTHER;
        if (Intrinsics.areEqual(m, gender3.getValue())) {
            return gender3;
        }
        Gender gender4 = Gender.UNKNOWN;
        if (Intrinsics.areEqual(m, gender4.getValue())) {
            return gender4;
        }
        Gender gender5 = Gender.NOT_APPLICABLE;
        if (Intrinsics.areEqual(m, gender5.getValue())) {
            return gender5;
        }
        Gender gender6 = Gender.PREFER_NOT_TO_SAY;
        if (Intrinsics.areEqual(m, gender6.getValue())) {
            return gender6;
        }
        return null;
    }

    public final String[] parseStringArrayFromJsonString(String jsonArrayString) {
        try {
            JSONArray jSONArray = new JSONArray(jsonArrayString);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new c$$ExternalSyntheticLambda2(15), 4, (Object) null);
            return null;
        }
    }

    @JavascriptInterface
    public final void removeFromCustomAttributeArray(String key, String value) {
        key.getClass();
        value.getClass();
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(key, value, 4));
    }

    @JavascriptInterface
    public final void removeFromSubscriptionGroup(String subscriptionGroupId) {
        subscriptionGroupId.getClass();
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(subscriptionGroupId, 3));
    }

    @JavascriptInterface
    public final void setCountry(String country) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(country, 4));
    }

    public final void setCustomAttribute(BrazeUser user, String key, String jsonStringValue, boolean merge) {
        user.getClass();
        key.getClass();
        jsonStringValue.getClass();
        try {
            Object obj = new JSONObject(jsonStringValue).get("value");
            if (obj instanceof String) {
                user.setCustomUserAttribute(key, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                user.setCustomUserAttribute(key, ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof Integer) {
                user.setCustomUserAttribute(key, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Double) {
                user.setCustomUserAttribute(key, ((Number) obj).doubleValue());
            } else if (obj instanceof JSONObject) {
                user.setCustomUserAttribute(key, (JSONObject) obj, merge);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new WebContentUtils$$ExternalSyntheticLambda2(key, jsonStringValue, 2), 6, (Object) null);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new WebContentUtils$$ExternalSyntheticLambda2(key, jsonStringValue, 3), 4, (Object) null);
        }
    }

    @JavascriptInterface
    public final void setCustomLocationAttribute(String attribute, String latitude, String longitude) {
        attribute.getClass();
        latitude.getClass();
        longitude.getClass();
        Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(latitude);
        if (doubleOrNull == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(latitude, 6), 6, (Object) null);
            return;
        }
        Double doubleOrNull2 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(longitude);
        if (doubleOrNull2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(longitude, 7), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UtilsKt$$ExternalSyntheticLambda0(9, attribute, doubleOrNull, doubleOrNull2));
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeArray(String key, String jsonArrayString) {
        key.getClass();
        String[] parseStringArrayFromJsonString = parseStringArrayFromJsonString(jsonArrayString);
        if (parseStringArrayFromJsonString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(key, 10), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new CombinedModifier$$ExternalSyntheticLambda0(6, key, parseStringArrayFromJsonString));
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeJSON(String key, String jsonStringValue, boolean merge) {
        key.getClass();
        jsonStringValue.getClass();
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(this, key, jsonStringValue, merge, 0));
    }

    @JavascriptInterface
    public final void setDateOfBirth(String year, String month, String day) {
        year.getClass();
        month.getClass();
        day.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(year);
        if (intOrNull == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(year, 12), 6, (Object) null);
            return;
        }
        Month monthFromInt = monthFromInt(month);
        if (monthFromInt == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(month, 13), 6, (Object) null);
            return;
        }
        Integer intOrNull2 = StringsKt.toIntOrNull(day);
        if (intOrNull2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(day, 5), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UtilsKt$$ExternalSyntheticLambda0(8, intOrNull, monthFromInt, intOrNull2));
        }
    }

    @JavascriptInterface
    public final void setEmail(String email) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(email, 0));
    }

    @JavascriptInterface
    public final void setEmailNotificationSubscriptionType(String subscriptionType) {
        subscriptionType.getClass();
        NotificationSubscriptionType subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (subscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(subscriptionType, 4), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda1(subscriptionTypeFromJavascriptString, 0));
        }
    }

    @JavascriptInterface
    public final void setFirstName(String firstName) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(firstName, 5));
    }

    @JavascriptInterface
    public final void setGender(String genderString) {
        genderString.getClass();
        Gender parseGender = parseGender(genderString);
        if (parseGender == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(genderString, 9), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new xg$$ExternalSyntheticLambda9(parseGender, 15));
        }
    }

    @JavascriptInterface
    public final void setHomeCity(String homeCity) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(homeCity, 6));
    }

    @JavascriptInterface
    public final void setLanguage(String language) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(language, 1));
    }

    @JavascriptInterface
    public final void setLastName(String lastName) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(lastName, 9));
    }

    @JavascriptInterface
    public final void setLineId(String lineId) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(lineId, 8));
    }

    @JavascriptInterface
    public final void setPhoneNumber(String phoneNumber) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(phoneNumber, 7));
    }

    @JavascriptInterface
    public final void setPushNotificationSubscriptionType(String subscriptionType) {
        subscriptionType.getClass();
        NotificationSubscriptionType subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (subscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriUtils$$ExternalSyntheticLambda2(subscriptionType, 11), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new UserJavascriptInterfaceBase$$ExternalSyntheticLambda1(subscriptionTypeFromJavascriptString, 1));
        }
    }

    public final NotificationSubscriptionType subscriptionTypeFromJavascriptString(String subscriptionType) {
        return NotificationSubscriptionType.INSTANCE.fromValue(subscriptionType);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u0007*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/braze/ui/UserJavascriptInterfaceBase$Companion;", "", "<init>", "()V", "Lcom/braze/Braze;", "Lkotlin/Function1;", "Lcom/braze/BrazeUser;", "", "block", "runOnUser", "(Lcom/braze/Braze;Lkotlin/jvm/functions/Function1;)V", "", "JS_BRIDGE_ATTRIBUTE_VALUE", "Ljava/lang/String;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void runOnUser(Braze braze, Function1<? super BrazeUser, Unit> function1) {
            braze.getCurrentUser(new RowScopeInstance$$ExternalSyntheticLambda0(function1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runOnUser$lambda$0(Function1 function1, BrazeUser brazeUser) {
            brazeUser.getClass();
            function1.invoke(brazeUser);
        }

        private Companion() {
        }
    }
}
