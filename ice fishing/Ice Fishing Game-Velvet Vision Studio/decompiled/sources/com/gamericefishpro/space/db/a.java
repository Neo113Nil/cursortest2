package com.gamericefishpro.space.db;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.o4.j;
import com.gamericefishpro.space.o4.k;
import com.gamericefishpro.space.ph.w;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ e e;

    public /* synthetic */ a(e eVar, int i) {
        this.d = i;
        this.e = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.l4.b ex = (com.gamericefishpro.space.l4.b) obj;
                Intrinsics.checkNotNullParameter(ex, "ex");
                Log.w(b0.a(e.class).c(), "CorruptionException in " + this.e.a + " DataStore running in process " + Process.myPid(), ex);
                return new com.gamericefishpro.space.p4.b(true);
            default:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "it");
                String sharedPreferencesName = this.e.a;
                LinkedHashSet keysToMigrate = k.a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
                Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
                return w.c(new com.gamericefishpro.space.n4.c(context, sharedPreferencesName, com.gamericefishpro.space.n4.d.a, new com.gamericefishpro.space.k7.e(keysToMigrate, null, 4), new j(3, null)));
        }
    }
}
