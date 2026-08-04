package com.gamericefishpro.space.o4;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;
    public final com.gamericefishpro.space.m.d b;
    public final Function1 c;
    public final com.gamericefishpro.space.ui.c d;
    public final Object e;
    public volatile com.gamericefishpro.space.m.d f;

    public b(String name, com.gamericefishpro.space.m.d dVar, Function1 produceMigrations, com.gamericefishpro.space.ui.c scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = name;
        this.b = dVar;
        this.c = produceMigrations;
        this.d = scope;
        this.e = new Object();
    }

    public final com.gamericefishpro.space.m.d a(Context thisRef, com.gamericefishpro.space.ki.d property) {
        com.gamericefishpro.space.m.d dVar;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        com.gamericefishpro.space.m.d dVar2 = this.f;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    com.gamericefishpro.space.m.d dVar3 = this.b;
                    Function1 function1 = this.c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f = com.gamericefishpro.space.d9.h.p(dVar3, (List) function1.invoke(applicationContext), this.d, new com.gamericefishpro.space.b2.b(11, applicationContext, this));
                }
                dVar = this.f;
                Intrinsics.b(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
