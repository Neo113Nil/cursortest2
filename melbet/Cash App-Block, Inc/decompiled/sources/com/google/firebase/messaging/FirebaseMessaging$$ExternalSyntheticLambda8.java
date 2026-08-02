package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.Store;

/* loaded from: classes4.dex */
public final /* synthetic */ class FirebaseMessaging$$ExternalSyntheticLambda8 implements SuccessContinuation {
    public final /* synthetic */ FirebaseMessaging f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Store.Token f$2;

    public /* synthetic */ FirebaseMessaging$$ExternalSyntheticLambda8(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.f$0 = firebaseMessaging;
        this.f$1 = str;
        this.f$2 = token;
    }

    public Task start() {
        Task lambda$blockingGetToken$14;
        lambda$blockingGetToken$14 = this.f$0.lambda$blockingGetToken$14(this.f$1, this.f$2);
        return lambda$blockingGetToken$14;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Task lambda$blockingGetToken$13;
        lambda$blockingGetToken$13 = this.f$0.lambda$blockingGetToken$13(this.f$1, this.f$2, (String) obj);
        return lambda$blockingGetToken$13;
    }
}
