package com.gamericefishpro.space.d7;

import com.gamericefishpro.space.data.db.IceFishingDatabase_Impl;
import com.gamericefishpro.space.i9.d5;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.gamericefishpro.space.s4.f {
    public final /* synthetic */ IceFishingDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(IceFishingDatabase_Impl iceFishingDatabase_Impl) {
        super(2, "73875fa78764d3b16a14298631f74030", "2b2df51a0ad6716b2faa169d71281fa2");
        this.d = iceFishingDatabase_Impl;
    }

    @Override // com.gamericefishpro.space.s4.f
    public final void a(com.gamericefishpro.space.c6.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        com.gamericefishpro.space.i.a.r(connection, "CREATE TABLE IF NOT EXISTS `fish_levels` (`level` INTEGER NOT NULL, `title` TEXT NOT NULL, `isLocked` INTEGER NOT NULL, `stars` INTEGER NOT NULL, `bestScore` INTEGER NOT NULL, `coinsEarned` INTEGER NOT NULL, PRIMARY KEY(`level`))");
        com.gamericefishpro.space.i.a.r(connection, "CREATE TABLE IF NOT EXISTS `ice_startup_params` (`id` INTEGER NOT NULL, `iceId` TEXT NOT NULL, `fishSource` TEXT NOT NULL, `fishData` TEXT NOT NULL, `fishId` TEXT NOT NULL, `iceFishingApp` TEXT NOT NULL, `isOnboarded` INTEGER NOT NULL, `notificationPermissionRequested` INTEGER NOT NULL, `notificationPermissionRequestCount` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        com.gamericefishpro.space.i.a.r(connection, "CREATE TABLE IF NOT EXISTS `ice_achievements` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `isUnlocked` INTEGER NOT NULL, `unlockedAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        com.gamericefishpro.space.i.a.r(connection, "CREATE TABLE IF NOT EXISTS `ice_game_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `level` INTEGER NOT NULL, `score` INTEGER NOT NULL, `stars` INTEGER NOT NULL, `isWin` INTEGER NOT NULL, `defeatReason` TEXT NOT NULL, `playedAt` INTEGER NOT NULL)");
        com.gamericefishpro.space.i.a.r(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        com.gamericefishpro.space.i.a.r(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '73875fa78764d3b16a14298631f74030')");
    }

    @Override // com.gamericefishpro.space.s4.f
    public final void b(com.gamericefishpro.space.c6.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        com.gamericefishpro.space.i.a.r(connection, "DROP TABLE IF EXISTS `fish_levels`");
        com.gamericefishpro.space.i.a.r(connection, "DROP TABLE IF EXISTS `ice_startup_params`");
        com.gamericefishpro.space.i.a.r(connection, "DROP TABLE IF EXISTS `ice_achievements`");
        com.gamericefishpro.space.i.a.r(connection, "DROP TABLE IF EXISTS `ice_game_history`");
    }

    @Override // com.gamericefishpro.space.s4.f
    public final void c(com.gamericefishpro.space.c6.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    @Override // com.gamericefishpro.space.s4.f
    public final void d(com.gamericefishpro.space.c6.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.d.r(connection);
    }

    @Override // com.gamericefishpro.space.s4.f
    public final void e(com.gamericefishpro.space.c6.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    @Override // com.gamericefishpro.space.s4.f
    public final void f(com.gamericefishpro.space.c6.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        com.gamericefishpro.space.hj.c.t(connection);
    }

    @Override // com.gamericefishpro.space.s4.f
    public final com.gamericefishpro.space.o8.a g(com.gamericefishpro.space.c6.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("level", new com.gamericefishpro.space.y5.f("level", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("title", new com.gamericefishpro.space.y5.f("title", "TEXT", true, 0, null, 1));
        linkedHashMap.put("isLocked", new com.gamericefishpro.space.y5.f("isLocked", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("stars", new com.gamericefishpro.space.y5.f("stars", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("bestScore", new com.gamericefishpro.space.y5.f("bestScore", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("coinsEarned", new com.gamericefishpro.space.y5.f("coinsEarned", "INTEGER", true, 0, null, 1));
        com.gamericefishpro.space.y5.i iVar = new com.gamericefishpro.space.y5.i("fish_levels", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        com.gamericefishpro.space.y5.i iVarR = d5.R(connection, "fish_levels");
        if (!iVar.equals(iVarR)) {
            return new com.gamericefishpro.space.o8.a(false, "fish_levels(com.gamericefishpro.space.data.db.FishLevelEntity).\n Expected:\n" + iVar + "\n Found:\n" + iVarR, 1);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new com.gamericefishpro.space.y5.f("id", "INTEGER", true, 1, null, 1));
        linkedHashMap2.put("iceId", new com.gamericefishpro.space.y5.f("iceId", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("fishSource", new com.gamericefishpro.space.y5.f("fishSource", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("fishData", new com.gamericefishpro.space.y5.f("fishData", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("fishId", new com.gamericefishpro.space.y5.f("fishId", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("iceFishingApp", new com.gamericefishpro.space.y5.f("iceFishingApp", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("isOnboarded", new com.gamericefishpro.space.y5.f("isOnboarded", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("notificationPermissionRequested", new com.gamericefishpro.space.y5.f("notificationPermissionRequested", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("notificationPermissionRequestCount", new com.gamericefishpro.space.y5.f("notificationPermissionRequestCount", "INTEGER", true, 0, null, 1));
        com.gamericefishpro.space.y5.i iVar2 = new com.gamericefishpro.space.y5.i("ice_startup_params", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        com.gamericefishpro.space.y5.i iVarR2 = d5.R(connection, "ice_startup_params");
        if (!iVar2.equals(iVarR2)) {
            return new com.gamericefishpro.space.o8.a(false, "ice_startup_params(com.gamericefishpro.space.data.db.IceStartupParamsEntity).\n Expected:\n" + iVar2 + "\n Found:\n" + iVarR2, 1);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new com.gamericefishpro.space.y5.f("id", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("title", new com.gamericefishpro.space.y5.f("title", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("description", new com.gamericefishpro.space.y5.f("description", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("isUnlocked", new com.gamericefishpro.space.y5.f("isUnlocked", "INTEGER", true, 0, null, 1));
        linkedHashMap3.put("unlockedAt", new com.gamericefishpro.space.y5.f("unlockedAt", "INTEGER", true, 0, null, 1));
        com.gamericefishpro.space.y5.i iVar3 = new com.gamericefishpro.space.y5.i("ice_achievements", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        com.gamericefishpro.space.y5.i iVarR3 = d5.R(connection, "ice_achievements");
        if (!iVar3.equals(iVarR3)) {
            return new com.gamericefishpro.space.o8.a(false, "ice_achievements(com.gamericefishpro.space.data.db.IceAchievementEntity).\n Expected:\n" + iVar3 + "\n Found:\n" + iVarR3, 1);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new com.gamericefishpro.space.y5.f("id", "INTEGER", true, 1, null, 1));
        linkedHashMap4.put("level", new com.gamericefishpro.space.y5.f("level", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("score", new com.gamericefishpro.space.y5.f("score", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("stars", new com.gamericefishpro.space.y5.f("stars", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("isWin", new com.gamericefishpro.space.y5.f("isWin", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("defeatReason", new com.gamericefishpro.space.y5.f("defeatReason", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("playedAt", new com.gamericefishpro.space.y5.f("playedAt", "INTEGER", true, 0, null, 1));
        com.gamericefishpro.space.y5.i iVar4 = new com.gamericefishpro.space.y5.i("ice_game_history", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
        com.gamericefishpro.space.y5.i iVarR4 = d5.R(connection, "ice_game_history");
        if (iVar4.equals(iVarR4)) {
            return new com.gamericefishpro.space.o8.a(true, (String) null, 1);
        }
        return new com.gamericefishpro.space.o8.a(false, "ice_game_history(com.gamericefishpro.space.data.db.IceGameHistoryEntity).\n Expected:\n" + iVar4 + "\n Found:\n" + iVarR4, 1);
    }
}
