package com.gamericefishpro.space.f5;

import android.os.Bundle;
import com.gamericefishpro.space.h2.w1;
import com.gamericefishpro.space.t0.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
@o0("navigation")
@Metadata
public class c0 extends p0 {
    public final q0 c;

    public c0(q0 navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        Intrinsics.checkNotNullParameter("navigation", "name");
        this.c = navigatorProvider;
    }

    @Override // com.gamericefishpro.space.f5.p0
    public final void d(List entries, g0 g0Var) {
        x xVarB;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            x xVar = kVar.e;
            Intrinsics.c(xVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            z zVar = (z) xVar;
            w1 w1Var = zVar.e;
            com.gamericefishpro.space.ei.a0 a0Var = new com.gamericefishpro.space.ei.a0();
            a0Var.d = kVar.A.a();
            com.gamericefishpro.space.i5.j jVar = zVar.y;
            int i = jVar.c;
            String route = jVar.e;
            if (i == 0 && route == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                w1Var.getClass();
                String superName = String.valueOf(w1Var.a);
                Intrinsics.checkNotNullParameter(superName, "superName");
                if (jVar.a.e.a == 0) {
                    superName = "the root navigation";
                }
                sb.append(superName);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (route != null) {
                Intrinsics.checkNotNullParameter(route, "route");
                xVarB = jVar.b(route, false);
            } else {
                xVarB = (x) jVar.b.c(i);
            }
            if (xVarB == null) {
                if (jVar.d == null) {
                    String strValueOf = jVar.e;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(jVar.c);
                    }
                    jVar.d = strValueOf;
                }
                String str = jVar.d;
                Intrinsics.b(str);
                throw new IllegalArgumentException(y0.g("navigation destination ", str, " is not a direct child of this NavGraph"));
            }
            w1 w1Var2 = xVarB.e;
            if (route != null) {
                if (!route.equals((String) w1Var2.e)) {
                    Intrinsics.checkNotNullParameter(route, "route");
                    w wVarE = w1Var2.e(route);
                    Bundle from = wVarE != null ? wVarE.e : null;
                    if (from != null) {
                        Intrinsics.checkNotNullParameter(from, "source");
                        if (!from.isEmpty()) {
                            com.gamericefishpro.space.ph.m0.c();
                            Bundle source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            Intrinsics.checkNotNullParameter(source, "source");
                            Intrinsics.checkNotNullParameter(from, "from");
                            source.putAll(from);
                            Bundle from2 = (Bundle) a0Var.d;
                            if (from2 != null) {
                                Intrinsics.checkNotNullParameter(from2, "from");
                                source.putAll(from2);
                            }
                            a0Var.d = source;
                        }
                    }
                }
                if (xVarB.c().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListE = h.e(xVarB.c(), new b0(a0Var, 0));
                    if (!arrayListE.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + xVarB + ". Missing required arguments [" + arrayListE + ']').toString());
                    }
                }
            }
            this.c.b(xVarB.d).d(com.gamericefishpro.space.ph.w.c(b().b(xVarB, xVarB.b((Bundle) a0Var.d))), g0Var);
        }
    }

    @Override // com.gamericefishpro.space.f5.p0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public z a() {
        return new z(this);
    }
}
