package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ijt implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ njt b;
    public final /* synthetic */ yit c;
    public final /* synthetic */ int d;

    public /* synthetic */ ijt(int i, int i2, yit yitVar, njt njtVar) {
        this.a = i2;
        this.b = njtVar;
        this.c = yitVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.a(this.c, this.d);
                break;
            default:
                this.b.a(this.c, this.d);
                break;
        }
        return Unit.a;
    }
}
