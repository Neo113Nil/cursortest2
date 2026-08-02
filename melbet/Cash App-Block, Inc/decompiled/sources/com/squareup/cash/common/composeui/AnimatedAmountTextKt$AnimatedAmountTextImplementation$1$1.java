package com.squareup.cash.common.composeui;

import android.content.Context;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class AnimatedAmountTextKt$AnimatedAmountTextImplementation$1$1 extends FunctionReferenceImpl implements Function1 {
    public static final AnimatedAmountTextKt$AnimatedAmountTextImplementation$1$1 INSTANCE = new AnimatedAmountTextKt$AnimatedAmountTextImplementation$1$1(1, AnimatedAmountTextView.class, "<init>", "<init>(Landroid/content/Context;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        return new AnimatedAmountTextView(context);
    }
}
