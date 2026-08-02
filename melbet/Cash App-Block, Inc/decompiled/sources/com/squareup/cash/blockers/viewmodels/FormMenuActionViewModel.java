package com.squareup.cash.blockers.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class FormMenuActionViewModel {
    public final List actions;

    public FormMenuActionViewModel(List list) {
        list.getClass();
        this.actions = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FormMenuActionViewModel) && Intrinsics.areEqual(this.actions, ((FormMenuActionViewModel) obj).actions);
    }

    public final int hashCode() {
        return this.actions.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("FormMenuActionViewModel(actions=", ")", this.actions);
    }
}
