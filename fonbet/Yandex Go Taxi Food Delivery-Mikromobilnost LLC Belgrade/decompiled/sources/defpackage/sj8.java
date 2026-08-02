package defpackage;

import android.widget.ImageView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoAnalyticsErrorType;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoEventName;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import java.util.WeakHashMap;
import kotlin.collections.builders.MapBuilder;
import yads.po;

/* loaded from: classes12.dex */
public final class sj8 implements fev {
    public final long a;
    public final long b;
    public final Object c;
    public final Object w;
    public final Object x;
    public final Object y;

    public sj8(long j, x281 x281Var, ik71 ik71Var, uz71 uz71Var, long j2, ng61 ng61Var) {
        this.a = j;
        this.w = x281Var;
        this.x = ik71Var;
        this.b = j2;
        this.c = uz71Var;
        this.y = ng61Var;
    }

    public long a(long j) {
        ng61 ng61Var = (ng61) this.y;
        long j2 = this.b;
        return ng61Var.m(j - j2, this.a) + ng61Var.a(j - j2);
    }

    public sj8 b(long j, x281 x281Var) {
        long c;
        ng61 e = ((x281) this.w).e();
        ng61 e2 = x281Var.e();
        Object obj = this.c;
        Object obj2 = this.x;
        if (e == null) {
            return new sj8(j, x281Var, (ik71) obj2, (uz71) obj, this.b, e);
        }
        if (!e.mo485a()) {
            return new sj8(j, x281Var, (ik71) obj2, (uz71) obj, this.b, e2);
        }
        long k = e.k(j);
        if (k == 0) {
            return new sj8(j, x281Var, (ik71) obj2, (uz71) obj, this.b, e2);
        }
        long b = e.b();
        long a = e.a(b);
        long j2 = k + b;
        long j3 = j2 - 1;
        long m = e.m(j3, j) + e.a(j3);
        long b2 = e2.b();
        long a2 = e2.a(b2);
        long j4 = this.b;
        if (m == a2) {
            c = (j2 - b2) + j4;
        } else {
            if (m < a2) {
                throw new po();
            }
            c = a2 < a ? j4 - (e2.c(a, j) - b) : (e.c(a2, j) - b2) + j4;
        }
        return new sj8(j, x281Var, (ik71) obj2, (uz71) obj, c, e2);
    }

    @Override // defpackage.fev
    public void onCancel(hev hevVar) {
    }

    @Override // defpackage.fev
    public void onError(hev hevVar, n9o n9oVar) {
        b5n b5nVar;
        String str;
        WeakHashMap weakHashMap = tj8.a;
        rj8 rj8Var = (rj8) this.c;
        int i = rj8Var.b;
        qj8 qj8Var = (qj8) this.x;
        ImageView imageView = qj8Var.c;
        tj8.a(imageView, i);
        tj8.a.remove(imageView);
        tj8.b.remove(imageView);
        Throwable th = n9oVar.c;
        boolean z = i != 0;
        z22 z22Var = qj8Var.a;
        if (z22Var == null || (b5nVar = qj8Var.b) == null || (str = rj8Var.a) == null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "icon_load_failed";
        }
        DynamicBinInfoAnalyticsErrorType dynamicBinInfoAnalyticsErrorType = DynamicBinInfoAnalyticsErrorType.NETWORK_ERROR;
        String a = DynamicBinInfoEventName.ICON_LOAD_FAILED.a();
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(AppSettingsContract$Setting.COLUMN_PREFIX, b5nVar.a);
        mapBuilder.put("icon_url", str);
        mapBuilder.put("error_type", dynamicBinInfoAnalyticsErrorType.getValue());
        mapBuilder.put("error_message", message);
        mapBuilder.put("will_fallback", String.valueOf(z));
        mapBuilder.put("load_duration_ms", String.valueOf(System.currentTimeMillis() - this.a));
        yz91.c(z22Var, new li3(5, a, mapBuilder.j()), qj8Var.d);
    }

    @Override // defpackage.fev
    public void onStart(hev hevVar) {
    }

    @Override // defpackage.fev
    public void onSuccess(hev hevVar, u3v0 u3v0Var) {
        qj8 qj8Var = (qj8) this.y;
        ImageView imageView = qj8Var.c;
        imageView.setVisibility(0);
        tj8.a.remove(imageView);
        WeakHashMap weakHashMap = tj8.b;
        rj8 rj8Var = (rj8) this.w;
        weakHashMap.put(imageView, rj8Var);
        tj8.b(qj8Var, rj8Var, this.b, false);
    }

    public sj8(rj8 rj8Var, qj8 qj8Var, long j, qj8 qj8Var2, rj8 rj8Var2, long j2) {
        this.c = rj8Var;
        this.x = qj8Var;
        this.a = j;
        this.y = qj8Var2;
        this.w = rj8Var2;
        this.b = j2;
    }
}
