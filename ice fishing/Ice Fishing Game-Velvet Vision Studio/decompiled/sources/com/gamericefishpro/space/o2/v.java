package com.gamericefishpro.space.o2;

import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final String a;
    public final Function2 b;
    public final boolean c;

    public v(String str, Function2 function2) {
        this.a = str;
        this.b = function2;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ v(String str) {
        this(str, j.M);
    }

    public v(String str, int i) {
        this(str);
        this.c = true;
    }

    public v(String str, boolean z, Function2 function2) {
        this(str, function2);
        this.c = z;
    }
}
