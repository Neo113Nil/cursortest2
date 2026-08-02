package androidx.compose.runtime.composer.gapbuffer;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class GapGroupSourceInformation {
    public ArrayList groups;

    public abstract boolean hasAnchor(GapAnchor gapAnchor);

    public abstract GapGroupSourceInformation openInformation();

    public abstract boolean removeAnchor(GapAnchor gapAnchor);
}
