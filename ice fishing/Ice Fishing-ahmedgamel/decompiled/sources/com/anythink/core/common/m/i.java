package com.anythink.core.common.m;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.cd;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f14670c = 1;

    /* renamed from: a, reason: collision with root package name */
    String f14671a;

    /* renamed from: b, reason: collision with root package name */
    int f14672b;

    /* renamed from: d, reason: collision with root package name */
    boolean f14673d;

    /* renamed from: e, reason: collision with root package name */
    private cd f14674e;

    private i(String str) {
        this.f14672b = 0;
        this.f14673d = false;
        this.f14671a = str;
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 2;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        return this.f14671a;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        return null;
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
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
        cd cdVar;
        if (1 != this.f14672b || (cdVar = this.f14674e) == null) {
            return;
        }
        int k9 = cdVar.k();
        com.anythink.core.common.h.n y7 = this.f14674e.y();
        bv z3 = this.f14674e.z();
        if (k9 == 50 && com.anythink.core.common.v.d.a().a(y7, z3) && !this.f14673d) {
            this.f14673d = true;
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.m.i.1
                @Override // java.lang.Runnable
                public final void run() {
                    i iVar = i.this;
                    iVar.a(0, iVar.f14411r);
                }
            }, com.anythink.expressad.video.module.a.a.m.ai);
        } else {
            this.f14674e.a(adError.getPlatformCode());
            this.f14674e.b(adError.getPlatformMSG());
            com.anythink.core.common.v.d.a().a(y7, z3, com.anythink.core.common.v.d.f16730c, "1");
            com.anythink.core.b.d.c.a(this.f14674e);
        }
    }

    public static i a(String str) {
        return new i(str);
    }

    public static i a(String str, cd cdVar) {
        return new i(str, cdVar);
    }

    private i(String str, cd cdVar) {
        this(str);
        this.f14672b = 1;
        this.f14674e = cdVar;
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        cd cdVar;
        if (1 != this.f14672b || (cdVar = this.f14674e) == null) {
            return null;
        }
        cdVar.a("200");
        com.anythink.core.common.v.d.a().a(this.f14674e.y(), this.f14674e.z(), com.anythink.core.common.v.d.f16730c, "0");
        com.anythink.core.b.d.c.a(this.f14674e);
        return null;
    }
}
