package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: io.appmetrica.analytics.impl.l7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555l7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6424a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6425b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6426c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6427d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6428e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6429f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6430g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6431h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6432i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6433j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6434k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6435l;

    /* renamed from: m, reason: collision with root package name */
    public final String f6436m;

    /* renamed from: n, reason: collision with root package name */
    public final String f6437n;

    public C0555l7(C0404fb c0404fb) {
        this.f6424a = c0404fb.b("dId");
        this.f6425b = c0404fb.b("uId");
        this.f6426c = c0404fb.b("analyticsSdkVersionName");
        this.f6427d = c0404fb.b("kitBuildNumber");
        this.f6428e = c0404fb.b("kitBuildType");
        this.f6429f = c0404fb.b("appVer");
        this.f6430g = c0404fb.optString("app_debuggable", CommonUrlParts.Values.FALSE_INTEGER);
        this.f6431h = c0404fb.b("appBuild");
        this.f6432i = c0404fb.b("osVer");
        this.f6434k = c0404fb.b("lang");
        this.f6435l = c0404fb.b("root");
        this.f6436m = c0404fb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int optInt = c0404fb.optInt("osApiLev", -1);
        this.f6433j = optInt == -1 ? null : String.valueOf(optInt);
        int optInt2 = c0404fb.optInt("attribution_id", 0);
        this.f6437n = optInt2 > 0 ? String.valueOf(optInt2) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb.append(this.f6424a);
        sb.append("', uuid='");
        sb.append(this.f6425b);
        sb.append("', analyticsSdkVersionName='");
        sb.append(this.f6426c);
        sb.append("', kitBuildNumber='");
        sb.append(this.f6427d);
        sb.append("', kitBuildType='");
        sb.append(this.f6428e);
        sb.append("', appVersion='");
        sb.append(this.f6429f);
        sb.append("', appDebuggable='");
        sb.append(this.f6430g);
        sb.append("', appBuildNumber='");
        sb.append(this.f6431h);
        sb.append("', osVersion='");
        sb.append(this.f6432i);
        sb.append("', osApiLevel='");
        sb.append(this.f6433j);
        sb.append("', locale='");
        sb.append(this.f6434k);
        sb.append("', deviceRootStatus='");
        sb.append(this.f6435l);
        sb.append("', appFramework='");
        sb.append(this.f6436m);
        sb.append("', attributionId='");
        return C1.a.k(sb, this.f6437n, "'}");
    }

    public C0555l7() {
        this.f6424a = null;
        this.f6425b = null;
        this.f6426c = null;
        this.f6427d = null;
        this.f6428e = null;
        this.f6429f = null;
        this.f6430g = null;
        this.f6431h = null;
        this.f6432i = null;
        this.f6433j = null;
        this.f6434k = null;
        this.f6435l = null;
        this.f6436m = null;
        this.f6437n = null;
    }
}
