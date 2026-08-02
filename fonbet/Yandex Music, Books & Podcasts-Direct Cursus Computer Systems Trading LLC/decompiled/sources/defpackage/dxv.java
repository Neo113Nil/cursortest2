package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.yandex.passport.internal.entities.s;
import com.yandex.passport.internal.f;
import com.yandex.plus.core.network.api.utils.a;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class dxv implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dxv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 10;
        int i3 = 3;
        int i4 = 12;
        int i5 = 0;
        Continuation continuation = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((hxv) obj).a();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                ((j1w) obj).a.X();
                break;
            case 4:
                x1w x1wVar = (x1w) obj;
                break;
            case 5:
                ((z1w) obj).a();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                p8b.a((s3w) obj);
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                p8w p8wVar = (p8w) obj;
                Context context = p8wVar.getContext();
                context.getClass();
                Bundle arguments = p8wVar.getArguments();
                lik likVar = arguments != null ? (lik) arguments.getParcelable("navigation_source_info") : null;
                int i6 = TariffPaywallActivity.z;
                if (likVar == null) {
                    likVar = new lik(vik.f, null, null);
                }
                context.startActivity(dml.b(context, likVar));
                p8wVar.dismissAllowingStateLoss();
                break;
            case 13:
                k9w k9wVar = (k9w) obj;
                break;
            case 14:
                ccw ccwVar = (ccw) obj;
                int i7 = 1;
                int i8 = 7;
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                String str = (String) ((agw) obj).a.a.a.invoke();
                if (str == null) {
                    str = "";
                }
                ssg.a(3, agw.c, "construct ynison device id", null);
                break;
            case 18:
                cr crVar = (cr) obj;
                Context context2 = (Context) crVar.b;
                hgp hgpVar = (hgp) crVar.c;
                break;
            case 19:
                xhw xhwVar = (xhw) obj;
                ifw ifwVar = (ifw) xhwVar.h.h;
                if (xhwVar.k.getAndSet(false)) {
                    ifwVar.a(ber.c);
                } else {
                    ssg.a(4, xhw.w, "offerFail() in unconnected state", null);
                    ifwVar.a(aer.c);
                }
                break;
            case 20:
                break;
            case 21:
                ykw ykwVar = (ykw) obj;
                break;
            case 22:
                faw fawVar = (faw) ((tot) obj).b;
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                uqw uqwVar = (uqw) obj;
                break;
            case 26:
                break;
            case 27:
                fuw fuwVar = (fuw) obj;
                fuwVar.j = null;
                fuwVar.k.f();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((cqi) obj).c.setValue(Boolean.FALSE);
                break;
            default:
                byte[] bArr = s.c;
                Context context3 = ((f) obj).a;
                PackageManager packageManager = context3.getPackageManager();
                packageManager.getClass();
                String packageName = context3.getPackageName();
                packageName.getClass();
                s B = a.B(packageManager, packageName);
                if (!B.d()) {
                    if (B.c()) {
                    }
                }
                break;
        }
        return Unit.a;
    }
}
