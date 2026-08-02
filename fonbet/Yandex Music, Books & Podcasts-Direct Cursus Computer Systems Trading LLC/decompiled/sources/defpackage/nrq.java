package defpackage;

import com.yandex.music.skeleton.blocks.special.data.SpecialBlockApi;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class nrq implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ nrq(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 30;
        int i2 = 0;
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                return Unit.a;
            case 2:
                l18 l18Var = l18.b;
                bdt I = hag.I(snu.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return ((snu) qdcVar.C(I)).b;
            case 3:
                return "SlidesNetworkLayer";
            case 4:
                return new LinkedHashMap();
            case 5:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(uvo.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return (vvo) ((uvo) qdcVar2.C(I2)).a.getValue();
            case 6:
                return Unit.a;
            case 7:
                return Unit.a;
            case 8:
                return Unit.a;
            case 9:
                jyr jyrVar = dzq.f;
                return (dzq) ((byb) l18.b.c(hag.I(byb.class))).b(dzq.class);
            case 10:
                return ((dzq) dzq.f.getValue()).b();
            case 11:
                return (czq) ((dzq) dzq.f.getValue()).e.getValue();
            case 12:
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(upq.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                return (SpecialBlockApi) ((upq) qdcVar3.C(I3)).c().a.b(SpecialBlockApi.class);
            case 13:
                return new b6r();
            case 14:
                return new iug();
            case 15:
                return new lhs("SplashScreenCache", i2, i);
            case 16:
                ((x6r) f7r.a.getValue()).a();
                return Unit.a;
            case 17:
                return Boolean.valueOf(gut.G());
            case 18:
                return "SplashScreen";
            case 19:
                return Boolean.valueOf(gut.G());
            case 20:
                return new lhs("SplashScreenViewModel", i2, i);
            case 21:
                agr agrVar = t8r.a;
                return imr.a;
            case 22:
                ArrayList arrayList = lbr.g;
                ArrayList arrayList2 = lbr.f;
                ReentrantLock reentrantLock = lbr.e;
                reentrantLock.lock();
                try {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).invoke();
                    }
                    arrayList2.clear();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Continuation continuation = (Continuation) it2.next();
                        r7o r7oVar = z7o.b;
                        continuation.resumeWith(Unit.a);
                    }
                    arrayList.clear();
                    reentrantLock.unlock();
                    return Unit.a;
                } finally {
                    reentrantLock.unlock();
                }
            case 23:
                ArrayList arrayList3 = lbr.d;
                ArrayList arrayList4 = lbr.c;
                ReentrantLock reentrantLock2 = lbr.b;
                reentrantLock2.lock();
                try {
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        ((Function0) it3.next()).invoke();
                    }
                    arrayList4.clear();
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        Continuation continuation2 = (Continuation) it4.next();
                        r7o r7oVar2 = z7o.b;
                        continuation2.resumeWith(Unit.a);
                    }
                    arrayList3.clear();
                    reentrantLock2.unlock();
                    return Unit.a;
                } finally {
                    reentrantLock2.unlock();
                }
            case 24:
                return (dan) l18.b.c(hag.I(dan.class));
            case 25:
                return Unit.a;
            case 26:
                return new tur();
            case 27:
                return new nxr();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return gld.e(dm6.b());
            default:
                return ((k5m) l18.b.c(hag.I(k5m.class))).a();
        }
    }
}
