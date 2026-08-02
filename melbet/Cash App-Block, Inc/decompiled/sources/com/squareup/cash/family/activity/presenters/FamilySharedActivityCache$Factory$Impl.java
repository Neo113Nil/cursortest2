package com.squareup.cash.family.activity.presenters;

import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.appmessages.views.InlineAppMessageView;

/* loaded from: classes.dex */
public final class FamilySharedActivityCache$Factory$Impl {
    public final InlineAppMessageView.MetroFactory delegateFactory;

    public FamilySharedActivityCache$Factory$Impl(InlineAppMessageView.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final FamilySharedActivityCache create(ActivitiesManager.ActivityContext activityContext) {
        FamilyActivitiesStorage familyActivitiesStorage = (FamilyActivitiesStorage) this.delegateFactory.staticImageLoader.invoke();
        familyActivitiesStorage.getClass();
        return new FamilySharedActivityCache(activityContext, familyActivitiesStorage);
    }
}
