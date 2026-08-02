package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class os6 {
    public static zq6 a(String str, String str2) {
        return Intrinsics.d(str, "CREATE_CANCELED") ? new xq6(str2) : Intrinsics.d(str, "CREATE_INTERRUPTED") ? new yq6(str2, 1) : new yq6(str2, 4);
    }

    public static void b(ResultReceiver resultReceiver, String str, String str2) {
        resultReceiver.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
    }
}
