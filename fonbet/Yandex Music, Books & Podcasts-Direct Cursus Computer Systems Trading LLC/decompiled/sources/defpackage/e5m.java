package defpackage;

import android.content.Context;
import com.yandex.plus2.sdk.plaque.api.PlaqueSdk;
import io.appmetrica.analytics.IReporterYandex;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e5m extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ Context k;
    public final /* synthetic */ osl l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5m(Context context, osl oslVar, Continuation continuation) {
        super(2, continuation);
        this.k = context;
        this.l = oslVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        e5m e5mVar = new e5m(this.k, this.l, continuation);
        e5mVar.j = obj;
        return e5mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e5m) create((zqg) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        zqg zqgVar = (zqg) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        ConcurrentHashMap concurrentHashMap = g5m.a;
        a5m a = g5m.a(this.k, (z4m) this.l.invoke(zqgVar.a), PlaqueSdk.Companion.getLibPackage(), PlaqueSdk.Companion.getLibVersion());
        String str = zqgVar.b;
        Map<String, Object> map = zqgVar.c;
        Object value = a.g.getValue();
        value.getClass();
        ((IReporterYandex) value).reportStatboxEvent(str, map);
        return Unit.a;
    }
}
