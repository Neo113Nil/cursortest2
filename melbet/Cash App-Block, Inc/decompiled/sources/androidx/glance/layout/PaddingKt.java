package androidx.glance.layout;

import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.backend.MarkMarketingMessageAsViewed$MetroFactory;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PaddingKt {
    public static final float access$toDp(List list, Resources resources) {
        Iterator it = list.iterator();
        float f = RecyclerView.DECELERATION_RATE;
        while (it.hasNext()) {
            f += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return f;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.VerifyEmail.deepLinkSpecs;
    }

    public static MaterialButton$$ExternalSyntheticLambda3 provideSupportSearchServiceFactory$jvm(MarkMarketingMessageAsViewed$MetroFactory markMarketingMessageAsViewed$MetroFactory) {
        return new MaterialButton$$ExternalSyntheticLambda3(markMarketingMessageAsViewed$MetroFactory, 23);
    }
}
