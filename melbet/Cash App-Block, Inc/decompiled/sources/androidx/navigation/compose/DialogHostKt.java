package androidx.navigation.compose;

import androidx.compose.material3.DatePickerKt$DatePicker$6;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.DialogNavigator;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.squareup.cash.presenters.AliasFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class DialogHostKt {
    public static final void DialogHost(DialogNavigator dialogNavigator, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(294589392);
        if ((((gapComposer.changedInstance(dialogNavigator) ? 4 : 2) | i) & 3) == 2 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            SaveableStateHolderImpl rememberSaveableStateHolder = SaverKt.rememberSaveableStateHolder(gapComposer);
            Continuation continuation = null;
            MutableState collectAsState = Updater.collectAsState(dialogNavigator.getState().backStack, null, gapComposer, 1);
            Object obj = (Collection) ((List) collectAsState.getValue());
            boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            boolean changed = gapComposer.changed(obj);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            Object obj3 = rememberedValue;
            if (changed || rememberedValue == obj2) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) obj) {
                    if (booleanValue ? true : ((NavBackStackEntry) obj4).impl.lifecycle.state.isAtLeast(Lifecycle.State.STARTED)) {
                        arrayList.add(obj4);
                    }
                }
                snapshotStateList.addAll(arrayList);
                gapComposer.updateRememberedValue(snapshotStateList);
                obj3 = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj3;
            int i2 = 0;
            PopulateVisibleList(snapshotStateList2, (List) collectAsState.getValue(), gapComposer, 0);
            MutableState collectAsState2 = Updater.collectAsState(dialogNavigator.getState().transitionsInProgress, null, gapComposer, 1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj2) {
                rememberedValue2 = new SnapshotStateList();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) rememberedValue2;
            gapComposer.startReplaceGroup(-367418626);
            ListIterator listIterator = snapshotStateList2.listIterator();
            while (true) {
                StateListIterator stateListIterator = (StateListIterator) listIterator;
                if (!stateListIterator.hasNext()) {
                    break;
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) stateListIterator.next();
                NavDestination navDestination = navBackStackEntry.destination;
                navDestination.getClass();
                DialogNavigator.Destination destination = (DialogNavigator.Destination) navDestination;
                boolean changedInstance = gapComposer.changedInstance(dialogNavigator) | gapComposer.changedInstance(navBackStackEntry);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == obj2) {
                    rememberedValue3 = new DialogHostKt$$ExternalSyntheticLambda0(i2, dialogNavigator, navBackStackEntry);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                AliasFormatter.Dialog((Function0) rememberedValue3, destination.dialogProperties, Expect_jvmKt.rememberComposableLambda(1129586364, new DatePickerKt$DatePicker$6(navBackStackEntry, dialogNavigator, rememberSaveableStateHolder, snapshotStateList3, destination, 3), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
            }
            gapComposer.end(false);
            Set set = (Set) collectAsState2.getValue();
            boolean changed2 = gapComposer.changed(collectAsState2) | gapComposer.changedInstance(dialogNavigator);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue4 == obj2) {
                Object animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2(collectAsState2, dialogNavigator, snapshotStateList3, continuation, 6);
                snapshotStateList3 = snapshotStateList3;
                gapComposer.updateRememberedValue(animatedImageDecoder$wrapDrawable$2);
                rememberedValue4 = animatedImageDecoder$wrapDrawable$2;
            }
            Updater.LaunchedEffect(set, snapshotStateList3, (Function2) rememberedValue4, gapComposer);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HintHandler$$ExternalSyntheticLambda0(dialogNavigator, i, 20);
        }
    }

    public static final void PopulateVisibleList(List list, Collection collection, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1537894851);
        if ((((gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changedInstance(collection) ? 32 : 16)) & 19) == 18 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
                LifecycleRegistry lifecycleRegistry = navBackStackEntry.impl.lifecycle;
                boolean changed = gapComposer.changed(booleanValue) | gapComposer.changedInstance(list) | gapComposer.changedInstance(navBackStackEntry);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new DialogHostKt$$ExternalSyntheticLambda2(navBackStackEntry, booleanValue, list, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.DisposableEffect(lifecycleRegistry, (Function1) rememberedValue, gapComposer);
            }
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda0(list, collection, i, 26);
        }
    }
}
