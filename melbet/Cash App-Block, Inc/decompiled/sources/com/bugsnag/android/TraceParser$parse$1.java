package com.bugsnag.android;

import android.app.Activity;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.ZIndexNode;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidUiFrameClock;
import androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1;
import androidx.compose.ui.window.PopupLayout;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.datastore.core.SimpleActor;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.CoroutinesRoom;
import androidx.tracing.Trace;
import androidx.transition.Transition;
import coil3.Extras;
import coil3.size.DimensionKt;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.datastore.DataStoreHandler;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyApi29;
import com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyLegacy;
import com.squareup.cash.R;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.constraints.SizeConfigSmartLambdas$wrapContent$1;
import com.squareup.wire.GrpcMethod;
import com.squareup.workflow1.EmitWorkerOutputAction;
import com.squareup.workflow1.Worker;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import com.squareup.workflow1.ui.WorkflowViewStub;
import com.squareup.workflow1.ui.androidx.RealWorkflowLifecycleOwner;
import com.squareup.workflow1.ui.androidx.WorkflowLifecycleOwner$Companion$installOn$1;
import com.squareup.workflow1.ui.backstack.BackStackContainer;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import nl.dionsegijn.konfetti.core.Particle;
import nl.dionsegijn.konfetti.core.models.CoreImage;
import nl.dionsegijn.konfetti.core.models.ReferenceImage;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.xml.image.ImageStore;
import okio.Utf8;

