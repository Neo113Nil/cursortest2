package Q0;

import J0.s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.util.Log;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.C2777Sj;
import com.google.android.gms.internal.ads.C2837Wb;
import com.google.android.gms.internal.ads.C3658nw;
import com.google.android.gms.internal.ads.C3709ot;
import com.google.android.gms.internal.ads.C3976tr;
import com.google.android.gms.internal.ads.C4088vv;
import com.google.android.gms.internal.ads.C4287ze;
import com.google.android.gms.internal.ads.RunnableC2757Rg;
import com.google.android.gms.internal.ads.RunnableC3329hp;
import com.google.android.gms.internal.ads.U6;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC3779q8;
import com.google.android.gms.internal.ads.XO;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import t2.G;

/* loaded from: classes.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2698a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2699b;

    public /* synthetic */ d(int i, Object obj) {
        this.f2698a = i;
        this.f2699b = obj;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((RunnableC2757Rg) this.f2699b).f27395w).f36356b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f2698a) {
            case 0:
                kotlin.jvm.internal.h.e(context, "context");
                kotlin.jvm.internal.h.e(intent, "intent");
                a aVar = (a) this.f2699b;
                switch (aVar.f2695g) {
                    case 0:
                        String action = intent.getAction();
                        if (action == null) {
                            return;
                        }
                        s.d().a(b.f2696a, "Received ".concat(action));
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
                        s.d().a(c.f2697a, "Received " + intent.getAction());
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
                        s.d().a(k.f2712a, "Received " + intent.getAction());
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
                ((B7) this.f2699b).c();
                return;
            case 2:
                ((ViewOnAttachStateChangeListenerC3779q8) this.f2699b).d(3);
                return;
            case 3:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((C3709ot) this.f2699b).e(new U6(1));
                    return;
                }
                return;
            case 4:
                ((C3976tr) this.f2699b).f34483a.execute(new RunnableC3329hp(5, this, context));
                return;
            case 5:
                boolean equals = intent.getAction().equals("android.intent.action.SCREEN_OFF");
                C3658nw c3658nw = (C3658nw) this.f2699b;
                if (equals) {
                    c3658nw.a(true, c3658nw.f33068c);
                    c3658nw.f33067b = true;
                    return;
                } else {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        c3658nw.a(false, c3658nw.f33068c);
                        c3658nw.f33067b = false;
                        return;
                    }
                    return;
                }
            case 6:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                C4287ze c4287ze = (C4287ze) this.f2699b;
                c4287ze.k(XO.a(context, intent, (C2777Sj) c4287ze.f35571D, (AudioDeviceInfo) c4287ze.f35570C, c4287ze.j()));
                return;
            case 7:
                RunnableC2757Rg runnableC2757Rg = (RunnableC2757Rg) this.f2699b;
                if (runnableC2757Rg != null && runnableC2757Rg.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    RunnableC2757Rg runnableC2757Rg2 = (RunnableC2757Rg) this.f2699b;
                    ((FirebaseMessaging) runnableC2757Rg2.f27395w).getClass();
                    FirebaseMessaging.b(runnableC2757Rg2, 0L);
                    ((FirebaseMessaging) ((RunnableC2757Rg) this.f2699b).f27395w).f36356b.unregisterReceiver(this);
                    this.f2699b = null;
                    return;
                }
                return;
            case 8:
                ((D2.a) this.f2699b).l();
                return;
            case 9:
                C4088vv c4088vv = (C4088vv) this.f2699b;
                synchronized (c4088vv) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((WeakHashMap) c4088vv.f34900w).entrySet()) {
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
                G g9 = (G) this.f2699b;
                if (equals2) {
                    g9.f40863e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        g9.f40863e = false;
                        return;
                    }
                    return;
                }
        }
    }

    public d(int i) {
        this.f2698a = i;
        switch (i) {
            case 7:
                break;
            default:
                this.f2699b = C3658nw.f33065d;
                break;
        }
    }

    public d(B7 b72) {
        this.f2698a = 1;
        Objects.requireNonNull(b72);
        this.f2699b = b72;
    }

    public d(ViewOnAttachStateChangeListenerC3779q8 viewOnAttachStateChangeListenerC3779q8) {
        this.f2698a = 2;
        Objects.requireNonNull(viewOnAttachStateChangeListenerC3779q8);
        this.f2699b = viewOnAttachStateChangeListenerC3779q8;
    }

    public /* synthetic */ d(C2837Wb c2837Wb, C3709ot c3709ot) {
        this.f2698a = 3;
        this.f2699b = c3709ot;
    }

    public /* synthetic */ d(C4287ze c4287ze) {
        this.f2698a = 6;
        Objects.requireNonNull(c4287ze);
        this.f2699b = c4287ze;
    }

    public /* synthetic */ d(C3976tr c3976tr) {
        this.f2698a = 4;
        Objects.requireNonNull(c3976tr);
        this.f2699b = c3976tr;
    }

    public d(C4088vv c4088vv) {
        this.f2698a = 9;
        Objects.requireNonNull(c4088vv);
        this.f2699b = c4088vv;
    }

    public /* synthetic */ d(G g9) {
        this.f2698a = 10;
        Objects.requireNonNull(g9);
        this.f2699b = g9;
    }
}
