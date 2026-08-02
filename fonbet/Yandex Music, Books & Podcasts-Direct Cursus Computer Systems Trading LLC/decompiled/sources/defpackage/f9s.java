package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class f9s implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9s b;

    public /* synthetic */ f9s(i9s i9sVar, int i) {
        this.a = i;
        this.b = i9sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j;
        switch (this.a) {
            case 0:
                j = this.b.i;
                break;
            default:
                j = this.b.h;
                break;
        }
        return Long.valueOf(j);
    }
}
