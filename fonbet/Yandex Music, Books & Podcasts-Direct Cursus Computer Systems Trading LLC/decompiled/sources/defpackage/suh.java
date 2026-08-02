package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.session.i;
import com.connectsdk.service.capability.RemoteCameraControl;
import com.connectsdk.service.capability.ScreenMirroringControl;
import com.connectsdk.service.webos.lgcast.common.utils.LocalBroadcastEx;
import com.connectsdk.service.webos.lgcast.common.utils.ProgressUtil;
import com.connectsdk.service.webos.lgcast.common.utils.TimerUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.api.RemoteCameraApi;
import com.connectsdk.service.webos.lgcast.screenmirroring.api.ScreenMirroringApi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.yandex.passport.internal.features.a;
import com.yandex.passport.internal.flags.g;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.pulse.ApplicationParams;
import com.yandex.pulse.PulseService;
import com.yandex.pulse.histogram.ComponentHistograms;
import com.yandex.pulse.mvi.tracker.ResponsivenessTracker;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.internal.C0983b8;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;
import ru.kinopoisk.sdk.easylogin.internal.P0;
import ru.kinopoisk.sdk.easylogin.internal.T0;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.post.ui.grid.PostGridItemsActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class suh implements fvh, ua6, zqr, lu7, nd, aze, hka, TimerUtil.TimerListener, lyr, OnCompleteListener, LocalBroadcastEx.BroadcastListener, ag6, zjo, vip, iyr, ws3, sjn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ suh(CoroutineContext coroutineContext, Function1 function1) {
        this.a = 21;
        this.b = coroutineContext;
        this.c = (uif) function1;
    }

    public void a(eij eijVar) {
        switch (this.a) {
            case 17:
                CoroutineContext coroutineContext = (CoroutineContext) this.b;
                pjc pjcVar = (pjc) this.c;
                ra8.f(eijVar, new bu3(new ujo(x97.x(cmd.a, ca8.b.plus(coroutineContext), pm6.c, new kun(pjcVar, eijVar, null, 9)))));
                break;
            default:
                T0.a((T0) this.b, (InterfaceC1305z0.c) this.c, eijVar);
                break;
        }
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        x0 x0Var = (x0) this.b;
        ((bwh) obj).C(x0Var.b, (uvh) x0Var.c, (boh) this.c);
    }

    @Override // defpackage.zjo, defpackage.myc
    public Object apply(Object obj) {
        bko bkoVar = (bko) this.b;
        de2 de2Var = (de2) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        dd2 dd2Var = bkoVar.d;
        ArrayList o = bkoVar.o(sQLiteDatabase, de2Var, dd2Var.b);
        for (lsm lsmVar : lsm.values()) {
            if (lsmVar != de2Var.c) {
                int size = dd2Var.b - o.size();
                if (size <= 0) {
                    break;
                }
                o.addAll(bkoVar.o(sQLiteDatabase, de2Var.b(lsmVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < o.size(); i++) {
            sb.append(((qd2) o.get(i)).a);
            if (i < o.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", Constants.KEY_VALUE}, sb.toString(), null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                long j = cursor.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new ako(cursor.getString(1), cursor.getString(2)));
            }
            query.close();
            ListIterator listIterator = o.listIterator();
            while (listIterator.hasNext()) {
                qd2 qd2Var = (qd2) listIterator.next();
                long j2 = qd2Var.a;
                if (hashMap.containsKey(Long.valueOf(j2))) {
                    m c = qd2Var.c.c();
                    for (ako akoVar : (Set) hashMap.get(Long.valueOf(j2))) {
                        c.b(akoVar.a, akoVar.b);
                    }
                    listIterator.set(new qd2(j2, qd2Var.b, c.c()));
                }
            }
            return o;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.vip
    public uip b(xip xipVar, s2i s2iVar) {
        CoroutineContext coroutineContext = (CoroutineContext) this.b;
        ?? r2 = (uif) this.c;
        coroutineContext.getClass();
        yfx yfxVar = cm6.a;
        yfxVar.getClass();
        ulk ulkVar = we6.z().b;
        Continuation continuation = null;
        Object b = ulkVar == null ? null : ulkVar.b(yfxVar.hashCode(), 0, yfxVar);
        if (b == null) {
            b = yfxVar.c;
        }
        b.getClass();
        CoroutineContext plus = coroutineContext.plus((CoroutineContext) b);
        we6 z = we6.z();
        z.getClass();
        CoroutineContext plus2 = plus.plus(new tqd(z));
        jtc jtcVar = new jtc(new kgk(17, xipVar));
        zi3 g = men.g(1, 6, null);
        return new yip(x97.y(gld.e(plus2), null, null, new f44(r2, new eno(new ckg(new AtomicBoolean(false), xipVar, g, continuation, 28)), jtcVar, xipVar, null), 3), g, xipVar, jtcVar);
    }

    @Override // defpackage.hka
    public void c(float f, long j) {
        xzi xziVar = (xzi) this.b;
        zvs zvsVar = (zvs) this.c;
        int i = (int) f;
        if (i < 0 || i >= 100) {
            return;
        }
        xziVar.n(zvsVar, f);
    }

    @Override // defpackage.ws3
    public Object d(vs3 vs3Var) {
        Executor executor = (Executor) this.b;
        Function0 function0 = (Function0) this.c;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        mcg mcgVar = new mcg(atomicBoolean, 1);
        d48 d48Var = d48.a;
        h2o h2oVar = vs3Var.c;
        if (h2oVar != null) {
            h2oVar.a(mcgVar, d48Var);
        }
        executor.execute(new ncg(atomicBoolean, vs3Var, function0, 1));
        return Unit.a;
    }

    @Override // defpackage.iyr
    public Object execute() {
        switch (this.a) {
            case 25:
                hgp hgpVar = (hgp) this.b;
                Iterable iterable = (Iterable) this.c;
                bko bkoVar = (bko) hgpVar.d;
                bkoVar.getClass();
                if (iterable.iterator().hasNext()) {
                    bkoVar.a().compileStatement("DELETE FROM events WHERE _id in ".concat(bko.H(iterable))).execute();
                    break;
                }
                break;
            default:
                hgp hgpVar2 = (hgp) this.b;
                Iterator it = ((HashMap) this.c).entrySet().iterator();
                while (it.hasNext()) {
                    ((bko) hgpVar2.i).z(((Integer) r2.getValue()).intValue(), xqg.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // defpackage.zqr
    public Object get() {
        eai eaiVar = (eai) this.b;
        fai faiVar = (fai) this.c;
        bai baiVar = new bai(eaiVar, 6);
        faiVar.getClass();
        return new ResponsivenessTracker(baiVar);
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, s9f s9fVar) {
        a aVar = (a) this.b;
        g gVar = (g) this.c;
        obj.getClass();
        s9fVar.getClass();
        return Boolean.valueOf(aVar.b() && ((Boolean) aVar.a.b(gVar)).booleanValue());
    }

    @Override // defpackage.fvh
    public Object h(i iVar, wrh wrhVar, int i) {
        switch (this.a) {
            case 0:
                return iVar.e.Y(iVar.k, iVar.u(wrhVar), (String) this.b, (gin) this.c);
            case 1:
                return iVar.k() ? leu.S(new ump(-100)) : dvt.l0((lcg) ((fvh) this.b).h(iVar, wrhVar, i), new u13(11, iVar, wrhVar, (tuh) this.c));
            default:
                return iVar.k() ? leu.S(new ump(-100)) : dvt.l0((lcg) ((fvh) this.b).h(iVar, wrhVar, i), new u13(12, iVar, wrhVar, (evh) this.c));
        }
    }

    @Override // defpackage.aze
    public void i(int i, Object obj) {
        PostGridItemsActivity postGridItemsActivity = (PostGridItemsActivity) this.c;
        String str = (String) this.b;
        hqm hqmVar = (hqm) obj;
        int i2 = PostGridItemsActivity.H0;
        fqm fqmVar = hqmVar.a;
        nu1 nu1Var = hqmVar.b;
        int D = ouj.D(fqmVar.f());
        if (D == 0) {
            c01 c01Var = (c01) nu1Var;
            int i3 = ArtistScreenActivity.w0;
            c01Var.getClass();
            postGridItemsActivity.startActivity(l48.o(postGridItemsActivity, c01Var, null, 24));
            return;
        }
        if (D == 1 || D == 2) {
            oq oqVar = (oq) nu1Var;
            postGridItemsActivity.startActivity(quj.U(postGridItemsActivity, new uq(oqVar, postGridItemsActivity.r().b(oqVar).a(), str, null, false, rq.a), postGridItemsActivity.r()));
        } else {
            if (D != 4) {
                xq0.q("Unsupported item type: ".concat(tlm.p(hqmVar.a.f())));
                return;
            }
            PlaybackScope r = postGridItemsActivity.r();
            int i4 = PlaylistScreenActivity.B0;
            postGridItemsActivity.startActivity(dxl.f(postGridItemsActivity, (cvl) nu1Var, false, str, nxl.a, r));
        }
    }

    @Override // defpackage.lu7
    public void j(uzm uzmVar) {
        lu7 lu7Var = (lu7) this.b;
        lu7 lu7Var2 = (lu7) this.c;
        lu7Var.j(uzmVar);
        lu7Var2.j(uzmVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Activity activity;
        onx onxVar;
        WeakReference weakReference = (WeakReference) this.b;
        ein einVar = (ein) this.c;
        task.getClass();
        if (!task.l() || (activity = (Activity) weakReference.get()) == null) {
            return;
        }
        e7x e7xVar = (e7x) einVar.h.getValue();
        ldo ldoVar = (ldo) task.h();
        e7xVar.getClass();
        yzw yzwVar = (yzw) ldoVar;
        if (yzwVar.b) {
            onxVar = ywf.w(null);
        } else {
            Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", yzwVar.a);
            intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
            i8s i8sVar = new i8s();
            intent.putExtra("result_receiver", new ss6(e7xVar.b, i8sVar, 5));
            activity.startActivity(intent);
            onxVar = i8sVar.a;
        }
        onxVar.addOnCompleteListener(new h5n(2, einVar, activity));
    }

    @Override // com.connectsdk.service.webos.lgcast.common.utils.LocalBroadcastEx.BroadcastListener
    public void onReceive(Intent intent) {
        switch (this.a) {
            case 14:
                ((RemoteCameraApi) this.b).lambda$setErrorListener$5((RemoteCameraControl.RemoteCameraErrorListener) this.c, intent);
                break;
            case 19:
                ((ScreenMirroringApi) this.b).lambda$startMirroring$1((ScreenMirroringControl.ScreenMirroringStartListener) this.c, intent);
                break;
            default:
                ((ScreenMirroringApi) this.b).lambda$setErrorListener$3((ScreenMirroringControl.ScreenMirroringErrorListener) this.c, intent);
                break;
        }
    }

    @Override // com.connectsdk.service.webos.lgcast.common.utils.TimerUtil.TimerListener
    public void onTime() {
        ((ProgressUtil) this.b).lambda$show$2((ProgressUtil.DismissListener) this.c);
    }

    @Override // defpackage.ag6
    public Object p(Task task) {
        iwe iweVar = (iwe) this.c;
        String str = (String) this.b;
        synchronized (iweVar) {
            ((xy0) iweVar.c).remove(str);
        }
        return task;
    }

    @Override // defpackage.nd
    /* renamed from: run, reason: collision with other method in class */
    public void mo32run() {
        switch (this.a) {
            case 6:
                P0.a((P0) this.b, (InterfaceC1305z0.a) this.c);
                break;
            default:
                C0983b8.a((C0983b8) this.b, (InterfaceC1305z0.a) this.c);
                break;
        }
    }

    public /* synthetic */ suh(Object obj, String str, int i) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }

    @Override // defpackage.lyr
    public ComponentHistograms run() {
        ComponentHistograms m18registerApp$lambda0;
        m18registerApp$lambda0 = PulseService.m18registerApp$lambda0((PulseService) this.b, (ApplicationParams) this.c);
        return m18registerApp$lambda0;
    }

    public /* synthetic */ suh(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
