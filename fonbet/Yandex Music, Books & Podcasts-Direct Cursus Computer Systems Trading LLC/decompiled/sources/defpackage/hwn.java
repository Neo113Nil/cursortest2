package defpackage;

import com.yandex.music.shared.wave.domain.commands.d;
import com.yandex.music.shared.ynison.api.queue.YnisonEditQueueCommand$RemoveAt;

/* loaded from: classes4.dex */
public final class hwn implements z7q {
    public final int a;

    public hwn(int i) {
        this.a = i;
    }

    @Override // defpackage.z7q
    public final Object D(z1q z1qVar) {
        z1qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public final Object E(k9q k9qVar) {
        k9qVar.getClass();
        return d.a.i(this.a);
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
        a8qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public final Object s(wpw wpwVar) {
        wpwVar.getClass();
        wpwVar.k.getClass();
        return new YnisonEditQueueCommand$RemoveAt(this.a);
    }
}
