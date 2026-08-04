package com.gamericefishpro.space.w5;

import com.gamericefishpro.space.d6.b;
import com.gamericefishpro.space.oh.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final int a;
    public final int b;

    public a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a(com.gamericefishpro.space.c6.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (connection instanceof com.gamericefishpro.space.v5.a) {
            b(((com.gamericefishpro.space.v5.a) connection).d);
        } else {
            Intrinsics.checkNotNullParameter("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.", "message");
            throw new l("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
    }

    public abstract void b(b bVar);
}
