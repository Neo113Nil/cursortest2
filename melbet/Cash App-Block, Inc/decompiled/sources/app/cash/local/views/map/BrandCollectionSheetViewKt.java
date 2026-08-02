package app.cash.local.views.map;

import android.view.View;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda4;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView$SheetContent$1$1;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetPeekPosition$FixedHeight;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.sheet.SheetStateKt;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public abstract class BrandCollectionSheetViewKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetPosition.values().length];
            try {
                SheetPosition sheetPosition = SheetPosition.Expanded;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        new BrandSpot("preview-brand-token", "preview-location-token");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BrandCollectionSheetView(BrandCollectionModel brandCollectionModel, Function1 function1, TextFieldState textFieldState, boolean z, Composer composer, int i, int i2) {
        boolean z2;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        RealSheetState rememberSheetState;
        function1.getClass();
        textFieldState.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-662266296);
        int i3 = (gapComposer.changedInstance(brandCollectionModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3 | (gapComposer.changed(textFieldState) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i4 |= gapComposer.changed(z2) ? 2048 : 1024;
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                boolean z4 = i5 != 0 ? false : z2;
                View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
                if (z4) {
                    gapComposer.startReplaceGroup(1504791920);
                    rememberSheetState = SheetStateKt.rememberSheetState(SheetPosition.Expanded, gapComposer);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1504870040);
                    rememberSheetState = SheetStateKt.rememberSheetState(null, gapComposer, 0, 1);
                    gapComposer.end(false);
                }
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
                boolean changedInstance = gapComposer.changedInstance(view) | ((i4 & 112) == 32);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new BrandCollectionSheetViewKt$$ExternalSyntheticLambda0(view, function1, 0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function1 function12 = (Function1) rememberedValue2;
                boolean changed = gapComposer.changed(rememberSheetState) | gapComposer.changed(function12);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new SheetAppMessageView$SheetContent$1$1(rememberSheetState, function12, (Continuation) null);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer, rememberSheetState, (Function2) rememberedValue3);
                gapComposer.startReplaceGroup(-782710153);
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer).tappableElement;
                Modifier navigationBarsWithBottomNavigationPadding = androidWindowInsets.getInsets$foundation_layout().bottom > 0 ? CashInsetsKt.navigationBarsWithBottomNavigationPadding(gapComposer) : Modifier.Companion.$$INSTANCE;
                gapComposer.end(false);
                SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = new SheetPeekPosition$FixedHeight(2, 130.0f, false);
                boolean changed2 = gapComposer.changed(rememberSheetState) | gapComposer.changedInstance(coroutineScope) | gapComposer.changed(function12);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new EducationalSheetKt$$ExternalSyntheticLambda4(rememberSheetState, coroutineScope, function12);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                SheetKt.Sheet((Function0) rememberedValue4, navigationBarsWithBottomNavigationPadding, rememberSheetState, sheetPeekPosition$FixedHeight, null, false, null, Expect_jvmKt.rememberComposableLambda(-1927638255, new LocalViewFactory$$ExternalSyntheticLambda6(11, brandCollectionModel, textFieldState, function12), gapComposer), gapComposer, 102236160, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
                z3 = z4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(brandCollectionModel, function1, textFieldState, z3, i, i2, 6);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
