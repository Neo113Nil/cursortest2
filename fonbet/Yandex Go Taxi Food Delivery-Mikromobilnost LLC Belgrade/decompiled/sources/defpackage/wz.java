package defpackage;

import android.app.Service;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.internal.g;
import com.yandex.div.core.view2.Div2View;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import com.ybsdk.feature.savings.internal.views.diffrate.DiffRateCalendarView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes11.dex */
public final class wz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ wz(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.w = obj2;
        this.x = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.x;
        Object obj2 = this.w;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((i00) ((b00) obj3).j.getValue()).a(new s2j0((ChatRequest) obj2, (LocalMessageRef) obj, i2));
                break;
            case 1:
                View view = (View) obj3;
                if (view.isAttachedToWindow()) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    if (i2 != -1) {
                        recyclerView.scrollToPosition(i2);
                    }
                    recyclerView.post(new lz(12, recyclerView, (tls) obj2, (DiffRateCalendarView) obj));
                    break;
                }
                break;
            case 2:
                tsu tsuVar = (tsu) obj3;
                Div2View div2View = tsuVar.a;
                div2View.clearSubscriptions();
                omk omkVar = (omk) obj2;
                div2View.setData(omkVar, new zmk(UUID.randomUUID().toString()));
                l6o b = div2View.getViewComponent().a().b(omkVar, div2View.getDataTag());
                if (b != null) {
                    b.d();
                }
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    tsuVar.a((Throwable) it.next());
                }
                tsuVar.g = i2;
                tsuVar.b(usu.a);
                int i3 = wfx.a;
                break;
            default:
                y1a1 y1a1Var = (y1a1) obj2;
                Intent intent = (Intent) obj;
                Service service = ((t6b1) obj3).a;
                a6b1 a6b1Var = (a6b1) service;
                if (a6b1Var.zza(i2)) {
                    y1a1Var.H.b(Integer.valueOf(i2), "Local AppMeasurementService processed last upload request. StartId");
                    y1a1 y1a1Var2 = g.m(service, null, null).y;
                    g.g(y1a1Var2);
                    y1a1Var2.H.a("Completed wakeful intent.");
                    a6b1Var.zzc(intent);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ wz(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = i;
    }
}
