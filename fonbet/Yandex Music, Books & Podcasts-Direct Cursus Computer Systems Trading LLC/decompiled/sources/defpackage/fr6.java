package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class fr6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ fr6(int i, Function0 function0, boolean z) {
        this.a = i;
        this.b = z;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                if (this.b) {
                    this.c.invoke();
                }
                break;
            default:
                if (!this.b) {
                    this.c.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
