package androidx.compose.foundation.text.contextmenu.internal;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuKeys;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.media3.ui.PlayerView;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.google.android.material.button.MaterialButtonGroup$$ExternalSyntheticLambda1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferedChannel;
import papa.PapaEvent;

/* loaded from: classes.dex */
public final class AndroidTextContextMenuToolbarProvider implements TextContextMenuProvider {
    public ActionMode actionMode;
    public final Function1 callbackInjector;
    public final Function0 coordinatesProvider;
    public Runnable finishActionModeRunnable;
    public AFd1wSDK$$ExternalSyntheticLambda2 startActionModeRunnable;
    public final View view;
    public final MutatorMutex mutatorMutex = new MutatorMutex();
    public final SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda0(this, 0));
    public final AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda0 onDataChange = new AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda0(this, 1);
    public final AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda0 onPositionChange = new AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda0(this, 2);

    /* loaded from: classes3.dex */
    public final class TextActionModeCallbackImpl {
        public final AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3 dataBuilder;
        public final AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3 positioner;
        public final TextContextMenuSessionImpl session;
        public final View view;

        public TextActionModeCallbackImpl(TextContextMenuSessionImpl textContextMenuSessionImpl, AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3 androidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3, AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3 androidTextContextMenuToolbarProvider$$ExternalSyntheticLambda32, View view) {
            this.session = textContextMenuSessionImpl;
            this.dataBuilder = androidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3;
            this.positioner = androidTextContextMenuToolbarProvider$$ExternalSyntheticLambda32;
            this.view = view;
        }

        public final boolean updateMenuItems(Menu menu) {
            int i;
            TextContextMenuData textContextMenuData = (TextContextMenuData) this.dataBuilder.invoke();
            final int i2 = 0;
            if (Intrinsics.areEqual(textContextMenuData, (Object) null)) {
                return false;
            }
            menu.clear();
            List list = textContextMenuData.components;
            int size = list.size();
            final int i3 = 1;
            int i4 = 0;
            int i5 = 1;
            int i6 = 1;
            while (i4 < size) {
                TextContextMenuComponent textContextMenuComponent = (TextContextMenuComponent) list.get(i4);
                if (textContextMenuComponent instanceof TextContextMenuItem) {
                    i = i5 + 1;
                    Object obj = textContextMenuComponent.key;
                    final TextContextMenuItem textContextMenuItem = (TextContextMenuItem) textContextMenuComponent;
                    MenuItem add = menu.add(i6, Intrinsics.areEqual(obj, TextContextMenuKeys.CutKey) ? R.id.cut : Intrinsics.areEqual(obj, TextContextMenuKeys.CopyKey) ? R.id.copy : Intrinsics.areEqual(obj, TextContextMenuKeys.PasteKey) ? R.id.paste : Intrinsics.areEqual(obj, TextContextMenuKeys.SelectAllKey) ? R.id.selectAll : Intrinsics.areEqual(obj, TextContextMenuKeys.AutofillKey) ? R.id.autofill : i5, i5, textContextMenuItem.label);
                    add.setShowAsAction(2);
                    add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi28$$ExternalSyntheticLambda0
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            int i7 = i3;
                            Object obj2 = this;
                            Object obj3 = textContextMenuItem;
                            switch (i7) {
                                case 0:
                                    Context context = (Context) obj3;
                                    TextClassification textClassification = (TextClassification) obj2;
                                    String text = textClassification.getText();
                                    PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                    if (Build.VERSION.SDK_INT < 34) {
                                        activity.send();
                                        break;
                                    } else {
                                        PlayerView.Api34.sendIntentAllowBackgroundActivityStart(activity);
                                        break;
                                    }
                                default:
                                    ((TextContextMenuItem) obj3).onClick.invoke(((AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl) obj2).session);
                                    break;
                            }
                            return true;
                        }
                    });
                } else if (textContextMenuComponent instanceof TextContextMenuTextClassificationItem) {
                    i = i5 + 1;
                    final Context context = this.view.getContext();
                    TextContextMenuTextClassificationItem textContextMenuTextClassificationItem = (TextContextMenuTextClassificationItem) textContextMenuComponent;
                    final TextClassification textClassification = textContextMenuTextClassificationItem.textClassification;
                    int i7 = textContextMenuTextClassificationItem.index;
                    if (i7 < 0) {
                        MenuItem add2 = menu.add(R.id.textAssist, R.id.textAssist, i5, textClassification.getLabel());
                        add2.setShowAsAction(2);
                        add2.setIcon(textClassification.getIcon());
                        add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextToolbarHelperApi28$$ExternalSyntheticLambda0
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                int i72 = i2;
                                Object obj2 = textClassification;
                                Object obj3 = context;
                                switch (i72) {
                                    case 0:
                                        Context context2 = (Context) obj3;
                                        TextClassification textClassification2 = (TextClassification) obj2;
                                        String text = textClassification2.getText();
                                        PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                        if (Build.VERSION.SDK_INT < 34) {
                                            activity.send();
                                            break;
                                        } else {
                                            PlayerView.Api34.sendIntentAllowBackgroundActivityStart(activity);
                                            break;
                                        }
                                    default:
                                        ((TextContextMenuItem) obj3).onClick.invoke(((AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl) obj2).session);
                                        break;
                                }
                                return true;
                            }
                        });
                    } else {
                        int i8 = i7 == 0 ? 1 : i2;
                        RemoteAction remoteAction = textClassification.getActions().get(i7);
                        MenuItem add3 = menu.add(R.id.textAssist, i8 != 0 ? 16908353 : i2, i5, remoteAction.getTitle());
                        add3.setShowAsAction(i8 == 0 ? 0 : 2);
                        if (i8 != 0 || remoteAction.shouldShowIcon()) {
                            add3.setIcon(remoteAction.getIcon().loadDrawable(context));
                        }
                        add3.setOnMenuItemClickListener(new MaterialButtonGroup$$ExternalSyntheticLambda1(remoteAction, i3));
                    }
                } else {
                    if (textContextMenuComponent instanceof TextContextMenuSeparator) {
                        i6++;
                    }
                    i4++;
                    i2 = 0;
                }
                i5 = i;
                i4++;
                i2 = 0;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public final class TextContextMenuSessionImpl implements TextContextMenuSession {
        public final BufferedChannel channel = PapaEvent.Channel$default(0, null, null, 7);

        @Override // androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession
        public final void close() {
            this.channel.mo1159trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    public AndroidTextContextMenuToolbarProvider(View view, Function1 function1, Function0 function0) {
        this.view = view;
        this.callbackInjector = function1;
        this.coordinatesProvider = function0;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider
    public final Object showTextContextMenu(TextContextMenuDataProvider textContextMenuDataProvider, SuspendLambda suspendLambda) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, new PagingDataPresenter$collectFrom$2(this, textContextMenuDataProvider, null, 4), suspendLambda);
        return mutate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? mutate$default : Unit.INSTANCE;
    }
}
