package com.mikepenz.markdown.compose;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes5.dex */
public final /* synthetic */ class ComposeLocalKt$$ExternalSyntheticLambda14 {
    public final /* synthetic */ int $r8$classId;

    public final String transform(MarkdownElementType markdownElementType, int i, int i2) {
        int i3 = this.$r8$classId;
        markdownElementType.getClass();
        switch (i3) {
            case 0:
                return "• ";
            default:
                return Boxes$$ExternalSyntheticOutline1.m(i2 + i, ". ");
        }
    }
}
