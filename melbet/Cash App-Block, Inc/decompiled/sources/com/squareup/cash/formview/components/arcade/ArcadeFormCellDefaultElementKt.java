package com.squareup.cash.formview.components.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.ta$$ExternalSyntheticLambda1;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.deposits.physical.view.map.AtmPmdExplainerViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.formview.components.arcade.AccessoryCheckedState;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolAvatarKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.TintedIcon;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import squareup.cash.ui.arcade.elements.ButtonProminence;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes6.dex */
public abstract class ArcadeFormCellDefaultElementKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonProminence.values().length];
            try {
                iArr[ButtonProminence.PROMINENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonProminence.SUBTLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccessoryLeadingImage(CellDefault.CellDefaultAccessoryLeadingImage cellDefaultAccessoryLeadingImage, RealImageLoader realImageLoader, Composer composer, int i) {
        GapComposer gapComposer;
        CellDefault.CellDefaultIcon cellDefaultIcon;
        Image image;
        CellDefault.CellDefaultIcon cellDefaultIcon2;
        CellDefault.CellDefaultIcon.IconStyle iconStyle;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(175188979);
        int i2 = (gapComposer2.changedInstance(cellDefaultAccessoryLeadingImage) ? 4 : 2) | i | (gapComposer2.changedInstance(realImageLoader) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            CellDefault.CellDefaultAccessoryLeadingImage.Type type2 = cellDefaultAccessoryLeadingImage.type;
            Image image2 = null;
            r4 = null;
            Icon icon = null;
            image2 = null;
            if (type2 != null) {
                CellDefault.CellDefaultAccessoryLeadingImage.Type.Icon icon2 = type2 instanceof CellDefault.CellDefaultAccessoryLeadingImage.Type.Icon ? (CellDefault.CellDefaultAccessoryLeadingImage.Type.Icon) type2 : null;
                if (icon2 != null) {
                    cellDefaultIcon = icon2.getValue();
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (cellDefaultIcon == null) {
                        gapComposer2.startReplaceGroup(669790628);
                        Modifier m289sizeInqDBjuR0$default = SizeKt.m289sizeInqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 28.0f, 28.0f, 3);
                        zzd zzdVar = Icons.Companion;
                        CellDefault.CellDefaultAccessoryLeadingImage.Type type3 = cellDefaultAccessoryLeadingImage.type;
                        if (type3 != null) {
                            CellDefault.CellDefaultAccessoryLeadingImage.Type.Icon icon3 = type3 instanceof CellDefault.CellDefaultAccessoryLeadingImage.Type.Icon ? (CellDefault.CellDefaultAccessoryLeadingImage.Type.Icon) type3 : null;
                            if (icon3 != null) {
                                cellDefaultIcon2 = icon3.getValue();
                                cellDefaultIcon2.getClass();
                                iconStyle = cellDefaultIcon2.icon_style;
                                if (iconStyle != null) {
                                    CellDefault.CellDefaultIcon.IconStyle.Icon icon4 = iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.Icon ? (CellDefault.CellDefaultIcon.IconStyle.Icon) iconStyle : null;
                                    if (icon4 != null) {
                                        icon = icon4.getValue();
                                    }
                                }
                                icon.getClass();
                                String str = icon.arcade_id;
                                str.getClass();
                                zzdVar.getClass();
                                Icons icons = zzd.get(str);
                                icons.getClass();
                                gapComposer = gapComposer2;
                                Trace.m1191Iconww6aTOc(icons, (String) null, m289sizeInqDBjuR0$default, 0L, gapComposer, 432, 8);
                                gapComposer.end(false);
                            }
                        }
                        cellDefaultIcon2 = null;
                        cellDefaultIcon2.getClass();
                        iconStyle = cellDefaultIcon2.icon_style;
                        if (iconStyle != null) {
                        }
                        icon.getClass();
                        String str2 = icon.arcade_id;
                        str2.getClass();
                        zzdVar.getClass();
                        Icons icons2 = zzd.get(str2);
                        icons2.getClass();
                        gapComposer = gapComposer2;
                        Trace.m1191Iconww6aTOc(icons2, (String) null, m289sizeInqDBjuR0$default, 0L, gapComposer, 432, 8);
                        gapComposer.end(false);
                    } else {
                        gapComposer = gapComposer2;
                        CellDefault.CellDefaultAccessoryLeadingImage.Type type4 = cellDefaultAccessoryLeadingImage.type;
                        if (type4 != null) {
                            CellDefault.CellDefaultAccessoryLeadingImage.Type.RemoteImage remoteImage = type4 instanceof CellDefault.CellDefaultAccessoryLeadingImage.Type.RemoteImage ? (CellDefault.CellDefaultAccessoryLeadingImage.Type.RemoteImage) type4 : null;
                            if (remoteImage != null) {
                                image = remoteImage.getValue();
                                if (image == null) {
                                    gapComposer.startReplaceGroup(670055244);
                                    Modifier m289sizeInqDBjuR0$default2 = SizeKt.m289sizeInqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 28.0f, 28.0f, 3);
                                    CellDefault.CellDefaultAccessoryLeadingImage.Type type5 = cellDefaultAccessoryLeadingImage.type;
                                    if (type5 != null) {
                                        CellDefault.CellDefaultAccessoryLeadingImage.Type.RemoteImage remoteImage2 = type5 instanceof CellDefault.CellDefaultAccessoryLeadingImage.Type.RemoteImage ? (CellDefault.CellDefaultAccessoryLeadingImage.Type.RemoteImage) type5 : null;
                                        if (remoteImage2 != null) {
                                            image2 = remoteImage2.getValue();
                                        }
                                    }
                                    image2.getClass();
                                    AsyncImageKt.m1441AsyncImagesKDTAoQ(ThemablesKt.urlForTheme(image2, gapComposer), null, realImageLoader, m289sizeInqDBjuR0$default2, null, null, null, gapComposer, ((i2 << 3) & 896) | 3120, 0, 4080);
                                    gapComposer = gapComposer;
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.startReplaceGroup(670283311);
                                    gapComposer.end(false);
                                }
                            }
                        }
                        image = null;
                        if (image == null) {
                        }
                    }
                }
            }
            cellDefaultIcon = null;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (cellDefaultIcon == null) {
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(cellDefaultAccessoryLeadingImage, realImageLoader, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01dd  */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ArcadeFormCellDefaultElement(String str, FormBlocker.Element.CellDefaultElement cellDefaultElement, State state, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        GapComposer gapComposer;
        Object ta__externalsyntheticlambda1;
        int i2;
        boolean z;
        Function0 function0;
        ?? r1;
        Boolean bool;
        CellDefault.CellDefaultAccessory.LabeledPush labeledPush;
        CellDefault cellDefault;
        RealImageLoader realImageLoader2;
        CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton cellDefaultAccessoryCompactButton;
        LocalizedString localizedString;
        Object obj;
        LocalizedString localizedString2;
        CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton cellDefaultAccessoryCompactButton2;
        CellDefault.CellDefaultAccessory.LabeledPush labeledPush2;
        boolean booleanValue;
        Color color;
        androidx.compose.ui.graphics.Color m;
        CellDefaultAccessory.Label label;
        Object obj2;
        state.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1445169513);
        int i3 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changedInstance(cellDefaultElement) ? 32 : 16) | (gapComposer2.changed(state) ? 256 : 128) | (gapComposer2.changedInstance(function1) ? 2048 : 1024) | (gapComposer2.changedInstance(realImageLoader) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            CellDefault cellDefault2 = cellDefaultElement.cell;
            if (cellDefault2 == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Missing cell from CellDefaultElement");
                return;
            }
            BlockerAction blockerAction = cellDefaultElement.cell_action;
            CellDefault.CellDefaultAccessory cellDefaultAccessory = cellDefault2.accessory;
            String str2 = cellDefaultElement.selection_group_id;
            if (blockerAction == null && ((AccessoryCheckedState) state.getValue()) == null) {
                gapComposer2.startReplaceGroup(293646311);
                gapComposer2.end(false);
                r1 = 0;
                function0 = null;
                i2 = 1;
            } else {
                gapComposer2.startReplaceGroup(293291919);
                boolean changedInstance = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | gapComposer2.changedInstance(blockerAction) | ((i3 & 896) == 256) | gapComposer2.changed(str2);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    i2 = 1;
                    z = false;
                    ta__externalsyntheticlambda1 = new ta$$ExternalSyntheticLambda1(blockerAction, function1, state, str, str2, 12);
                    gapComposer2.updateRememberedValue(ta__externalsyntheticlambda1);
                } else {
                    ta__externalsyntheticlambda1 = rememberedValue;
                    z = false;
                    i2 = 1;
                }
                function0 = (Function0) ta__externalsyntheticlambda1;
                gapComposer2.end(z);
                r1 = z;
            }
            if (cellDefaultAccessory == null) {
                gapComposer2.startReplaceGroup(293730692);
                gapComposer2.end(r1);
                cellDefault = cellDefault2;
                realImageLoader2 = realImageLoader;
                obj2 = null;
            } else {
                gapComposer2.startReplaceGroup(293730693);
                AccessoryCheckedState accessoryCheckedState = (AccessoryCheckedState) state.getValue();
                int i4 = i2;
                CellDefault.CellDefaultAccessoryLeadingImage cellDefaultAccessoryLeadingImage = cellDefault2.accessory_leading_image;
                CellDefault.CellDefaultAccessory.Type type2 = cellDefaultAccessory.type;
                if (type2 != null) {
                    CellDefault.CellDefaultAccessory.Type.Push push = type2 instanceof CellDefault.CellDefaultAccessory.Type.Push ? (CellDefault.CellDefaultAccessory.Type.Push) type2 : null;
                    if (push != null) {
                        bool = Boolean.valueOf(push.getValue());
                        if (bool == null) {
                            gapComposer2.startReplaceGroup(-528896177);
                            gapComposer2.end(r1);
                            obj = CellDefaultAccessory.Push.INSTANCE;
                            cellDefault = cellDefault2;
                            realImageLoader2 = realImageLoader;
                        } else {
                            CellDefault.CellDefaultAccessory.Type type3 = cellDefaultAccessory.type;
                            if (type3 != null) {
                                CellDefault.CellDefaultAccessory.Type.LabeledPush labeledPush3 = type3 instanceof CellDefault.CellDefaultAccessory.Type.LabeledPush ? (CellDefault.CellDefaultAccessory.Type.LabeledPush) type3 : null;
                                if (labeledPush3 != null) {
                                    labeledPush = labeledPush3.getValue();
                                    if (labeledPush == null) {
                                        gapComposer2.startReplaceGroup(-528787646);
                                        CellDefault.CellDefaultAccessory.Type type4 = cellDefaultAccessory.type;
                                        if (type4 != null) {
                                            CellDefault.CellDefaultAccessory.Type.LabeledPush labeledPush4 = type4 instanceof CellDefault.CellDefaultAccessory.Type.LabeledPush ? (CellDefault.CellDefaultAccessory.Type.LabeledPush) type4 : null;
                                            if (labeledPush4 != null) {
                                                labeledPush2 = labeledPush4.getValue();
                                                labeledPush2.getClass();
                                                Boolean bool2 = labeledPush2.hide_push_chevron;
                                                booleanValue = bool2 == null ? bool2.booleanValue() : r1;
                                                LocalizedString localizedString3 = labeledPush2.text;
                                                localizedString3.getClass();
                                                String str3 = localizedString3.translated_value;
                                                str3.getClass();
                                                color = labeledPush2.text_color;
                                                if (color != null) {
                                                    gapComposer2.startReplaceGroup(-528596501);
                                                    gapComposer2.end(r1);
                                                    m = null;
                                                } else {
                                                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, -2095261482, color, gapComposer2, (boolean) r1);
                                                }
                                                cellDefault = cellDefault2;
                                                realImageLoader2 = realImageLoader;
                                                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1564604628, new PoolAvatarKt$$ExternalSyntheticLambda0(cellDefaultAccessoryLeadingImage, str3, m == null ? m.value : androidx.compose.ui.graphics.Color.Unspecified, realImageLoader), gapComposer2);
                                                if (booleanValue) {
                                                    gapComposer2.startReplaceGroup(-528067082);
                                                    gapComposer2.end(r1);
                                                    label = new CellDefaultAccessory.Label(rememberComposableLambda, 2);
                                                } else {
                                                    gapComposer2.startReplaceGroup(-528236466);
                                                    label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(273158155, new OverlayKt$$ExternalSyntheticLambda0(rememberComposableLambda, 12), gapComposer2), (int) r1);
                                                    gapComposer2.end(r1);
                                                }
                                                obj = label;
                                                gapComposer2.end(r1);
                                            }
                                        }
                                        labeledPush2 = null;
                                        labeledPush2.getClass();
                                        Boolean bool22 = labeledPush2.hide_push_chevron;
                                        if (bool22 == null) {
                                        }
                                        LocalizedString localizedString32 = labeledPush2.text;
                                        localizedString32.getClass();
                                        String str32 = localizedString32.translated_value;
                                        str32.getClass();
                                        color = labeledPush2.text_color;
                                        if (color != null) {
                                        }
                                        cellDefault = cellDefault2;
                                        realImageLoader2 = realImageLoader;
                                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1564604628, new PoolAvatarKt$$ExternalSyntheticLambda0(cellDefaultAccessoryLeadingImage, str32, m == null ? m.value : androidx.compose.ui.graphics.Color.Unspecified, realImageLoader), gapComposer2);
                                        if (booleanValue) {
                                        }
                                        obj = label;
                                        gapComposer2.end(r1);
                                    } else {
                                        cellDefault = cellDefault2;
                                        realImageLoader2 = realImageLoader;
                                        if (accessoryCheckedState instanceof AccessoryCheckedState.Checkbox) {
                                            gapComposer2.startReplaceGroup(-527963573);
                                            gapComposer2.end(r1);
                                            obj = new CellDefaultAccessory.Checkbox(((AccessoryCheckedState.Checkbox) accessoryCheckedState).checked);
                                        } else if (accessoryCheckedState instanceof AccessoryCheckedState.Radio) {
                                            gapComposer2.startReplaceGroup(-527858483);
                                            gapComposer2.end(r1);
                                            obj = new CellDefaultAccessory.Radio(((AccessoryCheckedState.Radio) accessoryCheckedState).checked);
                                        } else if (accessoryCheckedState instanceof AccessoryCheckedState.Toggle) {
                                            gapComposer2.startReplaceGroup(-527754323);
                                            gapComposer2.end(r1);
                                            obj = new CellDefaultAccessory.Toggle(((AccessoryCheckedState.Toggle) accessoryCheckedState).checked);
                                        } else {
                                            CellDefault.CellDefaultAccessory.Type type5 = cellDefaultAccessory.type;
                                            if (type5 != null) {
                                                CellDefault.CellDefaultAccessory.Type.CompactButton compactButton = type5 instanceof CellDefault.CellDefaultAccessory.Type.CompactButton ? (CellDefault.CellDefaultAccessory.Type.CompactButton) type5 : null;
                                                if (compactButton != null) {
                                                    cellDefaultAccessoryCompactButton = compactButton.getValue();
                                                    if (cellDefaultAccessoryCompactButton == null) {
                                                        gapComposer2.startReplaceGroup(-527620682);
                                                        CellDefault.CellDefaultAccessory.Type type6 = cellDefaultAccessory.type;
                                                        if (type6 != null) {
                                                            CellDefault.CellDefaultAccessory.Type.CompactButton compactButton2 = type6 instanceof CellDefault.CellDefaultAccessory.Type.CompactButton ? (CellDefault.CellDefaultAccessory.Type.CompactButton) type6 : null;
                                                            if (compactButton2 != null) {
                                                                cellDefaultAccessoryCompactButton2 = compactButton2.getValue();
                                                                cellDefaultAccessoryCompactButton2.getClass();
                                                                LocalizedString localizedString4 = cellDefaultAccessoryCompactButton2.text;
                                                                localizedString4.getClass();
                                                                String str4 = localizedString4.translated_value;
                                                                str4.getClass();
                                                                ButtonProminence buttonProminence = cellDefaultAccessoryCompactButton2.prominence;
                                                                int i5 = buttonProminence != null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonProminence.ordinal()];
                                                                com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence2 = i5 == i4 ? i5 != 2 ? com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD : com.squareup.cash.arcade.components.button.ButtonProminence.SUBTLE : com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT;
                                                                Boolean bool3 = cellDefaultAccessoryCompactButton2.is_destructive;
                                                                CellDefaultAccessory.ButtonCompact buttonCompact = new CellDefaultAccessory.ButtonCompact(null, buttonProminence2, bool3 == null ? bool3.booleanValue() : r1, Expect_jvmKt.rememberComposableLambda(-1001597370, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str4, 16), gapComposer2), 9);
                                                                gapComposer2.end(r1);
                                                                obj = buttonCompact;
                                                            }
                                                        }
                                                        cellDefaultAccessoryCompactButton2 = null;
                                                        cellDefaultAccessoryCompactButton2.getClass();
                                                        LocalizedString localizedString42 = cellDefaultAccessoryCompactButton2.text;
                                                        localizedString42.getClass();
                                                        String str42 = localizedString42.translated_value;
                                                        str42.getClass();
                                                        ButtonProminence buttonProminence3 = cellDefaultAccessoryCompactButton2.prominence;
                                                        if (buttonProminence3 != null) {
                                                        }
                                                        com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence22 = i5 == i4 ? i5 != 2 ? com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD : com.squareup.cash.arcade.components.button.ButtonProminence.SUBTLE : com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT;
                                                        Boolean bool32 = cellDefaultAccessoryCompactButton2.is_destructive;
                                                        CellDefaultAccessory.ButtonCompact buttonCompact2 = new CellDefaultAccessory.ButtonCompact(null, buttonProminence22, bool32 == null ? bool32.booleanValue() : r1, Expect_jvmKt.rememberComposableLambda(-1001597370, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str42, 16), gapComposer2), 9);
                                                        gapComposer2.end(r1);
                                                        obj = buttonCompact2;
                                                    } else {
                                                        CellDefault.CellDefaultAccessory.Type type7 = cellDefaultAccessory.type;
                                                        if (type7 != null) {
                                                            CellDefault.CellDefaultAccessory.Type.Label label2 = type7 instanceof CellDefault.CellDefaultAccessory.Type.Label ? (CellDefault.CellDefaultAccessory.Type.Label) type7 : null;
                                                            if (label2 != null) {
                                                                localizedString = label2.getValue();
                                                                if (localizedString == null) {
                                                                    gapComposer2.startReplaceGroup(-527079794);
                                                                    CellDefault.CellDefaultAccessory.Type type8 = cellDefaultAccessory.type;
                                                                    if (type8 != null) {
                                                                        CellDefault.CellDefaultAccessory.Type.Label label3 = type8 instanceof CellDefault.CellDefaultAccessory.Type.Label ? (CellDefault.CellDefaultAccessory.Type.Label) type8 : null;
                                                                        if (label3 != null) {
                                                                            localizedString2 = label3.getValue();
                                                                            localizedString2.getClass();
                                                                            String str5 = localizedString2.translated_value;
                                                                            str5.getClass();
                                                                            CellDefaultAccessory.Label label4 = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(1615516171, new SectionKt$$ExternalSyntheticLambda2(29, cellDefaultAccessoryLeadingImage, str5, realImageLoader2), gapComposer2), (int) r1);
                                                                            gapComposer2.end(r1);
                                                                            obj = label4;
                                                                        }
                                                                    }
                                                                    localizedString2 = null;
                                                                    localizedString2.getClass();
                                                                    String str52 = localizedString2.translated_value;
                                                                    str52.getClass();
                                                                    CellDefaultAccessory.Label label42 = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(1615516171, new SectionKt$$ExternalSyntheticLambda2(29, cellDefaultAccessoryLeadingImage, str52, realImageLoader2), gapComposer2), (int) r1);
                                                                    gapComposer2.end(r1);
                                                                    obj = label42;
                                                                } else {
                                                                    gapComposer2.startReplaceGroup(-526749489);
                                                                    gapComposer2.end(r1);
                                                                    obj = CellDefaultAccessory.None.INSTANCE;
                                                                }
                                                            }
                                                        }
                                                        localizedString = null;
                                                        if (localizedString == null) {
                                                        }
                                                    }
                                                }
                                            }
                                            cellDefaultAccessoryCompactButton = null;
                                            if (cellDefaultAccessoryCompactButton == null) {
                                            }
                                        }
                                    }
                                }
                            }
                            labeledPush = null;
                            if (labeledPush == null) {
                            }
                        }
                        gapComposer2.end(r1);
                        obj2 = obj;
                    }
                }
                bool = null;
                if (bool == null) {
                }
                gapComposer2.end(r1);
                obj2 = obj;
            }
            Boolean bool4 = cellDefault.is_badged;
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(138333300, new TooltipKt$$ExternalSyntheticLambda2(4, cellDefault, function0, bool4 != null ? bool4.booleanValue() : r1 ? Badge.Small.INSTANCE : null, obj2, realImageLoader2, !(cellDefault.disabled != null ? r3.booleanValue() : r1)), gapComposer2);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, rememberComposableLambda3, gapComposer, 3072, 7);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(str, cellDefaultElement, state, function1, realImageLoader, i, 26);
        }
    }

    public static final void CellDefaultBody(CellDefault cellDefault, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1325094754);
        int i2 = (gapComposer.changedInstance(cellDefault) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Icons icons = null;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Icon icon = cellDefault.body_icon;
            LocalizedString localizedString = cellDefault.body_text;
            String str = localizedString != null ? localizedString.translated_value : null;
            if (icon != null) {
                gapComposer.startReplaceGroup(2036623394);
                String str2 = icon.arcade_id;
                if (str2 != null) {
                    Icons.Companion.getClass();
                    icons = zzd.get(str2);
                }
                if (icons == null) {
                    Path$$ExternalSyntheticBUOutline0.m((Object) Recorder$$ExternalSyntheticOutline2.m("Invalid body icon arcade ID: ", icon.arcade_id));
                    return;
                }
                Trace.m1191Iconww6aTOc(icons, (String) null, new WithAlignmentLineElement(AlignmentLinesKt.FirstLineCenter), 0L, gapComposer, 48, 8);
                if (str != null) {
                    gapComposer.startReplaceGroup(2036906703);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 4.0f));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(2036988388);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2036994340);
                gapComposer.end(false);
            }
            if (str != null) {
                gapComposer.startReplaceGroup(2037022984);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2037049892);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, i, 6);
        }
    }

    public static final void CellDefaultLabel(CellDefault cellDefault, Composer composer, int i) {
        Icons icons;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1157105838);
        int i2 = (gapComposer.changedInstance(cellDefault) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            TintedIcon tintedIcon = cellDefault.label_icon;
            LocalizedString localizedString = cellDefault.label_text;
            androidx.compose.ui.graphics.Color color = null;
            String str = localizedString != null ? localizedString.translated_value : null;
            if (str == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Missing label text from cell");
                return;
            }
            if (tintedIcon != null) {
                gapComposer.startReplaceGroup(67703494);
                String str2 = tintedIcon.arcade_id;
                if (str2 != null) {
                    Icons.Companion.getClass();
                    icons = zzd.get(str2);
                } else {
                    icons = null;
                }
                if (icons == null) {
                    Path$$ExternalSyntheticBUOutline0.m((Object) Recorder$$ExternalSyntheticOutline2.m("Invalid label icon arcade ID: ", tintedIcon.arcade_id));
                    return;
                }
                Painter painter = icons.painter(gapComposer);
                Color color2 = tintedIcon.tint_color;
                if (color2 == null) {
                    gapComposer.startReplaceGroup(67948517);
                    gapComposer.end(false);
                } else {
                    color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 417833884, color2, gapComposer, false);
                }
                zzacp.m2014InlineIconTextQqsJerU(str, painter, null, color != null ? color.value : androidx.compose.ui.graphics.Color.Unspecified, null, null, 0L, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer, Painter.$stable << 3, 0, 32756);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(67996444);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, i, 5);
        }
    }
}
