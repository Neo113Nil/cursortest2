package com.anythink.expressad.reward.a;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e implements com.anythink.expressad.g.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21103a = "RewardUnitCacheManager";

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, com.anythink.expressad.videocommon.e.d> f21104b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final e f21105a = new e(0);

        private a() {
        }
    }

    public /* synthetic */ e(byte b9) {
        this();
    }

    public static e a() {
        return a.f21105a;
    }

    private e() {
        this.f21104b = new ConcurrentHashMap<>();
    }

    public final void a(String str, String str2, com.anythink.expressad.videocommon.e.d dVar) {
        try {
            String str3 = str + "_" + str2;
            if (dVar != null && this.f21104b.containsKey(str3)) {
                this.f21104b.remove(str3);
            }
            this.f21104b.put(str3, dVar);
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public final com.anythink.expressad.videocommon.e.d a(String str, String str2) {
        try {
            try {
                return this.f21104b.remove(str + "_" + str2);
            } catch (Exception e9) {
                e9.getMessage();
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
