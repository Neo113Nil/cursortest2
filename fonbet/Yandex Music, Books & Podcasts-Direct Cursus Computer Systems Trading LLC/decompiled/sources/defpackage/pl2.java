package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class pl2 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ x7o s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl2(x7o x7oVar, int i) {
        super(1);
        this.r = i;
        this.s = x7oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                List list = (List) obj;
                list.getClass();
                qdq.A(new ha0(10, this.s, list));
                break;
            case 1:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                qdq.A(new ql2(this.s, r7wVar, 0));
                break;
            case 2:
                ero eroVar = (ero) obj;
                eroVar.getClass();
                qdq.A(new ha0(14, this.s, eroVar));
                break;
            case 3:
                r7w r7wVar2 = (r7w) obj;
                r7wVar2.getClass();
                qdq.A(new ql2(this.s, r7wVar2, 1));
                break;
            case 4:
                z0r z0rVar = (z0r) obj;
                z0rVar.getClass();
                qdq.A(new ha0(15, this.s, z0rVar));
                break;
            case 5:
                r7w r7wVar3 = (r7w) obj;
                r7wVar3.getClass();
                qdq.A(new ql2(this.s, r7wVar3, 2));
                break;
            case 6:
                p0u p0uVar = (p0u) obj;
                p0uVar.getClass();
                qdq.A(new ha0(16, this.s, p0uVar));
                break;
            case 7:
                r7w r7wVar4 = (r7w) obj;
                r7wVar4.getClass();
                qdq.A(new ql2(this.s, r7wVar4, 3));
                break;
            case 8:
                fgk fgkVar = (fgk) obj;
                fgkVar.getClass();
                v7g.C(new ssb(22, this.s, fgkVar));
                break;
            default:
                r7w r7wVar5 = (r7w) obj;
                r7wVar5.getClass();
                v7g.C(new ql2(this.s, r7wVar5, 4));
                break;
        }
        return Unit.a;
    }
}
