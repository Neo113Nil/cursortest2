package androidx.core.view;

import android.view.ViewConfiguration;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class ViewConfigurationCompat {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewSquareOfferSheet.deepLinkSpecs;
    }

    public static void getScaledHorizontalScrollFactor(ViewConfiguration viewConfiguration) {
        viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static void getScaledVerticalScrollFactor(ViewConfiguration viewConfiguration) {
        viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static final ActivitiesManager.ActivityContext savingsActivityContext(ActivityScope activityScope, ActivityTokenType activityTokenType, String str, String str2) {
        activityTokenType.getClass();
        activityScope.getClass();
        return new ActivitiesManager.ActivityContext(new ActivityToken(activityTokenType, str, str2, 8), activityScope, (ActivitiesManager.ActivityPageHandler) null, 12);
    }

    public static /* synthetic */ ActivitiesManager.ActivityContext savingsActivityContext$default(String str, ActivityTokenType activityTokenType, String str2, ActivityScope activityScope, int i) {
        if ((i & 2) != 0) {
            activityTokenType = ActivityTokenType.CUSTOMER_TOKEN_SAVINGS_ACCOUNT;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            activityScope = ActivityScope.MY_ACTIVITY;
        }
        return savingsActivityContext(activityScope, activityTokenType, str, str2);
    }
}
