package com.squareup.cash.profile.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewModel;
import com.squareup.cash.profile.views.security.WebSectionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class SecurityLockViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProfilePasscodeSectionViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Modifier f$2;

    public /* synthetic */ SecurityLockViewKt$$ExternalSyntheticLambda1(ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel, Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = profilePasscodeSectionViewModel;
        this.f$1 = function1;
        this.f$2 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                BadgeNameKt.SecurityLock(Updater.updateChangedFlags(1), composer, this.f$2, this.f$0, this.f$1);
                break;
            default:
                WebSectionKt.SecurityLockSection(Updater.updateChangedFlags(1), composer, this.f$2, this.f$0, this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }
}
