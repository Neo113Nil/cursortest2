package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.b64;
import defpackage.oyr;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class K6 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<K6> CREATOR = new J6();
    protected String a;
    protected String b;
    public String c;
    public int d;
    public int e;
    public Pair f;
    public int g;
    public String h;
    public long i;
    public long j;
    public EnumC0821wb k;
    public Ba l;
    public Bundle m;
    public Boolean n;
    public Integer o;
    public Map p;

    public K6(String str, String str2, int i) {
        this.k = EnumC0821wb.UNKNOWN;
        this.p = new HashMap();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.a = str2;
        this.d = i;
        this.b = str;
        this.i = systemTimeProvider.elapsedRealtime();
        this.j = systemTimeProvider.currentTimeMillis();
    }

    public static K6 a(K6 k6, Collection<PermissionState> collection, C0495l3 c0495l3, O2 o2, List<String> list) {
        String str;
        String str2;
        K6 d = d(k6);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (c0495l3 != null) {
                jSONObject.put("background_restricted", c0495l3.b);
                EnumC0466k3 enumC0466k3 = c0495l3.a;
                o2.getClass();
                if (enumC0466k3 != null) {
                    int ordinal = enumC0466k3.ordinal();
                    if (ordinal == 0) {
                        str2 = "EXEMPTED";
                    } else if (ordinal == 1) {
                        str2 = Card.ACTIVE;
                    } else if (ordinal == 2) {
                        str2 = "WORKING_SET";
                    } else if (ordinal == 3) {
                        str2 = "FREQUENT";
                    } else if (ordinal == 4) {
                        str2 = "RARE";
                    } else if (ordinal == 5) {
                        str2 = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        d.d = 12288;
        d.setValue(str);
        return d;
    }

    public static K6 b(Bundle bundle) {
        if (bundle != null) {
            try {
                K6 k6 = (K6) bundle.getParcelable("CounterReport.Object");
                if (k6 != null) {
                    return k6;
                }
            } catch (Throwable unused) {
                return new K6("", 0);
            }
        }
        return new K6("", 0);
    }

    public static K6 c(K6 k6) {
        return a(k6, Hc.EVENT_TYPE_INIT);
    }

    public static K6 d(K6 k6) {
        K6 k62 = new K6("", 0);
        k62.j = k6.j;
        k62.i = k6.i;
        k62.f = k6.f;
        k62.c = k6.c;
        k62.m = k6.m;
        k62.p = k6.p;
        k62.h = k6.h;
        return k62;
    }

    public static K6 e(K6 k6) {
        return a(k6, Hc.EVENT_TYPE_APP_UPDATE);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String f() {
        return this.c;
    }

    public final EnumC0821wb g() {
        return this.k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final Map<String, byte[]> getExtras() {
        return this.p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public final Integer h() {
        return this.o;
    }

    public final Bundle i() {
        return this.m;
    }

    public final String j() {
        return this.h;
    }

    public final Ba k() {
        return this.l;
    }

    public final boolean l() {
        return this.a == null;
    }

    public final boolean m() {
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        return -1 == this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i) {
        this.g = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i) {
        this.e = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(Map<String, byte[]> map) {
        this.p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i) {
        this.d = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.a;
        String str2 = Hc.a(this.d).b;
        String str3 = this.b;
        if (str3 == null) {
            str3 = null;
        } else if (str3.length() > 500) {
            str3 = str3.substring(0, 500);
        }
        return oyr.t(b64.v("[event: ", str, ", type: ", str2, ", value: "), str3, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.a);
        bundle.putString("CounterReport.Value", this.b);
        bundle.putInt("CounterReport.Type", this.d);
        bundle.putInt("CounterReport.CustomType", this.e);
        bundle.putInt("CounterReport.TRUNCATED", this.g);
        bundle.putString("CounterReport.ProfileID", this.h);
        bundle.putInt("CounterReport.UniquenessStatus", this.k.a);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.i);
        bundle.putLong("CounterReport.CreationTimestamp", this.j);
        Ba ba = this.l;
        if (ba != null) {
            bundle.putInt("CounterReport.Source", ba.a);
        }
        Boolean bool = this.n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.p));
        parcel.writeBundle(bundle);
    }

    public void c(String str) {
        this.h = str;
    }

    public final long e() {
        return this.j;
    }

    public final Boolean c() {
        return this.n;
    }

    public final void c(Bundle bundle) {
        this.m = bundle;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void b(long j) {
        this.j = j;
    }

    public final Pair<String, String> b() {
        return this.f;
    }

    public static K6 b(K6 k6) {
        return a(k6, Hc.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public K6(String str, int i) {
        this("", str, i);
    }

    public K6() {
        this("", 0);
    }

    public final long d() {
        return this.i;
    }

    public K6(String str, String str2, int i, long j) {
        this(str, str2, i);
        b(j);
    }

    public final void a(long j) {
        this.i = j;
    }

    public final void a(EnumC0821wb enumC0821wb) {
        this.k = enumC0821wb;
    }

    public final void a(Ba ba) {
        this.l = ba;
    }

    public final void a(Boolean bool) {
        this.n = bool;
    }

    public final void a(Integer num) {
        this.o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    public static K6 a(K6 k6, Hc hc) {
        K6 d = d(k6);
        d.d = hc.a;
        return d;
    }

    public static K6 a(K6 k6) {
        return a(k6, Hc.EVENT_TYPE_ALIVE);
    }

    public static K6 a(K6 k6, C0244cb c0244cb) {
        K6 a = a(k6, Hc.EVENT_TYPE_START);
        a.setValueBytes(MessageNano.toByteArray(new Ea().fromModel(new Da((String) c0244cb.b.a()))));
        a.j = k6.j;
        a.i = k6.i;
        return a;
    }

    public final void a(String str, String str2) {
        if (this.f == null) {
            this.f = new Pair(str, str2);
        }
    }

    public static K6 a(K6 k6, String str) {
        K6 d = d(k6);
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        d.d = 12289;
        d.setValue(str);
        return d;
    }

    public static K6 a() {
        K6 k6 = new K6("", 0);
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        k6.d = 16384;
        return k6;
    }

    public static K6 a(String str) {
        K6 k6 = new K6("", 0);
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        k6.d = 12320;
        k6.b = str;
        k6.l = Ba.JS;
        return k6;
    }
}
