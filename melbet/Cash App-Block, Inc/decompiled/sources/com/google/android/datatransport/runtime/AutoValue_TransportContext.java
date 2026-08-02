package com.google.android.datatransport.runtime;

import android.util.Base64;
import com.caverock.androidsvg.SVG;
import com.google.android.datatransport.Priority;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AutoValue_TransportContext {
    public final String backendName;
    public final byte[] extras;
    public final Priority priority;

    public AutoValue_TransportContext(String str, byte[] bArr, Priority priority) {
        this.backendName = str;
        this.extras = bArr;
        this.priority = priority;
    }

    public static SVG builder() {
        SVG svg = new SVG(25);
        svg.idToElementMap = Priority.DEFAULT;
        return svg;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_TransportContext) {
            AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) obj;
            if (this.backendName.equals(autoValue_TransportContext.backendName) && Arrays.equals(this.extras, autoValue_TransportContext.extras) && this.priority.equals(autoValue_TransportContext.priority)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.priority.hashCode() ^ ((((this.backendName.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.extras)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.extras;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.backendName);
        sb.append(", ");
        sb.append(this.priority);
        sb.append(", ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, encodeToString, ")");
    }
}
