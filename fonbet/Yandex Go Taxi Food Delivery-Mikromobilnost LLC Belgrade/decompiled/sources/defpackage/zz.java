package defpackage;

import android.os.SystemClock;
import android.text.Editable;
import com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalytics$RenderViewType;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.a;
import com.yandex.messaging.ChatRequest;
import com.yandex.plus.core.debug.panel.internal.utils.ext.EditTextExtKt$debouncedAfterTextChanged$1;

/* loaded from: classes15.dex */
public final class zz implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public zz(long j, a aVar, wrs0 wrs0Var, RideCardPerfAnalytics$RenderViewType rideCardPerfAnalytics$RenderViewType) {
        this.b = j;
        this.c = aVar;
        this.w = wrs0Var;
        this.x = rideCardPerfAnalytics$RenderViewType;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        int i = this.a;
        Object obj = this.x;
        Object obj2 = this.w;
        Object obj3 = this.c;
        long j2 = this.b;
        switch (i) {
            case 0:
                b00.a((b00) obj3).a(new ipq0((ChatRequest) obj2, (String) obj, j2));
                break;
            case 1:
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j = ((EditTextExtKt$debouncedAfterTextChanged$1) obj3).lastChangeTime;
                if (elapsedRealtime - j >= j2) {
                    ((tls) obj2).invoke((Editable) obj);
                    break;
                }
                break;
            default:
                ((a) obj3).S.d(SystemClock.elapsedRealtimeNanos() - j2, (wrs0) obj2, (RideCardPerfAnalytics$RenderViewType) obj);
                break;
        }
    }

    public zz(b00 b00Var, ChatRequest chatRequest, String str, long j) {
        this.c = b00Var;
        this.w = chatRequest;
        this.x = str;
        this.b = j;
    }

    public zz(EditTextExtKt$debouncedAfterTextChanged$1 editTextExtKt$debouncedAfterTextChanged$1, long j, tls tlsVar, Editable editable) {
        this.c = editTextExtKt$debouncedAfterTextChanged$1;
        this.b = j;
        this.w = tlsVar;
        this.x = editable;
    }
}
