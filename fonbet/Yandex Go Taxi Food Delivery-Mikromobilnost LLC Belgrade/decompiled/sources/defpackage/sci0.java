package defpackage;

import coil3.disk.a;
import kotlin.coroutines.EmptyCoroutineContext;
import okio.ByteString;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes.dex */
public final class sci0 {
    public final r1r a;
    public final a b;

    public sci0(long j, oq90 oq90Var, r1r r1rVar, EmptyCoroutineContext emptyCoroutineContext) {
        this.a = r1rVar;
        this.b = new a(r1rVar, oq90Var, emptyCoroutineContext, j);
    }

    public final qci0 a(String str) {
        ByteString byteString = new ByteString(str.getBytes(uza.a));
        byteString.b = str;
        txj d = this.b.d(byteString.f(JCP.DIGEST_SHA_256).i());
        if (d != null) {
            return new qci0(d);
        }
        return null;
    }
}
