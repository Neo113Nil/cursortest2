package com.gamericefishpro.space.s5;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Context a;
    public final String b;
    public final com.gamericefishpro.space.d6.e c;
    public final com.gamericefishpro.space.c5.e d;
    public final List e;
    public final boolean f;
    public final s g;
    public final Executor h;
    public final Executor i;
    public final Intent j;
    public final boolean k;
    public final boolean l;
    public final Set m;
    public final String n;
    public final File o;
    public final Callable p;
    public final List q;
    public final List r;
    public final boolean s;
    public final com.gamericefishpro.space.c6.b t;
    public final CoroutineContext u;
    public boolean v;

    public a(Context context, String str, com.gamericefishpro.space.d6.e eVar, com.gamericefishpro.space.c5.e migrationContainer, List list, boolean z, s journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, List typeConverters, List autoMigrationSpecs, boolean z4, com.gamericefishpro.space.c6.b bVar, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.a = context;
        this.b = str;
        this.c = eVar;
        this.d = migrationContainer;
        this.e = list;
        this.f = z;
        this.g = journalMode;
        this.h = queryExecutor;
        this.i = transactionExecutor;
        this.j = intent;
        this.k = z2;
        this.l = z3;
        this.m = set;
        this.n = str2;
        this.o = file;
        this.p = callable;
        this.q = typeConverters;
        this.r = autoMigrationSpecs;
        this.s = z4;
        this.t = bVar;
        this.u = coroutineContext;
        this.v = true;
    }
}
