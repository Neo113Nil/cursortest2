package coil3.network.okhttp.internal;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import okhttp3.Response;

/* loaded from: classes3.dex */
public final class CallsKt$await$2$2$onResponse$1 implements Function3 {
    public static final CallsKt$await$2$2$onResponse$1 INSTANCE = new CallsKt$await$2$2$onResponse$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        try {
            Request$Priority$EnumUnboxingLocalUtility.m((Response) obj2);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
