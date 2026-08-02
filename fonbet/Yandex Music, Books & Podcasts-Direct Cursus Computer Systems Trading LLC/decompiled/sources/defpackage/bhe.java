package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class bhe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ coq b;
    public final /* synthetic */ jnq c;

    public /* synthetic */ bhe(coq coqVar, jnq jnqVar, int i) {
        this.a = i;
        this.b = coqVar;
        this.c = jnqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new y3(this.b, this.c);
            default:
                return new che(this.b, this.c);
        }
    }
}
