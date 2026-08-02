package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class fv0 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fv0(long j, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                fv0 fv0Var = new fv0(this.m, continuation, 0);
                fv0Var.l = obj;
                return fv0Var;
            case 1:
                fv0 fv0Var2 = new fv0(this.m, continuation, 1);
                fv0Var2.l = obj;
                return fv0Var2;
            case 2:
                fv0 fv0Var3 = new fv0(this.m, continuation, 2);
                fv0Var3.l = obj;
                return fv0Var3;
            default:
                fv0 fv0Var4 = new fv0(this.m, continuation, 3);
                fv0Var4.l = obj;
                return fv0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                ((fv0) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 1:
                ((fv0) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 2:
                ((fv0) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            default:
                ((fv0) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return nm6.a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:14:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0088 -> B:28:0x0071). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e4 -> B:41:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x011d -> B:55:0x0106). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
