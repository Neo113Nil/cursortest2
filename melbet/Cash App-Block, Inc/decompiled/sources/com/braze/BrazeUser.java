package com.braze;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a3;
import bo.app.a9;
import bo.app.b3;
import bo.app.c3;
import bo.app.d3;
import bo.app.e2;
import bo.app.e3;
import bo.app.j1$$ExternalSyntheticLambda10;
import bo.app.j1$$ExternalSyntheticLambda21;
import bo.app.j1$$ExternalSyntheticLambda6;
import bo.app.k1;
import bo.app.ld$$ExternalSyntheticLambda5;
import bo.app.mf;
import bo.app.ne;
import bo.app.o9;
import bo.app.s2;
import bo.app.t2;
import bo.app.u2;
import bo.app.ue;
import bo.app.v2;
import bo.app.w2;
import bo.app.x2;
import bo.app.x7$$ExternalSyntheticLambda1;
import bo.app.xg;
import bo.app.y2;
import bo.app.y8;
import bo.app.yf$$ExternalSyntheticLambda2;
import bo.app.z2;
import com.appsflyer.AdRevenueScheme;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.ValidationUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b&\u0010\u0015J\u0017\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b(\u0010\u0015J\u0017\u0010*\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010\u0015J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020+¢\u0006\u0004\b0\u0010.J\u0015\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b2\u0010\u0015J\u0015\u00103\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b3\u0010\u0015J\u0017\u00105\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b5\u0010\u0015J\u0017\u00107\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b7\u0010\u0015J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u001e¢\u0006\u0004\b:\u0010<J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\b:\u0010\u0012J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020=¢\u0006\u0004\b:\u0010>J)\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020\u0010H\u0007¢\u0006\u0004\b:\u0010AJ\u001d\u0010B\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bB\u0010\u0012J\u001d\u0010C\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bC\u0010\u0012J%\u0010F\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u000e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060D¢\u0006\u0004\bF\u0010GJ!\u0010I\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\b\b\u0002\u0010H\u001a\u00020\u001eH\u0007¢\u0006\u0004\bI\u0010<J%\u0010M\u001a\u00020L2\u0006\u00108\u001a\u00020\u00062\u0006\u0010J\u001a\u00020=2\u0006\u0010K\u001a\u00020=¢\u0006\u0004\bM\u0010NJ)\u0010O\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00012\b\b\u0002\u0010@\u001a\u00020\u0010H\u0007¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010SR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR$\u0010Y\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006^"}, d2 = {"Lcom/braze/BrazeUser;", "", "Lbo/app/xg;", "userCache", "Lbo/app/a9;", "brazeManager", "", "internalUserId", "Lbo/app/o9;", "locationManager", "Lbo/app/ue;", "serverConfigStorageProvider", "<init>", "(Lbo/app/xg;Lbo/app/a9;Ljava/lang/String;Lbo/app/o9;Lbo/app/ue;)V", "alias", AnnotatedPrivateKey.LABEL, "", "addAlias", "(Ljava/lang/String;Ljava/lang/String;)Z", "firstName", "setFirstName", "(Ljava/lang/String;)Z", "lastName", "setLastName", "email", "setEmail", "Lcom/braze/enums/Gender;", "gender", "setGender", "(Lcom/braze/enums/Gender;)Z", "", "year", "Lcom/braze/enums/Month;", "month", "day", "setDateOfBirth", "(ILcom/braze/enums/Month;I)Z", AdRevenueScheme.COUNTRY, "setCountry", "homeCity", "setHomeCity", "language", "setLanguage", "Lcom/braze/enums/NotificationSubscriptionType;", "emailNotificationSubscriptionType", "setEmailNotificationSubscriptionType", "(Lcom/braze/enums/NotificationSubscriptionType;)Z", "pushNotificationSubscriptionType", "setPushNotificationSubscriptionType", "subscriptionGroupId", "addToSubscriptionGroup", "removeFromSubscriptionGroup", "phoneNumber", "setPhoneNumber", "lineId", "setLineId", "key", "value", "setCustomUserAttribute", "(Ljava/lang/String;Z)Z", "(Ljava/lang/String;I)Z", "", "(Ljava/lang/String;D)Z", "Lorg/json/JSONObject;", "merge", "(Ljava/lang/String;Lorg/json/JSONObject;Z)Z", "addToCustomAttributeArray", "removeFromCustomAttributeArray", "", "values", "setCustomAttributeArray", "(Ljava/lang/String;[Ljava/lang/String;)Z", "incrementValue", "incrementCustomUserAttribute", "latitude", "longitude", "", "setLocationCustomAttribute", "(Ljava/lang/String;DD)V", "setCustomAttribute", "(Ljava/lang/String;Ljava/lang/Object;Z)Z", "Lbo/app/xg;", "Lbo/app/a9;", "Ljava/lang/String;", "Lbo/app/o9;", "Lbo/app/ue;", "Ljava/util/concurrent/locks/ReentrantLock;", "userIdLock", "Ljava/util/concurrent/locks/ReentrantLock;", "userId", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BrazeUser {
    private final a9 brazeManager;
    private volatile String internalUserId;
    private final o9 locationManager;
    private final ue serverConfigStorageProvider;
    private final xg userCache;
    private final ReentrantLock userIdLock;

    public BrazeUser(xg xgVar, a9 a9Var, String str, o9 o9Var, ue ueVar) {
        xgVar.getClass();
        a9Var.getClass();
        str.getClass();
        o9Var.getClass();
        ueVar.getClass();
        this.userCache = xgVar;
        this.brazeManager = a9Var;
        this.internalUserId = str;
        this.locationManager = o9Var;
        this.serverConfigStorageProvider = ueVar;
        this.userIdLock = new ReentrantLock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$0() {
        return "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$1() {
        return "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$3(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to set alias: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToCustomAttributeArray$lambda$0() {
        return "Custom attribute key was invalid. Not adding to attribute array.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToCustomAttributeArray$lambda$1(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to add custom attribute with key '", str, "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToSubscriptionGroup$lambda$0() {
        return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not adding user to subscription group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToSubscriptionGroup$lambda$2(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to add user to subscription group ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementCustomUserAttribute$lambda$0(String str, int i) {
        return Recorder$$ExternalSyntheticOutline1.m("Failed to increment custom attribute ", i, str, " by ", ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromCustomAttributeArray$lambda$0() {
        return "Custom attribute key was invalid. Not removing from attribute array.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromCustomAttributeArray$lambda$1(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to remove custom attribute with key '", str, "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromSubscriptionGroup$lambda$0() {
        return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not removing user from subscription group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromSubscriptionGroup$lambda$2(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to remove user from subscription group ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCountry$lambda$0() {
        return "Invalid country parameter: country is required to be non-blank. Not setting country.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCountry$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to set country to: ", str);
    }

    public static /* synthetic */ boolean setCustomAttribute$default(BrazeUser brazeUser, String str, Object obj, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = false;
        }
        return brazeUser.setCustomAttribute(str, obj, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$0() {
        return "Custom attribute key cannot be null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$1$0(String str, Object obj) {
        return "Could not add unsupported custom attribute value with key: " + str + " and value: " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$1$1(String str, Object obj) {
        return "Could not build NestedCustomAttributeEvent for key " + str + " and " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttributeArray$lambda$0(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to set custom attribute array with key: '", str, "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$0(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to set custom boolean attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$1(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to set custom integer attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$4(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to set custom string attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$5(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to set custom double attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$6(String str, JSONObject jSONObject) {
        return Boxes$$ExternalSyntheticOutline1.m("Failed to set custom json attribute ", str, " with value \n", JsonUtils.getPrettyPrintedString(jSONObject), ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$0(int i, Month month, int i2) {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, month.getValue(), "Failed to set date of birth to: ", "-", "-");
        m107m.append(i2);
        return m107m.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$0() {
        return "Invalid email parameter: email is required to be non-empty. Not setting email.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$2$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Email address is not valid: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$3(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to set email to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmailNotificationSubscriptionType$lambda$0(NotificationSubscriptionType notificationSubscriptionType) {
        return "Failed to set email notification subscription to: " + notificationSubscriptionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFirstName$lambda$0() {
        return "Invalid first name parameter: first name is required to be non-empty. Not setting first name.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFirstName$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to set first name to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGender$lambda$0(Gender gender) {
        return "Failed to set gender to: " + gender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setHomeCity$lambda$0() {
        return "Invalid home city parameter: home city is required to be non-blank. Not setting home city.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setHomeCity$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to set home city to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLanguage$lambda$0() {
        return "Invalid language parameter: language is required to be non-empty. Not setting language.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLanguage$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to set language to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastName$lambda$0() {
        return "Invalid last name parameter: last name is required to be non-empty. Not setting last name.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastName$lambda$1(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to set last name to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$0() {
        return "Invalid LINE ID parameter: LINE ID is required to be non-empty or null. Not setting LINE ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$2$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("LINE ID is longer than 33 characters: Failed to set LINE ID: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$3(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to set LINE ID to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$0() {
        return "Custom location attribute key was invalid. Not setting attribute.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$1(double d, double d2) {
        return NavAction$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("Cannot set custom location attribute due with invalid latitude '", " and longitude '", d), d2, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$3(String str, double d, double d2) {
        return "Failed to set custom location attribute with key '" + str + "' and latitude '" + d + "' and longitude '" + d2 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$0() {
        return "Invalid phone number parameter: phone number is required to be non-empty. Not setting phone number.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$2$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$3(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to set phone number to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPushNotificationSubscriptionType$lambda$0(NotificationSubscriptionType notificationSubscriptionType) {
        return "Failed to set push notification subscription to: " + notificationSubscriptionType;
    }

    public final boolean addAlias(String alias, String label) {
        BrazeUser brazeUser;
        alias.getClass();
        label.getClass();
        if (StringsKt.isBlank(alias)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(25), 6, (Object) null);
            return false;
        }
        if (StringsKt.isBlank(label)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(26), 6, (Object) null);
            return false;
        }
        try {
            y8 s = k1.g.s(alias, label);
            if (s == null) {
                return false;
            }
            brazeUser = this;
            try {
                return ((e2) brazeUser.brazeManager).a(s);
            } catch (Exception e) {
                e = e;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(alias, 14), 4, (Object) null);
                return false;
            }
        } catch (Exception e2) {
            e = e2;
            brazeUser = this;
        }
    }

    public final boolean addToCustomAttributeArray(String key, String value) {
        key.getClass();
        value.getClass();
        try {
            if (!com.braze.support.c.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(21), 6, (Object) null);
                return false;
            }
            if (com.braze.support.c.c(value)) {
                y8 a = k1.g.a(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
                if (a != null) {
                    return ((e2) this.brazeManager).a(a);
                }
            }
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(key, 8), 4, (Object) null);
            return false;
        }
    }

    public final boolean addToSubscriptionGroup(String subscriptionGroupId) {
        BrazeUser brazeUser;
        subscriptionGroupId.getClass();
        try {
            if (StringsKt.isBlank(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(16), 6, (Object) null);
                return false;
            }
            y8 a = k1.g.a(subscriptionGroupId, mf.SUBSCRIBED);
            if (a == null) {
                return true;
            }
            brazeUser = this;
            try {
                ((e2) brazeUser.brazeManager).a(a);
                return true;
            } catch (Exception e) {
                e = e;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(subscriptionGroupId, 3), 4, (Object) null);
                return false;
            }
        } catch (Exception e2) {
            e = e2;
            brazeUser = this;
        }
    }

    public final String getUserId() {
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            return this.internalUserId;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean incrementCustomUserAttribute(String key, int incrementValue) {
        key.getClass();
        try {
            if (com.braze.support.c.a(key, this.serverConfigStorageProvider.e())) {
                y8 a = k1.g.a(ValidationUtils.ensureBrazeFieldLength(key), incrementValue);
                if (a != null) {
                    return ((e2) this.brazeManager).a(a);
                }
            }
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new j1$$ExternalSyntheticLambda6(key, incrementValue, 1), 4, (Object) null);
            return false;
        }
    }

    public final boolean removeFromCustomAttributeArray(String key, String value) {
        key.getClass();
        value.getClass();
        int i = 0;
        try {
            if (!com.braze.support.c.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(i), 6, (Object) null);
                return false;
            }
            if (com.braze.support.c.c(value)) {
                y8 q = k1.g.q(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
                if (q != null) {
                    return ((e2) this.brazeManager).a(q);
                }
            }
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(key, 2), 4, (Object) null);
            return false;
        }
    }

    public final boolean removeFromSubscriptionGroup(String subscriptionGroupId) {
        BrazeUser brazeUser;
        subscriptionGroupId.getClass();
        try {
            if (StringsKt.isBlank(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(27), 6, (Object) null);
                return false;
            }
            y8 a = k1.g.a(subscriptionGroupId, mf.UNSUBSCRIBED);
            if (a == null) {
                return true;
            }
            brazeUser = this;
            try {
                ((e2) brazeUser.brazeManager).a(a);
                return true;
            } catch (Exception e) {
                e = e;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(subscriptionGroupId, 19), 4, (Object) null);
                return false;
            }
        } catch (Exception e2) {
            e = e2;
            brazeUser = this;
        }
    }

    public final boolean setCountry(String country) {
        BrazeUser brazeUser;
        if (country != null) {
            try {
                if (StringsKt.isBlank(country)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(17), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                e = e;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(country, 4), 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            JobKt.launch$default(ne.a, null, null, new s2(brazeUser, country, null), 3);
            return true;
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(country, 4), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomAttribute(String key, Object value, boolean merge) {
        key.getClass();
        value.getClass();
        if (!com.braze.support.c.a(key, this.serverConfigStorageProvider.e())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(28), 6, (Object) null);
            return false;
        }
        String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(key);
        Object a = com.braze.support.c.a.a(value, 0);
        if (a == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ld$$ExternalSyntheticLambda5(key, 4, value), 6, (Object) null);
            return false;
        }
        if (!(a instanceof JSONObject) || !merge) {
            JobKt.launch$default(ne.a, null, null, new t2(this, ensureBrazeFieldLength, a, null), 3);
            return true;
        }
        y8 a2 = k1.g.a(ensureBrazeFieldLength, (JSONObject) a);
        if (a2 != null) {
            return ((e2) this.brazeManager).a(a2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ld$$ExternalSyntheticLambda5(ensureBrazeFieldLength, 5, a), 6, (Object) null);
        return false;
    }

    public final boolean setCustomAttributeArray(String key, String[] values) {
        key.getClass();
        values.getClass();
        try {
            if (com.braze.support.c.a(key, this.serverConfigStorageProvider.e())) {
                String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(key);
                ArrayList arrayList = new ArrayList(values.length);
                for (String str : values) {
                    arrayList.add(ValidationUtils.ensureBrazeFieldLength(str));
                }
                y8 a = k1.g.a(ensureBrazeFieldLength, (String[]) arrayList.toArray(new String[0]));
                if (a != null) {
                    return ((e2) this.brazeManager).a(a);
                }
            }
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(key, 20), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, boolean value) {
        BrazeUser brazeUser;
        String str;
        key.getClass();
        try {
            brazeUser = this;
            str = key;
        } catch (Exception e) {
            e = e;
            brazeUser = this;
            str = key;
        }
        try {
            return setCustomAttribute$default(brazeUser, str, Boolean.valueOf(value), false, 4, null);
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(str, 18), 4, (Object) null);
            return false;
        }
    }

    public final boolean setDateOfBirth(int year, Month month, int day) {
        int i;
        int i2;
        month.getClass();
        try {
            i = year;
            i2 = day;
        } catch (Exception e) {
            e = e;
            i = year;
            i2 = day;
        }
        try {
            JobKt.launch$default(ne.a, null, null, new u2(this, DateTimeUtils.formatDate$default(DateTimeUtils.createDate$default(i, month.getValue(), i2, 0, 0, 0, 56, null), BrazeDateFormat.SHORT, null, 2, null), null), 3);
            return true;
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new x7$$ExternalSyntheticLambda1(i, month, i2), 4, (Object) null);
            return false;
        }
    }

    public final boolean setEmail(String email) {
        BrazeUser brazeUser;
        String str;
        if (email != null) {
            try {
                if (StringsKt.isBlank(email)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(29), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                e = e;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(email, 22), 4, (Object) null);
                return false;
            }
        }
        if (email != null) {
            int length = email.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) email.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            str = email.subSequence(i, length + 1).toString();
        } else {
            str = null;
        }
        if (str != null && !ValidationUtils.isValidEmailAddress(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda82(email, 21), 7, (Object) null);
            return false;
        }
        brazeUser = this;
        try {
            JobKt.launch$default(ne.a, null, null, new v2(brazeUser, str, null), 3);
            return true;
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(email, 22), 4, (Object) null);
            return false;
        }
    }

    public final boolean setEmailNotificationSubscriptionType(NotificationSubscriptionType emailNotificationSubscriptionType) {
        emailNotificationSubscriptionType.getClass();
        try {
            JobKt.launch$default(ne.a, null, null, new w2(this, emailNotificationSubscriptionType, null), 3);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new BrazeUser$$ExternalSyntheticLambda19(emailNotificationSubscriptionType, 0), 4, (Object) null);
            return false;
        }
    }

    public final boolean setFirstName(String firstName) {
        BrazeUser brazeUser;
        if (firstName != null) {
            try {
                if (StringsKt.isBlank(firstName)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(20), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                e = e;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(firstName, 7), 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            JobKt.launch$default(ne.a, null, null, new x2(brazeUser, firstName, null), 3);
            return true;
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(firstName, 7), 4, (Object) null);
            return false;
        }
    }

    public final boolean setGender(Gender gender) {
        try {
            JobKt.launch$default(ne.a, null, null, new y2(this, gender, null), 3);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new yf$$ExternalSyntheticLambda2(gender, 5), 4, (Object) null);
            return false;
        }
    }

    public final boolean setHomeCity(String homeCity) {
        BrazeUser brazeUser;
        if (homeCity != null) {
            try {
                if (StringsKt.isBlank(homeCity)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(23), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                e = e;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(homeCity, 11), 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            JobKt.launch$default(ne.a, null, null, new z2(brazeUser, homeCity, null), 3);
            return true;
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(homeCity, 11), 4, (Object) null);
            return false;
        }
    }

    public final boolean setLanguage(String language) {
        BrazeUser brazeUser;
        if (language != null) {
            try {
                if (StringsKt.isBlank(language)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(19), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                e = e;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(language, 6), 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            JobKt.launch$default(ne.a, null, null, new a3(brazeUser, language, null), 3);
            return true;
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(language, 6), 4, (Object) null);
            return false;
        }
    }

    public final boolean setLastName(String lastName) {
        BrazeUser brazeUser;
        if (lastName != null) {
            try {
                if (StringsKt.isBlank(lastName)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(22), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                e = e;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(lastName, 9), 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            JobKt.launch$default(ne.a, null, null, new b3(brazeUser, lastName, null), 3);
            return true;
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(lastName, 9), 4, (Object) null);
            return false;
        }
    }

    public final boolean setLineId(String lineId) {
        BrazeUser brazeUser;
        String str;
        if (lineId != null) {
            try {
                if (StringsKt.isBlank(lineId)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(24), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                e = e;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(lineId, 13), 4, (Object) null);
                return false;
            }
        }
        if (lineId != null) {
            int length = lineId.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) lineId.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            str = lineId.subSequence(i, length + 1).toString();
        } else {
            str = null;
        }
        if (str != null && !ValidationUtils.isValidLineId(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda82(str, 12), 6, (Object) null);
            return false;
        }
        brazeUser = this;
        try {
            JobKt.launch$default(ne.a, null, null, new c3(brazeUser, str, null), 3);
            return true;
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(lineId, 13), 4, (Object) null);
            return false;
        }
    }

    public final void setLocationCustomAttribute(String key, final double latitude, final double longitude) {
        String str;
        BrazeUser brazeUser;
        BrazeUser brazeUser2 = this;
        key.getClass();
        try {
            str = key;
        } catch (Exception e) {
            e = e;
            str = key;
        }
        try {
            try {
            } catch (Exception e2) {
                e = e2;
                brazeUser = this;
            }
        } catch (Exception e3) {
            e = e3;
            brazeUser = brazeUser2;
            Exception exc = e;
            BrazeUser brazeUser3 = brazeUser;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser3, BrazeLogger.Priority.W, (Throwable) exc, false, (Function0) new j1$$ExternalSyntheticLambda10(str, latitude, longitude, 1), 4, (Object) null);
        }
        if (!com.braze.support.c.a(str, brazeUser2.serverConfigStorageProvider.e())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser2, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(18), 6, (Object) null);
            return;
        }
        if (ValidationUtils.isValidLocation(latitude, longitude)) {
            brazeUser = this;
            try {
                y8 a = k1.g.a(ValidationUtils.ensureBrazeFieldLength(str), latitude, longitude);
                if (a != null) {
                    ((e2) brazeUser.brazeManager).a(a);
                    return;
                }
                return;
            } catch (Exception e4) {
                e = e4;
            }
        } else {
            try {
                brazeUser2 = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser2, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.BrazeUser$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String locationCustomAttribute$lambda$1;
                        locationCustomAttribute$lambda$1 = BrazeUser.setLocationCustomAttribute$lambda$1(latitude, longitude);
                        return locationCustomAttribute$lambda$1;
                    }
                }, 6, (Object) null);
                return;
            } catch (Exception e5) {
                e = e5;
                brazeUser = this;
            }
        }
        Exception exc2 = e;
        BrazeUser brazeUser32 = brazeUser;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser32, BrazeLogger.Priority.W, (Throwable) exc2, false, (Function0) new j1$$ExternalSyntheticLambda10(str, latitude, longitude, 1), 4, (Object) null);
    }

    public final boolean setPhoneNumber(String phoneNumber) {
        BrazeUser brazeUser;
        String str;
        int i = 0;
        if (phoneNumber != null) {
            try {
                if (StringsKt.isBlank(phoneNumber)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda0(i), 6, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                e = e;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(phoneNumber, 10), 4, (Object) null);
                return false;
            }
        }
        if (phoneNumber != null) {
            int length = phoneNumber.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = Intrinsics.compare((int) phoneNumber.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            str = phoneNumber.subSequence(i2, length + 1).toString();
        } else {
            str = null;
        }
        if (str != null && !ValidationUtils.isValidPhoneNumber(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda82(str, 5), 6, (Object) null);
            return false;
        }
        brazeUser = this;
        try {
            JobKt.launch$default(ne.a, null, null, new d3(brazeUser, str, null), 3);
            return true;
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(phoneNumber, 10), 4, (Object) null);
            return false;
        }
    }

    public final boolean setPushNotificationSubscriptionType(NotificationSubscriptionType pushNotificationSubscriptionType) {
        pushNotificationSubscriptionType.getClass();
        int i = 1;
        try {
            JobKt.launch$default(ne.a, null, null, new e3(this, pushNotificationSubscriptionType, null), 3);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new BrazeUser$$ExternalSyntheticLambda19(pushNotificationSubscriptionType, i), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, int value) {
        BrazeUser brazeUser;
        String str;
        key.getClass();
        try {
            brazeUser = this;
            str = key;
        } catch (Exception e) {
            e = e;
            brazeUser = this;
            str = key;
        }
        try {
            return setCustomAttribute$default(brazeUser, str, Integer.valueOf(value), false, 4, null);
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(str, 17), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, String value) {
        key.getClass();
        value.getClass();
        try {
            return setCustomAttribute$default(this, key, value, false, 4, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(key, 15), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, double value) {
        BrazeUser brazeUser;
        String str;
        key.getClass();
        try {
            brazeUser = this;
            str = key;
        } catch (Exception e) {
            e = e;
            brazeUser = this;
            str = key;
        }
        try {
            return setCustomAttribute$default(brazeUser, str, Double.valueOf(value), false, 4, null);
        } catch (Exception e2) {
            e = e2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new Braze$$ExternalSyntheticLambda82(str, 16), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, JSONObject value, boolean merge) {
        key.getClass();
        value.getClass();
        try {
            return setCustomAttribute(key, value, merge);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new j1$$ExternalSyntheticLambda21(key, value, 1), 4, (Object) null);
            return false;
        }
    }
}
