package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class vd extends FunctionReferenceImpl implements Function4 {
    public vd(xd xdVar) {
        super(4, 0, xd.class, xdVar, "log", "log$android_sdk_base_release(Ljava/lang/String;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/String;Ljava/lang/Throwable;)V");
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        BrazeLogger.Priority priority = (BrazeLogger.Priority) obj2;
        String str2 = (String) obj3;
        str.getClass();
        priority.getClass();
        str2.getClass();
        ((xd) this.receiver).a(str, priority, str2, (Throwable) obj4);
        return Unit.INSTANCE;
    }
}
