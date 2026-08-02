package com.squareup.cash.blockers.views;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes.dex */
public final /* synthetic */ class RegisterAliasViewKt$$ExternalSyntheticLambda18 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RegisterAliasViewModel f$0;

    public /* synthetic */ RegisterAliasViewKt$$ExternalSyntheticLambda18(RegisterAliasViewModel registerAliasViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = registerAliasViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        RegisterAliasViewModel registerAliasViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).button, (TextLineBalancing) null, registerAliasViewModel.nextButtonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean z = registerAliasViewModel.canSwitchMode;
                    RegisterAliasViewModel.Mode mode = registerAliasViewModel.mode;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).button, (TextLineBalancing) null, Room.stringResource(gapComposer2, (z && mode == RegisterAliasViewModel.Mode.SMS) ? R.string.blockers_use_email : (z && mode == RegisterAliasViewModel.Mode.EMAIL) ? R.string.blockers_use_phone : R.string.blockers_skip), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
