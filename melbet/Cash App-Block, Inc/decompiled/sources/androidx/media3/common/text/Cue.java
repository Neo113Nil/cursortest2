package androidx.media3.common.text;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.media3.common.util.Util;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import java.util.Objects;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Cue {
    public static final String FIELD_BITMAP_BYTES;
    public static final String FIELD_BITMAP_HEIGHT;
    public static final String FIELD_BITMAP_PARCELABLE;
    public static final String FIELD_CUSTOM_SPANS;
    public static final String FIELD_LINE;
    public static final String FIELD_LINE_ANCHOR;
    public static final String FIELD_LINE_TYPE;
    public static final String FIELD_MULTI_ROW_ALIGNMENT;
    public static final String FIELD_POSITION;
    public static final String FIELD_POSITION_ANCHOR;
    public static final String FIELD_SHEAR_DEGREES;
    public static final String FIELD_SIZE;
    public static final String FIELD_TEXT;
    public static final String FIELD_TEXT_ALIGNMENT;
    public static final String FIELD_TEXT_SIZE;
    public static final String FIELD_TEXT_SIZE_TYPE;
    public static final String FIELD_VERTICAL_TYPE;
    public static final String FIELD_WINDOW_COLOR;
    public static final String FIELD_WINDOW_COLOR_SET;
    public static final String FIELD_Z_INDEX;
    public final Bitmap bitmap;
    public final float bitmapHeight;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final Layout.Alignment multiRowAlignment;
    public final float position;
    public final int positionAnchor;
    public final float shearDegrees;
    public final float size;
    public final CharSequence text;
    public final Layout.Alignment textAlignment;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final int windowColor;
    public final boolean windowColorSet;
    public final int zIndex;

    public final class Builder {
        public float shearDegrees;
        public int zIndex;
        public CharSequence text = null;
        public Bitmap bitmap = null;
        public Layout.Alignment textAlignment = null;
        public Layout.Alignment multiRowAlignment = null;
        public float line = -3.4028235E38f;
        public int lineType = PKIFailureInfo.systemUnavail;
        public int lineAnchor = PKIFailureInfo.systemUnavail;
        public float position = -3.4028235E38f;
        public int positionAnchor = PKIFailureInfo.systemUnavail;
        public int textSizeType = PKIFailureInfo.systemUnavail;
        public float textSize = -3.4028235E38f;
        public float size = -3.4028235E38f;
        public float bitmapHeight = -3.4028235E38f;
        public boolean windowColorSet = false;
        public int windowColor = -16777216;
        public int verticalType = PKIFailureInfo.systemUnavail;

        public final Cue build() {
            return new Cue(this.text, this.textAlignment, this.multiRowAlignment, this.bitmap, this.line, this.lineType, this.lineAnchor, this.position, this.positionAnchor, this.textSizeType, this.textSize, this.size, this.bitmapHeight, this.windowColorSet, this.windowColor, this.verticalType, this.shearDegrees, this.zIndex);
        }
    }

    static {
        new Cue("", null, null, null, -3.4028235E38f, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail, -3.4028235E38f, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, PKIFailureInfo.systemUnavail, RecyclerView.DECELERATION_RATE, 0);
        String str = Util.DEVICE_DEBUG_INFO;
        FIELD_TEXT = Integer.toString(0, 36);
        FIELD_CUSTOM_SPANS = Integer.toString(17, 36);
        FIELD_TEXT_ALIGNMENT = Integer.toString(1, 36);
        FIELD_MULTI_ROW_ALIGNMENT = Integer.toString(2, 36);
        FIELD_BITMAP_PARCELABLE = Integer.toString(3, 36);
        FIELD_BITMAP_BYTES = Integer.toString(18, 36);
        FIELD_LINE = Integer.toString(4, 36);
        FIELD_LINE_TYPE = Integer.toString(5, 36);
        FIELD_LINE_ANCHOR = Integer.toString(6, 36);
        FIELD_POSITION = Integer.toString(7, 36);
        FIELD_POSITION_ANCHOR = Integer.toString(8, 36);
        FIELD_TEXT_SIZE_TYPE = Integer.toString(9, 36);
        FIELD_TEXT_SIZE = Integer.toString(10, 36);
        FIELD_SIZE = Integer.toString(11, 36);
        FIELD_BITMAP_HEIGHT = Integer.toString(12, 36);
        FIELD_WINDOW_COLOR = Integer.toString(13, 36);
        FIELD_WINDOW_COLOR_SET = Integer.toString(14, 36);
        FIELD_VERTICAL_TYPE = Integer.toString(15, 36);
        FIELD_SHEAR_DEGREES = Integer.toString(16, 36);
        FIELD_Z_INDEX = Integer.toString(19, 36);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            Trace.checkArgument(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.text = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.text = charSequence.toString();
        } else {
            this.text = null;
        }
        this.textAlignment = alignment;
        this.multiRowAlignment = alignment2;
        this.bitmap = bitmap;
        this.line = f;
        this.lineType = i;
        this.lineAnchor = i2;
        this.position = f2;
        this.positionAnchor = i3;
        this.size = f4;
        this.bitmapHeight = f5;
        this.windowColorSet = z;
        this.windowColor = i5;
        this.textSizeType = i4;
        this.textSize = f3;
        this.verticalType = i6;
        this.shearDegrees = f6;
        this.zIndex = i7;
    }

    public final Builder buildUpon() {
        Builder builder = new Builder();
        builder.text = this.text;
        builder.bitmap = this.bitmap;
        builder.textAlignment = this.textAlignment;
        builder.multiRowAlignment = this.multiRowAlignment;
        builder.line = this.line;
        builder.lineType = this.lineType;
        builder.lineAnchor = this.lineAnchor;
        builder.position = this.position;
        builder.positionAnchor = this.positionAnchor;
        builder.textSizeType = this.textSizeType;
        builder.textSize = this.textSize;
        builder.size = this.size;
        builder.bitmapHeight = this.bitmapHeight;
        builder.windowColorSet = this.windowColorSet;
        builder.windowColor = this.windowColor;
        builder.verticalType = this.verticalType;
        builder.shearDegrees = this.shearDegrees;
        builder.zIndex = this.zIndex;
        return builder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Cue.class == obj.getClass()) {
            Cue cue = (Cue) obj;
            if (TextUtils.equals(this.text, cue.text) && this.textAlignment == cue.textAlignment && this.multiRowAlignment == cue.multiRowAlignment) {
                Bitmap bitmap = cue.bitmap;
                Bitmap bitmap2 = this.bitmap;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.line == cue.line && this.lineType == cue.lineType && this.lineAnchor == cue.lineAnchor && this.position == cue.position && this.positionAnchor == cue.positionAnchor && this.size == cue.size && this.bitmapHeight == cue.bitmapHeight && this.windowColorSet == cue.windowColorSet && this.windowColor == cue.windowColor && this.textSizeType == cue.textSizeType && this.textSize == cue.textSize && this.verticalType == cue.verticalType && this.shearDegrees == cue.shearDegrees && this.zIndex == cue.zIndex) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.text, this.textAlignment, this.multiRowAlignment, this.bitmap, Float.valueOf(this.line), Integer.valueOf(this.lineType), Integer.valueOf(this.lineAnchor), Float.valueOf(this.position), Integer.valueOf(this.positionAnchor), Float.valueOf(this.size), Float.valueOf(this.bitmapHeight), Boolean.valueOf(this.windowColorSet), Integer.valueOf(this.windowColor), Integer.valueOf(this.textSizeType), Float.valueOf(this.textSize), Integer.valueOf(this.verticalType), Float.valueOf(this.shearDegrees), Integer.valueOf(this.zIndex));
    }
}
