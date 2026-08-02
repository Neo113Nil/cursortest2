package com.mikepenz.markdown.model;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class DefaultMarkdownPadding {
    public final float block;
    public final PaddingValuesImpl blockQuote;
    public final PaddingValues.Absolute blockQuoteBar;
    public final PaddingValuesImpl blockQuoteText;
    public final PaddingValuesImpl codeBlock;
    public final float listIndent;
    public final float listItemBottom;
    public final float listItemTop;

    public DefaultMarkdownPadding(float f, float f2, float f3, float f4, PaddingValuesImpl paddingValuesImpl, PaddingValuesImpl paddingValuesImpl2, PaddingValuesImpl paddingValuesImpl3, PaddingValues.Absolute absolute) {
        this.block = f;
        this.listItemTop = f2;
        this.listItemBottom = f3;
        this.listIndent = f4;
        this.codeBlock = paddingValuesImpl;
        this.blockQuote = paddingValuesImpl2;
        this.blockQuoteText = paddingValuesImpl3;
        this.blockQuoteBar = absolute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultMarkdownPadding)) {
            return false;
        }
        DefaultMarkdownPadding defaultMarkdownPadding = (DefaultMarkdownPadding) obj;
        return Dp.m1037equalsimpl0(this.block, defaultMarkdownPadding.block) && Dp.m1037equalsimpl0(4.0f, 4.0f) && Dp.m1037equalsimpl0(this.listItemTop, defaultMarkdownPadding.listItemTop) && Dp.m1037equalsimpl0(this.listItemBottom, defaultMarkdownPadding.listItemBottom) && Dp.m1037equalsimpl0(this.listIndent, defaultMarkdownPadding.listIndent) && this.codeBlock.equals(defaultMarkdownPadding.codeBlock) && this.blockQuote.equals(defaultMarkdownPadding.blockQuote) && this.blockQuoteText.equals(defaultMarkdownPadding.blockQuoteText) && this.blockQuoteBar.equals(defaultMarkdownPadding.blockQuoteBar);
    }

    public final int hashCode() {
        return this.blockQuoteBar.hashCode() + ((this.blockQuoteText.hashCode() + ((this.blockQuote.hashCode() + ((this.codeBlock.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.listIndent, CameraState$Type$EnumUnboxingLocalUtility.m(this.listItemBottom, CameraState$Type$EnumUnboxingLocalUtility.m(this.listItemTop, CameraState$Type$EnumUnboxingLocalUtility.m(4.0f, Float.hashCode(this.block) * 31, 31), 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.block);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(4.0f);
        String m1038toStringimpl3 = Dp.m1038toStringimpl(this.listItemTop);
        String m1038toStringimpl4 = Dp.m1038toStringimpl(this.listItemBottom);
        String m1038toStringimpl5 = Dp.m1038toStringimpl(this.listIndent);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DefaultMarkdownPadding(block=", m1038toStringimpl, ", list=", m1038toStringimpl2, ", listItemTop=");
        Boxes$$ExternalSyntheticOutline1.m(m, m1038toStringimpl3, ", listItemBottom=", m1038toStringimpl4, ", listIndent=");
        m.append(m1038toStringimpl5);
        m.append(", codeBlock=");
        m.append(this.codeBlock);
        m.append(", blockQuote=");
        m.append(this.blockQuote);
        m.append(", blockQuoteText=");
        m.append(this.blockQuoteText);
        m.append(", blockQuoteBar=");
        m.append(this.blockQuoteBar);
        m.append(")");
        return m.toString();
    }
}
