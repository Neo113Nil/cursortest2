package app.cash.redwood.treehouse;

import androidx.camera.video.Recorder;
import androidx.camera.view.PreviewView;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterSet;
import androidx.profileinstaller.DeviceProfileWriter;
import androidx.work.impl.StartStopTokensImpl;
import app.cash.arcade.protocol.host.ArcadeHostProtocol;
import app.cash.arcade.protocol.host.arcade.AccessibilityActionImpl;
import app.cash.arcade.protocol.host.arcade.AccessibilityEnabledImpl;
import app.cash.arcade.protocol.host.arcade.AccessibilityLabelImpl;
import app.cash.arcade.protocol.host.arcade.AccessibilityRoleImpl;
import app.cash.arcade.protocol.host.arcade.BackgroundColorImpl;
import app.cash.arcade.protocol.host.arcade.CornerRadiusImpl;
import app.cash.arcade.protocol.host.arcade.LoadingScreenImpl;
import app.cash.arcade.protocol.host.arcade.ReuseImpl;
import app.cash.arcade.protocol.host.redwoodlayout.FlexImpl;
import app.cash.arcade.protocol.host.redwoodlayout.GrowImpl;
import app.cash.arcade.protocol.host.redwoodlayout.HeightImpl;
import app.cash.arcade.protocol.host.redwoodlayout.HorizontalAlignmentImpl;
import app.cash.arcade.protocol.host.redwoodlayout.MarginImpl;
import app.cash.arcade.protocol.host.redwoodlayout.ShrinkImpl;
import app.cash.arcade.protocol.host.redwoodlayout.SizeImpl;
import app.cash.arcade.protocol.host.redwoodlayout.VerticalAlignmentImpl;
import app.cash.arcade.protocol.host.redwoodlayout.WidthImpl;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import app.cash.redwood.Modifier;
import app.cash.redwood.leaks.NoOpLeakDetector;
import app.cash.redwood.protocol.Change;
import app.cash.redwood.protocol.ChangesSink;
import app.cash.redwood.protocol.ChildrenChange;
import app.cash.redwood.protocol.Create;
import app.cash.redwood.protocol.Id;
import app.cash.redwood.protocol.ModifierChange;
import app.cash.redwood.protocol.ModifierElement;
import app.cash.redwood.protocol.PropertyChange;
import app.cash.redwood.protocol.RedwoodVersion;
import app.cash.redwood.protocol.host.HostProtocolAdapter$ReuseNode;
import app.cash.redwood.protocol.host.NodeReuseKt;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.UiChange;
import app.cash.redwood.protocol.host.UiChildrenChange;
import app.cash.redwood.protocol.host.UiCreate;
import app.cash.redwood.protocol.host.UiModifierChange;
import app.cash.redwood.protocol.host.UiPropertyChange;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import app.cash.redwood.treehouse.CodeState;
import app.cash.redwood.ui.core.api.FocusRequester;
import app.cash.redwood.widget.ChangeListener;
import app.cash.redwood.widget.Widget;
import app.cash.zipline.ZiplineScope;
import app.cash.zipline.ZiplineService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$2;
import coil3.disk.DiskLruCache$launchCleanup$1;
import coil3.svg.internal.AndroidSvg;
import com.caverock.androidsvg.SVG;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.m1;
import com.squareup.cash.arcade.treehouse.CarouselBinding;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout$$ExternalSyntheticLambda3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonImpl;
import kotlinx.serialization.json.internal.WriteModeKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ViewContentCodeBinding implements ZiplineService, ChangesSink, TreehouseView$SaveCallback, ZiplineTreehouseUi$Host {
    public final ContextScope bindingScope;
    public boolean canceled;
    public final ArrayDeque changesAwaitingInitView;
    public RealTreehouseApp$codeHost$1 codeHostOrNull;
    public final ZiplineCodeSession codeSession;
    public CashTreehouseLayout$$ExternalSyntheticLambda3 contentSource;
    public int deliveredChangeCount;
    public final AndroidTreehouseDispatchers dispatchers;
    public final SVG eventBridge;
    public final MutableStateFlow externalStateFlow;
    public DeviceProfileWriter hostAdapterOrNull;
    public boolean initViewCalled;
    public final MutableStateFlow internalStateFlow;
    public final NoOpLeakDetector leakDetector;
    public final m1 onBackPressedDispatcher;
    public final Recorder.AnonymousClass6 serviceScope;
    public StateSnapshot stateSnapshot;
    public final StartStopTokensImpl stateStore;
    public ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService treehouseUiOrNull;
    public final SequentialStateFlow uiConfigurationFlow;
    public TreehouseLayout viewOrNull;

    public ViewContentCodeBinding(RealTreehouseApp$codeHost$1 realTreehouseApp$codeHost$1, AndroidTreehouseDispatchers androidTreehouseDispatchers, CashTreehouseLayout$$ExternalSyntheticLambda3 cashTreehouseLayout$$ExternalSyntheticLambda3, StateFlowImpl stateFlowImpl, StateFlowImpl stateFlowImpl2, ZiplineCodeSession ziplineCodeSession, m1 m1Var, StateFlow stateFlow, NoOpLeakDetector noOpLeakDetector) {
        realTreehouseApp$codeHost$1.getClass();
        stateFlowImpl.getClass();
        stateFlowImpl2.getClass();
        ziplineCodeSession.getClass();
        m1Var.getClass();
        stateFlow.getClass();
        this.dispatchers = androidTreehouseDispatchers;
        this.internalStateFlow = stateFlowImpl;
        this.externalStateFlow = stateFlowImpl2;
        this.codeSession = ziplineCodeSession;
        this.onBackPressedDispatcher = m1Var;
        this.leakDetector = noOpLeakDetector;
        this.codeHostOrNull = realTreehouseApp$codeHost$1;
        this.stateStore = realTreehouseApp$codeHost$1.stateStore;
        this.uiConfigurationFlow = new SequentialStateFlow(stateFlow);
        CoroutineContext coroutineContext = ziplineCodeSession.scope.coroutineContext;
        ContextScope CoroutineScope = JobKt.CoroutineScope(coroutineContext.plus(new SupervisorJobImpl(JobKt.getJob(coroutineContext))));
        this.bindingScope = CoroutineScope;
        this.serviceScope = new Recorder.AnonymousClass6(new ZiplineScope(), 28);
        this.contentSource = cashTreehouseLayout$$ExternalSyntheticLambda3;
        ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl = androidTreehouseDispatchers.zipline;
        SVG svg = new SVG(6);
        svg.rootElement = executorCoroutineDispatcherImpl;
        svg.cssRules = CoroutineScope;
        this.eventBridge = svg;
        this.changesAwaitingInitView = new ArrayDeque();
    }

    @Override // app.cash.redwood.treehouse.ZiplineTreehouseUi$Host
    public final CancellableService addOnBackPressedCallback(OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService) {
        AndroidTreehouseDispatchers androidTreehouseDispatchers = this.dispatchers;
        androidTreehouseDispatchers.checkZipline();
        final StandaloneCoroutine launch$default = JobKt.launch$default(this.bindingScope, androidTreehouseDispatchers.zipline, null, new RealImageLoader$execute$2(onBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService, this, (Continuation) null, 18), 2);
        return new CancellableService() { // from class: app.cash.redwood.treehouse.ViewContentCodeBinding$addOnBackPressedCallback$1
            @Override // app.cash.redwood.ui.Cancellable
            public final void cancel() {
                ViewContentCodeBinding.this.dispatchers.checkZipline();
                launch$default.cancel(null);
            }

            @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
            public final void close() {
                cancel();
            }
        };
    }

    public final void cancel(Throwable th) {
        AndroidTreehouseDispatchers.checkUi();
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        DeviceProfileWriter deviceProfileWriter = this.hostAdapterOrNull;
        Continuation continuation = null;
        if (deviceProfileWriter != null) {
            ArrayDeque arrayDeque = (ArrayDeque) deviceProfileWriter.mApkName;
            deviceProfileWriter.mDeviceSupportsAotProfile = true;
            MutableIntObjectMap mutableIntObjectMap = (MutableIntObjectMap) deviceProfileWriter.mDesiredVersion;
            Object[] objArr = mutableIntObjectMap.values;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((ProtocolNode) objArr[(i << 3) + i3]).detach();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            mutableIntObjectMap.clear();
            Iterator<E> it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((ProtocolNode) it.next()).detach();
            }
            arrayDeque.clear();
            deviceProfileWriter.mProfile = null;
        }
        this.hostAdapterOrNull = null;
        TreehouseLayout treehouseLayout = this.viewOrNull;
        if (treehouseLayout != null) {
            UnleashContext unleashContext = treehouseLayout.children;
            if (th != null) {
                RealTreehouseApp$codeHost$1 realTreehouseApp$codeHost$1 = this.codeHostOrNull;
                realTreehouseApp$codeHost$1.getClass();
                unleashContext.remove(0, ((ArrayList) unleashContext.properties).size());
                CarouselBinding carouselBinding = new CarouselBinding(treehouseLayout.dynamicContentWidgetFactory.mContext, 6);
                carouselBinding.value = new WandScene$ring$3(0, realTreehouseApp$codeHost$1, RealTreehouseApp$codeHost$1.class, "restart", "restart()V", 0, 7);
                unleashContext.insert(0, carouselBinding);
            }
            treehouseLayout.setSaveCallback(null);
        }
        this.viewOrNull = null;
        this.codeHostOrNull = null;
        SVG svg = this.eventBridge;
        svg.cssRules = null;
        svg.rootElement = null;
        JobKt.launch(this.bindingScope, this.dispatchers.zipline, CoroutineStart.ATOMIC, new DiskLruCache$launchCleanup$1(this, continuation, 23));
    }

    @Override // app.cash.redwood.treehouse.ZiplineTreehouseUi$Host
    public final StateSnapshot getStateSnapshot() {
        return this.stateSnapshot;
    }

    @Override // app.cash.redwood.treehouse.ZiplineTreehouseUi$Host
    public final StateFlow getUiConfigurations() {
        return this.uiConfigurationFlow;
    }

    @Override // app.cash.redwood.treehouse.ZiplineTreehouseUi$Host
    public final void hideSoftwareKeyboard() {
    }

    public final void initView(TreehouseLayout treehouseLayout, boolean z) {
        treehouseLayout.getClass();
        AndroidTreehouseDispatchers.checkUi();
        if (this.initViewCalled) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        this.initViewCalled = true;
        if (this.canceled) {
            return;
        }
        this.viewOrNull = treehouseLayout;
        treehouseLayout.setSaveCallback(this);
        boolean z2 = false;
        while (true) {
            List list = (List) this.changesAwaitingInitView.removeFirstOrNull();
            if (list == null) {
                break;
            }
            receiveChangesOnUiDispatcher(list);
            z2 = true;
        }
        if (!z || z2) {
            return;
        }
        TreehouseAppContentKt.access$showLoading(treehouseLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void receiveChangesOnUiDispatcher(List list) {
        long j;
        long j2;
        List<UiChange> list2;
        char c;
        int i;
        int i2;
        long j3;
        Object[] objArr;
        Object[] objArr2;
        long j4;
        int i3;
        int i4;
        HostProtocolAdapter$ReuseNode hostProtocolAdapter$ReuseNode;
        int size;
        int i5;
        MutableIntObjectMap mutableIntObjectMap;
        int i6;
        ProtocolNode protocolNode;
        int i7;
        ProtocolNode protocolNode2;
        List list3 = list;
        if (this.canceled) {
            return;
        }
        TreehouseLayout treehouseLayout = this.viewOrNull;
        if (treehouseLayout == null) {
            this.changesAwaitingInitView.addLast(list3);
            updateChangeCount();
            return;
        }
        DeviceProfileWriter deviceProfileWriter = this.hostAdapterOrNull;
        if (deviceProfileWriter == null) {
            String str = this.codeSession._guestProtocolVersion;
            RedwoodVersion redwoodVersion = str != null ? new RedwoodVersion(str) : null;
            if (redwoodVersion == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Cannot access guest version before ziplineStart");
                return;
            } else {
                DeviceProfileWriter deviceProfileWriter2 = new DeviceProfileWriter(redwoodVersion.value, treehouseLayout.children, this.codeSession.hostProtocol, treehouseLayout.widgetSystem, this.eventBridge, this.leakDetector);
                this.hostAdapterOrNull = deviceProfileWriter2;
                deviceProfileWriter = deviceProfileWriter2;
            }
        }
        int i8 = this.deliveredChangeCount;
        this.deliveredChangeCount = i8 + 1;
        int i9 = 0;
        if (i8 == 0) {
            UnleashContext unleashContext = treehouseLayout.children;
            unleashContext.remove(0, ((ArrayList) unleashContext.properties).size());
        }
        updateChangeCount();
        MutableIntObjectMap mutableIntObjectMap2 = (MutableIntObjectMap) deviceProfileWriter.mDesiredVersion;
        ArrayDeque arrayDeque = (ArrayDeque) deviceProfileWriter.mApkName;
        ArcadeHostProtocol arcadeHostProtocol = (ArcadeHostProtocol) deviceProfileWriter.mDiagnostics;
        MutableScatterSet mutableScatterSet = (MutableScatterSet) deviceProfileWriter.mCurProfile;
        if (deviceProfileWriter.mDeviceSupportsAotProfile) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return;
        }
        if (arrayDeque.isEmpty()) {
            c = 7;
            i = 1;
            j = 128;
            j2 = 255;
        } else {
            MutableIntObjectMap mutableIntObjectMap3 = IntObjectMapKt.EmptyIntObjectMap;
            MutableIntObjectMap mutableIntObjectMap4 = new MutableIntObjectMap();
            Id.Companion.getClass();
            Iterator it = list3.iterator();
            int i10 = 0;
            j = 128;
            while (true) {
                j2 = 255;
                if (!it.hasNext()) {
                    break;
                }
                UiChange uiChange = (UiChange) it.next();
                if (uiChange instanceof UiCreate) {
                    i10 = ((UiCreate) uiChange).id;
                } else if (uiChange instanceof UiModifierChange) {
                    UiModifierChange uiModifierChange = (UiModifierChange) uiChange;
                    if (uiModifierChange.reuse && i10 == uiModifierChange.id) {
                        mutableIntObjectMap4.set(i10, new HostProtocolAdapter$ReuseNode(i10, -1, -1, -1));
                    }
                }
            }
            if (mutableIntObjectMap4._size != 0) {
                while (true) {
                    list2 = list3;
                    int i11 = i9;
                    int i12 = i11;
                    c = 7;
                    for (UiChange uiChange2 : list2) {
                        int i13 = i12 + 1;
                        UiChildrenChange uiChildrenChange = uiChange2 instanceof UiChildrenChange ? (UiChildrenChange) uiChange2 : null;
                        ChildrenChange childrenChange = uiChildrenChange != null ? uiChildrenChange.change : null;
                        ChildrenChange.Add add = childrenChange instanceof ChildrenChange.Add ? (ChildrenChange.Add) childrenChange : null;
                        if (add != null) {
                            int i14 = add._childId;
                            HostProtocolAdapter$ReuseNode hostProtocolAdapter$ReuseNode2 = (HostProtocolAdapter$ReuseNode) mutableIntObjectMap4.get(add._id);
                            if (hostProtocolAdapter$ReuseNode2 != null && !mutableIntObjectMap4.containsKey(i14)) {
                                HostProtocolAdapter$ReuseNode hostProtocolAdapter$ReuseNode3 = new HostProtocolAdapter$ReuseNode(add._childId, add._tag, add.index, i12);
                                mutableIntObjectMap4.set(i14, hostProtocolAdapter$ReuseNode3);
                                hostProtocolAdapter$ReuseNode2.children.add(hostProtocolAdapter$ReuseNode3);
                                i11 = 1;
                            }
                        }
                        i12 = i13;
                    }
                    i = 1;
                    i2 = 8;
                    j3 = -9187201950435737472L;
                    if (i11 == 0) {
                        break;
                    } else {
                        i9 = 0;
                    }
                }
                int i15 = 0;
                for (UiChange uiChange3 : list2) {
                    int i16 = i15 + 1;
                    if (uiChange3 instanceof UiCreate) {
                        UiCreate uiCreate = (UiCreate) uiChange3;
                        HostProtocolAdapter$ReuseNode hostProtocolAdapter$ReuseNode4 = (HostProtocolAdapter$ReuseNode) mutableIntObjectMap4.get(uiCreate.id);
                        if (hostProtocolAdapter$ReuseNode4 != null) {
                            hostProtocolAdapter$ReuseNode4.changeIndexForCreate = i15;
                            hostProtocolAdapter$ReuseNode4.widgetTag = uiCreate.tag;
                        }
                    } else if (uiChange3 instanceof UiChildrenChange) {
                        ChildrenChange childrenChange2 = ((UiChildrenChange) uiChange3).change;
                        if (!(childrenChange2 instanceof ChildrenChange.Add) && (hostProtocolAdapter$ReuseNode = (HostProtocolAdapter$ReuseNode) mutableIntObjectMap4.get(childrenChange2.mo1368getId0HhLjSo())) != null) {
                            hostProtocolAdapter$ReuseNode.eligibleForReuse = false;
                            i15 = i16;
                        }
                    }
                    i15 = i16;
                }
                int i17 = 0;
                UiChange[] uiChangeArr = (UiChange[]) list3.toArray(new UiChange[0]);
                Object[] objArr3 = mutableIntObjectMap4.values;
                long[] jArr = mutableIntObjectMap4.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j5 = jArr[i18];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i19 = 8 - ((~(i18 - length)) >>> 31);
                            int i20 = i17;
                            while (i20 < i19) {
                                if ((j5 & 255) < 128) {
                                    HostProtocolAdapter$ReuseNode hostProtocolAdapter$ReuseNode5 = (HostProtocolAdapter$ReuseNode) objArr3[(i18 << 3) + i20];
                                    objArr2 = objArr3;
                                    if (hostProtocolAdapter$ReuseNode5.changeIndexForAdd == -1) {
                                        long shapeHash = NodeReuseKt.shapeHash(arcadeHostProtocol, hostProtocolAdapter$ReuseNode5);
                                        j4 = j5;
                                        if (shapeHash != 0) {
                                            Iterator it2 = arrayDeque.iterator();
                                            int i21 = 0;
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    i4 = -1;
                                                    break;
                                                } else {
                                                    if (((ProtocolNode) it2.next()).shapeHash == shapeHash) {
                                                        i4 = i21;
                                                        break;
                                                    }
                                                    i21++;
                                                }
                                            }
                                            if (i4 != -1) {
                                                ProtocolNode protocolNode3 = (ProtocolNode) arrayDeque.get(i4);
                                                if (NodeReuseKt.shapesEqual(arcadeHostProtocol, hostProtocolAdapter$ReuseNode5, protocolNode3)) {
                                                    arrayDeque.removeAt(i4);
                                                    hostProtocolAdapter$ReuseNode5.assignPooledNodeRecursive(mutableIntObjectMap2, uiChangeArr, protocolNode3);
                                                    i3 = i20;
                                                    protocolNode3.shapeHash = 0L;
                                                    j5 = j4 >> i2;
                                                    i20 = i3 + 1;
                                                    objArr3 = objArr2;
                                                }
                                            }
                                        }
                                    } else {
                                        j4 = j5;
                                    }
                                    i3 = i20;
                                    j5 = j4 >> i2;
                                    i20 = i3 + 1;
                                    objArr3 = objArr2;
                                } else {
                                    objArr2 = objArr3;
                                    j4 = j5;
                                }
                                i3 = i20;
                                j5 = j4 >> i2;
                                i20 = i3 + 1;
                                objArr3 = objArr2;
                            }
                            objArr = objArr3;
                            if (i19 != i2) {
                                break;
                            }
                        } else {
                            objArr = objArr3;
                        }
                        if (i18 == length) {
                            break;
                        }
                        i18++;
                        objArr3 = objArr;
                        i17 = 0;
                        i2 = 8;
                    }
                }
                list3 = ArraysKt___ArraysKt.filterNotNull(uiChangeArr);
                size = list3.size();
                i5 = 0;
                while (i5 < size) {
                    UiChange uiChange4 = (UiChange) list3.get(i5);
                    int mo1387getId0HhLjSo = uiChange4.mo1387getId0HhLjSo();
                    if (uiChange4 instanceof UiCreate) {
                        UiCreate uiCreate2 = (UiCreate) uiChange4;
                        int i22 = uiCreate2.id;
                        WidgetHostProtocol m1194widgetWCEpcRY = arcadeHostProtocol.m1194widgetWCEpcRY(uiCreate2.tag);
                        if (m1194widgetWCEpcRY != null) {
                            SVG svg = (SVG) deviceProfileWriter.mProfile;
                            if (svg == null) {
                                return;
                            }
                            if (((ProtocolNode) mutableIntObjectMap2.put(i22, m1194widgetWCEpcRY.mo1197createNodez3jyS0k(mo1387getId0HhLjSo, svg))) != null) {
                                Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i22, "Insert attempted to replace existing widget with ID "));
                                return;
                            }
                        }
                    } else {
                        if (uiChange4 instanceof UiChildrenChange) {
                            ChildrenChange childrenChange3 = ((UiChildrenChange) uiChange4).change;
                            ProtocolNode m1160nodeou3jOuA$redwood_protocol_host = deviceProfileWriter.m1160nodeou3jOuA$redwood_protocol_host(mo1387getId0HhLjSo);
                            AndroidSvg mo1195childrendBpC2Y = m1160nodeou3jOuA$redwood_protocol_host.mo1195childrendBpC2Y(childrenChange3.mo1369getTagb0W0yNk());
                            if (mo1195childrendBpC2Y != null) {
                                Widget.Children children = (Widget.Children) mo1195childrendBpC2Y.svg;
                                ArrayList arrayList = (ArrayList) mo1195childrendBpC2Y.renderOptions;
                                if (childrenChange3 instanceof ChildrenChange.Add) {
                                    ChildrenChange.Add add2 = (ChildrenChange.Add) childrenChange3;
                                    ProtocolNode m1160nodeou3jOuA$redwood_protocol_host2 = deviceProfileWriter.m1160nodeou3jOuA$redwood_protocol_host(add2._childId);
                                    int i23 = add2.index;
                                    int size2 = arrayList.size();
                                    int i24 = i23;
                                    while (i24 < size2) {
                                        ((ProtocolNode) arrayList.get(i24)).index++;
                                        i24++;
                                        mutableIntObjectMap2 = mutableIntObjectMap2;
                                    }
                                    mutableIntObjectMap = mutableIntObjectMap2;
                                    m1160nodeou3jOuA$redwood_protocol_host2.index = i23;
                                    arrayList.add(i23, m1160nodeou3jOuA$redwood_protocol_host2);
                                    m1160nodeou3jOuA$redwood_protocol_host2.container = children;
                                    children.insert(i23, m1160nodeou3jOuA$redwood_protocol_host2.getWidget());
                                    protocolNode = m1160nodeou3jOuA$redwood_protocol_host;
                                    i6 = i;
                                } else {
                                    mutableIntObjectMap = mutableIntObjectMap2;
                                    if (childrenChange3 instanceof ChildrenChange.Move) {
                                        ChildrenChange.Move move = (ChildrenChange.Move) childrenChange3;
                                        int i25 = move.fromIndex;
                                        int i26 = move.toIndex;
                                        int i27 = move.count;
                                        arrayList.getClass();
                                        int i28 = i25 > i26 ? i26 : i26 - i27;
                                        if (i27 != i) {
                                            List subList = arrayList.subList(i25, i25 + i27);
                                            ArrayList mutableList = CollectionsKt.toMutableList((Collection) subList);
                                            subList.clear();
                                            arrayList.addAll(i28, mutableList);
                                        } else if (i25 == i26 + 1 || i25 == i26 - 1) {
                                            arrayList.set(i25, arrayList.set(i26, arrayList.get(i25)));
                                        } else {
                                            arrayList.add(i28, arrayList.remove(i25));
                                        }
                                        int max = Math.max(i26, i25 + i27);
                                        for (int min = Math.min(i25, i26); min < max; min++) {
                                            ((ProtocolNode) arrayList.get(min)).index = min;
                                        }
                                        children.move(i25, i26, i27);
                                        protocolNode = m1160nodeou3jOuA$redwood_protocol_host;
                                        i6 = 1;
                                    } else {
                                        if (!(childrenChange3 instanceof ChildrenChange.Remove)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return;
                                        }
                                        ChildrenChange.Remove remove = (ChildrenChange.Remove) childrenChange3;
                                        int i29 = remove.count;
                                        int i30 = remove.index;
                                        if (!remove.detach) {
                                            int i31 = i30 + i29;
                                            int i32 = i30;
                                            while (i32 < i31) {
                                                ProtocolNode protocolNode4 = (ProtocolNode) arrayList.get(i32);
                                                protocolNode4.visitIds((PreviewView.AnonymousClass1) deviceProfileWriter.mTranscodedProfile);
                                                if (protocolNode4.reuse) {
                                                    i7 = i31;
                                                    protocolNode2 = m1160nodeou3jOuA$redwood_protocol_host;
                                                    protocolNode4.shapeHash = NodeReuseKt.shapeHash(arcadeHostProtocol, protocolNode4);
                                                    arrayDeque.addFirst(protocolNode4);
                                                    if (arrayDeque.size > 16) {
                                                        deviceProfileWriter.watchForLeaksAndDetach((ProtocolNode) arrayDeque.removeLast(), "evicted from reuse pool");
                                                    }
                                                } else {
                                                    i7 = i31;
                                                    protocolNode2 = m1160nodeou3jOuA$redwood_protocol_host;
                                                    deviceProfileWriter.watchForLeaksAndDetach(protocolNode4, "not eligible for reuse");
                                                }
                                                i32++;
                                                m1160nodeou3jOuA$redwood_protocol_host = protocolNode2;
                                                i31 = i7;
                                            }
                                        }
                                        protocolNode = m1160nodeou3jOuA$redwood_protocol_host;
                                        arrayList.getClass();
                                        i6 = 1;
                                        if (i29 == 1) {
                                            arrayList.remove(i30);
                                        } else {
                                            arrayList.subList(i30, i30 + i29).clear();
                                        }
                                        int size3 = arrayList.size();
                                        for (int i33 = i30; i33 < size3; i33++) {
                                            ((ProtocolNode) arrayList.get(i33)).index -= i29;
                                        }
                                        children.remove(i30, i29);
                                    }
                                }
                                Widget widget = protocolNode.getWidget();
                                if (widget instanceof ChangeListener) {
                                    mutableScatterSet.plusAssign(widget);
                                }
                            }
                        } else {
                            mutableIntObjectMap = mutableIntObjectMap2;
                            i6 = i;
                            if (uiChange4 instanceof UiModifierChange) {
                                ProtocolNode m1160nodeou3jOuA$redwood_protocol_host3 = deviceProfileWriter.m1160nodeou3jOuA$redwood_protocol_host(mo1387getId0HhLjSo);
                                UiModifierChange uiModifierChange2 = (UiModifierChange) uiChange4;
                                Modifier modifier = uiModifierChange2.modifier;
                                m1160nodeou3jOuA$redwood_protocol_host3.reuse = uiModifierChange2.reuse;
                                SVG svg2 = (SVG) deviceProfileWriter.mProfile;
                                if (svg2 == null) {
                                    return;
                                }
                                modifier.forEachUnscoped(new CombinedModifier$$ExternalSyntheticLambda0(4, svg2, m1160nodeou3jOuA$redwood_protocol_host3));
                                m1160nodeou3jOuA$redwood_protocol_host3.getWidget().setModifier(modifier);
                                Widget.Children children2 = m1160nodeou3jOuA$redwood_protocol_host3.container;
                                if (children2 != null) {
                                    children2.onModifierUpdated(m1160nodeou3jOuA$redwood_protocol_host3.index, m1160nodeou3jOuA$redwood_protocol_host3.getWidget());
                                }
                                Widget widget2 = m1160nodeou3jOuA$redwood_protocol_host3.getWidget();
                                if (widget2 instanceof ChangeListener) {
                                    mutableScatterSet.plusAssign(widget2);
                                }
                            } else {
                                if (!(uiChange4 instanceof UiPropertyChange)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                }
                                UiPropertyChange uiPropertyChange = (UiPropertyChange) uiChange4;
                                ProtocolNode m1160nodeou3jOuA$redwood_protocol_host4 = deviceProfileWriter.m1160nodeou3jOuA$redwood_protocol_host(uiPropertyChange.id);
                                m1160nodeou3jOuA$redwood_protocol_host4.apply(uiPropertyChange, (SVG) deviceProfileWriter.mAssetManager);
                                Widget widget3 = m1160nodeou3jOuA$redwood_protocol_host4.getWidget();
                                if (widget3 instanceof ChangeListener) {
                                    mutableScatterSet.plusAssign(widget3);
                                }
                            }
                        }
                        i5++;
                        i = i6;
                        mutableIntObjectMap2 = mutableIntObjectMap;
                    }
                    mutableIntObjectMap = mutableIntObjectMap2;
                    i6 = i;
                    i5++;
                    i = i6;
                    mutableIntObjectMap2 = mutableIntObjectMap;
                }
                if (mutableScatterSet.isNotEmpty()) {
                    return;
                }
                Object[] objArr4 = mutableScatterSet.elements;
                long[] jArr2 = mutableScatterSet.metadata;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i34 = 0;
                    while (true) {
                        long j6 = jArr2[i34];
                        if ((((~j6) << c) & j6 & j3) != j3) {
                            int i35 = 8 - ((~(i34 - length2)) >>> 31);
                            for (int i36 = 0; i36 < i35; i36++) {
                                if ((j6 & j2) < j) {
                                    ((ChangeListener) objArr4[(i34 << 3) + i36]).onEndChanges();
                                }
                                j6 >>= 8;
                            }
                            if (i35 != 8) {
                                break;
                            }
                        }
                        if (i34 == length2) {
                            break;
                        } else {
                            i34++;
                        }
                    }
                }
                mutableScatterSet.clear();
                return;
            }
            c = 7;
            i = 1;
        }
        j3 = -9187201950435737472L;
        size = list3.size();
        i5 = 0;
        while (i5 < size) {
        }
        if (mutableScatterSet.isNotEmpty()) {
        }
    }

    @Override // app.cash.redwood.treehouse.ZiplineTreehouseUi$Host
    public final void requestFocus(FocusRequester focusRequester) {
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        JobKt.launch$default(this.bindingScope, MainDispatcherLoader.dispatcher, null, new EventBridge$sendEvent$1(this, focusRequester, null, 21), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [app.cash.redwood.protocol.host.UiCreate] */
    /* JADX WARN: Type inference failed for: r2v5, types: [app.cash.redwood.protocol.host.UiModifierChange] */
    /* JADX WARN: Type inference failed for: r2v9, types: [app.cash.redwood.protocol.host.UiChildrenChange] */
    /* JADX WARN: Type inference failed for: r3v5, types: [app.cash.redwood.protocol.host.UiPropertyChange] */
    @Override // app.cash.redwood.protocol.ChangesSink
    public final void sendChanges(List list) {
        Modifier modifier;
        KSerializer serializer;
        KSerializer mo1198propertyDeserializerFsYNNkA;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Continuation continuation = null;
            continuation = null;
            if (!it.hasNext()) {
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                JobKt.launch$default(this.bindingScope, MainDispatcherLoader.dispatcher, null, new EventBridge$sendEvent$1(this, arrayList, continuation, 22), 2);
                return;
            }
            Change change = (Change) it.next();
            ArcadeHostProtocol arcadeHostProtocol = this.codeSession.hostProtocol;
            arcadeHostProtocol.getClass();
            change.getClass();
            JsonImpl jsonImpl = arcadeHostProtocol.json;
            if (change instanceof Create) {
                Create create = (Create) change;
                continuation = new UiCreate(create._id, create._tag);
            } else if (change instanceof ChildrenChange) {
                continuation = new UiChildrenChange((ChildrenChange) change);
            } else if (change instanceof PropertyChange) {
                PropertyChange propertyChange = (PropertyChange) change;
                int i = propertyChange._tag;
                WidgetHostProtocol m1194widgetWCEpcRY = arcadeHostProtocol.m1194widgetWCEpcRY(propertyChange._widgetTag);
                if (m1194widgetWCEpcRY != null && (mo1198propertyDeserializerFsYNNkA = m1194widgetWCEpcRY.mo1198propertyDeserializerFsYNNkA(i)) != null) {
                    JsonElement jsonElement = propertyChange.value;
                    jsonElement.getClass();
                    continuation = new UiPropertyChange(propertyChange._id, i, WriteModeKt.readJson(jsonImpl, jsonElement, mo1198propertyDeserializerFsYNNkA));
                }
            } else {
                if (!(change instanceof ModifierChange)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ModifierChange modifierChange = (ModifierChange) change;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                boolean z = false;
                Modifier modifier2 = companion;
                for (ModifierElement modifierElement : modifierChange.elements) {
                    int i2 = modifierElement.tag;
                    if (i2 == -4543827) {
                        z = true;
                    }
                    if (i2 != -4543827) {
                        switch (i2) {
                            case 1:
                                serializer = BackgroundColorImpl.Companion.serializer();
                                KSerializer kSerializer = serializer;
                                JsonElement jsonElement2 = modifierElement.value;
                                kSerializer.getClass();
                                jsonElement2.getClass();
                                modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement2, kSerializer);
                                break;
                            case 2:
                                serializer = LoadingScreenImpl.Companion.serializer();
                                KSerializer kSerializer2 = serializer;
                                JsonElement jsonElement22 = modifierElement.value;
                                kSerializer2.getClass();
                                jsonElement22.getClass();
                                modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement22, kSerializer2);
                                break;
                            case 3:
                                serializer = CornerRadiusImpl.Companion.serializer();
                                KSerializer kSerializer22 = serializer;
                                JsonElement jsonElement222 = modifierElement.value;
                                kSerializer22.getClass();
                                jsonElement222.getClass();
                                modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement222, kSerializer22);
                                break;
                            case 4:
                                serializer = AccessibilityRoleImpl.Companion.serializer();
                                KSerializer kSerializer222 = serializer;
                                JsonElement jsonElement2222 = modifierElement.value;
                                kSerializer222.getClass();
                                jsonElement2222.getClass();
                                modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement2222, kSerializer222);
                                break;
                            case 5:
                                serializer = AccessibilityLabelImpl.Companion.serializer();
                                KSerializer kSerializer2222 = serializer;
                                JsonElement jsonElement22222 = modifierElement.value;
                                kSerializer2222.getClass();
                                jsonElement22222.getClass();
                                modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement22222, kSerializer2222);
                                break;
                            case 6:
                                serializer = AccessibilityEnabledImpl.Companion.serializer();
                                KSerializer kSerializer22222 = serializer;
                                JsonElement jsonElement222222 = modifierElement.value;
                                kSerializer22222.getClass();
                                jsonElement222222.getClass();
                                modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement222222, kSerializer22222);
                                break;
                            case 7:
                                serializer = AccessibilityActionImpl.Companion.serializer();
                                KSerializer kSerializer222222 = serializer;
                                JsonElement jsonElement2222222 = modifierElement.value;
                                kSerializer222222.getClass();
                                jsonElement2222222.getClass();
                                modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement2222222, kSerializer222222);
                                break;
                            default:
                                switch (i2) {
                                    case 1000001:
                                        serializer = GrowImpl.Companion.serializer();
                                        KSerializer kSerializer2222222 = serializer;
                                        JsonElement jsonElement22222222 = modifierElement.value;
                                        kSerializer2222222.getClass();
                                        jsonElement22222222.getClass();
                                        modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement22222222, kSerializer2222222);
                                        break;
                                    case 1000002:
                                        serializer = ShrinkImpl.Companion.serializer();
                                        KSerializer kSerializer22222222 = serializer;
                                        JsonElement jsonElement222222222 = modifierElement.value;
                                        kSerializer22222222.getClass();
                                        jsonElement222222222.getClass();
                                        modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement222222222, kSerializer22222222);
                                        break;
                                    case 1000003:
                                        serializer = MarginImpl.Companion.serializer();
                                        KSerializer kSerializer222222222 = serializer;
                                        JsonElement jsonElement2222222222 = modifierElement.value;
                                        kSerializer222222222.getClass();
                                        jsonElement2222222222.getClass();
                                        modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement2222222222, kSerializer222222222);
                                        break;
                                    case 1000004:
                                        serializer = HorizontalAlignmentImpl.Companion.serializer();
                                        KSerializer kSerializer2222222222 = serializer;
                                        JsonElement jsonElement22222222222 = modifierElement.value;
                                        kSerializer2222222222.getClass();
                                        jsonElement22222222222.getClass();
                                        modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement22222222222, kSerializer2222222222);
                                        break;
                                    case 1000005:
                                        serializer = VerticalAlignmentImpl.Companion.serializer();
                                        KSerializer kSerializer22222222222 = serializer;
                                        JsonElement jsonElement222222222222 = modifierElement.value;
                                        kSerializer22222222222.getClass();
                                        jsonElement222222222222.getClass();
                                        modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement222222222222, kSerializer22222222222);
                                        break;
                                    case 1000006:
                                        serializer = WidthImpl.Companion.serializer();
                                        KSerializer kSerializer222222222222 = serializer;
                                        JsonElement jsonElement2222222222222 = modifierElement.value;
                                        kSerializer222222222222.getClass();
                                        jsonElement2222222222222.getClass();
                                        modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement2222222222222, kSerializer222222222222);
                                        break;
                                    case 1000007:
                                        serializer = HeightImpl.Companion.serializer();
                                        KSerializer kSerializer2222222222222 = serializer;
                                        JsonElement jsonElement22222222222222 = modifierElement.value;
                                        kSerializer2222222222222.getClass();
                                        jsonElement22222222222222.getClass();
                                        modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement22222222222222, kSerializer2222222222222);
                                        break;
                                    case 1000008:
                                        serializer = SizeImpl.Companion.serializer();
                                        KSerializer kSerializer22222222222222 = serializer;
                                        JsonElement jsonElement222222222222222 = modifierElement.value;
                                        kSerializer22222222222222.getClass();
                                        jsonElement222222222222222.getClass();
                                        modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement222222222222222, kSerializer22222222222222);
                                        break;
                                    case 1000009:
                                        serializer = FlexImpl.Companion.serializer();
                                        KSerializer kSerializer222222222222222 = serializer;
                                        JsonElement jsonElement2222222222222222 = modifierElement.value;
                                        kSerializer222222222222222.getClass();
                                        jsonElement2222222222222222.getClass();
                                        modifier = (Modifier) WriteModeKt.readJson(jsonImpl, jsonElement2222222222222222, kSerializer222222222222222);
                                        break;
                                    default:
                                        EventListener eventListener = (EventListener) ((SVG) arcadeHostProtocol.mismatchHandler.b).rootElement;
                                        eventListener.getClass();
                                        eventListener.mo1394unknownModifiernx0wl1g(i2);
                                        modifier = companion;
                                        break;
                                }
                        }
                    } else {
                        modifier = ReuseImpl.INSTANCE;
                    }
                    modifier2 = modifier2.then(modifier);
                }
                continuation = new UiModifierChange(modifierChange._id, z, modifier2);
            }
            if (continuation != null) {
                arrayList.add(continuation);
            }
        }
    }

    public final void updateChangeCount() {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.internalStateFlow;
        InternalState internalState = (InternalState) stateFlowImpl.getValue();
        CodeState codeState = internalState.codeState;
        CodeState.Running running = codeState instanceof CodeState.Running ? (CodeState.Running) codeState : null;
        if (running != null && Intrinsics.areEqual(running.viewContentCodeBinding, this)) {
            Throwable th = this.deliveredChangeCount > 0 ? null : running.lastUncaughtException;
            int i = running.loadCount;
            this.changesAwaitingInitView.getClass();
            CodeState.Running running2 = new CodeState.Running(i, th, this, this.deliveredChangeCount);
            InternalState internalState2 = new InternalState(internalState.viewState, running2);
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, internalState2);
            Content$State asState = running2.asState();
            StateFlowImpl stateFlowImpl2 = (StateFlowImpl) this.externalStateFlow;
            stateFlowImpl2.getClass();
            stateFlowImpl2.updateState(null, asState);
        }
    }
}
