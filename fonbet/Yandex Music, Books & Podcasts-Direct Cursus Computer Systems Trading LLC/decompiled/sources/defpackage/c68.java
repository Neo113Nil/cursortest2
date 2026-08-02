package defpackage;

import android.content.Context;
import com.appsflyer.internal.k;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class c68 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        nrf nrfVar;
        switch (this.a) {
            case 0:
                joj jojVar = (joj) obj;
                jojVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                timeUnit.getClass();
                jojVar.w = cvt.b("timeout", 5000L, timeUnit);
                return Unit.a;
            case 1:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("DELETE FROM disclaimers");
                try {
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 2:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, c88.class).E(new c68(3));
                o18Var.b(hag.I(e88.class)).E(new c68(4));
                return Unit.a;
            case 3:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(Context.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                return new c88(new h88((Context) qdcVar.D(I, l13Var, set), false), gld.e(dm6.b()), (raa) qdcVar.D(hag.I(raa.class), l13Var, set), (f7l) qdcVar.D(hag.I(f7l.class), l13Var, set), l13Var.b(hag.I(cc7.class), true), l13Var.b(hag.I(frt.class), true));
            case 4:
                ((l13) obj).getClass();
                return new e88(0);
            case 5:
                vjg vjgVar = (vjg) obj;
                if (vjgVar == null || (nrfVar = vjgVar.a) == null) {
                    return null;
                }
                return new n88(nrfVar, vjgVar.c, false);
            case 6:
                vz1.e((o18) obj, a98.class).D(new c68(7));
                return Unit.a;
            case 7:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new a98(l13Var2);
            case 8:
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vuf.Y(vufVar, null, gld.b, 3);
                return Unit.a;
            case 9:
                ((Map.Entry) obj).getValue().getClass();
                throw new ClassCastException();
            case 10:
                return Boolean.valueOf(!(((l4a) obj) instanceof k4a));
            case 11:
                ((mip) obj).l(ern.a(b6a.class), new qg(5));
                return Unit.a;
            case 12:
                m1g m1gVar = (m1g) obj;
                m1gVar.getClass();
                int i = m1gVar.b;
                boolean z = m1gVar.a == j1g.a;
                return new w3g(tt0.C(i), dag.A(i, z), z);
            case 13:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.w(jfpVar);
                return Unit.a;
            case 14:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.x(jfpVar2, 1.0f);
                return Unit.a;
            case 15:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.x(jfpVar3, 2.0f);
                return Unit.a;
            case 16:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.x(jfpVar4, 3.0f);
                return Unit.a;
            case 17:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.x(jfpVar5, 4.0f);
                return Unit.a;
            case 18:
                ((jfp) obj).getClass();
                return Unit.a;
            case 19:
                ((jfp) obj).getClass();
                return Unit.a;
            case 20:
                jca jcaVar = (jca) obj;
                jcaVar.getClass();
                StringBuilder q = k.q("WHEN '", jcaVar.b, jcaVar.a, "' THEN '");
                q.append("'");
                return q.toString();
            case 21:
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("SELECT * FROM downloadedAlbums ORDER BY downloadedTimestamp DESC");
                try {
                    int v = s7g.v(D0, "albumId");
                    int v2 = s7g.v(D0, "downloadedTimestamp");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(new ica(D0.x0(v), D0.getLong(v2)));
                    }
                    return arrayList;
                } finally {
                }
            case 22:
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("DELETE FROM downloadedAlbums");
                try {
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 23:
                List list = (List) obj;
                list.getClass();
                return y5g.A0(list, cyt.a);
            case 24:
                List list2 = (List) obj;
                list2.getClass();
                return y5g.A0(list2, cyt.a);
            case 25:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, zx4.class).E(new c68(26));
                o18Var2.b(hag.I(jla.class)).E(new c68(27));
                return Unit.a;
            case 26:
                ((l13) obj).getClass();
                return new zx4();
            case 27:
                ((l13) obj).getClass();
                return new jla();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                fga fgaVar = (fga) obj;
                fgaVar.getClass();
                return hrg.m(fgaVar.c, "'", f1d.m("WHEN '", fgaVar.a.a, StringUtils.PROCESS_POSTFIX_DELIMITER, fgaVar.b, "' THEN '"));
            default:
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                D0 = xjoVar4.D0("DELETE FROM downloadedPlaylists");
                try {
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
        }
    }

    public /* synthetic */ c68(int i) {
        this.a = i;
    }

    public /* synthetic */ c68(yfx yfxVar) {
        this.a = 11;
    }
}
