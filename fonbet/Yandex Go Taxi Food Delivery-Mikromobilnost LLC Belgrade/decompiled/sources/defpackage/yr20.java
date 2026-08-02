package defpackage;

import androidx.datastore.core.CorruptionException;
import java.io.FileInputStream;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.SerializationException;

/* loaded from: classes8.dex */
public final class yr20 implements btq0 {
    public static final yr20 a = new yr20();
    public static final xr20 b = new xr20(null, null, null, null, null, null, null, null, null, null, null, null, null, 65535);

    @Override // defpackage.btq0
    public final Object a() {
        return b;
    }

    @Override // defpackage.btq0
    public final Object b(FileInputStream fileInputStream, Continuation continuation) {
        try {
            zcx zcxVar = qr20.a;
            String q = cvu0.q(rzo.R(fileInputStream));
            zcxVar.getClass();
            return (xr20) zcxVar.b(xr20.Companion.serializer(), q);
        } catch (SerializationException e) {
            throw new CorruptionException("Unable to read MobStorageData", e);
        }
    }

    @Override // defpackage.btq0
    public final Object c(Object obj, mx11 mx11Var, Continuation continuation) {
        xr20 xr20Var = (xr20) obj;
        try {
            zcx zcxVar = qr20.a;
            zcxVar.getClass();
            mx11Var.write(zcxVar.c(xr20Var, xr20.Companion.serializer()).getBytes(uza.a));
            return zy11.a;
        } catch (SerializationException e) {
            throw new CorruptionException("Unable to write MobStorageData", e);
        }
    }
}
