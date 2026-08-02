package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class wfd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zfd b;

    public /* synthetic */ wfd(zfd zfdVar, int i) {
        this.a = i;
        this.b = zfdVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long A;
        switch (this.a) {
            case 0:
                A = this.b.A();
                break;
            default:
                A = this.b.y();
                break;
        }
        return Long.valueOf(A);
    }
}
