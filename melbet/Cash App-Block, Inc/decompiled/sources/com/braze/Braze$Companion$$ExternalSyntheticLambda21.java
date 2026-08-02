package com.braze;

import android.net.Uri;
import com.braze.Braze;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.common.base.Splitter;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.TopicsSubscriber;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.JsonIOException;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$Companion$$ExternalSyntheticLambda21 implements IBrazeEndpointProvider, Splitter.Strategy, SuccessContinuation, ObjectConstructor, com.nimbusds.jose.shaded.gson.internal.ObjectConstructor {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ Braze$Companion$$ExternalSyntheticLambda21(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // com.google.gson.internal.ObjectConstructor, com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$newUnsafeAllocator$20;
        Object lambda$newDefaultConstructor$7;
        Object lambda$newDefaultConstructor$8;
        Object lambda$get$2;
        Object lambda$get$3;
        Object lambda$get$4;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 4:
                lambda$newUnsafeAllocator$20 = ConstructorConstructor.lambda$newUnsafeAllocator$20(str);
                return lambda$newUnsafeAllocator$20;
            case 5:
                lambda$newDefaultConstructor$7 = ConstructorConstructor.lambda$newDefaultConstructor$7(str);
                return lambda$newDefaultConstructor$7;
            case 6:
                lambda$newDefaultConstructor$8 = ConstructorConstructor.lambda$newDefaultConstructor$8(str);
                return lambda$newDefaultConstructor$8;
            case 7:
                lambda$get$2 = ConstructorConstructor.lambda$get$2(str);
                return lambda$get$2;
            case 8:
                lambda$get$3 = ConstructorConstructor.lambda$get$3(str);
                return lambda$get$3;
            case 9:
                lambda$get$4 = ConstructorConstructor.lambda$get$4(str);
                return lambda$get$4;
            case 10:
                throw new JsonIOException(str);
            case 11:
                throw new JsonIOException(str);
            case 12:
                throw new JsonIOException(str);
            default:
                throw new JsonIOException(str);
        }
    }

    public Uri getApiEndpoint(Uri uri) {
        Uri configuredCustomEndpoint$lambda$0$0;
        configuredCustomEndpoint$lambda$0$0 = Braze.Companion.setConfiguredCustomEndpoint$lambda$0$0(this.f$0, uri);
        return configuredCustomEndpoint$lambda$0$0;
    }

    @Override // com.google.common.base.Splitter.Strategy
    public Iterator iterator(Splitter splitter, CharSequence charSequence) {
        return new Splitter.AnonymousClass1(splitter, charSequence, this.f$0, 1);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Task lambda$subscribeToTopic$10;
        Task lambda$unsubscribeFromTopic$11;
        int i = this.$r8$classId;
        String str = this.f$0;
        TopicsSubscriber topicsSubscriber = (TopicsSubscriber) obj;
        switch (i) {
            case 2:
                lambda$subscribeToTopic$10 = FirebaseMessaging.lambda$subscribeToTopic$10(str, topicsSubscriber);
                return lambda$subscribeToTopic$10;
            default:
                lambda$unsubscribeFromTopic$11 = FirebaseMessaging.lambda$unsubscribeFromTopic$11(str, topicsSubscriber);
                return lambda$unsubscribeFromTopic$11;
        }
    }
}
