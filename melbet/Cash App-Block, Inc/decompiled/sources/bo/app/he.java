package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class he {
    public final ge a;

    public he(Context context) {
        context.getClass();
        this.a = new ge(context);
    }

    public final boolean a() {
        return Intrinsics.areEqual(this.a.readBoolean(DataStoreKey.SDK_ENABLEMENT, Boolean.FALSE), Boolean.TRUE);
    }
}
