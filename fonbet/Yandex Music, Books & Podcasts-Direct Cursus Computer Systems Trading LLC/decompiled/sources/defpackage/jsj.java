package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class jsj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hsj b;
    public final /* synthetic */ jnq c;
    public final /* synthetic */ tmb d;

    public /* synthetic */ jsj(hsj hsjVar, jnq jnqVar, tmb tmbVar, int i) {
        this.a = i;
        this.b = hsjVar;
        this.c = jnqVar;
        this.d = tmbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new i3(this.b, this.c, this.d);
            default:
                return new ksj(this.b, this.c, this.d);
        }
    }
}
