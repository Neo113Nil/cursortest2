package androidx.compose.ui.text;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.room.Room;

/* loaded from: classes3.dex */
public final class Bullet implements AnnotatedString.Annotation {
    public static final Bullet Default;
    public static final long DefaultIndentation = Room.pack(8589934592L, 1.0f);
    public final long height;
    public final long padding;
    public final long width;

    static {
        long pack = Room.pack(8589934592L, 0.25f);
        Default = new Bullet(pack, pack, Room.pack(8589934592L, 0.25f));
    }

    public Bullet(long j, long j2, long j3) {
        this.width = j;
        this.height = j2;
        this.padding = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Bullet)) {
            return false;
        }
        Bullet bullet = (Bullet) obj;
        if (!TextUnit.m1057equalsimpl0(this.width, bullet.width) || !TextUnit.m1057equalsimpl0(this.height, bullet.height)) {
            return false;
        }
        TextUnit.m1057equalsimpl0(this.padding, bullet.padding);
        return false;
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m960getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPadding-XSAIIZE, reason: not valid java name */
    public final long m961getPaddingXSAIIZE() {
        return this.padding;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m962getWidthXSAIIZE() {
        return this.width;
    }

    public final int hashCode() {
        int hashCode = CircleShape.INSTANCE.hashCode() * 31;
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        return Fill.INSTANCE.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(Float.NaN, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.width), 31, this.height), 961, this.padding), 31);
    }

    public final String toString() {
        return "Bullet(shape=" + CircleShape.INSTANCE + ", size=(" + ((Object) TextUnit.m1061toStringimpl(this.width)) + ", " + ((Object) TextUnit.m1061toStringimpl(this.height)) + "), padding=" + ((Object) TextUnit.m1061toStringimpl(this.padding)) + ", brush=null, alpha=NaN, drawStyle=" + Fill.INSTANCE + ')';
    }
}
