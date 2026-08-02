package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class sf7 {
    public final efb a;
    public final gc8 b;
    public final boolean c;
    public final boolean d;
    public final f4e e;
    public qf7 f;
    public qf7 k;
    public pdr m;
    public final LinkedHashSet g = new LinkedHashSet();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final jtc j = new jtc(9);
    public final y5 l = new y5(9, this);

    public sf7(efb efbVar, gc8 gc8Var, boolean z, boolean z2, f4e f4eVar) {
        this.a = efbVar;
        this.b = gc8Var;
        this.c = z;
        this.d = z2;
        this.e = f4eVar;
        c5b c5bVar = c5b.a;
        this.m = new pdr(false, false, null, c5bVar, c5bVar);
    }

    public final String a(boolean z) {
        u1f cymVar;
        JSONObject jSONObject = new JSONObject();
        if (!this.h.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(Constants.KEY_MESSAGE, ltg.p(th));
                jSONObject2.put("stacktrace", fob.b(th));
                if (th instanceof z7k) {
                    z7k z7kVar = (z7k) th;
                    jSONObject2.put("reason", z7kVar.a);
                    q6k q6kVar = z7kVar.b;
                    jSONObject2.put("json_source", q6kVar != null ? q6kVar.o() : null);
                    jSONObject2.put("json_summary", z7kVar.c);
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("errors", jSONArray);
        }
        if (!this.i.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.i.iterator();
            while (it2.hasNext()) {
                Throwable th2 = (Throwable) it2.next();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("warning_message", th2.getMessage());
                jSONObject3.put("stacktrace", fob.b(th2));
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("warnings", jSONArray2);
        }
        if (z) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("templates", new JSONObject());
            rv8 divData = this.b.getDivData();
            jSONObject4.put("card", divData != null ? divData.r() : null);
            JSONArray jSONArray3 = new JSONArray();
            Iterator it3 = CollectionsKt.g0(this.b.getDiv2Component$div_release().h().a.values(), c5b.a).iterator();
            while (it3.hasNext()) {
                kxt kxtVar = (kxt) it3.next();
                kxtVar.getClass();
                gy2 gy2Var = y7k.a;
                if (kxtVar instanceof zwt) {
                    zwt zwtVar = (zwt) kxtVar;
                    cymVar = new kz0(new ozb(zwtVar.c), zwtVar.b);
                } else if (kxtVar instanceof axt) {
                    axt axtVar = (axt) kxtVar;
                    cymVar = new yb3(new ozb(Boolean.valueOf(axtVar.c)), axtVar.b);
                } else if (kxtVar instanceof bxt) {
                    bxt bxtVar = (bxt) kxtVar;
                    cymVar = new ga5(new ozb(Integer.valueOf(bxtVar.c)), bxtVar.b);
                } else if (kxtVar instanceof cxt) {
                    cxt cxtVar = (cxt) kxtVar;
                    cymVar = new m28(new ozb(cxtVar.c), cxtVar.b);
                } else if (kxtVar instanceof dxt) {
                    dxt dxtVar = (dxt) kxtVar;
                    cymVar = new jhj(new ozb(Double.valueOf(dxtVar.c)), dxtVar.b);
                } else if (kxtVar instanceof ext) {
                    ext extVar = (ext) kxtVar;
                    cymVar = new jre(new ozb(Long.valueOf(extVar.c)), extVar.b);
                } else if (kxtVar instanceof hxt) {
                    hxt hxtVar = (hxt) kxtVar;
                    String str = hxtVar.b;
                    String str2 = hxtVar.c;
                    cymVar = new wir(str2 != null ? new qzb(gy2Var, str2) : new ozb(str2), str);
                } else if (kxtVar instanceof ixt) {
                    ixt ixtVar = (ixt) kxtVar;
                    cymVar = new qqt(new ozb(ixtVar.c), ixtVar.b);
                } else {
                    if (!(kxtVar instanceof gxt)) {
                        b6e.s();
                        return null;
                    }
                    jac jacVar = ((gxt) kxtVar).d;
                    Object b = ((szb) jacVar.c).b();
                    b.getClass();
                    cymVar = new cym(new qzb(gy2Var, (String) b), (String) jacVar.a, (String) jacVar.e, (List) jacVar.d, (nx8) jacVar.b);
                }
                jSONArray3.put(cymVar.r());
            }
            jSONObject4.put("variables", jSONArray3);
            jSONObject.put("card", jSONObject4);
        }
        return jSONObject.toString(4);
    }

    public final Object b(String str) {
        vb8 context$div_release = this.b.getContext$div_release();
        Object systemService = context$div_release.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            r7o r7oVar = z7o.b;
            return Unit.a;
        }
        try {
            clipboardManager.setPrimaryClip(new ClipData("Error report", new String[]{"text/plain"}, new ClipData.Item(str)));
            Toast.makeText(context$div_release, "Errors, DivData and Variables are dumped to clipboard!", 1).show();
            r7o r7oVar2 = z7o.b;
            return Unit.a;
        } catch (Exception e) {
            r7o r7oVar3 = z7o.b;
            return new t7o(new RuntimeException("Failed paste report to clipboard!", e));
        }
    }

    public final void c(pdr pdrVar) {
        boolean z = pdrVar.b;
        this.m = pdrVar;
        pf7 d = d(pdrVar);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(d);
        }
        f4e f4eVar = this.e;
        int i = 0;
        if (f4eVar.h != z) {
            if (z) {
                rf7 rf7Var = new rf7(this, i);
                f4eVar.f.a(rf7Var);
                this.f = new qf7(2, f4eVar, rf7Var);
            } else {
                qf7 qf7Var = this.f;
                if (qf7Var != null) {
                    qf7Var.close();
                }
                this.f = null;
            }
        }
        f4eVar.h = z;
        AtomicBoolean atomicBoolean = f4eVar.i;
        if (z) {
            if (atomicBoolean.compareAndSet(false, true)) {
                int i2 = i9f.a;
                ScheduledFuture scheduledFuture = f4eVar.k;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                f4eVar.k = null;
                f4eVar.b.execute(f4eVar.l);
                return;
            }
            return;
        }
        if (atomicBoolean.compareAndSet(true, false)) {
            int i3 = i9f.a;
            ScheduledFuture scheduledFuture2 = f4eVar.k;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
            }
            f4eVar.k = null;
            f4eVar.a.post(new d4e(f4eVar, i));
        }
    }

    public final pf7 d(pdr pdrVar) {
        of7 of7Var;
        of7 of7Var2;
        g4e g4eVar = g4e.c;
        g4e g4eVar2 = g4e.b;
        g4e g4eVar3 = g4e.a;
        boolean z = pdrVar.a;
        i4e i4eVar = pdrVar.c;
        List list = pdrVar.d;
        int i = 1;
        String str = "";
        if (z) {
            StringBuilder sb = new StringBuilder();
            List list2 = pdrVar.e;
            if (!list.isEmpty()) {
                sb.append("Last 25 errors:\n".concat(CollectionsKt.X(CollectionsKt.q0(list, 25), StringUtil.LF, null, null, e27.A, 30)));
            }
            if (!list2.isEmpty()) {
                sb.append("Last 25 warnings:\n".concat(CollectionsKt.X(CollectionsKt.q0(list2, 25), StringUtil.LF, null, null, e27.B, 30)));
            }
            String sb2 = sb.toString();
            if (Intrinsics.d(i4eVar, g4eVar3)) {
                str = "Applied!";
            } else if (i4eVar instanceof h4e) {
                str = su4.p(((h4e) i4eVar).a, new StringBuilder("Failure: "));
            } else if (Intrinsics.d(i4eVar, g4eVar2)) {
                str = "Reloading...";
            } else if (Intrinsics.d(i4eVar, g4eVar)) {
                str = "Update Skipped.";
            } else if (i4eVar != null) {
                b6e.s();
                return null;
            }
            String str2 = str;
            boolean z2 = pdrVar.b;
            return new mf7(sb2, new jp0(str2, z2, new sv4(11, pdrVar, this), z2 ? "View Documentation" : null, new rs6(17, this), this.e.c, new rf7(this, i)));
        }
        if (i4eVar != null) {
            if (i4eVar.equals(g4eVar3)) {
                of7Var2 = new of7("✓", "Hot reload!", R.drawable.neutral_counter_background);
            } else if (i4eVar instanceof h4e) {
                of7Var2 = new of7("!", "Hot reload failed!", R.drawable.error_counter_background);
            } else if (i4eVar.equals(g4eVar2)) {
                of7Var2 = new of7("•", "", R.drawable.neutral_counter_background);
            } else {
                if (!i4eVar.equals(g4eVar)) {
                    b6e.s();
                    return null;
                }
                of7Var2 = null;
            }
            if (of7Var2 != null) {
                return of7Var2;
            }
        }
        if (!this.d && !pdrVar.b) {
            i = 0;
        }
        if (i != 0 || this.c) {
            if (this.m.d.isEmpty() || this.m.e.isEmpty()) {
                boolean isEmpty = this.m.d.isEmpty();
                pdr pdrVar2 = this.m;
                of7Var = !isEmpty ? new of7(String.valueOf(pdrVar2.d.size()), null, R.drawable.error_counter_background) : !pdrVar2.e.isEmpty() ? new of7(String.valueOf(this.m.e.size()), null, R.drawable.warning_counter_background) : null;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.m.d.size());
                sb3.append('/');
                sb3.append(this.m.e.size());
                of7Var = new of7(sb3.toString(), null, R.drawable.warning_error_counter_background);
            }
            if (of7Var != null) {
                return of7Var;
            }
        }
        return i != 0 ? new of7("", null, R.drawable.neutral_counter_background) : nf7.a;
    }
}
