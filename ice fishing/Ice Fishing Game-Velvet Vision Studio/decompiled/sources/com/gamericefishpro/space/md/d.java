package com.gamericefishpro.space.md;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private final String entry;
    private final c level;

    public d(c level, String entry) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.level = level;
        this.entry = entry;
    }

    public static /* synthetic */ d copy$default(d dVar, c cVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = dVar.level;
        }
        if ((i & 2) != 0) {
            str = dVar.entry;
        }
        return dVar.copy(cVar, str);
    }

    public final c component1() {
        return this.level;
    }

    public final String component2() {
        return this.entry;
    }

    public final d copy(c level, String entry) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(entry, "entry");
        return new d(level, entry);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.level == dVar.level && Intrinsics.a(this.entry, dVar.entry);
    }

    public final String getEntry() {
        return this.entry;
    }

    public final c getLevel() {
        return this.level;
    }

    public int hashCode() {
        return this.entry.hashCode() + (this.level.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OneSignalLogEvent(level=");
        sb.append(this.level);
        sb.append(", entry=");
        return y0.i(sb, this.entry, ')');
    }
}
