package defpackage;

import com.yandex.media.ynison.service.s0;
import com.yandex.passport.internal.methods.performer.d1;
import com.yandex.passport.internal.methods.z4;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class f84 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public long l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f84(long j, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 11;
        this.l = j;
        this.n = (aur) function2;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new f84((h84) this.m, (mwk) this.n, this.l, continuation, 0);
            case 1:
                f84 f84Var = new f84(this.l, (iyb) this.n, continuation);
                f84Var.m = obj;
                return f84Var;
            case 2:
                return new f84(this.l, (iz7) this.m, (med[]) this.n, continuation, 2);
            case 3:
                return new f84((xlg) this.m, (ykf) this.n, this.l, continuation, 3);
            case 4:
                return new f84((xlg) this.m, this.l, continuation, (xlg) this.n);
            case 5:
                return new f84((ocn) this.n, this.l, continuation);
            case 6:
                return new f84((omq) this.m, this.l, (qmq) this.n, continuation);
            case 7:
                return new f84(this.l, (AtomicBoolean) this.m, (xtu) this.n, continuation, 7);
            case 8:
                f84 f84Var2 = new f84((rmw) this.n, continuation);
                f84Var2.m = obj;
                return f84Var2;
            case 9:
                return new f84((gsw) this.m, (s0) this.n, this.l, continuation, 9);
            case 10:
                return new f84((d1) this.m, (z4) this.n, continuation);
            default:
                f84 f84Var3 = new f84(this.l, (Function2) this.n, continuation);
                f84Var3.m = obj;
                return f84Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 8:
                ((f84) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((f84) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:183:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0338  */
    /* JADX WARN: Type inference failed for: r5v22, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0328 -> B:157:0x032c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e5 -> B:40:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015b -> B:53:0x010a). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f84.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f84(long j, Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = j;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f84(long j, iyb iybVar, Continuation continuation) {
        super(2, continuation);
        this.j = 1;
        this.l = j;
        this.n = iybVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f84(xlg xlgVar, long j, Continuation continuation, xlg xlgVar2) {
        super(2, continuation);
        this.j = 4;
        this.m = xlgVar;
        this.l = j;
        this.n = xlgVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f84(ocn ocnVar, long j, Continuation continuation) {
        super(2, continuation);
        this.j = 5;
        this.n = ocnVar;
        this.l = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f84(omq omqVar, long j, qmq qmqVar, Continuation continuation) {
        super(2, continuation);
        this.j = 6;
        this.m = omqVar;
        this.l = j;
        this.n = qmqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f84(rmw rmwVar, Continuation continuation) {
        super(2, continuation);
        this.j = 8;
        this.n = rmwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f84(d1 d1Var, z4 z4Var, Continuation continuation) {
        super(2, continuation);
        this.j = 10;
        this.m = d1Var;
        this.n = z4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f84(Object obj, Object obj2, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.l = j;
    }
}
