package defpackage;

import com.yandex.go.payments.cards.data.o;
import com.yandex.go.payments.cards.ui.e;
import java.io.IOException;
import java.util.function.Consumer;
import javax.net.ssl.SSLException;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.network.api.models.GoApiOtherException;

/* loaded from: classes13.dex */
public final /* synthetic */ class snf implements l2e0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ snf(o oVar) {
        this.b = oVar;
    }

    @Override // defpackage.l2e0
    public final Object a(Throwable th, Object obj, int i) {
        int i2 = this.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                Consumer consumer = (Consumer) obj2;
                dt5 dt5Var = (dt5) obj;
                if (th instanceof GoApiHttpException) {
                    if (((GoApiHttpException) th).getCode() / 100 != 5) {
                        throw th;
                    }
                } else {
                    if (!(th instanceof GoApiOtherException)) {
                        throw th;
                    }
                    GoApiOtherException goApiOtherException = (GoApiOtherException) th;
                    if (!(goApiOtherException.getOriginal() instanceof IOException)) {
                        throw th;
                    }
                    if (goApiOtherException.getOriginal() instanceof SSLException) {
                        throw th;
                    }
                }
                consumer.accept(mb8.e);
                return dt5Var;
            default:
                o oVar = (o) obj2;
                l931 l931Var = (l931) obj;
                if (th instanceof GoApiHttpException) {
                    oVar.f.g((GoApiHttpException) th, l931Var.a);
                } else {
                    oVar.getClass();
                }
                return l931Var;
        }
    }

    public /* synthetic */ snf(e eVar, Consumer consumer) {
        this.b = consumer;
    }
}
