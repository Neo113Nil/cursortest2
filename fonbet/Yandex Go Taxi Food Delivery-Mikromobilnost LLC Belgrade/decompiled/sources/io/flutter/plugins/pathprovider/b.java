package io.flutter.plugins.pathprovider;

import defpackage.ckn;
import defpackage.vzt0;
import io.flutter.plugins.pathprovider.Messages;
import java.nio.ByteBuffer;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class b extends vzt0 {
    public static final b d = new b();

    @Override // defpackage.vzt0
    public final Object f(byte b, ByteBuffer byteBuffer) {
        if (b != -127) {
            return super.f(b, byteBuffer);
        }
        Object e = e(byteBuffer);
        if (e == null) {
            return null;
        }
        return Messages.StorageDirectory.values()[((Long) e).intValue()];
    }

    @Override // defpackage.vzt0
    public final void k(ckn cknVar, Object obj) {
        if (!(obj instanceof Messages.StorageDirectory)) {
            super.k(cknVar, obj);
        } else {
            cknVar.write(HProv.PP_SECURITY_LEVEL);
            k(cknVar, Integer.valueOf(((Messages.StorageDirectory) obj).index));
        }
    }
}
