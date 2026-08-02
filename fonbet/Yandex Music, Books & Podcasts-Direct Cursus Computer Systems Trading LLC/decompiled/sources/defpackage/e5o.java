package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public final /* synthetic */ class e5o implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ e5o(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List c;
        int i = 0;
        switch (this.a) {
            case 0:
                return new wso(ff7.C(tkr.a));
            case 1:
                return new wso(ff7.C(f5o.a));
            case 2:
                return new wso(ff7.C(f5o.a));
            case 3:
                v5o[] values = v5o.values();
                values.getClass();
                return new udb("com.yandex.plus2.sdk.widget.daily.internal.domain.model.rest.RestPlusStateResponseBody.Balance.Currency", values);
            case 4:
                a6o[] values2 = a6o.values();
                values2.getClass();
                return new udb("com.yandex.plus2.sdk.widget.daily.internal.domain.model.rest.RestPlusStateResponseBody.PlusState.PlusSubscriptionStatus", values2);
            case 5:
                return new HashMap();
            case 6:
                return new e5o(7);
            case 7:
                return Unit.a;
            case 8:
                return "RotorApi";
            case 9:
                jyr jyrVar = mwo.e;
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return Boolean.valueOf(((mwo) ((byb) qdcVar.C(I)).c(ern.a(mwo.class))).h());
            case 10:
                return Unit.a;
            case 11:
                agr agrVar = qxo.a;
                return null;
            case 12:
                return Unit.a;
            case 13:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return Boolean.valueOf(((a4q) ((byb) qdcVar2.C(I2)).c(ern.a(a4q.class))).h());
            case 14:
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(i0j.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                i0j i0jVar = (i0j) qdcVar3.C(I3);
                evj evjVar = new evj((rao) null, "Recognition", (ozw) null, (Function1) null, 55);
                izm izmVar = izm.HTTP_2;
                izm izmVar2 = izm.HTTP_1_1;
                jp0 jp0Var = i0jVar.b;
                Context context = i0jVar.d;
                hwd hwdVar = i0jVar.g;
                g06 g06Var = new g06(context, hwdVar, hwdVar.b);
                ewd ewdVar = new ewd(i0jVar.g, g06Var);
                joj c2 = ((OkHttpClient) ((jyr) i0jVar.a.c).getValue()).c();
                ArrayList arrayList = c2.d;
                ozw ozwVar = i0jVar.m;
                ozwVar.getClass();
                c2.b = ozwVar;
                Function1 function1 = (Function1) evjVar.f;
                rao raoVar = (rao) evjVar.c;
                if (function1 != null) {
                    function1.invoke(c2);
                }
                if (jp0Var.a) {
                    uwf.M(c2);
                }
                if (((String) evjVar.b) != null) {
                    arrayList.add(new xoj((voj) jp0Var.d, new g0j(evjVar, i)));
                }
                arrayList.add(ewdVar);
                if (evjVar.a) {
                    arrayList.add(new up3(i0jVar.f));
                }
                c2.a(i0jVar.q);
                if (!Intrinsics.d(raoVar, qao.a)) {
                    if (Intrinsics.d(raoVar, pao.a)) {
                        c2.a((bse) i0jVar.p.getValue());
                    } else {
                        if (!(raoVar instanceof oao)) {
                            b6e.s();
                            return null;
                        }
                        ?? r2 = ((oao) raoVar).a;
                        q76 q76Var = i0jVar.f;
                        Object obj = sbo.a;
                        q76Var.getClass();
                        c2.c.add(new up3(q76Var, new iwe((Map) r2, new AtomicReference(null))));
                    }
                }
                Iterator it = ((List) jp0Var.f).iterator();
                while (it.hasNext()) {
                    c2.a((bse) it.next());
                }
                Iterator it2 = ((List) jp0Var.e).iterator();
                while (it2.hasNext()) {
                    c2.b((bse) it2.next());
                }
                int ordinal = ((s9t) evjVar.d).ordinal();
                int i2 = 1;
                if (ordinal == 0) {
                    c = t75.c(izmVar2);
                } else if (ordinal == 1) {
                    c = u75.h(izmVar2, izmVar);
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    c = u75.h(izmVar, izmVar2);
                }
                c2.d(c);
                return new r9t(new OkHttpClient(c2), new iwd(g06Var, i2));
            case 15:
                return szf.g0(Boolean.TRUE);
            case 16:
                return Boolean.valueOf(i0p.b());
            case 17:
                return Boolean.valueOf(i0p.a());
            case 18:
                return new fvf(0, 0);
            case 19:
                return Unit.a;
            case 20:
                return new fvf(0, 0);
            case 21:
                return new sgs(qo6.k, new jcv("avatars.mds.yandex.net/get-music-misc/28052/img.6a43cf8d25e4bb53299db620/%%", WebPath$Storage.AVATARS).getPathForSize(wct.s()));
            case 22:
                return new sgs(qo6.k, new jcv("avatars.mds.yandex.net/get-music-misc/34161/img.6a577267856b5f25fe681fc0/%%", WebPath$Storage.AVATARS).getPathForSize(wct.s()));
            case 23:
                return new alp(Bundle.EMPTY, "stubPrev");
            case 24:
                rre rreVar = gx6.b;
                return new alp(Bundle.EMPTY, "seekBackward");
            case 25:
                rre rreVar2 = gx6.b;
                return new alp(Bundle.EMPTY, "seekForward");
            case 26:
                rre rreVar3 = gx6.b;
                return new alp(Bundle.EMPTY, "actionUndoDislike");
            case 27:
                rre rreVar4 = gx6.b;
                return new alp(Bundle.EMPTY, "actionDislike");
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                rre rreVar5 = gx6.b;
                return new alp(Bundle.EMPTY, "actionUndoLike");
            default:
                rre rreVar6 = gx6.b;
                return new alp(Bundle.EMPTY, "actionLike");
        }
    }

    public /* synthetic */ e5o(i0p i0pVar, int i) {
        this.a = i;
    }
}
