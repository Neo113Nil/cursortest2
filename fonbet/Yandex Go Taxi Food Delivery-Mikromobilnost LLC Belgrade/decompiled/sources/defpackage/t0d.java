package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Rect;
import com.yandex.pulse.MeasurementBroadcasterImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class t0d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;

    public /* synthetic */ t0d(MeasurementBroadcasterImpl measurementBroadcasterImpl, String str, int i) {
        this.a = 3;
        this.b = measurementBroadcasterImpl;
        this.w = str;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        Object obj = this.w;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                u0d u0dVar = (u0d) obj2;
                Object a = ((w40) obj).a();
                String str = (String) u0dVar.a.get(Integer.valueOf(i2));
                if (str != null) {
                    q50 q50Var = (q50) u0dVar.e.get(str);
                    if ((q50Var != null ? q50Var.a : null) != null) {
                        u40 u40Var = q50Var.a;
                        if (u0dVar.d.remove(str)) {
                            u40Var.a(a);
                            break;
                        }
                    } else {
                        u0dVar.g.remove(str);
                        u0dVar.f.put(str, a);
                        break;
                    }
                }
                break;
            case 1:
                ((u0d) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 2:
                ((n9u) obj2).a(i2, (Rect) obj);
                break;
            default:
                MeasurementBroadcasterImpl.m339reportThreadCount$lambda3((MeasurementBroadcasterImpl) obj2, (String) obj, i2);
                break;
        }
    }

    public /* synthetic */ t0d(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = i;
        this.w = obj2;
    }
}
