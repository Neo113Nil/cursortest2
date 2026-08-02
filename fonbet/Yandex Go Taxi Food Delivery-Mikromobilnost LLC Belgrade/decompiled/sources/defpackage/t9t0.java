package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;

/* loaded from: classes5.dex */
public final class t9t0 extends vfx {
    public static final t9t0 a = new t9t0();
    public static final asq0 b = d6z.g("ru.yandex.taxi.common_models.media.Source", new SerialDescriptor[0]);

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        b t = ncxVar.t();
        if (!(t instanceof d)) {
            return null;
        }
        d dVar = (d) t;
        if (!dVar.b()) {
            return null;
        }
        String a2 = dVar.a();
        try {
            Uri parse = Uri.parse(a2);
            String host = parse.getHost();
            if (host != null && !evu0.J(host)) {
                if (!jl40.l(parse.getScheme(), "http") && !jl40.l(parse.getScheme(), Constants.SCHEME)) {
                    return jl40.l(parse.getScheme(), "tag") ? new u9t0(a2, host) : jl40.l(parse.getScheme(), "file") ? new s9t0(a2, host) : new v9t0(a2);
                }
                return new w9t0(a2);
            }
            return new v9t0(a2);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        x9t0 x9t0Var = (x9t0) obj;
        if (x9t0Var == null) {
            vcxVar.y();
        } else {
            vcxVar.t(x9t0Var.getUri());
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
