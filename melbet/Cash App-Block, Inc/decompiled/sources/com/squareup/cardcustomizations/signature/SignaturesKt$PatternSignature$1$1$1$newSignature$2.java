package com.squareup.cardcustomizations.signature;

import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes5.dex */
public final /* synthetic */ class SignaturesKt$PatternSignature$1$1$1$newSignature$2 extends AdaptedFunctionReference implements Function2 {
    public static final SignaturesKt$PatternSignature$1$1$1$newSignature$2 INSTANCE = new SignaturesKt$PatternSignature$1$1$1$newSignature$2(2, DouglasPeuckerStrokeSimplifier.class, "<init>", "<init>(Landroid/graphics/Canvas;Landroid/graphics/Paint;Z)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Canvas canvas = (Canvas) obj;
        Paint paint = (Paint) obj2;
        canvas.getClass();
        paint.getClass();
        return new DouglasPeuckerStrokeSimplifier(canvas, paint, false, 4, null);
    }
}
