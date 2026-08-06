package defpackage;

/* loaded from: classes.dex */
public final class lp1 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ android.net.Uri DFo87pBq1E5;
    public final /* synthetic */ android.content.ContentResolver JlrlGoKF;
    public final /* synthetic */ android.content.Context QoRHpC4k;
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.mp1 SyNS6RMn;
    public final /* synthetic */ defpackage.x9 cnag84Bm;
    public /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public defpackage.u9 riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp1(android.content.ContentResolver contentResolver, android.net.Uri uri, defpackage.mp1 mp1Var, defpackage.x9 x9Var, android.content.Context context, defpackage.ej ejVar) {
        super(2, ejVar);
        this.JlrlGoKF = contentResolver;
        this.DFo87pBq1E5 = uri;
        this.SyNS6RMn = mp1Var;
        this.cnag84Bm = x9Var;
        this.QoRHpC4k = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r6.EXtogiMhuM(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0043, B:15:0x0054, B:17:0x005c, B:25:0x002b, B:27:0x003c), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007e -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.iw iwVar;
        defpackage.u9 u9Var;
        defpackage.iw iwVar2;
        defpackage.u9 u9Var2;
        java.lang.Object oh6vYeIP;
        int i = this.SH1y5HwkJhh;
        defpackage.mp1 mp1Var = this.SyNS6RMn;
        android.content.ContentResolver contentResolver = this.JlrlGoKF;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        try {
            if (i == 0) {
                defpackage.f70.nBH8hAHy(obj);
                iwVar = (defpackage.iw) this.ez2rX8ReCYw;
                contentResolver.registerContentObserver(this.DFo87pBq1E5, false, mp1Var);
                u9Var = new defpackage.u9(this.cnag84Bm);
                this.ez2rX8ReCYw = iwVar;
                this.riuEU0zW4 = u9Var;
                this.SH1y5HwkJhh = 1;
                oh6vYeIP = u9Var.oh6vYeIP(this);
                if (oh6vYeIP != vjVar) {
                }
            } else if (i == 1) {
                u9Var2 = this.riuEU0zW4;
                iwVar2 = (defpackage.iw) this.ez2rX8ReCYw;
                defpackage.f70.nBH8hAHy(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                u9Var2 = this.riuEU0zW4;
                iwVar2 = (defpackage.iw) this.ez2rX8ReCYw;
                defpackage.f70.nBH8hAHy(obj);
                iwVar = iwVar2;
                u9Var = u9Var2;
                this.ez2rX8ReCYw = iwVar;
                this.riuEU0zW4 = u9Var;
                this.SH1y5HwkJhh = 1;
                oh6vYeIP = u9Var.oh6vYeIP(this);
                if (oh6vYeIP != vjVar) {
                    return vjVar;
                }
                defpackage.u9 u9Var3 = u9Var;
                iwVar2 = iwVar;
                obj = oh6vYeIP;
                u9Var2 = u9Var3;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(mp1Var);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
                u9Var2.r1MBDhnF();
                android.content.Context context = this.QoRHpC4k;
                defpackage.nl0 nl0Var = defpackage.np1.IHQe1A4L2xu;
                java.lang.Float f = new java.lang.Float(android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                this.ez2rX8ReCYw = iwVar2;
                this.riuEU0zW4 = u9Var2;
                this.SH1y5HwkJhh = 2;
            }
        } catch (java.lang.Throwable th) {
            contentResolver.unregisterContentObserver(mp1Var);
            throw th;
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.lp1) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.iw) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.lp1 lp1Var = new defpackage.lp1(this.JlrlGoKF, this.DFo87pBq1E5, this.SyNS6RMn, this.cnag84Bm, this.QoRHpC4k, ejVar);
        lp1Var.ez2rX8ReCYw = obj;
        return lp1Var;
    }
}
