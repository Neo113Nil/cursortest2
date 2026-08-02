package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class q4j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5j b;
    public final /* synthetic */ l5j c;

    public /* synthetic */ q4j(i5j i5jVar, l5j l5jVar, int i) {
        this.a = i;
        this.b = i5jVar;
        this.c = l5jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.k(this.c);
                break;
            case 1:
                this.b.i(this.c);
                break;
            default:
                this.b.k(this.c);
                break;
        }
        return Unit.a;
    }
}
