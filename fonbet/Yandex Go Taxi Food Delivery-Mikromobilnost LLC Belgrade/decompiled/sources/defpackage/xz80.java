package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.overdraft.domain.model.DebtsState;
import com.yandex.go.overdraft.ui.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes8.dex */
public final /* synthetic */ class xz80 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ xz80(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                gVar.A = (DebtsState) obj;
                gVar.f();
                break;
            default:
                vz80 vz80Var = g.E;
                gVar.getClass();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) obj));
                intent.setFlags(SelfTester_JCP.IMITA);
                ((a60) gVar.r).b(intent);
                break;
        }
        return zy11Var;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new AdaptedFunctionReference(2, this.b, g.class, "show", "show(Lcom/yandex/go/overdraft/domain/model/DebtsState;)V", 4);
            default:
                return new AdaptedFunctionReference(2, this.b, g.class, "openBrowser", "openBrowser(Ljava/lang/String;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
