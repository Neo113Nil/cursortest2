package com.gamericefishpro.space.m0;

import com.gamericefishpro.space.h1.l;
import com.gamericefishpro.space.h2.k;
import com.gamericefishpro.space.h2.w0;
import com.gamericefishpro.space.r2.i0;
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
public final class e extends w0 {
    public final String a;
    public final i0 b;
    public final com.gamericefishpro.space.u2.d c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public e(String str, i0 i0Var, com.gamericefishpro.space.u2.d dVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = i0Var;
        this.c = dVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final l d() {
        h hVar = new h();
        hVar.H = this.a;
        hVar.I = this.b;
        hVar.J = this.c;
        hVar.K = this.d;
        hVar.L = this.e;
        hVar.M = this.f;
        hVar.N = this.g;
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // com.gamericefishpro.space.h2.w0
    public final void e(l lVar) {
        boolean z;
        String str;
        String str2;
        i0 i0Var;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        com.gamericefishpro.space.u2.d dVar;
        com.gamericefishpro.space.u2.d dVar2;
        int i5;
        int i6;
        h hVar = (h) lVar;
        hVar.getClass();
        i0 i0Var2 = hVar.I;
        boolean z5 = false;
        boolean z6 = true;
        i0 i0Var3 = this.b;
        if (i0Var3 != i0Var2) {
            if (!i0Var3.a.b(i0Var2.a)) {
                z = true;
            }
            str = hVar.H;
            str2 = this.a;
            if (!Intrinsics.a(str, str2)) {
                hVar.H = str2;
                hVar.R = null;
                z5 = true;
            }
            i0Var = hVar.I;
            if (i0Var != i0Var3) {
                boolean z7 = !Intrinsics.a(i0Var.b, i0Var3.b) && i0Var.a.a(i0Var3.a);
                z2 = !z7;
                hVar.I = i0Var3;
                i = hVar.N;
                i2 = this.g;
                if (i != i2) {
                    hVar.N = i2;
                    z2 = true;
                }
                i3 = hVar.M;
                i4 = this.f;
                if (i3 != i4) {
                    hVar.M = i4;
                    z2 = true;
                }
                z3 = hVar.L;
                z4 = this.e;
                if (z3 != z4) {
                    hVar.L = z4;
                    z2 = true;
                }
                dVar = hVar.J;
                dVar2 = this.c;
                if (!Intrinsics.a(dVar, dVar2)) {
                    hVar.J = dVar2;
                    z2 = true;
                }
                i5 = hVar.K;
                i6 = this.d;
                if (i5 == i6) {
                    z6 = z2;
                } else {
                    hVar.K = i6;
                }
                if (z5 || z6) {
                    d dVarA0 = hVar.A0();
                    String str3 = hVar.H;
                    i0 i0Var4 = hVar.I;
                    com.gamericefishpro.space.u2.d dVar3 = hVar.J;
                    int i7 = hVar.K;
                    boolean z8 = hVar.L;
                    int i8 = hVar.M;
                    int i9 = hVar.N;
                    dVarA0.a = str3;
                    dVarA0.b = i0Var4;
                    dVarA0.c = dVar3;
                    dVarA0.d = i7;
                    dVarA0.e = z8;
                    dVarA0.f = i8;
                    dVarA0.g = i9;
                    dVarA0.s = (dVarA0.s << 2) | 2;
                    dVarA0.c();
                }
                if (hVar.G) {
                    if (z5 || (z && hVar.Q != null)) {
                        k.l(hVar);
                    }
                    if (z5 || z6) {
                        k.k(hVar);
                        k.j(hVar);
                    }
                    if (z) {
                        k.j(hVar);
                    }
                }
                return;
            }
            i0Var.getClass();
            z2 = !z7;
            hVar.I = i0Var3;
            i = hVar.N;
            i2 = this.g;
            if (i != i2) {
                hVar.N = i2;
                z2 = true;
            }
            i3 = hVar.M;
            i4 = this.f;
            if (i3 != i4) {
                hVar.M = i4;
                z2 = true;
            }
            z3 = hVar.L;
            z4 = this.e;
            if (z3 != z4) {
                hVar.L = z4;
                z2 = true;
            }
            dVar = hVar.J;
            dVar2 = this.c;
            if (!Intrinsics.a(dVar, dVar2)) {
                hVar.J = dVar2;
                z2 = true;
            }
            i5 = hVar.K;
            i6 = this.d;
            if (i5 == i6) {
                z6 = z2;
            } else {
                hVar.K = i6;
            }
            if (z5) {
                d dVarA1 = hVar.A0();
                String str4 = hVar.H;
                i0 i0Var5 = hVar.I;
                com.gamericefishpro.space.u2.d dVar4 = hVar.J;
                int i10 = hVar.K;
                boolean z9 = hVar.L;
                int i11 = hVar.M;
                int i12 = hVar.N;
                dVarA1.a = str4;
                dVarA1.b = i0Var5;
                dVarA1.c = dVar4;
                dVarA1.d = i10;
                dVarA1.e = z9;
                dVarA1.f = i11;
                dVarA1.g = i12;
                dVarA1.s = (dVarA1.s << 2) | 2;
                dVarA1.c();
            } else {
                d dVarA2 = hVar.A0();
                String str5 = hVar.H;
                i0 i0Var6 = hVar.I;
                com.gamericefishpro.space.u2.d dVar5 = hVar.J;
                int i13 = hVar.K;
                boolean z10 = hVar.L;
                int i14 = hVar.M;
                int i15 = hVar.N;
                dVarA2.a = str5;
                dVarA2.b = i0Var6;
                dVarA2.c = dVar5;
                dVarA2.d = i13;
                dVarA2.e = z10;
                dVarA2.f = i14;
                dVarA2.g = i15;
                dVarA2.s = (dVarA2.s << 2) | 2;
                dVarA2.c();
            }
            if (hVar.G) {
                return;
            }
            if (z5) {
                k.l(hVar);
            } else {
                k.l(hVar);
            }
            if (z5) {
                k.k(hVar);
                k.j(hVar);
            } else {
                k.k(hVar);
                k.j(hVar);
            }
            if (z) {
                k.j(hVar);
            }
        }
        i0Var3.getClass();
        z = false;
        str = hVar.H;
        str2 = this.a;
        if (!Intrinsics.a(str, str2)) {
            hVar.H = str2;
            hVar.R = null;
            z5 = true;
        }
        i0Var = hVar.I;
        if (i0Var != i0Var3) {
            if (Intrinsics.a(i0Var.b, i0Var3.b)) {
            }
            z2 = !z7;
            hVar.I = i0Var3;
            i = hVar.N;
            i2 = this.g;
            if (i != i2) {
                hVar.N = i2;
                z2 = true;
            }
            i3 = hVar.M;
            i4 = this.f;
            if (i3 != i4) {
                hVar.M = i4;
                z2 = true;
            }
            z3 = hVar.L;
            z4 = this.e;
            if (z3 != z4) {
                hVar.L = z4;
                z2 = true;
            }
            dVar = hVar.J;
            dVar2 = this.c;
            if (!Intrinsics.a(dVar, dVar2)) {
                hVar.J = dVar2;
                z2 = true;
            }
            i5 = hVar.K;
            i6 = this.d;
            if (i5 == i6) {
                z6 = z2;
            } else {
                hVar.K = i6;
            }
            if (z5) {
                d dVarA3 = hVar.A0();
                String str6 = hVar.H;
                i0 i0Var7 = hVar.I;
                com.gamericefishpro.space.u2.d dVar6 = hVar.J;
                int i16 = hVar.K;
                boolean z11 = hVar.L;
                int i17 = hVar.M;
                int i18 = hVar.N;
                dVarA3.a = str6;
                dVarA3.b = i0Var7;
                dVarA3.c = dVar6;
                dVarA3.d = i16;
                dVarA3.e = z11;
                dVarA3.f = i17;
                dVarA3.g = i18;
                dVarA3.s = (dVarA3.s << 2) | 2;
                dVarA3.c();
            } else {
                d dVarA4 = hVar.A0();
                String str7 = hVar.H;
                i0 i0Var8 = hVar.I;
                com.gamericefishpro.space.u2.d dVar7 = hVar.J;
                int i19 = hVar.K;
                boolean z12 = hVar.L;
                int i110 = hVar.M;
                int i111 = hVar.N;
                dVarA4.a = str7;
                dVarA4.b = i0Var8;
                dVarA4.c = dVar7;
                dVarA4.d = i19;
                dVarA4.e = z12;
                dVarA4.f = i110;
                dVarA4.g = i111;
                dVarA4.s = (dVarA4.s << 2) | 2;
                dVarA4.c();
            }
            if (hVar.G) {
                return;
            }
            if (z5) {
                k.l(hVar);
            } else {
                k.l(hVar);
            }
            if (z5) {
                k.k(hVar);
                k.j(hVar);
            } else {
                k.k(hVar);
                k.j(hVar);
            }
            if (z) {
                k.j(hVar);
            }
        }
        i0Var.getClass();
        z2 = !z7;
        hVar.I = i0Var3;
        i = hVar.N;
        i2 = this.g;
        if (i != i2) {
            hVar.N = i2;
            z2 = true;
        }
        i3 = hVar.M;
        i4 = this.f;
        if (i3 != i4) {
            hVar.M = i4;
            z2 = true;
        }
        z3 = hVar.L;
        z4 = this.e;
        if (z3 != z4) {
            hVar.L = z4;
            z2 = true;
        }
        dVar = hVar.J;
        dVar2 = this.c;
        if (!Intrinsics.a(dVar, dVar2)) {
            hVar.J = dVar2;
            z2 = true;
        }
        i5 = hVar.K;
        i6 = this.d;
        if (i5 == i6) {
            z6 = z2;
        } else {
            hVar.K = i6;
        }
        if (z5) {
            d dVarA5 = hVar.A0();
            String str8 = hVar.H;
            i0 i0Var9 = hVar.I;
            com.gamericefishpro.space.u2.d dVar8 = hVar.J;
            int i112 = hVar.K;
            boolean z13 = hVar.L;
            int i113 = hVar.M;
            int i114 = hVar.N;
            dVarA5.a = str8;
            dVarA5.b = i0Var9;
            dVarA5.c = dVar8;
            dVarA5.d = i112;
            dVarA5.e = z13;
            dVarA5.f = i113;
            dVarA5.g = i114;
            dVarA5.s = (dVarA5.s << 2) | 2;
            dVarA5.c();
        } else {
            d dVarA6 = hVar.A0();
            String str9 = hVar.H;
            i0 i0Var10 = hVar.I;
            com.gamericefishpro.space.u2.d dVar9 = hVar.J;
            int i115 = hVar.K;
            boolean z14 = hVar.L;
            int i116 = hVar.M;
            int i117 = hVar.N;
            dVarA6.a = str9;
            dVarA6.b = i0Var10;
            dVarA6.c = dVar9;
            dVarA6.d = i115;
            dVarA6.e = z14;
            dVarA6.f = i116;
            dVarA6.g = i117;
            dVarA6.s = (dVarA6.s << 2) | 2;
            dVarA6.c();
        }
        if (hVar.G) {
            return;
        }
        if (z5) {
            k.l(hVar);
        } else {
            k.l(hVar);
        }
        if (z5) {
            k.k(hVar);
            k.j(hVar);
        } else {
            k.k(hVar);
            k.j(hVar);
        }
        if (z) {
            k.j(hVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.a, eVar.a) && Intrinsics.a(this.b, eVar.b) && Intrinsics.a(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f && this.g == eVar.g;
    }

    public final int hashCode() {
        return (((y0.c(com.gamericefishpro.space.m5.a.t(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }
}
