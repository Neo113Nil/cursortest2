package com.gamericefishpro.space.d0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.t0.t2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ p(int i) {
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.gamericefishpro.space.d7.o oVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Unit.a;
            case 1:
                return Unit.a;
            case 2:
                throw com.gamericefishpro.space.t0.y0.e(obj);
            case 3:
                throw com.gamericefishpro.space.t0.y0.e(obj);
            case 4:
                throw com.gamericefishpro.space.t0.y0.e(obj);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                throw com.gamericefishpro.space.t0.y0.e(obj);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                throw com.gamericefishpro.space.t0.y0.e(obj);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                com.gamericefishpro.space.c6.a _connection = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                com.gamericefishpro.space.c6.c cVarO = _connection.O("SELECT * FROM fish_levels ORDER BY level ASC");
                try {
                    int iA = a4.A(cVarO, "level");
                    int iA2 = a4.A(cVarO, "title");
                    int iA3 = a4.A(cVarO, "isLocked");
                    int iA4 = a4.A(cVarO, "stars");
                    int iA5 = a4.A(cVarO, "bestScore");
                    int iA6 = a4.A(cVarO, "coinsEarned");
                    ArrayList arrayList = new ArrayList();
                    while (cVarO.H()) {
                        arrayList.add(new com.gamericefishpro.space.d7.d((int) cVarO.getLong(iA), (int) cVarO.getLong(iA4), (int) cVarO.getLong(iA5), (int) cVarO.getLong(iA6), cVarO.g(iA2), ((int) cVarO.getLong(iA3)) != 0));
                    }
                    cVarO.close();
                    return arrayList;
                } catch (Throwable th) {
                    cVarO.close();
                    throw th;
                }
            case 9:
                com.gamericefishpro.space.c6.a _connection2 = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                com.gamericefishpro.space.c6.c cVarO2 = _connection2.O("SELECT COUNT(*) FROM fish_levels WHERE stars >= ? AND isLocked = 0");
                try {
                    cVarO2.a(1, 3);
                    return Integer.valueOf(cVarO2.H() ? (int) cVarO2.getLong(0) : 0);
                } finally {
                    cVarO2.close();
                }
            case 10:
                com.gamericefishpro.space.c6.a _connection3 = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                com.gamericefishpro.space.c6.c cVarO3 = _connection3.O("UPDATE fish_levels SET isLocked = CASE WHEN level = 1 THEN 0 ELSE 1 END, stars = 0, bestScore = 0, coinsEarned = 0");
                try {
                    cVarO3.H();
                    return Unit.a;
                } finally {
                    cVarO3.close();
                }
            case RequestError.STOP_TRACKING /* 11 */:
                com.gamericefishpro.space.c6.a _connection4 = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                com.gamericefishpro.space.c6.c cVarO4 = _connection4.O("SELECT * FROM ice_achievements ORDER BY id ASC");
                try {
                    int iA7 = a4.A(cVarO4, "id");
                    int iA8 = a4.A(cVarO4, "title");
                    int iA9 = a4.A(cVarO4, "description");
                    int iA10 = a4.A(cVarO4, "isUnlocked");
                    int iA11 = a4.A(cVarO4, "unlockedAt");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarO4.H()) {
                        arrayList2.add(new com.gamericefishpro.space.d7.g(cVarO4.g(iA7), cVarO4.g(iA8), cVarO4.g(iA9), ((int) cVarO4.getLong(iA10)) != 0, cVarO4.getLong(iA11)));
                    }
                    cVarO4.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    cVarO4.close();
                    throw th2;
                }
            case 12:
                com.gamericefishpro.space.c6.a _connection5 = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection5, "_connection");
                com.gamericefishpro.space.c6.c cVarO5 = _connection5.O("UPDATE ice_achievements SET isUnlocked = 0, unlockedAt = 0");
                try {
                    cVarO5.H();
                    return Unit.a;
                } finally {
                    cVarO5.close();
                }
            case 13:
                com.gamericefishpro.space.c6.a _connection6 = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection6, "_connection");
                com.gamericefishpro.space.c6.c cVarO6 = _connection6.O("SELECT * FROM ice_game_history ORDER BY playedAt DESC");
                try {
                    int iA12 = a4.A(cVarO6, "id");
                    int iA13 = a4.A(cVarO6, "level");
                    int iA14 = a4.A(cVarO6, "score");
                    int iA15 = a4.A(cVarO6, "stars");
                    int iA16 = a4.A(cVarO6, "isWin");
                    int iA17 = a4.A(cVarO6, "defeatReason");
                    int iA18 = a4.A(cVarO6, "playedAt");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarO6.H()) {
                        int i = iA12;
                        arrayList3.add(new com.gamericefishpro.space.d7.l(cVarO6.getLong(iA12), (int) cVarO6.getLong(iA13), (int) cVarO6.getLong(iA14), (int) cVarO6.getLong(iA15), ((int) cVarO6.getLong(iA16)) != 0, cVarO6.g(iA17), cVarO6.getLong(iA18)));
                        iA12 = i;
                    }
                    cVarO6.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    cVarO6.close();
                    throw th3;
                }
            case 14:
                com.gamericefishpro.space.c6.a _connection7 = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection7, "_connection");
                com.gamericefishpro.space.c6.c cVarO7 = _connection7.O("DELETE FROM ice_game_history");
                try {
                    cVarO7.H();
                    return Unit.a;
                } finally {
                    cVarO7.close();
                }
            case 15:
                com.gamericefishpro.space.c6.a _connection8 = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection8, "_connection");
                com.gamericefishpro.space.c6.c cVarO8 = _connection8.O("SELECT * FROM ice_startup_params WHERE id = 1 LIMIT 1");
                try {
                    int iA19 = a4.A(cVarO8, "id");
                    int iA20 = a4.A(cVarO8, "iceId");
                    int iA21 = a4.A(cVarO8, "fishSource");
                    int iA22 = a4.A(cVarO8, "fishData");
                    int iA23 = a4.A(cVarO8, "fishId");
                    int iA24 = a4.A(cVarO8, "iceFishingApp");
                    int iA25 = a4.A(cVarO8, "isOnboarded");
                    int iA26 = a4.A(cVarO8, "notificationPermissionRequested");
                    int iA27 = a4.A(cVarO8, "notificationPermissionRequestCount");
                    if (cVarO8.H()) {
                        oVar = new com.gamericefishpro.space.d7.o((int) cVarO8.getLong(iA19), cVarO8.g(iA20), cVarO8.g(iA21), cVarO8.g(iA22), cVarO8.g(iA23), cVarO8.g(iA24), ((int) cVarO8.getLong(iA25)) != 0, ((int) cVarO8.getLong(iA26)) != 0, (int) cVarO8.getLong(iA27));
                        break;
                    } else {
                        oVar = null;
                    }
                    return oVar;
                } finally {
                    cVarO8.close();
                }
            case 16:
                com.gamericefishpro.space.c6.a _connection9 = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection9, "_connection");
                com.gamericefishpro.space.c6.c cVarO9 = _connection9.O("UPDATE ice_startup_params SET isOnboarded = ? WHERE id = 1");
                try {
                    cVarO9.a(1, 1);
                    cVarO9.H();
                    return Unit.a;
                } finally {
                    cVarO9.close();
                }
            case 17:
                com.gamericefishpro.space.t0.l1 l1Var = (com.gamericefishpro.space.t0.l1) obj;
                t2 t2Var = com.gamericefishpro.space.i2.j0.b;
                l1Var.getClass();
                Context baseContext = (Context) com.gamericefishpro.space.t0.i.w(l1Var, t2Var);
                while (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof Activity) {
                        return (Activity) baseContext;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
                baseContext = null;
                return (Activity) baseContext;
            case 18:
                return new com.gamericefishpro.space.e1.d((Map) obj);
            case 19:
                return obj;
            case 20:
                ((Integer) obj).getClass();
                return null;
            case 21:
                return Unit.a;
            case 22:
                List list = (List) obj;
                return new com.gamericefishpro.space.f0.w(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 23:
                return Unit.a;
            case 24:
                synchronized (com.gamericefishpro.space.f1.p.c) {
                    ?? r3 = com.gamericefishpro.space.f1.p.i;
                    int size = r3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((Function1) r3.get(i2)).invoke(obj);
                    }
                }
                return Unit.a;
            case 25:
                return Unit.a;
            case 26:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            case 27:
                Context it2 = (Context) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            case 28:
                com.gamericefishpro.space.f5.c anim = (com.gamericefishpro.space.f5.c) obj;
                Intrinsics.checkNotNullParameter(anim, "$this$anim");
                anim.a = 0;
                anim.b = 0;
                return Unit.a;
            default:
                com.gamericefishpro.space.f5.r0 popUpTo = (com.gamericefishpro.space.f5.r0) obj;
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.b = true;
                return Unit.a;
        }
    }

    public /* synthetic */ p(int i, com.gamericefishpro.space.f0.q qVar) {
        this.d = 23;
    }
}
