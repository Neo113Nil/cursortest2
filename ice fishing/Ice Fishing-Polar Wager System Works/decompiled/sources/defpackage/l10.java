package defpackage;

/* loaded from: classes.dex */
public final class l10 {
    public final defpackage.nj F7NU4MC0GW;
    public final com.corsair.ledger.data.local.CorsairDatabase IHQe1A4L2xu;
    public final defpackage.a10 oh6vYeIP;
    public final defpackage.x5 r1MBDhnF;

    public l10(com.corsair.ledger.data.local.CorsairDatabase corsairDatabase, defpackage.a10 a10Var, defpackage.x5 x5Var, defpackage.nj njVar) {
        corsairDatabase.getClass();
        x5Var.getClass();
        this.IHQe1A4L2xu = corsairDatabase;
        this.oh6vYeIP = a10Var;
        this.r1MBDhnF = x5Var;
        this.F7NU4MC0GW = njVar;
    }

    public static final defpackage.c10 AARZUJiTa(defpackage.l10 l10Var, java.lang.String str) {
        l10Var.getClass();
        return new defpackage.c10(null, new defpackage.uLnPvzwk(str, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    public static final defpackage.n10 F7NU4MC0GW(defpackage.l10 l10Var, defpackage.n10 n10Var, java.lang.String str) {
        java.util.LinkedHashMap linkedHashMap;
        l10Var.getClass();
        defpackage.a01 oh6vYeIP = defpackage.d01.oh6vYeIP(str);
        java.util.Map map = n10Var.EXtogiMhuM;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(n10Var.oh6vYeIP(str) + 1);
        map.getClass();
        if (map.isEmpty()) {
            ?? singletonMap = java.util.Collections.singletonMap(str, valueOf);
            singletonMap.getClass();
            linkedHashMap = singletonMap;
        } else {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(map);
            linkedHashMap2.put(str, valueOf);
            linkedHashMap = linkedHashMap2;
        }
        defpackage.nv0 nv0Var = n10Var.xiZrDbcSW0;
        return defpackage.n10.IHQe1A4L2xu(n10Var, 0, 0, 0L, 0L, defpackage.nv0.IHQe1A4L2xu(nv0Var, 0, nv0Var.oh6vYeIP + 1, nv0Var.r1MBDhnF + (oh6vYeIP.F7NU4MC0GW != com.corsair.ledger.domain.model.Rarity.LEGENDARY ? 0 : 1), 0, 0, 0, 0, 0, 249), null, linkedHashMap, null, null, 863);
    }

    public static final defpackage.n10 IHQe1A4L2xu(defpackage.l10 l10Var, defpackage.n10 n10Var, int i) {
        l10Var.getClass();
        int i2 = n10Var.IHQe1A4L2xu + i;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = i2;
        defpackage.nv0 nv0Var = n10Var.xiZrDbcSW0;
        return defpackage.n10.IHQe1A4L2xu(n10Var, i3, 0, 0L, 0L, defpackage.nv0.IHQe1A4L2xu(nv0Var, 0, 0, 0, 0, 0, 0, 0, java.lang.Math.max(nv0Var.EXtogiMhuM, i3), 127), null, null, null, null, 990);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de A[LOOP:2: B:51:0x01dc->B:52:0x01de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ae  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object adDC3e2L(defpackage.l10 l10Var, defpackage.fj fjVar) {
        defpackage.g10 g10Var;
        int i;
        com.corsair.ledger.data.local.entity.PlayerEntity playerEntity;
        com.corsair.ledger.data.local.entity.PlayerEntity riuEU0zW4;
        int storedEnergy;
        boolean victorySeen;
        java.lang.Object QPwENk36pDC;
        long j;
        long j2;
        defpackage.nv0 nv0Var;
        int i2;
        java.util.Map map;
        boolean z;
        int i3;
        java.lang.Object p11Var;
        int yIx6ChFVk;
        int size;
        int i4;
        int i5;
        int i6;
        long j3;
        java.util.Map map2;
        java.util.LinkedHashMap linkedHashMap;
        java.util.Iterator it;
        java.util.Set set;
        int i7;
        java.util.LinkedHashMap linkedHashMap2;
        long j4;
        defpackage.nv0 nv0Var2;
        defpackage.a10 a10Var = l10Var.oh6vYeIP;
        defpackage.q21 q21Var = a10Var.IHQe1A4L2xu;
        if (fjVar instanceof defpackage.g10) {
            g10Var = (defpackage.g10) fjVar;
            int i8 = g10Var.fnWB2E7cs;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                g10Var.fnWB2E7cs = i8 - Integer.MIN_VALUE;
                java.lang.Object obj = g10Var.kd6TUFXn;
                i = g10Var.fnWB2E7cs;
                defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                switch (i) {
                    case 0:
                        defpackage.f70.nBH8hAHy(obj);
                        g10Var.fnWB2E7cs = 1;
                        obj = defpackage.s21.QPwENk36pDC(g10Var, new defpackage.JX5fKip1C6(13), q21Var, true, false);
                        if (obj == vjVar) {
                            return vjVar;
                        }
                        playerEntity = (com.corsair.ledger.data.local.entity.PlayerEntity) obj;
                        if (playerEntity == null) {
                            l10Var.r1MBDhnF.getClass();
                            riuEU0zW4 = defpackage.a70.riuEU0zW4(java.lang.System.currentTimeMillis());
                            g10Var.EXtogiMhuM = riuEU0zW4;
                            g10Var.riuEU0zW4 = null;
                            g10Var.DFo87pBq1E5 = 0;
                            g10Var.fnWB2E7cs = 2;
                            if (a10Var.IHQe1A4L2xu(riuEU0zW4, g10Var) == vjVar) {
                                return vjVar;
                            }
                            playerEntity = riuEU0zW4;
                        }
                        int doubloons = playerEntity.getDoubloons();
                        storedEnergy = playerEntity.getStoredEnergy();
                        long energyAnchorMs = playerEntity.getEnergyAnchorMs();
                        long lastChestMs = playerEntity.getLastChestMs();
                        victorySeen = playerEntity.getVictorySeen();
                        defpackage.nv0 XZx205DYe = defpackage.a70.XZx205DYe(playerEntity);
                        g10Var.EXtogiMhuM = null;
                        g10Var.riuEU0zW4 = XZx205DYe;
                        g10Var.DFo87pBq1E5 = doubloons;
                        g10Var.SyNS6RMn = storedEnergy;
                        g10Var.cnag84Bm = energyAnchorMs;
                        g10Var.QoRHpC4k = lastChestMs;
                        g10Var.G3OKOH3wZRC = victorySeen;
                        g10Var.fnWB2E7cs = 3;
                        QPwENk36pDC = defpackage.s21.QPwENk36pDC(g10Var, new defpackage.JX5fKip1C6(18), q21Var, true, false);
                        if (QPwENk36pDC == vjVar) {
                            return vjVar;
                        }
                        j = energyAnchorMs;
                        j2 = lastChestMs;
                        nv0Var = XZx205DYe;
                        obj = QPwENk36pDC;
                        i2 = doubloons;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (com.corsair.ledger.data.local.entity.ShardEntity shardEntity : (java.lang.Iterable) obj) {
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
                        g10Var.EXtogiMhuM = null;
                        g10Var.riuEU0zW4 = nv0Var;
                        g10Var.SH1y5HwkJhh = wll2JLbTBC2;
                        g10Var.DFo87pBq1E5 = i2;
                        g10Var.SyNS6RMn = storedEnergy;
                        g10Var.cnag84Bm = j;
                        g10Var.QoRHpC4k = j2;
                        g10Var.G3OKOH3wZRC = victorySeen;
                        g10Var.fnWB2E7cs = 4;
                        obj = defpackage.s21.QPwENk36pDC(g10Var, new defpackage.JX5fKip1C6(15), q21Var, true, false);
                        if (obj != vjVar) {
                            return vjVar;
                        }
                        int i9 = i2;
                        map = wll2JLbTBC2;
                        z = victorySeen;
                        i3 = i9;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : (java.lang.Iterable) obj) {
                            if (((com.corsair.ledger.data.local.entity.OwnedRelicEntity) obj2).getCount() > 0) {
                                arrayList2.add(obj2);
                            }
                        }
                        yIx6ChFVk = defpackage.yh0.yIx6ChFVk(defpackage.ud.EoOhNTTfIN7K(arrayList2, 10));
                        if (yIx6ChFVk < 16) {
                            yIx6ChFVk = 16;
                        }
                        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(yIx6ChFVk);
                        size = arrayList2.size();
                        i4 = 0;
                        while (i4 < size) {
                            com.corsair.ledger.data.local.entity.OwnedRelicEntity ownedRelicEntity = (com.corsair.ledger.data.local.entity.OwnedRelicEntity) arrayList2.get(i4);
                            linkedHashMap3.put(ownedRelicEntity.getRelicId(), new java.lang.Integer(ownedRelicEntity.getCount()));
                            size = size;
                            i4++;
                            arrayList2 = arrayList2;
                        }
                        g10Var.EXtogiMhuM = null;
                        g10Var.riuEU0zW4 = nv0Var;
                        g10Var.SH1y5HwkJhh = map;
                        g10Var.ez2rX8ReCYw = linkedHashMap3;
                        g10Var.DFo87pBq1E5 = i3;
                        g10Var.SyNS6RMn = storedEnergy;
                        g10Var.cnag84Bm = j;
                        g10Var.QoRHpC4k = j2;
                        g10Var.G3OKOH3wZRC = z;
                        g10Var.fnWB2E7cs = 5;
                        obj = defpackage.s21.QPwENk36pDC(g10Var, new defpackage.JX5fKip1C6(25), q21Var, true, false);
                        if (obj != vjVar) {
                            return vjVar;
                        }
                        i5 = storedEnergy;
                        i6 = i3;
                        j3 = j;
                        map2 = map;
                        linkedHashMap = linkedHashMap3;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        it = ((java.lang.Iterable) obj).iterator();
                        while (it.hasNext()) {
                            java.lang.String setId = ((com.corsair.ledger.data.local.entity.ClaimedSetEntity) it.next()).getSetId();
                            defpackage.o01.EXtogiMhuM.getClass();
                            defpackage.o01 cnag84Bm = defpackage.ky.cnag84Bm(setId);
                            if (cnag84Bm != null) {
                                arrayList3.add(cnag84Bm);
                            }
                        }
                        java.util.Set FisHbM7NmV = defpackage.td.FisHbM7NmV(arrayList3);
                        g10Var.EXtogiMhuM = null;
                        g10Var.riuEU0zW4 = nv0Var;
                        g10Var.SH1y5HwkJhh = map2;
                        g10Var.ez2rX8ReCYw = linkedHashMap;
                        g10Var.JlrlGoKF = FisHbM7NmV;
                        g10Var.DFo87pBq1E5 = i6;
                        g10Var.SyNS6RMn = i5;
                        g10Var.cnag84Bm = j3;
                        g10Var.QoRHpC4k = j2;
                        g10Var.G3OKOH3wZRC = z;
                        g10Var.fnWB2E7cs = 6;
                        obj = defpackage.s21.QPwENk36pDC(g10Var, new defpackage.JX5fKip1C6(17), q21Var, true, false);
                        if (obj != vjVar) {
                            return vjVar;
                        }
                        set = FisHbM7NmV;
                        i7 = i6;
                        linkedHashMap2 = linkedHashMap;
                        j4 = j2;
                        nv0Var2 = nv0Var;
                        com.corsair.ledger.data.local.entity.DigSessionEntity digSessionEntity = (com.corsair.ledger.data.local.entity.DigSessionEntity) obj;
                        return new defpackage.n10(i7, i5, j3, j4, z, nv0Var2, map2, linkedHashMap2, set, digSessionEntity == null ? defpackage.a70.p4kuH6PDtgom(digSessionEntity) : null);
                    case 1:
                        defpackage.f70.nBH8hAHy(obj);
                        playerEntity = (com.corsair.ledger.data.local.entity.PlayerEntity) obj;
                        if (playerEntity == null) {
                        }
                        int doubloons2 = playerEntity.getDoubloons();
                        storedEnergy = playerEntity.getStoredEnergy();
                        long energyAnchorMs2 = playerEntity.getEnergyAnchorMs();
                        long lastChestMs2 = playerEntity.getLastChestMs();
                        victorySeen = playerEntity.getVictorySeen();
                        defpackage.nv0 XZx205DYe2 = defpackage.a70.XZx205DYe(playerEntity);
                        g10Var.EXtogiMhuM = null;
                        g10Var.riuEU0zW4 = XZx205DYe2;
                        g10Var.DFo87pBq1E5 = doubloons2;
                        g10Var.SyNS6RMn = storedEnergy;
                        g10Var.cnag84Bm = energyAnchorMs2;
                        g10Var.QoRHpC4k = lastChestMs2;
                        g10Var.G3OKOH3wZRC = victorySeen;
                        g10Var.fnWB2E7cs = 3;
                        QPwENk36pDC = defpackage.s21.QPwENk36pDC(g10Var, new defpackage.JX5fKip1C6(18), q21Var, true, false);
                        if (QPwENk36pDC == vjVar) {
                        }
                        break;
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        riuEU0zW4 = g10Var.EXtogiMhuM;
                        defpackage.f70.nBH8hAHy(obj);
                        playerEntity = riuEU0zW4;
                        int doubloons22 = playerEntity.getDoubloons();
                        storedEnergy = playerEntity.getStoredEnergy();
                        long energyAnchorMs22 = playerEntity.getEnergyAnchorMs();
                        long lastChestMs22 = playerEntity.getLastChestMs();
                        victorySeen = playerEntity.getVictorySeen();
                        defpackage.nv0 XZx205DYe22 = defpackage.a70.XZx205DYe(playerEntity);
                        g10Var.EXtogiMhuM = null;
                        g10Var.riuEU0zW4 = XZx205DYe22;
                        g10Var.DFo87pBq1E5 = doubloons22;
                        g10Var.SyNS6RMn = storedEnergy;
                        g10Var.cnag84Bm = energyAnchorMs22;
                        g10Var.QoRHpC4k = lastChestMs22;
                        g10Var.G3OKOH3wZRC = victorySeen;
                        g10Var.fnWB2E7cs = 3;
                        QPwENk36pDC = defpackage.s21.QPwENk36pDC(g10Var, new defpackage.JX5fKip1C6(18), q21Var, true, false);
                        if (QPwENk36pDC == vjVar) {
                        }
                        break;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        boolean z2 = g10Var.G3OKOH3wZRC;
                        j2 = g10Var.QoRHpC4k;
                        j = g10Var.cnag84Bm;
                        storedEnergy = g10Var.SyNS6RMn;
                        int i10 = g10Var.DFo87pBq1E5;
                        defpackage.nv0 nv0Var3 = g10Var.riuEU0zW4;
                        defpackage.f70.nBH8hAHy(obj);
                        nv0Var = nv0Var3;
                        i2 = i10;
                        victorySeen = z2;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        while (r1.hasNext()) {
                        }
                        java.util.Map wll2JLbTBC22 = defpackage.yh0.wll2JLbTBC2(arrayList4);
                        g10Var.EXtogiMhuM = null;
                        g10Var.riuEU0zW4 = nv0Var;
                        g10Var.SH1y5HwkJhh = wll2JLbTBC22;
                        g10Var.DFo87pBq1E5 = i2;
                        g10Var.SyNS6RMn = storedEnergy;
                        g10Var.cnag84Bm = j;
                        g10Var.QoRHpC4k = j2;
                        g10Var.G3OKOH3wZRC = victorySeen;
                        g10Var.fnWB2E7cs = 4;
                        obj = defpackage.s21.QPwENk36pDC(g10Var, new defpackage.JX5fKip1C6(15), q21Var, true, false);
                        if (obj != vjVar) {
                        }
                        break;
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        z = g10Var.G3OKOH3wZRC;
                        j2 = g10Var.QoRHpC4k;
                        j = g10Var.cnag84Bm;
                        storedEnergy = g10Var.SyNS6RMn;
                        i3 = g10Var.DFo87pBq1E5;
                        map = g10Var.SH1y5HwkJhh;
                        nv0Var = g10Var.riuEU0zW4;
                        defpackage.f70.nBH8hAHy(obj);
                        java.util.ArrayList arrayList22 = new java.util.ArrayList();
                        while (r1.hasNext()) {
                        }
                        yIx6ChFVk = defpackage.yh0.yIx6ChFVk(defpackage.ud.EoOhNTTfIN7K(arrayList22, 10));
                        if (yIx6ChFVk < 16) {
                        }
                        java.util.LinkedHashMap linkedHashMap32 = new java.util.LinkedHashMap(yIx6ChFVk);
                        size = arrayList22.size();
                        i4 = 0;
                        while (i4 < size) {
                        }
                        g10Var.EXtogiMhuM = null;
                        g10Var.riuEU0zW4 = nv0Var;
                        g10Var.SH1y5HwkJhh = map;
                        g10Var.ez2rX8ReCYw = linkedHashMap32;
                        g10Var.DFo87pBq1E5 = i3;
                        g10Var.SyNS6RMn = storedEnergy;
                        g10Var.cnag84Bm = j;
                        g10Var.QoRHpC4k = j2;
                        g10Var.G3OKOH3wZRC = z;
                        g10Var.fnWB2E7cs = 5;
                        obj = defpackage.s21.QPwENk36pDC(g10Var, new defpackage.JX5fKip1C6(25), q21Var, true, false);
                        if (obj != vjVar) {
                        }
                        break;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        z = g10Var.G3OKOH3wZRC;
                        j2 = g10Var.QoRHpC4k;
                        long j5 = g10Var.cnag84Bm;
                        int i11 = g10Var.SyNS6RMn;
                        int i12 = g10Var.DFo87pBq1E5;
                        ?? r14 = g10Var.ez2rX8ReCYw;
                        java.util.Map map3 = g10Var.SH1y5HwkJhh;
                        defpackage.nv0 nv0Var4 = g10Var.riuEU0zW4;
                        defpackage.f70.nBH8hAHy(obj);
                        nv0Var = nv0Var4;
                        linkedHashMap = r14;
                        i5 = i11;
                        i6 = i12;
                        j3 = j5;
                        map2 = map3;
                        java.util.ArrayList arrayList32 = new java.util.ArrayList();
                        it = ((java.lang.Iterable) obj).iterator();
                        while (it.hasNext()) {
                        }
                        java.util.Set FisHbM7NmV2 = defpackage.td.FisHbM7NmV(arrayList32);
                        g10Var.EXtogiMhuM = null;
                        g10Var.riuEU0zW4 = nv0Var;
                        g10Var.SH1y5HwkJhh = map2;
                        g10Var.ez2rX8ReCYw = linkedHashMap;
                        g10Var.JlrlGoKF = FisHbM7NmV2;
                        g10Var.DFo87pBq1E5 = i6;
                        g10Var.SyNS6RMn = i5;
                        g10Var.cnag84Bm = j3;
                        g10Var.QoRHpC4k = j2;
                        g10Var.G3OKOH3wZRC = z;
                        g10Var.fnWB2E7cs = 6;
                        obj = defpackage.s21.QPwENk36pDC(g10Var, new defpackage.JX5fKip1C6(17), q21Var, true, false);
                        if (obj != vjVar) {
                        }
                        break;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        z = g10Var.G3OKOH3wZRC;
                        long j6 = g10Var.QoRHpC4k;
                        j3 = g10Var.cnag84Bm;
                        i5 = g10Var.SyNS6RMn;
                        int i13 = g10Var.DFo87pBq1E5;
                        java.util.Set set2 = g10Var.JlrlGoKF;
                        ?? r11 = g10Var.ez2rX8ReCYw;
                        map2 = g10Var.SH1y5HwkJhh;
                        defpackage.nv0 nv0Var5 = g10Var.riuEU0zW4;
                        defpackage.f70.nBH8hAHy(obj);
                        j4 = j6;
                        nv0Var2 = nv0Var5;
                        i7 = i13;
                        set = set2;
                        linkedHashMap2 = r11;
                        com.corsair.ledger.data.local.entity.DigSessionEntity digSessionEntity2 = (com.corsair.ledger.data.local.entity.DigSessionEntity) obj;
                        return new defpackage.n10(i7, i5, j3, j4, z, nv0Var2, map2, linkedHashMap2, set, digSessionEntity2 == null ? defpackage.a70.p4kuH6PDtgom(digSessionEntity2) : null);
                    default:
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        g10Var = new defpackage.g10(l10Var, fjVar);
        java.lang.Object obj3 = g10Var.kd6TUFXn;
        i = g10Var.fnWB2E7cs;
        defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
        switch (i) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public static final defpackage.n10 oh6vYeIP(defpackage.l10 l10Var, defpackage.n10 n10Var, com.corsair.ledger.domain.model.Rarity rarity, int i) {
        java.util.LinkedHashMap linkedHashMap;
        l10Var.getClass();
        java.util.Map map = n10Var.AARZUJiTa;
        int r1MBDhnF = n10Var.r1MBDhnF(rarity) + i;
        if (r1MBDhnF < 0) {
            r1MBDhnF = 0;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(r1MBDhnF);
        map.getClass();
        if (map.isEmpty()) {
            ?? singletonMap = java.util.Collections.singletonMap(rarity, valueOf);
            singletonMap.getClass();
            linkedHashMap = singletonMap;
        } else {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(map);
            linkedHashMap2.put(rarity, valueOf);
            linkedHashMap = linkedHashMap2;
        }
        return defpackage.n10.IHQe1A4L2xu(n10Var, 0, 0, 0L, 0L, null, linkedHashMap, null, null, null, 959);
    }

    public static final defpackage.n10 r1MBDhnF(defpackage.l10 l10Var, defpackage.n10 n10Var, long j) {
        defpackage.j11 j11Var;
        l10Var.getClass();
        int size = (n10Var.riuEU0zW4.size() * 2) + 20;
        int i = n10Var.oh6vYeIP;
        long min = java.lang.Math.min(n10Var.r1MBDhnF, j);
        if (i >= size) {
            j11Var = new defpackage.j11(i, j, 0L);
        } else {
            int i2 = (int) ((j - min) / 240000);
            int i3 = i + i2;
            if (i3 > size) {
                i3 = size;
            }
            if (i3 >= size) {
                j11Var = new defpackage.j11(i3, j, 0L);
            } else {
                long j2 = (i2 * 240000) + min;
                j11Var = new defpackage.j11(i3, j2, defpackage.x80.DFo87pBq1E5((240000 + j2) - j, 0L, 240000L));
            }
        }
        int i4 = j11Var.IHQe1A4L2xu + 5;
        if (i4 > size) {
            i4 = size;
        }
        return defpackage.n10.IHQe1A4L2xu(n10Var, 0, i4, i4 >= size ? j : j11Var.oh6vYeIP, 0L, null, null, null, null, null, 1017);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x011c, code lost:
    
        if (r0 == r6) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0084, code lost:
    
        if (r2.IHQe1A4L2xu(r0, r4) == r6) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b2, code lost:
    
        if (r0 == r6) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e0 A[LOOP:5: B:105:0x00da->B:107:0x00e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0226 A[LOOP:0: B:42:0x0220->B:44:0x0226, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0179 A[LOOP:3: B:82:0x0173->B:84:0x0179, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object xiZrDbcSW0(defpackage.l10 l10Var, defpackage.n10 n10Var, defpackage.n10 n10Var2, defpackage.fj fjVar) {
        defpackage.i10 i10Var;
        int i;
        defpackage.n10 n10Var3;
        defpackage.n10 n10Var4;
        final java.util.ArrayList arrayList;
        defpackage.n10 n10Var5;
        defpackage.n10 n10Var6;
        final java.util.ArrayList arrayList2;
        java.util.Set boH8X4DXyc4;
        java.util.LinkedHashSet linkedHashSet;
        java.util.Set set;
        final java.util.ArrayList arrayList3;
        java.util.Iterator it;
        defpackage.n10 n10Var7;
        defpackage.op opVar;
        java.lang.Object QPwENk36pDC;
        final defpackage.a10 a10Var = l10Var.oh6vYeIP;
        defpackage.q21 q21Var = a10Var.IHQe1A4L2xu;
        if (fjVar instanceof defpackage.i10) {
            i10Var = (defpackage.i10) fjVar;
            int i2 = i10Var.JlrlGoKF;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i10Var.JlrlGoKF = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = i10Var.SH1y5HwkJhh;
                i = i10Var.JlrlGoKF;
                final int i3 = 2;
                defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                final int i4 = 0;
                final int i5 = 1;
                defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                switch (i) {
                    case 0:
                        defpackage.f70.nBH8hAHy(obj);
                        com.corsair.ledger.data.local.entity.PlayerEntity wll2JLbTBC2 = defpackage.a70.wll2JLbTBC2(n10Var2);
                        if (!defpackage.a70.wll2JLbTBC2(n10Var).equals(wll2JLbTBC2)) {
                            n10Var3 = n10Var;
                            i10Var.EXtogiMhuM = n10Var3;
                            n10Var4 = n10Var2;
                            i10Var.riuEU0zW4 = n10Var4;
                            i10Var.JlrlGoKF = 1;
                            break;
                        } else {
                            n10Var3 = n10Var;
                            n10Var4 = n10Var2;
                        }
                        java.util.Map map = n10Var4.AARZUJiTa;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            if (n10Var3.r1MBDhnF((com.corsair.ledger.domain.model.Rarity) entry.getKey()) != ((java.lang.Number) entry.getValue()).intValue()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        arrayList = new java.util.ArrayList(linkedHashMap.size());
                        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                            arrayList.add(new com.corsair.ledger.data.local.entity.ShardEntity(((com.corsair.ledger.domain.model.Rarity) entry2.getKey()).name(), ((java.lang.Number) entry2.getValue()).intValue()));
                        }
                        if (!arrayList.isEmpty()) {
                            i10Var.EXtogiMhuM = n10Var3;
                            i10Var.riuEU0zW4 = n10Var4;
                            i10Var.JlrlGoKF = 2;
                            java.lang.Object QPwENk36pDC2 = defpackage.s21.QPwENk36pDC(i10Var, new defpackage.g00() { // from class: x00
                                @Override // defpackage.g00
                                public final java.lang.Object AARZUJiTa(java.lang.Object obj2) {
                                    int i6 = i4;
                                    defpackage.ok1 ok1Var2 = defpackage.ok1.IHQe1A4L2xu;
                                    java.util.ArrayList arrayList4 = arrayList;
                                    defpackage.a10 a10Var2 = a10Var;
                                    defpackage.i31 i31Var = (defpackage.i31) obj2;
                                    switch (i6) {
                                        case 0:
                                            i31Var.getClass();
                                            a10Var2.r1MBDhnF.v5iciZok(i31Var, arrayList4);
                                            break;
                                        case 1:
                                            i31Var.getClass();
                                            a10Var2.F7NU4MC0GW.v5iciZok(i31Var, arrayList4);
                                            break;
                                        default:
                                            i31Var.getClass();
                                            a10Var2.adDC3e2L.v5iciZok(i31Var, arrayList4);
                                            break;
                                    }
                                    return ok1Var2;
                                }
                            }, q21Var, false, true);
                            if (QPwENk36pDC2 != vjVar) {
                                QPwENk36pDC2 = ok1Var;
                                break;
                            }
                        }
                        defpackage.n10 n10Var8 = n10Var4;
                        n10Var5 = n10Var3;
                        n10Var6 = n10Var8;
                        java.util.Map map2 = n10Var6.EXtogiMhuM;
                        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                        for (java.util.Map.Entry entry3 : map2.entrySet()) {
                            if (n10Var5.oh6vYeIP((java.lang.String) entry3.getKey()) != ((java.lang.Number) entry3.getValue()).intValue()) {
                                linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        arrayList2 = new java.util.ArrayList(linkedHashMap2.size());
                        for (java.util.Map.Entry entry4 : linkedHashMap2.entrySet()) {
                            arrayList2.add(new com.corsair.ledger.data.local.entity.OwnedRelicEntity((java.lang.String) entry4.getKey(), ((java.lang.Number) entry4.getValue()).intValue()));
                        }
                        if (!arrayList2.isEmpty()) {
                            i10Var.EXtogiMhuM = n10Var5;
                            i10Var.riuEU0zW4 = n10Var6;
                            i10Var.JlrlGoKF = 3;
                            java.lang.Object QPwENk36pDC3 = defpackage.s21.QPwENk36pDC(i10Var, new defpackage.g00() { // from class: x00
                                @Override // defpackage.g00
                                public final java.lang.Object AARZUJiTa(java.lang.Object obj2) {
                                    int i6 = i5;
                                    defpackage.ok1 ok1Var2 = defpackage.ok1.IHQe1A4L2xu;
                                    java.util.ArrayList arrayList4 = arrayList2;
                                    defpackage.a10 a10Var2 = a10Var;
                                    defpackage.i31 i31Var = (defpackage.i31) obj2;
                                    switch (i6) {
                                        case 0:
                                            i31Var.getClass();
                                            a10Var2.r1MBDhnF.v5iciZok(i31Var, arrayList4);
                                            break;
                                        case 1:
                                            i31Var.getClass();
                                            a10Var2.F7NU4MC0GW.v5iciZok(i31Var, arrayList4);
                                            break;
                                        default:
                                            i31Var.getClass();
                                            a10Var2.adDC3e2L.v5iciZok(i31Var, arrayList4);
                                            break;
                                    }
                                    return ok1Var2;
                                }
                            }, q21Var, false, true);
                            if (QPwENk36pDC3 != vjVar) {
                                QPwENk36pDC3 = ok1Var;
                                break;
                            }
                        }
                        java.util.Set set2 = n10Var6.riuEU0zW4;
                        java.util.Set set3 = n10Var5.riuEU0zW4;
                        set2.getClass();
                        set3.getClass();
                        java.util.Set set4 = set3;
                        boH8X4DXyc4 = !(set4 instanceof java.util.Collection) ? set4 : defpackage.td.boH8X4DXyc4(set4);
                        if (boH8X4DXyc4.isEmpty()) {
                            if (boH8X4DXyc4 instanceof java.util.Set) {
                                linkedHashSet = new java.util.LinkedHashSet();
                                for (java.lang.Object obj2 : set2) {
                                    if (!((java.util.Set) boH8X4DXyc4).contains(obj2)) {
                                        linkedHashSet.add(obj2);
                                    }
                                }
                            } else {
                                linkedHashSet = new java.util.LinkedHashSet(set2);
                                linkedHashSet.removeAll(boH8X4DXyc4);
                            }
                            set = linkedHashSet;
                        } else {
                            set = defpackage.td.FisHbM7NmV(set2);
                        }
                        java.util.Set set5 = set;
                        arrayList3 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(set5, 10));
                        it = set5.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(new com.corsair.ledger.data.local.entity.ClaimedSetEntity(((defpackage.o01) it.next()).adDC3e2L));
                        }
                        if (!arrayList3.isEmpty()) {
                            i10Var.EXtogiMhuM = n10Var5;
                            i10Var.riuEU0zW4 = n10Var6;
                            i10Var.JlrlGoKF = 4;
                            java.lang.Object QPwENk36pDC4 = defpackage.s21.QPwENk36pDC(i10Var, new defpackage.g00() { // from class: x00
                                @Override // defpackage.g00
                                public final java.lang.Object AARZUJiTa(java.lang.Object obj22) {
                                    int i6 = i3;
                                    defpackage.ok1 ok1Var2 = defpackage.ok1.IHQe1A4L2xu;
                                    java.util.ArrayList arrayList4 = arrayList3;
                                    defpackage.a10 a10Var2 = a10Var;
                                    defpackage.i31 i31Var = (defpackage.i31) obj22;
                                    switch (i6) {
                                        case 0:
                                            i31Var.getClass();
                                            a10Var2.r1MBDhnF.v5iciZok(i31Var, arrayList4);
                                            break;
                                        case 1:
                                            i31Var.getClass();
                                            a10Var2.F7NU4MC0GW.v5iciZok(i31Var, arrayList4);
                                            break;
                                        default:
                                            i31Var.getClass();
                                            a10Var2.adDC3e2L.v5iciZok(i31Var, arrayList4);
                                            break;
                                    }
                                    return ok1Var2;
                                }
                            }, q21Var, false, true);
                            if (QPwENk36pDC4 != vjVar) {
                                QPwENk36pDC4 = ok1Var;
                            }
                            if (QPwENk36pDC4 != vjVar) {
                                n10Var7 = n10Var5;
                                n10Var5 = n10Var7;
                            }
                            return vjVar;
                        }
                        opVar = n10Var6.SH1y5HwkJhh;
                        if (opVar == null || n10Var5.SH1y5HwkJhh == null) {
                            if (opVar != null && !opVar.equals(n10Var5.SH1y5HwkJhh)) {
                                com.corsair.ledger.data.local.entity.DigSessionEntity digSessionEntity = new com.corsair.ledger.data.local.entity.DigSessionEntity(0, opVar.IHQe1A4L2xu, opVar.oh6vYeIP, opVar.r1MBDhnF, defpackage.td.cSNyPqwud(opVar.F7NU4MC0GW, ",", null, null, null, 62), opVar.adDC3e2L);
                                i10Var.EXtogiMhuM = null;
                                i10Var.riuEU0zW4 = null;
                                i10Var.JlrlGoKF = 6;
                                QPwENk36pDC = defpackage.s21.QPwENk36pDC(i10Var, new defpackage.r1MBDhnF(7, a10Var, digSessionEntity), q21Var, false, true);
                                if (QPwENk36pDC != vjVar) {
                                    QPwENk36pDC = ok1Var;
                                }
                                if (QPwENk36pDC != vjVar) {
                                    return vjVar;
                                }
                            }
                            return ok1Var;
                        }
                        i10Var.EXtogiMhuM = null;
                        i10Var.riuEU0zW4 = null;
                        i10Var.JlrlGoKF = 5;
                        java.lang.Object QPwENk36pDC5 = defpackage.s21.QPwENk36pDC(i10Var, new defpackage.JX5fKip1C6(16), q21Var, false, true);
                        if (QPwENk36pDC5 != vjVar) {
                            QPwENk36pDC5 = ok1Var;
                        }
                        if (QPwENk36pDC5 != vjVar) {
                            return ok1Var;
                        }
                        break;
                    case 1:
                        defpackage.n10 n10Var9 = i10Var.riuEU0zW4;
                        defpackage.n10 n10Var10 = i10Var.EXtogiMhuM;
                        defpackage.f70.nBH8hAHy(obj);
                        n10Var4 = n10Var9;
                        n10Var3 = n10Var10;
                        java.util.Map map3 = n10Var4.AARZUJiTa;
                        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                        while (r0.hasNext()) {
                        }
                        arrayList = new java.util.ArrayList(linkedHashMap3.size());
                        while (r12.hasNext()) {
                        }
                        if (!arrayList.isEmpty()) {
                        }
                        defpackage.n10 n10Var82 = n10Var4;
                        n10Var5 = n10Var3;
                        n10Var6 = n10Var82;
                        java.util.Map map22 = n10Var6.EXtogiMhuM;
                        java.util.LinkedHashMap linkedHashMap22 = new java.util.LinkedHashMap();
                        while (r0.hasNext()) {
                        }
                        arrayList2 = new java.util.ArrayList(linkedHashMap22.size());
                        while (r12.hasNext()) {
                        }
                        if (!arrayList2.isEmpty()) {
                        }
                        java.util.Set set22 = n10Var6.riuEU0zW4;
                        java.util.Set set32 = n10Var5.riuEU0zW4;
                        set22.getClass();
                        set32.getClass();
                        java.util.Set set42 = set32;
                        if (!(set42 instanceof java.util.Collection)) {
                        }
                        if (boH8X4DXyc4.isEmpty()) {
                        }
                        java.util.Set set52 = set;
                        arrayList3 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(set52, 10));
                        it = set52.iterator();
                        while (it.hasNext()) {
                        }
                        if (!arrayList3.isEmpty()) {
                        }
                        opVar = n10Var6.SH1y5HwkJhh;
                        if (opVar == null) {
                            break;
                        }
                        if (opVar != null) {
                            com.corsair.ledger.data.local.entity.DigSessionEntity digSessionEntity2 = new com.corsair.ledger.data.local.entity.DigSessionEntity(0, opVar.IHQe1A4L2xu, opVar.oh6vYeIP, opVar.r1MBDhnF, defpackage.td.cSNyPqwud(opVar.F7NU4MC0GW, ",", null, null, null, 62), opVar.adDC3e2L);
                            i10Var.EXtogiMhuM = null;
                            i10Var.riuEU0zW4 = null;
                            i10Var.JlrlGoKF = 6;
                            QPwENk36pDC = defpackage.s21.QPwENk36pDC(i10Var, new defpackage.r1MBDhnF(7, a10Var, digSessionEntity2), q21Var, false, true);
                            if (QPwENk36pDC != vjVar) {
                            }
                            if (QPwENk36pDC != vjVar) {
                            }
                            break;
                        }
                        return ok1Var;
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        n10Var6 = i10Var.riuEU0zW4;
                        n10Var5 = i10Var.EXtogiMhuM;
                        defpackage.f70.nBH8hAHy(obj);
                        java.util.Map map222 = n10Var6.EXtogiMhuM;
                        java.util.LinkedHashMap linkedHashMap222 = new java.util.LinkedHashMap();
                        while (r0.hasNext()) {
                        }
                        arrayList2 = new java.util.ArrayList(linkedHashMap222.size());
                        while (r12.hasNext()) {
                        }
                        if (!arrayList2.isEmpty()) {
                        }
                        java.util.Set set222 = n10Var6.riuEU0zW4;
                        java.util.Set set322 = n10Var5.riuEU0zW4;
                        set222.getClass();
                        set322.getClass();
                        java.util.Set set422 = set322;
                        if (!(set422 instanceof java.util.Collection)) {
                        }
                        if (boH8X4DXyc4.isEmpty()) {
                        }
                        java.util.Set set522 = set;
                        arrayList3 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(set522, 10));
                        it = set522.iterator();
                        while (it.hasNext()) {
                        }
                        if (!arrayList3.isEmpty()) {
                        }
                        opVar = n10Var6.SH1y5HwkJhh;
                        if (opVar == null) {
                        }
                        if (opVar != null) {
                        }
                        return ok1Var;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        n10Var6 = i10Var.riuEU0zW4;
                        n10Var5 = i10Var.EXtogiMhuM;
                        defpackage.f70.nBH8hAHy(obj);
                        java.util.Set set2222 = n10Var6.riuEU0zW4;
                        java.util.Set set3222 = n10Var5.riuEU0zW4;
                        set2222.getClass();
                        set3222.getClass();
                        java.util.Set set4222 = set3222;
                        if (!(set4222 instanceof java.util.Collection)) {
                        }
                        if (boH8X4DXyc4.isEmpty()) {
                        }
                        java.util.Set set5222 = set;
                        arrayList3 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(set5222, 10));
                        it = set5222.iterator();
                        while (it.hasNext()) {
                        }
                        if (!arrayList3.isEmpty()) {
                        }
                        opVar = n10Var6.SH1y5HwkJhh;
                        if (opVar == null) {
                        }
                        if (opVar != null) {
                        }
                        return ok1Var;
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        n10Var6 = i10Var.riuEU0zW4;
                        n10Var7 = i10Var.EXtogiMhuM;
                        defpackage.f70.nBH8hAHy(obj);
                        n10Var5 = n10Var7;
                        opVar = n10Var6.SH1y5HwkJhh;
                        if (opVar == null) {
                        }
                        if (opVar != null) {
                        }
                        return ok1Var;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        defpackage.f70.nBH8hAHy(obj);
                        return ok1Var;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.f70.nBH8hAHy(obj);
                        return ok1Var;
                    default:
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        i10Var = new defpackage.i10(l10Var, fjVar);
        java.lang.Object obj3 = i10Var.SH1y5HwkJhh;
        i = i10Var.JlrlGoKF;
        final int i32 = 2;
        defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
        final int i42 = 0;
        final int i52 = 1;
        defpackage.ok1 ok1Var2 = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
        }
    }

    public final defpackage.hw EXtogiMhuM() {
        defpackage.q21 q21Var = this.oh6vYeIP.IHQe1A4L2xu;
        defpackage.hw swVar = new defpackage.sw(new defpackage.f10(1, null, this), new defpackage.uw(new defpackage.hw[]{defpackage.ci0.fnWB2E7cs(q21Var, new java.lang.String[]{"player"}, new defpackage.JX5fKip1C6(22)), defpackage.ci0.fnWB2E7cs(q21Var, new java.lang.String[]{"shards"}, new defpackage.JX5fKip1C6(23)), defpackage.ci0.fnWB2E7cs(q21Var, new java.lang.String[]{"owned_relics"}, new defpackage.JX5fKip1C6(20)), defpackage.ci0.fnWB2E7cs(q21Var, new java.lang.String[]{"claimed_sets"}, new defpackage.JX5fKip1C6(21)), defpackage.ci0.fnWB2E7cs(q21Var, new java.lang.String[]{"dig_session"}, new defpackage.JX5fKip1C6(24))}, new defpackage.h10(this, null), 2));
        defpackage.n nVar = defpackage.n.lpprD5VAS;
        defpackage.nj njVar = this.F7NU4MC0GW;
        if (njVar.cnag84Bm(nVar) == null) {
            return njVar.equals(defpackage.lt.adDC3e2L) ? swVar : swVar instanceof defpackage.w00 ? defpackage.w70.V7bD7b8KA((defpackage.w00) swVar, njVar, 0, null, 6) : new defpackage.wb(swVar, njVar, 0, null, 12);
        }
        throw new java.lang.IllegalArgumentException(("Flow context cannot contain job in it. Had " + njVar).toString());
    }

    public final java.lang.Object riuEU0zW4(defpackage.k00 k00Var, defpackage.ej ejVar) {
        return defpackage.fm.QPwENk36pDC(this.F7NU4MC0GW, new defpackage.adDC3e2L(this, k00Var, null, 17), ejVar);
    }
}
