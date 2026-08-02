package yads;

import android.content.Context;
import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import defpackage.b9a1;
import defpackage.dha1;
import defpackage.eo81;
import defpackage.gg81;
import defpackage.ib81;
import defpackage.j181;
import defpackage.jl61;
import defpackage.nr81;
import defpackage.rr81;
import defpackage.sia1;
import defpackage.sls;
import defpackage.zk81;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class n7 extends Lambda implements sls {
    public final /* synthetic */ j181 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(j181 j181Var) {
        super(0);
        this.b = j181Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object failure;
        Object obj;
        jl61 jl61Var;
        Object failure2;
        new rr81();
        Context applicationContext = this.b.a.getApplicationContext();
        try {
            gg81 a = dha1.f().a(applicationContext);
            obj = null;
            jl61 jl61Var2 = a != null ? a.y0 : null;
            jl61Var = (jl61Var2 == null || !b9a1.a(applicationContext.getApplicationContext(), eq0.f)) ? jl61Var2 : new jl61(jl61Var2.a, true, jl61Var2.c, jl61Var2.d, jl61Var2.e, jl61Var2.f, jl61Var2.g, jl61Var2.h);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (jl61Var != null && jl61Var.a) {
            AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration = new AdQualityVerifierAdapterConfiguration(jl61Var.c, jl61Var.d, jl61Var.b, b9a1.a(applicationContext.getApplicationContext(), eq0.f));
            try {
                Object c = sia1.c("com.yandex.mobile.ads.quality.AdQualityVerifierAdapter", new Object[0]);
                failure2 = c instanceof AdQualityVerifierAdapter ? (AdQualityVerifierAdapter) c : null;
            } catch (Throwable th2) {
                failure2 = new Result.Failure(th2);
            }
            if (!(failure2 instanceof Result.Failure)) {
                obj = failure2;
            }
            AdQualityVerifierAdapter adQualityVerifierAdapter = (AdQualityVerifierAdapter) obj;
            if (adQualityVerifierAdapter == null) {
                failure = new ib81();
            } else {
                zk81.a(jl61Var);
                adQualityVerifierAdapterConfiguration.getVerificationTimeoutInSec();
                failure = new nr81(adQualityVerifierAdapter);
            }
            if (Result.a(failure) != null) {
                failure = new ib81();
            }
            return (eo81) failure;
        }
        failure = new ib81();
        if (Result.a(failure) != null) {
        }
        return (eo81) failure;
    }
}
