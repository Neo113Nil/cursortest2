package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProvider;
import androidx.compose.foundation.contextmenu.ContextMenuSpec;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import com.squareup.cash.arcade.components.list.ListOrderedKt$$ExternalSyntheticLambda11;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public abstract class DefaultTextContextMenuDropdownProvider_androidKt {
    public static final PopupProperties DefaultPopupProperties = new PopupProperties(true, 30);

    public static final void DefaultTextContextMenuDropdown(TextContextMenuSession textContextMenuSession, TextContextMenuData textContextMenuData, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1904307118);
        int i2 = (gapComposer.changed(textContextMenuSession) ? 4 : 2) | i | (gapComposer.changedInstance(textContextMenuData) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.startReplaceGroup(-1009482584);
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            gapComposer.end(false);
            boolean changedInstance = gapComposer.changedInstance(textContextMenuData) | ((i2 & 14) == 4) | gapComposer.changedInstance(context);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MenuKt$$ExternalSyntheticLambda0(11, textContextMenuData, context, textContextMenuSession);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ContextMenuUiKt.ContextMenuColumnBuilder(null, null, (Function1) rememberedValue, gapComposer, 0, 3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda0(textContextMenuSession, textContextMenuData, i, 13);
        }
    }

    /* renamed from: IconBox-RPmYEkk, reason: not valid java name */
    public static final void m374IconBoxRPmYEkk(final int i, final long j, Composer composer, final int i2) {
        final int i3;
        int i4;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (gapComposer.changed(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer.changed(j) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            boolean changed = ((i4 & 14) == 4) | gapComposer.changed(context);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int intValue = ((Number) rememberedValue).intValue();
            if (intValue == -1) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    function2 = new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i6) {
                                case 0:
                                    DefaultTextContextMenuDropdownProvider_androidKt.m374IconBoxRPmYEkk(i3, j, composer2, Updater.updateChangedFlags(i2 | 1));
                                    break;
                                default:
                                    DefaultTextContextMenuDropdownProvider_androidKt.m374IconBoxRPmYEkk(i3, j, composer2, Updater.updateChangedFlags(i2 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            Painter painterResource = Countries.painterResource(intValue, 0, gapComposer);
            boolean z = (i4 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = j == 16 ? null : new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            BoxKt.Box(ClipKt.paint$default(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, ContextMenuSpec.m191getIconSizeD9Ej5fM()), painterResource, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, (ColorFilter) rememberedValue2, 22), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i6 = 1;
            function2 = new Function2() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i6;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i62) {
                        case 0:
                            DefaultTextContextMenuDropdownProvider_androidKt.m374IconBoxRPmYEkk(i, j, composer2, Updater.updateChangedFlags(i2 | 1));
                            break;
                        default:
                            DefaultTextContextMenuDropdownProvider_androidKt.m374IconBoxRPmYEkk(i, j, composer2, Updater.updateChangedFlags(i2 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void OpenContextMenu(TextContextMenuSession textContextMenuSession, TextContextMenuDataProvider textContextMenuDataProvider, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(textContextMenuSession) : gapComposer.changedInstance(textContextMenuSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer.changed(textContextMenuDataProvider) : gapComposer.changedInstance(textContextMenuDataProvider) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && gapComposer.changed(textContextMenuDataProvider));
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MaintainWindowPositionPopupPositionProvider(new ContextMenuPopupPositionProvider(new DialogHostKt$$ExternalSyntheticLambda0(16, textContextMenuDataProvider, function0)));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MaintainWindowPositionPopupPositionProvider maintainWindowPositionPopupPositionProvider = (MaintainWindowPositionPopupPositionProvider) rememberedValue;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && gapComposer.changedInstance(textContextMenuSession))) {
                z = true;
            }
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Threads$$ExternalSyntheticLambda1(textContextMenuSession, 25);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidPopup_androidKt.Popup(maintainWindowPositionPopupPositionProvider, (Function0) rememberedValue2, DefaultPopupProperties, Expect_jvmKt.rememberComposableLambda(1315155414, new TextKt$$ExternalSyntheticLambda0(12, textContextMenuDataProvider, textContextMenuSession), gapComposer), gapComposer, 3456, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(textContextMenuSession, textContextMenuDataProvider, function0, i, 6);
        }
    }

    public static final void ProvideDefaultTextContextMenuDropdown(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1392105195);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TransactorKt.ProvideBasicTextContextMenu(modifier, TextContextMenuProviderKt.LocalTextContextMenuDropdownProvider, composableLambdaImpl, gapComposer, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListOrderedKt$$ExternalSyntheticLambda11(modifier, composableLambdaImpl, i, 3);
        }
    }
}
