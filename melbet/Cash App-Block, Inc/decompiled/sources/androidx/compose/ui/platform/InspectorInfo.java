package androidx.compose.ui.platform;

import kotlin.io.LinesSequence;

/* loaded from: classes3.dex */
public final class InspectorInfo {
    public String name;
    public final LinesSequence properties = new LinesSequence();
    public Object value;

    public final String getName() {
        return this.name;
    }

    public final LinesSequence getProperties() {
        return this.properties;
    }

    public final Object getValue() {
        return this.value;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }
}
