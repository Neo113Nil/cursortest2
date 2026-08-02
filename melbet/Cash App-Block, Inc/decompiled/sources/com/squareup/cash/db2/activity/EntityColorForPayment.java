package com.squareup.cash.db2.activity;

import com.squareup.protos.cash.ui.Color;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EntityColorForPayment {
    public final String color;
    public final Color entity_color;

    public EntityColorForPayment(Color color, String str) {
        this.color = str;
        this.entity_color = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntityColorForPayment)) {
            return false;
        }
        EntityColorForPayment entityColorForPayment = (EntityColorForPayment) obj;
        return Intrinsics.areEqual(this.color, entityColorForPayment.color) && Intrinsics.areEqual(this.entity_color, entityColorForPayment.entity_color);
    }

    public final int hashCode() {
        String str = this.color;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Color color = this.entity_color;
        return hashCode + (color != null ? color.hashCode() : 0);
    }

    public final String toString() {
        return "EntityColorForPayment(color=" + this.color + ", entity_color=" + this.entity_color + ")";
    }
}
