package defpackage;

import com.ybsdk.common.StartSessionCallSource;
import com.ybsdk.common.d;
import com.ybsdk.common.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class vrp0 implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ String c;
    public final /* synthetic */ StartSessionCallSource w;
    public final /* synthetic */ String x;

    public vrp0(jqr jqrVar, e eVar, String str, StartSessionCallSource startSessionCallSource, String str2) {
        this.a = jqrVar;
        this.b = eVar;
        this.c = str;
        this.w = startSessionCallSource;
        this.x = str2;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        Object collect = this.a.collect(new d(vprVar, this.b, this.c, this.w, this.x), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }
}
