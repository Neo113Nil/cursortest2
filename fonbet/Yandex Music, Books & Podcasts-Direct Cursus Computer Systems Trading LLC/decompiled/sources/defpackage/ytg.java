package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class ytg implements Parcelable {
    public HashMap a;
    public ctg b;

    public ytg(Parcel parcel) {
        parcel.getClass();
        HashMap O = gvt.O(parcel);
        this.a = O != null ? new LinkedHashMap(O) : null;
    }

    public static final ja e(Bundle bundle, String str) {
        String string;
        bundle.getClass();
        str.getClass();
        Date o = gvt.o(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date o2 = gvt.o(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
            return null;
        }
        return new ja(string2, str, string, stringArrayList, null, null, ra.FACEBOOK_APPLICATION_SERVICE, o, new Date(), o2, bundle.getString("graph_domain"));
    }

    public static final ja f(Collection collection, Bundle bundle, ra raVar, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List split$default;
        Object[] array;
        List split$default2;
        List split$default3;
        List split$default4;
        bundle.getClass();
        str.getClass();
        Date o = gvt.o(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        if (string != null) {
            Date o2 = gvt.o(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 != null && string2.length() > 0) {
                split$default4 = StringsKt__StringsKt.split$default(string2, new String[]{StringUtils.COMMA}, false, 0, 6, null);
                Object[] array2 = split$default4.toArray(new String[0]);
                if (array2 == null) {
                    jj4.j("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
                String[] strArr = (String[]) array2;
                collection = u75.d((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayList = null;
            } else {
                split$default3 = StringsKt__StringsKt.split$default(string3, new String[]{StringUtils.COMMA}, false, 0, 6, null);
                Object[] array3 = split$default3.toArray(new String[0]);
                if (array3 == null) {
                    jj4.j("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
                String[] strArr2 = (String[]) array3;
                arrayList = u75.d((String[]) Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayList2 = null;
            } else {
                split$default2 = StringsKt__StringsKt.split$default(string4, new String[]{StringUtils.COMMA}, false, 0, 6, null);
                Object[] array4 = split$default2.toArray(new String[0]);
                if (array4 == null) {
                    jj4.j("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
                String[] strArr3 = (String[]) array4;
                arrayList2 = u75.d((String[]) Arrays.copyOf(strArr3, strArr3.length));
            }
            if (!gvt.D(string)) {
                String string5 = bundle.getString("graph_domain");
                String string6 = bundle.getString("signed_request");
                if (string6 == null || string6.length() == 0) {
                    throw new c3c("Authorization response does not contain the signed_request");
                }
                try {
                    split$default = StringsKt__StringsKt.split$default(string6, new String[]{"."}, false, 0, 6, null);
                    array = split$default.toArray(new String[0]);
                } catch (UnsupportedEncodingException | JSONException unused) {
                }
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr4 = (String[]) array;
                if (strArr4.length == 2) {
                    byte[] decode = Base64.decode(strArr4[1], 0);
                    decode.getClass();
                    String string7 = new JSONObject(new String(decode, Charsets.UTF_8)).getString("user_id");
                    string7.getClass();
                    return new ja(string, str, string7, collection, arrayList, arrayList2, raVar, o, new Date(), o2, string5);
                }
                throw new c3c("Failed to retrieve user_id from signed_request");
            }
        }
        return null;
    }

    public static final j02 g(Bundle bundle, String str) {
        bundle.getClass();
        String string = bundle.getString("id_token");
        if (string == null || string.length() == 0 || str == null || str.length() == 0) {
            return null;
        }
        try {
            return new j02(string, str);
        } catch (Exception e) {
            throw new c3c(e.getMessage(), e);
        }
    }

    public final void a(String str, String str2) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
        }
    }

    public final String h(String str) {
        str.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", j());
            m(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    public final ctg i() {
        ctg ctgVar = this.b;
        if (ctgVar != null) {
            return ctgVar;
        }
        Intrinsics.j("loginClient");
        throw null;
    }

    public abstract String j();

    public final void k(String str) {
        ctg ctgVar = this.b;
        if (ctgVar == null) {
            Intrinsics.j("loginClient");
            throw null;
        }
        atg atgVar = ctgVar.g;
        atgVar.getClass();
        String str2 = atgVar.d;
        ctg ctgVar2 = this.b;
        if (ctgVar2 == null) {
            Intrinsics.j("loginClient");
            throw null;
        }
        pt0 pt0Var = new pt0((Context) ctgVar2.c.l(), str2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString(CommonUrlParts.APP_ID, str2);
        HashSet hashSet = j3c.a;
        if (gtt.c()) {
            pt0Var.z(bundle, "fb_dialogs_web_login_dialog_complete");
        }
    }

    public boolean l(int i, int i2, Intent intent) {
        return false;
    }

    public abstract int n(atg atgVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        gvt.Z(parcel, this.a);
    }

    public void d() {
    }

    public void m(JSONObject jSONObject) {
    }
}
