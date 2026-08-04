package com.gamericefishpro.space.z4;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements com.gamericefishpro.space.z5.d {
    public final com.gamericefishpro.space.u6.s a;
    public boolean b;
    public Bundle c;
    public final com.gamericefishpro.space.oh.s d;

    public n0(com.gamericefishpro.space.u6.s savedStateRegistry, y0 viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.a = savedStateRegistry;
        this.d = com.gamericefishpro.space.oh.i.b(new com.gamericefishpro.space.a3.b(23, viewModelStoreOwner));
    }

    @Override // com.gamericefishpro.space.z5.d
    public final Bundle a() {
        com.gamericefishpro.space.ph.m0.c();
        Bundle source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        Bundle from = this.c;
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
        }
        for (Map.Entry entry : ((o0) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle source2 = ((com.gamericefishpro.space.b5.a) ((j0) entry.getValue()).b.w).a();
            Intrinsics.checkNotNullParameter(source2, "source");
            if (!source2.isEmpty()) {
                com.gamericefishpro.space.z5.f.b(source, str, source2);
            }
        }
        this.b = false;
        return source;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle from = this.a.f("androidx.lifecycle.internal.SavedStateHandlesProvider");
        com.gamericefishpro.space.ph.m0.c();
        Bundle source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        Bundle from2 = this.c;
        if (from2 != null) {
            Intrinsics.checkNotNullParameter(from2, "from");
            source.putAll(from2);
        }
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
        }
        this.c = source;
        this.b = true;
    }
}
