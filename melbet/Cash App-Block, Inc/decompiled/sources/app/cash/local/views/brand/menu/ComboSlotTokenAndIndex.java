package app.cash.local.views.brand.menu;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import app.cash.local.primitives.ComboSlotToken;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ComboSlotTokenAndIndex {
    public final int index;
    public final String token;

    public ComboSlotTokenAndIndex(String str, int i) {
        str.getClass();
        this.token = str;
        this.index = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboSlotTokenAndIndex)) {
            return false;
        }
        ComboSlotTokenAndIndex comboSlotTokenAndIndex = (ComboSlotTokenAndIndex) obj;
        return Intrinsics.areEqual(this.token, comboSlotTokenAndIndex.token) && this.index == comboSlotTokenAndIndex.index;
    }

    public final int hashCode() {
        return Integer.hashCode(this.index) + (this.token.hashCode() * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m("ComboSlotTokenAndIndex(token=", this.index, ComboSlotToken.m1233toStringimpl(this.token), ", index=", ")");
    }
}
