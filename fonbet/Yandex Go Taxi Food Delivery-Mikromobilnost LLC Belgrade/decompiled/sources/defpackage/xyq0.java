package defpackage;

import androidx.datastore.core.CorruptionException;
import java.io.FileInputStream;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xyq0 implements btq0 {
    public final pzq0 a;

    public xyq0(pzq0 pzq0Var) {
        this.a = pzq0Var;
    }

    @Override // defpackage.btq0
    public final Object a() {
        return new wyq0(this.a.a(null), null, null);
    }

    @Override // defpackage.btq0
    public final Object b(FileInputStream fileInputStream, Continuation continuation) {
        try {
            rbx rbxVar = sbx.d;
            String q = cvu0.q(rzo.R(fileInputStream));
            rbxVar.getClass();
            return (wyq0) rbxVar.b(wyq0.Companion.serializer(), q);
        } catch (Exception e) {
            throw new CorruptionException("Cannot parse session data", e);
        }
    }

    @Override // defpackage.btq0
    public final Object c(Object obj, mx11 mx11Var, Continuation continuation) {
        mx11Var.write(sbx.d.c((wyq0) obj, wyq0.Companion.serializer()).getBytes(uza.a));
        return zy11.a;
    }
}
