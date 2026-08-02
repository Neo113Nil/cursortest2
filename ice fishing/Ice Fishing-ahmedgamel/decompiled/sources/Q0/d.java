package Q0;

import J0.r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.util.Log;
import com.google.android.gms.internal.ads.C2521Ce;
import com.google.android.gms.internal.ads.C2764Qj;
import com.google.android.gms.internal.ads.C2889Yb;
import com.google.android.gms.internal.ads.C3235ft;
import com.google.android.gms.internal.ads.C3451jv;
import com.google.android.gms.internal.ads.C3614mw;
import com.google.android.gms.internal.ads.C3663nr;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.KO;
import com.google.android.gms.internal.ads.RunnableC2829Ug;
import com.google.android.gms.internal.ads.RunnableC3071cq;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC4004u8;
import com.google.android.gms.internal.ads.Y6;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import w2.D;

/* loaded from: classes.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2463a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2464b;

    public /* synthetic */ d(int i, Object obj) {
        this.f2463a = i;
        this.f2464b = obj;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((RunnableC2829Ug) this.f2464b).f28748w).f36961b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f2463a) {
            case 0:
                kotlin.jvm.internal.h.e(context, "context");
                kotlin.jvm.internal.h.e(intent, "intent");
                a aVar = (a) this.f2464b;
                switch (aVar.f2460g) {
                    case 0:
                        String action = intent.getAction();
                        if (action == null) {
                            return;
                        }
                        r.d().a(b.f2461a, "Received ".concat(action));
                        switch (action.hashCode()) {
                            case -1886648615:
                                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                    aVar.c(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case -54942926:
                                if (action.equals("android.os.action.DISCHARGING")) {
                                    aVar.c(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case 948344062:
                                if (action.equals("android.os.action.CHARGING")) {
                                    aVar.c(Boolean.TRUE);
                                    return;
                                }
                                return;
                            case 1019184907:
                                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                    aVar.c(Boolean.TRUE);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    case 1:
                        if (intent.getAction() == null) {
                            return;
                        }
                        r.d().a(c.f2462a, "Received " + intent.getAction());
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            int hashCode = action2.hashCode();
                            if (hashCode == -1980154005) {
                                if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    aVar.c(Boolean.TRUE);
                                    return;
                                }
                                return;
                            } else {
                                if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                    aVar.c(Boolean.FALSE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        if (intent.getAction() == null) {
                            return;
                        }
                        r.d().a(k.f2477a, "Received " + intent.getAction());
                        String action3 = intent.getAction();
                        if (action3 != null) {
                            int hashCode2 = action3.hashCode();
                            if (hashCode2 == -1181163412) {
                                if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    aVar.c(Boolean.FALSE);
                                    return;
                                }
                                return;
                            } else {
                                if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    aVar.c(Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                }
            case 1:
                ((C7) this.f2464b).c();
                return;
            case 2:
                ((ViewOnAttachStateChangeListenerC4004u8) this.f2464b).d(3);
                return;
            case 3:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((C3235ft) this.f2464b).e(new Y6(1));
                    return;
                }
                return;
            case 4:
                ((C3663nr) this.f2464b).f33573a.execute(new RunnableC3071cq(4, this, context));
                return;
            case 5:
                boolean equals = intent.getAction().equals("android.intent.action.SCREEN_OFF");
                C3614mw c3614mw = (C3614mw) this.f2464b;
                if (equals) {
                    c3614mw.a(true, c3614mw.f33408c);
                    c3614mw.f33407b = true;
                    return;
                } else {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        c3614mw.a(false, c3614mw.f33408c);
                        c3614mw.f33407b = false;
                        return;
                    }
                    return;
                }
            case 6:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                C2521Ce c2521Ce = (C2521Ce) this.f2464b;
                c2521Ce.k(KO.a(context, intent, (C2764Qj) c2521Ce.f24907D, (AudioDeviceInfo) c2521Ce.f24906C, c2521Ce.j()));
                return;
            case 7:
                ((B1.b) this.f2464b).l();
                return;
            case 8:
                RunnableC2829Ug runnableC2829Ug = (RunnableC2829Ug) this.f2464b;
                if (runnableC2829Ug != null && runnableC2829Ug.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    RunnableC2829Ug runnableC2829Ug2 = (RunnableC2829Ug) this.f2464b;
                    ((FirebaseMessaging) runnableC2829Ug2.f28748w).getClass();
                    FirebaseMessaging.b(runnableC2829Ug2, 0L);
                    ((FirebaseMessaging) ((RunnableC2829Ug) this.f2464b).f28748w).f36961b.unregisterReceiver(this);
                    this.f2464b = null;
                    return;
                }
                return;
            case 9:
                C3451jv c3451jv = (C3451jv) this.f2464b;
                synchronized (c3451jv) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((WeakHashMap) c3451jv.f32127w).entrySet()) {
                            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                                arrayList.add((BroadcastReceiver) entry.getKey());
                            }
                        }
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                boolean equals2 = Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT");
                D d9 = (D) this.f2464b;
                if (equals2) {
                    d9.f41632e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        d9.f41632e = false;
                        return;
                    }
                    return;
                }
        }
    }

    public d(int i) {
        this.f2463a = i;
        switch (i) {
            case 8:
                break;
            default:
                this.f2464b = C3614mw.f33405d;
                break;
        }
    }

    public d(C7 c72) {
        this.f2463a = 1;
        Objects.requireNonNull(c72);
        this.f2464b = c72;
    }

    public d(ViewOnAttachStateChangeListenerC4004u8 viewOnAttachStateChangeListenerC4004u8) {
        this.f2463a = 2;
        Objects.requireNonNull(viewOnAttachStateChangeListenerC4004u8);
        this.f2464b = viewOnAttachStateChangeListenerC4004u8;
    }

    public /* synthetic */ d(C2889Yb c2889Yb, C3235ft c3235ft) {
        this.f2463a = 3;
        this.f2464b = c3235ft;
    }

    public /* synthetic */ d(C2521Ce c2521Ce) {
        this.f2463a = 6;
        Objects.requireNonNull(c2521Ce);
        this.f2464b = c2521Ce;
    }

    public /* synthetic */ d(C3663nr c3663nr) {
        this.f2463a = 4;
        Objects.requireNonNull(c3663nr);
        this.f2464b = c3663nr;
    }

    public d(C3451jv c3451jv) {
        this.f2463a = 9;
        Objects.requireNonNull(c3451jv);
        this.f2464b = c3451jv;
    }

    public /* synthetic */ d(D d9) {
        this.f2463a = 10;
        Objects.requireNonNull(d9);
        this.f2464b = d9;
    }
}
