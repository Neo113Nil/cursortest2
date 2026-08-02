package com.datadog.android.core.persistence.datastore;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class DataStoreContent {
    public final Object data;
    public final int versionCode;

    public DataStoreContent(int i, Object obj) {
        this.versionCode = i;
        this.data = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataStoreContent)) {
            return false;
        }
        DataStoreContent dataStoreContent = (DataStoreContent) obj;
        return this.versionCode == dataStoreContent.versionCode && Intrinsics.areEqual(this.data, dataStoreContent.data);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.versionCode) * 31;
        Object obj = this.data;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "DataStoreContent(versionCode=" + this.versionCode + ", data=" + this.data + ")";
    }
}
