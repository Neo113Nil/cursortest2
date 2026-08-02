package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qd {
    public final Context a;
    public final String b;
    public final String c;
    public final com.braze.storage.n d;

    public qd(Context context, String str, String str2) {
        context.getClass();
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = new com.braze.storage.n(context, str, str2);
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Setting signature to: ", str);
    }

    public final void b(String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str, 15), 6, (Object) null);
        com.braze.storage.n nVar = this.d;
        DataStoreKey dataStoreKey = DataStoreKey.SDK_AUTH;
        if (str == null) {
            str = "";
        }
        nVar.writeData(dataStoreKey, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd)) {
            return false;
        }
        qd qdVar = (qd) obj;
        return Intrinsics.areEqual(this.a, qdVar.a) && Intrinsics.areEqual(this.b, qdVar.b) && Intrinsics.areEqual(this.c, qdVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Context context = this.a;
        String str = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder("SdkAuthenticationCache(context=");
        sb.append(context);
        sb.append(", userId=");
        sb.append(str);
        sb.append(", apiKey=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str2, ")");
    }
}
