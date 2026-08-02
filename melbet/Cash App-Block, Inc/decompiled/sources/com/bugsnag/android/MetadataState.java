package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.StateObserver;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MetadataState extends BaseObservable {
    public final Metadata metadata;

    public MetadataState(Metadata metadata) {
        this.metadata = metadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MetadataState) && Intrinsics.areEqual(this.metadata, ((MetadataState) obj).metadata);
    }

    public final int hashCode() {
        return this.metadata.store.hashCode();
    }

    public final void notifyClear(String str, String str2) {
        if (str2 == null) {
            if (getObservers$bugsnag_android_core_release().isEmpty()) {
                return;
            }
            StateEvent.ClearMetadataSection clearMetadataSection = new StateEvent.ClearMetadataSection(str);
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((StateObserver) it.next()).onStateChange(clearMetadataSection);
            }
            return;
        }
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        StateEvent.ClearMetadataValue clearMetadataValue = new StateEvent.ClearMetadataValue(str, str2);
        Iterator<T> it2 = getObservers$bugsnag_android_core_release().iterator();
        while (it2.hasNext()) {
            ((StateObserver) it2.next()).onStateChange(clearMetadataValue);
        }
    }

    public final void notifyMetadataAdded(String str, String str2, Object obj) {
        if (obj == null) {
            notifyClear(str, str2);
            return;
        }
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        Map map = (Map) this.metadata.store.get(str);
        StateEvent.AddMetadata addMetadata = new StateEvent.AddMetadata(str, str2, map != null ? map.get(str2) : null);
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((StateObserver) it.next()).onStateChange(addMetadata);
        }
    }

    public final String toString() {
        return "MetadataState(metadata=" + this.metadata + ')';
    }
}
