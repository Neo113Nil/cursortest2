package androidx.compose.runtime;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import androidx.activity.FullyDrawnReporter;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1;
import androidx.activity.compose.ComposeBackHandler;
import androidx.activity.compose.ReportDrawnComposition;
import androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2;
import androidx.activity.compose.internal.BackHandlerDispatcherCompat;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition$animateTo$1$1$1;
import androidx.compose.animation.core.Transition$animateTo$lambda$2$0$$inlined$onDispose$1;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.PaddingNode;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda3;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.AsyncFontListLoader;
import androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult;
import androidx.compose.ui.text.font.DefaultFontFamily;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao_Impl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao_Impl;
import app.cash.broadway.ui.compose.DialogEventDispatcher;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.play.integrity.internal.ax;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage$$ExternalSyntheticLambda0;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.views.InAppNotificationView;
import com.squareup.cash.appmessages.views.RealAppMessageImageLoader;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.badging.db.BadgeCountQueries$ForGroupQuery;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.checks.CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1;
import com.squareup.cash.core.navigationcontainer.UiContainer;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import com.squareup.protos.franklin.common.InstrumentLinkingConfig;
import com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig;
import com.squareup.util.Strings;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.wire.GrpcMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class Recomposer$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Recomposer$$ExternalSyntheticLambda4(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final Object invoke$androidx$compose$ui$text$font$TypefaceRequestCache$$ExternalSyntheticLambda0(Object obj) {
        WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) this.f$0;
        TypefaceRequest typefaceRequest = (TypefaceRequest) this.f$1;
        TypefaceResult typefaceResult = (TypefaceResult) obj;
        synchronized (((Trifle) workLauncherImpl.processor)) {
            try {
                boolean cacheable = typefaceResult.getCacheable();
                LruCache lruCache = (LruCache) workLauncherImpl.workTaskExecutor;
                if (cacheable) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x071f  */
    /* JADX WARN: Type inference failed for: r1v58, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        Pair pair;
        Object async;
        Object invoke;
        Object obj2;
        List list;
        Typeface m130createAndroidTypefaceApi28RetOiIg;
        TypefaceResult.Immutable immutable;
        SQLiteStatement prepare;
        ContentTransform contentTransform;
        Integer num;
        int i = 5;
        int i2 = 3;
        int i3 = 4;
        int i4 = 2;
        switch (this.$r8$classId) {
            case 0:
                CompositionImpl compositionImpl = (CompositionImpl) this.f$0;
                MutableScatterSet mutableScatterSet = (MutableScatterSet) this.f$1;
                compositionImpl.recordWriteOf(obj);
                if (mutableScatterSet != null) {
                    mutableScatterSet.add(obj);
                }
                return Unit.INSTANCE;
            case 1:
                BackHandlerDispatcherCompat backHandlerDispatcherCompat = (BackHandlerDispatcherCompat) this.f$0;
                ComposeBackHandler composeBackHandler = (ComposeBackHandler) this.f$1;
                backHandlerDispatcherCompat.addHandler(composeBackHandler);
                return new BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1(0, backHandlerDispatcherCompat, composeBackHandler);
            case 2:
                FullyDrawnReporter fullyDrawnReporter = (FullyDrawnReporter) this.f$0;
                Function0 function0 = (Function0) this.f$1;
                synchronized (fullyDrawnReporter.lock) {
                    z = fullyDrawnReporter.reportedFullyDrawn;
                }
                return z ? new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                    }
                } : new ReportDrawnKt$ReportDrawnWhen$lambda$1$0$$inlined$onDispose$2(new ReportDrawnComposition(fullyDrawnReporter, function0), 0);
            case 3:
                JobKt.launch$default((CoroutineScope) this.f$0, null, CoroutineStart.UNDISPATCHED, new Transition$animateTo$1$1$1((Transition) this.f$1, null), 1);
                return new Transition$animateTo$lambda$2$0$$inlined$onDispose$1();
            case 4:
                Transition transition = (Transition) this.f$0;
                Transition transition2 = (Transition) this.f$1;
                transition._transitions.add(transition2);
                return new BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1(1, transition, transition2);
            case 5:
                return new BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1(i4, (Transition) this.f$0, (Transition.DeferredAnimation) this.f$1);
            case 6:
                AndroidPath androidPath = (AndroidPath) this.f$0;
                Brush brush = (Brush) this.f$1;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.drawContent();
                DrawScope.m744drawPathGBMwjPU$default(layoutNodeDrawScope, androidPath, brush, RecyclerView.DECELERATION_RATE, null, 60);
                return Unit.INSTANCE;
            case 7:
                ((MutableInteractionSourceImpl) this.f$0).tryEmit((Interaction) this.f$1);
                return Unit.INSTANCE;
            case 8:
                PaddingNode paddingNode = (PaddingNode) this.f$0;
                Placeable placeable = (Placeable) this.f$1;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                boolean z2 = paddingNode.rtlAware;
                float f = paddingNode.start;
                if (z2) {
                    placementScope.placeRelative(placeable, placementScope.mo230roundToPx0680j_4(f), placementScope.mo230roundToPx0680j_4(paddingNode.top), RecyclerView.DECELERATION_RATE);
                } else {
                    placementScope.place(placeable, placementScope.mo230roundToPx0680j_4(f), placementScope.mo230roundToPx0680j_4(paddingNode.top), RecyclerView.DECELERATION_RATE);
                }
                return Unit.INSTANCE;
            case 9:
                WindowInsetsHolder windowInsetsHolder = (WindowInsetsHolder) this.f$0;
                View view = (View) this.f$1;
                windowInsetsHolder.incrementAccessors(view);
                return new BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1(i2, windowInsetsHolder, view);
            case 10:
                Recomposer recomposer = (Recomposer) this.f$0;
                Throwable th = (Throwable) this.f$1;
                Throwable th2 = (Throwable) obj;
                synchronized (recomposer.stateLock) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    recomposer.closeCause = th;
                    StateFlowImpl stateFlowImpl = recomposer._state;
                    Recomposer.State state = Recomposer.State.ShutDown;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, state);
                }
                return Unit.INSTANCE;
            case 11:
                FontFamilyResolverImpl fontFamilyResolverImpl = (FontFamilyResolverImpl) this.f$0;
                TypefaceRequest typefaceRequest = (TypefaceRequest) this.f$1;
                Function1 function1 = (Function1) obj;
                FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = fontFamilyResolverImpl.fontListFontFamilyTypefaceAdapter;
                ax axVar = fontFamilyResolverImpl.platformFontLoader;
                CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = fontFamilyResolverImpl.createDefaultTypeface;
                fontListFontFamilyTypefaceAdapter.getClass();
                FontFamily fontFamily = typefaceRequest.fontFamily;
                if (fontFamily instanceof FontListFontFamily) {
                    List list2 = ((FontListFontFamily) fontFamily).fonts;
                    FontWeight fontWeight = typefaceRequest.fontWeight;
                    int i5 = typefaceRequest.fontStyle;
                    ArrayList arrayList = new ArrayList(list2.size());
                    List list3 = list2;
                    int size = list3.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        Object obj3 = list2.get(i6);
                        ResourceFont resourceFont = (ResourceFont) obj3;
                        if (Intrinsics.areEqual(resourceFont.weight, fontWeight) && resourceFont.style == i5) {
                            arrayList.add(obj3);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list3.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            Object obj4 = list2.get(i7);
                            if (((ResourceFont) obj4).style == i5) {
                                arrayList2.add(obj4);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list2 = arrayList2;
                        }
                        List list4 = list2;
                        int compareTo = fontWeight.compareTo(FontWeight.W400);
                        int i8 = fontWeight.weight;
                        if (compareTo < 0) {
                            List list5 = list4;
                            int size3 = list5.size();
                            FontWeight fontWeight2 = null;
                            FontWeight fontWeight3 = null;
                            int i9 = 0;
                            while (true) {
                                if (i9 < size3) {
                                    FontWeight fontWeight4 = ((ResourceFont) list4.get(i9)).weight;
                                    int i10 = fontWeight4.weight;
                                    if (Intrinsics.compare(i10, i8) < 0) {
                                        if (fontWeight2 == null || Intrinsics.compare(i10, fontWeight2.weight) > 0) {
                                            fontWeight2 = fontWeight4;
                                        }
                                    } else if (Intrinsics.compare(i10, i8) <= 0) {
                                        fontWeight2 = fontWeight4;
                                        fontWeight3 = fontWeight2;
                                    } else if (fontWeight3 == null || Intrinsics.compare(i10, fontWeight3.weight) < 0) {
                                        fontWeight3 = fontWeight4;
                                    }
                                    i9++;
                                }
                            }
                            if (fontWeight2 == null) {
                                fontWeight2 = fontWeight3;
                            }
                            arrayList = new ArrayList(list4.size());
                            int size4 = list5.size();
                            for (int i11 = 0; i11 < size4; i11++) {
                                Object obj5 = list4.get(i11);
                                if (Intrinsics.areEqual(((ResourceFont) obj5).weight, fontWeight2)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            FontWeight fontWeight5 = FontWeight.W500;
                            if (fontWeight.compareTo(fontWeight5) > 0) {
                                List list6 = list4;
                                int size5 = list6.size();
                                FontWeight fontWeight6 = null;
                                FontWeight fontWeight7 = null;
                                int i12 = 0;
                                while (true) {
                                    if (i12 < size5) {
                                        FontWeight fontWeight8 = ((ResourceFont) list4.get(i12)).weight;
                                        int i13 = fontWeight8.weight;
                                        if (Intrinsics.compare(i13, i8) < 0) {
                                            if (fontWeight6 == null || Intrinsics.compare(i13, fontWeight6.weight) > 0) {
                                                fontWeight6 = fontWeight8;
                                            }
                                        } else if (Intrinsics.compare(i13, i8) <= 0) {
                                            fontWeight6 = fontWeight8;
                                            fontWeight7 = fontWeight6;
                                        } else if (fontWeight7 == null || Intrinsics.compare(i13, fontWeight7.weight) < 0) {
                                            fontWeight7 = fontWeight8;
                                        }
                                        i12++;
                                    }
                                }
                                if (fontWeight7 != null) {
                                    fontWeight6 = fontWeight7;
                                }
                                arrayList = new ArrayList(list4.size());
                                int size6 = list6.size();
                                for (int i14 = 0; i14 < size6; i14++) {
                                    Object obj6 = list4.get(i14);
                                    if (Intrinsics.areEqual(((ResourceFont) obj6).weight, fontWeight6)) {
                                        arrayList.add(obj6);
                                    }
                                }
                            } else {
                                List list7 = list4;
                                int size7 = list7.size();
                                FontWeight fontWeight9 = null;
                                FontWeight fontWeight10 = null;
                                int i15 = 0;
                                while (true) {
                                    if (i15 < size7) {
                                        FontWeight fontWeight11 = ((ResourceFont) list4.get(i15)).weight;
                                        list = list7;
                                        if (Intrinsics.compare(fontWeight11.weight, fontWeight5.weight) <= 0) {
                                            int i16 = fontWeight11.weight;
                                            if (Intrinsics.compare(i16, i8) < 0) {
                                                if (fontWeight9 == null || Intrinsics.compare(i16, fontWeight9.weight) > 0) {
                                                    fontWeight9 = fontWeight11;
                                                }
                                            } else if (Intrinsics.compare(i16, i8) <= 0) {
                                                fontWeight9 = fontWeight11;
                                                fontWeight10 = fontWeight9;
                                            } else if (fontWeight10 == null || Intrinsics.compare(i16, fontWeight10.weight) < 0) {
                                                fontWeight10 = fontWeight11;
                                            }
                                        }
                                        i15++;
                                        list7 = list;
                                    } else {
                                        list = list7;
                                    }
                                }
                                if (fontWeight10 != null) {
                                    fontWeight9 = fontWeight10;
                                }
                                ArrayList arrayList3 = new ArrayList(list4.size());
                                int size8 = list.size();
                                for (int i17 = 0; i17 < size8; i17++) {
                                    Object obj7 = list4.get(i17);
                                    if (Intrinsics.areEqual(((ResourceFont) obj7).weight, fontWeight9)) {
                                        arrayList3.add(obj7);
                                    }
                                }
                                if (arrayList3.isEmpty()) {
                                    FontWeight fontWeight12 = FontWeight.W500;
                                    int size9 = list.size();
                                    FontWeight fontWeight13 = null;
                                    FontWeight fontWeight14 = null;
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < size9) {
                                            FontWeight fontWeight15 = ((ResourceFont) list4.get(i18)).weight;
                                            if (fontWeight12 == null || Intrinsics.compare(fontWeight15.weight, fontWeight12.weight) >= 0) {
                                                int i19 = fontWeight15.weight;
                                                if (Intrinsics.compare(i19, i8) < 0) {
                                                    if (fontWeight13 == null || Intrinsics.compare(i19, fontWeight13.weight) > 0) {
                                                        fontWeight13 = fontWeight15;
                                                    }
                                                } else if (Intrinsics.compare(i19, i8) <= 0) {
                                                    fontWeight13 = fontWeight15;
                                                    fontWeight14 = fontWeight13;
                                                } else if (fontWeight14 == null || Intrinsics.compare(i19, fontWeight14.weight) < 0) {
                                                    fontWeight14 = fontWeight15;
                                                }
                                            }
                                            i18++;
                                        }
                                    }
                                    if (fontWeight14 != null) {
                                        fontWeight13 = fontWeight14;
                                    }
                                    arrayList = new ArrayList(list4.size());
                                    int size10 = list.size();
                                    for (int i20 = 0; i20 < size10; i20++) {
                                        Object obj8 = list4.get(i20);
                                        if (Intrinsics.areEqual(((ResourceFont) obj8).weight, fontWeight13)) {
                                            arrayList.add(obj8);
                                        }
                                    }
                                } else {
                                    arrayList = arrayList3;
                                }
                            }
                        }
                    }
                    GrpcMethod grpcMethod = fontListFontFamilyTypefaceAdapter.asyncTypefaceCache;
                    if (arrayList.size() > 0) {
                        final ResourceFont resourceFont2 = (ResourceFont) arrayList.get(0);
                        resourceFont2.getClass();
                        synchronized (((Trifle) grpcMethod.responseAdapter)) {
                            try {
                                axVar.getClass();
                                Object obj9 = new Object(resourceFont2) { // from class: androidx.compose.ui.text.font.AsyncTypefaceCache$Key
                                    public final ResourceFont font;

                                    {
                                        this.font = resourceFont2;
                                    }

                                    public final boolean equals(Object obj10) {
                                        if (this == obj10) {
                                            return true;
                                        }
                                        return (obj10 instanceof AsyncTypefaceCache$Key) && Intrinsics.areEqual(this.font, ((AsyncTypefaceCache$Key) obj10).font);
                                    }

                                    public final int hashCode() {
                                        return this.font.hashCode() * 31;
                                    }

                                    public final String toString() {
                                        return "Key(font=" + this.font + ", loaderKey=null)";
                                    }
                                };
                                AsyncTypefaceCache$AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult = (AsyncTypefaceCache$AsyncTypefaceResult) ((LruCache) grpcMethod.path).get(obj9);
                                if (asyncTypefaceCache$AsyncTypefaceResult == null) {
                                    asyncTypefaceCache$AsyncTypefaceResult = (AsyncTypefaceCache$AsyncTypefaceResult) ((MutableScatterMap) grpcMethod.requestAdapter).get(obj9);
                                }
                                if (asyncTypefaceCache$AsyncTypefaceResult != null) {
                                    obj2 = asyncTypefaceCache$AsyncTypefaceResult.result;
                                } else {
                                    try {
                                        invoke = axVar.loadBlocking(resourceFont2);
                                    } catch (Exception unused) {
                                        invoke = cashApp$$ExternalSyntheticLambda2.invoke(typefaceRequest);
                                    }
                                    grpcMethod.getClass();
                                    axVar.getClass();
                                    Object obj10 = new Object(resourceFont2) { // from class: androidx.compose.ui.text.font.AsyncTypefaceCache$Key
                                        public final ResourceFont font;

                                        {
                                            this.font = resourceFont2;
                                        }

                                        public final boolean equals(Object obj102) {
                                            if (this == obj102) {
                                                return true;
                                            }
                                            return (obj102 instanceof AsyncTypefaceCache$Key) && Intrinsics.areEqual(this.font, ((AsyncTypefaceCache$Key) obj102).font);
                                        }

                                        public final int hashCode() {
                                            return this.font.hashCode() * 31;
                                        }

                                        public final String toString() {
                                            return "Key(font=" + this.font + ", loaderKey=null)";
                                        }
                                    };
                                    synchronized (((Trifle) grpcMethod.responseAdapter)) {
                                        try {
                                            if (invoke == null) {
                                                ((MutableScatterMap) grpcMethod.requestAdapter).set(obj10, new AsyncTypefaceCache$AsyncTypefaceResult(null));
                                            } else {
                                                ((LruCache) grpcMethod.path).put(obj10, new AsyncTypefaceCache$AsyncTypefaceResult(invoke));
                                            }
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                    obj2 = invoke;
                                }
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        if (obj2 == null) {
                            obj2 = cashApp$$ExternalSyntheticLambda2.invoke(typefaceRequest);
                        }
                        pair = new Pair(null, TransactorKt.m1174synthesizeTypefaceFxwP2eA(typefaceRequest.fontSynthesis, obj2, resourceFont2, typefaceRequest.fontWeight, typefaceRequest.fontStyle));
                    } else {
                        pair = new Pair(null, cashApp$$ExternalSyntheticLambda2.invoke(typefaceRequest));
                    }
                    List list8 = (List) pair.first;
                    Object obj11 = pair.second;
                    if (list8 == null) {
                        async = new TypefaceResult.Immutable(obj11, true);
                    } else {
                        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list8, obj11, typefaceRequest, fontListFontFamilyTypefaceAdapter.asyncTypefaceCache, function1, axVar);
                        JobKt.launch$default(fontListFontFamilyTypefaceAdapter.asyncLoadScope, null, CoroutineStart.UNDISPATCHED, new ThumbNode$onAttach$1(asyncFontListLoader, (Continuation) null, 28), 1);
                        async = new TypefaceResult.Async(asyncFontListLoader);
                    }
                } else {
                    async = null;
                }
                if (async != null) {
                    return async;
                }
                Object obj12 = fontFamilyResolverImpl.platformFamilyTypefaceAdapter.imageLoader;
                FontFamily fontFamily2 = typefaceRequest.fontFamily;
                int i21 = typefaceRequest.fontStyle;
                FontWeight fontWeight16 = typefaceRequest.fontWeight;
                if (fontFamily2 == null || (fontFamily2 instanceof DefaultFontFamily)) {
                    m130createAndroidTypefaceApi28RetOiIg = Lock.m130createAndroidTypefaceApi28RetOiIg(null, fontWeight16, i21);
                } else if (fontFamily2 instanceof GenericFontFamily) {
                    m130createAndroidTypefaceApi28RetOiIg = Lock.m130createAndroidTypefaceApi28RetOiIg(((GenericFontFamily) fontFamily2).name, fontWeight16, i21);
                } else {
                    if (!(fontFamily2 instanceof LoadedFontFamily)) {
                        immutable = null;
                        if (immutable == null) {
                            return immutable;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("Could not load font");
                        return null;
                    }
                    m130createAndroidTypefaceApi28RetOiIg = ((LoadedFontFamily) fontFamily2).getTypeface().m117getNativeTypefacePYhJU0U();
                }
                immutable = new TypefaceResult.Immutable(m130createAndroidTypefaceApi28RetOiIg, true);
                if (immutable == null) {
                }
                break;
            case 12:
                return invoke$androidx$compose$ui$text$font$TypefaceRequestCache$$ExternalSyntheticLambda0(obj);
            case 13:
                StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) this.f$0;
                ProducerScope producerScope = (ProducerScope) this.f$1;
                standaloneCoroutine.cancel(null);
                ((ProducerCoroutine) producerScope).mo1159trySendJP2dKIU((ConstraintsState) obj);
                return Unit.INSTANCE;
            case 14:
                PreferenceDao_Impl preferenceDao_Impl = (PreferenceDao_Impl) this.f$0;
                Preference preference = (Preference) this.f$1;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                preferenceDao_Impl.__insertAdapterOfPreference.insert(sQLiteConnection, preference);
                return Unit.INSTANCE;
            case 15:
                SystemIdInfoDao_Impl systemIdInfoDao_Impl = (SystemIdInfoDao_Impl) this.f$0;
                SystemIdInfo systemIdInfo = (SystemIdInfo) this.f$1;
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                systemIdInfoDao_Impl.__insertAdapterOfSystemIdInfo.insert(sQLiteConnection2, systemIdInfo);
                return Unit.INSTANCE;
            case 16:
                WorkNameDao_Impl workNameDao_Impl = (WorkNameDao_Impl) this.f$0;
                WorkName workName = (WorkName) this.f$1;
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                workNameDao_Impl.__insertAdapterOfWorkName.insert(sQLiteConnection3, workName);
                return Unit.INSTANCE;
            case 17:
                WorkInfo.State state2 = (WorkInfo.State) this.f$0;
                String str = (String) this.f$1;
                SQLiteConnection sQLiteConnection4 = (SQLiteConnection) obj;
                sQLiteConnection4.getClass();
                prepare = sQLiteConnection4.prepare("UPDATE workspec SET state=? WHERE id=?");
                try {
                    prepare.bindLong(1, TransactorKt.stateToInt(state2));
                    prepare.bindText(2, str);
                    prepare.step();
                    int totalChangedRows = DimensionKt.getTotalChangedRows(sQLiteConnection4);
                    prepare.close();
                    return Integer.valueOf(totalChangedRows);
                } finally {
                }
            case 18:
                Data data = (Data) this.f$0;
                String str2 = (String) this.f$1;
                SQLiteConnection sQLiteConnection5 = (SQLiteConnection) obj;
                sQLiteConnection5.getClass();
                prepare = sQLiteConnection5.prepare("UPDATE workspec SET output=? WHERE id=?");
                try {
                    Data data2 = Data.EMPTY;
                    prepare.bindBlob(1, Strings.toByteArrayInternalV1(data));
                    prepare.bindText(2, str2);
                    prepare.step();
                    prepare.close();
                    return Unit.INSTANCE;
                } finally {
                }
            case 19:
                WorkSpecDao_Impl workSpecDao_Impl = (WorkSpecDao_Impl) this.f$0;
                WorkSpec workSpec = (WorkSpec) this.f$1;
                SQLiteConnection sQLiteConnection6 = (SQLiteConnection) obj;
                sQLiteConnection6.getClass();
                workSpecDao_Impl.__insertAdapterOfWorkSpec.insert(sQLiteConnection6, workSpec);
                return Unit.INSTANCE;
            case 20:
                WorkTagDao_Impl workTagDao_Impl = (WorkTagDao_Impl) this.f$0;
                WorkTag workTag = (WorkTag) this.f$1;
                SQLiteConnection sQLiteConnection7 = (SQLiteConnection) obj;
                sQLiteConnection7.getClass();
                workTagDao_Impl.__insertAdapterOfWorkTag.insert(sQLiteConnection7, workTag);
                return Unit.INSTANCE;
            case 21:
                DialogEventDispatcher dialogEventDispatcher = (DialogEventDispatcher) this.f$0;
                Function1 function12 = (Function1) this.f$1;
                ((DisposableEffectScope) obj).getClass();
                dialogEventDispatcher.getClass();
                function12.getClass();
                dialogEventDispatcher.eventListeners.add(function12);
                return new BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1(i3, dialogEventDispatcher, function12);
            case 22:
                BadgeCountQueries$ForGroupQuery badgeCountQueries$ForGroupQuery = (BadgeCountQueries$ForGroupQuery) this.f$0;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) this.f$1;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                InlineMessage.Placement placement = (InlineMessage.Placement) badgeCountQueries$ForGroupQuery.group_name;
                androidStatement.bindString(0, placement != null ? (String) ((EnumColumnAdapter) ((Reward$Adapter) localTabContentQueries.local_tab_contentAdapter).program_detail_rowsAdapter).encode(placement) : null);
                return Unit.INSTANCE;
            case 23:
                BadgeCountQueries$ForGroupQuery badgeCountQueries$ForGroupQuery2 = (BadgeCountQueries$ForGroupQuery) this.f$0;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) this.f$1;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                PopupMessage.Placement placement2 = (PopupMessage.Placement) badgeCountQueries$ForGroupQuery2.group_name;
                androidStatement2.bindString(0, placement2 != null ? (String) ((EnumColumnAdapter) ((Reward$Adapter) localTabContentQueries2.local_tab_contentAdapter).program_detail_rowsAdapter).encode(placement2) : null);
                return Unit.INSTANCE;
            case 24:
                ArrayMap arrayMap = (ArrayMap) this.f$0;
                Function1 function13 = (Function1) this.f$1;
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                textLayoutResult.getClass();
                MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
                float lineTop = multiParagraph.getLineTop(0);
                float lineBottom = multiParagraph.getLineBottom(0);
                arrayMap.put(AlignmentLinesKt.FirstLineCenter, Integer.valueOf(MathKt__MathJVMKt.roundToInt((lineBottom - lineTop) / 2.0f)));
                arrayMap.put(AlignmentLinesKt.FirstLineTop, Integer.valueOf(MathKt__MathJVMKt.roundToInt(lineTop)));
                arrayMap.put(AlignmentLinesKt.FirstLineBottom, Integer.valueOf(MathKt__MathJVMKt.roundToInt(lineBottom)));
                function13.invoke(textLayoutResult);
                return Unit.INSTANCE;
            case 25:
                HeartBeatInfoStorage$$ExternalSyntheticLambda0 heartBeatInfoStorage$$ExternalSyntheticLambda0 = (HeartBeatInfoStorage$$ExternalSyntheticLambda0) this.f$0;
                UiContainer uiContainer = (UiContainer) this.f$1;
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                ContentTransform contentTransform2 = (ContentTransform) heartBeatInfoStorage$$ExternalSyntheticLambda0.invoke(animatedContentTransitionScopeImpl);
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = contentTransform2.targetContentZIndex$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = uiContainer.swipeActivePage$delegate;
                NavigationModel.Ready.Swipe.Page page = (NavigationModel.Ready.Swipe.Page) parcelableSnapshotMutableState.getValue();
                NavigationModel.Ready.Swipe.Page page2 = NavigationModel.Ready.Swipe.Page.SidePanel;
                if (page == page2 && ((NavigationModel.Ready.FullScreenLocation) animatedContentTransitionScopeImpl.getInitialState()).showTabs && !((NavigationModel.Ready.FullScreenLocation) animatedContentTransitionScopeImpl.getTargetState()).showTabs) {
                    contentTransform = new ContentTransform(contentTransform2.targetContentEnter, ExitTransitionImpl.KeepUntilTransitionsFinished, parcelableSnapshotMutableFloatState.getFloatValue(), 8);
                } else {
                    if (((NavigationModel.Ready.Swipe.Page) parcelableSnapshotMutableState.getValue()) != page2 || ((NavigationModel.Ready.FullScreenLocation) animatedContentTransitionScopeImpl.getInitialState()).showTabs || !((NavigationModel.Ready.FullScreenLocation) animatedContentTransitionScopeImpl.getTargetState()).showTabs) {
                        return contentTransform2;
                    }
                    contentTransform = new ContentTransform(EnterTransitionImpl.None, contentTransform2.initialContentExit, parcelableSnapshotMutableFloatState.getFloatValue() - 1.0f, 8);
                }
                return contentTransform;
            case 26:
                AtomicReference atomicReference = (AtomicReference) this.f$0;
                OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) this.f$1;
                ((DisposableEffectScope) obj).getClass();
                atomicReference.set(onBackPressedDispatcher);
                return new BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1(i, atomicReference, onBackPressedDispatcher);
            case 27:
                AtomicReference atomicReference2 = (AtomicReference) this.f$0;
                OnBackListener onBackListener = (OnBackListener) this.f$1;
                ((DisposableEffectScope) obj).getClass();
                atomicReference2.set(onBackListener);
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(26, atomicReference2, onBackListener);
            case 28:
                RealAppMessageImageLoader realAppMessageImageLoader = (RealAppMessageImageLoader) this.f$0;
                Function1 function14 = (Function1) this.f$1;
                Context context = (Context) obj;
                context.getClass();
                InAppNotificationView inAppNotificationView = new InAppNotificationView(context, realAppMessageImageLoader);
                inAppNotificationView.setVisibility(8);
                inAppNotificationView.setEventReceiver(new SnapshotKt$$ExternalSyntheticLambda3(i3, function14));
                return inAppNotificationView;
            default:
                RealAppConfigManager$$ExternalSyntheticLambda1 realAppConfigManager$$ExternalSyntheticLambda1 = (RealAppConfigManager$$ExternalSyntheticLambda1) this.f$0;
                InstrumentQueries instrumentQueries = (InstrumentQueries) this.f$1;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                String string2 = androidCursor.getString(0);
                String string3 = androidCursor.getString(1);
                String string4 = androidCursor.getString(2);
                String string5 = androidCursor.getString(3);
                String string6 = androidCursor.getString(4);
                String string7 = androidCursor.getString(5);
                Long l = androidCursor.getLong(6);
                Boolean bool = androidCursor.getBoolean(7);
                Long l2 = androidCursor.getLong(8);
                if (l2 != null) {
                    long longValue = l2.longValue();
                    ((ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter).getClass();
                    num = Integer.valueOf((int) longValue);
                } else {
                    num = null;
                }
                Boolean bool2 = androidCursor.getBoolean(9);
                Boolean bool3 = androidCursor.getBoolean(10);
                Boolean bool4 = androidCursor.getBoolean(11);
                String string8 = androidCursor.getString(12);
                InstrumentLinkingConfig.IssuedCardDisabledStyle issuedCardDisabledStyle = string8 != null ? (InstrumentLinkingConfig.IssuedCardDisabledStyle) ((ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter).client_scenarioAdapter.decode(string8) : null;
                Boolean bool5 = androidCursor.getBoolean(13);
                InstrumentLinkingConfig.IssuedCardDisabledStyle issuedCardDisabledStyle2 = issuedCardDisabledStyle;
                Boolean bool6 = androidCursor.getBoolean(14);
                ?? bytes = androidCursor.getBytes(15);
                BankAccountLinkingConfig bankAccountLinkingConfig = bytes != 0 ? (BankAccountLinkingConfig) ((ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter).scenario_planAdapter.decode(bytes) : null;
                AndroidStringManager androidStringManager = realAppConfigManager$$ExternalSyntheticLambda1.f$0.stringManager;
                if (string2 == null) {
                    string2 = androidStringManager.get(R.string.instrument_config_add_bank_title);
                }
                String str3 = string2;
                if (string3 == null) {
                    string3 = androidStringManager.get(R.string.instrument_config_add_bank_description);
                }
                String str4 = string3;
                if (string4 == null) {
                    string4 = androidStringManager.get(R.string.instrument_config_faster_title);
                }
                String str5 = string4;
                if (string5 == null) {
                    string5 = androidStringManager.get(R.string.instrument_config_faster_description);
                }
                String str6 = string5;
                if (string6 == null) {
                    string6 = androidStringManager.get(R.string.instrument_config_add_card_title);
                }
                return new com.squareup.cash.db.InstrumentLinkingConfig(str3, str4, str5, str6, string6, string7 == null ? androidStringManager.get(R.string.instrument_config_add_card_description) : string7, l != null ? l.longValue() : 0L, bool != null ? bool.booleanValue() : false, num != null ? num.intValue() : 0, bool2 != null ? bool2.booleanValue() : false, bool3 != null ? bool3.booleanValue() : false, bool4 != null ? bool4.booleanValue() : false, issuedCardDisabledStyle2 == null ? ProtoDefaults.ISSUED_CARD_DISABLED_STYLE : issuedCardDisabledStyle2, bool5 != null ? bool5.booleanValue() : false, bool6 != null ? bool6.booleanValue() : false, bankAccountLinkingConfig);
        }
    }
}
