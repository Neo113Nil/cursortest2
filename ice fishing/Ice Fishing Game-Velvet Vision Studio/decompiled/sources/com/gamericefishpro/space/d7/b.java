package com.gamericefishpro.space.d7;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.a.a {
    public final /* synthetic */ int c;

    public /* synthetic */ b(int i) {
        this.c = i;
    }

    @Override // com.gamericefishpro.space.a.a
    public final void c(com.gamericefishpro.space.c6.c statement, Object obj) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d entity = (d) obj;
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.a(1, entity.a);
                statement.u(2, entity.b);
                statement.a(3, entity.c ? 1L : 0L);
                statement.a(4, entity.d);
                statement.a(5, entity.e);
                statement.a(6, entity.f);
                break;
            case 1:
                g entity2 = (g) obj;
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity2, "entity");
                statement.u(1, entity2.a);
                statement.u(2, entity2.b);
                statement.u(3, entity2.c);
                statement.a(4, entity2.d ? 1L : 0L);
                statement.a(5, entity2.e);
                break;
            case 2:
                l entity3 = (l) obj;
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity3, "entity");
                statement.a(1, entity3.a);
                statement.a(2, entity3.b);
                statement.a(3, entity3.c);
                statement.a(4, entity3.d);
                statement.a(5, entity3.e ? 1L : 0L);
                statement.u(6, entity3.f);
                statement.a(7, entity3.g);
                break;
            default:
                o entity4 = (o) obj;
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity4, "entity");
                statement.a(1, entity4.a);
                statement.u(2, entity4.b);
                statement.u(3, entity4.c);
                statement.u(4, entity4.d);
                statement.u(5, entity4.e);
                statement.u(6, entity4.f);
                statement.a(7, entity4.g ? 1L : 0L);
                statement.a(8, entity4.h ? 1L : 0L);
                statement.a(9, entity4.i);
                break;
        }
    }

    @Override // com.gamericefishpro.space.a.a
    public final String k() {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "INSERT OR REPLACE INTO `fish_levels` (`level`,`title`,`isLocked`,`stars`,`bestScore`,`coinsEarned`) VALUES (?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `ice_achievements` (`id`,`title`,`description`,`isUnlocked`,`unlockedAt`) VALUES (?,?,?,?,?)";
            case 2:
                return "INSERT OR ABORT INTO `ice_game_history` (`id`,`level`,`score`,`stars`,`isWin`,`defeatReason`,`playedAt`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `ice_startup_params` (`id`,`iceId`,`fishSource`,`fishData`,`fishId`,`iceFishingApp`,`isOnboarded`,`notificationPermissionRequested`,`notificationPermissionRequestCount`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }
}
