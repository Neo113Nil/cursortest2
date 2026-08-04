package com.gamericefishpro.space.f5;

import com.gamericefishpro.space.t0.y0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(p0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        String name = h.d(navigator.getClass());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.a;
        p0 p0Var = (p0) linkedHashMap.get(name);
        if (Intrinsics.a(p0Var, navigator)) {
            return;
        }
        if (p0Var != null && p0Var.b) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + p0Var).toString());
        }
        if (!navigator.b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final p0 b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name == null || name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        p0 p0Var = (p0) this.a.get(name);
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException(y0.g("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
