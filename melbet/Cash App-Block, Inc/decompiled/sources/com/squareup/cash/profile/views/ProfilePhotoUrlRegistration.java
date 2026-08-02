package com.squareup.cash.profile.views;

import com.squareup.cash.notification.photo.NotificationPhotoLookupKeyProvider;
import com.squareup.cash.notification.photo.NotificationPhotoLookupKeyRegistry;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class ProfilePhotoUrlRegistration implements UiSetupTeardown {
    public final /* synthetic */ UiSetupTeardown $$delegate_0;
    public final /* synthetic */ int $r8$classId = 1;

    public ProfilePhotoUrlRegistration(NotificationPhotoLookupKeyRegistry notificationPhotoLookupKeyRegistry, NotificationPhotoLookupKeyProvider notificationPhotoLookupKeyProvider) {
        this.$$delegate_0 = new ProfilePhotoUrlRegistry$$ExternalSyntheticLambda0(1, notificationPhotoLookupKeyRegistry, notificationPhotoLookupKeyProvider);
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        int i = this.$r8$classId;
        UiSetupTeardown uiSetupTeardown = this.$$delegate_0;
        switch (i) {
            case 0:
                coroutineScope.getClass();
                break;
            default:
                coroutineScope.getClass();
                break;
        }
        return ((ProfilePhotoUrlRegistry$$ExternalSyntheticLambda0) uiSetupTeardown).setup(coroutineScope);
    }

    public ProfilePhotoUrlRegistration(ProfilePhotoUrlRegistry profilePhotoUrlRegistry, ProfilePhotoUrlProvider profilePhotoUrlProvider) {
        this.$$delegate_0 = new ProfilePhotoUrlRegistry$$ExternalSyntheticLambda0(0, profilePhotoUrlRegistry, profilePhotoUrlProvider);
    }
}
