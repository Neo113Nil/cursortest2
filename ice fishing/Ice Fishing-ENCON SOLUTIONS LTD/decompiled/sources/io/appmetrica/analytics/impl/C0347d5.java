package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347d5 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5785a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5786b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f5787c;

    public C0347d5(Context context) {
        this.f5787c = context.getApplicationContext();
    }

    public final Ga a(Q4 q4, C0656p4 c0656p4, O7 o7, HashMap hashMap) {
        Ga ga = (Ga) hashMap.get(q4.toString());
        if (ga != null) {
            ga.a(c0656p4);
            return ga;
        }
        Ga a2 = o7.a(this.f5787c, q4, c0656p4);
        hashMap.put(q4.toString(), a2);
        return a2;
    }
}
