package com.emeraldpulse.kyra;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.createyourself.policy.PolicyGateKt$$ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/emeraldpulse/kyra/RoomCheckItem;", "", "label", "", "done", "", "<init>", "(Ljava/lang/String;Z)V", "getLabel", "()Ljava/lang/String;", "getDone", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final /* data */ class RoomCheckItem {
    private final boolean done;
    private final String label;

    public static /* synthetic */ RoomCheckItem copy$default(RoomCheckItem roomCheckItem, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = roomCheckItem.label;
        }
        if ((i & 2) != 0) {
            z = roomCheckItem.done;
        }
        return roomCheckItem.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDone() {
        return this.done;
    }

    public final RoomCheckItem copy(String label, boolean done) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new RoomCheckItem(label, done);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomCheckItem)) {
            return false;
        }
        RoomCheckItem roomCheckItem = (RoomCheckItem) other;
        return Intrinsics.areEqual(this.label, roomCheckItem.label) && this.done == roomCheckItem.done;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + PolicyGateKt$$ExternalSyntheticBackport0.m(this.done);
    }

    public String toString() {
        return "RoomCheckItem(label=" + this.label + ", done=" + this.done + ")";
    }

    public RoomCheckItem(String label, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.done = z;
    }

    public final boolean getDone() {
        return this.done;
    }

    public final String getLabel() {
        return this.label;
    }
}
