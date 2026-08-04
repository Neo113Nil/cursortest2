package com.gamericefishpro.space.v5;

import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.c6.a {
    public final com.gamericefishpro.space.d6.b d;

    public a(com.gamericefishpro.space.d6.b db) {
        Intrinsics.checkNotNullParameter(db, "db");
        this.d = db;
    }

    @Override // com.gamericefishpro.space.c6.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final g O(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        com.gamericefishpro.space.d6.b db = this.d;
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(sql, "sql");
        String string = StringsKt.D(sql).toString();
        if (string.length() >= 3) {
            String strSubstring = string.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                Intrinsics.checkNotNullParameter(db, "db");
                Intrinsics.checkNotNullParameter(sql, "sql");
                e eVar = new e(db, sql);
                eVar.v = new int[0];
                eVar.w = new long[0];
                eVar.y = new double[0];
                eVar.z = new String[0];
                eVar.A = new byte[0][];
                return eVar;
            }
        }
        return new f(db, sql);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }
}
