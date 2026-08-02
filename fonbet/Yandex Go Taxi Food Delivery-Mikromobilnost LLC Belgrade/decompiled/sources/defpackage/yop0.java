package defpackage;

import android.content.SharedPreferences;
import com.ybsdk.feature.persistence.api.StorageType;

/* loaded from: classes8.dex */
public final class yop0 {
    public final SharedPreferences a;
    public final SharedPreferences b;

    public yop0(a1b0 a1b0Var) {
        c1b0 c1b0Var = (c1b0) a1b0Var;
        this.a = c1b0Var.a(StorageType.PIN);
        this.b = c1b0Var.a(StorageType.PIN_STATE_FLAGS);
    }
}
