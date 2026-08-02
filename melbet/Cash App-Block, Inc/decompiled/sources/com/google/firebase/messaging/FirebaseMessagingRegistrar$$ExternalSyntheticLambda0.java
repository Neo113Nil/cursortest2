package com.google.firebase.messaging;

import android.content.Context;
import app.cash.trifle.Trifle;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class FirebaseMessagingRegistrar$$ExternalSyntheticLambda0 implements ComponentFactory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Qualified f$0;

    public /* synthetic */ FirebaseMessagingRegistrar$$ExternalSyntheticLambda0(Qualified qualified, int i) {
        this.$r8$classId = i;
        this.f$0 = qualified;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(zzlj zzljVar) {
        FirebaseMessaging lambda$getComponents$0;
        int i = this.$r8$classId;
        Qualified qualified = this.f$0;
        switch (i) {
            case 0:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(qualified, zzljVar);
                return lambda$getComponents$0;
            default:
                return new DefaultHeartBeatController((Context) zzljVar.get(Context.class), ((FirebaseApp) zzljVar.get(FirebaseApp.class)).getPersistenceKey(), zzljVar.setOf(Qualified.unqualified(Trifle.class)), zzljVar.getProvider(DefaultUserAgentPublisher.class), (Executor) zzljVar.get(qualified));
        }
    }
}
