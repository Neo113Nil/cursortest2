package coil3.compose;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import coil3.Extras;
import coil3.Image;
import com.squareup.wire.GrpcMethod;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class ImagePainter extends Painter {
    public final Image image;

    public ImagePainter(Image image) {
        this.image = image;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo759getIntrinsicSizeNHjbRc() {
        Image image = this.image;
        int width = image.getWidth();
        float f = width > 0 ? width : Float.NaN;
        return (Float.floatToRawIntBits(image.getHeight() > 0 ? r6 : Float.NaN) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        Image image = this.image;
        int width = image.getWidth();
        float intBitsToFloat = width > 0 ? Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) / width : 1.0f;
        int height = image.getHeight();
        float intBitsToFloat2 = height > 0 ? Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / height : 1.0f;
        GrpcMethod drawContext = drawScope.getDrawContext();
        long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            ((Extras.Key) drawContext.path).m1437scale0AR0LA0(intBitsToFloat, intBitsToFloat2, 0L);
            image.draw(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()));
        } finally {
            Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
        }
    }
}
