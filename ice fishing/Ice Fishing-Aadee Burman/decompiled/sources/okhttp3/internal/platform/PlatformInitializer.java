package okhttp3.internal.platform;

import B0.b;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.h;
import s8.e;
import s8.f;
import v7.C5135p;

/* loaded from: classes2.dex */
public final class PlatformInitializer implements b {
    @Override // B0.b
    public final Object create(Context context) {
        h.e(context, "context");
        f fVar = f.f40497a;
        Object obj = f.f40497a;
        e eVar = obj instanceof e ? (e) obj : null;
        if (eVar != null) {
            eVar.a(context);
        }
        return f.f40497a;
    }

    @Override // B0.b
    public final List dependencies() {
        return C5135p.f41439n;
    }
}
