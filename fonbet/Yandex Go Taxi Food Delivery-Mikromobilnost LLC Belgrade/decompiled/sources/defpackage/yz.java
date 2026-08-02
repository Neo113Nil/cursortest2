package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.details.v2.analytics.perf.RideCardPerfAnalytics$RenderViewType;
import com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.a;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import java.io.Serializable;

/* loaded from: classes15.dex */
public final class yz implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Serializable z;

    /* JADX WARN: Multi-variable type inference failed */
    public yz(b00 b00Var, ChatRequest chatRequest, String str, String str2, long j, BotRequest.Error[] errorArr) {
        this.c = b00Var;
        this.w = chatRequest;
        this.x = str;
        this.y = str2;
        this.b = j;
        this.z = errorArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.z;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                b00.a((b00) this.c).a(new db6((ChatRequest) obj4, (String) obj3, (String) obj2, this.b, (BotRequest.Error[]) obj));
                break;
            default:
                ((View) obj4).getViewTreeObserver().registerFrameCommitCallback(new zz(this.b, (a) obj3, (wrs0) obj2, (RideCardPerfAnalytics$RenderViewType) obj));
                break;
        }
    }

    public yz(View view, View view2, long j, a aVar, wrs0 wrs0Var, RideCardPerfAnalytics$RenderViewType rideCardPerfAnalytics$RenderViewType) {
        this.c = view;
        this.w = view2;
        this.b = j;
        this.x = aVar;
        this.y = wrs0Var;
        this.z = rideCardPerfAnalytics$RenderViewType;
    }
}
