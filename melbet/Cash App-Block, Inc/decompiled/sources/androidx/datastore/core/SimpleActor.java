package androidx.datastore.core;

import android.app.ApplicationExitInfo;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputConnection;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.Animations;
import androidx.compose.animation.core.FloatAnimationSpec;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AndroidAutofillManager;
import androidx.compose.ui.autofill.AndroidContentDataType;
import androidx.compose.ui.autofill.AndroidFillableData;
import androidx.compose.ui.autofill.AutofillApi26Helper;
import androidx.compose.ui.autofill.ContentDataType$Companion;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.SimpleGraphicsLayerModifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.WeakReference;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1;
import androidx.compose.ui.platform.InputMethodSession;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.semantics.EmptySemanticsModifier;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.NullableInputConnectionWrapperApi25;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Velocity;
import androidx.lifecycle.AtomicReference;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider$OnRequeryFactory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.TransactorKt;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokensImpl;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.presenter.SavedState;
import app.cash.molecule.GatedFrameClock;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import coil3.memory.MemoryCacheService;
import com.bugsnag.android.ApplicationExitInfoMatcher;
import com.bugsnag.android.DeliveryParams;
import com.bugsnag.android.DeviceId;
import com.bugsnag.android.Event;
import com.bugsnag.android.EventPayload;
import com.bugsnag.android.ExitInfoKey;
import com.bugsnag.android.Logger;
import com.bugsnag.android.Session;
import com.bugsnag.android.TraceParser$parse$1;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamite.zzh;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhh;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.tasks.zzr;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.hybrid.HpkeParameters;
import com.google.crypto.tink.internal.SerializationRegistry;
import com.google.crypto.tink.mac.HmacParameters;
import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import com.google.i18n.phonenumbers.metadata.init.ClassPathResourceMetadataLoader;
import com.google.i18n.phonenumbers.metadata.init.MetadataParser;
import com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer$KeyProvider;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.core.navigationcontainer.api.NavigatorState;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.core.navigationcontainer.navigator.CashNavigator$special$$inlined$invoke$1;
import com.squareup.cash.core.navigationcontainer.navigator.EventListener;
import com.squareup.cash.core.navigationcontainer.navigator.FullScreen;
import com.squareup.cash.core.navigationcontainer.navigator.OverlayScreen;
import com.squareup.cash.storage.RealStorage$temp$1;
import com.squareup.cash.support.screenshot.ScreenshotViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import com.squareup.contour.ContourLayout$geometry$1;
import com.squareup.util.coroutines.DerivedStateFlow;
import curtains.WindowsKt$onNextDraw$1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SimpleActor implements VectorizedFiniteAnimationSpec {
    public final /* synthetic */ int $r8$classId;
    public Object consumeMessage;
    public Object messageQueue;
    public Object remainingMessages;
    public Object scope;

    /* renamed from: androidx.datastore.core.SimpleActor$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function1 {
        public final /* synthetic */ Object $onComplete;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, Object obj, Object obj2) {
            super(1);
            this.$r8$classId = i;
            this.$onComplete = obj;
            this.this$0 = obj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit unit;
            InputConnection inputConnection;
            String str;
            ApplicationExitInfo applicationExitInfo = null;
            switch (this.$r8$classId) {
                case 0:
                    Throwable th = (Throwable) obj;
                    ((WindowsKt$onNextDraw$1) this.$onComplete).invoke(th);
                    BufferedChannel bufferedChannel = (BufferedChannel) ((SimpleActor) this.this$0).messageQueue;
                    bufferedChannel.closeOrCancelImpl(th, false);
                    do {
                        Object m4191getOrNullimpl = ChannelResult.m4191getOrNullimpl(bufferedChannel.mo4189tryReceivePtdJZtk());
                        if (m4191getOrNullimpl != null) {
                            ((Message$Update) m4191getOrNullimpl).ack.completeExceptionally(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th);
                            unit = Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                    } while (unit != null);
                    return Unit.INSTANCE;
                case 1:
                    ((Placeable.PlacementScope) obj).place((Placeable) this.$onComplete, 0, 0, ((ContentTransform) this.this$0).targetContentZIndex$delegate.getFloatValue());
                    return Unit.INSTANCE;
                case 2:
                    if (((Boolean) ((CashApp$$ExternalSyntheticLambda2) this.$onComplete).invoke((DragAndDropEvent) obj)).booleanValue()) {
                        return (TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2) this.this$0;
                    }
                    return null;
                case 3:
                    Placeable.PlacementScope.placeWithLayer$default((Placeable.PlacementScope) obj, (Placeable) this.$onComplete, 0, 0, ((BlockGraphicsLayerModifier) this.this$0).layerBlock, 4);
                    return Unit.INSTANCE;
                case 4:
                    Placeable.PlacementScope.placeWithLayer$default((Placeable.PlacementScope) obj, (Placeable) this.$onComplete, 0, 0, ((SimpleGraphicsLayerModifier) this.this$0).layerBlock, 4);
                    return Unit.INSTANCE;
                case 5:
                    return new InputMethodSession((PlatformTextInputMethodRequest) this.$onComplete, new ContourLayout$geometry$1((AndroidPlatformTextInputSession) this.this$0, 6));
                case 6:
                    InputMethodSession inputMethodSession = (InputMethodSession) this.$onComplete;
                    synchronized (inputMethodSession.lock) {
                        try {
                            inputMethodSession.disposed = true;
                            MutableVector mutableVector = inputMethodSession.connections;
                            Object[] objArr = mutableVector.content;
                            int i = mutableVector.size;
                            for (int i2 = 0; i2 < i; i2++) {
                                NullableInputConnectionWrapperApi25 nullableInputConnectionWrapperApi25 = (NullableInputConnectionWrapperApi25) ((WeakReference) objArr[i2]).get();
                                if (nullableInputConnectionWrapperApi25 != null && (inputConnection = nullableInputConnectionWrapperApi25.delegate) != null) {
                                    inputConnection.closeConnection();
                                    nullableInputConnectionWrapperApi25.delegate = null;
                                }
                            }
                            inputMethodSession.connections.clear();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    TextInputService textInputService = ((AndroidPlatformTextInputSession) this.this$0).textInputService;
                    textInputService._currentInputSession.set(null);
                    textInputService.platformTextInputService.stopInput();
                    return Unit.INSTANCE;
                case 7:
                    AndroidUiDispatcher androidUiDispatcher = (AndroidUiDispatcher) this.$onComplete;
                    AndroidUiFrameClock$withFrameNanos$2$callback$1 androidUiFrameClock$withFrameNanos$2$callback$1 = (AndroidUiFrameClock$withFrameNanos$2$callback$1) this.this$0;
                    synchronized (androidUiDispatcher.lock) {
                        androidUiDispatcher.toRunOnFrame.remove(androidUiFrameClock$withFrameNanos$2$callback$1);
                    }
                    return Unit.INSTANCE;
                case 8:
                    ((LayoutNode) this.$onComplete).setModifier(((Modifier) obj).then((Modifier) this.this$0));
                    return Unit.INSTANCE;
                default:
                    Event event = ((EventPayload) obj).event;
                    if (event != null) {
                        ApplicationExitInfoMatcher applicationExitInfoMatcher = (ApplicationExitInfoMatcher) this.$onComplete;
                        List list = applicationExitInfoMatcher.applicationExitInfo;
                        Session session = event.impl.session;
                        if (session != null && (str = session.id) != null) {
                            byte[] bytes = str.getBytes(Charsets.UTF_8);
                            bytes.getClass();
                            applicationExitInfo = ApplicationExitInfoMatcher.findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release(list, bytes);
                            if (applicationExitInfo == null) {
                                applicationExitInfo = applicationExitInfoMatcher.findExitInfoByPid$bugsnag_plugin_android_exitinfo_release(list);
                            }
                        }
                    }
                    if (applicationExitInfo != null) {
                        ((ComponentRegistry.Builder) this.this$0).addExitInfoKey(new ExitInfoKey(applicationExitInfo));
                    }
                    return Unit.INSTANCE;
            }
        }
    }

    public SimpleActor(Enum[] enumArr, ScreenshotViewKt$$ExternalSyntheticLambda0 screenshotViewKt$$ExternalSyntheticLambda0, Bundle bundle) {
        String string2;
        Enum r10;
        this.$r8$classId = 25;
        CashNavigator$special$$inlined$invoke$1 cashNavigator$special$$inlined$invoke$1 = CashNavigator$special$$inlined$invoke$1.INSTANCE;
        this.scope = screenshotViewKt$$ExternalSyntheticLambda0;
        this.consumeMessage = (bundle == null || (string2 = bundle.getString("active")) == null || (r10 = (Enum) cashNavigator$special$$inlined$invoke$1.invoke(string2)) == null) ? (Enum) ArraysKt___ArraysKt.first(enumArr) : r10;
        Bundle bundle2 = bundle != null ? bundle.getBundle("navigators") : null;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(enumArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (Enum r5 : enumArr) {
            linkedHashMap.put(r5, (BetterNavigator) ((ScreenshotViewKt$$ExternalSyntheticLambda0) this.scope).invoke(r5, bundle2 != null ? bundle2.getBundle(r5.name()) : null));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        this.messageQueue = linkedHashMap2;
        Set<Map.Entry> entrySet = linkedHashMap2.entrySet();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new Pair(entry.getKey(), ((BetterNavigator) entry.getValue()).navigationState));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        this.remainingMessages = new DerivedStateFlow((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (Enum) this.consumeMessage);
        if (bundle == null) {
            updateNavigatorStates();
        }
    }

    /* renamed from: build, reason: collision with other method in class */
    public HmacParameters m1113build() {
        Integer num = (Integer) this.scope;
        if (num == null) {
            a$$ExternalSyntheticBUOutline0.m$6("key size is not set");
            return null;
        }
        if (((Integer) this.consumeMessage) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("tag size is not set");
            return null;
        }
        if (((HmacParameters.HashType) this.messageQueue) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("hash type is not set");
            return null;
        }
        if (((HmacParameters.Variant) this.remainingMessages) == null) {
            a$$ExternalSyntheticBUOutline0.m$6("variant is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.scope));
        }
        Integer num2 = (Integer) this.consumeMessage;
        int intValue = num2.intValue();
        HmacParameters.HashType hashType = (HmacParameters.HashType) this.messageQueue;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (hashType == HmacParameters.HashType.SHA1) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (hashType == HmacParameters.HashType.SHA224) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (hashType == HmacParameters.HashType.SHA256) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (hashType == HmacParameters.HashType.SHA384) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (hashType != HmacParameters.HashType.SHA512) {
                a$$ExternalSyntheticBUOutline0.m$6("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new HmacParameters(((Integer) this.scope).intValue(), ((Integer) this.consumeMessage).intValue(), (HmacParameters.Variant) this.remainingMessages, (HmacParameters.HashType) this.messageQueue);
    }

    public void cancel(StartStopToken startStopToken) {
        Runnable runnable;
        startStopToken.getClass();
        synchronized (this.messageQueue) {
            runnable = (Runnable) ((LinkedHashMap) this.remainingMessages).remove(startStopToken);
        }
        if (runnable != null) {
            ((Handler) ((MemoryCacheService) this.scope).imageLoader).removeCallbacks(runnable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1109dispatchPostFlingRZ2iAVY(long j, long j2, ContinuationImpl continuationImpl) {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        int i;
        long j3;
        if (continuationImpl instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) continuationImpl;
            int i2 = nestedScrollDispatcher$dispatchPostFling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.label = i2 - PKIFailureInfo.systemUnavail;
                NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$12 = nestedScrollDispatcher$dispatchPostFling$1;
                Object obj = nestedScrollDispatcher$dispatchPostFling$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nestedScrollDispatcher$dispatchPostFling$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    NestedScrollNode nestedScrollNode = (NestedScrollNode) this.consumeMessage;
                    j3 = 0;
                    if ((nestedScrollNode != null ? nestedScrollNode.getParentNestedScrollNode$ui() : null) == null) {
                        NestedScrollNode nestedScrollNode2 = (NestedScrollNode) this.messageQueue;
                        if (nestedScrollNode2 != null) {
                            nestedScrollDispatcher$dispatchPostFling$12.label = 1;
                            obj = nestedScrollNode2.mo241onPostFlingRZ2iAVY(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                        }
                    } else {
                        NestedScrollNode nestedScrollNode3 = (NestedScrollNode) this.consumeMessage;
                        NestedScrollNode parentNestedScrollNode$ui = nestedScrollNode3 != null ? nestedScrollNode3.getParentNestedScrollNode$ui() : null;
                        if (parentNestedScrollNode$ui != null) {
                            nestedScrollDispatcher$dispatchPostFling$12.label = 2;
                            obj = parentNestedScrollNode$ui.mo241onPostFlingRZ2iAVY(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                        }
                    }
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    j3 = ((Velocity) obj).m1073unboximpl();
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    j3 = ((Velocity) obj).m1073unboximpl();
                }
                return Velocity.m1064boximpl(j3);
            }
        }
        nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, continuationImpl);
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$122 = nestedScrollDispatcher$dispatchPostFling$1;
        Object obj2 = nestedScrollDispatcher$dispatchPostFling$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nestedScrollDispatcher$dispatchPostFling$122.label;
        if (i != 0) {
        }
        return Velocity.m1064boximpl(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m1110dispatchPreFlingQWom1Mo(long j, ContinuationImpl continuationImpl) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        int i;
        long j2;
        if (continuationImpl instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) continuationImpl;
            int i2 = nestedScrollDispatcher$dispatchPreFling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = nestedScrollDispatcher$dispatchPreFling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nestedScrollDispatcher$dispatchPreFling$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    NestedScrollNode nestedScrollNode = (NestedScrollNode) this.consumeMessage;
                    NestedScrollNode parentNestedScrollNode$ui = nestedScrollNode != null ? nestedScrollNode.getParentNestedScrollNode$ui() : null;
                    if (parentNestedScrollNode$ui == null) {
                        j2 = 0;
                        return Velocity.m1064boximpl(j2);
                    }
                    nestedScrollDispatcher$dispatchPreFling$1.label = 1;
                    obj = parentNestedScrollNode$ui.mo493onPreFlingQWom1Mo(j, nestedScrollDispatcher$dispatchPreFling$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                j2 = ((Velocity) obj).m1073unboximpl();
                return Velocity.m1064boximpl(j2);
            }
        }
        nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, continuationImpl);
        Object obj2 = nestedScrollDispatcher$dispatchPreFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nestedScrollDispatcher$dispatchPreFling$1.label;
        if (i != 0) {
        }
        j2 = ((Velocity) obj2).m1073unboximpl();
        return Velocity.m1064boximpl(j2);
    }

    public void dispatchToView(PointerEvent pointerEvent, boolean z) {
        PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) this.remainingMessages;
        List list = pointerEvent.changes;
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            if (((PointerInputChange) list.get(i)).isConsumed()) {
                stopDispatching(pointerEvent);
                return;
            }
        }
        NodeCoordinator nodeCoordinator = (NodeCoordinator) this.scope;
        if (nodeCoordinator == null) {
            a$$ExternalSyntheticBUOutline0.m$1("layoutCoordinates not set");
            return;
        }
        PointerEventKt.m809toMotionEventScoped4ec7I(pointerEvent, nodeCoordinator.mo841localToRootMKHz9U(0L), new TraceParser$parse$1(2, this, pointerInteropFilter));
        if (((PointerInteropFilter.DispatchToViewState) this.consumeMessage) == PointerInteropFilter.DispatchToViewState.Dispatching) {
            if (z) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((PointerInputChange) list.get(i2)).consume();
                }
            }
            zzr zzrVar = pointerEvent.internalPointerEvent;
            if (zzrVar != null) {
                zzrVar.zzc = !pointerInteropFilter.disallowIntercept;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r8 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r8 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doRun(ContinuationImpl continuationImpl) {
        DataStoreImpl$InitDataStore$doRun$1 dataStoreImpl$InitDataStore$doRun$1;
        int i;
        Data data;
        DataStoreImpl dataStoreImpl = (DataStoreImpl) this.remainingMessages;
        if (continuationImpl instanceof DataStoreImpl$InitDataStore$doRun$1) {
            dataStoreImpl$InitDataStore$doRun$1 = (DataStoreImpl$InitDataStore$doRun$1) continuationImpl;
            int i2 = dataStoreImpl$InitDataStore$doRun$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dataStoreImpl$InitDataStore$doRun$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = dataStoreImpl$InitDataStore$doRun$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataStoreImpl$InitDataStore$doRun$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = (List) this.messageQueue;
                    if (list == null || list.isEmpty()) {
                        dataStoreImpl$InitDataStore$doRun$1.L$0 = this;
                        dataStoreImpl$InitDataStore$doRun$1.label = 1;
                        obj = DataStoreImpl.access$readDataOrHandleCorruption(dataStoreImpl, false, dataStoreImpl$InitDataStore$doRun$1);
                    } else {
                        SingleProcessCoordinator coordinator = dataStoreImpl.getCoordinator();
                        DataStoreImpl$InitDataStore$doRun$initData$1 dataStoreImpl$InitDataStore$doRun$initData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1(dataStoreImpl, this, null);
                        dataStoreImpl$InitDataStore$doRun$1.L$0 = this;
                        dataStoreImpl$InitDataStore$doRun$1.label = 2;
                        obj = coordinator.lock(dataStoreImpl$InitDataStore$doRun$initData$1, dataStoreImpl$InitDataStore$doRun$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    this = dataStoreImpl$InitDataStore$doRun$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    data = (Data) obj;
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = dataStoreImpl$InitDataStore$doRun$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    data = (Data) obj;
                }
                ((DataStoreImpl) this.remainingMessages).inMemoryCache.tryUpdate(data);
                return Unit.INSTANCE;
            }
        }
        dataStoreImpl$InitDataStore$doRun$1 = new DataStoreImpl$InitDataStore$doRun$1(this, continuationImpl);
        Object obj2 = dataStoreImpl$InitDataStore$doRun$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$InitDataStore$doRun$1.label;
        if (i != 0) {
        }
        ((DataStoreImpl) this.remainingMessages).inMemoryCache.tryUpdate(data);
        return Unit.INSTANCE;
    }

    public CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope = (CoroutineScope) ((Function0) this.remainingMessages).invoke();
        if (coroutineScope != null) {
            return coroutineScope;
        }
        a$$ExternalSyntheticBUOutline0.m$1("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        int size$animation_core = animationVector.getSize$animation_core();
        long j = 0;
        for (int i = 0; i < size$animation_core; i++) {
            j = Math.max(j, ((Animations) this.scope).get(i).getDurationNanos(animationVector.get$animation_core(i), animationVector2.get$animation_core(i), animationVector3.get$animation_core(i)));
        }
        return j;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getEndVelocity(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (((AnimationVector) this.remainingMessages) == null) {
            this.remainingMessages = animationVector3.newVector$animation_core();
        }
        AnimationVector animationVector4 = (AnimationVector) this.remainingMessages;
        if (animationVector4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            throw null;
        }
        int size$animation_core = animationVector4.getSize$animation_core();
        int i = 0;
        while (true) {
            AnimationVector animationVector5 = (AnimationVector) this.remainingMessages;
            if (i >= size$animation_core) {
                if (animationVector5 != null) {
                    return animationVector5;
                }
                Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
                throw null;
            }
            if (animationVector5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
                throw null;
            }
            animationVector5.set$animation_core(((Animations) this.scope).get(i).getEndVelocity(animationVector.get$animation_core(i), animationVector2.get$animation_core(i), animationVector3.get$animation_core(i)), i);
            i++;
        }
    }

    public KeysetHandle getOrBootstrap(String str) {
        if (!((ConcurrentHashMap) this.remainingMessages).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.remainingMessages).containsKey(str)) {
                        try {
                            ((ClassPathResourceMetadataLoader) this.scope).getClass();
                            InputStream loadMetadata = ClassPathResourceMetadataLoader.loadMetadata(str);
                            ((MetadataParser) this.consumeMessage).getClass();
                            for (Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata : MetadataParser.parse(loadMetadata)) {
                                KeysetHandle keysetHandle = (KeysetHandle) this.messageQueue;
                                KeysetHandle keysetHandle2 = (KeysetHandle) keysetHandle.annotationsMap;
                                if (((String) ((MapBackedMetadataContainer$KeyProvider) keysetHandle2.annotationsMap).getKeyOf(phonemetadata$PhoneMetadata)).equals("001")) {
                                    ((KeysetHandle) keysetHandle.entries).accept(phonemetadata$PhoneMetadata);
                                } else {
                                    keysetHandle2.accept(phonemetadata$PhoneMetadata);
                                }
                            }
                            ((ConcurrentHashMap) this.remainingMessages).put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            throw new IllegalStateException("Failed to read file ".concat(str), e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (KeysetHandle) this.messageQueue;
    }

    public SemanticsNode getUnmergedRootSemanticsNode() {
        return new SemanticsNode((EmptySemanticsModifier) this.consumeMessage, false, (LayoutNode) this.scope, new SemanticsConfiguration());
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getValueFromNanos(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (((AnimationVector) this.consumeMessage) == null) {
            this.consumeMessage = animationVector.newVector$animation_core();
        }
        AnimationVector animationVector4 = (AnimationVector) this.consumeMessage;
        if (animationVector4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            throw null;
        }
        int size$animation_core = animationVector4.getSize$animation_core();
        int i = 0;
        while (true) {
            AnimationVector animationVector5 = (AnimationVector) this.consumeMessage;
            if (i >= size$animation_core) {
                if (animationVector5 != null) {
                    return animationVector5;
                }
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                throw null;
            }
            if (animationVector5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                throw null;
            }
            animationVector5.set$animation_core(((Animations) this.scope).get(i).getValueFromNanos(j, animationVector.get$animation_core(i), animationVector2.get$animation_core(i), animationVector3.get$animation_core(i)), i);
            i++;
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getVelocityFromNanos(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (((AnimationVector) this.messageQueue) == null) {
            this.messageQueue = animationVector3.newVector$animation_core();
        }
        AnimationVector animationVector4 = (AnimationVector) this.messageQueue;
        if (animationVector4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            throw null;
        }
        int size$animation_core = animationVector4.getSize$animation_core();
        int i = 0;
        while (true) {
            AnimationVector animationVector5 = (AnimationVector) this.messageQueue;
            if (i >= size$animation_core) {
                if (animationVector5 != null) {
                    return animationVector5;
                }
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                throw null;
            }
            if (animationVector5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                throw null;
            }
            animationVector5.set$animation_core(((Animations) this.scope).get(i).getVelocityFromNanos(j, animationVector.get$animation_core(i), animationVector2.get$animation_core(i), animationVector3.get$animation_core(i)), i);
            i++;
        }
    }

    public ViewModel getViewModel$lifecycle_viewmodel(String str, KClass kClass) {
        ViewModel viewModel;
        ViewModel create;
        kClass.getClass();
        synchronized (((zzh) this.remainingMessages)) {
            try {
                ViewModelStore viewModelStore = (ViewModelStore) this.scope;
                viewModelStore.getClass();
                viewModel = (ViewModel) viewModelStore.map.get(str);
                if (kClass.isInstance(viewModel)) {
                    Object obj = (ViewModelProvider$Factory) this.consumeMessage;
                    if (obj instanceof ViewModelProvider$OnRequeryFactory) {
                        viewModel.getClass();
                        ((ViewModelProvider$OnRequeryFactory) obj).onRequery(viewModel);
                    }
                    viewModel.getClass();
                } else {
                    MutableCreationExtras mutableCreationExtras = new MutableCreationExtras((CreationExtras) this.messageQueue);
                    mutableCreationExtras.extras.put(AtomicReference.VIEW_MODEL_KEY, str);
                    ViewModelProvider$Factory viewModelProvider$Factory = (ViewModelProvider$Factory) this.consumeMessage;
                    viewModelProvider$Factory.getClass();
                    try {
                        try {
                            create = viewModelProvider$Factory.create(kClass, mutableCreationExtras);
                        } catch (AbstractMethodError unused) {
                            create = viewModelProvider$Factory.create(PapaEvent.getJavaClass(kClass));
                        }
                    } catch (AbstractMethodError unused2) {
                        create = viewModelProvider$Factory.create(PapaEvent.getJavaClass(kClass), mutableCreationExtras);
                    }
                    viewModel = create;
                    ViewModelStore viewModelStore2 = (ViewModelStore) this.scope;
                    viewModelStore2.getClass();
                    viewModel.getClass();
                    ViewModel viewModel2 = (ViewModel) viewModelStore2.map.put(str, viewModel);
                    if (viewModel2 != null) {
                        viewModel2.clear$lifecycle_viewmodel();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return viewModel;
    }

    public String loadDeviceId(boolean z) {
        try {
            DeviceId loadDeviceIdInternal = loadDeviceIdInternal();
            if ((loadDeviceIdInternal != null ? loadDeviceIdInternal.id : null) != null) {
                return loadDeviceIdInternal.id;
            }
            if (z) {
                return persistNewDeviceUuid((UUID) ((Function0) this.consumeMessage).invoke());
            }
            return null;
        } catch (Throwable th) {
            ((Logger) this.messageQueue).w("Failed to load device ID", th);
            return null;
        }
    }

    public DeviceId loadDeviceIdInternal() {
        if (((File) this.scope).length() <= 0) {
            return null;
        }
        try {
            return (DeviceId) ((DeliveryParams) this.remainingMessages).load(new RealStorage$temp$1(1, DeviceId.Companion, DeviceId.Companion.class, "fromReader", "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/DeviceId;", 0, 6));
        } catch (Throwable th) {
            ((Logger) this.messageQueue).w("Failed to load device ID", th);
            return null;
        }
    }

    public BetterNavigator navigatorFor(NavigatorState navigatorState) {
        Object obj = ((LinkedHashMap) this.messageQueue).get(navigatorState);
        obj.getClass();
        return (BetterNavigator) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void notifySemanticsChange$ui(LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        String str;
        String str2;
        ToggleableState toggleableState;
        ToggleableState toggleableState2;
        AndroidFillableData androidFillableData;
        AndroidFillableData androidFillableData2;
        boolean z;
        boolean z2;
        MutableObjectList mutableObjectList = (MutableObjectList) this.remainingMessages;
        Object[] objArr = mutableObjectList.content;
        int i = mutableObjectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            AndroidAutofillManager androidAutofillManager = (AndroidAutofillManager) objArr[i2];
            MemoryCacheService memoryCacheService = androidAutofillManager.platformAutofillManager;
            AutofillManager autofillManager = (AutofillManager) memoryCacheService.imageLoader;
            AndroidComposeView androidComposeView = androidAutofillManager.view;
            SemanticsConfiguration semanticsConfiguration2 = layoutNode.getSemanticsConfiguration();
            int i3 = layoutNode.semanticsId;
            if (semanticsConfiguration != null) {
                Object obj = semanticsConfiguration.props.get(SemanticsProperties.InputText);
                if (obj == null) {
                    obj = null;
                }
                AnnotatedString annotatedString = (AnnotatedString) obj;
                if (annotatedString != null) {
                    str = annotatedString.text;
                    if (semanticsConfiguration2 != null) {
                        Object obj2 = semanticsConfiguration2.props.get(SemanticsProperties.InputText);
                        if (obj2 == null) {
                            obj2 = null;
                        }
                        AnnotatedString annotatedString2 = (AnnotatedString) obj2;
                        if (annotatedString2 != null) {
                            str2 = annotatedString2.text;
                            if (str != str2) {
                                if (str == null) {
                                    memoryCacheService.notifyViewVisibilityChanged(androidComposeView, i3, true);
                                } else if (str2 == null) {
                                    memoryCacheService.notifyViewVisibilityChanged(androidComposeView, i3, false);
                                } else if (Intrinsics.areEqual((AndroidContentDataType) TransactorKt.getOrNull(semanticsConfiguration2, SemanticsProperties.ContentDataType), ContentDataType$Companion.Text)) {
                                    autofillManager.notifyValueChanged(androidComposeView, i3, AutofillApi26Helper.getAutofillTextValue(str2));
                                }
                            }
                            if (semanticsConfiguration != null) {
                                Object obj3 = semanticsConfiguration.props.get(SemanticsProperties.ToggleableState);
                                if (obj3 == null) {
                                    obj3 = null;
                                }
                                toggleableState = (ToggleableState) obj3;
                            } else {
                                toggleableState = null;
                            }
                            if (semanticsConfiguration2 != null) {
                                Object obj4 = semanticsConfiguration2.props.get(SemanticsProperties.ToggleableState);
                                if (obj4 == null) {
                                    obj4 = null;
                                }
                                toggleableState2 = (ToggleableState) obj4;
                            } else {
                                toggleableState2 = null;
                            }
                            if (toggleableState != toggleableState2) {
                                if (toggleableState == null) {
                                    memoryCacheService.notifyViewVisibilityChanged(androidComposeView, i3, true);
                                } else if (toggleableState2 == null) {
                                    memoryCacheService.notifyViewVisibilityChanged(androidComposeView, i3, false);
                                } else if (Intrinsics.areEqual((AndroidContentDataType) TransactorKt.getOrNull(semanticsConfiguration2, SemanticsProperties.ContentDataType), ContentDataType$Companion.Toggle)) {
                                    int ordinal = toggleableState2.ordinal();
                                    Boolean bool = ordinal != 0 ? ordinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                                    if (bool != null) {
                                        autofillManager.notifyValueChanged(androidComposeView, i3, AutofillApi26Helper.getAutofillToggleValue(bool.booleanValue()));
                                    }
                                }
                            }
                            if (semanticsConfiguration != null) {
                                Object obj5 = semanticsConfiguration.props.get(SemanticsProperties.FillableData);
                                if (obj5 == null) {
                                    obj5 = null;
                                }
                                androidFillableData = (AndroidFillableData) obj5;
                            } else {
                                androidFillableData = null;
                            }
                            if (semanticsConfiguration2 != null) {
                                Object obj6 = semanticsConfiguration2.props.get(SemanticsProperties.FillableData);
                                if (obj6 == null) {
                                    obj6 = null;
                                }
                                androidFillableData2 = (AndroidFillableData) obj6;
                            } else {
                                androidFillableData2 = null;
                            }
                            if (!Intrinsics.areEqual(androidFillableData, androidFillableData2)) {
                                if (androidFillableData == null) {
                                    memoryCacheService.notifyViewVisibilityChanged(androidComposeView, i3, true);
                                } else if (androidFillableData2 == null) {
                                    memoryCacheService.notifyViewVisibilityChanged(androidComposeView, i3, false);
                                } else {
                                    autofillManager.notifyValueChanged(androidComposeView, i3, androidFillableData2.autofillValue);
                                }
                            }
                            z = semanticsConfiguration == null && semanticsConfiguration.props.contains(SemanticsProperties.ContentType);
                            z2 = semanticsConfiguration2 == null && semanticsConfiguration2.props.contains(SemanticsProperties.ContentType);
                            if (z != z2) {
                                MutableIntSet mutableIntSet = androidAutofillManager.currentlyDisplayedIDs;
                                if (z2) {
                                    mutableIntSet.add(i3);
                                } else {
                                    mutableIntSet.remove(i3);
                                }
                            }
                        }
                    }
                    str2 = null;
                    if (str != str2) {
                    }
                    if (semanticsConfiguration != null) {
                    }
                    if (semanticsConfiguration2 != null) {
                    }
                    if (toggleableState != toggleableState2) {
                    }
                    if (semanticsConfiguration != null) {
                    }
                    if (semanticsConfiguration2 != null) {
                    }
                    if (!Intrinsics.areEqual(androidFillableData, androidFillableData2)) {
                    }
                    if (semanticsConfiguration == null) {
                    }
                    if (semanticsConfiguration2 == null) {
                    }
                    if (z != z2) {
                    }
                }
            }
            str = null;
            if (semanticsConfiguration2 != null) {
            }
            str2 = null;
            if (str != str2) {
            }
            if (semanticsConfiguration != null) {
            }
            if (semanticsConfiguration2 != null) {
            }
            if (toggleableState != toggleableState2) {
            }
            if (semanticsConfiguration != null) {
            }
            if (semanticsConfiguration2 != null) {
            }
            if (!Intrinsics.areEqual(androidFillableData, androidFillableData2)) {
            }
            if (semanticsConfiguration == null) {
            }
            if (semanticsConfiguration2 == null) {
            }
            if (z != z2) {
            }
        }
    }

    public String persistNewDeviceUuid(UUID uuid) {
        FileLock fileLock;
        String uuid2;
        try {
            FileChannel channel = new FileOutputStream((File) this.scope).getChannel();
            int i = 0;
            while (true) {
                if (i >= 20) {
                    fileLock = null;
                    break;
                }
                try {
                    try {
                        fileLock = channel.tryLock();
                        break;
                    } catch (OverlappingFileLockException unused) {
                        Thread.sleep(25L);
                        i++;
                    }
                } finally {
                }
            }
            if (fileLock == null) {
                uuid2 = null;
            } else {
                try {
                    DeviceId loadDeviceIdInternal = loadDeviceIdInternal();
                    if ((loadDeviceIdInternal != null ? loadDeviceIdInternal.id : null) != null) {
                        uuid2 = loadDeviceIdInternal.id;
                    } else {
                        uuid2 = uuid.toString();
                        ((DeliveryParams) this.remainingMessages).persist(new DeviceId(uuid2));
                    }
                    fileLock.release();
                } catch (Throwable th) {
                    fileLock.release();
                    throw th;
                }
            }
            Utf8.closeFinally(channel, null);
            return uuid2;
        } catch (IOException e) {
            ((Logger) this.messageQueue).w("Failed to persist device ID", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005f, code lost:
    
        if (r8.lock(r0) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:25:0x0062, B:27:0x006c, B:30:0x0077), top: B:24:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:25:0x0062, B:27:0x006c, B:30:0x0077), top: B:24:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v10, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object runIfNeeded(ContinuationImpl continuationImpl) {
        RunOnce$runIfNeeded$1 runOnce$runIfNeeded$1;
        int i;
        MutexImpl mutexImpl;
        Throwable th;
        Mutex mutex;
        SimpleActor simpleActor;
        try {
            if (continuationImpl instanceof RunOnce$runIfNeeded$1) {
                runOnce$runIfNeeded$1 = (RunOnce$runIfNeeded$1) continuationImpl;
                int i2 = runOnce$runIfNeeded$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    runOnce$runIfNeeded$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = runOnce$runIfNeeded$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = runOnce$runIfNeeded$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (((CompletableDeferredImpl) this.consumeMessage).isCompleted()) {
                            return Unit.INSTANCE;
                        }
                        mutexImpl = (MutexImpl) this.scope;
                        runOnce$runIfNeeded$1.L$0 = this;
                        runOnce$runIfNeeded$1.L$1 = mutexImpl;
                        runOnce$runIfNeeded$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutex = runOnce$runIfNeeded$1.L$1;
                            simpleActor = runOnce$runIfNeeded$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                CompletableDeferredImpl completableDeferredImpl = (CompletableDeferredImpl) simpleActor.consumeMessage;
                                Unit unit = Unit.INSTANCE;
                                completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(unit);
                                mutex.unlock(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex.unlock(null);
                                throw th;
                            }
                        }
                        ?? r7 = runOnce$runIfNeeded$1.L$1;
                        SimpleActor simpleActor2 = runOnce$runIfNeeded$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = r7;
                        this = simpleActor2;
                    }
                    if (!((CompletableDeferredImpl) this.consumeMessage).isCompleted()) {
                        Unit unit2 = Unit.INSTANCE;
                        mutexImpl.unlock(null);
                        return unit2;
                    }
                    runOnce$runIfNeeded$1.L$0 = this;
                    runOnce$runIfNeeded$1.L$1 = mutexImpl;
                    runOnce$runIfNeeded$1.label = 2;
                    if (this.doRun(runOnce$runIfNeeded$1) != coroutineSingletons) {
                        simpleActor = this;
                        mutex = mutexImpl;
                        CompletableDeferredImpl completableDeferredImpl2 = (CompletableDeferredImpl) simpleActor.consumeMessage;
                        Unit unit3 = Unit.INSTANCE;
                        completableDeferredImpl2.makeCompleting$kotlinx_coroutines_core(unit3);
                        mutex.unlock(null);
                        return unit3;
                    }
                    return coroutineSingletons;
                }
            }
            if (!((CompletableDeferredImpl) this.consumeMessage).isCompleted()) {
            }
        } catch (Throwable th3) {
            MutexImpl mutexImpl2 = mutexImpl;
            th = th3;
            mutex = mutexImpl2;
            mutex.unlock(null);
            throw th;
        }
        runOnce$runIfNeeded$1 = new RunOnce$runIfNeeded$1(this, continuationImpl);
        Object obj2 = runOnce$runIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = runOnce$runIfNeeded$1.label;
        if (i != 0) {
        }
    }

    public void setActiveKey(NavigatorState navigatorState) {
        this.consumeMessage = navigatorState;
        DerivedStateFlow derivedStateFlow = (DerivedStateFlow) this.remainingMessages;
        StateFlowImpl stateFlowImpl = (StateFlowImpl) derivedStateFlow.flow;
        derivedStateFlow.validateKey(navigatorState);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, navigatorState);
        updateNavigatorStates();
    }

    public void setIvSizeBytes(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.consumeMessage = Integer.valueOf(i);
    }

    public void setKeySizeBytes(int i) {
        switch (this.$r8$classId) {
            case 12:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.scope = Integer.valueOf(i);
                return;
            default:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.scope = Integer.valueOf(i);
                return;
        }
    }

    public void setTagSizeBytes() {
        switch (this.$r8$classId) {
            case 12:
                this.messageQueue = 16;
                break;
            default:
                this.messageQueue = 16;
                break;
        }
    }

    public void stopDispatching(PointerEvent pointerEvent) {
        if (((PointerInteropFilter.DispatchToViewState) this.consumeMessage) == PointerInteropFilter.DispatchToViewState.Dispatching) {
            NodeCoordinator nodeCoordinator = (NodeCoordinator) this.scope;
            if (nodeCoordinator == null) {
                a$$ExternalSyntheticBUOutline0.m$1("layoutCoordinates not set");
                return;
            }
            PointerEventKt.m808toCancelMotionEventScoped4ec7I(pointerEvent, nodeCoordinator.mo841localToRootMKHz9U(0L), new PointerInteropFilter$pointerInputFilter$1$onCancel$1((PointerInteropFilter) this.remainingMessages, 1));
        }
        this.consumeMessage = PointerInteropFilter.DispatchToViewState.NotDispatching;
    }

    public void track(StartStopToken startStopToken) {
        startStopToken.getClass();
        MainActivity$$ExternalSyntheticLambda8 mainActivity$$ExternalSyntheticLambda8 = new MainActivity$$ExternalSyntheticLambda8(6, this, startStopToken);
        synchronized (this.messageQueue) {
        }
        ((Handler) ((MemoryCacheService) this.scope).imageLoader).postDelayed(mainActivity$$ExternalSyntheticLambda8, 5400000L);
    }

    public void updateNavigatorStates() {
        String stateKey;
        String str;
        String str2;
        SavedState savePresenterState;
        SavedState savePresenterState2;
        SavedState savePresenterState3;
        for (Map.Entry entry : ((LinkedHashMap) this.messageQueue).entrySet()) {
            Enum r2 = (Enum) entry.getKey();
            BetterNavigator betterNavigator = (BetterNavigator) entry.getValue();
            BetterNavigator.State state = Intrinsics.areEqual((Enum) this.consumeMessage, r2) ? BetterNavigator.State.Active : BetterNavigator.State.Paused;
            LinkedHashMap linkedHashMap = betterNavigator.pausedStates;
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                a$$ExternalSyntheticBUOutline0.m$3("Navigator state must be mutated on the main thread.");
                return;
            }
            if (betterNavigator.state != state) {
                betterNavigator.state = state;
                FullScreen fullScreen = betterNavigator.fullScreen;
                betterNavigator.dirty = fullScreen != null;
                if (state == BetterNavigator.State.Paused) {
                    if (fullScreen != null && (savePresenterState3 = betterNavigator.savePresenterState(fullScreen)) != null) {
                        linkedHashMap.put(fullScreen.stateKey, savePresenterState3);
                    }
                    FullScreen fullScreen2 = betterNavigator.swipe;
                    if (fullScreen2 != null && (savePresenterState2 = betterNavigator.savePresenterState(fullScreen2)) != null) {
                        linkedHashMap.put(fullScreen2.stateKey, savePresenterState2);
                    }
                    OverlayScreen overlayScreen = betterNavigator.overlay;
                    if (overlayScreen != null && (savePresenterState = betterNavigator.savePresenterState(overlayScreen)) != null) {
                        linkedHashMap.put(overlayScreen.getStateKey(), savePresenterState);
                    }
                    FullScreen fullScreen3 = betterNavigator.fullScreen;
                    if (fullScreen3 != null) {
                        betterNavigator.tearDownOrDefer(fullScreen3, false);
                    }
                    FullScreen fullScreen4 = betterNavigator.swipe;
                    if (fullScreen4 != null) {
                        betterNavigator.tearDownOrDefer(fullScreen4, false);
                    }
                    OverlayScreen overlayScreen2 = betterNavigator.overlay;
                    if (overlayScreen2 != null) {
                        betterNavigator.tearDownOrDefer(overlayScreen2, false);
                    }
                    betterNavigator.overlayResults.clear();
                } else {
                    if (fullScreen != null && (str2 = fullScreen.stateKey) != null) {
                        betterNavigator.recoverFromDeferredTearDown(str2);
                    }
                    FullScreen fullScreen5 = betterNavigator.swipe;
                    if (fullScreen5 != null && (str = fullScreen5.stateKey) != null) {
                        betterNavigator.recoverFromDeferredTearDown(str);
                    }
                    OverlayScreen overlayScreen3 = betterNavigator.overlay;
                    if (overlayScreen3 != null && (stateKey = overlayScreen3.getStateKey()) != null) {
                        betterNavigator.recoverFromDeferredTearDown(stateKey);
                    }
                }
                Iterator it = betterNavigator.eventListeners.iterator();
                while (it.hasNext()) {
                    ((EventListener) it.next()).stateChanged(betterNavigator.createEventState());
                }
                betterNavigator.emitIfDirty();
            }
        }
    }

    public Bundle zza() {
        JSONObject jSONObject;
        String string2;
        String string3;
        int hashCode;
        zzhh zzhhVar = (zzhh) this.remainingMessages;
        if (((Bundle) this.messageQueue) == null) {
            String str = (String) this.scope;
            SharedPreferences zzd = zzhhVar.zzd();
            zzic zzicVar = (zzic) zzhhVar.$$delegate_0;
            String string4 = zzd.getString(str, null);
            if (string4 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string4);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i);
                            string2 = jSONObject.getString("n");
                            string3 = jSONObject.getString("t");
                            hashCode = string3.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            zzgu zzguVar = zzicVar.zzi;
                            zzic.zzP(zzguVar);
                            zzguVar.zzd.zza("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string3.equals("la")) {
                                            zzaif.zza();
                                            if (zzicVar.zzg.zzp(null, zzfy.zzaP)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i2 = 0; i2 < length; i2++) {
                                                    jArr[i2] = jSONArray2.optLong(i2);
                                                }
                                                bundle.putLongArray(string2, jArr);
                                            }
                                        }
                                    } else if (string3.equals("ia")) {
                                        zzaif.zza();
                                        if (zzicVar.zzg.zzp(null, zzfy.zzaP)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i3 = 0; i3 < length2; i3++) {
                                                iArr[i3] = jSONArray3.optInt(i3);
                                            }
                                            bundle.putIntArray(string2, iArr);
                                        }
                                    }
                                } else if (string3.equals("s")) {
                                    bundle.putString(string2, jSONObject.getString("v"));
                                }
                            } else if (string3.equals("l")) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string3.equals("d")) {
                            bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                        }
                        zzgu zzguVar2 = zzicVar.zzi;
                        zzic.zzP(zzguVar2);
                        zzguVar2.zzd.zzb(string3, "Unrecognized persisted bundle type. Type");
                    }
                    this.messageQueue = bundle;
                } catch (JSONException unused2) {
                    zzgu zzguVar3 = zzicVar.zzi;
                    zzic.zzP(zzguVar3);
                    zzguVar3.zzd.zza("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.messageQueue) == null) {
                this.messageQueue = (Bundle) this.consumeMessage;
            }
        }
        Bundle bundle2 = (Bundle) this.messageQueue;
        zzae.checkNotNull(bundle2);
        return new Bundle(bundle2);
    }

    public void zzb(Bundle bundle) {
        zzhh zzhhVar = (zzhh) this.remainingMessages;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences zzd = zzhhVar.zzd();
        zzic zzicVar = (zzic) zzhhVar.$$delegate_0;
        SharedPreferences.Editor edit = zzd.edit();
        int size = bundle2.size();
        String str = (String) this.scope;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        zzaif.zza();
                        if (!zzicVar.zzg.zzp(null, zzfy.zzaP)) {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                zzgu zzguVar = zzicVar.zzi;
                                zzic.zzP(zzguVar);
                                zzguVar.zzd.zzb(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            zzgu zzguVar2 = zzicVar.zzi;
                            zzic.zzP(zzguVar2);
                            zzguVar2.zzd.zzb(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        zzgu zzguVar3 = zzicVar.zzi;
                        zzic.zzP(zzguVar3);
                        zzguVar3.zzd.zzb(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.messageQueue = bundle2;
    }

    public void setIvSizeBytes() {
        this.consumeMessage = 12;
    }

    public SimpleActor(MemoryCacheService memoryCacheService, WorkLauncherImpl workLauncherImpl) {
        this.$r8$classId = 8;
        memoryCacheService.getClass();
        this.scope = memoryCacheService;
        this.consumeMessage = workLauncherImpl;
        this.messageQueue = new Object();
        this.remainingMessages = new LinkedHashMap();
    }

    public /* synthetic */ SimpleActor(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.scope = obj;
        this.consumeMessage = obj2;
        this.messageQueue = obj3;
        this.remainingMessages = obj4;
    }

    public SimpleActor(zzhh zzhhVar, String str) {
        this.$r8$classId = 11;
        this.remainingMessages = zzhhVar;
        zzae.checkNotEmpty(str);
        this.scope = str;
        this.consumeMessage = new Bundle();
    }

    public SimpleActor(File file, Function0 function0, Logger logger) {
        this.$r8$classId = 10;
        this.scope = file;
        this.consumeMessage = function0;
        this.messageQueue = logger;
        try {
            file.createNewFile();
        } catch (Throwable th) {
            ((Logger) this.messageQueue).w("Failed to created device ID file", th);
        }
        this.remainingMessages = new DeliveryParams((File) this.scope);
    }

    public /* synthetic */ SimpleActor(int i, boolean z) {
        this.$r8$classId = i;
    }

    public SimpleActor(CoroutineScope coroutineScope, WindowsKt$onNextDraw$1 windowsKt$onNextDraw$1, GatedFrameClock.AnonymousClass1 anonymousClass1) {
        int i = 0;
        this.$r8$classId = 0;
        this.scope = coroutineScope;
        this.consumeMessage = anonymousClass1;
        this.messageQueue = PapaEvent.Channel$default(Integer.MAX_VALUE, null, null, 6);
        this.remainingMessages = new MemoryCacheService(16);
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key.$$INSTANCE);
        if (job != null) {
            job.invokeOnCompletion(new AnonymousClass1(i, windowsKt$onNextDraw$1, this));
        }
    }

    public SimpleActor(ViewModelStore viewModelStore, ViewModelProvider$Factory viewModelProvider$Factory, CreationExtras creationExtras) {
        this.$r8$classId = 7;
        viewModelStore.getClass();
        viewModelProvider$Factory.getClass();
        creationExtras.getClass();
        this.scope = viewModelStore;
        this.consumeMessage = viewModelProvider$Factory;
        this.messageQueue = creationExtras;
        this.remainingMessages = new zzh(6);
    }

    public SimpleActor(LayoutNode layoutNode, EmptySemanticsModifier emptySemanticsModifier, MutableIntObjectMap mutableIntObjectMap) {
        this.$r8$classId = 5;
        this.scope = layoutNode;
        this.consumeMessage = emptySemanticsModifier;
        this.messageQueue = mutableIntObjectMap;
        this.remainingMessages = new MutableObjectList(2);
    }

    public SimpleActor(AndroidComposeView androidComposeView, StartStopTokensImpl startStopTokensImpl) {
        this.$r8$classId = 2;
        this.scope = androidComposeView;
        this.consumeMessage = startStopTokensImpl;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.messageQueue = autofillManager;
            androidComposeView.setImportantForAutofill(1);
            AutofillId autofillId = androidComposeView.getAutofillId();
            if (autofillId != null) {
                this.remainingMessages = autofillId;
                return;
            }
            throw Boxes$$ExternalSyntheticOutline1.m1150m("Required value was null.");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Autofill service could not be located.");
        throw null;
    }

    public SimpleActor(PointerInteropFilter pointerInteropFilter) {
        this.$r8$classId = 4;
        this.remainingMessages = pointerInteropFilter;
        this.consumeMessage = PointerInteropFilter.DispatchToViewState.Unknown;
    }

    public SimpleActor(ClassPathResourceMetadataLoader classPathResourceMetadataLoader, MetadataParser metadataParser, KeysetHandle keysetHandle) {
        this.$r8$classId = 17;
        this.scope = classPathResourceMetadataLoader;
        this.consumeMessage = metadataParser;
        this.messageQueue = keysetHandle;
        this.remainingMessages = new ConcurrentHashMap();
    }

    public SimpleActor(SerializationRegistry serializationRegistry) {
        this.$r8$classId = 15;
        this.scope = new HashMap(serializationRegistry.keySerializerMap);
        this.consumeMessage = new HashMap(serializationRegistry.keyParserMap);
        this.messageQueue = new HashMap(serializationRegistry.parametersSerializerMap);
        this.remainingMessages = new HashMap(serializationRegistry.parametersParserMap);
    }

    public SimpleActor(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 15:
                this.scope = new HashMap();
                this.consumeMessage = new HashMap();
                this.messageQueue = new HashMap();
                this.remainingMessages = new HashMap();
                break;
            default:
                this.remainingMessages = new ContourLayout$geometry$1(this, 3);
                break;
        }
    }

    public SimpleActor(AnimatedVisibilityScope animatedVisibilityScope, SharedTransitionScope sharedTransitionScope, Object obj, Object obj2) {
        this.$r8$classId = 21;
        animatedVisibilityScope.getClass();
        sharedTransitionScope.getClass();
        obj.getClass();
        obj2.getClass();
        this.scope = animatedVisibilityScope;
        this.consumeMessage = sharedTransitionScope;
        this.messageQueue = obj;
        this.remainingMessages = obj2;
    }

    public SimpleActor(DataStoreImpl dataStoreImpl, List list) {
        this.$r8$classId = 6;
        list.getClass();
        this.remainingMessages = dataStoreImpl;
        this.scope = new MutexImpl();
        this.consumeMessage = new CompletableDeferredImpl();
        this.messageQueue = CollectionsKt.toList(list);
    }

    public AesEaxParameters build() {
        Integer num = (Integer) this.scope;
        if (num != null) {
            if (((Integer) this.consumeMessage) != null) {
                if (((AesEaxParameters.Variant) this.remainingMessages) != null) {
                    if (((Integer) this.messageQueue) != null) {
                        return new AesEaxParameters(num.intValue(), ((Integer) this.consumeMessage).intValue(), ((Integer) this.messageQueue).intValue(), (AesEaxParameters.Variant) this.remainingMessages);
                    }
                    a$$ExternalSyntheticBUOutline0.m$6("Tag size is not set");
                    return null;
                }
                a$$ExternalSyntheticBUOutline0.m$6("Variant is not set");
                return null;
            }
            a$$ExternalSyntheticBUOutline0.m$6("IV size is not set");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Key size is not set");
        return null;
    }

    public SimpleActor(Animations animations) {
        this.$r8$classId = 1;
        this.scope = animations;
    }

    /* renamed from: build, reason: collision with other method in class */
    public HpkeParameters m1112build() {
        HpkeParameters.KemId kemId = (HpkeParameters.KemId) this.scope;
        if (kemId != null) {
            HpkeParameters.KdfId kdfId = (HpkeParameters.KdfId) this.consumeMessage;
            if (kdfId != null) {
                HpkeParameters.AeadId aeadId = (HpkeParameters.AeadId) this.messageQueue;
                if (aeadId != null) {
                    HpkeParameters.Variant variant = (HpkeParameters.Variant) this.remainingMessages;
                    if (variant != null) {
                        return new HpkeParameters(kemId, kdfId, aeadId, variant);
                    }
                    a$$ExternalSyntheticBUOutline0.m$6("HPKE variant is not set");
                    return null;
                }
                a$$ExternalSyntheticBUOutline0.m$6("HPKE AEAD parameter is not set");
                return null;
            }
            a$$ExternalSyntheticBUOutline0.m$6("HPKE KDF parameter is not set");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$6("HPKE KEM parameter is not set");
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleActor(FloatAnimationSpec floatAnimationSpec) {
        this(new MemoryCacheService(floatAnimationSpec, 4));
        this.$r8$classId = 1;
    }

    /* renamed from: build, reason: collision with other method in class */
    public AesGcmParameters m1111build() {
        Integer num = (Integer) this.scope;
        if (num != null) {
            if (((AesEaxParameters.Variant) this.remainingMessages) != null) {
                if (((Integer) this.consumeMessage) != null) {
                    if (((Integer) this.messageQueue) != null) {
                        return new AesGcmParameters(num.intValue(), ((Integer) this.consumeMessage).intValue(), ((Integer) this.messageQueue).intValue(), (AesEaxParameters.Variant) this.remainingMessages);
                    }
                    a$$ExternalSyntheticBUOutline0.m$6("Tag size is not set");
                    return null;
                }
                a$$ExternalSyntheticBUOutline0.m$6("IV size is not set");
                return null;
            }
            a$$ExternalSyntheticBUOutline0.m$6("Variant is not set");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$6("Key size is not set");
        return null;
    }
}
