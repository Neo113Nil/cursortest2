package com.gamericefishpro.space.s7;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.b7.a {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public e(boolean z, boolean z2, boolean z3, String appVersion) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = appVersion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && Intrinsics.a(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + y0.c(y0.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "SettingsUiState(musicEnabled=" + this.a + ", sfxEnabled=" + this.b + ", vibrationEnabled=" + this.c + ", appVersion=" + this.d + ")";
    }
}
