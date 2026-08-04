package com.gamericefishpro.space.e1;

import android.os.Bundle;
import com.gamericefishpro.space.u6.s;
import com.gamericefishpro.space.z4.w;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f, com.gamericefishpro.space.z5.e {
    public final /* synthetic */ g d;
    public w e;
    public com.gamericefishpro.space.u6.c i;

    public i(g gVar) {
        this.d = gVar;
        Object objE = gVar.e("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objE instanceof Bundle ? (Bundle) objE : null;
        if (bundle != null) {
            h(bundle);
        }
        gVar.f("androidx.savedstate.SavedStateRegistry", new com.gamericefishpro.space.a3.b(3, this));
    }

    @Override // com.gamericefishpro.space.z5.e
    public final s b() {
        return (s) h(null).e;
    }

    @Override // com.gamericefishpro.space.e1.f
    public final boolean c(Object obj) {
        return this.d.c(obj);
    }

    @Override // com.gamericefishpro.space.e1.f
    public final Map d() {
        return this.d.d();
    }

    @Override // com.gamericefishpro.space.e1.f
    public final Object e(String str) {
        return this.d.e(str);
    }

    @Override // com.gamericefishpro.space.e1.f
    public final e f(String str, Function0 function0) {
        return this.d.f(str, function0);
    }

    @Override // com.gamericefishpro.space.z4.u
    public final w g() {
        w wVar = this.e;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.checkNotNullParameter(this, "owner");
        w wVar2 = new w(this, false);
        this.e = wVar2;
        return wVar2;
    }

    public final com.gamericefishpro.space.u6.c h(Bundle bundle) {
        com.gamericefishpro.space.u6.c cVar = this.i;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.checkNotNullParameter(this, "owner");
        com.gamericefishpro.space.u6.c cVar2 = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.b6.b(this, new com.gamericefishpro.space.a3.b(24, this)));
        this.i = cVar2;
        cVar2.p(bundle);
        return cVar2;
    }
}
