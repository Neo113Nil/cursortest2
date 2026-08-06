package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements defpackage.vz {
    public final /* synthetic */ int adDC3e2L;

    public /* synthetic */ g(int i) {
        this.adDC3e2L = i;
    }

    @Override // defpackage.vz
    public final java.lang.Object IHQe1A4L2xu() {
        java.lang.Class<?> returnType;
        java.lang.Object p11Var;
        int i = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                defpackage.ct0 ct0Var = defpackage.m.IHQe1A4L2xu;
                return defpackage.im.IHQe1A4L2xu;
            case 1:
                defpackage.nc1 nc1Var = defpackage.a8.IHQe1A4L2xu;
                return null;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.he.adDC3e2L(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.nc1 nc1Var2 = defpackage.he.IHQe1A4L2xu;
                return java.lang.Boolean.TRUE;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.nc1 nc1Var3 = defpackage.jh.IHQe1A4L2xu;
                return null;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                defpackage.dh.oh6vYeIP("Unexpected call to default provider");
                throw new defpackage.cf();
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.nc1 nc1Var4 = defpackage.cv.IHQe1A4L2xu;
                return null;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                try {
                    java.lang.reflect.Method declaredMethod = android.database.sqlite.SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (java.lang.Throwable unused) {
                    return null;
                }
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                try {
                    java.lang.String[] strArr = defpackage.mz.xiZrDbcSW0;
                    java.lang.reflect.Method method = (java.lang.reflect.Method) defpackage.mz.AARZUJiTa.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    java.lang.Class cls = java.lang.Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, android.database.sqlite.SQLiteTransactionListener.class, cls, android.os.CancellationSignal.class);
                } catch (java.lang.Throwable unused2) {
                    return null;
                }
            case 9:
                try {
                    p11Var = new android.media.ToneGenerator(3, 60);
                } catch (java.lang.Throwable th) {
                    p11Var = new defpackage.p11(th);
                }
                return (android.media.ToneGenerator) (p11Var instanceof defpackage.p11 ? null : p11Var);
            case 10:
                throw new java.lang.IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 11:
                defpackage.qh qhVar = defpackage.c50.IHQe1A4L2xu;
                return defpackage.lm.IHQe1A4L2xu;
            case 12:
                defpackage.nc1 nc1Var5 = defpackage.s60.IHQe1A4L2xu;
                return null;
            case 13:
                defpackage.g40 g40Var = defpackage.o70.IHQe1A4L2xu;
                return java.lang.Boolean.TRUE;
            case 14:
                return new defpackage.uq(48.0f);
            case 15:
            case 16:
                return ok1Var;
            case 17:
                return new defpackage.yc0(0, 0);
            case 18:
                throw new java.lang.IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 19:
                defpackage.qh qhVar2 = defpackage.ze0.IHQe1A4L2xu;
                return null;
            case 20:
                defpackage.qh qhVar3 = defpackage.af0.IHQe1A4L2xu;
                return null;
            case 21:
                defpackage.nc1 nc1Var6 = defpackage.bf0.IHQe1A4L2xu;
                return defpackage.n.mAr5m2L7gYDP;
            case 22:
                throw new java.lang.IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 23:
                defpackage.nc1 nc1Var7 = defpackage.bi0.IHQe1A4L2xu;
                return java.lang.Boolean.FALSE;
            case 24:
                return defpackage.zj0.IHQe1A4L2xu;
            case 25:
                return new defpackage.j41();
            case 26:
                defpackage.u50 u50Var = new defpackage.u50(0);
                u50Var.IHQe1A4L2xu(defpackage.sz0.IHQe1A4L2xu(defpackage.om0.class), new defpackage.uc0(7));
                return u50Var.oh6vYeIP();
            case 27:
                return new defpackage.ps0();
            case 28:
                return new defpackage.f21();
            default:
                return new defpackage.s31(new java.util.LinkedHashMap());
        }
    }
}
