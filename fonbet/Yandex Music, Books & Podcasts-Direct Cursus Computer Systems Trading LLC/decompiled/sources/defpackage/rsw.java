package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class rsw implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ rsw(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                vkw vkwVar = (vkw) obj;
                vkwVar.getClass();
                return vkwVar.a;
            default:
                return Unit.a;
        }
    }
}
