package com.gamericefishpro.space.f5;

import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final com.gamericefishpro.space.r8.m a;

    public l(k entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.a = new com.gamericefishpro.space.r8.m(entry, entry.e.e.a);
    }

    public final k a(com.gamericefishpro.space.b9.b context, x destination, com.gamericefishpro.space.z4.p hostLifecycleState, p pVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        com.gamericefishpro.space.r8.m mVar = this.a;
        Bundle args = (Bundle) mVar.c;
        if (args != null) {
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(context, "context");
            Context context2 = context.a;
            args.setClassLoader(context2 != null ? context2.getClassLoader() : null);
        } else {
            args = null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        String id = (String) mVar.b;
        Bundle bundle = (Bundle) mVar.d;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Intrinsics.checkNotNullParameter(id, "id");
        return new k(context, destination, args, hostLifecycleState, pVar, id, bundle);
    }

    public final Bundle b() {
        com.gamericefishpro.space.r8.m mVar = this.a;
        mVar.getClass();
        com.gamericefishpro.space.ph.m0.c();
        Bundle source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        String value = (String) mVar.b;
        Intrinsics.checkNotNullParameter("nav-entry-state:id", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        source.putString("nav-entry-state:id", value);
        int i = mVar.a;
        Intrinsics.checkNotNullParameter("nav-entry-state:destination-id", "key");
        source.putInt("nav-entry-state:destination-id", i);
        Bundle source2 = (Bundle) mVar.c;
        if (source2 == null) {
            com.gamericefishpro.space.ph.m0.c();
            source2 = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Intrinsics.checkNotNullParameter(source2, "source");
        }
        com.gamericefishpro.space.z5.f.b(source, "nav-entry-state:args", source2);
        com.gamericefishpro.space.z5.f.b(source, "nav-entry-state:saved-state", (Bundle) mVar.d);
        return source;
    }

    public l(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        state.setClassLoader(l.class.getClassLoader());
        this.a = new com.gamericefishpro.space.r8.m(state);
    }
}
