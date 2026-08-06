package defpackage;

/* loaded from: classes.dex */
public final class z00 extends defpackage.fm {
    public final /* synthetic */ int AsxAYCCkb3Hi;

    public /* synthetic */ z00(int i) {
        this.AsxAYCCkb3Hi = i;
    }

    @Override // defpackage.fm
    public final void EgCjBq0SZwJ(defpackage.k31 k31Var, java.lang.Object obj) {
        switch (this.AsxAYCCkb3Hi) {
            case 0:
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
                break;
            case 1:
                com.corsair.ledger.data.local.entity.ShardEntity shardEntity = (com.corsair.ledger.data.local.entity.ShardEntity) obj;
                k31Var.getClass();
                shardEntity.getClass();
                k31Var.adDC3e2L(shardEntity.getRarity(), 1);
                k31Var.IHQe1A4L2xu(2, shardEntity.getAmount());
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                com.corsair.ledger.data.local.entity.OwnedRelicEntity ownedRelicEntity = (com.corsair.ledger.data.local.entity.OwnedRelicEntity) obj;
                k31Var.getClass();
                ownedRelicEntity.getClass();
                k31Var.adDC3e2L(ownedRelicEntity.getRelicId(), 1);
                k31Var.IHQe1A4L2xu(2, ownedRelicEntity.getCount());
                break;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                com.corsair.ledger.data.local.entity.ClaimedSetEntity claimedSetEntity = (com.corsair.ledger.data.local.entity.ClaimedSetEntity) obj;
                k31Var.getClass();
                claimedSetEntity.getClass();
                k31Var.adDC3e2L(claimedSetEntity.getSetId(), 1);
                break;
            default:
                com.corsair.ledger.data.local.entity.DigSessionEntity digSessionEntity = (com.corsair.ledger.data.local.entity.DigSessionEntity) obj;
                k31Var.getClass();
                digSessionEntity.getClass();
                k31Var.IHQe1A4L2xu(1, digSessionEntity.getId());
                k31Var.adDC3e2L(digSessionEntity.getIslandId(), 2);
                k31Var.IHQe1A4L2xu(3, digSessionEntity.getSeed());
                k31Var.IHQe1A4L2xu(4, digSessionEntity.getMovesLeft());
                k31Var.adDC3e2L(digSessionEntity.getRevealedCsv(), 5);
                k31Var.IHQe1A4L2xu(6, digSessionEntity.getFinished() ? 1L : 0L);
                break;
        }
    }

    @Override // defpackage.fm
    public final java.lang.String V7bD7b8KA() {
        switch (this.AsxAYCCkb3Hi) {
            case 0:
                return "INSERT INTO `player` (`id`,`doubloons`,`storedEnergy`,`energyAnchorMs`,`lastChestMs`,`victorySeen`,`cellsDug`,`relicsFound`,`legendariesFound`,`craftCount`,`cursedHits`,`tradeCount`,`duplicatesSold`,`peakDoubloons`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT INTO `shards` (`rarity`,`amount`) VALUES (?,?)";
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return "INSERT INTO `owned_relics` (`relicId`,`count`) VALUES (?,?)";
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return "INSERT INTO `claimed_sets` (`setId`) VALUES (?)";
            default:
                return "INSERT INTO `dig_session` (`id`,`islandId`,`seed`,`movesLeft`,`revealedCsv`,`finished`) VALUES (?,?,?,?,?,?)";
        }
    }
}
