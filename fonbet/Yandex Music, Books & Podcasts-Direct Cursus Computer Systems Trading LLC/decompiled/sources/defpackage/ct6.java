package defpackage;

import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ct6 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ dt6 s;
    public final /* synthetic */ Throwable t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ct6(dt6 dt6Var, Throwable th, int i) {
        super(0);
        this.r = i;
        this.s = dt6Var;
        this.t = th;
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
                final Throwable th = this.t;
                executor.execute(new Runnable() { // from class: bt6
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                ls6 ls6Var = dt6Var.e;
                                if (ls6Var != null) {
                                    ls6Var.f(new as6(new o2(26), th.getMessage()));
                                    return;
                                } else {
                                    Intrinsics.j("callback");
                                    throw null;
                                }
                            default:
                                ls6 ls6Var2 = dt6Var.e;
                                if (ls6Var2 != null) {
                                    ls6Var2.f(new yq6(th.getMessage(), 4));
                                    return;
                                } else {
                                    Intrinsics.j("callback");
                                    throw null;
                                }
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
                final Throwable th2 = this.t;
                executor2.execute(new Runnable() { // from class: bt6
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                ls6 ls6Var = dt6Var2.e;
                                if (ls6Var != null) {
                                    ls6Var.f(new as6(new o2(26), th2.getMessage()));
                                    return;
                                } else {
                                    Intrinsics.j("callback");
                                    throw null;
                                }
                            default:
                                ls6 ls6Var2 = dt6Var2.e;
                                if (ls6Var2 != null) {
                                    ls6Var2.f(new yq6(th2.getMessage(), 4));
                                    return;
                                } else {
                                    Intrinsics.j("callback");
                                    throw null;
                                }
                        }
                    }
                });
                return Unit.a;
        }
    }
}
