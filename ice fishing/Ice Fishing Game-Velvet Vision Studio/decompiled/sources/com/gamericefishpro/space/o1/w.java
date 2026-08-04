package com.gamericefishpro.space.o1;

import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.w0;
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
final class w extends w0 {
    public final float a;
    public final float b;
    public final float c;
    public final long d;
    public final k0 e;
    public final boolean f;
    public final long g;
    public final long h;

    public w(float f, float f2, float f3, long j, k0 k0Var, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = j;
        this.e = k0Var;
        this.f = z;
        this.g = j2;
        this.h = j3;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        l0 l0Var = new l0();
        l0Var.H = this.a;
        l0Var.I = this.b;
        l0Var.J = 1.0f;
        l0Var.K = this.c;
        l0Var.L = 8.0f;
        l0Var.M = this.d;
        l0Var.N = this.e;
        l0Var.O = this.f;
        l0Var.P = this.g;
        l0Var.Q = this.h;
        l0Var.R = 3;
        l0Var.S = new com.gamericefishpro.space.b2.d0(19, l0Var);
        return l0Var;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        f1 f1Var;
        l0 l0Var = (l0) lVar;
        l0Var.H = this.a;
        l0Var.I = this.b;
        l0Var.J = 1.0f;
        l0Var.K = this.c;
        l0Var.L = 8.0f;
        l0Var.M = this.d;
        l0Var.N = this.e;
        l0Var.O = this.f;
        l0Var.P = this.g;
        l0Var.Q = this.h;
        l0Var.R = 3;
        com.gamericefishpro.space.b2.d0 d0Var = l0Var.S;
        if (l0Var.d.G && (f1Var = com.gamericefishpro.space.h2.k.q(l0Var, 2).I) != null) {
            f1Var.f1(d0Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.a, wVar.a) == 0 && Float.compare(this.b, wVar.b) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.c, wVar.c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && n0.a(this.d, wVar.d) && Intrinsics.a(this.e, wVar.e) && this.f == wVar.f && s.d(this.g, wVar.g) && s.d(this.h, wVar.h);
    }

    public final int hashCode() {
        int iA = y0.a(8.0f, y0.a(0.0f, y0.a(0.0f, y0.a(0.0f, y0.a(this.c, y0.a(0.0f, y0.a(0.0f, y0.a(1.0f, y0.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = n0.c;
        int iC = y0.c((this.e.hashCode() + y0.b(iA, 31, this.d)) * 31, 961, this.f);
        int i2 = s.h;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        return com.gamericefishpro.space.m5.a.t(3, com.gamericefishpro.space.m5.a.t(0, y0.b(y0.b(iC, 31, this.g), 31, this.h), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.a);
        sb.append(", scaleY=");
        sb.append(this.b);
        sb.append(", alpha=1.0, translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.c);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) n0.d(this.d));
        sb.append(", shape=");
        sb.append(this.e);
        sb.append(", clip=");
        sb.append(this.f);
        sb.append(", renderEffect=null, ambientShadowColor=");
        y0.l(this.g, sb, ", spotShadowColor=");
        sb.append((Object) s.j(this.h));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) o.C(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
