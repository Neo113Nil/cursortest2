package kotlin.text;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class CatchingFishCustomViewGson extends ContentObserver {
    public final /* synthetic */ CatchingFishPicassoCameraX CatchingFishParcelableFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishCustomViewGson(CatchingFishPicassoCameraX catchingFishPicassoCameraX, Handler handler) {
        super(handler);
        this.CatchingFishParcelableFAB = catchingFishPicassoCameraX;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.CatchingFishParcelableFAB.CatchingFish(CatchingFishRealmContext.CatchingFishParcelableFAB);
    }
}
