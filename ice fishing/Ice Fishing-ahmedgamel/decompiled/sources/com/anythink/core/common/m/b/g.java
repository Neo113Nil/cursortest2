package com.anythink.core.common.m.b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15304a = "placement_strategy";

    /* renamed from: b, reason: collision with root package name */
    public static final String f15305b = "app_strategy";

    /* renamed from: c, reason: collision with root package name */
    public static final String f15306c = "eu_traffic";

    /* renamed from: d, reason: collision with root package name */
    public static final String f15307d = "get_area";

    /* renamed from: e, reason: collision with root package name */
    public static final String f15308e = "get_plugin";

    /* renamed from: f, reason: collision with root package name */
    public static final String f15309f = "get_cdn_domain";

    /* renamed from: g, reason: collision with root package name */
    public static final String f15310g = "tracking";

    /* renamed from: h, reason: collision with root package name */
    public static final String f15311h = "agent";
    public static final String i = "bid";

    /* renamed from: j, reason: collision with root package name */
    public static final String f15312j = "request";

    /* renamed from: k, reason: collision with root package name */
    public static final String f15313k = "smart_wf";

    /* renamed from: l, reason: collision with root package name */
    public static final String f15314l = "s2s_reward";

    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "s2s_reward":
                return 4;
            case "bid":
                return 3;
            case "placement_strategy":
                return 2;
            case "request":
                return 5;
            case "app_strategy":
                return 1;
            default:
                return 0;
        }
    }
}
