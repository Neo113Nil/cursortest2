package defpackage;

import android.app.usage.UsageStatsManager;
import android.database.sqlite.SQLiteDatabase;
import android.location.LocationManager;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.view.View;
import com.google.android.datatransport.runtime.scheduling.persistence.b;
import com.yandex.go.lifecycle.processor.e;
import com.yandex.go.navigation.api.MainScreenType;
import com.yandex.go.navigation.base.internal.StackChangeType;
import com.yandex.pulse.mvi.tracker.TimeToInteractiveTracker;
import com.yandex.pulse.mvi.utils.WeakHandler;
import flex.utils.android.WindowInsetsProvider;
import flex.utils.android.WindowInsetsProvider$containerAttachListener$1;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.impl.C0409i3;
import io.appmetrica.analytics.impl.EnumC0466k3;
import io.appmetrica.analytics.impl.O2;
import io.appmetrica.analytics.location.impl.u;
import io.appmetrica.analytics.locationinternal.impl.g2;
import io.appmetrica.analytics.push.settings.PassportUidProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes9.dex */
public final /* synthetic */ class t6f0 implements sti0, twl, bx60, z3q0, nry0, v0x0, rl3, PassportUidProvider, ActivationBarrierCallback, FunctionWithThrowable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t6f0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.twl
    public List a(String str) {
        return ((oot) ((h3y) this.b).get()).a(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        EnumC0466k3 a;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 16:
                a = C0409i3.a((O2) obj2, (UsageStatsManager) obj);
                return a;
            default:
                return u.a((u) obj2, (LocationManager) obj);
        }
    }

    public void b(List list) {
        TimeToInteractiveTracker timeToInteractiveTracker = (TimeToInteractiveTracker) this.b;
        WeakHandler weakHandler = timeToInteractiveTracker.i;
        long j = timeToInteractiveTracker.d;
        lwa0 lwa0Var = timeToInteractiveTracker.f;
        if (lwa0Var == null) {
            return;
        }
        long j2 = lwa0Var.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hoz hozVar = (hoz) it.next();
            long j3 = timeToInteractiveTracker.c;
            long j4 = hozVar.a;
            long j5 = hozVar.b;
            if (j4 < j2 + j) {
                timeToInteractiveTracker.j = Math.max(timeToInteractiveTracker.j, j4 + j5);
                long j6 = hozVar.a;
                if (j6 >= j2) {
                    timeToInteractiveTracker.k = Math.max(j5 - j3, 0L) + timeToInteractiveTracker.k;
                } else if (timeToInteractiveTracker.e && j6 + j5 > j2) {
                    timeToInteractiveTracker.k = Math.max(((j6 + j5) - j2) - j3, 0L) + timeToInteractiveTracker.k;
                }
            }
        }
        weakHandler.removeMessages(0);
        weakHandler.sendEmptyMessageDelayed(0, j);
    }

    public void c(m950 m950Var, h55 h55Var, StackChangeType stackChangeType) {
        pep0 pep0Var = (pep0) this.b;
        nfh nfhVar = pep0Var.b;
        MainScreenType f = m950Var != null ? nfhVar.f(m950Var) : null;
        MainScreenType f2 = h55Var != null ? nfhVar.f(h55Var) : null;
        for (mz60 mz60Var : (Set) nfhVar.c) {
            MainScreenType mainScreenType = mz60Var.b;
            MainScreenType mainScreenType2 = MainScreenType.SuperAppMain;
            boolean z = false;
            boolean z2 = mainScreenType == mainScreenType2 && f2 != mainScreenType2;
            MainScreenType mainScreenType3 = MainScreenType.MainScreenWithShortcuts;
            if (mainScreenType == mainScreenType3 && f2 != mainScreenType3) {
                z = true;
            }
            mz60Var.b = f2;
            if (z2 || z || (f == null && f2 == MainScreenType.NotMainScreen)) {
                ((e) mz60Var.a.get()).c();
            }
        }
        if (stackChangeType == StackChangeType.Poll && h55Var == null && (m950Var instanceof qa00)) {
            jst.e.getClass();
            pep0Var.a.finish();
        }
    }

    @Override // defpackage.nry0
    public boolean e(CharSequence charSequence) {
        bry0 bry0Var = (bry0) this.b;
        SpannableStringBuilder spannableStringBuilder = bry0Var.h;
        if (charSequence == null) {
            return true;
        }
        spannableStringBuilder.clear();
        ShimmeringRobotoTextView shimmeringRobotoTextView = bry0Var.a;
        return new StaticLayout(bry0Var.a(spannableStringBuilder, charSequence, bry0Var.b), shimmeringRobotoTextView.getPaint(), bry0Var.g, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= shimmeringRobotoTextView.getMaxLines();
    }

    @Override // defpackage.v0x0
    public Object execute() {
        SQLiteDatabase a;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 8:
                b bVar = (b) ((v2c) obj);
                bVar.getClass();
                int i2 = w2c.e;
                an8 an8Var = new an8();
                an8Var.c = null;
                an8Var.w = new ArrayList();
                an8Var.x = null;
                an8Var.b = "";
                HashMap hashMap = new HashMap();
                a = bVar.a();
                a.beginTransaction();
                try {
                    w2c w2cVar = (w2c) b.v(a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new t26(19, bVar, hashMap, an8Var));
                    a.setTransactionSuccessful();
                    return w2cVar;
                } finally {
                }
            default:
                b bVar2 = (b) ((wd21) obj).i;
                a = bVar2.a();
                a.beginTransaction();
                try {
                    a.compileStatement("DELETE FROM log_event_dropped").execute();
                    a.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + bVar2.b.getTime()).execute();
                    a.setTransactionSuccessful();
                    return null;
                } finally {
                }
        }
    }

    @Override // defpackage.sti0
    public void f() {
        vef0 vef0Var = (vef0) this.b;
        vef0Var.b.reportEvent("logout_on_relogin");
        kse.b(vef0Var.a);
        vef0Var.a();
    }

    @Override // defpackage.rl3
    public String g() {
        return ((jm3) ((qh41) this.b).k.getValue()).d;
    }

    @Override // io.appmetrica.analytics.push.settings.PassportUidProvider
    public String getUid() {
        return String.valueOf((Long) this.b);
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 onViewAttachedToWindow$lambda$0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 3:
                return (n751) ((wjm0) obj).a.invoke(n751Var);
            default:
                onViewAttachedToWindow$lambda$0 = WindowInsetsProvider$containerAttachListener$1.onViewAttachedToWindow$lambda$0((WindowInsetsProvider) obj, view, n751Var);
                return onViewAttachedToWindow$lambda$0;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        g2.a((g2) this.b);
    }

    @Override // defpackage.dtq0
    public KSerializer select(String str) {
        return str.equals("DebugSection") ? pwg.Companion.serializer() : ((fzp0) this.b).b.select(str);
    }
}
