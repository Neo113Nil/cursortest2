package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class cdc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc7 b;
    public final /* synthetic */ frt c;

    public /* synthetic */ cdc(cc7 cc7Var, frt frtVar, int i) {
        this.a = i;
        this.b = cc7Var;
        this.c = frtVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new zcc(this.b, this.c);
            case 1:
                return ((dc7) this.b).c(this.c.c().a, "smart_downloading_storage");
            case 2:
                return ((dc7) this.b).c(this.c.c().a, "widget_settings");
            default:
                return ((dc7) this.b).c(this.c.c().a, "wizard_storage");
        }
    }
}
