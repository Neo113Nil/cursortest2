package l6;

import android.os.Bundle;
import android.util.Log;
import g7.o;
import java.io.IOException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements g7.a, g7.g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b f4174g = new b();

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b f4175h = new b();

    @Override // g7.a
    public Object b(o oVar) {
        if (oVar.i()) {
            return (Bundle) oVar.g();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(oVar.f())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", oVar.f());
    }

    @Override // g7.g
    public o c(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i10 = a.f4164h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? i7.b.u(bundle) : i7.b.u(null);
    }
}
