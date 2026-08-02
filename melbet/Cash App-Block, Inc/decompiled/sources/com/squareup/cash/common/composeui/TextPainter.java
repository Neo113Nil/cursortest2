package com.squareup.cash.common.composeui;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import coil3.Extras;
import com.squareup.wire.GrpcMethod;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class TextPainter extends Painter {
    public final long intrinsicSize;
    public final String text;
    public final TextMeasurer textMeasurer;
    public final TextStyle textStyle;

    public TextPainter(String str, TextMeasurer textMeasurer, TextStyle textStyle) {
        textMeasurer.getClass();
        this.text = str;
        this.textMeasurer = textMeasurer;
        this.textStyle = textStyle;
        this.intrinsicSize = 9205357640488583168L;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo759getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        drawScope.getClass();
        String str = this.text;
        if (str.length() == 0) {
            return;
        }
        drawScope.getDensity();
        long mo239toSpkPz2Gy4 = drawScope.mo239toSpkPz2Gy4(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f);
        TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(this.textStyle, 0L, mo239toSpkPz2Gy4, null, null, 0L, null, 0L, null, null, null, 0, mo239toSpkPz2Gy4, null, null, 0, 16646141);
        long j = TextMeasurer.m979measurewNUYSr0$default(this.textMeasurer, this.text, m994copyp1EtxEg$default, 0, 0L, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1).size;
        float intBitsToFloat = (Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - ((int) (j >> 32))) / 2.0f;
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - ((int) (j & BodyPartID.bodyIdMax))) / 2.0f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
        AnnotatedString annotatedString = new AnnotatedString(str);
        int i = (int) (floatToRawIntBits >> 32);
        int round = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - Float.intBitsToFloat(i)));
        if (round < 0) {
            round = 0;
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
        int i2 = (int) (BodyPartID.bodyIdMax & floatToRawIntBits);
        int round2 = Math.round((float) Math.ceil(intBitsToFloat3 - Float.intBitsToFloat(i2)));
        if (round2 < 0) {
            round2 = 0;
        }
        TextLayoutResult m980measurexDpz5zY$default = TextMeasurer.m980measurexDpz5zY$default(this.textMeasurer, annotatedString, m994copyp1EtxEg$default, true, Integer.MAX_VALUE, ConstraintsKt.Constraints(0, round, 0, round2), drawScope.getLayoutDirection(), drawScope, null, 1568);
        GrpcMethod drawContext = drawScope.getDrawContext();
        long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            Extras.Key key = (Extras.Key) drawContext.path;
            key.translate(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            TextPainterKt.clip(key, m980measurexDpz5zY$default);
            MultiParagraph.m964paintLG529CI$default(m980measurexDpz5zY$default.multiParagraph, drawScope.getDrawContext().getCanvas(), 0L, null, null, null, 30);
        } finally {
            Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
        }
    }
}
