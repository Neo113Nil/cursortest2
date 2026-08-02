package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.text.TextStyle;

/* loaded from: classes3.dex */
public final class Typography {
    public final TextStyle body1;
    public final TextStyle body2;
    public final TextStyle button;
    public final TextStyle caption;
    public final TextStyle h1;
    public final TextStyle h2;
    public final TextStyle h3;
    public final TextStyle h4;
    public final TextStyle h5;
    public final TextStyle h6;
    public final TextStyle overline;
    public final TextStyle subtitle1;
    public final TextStyle subtitle2;

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this.h1 = textStyle;
        this.h2 = textStyle2;
        this.h3 = textStyle3;
        this.h4 = textStyle4;
        this.h5 = textStyle5;
        this.h6 = textStyle6;
        this.subtitle1 = textStyle7;
        this.subtitle2 = textStyle8;
        this.body1 = textStyle9;
        this.body2 = textStyle10;
        this.button = textStyle11;
        this.caption = textStyle12;
        this.overline = textStyle13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        return this.h1.equals(typography.h1) && this.h2.equals(typography.h2) && this.h3.equals(typography.h3) && this.h4.equals(typography.h4) && this.h5.equals(typography.h5) && this.h6.equals(typography.h6) && this.subtitle1.equals(typography.subtitle1) && this.subtitle2.equals(typography.subtitle2) && this.body1.equals(typography.body1) && this.body2.equals(typography.body2) && this.button.equals(typography.button) && this.caption.equals(typography.caption) && this.overline.equals(typography.overline);
    }

    public final int hashCode() {
        return this.overline.hashCode() + Recorder$$ExternalSyntheticOutline1.m(this.caption, Recorder$$ExternalSyntheticOutline1.m(this.button, Recorder$$ExternalSyntheticOutline1.m(this.body2, Recorder$$ExternalSyntheticOutline1.m(this.body1, Recorder$$ExternalSyntheticOutline1.m(this.subtitle2, Recorder$$ExternalSyntheticOutline1.m(this.subtitle1, Recorder$$ExternalSyntheticOutline1.m(this.h6, Recorder$$ExternalSyntheticOutline1.m(this.h5, Recorder$$ExternalSyntheticOutline1.m(this.h4, Recorder$$ExternalSyntheticOutline1.m(this.h3, Recorder$$ExternalSyntheticOutline1.m(this.h2, this.h1.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Typography(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }
}
