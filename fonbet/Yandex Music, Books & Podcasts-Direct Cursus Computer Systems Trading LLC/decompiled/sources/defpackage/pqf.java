package defpackage;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pqf implements hip {
    public static final pqf a = new pqf();
    public static final iqf b;

    static {
        iqf n = iqf.n();
        n.getClass();
        b = n;
    }

    @Override // defpackage.hip
    public final Object a() {
        return b;
    }

    @Override // defpackage.hip
    public final Object b(Object obj, OutputStream outputStream, Continuation continuation) {
        iqf iqfVar = (iqf) obj;
        iqfVar.getClass();
        int a2 = iqfVar.a(null);
        Logger logger = xr4.f;
        if (a2 > 4096) {
            a2 = 4096;
        }
        xr4 xr4Var = new xr4(outputStream, a2);
        iqfVar.getClass();
        zym zymVar = zym.c;
        zymVar.getClass();
        xto a3 = zymVar.a(iqfVar.getClass());
        jzi jziVar = xr4Var.a;
        if (jziVar == null) {
            jziVar = new jzi();
            Charset charset = vse.a;
            jziVar.a = xr4Var;
            xr4Var.a = jziVar;
        }
        a3.h(iqfVar, jziVar);
        if (xr4Var.d > 0) {
            xr4Var.k();
        }
        return Unit.a;
    }

    @Override // defpackage.hip
    public final Object c(FileInputStream fileInputStream, Continuation continuation) {
        try {
            return iqf.q(fileInputStream);
        } catch (cye e) {
            throw new wm6("Cannot read proto.", e);
        }
    }
}
