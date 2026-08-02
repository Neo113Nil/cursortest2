package com.squareup.cash.account.presenters.settings;

import androidx.compose.ui.text.android.CanvasCompatQ;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes5.dex */
public final class AccountSettingsCapabilityProvider extends CanvasCompatQ {
    public final List capabilities;

    public AccountSettingsCapabilityProvider(PersonalSetting personalSetting, BusinessInfoSetting businessInfoSetting, PasskeysSetting passkeysSetting, SecuritySetting securitySetting, FamilySetting familySetting, LimitsSetting limitsSetting, LimitsSetting limitsSetting2, SecuritySetting securitySetting2, LimitsSetting limitsSetting3, LimitsSetting limitsSetting4, LimitsSetting limitsSetting5, FamilySetting familySetting2, PersonalSetting personalSetting2, SecuritySetting securitySetting3, SecuritySetting securitySetting4, SecuritySetting securitySetting5, PasskeysSetting passkeysSetting2) {
        this.capabilities = CollectionsKt__CollectionsKt.listOf((Object[]) new AccountSettingsCapability[]{personalSetting, businessInfoSetting, securitySetting, securitySetting2, limitsSetting3, passkeysSetting, familySetting, securitySetting4, familySetting2, limitsSetting, passkeysSetting2, securitySetting5, personalSetting2, limitsSetting4, securitySetting3, limitsSetting5, limitsSetting2});
    }

    @Override // androidx.compose.ui.text.android.CanvasCompatQ
    public final List getCapabilities() {
        return this.capabilities;
    }
}
