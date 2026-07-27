package kotlin.text;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLAndroidX implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            throw CatchingFishMVPLiveData.CatchingFishLayout(message.obj);
        }
        if (i != 1) {
            return false;
        }
        throw CatchingFishMVPLiveData.CatchingFishLayout(message.obj);
    }
}
