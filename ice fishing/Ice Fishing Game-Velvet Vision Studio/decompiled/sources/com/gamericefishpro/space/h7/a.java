package com.gamericefishpro.space.h7;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public a(String iceId, String fishSource, String fishData, String fishId, String iceFishingApp) {
        Intrinsics.checkNotNullParameter(iceId, "iceId");
        Intrinsics.checkNotNullParameter(fishSource, "fishSource");
        Intrinsics.checkNotNullParameter(fishData, "fishData");
        Intrinsics.checkNotNullParameter(fishId, "fishId");
        Intrinsics.checkNotNullParameter(iceFishingApp, "iceFishingApp");
        this.a = iceId;
        this.b = fishSource;
        this.c = fishData;
        this.d = fishId;
        this.e = iceFishingApp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.a, aVar.a) && Intrinsics.a(this.b, aVar.b) && Intrinsics.a(this.c, aVar.c) && Intrinsics.a(this.d, aVar.d) && Intrinsics.a(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IceStartupParams(iceId=");
        sb.append(this.a);
        sb.append(", fishSource=");
        sb.append(this.b);
        sb.append(", fishData=");
        sb.append(this.c);
        sb.append(", fishId=");
        sb.append(this.d);
        sb.append(", iceFishingApp=");
        return y0.j(sb, this.e, ")");
    }
}
