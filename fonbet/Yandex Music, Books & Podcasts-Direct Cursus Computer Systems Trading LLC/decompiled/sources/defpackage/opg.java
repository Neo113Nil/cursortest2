package defpackage;

import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class opg implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ opg(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = false;
        switch (this.a) {
            case 0:
                agr agrVar = ppg.a;
                return null;
            case 1:
                return new wnr(c5b.a, 0);
            case 2:
                qs5 qs5Var = rpg.a;
                return null;
            case 3:
                l18 l18Var = l18.b;
                return Boolean.valueOf(((ulu) ((byb) l18Var.c(hag.I(byb.class))).b(ulu.class)).h());
            case 4:
                agr agrVar2 = tpg.a;
                return Boolean.FALSE;
            case 5:
                agr agrVar3 = upg.a;
                return Boolean.TRUE;
            case 6:
                agr agrVar4 = vpg.a;
                return Boolean.TRUE;
            case 7:
                return Boolean.valueOf(((kkv) ((byb) l18.b.c(hag.I(byb.class))).b(kkv.class)).h());
            case 8:
                throw new IllegalStateException("YandexPlayerCreator is not initialized!");
            case 9:
                l18 l18Var2 = l18.b;
                bdt I = hag.I(fbw.class);
                qdc qdcVar = l18Var2.a;
                qdcVar.getClass();
                return fbw.a((fbw) qdcVar.C(I));
            case 10:
                return qld.m();
            case 11:
                return qld.m();
            case 12:
                l18 l18Var3 = l18.b;
                bdt I2 = hag.I(vka.class);
                qdc qdcVar2 = l18Var3.a;
                qdcVar2.getClass();
                return (cba) ((vka) qdcVar2.C(I2)).j.getValue();
            case 13:
                l18 l18Var4 = l18.b;
                bdt I3 = hag.I(vka.class);
                qdc qdcVar3 = l18Var4.a;
                qdcVar3.getClass();
                return (aaa) ((vka) qdcVar3.C(I3)).i.getValue();
            case 14:
                return qld.m();
            case 15:
                l18 l18Var5 = l18.b;
                bdt I4 = hag.I(a6e.class);
                qdc qdcVar4 = l18Var5.a;
                qdcVar4.getClass();
                return a6e.a((a6e) qdcVar4.C(I4));
            case 16:
                if (((f1h) f1h.e.getValue()).h()) {
                    l18 l18Var6 = l18.b;
                    bdt I5 = hag.I(byb.class);
                    qdc qdcVar5 = l18Var6.a;
                    qdcVar5.getClass();
                    if (((g7n) ((byb) qdcVar5.C(I5)).b(g7n.class)).h()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 17:
                jyr jyrVar = f1h.e;
                return (f1h) ((byb) l18.b.c(hag.I(byb.class))).b(f1h.class);
            case 18:
                return Boolean.valueOf(o9w.a());
            case 19:
                return new t5h();
            case 20:
                lhs lhsVar = MainScreenActivity.Q0;
                lbr.a();
                AtomicReference atomicReference = lbr.a;
                gcr gcrVar = gcr.b;
                gcr gcrVar2 = gcr.c;
                while (true) {
                    if (atomicReference.compareAndSet(gcrVar, gcrVar2)) {
                        lbr.b();
                    } else if (atomicReference.get() != gcrVar) {
                    }
                }
                return Unit.a;
            case 21:
                jyr jyrVar2 = i7h.e;
                l18 l18Var7 = l18.b;
                bdt I6 = hag.I(byb.class);
                qdc qdcVar6 = l18Var7.a;
                qdcVar6.getClass();
                return (i7h) ((byb) qdcVar6.C(I6)).c(ern.a(i7h.class));
            case 22:
                return Unit.a;
            case 23:
                return Boolean.TRUE;
            case 24:
                return Boolean.FALSE;
            case 25:
                return new z08();
            case 26:
                return new gal();
            case 27:
                rdb rdbVar = b72.j;
                ArrayList arrayList = new ArrayList(v75.o(rdbVar, 10));
                Iterator it = rdbVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((b72) it.next()).a);
                }
                return CollectionsKt.A0(arrayList);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new hu0();
            default:
                return Unit.a;
        }
    }

    public /* synthetic */ opg(int i, Object obj) {
        this.a = i;
    }
}
