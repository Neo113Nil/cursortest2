package com.squareup.cash.genericelements.presenters.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GenericTreeElementsRefreshTrigger$BoostContentUpdateTrigger {
    public final List boostTokens;

    public GenericTreeElementsRefreshTrigger$BoostContentUpdateTrigger(List list) {
        list.getClass();
        this.boostTokens = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericTreeElementsRefreshTrigger$BoostContentUpdateTrigger) && Intrinsics.areEqual(this.boostTokens, ((GenericTreeElementsRefreshTrigger$BoostContentUpdateTrigger) obj).boostTokens);
    }

    public final int hashCode() {
        return this.boostTokens.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("BoostContentUpdateTrigger(boostTokens=", ")", this.boostTokens);
    }
}
