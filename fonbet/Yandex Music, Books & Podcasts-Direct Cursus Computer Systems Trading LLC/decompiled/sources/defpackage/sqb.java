package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.data.loadcontrol.LoadControlState;
import ru.yandex.video.m3.player.PlaybackException;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class sqb extends uif implements Function0 {
    public final /* synthetic */ crb r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqb(crb crbVar) {
        super(0);
        this.r = crbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HashSet u0;
        Object t7oVar;
        LoadControlState loadControlState;
        crb crbVar = this.r;
        crbVar.a.j0(crbVar.I);
        crb crbVar2 = this.r;
        crbVar2.a.j0(crbVar2.J);
        crb crbVar3 = this.r;
        crbVar3.a.j0(crbVar3.K);
        crb crbVar4 = this.r;
        crbVar4.a.j0(crbVar4.n);
        crb crbVar5 = this.r;
        crbVar5.a.c1(crbVar5.p);
        crb crbVar6 = this.r;
        crbVar6.a.c1(new dte(crbVar6.m, crbVar6.j));
        crb crbVar7 = this.r;
        crbVar7.a.c1(crbVar7.O);
        crb crbVar8 = this.r;
        crbVar8.a.c1(new vm6(crbVar8.m, crbVar8.k));
        crb crbVar9 = this.r;
        crbVar9.a.c1(crbVar9.G);
        crb crbVar10 = this.r;
        jmr jmrVar = crbVar10.y;
        if (jmrVar != null) {
            axh axhVar = crbVar10.l;
            if (axhVar == null) {
                yjj yjjVar = crbVar10.m;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("loadControl is null");
                        LoadControlState.Companion.getClass();
                        loadControlState = LoadControlState.EMPTY;
                        ((zbl) next).X(new PlaybackException.ErrorStalledStuck(illegalArgumentException, loadControlState));
                        t7oVar = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                    }
                }
            } else {
                mmr mmrVar = new mmr(axhVar, crbVar10.a, crbVar10.m, jmrVar, crbVar10.k);
                this.r.a.j0(mmrVar);
                crbVar10.R = mmrVar;
            }
        }
        return Unit.a;
    }
}
