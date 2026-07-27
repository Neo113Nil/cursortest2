package com.anythink.basead.i;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.v.m;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends com.anythink.core.common.m.a {

    /* renamed from: a, reason: collision with root package name */
    String f9236a;

    /* renamed from: b, reason: collision with root package name */
    boolean f9237b;

    public c(String str, String str2, boolean z8) {
        this.f9237b = z8;
        this.f9236a = str.replaceAll("\\{req_id\\}", str2 == null ? "" : str2);
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 2;
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        if (!this.f9237b) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String h9 = m.h();
        if (!TextUtils.isEmpty(h9)) {
            hashMap.put("User-Agent", h9);
        }
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        return new byte[0];
    }

    @Override // com.anythink.core.common.m.a
    public final String g() {
        return "";
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        return this.f9236a;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }
}
