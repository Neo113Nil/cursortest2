package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes.dex */
public final class S3 {

    /* renamed from: a, reason: collision with root package name */
    public final IdentifiersResult f5025a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifiersResult f5026b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentifiersResult f5027c;

    /* renamed from: d, reason: collision with root package name */
    public final IdentifiersResult f5028d;

    /* renamed from: e, reason: collision with root package name */
    public final IdentifiersResult f5029e;

    /* renamed from: f, reason: collision with root package name */
    public final IdentifiersResult f5030f;

    /* renamed from: g, reason: collision with root package name */
    public final IdentifiersResult f5031g;

    /* renamed from: h, reason: collision with root package name */
    public final IdentifiersResult f5032h;

    /* renamed from: i, reason: collision with root package name */
    public final IdentifiersResult f5033i;

    /* renamed from: j, reason: collision with root package name */
    public final IdentifiersResult f5034j;

    /* renamed from: k, reason: collision with root package name */
    public final IdentifiersResult f5035k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5036l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5037m;

    /* renamed from: n, reason: collision with root package name */
    public final V9 f5038n;

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f5039o;

    public S3(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j2, long j3, V9 v9, Bundle bundle) {
        this.f5025a = identifiersResult;
        this.f5026b = identifiersResult2;
        this.f5027c = identifiersResult3;
        this.f5028d = identifiersResult4;
        this.f5029e = identifiersResult5;
        this.f5030f = identifiersResult6;
        this.f5031g = identifiersResult7;
        this.f5032h = identifiersResult8;
        this.f5033i = identifiersResult9;
        this.f5034j = identifiersResult10;
        this.f5035k = identifiersResult11;
        this.f5036l = j2;
        this.f5037m = j3;
        this.f5038n = v9;
        this.f5039o = bundle;
    }

    public static IdentifiersResult a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f5025a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f5026b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f5027c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f5028d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f5029e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f5030f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f5031g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f5032h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle("GAID", bundle9);
        IdentifiersResult identifiersResult9 = this.f5033i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f5034j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f5035k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f5036l);
        bundle.putLong("NextStartupTime", this.f5037m);
        V9 v9 = this.f5038n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", v9);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", C0610na.f6575I.p().i());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f5025a + ", mDeviceIdData=" + this.f5026b + ", mDeviceIdHashData=" + this.f5027c + ", mReportAdUrlData=" + this.f5028d + ", mGetAdUrlData=" + this.f5029e + ", mResponseClidsData=" + this.f5030f + ", mClientClidsForRequestData=" + this.f5031g + ", mGaidData=" + this.f5032h + ", mHoaidData=" + this.f5033i + ", yandexAdvIdData=" + this.f5034j + ", customSdkHostsData=" + this.f5035k + ", mServerTimeOffset=" + this.f5036l + ", nextStartupTime=" + this.f5037m + ", features=" + this.f5038n + ", modulesConfig=" + this.f5039o + '}';
    }

    public static V9 a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = V9.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        V9 v9 = (V9) parcelable;
        return v9 == null ? new V9(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : v9;
    }

    public static IdentifiersResult a(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, isEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, isEmpty ? "no identifier in startup state" : null);
    }

    public static V9 a(Boolean bool) {
        boolean z2 = bool != null;
        return new V9(bool, z2 ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z2 ? null : "no identifier in startup state");
    }
}
