package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class JX5fKip1C6 implements defpackage.g00 {
    public final /* synthetic */ int adDC3e2L;

    public /* synthetic */ JX5fKip1C6(int i) {
        this.adDC3e2L = i;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        defpackage.k31 nBH8hAHy;
        switch (this.adDC3e2L) {
            case 0:
                defpackage.mj0 mj0Var = defpackage.juTJww2r.IHQe1A4L2xu;
                return defpackage.ok1.IHQe1A4L2xu;
            case 1:
                android.content.Context context = (android.content.Context) obj;
                context.getClass();
                if (context instanceof android.content.ContextWrapper) {
                    return ((android.content.ContextWrapper) context).getBaseContext();
                }
                return null;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.oa0) obj).IHQe1A4L2xu();
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.gu0 gu0Var = (defpackage.gu0) obj;
                defpackage.nc1 nc1Var = defpackage.j1.oh6vYeIP;
                gu0Var.getClass();
                if (((android.content.Context) defpackage.h1.yIx6ChFVk(gu0Var, nc1Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return defpackage.n9.oh6vYeIP;
                }
                defpackage.l9.IHQe1A4L2xu.getClass();
                return defpackage.k9.r1MBDhnF;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                defpackage.l71.IHQe1A4L2xu((defpackage.n71) obj, 0);
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.ui1) obj).getClass();
                throw new java.lang.ClassCastException();
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.ui1) obj).getClass();
                throw new java.lang.ClassCastException();
            case 9:
                defpackage.l71.IHQe1A4L2xu((defpackage.n71) obj, 1);
                return defpackage.ok1.IHQe1A4L2xu;
            case 10:
                defpackage.gu0 gu0Var2 = (defpackage.gu0) obj;
                defpackage.qh qhVar = defpackage.k40.IHQe1A4L2xu;
                gu0Var2.getClass();
                android.view.View view = ((defpackage.dn1) defpackage.h1.yIx6ChFVk(gu0Var2, qhVar)).IHQe1A4L2xu;
                while (view != null) {
                    java.lang.Object tag = view.getTag(com.combinations.spin.balbi.R.id.view_tree_view_model_store_owner);
                    if (tag != null) {
                        return tag;
                    }
                    java.lang.Object EgCjBq0SZwJ = defpackage.e90.EgCjBq0SZwJ(view);
                    view = EgCjBq0SZwJ instanceof android.view.View ? (android.view.View) EgCjBq0SZwJ : null;
                }
                return null;
            case 11:
                defpackage.jj jjVar = (defpackage.jj) obj;
                if (jjVar instanceof defpackage.nj) {
                    return (defpackage.nj) jjVar;
                }
                return null;
            case 12:
                defpackage.do0 do0Var = (defpackage.do0) obj;
                do0Var.getClass();
                do0Var.IHQe1A4L2xu("dig");
                do0Var.r1MBDhnF = -1;
                defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
                do0Var.adDC3e2L = true;
                do0Var.xiZrDbcSW0 = false;
                do0Var.oh6vYeIP = true;
                return ok1Var;
            case 13:
                defpackage.i31 i31Var = (defpackage.i31) obj;
                i31Var.getClass();
                nBH8hAHy = i31Var.nBH8hAHy("SELECT * FROM player WHERE id = 0");
                try {
                    return nBH8hAHy.NHJTzaLwkd() ? new com.corsair.ledger.data.local.entity.PlayerEntity((int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "id")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "doubloons")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "storedEnergy")), nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "energyAnchorMs")), nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "lastChestMs")), ((int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "victorySeen"))) != 0, (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "cellsDug")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "relicsFound")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "legendariesFound")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "craftCount")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "cursedHits")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "tradeCount")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "duplicatesSold")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "peakDoubloons"))) : null;
                } finally {
                }
            case 14:
                defpackage.i31 i31Var2 = (defpackage.i31) obj;
                i31Var2.getClass();
                nBH8hAHy = i31Var2.nBH8hAHy("DELETE FROM shards");
                try {
                    nBH8hAHy.NHJTzaLwkd();
                    nBH8hAHy.close();
                    return defpackage.ok1.IHQe1A4L2xu;
                } finally {
                }
            case 15:
                defpackage.i31 i31Var3 = (defpackage.i31) obj;
                i31Var3.getClass();
                nBH8hAHy = i31Var3.nBH8hAHy("SELECT * FROM owned_relics");
                try {
                    int cnag84Bm = defpackage.f70.cnag84Bm(nBH8hAHy, "relicId");
                    int cnag84Bm2 = defpackage.f70.cnag84Bm(nBH8hAHy, "count");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (nBH8hAHy.NHJTzaLwkd()) {
                        arrayList.add(new com.corsair.ledger.data.local.entity.OwnedRelicEntity(nBH8hAHy.xiZrDbcSW0(cnag84Bm), (int) nBH8hAHy.getLong(cnag84Bm2)));
                    }
                    return arrayList;
                } finally {
                }
            case 16:
                defpackage.i31 i31Var4 = (defpackage.i31) obj;
                i31Var4.getClass();
                nBH8hAHy = i31Var4.nBH8hAHy("DELETE FROM dig_session");
                try {
                    nBH8hAHy.NHJTzaLwkd();
                    nBH8hAHy.close();
                    return defpackage.ok1.IHQe1A4L2xu;
                } finally {
                }
            case 17:
                defpackage.i31 i31Var5 = (defpackage.i31) obj;
                i31Var5.getClass();
                nBH8hAHy = i31Var5.nBH8hAHy("SELECT * FROM dig_session WHERE id = 0");
                try {
                    return nBH8hAHy.NHJTzaLwkd() ? new com.corsair.ledger.data.local.entity.DigSessionEntity((int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "id")), nBH8hAHy.xiZrDbcSW0(defpackage.f70.cnag84Bm(nBH8hAHy, "islandId")), nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "seed")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "movesLeft")), nBH8hAHy.xiZrDbcSW0(defpackage.f70.cnag84Bm(nBH8hAHy, "revealedCsv")), ((int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "finished"))) != 0) : null;
                } finally {
                }
            case 18:
                defpackage.i31 i31Var6 = (defpackage.i31) obj;
                i31Var6.getClass();
                nBH8hAHy = i31Var6.nBH8hAHy("SELECT * FROM shards");
                try {
                    int cnag84Bm3 = defpackage.f70.cnag84Bm(nBH8hAHy, "rarity");
                    int cnag84Bm4 = defpackage.f70.cnag84Bm(nBH8hAHy, "amount");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (nBH8hAHy.NHJTzaLwkd()) {
                        arrayList2.add(new com.corsair.ledger.data.local.entity.ShardEntity(nBH8hAHy.xiZrDbcSW0(cnag84Bm3), (int) nBH8hAHy.getLong(cnag84Bm4)));
                    }
                    return arrayList2;
                } finally {
                }
            case 19:
                defpackage.i31 i31Var7 = (defpackage.i31) obj;
                i31Var7.getClass();
                nBH8hAHy = i31Var7.nBH8hAHy("DELETE FROM owned_relics");
                try {
                    nBH8hAHy.NHJTzaLwkd();
                    nBH8hAHy.close();
                    return defpackage.ok1.IHQe1A4L2xu;
                } finally {
                }
            case 20:
                defpackage.i31 i31Var8 = (defpackage.i31) obj;
                i31Var8.getClass();
                nBH8hAHy = i31Var8.nBH8hAHy("SELECT * FROM owned_relics");
                try {
                    int cnag84Bm5 = defpackage.f70.cnag84Bm(nBH8hAHy, "relicId");
                    int cnag84Bm6 = defpackage.f70.cnag84Bm(nBH8hAHy, "count");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    while (nBH8hAHy.NHJTzaLwkd()) {
                        arrayList3.add(new com.corsair.ledger.data.local.entity.OwnedRelicEntity(nBH8hAHy.xiZrDbcSW0(cnag84Bm5), (int) nBH8hAHy.getLong(cnag84Bm6)));
                    }
                    return arrayList3;
                } finally {
                }
            case 21:
                defpackage.i31 i31Var9 = (defpackage.i31) obj;
                i31Var9.getClass();
                nBH8hAHy = i31Var9.nBH8hAHy("SELECT * FROM claimed_sets");
                try {
                    int cnag84Bm7 = defpackage.f70.cnag84Bm(nBH8hAHy, "setId");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    while (nBH8hAHy.NHJTzaLwkd()) {
                        arrayList4.add(new com.corsair.ledger.data.local.entity.ClaimedSetEntity(nBH8hAHy.xiZrDbcSW0(cnag84Bm7)));
                    }
                    return arrayList4;
                } finally {
                }
            case 22:
                defpackage.i31 i31Var10 = (defpackage.i31) obj;
                i31Var10.getClass();
                nBH8hAHy = i31Var10.nBH8hAHy("SELECT * FROM player WHERE id = 0");
                try {
                    return nBH8hAHy.NHJTzaLwkd() ? new com.corsair.ledger.data.local.entity.PlayerEntity((int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "id")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "doubloons")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "storedEnergy")), nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "energyAnchorMs")), nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "lastChestMs")), ((int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "victorySeen"))) != 0, (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "cellsDug")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "relicsFound")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "legendariesFound")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "craftCount")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "cursedHits")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "tradeCount")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "duplicatesSold")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "peakDoubloons"))) : null;
                } finally {
                }
            case 23:
                defpackage.i31 i31Var11 = (defpackage.i31) obj;
                i31Var11.getClass();
                nBH8hAHy = i31Var11.nBH8hAHy("SELECT * FROM shards");
                try {
                    int cnag84Bm8 = defpackage.f70.cnag84Bm(nBH8hAHy, "rarity");
                    int cnag84Bm9 = defpackage.f70.cnag84Bm(nBH8hAHy, "amount");
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    while (nBH8hAHy.NHJTzaLwkd()) {
                        arrayList5.add(new com.corsair.ledger.data.local.entity.ShardEntity(nBH8hAHy.xiZrDbcSW0(cnag84Bm8), (int) nBH8hAHy.getLong(cnag84Bm9)));
                    }
                    return arrayList5;
                } finally {
                }
            case 24:
                defpackage.i31 i31Var12 = (defpackage.i31) obj;
                i31Var12.getClass();
                nBH8hAHy = i31Var12.nBH8hAHy("SELECT * FROM dig_session WHERE id = 0");
                try {
                    return nBH8hAHy.NHJTzaLwkd() ? new com.corsair.ledger.data.local.entity.DigSessionEntity((int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "id")), nBH8hAHy.xiZrDbcSW0(defpackage.f70.cnag84Bm(nBH8hAHy, "islandId")), nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "seed")), (int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "movesLeft")), nBH8hAHy.xiZrDbcSW0(defpackage.f70.cnag84Bm(nBH8hAHy, "revealedCsv")), ((int) nBH8hAHy.getLong(defpackage.f70.cnag84Bm(nBH8hAHy, "finished"))) != 0) : null;
                } finally {
                }
            case 25:
                defpackage.i31 i31Var13 = (defpackage.i31) obj;
                i31Var13.getClass();
                nBH8hAHy = i31Var13.nBH8hAHy("SELECT * FROM claimed_sets");
                try {
                    int cnag84Bm10 = defpackage.f70.cnag84Bm(nBH8hAHy, "setId");
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    while (nBH8hAHy.NHJTzaLwkd()) {
                        arrayList6.add(new com.corsair.ledger.data.local.entity.ClaimedSetEntity(nBH8hAHy.xiZrDbcSW0(cnag84Bm10)));
                    }
                    return arrayList6;
                } finally {
                }
            case 26:
                defpackage.i31 i31Var14 = (defpackage.i31) obj;
                i31Var14.getClass();
                nBH8hAHy = i31Var14.nBH8hAHy("DELETE FROM claimed_sets");
                try {
                    nBH8hAHy.NHJTzaLwkd();
                    nBH8hAHy.close();
                    return defpackage.ok1.IHQe1A4L2xu;
                } finally {
                }
            case 27:
                synchronized (defpackage.wa1.r1MBDhnF) {
                    java.util.List list = defpackage.wa1.riuEU0zW4;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((defpackage.g00) list.get(i)).AARZUJiTa(obj);
                    }
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case 28:
                defpackage.j30 j30Var = (defpackage.j30) obj;
                j30Var.getClass();
                return j30Var.IHQe1A4L2xu;
            default:
                ((java.lang.Integer) obj).getClass();
                return null;
        }
    }
}
