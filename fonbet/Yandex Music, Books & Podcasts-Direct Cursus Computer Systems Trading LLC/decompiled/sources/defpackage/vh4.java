package defpackage;

import android.os.Looper;
import com.yandex.messenger.websdk.api.SupportInfoProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class vh4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi4 b;

    public /* synthetic */ vh4(fi4 fi4Var, int i) {
        this.a = i;
        this.b = fi4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.N;
            case 1:
                fi4 fi4Var = this.b;
                return new t3f(fi4Var.c.a, fi4Var.i, new n(12, fi4Var));
            case 2:
                fi4 fi4Var2 = this.b;
                SupportInfoProvider supportInfoProvider = fi4Var2.f;
                Looper looper = fi4Var2.g;
                t3f e = fi4Var2.e();
                jtc jtcVar = fi4Var2.B;
                if (jtcVar != null) {
                    return new jsr(supportInfoProvider, looper, e, jtcVar, fi4Var2.h, new vh4(fi4Var2, 0));
                }
                Intrinsics.j("jsExecutor");
                throw null;
            case 3:
                this.b.i("reload", null);
                return Unit.a;
            case 4:
                fi4 fi4Var3 = this.b;
                if (fi4Var3.A) {
                    fi4Var3.j(bi4.s);
                }
                return Unit.a;
            default:
                return this.b.a.g;
        }
    }
}
