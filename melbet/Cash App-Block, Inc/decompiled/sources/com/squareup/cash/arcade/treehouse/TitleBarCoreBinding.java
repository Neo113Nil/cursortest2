package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import app.cash.arcade.values.AvatarAction;
import app.cash.arcade.values.IconAction;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.TitleBarAction;
import app.cash.broadway.ui.Ui;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.tabs.viewmodels.TabToolbarBadgeViewModel$Dot;
import com.squareup.cash.tabs.viewmodels.TabToolbarBadgeViewModel$Text;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class TitleBarCoreBinding extends AbstractComposeView implements Ui, Widget {
    public final ParcelableSnapshotMutableState endPrimaryAction$delegate;
    public final ParcelableSnapshotMutableState endSecondaryAction$delegate;
    public Ui.EventReceiver eventReceiver;
    public final RealImageLoader imageLoader;
    public Modifier modifier;
    public final ParcelableSnapshotMutableState startAction$delegate;
    public final ParcelableSnapshotMutableState tabToolbarInternalViewModel$delegate;
    public final ParcelableSnapshotMutableState title$delegate;
    public final TitleBarCoreBinding value;

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

    public TitleBarCoreBinding(Context context, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        this.imageLoader = realImageLoader;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.title$delegate = Updater.mutableStateOf$default(null);
        this.startAction$delegate = Updater.mutableStateOf$default(new ActionBinding(null, null));
        this.endPrimaryAction$delegate = Updater.mutableStateOf$default(new ActionBinding(null, null));
        this.endSecondaryAction$delegate = Updater.mutableStateOf$default(new ActionBinding(null, null));
        this.tabToolbarInternalViewModel$delegate = Updater.mutableStateOf$default(TabToolbarInternalViewModel.EMPTY);
        this.value = this;
    }

    public final void Action(TitleBarActionScope titleBarActionScope, TitleBarAction titleBarAction, Function0 function0, Composer composer, int i) {
        int i2;
        Icons icons;
        boolean z;
        Object obj;
        String m;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1014524982);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(titleBarActionScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(titleBarAction) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(this) ? 2048 : 1024;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.skipToGroupEnd();
        } else if (Intrinsics.areEqual(titleBarAction, AvatarAction.INSTANCE)) {
            gapComposer.startReplaceGroup(29095114);
            TabToolbarInternalViewModel.ProfileButton profileButton = ((TabToolbarInternalViewModel) this.tabToolbarInternalViewModel$delegate.getValue()).profileButton;
            if (profileButton == null) {
                gapComposer.startReplaceGroup(29095113);
                gapComposer.end(false);
                z2 = false;
            } else {
                String str = profileButton.activeAccountCashtag;
                TransactorKt transactorKt = profileButton.badge;
                gapComposer.startReplaceGroup(29095114);
                if (profileButton.photoUrl != null) {
                    gapComposer.startReplaceGroup(-2042237785);
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(-543448289, new BankingDialog$$ExternalSyntheticLambda1(6, titleBarActionScope, profileButton, this), gapComposer), gapComposer, 56);
                    gapComposer.end(false);
                    z2 = false;
                } else {
                    gapComposer.startReplaceGroup(-2041929304);
                    boolean changed = gapComposer.changed(transactorKt);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        if (transactorKt == null) {
                            obj = null;
                        } else if (transactorKt.equals(TabToolbarBadgeViewModel$Dot.INSTANCE)) {
                            obj = Badge.Small.INSTANCE;
                        } else {
                            if (!(transactorKt instanceof TabToolbarBadgeViewModel$Text)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            obj = new Badge.Large(profileButton.badgeCount);
                        }
                        gapComposer.updateRememberedValue(obj);
                        rememberedValue = obj;
                    }
                    Badge badge = (Badge) rememberedValue;
                    Icons icons2 = Icons.NavigationAccount;
                    if (str != null) {
                        gapComposer.startReplaceGroup(-2041440279);
                        m = Room.stringResource(R.string.tab_menu_account, new Object[]{str}, gapComposer);
                        gapComposer.end(false);
                    } else {
                        m = re$$ExternalSyntheticOutline0.m(gapComposer, -2041319193, R.string.tab_menu_account_default, gapComposer, false);
                    }
                    int i3 = i2 & 7168;
                    boolean changedInstance = (i3 == 2048) | gapComposer.changedInstance(profileButton);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BankingDialogKt$$ExternalSyntheticLambda5(17, this, profileButton);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function02 = (Function0) rememberedValue2;
                    boolean z3 = i3 == 2048;
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (z3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new TitleBarCoreBinding$$ExternalSyntheticLambda3(this, 3);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    int i4 = (i2 & 14) | 48;
                    z2 = false;
                    TransactorKt.IconAction(titleBarActionScope, icons2, m, function02, null, (Function0) rememberedValue3, badge, null, null, null, false, gapComposer, i4, 968);
                    gapComposer.end(false);
                }
                gapComposer.end(z2);
            }
            gapComposer.end(z2);
        } else {
            if (!(titleBarAction instanceof IconAction)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 935866, false);
            }
            gapComposer.startReplaceGroup(30576170);
            IconAction iconAction = (IconAction) titleBarAction;
            ImageResource imageResource = iconAction.icon;
            if (imageResource instanceof ImageResource.Token) {
                zzd zzdVar = Icons.Companion;
                String str2 = ((ImageResource.Token) imageResource).id;
                zzdVar.getClass();
                icons = zzd.get(str2);
            } else {
                icons = null;
            }
            if (icons == null) {
                gapComposer.startReplaceGroup(30576169);
                gapComposer.end(false);
                z = false;
            } else {
                gapComposer.startReplaceGroup(30576170);
                int i5 = (i2 & 14) | ((i2 << 3) & 7168);
                z = false;
                TransactorKt.IconAction(titleBarActionScope, icons, iconAction.label, function0, null, null, null, null, null, null, false, gapComposer, i5, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(i, 6, this, titleBarActionScope, titleBarAction, function0, false);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1390673533);
        int i2 = 4;
        int i3 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            androidx.compose.ui.Modifier consumeWindowInsets = OffsetKt.consumeWindowInsets(Modifier.Companion.$$INSTANCE, Arrangement$End$1.current(gapComposer).systemBars);
            String str = (String) this.title$delegate.getValue();
            TitleBarAction titleBarAction = ((ActionBinding) this.startAction$delegate.getValue()).action;
            if (titleBarAction == null) {
                gapComposer.startReplaceGroup(300871039);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(300871040);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1196000494, new BankingDialogKt$$ExternalSyntheticLambda2(i2, this, titleBarAction), gapComposer);
                gapComposer.end(false);
            }
            Trace.TitleBarCore(str, consumeWindowInsets, (DynamicColorConfiguration) null, rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(598074941, new BankingDialogKt$$ExternalSyntheticLambda8(this, 11), gapComposer), gapComposer, 24576);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(this, i, 27);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final app.cash.redwood.Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(TabToolbarInternalViewModel tabToolbarInternalViewModel) {
        tabToolbarInternalViewModel.getClass();
        this.tabToolbarInternalViewModel$delegate.setValue(tabToolbarInternalViewModel);
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(app.cash.redwood.Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
