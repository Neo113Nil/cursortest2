package d6;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d8.t;
import g7.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import l7.n;
import l7.r;
import p6.u;
import v.v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements h, g7.a, l7.e, g1.i, v {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1696g;

    public /* synthetic */ f(int i10) {
        this.f1696g = i10;
    }

    @Override // d6.h
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                a5.c a6 = w5.i.a();
                a6.L(rawQuery.getString(1));
                a6.f263i = g6.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a6.f261g = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a6.n());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // g7.a
    public Object b(o oVar) {
        int i10;
        Object obj;
        switch (this.f1696g) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                i10 = 403;
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                i10 = -1;
                break;
            default:
                synchronized (oVar.f2552a) {
                    u.i("Task is not yet complete", oVar.f2554c);
                    if (oVar.f2555d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(oVar.f2557f)) {
                        throw ((Throwable) IOException.class.cast(oVar.f2557f));
                    }
                    Exception exc = oVar.f2557f;
                    if (exc != null) {
                        throw new g7.f(exc);
                    }
                    obj = oVar.f2556e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i10);
    }

    @Override // g1.i
    public double c(double d10) {
        switch (this.f1696g) {
            case 8:
                double d11 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d11 >= 0.0031308049535603718d ? (Math.pow(d11, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d11 / 0.07739938080495357d, d10);
            case 9:
                double d12 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d12 >= 0.04045d ? Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d) : d12 * 0.07739938080495357d, d10);
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                float[] fArr = g1.d.f2429a;
                return g1.d.b(g1.d.f2431c, d10);
            case 11:
                float[] fArr2 = g1.d.f2429a;
                return g1.d.a(g1.d.f2431c, d10);
            case 12:
                float[] fArr3 = g1.d.f2429a;
                return g1.d.d(g1.d.f2432d, d10);
            case 13:
                float[] fArr4 = g1.d.f2429a;
                return g1.d.c(g1.d.f2432d, d10);
            default:
                return d10;
        }
    }

    @Override // l7.e
    public Object e(t tVar) {
        FirebaseMessaging lambda$getComponents$0;
        t5.e lambda$getComponents$02;
        switch (this.f1696g) {
            case 4:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(tVar);
                return lambda$getComponents$0;
            case 7:
                Set h10 = tVar.h(r.a(f8.a.class));
                f8.c cVar = f8.c.f2338i;
                if (cVar == null) {
                    synchronized (f8.c.class) {
                        try {
                            cVar = f8.c.f2338i;
                            if (cVar == null) {
                                cVar = new f8.c(0);
                                f8.c.f2338i = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new f8.b(h10, cVar);
            case 22:
                return (ScheduledExecutorService) ExecutorsRegistrar.f1451a.get();
            case 23:
                return (ScheduledExecutorService) ExecutorsRegistrar.f1453c.get();
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.f1452b.get();
            case 25:
                n nVar = ExecutorsRegistrar.f1451a;
                return m7.l.f4967g;
            default:
                lambda$getComponents$02 = TransportRegistrar.lambda$getComponents$0(tVar);
                return lambda$getComponents$02;
        }
    }

    public /* synthetic */ f(d8.m mVar) {
        this.f1696g = 5;
    }

    @Override // v.v
    public float a(float f10) {
        return f10;
    }
}
