package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class zw extends nl implements ok {
    public final /* synthetic */ int jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.jb9XjC4I = i3;
    }

    @Override // defpackage.ok
    public final Object qoPGr6Ce() {
        int i = this.jb9XjC4I;
        xe0 xe0Var = xe0.qoPGr6Ce;
        Object obj = this.MdtA4re8;
        switch (i) {
            case 0:
                ((ax) obj).wxUZMvaN();
                return xe0Var;
            case 1:
                ((ax) obj).wxUZMvaN();
                return xe0Var;
            default:
                v30 v30Var = (v30) obj;
                e9 e9Var = v30Var.qoPGr6Ce;
                if (e9Var == null) {
                    fn.ytu5o6f4("coroutineScope");
                    throw null;
                }
                vn vnVar = (vn) e9Var.NCTxEWno.OnDfzHZD(re.VgvYg0wo);
                if (vnVar == null) {
                    m1.P7K7Inc8(e9Var, "Scope cannot be cancelled because it does not have a job: ");
                    return null;
                }
                vnVar.b2ZJblxo(null);
                v30Var.wxUZMvaN();
                zb zbVar = v30Var.VgvYg0wo;
                if (zbVar == null) {
                    fn.ytu5o6f4("connectionManager");
                    throw null;
                }
                ((u7) zbVar.P7K7Inc8).close();
                ua0 ua0Var = (ua0) zbVar.b2ZJblxo;
                if (ua0Var == null) {
                    return xe0Var;
                }
                ua0Var.close();
                return xe0Var;
        }
    }
}
