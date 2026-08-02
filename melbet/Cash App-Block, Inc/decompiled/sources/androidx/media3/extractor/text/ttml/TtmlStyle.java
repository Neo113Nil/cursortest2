package androidx.media3.extractor.text.ttml;

import android.text.Layout;

/* loaded from: classes3.dex */
public final class TtmlStyle {
    public int backgroundColor;
    public String extent;
    public int fontColor;
    public String fontFamily;
    public float fontSize;
    public boolean hasBackgroundColor;
    public boolean hasFontColor;
    public String id;
    public Layout.Alignment multiRowAlign;
    public String origin;
    public Layout.Alignment textAlign;
    public TextEmphasis textEmphasis;
    public int linethrough = -1;
    public int underline = -1;
    public int bold = -1;
    public int italic = -1;
    public int fontSizeUnit = -1;
    public int rubyType = -1;
    public int rubyPosition = -1;
    public int textCombine = -1;
    public float shearPercentage = Float.MAX_VALUE;

    public final void chain(TtmlStyle ttmlStyle) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ttmlStyle != null) {
            if (!this.hasFontColor && ttmlStyle.hasFontColor) {
                this.fontColor = ttmlStyle.fontColor;
                this.hasFontColor = true;
            }
            if (this.bold == -1) {
                this.bold = ttmlStyle.bold;
            }
            if (this.italic == -1) {
                this.italic = ttmlStyle.italic;
            }
            if (this.fontFamily == null && (str = ttmlStyle.fontFamily) != null) {
                this.fontFamily = str;
            }
            if (this.linethrough == -1) {
                this.linethrough = ttmlStyle.linethrough;
            }
            if (this.underline == -1) {
                this.underline = ttmlStyle.underline;
            }
            if (this.rubyPosition == -1) {
                this.rubyPosition = ttmlStyle.rubyPosition;
            }
            if (this.textAlign == null && (alignment2 = ttmlStyle.textAlign) != null) {
                this.textAlign = alignment2;
            }
            if (this.multiRowAlign == null && (alignment = ttmlStyle.multiRowAlign) != null) {
                this.multiRowAlign = alignment;
            }
            if (this.textCombine == -1) {
                this.textCombine = ttmlStyle.textCombine;
            }
            if (this.fontSizeUnit == -1) {
                this.fontSizeUnit = ttmlStyle.fontSizeUnit;
                this.fontSize = ttmlStyle.fontSize;
            }
            if (this.textEmphasis == null) {
                this.textEmphasis = ttmlStyle.textEmphasis;
            }
            if (this.shearPercentage == Float.MAX_VALUE) {
                this.shearPercentage = ttmlStyle.shearPercentage;
            }
            if (this.origin == null) {
                this.origin = ttmlStyle.origin;
            }
            if (this.extent == null) {
                this.extent = ttmlStyle.extent;
            }
            if (!this.hasBackgroundColor && ttmlStyle.hasBackgroundColor) {
                this.backgroundColor = ttmlStyle.backgroundColor;
                this.hasBackgroundColor = true;
            }
            if (this.rubyType != -1 || (i = ttmlStyle.rubyType) == -1) {
                return;
            }
            this.rubyType = i;
        }
    }
}
