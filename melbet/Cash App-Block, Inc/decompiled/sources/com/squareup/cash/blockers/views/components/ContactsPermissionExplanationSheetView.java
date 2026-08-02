package com.squareup.cash.blockers.views.components;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.navigation.Navigation;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class ContactsPermissionExplanationSheetView extends ComposeUiView implements BottomSheetConfig {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsPermissionExplanationSheetView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(Unit unit, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-777487219);
        int i2 = (gapComposer.changedInstance(function1) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            VerifyAliasViewKt.ContactPermissionExplanation(function1, gapComposer, (i2 >> 3) & 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9((Object) this, (Object) unit, function1, i, 8);
        }
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetStyle getBottomSheetStyle() {
        return Navigation.ArcadeBottomSheetStyle(this);
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((Unit) obj, function1, gapComposer, 0);
    }
}
