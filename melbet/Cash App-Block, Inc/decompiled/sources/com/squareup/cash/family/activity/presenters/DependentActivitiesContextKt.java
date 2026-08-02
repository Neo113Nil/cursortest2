package com.squareup.cash.family.activity.presenters;

import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.DefaultSearchPageRequestHandler;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityDisplayCategory;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchFilter;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.activity.api.v1.DisplayCategorySearchFilter;
import okio.ByteString;

/* loaded from: classes6.dex */
public abstract class DependentActivitiesContextKt {
    public static ActivitiesManager.ActivityContext dependentActivitiesContext$default(String str, ActivityClientService activityClientService, ActivityDisplayCategory activityDisplayCategory) {
        ActivityScope activityScope = ActivityScope.SPONSORED_ACCOUNT;
        str.getClass();
        activityDisplayCategory.getClass();
        activityScope.getClass();
        ActivityTokenType activityTokenType = ActivityTokenType.CUSTOMER_TOKEN;
        return new ActivitiesManager.ActivityContext(new ActivityToken(activityTokenType, str, (String) null, 12), activityScope, new DefaultSearchPageRequestHandler(activityClientService, new ActivitySearchFilter[]{new ActivitySearchFilter(new ActivitySearchFilter.SearchFilter.DisplayCategory(new DisplayCategorySearchFilter(activityDisplayCategory, ByteString.EMPTY)))}), 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ActivitiesManager.ActivityContext dependentActivitiesContext$default(String str, ActivityScope activityScope, int i) {
        if ((i & 4) != 0) {
            activityScope = ActivityScope.SPONSORED_ACCOUNT;
        }
        str.getClass();
        activityScope.getClass();
        String str2 = null;
        return new ActivitiesManager.ActivityContext(new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, str, str2, 12), activityScope, (ActivitiesManager.ActivityPageHandler) (0 == true ? 1 : 0), 8);
    }
}
