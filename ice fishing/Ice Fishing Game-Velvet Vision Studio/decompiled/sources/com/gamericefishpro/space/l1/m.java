package com.gamericefishpro.space.l1;

import com.gamericefishpro.space.b2.d0;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.w0;
import com.gamericefishpro.space.o1.k0;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.oh.w;
import com.gamericefishpro.space.oh.x;
import com.gamericefishpro.space.t0.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class m extends w0 {
    public final float a;
    public final k0 b;
    public final boolean c;
    public final long d;
    public final long e;

    public m(float f, k0 k0Var, boolean z, long j, long j2) {
        this.a = f;
        this.b = k0Var;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        return new com.gamericefishpro.space.o1.m(new d0(14, this));
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        f1 f1Var;
        com.gamericefishpro.space.o1.m mVar = (com.gamericefishpro.space.o1.m) lVar;
        d0 d0Var = new d0(14, this);
        mVar.H = d0Var;
        if (mVar.d.G && (f1Var = com.gamericefishpro.space.h2.k.q(mVar, 2).I) != null) {
            f1Var.f1(d0Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return com.gamericefishpro.space.c3.f.b(this.a, mVar.a) && Intrinsics.a(this.b, mVar.b) && this.c == mVar.c && s.d(this.d, mVar.d) && s.d(this.e, mVar.e);
    }

    public final int hashCode() {
        int iC = y0.c((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31, this.c);
        int i = s.h;
        w wVar = x.d;
        return Long.hashCode(this.e) + y0.b(iC, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) com.gamericefishpro.space.c3.f.c(this.a));
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", clip=");
        sb.append(this.c);
        sb.append(", ambientColor=");
        y0.l(this.d, sb, ", spotColor=");
        sb.append((Object) s.j(this.e));
        sb.append(')');
        return sb.toString();
    }
}
