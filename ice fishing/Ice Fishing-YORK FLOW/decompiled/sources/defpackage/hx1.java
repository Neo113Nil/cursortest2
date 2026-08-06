package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class hx1 extends defpackage.mi1 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public final /* synthetic */ defpackage.dc T1fB7bDYiVJQ;
    public final /* synthetic */ android.content.Context XntWc4eZSQ8j;
    public defpackage.ac e6mdH7fiFuta;
    public final /* synthetic */ android.content.ContentResolver fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.ix1 gUjdnLbkVAaA;
    public final /* synthetic */ android.net.Uri h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx1(android.content.ContentResolver contentResolver, android.net.Uri uri, defpackage.ix1 ix1Var, defpackage.dc dcVar, android.content.Context context, defpackage.kl klVar) {
        super(2, klVar);
        this.fNwYGHIYeJcR = contentResolver;
        this.h3m55N1URyyK = uri;
        this.gUjdnLbkVAaA = ix1Var;
        this.T1fB7bDYiVJQ = dcVar;
        this.XntWc4eZSQ8j = context;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.hx1) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.ux) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.hx1 hx1Var = new defpackage.hx1(this.fNwYGHIYeJcR, this.h3m55N1URyyK, this.gUjdnLbkVAaA, this.T1fB7bDYiVJQ, this.XntWc4eZSQ8j, klVar);
        hx1Var.Ns0WNyEWdPsk = obj;
        return hx1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r6.fNwYGHIYeJcR(r7, r10) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0043, B:15:0x0054, B:17:0x005c, B:25:0x002b, B:27:0x003c), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007e -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // defpackage.m9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.ux uxVar;
        defpackage.ac acVar;
        defpackage.ux uxVar2;
        defpackage.ac acVar2;
        java.lang.Object giKS3J6vZuNy;
        int i = this.GE9mJIPrb8gP;
        defpackage.ix1 ix1Var = this.gUjdnLbkVAaA;
        android.content.ContentResolver contentResolver = this.fNwYGHIYeJcR;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        try {
            if (i == 0) {
                defpackage.b80.KrtOTfE6jiS2(obj);
                uxVar = (defpackage.ux) this.Ns0WNyEWdPsk;
                contentResolver.registerContentObserver(this.h3m55N1URyyK, false, ix1Var);
                acVar = new defpackage.ac(this.T1fB7bDYiVJQ);
                this.Ns0WNyEWdPsk = uxVar;
                this.e6mdH7fiFuta = acVar;
                this.GE9mJIPrb8gP = 1;
                giKS3J6vZuNy = acVar.giKS3J6vZuNy(this);
                if (giKS3J6vZuNy != tmVar) {
                }
            } else if (i == 1) {
                acVar2 = this.e6mdH7fiFuta;
                uxVar2 = (defpackage.ux) this.Ns0WNyEWdPsk;
                defpackage.b80.KrtOTfE6jiS2(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                acVar2 = this.e6mdH7fiFuta;
                uxVar2 = (defpackage.ux) this.Ns0WNyEWdPsk;
                defpackage.b80.KrtOTfE6jiS2(obj);
                uxVar = uxVar2;
                acVar = acVar2;
                this.Ns0WNyEWdPsk = uxVar;
                this.e6mdH7fiFuta = acVar;
                this.GE9mJIPrb8gP = 1;
                giKS3J6vZuNy = acVar.giKS3J6vZuNy(this);
                if (giKS3J6vZuNy != tmVar) {
                    return tmVar;
                }
                defpackage.ac acVar3 = acVar;
                uxVar2 = uxVar;
                obj = giKS3J6vZuNy;
                acVar2 = acVar3;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(ix1Var);
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
                acVar2.fWTAfUmVKrZq();
                android.content.Context context = this.XntWc4eZSQ8j;
                defpackage.yn0 yn0Var = defpackage.jx1.ZpBGe2uQfcn8;
                java.lang.Float f = new java.lang.Float(android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                this.Ns0WNyEWdPsk = uxVar2;
                this.e6mdH7fiFuta = acVar2;
                this.GE9mJIPrb8gP = 2;
            }
        } catch (java.lang.Throwable th) {
            contentResolver.unregisterContentObserver(ix1Var);
            throw th;
        }
    }
}
