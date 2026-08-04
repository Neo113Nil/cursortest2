package com.gamericefishpro.space.w4;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import com.gamericefishpro.space.ka.a0;
import com.gamericefishpro.space.u6.s;
import com.gamericefishpro.space.z4.b0;
import com.gamericefishpro.space.z4.m0;
import com.gamericefishpro.space.z4.u;
import com.gamericefishpro.space.z4.u0;
import com.gamericefishpro.space.z4.w;
import com.gamericefishpro.space.z4.x0;
import com.gamericefishpro.space.z4.y0;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class g implements ComponentCallbacks, View.OnCreateContextMenuListener, u, y0, com.gamericefishpro.space.z4.k, com.gamericefishpro.space.z5.e {
    public static final Object D = new Object();
    public com.gamericefishpro.space.u6.c A;
    public final ArrayList B;
    public final com.gamericefishpro.space.tb.u C;
    public final int d = -1;
    public final String e = UUID.randomUUID().toString();
    public final a0 i = new a0(1);
    public final boolean v = true;
    public f w;
    public final com.gamericefishpro.space.z4.p y;
    public w z;

    public g() {
        new com.gamericefishpro.space.h4.b(27, this);
        this.y = com.gamericefishpro.space.z4.p.w;
        new b0();
        new AtomicInteger();
        this.B = new ArrayList();
        this.C = new com.gamericefishpro.space.tb.u(23, this);
        this.z = new w(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.A = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.b6.b(this, new com.gamericefishpro.space.a3.b(24, this)));
        ArrayList arrayList = this.B;
        com.gamericefishpro.space.tb.u uVar = this.C;
        if (arrayList.contains(uVar)) {
            return;
        }
        if (this.d < 0) {
            arrayList.add(uVar);
            return;
        }
        g gVar = (g) uVar.e;
        gVar.A.o();
        m0.d(gVar);
        gVar.A.p(null);
    }

    @Override // com.gamericefishpro.space.z5.e
    public final s b() {
        return (s) this.A.e;
    }

    public final int c() {
        com.gamericefishpro.space.z4.p pVar = com.gamericefishpro.space.z4.p.d;
        return this.y.ordinal();
    }

    @Override // com.gamericefishpro.space.z4.k
    public final u0 d() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // com.gamericefishpro.space.z4.k
    public final com.gamericefishpro.space.c5.c e() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // com.gamericefishpro.space.z4.y0
    public final x0 f() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // com.gamericefishpro.space.z4.u
    public final w g() {
        return this.z;
    }

    public final a0 h() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final View i() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
