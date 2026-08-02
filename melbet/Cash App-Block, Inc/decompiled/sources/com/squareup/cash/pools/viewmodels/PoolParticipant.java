package com.squareup.cash.pools.viewmodels;

import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PoolParticipant {
    public final Color accentColor;
    public final String customerId;
    public final String name;
    public final Image photoImage;

    public PoolParticipant(String str, String str2, Image image, Color color) {
        str2.getClass();
        this.name = str;
        this.customerId = str2;
        this.photoImage = image;
        this.accentColor = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolParticipant)) {
            return false;
        }
        PoolParticipant poolParticipant = (PoolParticipant) obj;
        return Intrinsics.areEqual(this.name, poolParticipant.name) && Intrinsics.areEqual(this.customerId, poolParticipant.customerId) && Intrinsics.areEqual(this.photoImage, poolParticipant.photoImage) && this.accentColor.equals(poolParticipant.accentColor);
    }

    public final int hashCode() {
        String str = this.name;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.customerId);
        Image image = this.photoImage;
        return this.accentColor.hashCode() + ((m + (image != null ? image.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PoolParticipant(name=", this.name, ", customerId=", this.customerId, ", photoImage=");
        m.append(this.photoImage);
        m.append(", accentColor=");
        m.append(this.accentColor);
        m.append(")");
        return m.toString();
    }
}
