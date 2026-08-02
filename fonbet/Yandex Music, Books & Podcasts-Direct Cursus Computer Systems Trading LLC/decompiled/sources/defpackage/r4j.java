package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class r4j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5j b;
    public final /* synthetic */ l5j c;
    public final /* synthetic */ int d;

    public /* synthetic */ r4j(i5j i5jVar, l5j l5jVar, int i, int i2) {
        this.a = i2;
        this.b = i5jVar;
        this.c = l5jVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.j(this.c, this.d);
                break;
            case 1:
                int i = this.d;
                this.b.d(this.c.c, i);
                break;
            case 2:
                int i2 = this.d;
                this.b.f(this.c.c, i2);
                break;
            case 3:
                this.b.j(this.c, this.d);
                break;
            case 4:
                int i3 = this.d;
                this.b.h(this.c.c, i3);
                break;
            case 5:
                int i4 = this.d;
                this.b.f(this.c.c, i4);
                break;
            default:
                int i5 = this.d;
                this.b.h(this.c.c, i5);
                break;
        }
        return Unit.a;
    }
}
