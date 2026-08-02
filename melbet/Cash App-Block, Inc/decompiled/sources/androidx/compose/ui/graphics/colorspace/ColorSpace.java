package androidx.compose.ui.graphics.colorspace;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class ColorSpace {
    public final int id;
    public final long model;
    public final String name;

    public ColorSpace(String str, long j, int i) {
        this.name = str;
        this.model = j;
        this.id = i;
        if (str.length() == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            a$$ExternalSyntheticBUOutline0.m$3("The id must be between -1 and 63");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.id == colorSpace.id && this.name.equals(colorSpace.name)) {
            return Illuminant.m719equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    public abstract float getMaxValue(int i);

    public abstract float getMinValue(int i);

    public int hashCode() {
        return Recorder$$ExternalSyntheticOutline2.m(this.name.hashCode() * 31, 31, this.model) + this.id;
    }

    public boolean isSrgb() {
        return false;
    }

    public final String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) Illuminant.m720toStringimpl(this.model)) + ')';
    }

    public abstract long toXy$ui_graphics(float f, float f2, float f3);

    public abstract float toZ$ui_graphics(float f, float f2, float f3);

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics, reason: not valid java name */
    public abstract long mo716xyzaToColorJlNiLsg$ui_graphics(float f, float f2, float f3, float f4, ColorSpace colorSpace);
}
