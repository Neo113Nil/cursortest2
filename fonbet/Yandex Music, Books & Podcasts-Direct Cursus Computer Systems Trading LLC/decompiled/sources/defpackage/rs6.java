package defpackage;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.pulse.metrics.o;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceType;

/* loaded from: classes.dex */
public final class rs6 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rs6(int i, Object obj) {
        super(0);
        this.r = i;
        this.s = obj;
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SQLiteDatabase sQLiteDatabase;
        switch (this.r) {
            case 0:
                ts6 ts6Var = (ts6) this.s;
                ts6Var.f().execute(new he0(21, ts6Var));
                return Unit.a;
            case 1:
                ws6 ws6Var = (ws6) this.s;
                Executor executor = ws6Var.e;
                if (executor != null) {
                    executor.execute(new he0(22, ws6Var));
                    return Unit.a;
                }
                Intrinsics.j("executor");
                throw null;
            case 2:
                dt6 dt6Var = (dt6) this.s;
                Executor executor2 = dt6Var.f;
                if (executor2 != null) {
                    executor2.execute(new xs6(dt6Var, 1));
                    return Unit.a;
                }
                Intrinsics.j("executor");
                throw null;
            case 3:
                ((rp7) this.s).f(new yq6("Your device doesn't support credential manager", 5));
                return Unit.a;
            case 4:
                ((jzi) this.s).f(new l7d(5, "Your device doesn't support credential manager"));
                return Unit.a;
            case 5:
                return (kfu) ((py6) this.s).invoke();
            case 6:
                return (kfu) ((p07) this.s).invoke();
            case 7:
                return (kfu) ((m17) this.s).invoke();
            case 8:
                return (kfu) ((g27) this.s).invoke();
            case 9:
                return (kfu) ((l27) this.s).invoke();
            case 10:
                return (kfu) ((s27) this.s).invoke();
            case 11:
                return (kfu) ((q37) this.s).invoke();
            case 12:
                ogk ogkVar = ((jek) ((g47) this.s).k.a).g;
                if (ogkVar != null) {
                    ogkVar.a();
                }
                return Unit.a;
            case 13:
                return (kfu) ((i47) this.s).invoke();
            case 14:
                e57 e57Var = (e57) this.s;
                x97.y(ot0.F(e57Var), null, null, new q47(e57Var, null, 5), 3);
                return Unit.a;
            case 15:
                d97 d97Var = (d97) this.s;
                if (d97Var.m.size() <= 0) {
                    return c5b.a;
                }
                List list = d97Var.b(0).c;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((nj) obj).b == 2) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List list2 = ((nj) it.next()).f;
                    list2.getClass();
                    z75.t(arrayList2, list2);
                }
                return arrayList2;
            case 16:
                vc7 vc7Var = (vc7) this.s;
                Calendar calendar = Calendar.getInstance(vc7Var.b);
                calendar.setTimeInMillis(vc7Var.a);
                return calendar;
            case 17:
                gc8 gc8Var = ((sf7) this.s).b;
                try {
                    gc8Var.getContext$div_release().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/divkit/divkit/tree/main/tools/hot_reload/README.md")));
                } catch (Exception e) {
                    gc8Var.I(new Exception("Unable to open documentation link: https://github.com/divkit/divkit/tree/main/tools/hot_reload/README.md!", e));
                }
                return Unit.a;
            case 18:
                ((x7o) ((qxp) this.s).a).onSuccess(fn.a);
                return Unit.a;
            case 19:
                gl7 gl7Var = (gl7) this.s;
                OkHttpClient okHttpClient = gl7Var.a.d;
                if (okHttpClient == null) {
                    okHttpClient = (OkHttpClient) gl7Var.c.invoke();
                }
                return new pyi(okHttpClient, gl7Var.b);
            case 20:
                return (URL) this.s;
            case 21:
                try {
                    return ((n08) this.s).s;
                } catch (Exception unused) {
                    return tt0.i(DeviceType.OTHER, null);
                }
            case 22:
                ((vb8) this.s).b.getClass();
                return new fs7(24);
            case 23:
                y79 y79Var = (y79) this.s;
                LinkedHashMap linkedHashMap = y79Var.d;
                LinkedHashMap linkedHashMap2 = y79Var.c;
                gc8 gc8Var2 = y79Var.b;
                c89 c89Var = (c89) linkedHashMap.get(gc8Var2.getDivData());
                if (c89Var != null) {
                    c89Var.u.clear();
                }
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    xzb xzbVar = (xzb) entry.getKey();
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        hyf.K(gc8Var2, (String) entry2.getKey(), String.valueOf(((Number) entry2.getValue()).intValue()), xzbVar);
                    }
                }
                linkedHashMap2.clear();
                return Boolean.TRUE;
            case 24:
                oc9 oc9Var = (oc9) this.s;
                RecyclerView recyclerView = oc9Var.getRecyclerView();
                if (recyclerView == null) {
                    return null;
                }
                return new lc9(recyclerView, oc9Var);
            case 25:
                hf9.h0((hf9) this.s);
                return Unit.a;
            case 26:
                nsh nshVar = (nsh) ((dn9) this.s).b;
                eg0 eg0Var = (eg0) nshVar.b;
                synchronized (eg0Var) {
                    eg0Var.g = ((cg0) eg0Var.c).getWritableDatabase();
                    eg0Var.b++;
                    ((LinkedHashSet) eg0Var.e).add(Thread.currentThread());
                    sQLiteDatabase = (SQLiteDatabase) eg0Var.g;
                    sQLiteDatabase.getClass();
                }
                return nshVar.W(sQLiteDatabase);
            case 27:
                or0 or0Var = ((dps) this.s).d;
                if (or0Var.isShowing()) {
                    or0Var.dismiss();
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new ml0(2, (opa) this.s);
            default:
                return Float.valueOf(dqa.a((dqa) this.s).n0(cqa.b));
        }
    }
}
