package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class vi7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iwm b;
    public final /* synthetic */ qw c;

    public /* synthetic */ vi7(iwm iwmVar, qw qwVar, int i) {
        this.a = i;
        this.b = iwmVar;
        this.c = qwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.c(this.c.a);
                break;
            case 1:
                this.b.d(this.c.a);
                break;
            case 2:
                this.b.c(this.c.a);
                break;
            case 3:
                this.b.c(this.c.a);
                break;
            case 4:
                this.b.d(this.c.a);
                break;
            case 5:
                this.b.c(this.c.a);
                break;
            case 6:
                this.b.d(this.c.a);
                break;
            default:
                this.b.c(this.c.a);
                break;
        }
        return Unit.a;
    }
}
