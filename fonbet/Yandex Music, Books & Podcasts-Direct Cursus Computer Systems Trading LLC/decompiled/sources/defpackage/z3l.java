package defpackage;

import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class z3l implements y3l {
    public final qqs a;

    public z3l(qqs qqsVar) {
        this.a = qqsVar;
    }

    public final Unit a(n7q n7qVar) {
        ia faVar;
        mwk mwkVar = (mwk) CollectionsKt.S(y7g.B(n7qVar), f8g.F(n7qVar));
        if (mwkVar == null || (faVar = this.a.b(mwkVar, true)) == null) {
            faVar = new fa(new IllegalArgumentException("Can't play at specified position " + n7qVar));
        }
        if (faVar.equals(ea.a)) {
            return Unit.a;
        }
        if (!(faVar instanceof ha)) {
            b6e.s();
            return null;
        }
        throw new PlaybackQueueStartValidator$InvalidQueueException(((ha) faVar).a(), "Can't play at specified position " + n7qVar);
    }
}
