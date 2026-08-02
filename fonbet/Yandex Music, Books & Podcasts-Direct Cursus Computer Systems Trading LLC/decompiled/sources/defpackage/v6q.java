package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class v6q implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7q b;

    public /* synthetic */ v6q(a7q a7qVar, int i) {
        this.a = i;
        this.b = a7qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long c;
        switch (this.a) {
            case 0:
                c = this.b.c();
                break;
            default:
                c = this.b.b(false);
                break;
        }
        return Long.valueOf(c);
    }
}
