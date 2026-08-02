package com.datadog.android.rum.resource;

import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class ResourceId {
    public final String key;
    public final String uuid;

    public ResourceId(String str, String str2) {
        this.key = str;
        this.uuid = str2;
    }

    public final boolean equals(Object obj) {
        ResourceId resourceId;
        String str;
        if (!(obj instanceof ResourceId)) {
            return false;
        }
        String str2 = this.key;
        String str3 = this.uuid;
        return (str3 == null || StringsKt.isBlank(str3) || (str = (resourceId = (ResourceId) obj).uuid) == null || StringsKt.isBlank(str)) ? str2.equals(((ResourceId) obj).key) : str3.equals(str) && str2.equals(resourceId.key);
    }

    public final int hashCode() {
        return this.key.hashCode();
    }
}
