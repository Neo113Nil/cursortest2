package com.google.android.gms.auth.api.identity;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class Identity {
    public static final void LocationDeniedModal(LocationDeniedScreen locationDeniedScreen, Function1 function1, Composer composer, int i) {
        int i2;
        locationDeniedScreen.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-532096667);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(locationDeniedScreen) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-443922960, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(6, locationDeniedScreen, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(locationDeniedScreen, function1, i, 3);
        }
    }

    public static zbaq getSignInClient(Context context) {
        zzae.checkNotNull(context);
        return new zbaq(context, new zbv());
    }

    public static final FinancialConnectionsSheetNativeActivity parentActivity(Composer composer) {
        ComponentActivity componentActivity;
        Context context = (Context) ((GapComposer) composer).consume(AndroidCompositionLocals_androidKt.LocalContext);
        context.getClass();
        if (!(context instanceof ComponentActivity)) {
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    componentActivity = null;
                    break;
                }
                if (context instanceof ComponentActivity) {
                    componentActivity = (ComponentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
                context.getClass();
            }
        } else {
            componentActivity = (ComponentActivity) context;
        }
        componentActivity.getClass();
        return (FinancialConnectionsSheetNativeActivity) componentActivity;
    }
}
