package defpackage;

import com.yandex.music.shared.network.repositories.api.EmptyAccountException;

/* loaded from: classes4.dex */
public final class nj6 extends pj6 {
    public final jyr a;

    public nj6(EmptyAccountException emptyAccountException) {
        this.a = btf.b(new yg6(1, emptyAccountException));
    }

    @Override // defpackage.pj6
    public final arf b() {
        return this.a;
    }
}
