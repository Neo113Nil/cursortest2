package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class hsa implements oqb {
    public final Throwable a;

    public hsa(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.oqb
    public final Map b(byte[] bArr) {
        bArr.getClass();
        throw o();
    }

    @Override // defpackage.oqb
    public final nqb c() {
        throw o();
    }

    @Override // defpackage.oqb
    public final byte[] d() {
        throw o();
    }

    @Override // defpackage.oqb
    public final void e(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        throw o();
    }

    @Override // defpackage.oqb
    public final void f(byte[] bArr) {
        bArr.getClass();
        throw o();
    }

    @Override // defpackage.oqb
    public final int h() {
        return 1;
    }

    @Override // defpackage.oqb
    public final vvc j(byte[] bArr) {
        bArr.getClass();
        throw new IllegalStateException();
    }

    @Override // defpackage.oqb
    public final void k(byte[] bArr) {
        bArr.getClass();
    }

    @Override // defpackage.oqb
    public final byte[] l(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        throw o();
    }

    @Override // defpackage.oqb
    public final lqb m(byte[] bArr, List list, int i, HashMap hashMap) {
        bArr.getClass();
        throw o();
    }

    @Override // defpackage.oqb
    public final boolean n(String str, byte[] bArr) {
        bArr.getClass();
        str.getClass();
        throw new IllegalStateException();
    }

    public final PlaybackException.DrmThrowable o() {
        Throwable th = this.a;
        return th instanceof kmt ? ((kmt) th).a == 1 ? new PlaybackException.DrmThrowable.ErrorDrmUnsupportedScheme(th) : new PlaybackException.DrmThrowable.ErrorDrmNotSupported(th) : new PlaybackException.DrmThrowable.ErrorDrmUnknown(th);
    }

    @Override // defpackage.oqb
    public final void a() {
    }

    @Override // defpackage.oqb
    public final void g(znk znkVar) {
    }
}
