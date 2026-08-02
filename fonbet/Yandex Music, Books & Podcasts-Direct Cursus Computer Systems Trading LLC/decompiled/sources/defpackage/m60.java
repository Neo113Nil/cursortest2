package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;

/* loaded from: classes4.dex */
public final class m60 extends o3o {
    public final MusicBackendInvocationError b;
    public final o3o c;

    public m60(MusicBackendInvocationError musicBackendInvocationError, o3o o3oVar) {
        o3oVar.getClass();
        this.b = musicBackendInvocationError;
        this.c = o3oVar;
    }

    @Override // defpackage.o3o
    public final long g() {
        return this.c.g();
    }

    @Override // defpackage.o3o
    public final twh o() {
        return this.c.o();
    }

    @Override // defpackage.o3o
    public final ij3 z() {
        su4.s(2, null, "Illegal trying read from AlreadyConsumedResponseBody", null);
        return this.c.z();
    }
}
