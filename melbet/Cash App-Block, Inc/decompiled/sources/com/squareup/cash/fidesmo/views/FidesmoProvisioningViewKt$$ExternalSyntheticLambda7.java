package com.squareup.cash.fidesmo.views;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.squareup.cash.fidesmo.views.haptic.ProvisioningHaptics;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class FidesmoProvisioningViewKt$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProvisioningHaptics f$0;

    public /* synthetic */ FidesmoProvisioningViewKt$$ExternalSyntheticLambda7(ProvisioningHaptics provisioningHaptics, int i) {
        this.$r8$classId = i;
        this.f$0 = provisioningHaptics;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj;
        switch (this.$r8$classId) {
            case 0:
                disposableEffectScope.getClass();
                final int i = 2;
                final ProvisioningHaptics provisioningHaptics = this.f$0;
                return new DisposableEffectResult() { // from class: com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt$ScanningContent$lambda$10$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i2 = i;
                        ProvisioningHaptics provisioningHaptics2 = provisioningHaptics;
                        switch (i2) {
                            case 0:
                                if (provisioningHaptics2 != null) {
                                    provisioningHaptics2.player.cancel();
                                    break;
                                }
                                break;
                            case 1:
                                if (provisioningHaptics2 != null) {
                                    provisioningHaptics2.player.cancel();
                                    break;
                                }
                                break;
                            default:
                                if (provisioningHaptics2 != null) {
                                    provisioningHaptics2.player.cancel();
                                    break;
                                }
                                break;
                        }
                    }
                };
            case 1:
                disposableEffectScope.getClass();
                final int i2 = 0;
                final ProvisioningHaptics provisioningHaptics2 = this.f$0;
                return new DisposableEffectResult() { // from class: com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt$ScanningContent$lambda$10$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i22 = i2;
                        ProvisioningHaptics provisioningHaptics22 = provisioningHaptics2;
                        switch (i22) {
                            case 0:
                                if (provisioningHaptics22 != null) {
                                    provisioningHaptics22.player.cancel();
                                    break;
                                }
                                break;
                            case 1:
                                if (provisioningHaptics22 != null) {
                                    provisioningHaptics22.player.cancel();
                                    break;
                                }
                                break;
                            default:
                                if (provisioningHaptics22 != null) {
                                    provisioningHaptics22.player.cancel();
                                    break;
                                }
                                break;
                        }
                    }
                };
            default:
                disposableEffectScope.getClass();
                final int i3 = 1;
                final ProvisioningHaptics provisioningHaptics3 = this.f$0;
                return new DisposableEffectResult() { // from class: com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt$ScanningContent$lambda$10$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        int i22 = i3;
                        ProvisioningHaptics provisioningHaptics22 = provisioningHaptics3;
                        switch (i22) {
                            case 0:
                                if (provisioningHaptics22 != null) {
                                    provisioningHaptics22.player.cancel();
                                    break;
                                }
                                break;
                            case 1:
                                if (provisioningHaptics22 != null) {
                                    provisioningHaptics22.player.cancel();
                                    break;
                                }
                                break;
                            default:
                                if (provisioningHaptics22 != null) {
                                    provisioningHaptics22.player.cancel();
                                    break;
                                }
                                break;
                        }
                    }
                };
        }
    }
}
