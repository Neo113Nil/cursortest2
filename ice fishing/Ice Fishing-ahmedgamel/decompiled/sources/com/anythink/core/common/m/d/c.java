package com.anythink.core.common.m.d;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    String f15377a;

    /* renamed from: c, reason: collision with root package name */
    int f15379c;

    /* renamed from: l, reason: collision with root package name */
    private final String f15380l = "c";

    /* renamed from: b, reason: collision with root package name */
    boolean f15378b = true;

    public c(String str, int i) {
        this.f15379c = 1;
        this.f15377a = str;
        if (i == 1000) {
            this.f15379c = 1;
        } else if (i == 1001) {
            this.f15379c = 2;
        }
    }

    @Override // com.anythink.core.common.m.d.d
    public final void a(String str, String str2, String str3, int i) {
    }

    @Override // com.anythink.core.common.m.d.d
    public final int c() {
        return this.f15379c;
    }

    @Override // com.anythink.core.common.m.d.d
    public final int d() {
        return 3;
    }

    @Override // com.anythink.core.common.m.d.d
    public final byte[] e() {
        return !TextUtils.isEmpty(this.f15377a) ? d.a(this.f15377a) : new byte[0];
    }

    @Override // com.anythink.core.common.m.d.d
    public final boolean f() {
        return this.f15378b;
    }
}
