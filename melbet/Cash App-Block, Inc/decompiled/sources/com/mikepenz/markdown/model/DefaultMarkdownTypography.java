package com.mikepenz.markdown.model;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes4.dex */
public final class DefaultMarkdownTypography {
    public final TextStyle bullet;
    public final TextStyle code;
    public final TextStyle h1;
    public final TextStyle h2;
    public final TextStyle h3;
    public final TextStyle h4;
    public final TextStyle h5;
    public final TextStyle h6;
    public final TextStyle inlineCode;
    public final TextStyle list;
    public final TextStyle ordered;
    public final TextStyle paragraph;
    public final TextStyle quote;
    public final TextStyle table;
    public final TextStyle text;
    public final TextLinkStyles textLink;

    public DefaultMarkdownTypography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextLinkStyles textLinkStyles, TextStyle textStyle15) {
        this.h1 = textStyle;
        this.h2 = textStyle2;
        this.h3 = textStyle3;
        this.h4 = textStyle4;
        this.h5 = textStyle5;
        this.h6 = textStyle6;
        this.text = textStyle7;
        this.code = textStyle8;
        this.inlineCode = textStyle9;
        this.quote = textStyle10;
        this.paragraph = textStyle11;
        this.ordered = textStyle12;
        this.bullet = textStyle13;
        this.list = textStyle14;
        this.textLink = textLinkStyles;
        this.table = textStyle15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultMarkdownTypography)) {
            return false;
        }
        DefaultMarkdownTypography defaultMarkdownTypography = (DefaultMarkdownTypography) obj;
        return this.h1.equals(defaultMarkdownTypography.h1) && this.h2.equals(defaultMarkdownTypography.h2) && this.h3.equals(defaultMarkdownTypography.h3) && this.h4.equals(defaultMarkdownTypography.h4) && this.h5.equals(defaultMarkdownTypography.h5) && this.h6.equals(defaultMarkdownTypography.h6) && this.text.equals(defaultMarkdownTypography.text) && this.code.equals(defaultMarkdownTypography.code) && this.inlineCode.equals(defaultMarkdownTypography.inlineCode) && this.quote.equals(defaultMarkdownTypography.quote) && this.paragraph.equals(defaultMarkdownTypography.paragraph) && this.ordered.equals(defaultMarkdownTypography.ordered) && this.bullet.equals(defaultMarkdownTypography.bullet) && this.list.equals(defaultMarkdownTypography.list) && this.textLink.equals(defaultMarkdownTypography.textLink) && this.table.equals(defaultMarkdownTypography.table);
    }

    public final int hashCode() {
        return this.table.hashCode() + ((this.textLink.hashCode() + Recorder$$ExternalSyntheticOutline1.m(this.list, Recorder$$ExternalSyntheticOutline1.m(this.bullet, Recorder$$ExternalSyntheticOutline1.m(this.ordered, Recorder$$ExternalSyntheticOutline1.m(this.paragraph, Recorder$$ExternalSyntheticOutline1.m(this.quote, Recorder$$ExternalSyntheticOutline1.m(this.inlineCode, Recorder$$ExternalSyntheticOutline1.m(this.code, Recorder$$ExternalSyntheticOutline1.m(this.text, Recorder$$ExternalSyntheticOutline1.m(this.h6, Recorder$$ExternalSyntheticOutline1.m(this.h5, Recorder$$ExternalSyntheticOutline1.m(this.h4, Recorder$$ExternalSyntheticOutline1.m(this.h3, Recorder$$ExternalSyntheticOutline1.m(this.h2, this.h1.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultMarkdownTypography(h1=");
        sb.append(this.h1);
        sb.append(", h2=");
        sb.append(this.h2);
        sb.append(", h3=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.h3, ", h4=", this.h4, ", h5=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.h5, ", h6=", this.h6, ", text=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.text, ", code=", this.code, ", inlineCode=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.inlineCode, ", quote=", this.quote, ", paragraph=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.paragraph, ", ordered=", this.ordered, ", bullet=");
        SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.bullet, ", list=", this.list, ", textLink=");
        sb.append(this.textLink);
        sb.append(", table=");
        sb.append(this.table);
        sb.append(")");
        return sb.toString();
    }
}
