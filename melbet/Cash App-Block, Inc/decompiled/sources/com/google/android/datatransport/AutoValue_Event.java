package com.google.android.datatransport;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class AutoValue_Event {
    public final Object payload;
    public final Priority priority;
    public final AutoValue_ProductData productData;

    public AutoValue_Event(Object obj, Priority priority, AutoValue_ProductData autoValue_ProductData) {
        if (obj == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null payload");
            throw null;
        }
        this.payload = obj;
        this.priority = priority;
        this.productData = autoValue_ProductData;
    }

    public static AutoValue_Event ofData(Object obj, AutoValue_ProductData autoValue_ProductData) {
        return new AutoValue_Event(obj, Priority.DEFAULT, autoValue_ProductData);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_Event)) {
            return false;
        }
        AutoValue_Event autoValue_Event = (AutoValue_Event) obj;
        if (!this.payload.equals(autoValue_Event.payload) || !this.priority.equals(autoValue_Event.priority)) {
            return false;
        }
        AutoValue_ProductData autoValue_ProductData = autoValue_Event.productData;
        AutoValue_ProductData autoValue_ProductData2 = this.productData;
        return autoValue_ProductData2 == null ? autoValue_ProductData == null : autoValue_ProductData2.equals(autoValue_ProductData);
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.payload.hashCode()) * 1000003) ^ this.priority.hashCode()) * 1000003;
        AutoValue_ProductData autoValue_ProductData = this.productData;
        return (autoValue_ProductData == null ? 0 : autoValue_ProductData.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.payload + ", priority=" + this.priority + ", productData=" + this.productData + "}";
    }
}
