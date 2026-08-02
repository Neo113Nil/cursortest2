package com.mikepenz.markdown.model;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes9.dex */
public final class DefaultMarkdownColors {
    public final long codeBackground;
    public final long dividerColor;
    public final long inlineCodeBackground;
    public final long tableBackground;
    public final long text;

    public DefaultMarkdownColors(long j, long j2, long j3, long j4, long j5) {
        this.text = j;
        this.codeBackground = j2;
        this.inlineCodeBackground = j3;
        this.dividerColor = j4;
        this.tableBackground = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultMarkdownColors)) {
            return false;
        }
        DefaultMarkdownColors defaultMarkdownColors = (DefaultMarkdownColors) obj;
        return Color.m676equalsimpl0(this.text, defaultMarkdownColors.text) && Color.m676equalsimpl0(this.codeBackground, defaultMarkdownColors.codeBackground) && Color.m676equalsimpl0(this.inlineCodeBackground, defaultMarkdownColors.inlineCodeBackground) && Color.m676equalsimpl0(this.dividerColor, defaultMarkdownColors.dividerColor) && Color.m676equalsimpl0(this.tableBackground, defaultMarkdownColors.tableBackground);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.tableBackground) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.text) * 31, 31, this.codeBackground), 31, this.inlineCodeBackground), 31, this.dividerColor);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.text);
        String m682toStringimpl2 = Color.m682toStringimpl(this.codeBackground);
        String m682toStringimpl3 = Color.m682toStringimpl(this.inlineCodeBackground);
        String m682toStringimpl4 = Color.m682toStringimpl(this.dividerColor);
        String m682toStringimpl5 = Color.m682toStringimpl(this.tableBackground);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DefaultMarkdownColors(text=", m682toStringimpl, ", codeBackground=", m682toStringimpl2, ", inlineCodeBackground=");
        Boxes$$ExternalSyntheticOutline1.m(m, m682toStringimpl3, ", dividerColor=", m682toStringimpl4, ", tableBackground=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, m682toStringimpl5, ")");
    }
}