/* loaded from: classes4.dex */
public final class TraceParser$parse$1 extends Lambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $threadConsumer;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraceParser$parse$1(CoroutinesRoom.Companion companion, DataStoreHandler dataStoreHandler, InternalSdkCore internalSdkCore) {
        super(1);
        this.$r8$classId = 8;
        this.this$0 = dataStoreHandler;
        this.$threadConsumer = internalSdkCore;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Thread thread;
        ArrayList arrayList;
        Stackframe parseStackframe$bugsnag_plugin_android_exitinfo_release;
        Thread thread2;
        ArrayList arrayList2;
        int max;
        int paddingBottom;
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj2 = this.$threadConsumer;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                String obj4 = StringsKt.trim((String) obj).toString();
                int length = obj4.length();
                TraceParser traceParser = (TraceParser) obj3;
                HashMap hashMap = (HashMap) traceParser.threadAttrs;
                if (length == 0) {
                    Thread thread3 = (Thread) traceParser.currentThread;
                    if (thread3 != null) {
                        ((TraceEventEnhancer$invoke$1$1) obj2).invoke(thread3);
                    }
                    traceParser.currentThread = null;
                    hashMap.clear();
                    traceParser.state = 1;
                } else {
                    int i3 = traceParser.state;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3 && (parseStackframe$bugsnag_plugin_android_exitinfo_release = traceParser.parseStackframe$bugsnag_plugin_android_exitinfo_release(obj4)) != null && (thread2 = (Thread) traceParser.currentThread) != null && (arrayList2 = thread2.impl.stacktrace) != null) {
                                arrayList2.add(parseStackframe$bugsnag_plugin_android_exitinfo_release);
                            }
                        } else if (obj4.charAt(0) != '|') {
                            traceParser.state = 3;
                            Thread thread4 = (Thread) traceParser.currentThread;
                            if (thread4 != null) {
                                String str = (String) hashMap.get("tid");
                                if (str == null && (str = (String) hashMap.get("sysTid")) == null) {
                                    str = "";
                                }
                                thread4.impl.id = str;
                            }
                            Thread thread5 = (Thread) traceParser.currentThread;
                            if (thread5 != null) {
                                thread5.impl.state = Thread$State$EnumUnboxingLocalUtility.getDescriptor(traceParser.getCurrentThreadState());
                            }
                            Stackframe parseStackframe$bugsnag_plugin_android_exitinfo_release2 = traceParser.parseStackframe$bugsnag_plugin_android_exitinfo_release(obj4);
                            if (parseStackframe$bugsnag_plugin_android_exitinfo_release2 != null && (thread = (Thread) traceParser.currentThread) != null && (arrayList = thread.impl.stacktrace) != null) {
                                arrayList.add(parseStackframe$bugsnag_plugin_android_exitinfo_release2);
                            }
                        } else {
                            traceParser.parseThreadAttributes(obj4);
                        }
                    } else if (obj4.charAt(0) == '\"') {
                        int lastIndexOf$default = StringsKt.lastIndexOf$default('\"', 0, 6, (CharSequence) obj4);
                        int i4 = lastIndexOf$default + 1;
                        int length2 = obj4.length();
                        int indexOf$default = StringsKt.indexOf$default((CharSequence) obj4, '(', i4, false, 4);
                        if (indexOf$default != -1) {
                            length2 = indexOf$default;
                        }
                        traceParser.parseThreadAttributes(obj4.substring(i4, length2));
                        traceParser.currentThread = new Thread(null, obj4.substring(1, lastIndexOf$default), ErrorType.ANDROID, traceParser.getCurrentThreadState(), (Logger) traceParser.logger);
                        traceParser.state = 2;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                ((Placeable.PlacementScope) obj).place((Placeable) obj3, 0, 0, ((ZIndexNode) obj2).zIndex);
                return Unit.INSTANCE;
            case 2:
                MotionEvent motionEvent = (MotionEvent) obj;
                PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) obj2;
                if (motionEvent.getActionMasked() == 0) {
                    SimpleActor simpleActor = (SimpleActor) obj3;
                    Function1 function1 = pointerInteropFilter.onTouchEvent;
                    if (function1 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
                        throw null;
                    }
                    simpleActor.consumeMessage = ((Boolean) function1.invoke(motionEvent)).booleanValue() ? PointerInteropFilter.DispatchToViewState.Dispatching : PointerInteropFilter.DispatchToViewState.NotDispatching;
                } else {
                    Function1 function12 = pointerInteropFilter.onTouchEvent;
                    if (function12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
                        throw null;
                    }
                    function12.invoke(motionEvent);
                }
                return Unit.INSTANCE;
            case 3:
                ((AndroidUiFrameClock) obj3).choreographer.removeFrameCallback((AndroidUiFrameClock$withFrameNanos$2$callback$1) obj2);
                return Unit.INSTANCE;
            case 4:
                PopupLayout popupLayout = (PopupLayout) obj3;
                popupLayout.setPositionProvider((PopupPositionProvider) obj2);
                popupLayout.updatePosition();
                return new AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1();
            case 5:
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    ((BufferedChannel) obj2).mo1159trySendJP2dKIU(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 6:
                Throwable th = (Throwable) obj;
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) obj3;
                if (th == null) {
                    callbackToFutureAdapter$Completer.set(((DeferredCoroutine) obj2).getCompletedInternal$kotlinx_coroutines_core());
                } else if (th instanceof CancellationException) {
                    callbackToFutureAdapter$Completer.setCancelled();
                } else {
                    callbackToFutureAdapter$Completer.setException(th);
                }
                return Unit.INSTANCE;
            case 7:
                File file = (File) obj;
                file.getClass();
                String str2 = (String) obj3;
                Charset charset = (Charset) obj2;
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    FilesKt__FileReadWriteKt.writeTextImpl(fileOutputStream, str2, charset);
                    fileOutputStream.close();
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        Utf8.closeFinally(fileOutputStream, th2);
                        throw th3;
                    }
                }
            case 8:
                UUID uuid = (UUID) obj;
                InternalSdkCore internalSdkCore = (InternalSdkCore) obj2;
                if (uuid == null) {
                    UUID randomUUID = UUID.randomUUID();
                    randomUUID.getClass();
                    ((DataStoreHandler) obj3).setValue(randomUUID, new Transition.AnonymousClass1());
                    internalSdkCore.setAnonymousId(randomUUID);
                } else {
                    internalSdkCore.setAnonymousId(uuid);
                }
                return Unit.INSTANCE;
            case 9:
                InternalSdkCore internalSdkCore2 = (InternalSdkCore) obj;
                internalSdkCore2.getClass();
                Activity activity = (Activity) obj2;
                ((UserActionTrackingStrategyApi29) obj3).gesturesTracker.startTracking(activity.getWindow(), activity, internalSdkCore2);
                return Unit.INSTANCE;
            case 10:
                InternalSdkCore internalSdkCore3 = (InternalSdkCore) obj;
                internalSdkCore3.getClass();
                Activity activity2 = (Activity) obj2;
                ((UserActionTrackingStrategyLegacy) obj3).gesturesTracker.startTracking(activity2.getWindow(), activity2, internalSdkCore3);
                return Unit.INSTANCE;
            case 11:
                EventBatchWriter eventBatchWriter = (EventBatchWriter) obj;
                eventBatchWriter.getClass();
                ((DataWriter) obj3).write(eventBatchWriter, obj2, 3);
                return Unit.INSTANCE;
            case 12:
                View view = (View) obj;
                ContourLayout contourLayout = (ContourLayout) obj3;
                view.getClass();
                int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(((SizeConfigSmartLambdas$wrapContent$1) obj2).$axis);
                if (ordinal == 0) {
                    max = Math.max(contourLayout.m3810bottomdBGyhoQ(view), contourLayout.getPaddingTop());
                    paddingBottom = contourLayout.getPaddingBottom();
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    max = Math.max(contourLayout.m3818rightTENr5nQ(view), contourLayout.getPaddingLeft());
                    paddingBottom = contourLayout.getPaddingRight();
                }
                return Integer.valueOf(paddingBottom + max);
            case 13:
                return new EmitWorkerOutputAction((Worker) obj3, (String) obj2, obj);
            case 14:
                ((TextView) obj3).removeTextChangedListener((SearchView.AnonymousClass10) obj2);
                return Unit.INSTANCE;
            case 15:
                View view2 = (View) obj;
                view2.getClass();
                ViewRegistryKt$buildView$1$2$1$1 viewRegistryKt$buildView$1$2$1$1 = new ViewRegistryKt$buildView$1$2$1$1(i2, (Function1) obj2, view2);
                int i5 = ((WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0) obj3).$r8$classId;
                WorkflowLifecycleOwner$Companion$installOn$1 workflowLifecycleOwner$Companion$installOn$1 = WorkflowLifecycleOwner$Companion$installOn$1.INSTANCE;
                switch (i5) {
                    case 20:
                        int i6 = WorkflowViewStub.$r8$clinit;
                        view2.getClass();
                        RealWorkflowLifecycleOwner realWorkflowLifecycleOwner = new RealWorkflowLifecycleOwner(workflowLifecycleOwner$Companion$installOn$1);
                        view2.setTag(R.id.view_tree_lifecycle_owner, realWorkflowLifecycleOwner);
                        view2.addOnAttachStateChangeListener(realWorkflowLifecycleOwner);
                        viewRegistryKt$buildView$1$2$1$1.invoke();
                        break;
                    case 21:
                        UiScreenRunner.Companion companion = BackStackContainer.Companion;
                        view2.getClass();
                        RealWorkflowLifecycleOwner realWorkflowLifecycleOwner2 = new RealWorkflowLifecycleOwner(workflowLifecycleOwner$Companion$installOn$1);
                        view2.setTag(R.id.view_tree_lifecycle_owner, realWorkflowLifecycleOwner2);
                        view2.addOnAttachStateChangeListener(realWorkflowLifecycleOwner2);
                        viewRegistryKt$buildView$1$2$1$1.invoke();
                        break;
                    default:
                        UiScreenRunner.Companion companion2 = ScreenWithTransitionContainer.Companion;
                        view2.getClass();
                        RealWorkflowLifecycleOwner realWorkflowLifecycleOwner3 = new RealWorkflowLifecycleOwner(workflowLifecycleOwner$Companion$installOn$1);
                        view2.setTag(R.id.view_tree_lifecycle_owner, realWorkflowLifecycleOwner3);
                        view2.addOnAttachStateChangeListener(realWorkflowLifecycleOwner3);
                        viewRegistryKt$buildView$1$2$1$1.invoke();
                        break;
                }
                return Unit.INSTANCE;
            default:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                ImageStore imageStore = (ImageStore) obj2;
                for (Particle particle : (Iterable) ((MutableState) obj3).getValue()) {
                    GrpcMethod drawContext = drawScope.getDrawContext();
                    long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    Extras.Key key = (Extras.Key) drawContext.path;
                    float f = particle.rotation;
                    float f2 = particle.height;
                    float f3 = particle.y;
                    float f4 = particle.width;
                    float f5 = particle.x;
                    float f6 = f4 / 2.0f;
                    float f7 = f6 + f5;
                    key.m1436rotateUv8p0NA(Trace.Offset(f7, (f2 / 2.0f) + f3), f);
                    ImageStore imageStore2 = imageStore;
                    key.m1437scale0AR0LA0(particle.scaleX, 1.0f, Trace.Offset(f7, f3));
                    Shape shape = particle.shape;
                    shape.getClass();
                    int i7 = particle.color;
                    imageStore2.getClass();
                    if (shape.equals(Shape.Circle.INSTANCE)) {
                        DrawScope.m738drawCircleVaOC9Bg$default(drawScope, ColorKt.Color(i7), f6, Trace.Offset(f7, f3 + f6), null, 0, 120);
                    } else if (shape.equals(Shape.Circle.INSTANCE$1)) {
                        DrawScope.m747drawRectnJ9OG0$default(drawScope, ColorKt.Color(i7), Trace.Offset(f5, f3), DimensionKt.Size(f4, f2), RecyclerView.DECELERATION_RATE, null, null, 0, 120);
                    } else if (shape instanceof Shape.DrawableShape) {
                        Shape.DrawableShape drawableShape = (Shape.DrawableShape) shape;
                        CoreImage coreImage = drawableShape.image;
                        if (coreImage instanceof ReferenceImage) {
                            Drawable drawable = (Drawable) imageStore2.images.get(Integer.valueOf(((ReferenceImage) coreImage).reference));
                            if (drawable != null) {
                                Canvas canvas = drawScope.getDrawContext().getCanvas();
                                if (drawableShape.tint) {
                                    drawable.setColorFilter(new BlendModeColorFilter(i7, BlendMode.SRC_IN));
                                } else if (drawableShape.applyAlpha) {
                                    drawable.setAlpha(particle.alpha);
                                }
                                int i8 = (int) (f4 * drawableShape.heightRatio);
                                int i9 = (int) ((f4 - i8) / 2.0f);
                                int i10 = (int) f3;
                                int i11 = (int) f5;
                                drawable.setBounds(i11, i9 + i10, ((int) f4) + i11, i9 + i8 + i10);
                                drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
                            }
                        }
                    }
                    Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                    imageStore = imageStore2;
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TraceParser$parse$1(int i, Object obj, Object obj2) {
        super(1);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$threadConsumer = obj2;
    }
}
