package app.cash.redwood.ui;

import android.content.res.Resources;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class DensityKt {
    public static final double Density(Resources resources) {
        resources.getClass();
        double d = resources.getDisplayMetrics().density;
        Density.m1399constructorimpl(d);
        return d;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewEarnerCustomerTagging.deepLinkSpecs;
    }
}
