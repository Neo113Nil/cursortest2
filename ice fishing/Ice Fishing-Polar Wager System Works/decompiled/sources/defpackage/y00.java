package defpackage;

/* loaded from: classes.dex */
public final class y00 extends defpackage.h1 {
    public final /* synthetic */ int D2vUnMij;

    public /* synthetic */ y00(int i) {
        this.D2vUnMij = i;
    }

    @Override // defpackage.h1
    public final void SyNS6RMn(defpackage.k31 k31Var, java.lang.Object obj) {
        switch (this.D2vUnMij) {
            case 0:
                com.corsair.ledger.data.local.entity.DigSessionEntity digSessionEntity = (com.corsair.ledger.data.local.entity.DigSessionEntity) obj;
                k31Var.getClass();
                digSessionEntity.getClass();
                k31Var.IHQe1A4L2xu(1, digSessionEntity.getId());
                k31Var.adDC3e2L(digSessionEntity.getIslandId(), 2);
                k31Var.IHQe1A4L2xu(3, digSessionEntity.getSeed());
                k31Var.IHQe1A4L2xu(4, digSessionEntity.getMovesLeft());
                k31Var.adDC3e2L(digSessionEntity.getRevealedCsv(), 5);
                k31Var.IHQe1A4L2xu(6, digSessionEntity.getFinished() ? 1L : 0L);
                k31Var.IHQe1A4L2xu(7, digSessionEntity.getId());
                break;
            case 1:
                com.corsair.ledger.data.local.entity.PlayerEntity playerEntity = (com.corsair.ledger.data.local.entity.PlayerEntity) obj;
                k31Var.getClass();
                playerEntity.getClass();
                k31Var.IHQe1A4L2xu(1, playerEntity.getId());
                k31Var.IHQe1A4L2xu(2, playerEntity.getDoubloons());
                k31Var.IHQe1A4L2xu(3, playerEntity.getStoredEnergy());
                k31Var.IHQe1A4L2xu(4, playerEntity.getEnergyAnchorMs());
                k31Var.IHQe1A4L2xu(5, playerEntity.getLastChestMs());
                k31Var.IHQe1A4L2xu(6, playerEntity.getVictorySeen() ? 1L : 0L);
                k31Var.IHQe1A4L2xu(7, playerEntity.getCellsDug());
                k31Var.IHQe1A4L2xu(8, playerEntity.getRelicsFound());
                k31Var.IHQe1A4L2xu(9, playerEntity.getLegendariesFound());
                k31Var.IHQe1A4L2xu(10, playerEntity.getCraftCount());
                k31Var.IHQe1A4L2xu(11, playerEntity.getCursedHits());
                k31Var.IHQe1A4L2xu(12, playerEntity.getTradeCount());
                k31Var.IHQe1A4L2xu(13, playerEntity.getDuplicatesSold());
                k31Var.IHQe1A4L2xu(14, playerEntity.getPeakDoubloons());
                k31Var.IHQe1A4L2xu(15, playerEntity.getId());
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                com.corsair.ledger.data.local.entity.ShardEntity shardEntity = (com.corsair.ledger.data.local.entity.ShardEntity) obj;
                k31Var.getClass();
                shardEntity.getClass();
                k31Var.adDC3e2L(shardEntity.getRarity(), 1);
                k31Var.IHQe1A4L2xu(2, shardEntity.getAmount());
                k31Var.adDC3e2L(shardEntity.getRarity(), 3);
                break;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                com.corsair.ledger.data.local.entity.OwnedRelicEntity ownedRelicEntity = (com.corsair.ledger.data.local.entity.OwnedRelicEntity) obj;
                k31Var.getClass();
                ownedRelicEntity.getClass();
                k31Var.adDC3e2L(ownedRelicEntity.getRelicId(), 1);
                k31Var.IHQe1A4L2xu(2, ownedRelicEntity.getCount());
                k31Var.adDC3e2L(ownedRelicEntity.getRelicId(), 3);
                break;
            default:
                com.corsair.ledger.data.local.entity.ClaimedSetEntity claimedSetEntity = (com.corsair.ledger.data.local.entity.ClaimedSetEntity) obj;
                k31Var.getClass();
                claimedSetEntity.getClass();
                k31Var.adDC3e2L(claimedSetEntity.getSetId(), 1);
                k31Var.adDC3e2L(claimedSetEntity.getSetId(), 2);
                break;
        }
    }

    @Override // defpackage.h1
    public final java.lang.String fnWB2E7cs() {
        switch (this.D2vUnMij) {
            case 0:
                return "UPDATE `dig_session` SET `id` = ?,`islandId` = ?,`seed` = ?,`movesLeft` = ?,`revealedCsv` = ?,`finished` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE `player` SET `id` = ?,`doubloons` = ?,`storedEnergy` = ?,`energyAnchorMs` = ?,`lastChestMs` = ?,`victorySeen` = ?,`cellsDug` = ?,`relicsFound` = ?,`legendariesFound` = ?,`craftCount` = ?,`cursedHits` = ?,`tradeCount` = ?,`duplicatesSold` = ?,`peakDoubloons` = ? WHERE `id` = ?";
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return "UPDATE `shards` SET `rarity` = ?,`amount` = ? WHERE `rarity` = ?";
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return "UPDATE `owned_relics` SET `relicId` = ?,`count` = ? WHERE `relicId` = ?";
            default:
                return "UPDATE `claimed_sets` SET `setId` = ? WHERE `setId` = ?";
        }
    }
}
