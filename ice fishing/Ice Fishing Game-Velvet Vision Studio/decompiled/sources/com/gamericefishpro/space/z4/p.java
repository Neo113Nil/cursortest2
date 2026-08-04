package com.gamericefishpro.space.z4;

import com.gamericefishpro.space.i9.a4;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final p d;
    public static final p e;
    public static final p i;
    public static final p v;
    public static final p w;
    public static final /* synthetic */ p[] y;

    static {
        p pVar = new p("DESTROYED", 0);
        d = pVar;
        p pVar2 = new p("INITIALIZED", 1);
        e = pVar2;
        p pVar3 = new p("CREATED", 2);
        i = pVar3;
        p pVar4 = new p("STARTED", 3);
        v = pVar4;
        p pVar5 = new p("RESUMED", 4);
        w = pVar5;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5};
        y = pVarArr;
        a4.t(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) y.clone();
    }

    public final boolean a(p state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return compareTo(state) >= 0;
    }
}
