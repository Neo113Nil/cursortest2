package com.gamericefishpro.space.data.db;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d7.c;
import com.gamericefishpro.space.d7.j;
import com.gamericefishpro.space.d7.k;
import com.gamericefishpro.space.d7.n;
import com.gamericefishpro.space.data.db.IceFishingDatabase_Impl;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.oh.i;
import com.gamericefishpro.space.oh.s;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.s4.f;
import com.gamericefishpro.space.s5.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
public final class IceFishingDatabase_Impl extends IceFishingDatabase {
    public final s n;
    public final s o;
    public final s p;
    public final s q;

    public IceFishingDatabase_Impl() {
        final int i = 0;
        this.n = i.b(new Function0(this) { // from class: com.gamericefishpro.space.d7.i
            public final /* synthetic */ IceFishingDatabase_Impl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return new c(this.e);
                    case 1:
                        return new n(this.e);
                    case 2:
                        return new f(this.e);
                    default:
                        return new k(this.e);
                }
            }
        });
        final int i2 = 1;
        this.o = i.b(new Function0(this) { // from class: com.gamericefishpro.space.d7.i
            public final /* synthetic */ IceFishingDatabase_Impl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return new c(this.e);
                    case 1:
                        return new n(this.e);
                    case 2:
                        return new f(this.e);
                    default:
                        return new k(this.e);
                }
            }
        });
        final int i3 = 2;
        this.p = i.b(new Function0(this) { // from class: com.gamericefishpro.space.d7.i
            public final /* synthetic */ IceFishingDatabase_Impl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return new c(this.e);
                    case 1:
                        return new n(this.e);
                    case 2:
                        return new f(this.e);
                    default:
                        return new k(this.e);
                }
            }
        });
        final int i4 = 3;
        this.q = i.b(new Function0(this) { // from class: com.gamericefishpro.space.d7.i
            public final /* synthetic */ IceFishingDatabase_Impl e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return new c(this.e);
                    case 1:
                        return new n(this.e);
                    case 2:
                        return new f(this.e);
                    default:
                        return new k(this.e);
                }
            }
        });
    }

    @Override // com.gamericefishpro.space.s5.t
    public final List d(LinkedHashMap autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // com.gamericefishpro.space.s5.t
    public final g e() {
        return new g(this, new LinkedHashMap(), new LinkedHashMap(), "fish_levels", "ice_startup_params", "ice_achievements", "ice_game_history");
    }

    @Override // com.gamericefishpro.space.s5.t
    public final f f() {
        return new j(this);
    }

    @Override // com.gamericefishpro.space.s5.t
    public final Set k() {
        return new LinkedHashSet();
    }

    @Override // com.gamericefishpro.space.s5.t
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.gamericefishpro.space.ei.g gVarA = b0.a(c.class);
        g0 g0Var = g0.d;
        linkedHashMap.put(gVarA, g0Var);
        linkedHashMap.put(b0.a(n.class), g0Var);
        linkedHashMap.put(b0.a(com.gamericefishpro.space.d7.f.class), g0Var);
        linkedHashMap.put(b0.a(k.class), g0Var);
        return linkedHashMap;
    }

    @Override // com.gamericefishpro.space.data.db.IceFishingDatabase
    public final c w() {
        return (c) this.n.getValue();
    }

    @Override // com.gamericefishpro.space.data.db.IceFishingDatabase
    public final com.gamericefishpro.space.d7.f x() {
        return (com.gamericefishpro.space.d7.f) this.p.getValue();
    }

    @Override // com.gamericefishpro.space.data.db.IceFishingDatabase
    public final k y() {
        return (k) this.q.getValue();
    }

    @Override // com.gamericefishpro.space.data.db.IceFishingDatabase
    public final n z() {
        return (n) this.o.getValue();
    }
}
