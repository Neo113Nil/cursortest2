package defpackage;

import com.yandex.music.shared.glagol.api.queue.SharedGlagolPlaybackCommand$Next;
import com.yandex.music.shared.radio.domain.commands.d;
import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$Next;
import com.yandex.music.shared.ynison.api.queue.YnisonNavigateCommand$Next;

/* loaded from: classes4.dex */
public final class krq implements z7q {
    public final jrq a;

    public krq(jrq jrqVar) {
        jrqVar.getClass();
        this.a = jrqVar;
    }

    @Override // defpackage.z7q
    public final Object D(z1q z1qVar) {
        z1qVar.getClass();
        z1qVar.k.getClass();
        return SharedGlagolPlaybackCommand$Next.INSTANCE;
    }

    @Override // defpackage.z7q
    public final Object E(k9q k9qVar) {
        i9q i9qVar;
        k9qVar.getClass();
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            i9qVar = i9q.a;
        } else if (ordinal == 1) {
            i9qVar = i9q.b;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return null;
            }
            i9qVar = i9q.c;
        }
        int ordinal2 = i9qVar.ordinal();
        if (ordinal2 == 0) {
            return new WaveQueueCommandsFactory$Next(v5j.e, false);
        }
        if (ordinal2 == 1) {
            return new WaveQueueCommandsFactory$Next(v5j.b, false);
        }
        if (ordinal2 == 2) {
            return new WaveQueueCommandsFactory$Next(v5j.c, false);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.z7q
    public final Object G(b1q b1qVar) {
        b1qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public final Object o(a1q a1qVar) {
        a1qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public final Object r(a8q a8qVar) {
        boolean z;
        a8qVar.getClass();
        d dVar = ((s8q) a8qVar).f;
        jrq jrqVar = this.a;
        jrqVar.getClass();
        int ordinal = jrqVar.ordinal();
        if (ordinal != 0) {
            z = true;
            if (ordinal != 1 && ordinal != 2) {
                b6e.s();
                return null;
            }
        } else {
            z = false;
        }
        return dVar.d(z);
    }

    @Override // defpackage.z7q
    public final Object s(wpw wpwVar) {
        wpwVar.getClass();
        wpwVar.k.getClass();
        return YnisonNavigateCommand$Next.INSTANCE;
    }
}
