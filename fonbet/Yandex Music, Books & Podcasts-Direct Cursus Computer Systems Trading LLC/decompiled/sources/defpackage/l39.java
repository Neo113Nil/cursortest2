package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class l39 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ArrayList s;
    public final /* synthetic */ xqn t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l39(ArrayList arrayList, xqn xqnVar, int i) {
        super(1);
        this.r = i;
        this.s = arrayList;
        this.t = xqnVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                for (i5p i5pVar : this.s) {
                    i5pVar.b++;
                    i5pVar.c++;
                }
                i5p i5pVar2 = (i5p) this.t.a;
                if (i5pVar2 != null) {
                    i5pVar2.b++;
                    i5pVar2.c++;
                }
                return Boolean.TRUE;
            default:
                for (i5p i5pVar3 : this.s) {
                    int i = i5pVar3.b;
                    if (i > 0) {
                        i5pVar3.b = i - 1;
                        i5pVar3.c--;
                    } else {
                        i5pVar3.c++;
                    }
                }
                i5p i5pVar4 = (i5p) this.t.a;
                if (i5pVar4 != null) {
                    int i2 = i5pVar4.b;
                    if (i2 > 0) {
                        i5pVar4.b = i2 - 1;
                        i5pVar4.c--;
                    } else {
                        i5pVar4.c++;
                    }
                }
                return Unit.a;
        }
    }
}
