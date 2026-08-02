package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.widgets.common.banners.CloseBannerButtonView;
import com.ybsdk.widgets.common.notifications.NotificationMediumView;

/* loaded from: classes4.dex */
public final class s361 implements zo31 {
    public final NotificationMediumView a;
    public final CloseBannerButtonView b;
    public final ImageView c;

    public s361(NotificationMediumView notificationMediumView, CloseBannerButtonView closeBannerButtonView, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2) {
        this.a = notificationMediumView;
        this.b = closeBannerButtonView;
        this.c = imageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
