package androidx.compose.foundation.gestures;

import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.compose.foundation.gestures.LongPressResult;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.paging.CachedPagingDataKt$cachedIn$5;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$result$1;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$2$1$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import okio.internal.FileSystem$commonDeleteRecursively$sequence$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class TapGestureDetectorKt {
    public static final CachedPagingDataKt$cachedIn$5 NoPressGesture = new CachedPagingDataKt$cachedIn$5(3, null, 3);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFirstDown(androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine r6, boolean r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r6 = r0.Z$0
            androidx.compose.ui.input.pointer.PointerEventPass r7 = r0.L$1
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r8 = r0.L$0
            papa.SafeTrace.throwOnFailure(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4a
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            bo.app.a$$ExternalSyntheticBUOutline0.m$1(r6)
            r6 = 0
            return r6
        L38:
            papa.SafeTrace.throwOnFailure(r9)
        L3b:
            r0.L$0 = r6
            r0.L$1 = r8
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r9 = r6.awaitPointerEvent(r8, r0)
            if (r9 != r1) goto L4a
            return r1
        L4a:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            r2 = 0
            boolean r4 = isChangedToDown(r9, r7, r2)
            if (r4 == 0) goto L3b
            java.util.List r6 = r9.changes
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, Continuation continuation, int i) {
        PointerEventPass pointerEventPass = PointerEventPass.Initial;
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(pointerEventHandlerCoroutine, z, pointerEventPass, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitPrimaryFirstDown(androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine r6, androidx.compose.ui.input.pointer.PointerEventPass r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            androidx.compose.ui.input.pointer.PointerEventPass r6 = r0.L$1
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r7 = r0.L$0
            papa.SafeTrace.throwOnFailure(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L45
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            bo.app.a$$ExternalSyntheticBUOutline0.m$1(r6)
            r6 = 0
            return r6
        L35:
            papa.SafeTrace.throwOnFailure(r8)
        L38:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r6.awaitPointerEvent(r7, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            r2 = 0
            boolean r4 = isChangedToDown(r8, r2, r3)
            if (r4 == 0) goto L38
            java.util.List r6 = r8.changes
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitPrimaryFirstDown(androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[LOOP:0: B:11:0x004d->B:12:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object consumeUntilUp(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, ContinuationImpl continuationImpl) {
        TapGestureDetectorKt$consumeUntilUp$1 tapGestureDetectorKt$consumeUntilUp$1;
        int i;
        int size;
        int i2;
        int i3;
        int size2;
        if (continuationImpl instanceof TapGestureDetectorKt$consumeUntilUp$1) {
            tapGestureDetectorKt$consumeUntilUp$1 = (TapGestureDetectorKt$consumeUntilUp$1) continuationImpl;
            int i4 = tapGestureDetectorKt$consumeUntilUp$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                tapGestureDetectorKt$consumeUntilUp$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = tapGestureDetectorKt$consumeUntilUp$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tapGestureDetectorKt$consumeUntilUp$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    tapGestureDetectorKt$consumeUntilUp$1.L$0 = pointerEventHandlerCoroutine;
                    tapGestureDetectorKt$consumeUntilUp$1.label = 1;
                    obj = pointerEventHandlerCoroutine.awaitPointerEvent(PointerEventPass.Main, tapGestureDetectorKt$consumeUntilUp$1);
                    if (obj == coroutineSingletons) {
                    }
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List list = pointerEvent.changes;
                    size = list.size();
                    i2 = 0;
                    while (i3 < size) {
                    }
                    List list2 = pointerEvent.changes;
                    size2 = list2.size();
                    while (i2 < size2) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pointerEventHandlerCoroutine = tapGestureDetectorKt$consumeUntilUp$1.L$0;
                SafeTrace.throwOnFailure(obj);
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List list3 = pointerEvent2.changes;
                size = list3.size();
                i2 = 0;
                for (i3 = 0; i3 < size; i3++) {
                    ((PointerInputChange) list3.get(i3)).consume();
                }
                List list22 = pointerEvent2.changes;
                size2 = list22.size();
                while (i2 < size2) {
                    if (((PointerInputChange) list22.get(i2)).pressed) {
                        tapGestureDetectorKt$consumeUntilUp$1.L$0 = pointerEventHandlerCoroutine;
                        tapGestureDetectorKt$consumeUntilUp$1.label = 1;
                        obj = pointerEventHandlerCoroutine.awaitPointerEvent(PointerEventPass.Main, tapGestureDetectorKt$consumeUntilUp$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        PointerEvent pointerEvent22 = (PointerEvent) obj;
                        List list32 = pointerEvent22.changes;
                        size = list32.size();
                        i2 = 0;
                        while (i3 < size) {
                        }
                        List list222 = pointerEvent22.changes;
                        size2 = list222.size();
                        while (i2 < size2) {
                        }
                    } else {
                        i2++;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        tapGestureDetectorKt$consumeUntilUp$1 = new TapGestureDetectorKt$consumeUntilUp$1(continuationImpl);
        Object obj2 = tapGestureDetectorKt$consumeUntilUp$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tapGestureDetectorKt$consumeUntilUp$1.label;
        if (i != 0) {
        }
    }

    public static Object detectTapGestures$default(PointerInputScope pointerInputScope, CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$2$1$$ExternalSyntheticLambda0 cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$2$1$$ExternalSyntheticLambda0, Function3 function3, Function1 function1, Continuation continuation, int i) {
        CardDesignLibraryEffectKt$CardDesignLibraryEffect$13$2$1$$ExternalSyntheticLambda0 cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$2$1$$ExternalSyntheticLambda02 = (i & 1) != 0 ? null : cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$2$1$$ExternalSyntheticLambda0;
        if ((i & 4) != 0) {
            function3 = NoPressGesture;
        }
        Object coroutineScope = JobKt.coroutineScope(new RealImageLoader$execute$result$1(pointerInputScope, cardDesignLibraryEffectKt$CardDesignLibraryEffect$13$2$1$$ExternalSyntheticLambda02, function3, (i & 8) != 0 ? null : function1, (Continuation) null, 2), continuation);
        return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
    }

    public static final boolean isChangedToDown(PointerEvent pointerEvent, boolean z, boolean z2) {
        if (z2) {
            List list = pointerEvent.changes;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((PointerInputChange) list.get(i)).f859type != 2) {
                        break;
                    }
                    i++;
                } else if ((pointerEvent.buttons & 33) == 0) {
                    return false;
                }
            }
        }
        List list2 = pointerEvent.changes;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) list2.get(i2);
            if (!(z ? PointerEventKt.changedToDown(pointerInputChange) : PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    public static StandaloneCoroutine launchAwaitingReset$default(CoroutineScope coroutineScope, Job job, Function2 function2) {
        return JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new SliderDraggableState$drag$2(job, function2, (Continuation) null, 23), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object processTapGesture(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, CoroutineScope coroutineScope, PressGestureScopeImpl pressGestureScopeImpl, Function1 function1, Function3 function3, Function1 function12, BaseContinuationImpl baseContinuationImpl) {
        TapGestureDetectorKt$processTapGesture$1 tapGestureDetectorKt$processTapGesture$1;
        int i;
        Object obj;
        CoroutineScope coroutineScope2;
        PressGestureScopeImpl pressGestureScopeImpl2;
        Function1 function13;
        Function3 function32;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2;
        Function1 function14;
        Object obj2;
        Function1 function15;
        PressGestureScopeImpl pressGestureScopeImpl3;
        PointerInputChange pointerInputChange;
        Function1 function16;
        Job job;
        Function1 function17;
        Function1 function18;
        CoroutineScope coroutineScope3;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine3;
        Function1 function19;
        Function1 function110;
        Function3 function33;
        Function1 function111;
        PressGestureScopeImpl pressGestureScopeImpl4;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine4;
        PointerInputChange pointerInputChange2;
        PressGestureScopeImpl pressGestureScopeImpl5;
        Function3 function34;
        Job launchAwaitingReset$default;
        PointerInputChange pointerInputChange3;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine5;
        Function1 function112;
        Function1 function113;
        Function1 function114;
        LongPressResult longPressResult;
        CoroutineScope coroutineScope4;
        PressGestureScopeImpl pressGestureScopeImpl6;
        PointerInputChange pointerInputChange4;
        LongPressResult.Success success;
        PointerInputChange pointerInputChange5;
        PressGestureScopeImpl pressGestureScopeImpl7;
        PressGestureScopeImpl pressGestureScopeImpl8;
        Function1 function115;
        Job job2;
        PointerInputChange pointerInputChange6;
        Function1 function116;
        Job job3;
        PointerInputChange pointerInputChange7;
        Function1 function117;
        CoroutineScope coroutineScope5;
        Function1 function118;
        PointerInputChange pointerInputChange8;
        LongPressResult longPressResult2;
        Job job4;
        CoroutineScope coroutineScope6;
        PressGestureScopeImpl pressGestureScopeImpl9;
        if (baseContinuationImpl instanceof TapGestureDetectorKt$processTapGesture$1) {
            tapGestureDetectorKt$processTapGesture$1 = (TapGestureDetectorKt$processTapGesture$1) baseContinuationImpl;
            int i2 = tapGestureDetectorKt$processTapGesture$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                tapGestureDetectorKt$processTapGesture$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = tapGestureDetectorKt$processTapGesture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tapGestureDetectorKt$processTapGesture$1.label;
                Continuation continuation = null;
                LongPressResult.Success success2 = LongPressResult.Success.INSTANCE;
                CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$5 = NoPressGesture;
                switch (i) {
                    case 0:
                        obj = null;
                        SafeTrace.throwOnFailure(obj3);
                        tapGestureDetectorKt$processTapGesture$1.L$0 = pointerEventHandlerCoroutine;
                        coroutineScope2 = coroutineScope;
                        tapGestureDetectorKt$processTapGesture$1.L$1 = coroutineScope2;
                        pressGestureScopeImpl2 = pressGestureScopeImpl;
                        tapGestureDetectorKt$processTapGesture$1.L$2 = pressGestureScopeImpl2;
                        function13 = function1;
                        tapGestureDetectorKt$processTapGesture$1.L$3 = function13;
                        tapGestureDetectorKt$processTapGesture$1.L$4 = null;
                        function32 = function3;
                        tapGestureDetectorKt$processTapGesture$1.L$5 = function32;
                        tapGestureDetectorKt$processTapGesture$1.L$6 = function12;
                        tapGestureDetectorKt$processTapGesture$1.label = 1;
                        Object awaitFirstDown$default = awaitFirstDown$default(pointerEventHandlerCoroutine, tapGestureDetectorKt$processTapGesture$1, 3);
                        if (awaitFirstDown$default != coroutineSingletons) {
                            pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                            function14 = function12;
                            obj2 = awaitFirstDown$default;
                            function15 = null;
                            PointerInputChange pointerInputChange9 = (PointerInputChange) obj2;
                            pointerInputChange9.consume();
                            StandaloneCoroutine launch$default = JobKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$resetJob$1(pressGestureScopeImpl2, continuation, 0), 1);
                            if (function32 == cachedPagingDataKt$cachedIn$5) {
                                PressGestureScopeImpl pressGestureScopeImpl10 = pressGestureScopeImpl2;
                                pressGestureScopeImpl3 = pressGestureScopeImpl10;
                                pointerInputChange = pointerInputChange9;
                                launchAwaitingReset$default(coroutineScope2, launch$default, new TapGestureDetectorKt$processTapGesture$2(function32, pressGestureScopeImpl10, pointerInputChange9, continuation, 0));
                            } else {
                                pressGestureScopeImpl3 = pressGestureScopeImpl2;
                                pointerInputChange = pointerInputChange9;
                            }
                            if (function15 != null) {
                                tapGestureDetectorKt$processTapGesture$1.L$0 = pointerEventHandlerCoroutine2;
                                tapGestureDetectorKt$processTapGesture$1.L$1 = coroutineScope2;
                                tapGestureDetectorKt$processTapGesture$1.L$2 = pressGestureScopeImpl3;
                                tapGestureDetectorKt$processTapGesture$1.L$3 = function13;
                                tapGestureDetectorKt$processTapGesture$1.L$4 = function15;
                                tapGestureDetectorKt$processTapGesture$1.L$5 = function32;
                                tapGestureDetectorKt$processTapGesture$1.L$6 = function14;
                                tapGestureDetectorKt$processTapGesture$1.L$7 = launch$default;
                                tapGestureDetectorKt$processTapGesture$1.label = 2;
                                Object waitForUpOrCancellation = waitForUpOrCancellation(pointerEventHandlerCoroutine2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                if (waitForUpOrCancellation != coroutineSingletons) {
                                    function19 = function14;
                                    job = launch$default;
                                    function110 = function13;
                                    function33 = function32;
                                    function111 = function15;
                                    pressGestureScopeImpl4 = pressGestureScopeImpl3;
                                    pointerEventHandlerCoroutine4 = pointerEventHandlerCoroutine2;
                                    coroutineScope3 = coroutineScope2;
                                    obj3 = waitForUpOrCancellation;
                                    pointerInputChange2 = (PointerInputChange) obj3;
                                    pressGestureScopeImpl5 = pressGestureScopeImpl4;
                                    function34 = function33;
                                    if (pointerInputChange2 == null) {
                                        launchAwaitingReset$default = launchAwaitingReset$default(coroutineScope3, job, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl5, continuation, 3));
                                    } else {
                                        pointerInputChange2.consume();
                                        launchAwaitingReset$default = launchAwaitingReset$default(coroutineScope3, job, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl5, continuation, 4));
                                    }
                                    if (pointerInputChange2 != null) {
                                        if (function110 != null) {
                                            tapGestureDetectorKt$processTapGesture$1.L$0 = pointerEventHandlerCoroutine4;
                                            tapGestureDetectorKt$processTapGesture$1.L$1 = coroutineScope3;
                                            tapGestureDetectorKt$processTapGesture$1.L$2 = pressGestureScopeImpl5;
                                            tapGestureDetectorKt$processTapGesture$1.L$3 = function110;
                                            tapGestureDetectorKt$processTapGesture$1.L$4 = function111;
                                            tapGestureDetectorKt$processTapGesture$1.L$5 = function34;
                                            tapGestureDetectorKt$processTapGesture$1.L$6 = function19;
                                            tapGestureDetectorKt$processTapGesture$1.L$7 = pointerInputChange2;
                                            tapGestureDetectorKt$processTapGesture$1.L$8 = launchAwaitingReset$default;
                                            tapGestureDetectorKt$processTapGesture$1.label = 5;
                                            Function1 function119 = function19;
                                            Object withTimeoutOrNull = pointerEventHandlerCoroutine4.withTimeoutOrNull(pointerEventHandlerCoroutine4.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange2, null), tapGestureDetectorKt$processTapGesture$1);
                                            if (withTimeoutOrNull != coroutineSingletons) {
                                                pointerInputChange3 = pointerInputChange2;
                                                obj3 = withTimeoutOrNull;
                                                pointerEventHandlerCoroutine5 = pointerEventHandlerCoroutine4;
                                                function112 = function110;
                                                function113 = function111;
                                                function114 = function119;
                                                pointerInputChange4 = (PointerInputChange) obj3;
                                                if (pointerInputChange4 == null) {
                                                    success = success2;
                                                    StandaloneCoroutine launch$default2 = JobKt.launch$default(coroutineScope3, null, CoroutineStart.UNDISPATCHED, new VirtualCameraState$connect$2$1(launchAwaitingReset$default, pressGestureScopeImpl5, continuation, 23), 1);
                                                    if (function34 != cachedPagingDataKt$cachedIn$5) {
                                                        PressGestureScopeImpl pressGestureScopeImpl11 = pressGestureScopeImpl5;
                                                        TapGestureDetectorKt$processTapGesture$2 tapGestureDetectorKt$processTapGesture$2 = new TapGestureDetectorKt$processTapGesture$2(function34, pressGestureScopeImpl11, pointerInputChange4, continuation, 2);
                                                        pressGestureScopeImpl7 = pressGestureScopeImpl11;
                                                        pointerInputChange5 = pointerInputChange4;
                                                        launchAwaitingReset$default(coroutineScope3, launch$default2, tapGestureDetectorKt$processTapGesture$2);
                                                    } else {
                                                        pointerInputChange5 = pointerInputChange4;
                                                        pressGestureScopeImpl7 = pressGestureScopeImpl5;
                                                    }
                                                    if (function113 == null) {
                                                        tapGestureDetectorKt$processTapGesture$1.L$0 = coroutineScope3;
                                                        tapGestureDetectorKt$processTapGesture$1.L$1 = pressGestureScopeImpl7;
                                                        tapGestureDetectorKt$processTapGesture$1.L$2 = function112;
                                                        tapGestureDetectorKt$processTapGesture$1.L$3 = function114;
                                                        tapGestureDetectorKt$processTapGesture$1.L$4 = launch$default2;
                                                        tapGestureDetectorKt$processTapGesture$1.L$5 = pointerInputChange3;
                                                        tapGestureDetectorKt$processTapGesture$1.L$6 = null;
                                                        tapGestureDetectorKt$processTapGesture$1.L$7 = null;
                                                        tapGestureDetectorKt$processTapGesture$1.L$8 = null;
                                                        tapGestureDetectorKt$processTapGesture$1.label = 6;
                                                        obj3 = waitForUpOrCancellation(pointerEventHandlerCoroutine5, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                                        if (obj3 != coroutineSingletons) {
                                                            job3 = launch$default2;
                                                            pointerInputChange7 = pointerInputChange3;
                                                            function117 = function114;
                                                            coroutineScope5 = coroutineScope3;
                                                            function118 = function112;
                                                            pointerInputChange8 = (PointerInputChange) obj3;
                                                            if (pointerInputChange8 != null) {
                                                                pointerInputChange8.consume();
                                                                launchAwaitingReset$default(coroutineScope5, job3, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl7, continuation, 5));
                                                                function118.invoke(new Offset(pointerInputChange8.position));
                                                            } else {
                                                                launchAwaitingReset$default(coroutineScope5, job3, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl7, continuation, 6));
                                                                if (function117 != null) {
                                                                    function117.invoke(new Offset(pointerInputChange7.position));
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        tapGestureDetectorKt$processTapGesture$1.L$0 = pointerEventHandlerCoroutine5;
                                                        tapGestureDetectorKt$processTapGesture$1.L$1 = coroutineScope3;
                                                        tapGestureDetectorKt$processTapGesture$1.L$2 = pressGestureScopeImpl7;
                                                        tapGestureDetectorKt$processTapGesture$1.L$3 = function112;
                                                        tapGestureDetectorKt$processTapGesture$1.L$4 = function113;
                                                        tapGestureDetectorKt$processTapGesture$1.L$5 = function114;
                                                        tapGestureDetectorKt$processTapGesture$1.L$6 = launch$default2;
                                                        tapGestureDetectorKt$processTapGesture$1.L$7 = pointerInputChange3;
                                                        tapGestureDetectorKt$processTapGesture$1.L$8 = pointerInputChange5;
                                                        tapGestureDetectorKt$processTapGesture$1.label = 7;
                                                        Object waitForLongPress = waitForLongPress(pointerEventHandlerCoroutine5, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                                        if (waitForLongPress != coroutineSingletons) {
                                                            pressGestureScopeImpl8 = pressGestureScopeImpl7;
                                                            function115 = function112;
                                                            job2 = launch$default2;
                                                            pointerInputChange6 = pointerInputChange5;
                                                            obj3 = waitForLongPress;
                                                            function116 = function113;
                                                            longPressResult2 = (LongPressResult) obj3;
                                                            if (Intrinsics.areEqual(longPressResult2, success)) {
                                                                if (longPressResult2 instanceof LongPressResult.Released) {
                                                                    pointerInputChange8 = ((LongPressResult.Released) longPressResult2).finalUpChange;
                                                                    pointerInputChange7 = pointerInputChange3;
                                                                    function117 = function114;
                                                                    job3 = job2;
                                                                    coroutineScope5 = coroutineScope3;
                                                                } else {
                                                                    if (!(longPressResult2 instanceof LongPressResult.Canceled)) {
                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                        return obj;
                                                                    }
                                                                    pointerInputChange7 = pointerInputChange3;
                                                                    function117 = function114;
                                                                    job3 = job2;
                                                                    coroutineScope5 = coroutineScope3;
                                                                    pointerInputChange8 = null;
                                                                }
                                                                function118 = function115;
                                                                pressGestureScopeImpl7 = pressGestureScopeImpl8;
                                                                if (pointerInputChange8 != null) {
                                                                }
                                                            } else {
                                                                function116.invoke(new Offset(pointerInputChange6.position));
                                                                tapGestureDetectorKt$processTapGesture$1.L$0 = coroutineScope3;
                                                                tapGestureDetectorKt$processTapGesture$1.L$1 = pressGestureScopeImpl8;
                                                                tapGestureDetectorKt$processTapGesture$1.L$2 = job2;
                                                                tapGestureDetectorKt$processTapGesture$1.L$3 = null;
                                                                tapGestureDetectorKt$processTapGesture$1.L$4 = null;
                                                                tapGestureDetectorKt$processTapGesture$1.L$5 = null;
                                                                tapGestureDetectorKt$processTapGesture$1.L$6 = null;
                                                                tapGestureDetectorKt$processTapGesture$1.L$7 = null;
                                                                tapGestureDetectorKt$processTapGesture$1.L$8 = null;
                                                                tapGestureDetectorKt$processTapGesture$1.label = 8;
                                                                if (consumeUntilUp(pointerEventHandlerCoroutine5, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                                                    job4 = job2;
                                                                    coroutineScope6 = coroutineScope3;
                                                                    pressGestureScopeImpl9 = pressGestureScopeImpl8;
                                                                    launchAwaitingReset$default(coroutineScope6, job4, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl9, continuation, 7));
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (function114 != null) {
                                                    function114.invoke(new Offset(pointerInputChange3.position));
                                                }
                                            }
                                        } else if (function19 != null) {
                                            function19.invoke(new Offset(pointerInputChange2.position));
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else {
                                tapGestureDetectorKt$processTapGesture$1.L$0 = pointerEventHandlerCoroutine2;
                                tapGestureDetectorKt$processTapGesture$1.L$1 = coroutineScope2;
                                tapGestureDetectorKt$processTapGesture$1.L$2 = pressGestureScopeImpl3;
                                tapGestureDetectorKt$processTapGesture$1.L$3 = function13;
                                tapGestureDetectorKt$processTapGesture$1.L$4 = function15;
                                tapGestureDetectorKt$processTapGesture$1.L$5 = function32;
                                tapGestureDetectorKt$processTapGesture$1.L$6 = function14;
                                tapGestureDetectorKt$processTapGesture$1.L$7 = pointerInputChange;
                                tapGestureDetectorKt$processTapGesture$1.L$8 = launch$default;
                                tapGestureDetectorKt$processTapGesture$1.label = 3;
                                Object waitForLongPress2 = waitForLongPress(pointerEventHandlerCoroutine2, PointerEventPass.Main, tapGestureDetectorKt$processTapGesture$1);
                                if (waitForLongPress2 != coroutineSingletons) {
                                    Function1 function120 = function13;
                                    function16 = function14;
                                    job = launch$default;
                                    function17 = function15;
                                    function18 = function120;
                                    SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine6 = pointerEventHandlerCoroutine2;
                                    coroutineScope3 = coroutineScope2;
                                    obj3 = waitForLongPress2;
                                    pointerEventHandlerCoroutine3 = pointerEventHandlerCoroutine6;
                                    longPressResult = (LongPressResult) obj3;
                                    if (Intrinsics.areEqual(longPressResult, success2)) {
                                        if (longPressResult instanceof LongPressResult.Released) {
                                            pointerInputChange2 = ((LongPressResult.Released) longPressResult).finalUpChange;
                                        } else {
                                            if (!(longPressResult instanceof LongPressResult.Canceled)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return obj;
                                            }
                                            pointerInputChange2 = null;
                                        }
                                        Function1 function121 = function18;
                                        function34 = function32;
                                        function111 = function17;
                                        function110 = function121;
                                        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine7 = pointerEventHandlerCoroutine3;
                                        pressGestureScopeImpl5 = pressGestureScopeImpl3;
                                        pointerEventHandlerCoroutine4 = pointerEventHandlerCoroutine7;
                                        function19 = function16;
                                        if (pointerInputChange2 == null) {
                                        }
                                        if (pointerInputChange2 != null) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    function17.invoke(new Offset(pointerInputChange.position));
                                    tapGestureDetectorKt$processTapGesture$1.L$0 = coroutineScope3;
                                    tapGestureDetectorKt$processTapGesture$1.L$1 = pressGestureScopeImpl3;
                                    tapGestureDetectorKt$processTapGesture$1.L$2 = job;
                                    tapGestureDetectorKt$processTapGesture$1.L$3 = null;
                                    tapGestureDetectorKt$processTapGesture$1.L$4 = null;
                                    tapGestureDetectorKt$processTapGesture$1.L$5 = null;
                                    tapGestureDetectorKt$processTapGesture$1.L$6 = null;
                                    tapGestureDetectorKt$processTapGesture$1.L$7 = null;
                                    tapGestureDetectorKt$processTapGesture$1.L$8 = null;
                                    tapGestureDetectorKt$processTapGesture$1.label = 4;
                                    if (consumeUntilUp(pointerEventHandlerCoroutine3, tapGestureDetectorKt$processTapGesture$1) != coroutineSingletons) {
                                        coroutineScope4 = coroutineScope3;
                                        pressGestureScopeImpl6 = pressGestureScopeImpl3;
                                        launchAwaitingReset$default(coroutineScope4, job, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl6, continuation, 0));
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        obj = null;
                        function14 = (Function1) tapGestureDetectorKt$processTapGesture$1.L$6;
                        Function3 function35 = (Function3) tapGestureDetectorKt$processTapGesture$1.L$5;
                        Function1 function122 = (Function1) tapGestureDetectorKt$processTapGesture$1.L$4;
                        Function1 function123 = tapGestureDetectorKt$processTapGesture$1.L$3;
                        PressGestureScopeImpl pressGestureScopeImpl12 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$1.L$2;
                        CoroutineScope coroutineScope7 = (CoroutineScope) tapGestureDetectorKt$processTapGesture$1.L$1;
                        pointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) tapGestureDetectorKt$processTapGesture$1.L$0;
                        SafeTrace.throwOnFailure(obj3);
                        obj2 = obj3;
                        coroutineScope2 = coroutineScope7;
                        function15 = function122;
                        function13 = function123;
                        function32 = function35;
                        pressGestureScopeImpl2 = pressGestureScopeImpl12;
                        PointerInputChange pointerInputChange92 = (PointerInputChange) obj2;
                        pointerInputChange92.consume();
                        StandaloneCoroutine launch$default3 = JobKt.launch$default(coroutineScope2, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$resetJob$1(pressGestureScopeImpl2, continuation, 0), 1);
                        if (function32 == cachedPagingDataKt$cachedIn$5) {
                        }
                        if (function15 != null) {
                        }
                        return coroutineSingletons;
                    case 2:
                        obj = null;
                        job = (Job) tapGestureDetectorKt$processTapGesture$1.L$7;
                        function19 = (Function1) tapGestureDetectorKt$processTapGesture$1.L$6;
                        function33 = (Function3) tapGestureDetectorKt$processTapGesture$1.L$5;
                        function111 = (Function1) tapGestureDetectorKt$processTapGesture$1.L$4;
                        function110 = tapGestureDetectorKt$processTapGesture$1.L$3;
                        pressGestureScopeImpl4 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$1.L$2;
                        coroutineScope3 = (CoroutineScope) tapGestureDetectorKt$processTapGesture$1.L$1;
                        pointerEventHandlerCoroutine4 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) tapGestureDetectorKt$processTapGesture$1.L$0;
                        SafeTrace.throwOnFailure(obj3);
                        pointerInputChange2 = (PointerInputChange) obj3;
                        pressGestureScopeImpl5 = pressGestureScopeImpl4;
                        function34 = function33;
                        if (pointerInputChange2 == null) {
                        }
                        if (pointerInputChange2 != null) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                        obj = null;
                        job = (Job) tapGestureDetectorKt$processTapGesture$1.L$8;
                        pointerInputChange = (PointerInputChange) tapGestureDetectorKt$processTapGesture$1.L$7;
                        function16 = (Function1) tapGestureDetectorKt$processTapGesture$1.L$6;
                        function32 = (Function3) tapGestureDetectorKt$processTapGesture$1.L$5;
                        function17 = (Function1) tapGestureDetectorKt$processTapGesture$1.L$4;
                        Function1 function124 = tapGestureDetectorKt$processTapGesture$1.L$3;
                        PressGestureScopeImpl pressGestureScopeImpl13 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$1.L$2;
                        coroutineScope3 = (CoroutineScope) tapGestureDetectorKt$processTapGesture$1.L$1;
                        pointerEventHandlerCoroutine3 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) tapGestureDetectorKt$processTapGesture$1.L$0;
                        SafeTrace.throwOnFailure(obj3);
                        pressGestureScopeImpl3 = pressGestureScopeImpl13;
                        function18 = function124;
                        longPressResult = (LongPressResult) obj3;
                        if (Intrinsics.areEqual(longPressResult, success2)) {
                        }
                        break;
                    case 4:
                        job = (Job) tapGestureDetectorKt$processTapGesture$1.L$2;
                        pressGestureScopeImpl6 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$1.L$1;
                        coroutineScope4 = (CoroutineScope) tapGestureDetectorKt$processTapGesture$1.L$0;
                        SafeTrace.throwOnFailure(obj3);
                        launchAwaitingReset$default(coroutineScope4, job, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl6, continuation, 0));
                        return Unit.INSTANCE;
                    case 5:
                        obj = null;
                        launchAwaitingReset$default = (Job) tapGestureDetectorKt$processTapGesture$1.L$8;
                        pointerInputChange3 = (PointerInputChange) tapGestureDetectorKt$processTapGesture$1.L$7;
                        Function1 function125 = (Function1) tapGestureDetectorKt$processTapGesture$1.L$6;
                        function34 = (Function3) tapGestureDetectorKt$processTapGesture$1.L$5;
                        Function1 function126 = (Function1) tapGestureDetectorKt$processTapGesture$1.L$4;
                        function112 = tapGestureDetectorKt$processTapGesture$1.L$3;
                        pressGestureScopeImpl5 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$1.L$2;
                        CoroutineScope coroutineScope8 = (CoroutineScope) tapGestureDetectorKt$processTapGesture$1.L$1;
                        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine8 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) tapGestureDetectorKt$processTapGesture$1.L$0;
                        SafeTrace.throwOnFailure(obj3);
                        function114 = function125;
                        pointerEventHandlerCoroutine5 = pointerEventHandlerCoroutine8;
                        function113 = function126;
                        coroutineScope3 = coroutineScope8;
                        pointerInputChange4 = (PointerInputChange) obj3;
                        if (pointerInputChange4 == null) {
                        }
                        break;
                    case 6:
                        pointerInputChange7 = (PointerInputChange) tapGestureDetectorKt$processTapGesture$1.L$5;
                        job3 = (Job) tapGestureDetectorKt$processTapGesture$1.L$4;
                        function117 = tapGestureDetectorKt$processTapGesture$1.L$3;
                        function118 = (Function1) tapGestureDetectorKt$processTapGesture$1.L$2;
                        pressGestureScopeImpl7 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$1.L$1;
                        coroutineScope5 = (CoroutineScope) tapGestureDetectorKt$processTapGesture$1.L$0;
                        SafeTrace.throwOnFailure(obj3);
                        pointerInputChange8 = (PointerInputChange) obj3;
                        if (pointerInputChange8 != null) {
                        }
                        return Unit.INSTANCE;
                    case 7:
                        pointerInputChange6 = (PointerInputChange) tapGestureDetectorKt$processTapGesture$1.L$8;
                        pointerInputChange3 = (PointerInputChange) tapGestureDetectorKt$processTapGesture$1.L$7;
                        job2 = (Job) tapGestureDetectorKt$processTapGesture$1.L$6;
                        Function1 function127 = (Function1) tapGestureDetectorKt$processTapGesture$1.L$5;
                        function116 = (Function1) tapGestureDetectorKt$processTapGesture$1.L$4;
                        function115 = tapGestureDetectorKt$processTapGesture$1.L$3;
                        pressGestureScopeImpl8 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$1.L$2;
                        obj = null;
                        CoroutineScope coroutineScope9 = (CoroutineScope) tapGestureDetectorKt$processTapGesture$1.L$1;
                        pointerEventHandlerCoroutine5 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) tapGestureDetectorKt$processTapGesture$1.L$0;
                        SafeTrace.throwOnFailure(obj3);
                        function114 = function127;
                        coroutineScope3 = coroutineScope9;
                        success = success2;
                        longPressResult2 = (LongPressResult) obj3;
                        if (Intrinsics.areEqual(longPressResult2, success)) {
                        }
                        break;
                    case 8:
                        job4 = (Job) tapGestureDetectorKt$processTapGesture$1.L$2;
                        pressGestureScopeImpl9 = (PressGestureScopeImpl) tapGestureDetectorKt$processTapGesture$1.L$1;
                        coroutineScope6 = (CoroutineScope) tapGestureDetectorKt$processTapGesture$1.L$0;
                        SafeTrace.throwOnFailure(obj3);
                        launchAwaitingReset$default(coroutineScope6, job4, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl9, continuation, 7));
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        tapGestureDetectorKt$processTapGesture$1 = new TapGestureDetectorKt$processTapGesture$1(baseContinuationImpl);
        Object obj32 = tapGestureDetectorKt$processTapGesture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tapGestureDetectorKt$processTapGesture$1.label;
        Continuation continuation2 = null;
        LongPressResult.Success success22 = LongPressResult.Success.INSTANCE;
        CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$52 = NoPressGesture;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object waitForLongPress(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, PointerEventPass pointerEventPass, ContinuationImpl continuationImpl) {
        TapGestureDetectorKt$waitForLongPress$1 tapGestureDetectorKt$waitForLongPress$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        try {
            if (continuationImpl instanceof TapGestureDetectorKt$waitForLongPress$1) {
                tapGestureDetectorKt$waitForLongPress$1 = (TapGestureDetectorKt$waitForLongPress$1) continuationImpl;
                int i2 = tapGestureDetectorKt$waitForLongPress$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    tapGestureDetectorKt$waitForLongPress$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = tapGestureDetectorKt$waitForLongPress$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = tapGestureDetectorKt$waitForLongPress$1.label;
                    Continuation continuation = null;
                    if (i != 0) {
                        Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                        m.element = LongPressResult.Canceled.INSTANCE;
                        long longPressTimeoutMillis = pointerEventHandlerCoroutine.getViewConfiguration().getLongPressTimeoutMillis();
                        Function2 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(pointerEventPass, m, continuation, 3);
                        tapGestureDetectorKt$waitForLongPress$1.L$0 = m;
                        tapGestureDetectorKt$waitForLongPress$1.label = 1;
                        if (pointerEventHandlerCoroutine.withTimeout(longPressTimeoutMillis, fileSystem$commonDeleteRecursively$sequence$1, tapGestureDetectorKt$waitForLongPress$1) == obj2) {
                            return obj2;
                        }
                        ref$ObjectRef = m;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ref$ObjectRef = tapGestureDetectorKt$waitForLongPress$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    return ref$ObjectRef.element;
                }
            }
            if (i != 0) {
            }
            return ref$ObjectRef.element;
        } catch (PointerEventTimeoutCancellationException unused) {
            return LongPressResult.Success.INSTANCE;
        }
        tapGestureDetectorKt$waitForLongPress$1 = new TapGestureDetectorKt$waitForLongPress$1(continuationImpl);
        Object obj3 = tapGestureDetectorKt$waitForLongPress$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tapGestureDetectorKt$waitForLongPress$1.label;
        Continuation continuation2 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (r0 == r2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b3 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object waitForUpOrCancellation(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$2;
        int i;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2;
        TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$22;
        PointerEventPass pointerEventPass2;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine3;
        PointerEventPass pointerEventPass3;
        int size;
        int i2;
        Object awaitPointerEvent;
        if (baseContinuationImpl instanceof TapGestureDetectorKt$waitForUpOrCancellation$2) {
            tapGestureDetectorKt$waitForUpOrCancellation$2 = (TapGestureDetectorKt$waitForUpOrCancellation$2) baseContinuationImpl;
            int i3 = tapGestureDetectorKt$waitForUpOrCancellation$2.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                tapGestureDetectorKt$waitForUpOrCancellation$2.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = tapGestureDetectorKt$waitForUpOrCancellation$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tapGestureDetectorKt$waitForUpOrCancellation$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                    tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
                    pointerEventPass2 = pointerEventPass;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.L$0 = pointerEventHandlerCoroutine2;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.L$1 = pointerEventPass2;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.label = 1;
                    awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
                    if (awaitPointerEvent != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    pointerEventPass3 = tapGestureDetectorKt$waitForUpOrCancellation$2.L$1;
                    pointerEventHandlerCoroutine3 = tapGestureDetectorKt$waitForUpOrCancellation$2.L$0;
                    SafeTrace.throwOnFailure(obj);
                    List list = ((PointerEvent) obj).changes;
                    size = list.size();
                    while (i2 < size) {
                    }
                    return list.get(0);
                }
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pointerEventPass3 = tapGestureDetectorKt$waitForUpOrCancellation$2.L$1;
                pointerEventHandlerCoroutine3 = tapGestureDetectorKt$waitForUpOrCancellation$2.L$0;
                SafeTrace.throwOnFailure(obj);
                PointerEventPass pointerEventPass4 = pointerEventPass3;
                tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
                pointerEventPass2 = pointerEventPass4;
                List list2 = ((PointerEvent) obj).changes;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (((PointerInputChange) list2.get(i4)).isConsumed()) {
                        break;
                    }
                }
                pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine3;
                tapGestureDetectorKt$waitForUpOrCancellation$22.L$0 = pointerEventHandlerCoroutine2;
                tapGestureDetectorKt$waitForUpOrCancellation$22.L$1 = pointerEventPass2;
                tapGestureDetectorKt$waitForUpOrCancellation$22.label = 1;
                awaitPointerEvent = pointerEventHandlerCoroutine2.awaitPointerEvent(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
                if (awaitPointerEvent != coroutineSingletons) {
                    pointerEventHandlerCoroutine3 = pointerEventHandlerCoroutine2;
                    obj = awaitPointerEvent;
                    TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$23 = tapGestureDetectorKt$waitForUpOrCancellation$22;
                    pointerEventPass3 = pointerEventPass2;
                    tapGestureDetectorKt$waitForUpOrCancellation$2 = tapGestureDetectorKt$waitForUpOrCancellation$23;
                    List list3 = ((PointerEvent) obj).changes;
                    size = list3.size();
                    for (i2 = 0; i2 < size; i2++) {
                        if (!PointerEventKt.changedToUp((PointerInputChange) list3.get(i2))) {
                            int size3 = list3.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                PointerInputChange pointerInputChange = (PointerInputChange) list3.get(i5);
                                if (pointerInputChange.isConsumed() || PointerEventKt.m807isOutOfBoundsjwHxaWs(pointerInputChange, SuspendingPointerInputModifierNodeImpl.this.boundsSize, pointerEventHandlerCoroutine3.m831getExtendedTouchPaddingNHjbRc())) {
                                    break;
                                }
                            }
                            PointerEventPass pointerEventPass5 = PointerEventPass.Final;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.L$0 = pointerEventHandlerCoroutine3;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.L$1 = pointerEventPass3;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.label = 2;
                            obj = pointerEventHandlerCoroutine3.awaitPointerEvent(pointerEventPass5, tapGestureDetectorKt$waitForUpOrCancellation$2);
                        }
                    }
                    return list3.get(0);
                }
                return coroutineSingletons;
            }
        }
        tapGestureDetectorKt$waitForUpOrCancellation$2 = new TapGestureDetectorKt$waitForUpOrCancellation$2(baseContinuationImpl);
        Object obj2 = tapGestureDetectorKt$waitForUpOrCancellation$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tapGestureDetectorKt$waitForUpOrCancellation$2.label;
        if (i != 0) {
        }
    }
}
