package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class fb {
    public final eb a;

    public fb(Context context) {
        context.getClass();
        this.a = new eb(context);
    }

    public static final String c(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Offline user storage provider was given user ID longer than 997. Rejecting. User ID: ", str);
    }

    public final String a() {
        String readString = this.a.readString(DataStoreKey.LAST_USER_ID, "");
        String str = readString != null ? readString : "";
        if (StringUtils.getByteSize(str) <= 997) {
            return str;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str, 8), 6, (Object) null);
        String truncateToByteLength = StringUtils.truncateToByteLength(str, 997);
        b(truncateToByteLength);
        return truncateToByteLength;
    }

    public final void b(String str) {
        str.getClass();
        if (str.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(6), 6, (Object) null);
        } else if (StringUtils.getByteSize(str) > 997) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str, 9), 6, (Object) null);
        } else {
            this.a.writeData(DataStoreKey.LAST_USER_ID, str);
        }
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Stored user ID is longer than 997 bytes. Truncating. Original user ID: ", str);
    }

    public static final String b() {
        return "userId is empty in updateLastUserId. Rejecting.";
    }
}
