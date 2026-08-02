package defpackage;

import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class at6 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ dt6 s;
    public final /* synthetic */ JSONException t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ at6(dt6 dt6Var, JSONException jSONException, int i) {
        super(0);
        this.r = i;
        this.s = dt6Var;
        this.t = jSONException;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                final dt6 dt6Var = this.s;
                Executor executor = dt6Var.f;
                if (executor == null) {
                    Intrinsics.j("executor");
                    throw null;
                }
                final int i = 0;
                final JSONException jSONException = this.t;
                executor.execute(new Runnable() { // from class: zs6
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                ls6 ls6Var = dt6Var.e;
                                if (ls6Var != null) {
                                    ls6Var.f(new as6(new o2(4), jSONException.getMessage()));
                                    return;
                                } else {
                                    Intrinsics.j("callback");
                                    throw null;
                                }
                            default:
                                ls6 ls6Var2 = dt6Var.e;
                                if (ls6Var2 == null) {
                                    Intrinsics.j("callback");
                                    throw null;
                                }
                                String message = jSONException.getMessage();
                                ls6Var2.f((message == null || message.length() <= 0) ? new as6(new o2(4), "Unknown error") : new as6(new o2(4), message));
                                return;
                        }
                    }
                });
                return Unit.a;
            default:
                final dt6 dt6Var2 = this.s;
                Executor executor2 = dt6Var2.f;
                if (executor2 == null) {
                    Intrinsics.j("executor");
                    throw null;
                }
                final int i2 = 1;
                final JSONException jSONException2 = this.t;
                executor2.execute(new Runnable() { // from class: zs6
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                ls6 ls6Var = dt6Var2.e;
                                if (ls6Var != null) {
                                    ls6Var.f(new as6(new o2(4), jSONException2.getMessage()));
                                    return;
                                } else {
                                    Intrinsics.j("callback");
                                    throw null;
                                }
                            default:
                                ls6 ls6Var2 = dt6Var2.e;
                                if (ls6Var2 == null) {
                                    Intrinsics.j("callback");
                                    throw null;
                                }
                                String message = jSONException2.getMessage();
                                ls6Var2.f((message == null || message.length() <= 0) ? new as6(new o2(4), "Unknown error") : new as6(new o2(4), message));
                                return;
                        }
                    }
                });
                return Unit.a;
        }
    }
}
