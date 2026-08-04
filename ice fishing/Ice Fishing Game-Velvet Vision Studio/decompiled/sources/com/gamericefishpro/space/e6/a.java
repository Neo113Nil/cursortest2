package com.gamericefishpro.space.e6;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.u2.k;
import com.gamericefishpro.space.u2.q;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements com.gamericefishpro.space.di.d {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.gamericefishpro.space.di.d
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.d6.h hVar = (com.gamericefishpro.space.d6.h) this.e;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                Intrinsics.b(sQLiteQuery);
                hVar.j(new i(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 1:
                com.gamericefishpro.space.b1.h hVar2 = (com.gamericefishpro.space.b1.h) this.e;
                com.gamericefishpro.space.f0.c cVar = (com.gamericefishpro.space.f0.c) obj;
                ((Integer) obj2).getClass();
                r rVar = (r) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= rVar.f(cVar) ? 4 : 2;
                }
                if (rVar.S(iIntValue & 1, (iIntValue & 131) != 130)) {
                    hVar2.a(cVar, rVar, Integer.valueOf(iIntValue & 14));
                } else {
                    rVar.V();
                }
                return Unit.a;
            default:
                com.gamericefishpro.space.y2.c cVar2 = (com.gamericefishpro.space.y2.c) this.e;
                q qVarB = ((com.gamericefishpro.space.u2.e) cVar2.w).b((com.gamericefishpro.space.u2.b) obj, (k) obj2, ((com.gamericefishpro.space.u2.i) obj3).a, ((com.gamericefishpro.space.u2.j) obj4).a);
                if (qVarB instanceof q) {
                    Object obj5 = qVarB.d;
                    Intrinsics.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                com.gamericefishpro.space.r5.b bVar = new com.gamericefishpro.space.r5.b(qVarB, cVar2.C);
                cVar2.C = bVar;
                Object obj6 = bVar.v;
                Intrinsics.c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj6;
        }
    }
}
