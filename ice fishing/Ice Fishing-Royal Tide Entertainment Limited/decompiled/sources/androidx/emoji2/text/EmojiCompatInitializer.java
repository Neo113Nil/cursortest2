package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.text.CatchingFishAndroidXMVI;
import kotlin.text.CatchingFishAsyncTaskDagger;
import kotlin.text.CatchingFishFluxDataStore;
import kotlin.text.CatchingFishMVPOkHttpMVP;
import kotlin.text.CatchingFishRoomRealmMVI;
import kotlin.text.CatchingFishToastFlux;
import kotlin.text.CatchingFishToolbarAdMob;
import kotlin.text.CatchingFishToolbarToast;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements CatchingFishToolbarAdMob {
    @Override // kotlin.text.CatchingFishToolbarAdMob
    public final List CatchingFishParcelableFAB() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // kotlin.text.CatchingFishToolbarAdMob
    public final Object CatchingFishSnackbar(Context context) {
        Object obj;
        CatchingFishRoomRealmMVI catchingFishRoomRealmMVI = new CatchingFishRoomRealmMVI(new CatchingFishFluxDataStore(context, 1));
        catchingFishRoomRealmMVI.CatchingFishParcelableFAB = 1;
        if (CatchingFishMVPOkHttpMVP.CatchingFishCloudMessaging == null) {
            synchronized (CatchingFishMVPOkHttpMVP.CatchingFishFragmentHandler) {
                try {
                    if (CatchingFishMVPOkHttpMVP.CatchingFishCloudMessaging == null) {
                        CatchingFishMVPOkHttpMVP.CatchingFishCloudMessaging = new CatchingFishMVPOkHttpMVP(catchingFishRoomRealmMVI);
                    }
                } finally {
                }
            }
        }
        CatchingFishAsyncTaskDagger CatchingFishSensorManager = CatchingFishAsyncTaskDagger.CatchingFishSensorManager(context);
        CatchingFishSensorManager.getClass();
        synchronized (CatchingFishAsyncTaskDagger.CatchingFishLayout) {
            try {
                obj = ((HashMap) CatchingFishSensorManager.CatchingFishDaggerWebsocket).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = CatchingFishSensorManager.CatchingFishCardViewRealm(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        CatchingFishToolbarToast CatchingFishDaggerWebsocket = ((CatchingFishToastFlux) obj).CatchingFishDaggerWebsocket();
        CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(new CatchingFishAndroidXMVI(this, CatchingFishDaggerWebsocket));
        return Boolean.TRUE;
    }
}
