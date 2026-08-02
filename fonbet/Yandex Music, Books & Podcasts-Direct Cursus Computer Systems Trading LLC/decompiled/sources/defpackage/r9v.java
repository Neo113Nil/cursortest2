package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class r9v extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ fk0 l;
    public final /* synthetic */ ov6 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r9v(fk0 fk0Var, ov6 ov6Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fk0Var;
        this.m = ov6Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r9v(this.l, this.m, continuation, 0);
            case 1:
                return new r9v(this.l, this.m, continuation, 1);
            default:
                return new r9v(this.l, this.m, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                ((r9v) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return ((r9v) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x013f -> B:45:0x0108). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
