package com.squareup.cash.clientsync.pipeline;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StorageOperationBatch {

    /* renamed from: operations, reason: collision with root package name */
    public final List f1115operations;

    public StorageOperationBatch(List list) {
        list.getClass();
        this.f1115operations = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StorageOperationBatch) && Intrinsics.areEqual(this.f1115operations, ((StorageOperationBatch) obj).f1115operations);
    }

    public final int hashCode() {
        return this.f1115operations.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("StorageOperationBatch(operations=", ")", this.f1115operations);
    }
}
