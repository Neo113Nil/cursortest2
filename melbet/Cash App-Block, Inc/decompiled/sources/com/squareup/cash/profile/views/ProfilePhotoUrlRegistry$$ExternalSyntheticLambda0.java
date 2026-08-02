package com.squareup.cash.profile.views;

import com.squareup.cash.notification.photo.NotificationPhotoLookupKeyProvider;
import com.squareup.cash.notification.photo.NotificationPhotoLookupKeyRegistry;
import com.squareup.util.coroutines.SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import kotlinx.coroutines.CoroutineScope;
import papa.InteractionRuleClient$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final /* synthetic */ class ProfilePhotoUrlRegistry$$ExternalSyntheticLambda0 implements UiSetupTeardown {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ProfilePhotoUrlRegistry$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ProfilePhotoUrlRegistry profilePhotoUrlRegistry = (ProfilePhotoUrlRegistry) obj2;
                ProfilePhotoUrlProvider profilePhotoUrlProvider = (ProfilePhotoUrlProvider) obj;
                coroutineScope.getClass();
                profilePhotoUrlRegistry.activeProviders.add(profilePhotoUrlProvider);
                return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new InteractionRuleClient$$ExternalSyntheticLambda0(9, profilePhotoUrlRegistry, profilePhotoUrlProvider));
            default:
                NotificationPhotoLookupKeyRegistry notificationPhotoLookupKeyRegistry = (NotificationPhotoLookupKeyRegistry) obj2;
                NotificationPhotoLookupKeyProvider notificationPhotoLookupKeyProvider = (NotificationPhotoLookupKeyProvider) obj;
                coroutineScope.getClass();
                notificationPhotoLookupKeyRegistry.activeProviders.add(notificationPhotoLookupKeyProvider);
                return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new InteractionRuleClient$$ExternalSyntheticLambda0(8, notificationPhotoLookupKeyRegistry, notificationPhotoLookupKeyProvider));
        }
    }
}
