package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class t89 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ dom s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t89(dom domVar, int i) {
        super(1);
        this.r = i;
        this.s = domVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                qnm qnmVar = (qnm) obj;
                dom domVar = this.s;
                if (domVar != null) {
                    domVar.a(qnmVar);
                }
                break;
            case 1:
                this.s.a(new or5((List) obj));
                break;
            default:
                this.s.a(new or5((List) obj));
                break;
        }
        return Unit.a;
    }
}
