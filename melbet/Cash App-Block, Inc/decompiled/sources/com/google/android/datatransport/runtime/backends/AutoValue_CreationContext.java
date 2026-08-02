package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.runtime.time.Clock;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class AutoValue_CreationContext extends CreationContext {
    public final Context applicationContext;
    public final String backendName;
    public final Clock monotonicClock;
    public final Clock wallClock;

    public AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        if (context == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null applicationContext");
            throw null;
        }
        this.applicationContext = context;
        if (clock == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null wallClock");
            throw null;
        }
        this.wallClock = clock;
        if (clock2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null monotonicClock");
            throw null;
        }
        this.monotonicClock = clock2;
        if (str != null) {
            this.backendName = str;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreationContext) {
            AutoValue_CreationContext autoValue_CreationContext = (AutoValue_CreationContext) ((CreationContext) obj);
            if (this.applicationContext.equals(autoValue_CreationContext.applicationContext) && this.wallClock.equals(autoValue_CreationContext.wallClock) && this.monotonicClock.equals(autoValue_CreationContext.monotonicClock) && this.backendName.equals(autoValue_CreationContext.backendName)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.backendName.hashCode() ^ ((((((this.applicationContext.hashCode() ^ 1000003) * 1000003) ^ this.wallClock.hashCode()) * 1000003) ^ this.monotonicClock.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.applicationContext);
        sb.append(", wallClock=");
        sb.append(this.wallClock);
        sb.append(", monotonicClock=");
        sb.append(this.monotonicClock);
        sb.append(", backendName=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.backendName, "}");
    }
}
