package coil3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcher.OnBackPressedEventInput;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableScatterSet;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory;
import androidx.compose.foundation.CombinedClickableNode;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.ScrollableAreaNode;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.HeightInLinesNode;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuKeys;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistryWrapper;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.unit.IntSize;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import androidx.room.util.DBUtil;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import androidx.work.Configuration;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.JobSchedulerExtKt;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.utils.EnqueueRunnable;
import app.cash.cdp.api.EventConsumer;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import app.cash.molecule.GatedFrameClock;
import app.cash.redwood.treehouse.RealTreehouseApp;
import app.cash.zipline.loader.LoaderAndroidKt;
import app.cash.zipline.loader.LoaderEventListener$None;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.network.okhttp.internal.CallFactoryNetworkClient;
import coil3.size.DimensionKt;
import com.bugsnag.android.internal.dag.ContextModule;
import com.fillr.m1;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.analytics.cdp.CdpAnalytics;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityZiplineManifestWatcher;
import com.squareup.cash.ui.MainActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.ChannelResult;
import okhttp3.Call;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Path;

/* loaded from: classes.dex */
public final /* synthetic */ class ImageLoader$Builder$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ImageLoader$Builder$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        int i;
        FrameworkSQLiteOpenHelper.OpenHelper openHelper;
        int i2 = this.$r8$classId;
        boolean z2 = true;
        int i3 = 0;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                m1 m1Var = new m1(5, false);
                m1.maxSizePercent$default(m1Var, (Context) ((ImageLoader$Builder) obj).application);
                return m1Var.build();
            case 1:
                return ((OnBackPressedDispatcher) obj).new OnBackPressedEventInput();
            case 2:
                Function0 function0 = ((CombinedClickableNode) obj).onLongClick;
                if (function0 != null) {
                    function0.invoke();
                }
                return Boolean.TRUE;
            case 3:
                ScrollableAreaNode scrollableAreaNode = (ScrollableAreaNode) obj;
                AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = (AndroidEdgeEffectOverscrollFactory) DepthSortedSetKt.currentValueOf(scrollableAreaNode, OverscrollKt.LocalOverscrollFactory);
                scrollableAreaNode.localOverscrollFactory = androidEdgeEffectOverscrollFactory;
                scrollableAreaNode.localOverscrollFactoryCreatedOverscrollEffect = androidEdgeEffectOverscrollFactory != null ? new AndroidEdgeEffectOverscrollEffect(androidEdgeEffectOverscrollFactory.context, androidEdgeEffectOverscrollFactory.density, androidEdgeEffectOverscrollFactory.glowColor, androidEdgeEffectOverscrollFactory.glowDrawPadding) : null;
                return Unit.INSTANCE;
            case 4:
                return (Rect) obj;
            case 5:
                return Long.valueOf(((SelectionRegistrarImpl) ((SelectionRegistrar) obj)).nextSelectableId());
            case 6:
                TypefaceResult typefaceResult = ((HeightInLinesNode) obj).fontResolutionState;
                if (typefaceResult == null) {
                    throw Recorder$$ExternalSyntheticOutline2.m("Font resolution state is not set.");
                }
                typefaceResult.getValue();
                return Unit.INSTANCE;
            case 7:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((MutableState) obj).getValue();
                if (layoutCoordinates != null) {
                    return layoutCoordinates;
                }
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 8:
                TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = (TextContextMenuToolbarHandlerNode) obj;
                if (textContextMenuToolbarHandlerNode.isAttached()) {
                    return TextContextMenuModifierKt.collectTextContextMenuData(textContextMenuToolbarHandlerNode);
                }
                TextContextMenuData textContextMenuData = TextContextMenuData.Empty;
                TextContextMenuKeys.getEmpty();
                return TextContextMenuData.Empty;
            case 9:
                TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = (TextFieldMagnifierNodeImpl28) obj;
                return (textFieldMagnifierNodeImpl28.visible || ((TextFieldSelectionState.InputType) textFieldMagnifierNodeImpl28.textFieldSelectionState.directDragGestureInitiator$delegate.getValue()) == TextFieldSelectionState.InputType.Touch) ? new Offset(DimensionKt.m1463calculateSelectionMagnifierCenterAndroidhUlJWOE(textFieldMagnifierNodeImpl28.textFieldState, textFieldMagnifierNodeImpl28.textFieldSelectionState, textFieldMagnifierNodeImpl28.textLayoutState, ((IntSize) textFieldMagnifierNodeImpl28.magnifierSize$delegate.getValue()).packedValue)) : new Offset(9205357640488583168L);
            case 10:
                TextAnnotatedStringNode textAnnotatedStringNode = (TextAnnotatedStringNode) obj;
                textAnnotatedStringNode.textSubstitution = null;
                DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateSemantics$ui();
                DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateMeasurements$ui();
                DepthSortedSetKt.invalidateDraw(textAnnotatedStringNode);
                return Boolean.TRUE;
            case 11:
                return ((GapComposer) obj).currentStackTrace();
            case 12:
                SaveableHolder saveableHolder = (SaveableHolder) obj;
                Saver saver = saveableHolder.saver;
                Object obj2 = saveableHolder.value;
                if (obj2 != null) {
                    return saver.save(saveableHolder, obj2);
                }
                a$$ExternalSyntheticBUOutline0.m$3("Value should be initialized");
                return null;
            case 13:
                SavedStateRegistryController savedStateRegistryController = ((SaveableStateRegistryWrapper) obj)._controller;
                if (savedStateRegistryController == null) {
                    return null;
                }
                EmptyMap.INSTANCE.getClass();
                Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
                savedStateRegistryController.performSave(bundleOf);
                if (bundleOf.isEmpty()) {
                    return null;
                }
                return bundleOf;
            case 14:
                SnapshotStateObserver snapshotStateObserver = (SnapshotStateObserver) obj;
                while (true) {
                    synchronized (snapshotStateObserver.observedScopeMapsLock) {
                        try {
                            if (!snapshotStateObserver.sendingNotifications) {
                                snapshotStateObserver.sendingNotifications = z2;
                                try {
                                    MutableVector mutableVector = snapshotStateObserver.observedScopeMaps;
                                    Object[] objArr = mutableVector.content;
                                    int i4 = mutableVector.size;
                                    int i5 = i3;
                                    while (i5 < i4) {
                                        try {
                                            SnapshotStateObserver.ObservedScopeMap observedScopeMap = (SnapshotStateObserver.ObservedScopeMap) objArr[i5];
                                            MutableScatterSet mutableScatterSet = observedScopeMap.invalidated;
                                            Function1 function1 = observedScopeMap.onChanged;
                                            Object[] objArr2 = mutableScatterSet.elements;
                                            long[] jArr = mutableScatterSet.metadata;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i6 = i3;
                                                while (true) {
                                                    long j = jArr[i6];
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i7 = 8;
                                                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                                                        int i9 = 0;
                                                        while (i9 < i8) {
                                                            if ((j & 255) < 128) {
                                                                i = i7;
                                                                function1.invoke(objArr2[(i6 << 3) + i9]);
                                                            } else {
                                                                i = i7;
                                                            }
                                                            j >>= i;
                                                            i9++;
                                                            i7 = i;
                                                        }
                                                        if (i8 != i7) {
                                                        }
                                                    }
                                                    if (i6 != length) {
                                                        i6++;
                                                    }
                                                }
                                            }
                                            mutableScatterSet.clear();
                                            i5++;
                                            i3 = 0;
                                        } catch (Throwable th) {
                                            th = th;
                                            z = 0;
                                            snapshotStateObserver.sendingNotifications = z;
                                            throw th;
                                        }
                                    }
                                    snapshotStateObserver.sendingNotifications = i3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = i3;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (!snapshotStateObserver.drainChanges()) {
                        return Unit.INSTANCE;
                    }
                    z2 = true;
                    i3 = 0;
                }
            case 15:
                View inflate = View.inflate((MainActivity) ((WorkLauncherImpl) obj).processor, R.layout.splash_screen_view, null);
                inflate.getClass();
                return (ViewGroup) inflate;
            case 16:
                return SavedStateHandleSupport.getSavedStateHandlesVM((ViewModelStoreOwner) obj);
            case 17:
                RoomDatabase roomDatabase = ((InvalidationTracker) obj).database;
                if (roomDatabase.inCompatibilityMode$room_runtime_release() && !roomDatabase.isOpenInternal()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 18:
                SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) obj;
                savedStateRegistryOwner.getLifecycle().addObserver(new Recreator(savedStateRegistryOwner, i3));
                return Unit.INSTANCE;
            case 19:
                FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = (FrameworkSQLiteOpenHelper) obj;
                String str = frameworkSQLiteOpenHelper.name;
                if (str == null || !frameworkSQLiteOpenHelper.useNoBackupDirectory) {
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.context, frameworkSQLiteOpenHelper.name, new Extras.Key(18), frameworkSQLiteOpenHelper.callback, frameworkSQLiteOpenHelper.allowDataLossOnRecovery);
                } else {
                    Context context = frameworkSQLiteOpenHelper.context;
                    context.getClass();
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.context, new File(noBackupFilesDir, str).getAbsolutePath(), new Extras.Key(18), frameworkSQLiteOpenHelper.callback, frameworkSQLiteOpenHelper.allowDataLossOnRecovery);
                }
                openHelper.setWriteAheadLoggingEnabled(frameworkSQLiteOpenHelper.writeAheadLoggingEnabled);
                return openHelper;
            case 20:
                WorkContinuationImpl workContinuationImpl = (WorkContinuationImpl) obj;
                String str2 = EnqueueRunnable.TAG;
                WorkManagerImpl workManagerImpl = workContinuationImpl.mWorkManagerImpl;
                HashSet hashSet = new HashSet();
                hashSet.addAll(workContinuationImpl.mIds);
                HashSet prerequisitesFor = WorkContinuationImpl.prerequisitesFor(workContinuationImpl);
                Iterator it = hashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hashSet.removeAll(workContinuationImpl.mIds);
                        z2 = false;
                    } else if (prerequisitesFor.contains((String) it.next())) {
                    }
                }
                if (z2) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("WorkContinuation has cycles (", workContinuationImpl, ")");
                    return null;
                }
                WorkDatabase workDatabase = workManagerImpl.mWorkDatabase;
                Configuration configuration = workManagerImpl.mConfiguration;
                workDatabase.beginTransaction();
                try {
                    DBUtil.checkContentUriTriggerWorkerLimits(workDatabase, configuration, workContinuationImpl);
                    boolean processContinuation = EnqueueRunnable.processContinuation(workContinuationImpl);
                    workDatabase.setTransactionSuccessful();
                    if (processContinuation) {
                        Schedulers.schedule(configuration, workManagerImpl.mWorkDatabase, workManagerImpl.mSchedulers);
                    }
                    return Unit.INSTANCE;
                } finally {
                    workDatabase.endTransaction();
                }
            case 21:
                WorkManagerImpl workManagerImpl2 = (WorkManagerImpl) obj;
                WorkDatabase workDatabase2 = workManagerImpl2.mWorkDatabase;
                Context context2 = workManagerImpl2.mContext;
                String str3 = SystemJobScheduler.TAG;
                if (Build.VERSION.SDK_INT >= 34) {
                    JobSchedulerExtKt.getWmJobScheduler(context2).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context2.getSystemService("jobscheduler");
                ArrayList pendingJobs = SystemJobScheduler.getPendingJobs(context2, jobScheduler);
                if (pendingJobs != null && !pendingJobs.isEmpty()) {
                    Iterator it2 = pendingJobs.iterator();
                    while (it2.hasNext()) {
                        SystemJobScheduler.cancelJobById(jobScheduler, ((JobInfo) it2.next()).getId());
                    }
                }
                ((Number) DBUtil.performBlocking(workDatabase2.workSpecDao().__db, false, true, new TransactorKt$$ExternalSyntheticLambda0(24))).intValue();
                Schedulers.schedule(workManagerImpl2.mConfiguration, workDatabase2, workManagerImpl2.mSchedulers);
                return Unit.INSTANCE;
            case 22:
                GatedFrameClock gatedFrameClock = (GatedFrameClock) obj;
                if (gatedFrameClock.isRunning) {
                    ChannelResult.m4192getOrThrowimpl(gatedFrameClock.frameSends.mo1159trySendJP2dKIU(Unit.INSTANCE));
                }
                return Unit.INSTANCE;
            case 23:
                RealTreehouseApp.Factory factory = (RealTreehouseApp.Factory) obj;
                ContextModule contextModule = factory.platform;
                String str4 = factory.cacheName;
                LoaderEventListener$None loaderEventListener$None = factory.loaderEventListener;
                Context context3 = contextModule.ctx;
                JvmSystemFileSystem jvmSystemFileSystem = FileSystem.SYSTEM;
                String str5 = Path.DIRECTORY_SEPARATOR;
                File dir = context3.getDir(str4, 0);
                dir.getClass();
                return LoaderAndroidKt.ZiplineCache(context3, jvmSystemFileSystem, Path.Companion.get(dir, false), loaderEventListener$None);
            case 24:
                return CollectionsKt__CollectionsJVMKt.listOf((Pair) obj);
            case 25:
                return CallFactoryNetworkClient.m1460boximpl((Call.Factory) obj);
            case 26:
                final DrawablePainter drawablePainter = (DrawablePainter) obj;
                return new Drawable.Callback() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1
                    @Override // android.graphics.drawable.Drawable.Callback
                    public final void invalidateDrawable(Drawable drawable) {
                        drawable.getClass();
                        DrawablePainter drawablePainter2 = DrawablePainter.this;
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = drawablePainter2.drawInvalidateTick$delegate;
                        parcelableSnapshotMutableState.setValue(Integer.valueOf(((Number) parcelableSnapshotMutableState.getValue()).intValue() + 1));
                        Drawable drawable2 = drawablePainter2.drawable;
                        Lazy lazy = DrawablePainterKt.MAIN_HANDLER$delegate;
                        drawablePainter2.drawableIntrinsicSize$delegate.setValue(new Size((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : DimensionKt.Size(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                    }

                    @Override // android.graphics.drawable.Drawable.Callback
                    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
                        drawable.getClass();
                        runnable.getClass();
                        ((Handler) DrawablePainterKt.MAIN_HANDLER$delegate.getValue()).postAtTime(runnable, j2);
                    }

                    @Override // android.graphics.drawable.Drawable.Callback
                    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                        drawable.getClass();
                        runnable.getClass();
                        ((Handler) DrawablePainterKt.MAIN_HANDLER$delegate.getValue()).removeCallbacks(runnable);
                    }
                };
            case 27:
                return (EventConsumer) ((CdpAnalytics) obj).eventConsumerProvider.invoke();
            case 28:
                String string2 = Settings.Secure.getString(((Context) obj).getContentResolver(), "android_id");
                if (string2 != null) {
                    return string2;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Required system value ANDROID_ID not present");
                return null;
            default:
                return ((ActivityZiplineManifestWatcher) obj).latestZiplineManifest;
        }
    }
}
