package com.gamericefishpro.space.b6;

import android.os.Bundle;
import com.gamericefishpro.space.ka.f;
import com.gamericefishpro.space.z4.p;
import com.gamericefishpro.space.z5.e;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final e a;
    public final com.gamericefishpro.space.a3.b b;
    public final f c;
    public final LinkedHashMap d;
    public boolean e;
    public Bundle f;
    public boolean g;
    public boolean h;

    public b(e owner, com.gamericefishpro.space.a3.b onAttach) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onAttach, "onAttach");
        this.a = owner;
        this.b = onAttach;
        this.c = new f(1);
        this.d = new LinkedHashMap();
        this.h = true;
    }

    public final void a() {
        e eVar = this.a;
        if (eVar.g().c != p.e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.b.invoke();
        eVar.g().a(new a(0, this));
        this.e = true;
    }
}
