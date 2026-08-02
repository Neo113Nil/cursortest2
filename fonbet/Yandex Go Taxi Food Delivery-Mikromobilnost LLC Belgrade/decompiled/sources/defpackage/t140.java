package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.payment_method_selector.c;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class t140 implements vpr {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ Object c;

    public t140(int i, tls tlsVar) {
        this.c = tlsVar;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        boolean z;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = ((dtr0) obj).a;
                tls tlsVar = (tls) obj2;
                if (i2 == -2) {
                    tlsVar.invoke(q040.a);
                } else if (i2 == this.b) {
                    tlsVar.invoke(p040.a);
                }
                return zy11Var;
            default:
                c cVar = (c) obj2;
                int i3 = this.b;
                this.b = i3 + 1;
                if (i3 < 0) {
                    w511.w("Index overflow has happened");
                    return null;
                }
                boolean a = c.a(cVar, (e4a0) obj);
                wt90 wt90Var = cVar.c;
                if (!a) {
                    return zy11Var;
                }
                if (i3 != 0) {
                    pex0 m = ((k) cVar.b).m();
                    if ((m != null ? m.u0 : null) == TariffOrderFlow.DELIVERY_FLOW && cVar.f.b() && ((Boolean) wt90Var.b.getValue()).booleanValue()) {
                        z = true;
                        wt90Var.a(false);
                        if (z) {
                            return zy11Var;
                        }
                        ut90 ut90Var = cVar.e;
                        wkf0 wkf0Var = ut90Var.b().h;
                        String Y = d6z.Y(ut90Var.b(), wkf0Var.a);
                        String str = wkf0Var.b;
                        cVar.d.a().setTitle(Y).setMessage(str != null ? d6z.Y(ut90Var.b(), str) : null).setPositiveButton(d6z.Y(ut90Var.b(), wkf0Var.c)).show();
                        return zy11Var;
                    }
                }
                z = false;
                wt90Var.a(false);
                if (z) {
                }
                break;
        }
    }

    public t140(c cVar) {
        this.c = cVar;
    }
}
