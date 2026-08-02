package ru.yandex.video.m3.list_player_manager.impl;

import android.content.Context;
import defpackage.bms;
import defpackage.bvf0;
import defpackage.ha2;
import defpackage.jqr;
import defpackage.l8x;
import defpackage.mth;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pz40;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zxc0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.debug.DebugDataHandlerImpl;
import ru.yandex.video.m3.debug.DebugViewToggleManager;
import ru.yandex.video.m3.debug.ListSdkDebugDataManager;
import ru.yandex.video.m3.list_player_manager.InternalListYandexPlayer;
import ru.yandex.video.m3.list_player_manager.ListPlayerDebugManager;
import ru.yandex.video.m3.list_player_manager.PlaybackConfig;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.ui.debug.model.Size;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J7\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J1\u0010,\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020'2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J)\u0010/\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R$\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020!\u0018\u00010 078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u001e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u001e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00109R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@¨\u0006B"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ListPlayerDebugManagerImpl;", "Lru/yandex/video/m3/list_player_manager/ListPlayerDebugManager;", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "debugViewToggleManager", "Ltse;", "scope", "Lru/yandex/video/m3/debug/ListSdkDebugDataManager;", "listSdkDebugDataManager", "Landroid/content/Context;", "context", "<init>", "(Lru/yandex/video/m3/debug/DebugViewToggleManager;Ltse;Lru/yandex/video/m3/debug/ListSdkDebugDataManager;Landroid/content/Context;)V", "Lru/yandex/video/m3/debug/DebugDataHandlerImpl;", "initDebugHandler", "()Lru/yandex/video/m3/debug/DebugDataHandlerImpl;", "Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl;", "listYandexPlayerImpl", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "listYandexPlayerView", "Lzy11;", "onViewAttached", "(Lru/yandex/video/m3/list_player_manager/impl/ListYandexPlayerImpl;Lru/yandex/video/m3/ui/ListYandexPlayerView;)V", "onViewDetached", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "player", "", "w", "h", "oldw", "oldh", "onPlayerViewSizeChange", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;IIII)V", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "engine", "onEngineAttached", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "onEngineDetached", "()V", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "oldMediaData", "newMediaData", "Lru/yandex/video/m3/list_player_manager/PlaybackConfig;", "playbackConfig", "onSetSource", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/list_player_manager/PlaybackConfig;)V", "mediaData", "onDropSource", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;Lru/yandex/video/m3/ui/ListYandexPlayerView;Lru/yandex/video/m3/list_player_manager/model/MediaData;)V", "onRelease", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;)V", "Lru/yandex/video/m3/debug/DebugViewToggleManager;", "Ltse;", "Lru/yandex/video/m3/debug/ListSdkDebugDataManager;", "Landroid/content/Context;", "Lpz40;", "debugDataHandlerFlow", "Lpz40;", "engineFlow", "setSourceFlow", "Lru/yandex/video/m3/player/ui/debug/model/Size;", "viewSizeFlow", "Ll8x;", "debugViewJob", "Ll8x;", "callbackJob", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListPlayerDebugManagerImpl implements ListPlayerDebugManager {
    public static final int $stable = 8;
    private final l8x callbackJob;
    private final Context context;
    private final pz40 debugDataHandlerFlow;
    private l8x debugViewJob;
    private final DebugViewToggleManager debugViewToggleManager;
    private pz40 engineFlow;
    private final ListSdkDebugDataManager listSdkDebugDataManager;
    private final tse scope;
    private pz40 setSourceFlow;
    private pz40 viewSizeFlow;

    public ListPlayerDebugManagerImpl(DebugViewToggleManager debugViewToggleManager, tse tseVar, ListSdkDebugDataManager listSdkDebugDataManager, Context context) {
        this.debugViewToggleManager = debugViewToggleManager;
        this.scope = tseVar;
        this.listSdkDebugDataManager = listSdkDebugDataManager;
        this.context = context;
        r0 c = bvf0.c(null);
        this.debugDataHandlerFlow = c;
        this.engineFlow = bvf0.c(null);
        this.setSourceFlow = bvf0.c(null);
        this.viewSizeFlow = bvf0.c(null);
        jqr jqrVar = new jqr(debugViewToggleManager.getIsDebugViewEnabled(), new AnonymousClass1(null), 3);
        mth mthVar = new mth(this.engineFlow, 6);
        mth mthVar2 = new mth(c, 6);
        final n4u0 isDebugViewEnabled = debugViewToggleManager.getIsDebugViewEnabled();
        ha2 n = kotlinx.coroutines.flow.e.n(mthVar, mthVar2, new tpr() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$special$$inlined$filter$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lzy11;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements vpr {
                final /* synthetic */ vpr $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @mvg(c = "ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$special$$inlined$filter$1$2", f = "ListPlayerDebugManagerImpl.kt", l = {219}, m = "emit")
                /* renamed from: ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(vpr vprVar) {
                    this.$this_unsafeFlow = vprVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // defpackage.vpr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.b.b(obj2);
                                vpr vprVar = this.$this_unsafeFlow;
                                if (((Boolean) obj).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (vprVar.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                kotlin.b.b(obj2);
                            }
                            return zy11.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return zy11.a;
                }
            }

            @Override // defpackage.tpr
            public Object collect(vpr vprVar, Continuation continuation) {
                Object collect = tpr.this.collect(new AnonymousClass2(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
            }
        }, new AnonymousClass3(null));
        mth mthVar3 = new mth(this.setSourceFlow, 6);
        mth mthVar4 = new mth(c, 6);
        final n4u0 isDebugViewEnabled2 = debugViewToggleManager.getIsDebugViewEnabled();
        ha2 n2 = kotlinx.coroutines.flow.e.n(mthVar3, mthVar4, new tpr() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$special$$inlined$filter$2

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lzy11;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$special$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements vpr {
                final /* synthetic */ vpr $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @mvg(c = "ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$special$$inlined$filter$2$2", f = "ListPlayerDebugManagerImpl.kt", l = {219}, m = "emit")
                /* renamed from: ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$special$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(vpr vprVar) {
                    this.$this_unsafeFlow = vprVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // defpackage.vpr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.b.b(obj2);
                                vpr vprVar = this.$this_unsafeFlow;
                                if (((Boolean) obj).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (vprVar.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                kotlin.b.b(obj2);
                            }
                            return zy11.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return zy11.a;
                }
            }

            @Override // defpackage.tpr
            public Object collect(vpr vprVar, Continuation continuation) {
                Object collect = tpr.this.collect(new AnonymousClass2(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
            }
        }, new AnonymousClass5(null));
        mth mthVar5 = new mth(this.viewSizeFlow, 6);
        mth mthVar6 = new mth(c, 6);
        final n4u0 isDebugViewEnabled3 = debugViewToggleManager.getIsDebugViewEnabled();
        kotlinx.coroutines.flow.internal.h K = kotlinx.coroutines.flow.e.K(jqrVar, n, n2, kotlinx.coroutines.flow.e.n(mthVar5, mthVar6, new tpr() { // from class: ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$special$$inlined$filter$3

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lzy11;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$special$$inlined$filter$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements vpr {
                final /* synthetic */ vpr $this_unsafeFlow;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @mvg(c = "ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$special$$inlined$filter$3$2", f = "ListPlayerDebugManagerImpl.kt", l = {219}, m = "emit")
                /* renamed from: ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$special$$inlined$filter$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(vpr vprVar) {
                    this.$this_unsafeFlow = vprVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // defpackage.vpr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.b.b(obj2);
                                vpr vprVar = this.$this_unsafeFlow;
                                if (((Boolean) obj).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (vprVar.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                kotlin.b.b(obj2);
                            }
                            return zy11.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return zy11.a;
                }
            }

            @Override // defpackage.tpr
            public Object collect(vpr vprVar, Continuation continuation) {
                Object collect = tpr.this.collect(new AnonymousClass2(vprVar), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
            }
        }, new AnonymousClass7(null)));
        sjh sjhVar = uyj.a;
        this.callbackJob = kotlinx.coroutines.flow.e.H(tseVar, kotlinx.coroutines.flow.e.F(K, o400.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DebugDataHandlerImpl initDebugHandler() {
        return new DebugDataHandlerImpl(this.scope, this.context.getApplicationContext(), this.debugViewToggleManager, this.listSdkDebugDataManager);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onDropSource(InternalListYandexPlayer player, ListYandexPlayerView listYandexPlayerView, MediaData mediaData) {
        ((r0) this.setSourceFlow).l(null);
        DebugDataHandlerImpl debugDataHandlerImpl = (DebugDataHandlerImpl) ((r0) this.debugDataHandlerFlow).getValue();
        if (debugDataHandlerImpl != null) {
            debugDataHandlerImpl.dropSource();
        }
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onEngineAttached(YandexPlayer<zxc0> engine) {
        r0 r0Var = (r0) this.engineFlow;
        r0Var.getClass();
        r0Var.m(null, engine);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onEngineDetached() {
        DebugDataHandlerImpl debugDataHandlerImpl = (DebugDataHandlerImpl) ((r0) this.debugDataHandlerFlow).getValue();
        if (debugDataHandlerImpl != null) {
            debugDataHandlerImpl.detachEngine();
        }
        ((r0) this.engineFlow).l(null);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onPlayerViewSizeChange(InternalListYandexPlayer player, int w, int h, int oldw, int oldh) {
        pz40 pz40Var = this.viewSizeFlow;
        Size size = new Size(w, h);
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, size);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onRelease(InternalListYandexPlayer player) {
        ((r0) this.setSourceFlow).l(null);
        ((r0) this.engineFlow).l(null);
        ((r0) this.viewSizeFlow).l(null);
        DebugDataHandlerImpl debugDataHandlerImpl = (DebugDataHandlerImpl) ((r0) this.debugDataHandlerFlow).getValue();
        if (debugDataHandlerImpl != null) {
            debugDataHandlerImpl.release();
        }
        this.callbackJob.a(null);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onSetSource(InternalListYandexPlayer player, MediaData oldMediaData, MediaData newMediaData, PlaybackConfig playbackConfig) {
        r0 r0Var = (r0) this.setSourceFlow;
        r0Var.getClass();
        r0Var.m(null, newMediaData);
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onViewAttached(ListYandexPlayerImpl listYandexPlayerImpl, ListYandexPlayerView listYandexPlayerView) {
        l8x l8xVar = this.debugViewJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        m0 m0Var = new m0(this.debugDataHandlerFlow, this.debugViewToggleManager.getIsDebugViewEnabled(), new ListPlayerDebugManagerImpl$onViewAttached$1(listYandexPlayerView, null));
        sjh sjhVar = uyj.a;
        this.debugViewJob = kotlinx.coroutines.flow.e.H(this.scope, kotlinx.coroutines.flow.e.F(m0Var, o400.a));
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.ListPlayerInternalObserver
    public void onViewDetached(ListYandexPlayerImpl listYandexPlayerImpl, ListYandexPlayerView listYandexPlayerView) {
        l8x l8xVar = this.debugViewJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        ((r0) this.viewSizeFlow).l(null);
        listYandexPlayerView.removeDebugView$video_player_internalRelease();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isDebugViewEnabled", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$1", f = "ListPlayerDebugManagerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ boolean Z$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = ListPlayerDebugManagerImpl.this.new AnonymousClass1(continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public final Object invoke(boolean z, Continuation<? super zy11> continuation) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            boolean z = this.Z$0;
            if (z) {
                ((r0) ListPlayerDebugManagerImpl.this.debugDataHandlerFlow).l(ListPlayerDebugManagerImpl.this.initDebugHandler());
            } else if (!z) {
                DebugDataHandlerImpl debugDataHandlerImpl = (DebugDataHandlerImpl) ((r0) ListPlayerDebugManagerImpl.this.debugDataHandlerFlow).getValue();
                if (debugDataHandlerImpl != null) {
                    debugDataHandlerImpl.release();
                }
                ((r0) ListPlayerDebugManagerImpl.this.debugDataHandlerFlow).l(null);
            }
            return zy11.a;
        }

        @Override // defpackage.wls
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super zy11>) obj2);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "engine", "Lru/yandex/video/m3/debug/DebugDataHandlerImpl;", "debugDataHandler", "", "<anonymous parameter 2>", "Lzy11;", "<anonymous>", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/debug/DebugDataHandlerImpl;Z)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$3", f = "ListPlayerDebugManagerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements bms {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(4, continuation);
        }

        @Override // defpackage.bms
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((YandexPlayer<zxc0>) obj, (DebugDataHandlerImpl) obj2, ((Boolean) obj3).booleanValue(), (Continuation<? super zy11>) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ((DebugDataHandlerImpl) this.L$1).attachEngine((YandexPlayer) this.L$0);
            return zy11.a;
        }

        public final Object invoke(YandexPlayer<zxc0> yandexPlayer, DebugDataHandlerImpl debugDataHandlerImpl, boolean z, Continuation<? super zy11> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.L$0 = yandexPlayer;
            anonymousClass3.L$1 = debugDataHandlerImpl;
            return anonymousClass3.invokeSuspend(zy11.a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaData", "Lru/yandex/video/m3/debug/DebugDataHandlerImpl;", "debugDataHandler", "", "<anonymous parameter 2>", "Lzy11;", "<anonymous>", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;Lru/yandex/video/m3/debug/DebugDataHandlerImpl;Z)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$5", f = "ListPlayerDebugManagerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements bms {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(4, continuation);
        }

        @Override // defpackage.bms
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((MediaData) obj, (DebugDataHandlerImpl) obj2, ((Boolean) obj3).booleanValue(), (Continuation<? super zy11>) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ((DebugDataHandlerImpl) this.L$1).setSource((MediaData) this.L$0);
            return zy11.a;
        }

        public final Object invoke(MediaData mediaData, DebugDataHandlerImpl debugDataHandlerImpl, boolean z, Continuation<? super zy11> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(continuation);
            anonymousClass5.L$0 = mediaData;
            anonymousClass5.L$1 = debugDataHandlerImpl;
            return anonymousClass5.invokeSuspend(zy11.a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/Size;", "size", "Lru/yandex/video/m3/debug/DebugDataHandlerImpl;", "debugDataHandler", "", "<anonymous parameter 2>", "Lzy11;", "<anonymous>", "(Lru/yandex/video/m3/player/ui/debug/model/Size;Lru/yandex/video/m3/debug/DebugDataHandlerImpl;Z)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$7", f = "ListPlayerDebugManagerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.list_player_manager.impl.ListPlayerDebugManagerImpl$7, reason: invalid class name */
    public static final class AnonymousClass7 extends SuspendLambda implements bms {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
            super(4, continuation);
        }

        @Override // defpackage.bms
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((Size) obj, (DebugDataHandlerImpl) obj2, ((Boolean) obj3).booleanValue(), (Continuation<? super zy11>) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            Size size = (Size) this.L$0;
            ((DebugDataHandlerImpl) this.L$1).setViewSize(size.getWidth(), size.getHeight());
            return zy11.a;
        }

        public final Object invoke(Size size, DebugDataHandlerImpl debugDataHandlerImpl, boolean z, Continuation<? super zy11> continuation) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(continuation);
            anonymousClass7.L$0 = size;
            anonymousClass7.L$1 = debugDataHandlerImpl;
            return anonymousClass7.invokeSuspend(zy11.a);
        }
    }
}
