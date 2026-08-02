package com.squareup.cash.arcade.components.cell;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.style.TextAlign;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.CheckboxKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.internal.LocalEnabledStateKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface CellDefaultAccessory {

    public final class ButtonCompact implements CellDefaultAccessory {
        public final AccessoryConfig config;
        public final Function3 content;
        public final boolean destructive;
        public final boolean isMergedIntoCell;
        public final ButtonProminence prominence;
        public final Function0 separateClickAction;

        public ButtonCompact(Function0 function0, ButtonProminence buttonProminence, boolean z, Function3 function3, int i) {
            function0 = (i & 1) != 0 ? null : function0;
            buttonProminence = (i & 2) != 0 ? ButtonProminence.STANDARD : buttonProminence;
            boolean z2 = false;
            z = (i & 4) != 0 ? false : z;
            boolean z3 = (i & 8) == 0;
            buttonProminence.getClass();
            function3.getClass();
            this.separateClickAction = function0;
            this.prominence = buttonProminence;
            this.destructive = z;
            this.content = function3;
            boolean z4 = z3 && function0 == null;
            this.isMergedIntoCell = z4;
            this.config = new AccessoryConfig(z4 ? null : new Role(0), z2, z2, 6);
        }

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final void Content(Badge badge, Function0 function0, Composer composer, int i) {
            Function0 function02;
            Function0 function03;
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(2129877513);
            int i2 = (gapComposer.changedInstance(function0) ? 32 : 16) | i | (gapComposer.changed(this) ? 256 : 128);
            if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                if (this.isMergedIntoCell) {
                    function02 = null;
                } else {
                    function02 = this.separateClickAction;
                    if (function02 == null) {
                        function03 = function0;
                        SizeKt.ButtonCompact(function03, null, this.prominence, this.destructive, false, null, this.content, gapComposer, 0, 50);
                    }
                }
                function03 = function02;
                SizeKt.ButtonCompact(function03, null, this.prominence, this.destructive, false, null, this.content, gapComposer, 0, 50);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(this, badge, function0, i, 23);
            }
        }

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final AccessoryConfig getConfig() {
            return this.config;
        }
    }

    public final class Checkbox implements CellDefaultAccessory {
        public final boolean checked;
        public final AccessoryConfig config;

        public Checkbox(boolean z) {
            this.checked = z;
            this.config = new AccessoryConfig(new Role(1), z, false, 8);
        }

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final void Content(Badge badge, Function0 function0, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-1712139603);
            int i2 = (gapComposer.changed(this) ? 256 : 128) | i;
            if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                CheckboxKt.UnlabeledCheckbox(this.checked, null, null, null, false, gapComposer, 48, 28);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(this, badge, function0, i, 24);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Checkbox) && this.checked == ((Checkbox) obj).checked;
        }

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final AccessoryConfig getConfig() {
            return this.config;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Checkbox(checked=", ")", this.checked);
        }
    }

    public final class None implements CellDefaultAccessory {
        public static final None INSTANCE = new None();
        public static final AccessoryConfig config;

        static {
            boolean z = false;
            config = new AccessoryConfig((Role) null, z, z, 15);
        }

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final void Content(Badge badge, Function0 function0, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-1752442590);
            int i2 = i & 1;
            if (!gapComposer.shouldExecute(i2, i2 != 0)) {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(this, badge, function0, i, 27);
            }
        }

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final AccessoryConfig getConfig() {
            return config;
        }
    }

    public final class Push implements CellDefaultAccessory {
        public static final Push INSTANCE = new Push();
        public static final AccessoryConfig config = new AccessoryConfig((Role) null, false, true, 7);

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final void Content(final Badge badge, final Function0 function0, Composer composer, final int i) {
            int i2;
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(167248388);
            int i3 = i & 1;
            if (!gapComposer.shouldExecute(i3, i3 != 0)) {
                i2 = i;
                gapComposer.skipToGroupEnd();
            } else {
                if (!((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue()) {
                    RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                        final int i4 = 0;
                        endRestartGroup.block = new Function2(this, badge, function0, i, i4) { // from class: com.squareup.cash.arcade.components.cell.CellDefaultAccessory$Push$$ExternalSyntheticLambda0
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ CellDefaultAccessory.Push f$0;
                            public final /* synthetic */ Badge f$1;
                            public final /* synthetic */ Function0 f$2;

                            {
                                this.$r8$classId = i4;
                                this.f$0 = this;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i5 = this.$r8$classId;
                                Function0 function02 = this.f$2;
                                Badge badge2 = this.f$1;
                                CellDefaultAccessory.Push push = this.f$0;
                                Composer composer2 = (Composer) obj;
                                ((Integer) obj2).getClass();
                                switch (i5) {
                                    case 0:
                                        push.Content(badge2, function02, composer2, Updater.updateChangedFlags(1));
                                        break;
                                    default:
                                        push.Content(badge2, function02, composer2, Updater.updateChangedFlags(1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                i2 = i;
                Icons icons = Icons.Push24;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors.component.cell.controls.icon.f174default, gapComposer, 54, 4);
            }
            RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
            if (endRestartGroup2 != null) {
                final int i5 = 1;
                final int i6 = i2;
                endRestartGroup2.block = new Function2(this, badge, function0, i6, i5) { // from class: com.squareup.cash.arcade.components.cell.CellDefaultAccessory$Push$$ExternalSyntheticLambda0
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ CellDefaultAccessory.Push f$0;
                    public final /* synthetic */ Badge f$1;
                    public final /* synthetic */ Function0 f$2;

                    {
                        this.$r8$classId = i5;
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i52 = this.$r8$classId;
                        Function0 function02 = this.f$2;
                        Badge badge2 = this.f$1;
                        CellDefaultAccessory.Push push = this.f$0;
                        Composer composer2 = (Composer) obj;
                        ((Integer) obj2).getClass();
                        switch (i52) {
                            case 0:
                                push.Content(badge2, function02, composer2, Updater.updateChangedFlags(1));
                                break;
                            default:
                                push.Content(badge2, function02, composer2, Updater.updateChangedFlags(1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
        }

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final AccessoryConfig getConfig() {
            return config;
        }
    }

    public final class Radio implements CellDefaultAccessory {
        public final AccessoryConfig config;
        public final boolean selected;

        public Radio(boolean z) {
            this.selected = z;
            this.config = new AccessoryConfig(new Role(3), z, false, 8);
        }

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final void Content(Badge badge, Function0 function0, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(1990799987);
            int i2 = (gapComposer.changed(badge) ? 4 : 2) | i | (gapComposer.changed(this) ? 256 : 128);
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 131) != 130)) {
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
                if (badge != null) {
                    gapComposer.startReplaceGroup(-1547308043);
                    SpacerKt.Spacer(gapComposer, androidx.compose.foundation.layout.SizeKt.m290width3ABfNKs(companion, 16.0f));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1547248461);
                    gapComposer.end(false);
                }
                ModalKt.Radio(this.selected, null, null, false, null, gapComposer, 0, 30);
                gapComposer.end(true);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(this, badge, function0, i, 28);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Radio) && this.selected == ((Radio) obj).selected;
        }

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final AccessoryConfig getConfig() {
            return this.config;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.selected);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Radio(selected=", ")", this.selected);
        }
    }

    public final class Toggle implements CellDefaultAccessory {
        public final boolean checked;
        public final AccessoryConfig config;

        public Toggle(boolean z) {
            this.checked = z;
            this.config = new AccessoryConfig(new Role(2), true, z, false);
        }

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final void Content(Badge badge, Function0 function0, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(1788536062);
            int i2 = (gapComposer.changed(this) ? 256 : 128) | i;
            if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                ModalKt.Toggle(0, 6, gapComposer, null, this.checked, false);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(this, badge, function0, i, 29);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Toggle) && this.checked == ((Toggle) obj).checked;
        }

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final AccessoryConfig getConfig() {
            return this.config;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Toggle(checked=", ")", this.checked);
        }
    }

    void Content(Badge badge, Function0 function0, Composer composer, int i);

    AccessoryConfig getConfig();

    public final class AccessoryConfig {
        public final boolean centerToFirstLine;
        public final Role role;
        public final boolean toggleable;
        public final boolean toggleableValue;

        public /* synthetic */ AccessoryConfig(Role role, boolean z, boolean z2, int i) {
            this((i & 1) != 0 ? null : role, (i & 2) == 0, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccessoryConfig)) {
                return false;
            }
            AccessoryConfig accessoryConfig = (AccessoryConfig) obj;
            return Intrinsics.areEqual(this.role, accessoryConfig.role) && this.toggleable == accessoryConfig.toggleable && this.toggleableValue == accessoryConfig.toggleableValue && this.centerToFirstLine == accessoryConfig.centerToFirstLine;
        }

        public final int hashCode() {
            Role role = this.role;
            return Boolean.hashCode(this.centerToFirstLine) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((role == null ? 0 : Integer.hashCode(role.value)) * 31, 31, this.toggleable), 31, this.toggleableValue);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccessoryConfig(role=");
            sb.append(this.role);
            sb.append(", toggleable=");
            sb.append(this.toggleable);
            sb.append(", toggleableValue=");
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.toggleableValue, ", centerToFirstLine=", this.centerToFirstLine, ")");
        }

        public AccessoryConfig(Role role, boolean z, boolean z2, boolean z3) {
            this.role = role;
            this.toggleable = z;
            this.toggleableValue = z2;
            this.centerToFirstLine = z3;
        }
    }

    public final class Label implements CellDefaultAccessory {
        public final /* synthetic */ int $r8$classId;
        public final AccessoryConfig config;
        public final ComposableLambdaImpl content;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Label(String str, int i) {
            this(new ComposableLambdaImpl(new LocalHomeViewKt$$ExternalSyntheticLambda1(str, 27), true, 661705308), 0);
            this.$r8$classId = i;
            switch (i) {
                case 2:
                    str.getClass();
                    this(new ComposableLambdaImpl(new LocalHomeViewKt$$ExternalSyntheticLambda1(str, 28), true, -930383115), 2);
                    break;
                default:
                    str.getClass();
                    break;
            }
        }

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final void Content(final Badge badge, final Function0 function0, Composer composer, final int i) {
            RecomposeScopeImpl endRestartGroup;
            Function2 function2;
            int i2 = this.$r8$classId;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            switch (i2) {
                case 0:
                    GapComposer gapComposer = (GapComposer) composer;
                    gapComposer.startRestartGroup(399414764);
                    int i3 = i | (gapComposer.changed(this) ? 256 : 128);
                    if (!gapComposer.shouldExecute(i3 & 1, (i3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                        gapComposer.skipToGroupEnd();
                    } else {
                        if (!((Boolean) gapComposer.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue()) {
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup != null) {
                                final int i4 = 0;
                                function2 = new Function2(this, badge, function0, i, i4) { // from class: com.squareup.cash.arcade.components.cell.CellDefaultAccessory$Label$$ExternalSyntheticLambda0
                                    public final /* synthetic */ int $r8$classId;
                                    public final /* synthetic */ CellDefaultAccessory.Label f$0;
                                    public final /* synthetic */ Badge f$1;
                                    public final /* synthetic */ Function0 f$2;

                                    {
                                        this.$r8$classId = i4;
                                        this.f$0 = this;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        int i5 = this.$r8$classId;
                                        Function0 function02 = this.f$2;
                                        Badge badge2 = this.f$1;
                                        CellDefaultAccessory.Label label = this.f$0;
                                        Composer composer2 = (Composer) obj;
                                        ((Integer) obj2).getClass();
                                        switch (i5) {
                                            case 0:
                                                label.Content(badge2, function02, composer2, Updater.updateChangedFlags(1));
                                                break;
                                            default:
                                                label.Content(badge2, function02, composer2, Updater.updateChangedFlags(1));
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                endRestartGroup.block = function2;
                                return;
                            }
                            return;
                        }
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
                        Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium), ArcadeThemeKt.LocalTextAlign.defaultProvidedValue$runtime(new TextAlign(6))}, Expect_jvmKt.rememberComposableLambda(728894536, new ButtonBinding$$ExternalSyntheticLambda2(this, 16), gapComposer), gapComposer, 56);
                        gapComposer.end(true);
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                        final int i5 = 1;
                        function2 = new Function2(this, badge, function0, i, i5) { // from class: com.squareup.cash.arcade.components.cell.CellDefaultAccessory$Label$$ExternalSyntheticLambda0
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ CellDefaultAccessory.Label f$0;
                            public final /* synthetic */ Badge f$1;
                            public final /* synthetic */ Function0 f$2;

                            {
                                this.$r8$classId = i5;
                                this.f$0 = this;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = this.$r8$classId;
                                Function0 function02 = this.f$2;
                                Badge badge2 = this.f$1;
                                CellDefaultAccessory.Label label = this.f$0;
                                Composer composer2 = (Composer) obj;
                                ((Integer) obj2).getClass();
                                switch (i52) {
                                    case 0:
                                        label.Content(badge2, function02, composer2, Updater.updateChangedFlags(1));
                                        break;
                                    default:
                                        label.Content(badge2, function02, composer2, Updater.updateChangedFlags(1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        endRestartGroup.block = function2;
                        return;
                    }
                    return;
                case 1:
                    GapComposer gapComposer2 = (GapComposer) composer;
                    gapComposer2.startRestartGroup(2097426331);
                    int i6 = i | (gapComposer2.changed(this) ? 256 : 128);
                    if (gapComposer2.shouldExecute(i6 & 1, (i6 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                        this.content.invoke((Object) gapComposer2, (Object) 0);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        endRestartGroup2.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(this, badge, function0, i, 25);
                        return;
                    }
                    return;
                default:
                    GapComposer gapComposer3 = (GapComposer) composer;
                    gapComposer3.startRestartGroup(1607225989);
                    int i7 = (gapComposer3.changed(this) ? 256 : 128) | i | (gapComposer3.changed(badge) ? 4 : 2);
                    if (gapComposer3.shouldExecute(i7 & 1, (i7 & 131) != 130)) {
                        RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer3, 48);
                        int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        if (gapComposer3.applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                        if (badge != null) {
                            gapComposer3.startReplaceGroup(430761891);
                            SpacerKt.Spacer(gapComposer3, androidx.compose.foundation.layout.SizeKt.m290width3ABfNKs(companion, 16.0f));
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(430821473);
                            gapComposer3.end(false);
                        }
                        Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium), ArcadeThemeKt.LocalTextAlign.defaultProvidedValue$runtime(new TextAlign(6))}, Expect_jvmKt.rememberComposableLambda(255628257, new ButtonBinding$$ExternalSyntheticLambda2(this, 17), gapComposer3), gapComposer3, 56);
                        if (((Boolean) gapComposer3.consume(LocalEnabledStateKt.LocalEnabledState)).booleanValue()) {
                            gapComposer3.startReplaceGroup(431059429);
                            Icons icons = Icons.Push24;
                            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                            } else {
                                gapComposer3.startReplaceGroup(-1762997739);
                                gapComposer3.end(false);
                            }
                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors.component.cell.controls.icon.f174default, gapComposer3, 54, 4);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(431247599);
                            SpacerKt.Spacer(gapComposer3, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, 24.0f));
                            gapComposer3.end(false);
                        }
                        gapComposer3.end(true);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    RecomposeScopeImpl endRestartGroup3 = gapComposer3.endRestartGroup();
                    if (endRestartGroup3 != null) {
                        endRestartGroup3.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(this, badge, function0, i, 26);
                        return;
                    }
                    return;
            }
        }

        @Override // com.squareup.cash.arcade.components.cell.CellDefaultAccessory
        public final AccessoryConfig getConfig() {
            switch (this.$r8$classId) {
            }
            return this.config;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Label(ComposableLambdaImpl composableLambdaImpl, int i) {
            this(new AccessoryConfig(r1, r2, r2, r0), composableLambdaImpl);
            this.$r8$classId = i;
            int i2 = 15;
            Role role = null;
            boolean z = false;
            switch (i) {
                case 1:
                    break;
                case 2:
                    this.content = composableLambdaImpl;
                    this.config = new AccessoryConfig(role, z, true, 7);
                    break;
                default:
                    this.content = composableLambdaImpl;
                    this.config = new AccessoryConfig(role, z, z, i2);
                    break;
            }
        }

        public Label(AccessoryConfig accessoryConfig, ComposableLambdaImpl composableLambdaImpl) {
            this.$r8$classId = 1;
            this.config = accessoryConfig;
            this.content = composableLambdaImpl;
        }
    }
}
