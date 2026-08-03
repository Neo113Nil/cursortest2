package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m9333updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m9137getLengthimpl;
        int m9139getMinimpl = TextRange.m9139getMinimpl(j);
        int m9138getMaximpl = TextRange.m9138getMaximpl(j);
        if (TextRange.m9143intersects5zctL8(j2, j)) {
            if (TextRange.m9131contains5zctL8(j2, j)) {
                m9139getMinimpl = TextRange.m9139getMinimpl(j2);
                m9138getMaximpl = m9139getMinimpl;
            } else {
                if (TextRange.m9131contains5zctL8(j, j2)) {
                    m9137getLengthimpl = TextRange.m9137getLengthimpl(j2);
                } else if (TextRange.m9132containsimpl(j2, m9139getMinimpl)) {
                    m9139getMinimpl = TextRange.m9139getMinimpl(j2);
                    m9137getLengthimpl = TextRange.m9137getLengthimpl(j2);
                } else {
                    m9138getMaximpl = TextRange.m9139getMinimpl(j2);
                }
                m9138getMaximpl -= m9137getLengthimpl;
            }
        } else if (m9138getMaximpl > TextRange.m9139getMinimpl(j2)) {
            m9139getMinimpl -= TextRange.m9137getLengthimpl(j2);
            m9137getLengthimpl = TextRange.m9137getLengthimpl(j2);
            m9138getMaximpl -= m9137getLengthimpl;
        }
        return TextRangeKt.TextRange(m9139getMinimpl, m9138getMaximpl);
    }
}
