package com.squareup.cash.permissions;

import androidx.core.app.ActivityCompat;
import com.squareup.util.coroutines.ThrottleFirstKt$throttleFirst$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class AndroidPermissionManager$create$1 implements ModifiablePermissions {
    public final /* synthetic */ String $permission;
    public final /* synthetic */ ReadOnlyPermissions $readonly;
    public final /* synthetic */ AndroidPermissionManager this$0;

    public AndroidPermissionManager$create$1(ReadOnlyPermissions readOnlyPermissions, AndroidPermissionManager androidPermissionManager, String str) {
        this.$readonly = readOnlyPermissions;
        this.this$0 = androidPermissionManager;
        this.$permission = str;
    }

    @Override // com.squareup.cash.permissions.ReadOnlyPermissions
    public final boolean check() {
        return this.$readonly.check();
    }

    @Override // com.squareup.cash.permissions.ReadOnlyPermissions
    public final Flow denied() {
        return this.$readonly.denied();
    }

    @Override // com.squareup.cash.permissions.ReadOnlyPermissions
    public final Flow granted() {
        return this.$readonly.granted();
    }

    @Override // com.squareup.cash.permissions.ModifiablePermissions
    public final void request() {
        ActivityCompat.requestPermissions(this.this$0.activity, new String[]{this.$permission}, 2);
    }

    @Override // com.squareup.cash.permissions.ModifiablePermissions
    public final Object shouldShowOverridePrompt(ContinuationImpl continuationImpl) {
        request();
        final AndroidPermissionManager androidPermissionManager = this.this$0;
        final long millis = androidPermissionManager.clock.millis();
        final Flow denied = this.$readonly.denied();
        final String str = this.$permission;
        return FlowKt.first(new Flow() { // from class: com.squareup.cash.permissions.AndroidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new ThrottleFirstKt$throttleFirst$1$1(flowCollector, androidPermissionManager, str, millis), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
            }
        }, continuationImpl);
    }

    @Override // com.squareup.cash.permissions.ModifiablePermissions
    public final Object shouldShowRequestPermissionRationale(ContinuationImpl continuationImpl) {
        return Boolean.valueOf(ActivityCompat.shouldShowRequestPermissionRationale(this.this$0.activity, this.$permission));
    }
}
