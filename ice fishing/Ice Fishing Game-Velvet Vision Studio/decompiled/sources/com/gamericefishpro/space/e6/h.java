package com.gamericefishpro.space.e6;

import android.content.Context;
import com.gamericefishpro.space.oh.s;
import com.gamericefishpro.space.oh.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements com.gamericefishpro.space.d6.f {
    public final Context d;
    public final String e;
    public final com.gamericefishpro.space.d6.c i;
    public final boolean v;
    public final boolean w;
    public final s y;
    public boolean z;

    public h(Context context, String str, com.gamericefishpro.space.d6.c callback, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.d = context;
        this.e = str;
        this.i = callback;
        this.v = z;
        this.w = z2;
        this.y = com.gamericefishpro.space.oh.i.b(new com.gamericefishpro.space.a3.b(4, this));
    }

    @Override // com.gamericefishpro.space.d6.f
    public final com.gamericefishpro.space.d6.b L() {
        return ((g) this.y.getValue()).b(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.y.e != y.a) {
            ((g) this.y.getValue()).close();
        }
    }

    @Override // com.gamericefishpro.space.d6.f
    public final String getDatabaseName() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.d6.f
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.y.e != y.a) {
            ((g) this.y.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.z = z;
    }
}
