package com.squareup.cash.arcade.components.avatar;

import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import com.squareup.cash.card.onboarding.StampSheetV2Kt$$ExternalSyntheticLambda11;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.stripe.android.uicore.elements.DropdownFieldUIKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class AvatarKt$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ boolean f$4;

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda11(ViewConfiguration viewConfiguration, long j, boolean z, Modifier modifier, OffsetProvider offsetProvider) {
        this.f$0 = viewConfiguration;
        this.f$3 = j;
        this.f$4 = z;
        this.f$1 = modifier;
        this.f$2 = offsetProvider;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        Object obj5 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                TextViewKt.m3617Imageww6aTOc((AvatarImage) obj4, (AvatarSizeImpl) obj3, (String) obj5, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                ViewConfiguration viewConfiguration = (ViewConfiguration) obj4;
                Modifier modifier = (Modifier) obj3;
                OffsetProvider offsetProvider = (OffsetProvider) obj5;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(CompositionLocalsKt.LocalViewConfiguration.defaultProvidedValue$runtime(viewConfiguration), Expect_jvmKt.rememberComposableLambda(1260045569, new StampSheetV2Kt$$ExternalSyntheticLambda11(this.f$3, this.f$4, modifier, offsetProvider), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                DropdownFieldUIKt.m4067DropdownMenuItemT042LqI((String) obj5, this.f$4, this.f$3, (Modifier) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda11(AvatarImage avatarImage, AvatarSizeImpl avatarSizeImpl, String str, long j, boolean z, int i) {
        this.f$0 = avatarImage;
        this.f$1 = avatarSizeImpl;
        this.f$2 = str;
        this.f$3 = j;
        this.f$4 = z;
    }

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda11(String str, boolean z, long j, Modifier modifier, Function0 function0, int i) {
        this.f$2 = str;
        this.f$4 = z;
        this.f$3 = j;
        this.f$0 = modifier;
        this.f$1 = function0;
    }
}
