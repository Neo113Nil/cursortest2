package androidx.compose.ui.graphics.painter;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.util.cash.Countries;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class BitmapPainter extends Painter {
    public float alpha;
    public ColorFilter colorFilter;
    public int filterQuality;
    public final AndroidImageBitmap image;
    public final long size;
    public final long srcSize;

    public BitmapPainter(AndroidImageBitmap androidImageBitmap, long j) {
        int i;
        this.image = androidImageBitmap;
        this.srcSize = j;
        this.filterQuality = 1;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (BodyPartID.bodyIdMax & j)) < 0 || i2 > androidImageBitmap.bitmap.getWidth() || i > androidImageBitmap.bitmap.getHeight()) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }
        this.size = j;
        this.alpha = 1.0f;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return Intrinsics.areEqual(this.image, bitmapPainter.image) && IntOffset.m1047equalsimpl0(0L, 0L) && IntSize.m1055equalsimpl0(this.srcSize, bitmapPainter.srcSize) && this.filterQuality == bitmapPainter.filterQuality;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public final long mo759getIntrinsicSizeNHjbRc() {
        return Countries.m3991toSizeozmzZPI(this.size);
    }

    public final int hashCode() {
        return Integer.hashCode(this.filterQuality) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.image.hashCode() * 31, 31, 0L), 31, this.srcSize);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        DrawScope.m739drawImageAZ2fEMs$default(drawScope, this.image, this.srcSize, 0L, (Math.round(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax), this.alpha, this.colorFilter, 0, this.filterQuality, EnumC0170g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE);
    }

    public final String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) IntOffset.m1050toStringimpl(0L)) + ", srcSize=" + ((Object) IntSize.m1056toStringimpl(this.srcSize)) + ", filterQuality=" + ((Object) FilterQuality.m698toStringimpl(this.filterQuality)) + ')';
    }

    public BitmapPainter(AndroidImageBitmap androidImageBitmap) {
        this(androidImageBitmap, (androidImageBitmap.bitmap.getHeight() & BodyPartID.bodyIdMax) | (androidImageBitmap.bitmap.getWidth() << 32));
    }
}
