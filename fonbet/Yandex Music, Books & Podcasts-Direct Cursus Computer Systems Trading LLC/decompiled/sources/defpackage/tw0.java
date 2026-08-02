package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class tw0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc7 b;

    public /* synthetic */ tw0(cc7 cc7Var, int i) {
        this.a = i;
        this.b = cc7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((dc7) this.b).b("appsflyer_campaign");
            case 1:
                return ((dc7) this.b).b("autocache_settings_storage");
            default:
                return ((dc7) this.b).b("debug_settings");
        }
    }
}
