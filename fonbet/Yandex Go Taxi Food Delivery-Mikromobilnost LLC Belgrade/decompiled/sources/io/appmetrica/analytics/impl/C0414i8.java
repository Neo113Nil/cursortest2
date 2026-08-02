package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: io.appmetrica.analytics.impl.i8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0414i8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public C0414i8(Uc uc) {
        this.a = uc.c("dId");
        this.b = uc.c("uId");
        this.c = uc.c("analyticsSdkVersionName");
        this.d = uc.c("kitBuildNumber");
        this.e = uc.c("kitBuildType");
        this.f = uc.c("appVer");
        this.g = uc.optString("app_debuggable", "0");
        this.h = uc.c("appBuild");
        this.i = uc.c("osVer");
        this.k = uc.c("lang");
        this.l = uc.c("root");
        this.m = uc.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int optInt = uc.optInt("osApiLev", -1);
        this.j = optInt == -1 ? null : String.valueOf(optInt);
        int optInt2 = uc.optInt("attribution_id", 0);
        this.n = optInt2 > 0 ? String.valueOf(optInt2) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb.append(this.a);
        sb.append("', uuid='");
        sb.append(this.b);
        sb.append("', analyticsSdkVersionName='");
        sb.append(this.c);
        sb.append("', kitBuildNumber='");
        sb.append(this.d);
        sb.append("', kitBuildType='");
        sb.append(this.e);
        sb.append("', appVersion='");
        sb.append(this.f);
        sb.append("', appDebuggable='");
        sb.append(this.g);
        sb.append("', appBuildNumber='");
        sb.append(this.h);
        sb.append("', osVersion='");
        sb.append(this.i);
        sb.append("', osApiLevel='");
        sb.append(this.j);
        sb.append("', locale='");
        sb.append(this.k);
        sb.append("', deviceRootStatus='");
        sb.append(this.l);
        sb.append("', appFramework='");
        sb.append(this.m);
        sb.append("', attributionId='");
        return AbstractC0748tp.a(sb, this.n, "'}");
    }

    public C0414i8() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }
}
