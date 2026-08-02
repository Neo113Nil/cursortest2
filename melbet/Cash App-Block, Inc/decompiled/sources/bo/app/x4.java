package bo.app;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class x4 implements IPutIntoJson, l9 {
    public static final w4 n = new w4();
    public final BrazeConfigurationProvider a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final String j;
    public final Boolean k;
    public boolean l;
    public boolean m;

    public x4(BrazeConfigurationProvider brazeConfigurationProvider, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Boolean bool3) {
        brazeConfigurationProvider.getClass();
        this.a = brazeConfigurationProvider;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = bool;
        this.i = bool2;
        this.j = str7;
        this.k = bool3;
        this.m = true;
    }

    public static final String b() {
        return "Caught exception creating device Json.";
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getValue() {
        JSONObject jSONObject = new JSONObject();
        try {
            w4 w4Var = n;
            w4Var.a(this.a, jSONObject, DeviceKey.ANDROID_VERSION, this.b);
            w4Var.a(this.a, jSONObject, DeviceKey.CARRIER, this.c);
            w4Var.a(this.a, jSONObject, DeviceKey.BRAND, this.d);
            w4Var.a(this.a, jSONObject, DeviceKey.MODEL, this.e);
            w4Var.a(this.a, jSONObject, DeviceKey.LOCALE, this.f);
            if (this.m) {
                w4Var.a(this.a, jSONObject, DeviceKey.NOTIFICATIONS_ENABLED, this.h);
            }
            w4Var.a(this.a, jSONObject, DeviceKey.IS_BACKGROUND_RESTRICTED, this.i);
            w4Var.a(this.a, jSONObject, DeviceKey.GOOGLE_ADVERTISING_ID, this.j);
            Boolean bool = this.k;
            if (bool != null) {
                w4Var.a(this.a, jSONObject, DeviceKey.AD_TRACKING_ENABLED, bool);
            }
            String str = this.g;
            if (str != null && !StringsKt.isBlank(str)) {
                w4Var.a(this.a, jSONObject, DeviceKey.TIMEZONE, this.g);
            }
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new z$$ExternalSyntheticLambda0(2), 4, (Object) null);
            return jSONObject;
        }
    }

    @Override // bo.app.l9
    public final boolean isEmpty() {
        return getValue().length() == 0;
    }
}
