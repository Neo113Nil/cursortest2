package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.player.PlaybackException;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class arb extends uif implements Function0 {
    public final /* synthetic */ bcl r;
    public final /* synthetic */ crb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arb(bcl bclVar, crb crbVar) {
        super(0);
        this.r = bclVar;
        this.s = crbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HashSet u0;
        Object t7oVar;
        long j = this.r.a;
        if (j == -9223372036854775807L || j == -1) {
            j = -9223372036854775807L;
        }
        crb crbVar = this.s;
        if (crbVar.x && j == crbVar.a.s0()) {
            yjj yjjVar = this.s.m;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((zbl) next).X(new PlaybackException.ErrorSeekPosition(new IllegalArgumentException("Current position in Exo is same as seek position")));
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
            crb crbVar2 = this.s;
            mmr mmrVar = crbVar2.R;
            if (mmrVar != null) {
                mmrVar.f = true;
            }
            crbVar2.a.s(j);
        }
        return Unit.a;
    }
}
