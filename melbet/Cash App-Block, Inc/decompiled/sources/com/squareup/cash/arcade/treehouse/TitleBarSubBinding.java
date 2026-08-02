package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.arcade.values.AvatarAction;
import app.cash.arcade.values.IconAction;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.NavigationIconType;
import app.cash.arcade.values.TitleBarAction;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class TitleBarSubBinding extends AbstractComposeView implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Modifier modifier;
    public final ParcelableSnapshotMutableState navigationCallback$delegate;
    public final ParcelableSnapshotMutableState navigationIconType$delegate;
    public final ParcelableSnapshotMutableState primaryAction$delegate;
    public final ParcelableSnapshotMutableState secondaryAction$delegate;
    public final ParcelableSnapshotMutableState title$delegate;
    public final TitleBarSubBinding value;

    public final class ActionBinding {
        public final TitleBarAction action;
        public final Function0 callback;

        public ActionBinding(TitleBarAction titleBarAction, Function0 function0) {
            this.action = titleBarAction;
            this.callback = function0;
        }

        public static ActionBinding copy$default(ActionBinding actionBinding, TitleBarAction titleBarAction, Function0 function0, int i) {
            if ((i & 1) != 0) {
                titleBarAction = actionBinding.action;
            }
            if ((i & 2) != 0) {
                function0 = actionBinding.callback;
            }
            actionBinding.getClass();
            return new ActionBinding(titleBarAction, function0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBinding)) {
                return false;
            }
            ActionBinding actionBinding = (ActionBinding) obj;
            return Intrinsics.areEqual(this.action, actionBinding.action) && Intrinsics.areEqual(this.callback, actionBinding.callback);
        }

        public final int hashCode() {
            TitleBarAction titleBarAction = this.action;
            int hashCode = (titleBarAction == null ? 0 : titleBarAction.hashCode()) * 31;
            Function0 function0 = this.callback;
            return hashCode + (function0 != null ? function0.hashCode() : 0);
        }

        public final String toString() {
            return "ActionBinding(action=" + this.action + ", callback=" + this.callback + ")";
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationIconType.values().length];
            try {
                NavigationIconType.Companion companion = NavigationIconType.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NavigationIconType.Companion companion2 = NavigationIconType.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleBarSubBinding(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.title$delegate = Updater.mutableStateOf$default(null);
        this.navigationIconType$delegate = Updater.mutableStateOf$default(null);
        this.navigationCallback$delegate = Updater.mutableStateOf$default(null);
        this.primaryAction$delegate = Updater.mutableStateOf$default(new ActionBinding(null, null));
        this.secondaryAction$delegate = Updater.mutableStateOf$default(new ActionBinding(null, null));
        this.value = this;
    }

    public final void Action$1(TitleBarActionScope titleBarActionScope, TitleBarAction titleBarAction, Function0 function0, Composer composer, int i) {
        int i2;
        TitleBarSubBinding titleBarSubBinding;
        GapComposer gapComposer;
        Icons icons;
        boolean z;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1532764932);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(titleBarActionScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(titleBarAction) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            titleBarSubBinding = this;
            i2 |= gapComposer2.changed(titleBarSubBinding) ? 2048 : 1024;
        } else {
            titleBarSubBinding = this;
        }
        if (!gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        } else {
            if (Intrinsics.areEqual(titleBarAction, AvatarAction.INSTANCE)) {
                gapComposer2.startReplaceGroup(186687137);
                gapComposer2.end(false);
                a$$ExternalSyntheticBUOutline0.m("Avatar actions are not supported in TitleBarSub. Use TitleBarCore instead.");
                return;
            }
            if (!(titleBarAction instanceof IconAction)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 186685838, false);
            }
            gapComposer2.startReplaceGroup(1492518372);
            IconAction iconAction = (IconAction) titleBarAction;
            ImageResource imageResource = iconAction.icon;
            if (imageResource instanceof ImageResource.Token) {
                zzd zzdVar = Icons.Companion;
                String str = ((ImageResource.Token) imageResource).id;
                zzdVar.getClass();
                icons = zzd.get(str);
            } else {
                icons = null;
            }
            if (icons == null) {
                gapComposer2.startReplaceGroup(1492518371);
                gapComposer2.end(false);
                gapComposer = gapComposer2;
                z = false;
            } else {
                gapComposer2.startReplaceGroup(1492518372);
                z = false;
                TransactorKt.IconAction(titleBarActionScope, icons, iconAction.label, function0, null, null, null, null, null, null, false, gapComposer2, (i2 & 14) | ((i2 << 3) & 7168), IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            }
            gapComposer.end(z);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(i, 7, titleBarSubBinding, titleBarActionScope, titleBarAction, function0, false);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        NavigationType navigationType;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-812821245);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String str = (String) this.title$delegate.getValue();
            NavigationIconType navigationIconType = (NavigationIconType) this.navigationIconType$delegate.getValue();
            int i3 = navigationIconType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[navigationIconType.ordinal()];
            if (i3 == -1) {
                navigationType = NavigationType.NONE;
            } else if (i3 == 1) {
                navigationType = NavigationType.BACK;
            } else {
                if (i3 != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                navigationType = NavigationType.CLOSE;
            }
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TitleBarSubBinding$$ExternalSyntheticLambda0(this, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(str, navigationType, (androidx.compose.ui.Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (androidx.compose.ui.Modifier) null, Expect_jvmKt.rememberComposableLambda(695455652, new BankingDialogKt$$ExternalSyntheticLambda8(this, 12), gapComposer), gapComposer, 1572864, 44);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(this, i, 28);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
