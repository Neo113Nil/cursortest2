package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes8.dex */
public final /* synthetic */ class w65 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ w65(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(obj);
                break;
            default:
                tlsVar.invoke((ThemeType) obj);
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
                return new FunctionReferenceImpl(2, this.b, cvw.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            default:
                return new FunctionReferenceImpl(2, this.b, cvw.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Lru/yandex/taxi/theme/ThemeType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
