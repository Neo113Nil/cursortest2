package com.squareup.cash.core.navigationcontainer;

import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.Screen;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.stablecoin.views.StablecoinHomeViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.ui.BottomSheetStateListener;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class UiContainer$$ExternalSyntheticLambda33 implements Function6 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ UiContainer$$ExternalSyntheticLambda33(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                NavigationModel.Ready.OverlayLocation overlayLocation = (NavigationModel.Ready.OverlayLocation) obj8;
                UiContainer uiContainer = (UiContainer) obj7;
                LegacySheetConfig legacySheetConfig = (LegacySheetConfig) obj;
                BottomSheetStateListener bottomSheetStateListener = (BottomSheetStateListener) obj2;
                Continuation continuation = null;
                if (obj3 != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    break;
                } else {
                    Function2 function2 = (Function2) obj4;
                    Composer composer = (Composer) obj5;
                    int intValue = ((Integer) obj6).intValue();
                    function2.getClass();
                    Screen screen = overlayLocation.screen;
                    if (screen instanceof DialogScreen) {
                        GapComposer gapComposer = (GapComposer) composer;
                        gapComposer.startReplaceGroup(408304992);
                        View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
                        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
                        String str = overlayLocation.stateKey;
                        boolean changedInstance = gapComposer.changedInstance(view) | gapComposer.changed(delegatingSoftwareKeyboardController);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new RealAppConfigManager$update$2$2(view, delegatingSoftwareKeyboardController, continuation, 11);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue);
                        ArcadeModal2Kt.ArcadeModal2(uiContainer.overlayDismissRequested, function2, gapComposer, (intValue >> 6) & 112);
                        gapComposer.end(false);
                    } else if (screen instanceof BottomSheetScreen) {
                        GapComposer gapComposer2 = (GapComposer) composer;
                        gapComposer2.startReplaceGroup(409694753);
                        boolean changedInstance2 = gapComposer2.changedInstance(uiContainer);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda4(uiContainer, 28);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        UiContainerKt.BottomSheet(legacySheetConfig, bottomSheetStateListener, (Function0) rememberedValue2, uiContainer.overlayDismissRequested, function2, gapComposer2, (intValue & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | (458752 & (intValue << 6)));
                        gapComposer2.end(false);
                    } else {
                        GapComposer gapComposer3 = (GapComposer) composer;
                        gapComposer3.startReplaceGroup(410077913);
                        Recorder$$ExternalSyntheticOutline1.m((intValue >> 9) & 14, function2, gapComposer3, false);
                    }
                    break;
                }
            case 1:
                RealImageLoader realImageLoader = (RealImageLoader) obj8;
                ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda8 = (ScoreHomeKt$$ExternalSyntheticLambda8) obj7;
                int intValue2 = ((Integer) obj2).intValue();
                ((Integer) obj3).getClass();
                DirectoryListItem.ItemViewModel itemViewModel = (DirectoryListItem.ItemViewModel) obj4;
                int intValue3 = ((Integer) obj6).intValue();
                ((LazyGridItemScopeImpl) obj).getClass();
                itemViewModel.getClass();
                Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(Modifier.Companion.$$INSTANCE, 232.0f);
                GapComposer gapComposer4 = (GapComposer) ((Composer) obj5);
                boolean changedInstance3 = gapComposer4.changedInstance(realImageLoader);
                Object rememberedValue3 = gapComposer4.rememberedValue();
                if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new StablecoinHomeViewKt$$ExternalSyntheticLambda10(realImageLoader, 2);
                    gapComposer4.updateRememberedValue(rememberedValue3);
                }
                Function1 function1 = (Function1) rememberedValue3;
                boolean changedInstance4 = gapComposer4.changedInstance(itemViewModel) | ((((intValue3 & 112) ^ 48) > 32 && gapComposer4.changed(intValue2)) || (intValue3 & 48) == 32) | gapComposer4.changed(scoreHomeKt$$ExternalSyntheticLambda8);
                Object rememberedValue4 = gapComposer4.rememberedValue();
                if (changedInstance4 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel, scoreHomeKt$$ExternalSyntheticLambda8, 15);
                    gapComposer4.updateRememberedValue(rememberedValue4);
                }
                AndroidView_androidKt.AndroidView(function1, m290width3ABfNKs, (Function1) rememberedValue4, gapComposer4, 48, 0);
                break;
            default:
                String str2 = (String) obj;
                ASTNodeImpl aSTNodeImpl = (ASTNodeImpl) obj2;
                int intValue4 = ((Integer) obj6).intValue();
                str2.getClass();
                aSTNodeImpl.getClass();
                MoneybotMarkdownKt.m3633MoneybotMarkdownTableRowUR9CgXA(str2, aSTNodeImpl, ((Dp) obj3).value, (TextStyle) obj8, null, 0, (JWECryptoParts) obj7, ((Boolean) obj4).booleanValue(), (Composer) obj5, (intValue4 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((intValue4 << 12) & 29360128));
                break;
        }
        return Unit.INSTANCE;
    }
}
