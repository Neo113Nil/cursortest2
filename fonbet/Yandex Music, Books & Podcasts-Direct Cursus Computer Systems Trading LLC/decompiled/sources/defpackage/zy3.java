package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.yandex.passport.internal.ui.challenge.c0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class zy3 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public int l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy3(fvf fvfVar, Object obj, Object obj2, int i, Function1 function1, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.m = fvfVar;
        this.n = obj;
        this.o = obj2;
        this.l = i;
        this.p = function1;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new zy3((az3) this.o, continuation);
            case 1:
                return new zy3((hr4) this.m, (c80) this.n, (g8l) this.o, (g8l) this.p, this.l, continuation, 1);
            case 2:
                zy3 zy3Var = new zy3((pkd) this.m, (Context) this.n, this.l, (Bundle) this.o, continuation, 2);
                zy3Var.p = obj;
                return zy3Var;
            case 3:
                zy3 zy3Var2 = new zy3((pkd) this.m, (Context) this.n, this.l, (String) this.o, continuation, 3);
                zy3Var2.p = obj;
                return zy3Var2;
            case 4:
                return new zy3((fvf) this.m, (aqi) this.n, (suf) this.o, this.l, (Function1) this.p, continuation, 4);
            case 5:
                return new zy3((fvf) this.m, (suf) this.n, (List) this.o, this.l, (Function1) this.p, continuation, 5);
            case 6:
                return new zy3((Function0) this.m, (Context) this.n, (mm6) this.o, (fvf) this.p, this.l, continuation, 6);
            default:
                return new zy3((bsh) this.o, (c0) this.p, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((zy3) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0449  */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17, types: [xv] */
    /* JADX WARN: Type inference failed for: r9v18, types: [de3] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x02b6 -> B:104:0x02bb). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy3(pkd pkdVar, Context context, int i, Object obj, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.m = pkdVar;
        this.n = context;
        this.l = i;
        this.o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy3(az3 az3Var, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.o = az3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy3(bsh bshVar, c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.j = 7;
        this.o = bshVar;
        this.p = c0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy3(Object obj, Object obj2, Object obj3, Object obj4, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
        this.p = obj4;
        this.l = i;
    }
}
