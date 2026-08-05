package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class rq extends bb0 implements dl {
    public final /* synthetic */ int P7K7Inc8;
    public final /* synthetic */ Object Qr9iLBAD;
    public int b2ZJblxo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rq(Object obj, g9 g9Var, int i) {
        super(2, g9Var);
        this.P7K7Inc8 = i;
        this.Qr9iLBAD = obj;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        Object obj2 = this.Qr9iLBAD;
        u9 u9Var = u9.NCTxEWno;
        switch (i) {
            case 0:
                int i2 = this.b2ZJblxo;
                if (i2 == 0) {
                    fn.SgZGMMPL(obj);
                    zy zyVar = ((sq) obj2).NCTxEWno;
                    this.b2ZJblxo = 1;
                    if (zyVar.qoPGr6Ce(this) == u9Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    fn.SgZGMMPL(obj);
                    break;
                }
                break;
            case 1:
                int i3 = this.b2ZJblxo;
                if (i3 == 0) {
                    fn.SgZGMMPL(obj);
                    iy iyVar = (iy) obj2;
                    zy zyVar2 = iyVar.NCTxEWno;
                    final long j = iyVar.MdtA4re8;
                    this.b2ZJblxo = 1;
                    ny nyVar = zyVar2.qoPGr6Ce;
                    final long currentTimeMillis = System.currentTimeMillis();
                    Object gjV1z5T1 = fn.gjV1z5T1(this, new zk() { // from class: jy
                        @Override // defpackage.zk
                        public final Object ow5vqvCr(Object obj3) {
                            long j2 = currentTimeMillis;
                            long j3 = j;
                            f40 f40Var = (f40) obj3;
                            f40Var.getClass();
                            h40 Ey6iv0m0 = f40Var.Ey6iv0m0("UPDATE pairings SET openedAt = ? WHERE id = ?");
                            try {
                                Ey6iv0m0.qoPGr6Ce(1, j2);
                                Ey6iv0m0.qoPGr6Ce(2, j3);
                                Ey6iv0m0.amk52bBQ();
                                Ey6iv0m0.close();
                                return xe0.qoPGr6Ce;
                            } catch (Throwable th) {
                                Ey6iv0m0.close();
                                throw th;
                            }
                        }
                    }, nyVar.qoPGr6Ce, false, true);
                    if (gjV1z5T1 != u9Var) {
                        gjV1z5T1 = xe0Var;
                    }
                    if (gjV1z5T1 != u9Var) {
                        gjV1z5T1 = xe0Var;
                    }
                    if (gjV1z5T1 == u9Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    fn.SgZGMMPL(obj);
                    break;
                }
                break;
            default:
                int i4 = this.b2ZJblxo;
                if (i4 == 0) {
                    fn.SgZGMMPL(obj);
                    this.b2ZJblxo = 1;
                    if (((ie0) obj2).VgvYg0wo(this) == u9Var) {
                        break;
                    }
                } else if (i4 != 1) {
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    fn.SgZGMMPL(obj);
                    break;
                }
                break;
        }
        return u9Var;
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        t9 t9Var = (t9) obj;
        g9 g9Var = (g9) obj2;
        switch (i) {
        }
        return ((rq) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        int i = this.P7K7Inc8;
        Object obj2 = this.Qr9iLBAD;
        switch (i) {
            case 0:
                return new rq((sq) obj2, g9Var, 0);
            case 1:
                return new rq((iy) obj2, g9Var, 1);
            default:
                return new rq((ie0) obj2, g9Var, 2);
        }
    }
}
