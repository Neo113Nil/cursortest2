package androidx.compose.runtime.tooling;

import java.util.List;

/* loaded from: classes3.dex */
public final class ComposeStackTrace {
    public final List frames;
    public final boolean hasSourceInformation;

    public ComposeStackTrace(List list, boolean z) {
        this.frames = list;
        this.hasSourceInformation = z;
    }
}
