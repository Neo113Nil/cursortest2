package defpackage;

import android.os.Bundle;
import com.yandex.go.order.external.b;
import com.yandex.messaging.navigation.ComposeBottomSheetDialogFragment;
import com.yandex.messaging.navigation.ComposeMessengerFragment;
import com.yandex.messaging.ui.creation.component.TelemessengerCreationDialogFragment;
import com.yandex.messaging.ui.migration.MigrationEnvironmentActivity;
import com.ybsdk.feature.transfer.version2.internal.screens.fund.FundDocsNoticeFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.fund.model.FundDocsNoticeResult;
import jason.statham.tools.a;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.eatskit.c;
import ru.yandex.taxi.superapp.h;
import ru.yandex.taxi.superapp.i;
import ru.yandex.taxi.superapp.l;
import ru.yandex.taxi.superapp.v;

/* loaded from: classes5.dex */
public final class vs4 implements wls {
    public final /* synthetic */ int a;
    public final Object b;

    public vs4(ComposeMessengerFragment composeMessengerFragment, rwi rwiVar) {
        this.a = 2;
        this.b = rwiVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Number) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(1 & intValue, (intValue & 3) != 2)) {
                    tq4 tq4Var = (tq4) obj3;
                    web1.e(null, null, null, tq4Var.a, null, 0L, null, null, null, 0, false, 0, null, tq4Var.b, null, null, null, null, false, 0L, 0, false, 0, false, null, false, btsVar, 0, 0, 0, 268402679);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.E()) {
                        btsVar2.Y();
                        return zy11Var;
                    }
                }
                ((ComposeBottomSheetDialogFragment) obj3).DialogContent(c530Var, fidVar2, 6);
                return zy11Var;
            case 2:
                fid fidVar3 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar3;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        return zy11Var;
                    }
                }
                bts btsVar4 = (bts) fidVar3;
                btsVar4.e0(-1981388264);
                Object Q = btsVar4.Q();
                if (Q == did.a) {
                    Q = new foc(7);
                    btsVar4.o0(Q);
                }
                btsVar4.t(false);
                fnq0.b(c530Var, false, (tls) Q);
                ((rwi) obj3).getClass();
                throw null;
            case 3:
                fid fidVar4 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar5 = (bts) fidVar4;
                    if (btsVar5.E()) {
                        btsVar5.Y();
                        return zy11Var;
                    }
                }
                if (((yde) obj3).d) {
                    ow91.a(0.0f, 0, 7, 0L, fidVar4, null);
                }
                return zy11Var;
            case 4:
                gcn gcnVar = (gcn) obj2;
                ien h = ((c) obj3).h();
                if (h != null) {
                    h.openKeyboard();
                }
                gcnVar.a(new ck7(zy11Var, null));
                return zy11Var;
            case 5:
                ((vs4) obj3).invoke(vmx.a.a().b(dz11.b, (String) obj), (gcn) obj2);
                return zy11Var;
            case 6:
                ((loj) obj3).invoke(vmx.a.a().b(ryq0.Companion.serializer(), (String) obj), (gcn) obj2);
                return zy11Var;
            case 7:
                ((b) obj3).b((y5c) obj);
                ((gcn) obj2).a(new ck7(zy11Var, null));
                return zy11Var;
            case 8:
                ((vs4) obj3).invoke(vmx.a.a().b(y5c.Companion.serializer(), (String) obj), (gcn) obj2);
                return zy11Var;
            case 9:
                ((zdn) obj3).invoke(vmx.a.a().b(dz11.b, (String) obj), (gcn) obj2);
                return zy11Var;
            case 10:
                gcn gcnVar2 = (gcn) obj2;
                ua1 ua1Var = (ua1) obj;
                fho fhoVar = (fho) obj3;
                hst hstVar = jst.e;
                String value = fhoVar.c.getValue();
                String str = ua1Var.a;
                Map<String, String> map = ua1Var.b;
                unr0.C(new Object[]{value, str, map}, 3, "SuperApp: %s on adjust event {token: %s, partnerParameters: %s}", hstVar);
                lx4 lx4Var = fhoVar.a.a;
                String str2 = ua1Var.a;
                if (str2 == null) {
                    str2 = "";
                }
                if (map == null) {
                    map = kotlin.collections.b.f();
                }
                ((j) lx4Var).i().b(str2, map);
                gcnVar2.a(new ck7(zy11Var, null));
                return zy11Var;
            case 11:
                ((vs4) obj3).invoke(vmx.a.a().b(ua1.Companion.serializer(), (String) obj), (gcn) obj2);
                return zy11Var;
            case 12:
                ((v) obj3).c((gcn) obj2);
                return zy11Var;
            case 13:
                ((t020) obj3).a((r7b) obj);
                ((gcn) obj2).a(new ck7(zy11Var, null));
                return zy11Var;
            case 14:
                ((vs4) obj3).invoke(vmx.a.a().b(r7b.Companion.serializer(), (String) obj), (gcn) obj2);
                return zy11Var;
            case 15:
                ((vom) obj3).invoke(vmx.a.a().b(t4c.Companion.serializer(), (String) obj), (gcn) obj2);
                return zy11Var;
            case 16:
                ((gcn) obj2).a(new ck7(Boolean.valueOf(((l) obj3).a.a.Mg()), null));
                return zy11Var;
            case 17:
                ((i) obj3).a((gcn) obj2);
                return zy11Var;
            case 18:
                ((ut9) obj3).invoke(vmx.a.a().b(dz11.b, (String) obj), (gcn) obj2);
                return zy11Var;
            case 19:
                rvq0 rvq0Var = ((d6w0) obj3).a;
                rvq0Var.getClass();
                gdn gdnVar = rvq0Var.c;
                ((gcn) obj2).a(new ck7(new yix(xsa1.b(kotlin.collections.b.t(gdnVar.a)), gdnVar.c.getKey(), Boolean.valueOf(gdnVar.b)), null));
                return zy11Var;
            case 20:
                gcn gcnVar3 = (gcn) obj2;
                mfy mfyVar = (mfy) obj;
                j0w0 j0w0Var = (j0w0) obj3;
                dwl dwlVar = j0w0Var.a;
                String value2 = j0w0Var.b.getValue();
                String str3 = mfyVar.a;
                boolean z = mfyVar.b;
                dwlVar.getClass();
                r5x q = eja1.q(scc.g("feed_favorite_state", "favorite_state", cvu0.v(value2 + "_" + str3, "-", "_", false), "is_favorite_string"));
                j5x M = jx81.M(String.valueOf(z));
                Map z2 = g8e.z("sync-with-divkit", "*");
                LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(z2.size()));
                for (Map.Entry entry : z2.entrySet()) {
                    linkedHashMap.put(entry.getKey(), sb2.P(entry.getValue()));
                }
                s6x s6xVar = new s6x(linkedHashMap);
                k6x k6xVar = dwlVar.a;
                if (k6xVar.a()) {
                    d6x d = a.d(k6xVar.b(), q, M, s6xVar);
                    if (!d.equals(k6xVar.b())) {
                        k6xVar.e(d);
                    }
                }
                gcnVar3.a(new ck7(zy11Var, null));
                return zy11Var;
            case 21:
                ((vs4) obj3).invoke(vmx.a.a().b(mfy.Companion.serializer(), (String) obj), (gcn) obj2);
                return zy11Var;
            case 22:
                ((h) obj3).a((gcn) obj2);
                return zy11Var;
            case 23:
                ((ru.yandex.taxi.contacts.h) obj3).a((gcn) obj2);
                return zy11Var;
            case 24:
                ((ben) obj3).invoke(vmx.a.a().b(rwq0.Companion.serializer(), (String) obj), (gcn) obj2);
                return zy11Var;
            case 25:
                FundDocsNoticeResult.Companion.getClass();
                FundDocsNoticeResult fundDocsNoticeResult = (FundDocsNoticeResult) ((Bundle) obj2).getParcelable(FundDocsNoticeFragment.RESULT_KEY);
                if (fundDocsNoticeResult instanceof FundDocsNoticeResult.Accept) {
                    ((vj01) obj3).invoke();
                } else if (fundDocsNoticeResult != null) {
                    w511.b();
                    return null;
                }
                return zy11Var;
            case 26:
                fid fidVar5 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar6 = (bts) fidVar5;
                    if (btsVar6.E()) {
                        btsVar6.Y();
                        return zy11Var;
                    }
                }
                hlb1.a(wwg.S(-192675185, true, new com.yandex.messaging.ui.migration.a((MigrationEnvironmentActivity) obj3), fidVar5), fidVar5, 6);
                return zy11Var;
            case 27:
                ((w250) obj3).invoke(vmx.a.a().b(rzd.Companion.serializer(), (String) obj), (gcn) obj2);
                return zy11Var;
            case 28:
                ((w250) obj3).invoke(vmx.a.a().b(dz11.b, (String) obj), (gcn) obj2);
                return zy11Var;
            default:
                fid fidVar6 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar7 = (bts) fidVar6;
                    if (btsVar7.E()) {
                        btsVar7.Y();
                        return zy11Var;
                    }
                }
                ((TelemessengerCreationDialogFragment) obj3).DialogContent(c530Var, fidVar6, 6);
                return zy11Var;
        }
    }

    public /* synthetic */ vs4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
