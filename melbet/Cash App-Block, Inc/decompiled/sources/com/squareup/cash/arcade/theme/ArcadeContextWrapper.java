package com.squareup.cash.arcade.theme;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.functions.Function3;

/* loaded from: classes.dex */
public final class ArcadeContextWrapper extends ContextWrapper {
    public final Function3 colorTransform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeContextWrapper(Context context, Function3 function3) {
        super(context);
        context.getClass();
        this.colorTransform = function3;
    }
}
