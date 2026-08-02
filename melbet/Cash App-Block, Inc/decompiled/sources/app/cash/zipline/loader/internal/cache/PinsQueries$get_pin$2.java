package app.cash.zipline.loader.internal.cache;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class PinsQueries$get_pin$2 extends FunctionReferenceImpl implements Function2 {
    public static final PinsQueries$get_pin$2 INSTANCE = new PinsQueries$get_pin$2(2, Pins.class, "<init>", "<init>(JLjava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        String str = (String) obj2;
        str.getClass();
        return new Pins(longValue, str);
    }
}
