package com.gamericefishpro.space.o1;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends o {
    public final long f;

    public m0(long j) {
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            return s.d(this.f, ((m0) obj).f);
        }
        return false;
    }

    @Override // com.gamericefishpro.space.o1.o
    public final void g(float f, long j, com.gamericefishpro.space.r8.m mVar) {
        mVar.a(1.0f);
        long jC = this.f;
        if (f != 1.0f) {
            jC = s.c(jC, s.e(jC) * f);
        }
        mVar.c(jC);
        if (((Shader) mVar.c) != null) {
            mVar.c = null;
            ((Paint) mVar.b).setShader(null);
        }
    }

    public final int hashCode() {
        int i = s.h;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        return Long.hashCode(this.f);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) s.j(this.f)) + ')';
    }
}
