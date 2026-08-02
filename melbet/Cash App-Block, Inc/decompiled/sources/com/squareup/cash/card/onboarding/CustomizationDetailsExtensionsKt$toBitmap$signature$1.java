package com.squareup.cash.card.onboarding;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.squareup.cardcustomizations.signature.DouglasPeuckerStrokeSimplifier;
import com.squareup.cardcustomizations.signature.GlyphPainter;
import com.squareup.cardcustomizations.signature.Signature;

/* loaded from: classes5.dex */
public final class CustomizationDetailsExtensionsKt$toBitmap$signature$1 implements Signature.PainterProvider {
    @Override // com.squareup.cardcustomizations.signature.Signature.PainterProvider
    public final GlyphPainter createPainter(Canvas canvas, Paint paint) {
        paint.getClass();
        return new DouglasPeuckerStrokeSimplifier(canvas, paint, false);
    }
}
