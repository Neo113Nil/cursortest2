package com.squareup.cash.investing.viewmodels.holdings;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Sector {
    public final String name;
    public final String percent;

    public Sector(String str, String str2) {
        str.getClass();
        this.name = str;
        this.percent = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sector)) {
            return false;
        }
        Sector sector = (Sector) obj;
        return Intrinsics.areEqual(this.name, sector.name) && this.percent.equals(sector.percent);
    }

    public final int hashCode() {
        return this.percent.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Sector(name=", this.name, ", percent=", this.percent, ")");
    }
}
