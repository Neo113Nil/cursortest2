package com.gamericefishpro.space.o1;

import android.graphics.Canvas;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final Canvas a = new Canvas();

    public static final Canvas a(q qVar) {
        Intrinsics.c(qVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((b) qVar).a;
    }
}
