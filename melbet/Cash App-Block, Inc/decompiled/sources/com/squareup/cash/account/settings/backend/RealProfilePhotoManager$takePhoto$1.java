package com.squareup.cash.account.settings.backend;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.storage.RealStorage;
import com.squareup.util.android.Intents;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import okio.Path;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealProfilePhotoManager$takePhoto$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ RealProfilePhotoManager this$0;

    /* renamed from: com.squareup.cash.account.settings.backend.RealProfilePhotoManager$takePhoto$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ RealProfilePhotoManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(RealProfilePhotoManager realProfilePhotoManager, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = realProfilePhotoManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            RealProfilePhotoManager realProfilePhotoManager = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(realProfilePhotoManager, continuation, 0);
                default:
                    return new AnonymousClass1(realProfilePhotoManager, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            RealProfilePhotoManager realProfilePhotoManager = this.this$0;
            Continuation continuation = null;
            int i2 = 1;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        AndroidPermissionManager$create$1 androidPermissionManager$create$1 = realProfilePhotoManager.cameraPermissions;
                        this.label = 1;
                        obj = androidPermissionManager$create$1.shouldShowOverridePrompt(this);
                        if (obj == coroutineSingletons) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        realProfilePhotoManager.accountOutboundNavigator.goToError(realProfilePhotoManager.stringManager.get(R.string.profile_denial_description_camera));
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$1 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new RealLocalInstalledStore$hideBrands$$inlined$map$1(realProfilePhotoManager.cameraPermissions.$readonly.granted(), 28), 5);
                        RealProfilePhotoManager$takePhoto$1 realProfilePhotoManager$takePhoto$1 = new RealProfilePhotoManager$takePhoto$1(realProfilePhotoManager, continuation, i2);
                        this.label = 1;
                        if (FlowKt.collectLatest(dataStoreImpl$data$1$invokeSuspend$$inlined$map$1, realProfilePhotoManager$takePhoto$1, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealProfilePhotoManager$takePhoto$1(RealProfilePhotoManager realProfilePhotoManager, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realProfilePhotoManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealProfilePhotoManager realProfilePhotoManager = this.this$0;
        switch (i) {
            case 0:
                RealProfilePhotoManager$takePhoto$1 realProfilePhotoManager$takePhoto$1 = new RealProfilePhotoManager$takePhoto$1(realProfilePhotoManager, continuation, 0);
                realProfilePhotoManager$takePhoto$1.L$0 = obj;
                return realProfilePhotoManager$takePhoto$1;
            default:
                RealProfilePhotoManager$takePhoto$1 realProfilePhotoManager$takePhoto$12 = new RealProfilePhotoManager$takePhoto$1(realProfilePhotoManager, continuation, 1);
                realProfilePhotoManager$takePhoto$12.L$0 = obj;
                return realProfilePhotoManager$takePhoto$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RealProfilePhotoManager$takePhoto$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RealProfilePhotoManager$takePhoto$1) create((Path) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 0;
        int i3 = 1;
        RealProfilePhotoManager realProfilePhotoManager = this.this$0;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Continuation continuation = null;
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(realProfilePhotoManager, continuation, i2), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(realProfilePhotoManager, continuation, i3), 3);
                break;
            default:
                Path path = (Path) obj2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                realProfilePhotoManager.tempPath = path;
                Uri contentUriForFileUri = realProfilePhotoManager.fileProvider.contentUriForFileUri(((RealStorage) realProfilePhotoManager.storage).getFileUri(path, RealProfilePhotoManager$takePhoto$1$2$3$contentUri$1.INSTANCE));
                RealAccountOutboundNavigator realAccountOutboundNavigator = realProfilePhotoManager.accountOutboundNavigator;
                realAccountOutboundNavigator.getClass();
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", contentUriForFileUri);
                intent.addFlags(1);
                intent.addFlags(2);
                Intents.maybeStartActivityForResult((Activity) realAccountOutboundNavigator.activity, intent, 0);
                break;
        }
        return Unit.INSTANCE;
    }
}
