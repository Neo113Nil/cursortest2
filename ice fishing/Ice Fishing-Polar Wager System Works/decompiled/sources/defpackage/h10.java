package defpackage;

/* loaded from: classes.dex */
public final class h10 extends defpackage.ce1 implements defpackage.o00 {
    public /* synthetic */ com.corsair.ledger.data.local.entity.DigSessionEntity DFo87pBq1E5;
    public /* synthetic */ java.util.List JlrlGoKF;
    public /* synthetic */ java.util.List SH1y5HwkJhh;
    public final /* synthetic */ defpackage.l10 SyNS6RMn;
    public /* synthetic */ java.util.List ez2rX8ReCYw;
    public /* synthetic */ com.corsair.ledger.data.local.entity.PlayerEntity riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h10(defpackage.l10 l10Var, defpackage.ej ejVar) {
        super(6, ejVar);
        this.SyNS6RMn = l10Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        long currentTimeMillis;
        java.lang.Object p11Var;
        com.corsair.ledger.data.local.entity.PlayerEntity playerEntity = this.riuEU0zW4;
        java.util.List<com.corsair.ledger.data.local.entity.ShardEntity> list = this.SH1y5HwkJhh;
        java.util.List list2 = this.ez2rX8ReCYw;
        java.util.List list3 = this.JlrlGoKF;
        com.corsair.ledger.data.local.entity.DigSessionEntity digSessionEntity = this.DFo87pBq1E5;
        defpackage.f70.nBH8hAHy(obj);
        int doubloons = playerEntity != null ? playerEntity.getDoubloons() : 0;
        int storedEnergy = playerEntity != null ? playerEntity.getStoredEnergy() : 10;
        if (playerEntity != null) {
            currentTimeMillis = playerEntity.getEnergyAnchorMs();
        } else {
            this.SyNS6RMn.r1MBDhnF.getClass();
            currentTimeMillis = java.lang.System.currentTimeMillis();
        }
        long lastChestMs = playerEntity != null ? playerEntity.getLastChestMs() : 0L;
        boolean victorySeen = playerEntity != null ? playerEntity.getVictorySeen() : false;
        defpackage.nv0 XZx205DYe = playerEntity != null ? defpackage.a70.XZx205DYe(playerEntity) : new defpackage.nv0(0, 0, 0, 0, 0, 0, 0, 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.corsair.ledger.data.local.entity.ShardEntity shardEntity : list) {
            try {
                p11Var = com.corsair.ledger.domain.model.Rarity.valueOf(shardEntity.getRarity());
            } catch (java.lang.Throwable th) {
                p11Var = new defpackage.p11(th);
            }
            if (p11Var instanceof defpackage.p11) {
                p11Var = null;
            }
            com.corsair.ledger.domain.model.Rarity rarity = (com.corsair.ledger.domain.model.Rarity) p11Var;
            defpackage.et0 et0Var = rarity != null ? new defpackage.et0(rarity, new java.lang.Integer(shardEntity.getAmount())) : null;
            if (et0Var != null) {
                arrayList.add(et0Var);
            }
        }
        java.util.Map wll2JLbTBC2 = defpackage.yh0.wll2JLbTBC2(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            if (((com.corsair.ledger.data.local.entity.OwnedRelicEntity) obj2).getCount() > 0) {
                arrayList2.add(obj2);
            }
        }
        int yIx6ChFVk = defpackage.yh0.yIx6ChFVk(defpackage.ud.EoOhNTTfIN7K(arrayList2, 10));
        if (yIx6ChFVk < 16) {
            yIx6ChFVk = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(yIx6ChFVk);
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj3 = arrayList2.get(i);
            i++;
            com.corsair.ledger.data.local.entity.OwnedRelicEntity ownedRelicEntity = (com.corsair.ledger.data.local.entity.OwnedRelicEntity) obj3;
            linkedHashMap.put(ownedRelicEntity.getRelicId(), new java.lang.Integer(ownedRelicEntity.getCount()));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = list3.iterator();
        while (it.hasNext()) {
            java.lang.String setId = ((com.corsair.ledger.data.local.entity.ClaimedSetEntity) it.next()).getSetId();
            defpackage.o01.EXtogiMhuM.getClass();
            defpackage.o01 cnag84Bm = defpackage.ky.cnag84Bm(setId);
            if (cnag84Bm != null) {
                arrayList3.add(cnag84Bm);
            }
        }
        return new defpackage.n10(doubloons, storedEnergy, currentTimeMillis, lastChestMs, victorySeen, XZx205DYe, wll2JLbTBC2, linkedHashMap, defpackage.td.FisHbM7NmV(arrayList3), digSessionEntity != null ? defpackage.a70.p4kuH6PDtgom(digSessionEntity) : null);
    }
}
