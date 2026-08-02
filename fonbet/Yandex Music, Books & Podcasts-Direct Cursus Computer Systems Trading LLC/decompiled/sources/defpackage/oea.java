package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class oea implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ taj b;

    public /* synthetic */ oea(taj tajVar, int i) {
        this.a = i;
        this.b = tajVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            case 2:
                this.b.a();
                break;
            case 3:
                this.b.d();
                break;
            case 4:
                this.b.d();
                break;
            case 5:
                this.b.a();
                break;
            case 6:
                this.b.a();
                break;
            case 7:
                this.b.d();
                break;
            case 8:
                this.b.a();
                break;
            default:
                this.b.d();
                break;
        }
        return Unit.a;
    }
}
