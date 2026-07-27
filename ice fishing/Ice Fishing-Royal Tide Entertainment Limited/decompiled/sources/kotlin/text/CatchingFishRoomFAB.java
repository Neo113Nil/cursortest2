package kotlin.text;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class CatchingFishRoomFAB extends CatchingFishPayPalRedux {
    public final Context CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishAdMobAdMob CatchingFishSnackbar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishRoomFAB(CatchingFishAdMobAdMob catchingFishAdMobAdMob, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.CatchingFishSnackbar = catchingFishAdMobAdMob;
        this.CatchingFishParcelableFAB = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            new StringBuilder(String.valueOf(i).length() + 39);
            return;
        }
        int i2 = CatchingFishFABKtor.CatchingFishParcelableFAB;
        CatchingFishAdMobAdMob catchingFishAdMobAdMob = this.CatchingFishSnackbar;
        Context context = this.CatchingFishParcelableFAB;
        int CatchingFishSnackbar = catchingFishAdMobAdMob.CatchingFishSnackbar(context, i2);
        AtomicBoolean atomicBoolean = CatchingFishFluxParcelable.CatchingFishParcelableFAB;
        if (CatchingFishSnackbar == 1 || CatchingFishSnackbar == 2 || CatchingFishSnackbar == 3 || CatchingFishSnackbar == 9) {
            Intent CatchingFishParcelableFAB = catchingFishAdMobAdMob.CatchingFishParcelableFAB(CatchingFishSnackbar, context, "n");
            catchingFishAdMobAdMob.CatchingFishWorkManager(context, CatchingFishSnackbar, CatchingFishParcelableFAB == null ? null : PendingIntent.getActivity(context, 0, CatchingFishParcelableFAB, 201326592));
        }
    }
}
