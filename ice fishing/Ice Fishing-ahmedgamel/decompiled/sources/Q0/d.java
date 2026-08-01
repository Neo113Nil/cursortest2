package Q0;

import J0.s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.util.Log;
import com.google.android.gms.internal.ads.C2501Ce;
import com.google.android.gms.internal.ads.C2744Qj;
import com.google.android.gms.internal.ads.C2866Yb;
import com.google.android.gms.internal.ads.C3212ft;
import com.google.android.gms.internal.ads.C3428jv;
import com.google.android.gms.internal.ads.C3537lw;
import com.google.android.gms.internal.ads.C3640nr;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.KO;
import com.google.android.gms.internal.ads.RunnableC2807Ug;
import com.google.android.gms.internal.ads.RunnableC3048cq;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC3981u8;
import com.google.android.gms.internal.ads.Y6;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import u2.D;

/* loaded from: classes.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2628a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2629b;

    public /* synthetic */ d(int i, Object obj) {
        this.f2628a = i;
        this.f2629b = obj;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((RunnableC2807Ug) this.f2629b).f27950w).f36194b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f2628a) {
            case 0:
                kotlin.jvm.internal.h.e(context, "context");
                kotlin.jvm.internal.h.e(intent, "intent");
                a aVar = (a) this.f2629b;
                switch (aVar.f2625g) {
                    case 0:
                        String action = intent.getAction();
                        if (action == null) {
                            return;
                        }
                        s.d().a(b.f2626a, "Received ".concat(action));
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
                        s.d().a(c.f2627a, "Received " + intent.getAction());
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
                        s.d().a(k.f2642a, "Received " + intent.getAction());
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
                ((C7) this.f2629b).c();
                return;
            case 2:
                ((ViewOnAttachStateChangeListenerC3981u8) this.f2629b).d(3);
                return;
            case 3:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((C3212ft) this.f2629b).e(new Y6(1));
                    return;
                }
                return;
            case 4:
                ((C3640nr) this.f2629b).f32786a.execute(new RunnableC3048cq(4, this, context));
                return;
            case 5:
                boolean equals = intent.getAction().equals("android.intent.action.SCREEN_OFF");
                C3537lw c3537lw = (C3537lw) this.f2629b;
                if (equals) {
                    c3537lw.a(true, c3537lw.f31868c);
                    c3537lw.f31867b = true;
                    return;
                } else {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        c3537lw.a(false, c3537lw.f31868c);
                        c3537lw.f31867b = false;
                        return;
                    }
                    return;
                }
            case 6:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                C2501Ce c2501Ce = (C2501Ce) this.f2629b;
                c2501Ce.k(KO.a(context, intent, (C2744Qj) c2501Ce.f24172D, (AudioDeviceInfo) c2501Ce.f24171C, c2501Ce.j()));
                return;
            case 7:
                ((E2.a) this.f2629b).l();
                return;
            case 8:
                RunnableC2807Ug runnableC2807Ug = (RunnableC2807Ug) this.f2629b;
                if (runnableC2807Ug != null && runnableC2807Ug.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    RunnableC2807Ug runnableC2807Ug2 = (RunnableC2807Ug) this.f2629b;
                    ((FirebaseMessaging) runnableC2807Ug2.f27950w).getClass();
                    FirebaseMessaging.b(runnableC2807Ug2, 0L);
                    ((FirebaseMessaging) ((RunnableC2807Ug) this.f2629b).f27950w).f36194b.unregisterReceiver(this);
                    this.f2629b = null;
                    return;
                }
                return;
            case 9:
                C3428jv c3428jv = (C3428jv) this.f2629b;
                synchronized (c3428jv) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((WeakHashMap) c3428jv.f31348w).entrySet()) {
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
                D d2 = (D) this.f2629b;
                if (equals2) {
                    d2.f41242e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        d2.f41242e = false;
                        return;
                    }
                    return;
                }
        }
    }

    public d(int i) {
        this.f2628a = i;
        switch (i) {
            case 8:
                break;
            default:
                this.f2629b = C3537lw.f31865d;
                break;
        }
    }

    public d(C7 c72) {
        this.f2628a = 1;
        Objects.requireNonNull(c72);
        this.f2629b = c72;
    }

    public d(ViewOnAttachStateChangeListenerC3981u8 viewOnAttachStateChangeListenerC3981u8) {
        this.f2628a = 2;
        Objects.requireNonNull(viewOnAttachStateChangeListenerC3981u8);
        this.f2629b = viewOnAttachStateChangeListenerC3981u8;
    }

    public /* synthetic */ d(C2866Yb c2866Yb, C3212ft c3212ft) {
        this.f2628a = 3;
        this.f2629b = c3212ft;
    }

    public /* synthetic */ d(C2501Ce c2501Ce) {
        this.f2628a = 6;
        Objects.requireNonNull(c2501Ce);
        this.f2629b = c2501Ce;
    }

    public /* synthetic */ d(C3640nr c3640nr) {
        this.f2628a = 4;
        Objects.requireNonNull(c3640nr);
        this.f2629b = c3640nr;
    }

    public d(C3428jv c3428jv) {
        this.f2628a = 9;
        Objects.requireNonNull(c3428jv);
        this.f2629b = c3428jv;
    }

    public /* synthetic */ d(D d2) {
        this.f2628a = 10;
        Objects.requireNonNull(d2);
        this.f2629b = d2;
    }
}
