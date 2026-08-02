package com.google.android.datatransport.runtime;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.internal.SubtreeManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AutoValue_EventInternal {
    public final Map autoMetadata;
    public final Integer code;
    public final EncodedPayload encodedPayload;
    public final long eventMillis;
    public final Integer productId;
    public final String transportName;
    public final long uptimeMillis;

    public AutoValue_EventInternal(String str, Integer num, EncodedPayload encodedPayload, long j, long j2, HashMap hashMap, Integer num2) {
        this.transportName = str;
        this.code = num;
        this.encodedPayload = encodedPayload;
        this.eventMillis = j;
        this.uptimeMillis = j2;
        this.autoMetadata = hashMap;
        this.productId = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_EventInternal) {
            AutoValue_EventInternal autoValue_EventInternal = (AutoValue_EventInternal) obj;
            if (this.transportName.equals(autoValue_EventInternal.transportName)) {
                Integer num = autoValue_EventInternal.code;
                Integer num2 = this.code;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.encodedPayload.equals(autoValue_EventInternal.encodedPayload) && this.eventMillis == autoValue_EventInternal.eventMillis && this.uptimeMillis == autoValue_EventInternal.uptimeMillis && this.autoMetadata.equals(autoValue_EventInternal.autoMetadata)) {
                        Integer num3 = autoValue_EventInternal.productId;
                        Integer num4 = this.productId;
                        if (num4 != null ? num4.equals(num3) : num3 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String get(String str) {
        String str2 = (String) this.autoMetadata.get(str);
        return str2 == null ? "" : str2;
    }

    public final int getInteger(String str) {
        String str2 = (String) this.autoMetadata.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final int hashCode() {
        int hashCode = (this.transportName.hashCode() ^ 1000003) * 1000003;
        Integer num = this.code;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.encodedPayload.hashCode()) * 1000003;
        long j = this.eventMillis;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.uptimeMillis;
        int hashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.autoMetadata.hashCode()) * 1000003;
        Integer num2 = this.productId;
        return hashCode3 ^ (num2 != null ? num2.hashCode() : 0);
    }

    public final SubtreeManager toBuilder() {
        SubtreeManager subtreeManager = new SubtreeManager();
        String str = this.transportName;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null transportName");
            return null;
        }
        subtreeManager.snapshotCache = str;
        subtreeManager.contextForChildren = this.code;
        subtreeManager.children = this.productId;
        EncodedPayload encodedPayload = this.encodedPayload;
        if (encodedPayload == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null encodedPayload");
            return null;
        }
        subtreeManager.emitActionToParent = encodedPayload;
        subtreeManager.workflowSession = Long.valueOf(this.eventMillis);
        subtreeManager.interceptor = Long.valueOf(this.uptimeMillis);
        subtreeManager.idCounter = new HashMap(this.autoMetadata);
        return subtreeManager;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventInternal{transportName=");
        sb.append(this.transportName);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", encodedPayload=");
        sb.append(this.encodedPayload);
        sb.append(", eventMillis=");
        sb.append(this.eventMillis);
        sb.append(", uptimeMillis=");
        sb.append(this.uptimeMillis);
        sb.append(", autoMetadata=");
        sb.append(this.autoMetadata);
        sb.append(", productId=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.productId, "}");
    }
}
