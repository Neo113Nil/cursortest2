package com.google.android.gms.internal.mlkit_vision_face;

import android.content.ContextWrapper;
import android.content.res.Resources;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser$parse$1;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.R;
import com.squareup.workflow1.InterceptedRenderContext$send$1;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.squareup.workflow1.ui.AttachedScope;
import com.squareup.workflow1.ui.TextControllerControlEditTextKt$listenForTextChangesUntilCancelled$1;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.squareup.workflow1.ui.TextControllerSubscription;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClasses;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public abstract class zzna {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$listenForTextChangesUntilCancelled(TextView textView, InterceptedRenderContext$send$1 interceptedRenderContext$send$1, ContinuationImpl continuationImpl) {
        TextControllerControlEditTextKt$listenForTextChangesUntilCancelled$1 textControllerControlEditTextKt$listenForTextChangesUntilCancelled$1;
        int i;
        if (continuationImpl instanceof TextControllerControlEditTextKt$listenForTextChangesUntilCancelled$1) {
            textControllerControlEditTextKt$listenForTextChangesUntilCancelled$1 = (TextControllerControlEditTextKt$listenForTextChangesUntilCancelled$1) continuationImpl;
            int i2 = textControllerControlEditTextKt$listenForTextChangesUntilCancelled$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                textControllerControlEditTextKt$listenForTextChangesUntilCancelled$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = textControllerControlEditTextKt$listenForTextChangesUntilCancelled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = textControllerControlEditTextKt$listenForTextChangesUntilCancelled$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    textControllerControlEditTextKt$listenForTextChangesUntilCancelled$1.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(textControllerControlEditTextKt$listenForTextChangesUntilCancelled$1));
                    cancellableContinuationImpl.initCancellability();
                    SearchView.AnonymousClass10 anonymousClass10 = new SearchView.AnonymousClass10(interceptedRenderContext$send$1, 11);
                    textView.addTextChangedListener(anonymousClass10);
                    cancellableContinuationImpl.invokeOnCancellation(new TraceParser$parse$1(14, textView, anonymousClass10));
                    if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
            }
        }
        textControllerControlEditTextKt$listenForTextChangesUntilCancelled$1 = new TextControllerControlEditTextKt$listenForTextChangesUntilCancelled$1(continuationImpl);
        Object obj2 = textControllerControlEditTextKt$listenForTextChangesUntilCancelled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = textControllerControlEditTextKt$listenForTextChangesUntilCancelled$1.label;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v11, types: [kotlin.reflect.KClass] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, android.widget.EditText, android.widget.TextView, java.lang.Object] */
    public static final void control(TextControllerImpl textControllerImpl, EditText editText) {
        textControllerImpl.getClass();
        editText.getClass();
        Object tag = editText.getTag(R.id.text_controller_rendering);
        Continuation continuation = null;
        TextControllerSubscription textControllerSubscription = tag instanceof TextControllerSubscription ? (TextControllerSubscription) tag : null;
        if ((textControllerSubscription == null ? null : textControllerSubscription.controller) == textControllerImpl && textControllerSubscription.subscription.isActive()) {
            return;
        }
        if (textControllerSubscription != null) {
            textControllerSubscription.subscription.cancel(null);
        }
        editText.setText(textControllerImpl.getTextValue());
        WorkerWorkflow$render$1 workerWorkflow$render$1 = new WorkerWorkflow$render$1(textControllerImpl, (Object) editText, continuation, 18);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        emptyCoroutineContext.getClass();
        Object tag2 = editText.getTag(R.id.view_attached_coroutine_scope);
        AttachedScope attachedScope = tag2 instanceof AttachedScope ? (AttachedScope) tag2 : null;
        if (attachedScope == null || !JobKt.isActive(attachedScope.coroutineScope)) {
            attachedScope = null;
        }
        if (attachedScope == null) {
            LifecycleOwner lifecycleOwner = DBUtil.get(editText);
            if (lifecycleOwner == null) {
                ?? context = editText.getContext();
                context.getClass();
                ?? orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LifecycleOwner.class);
                while (true) {
                    if (!orCreateKotlinClass.isInstance(context)) {
                        ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                        if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == 0) {
                            break;
                        }
                    } else {
                        KClasses.cast(orCreateKotlinClass, context);
                        continuation = context;
                        break;
                    }
                }
                lifecycleOwner = (LifecycleOwner) continuation;
            }
            if (lifecycleOwner == null) {
                a$$ExternalSyntheticBUOutline0.m$1("ViewTreeLifecycleOwner is required by View.ensureAttachedScope");
                return;
            }
            LifecycleCoroutineScopeImpl coroutineScope = ViewModelKt.getCoroutineScope(lifecycleOwner.getLifecycle());
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) editText.getClass().getName());
            sb2.append('@');
            sb2.append(editText.hashCode());
            sb.append(sb2.toString());
            if (editText.getId() != -1) {
                try {
                    String resourceEntryName = editText.getResources().getResourceEntryName(editText.getId());
                    sb.append('-');
                    sb.append(resourceEntryName);
                } catch (Resources.NotFoundException unused) {
                }
            }
            attachedScope = new AttachedScope(JobKt.plus(new CoroutineName(sb.toString()), coroutineScope));
            editText.setTag(R.id.view_attached_coroutine_scope, attachedScope);
            editText.addOnAttachStateChangeListener(attachedScope);
        }
        ContextScope contextScope = attachedScope.coroutineScope;
        Rum$createMonitor$1 rum$createMonitor$1 = new Rum$createMonitor$1(10, attachedScope, emptyCoroutineContext, workerWorkflow$render$1);
        if (editText.isAttachedToWindow()) {
            rum$createMonitor$1.invoke();
        } else {
            if (!JobKt.isActive(contextScope)) {
                a$$ExternalSyntheticBUOutline0.m$1("Expected AttachedScope to be active when adding attach handler.");
                return;
            }
            attachedScope.attachHandlers.add(rum$createMonitor$1);
        }
        editText.setTag(R.id.text_controller_rendering, new TextControllerSubscription(textControllerImpl, JobKt.getJob(contextScope.coroutineContext)));
    }

    public static com.google.mlkit.vision.text.zzc fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            if (jsonObject.get("format_version").getAsLong() == 2) {
                return new com.google.mlkit.vision.text.zzc(1);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e3);
            return null;
        }
    }
}
