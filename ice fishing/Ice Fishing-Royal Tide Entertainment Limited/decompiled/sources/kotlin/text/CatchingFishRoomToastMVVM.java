package kotlin.text;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class CatchingFishRoomToastMVVM {
    public static String[] CatchingFishParcelableFAB(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static CatchingFishMVIOkHttp CatchingFishSnackbar(View view, CatchingFishMVIOkHttp catchingFishMVIOkHttp) {
        ContentInfo CatchingFishCloudMessaging = catchingFishMVIOkHttp.CatchingFishParcelableFAB.CatchingFishCloudMessaging();
        Objects.requireNonNull(CatchingFishCloudMessaging);
        ContentInfo performReceiveContent = view.performReceiveContent(CatchingFishCloudMessaging);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == CatchingFishCloudMessaging ? catchingFishMVIOkHttp : new CatchingFishMVIOkHttp(new CatchingFishServiceHilt(performReceiveContent));
    }
}
