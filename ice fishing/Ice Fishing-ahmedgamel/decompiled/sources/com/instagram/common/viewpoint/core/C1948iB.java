package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.iB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1948iB implements InterfaceC1156Om {
    public final SharedPreferences A00;

    public C1948iB(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1156Om
    public final C1949iC A6I() {
        return new C1949iC(this.A00.edit());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1156Om
    public final long A8Q(String str, long j6) {
        return this.A00.getLong(str, j6);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1156Om
    public final String A9E(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
