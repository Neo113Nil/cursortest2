package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.entry.EntryScreenActivity;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;
import ru.yandex.music.settings.screen.QualitySettingsActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class vuq extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vuq(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long M;
        long M2;
        Object obj;
        long M3;
        long M4;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                ((hvq) this.receiver).c();
                break;
            case 1:
                ((hvq) this.receiver).c();
                break;
            case 2:
                ((hvq) this.receiver).c();
                break;
            case 3:
                ((m0r) this.receiver).d();
                break;
            case 4:
                ((bg5) this.receiver).a();
                break;
            case 5:
                ((bg5) this.receiver).d();
                break;
            case 6:
                ((bg5) this.receiver).e();
                break;
            case 7:
                ((m0r) this.receiver).d();
                break;
            case 8:
                ((bg5) this.receiver).a();
                break;
            case 9:
                ((bg5) this.receiver).d();
                break;
            case 10:
                ((bg5) this.receiver).e();
                break;
            case 11:
                eqp eqpVar = (eqp) this.receiver;
                tnb.d(eqpVar.c.a(), wjb.SettingsQualityScreen);
                t tVar = eqpVar.b.a;
                int i = QualitySettingsActivity.Y;
                tVar.startActivity(new Intent(tVar, (Class<?>) QualitySettingsActivity.class));
                break;
            case 12:
                eqp eqpVar2 = (eqp) this.receiver;
                tnb.d(eqpVar2.c.a(), wjb.Link);
                tpp tppVar = eqpVar2.b;
                tppVar.getClass();
                Intent putExtra = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL").putExtra("android.media.extra.PACKAGE_NAME", tppVar.a.getPackageName()).putExtra("android.media.extra.AUDIO_SESSION", ((hy1) ((e3q) ((vyk) tppVar.d.getValue())).c.getValue()).b);
                putExtra.getClass();
                ComponentName resolveActivity = putExtra.resolveActivity(tppVar.a.getPackageManager());
                t tVar2 = tppVar.a;
                if (resolveActivity != null) {
                    tVar2.startActivityForResult(putExtra, 2);
                } else {
                    hag.x(tVar2, R.string.open_equalizer_error, 0);
                }
                break;
            case 13:
                sa8 sa8Var = (sa8) this.receiver;
                sa8Var.a.invoke(sa8Var);
                break;
            case 14:
                ((lwc) ((tnr) ((vnr) this.receiver).e.getValue()).a.getValue()).g.set(false);
                break;
            case 15:
                ((lwc) ((tnr) ((vnr) this.receiver).e.getValue()).a.getValue()).g.set(true);
                break;
            case 16:
                vnr vnrVar = (vnr) this.receiver;
                eke ekeVar = vnrVar.b;
                ekeVar.a.c(ekeVar.b, wjb.PaywallScreen, "");
                onr onrVar = (onr) vnrVar.d.getValue();
                Context context = vnrVar.a;
                onrVar.getClass();
                context.getClass();
                int i2 = TariffPaywallActivity.z;
                Intent b = dml.b(context, new lik(vik.f, null, null));
                Activity R = vq2.R(context);
                if (R != null) {
                    R.startActivity(b);
                }
                break;
            case 17:
                kor korVar = (kor) this.receiver;
                hor horVar = (hor) korVar.c.getValue();
                Context context2 = korVar.b;
                horVar.getClass();
                context2.getClass();
                v7g.L(context2, new lik(vik.f, null, null));
                break;
            case 18:
                uwc uwcVar = ((kor) this.receiver).a.l;
                x97.y(uwcVar.b, null, null, new g68(uwcVar, continuation, 21), 3);
                break;
            case 19:
                ((v3s) this.receiver).b.a.getOnBackPressedDispatcher().d();
                break;
            case 20:
                v3s v3sVar = (v3s) this.receiver;
                s3s s3sVar = v3sVar.b;
                y yVar = v3sVar.c;
                y3s y3sVar = v3sVar.a;
                String str = ((d3s) y3sVar.t.getValue()).b;
                z3s.b.getClass();
                List list = z3s.c;
                int a = tah.a(v75.o(list, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (Object obj2 : list) {
                    linkedHashMap.put(obj2, Boolean.valueOf(((z3s) obj2) == y3sVar.n));
                }
                r3s r3sVar = new r3s(1, v3sVar);
                s3sVar.getClass();
                yVar.getClass();
                str.getClass();
                t tVar3 = s3sVar.a;
                pu0 t = pd.t(new qzm[0]);
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    z3s z3sVar = (z3s) entry.getKey();
                    boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                    z3sVar.getClass();
                    arrayList.add(s7g.l(z3sVar, null, z3sVar.a, booleanValue));
                }
                r3s r3sVar2 = new r3s(0, r3sVar);
                cvo cvoVar = cvo.i;
                fxf.P(tVar3, o6m.b(wjb.SortConditionsScreen, null, 6), null, t, null, new wn5(new fb1(9, arrayList, r3sVar2, tVar3), -240278974, true), 22);
                break;
            case 21:
                y3s y3sVar2 = ((v3s) this.receiver).a;
                y3sVar2.o = true;
                y3sVar2.s.h();
                break;
            case 22:
                ((v3s) this.receiver).a.s.i();
                break;
            case 23:
                m5s m5sVar = (m5s) this.receiver;
                t5s t5sVar = ((c5s) m5sVar.d.getValue()).g;
                long currentTimeMillis = System.currentTimeMillis();
                t5sVar.a.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                Long e = ((q4s) ((byb) qdcVar.C(I)).b(q4s.class)).a().e("dismissDuration");
                if (e != null) {
                    msa msaVar = nsa.b;
                    M = yd5.N(e.longValue(), ssa.HOURS);
                } else {
                    msa msaVar2 = nsa.b;
                    M = yd5.M(0, ssa.HOURS);
                }
                t5sVar.c(nsa.f(M) + currentTimeMillis);
                fx1.r(m5sVar.a, m5sVar);
                break;
            case 24:
                m5s m5sVar2 = (m5s) this.receiver;
                m5sVar2.e.e();
                c5s c5sVar = (c5s) m5sVar2.d.getValue();
                c5sVar.h.a();
                t5s t5sVar2 = c5sVar.g;
                long currentTimeMillis2 = System.currentTimeMillis();
                t5sVar2.a.getClass();
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                Long e2 = ((q4s) ((byb) qdcVar2.C(I2)).b(q4s.class)).a().e("cancelDuration");
                if (e2 != null) {
                    msa msaVar3 = nsa.b;
                    M2 = yd5.N(e2.longValue(), ssa.HOURS);
                } else {
                    msa msaVar4 = nsa.b;
                    M2 = yd5.M(24, ssa.HOURS);
                }
                t5sVar2.c(nsa.f(M2) + currentTimeMillis2);
                ot0.A(j4s.b.e(), "take_charge_popup_close", null);
                break;
            case 25:
                m5s m5sVar3 = (m5s) this.receiver;
                m5sVar3.e.e();
                c5s c5sVar2 = (c5s) m5sVar3.d.getValue();
                Context context3 = c5sVar2.i.a;
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                String f = ((q4s) ((byb) qdcVar3.C(I3)).b(q4s.class)).a().f("linkGoApp");
                if (f == null) {
                    f = "https://yandex.go.link/8oH0O";
                }
                Intent a2 = n4s.a(f);
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var3.a;
                qdcVar4.getClass();
                String f2 = ((q4s) ((byb) qdcVar4.C(I4)).b(q4s.class)).a().f("linkGooglePlay");
                if (f2 == null) {
                    f2 = "market://details?id=ru.yandex.taxi";
                }
                Intent a3 = n4s.a(f2);
                bdt I5 = hag.I(byb.class);
                qdc qdcVar5 = l18Var3.a;
                qdcVar5.getClass();
                String f3 = ((q4s) ((byb) qdcVar5.C(I5)).b(q4s.class)).a().f("linkRustore");
                if (f3 == null) {
                    f3 = "rustore://apps.rustore.ru/app/ru.yandex.taxi";
                }
                Intent a4 = n4s.a(f3);
                bdt I6 = hag.I(byb.class);
                qdc qdcVar6 = l18Var3.a;
                qdcVar6.getClass();
                String f4 = ((q4s) ((byb) qdcVar6.C(I6)).b(q4s.class)).a().f("linkSamsung");
                if (f4 == null) {
                    f4 = "samsungapps://details?id=ru.yandex.taxi";
                }
                Intent a5 = n4s.a(f4);
                bdt I7 = hag.I(byb.class);
                qdc qdcVar7 = l18Var3.a;
                qdcVar7.getClass();
                String f5 = ((q4s) ((byb) qdcVar7.C(I7)).b(q4s.class)).a().f("linkHuawei");
                if (f5 == null) {
                    f5 = "appmarket://details?id=ru.yandex.taxi";
                }
                Intent a6 = n4s.a(f5);
                bdt I8 = hag.I(byb.class);
                qdc qdcVar8 = l18Var3.a;
                qdcVar8.getClass();
                String f6 = ((q4s) ((byb) qdcVar8.C(I8)).b(q4s.class)).a().f("linkXiaomi");
                if (f6 == null) {
                    f6 = "mimarket://details?id=ru.yandex.taxi";
                }
                Iterator it = CollectionsKt.O(u75.h(a2, a3, a4, a5, a6, n4s.a(f6))).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (context3.getPackageManager().resolveActivity((Intent) obj, SQLiteDatabase.OPEN_SHAREDCACHE) != null) {
                        }
                    } else {
                        obj = null;
                    }
                }
                Intent intent = (Intent) obj;
                if (intent != null) {
                    context3.startActivity(intent);
                }
                t5s t5sVar3 = c5sVar2.g;
                long currentTimeMillis3 = System.currentTimeMillis();
                t5sVar3.a.getClass();
                bdt I9 = hag.I(byb.class);
                qdc qdcVar9 = l18Var3.a;
                qdcVar9.getClass();
                Long e3 = ((q4s) ((byb) qdcVar9.C(I9)).b(q4s.class)).a().e("takeDuration");
                if (e3 != null) {
                    msa msaVar5 = nsa.b;
                    M3 = yd5.N(e3.longValue(), ssa.HOURS);
                } else {
                    msa msaVar6 = nsa.b;
                    M3 = yd5.M(24, ssa.HOURS);
                }
                t5sVar3.c(nsa.f(M3) + currentTimeMillis3);
                ot0.A(j4s.b.e(), "take_charge_popup_take", null);
                break;
            case 26:
                m5s m5sVar4 = (m5s) this.receiver;
                m5sVar4.e.e();
                c5s c5sVar3 = (c5s) m5sVar4.d.getValue();
                c5sVar3.h.a();
                t5s t5sVar4 = c5sVar3.g;
                long currentTimeMillis4 = System.currentTimeMillis();
                t5sVar4.a.getClass();
                l18 l18Var4 = l18.b;
                bdt I10 = hag.I(byb.class);
                qdc qdcVar10 = l18Var4.a;
                qdcVar10.getClass();
                Long e4 = ((q4s) ((byb) qdcVar10.C(I10)).b(q4s.class)).a().e("notInterestingDuration");
                if (e4 != null) {
                    msa msaVar7 = nsa.b;
                    M4 = yd5.N(e4.longValue(), ssa.HOURS);
                } else {
                    msa msaVar8 = nsa.b;
                    M4 = yd5.M(720, ssa.HOURS);
                }
                t5sVar4.c(nsa.f(M4) + currentTimeMillis4);
                ot0.A(j4s.b.e(), "take_charge_popup_not_interesting", null);
                break;
            case 27:
                e8s e8sVar = ((p7s) this.receiver).a;
                e8sVar.getClass();
                x97.y(ot0.F(e8sVar), null, null, new d7i(e8sVar, continuation, 27), 3);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                fy3 fy3Var = ((p7s) this.receiver).b;
                int i3 = EntryScreenActivity.y;
                t tVar4 = fy3Var.a;
                tVar4.startActivity(yd5.y(tVar4, mdb.a));
                break;
            default:
                ((bis) this.receiver).a();
                break;
        }
        return Unit.a;
    }
}
