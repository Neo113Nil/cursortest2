package androidx.compose.ui.node;

/* loaded from: classes.dex */
public final class MeasureAndLayoutDelegate$PostponedRequest {
    public final boolean isForced;
    public final boolean isLookahead;
    public final LayoutNode node;

    public MeasureAndLayoutDelegate$PostponedRequest(LayoutNode layoutNode, boolean z, boolean z2) {
        this.node = layoutNode;
        this.isLookahead = z;
        this.isForced = z2;
    }
}
