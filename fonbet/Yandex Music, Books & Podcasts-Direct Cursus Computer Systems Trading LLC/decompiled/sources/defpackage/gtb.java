package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class gtb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jyr b;
    public final /* synthetic */ jyr c;
    public final /* synthetic */ jyr d;

    public /* synthetic */ gtb(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, int i) {
        this.a = i;
        this.b = jyrVar;
        this.c = jyrVar2;
        this.d = jyrVar3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new itb(this.b, this.c, this.d);
            default:
                return new f6o(this.b, this.c, this.d);
        }
    }
}
