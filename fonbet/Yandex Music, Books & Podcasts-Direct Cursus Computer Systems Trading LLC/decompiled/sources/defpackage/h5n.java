package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.connectsdk.service.capability.RemoteCameraControl;
import com.connectsdk.service.capability.ScreenMirroringControl;
import com.connectsdk.service.webos.lgcast.common.utils.HandlerThreadEx;
import com.connectsdk.service.webos.lgcast.common.utils.LocalBroadcastEx;
import com.connectsdk.service.webos.lgcast.remotecamera.api.RemoteCameraApi;
import com.connectsdk.service.webos.lgcast.screenmirroring.api.ScreenMirroringApi;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcAppEventDispatcher;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import com.yandex.pulse.mvi.tracker.TimeToInteractiveTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.S0;
import ru.kinopoisk.sdk.easylogin.internal.T0;
import ru.kinopoisk.sdk.easylogin.internal.U0;
import ru.kinopoisk.sdk.easylogin.internal.V0;
import ru.kinopoisk.sdk.easylogin.internal.X0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class h5n implements jpj, jd, OnCompleteListener, LocalBroadcastEx.BroadcastListener, dyn, ua6, qyc, va6, nd, yfr, ros, HandlerThreadEx.HandlerCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h5n(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        ConstraintLayout constraintLayout;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 7:
                ((c1t) obj).u(kqvVar);
                break;
            case 15:
                yyr yyrVar = (yyr) obj;
                ArrayList arrayList = yyrVar.b;
                hqv hqvVar = kqvVar.a;
                zne b = zne.b(hqvVar.g(519), hqvVar.g(64));
                zne b2 = zne.b(hqvVar.h(519), hqvVar.h(64));
                if (!b.equals(yyrVar.c) || !b2.equals(yyrVar.d)) {
                    yyrVar.c = b;
                    yyrVar.d = b2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        lym lymVar = (lym) arrayList.get(size);
                        lymVar.c = b;
                        lymVar.d = b2;
                        lymVar.c();
                    }
                    break;
                }
                break;
            default:
                TransportCardsActivity transportCardsActivity = (TransportCardsActivity) obj;
                int i2 = TransportCardsActivity.i;
                view.getClass();
                hqv hqvVar2 = kqvVar.a;
                zne g = hqvVar2.g(8);
                g.getClass();
                zne g2 = hqvVar2.g(1);
                g2.getClass();
                zne g3 = hqvVar2.g(2);
                g3.getClass();
                int i3 = g.d;
                int i4 = g3.d;
                int i5 = i3 > i4 ? i3 - i4 : 0;
                qzc qzcVar = transportCardsActivity.f;
                if (qzcVar != null && (constraintLayout = (ConstraintLayout) qzcVar.b) != null) {
                    constraintLayout.setPadding(constraintLayout.getPaddingLeft(), g2.b, constraintLayout.getPaddingRight(), i4);
                }
                View findViewById = transportCardsActivity.findViewById(R.id.frameLayoutRoot);
                findViewById.getClass();
                findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), i5);
                break;
        }
        return kqvVar;
    }

    @Override // defpackage.dyn
    public void a(long j, d7k d7kVar) {
        saf.F(j, d7kVar, (azs[]) ((sfm) this.b).b);
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        switch (this.a) {
            case 13:
                npr nprVar = (npr) this.b;
                uv6 uv6Var = (uv6) obj;
                mpr mprVar = new mpr(uv6Var.b, ofc.s(uv6Var.c, uv6Var.a));
                nprVar.c.add(mprVar);
                long j = nprVar.j;
                if (j == -9223372036854775807L || uv6Var.b >= j) {
                    nprVar.c(mprVar);
                    break;
                }
                break;
            case 14:
                ((tde) this.b).a((uv6) obj);
                break;
            case 15:
            case 16:
            case 18:
            case 19:
            case 21:
            default:
                T0.c((V0) this.b, obj);
                break;
            case 17:
                T0.a((S0) this.b, obj);
                break;
            case 20:
                T0.h((T0.f) this.b, obj);
                break;
            case 22:
                T0.e((T0.g) this.b, obj);
                break;
            case 23:
                T0.b((U0) this.b, obj);
                break;
        }
    }

    @Override // defpackage.qyc
    public Object apply(Object obj) {
        switch (this.a) {
            case 16:
                return T0.d((X0) this.b, obj);
            default:
                return T0.g((T0.e) this.b, obj);
        }
    }

    public void b() {
        switch (this.a) {
            case 11:
                Function2 function2 = (Function2) this.b;
                synchronized (g2r.b) {
                    g2r.g = CollectionsKt.d0((Iterable) g2r.g, function2);
                }
                return;
            default:
                sea seaVar = (sea) this.b;
                synchronized (g2r.b) {
                    g2r.h = CollectionsKt.d0((Iterable) g2r.h, seaVar);
                }
                g2r.a();
                return;
        }
    }

    public void c(List list) {
        long j;
        TimeToInteractiveTracker timeToInteractiveTracker = (TimeToInteractiveTracker) this.b;
        l30 l30Var = timeToInteractiveTracker.i;
        long j2 = timeToInteractiveTracker.d;
        nkk nkkVar = timeToInteractiveTracker.f;
        if (nkkVar == null) {
            return;
        }
        long j3 = nkkVar.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            owg owgVar = (owg) it.next();
            long j4 = timeToInteractiveTracker.c;
            long j5 = owgVar.a;
            long j6 = owgVar.b;
            if (j5 >= j3 + j2) {
                j = j3;
            } else {
                j = j3;
                timeToInteractiveTracker.j = Math.max(timeToInteractiveTracker.j, j5 + j6);
                long j7 = owgVar.a;
                if (j7 >= j) {
                    timeToInteractiveTracker.k = Math.max(j6 - j4, 0L) + timeToInteractiveTracker.k;
                } else if (timeToInteractiveTracker.e && j7 + j6 > j) {
                    timeToInteractiveTracker.k = Math.max(((j7 + j6) - j) - j4, 0L) + timeToInteractiveTracker.k;
                }
            }
            j3 = j;
        }
        l30Var.removeMessages(0);
        l30Var.sendEmptyMessageDelayed(0, j2);
    }

    @Override // defpackage.jd
    public void call() {
        ((Function0) this.b).invoke();
    }

    @Override // com.connectsdk.service.webos.lgcast.common.utils.HandlerThreadEx.HandlerCallback
    public void handleMessage(Message message) {
        ((UibcAppEventDispatcher) this.b).lambda$create$0(message);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ein einVar = (ein) this.b;
        task.getClass();
        int i = einVar.a().a.getInt("dialog_display_times", 0) + 1;
        SharedPreferences.Editor edit = einVar.a().edit();
        edit.putInt("dialog_display_times", i);
        edit.apply();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit2 = einVar.a().edit();
        edit2.putLong("last_dialog_show", currentTimeMillis);
        edit2.apply();
    }

    @Override // defpackage.ros
    public boolean onMenuItemClick(MenuItem menuItem) {
        n7b n7bVar = (n7b) this.b;
        if (menuItem.getItemId() != R.id.logout) {
            return false;
        }
        ytm ytmVar = (ytm) n7bVar.a;
        cum cumVar = ytmVar.k;
        if (cumVar != null) {
            cumVar.b().a(dum.f);
        }
        x97.y(wyf.F(ytmVar.getLifecycle()), null, null, new xtm(ytmVar, null, 1), 3);
        return true;
    }

    @Override // com.connectsdk.service.webos.lgcast.common.utils.LocalBroadcastEx.BroadcastListener
    public void onReceive(Intent intent) {
        switch (this.a) {
            case 4:
                RemoteCameraApi.lambda$setPropertyChangeListener$4((RemoteCameraControl.RemoteCameraPropertyChangeListener) this.b, intent);
                break;
            case 5:
                RemoteCameraApi.lambda$setCameraPlayingListener$3((RemoteCameraControl.RemoteCameraPlayingListener) this.b, intent);
                break;
            default:
                ScreenMirroringApi.lambda$startMirroring$0((ScreenMirroringControl.ScreenMirroringStartListener) this.b, intent);
                break;
        }
    }

    @Override // defpackage.nd
    /* renamed from: run */
    public void mo32run() {
        T0.f((T0) this.b);
    }

    public /* synthetic */ h5n(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
    }
}
