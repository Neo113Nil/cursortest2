package com.onesignal.notifications.internal.listeners;

import com.gamericefishpro.space.bg.d;
import com.gamericefishpro.space.fc.g;
import com.gamericefishpro.space.fc.j;
import com.gamericefishpro.space.jh.f;
import com.gamericefishpro.space.mh.e;
import com.gamericefishpro.space.ve.n;
import com.gamericefishpro.space.ve.o;
import com.gamericefishpro.space.vh.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class DeviceRegistrationListener implements com.gamericefishpro.space.jd.b, g, o, com.gamericefishpro.space.jh.a {
    private final com.gamericefishpro.space.kf.a _channelManager;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final n _notificationsManager;
    private final com.gamericefishpro.space.bg.a _pushTokenManager;
    private final com.gamericefishpro.space.jh.b _subscriptionManager;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends i implements Function1 {
        int label;

        public a(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return DeviceRegistrationListener.this.new a(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((a) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                n nVar = DeviceRegistrationListener.this._notificationsManager;
                this.label = 1;
                if (nVar.requestPermission(true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends i implements Function1 {
        int label;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return DeviceRegistrationListener.this.new b(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.bg.a aVar2 = DeviceRegistrationListener.this._pushTokenManager;
                this.label = 1;
                obj = aVar2.retrievePushToken(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            d dVar = (d) obj;
            DeviceRegistrationListener.this._subscriptionManager.addOrUpdatePushSubscriptionToken(dVar.getToken(), DeviceRegistrationListener.this._notificationsManager.mo31getPermission() ? dVar.getStatus() : f.NO_PERMISSION);
            return Unit.a;
        }
    }

    public DeviceRegistrationListener(com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.kf.a _channelManager, com.gamericefishpro.space.bg.a _pushTokenManager, n _notificationsManager, com.gamericefishpro.space.jh.b _subscriptionManager) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_channelManager, "_channelManager");
        Intrinsics.checkNotNullParameter(_pushTokenManager, "_pushTokenManager");
        Intrinsics.checkNotNullParameter(_notificationsManager, "_notificationsManager");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        this._configModelStore = _configModelStore;
        this._channelManager = _channelManager;
        this._pushTokenManager = _pushTokenManager;
        this._notificationsManager = _notificationsManager;
        this._subscriptionManager = _subscriptionManager;
    }

    private final void retrievePushTokenAndUpdateSubscription() {
        this._subscriptionManager.getSubscriptions().getPush();
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new b(null), 1, null);
    }

    @Override // com.gamericefishpro.space.fc.g
    public void onModelUpdated(j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // com.gamericefishpro.space.ve.o
    public void onNotificationPermissionChange(boolean z) {
        retrievePushTokenAndUpdateSubscription();
    }

    @Override // com.gamericefishpro.space.jh.a
    public void onSubscriptionAdded(e subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // com.gamericefishpro.space.jh.a
    public void onSubscriptionChanged(e subscription, j args) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(args, "args");
        if (Intrinsics.a(args.getPath(), "optedIn") && Intrinsics.a(args.getNewValue(), Boolean.TRUE) && !this._notificationsManager.mo31getPermission()) {
            com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new a(null), 1, null);
        }
    }

    @Override // com.gamericefishpro.space.jh.a
    public void onSubscriptionRemoved(e subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        this._notificationsManager.mo28addPermissionObserver(this);
        this._subscriptionManager.subscribe(this);
    }

    @Override // com.gamericefishpro.space.fc.g
    public void onModelReplaced(com.gamericefishpro.space.rc.a model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "HYDRATE")) {
            this._channelManager.processChannelList(model.getNotificationChannels());
            retrievePushTokenAndUpdateSubscription();
        }
    }
}
