package com.gamericefishpro.space.f5;

import com.gamericefishpro.space.h2.w1;
import com.gamericefishpro.space.t.s0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends y {
    public final q0 f;
    public final String g;
    public final ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(q0 provider) {
        super(provider.b(h.d(c0.class)), (String) null);
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter("splash", "startDestination");
        provider.getClass();
        Intrinsics.checkNotNullParameter(c0.class, "navigatorClass");
        this.h = new ArrayList();
        this.f = provider;
        this.g = "splash";
    }

    public final z h() {
        z zVar = (z) super.a();
        ArrayList nodes = this.h;
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        com.gamericefishpro.space.i5.j jVar = zVar.y;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        int size = nodes.size();
        int iHashCode = 0;
        int i = 0;
        while (i < size) {
            Object obj = nodes.get(i);
            i++;
            x node = (x) obj;
            if (node != null) {
                w1 w1Var = node.e;
                s0 s0Var = jVar.b;
                z zVar2 = jVar.a;
                w1 w1Var2 = zVar2.e;
                Intrinsics.checkNotNullParameter(node, "node");
                int i2 = w1Var.a;
                String str = (String) w1Var.e;
                if (i2 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = (String) w1Var2.e;
                if (str2 != null && Intrinsics.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + zVar2).toString());
                }
                if (i2 == w1Var2.a) {
                    throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + zVar2).toString());
                }
                x xVar = (x) s0Var.c(i2);
                if (xVar == node) {
                    continue;
                } else {
                    if (node.i != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (xVar != null) {
                        xVar.i = null;
                    }
                    node.i = zVar2;
                    s0Var.e(w1Var.a, node);
                }
            }
        }
        String startDestRoute = this.g;
        if (startDestRoute == null) {
            if (((String) this.b) != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        z zVar3 = jVar.a;
        if (startDestRoute != null) {
            if (startDestRoute.equals((String) zVar3.e.e)) {
                throw new IllegalArgumentException(("Start destination " + startDestRoute + " cannot use the same route as the graph " + zVar3).toString());
            }
            if (StringsKt.u(startDestRoute)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            int i3 = x.w;
            iHashCode = "android-app://androidx.navigation/".concat(startDestRoute).hashCode();
        }
        jVar.c = iHashCode;
        jVar.e = startDestRoute;
        return zVar;
    }
}
