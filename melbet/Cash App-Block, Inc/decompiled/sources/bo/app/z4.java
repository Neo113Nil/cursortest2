package bo.app;

import android.content.Context;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z4 extends b {
    public static final y4 e = new y4();
    public final BrazeConfigurationProvider b;
    public final a5 c;
    public x4 d;

    public z4(Context context, String str, String str2) {
        context.getClass();
        this.b = new BrazeConfigurationProvider(context);
        this.c = new a5(context, str, str2);
    }

    public static final String d() {
        return "Caught exception confirming and unlocking device cache.";
    }

    public static final String f() {
        return "Sending full device on next export but keeping cache intact.";
    }

    public static final String h() {
        return "Caught exception confirming and unlocking JSON objects.";
    }

    public static final String i() {
        return "Failed to generate diff between the cached and live device. Returning the live device.";
    }

    public static final String j() {
        return "Remote Notification Enabled changed to true. Updating user subscription.";
    }

    @Override // bo.app.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(x4 x4Var, boolean z) {
        x4Var.getClass();
        if (z) {
            try {
                a5 a5Var = this.c;
                int i = a5.$r8$clinit;
                String str = "{}";
                a5Var.getClass();
                DataStoreKey dataStoreKey = DataStoreKey.CACHED_DEVICE;
                String readString = a5Var.readString(dataStoreKey, "{}");
                if (readString != null) {
                    str = readString;
                }
                String jSONObject = JsonUtils.mergeJsonObjects(new JSONObject(str), x4Var.getJsonKey()).toString();
                jSONObject.getClass();
                this.c.batchUpdate(MapsKt__MapsKt.mapOf(new Pair(dataStoreKey.getKey(), jSONObject), new Pair(DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT.getKey(), Boolean.FALSE), new Pair(DataStoreKey.DEVICE_CACHE_LAST_OS_VERSION.getKey(), Integer.valueOf(Build.VERSION.SDK_INT))), EmptySet.INSTANCE);
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new z$$ExternalSyntheticLambda0(24), 4, (Object) null);
            }
        }
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(23), 6, (Object) null);
        this.c.writeData(DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT, Boolean.TRUE);
    }

    @Override // bo.app.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final x4 c() {
        JSONObject a;
        JSONObject jSONObject = new JSONObject();
        x4 x4Var = this.d;
        JSONObject jsonKey = x4Var != null ? x4Var.getJsonKey() : new JSONObject();
        try {
            a5 a5Var = this.c;
            int i = a5.$r8$clinit;
            String str = "{}";
            a5Var.getClass();
            String readString = a5Var.readString(DataStoreKey.CACHED_DEVICE, "{}");
            if (readString != null) {
                str = readString;
            }
            jSONObject = new JSONObject(str);
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new z$$ExternalSyntheticLambda0(25), 4, (Object) null);
        }
        a5 a5Var2 = this.c;
        int i2 = Build.VERSION.SDK_INT;
        a5Var2.getClass();
        Integer readInt = a5Var2.readInt(DataStoreKey.DEVICE_CACHE_LAST_OS_VERSION, Integer.valueOf(i2));
        int intValue = readInt != null ? readInt.intValue() : i2;
        y4 y4Var = e;
        boolean a2 = y4Var.a(jSONObject, jsonKey, intValue, i2);
        a5 a5Var3 = this.c;
        a5Var3.getClass();
        Boolean readBoolean = a5Var3.readBoolean(DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT, Boolean.FALSE);
        boolean booleanValue = readBoolean != null ? readBoolean.booleanValue() : false;
        if (booleanValue || a2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z4$$ExternalSyntheticLambda3(0, booleanValue, a2), 7, (Object) null);
            a = y4Var.a(new JSONObject(), jsonKey);
        } else {
            a = y4Var.a(jSONObject, jsonKey);
        }
        if (a == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(26), 7, (Object) null);
            return this.d;
        }
        BrazeConfigurationProvider brazeConfigurationProvider = this.b;
        brazeConfigurationProvider.getClass();
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str8 = null;
        Boolean bool3 = null;
        for (DeviceKey deviceKey : DeviceKey.getEntries()) {
            String key = deviceKey.getKey();
            switch (v4.a[deviceKey.ordinal()]) {
                case 1:
                    str7 = JsonUtils.getOptionalString(a, key);
                    break;
                case 2:
                    str3 = JsonUtils.getOptionalString(a, key);
                    break;
                case 3:
                    str2 = JsonUtils.getOptionalString(a, key);
                    break;
                case 4:
                    str6 = JsonUtils.getOptionalString(a, key);
                    break;
                case 5:
                    String optionalString = JsonUtils.getOptionalString(a, key);
                    if (optionalString != null && !StringsKt.isBlank(optionalString)) {
                        str4 = optionalString;
                        break;
                    }
                    break;
                case 6:
                    str5 = JsonUtils.getOptionalString(a, key);
                    break;
                case 7:
                    if (a.has(key)) {
                        bool = Boolean.valueOf(a.optBoolean(key, true));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (a.has(key)) {
                        bool2 = Boolean.valueOf(a.optBoolean(key, false));
                        break;
                    } else {
                        break;
                    }
                case 9:
                    str8 = JsonUtils.getOptionalString(a, key);
                    break;
                case 10:
                    if (a.has(key)) {
                        bool3 = Boolean.valueOf(a.optBoolean(key));
                        break;
                    } else {
                        break;
                    }
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
        }
        x4 x4Var2 = new x4(brazeConfigurationProvider, str2, str3, str4, str5, str6, str7, bool, bool2, str8, bool3);
        if (a2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(27), 6, (Object) null);
            x4Var2.l = true;
        }
        return x4Var2;
    }

    public static final String a(boolean z, boolean z2) {
        return "Exporting the full device due to either: shouldSendFullDeviceOnNextExport: " + z + ", shouldReportPushPermissionsAsGranted: " + z2;
    }
}
