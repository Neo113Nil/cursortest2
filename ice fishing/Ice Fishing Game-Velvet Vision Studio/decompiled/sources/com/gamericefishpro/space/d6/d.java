package com.gamericefishpro.space.d6;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final Context a;
    public final String b;
    public final c c;
    public final boolean d;
    public final boolean e;

    public d(Context context, String str, c callback, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a = context;
        this.b = str;
        this.c = callback;
        this.d = z;
        this.e = z2;
    }
}
