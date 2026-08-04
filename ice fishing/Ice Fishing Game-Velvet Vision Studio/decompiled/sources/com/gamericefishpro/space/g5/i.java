package com.gamericefishpro.space.g5;

import com.gamericefishpro.space.f5.g0;
import com.gamericefishpro.space.f5.o0;
import com.gamericefishpro.space.f5.p0;
import com.gamericefishpro.space.ph.s0;
import com.gamericefishpro.space.si.n0;
import com.gamericefishpro.space.t0.f1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@o0("composable")
@Metadata
public final class i extends p0 {
    public final f1 c;

    public i() {
        Intrinsics.checkNotNullParameter("composable", "name");
        this.c = com.gamericefishpro.space.t0.i.v(Boolean.FALSE);
    }

    @Override // com.gamericefishpro.space.f5.p0
    public final com.gamericefishpro.space.f5.x a() {
        return new h(this, c.a);
    }

    @Override // com.gamericefishpro.space.f5.p0
    public final void d(List list, g0 g0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.gamericefishpro.space.f5.k backStackEntry = (com.gamericefishpro.space.f5.k) it.next();
            com.gamericefishpro.space.f5.o oVarB = b();
            com.gamericefishpro.space.si.a0 a0Var = oVarB.e;
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            n0 n0Var = oVarB.c;
            Iterable iterable = (Iterable) n0Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((com.gamericefishpro.space.f5.k) it2.next()) == backStackEntry) {
                            Iterable iterable2 = (Iterable) a0Var.d.getValue();
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it3 = iterable2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((com.gamericefishpro.space.f5.k) it3.next()) == backStackEntry) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            com.gamericefishpro.space.f5.k kVar = (com.gamericefishpro.space.f5.k) CollectionsKt.C((List) a0Var.d.getValue());
            if (kVar != null) {
                n0Var.j(null, s0.c((Set) n0Var.getValue(), kVar));
            }
            n0Var.j(null, s0.c((Set) n0Var.getValue(), backStackEntry));
            oVarB.f(backStackEntry);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // com.gamericefishpro.space.f5.p0
    public final void e(com.gamericefishpro.space.f5.k kVar, boolean z) {
        b().e(kVar, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(com.gamericefishpro.space.f5.k entry) {
        com.gamericefishpro.space.f5.o oVarB = b();
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(entry, "entry");
        n0 n0Var = oVarB.c;
        n0Var.j(null, s0.c((Set) n0Var.getValue(), entry));
        com.gamericefishpro.space.i5.g gVar = oVarB.h.b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!gVar.f.contains(entry)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.c(com.gamericefishpro.space.z4.p.v);
    }
}
