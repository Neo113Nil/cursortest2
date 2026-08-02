package app.cash.local.presenters;

import androidx.transition.Transition;
import coil3.EventListener;
import com.caverock.androidsvg.SVGParseException;
import com.datadog.android.okhttp.trace.TracingInterceptor$extractParentContext$headerContext$1;
import com.datadog.android.trace.internal.compat.function.Function;
import com.datadog.trace.api.Pair;
import com.datadog.trace.api.cache.DDPartialKeyCache$Hasher;
import com.datadog.trace.api.metrics.SpanMetricRegistry;
import com.datadog.trace.api.metrics.SpanMetrics;
import com.datadog.trace.api.normalize.HttpResourceNames;
import com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$ContextVisitor;
import com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$KeyClassifier;
import com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString;
import com.datadog.trace.util.Strings;
import com.google.android.gms.tasks.OnFailureListener;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalPresenterModule$Companion$$ExternalSyntheticLambda0 implements Transition.TransitionNotification, OnFailureListener, EventListener.Factory, AgentPropagation$ContextVisitor, Function, SpanMetricRegistry, DDPartialKeyCache$Hasher {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LocalPresenterModule$Companion$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    @Override // com.datadog.android.trace.internal.compat.function.Function
    public Object apply(Object obj) {
        StringBuilder sb;
        switch (this.$r8$classId) {
            case 21:
                return Strings.trim((String) ((Map.Entry) obj).getKey());
            case 22:
                return Strings.trim((String) ((Map.Entry) obj).getValue());
            case 23:
                return Strings.trim((String) ((Map.Entry) obj).getKey()).toLowerCase(Locale.ROOT);
            case 24:
                Map.Entry entry = (Map.Entry) obj;
                String trim = Strings.trim((String) entry.getValue());
                if (!trim.isEmpty()) {
                    return trim;
                }
                return "http.request.headers." + Strings.normalizedHeaderTag((String) entry.getKey());
            case 25:
                Map.Entry entry2 = (Map.Entry) obj;
                String trim2 = Strings.trim((String) entry2.getValue());
                if (!trim2.isEmpty()) {
                    return trim2;
                }
                return "http.response.headers." + Strings.normalizedHeaderTag((String) entry2.getKey());
            case 26:
                return UTF8BytesString.create((String) obj);
            default:
                Pair pair = (Pair) obj;
                CharSequence charSequence = (CharSequence) pair.right;
                if (charSequence == null) {
                    return HttpResourceNames.DEFAULT_RESOURCE_NAME;
                }
                CharSequence charSequence2 = (CharSequence) pair.left;
                if (charSequence2 == null) {
                    sb = new StringBuilder(charSequence.length());
                } else {
                    StringBuilder sb2 = new StringBuilder(charSequence2.length() + charSequence.length() + 1);
                    sb2.append(charSequence2);
                    for (int i = 0; i < sb2.length(); i++) {
                        sb2.setCharAt(i, Character.toUpperCase(sb2.charAt(i)));
                    }
                    sb2.append(' ');
                    sb = sb2;
                }
                int length = charSequence.length() - 1;
                if (HttpResourceNames.INSTANCE == null) {
                    HttpResourceNames.INSTANCE = new HttpResourceNames();
                }
                if (HttpResourceNames.INSTANCE.removeTrailingSlash && length > 0 && charSequence.charAt(length) == '/') {
                    sb.append(charSequence, 0, length);
                } else {
                    sb.append(charSequence);
                }
                return UTF8BytesString.create(sb);
        }
    }

    @Override // coil3.EventListener.Factory
    public EventListener create() {
        return EventListener.NONE;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation$ContextVisitor
    public void forEachKey(Object obj, AgentPropagation$KeyClassifier agentPropagation$KeyClassifier) {
        TracingInterceptor$extractParentContext$headerContext$1 tracingInterceptor$extractParentContext$headerContext$1 = TracingInterceptor$extractParentContext$headerContext$1.INSTANCE;
        agentPropagation$KeyClassifier.getClass();
        tracingInterceptor$extractParentContext$headerContext$1.invoke(obj, new WorkApplet$applet$1(2, agentPropagation$KeyClassifier, AgentPropagation$KeyClassifier.class, "accept", "accept(Ljava/lang/String;Ljava/lang/String;)Z", 0, 10));
    }

    @Override // com.datadog.trace.api.metrics.SpanMetricRegistry
    public SpanMetrics get(String str) {
        return SpanMetrics.NOOP;
    }

    @Override // androidx.transition.Transition.TransitionNotification
    public void notifyListener(Transition.TransitionListener transitionListener, Transition transition, boolean z) {
        switch (this.$r8$classId) {
            case 8:
                transitionListener.onTransitionStart$1(transition);
                break;
            case 9:
                transitionListener.onTransitionEnd$1(transition);
                break;
            case 10:
                transitionListener.onTransitionCancel(transition);
                break;
            case 11:
                transitionListener.onTransitionPause();
                break;
            default:
                transitionListener.onTransitionResume();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Timber.Forest.e("Failed processing QR code", new Object[0], exc);
    }

    public static /* synthetic */ void m(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void m(String str) {
        throw new SVGParseException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static void m(int i) {
        throw new UnknownFieldException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "An unknown field for index "));
    }

    @Override // com.datadog.trace.api.cache.DDPartialKeyCache$Hasher
    public int apply(int i, int i2, Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        int min = Integer.min(charSequence.length(), i2);
        int i3 = 0;
        if (i >= 0 && min > 0) {
            while (i < min) {
                i3 = (i3 * 31) + charSequence.charAt(i);
                i++;
            }
        }
        return i3;
    }
}
