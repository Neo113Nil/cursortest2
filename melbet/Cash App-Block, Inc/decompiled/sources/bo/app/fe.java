package bo.app;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fe {
    public final ArrayList a;

    public fe(ArrayList arrayList) {
        arrayList.getClass();
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe) && Intrinsics.areEqual(this.a, ((fe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("SdkDebuggerSendLogEvent(logs=", ")", this.a);
    }
}
