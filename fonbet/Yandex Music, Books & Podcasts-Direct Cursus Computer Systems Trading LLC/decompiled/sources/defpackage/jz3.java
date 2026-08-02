package defpackage;

import android.app.Activity;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class jz3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ jz3(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Activity activity = this.b;
                if (activity instanceof np2) {
                    return (np2) activity;
                }
                dfi.r("CarouselArtistsBlockActionsOnlineImpl has to be attached to BaseActivity in order to use shared tabs", "CarouselArtistsBlockActionsOnlineImpl");
                return null;
            case 1:
                Activity activity2 = this.b;
                if (activity2 instanceof np2) {
                    return (np2) activity2;
                }
                dfi.r("DownloadedSectionsBlockActionsImpl has to be attached to BaseActivity in order to use shared tabs", "DownloadedSectionsBlockActionsImpl");
                return null;
            default:
                Intent intent = new Intent("ru.yandex.music.VPN_CHALLENGE_OFFLINE_MODE");
                Activity activity3 = this.b;
                activity3.sendBroadcast(intent.setPackage(activity3.getPackageName()));
                return Unit.a;
        }
    }
}
