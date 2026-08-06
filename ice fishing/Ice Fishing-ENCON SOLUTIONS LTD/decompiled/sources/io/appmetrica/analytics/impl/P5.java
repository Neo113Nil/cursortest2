package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
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

/* loaded from: classes.dex */
public class P5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<P5> CREATOR = new O5();

    /* renamed from: a, reason: collision with root package name */
    protected String f4904a;

    /* renamed from: b, reason: collision with root package name */
    protected String f4905b;

    /* renamed from: c, reason: collision with root package name */
    public String f4906c;

    /* renamed from: d, reason: collision with root package name */
    public int f4907d;

    /* renamed from: e, reason: collision with root package name */
    public int f4908e;

    /* renamed from: f, reason: collision with root package name */
    public Pair f4909f;

    /* renamed from: g, reason: collision with root package name */
    public int f4910g;

    /* renamed from: h, reason: collision with root package name */
    public String f4911h;

    /* renamed from: i, reason: collision with root package name */
    public long f4912i;

    /* renamed from: j, reason: collision with root package name */
    public long f4913j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC0352da f4914k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC0583m9 f4915l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f4916m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f4917n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f4918o;

    /* renamed from: p, reason: collision with root package name */
    public Map f4919p;

    public P5() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f4909f == null) {
            this.f4909f = new Pair(str, str2);
        }
    }

    public final Pair<String, String> b() {
        return this.f4909f;
    }

    public final void c(Bundle bundle) {
        this.f4916m = bundle;
    }

    public final long d() {
        return this.f4912i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f4913j;
    }

    public final String f() {
        return this.f4906c;
    }

    public final EnumC0352da g() {
        return this.f4914k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f4910g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f4908e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final Map<String, byte[]> getExtras() {
        return this.f4919p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.f4904a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f4907d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.f4905b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.f4905b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public final Integer h() {
        return this.f4918o;
    }

    public final Bundle i() {
        return this.f4916m;
    }

    public final String j() {
        return this.f4911h;
    }

    public final EnumC0583m9 k() {
        return this.f4915l;
    }

    public final boolean l() {
        return this.f4904a == null;
    }

    public final boolean m() {
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        return -1 == this.f4907d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i2) {
        this.f4910g = i2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i2) {
        this.f4908e = i2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(Map<String, byte[]> map) {
        this.f4919p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.f4904a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i2) {
        this.f4907d = i2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.f4905b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.f4905b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f4904a;
        String str2 = EnumC0301bb.a(this.f4907d).f5665b;
        String str3 = this.f4905b;
        if (str3 == null) {
            str3 = null;
        } else if (str3.length() > 500) {
            str3 = str3.substring(0, 500);
        }
        StringBuilder sb = new StringBuilder("[event: ");
        sb.append(str);
        sb.append(", type: ");
        sb.append(str2);
        sb.append(", value: ");
        return C1.a.k(sb, str3, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f4904a);
        bundle.putString("CounterReport.Value", this.f4905b);
        bundle.putInt("CounterReport.Type", this.f4907d);
        bundle.putInt("CounterReport.CustomType", this.f4908e);
        bundle.putInt("CounterReport.TRUNCATED", this.f4910g);
        bundle.putString("CounterReport.ProfileID", this.f4911h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f4914k.f5815a);
        Bundle bundle2 = this.f4916m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f4906c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f4909f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f4912i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f4913j);
        EnumC0583m9 enumC0583m9 = this.f4915l;
        if (enumC0583m9 != null) {
            bundle.putInt("CounterReport.Source", enumC0583m9.f6510a);
        }
        Boolean bool = this.f4917n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f4918o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f4919p));
        parcel.writeBundle(bundle);
    }

    public P5(String str, int i2) {
        this("", str, i2);
    }

    public static P5 e(P5 p5) {
        return a(p5, EnumC0301bb.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(String str) {
        this.f4906c = str;
    }

    public void c(String str) {
        this.f4911h = str;
    }

    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public P5(String str, String str2, int i2) {
        this(str, str2, i2, new SystemTimeProvider());
    }

    public final void a(long j2) {
        this.f4912i = j2;
    }

    public final void b(long j2) {
        this.f4913j = j2;
    }

    public final Boolean c() {
        return this.f4917n;
    }

    public P5(String str, String str2, int i2, SystemTimeProvider systemTimeProvider) {
        this.f4914k = EnumC0352da.UNKNOWN;
        this.f4919p = new HashMap();
        this.f4904a = str2;
        this.f4907d = i2;
        this.f4905b = str;
        this.f4912i = systemTimeProvider.elapsedRealtime();
        this.f4913j = systemTimeProvider.currentTimeMillis();
    }

    public static P5 b(Bundle bundle) {
        if (bundle != null) {
            try {
                P5 p5 = (P5) bundle.getParcelable("CounterReport.Object");
                if (p5 != null) {
                    return p5;
                }
            } catch (Throwable unused) {
                return new P5("", 0);
            }
        }
        return new P5("", 0);
    }

    public static P5 c(P5 p5) {
        return a(p5, EnumC0301bb.EVENT_TYPE_INIT);
    }

    public static P5 d(P5 p5) {
        P5 p52 = new P5("", 0);
        p52.f4913j = p5.f4913j;
        p52.f4912i = p5.f4912i;
        p52.f4909f = p5.f4909f;
        p52.f4906c = p5.f4906c;
        p52.f4916m = p5.f4916m;
        p52.f4919p = p5.f4919p;
        p52.f4911h = p5.f4911h;
        return p52;
    }

    public final void a(EnumC0352da enumC0352da) {
        this.f4914k = enumC0352da;
    }

    public final void a(EnumC0583m9 enumC0583m9) {
        this.f4915l = enumC0583m9;
    }

    public final void a(Boolean bool) {
        this.f4917n = bool;
    }

    public final void a(Integer num) {
        this.f4918o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    public static P5 b(P5 p5) {
        return a(p5, EnumC0301bb.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static P5 a(P5 p5, EnumC0301bb enumC0301bb) {
        P5 d2 = d(p5);
        d2.f4907d = enumC0301bb.f5664a;
        return d2;
    }

    public static P5 a(P5 p5) {
        return a(p5, EnumC0301bb.EVENT_TYPE_ALIVE);
    }

    public static P5 a(P5 p5, M9 m9) {
        P5 a2 = a(p5, EnumC0301bb.EVENT_TYPE_START);
        a2.setValueBytes(MessageNano.toByteArray(new C0661p9().fromModel(new C0635o9((String) m9.f4745b.a()))));
        a2.f4913j = p5.f4913j;
        a2.f4912i = p5.f4912i;
        return a2;
    }

    public static P5 a(P5 p5, Collection<PermissionState> collection, C0861x2 c0861x2, C0318c2 c0318c2, List<String> list) {
        String str;
        String str2;
        P5 d2 = d(p5);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (c0861x2 != null) {
                jSONObject.put("background_restricted", c0861x2.f7165b);
                EnumC0835w2 enumC0835w2 = c0861x2.f7164a;
                c0318c2.getClass();
                if (enumC0835w2 != null) {
                    int ordinal = enumC0835w2.ordinal();
                    if (ordinal == 0) {
                        str2 = "EXEMPTED";
                    } else if (ordinal == 1) {
                        str2 = "ACTIVE";
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
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        d2.f4907d = 12288;
        d2.setValue(str);
        return d2;
    }

    public static P5 a(P5 p5, String str) {
        P5 d2 = d(p5);
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        d2.f4907d = 12289;
        d2.setValue(str);
        return d2;
    }

    public static P5 a() {
        P5 p5 = new P5("", 0);
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        p5.f4907d = 16384;
        return p5;
    }

    public static P5 a(String str) {
        P5 p5 = new P5("", 0);
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        p5.f4907d = 12320;
        p5.f4905b = str;
        p5.f4915l = EnumC0583m9.JS;
        return p5;
    }
}
