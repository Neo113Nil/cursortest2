package com.squareup.cardcustomizations.signature;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.squareup.cardcustomizations.signature.Signature;
import kotlin.Function;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class SignaturesKt$sam$com_squareup_cardcustomizations_signature_Signature_PainterProvider$0 implements Signature.PainterProvider, FunctionAdapter {
    public final /* synthetic */ Function2 function;

    public SignaturesKt$sam$com_squareup_cardcustomizations_signature_Signature_PainterProvider$0(Function2 function2) {
        function2.getClass();
        this.function = function2;
    }

    @Override // com.squareup.cardcustomizations.signature.Signature.PainterProvider
    public final /* synthetic */ GlyphPainter createPainter(Canvas canvas, Paint paint) {
        return (GlyphPainter) this.function.invoke(canvas, paint);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Signature.PainterProvider) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
