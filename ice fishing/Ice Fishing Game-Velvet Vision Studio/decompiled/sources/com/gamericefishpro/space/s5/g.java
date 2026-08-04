package com.gamericefishpro.space.s5;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.pi.g1;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final t a;
    public final k0 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final com.gamericefishpro.space.q0.n e;
    public final f f;
    public final Object g;

    /* JADX WARN: Type inference failed for: r2v5, types: [com.gamericefishpro.space.s5.f] */
    public g(t database, HashMap shadowTablesMap, HashMap viewTables, String... tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.a = database;
        k0 k0Var = new k0(database, shadowTablesMap, viewTables, tableNames, database.k, new g1(1, this, g.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 1));
        this.b = k0Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new com.gamericefishpro.space.q0.n(this);
        final int i = 0;
        this.f = new Function0(this) { // from class: com.gamericefishpro.space.s5.f
            public final /* synthetic */ g e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        this.e.getClass();
                        return Unit.a;
                    default:
                        g gVar = this.e;
                        return Boolean.valueOf(!gVar.a.o() || gVar.a.s());
                }
            }
        };
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullExpressionValue(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.g = new Object();
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: com.gamericefishpro.space.s5.f
            public final /* synthetic */ g e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        this.e.getClass();
                        return Unit.a;
                    default:
                        g gVar = this.e;
                        return Boolean.valueOf(!gVar.a.o() || gVar.a.s());
                }
            }
        };
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        k0Var.k = function0;
    }

    public final Object a(com.gamericefishpro.space.vh.i iVar) throws Throwable {
        t tVar = this.a;
        if (tVar.o() && !tVar.s()) {
            return Unit.a;
        }
        Object objF = this.b.f(iVar);
        return objF == com.gamericefishpro.space.uh.a.d ? objF : Unit.a;
    }
}
