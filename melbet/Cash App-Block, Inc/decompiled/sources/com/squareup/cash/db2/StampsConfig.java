package com.squareup.cash.db2;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.db.WireRepeatedAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StampsConfig {
    public final List stamps;

    /* loaded from: classes.dex */
    public final class Adapter {
        public final WireRepeatedAdapter stampsAdapter;
    }

    public StampsConfig(List list) {
        this.stamps = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StampsConfig) && Intrinsics.areEqual(this.stamps, ((StampsConfig) obj).stamps);
    }

    public final int hashCode() {
        List list = this.stamps;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("StampsConfig(stamps=", ")", this.stamps);
    }
}
