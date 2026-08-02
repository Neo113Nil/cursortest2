package com.yandex.passport.common.ui.view;

import android.widget.FrameLayout;
import defpackage.ezc;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class i extends ezc implements Function2 {
    public static final i a = new i(2, FrameLayout.LayoutParams.class, "<init>", "<init>(II)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new FrameLayout.LayoutParams(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
