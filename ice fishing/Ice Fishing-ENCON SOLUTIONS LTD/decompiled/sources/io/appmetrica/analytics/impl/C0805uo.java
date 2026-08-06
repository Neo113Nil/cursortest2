package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.uo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805uo implements InterfaceC0779to {

    /* renamed from: a, reason: collision with root package name */
    public final C8 f7030a;

    public C0805uo() {
        this(new C8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0779to
    public final byte[] a(N8 n8, C0539kh c0539kh) {
        if (!((X4) c0539kh.f6383l).B() && !TextUtils.isEmpty(n8.f4803b)) {
            try {
                JSONObject jSONObject = new JSONObject(n8.f4803b);
                jSONObject.remove("preloadInfo");
                n8.f4803b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f7030a.a(n8, c0539kh);
    }

    public C0805uo(C8 c8) {
        this.f7030a = c8;
    }
}
