package defpackage;

import android.content.Context;
import com.yandex.plus2.sdk.plaque.api.PlaqueSdk;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.RtmConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class c5m extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ Context k;
    public final /* synthetic */ osl l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5m(Context context, osl oslVar, Continuation continuation) {
        super(2, continuation);
        this.k = context;
        this.l = oslVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        c5m c5mVar = new c5m(this.k, this.l, continuation);
        c5mVar.j = obj;
        return c5mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c5m) create((q60) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        q60 q60Var = (q60) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        ConcurrentHashMap concurrentHashMap = g5m.a;
        a5m a = g5m.a(this.k, (z4m) this.l.invoke(q60Var.a), PlaqueSdk.Companion.getLibPackage(), PlaqueSdk.Companion.getLibVersion());
        String str = q60Var.c;
        String str2 = q60Var.b;
        String str3 = q60Var.d;
        String str4 = q60Var.e;
        str.getClass();
        Object value = a.g.getValue();
        value.getClass();
        IReporterYandex iReporterYandex = (IReporterYandex) value;
        Long r0 = str2 != null ? StringsKt.r0(10, str2) : null;
        iReporterYandex.setUserProfileID(r0 != null ? String.valueOf(r0.longValue()) : null);
        iReporterYandex.updateRtmConfig(RtmConfig.newBuilder().withProjectName("plus_hq_mobile").withEnvironment(a.e).withUserId(r0 != null ? String.valueOf(r0.longValue()) : null).withSlot(str3).build());
        Object value2 = a.g.getValue();
        value2.getClass();
        ((IReporterYandex) value2).reportEvent(str, str4);
        return Unit.a;
    }
}
