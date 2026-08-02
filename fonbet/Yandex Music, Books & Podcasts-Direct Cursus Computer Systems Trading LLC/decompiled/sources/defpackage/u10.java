package defpackage;

import android.app.job.JobInfo;
import android.content.Context;
import android.database.DatabaseUtils;
import com.yandex.passport.api.g;
import com.yandex.passport.internal.impl.x;
import com.yandex.passport.internal.n;
import com.yandex.passport.internal.provider.communication.d;
import com.yandex.passport.internal.report.te;
import com.yandex.passport.internal.report.ye;
import com.yandex.passport.internal.v;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class u10 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ u10(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new b20((a20) l13Var.a.D(hag.I(a20.class), l13Var, l13Var.b));
            case 1:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("SELECT original_id, timestamp FROM album WHERE liked = 1 ORDER BY timestamp DESC");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(new j10(D0.x0(0), D0.x0(1)));
                    }
                    return arrayList;
                } finally {
                    D0.close();
                }
            case 2:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.w(jfpVar);
                wfp.x(jfpVar, -3.0f);
                return Unit.a;
            case 3:
                j60 j60Var = (j60) obj;
                j60Var.getClass();
                return j60Var.a;
            case 4:
                String str = (String) obj;
                str.getClass();
                String sqlEscapeString = DatabaseUtils.sqlEscapeString(str);
                sqlEscapeString.getClass();
                return sqlEscapeString;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                String sqlEscapeString2 = DatabaseUtils.sqlEscapeString(str2);
                sqlEscapeString2.getClass();
                return sqlEscapeString2;
            case 6:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, g.class).E(new u10(7));
                o18Var.b(hag.I(uz1.class)).E(new u10(8));
                return Unit.a;
            case 7:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                Context context = (Context) l13Var2.a.D(hag.I(Context.class), l13Var2, l13Var2.b);
                IReporterYandex b = ye.b(context);
                Thread.setDefaultUncaughtExceptionHandler(new n(new te(context, b)));
                v.c(context, b);
                if (d.d == null) {
                    d.d = d.a();
                }
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                return new x(applicationContext, b);
            case 8:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I = hag.I(g.class);
                qdc qdcVar = l13Var3.a;
                Set set = l13Var3.b;
                return new uz1((g) qdcVar.D(I, l13Var3, set), l13Var3.b(hag.I(av0.class), true), (fos) qdcVar.D(hag.I(fos.class), l13Var3, set), (c9k) qdcVar.D(hag.I(c9k.class), l13Var3, set));
            case 9:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, q70.class).E(new u10(10));
                o18Var2.b(hag.I(y60.class)).D(new u10(11));
                o18Var2.b(hag.I(v3i.class)).E(new u10(12));
                o18Var2.b(hag.I(d4i.class)).E(new u10(13));
                o18Var2.b(hag.I(i9w.class)).E(new u10(14));
                o18Var2.b(hag.I(t70.class)).D(new u10(15));
                return Unit.a;
            case 10:
                ((l13) obj).getClass();
                return new q70();
            case 11:
                y60 y60Var = ((q70) vz1.l((l13) obj, q70.class)).a;
                if (y60Var != null) {
                    return y60Var;
                }
                Intrinsics.j("analytics");
                throw null;
            case 12:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I2 = hag.I(Context.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                return new v3i((Context) qdcVar2.C(I2));
            case 13:
                ((l13) obj).getClass();
                l18 l18Var2 = l18.b;
                bdt I3 = hag.I(Context.class);
                qdc qdcVar3 = l18Var2.a;
                qdcVar3.getClass();
                return new d4i((Context) qdcVar3.C(I3));
            case 14:
                ((l13) obj).getClass();
                return new i9w();
            case 15:
                ((l13) obj).getClass();
                return new t70(1);
            case 16:
                JobInfo.Builder builder = (JobInfo.Builder) obj;
                builder.getClass();
                builder.setRequiredNetworkType(1);
                builder.setPeriodic(d2j.f.toMillis(), d2j.g.toMillis());
                return Unit.a;
            case 17:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 18:
                return Boolean.TRUE;
            case 19:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 20:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 21:
                return Boolean.TRUE;
            case 22:
                obj.getClass();
                return new xa0(obj);
            case 23:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 24:
                o18 o18Var3 = (o18) obj;
                vz1.e(o18Var3, pc0.class).D(new u10(25));
                o18Var3.b(hag.I(bc0.class)).D(new u10(26));
                o18Var3.b(hag.I(tb0.class)).D(new u10(27));
                o18Var3.b(hag.I(vwk.class)).D(new u10(28));
                return Unit.a;
            case 25:
                ((l13) obj).getClass();
                return new pc0();
            case 26:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new bc0(l13Var4);
            case 27:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new tb0((bc0) l13Var5.a.D(hag.I(bc0.class), l13Var5, l13Var5.b));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return (vwk) ((tb0) l13Var6.a.D(hag.I(tb0.class), l13Var6, l13Var6.b)).a.getValue();
            default:
                ((l13) obj).getClass();
                return new a12();
        }
    }
}
