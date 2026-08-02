package defpackage;

import io.grpc.internal.a;
import java.util.Map;

/* loaded from: classes5.dex */
public final class csk extends deg {
    public static final boolean a;

    static {
        a = !ywf.G(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // defpackage.deg
    public final String a() {
        return "pick_first";
    }

    @Override // defpackage.deg
    public final ceg b(wdg wdgVar) {
        return a ? new a(wdgVar) : new bsk(wdgVar);
    }

    @Override // defpackage.deg
    public final lwi c(Map map) {
        try {
            return new lwi(new zrk(qwp.N("shuffleAddressList", map)));
        } catch (RuntimeException e) {
            return new lwi(sgr.o.h(e).i("Failed parsing configuration for pick_first"));
        }
    }
}
