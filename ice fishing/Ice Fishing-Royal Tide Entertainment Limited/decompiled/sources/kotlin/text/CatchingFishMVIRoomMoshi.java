package kotlin.text;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class CatchingFishMVIRoomMoshi {
    public static CatchingFishMVIRoomMoshi CatchingFishReduxKtor;
    public final CatchingFishMoshiGson CatchingFishParcelableFAB;
    public static final long CatchingFishSnackbar = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern CatchingFishCoroutine = Pattern.compile("\\AA[\\w-]{38}\\z");

    public CatchingFishMVIRoomMoshi(CatchingFishMoshiGson catchingFishMoshiGson) {
        this.CatchingFishParcelableFAB = catchingFishMoshiGson;
    }

    public final boolean CatchingFishParcelableFAB(CatchingFishDaggerDataStore catchingFishDaggerDataStore) {
        if (TextUtils.isEmpty(catchingFishDaggerDataStore.CatchingFishCoroutine)) {
            return true;
        }
        long j = catchingFishDaggerDataStore.CatchingFishWorkManager + catchingFishDaggerDataStore.CatchingFishDaggerWebsocket;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.CatchingFishParcelableFAB.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + CatchingFishSnackbar;
    }
}
