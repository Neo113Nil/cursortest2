package androidx.compose.ui.window;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.foundation.text.TextMeasurePolicy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.paging.PageFetcher$flow$1;
import app.cash.molecule.PlatformKt;
import com.bugsnag.android.TraceParser$parse$1;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public abstract class AndroidPopup_androidKt {
    public static final DynamicProvidableCompositionLocal LocalPopupTestTag = new DynamicProvidableCompositionLocal(AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE);
    public static final DynamicProvidableCompositionLocal LocalIsInPopupLayout = new DynamicProvidableCompositionLocal(AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE$1);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Popup(PopupPositionProvider popupPositionProvider, Function0 function0, PopupProperties popupProperties, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        int i3;
        Function0 function02;
        int i4;
        PopupProperties popupProperties2;
        int i5;
        final Function0 function03;
        final PopupProperties popupProperties3;
        RecomposeScopeImpl endRestartGroup;
        String str;
        int i6;
        Object obj;
        LayoutDirection layoutDirection;
        Throwable th;
        Object obj2;
        final PopupPositionProvider popupPositionProvider2 = popupPositionProvider;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1772091631);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(popupPositionProvider2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= gapComposer.changedInstance(function02) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                popupProperties2 = popupProperties;
                i3 |= gapComposer.changed(popupProperties2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
                }
                i5 = i3;
                if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
                    Function0 function04 = i7 != 0 ? null : function02;
                    PopupProperties popupProperties4 = i4 != 0 ? new PopupProperties(false, 31) : popupProperties2;
                    View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
                    Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                    String str2 = (String) gapComposer.consume(LocalPopupTestTag);
                    LayoutDirection layoutDirection2 = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
                    GapComposer.CompositionContextImpl buildContext = gapComposer.buildContext();
                    MutableState rememberUpdatedState = Updater.rememberUpdatedState(composableLambdaImpl, gapComposer);
                    Object[] objArr = new Object[0];
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    Object obj3 = rememberedValue;
                    if (rememberedValue == neverEqualPolicy) {
                        AndroidPopup_androidKt$Popup$popupId$1$1 androidPopup_androidKt$Popup$popupId$1$1 = AndroidPopup_androidKt$Popup$popupId$1$1.INSTANCE;
                        gapComposer.updateRememberedValue(androidPopup_androidKt$Popup$popupId$1$1);
                        obj3 = androidPopup_androidKt$Popup$popupId$1$1;
                    }
                    UUID uuid = (UUID) SaverKt.rememberSaveable(objArr, (Function0) obj3, gapComposer, 48);
                    boolean booleanValue = ((Boolean) gapComposer.consume(LocalIsInPopupLayout)).booleanValue();
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        str = str2;
                        i6 = 0;
                        PopupLayout popupLayout = new PopupLayout(function04, popupProperties4, view, density, popupPositionProvider2, uuid, booleanValue);
                        popupPositionProvider2 = popupPositionProvider2;
                        popupLayout.setContent(buildContext, new ComposableLambdaImpl(new AndroidPopup_androidKt$Popup$popupLayout$1$1$1(popupLayout, rememberUpdatedState, i6), true, -297523940));
                        gapComposer.updateRememberedValue(popupLayout);
                        obj = popupLayout;
                    } else {
                        str = str2;
                        i6 = 0;
                        obj = rememberedValue2;
                    }
                    PopupLayout popupLayout2 = (PopupLayout) obj;
                    int i8 = i5 & 112;
                    int i9 = i5 & 896;
                    String str3 = str;
                    int i10 = (gapComposer.changedInstance(popupLayout2) ? 1 : 0) | (i8 == 32 ? 1 : i6) | (i9 == 256 ? 1 : i6) | (gapComposer.changed(str3) ? 1 : 0) | (gapComposer.changed(layoutDirection2.ordinal()) ? 1 : 0);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (i10 != 0 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new AndroidPopup_androidKt$Popup$2$1(popupLayout2, function04, popupProperties4, str3, layoutDirection2);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Updater.DisposableEffect(popupLayout2, (Function1) rememberedValue3, gapComposer);
                    int i11 = (gapComposer.changedInstance(popupLayout2) ? 1 : 0) | (i8 == 32 ? 1 : i6) | (i9 == 256 ? 1 : i6) | (gapComposer.changed(str3) ? 1 : 0) | (gapComposer.changed(layoutDirection2.ordinal()) ? 1 : 0);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (i11 != 0 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new AndroidPopup_androidKt$Popup$3$1(popupLayout2, function04, popupProperties4, str3, layoutDirection2);
                        layoutDirection = layoutDirection2;
                        gapComposer.updateRememberedValue(rememberedValue4);
                    } else {
                        layoutDirection = layoutDirection2;
                    }
                    Updater.SideEffect((Function0) rememberedValue4, gapComposer);
                    int i12 = 4;
                    int i13 = (gapComposer.changedInstance(popupLayout2) ? 1 : 0) | ((i5 & 14) == 4 ? 1 : i6);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    Object obj4 = rememberedValue5;
                    if (i13 != 0 || rememberedValue5 == neverEqualPolicy) {
                        TraceParser$parse$1 traceParser$parse$1 = new TraceParser$parse$1(i12, popupLayout2, popupPositionProvider2);
                        gapComposer.updateRememberedValue(traceParser$parse$1);
                        obj4 = traceParser$parse$1;
                    }
                    Updater.DisposableEffect(popupPositionProvider2, (Function1) obj4, gapComposer);
                    boolean changedInstance = gapComposer.changedInstance(popupLayout2);
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                        th = null;
                        PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1((Object) popupLayout2, (Continuation) (false ? 1 : 0), 9);
                        gapComposer.updateRememberedValue(pageFetcher$flow$1);
                        obj2 = pageFetcher$flow$1;
                    } else {
                        th = null;
                        obj2 = rememberedValue6;
                    }
                    Updater.LaunchedEffect(gapComposer, popupLayout2, (Function2) obj2);
                    boolean changedInstance2 = gapComposer.changedInstance(popupLayout2);
                    Object rememberedValue7 = gapComposer.rememberedValue();
                    Object obj5 = rememberedValue7;
                    if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
                        AndroidPopup_androidKt$Popup$7$1 androidPopup_androidKt$Popup$7$1 = new AndroidPopup_androidKt$Popup$7$1(popupLayout2, i6);
                        gapComposer.updateRememberedValue(androidPopup_androidKt$Popup$7$1);
                        obj5 = androidPopup_androidKt$Popup$7$1;
                    }
                    Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(Modifier.Companion.$$INSTANCE, (Function1) obj5);
                    boolean changedInstance3 = gapComposer.changedInstance(popupLayout2) | gapComposer.changed(layoutDirection.ordinal());
                    Object rememberedValue8 = gapComposer.rememberedValue();
                    Object obj6 = rememberedValue8;
                    if (changedInstance3 || rememberedValue8 == neverEqualPolicy) {
                        TextMeasurePolicy textMeasurePolicy = new TextMeasurePolicy(1, popupLayout2, layoutDirection);
                        gapComposer.updateRememberedValue(textMeasurePolicy);
                        obj6 = textMeasurePolicy;
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) obj6;
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, onGloballyPositioned);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw th;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer.end(true);
                    function03 = function04;
                    popupProperties3 = popupProperties4;
                } else {
                    gapComposer.skipToGroupEnd();
                    function03 = function02;
                    popupProperties3 = popupProperties2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            ((Number) obj8).intValue();
                            AndroidPopup_androidKt.Popup(PopupPositionProvider.this, function03, popupProperties3, composableLambdaImpl, (Composer) obj7, Updater.updateChangedFlags(i | 1), i2);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            popupProperties2 = popupProperties;
            if ((i & 3072) == 0) {
            }
            i5 = i3;
            if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        popupProperties2 = popupProperties;
        if ((i & 3072) == 0) {
        }
        i5 = i3;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final boolean isFlagSecureEnabled(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & PKIFailureInfo.certRevoked) == 0) ? false : true;
    }
}
