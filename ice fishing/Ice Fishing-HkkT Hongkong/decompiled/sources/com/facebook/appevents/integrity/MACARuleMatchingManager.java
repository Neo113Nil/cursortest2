package com.facebook.appevents.integrity;

import android.os.Build;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MACARuleMatchingManager.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J&\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007J\b\u0010\u001c\u001a\u00020\fH\u0002J\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\""}, d2 = {"Lcom/facebook/appevents/integrity/MACARuleMatchingManager;", "", "()V", "MACARules", "Lorg/json/JSONArray;", "enabled", "", "keys", "", "", "[Ljava/lang/String;", "enable", "", "generateInfo", NativeProtocol.WEB_DIALOG_PARAMS, "Landroid/os/Bundle;", NotificationCompat.CATEGORY_EVENT, "getKey", "logic", "Lorg/json/JSONObject;", "getMatchPropertyIDs", "getStringArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "jsonArray", "isMatchCCRule", "ruleString", "data", "loadMACARules", "processParameters", "removeGeneratedInfo", "stringComparison", "variable", "values", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MACARuleMatchingManager {
    private static JSONArray MACARules;
    private static boolean enabled;
    public static final MACARuleMatchingManager INSTANCE = new MACARuleMatchingManager();
    private static String[] keys = {NotificationCompat.CATEGORY_EVENT, "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    private MACARuleMatchingManager() {
    }

    @JvmStatic
    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            INSTANCE.loadMACARules();
            if (MACARules != null) {
                enabled = true;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    private final void loadMACARules() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            MACARules = queryAppSettings.getMACARuleMatchingSetting();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @JvmStatic
    public static final String getKey(JSONObject logic) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(logic, "logic");
            Iterator<String> keys2 = logic.keys();
            if (keys2.hasNext()) {
                return keys2.next();
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02bb A[Catch: all -> 0x03f8, TryCatch #0 {all -> 0x03f8, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0065, B:25:0x006d, B:28:0x007a, B:32:0x0084, B:34:0x008a, B:36:0x0095, B:38:0x00a4, B:39:0x00a9, B:40:0x00aa, B:41:0x00af, B:42:0x00b0, B:46:0x00ba, B:52:0x00ca, B:58:0x0260, B:60:0x0266, B:63:0x0270, B:64:0x0274, B:66:0x027a, B:68:0x0282, B:70:0x0291, B:77:0x02a2, B:78:0x02a7, B:80:0x02a8, B:81:0x02ad, B:83:0x00d4, B:87:0x00de, B:89:0x00e4, B:91:0x00f1, B:93:0x0102, B:94:0x0107, B:95:0x0108, B:96:0x010d, B:97:0x010e, B:103:0x02bb, B:105:0x02c1, B:109:0x02cc, B:110:0x02d0, B:112:0x02d6, B:114:0x02de, B:116:0x02ed, B:122:0x02fe, B:123:0x0303, B:125:0x0304, B:126:0x0309, B:129:0x0118, B:133:0x0122, B:135:0x0128, B:137:0x0133, B:139:0x0142, B:140:0x0147, B:141:0x0148, B:142:0x014d, B:143:0x014e, B:147:0x01fc, B:150:0x0158, B:154:0x01e1, B:158:0x0162, B:162:0x01bc, B:166:0x016c, B:170:0x0176, B:174:0x0242, B:178:0x0180, B:182:0x018a, B:188:0x03b3, B:190:0x0194, B:194:0x0213, B:198:0x019e, B:202:0x01a8, B:206:0x022e, B:208:0x01b2, B:212:0x01cd, B:216:0x01d7, B:220:0x01f2, B:224:0x0209, B:228:0x0224, B:232:0x0238, B:236:0x0253, B:240:0x02ae, B:244:0x030a, B:248:0x0314, B:250:0x031a, B:252:0x0325, B:256:0x0336, B:257:0x033b, B:258:0x033c, B:259:0x0341, B:260:0x0342, B:264:0x034c, B:266:0x035a, B:272:0x039e, B:274:0x0364, B:278:0x036e, B:280:0x037f, B:284:0x0389, B:286:0x0392, B:290:0x03a7, B:294:0x03bc, B:298:0x03c5, B:300:0x03cb, B:302:0x03d8, B:306:0x03eb, B:307:0x03f0, B:308:0x03f1, B:309:0x03f6, B:311:0x0052), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b3 A[Catch: all -> 0x03f8, TryCatch #0 {all -> 0x03f8, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0065, B:25:0x006d, B:28:0x007a, B:32:0x0084, B:34:0x008a, B:36:0x0095, B:38:0x00a4, B:39:0x00a9, B:40:0x00aa, B:41:0x00af, B:42:0x00b0, B:46:0x00ba, B:52:0x00ca, B:58:0x0260, B:60:0x0266, B:63:0x0270, B:64:0x0274, B:66:0x027a, B:68:0x0282, B:70:0x0291, B:77:0x02a2, B:78:0x02a7, B:80:0x02a8, B:81:0x02ad, B:83:0x00d4, B:87:0x00de, B:89:0x00e4, B:91:0x00f1, B:93:0x0102, B:94:0x0107, B:95:0x0108, B:96:0x010d, B:97:0x010e, B:103:0x02bb, B:105:0x02c1, B:109:0x02cc, B:110:0x02d0, B:112:0x02d6, B:114:0x02de, B:116:0x02ed, B:122:0x02fe, B:123:0x0303, B:125:0x0304, B:126:0x0309, B:129:0x0118, B:133:0x0122, B:135:0x0128, B:137:0x0133, B:139:0x0142, B:140:0x0147, B:141:0x0148, B:142:0x014d, B:143:0x014e, B:147:0x01fc, B:150:0x0158, B:154:0x01e1, B:158:0x0162, B:162:0x01bc, B:166:0x016c, B:170:0x0176, B:174:0x0242, B:178:0x0180, B:182:0x018a, B:188:0x03b3, B:190:0x0194, B:194:0x0213, B:198:0x019e, B:202:0x01a8, B:206:0x022e, B:208:0x01b2, B:212:0x01cd, B:216:0x01d7, B:220:0x01f2, B:224:0x0209, B:228:0x0224, B:232:0x0238, B:236:0x0253, B:240:0x02ae, B:244:0x030a, B:248:0x0314, B:250:0x031a, B:252:0x0325, B:256:0x0336, B:257:0x033b, B:258:0x033c, B:259:0x0341, B:260:0x0342, B:264:0x034c, B:266:0x035a, B:272:0x039e, B:274:0x0364, B:278:0x036e, B:280:0x037f, B:284:0x0389, B:286:0x0392, B:290:0x03a7, B:294:0x03bc, B:298:0x03c5, B:300:0x03cb, B:302:0x03d8, B:306:0x03eb, B:307:0x03f0, B:308:0x03f1, B:309:0x03f6, B:311:0x0052), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x039d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x039e A[Catch: all -> 0x03f8, TryCatch #0 {all -> 0x03f8, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0065, B:25:0x006d, B:28:0x007a, B:32:0x0084, B:34:0x008a, B:36:0x0095, B:38:0x00a4, B:39:0x00a9, B:40:0x00aa, B:41:0x00af, B:42:0x00b0, B:46:0x00ba, B:52:0x00ca, B:58:0x0260, B:60:0x0266, B:63:0x0270, B:64:0x0274, B:66:0x027a, B:68:0x0282, B:70:0x0291, B:77:0x02a2, B:78:0x02a7, B:80:0x02a8, B:81:0x02ad, B:83:0x00d4, B:87:0x00de, B:89:0x00e4, B:91:0x00f1, B:93:0x0102, B:94:0x0107, B:95:0x0108, B:96:0x010d, B:97:0x010e, B:103:0x02bb, B:105:0x02c1, B:109:0x02cc, B:110:0x02d0, B:112:0x02d6, B:114:0x02de, B:116:0x02ed, B:122:0x02fe, B:123:0x0303, B:125:0x0304, B:126:0x0309, B:129:0x0118, B:133:0x0122, B:135:0x0128, B:137:0x0133, B:139:0x0142, B:140:0x0147, B:141:0x0148, B:142:0x014d, B:143:0x014e, B:147:0x01fc, B:150:0x0158, B:154:0x01e1, B:158:0x0162, B:162:0x01bc, B:166:0x016c, B:170:0x0176, B:174:0x0242, B:178:0x0180, B:182:0x018a, B:188:0x03b3, B:190:0x0194, B:194:0x0213, B:198:0x019e, B:202:0x01a8, B:206:0x022e, B:208:0x01b2, B:212:0x01cd, B:216:0x01d7, B:220:0x01f2, B:224:0x0209, B:228:0x0224, B:232:0x0238, B:236:0x0253, B:240:0x02ae, B:244:0x030a, B:248:0x0314, B:250:0x031a, B:252:0x0325, B:256:0x0336, B:257:0x033b, B:258:0x033c, B:259:0x0341, B:260:0x0342, B:264:0x034c, B:266:0x035a, B:272:0x039e, B:274:0x0364, B:278:0x036e, B:280:0x037f, B:284:0x0389, B:286:0x0392, B:290:0x03a7, B:294:0x03bc, B:298:0x03c5, B:300:0x03cb, B:302:0x03d8, B:306:0x03eb, B:307:0x03f0, B:308:0x03f1, B:309:0x03f6, B:311:0x0052), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0260 A[Catch: all -> 0x03f8, TryCatch #0 {all -> 0x03f8, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0065, B:25:0x006d, B:28:0x007a, B:32:0x0084, B:34:0x008a, B:36:0x0095, B:38:0x00a4, B:39:0x00a9, B:40:0x00aa, B:41:0x00af, B:42:0x00b0, B:46:0x00ba, B:52:0x00ca, B:58:0x0260, B:60:0x0266, B:63:0x0270, B:64:0x0274, B:66:0x027a, B:68:0x0282, B:70:0x0291, B:77:0x02a2, B:78:0x02a7, B:80:0x02a8, B:81:0x02ad, B:83:0x00d4, B:87:0x00de, B:89:0x00e4, B:91:0x00f1, B:93:0x0102, B:94:0x0107, B:95:0x0108, B:96:0x010d, B:97:0x010e, B:103:0x02bb, B:105:0x02c1, B:109:0x02cc, B:110:0x02d0, B:112:0x02d6, B:114:0x02de, B:116:0x02ed, B:122:0x02fe, B:123:0x0303, B:125:0x0304, B:126:0x0309, B:129:0x0118, B:133:0x0122, B:135:0x0128, B:137:0x0133, B:139:0x0142, B:140:0x0147, B:141:0x0148, B:142:0x014d, B:143:0x014e, B:147:0x01fc, B:150:0x0158, B:154:0x01e1, B:158:0x0162, B:162:0x01bc, B:166:0x016c, B:170:0x0176, B:174:0x0242, B:178:0x0180, B:182:0x018a, B:188:0x03b3, B:190:0x0194, B:194:0x0213, B:198:0x019e, B:202:0x01a8, B:206:0x022e, B:208:0x01b2, B:212:0x01cd, B:216:0x01d7, B:220:0x01f2, B:224:0x0209, B:228:0x0224, B:232:0x0238, B:236:0x0253, B:240:0x02ae, B:244:0x030a, B:248:0x0314, B:250:0x031a, B:252:0x0325, B:256:0x0336, B:257:0x033b, B:258:0x033c, B:259:0x0341, B:260:0x0342, B:264:0x034c, B:266:0x035a, B:272:0x039e, B:274:0x0364, B:278:0x036e, B:280:0x037f, B:284:0x0389, B:286:0x0392, B:290:0x03a7, B:294:0x03bc, B:298:0x03c5, B:300:0x03cb, B:302:0x03d8, B:306:0x03eb, B:307:0x03f0, B:308:0x03f1, B:309:0x03f6, B:311:0x0052), top: B:5:0x000a }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean stringComparison(String variable, JSONObject values, Bundle data) {
        Object obj;
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(variable, "variable");
            Intrinsics.checkNotNullParameter(values, "values");
            String key = getKey(values);
            if (key == null) {
                return false;
            }
            String obj2 = values.get(key).toString();
            ArrayList<String> stringArrayList = getStringArrayList(values.optJSONArray(key));
            Boolean bool = null;
            if (Intrinsics.areEqual(key, "exists")) {
                if (data != null) {
                    bool = Boolean.valueOf(data.containsKey(variable));
                }
                return Intrinsics.areEqual(bool, Boolean.valueOf(Boolean.parseBoolean(obj2)));
            }
            if (data == null) {
                obj = null;
            } else {
                String lowerCase = variable.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                obj = data.get(lowerCase);
            }
            if (obj == null) {
                obj = data == null ? null : data.get(variable);
                if (obj == null) {
                    return false;
                }
            }
            switch (key.hashCode()) {
                case -1729128927:
                    if (!key.equals("i_not_contains")) {
                        return false;
                    }
                    String obj3 = obj.toString();
                    if (obj3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase2 = obj3.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    String str = lowerCase2;
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase3 = obj2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return !StringsKt.contains$default((CharSequence) str, (CharSequence) lowerCase3, false, 2, (Object) null);
                case -1179774633:
                    if (!key.equals("is_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    return stringArrayList.contains(obj.toString());
                case -1039699439:
                    if (!key.equals("not_in")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    return stringArrayList.contains(obj.toString());
                case -969266188:
                    if (key.equals("starts_with")) {
                        return StringsKt.startsWith$default(obj.toString(), obj2, false, 2, (Object) null);
                    }
                    return false;
                case -966353971:
                    if (key.equals("regex_match")) {
                        return new Regex(obj2).matches(obj.toString());
                    }
                    return false;
                case -665609109:
                    if (!key.equals("is_not_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case -567445985:
                    if (key.equals("contains")) {
                        return StringsKt.contains$default((CharSequence) obj.toString(), (CharSequence) obj2, false, 2, (Object) null);
                    }
                    return false;
                case -327990090:
                    if (!key.equals("i_str_neq")) {
                        return false;
                    }
                    String obj4 = obj.toString();
                    if (obj4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase4 = obj4.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase5 = obj2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase5, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (Intrinsics.areEqual(lowerCase4, lowerCase5)) {
                        return false;
                    }
                case -159812115:
                    if (!key.equals("i_is_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    ArrayList<String> arrayList = stringArrayList;
                    if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                        return false;
                    }
                    for (String str2 : arrayList) {
                        if (str2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase6 = str2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase6, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        String obj5 = obj.toString();
                        if (obj5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase7 = obj5.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase7, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        if (Intrinsics.areEqual(lowerCase6, lowerCase7)) {
                        }
                    }
                    return false;
                case -92753547:
                    if (!key.equals("i_str_not_in")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    ArrayList<String> arrayList2 = stringArrayList;
                    if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                        for (String str3 : arrayList2) {
                            if (str3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            String lowerCase8 = str3.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase8, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            String obj6 = obj.toString();
                            if (obj6 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            String lowerCase9 = obj6.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase9, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            if (Intrinsics.areEqual(lowerCase8, lowerCase9)) {
                                return false;
                            }
                        }
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (!key.equals("<")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                        return false;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (!key.equals("=")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), obj2);
                case 62:
                    if (!key.equals(">")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                        return false;
                    }
                case 1084:
                    if (!key.equals("!=")) {
                        return false;
                    }
                    if (Intrinsics.areEqual(obj.toString(), obj2)) {
                        return false;
                    }
                case 1921:
                    if (!key.equals("<=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                        return false;
                    }
                case 1952:
                    if (!key.equals("==")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), obj2);
                case 1983:
                    if (!key.equals(">=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                        return false;
                    }
                case 3244:
                    if (!key.equals("eq")) {
                        return false;
                    }
                    return Intrinsics.areEqual(obj.toString(), obj2);
                case 3294:
                    if (!key.equals(UserDataStore.GENDER)) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                    }
                    break;
                case 3309:
                    if (!key.equals("gt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                    }
                    break;
                case 3365:
                    if (!key.equals("in")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case 3449:
                    if (!key.equals("le")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                    }
                    break;
                case 3464:
                    if (!key.equals("lt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                    }
                    break;
                case 3511:
                    if (!key.equals("ne")) {
                        return false;
                    }
                    if (Intrinsics.areEqual(obj.toString(), obj2)) {
                    }
                case 102680:
                    if (!key.equals("gte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(obj2)) {
                    }
                    break;
                case 107485:
                    if (!key.equals("lte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(obj2)) {
                    }
                    break;
                case 108954:
                    if (!key.equals("neq")) {
                        return false;
                    }
                    if (Intrinsics.areEqual(obj.toString(), obj2)) {
                    }
                case 127966736:
                    if (!key.equals("i_str_eq")) {
                        return false;
                    }
                    String obj7 = obj.toString();
                    if (obj7 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase10 = obj7.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase10, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase11 = obj2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase11, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return Intrinsics.areEqual(lowerCase10, lowerCase11);
                case 127966857:
                    if (!key.equals("i_str_in")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case 363990325:
                    if (!key.equals("i_contains")) {
                        return false;
                    }
                    String obj8 = obj.toString();
                    if (obj8 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase12 = obj8.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase12, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    String str4 = lowerCase12;
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase13 = obj2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase13, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return StringsKt.contains$default((CharSequence) str4, (CharSequence) lowerCase13, false, 2, (Object) null);
                case 1091487233:
                    if (!key.equals("i_is_not_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case 1918401035:
                    if (!key.equals("not_contains") || StringsKt.contains$default((CharSequence) obj.toString(), (CharSequence) obj2, false, 2, (Object) null)) {
                        return false;
                    }
                case 1961112862:
                    if (!key.equals("i_starts_with")) {
                        return false;
                    }
                    String obj9 = obj.toString();
                    if (obj9 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase14 = obj9.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase14, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase15 = obj2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase15, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return StringsKt.startsWith$default(lowerCase14, lowerCase15, false, 2, (Object) null);
                default:
                    return false;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return false;
        }
    }

    @JvmStatic
    public static final ArrayList<String> getStringArrayList(JSONArray jsonArray) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class) || jsonArray == null) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            int length = jsonArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    arrayList.add(jsonArray.get(i).toString());
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    @JvmStatic
    public static final boolean isMatchCCRule(String ruleString, Bundle data) {
        int length;
        if (!CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class) && ruleString != null && data != null) {
            try {
                JSONObject jSONObject = new JSONObject(ruleString);
                String key = getKey(jSONObject);
                if (key == null) {
                    return false;
                }
                Object obj = jSONObject.get(key);
                int hashCode = key.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && key.equals("not")) {
                            return !isMatchCCRule(obj.toString(), data);
                        }
                    } else if (key.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length2 = jSONArray.length();
                        if (length2 > 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                if (!isMatchCCRule(jSONArray.get(i).toString(), data)) {
                                    return false;
                                }
                                if (i2 >= length2) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        return true;
                    }
                } else if (key.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            if (isMatchCCRule(jSONArray2.get(i3).toString(), data)) {
                                return true;
                            }
                            if (i4 >= length) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return stringComparison(key, jSONObject2, data);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            }
        }
        return false;
    }

    @JvmStatic
    public static final String getMatchPropertyIDs(Bundle params) {
        String optString;
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = MACARules;
            if (jSONArray == null) {
                return "[]";
            }
            Integer valueOf = jSONArray == null ? null : Integer.valueOf(jSONArray.length());
            if (valueOf != null && valueOf.intValue() == 0) {
                return "[]";
            }
            JSONArray jSONArray2 = MACARules;
            if (jSONArray2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    String optString2 = jSONArray2.optString(i);
                    if (optString2 != null) {
                        JSONObject jSONObject = new JSONObject(optString2);
                        long optLong = jSONObject.optLong("id");
                        if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && isMatchCCRule(optString, params)) {
                            arrayList.add(Long.valueOf(optLong));
                        }
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            String jSONArray3 = new JSONArray((Collection) arrayList).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray3, "JSONArray(res).toString()");
            return jSONArray3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
            return null;
        }
    }

    @JvmStatic
    public static final void processParameters(Bundle params, String event) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (!enabled || params == null) {
                return;
            }
            try {
                generateInfo(params, event);
                params.putString("_audiencePropertyIds", getMatchPropertyIDs(params));
                params.putString("cs_maca", AppEventsConstants.EVENT_PARAM_VALUE_YES);
                removeGeneratedInfo(params);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:6:0x000d, B:10:0x0032, B:13:0x004d, B:16:0x0063, B:19:0x0079, B:22:0x0093, B:26:0x0046, B:29:0x002b), top: B:5:0x000d }] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void generateInfo(Bundle params, String event) {
        String language;
        Locale locale;
        String country;
        String versionName;
        String str;
        String versionName2;
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(event, "event");
            params.putString(NotificationCompat.CATEGORY_EVENT, event);
            StringBuilder sb = new StringBuilder();
            Locale locale2 = Utility.INSTANCE.getLocale();
            String str2 = "";
            if (locale2 != null) {
                language = locale2.getLanguage();
                if (language == null) {
                }
                StringBuilder append = sb.append(language).append('_');
                locale = Utility.INSTANCE.getLocale();
                if (locale != null) {
                    country = locale.getCountry();
                    if (country != null) {
                    }
                    params.putString("_locale", append.append(country).toString());
                    versionName = Utility.INSTANCE.getVersionName();
                    if (versionName == null) {
                        versionName = "";
                    }
                    params.putString("_appVersion", versionName);
                    params.putString("_deviceOS", "ANDROID");
                    params.putString("_platform", "mobile");
                    str = Build.MODEL;
                    if (str == null) {
                        str = "";
                    }
                    params.putString("_deviceModel", str);
                    FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                    params.putString("_nativeAppID", FacebookSdk.getApplicationId());
                    versionName2 = Utility.INSTANCE.getVersionName();
                    if (versionName2 != null) {
                        str2 = versionName2;
                    }
                    params.putString("_nativeAppShortVersion", str2);
                    params.putString("_timezone", Utility.INSTANCE.getDeviceTimeZoneName());
                    params.putString("_carrier", Utility.INSTANCE.getCarrierName());
                    params.putString("_deviceOSTypeName", "ANDROID");
                    params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
                    params.putLong("_remainingDiskGB", Utility.INSTANCE.getAvailableExternalStorageGB());
                }
                country = "";
                params.putString("_locale", append.append(country).toString());
                versionName = Utility.INSTANCE.getVersionName();
                if (versionName == null) {
                }
                params.putString("_appVersion", versionName);
                params.putString("_deviceOS", "ANDROID");
                params.putString("_platform", "mobile");
                str = Build.MODEL;
                if (str == null) {
                }
                params.putString("_deviceModel", str);
                FacebookSdk facebookSdk2 = FacebookSdk.INSTANCE;
                params.putString("_nativeAppID", FacebookSdk.getApplicationId());
                versionName2 = Utility.INSTANCE.getVersionName();
                if (versionName2 != null) {
                }
                params.putString("_nativeAppShortVersion", str2);
                params.putString("_timezone", Utility.INSTANCE.getDeviceTimeZoneName());
                params.putString("_carrier", Utility.INSTANCE.getCarrierName());
                params.putString("_deviceOSTypeName", "ANDROID");
                params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
                params.putLong("_remainingDiskGB", Utility.INSTANCE.getAvailableExternalStorageGB());
            }
            language = "";
            StringBuilder append2 = sb.append(language).append('_');
            locale = Utility.INSTANCE.getLocale();
            if (locale != null) {
            }
            country = "";
            params.putString("_locale", append2.append(country).toString());
            versionName = Utility.INSTANCE.getVersionName();
            if (versionName == null) {
            }
            params.putString("_appVersion", versionName);
            params.putString("_deviceOS", "ANDROID");
            params.putString("_platform", "mobile");
            str = Build.MODEL;
            if (str == null) {
            }
            params.putString("_deviceModel", str);
            FacebookSdk facebookSdk22 = FacebookSdk.INSTANCE;
            params.putString("_nativeAppID", FacebookSdk.getApplicationId());
            versionName2 = Utility.INSTANCE.getVersionName();
            if (versionName2 != null) {
            }
            params.putString("_nativeAppShortVersion", str2);
            params.putString("_timezone", Utility.INSTANCE.getDeviceTimeZoneName());
            params.putString("_carrier", Utility.INSTANCE.getCarrierName());
            params.putString("_deviceOSTypeName", "ANDROID");
            params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            params.putLong("_remainingDiskGB", Utility.INSTANCE.getAvailableExternalStorageGB());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }

    @JvmStatic
    public static final void removeGeneratedInfo(Bundle params) {
        if (CrashShieldHandler.isObjectCrashing(MACARuleMatchingManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            String[] strArr = keys;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                params.remove(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MACARuleMatchingManager.class);
        }
    }
}
