package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class lys implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mys b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ lys(mys mysVar, ArrayList arrayList, int i) {
        this.a = i;
        this.b = mysVar;
        this.c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xjo xjoVar = (xjo) obj;
        switch (this.a) {
            case 0:
                xjoVar.getClass();
                this.b.b.G(xjoVar, this.c);
                break;
            default:
                xjoVar.getClass();
                this.b.b.G(xjoVar, this.c);
                break;
        }
        return Unit.a;
    }
}
