package com.squareup.cash.moneybot.views.shared;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class PlaceableRow {
    public final ArrayList idxs;
    public int width = 0;
    public int ascent = 0;
    public int descent = 0;

    public PlaceableRow(ArrayList arrayList) {
        this.idxs = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceableRow)) {
            return false;
        }
        PlaceableRow placeableRow = (PlaceableRow) obj;
        return this.idxs.equals(placeableRow.idxs) && this.width == placeableRow.width && this.ascent == placeableRow.ascent && this.descent == placeableRow.descent;
    }

    public final int hashCode() {
        return Integer.hashCode(this.descent) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.ascent, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.width, this.idxs.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        int i = this.width;
        int i2 = this.ascent;
        int i3 = this.descent;
        StringBuilder sb = new StringBuilder("PlaceableRow(idxs=");
        sb.append(this.idxs);
        sb.append(", width=");
        sb.append(i);
        sb.append(", ascent=");
        return Recorder$$ExternalSyntheticOutline1.m(i2, i3, ", descent=", ")", sb);
    }
}
