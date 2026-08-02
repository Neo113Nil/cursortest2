package com.squareup.cash.formview.components.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.formview.components.arcade.ArcadeFormProfilePreview;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeFormProfilePreview$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArcadeFormProfilePreview f$0;

    public /* synthetic */ ArcadeFormProfilePreview$$ExternalSyntheticLambda0(ArcadeFormProfilePreview arcadeFormProfilePreview, int i) {
        this.$r8$classId = i;
        this.f$0 = arcadeFormProfilePreview;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        FormBlocker.Element.ProfilePreviewElement.Badge badge;
        int i;
        Modifier.Companion companion;
        int i2;
        GapComposer gapComposer;
        FormBlocker.Element.ProfilePreviewElement.Accessory accessory;
        int i3 = this.$r8$classId;
        FormBlocker.Element.ProfilePreviewElement.Pill pill = null;
        ArcadeFormProfilePreview arcadeFormProfilePreview = this.f$0;
        switch (i3) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    FormBlocker.Element.ProfilePreviewElement.Alignment alignment = arcadeFormProfilePreview.element.alignment;
                    int i4 = alignment == null ? -1 : ArcadeFormProfilePreview.WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
                    if (i4 == -1 || i4 == 1) {
                        gapComposer2.startReplaceGroup(1667581437);
                        arcadeFormProfilePreview.CenterAlignedProfile(gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        if (i4 != 2) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -500399098, false);
                        }
                        gapComposer2.startReplaceGroup(1667676607);
                        arcadeFormProfilePreview.LeftAlignedProfile(gapComposer2, 0);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                arcadeFormProfilePreview.Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                arcadeFormProfilePreview.CenterAlignedProfile((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    FormBlocker.Element.ProfilePreviewElement profilePreviewElement = arcadeFormProfilePreview.element;
                    UiAvatar uiAvatar = profilePreviewElement.avatar;
                    if (uiAvatar == null) {
                        Handlers$$ExternalSyntheticBUOutline0.m(profilePreviewElement, "missing avatar in ");
                        return null;
                    }
                    TextViewKt.Avatar(AvatarSize.Size48, ArcadeFormEmojiPickerKt.access$toAvatarEntry(uiAvatar, arcadeFormProfilePreview.imageLoader, gapComposer3), null, false, gapComposer3, 6, 28);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                FormBlocker.Element.ProfilePreviewElement profilePreviewElement2 = arcadeFormProfilePreview.element;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer4, 54);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, companion2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    String str = profilePreviewElement2.title;
                    if (str == null) {
                        Handlers$$ExternalSyntheticBUOutline0.m(profilePreviewElement2, "missing title in ");
                        return null;
                    }
                    FormBlocker.Element.ProfilePreviewElement.Accessory accessory2 = profilePreviewElement2.accessory;
                    if (accessory2 != null) {
                        FormBlocker.Element.ProfilePreviewElement.Accessory.TitleBadge titleBadge = accessory2 instanceof FormBlocker.Element.ProfilePreviewElement.Accessory.TitleBadge ? (FormBlocker.Element.ProfilePreviewElement.Accessory.TitleBadge) accessory2 : null;
                        if (titleBadge != null) {
                            badge = titleBadge.getValue();
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, false);
                            if (badge == null) {
                                gapComposer4.startReplaceGroup(-259823759);
                                Image image = badge.icon;
                                image.getClass();
                                String urlForTheme = ThemablesKt.urlForTheme(image, gapComposer4);
                                RealImageLoader realImageLoader = arcadeFormProfilePreview.imageLoader;
                                i = -1762997026;
                                AsyncImagePainter m1448rememberAsyncImagePainter5jETZwI = AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(urlForTheme, realImageLoader, null, gapComposer4, 0, 60);
                                Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                } else {
                                    gapComposer4.startReplaceGroup(-1762997739);
                                    gapComposer4.end(false);
                                }
                                long j = colors.semantic.icon.brand;
                                companion = companion2;
                                i2 = -1762997739;
                                zzacp.m2014InlineIconTextQqsJerU(str, m1448rememberAsyncImagePainter5jETZwI, layoutWeightElement, j, null, null, 0L, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer4, 0, 0, 32752);
                                gapComposer = gapComposer4;
                                gapComposer.end(false);
                            } else {
                                i = -1762997026;
                                companion = companion2;
                                i2 = -1762997739;
                                gapComposer4.startReplaceGroup(-259487936);
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer4, (Modifier) layoutWeightElement, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                gapComposer = gapComposer4;
                                gapComposer.end(false);
                            }
                            accessory = profilePreviewElement2.accessory;
                            if (accessory != null) {
                                FormBlocker.Element.ProfilePreviewElement.Accessory.Pill pill2 = accessory instanceof FormBlocker.Element.ProfilePreviewElement.Accessory.Pill ? (FormBlocker.Element.ProfilePreviewElement.Accessory.Pill) accessory : null;
                                if (pill2 != null) {
                                    pill = pill2.getValue();
                                }
                            }
                            if (pill != null) {
                                gapComposer.startReplaceGroup(-259371191);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-259371190);
                                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, i, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(i2);
                                    gapComposer.end(false);
                                }
                                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(companion, colors2.semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), 12.0f, 2.0f);
                                String str2 = pill.text;
                                str2.getClass();
                                GapComposer gapComposer5 = gapComposer;
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer5, m299paddingVpY3zN4, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).buttonCompact, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                gapComposer = gapComposer5;
                                gapComposer.end(false);
                            }
                            gapComposer.end(true);
                        }
                    }
                    badge = null;
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, false);
                    if (badge == null) {
                    }
                    accessory = profilePreviewElement2.accessory;
                    if (accessory != null) {
                    }
                    if (pill != null) {
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                arcadeFormProfilePreview.LeftAlignedProfile((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ArcadeFormProfilePreview$$ExternalSyntheticLambda0(ArcadeFormProfilePreview arcadeFormProfilePreview, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = arcadeFormProfilePreview;
    }
}
