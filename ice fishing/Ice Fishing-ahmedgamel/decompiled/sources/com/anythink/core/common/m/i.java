package com.anythink.core.common.m;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.cd;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f15456c = 1;

    /* renamed from: a, reason: collision with root package name */
    String f15457a;

    /* renamed from: b, reason: collision with root package name */
    int f15458b;

    /* renamed from: d, reason: collision with root package name */
    boolean f15459d;

    /* renamed from: e, reason: collision with root package name */
    private cd f15460e;

    private i(String str) {
        this.f15458b = 0;
        this.f15459d = false;
        this.f15457a = str;
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 2;
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        return this.f15457a;
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
        if (1 != this.f15458b || (cdVar = this.f15460e) == null) {
            return;
        }
        int k9 = cdVar.k();
        com.anythink.core.common.h.n y7 = this.f15460e.y();
        bv z6 = this.f15460e.z();
        if (k9 == 50 && com.anythink.core.common.v.d.a().a(y7, z6) && !this.f15459d) {
            this.f15459d = true;
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.m.i.1
                @Override // java.lang.Runnable
                public final void run() {
                    i iVar = i.this;
                    iVar.a(0, iVar.f15197r);
                }
            }, com.anythink.expressad.video.module.a.a.m.ai);
        } else {
            this.f15460e.a(adError.getPlatformCode());
            this.f15460e.b(adError.getPlatformMSG());
            com.anythink.core.common.v.d.a().a(y7, z6, com.anythink.core.common.v.d.f17517c, "1");
            com.anythink.core.b.d.c.a(this.f15460e);
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
        this.f15458b = 1;
        this.f15460e = cdVar;
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        cd cdVar;
        if (1 != this.f15458b || (cdVar = this.f15460e) == null) {
            return null;
        }
        cdVar.a("200");
        com.anythink.core.common.v.d.a().a(this.f15460e.y(), this.f15460e.z(), com.anythink.core.common.v.d.f17517c, "0");
        com.anythink.core.b.d.c.a(this.f15460e);
        return null;
    }
}
