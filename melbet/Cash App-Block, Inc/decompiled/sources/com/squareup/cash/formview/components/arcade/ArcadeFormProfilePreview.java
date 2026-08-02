package com.squareup.cash.formview.components.arcade;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class ArcadeFormProfilePreview extends AbstractComposeView {
    public final FormBlocker.Element.ProfilePreviewElement element;
    public final RealImageLoader imageLoader;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormBlocker.Element.ProfilePreviewElement.Alignment.values().length];
            try {
                iArr[FormBlocker.Element.ProfilePreviewElement.Alignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.ProfilePreviewElement.Alignment.LEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormProfilePreview(Context context, RealImageLoader realImageLoader, FormBlocker.Element.ProfilePreviewElement profilePreviewElement) {
        super(context, null, 6, 0);
        context.getClass();
        this.imageLoader = realImageLoader;
        this.element = profilePreviewElement;
    }

    public final void CenterAlignedProfile(Composer composer, int i) {
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        GapComposer gapComposer;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        FormBlocker.Element.ProfilePreviewElement profilePreviewElement;
        Arrangement$Top$1 arrangement$Top$1;
        FormBlocker.Element.ProfilePreviewElement.Caption caption;
        boolean z;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12;
        FormBlocker.Element.ProfilePreviewElement profilePreviewElement2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16;
        FormBlocker.Element.ProfilePreviewElement.Caption caption2;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17;
        boolean z2;
        Arrangement$Top$1 arrangement$Top$12;
        FormBlocker.Element.ProfilePreviewElement profilePreviewElement3;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110;
        Modifier.Companion companion2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1664901273);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(this) ? 4 : 2);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Strings.getSizes(gapComposer2).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer2).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f);
            Strings.getSizes(gapComposer2).getClass();
            Modifier clip = ClipKt.clip(ImageKt.m178borderxT4_qwU(m299paddingVpY3zN4, 1.0f, Strings.getColors(gapComposer2).semantic.border.subtle, m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Arrangement$Top$1 arrangement$Top$13 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$13, horizontal, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, clip);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
            String str = null;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$13);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$111 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$111);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$112 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$112);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$113 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$113);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$14 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$14);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$114 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$114);
            FormBlocker.Element.ProfilePreviewElement profilePreviewElement4 = this.element;
            UiAvatar uiAvatar = profilePreviewElement4.avatar;
            if (uiAvatar != null) {
                gapComposer2.startReplaceGroup(-1993391621);
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                AvatarSize avatarSize = AvatarSize.Size48;
                AvatarEntry access$toAvatarEntry = ArcadeFormEmojiPickerKt.access$toAvatarEntry(uiAvatar, this.imageLoader, gapComposer2);
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$112;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$113;
                arrangement$Top$1 = arrangement$Top$13;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$14;
                profilePreviewElement = profilePreviewElement4;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$111;
                TextViewKt.Avatar(avatarSize, access$toAvatarEntry, m302paddingqDBjuR0$default, false, gapComposer2, 390, 24);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$111;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$14;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$113;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$112;
                gapComposer = gapComposer2;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                profilePreviewElement = profilePreviewElement4;
                arrangement$Top$1 = arrangement$Top$13;
                gapComposer.startReplaceGroup(-1993220315);
                gapComposer.end(false);
            }
            FormBlocker.Element.ProfilePreviewElement.Caption caption3 = profilePreviewElement.caption;
            if (caption3 != null) {
                if (caption3.icon == null && caption3.text == null) {
                    caption3 = null;
                }
                caption = caption3;
            } else {
                caption = null;
            }
            if (caption == null) {
                gapComposer.startReplaceGroup(-1993136244);
                gapComposer.end(false);
                ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$114;
                layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
                arrangement$Top$12 = arrangement$Top$1;
                composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$1;
                z2 = false;
                profilePreviewElement3 = profilePreviewElement;
                composeUiNode$Companion$SetModifier$19 = composeUiNode$Companion$SetModifier$13;
                composeUiNode$Companion$SetModifier$110 = composeUiNode$Companion$SetModifier$12;
                gapComposer2 = gapComposer;
            } else {
                gapComposer.startReplaceGroup(-1993136243);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$115 = composeUiNode$Companion$SetModifier$12;
                FormBlocker.Element.ProfilePreviewElement profilePreviewElement5 = profilePreviewElement;
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$116 = composeUiNode$Companion$SetModifier$13;
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$15 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
                gapComposer.startReusableNode();
                Arrangement$Top$1 arrangement$Top$14 = arrangement$Top$1;
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$116);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$115, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$15);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$114);
                Image image = caption.icon;
                if (image == null) {
                    gapComposer.startReplaceGroup(-632519342);
                    z = false;
                    gapComposer.end(false);
                } else {
                    z = false;
                    str = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, 810880143, image, gapComposer, false);
                }
                if (str == null) {
                    gapComposer.startReplaceGroup(-632494015);
                    gapComposer.end(z);
                    composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$116;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$115;
                    ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$15;
                    caption2 = caption;
                    composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$114;
                    companion = companion3;
                    profilePreviewElement2 = profilePreviewElement5;
                } else {
                    gapComposer.startReplaceGroup(-632494014);
                    companion = companion3;
                    composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$115;
                    ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$15;
                    profilePreviewElement2 = profilePreviewElement5;
                    composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$116;
                    GapComposer gapComposer3 = gapComposer;
                    composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$114;
                    caption2 = caption;
                    Trace.m1190Iconww6aTOc(AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(str, this.imageLoader, null, gapComposer, 0, 60), (String) null, SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, 11), 16.0f).then(new WithAlignmentLineElement(AlignmentLinesKt.FirstLineCenter)), Strings.getColors(gapComposer).semantic.icon.brand, gapComposer3, 48, 0);
                    gapComposer = gapComposer3;
                    z = false;
                    gapComposer.end(false);
                }
                String str2 = caption2.text;
                if (str2 == null) {
                    gapComposer.startReplaceGroup(-632124588);
                    gapComposer.end(z);
                    z2 = z;
                    layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
                    composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$16;
                    composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$1;
                    ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    profilePreviewElement3 = profilePreviewElement2;
                    composeUiNode$Companion$SetModifier$19 = composeUiNode$Companion$SetModifier$15;
                    composeUiNode$Companion$SetModifier$110 = composeUiNode$Companion$SetModifier$14;
                    arrangement$Top$12 = arrangement$Top$14;
                    gapComposer2 = gapComposer;
                } else {
                    gapComposer.startReplaceGroup(-632124587);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$117 = composeUiNode$Companion$SetModifier$16;
                    gapComposer2 = gapComposer;
                    layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
                    composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$117;
                    z2 = z;
                    arrangement$Top$12 = arrangement$Top$14;
                    profilePreviewElement3 = profilePreviewElement2;
                    ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$1;
                    composeUiNode$Companion$SetModifier$19 = composeUiNode$Companion$SetModifier$15;
                    composeUiNode$Companion$SetModifier$110 = composeUiNode$Companion$SetModifier$14;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer2, (Modifier) new WithAlignmentLineElement(AlignmentLinesKt.FirstLineCenter), Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer2.end(z2);
                }
                gapComposer2.end(true);
                gapComposer2.end(z2);
                companion3 = companion;
            }
            Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 24.0f, 5);
            Modifier.Companion companion4 = companion3;
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal, gapComposer2, 48);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default3);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$18);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$19);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$110, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$13);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$17);
            FormBlocker.Element.ProfilePreviewElement profilePreviewElement6 = profilePreviewElement3;
            String str3 = profilePreviewElement6.title;
            if (str3 == null) {
                Handlers$$ExternalSyntheticBUOutline0.m(profilePreviewElement6, "missing title in ");
                return;
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).header, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            String str4 = profilePreviewElement6.subtitle;
            if (str4 == null) {
                gapComposer2.startReplaceGroup(-1632377273);
                gapComposer2.end(z2);
                companion2 = companion4;
            } else {
                gapComposer2.startReplaceGroup(-1632377272);
                companion2 = companion4;
                Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                gapComposer2.end(z2);
            }
            gapComposer2.end(true);
            String str5 = profilePreviewElement6.footer;
            if (str5 == null) {
                gapComposer2.startReplaceGroup(-1991588445);
                gapComposer2.end(z2);
            } else {
                gapComposer2.startReplaceGroup(-1991588444);
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion2, 1.0f), Strings.getColors(gapComposer2).semantic.background.subtle, ColorKt.RectangleShape), 24.0f), Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                gapComposer2.end(z2);
            }
            gapComposer2.end(true);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormProfilePreview$$ExternalSyntheticLambda0(this, i, 2);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1046689796);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        int i3 = 0;
        int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(459813977, new ArcadeFormProfilePreview$$ExternalSyntheticLambda0(this, i3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormProfilePreview$$ExternalSyntheticLambda0(this, i, i4);
        }
    }

    public final void LeftAlignedProfile(Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1070962827);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier clip = ClipKt.clip(ImageKt.m178borderxT4_qwU(m300paddingVpY3zN4$default, 1.0f, colors.semantic.border.subtle, m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4);
            String str = this.element.subtitle;
            if (str == null) {
                gapComposer.startReplaceGroup(-2034578438);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(-2034578437);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-713451560, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, 21), gapComposer);
                gapComposer.end(false);
            }
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1397667863, new ArcadeFormProfilePreview$$ExternalSyntheticLambda0(this, 3), gapComposer), Expect_jvmKt.rememberComposableLambda(-704785640, new ArcadeFormProfilePreview$$ExternalSyntheticLambda0(this, i2), gapComposer), clip, null, null, false, true, rememberComposableLambda, null, null, 0L, null, gapComposer, 1572918, 0, 3896);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeFormProfilePreview$$ExternalSyntheticLambda0(this, i, 5);
        }
    }
}
