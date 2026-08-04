package com.gamericefishpro.space.xa;

import com.gamericefishpro.space.wa.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static volatile FirebaseAnalytics a;
    public static final Object b = new Object();

    public static final FirebaseAnalytics a() {
        com.gamericefishpro.space.wa.c cVar = com.gamericefishpro.space.wa.c.e;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (a == null) {
            synchronized (b) {
                try {
                    if (a == null) {
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        g gVarC = g.c();
                        Intrinsics.checkNotNullExpressionValue(gVarC, "getInstance(...)");
                        gVarC.a();
                        a = FirebaseAnalytics.getInstance(gVarC.a);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = a;
        Intrinsics.b(firebaseAnalytics);
        return firebaseAnalytics;
    }
}
