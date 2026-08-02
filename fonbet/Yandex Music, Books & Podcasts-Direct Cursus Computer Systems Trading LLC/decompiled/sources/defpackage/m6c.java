package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class m6c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ float c;
    public final /* synthetic */ wn5 d;

    public /* synthetic */ m6c(List list, float f, wn5 wn5Var, int i) {
        this.a = i;
        this.b = list;
        this.c = f;
        this.d = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        vuf vufVar = (vuf) obj;
        switch (this.a) {
            case 0:
                vufVar.getClass();
                Iterator it = this.b.iterator();
                int i = 0;
                while (it.hasNext()) {
                    vuf.Y(vufVar, null, new wn5(new j6c(this.c, this.d, i, it.next()), -1002263013, true), 3);
                    i++;
                }
                break;
            default:
                vufVar.getClass();
                List list = this.b;
                vufVar.Z(list.size(), null, new bl(27, list, false), new wn5(new t6c(list, this.c, this.d), -1091073711, true));
                break;
        }
        return Unit.a;
    }
}
