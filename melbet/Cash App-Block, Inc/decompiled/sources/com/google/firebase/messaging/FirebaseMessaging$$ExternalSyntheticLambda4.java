package com.google.firebase.messaging;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes4.dex */
public final /* synthetic */ class FirebaseMessaging$$ExternalSyntheticLambda4 implements OnSuccessListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FirebaseMessaging f$0;

    public /* synthetic */ FirebaseMessaging$$ExternalSyntheticLambda4(FirebaseMessaging firebaseMessaging, int i) {
        this.$r8$classId = i;
        this.f$0 = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i = this.$r8$classId;
        FirebaseMessaging firebaseMessaging = this.f$0;
        switch (i) {
            case 0:
                firebaseMessaging.lambda$setNotificationDelegationEnabled$6((Void) obj);
                break;
            default:
                firebaseMessaging.lambda$handleProxiedNotificationData$5((CloudMessage) obj);
                break;
        }
    }
}
