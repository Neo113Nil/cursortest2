package defpackage;

import androidx.compose.animation.e;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import androidx.compose.ui.semantics.f;
import com.yandex.go.address.models.Address;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.ext.ErrorResponseException;
import com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException;
import com.ybsdk.feature.banners.api.PrizeHintEntity;
import java.util.ArrayList;
import kotlin.Pair;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class vld0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ vld0(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x011f, code lost:
    
        if (r6.getErrorResponse().getCode() != 429) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0142, code lost:
    
        if (r7.getLastException().getErrorResponse().getCode() != 429) goto L81;
     */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.a;
        s0j s0jVar = s0j.a;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Integer) obj).intValue() >= 0);
            case 1:
                return oyr.p("PlusTarifficatorMobileComponent with instanceId=", (String) obj, " is not initialized");
            case 2:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.h = "dtoMessageType";
                acxVar.k = true;
                return zy11Var;
            case 3:
                return zy11Var;
            case 4:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 5:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 6:
                dl2 dl2Var = (dl2) obj;
                return new Pair(dl2Var.a, Boolean.valueOf(dl2Var.c));
            case 7:
                e eVar = (e) obj;
                ldf ldfVar = gxd0.a;
                w2o a = k.e(sb2.K(300, 0, ldfVar, 2), 2).a(eVar.f(2, new vld0(4), sb2.K(300, 0, ldfVar, 2)));
                ldf ldfVar2 = gxd0.b;
                i iVar = new i(a, k.f(sb2.K(300, 0, ldfVar2, 2), 2).a(eVar.h(3, new vld0(5), sb2.K(300, 0, ldfVar2, 2))));
                iVar.d = new ujs0(false, new g990(16));
                return iVar;
            case 8:
                f.d((mnq0) obj);
                return zy11Var;
            case 9:
                return Boolean.valueOf(((Throwable) obj) instanceof FailDataException);
            case 10:
                return Boolean.FALSE;
            case 11:
                Throwable th = (Throwable) obj;
                if (th instanceof ErrorResponseException) {
                    ErrorResponseException errorResponseException = (ErrorResponseException) th;
                    if (errorResponseException.getErrorResponse().getCode() < 500) {
                        break;
                    }
                    z = true;
                    return Boolean.valueOf(!z);
                }
                if (th instanceof RetryTimeoutException.ServiceUnresponsive) {
                    RetryTimeoutException.ServiceUnresponsive serviceUnresponsive = (RetryTimeoutException.ServiceUnresponsive) th;
                    if (serviceUnresponsive.getLastException().getErrorResponse().getCode() < 500) {
                        break;
                    }
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 12:
                Throwable th2 = (Throwable) obj;
                if (!s8o.z(th2) && !s8o.A(th2) && !s8o.E(th2)) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 13:
                ((acx) obj).c = true;
                return zy11Var;
            case 14:
                gpe0 gpe0Var = (gpe0) obj;
                gpe0Var.c.setVisibility(0);
                RobotoTextView robotoTextView = gpe0Var.d;
                robotoTextView.setText(gpe0Var.a.getContext().getString(kyh0.preload_launch_loading));
                robotoTextView.setVisibility(0);
                gpe0Var.b.setVisibility(0);
                gpe0Var.e.setVisibility(8);
                return zy11Var;
            case 15:
                ((zqe0) obj).n1(s0jVar);
                return zy11Var;
            case 16:
                ((zqe0) obj).n1(s0jVar);
                return zy11Var;
            case 17:
                return ((fnx0) obj).c.b;
            case 18:
                ((rht0) obj).a.Z();
                return zy11Var;
            case 19:
                ((rht0) obj).a.Z();
                return zy11Var;
            case 20:
                ((rht0) obj).a.Z();
                return zy11Var;
            case 21:
                ((rht0) obj).a.Z();
                return zy11Var;
            case 22:
                return (String) obj;
            case 23:
                return ((Address) obj).getAddress().f;
            case 24:
                return ((Address) obj).getAddress().f;
            case 25:
                return ((Address) obj).getAddress().f;
            case 26:
                try {
                    ((oll0) obj).T0("DELETE FROM privacy").q();
                    return zy11Var;
                } finally {
                }
            case 27:
                ull0 T0 = ((oll0) obj).T0("SELECT field_name, value FROM privacy");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(new v3f0(T0.Y1(0), T0.isNull(1) ? null : Integer.valueOf((int) T0.getLong(1))));
                    }
                    return arrayList;
                } finally {
                }
            case 28:
                return ((PrizeHintEntity) obj).getText();
            default:
                return i5f0.b;
        }
    }
}
