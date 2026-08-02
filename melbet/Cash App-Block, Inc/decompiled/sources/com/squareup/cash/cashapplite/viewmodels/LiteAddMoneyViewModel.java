package com.squareup.cash.cashapplite.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LiteAddMoneyViewModel {
    public final List rows;

    public LiteAddMoneyViewModel(List list) {
        list.getClass();
        this.rows = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiteAddMoneyViewModel) && Intrinsics.areEqual(this.rows, ((LiteAddMoneyViewModel) obj).rows);
    }

    public final int hashCode() {
        return this.rows.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("LiteAddMoneyViewModel(rows=", ")", this.rows);
    }
}
