package okhttp3.internal.platform;

import android.content.Context;
import defpackage.d72;
import defpackage.dvc0;
import defpackage.xwv;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lxwv;", "Ldvc0;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlatformInitializer implements xwv {
    @Override // defpackage.xwv
    public final Object create(Context context) {
        d72 d72Var = dvc0.a;
        d72 d72Var2 = dvc0.a;
        if (d72Var2 == null) {
            d72Var2 = null;
        }
        if (d72Var2 != null) {
            d72Var2.setApplicationContext(context);
        }
        return dvc0.a;
    }

    @Override // defpackage.xwv
    public final List dependencies() {
        return EmptyList.a;
    }
}
