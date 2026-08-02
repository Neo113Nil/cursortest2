package com.android.volley;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.NetworkTypeObserver$ListenerHolder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.android.volley.NetworkResponse;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.trace.api.span.DatadogSpan;
import com.datadog.android.trace.api.span.DatadogSpanBuilder;
import com.datadog.android.trace.api.span.DatadogSpanContext;
import com.datadog.android.trace.api.tracer.DatadogTracer;
import com.datadog.opentelemetry.trace.OtelSpan;
import com.datadog.opentelemetry.trace.OtelSpanContext;
import com.datadog.trace.core.util.SimpleRateLimiter;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchViewAnimationHelper;
import io.opentelemetry.api.internal.ApiUsageLogger;
import io.opentelemetry.api.trace.PropagatedSpan;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.SpanContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NetworkResponse implements SpanBuilder {
    public static NetworkResponse staticInstance;
    public final Object allHeaders;
    public final Object data;
    public Object headers;
    public boolean notModified;
    public int statusCode;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NetworkResponse(byte[] bArr, Map map) {
        this(200, bArr, map, r0, false);
        List arrayList;
        if (map == null) {
            arrayList = 0;
        } else if (map.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new Header((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    public static synchronized NetworkResponse getInstance(Context context) {
        NetworkResponse networkResponse;
        synchronized (NetworkResponse.class) {
            try {
                if (staticInstance == null) {
                    staticInstance = new NetworkResponse(context);
                }
                networkResponse = staticInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return networkResponse;
    }

    public int getNetworkType() {
        int i;
        synchronized (this.allHeaders) {
            i = this.statusCode;
        }
        return i;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public SpanBuilder setAttribute(String str, String str2) {
        if ("operation.name".equals(str) && str2 != null) {
            this.headers = str2.toLowerCase(Locale.ROOT);
            return this;
        }
        if (!"analytics.event".equals(str) || str2 == null) {
            ((DatadogSpanBuilder) this.data).withTag(str2, str);
            return this;
        }
        this.statusCode = Boolean.parseBoolean(str2) ? 1 : 0;
        return this;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public SpanBuilder setNoParent() {
        DatadogSpanBuilder datadogSpanBuilder = (DatadogSpanBuilder) this.data;
        datadogSpanBuilder.withParentContext(null);
        datadogSpanBuilder.ignoreActiveSpan();
        return this;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public SpanBuilder setParent(io.opentelemetry.context.Context context) {
        Span span;
        DatadogSpanContext simpleRateLimiter;
        InternalLogger internalLogger = (InternalLogger) this.allHeaders;
        if (context == null) {
            ApiUsageLogger.log();
            span = PropagatedSpan.INVALID;
        } else {
            span = (Span) context.get();
            if (span == null) {
                span = PropagatedSpan.INVALID;
            }
        }
        SpanContext spanContext = span.getSpanContext();
        if (spanContext instanceof OtelSpanContext) {
            simpleRateLimiter = ((OtelSpanContext) spanContext).delegate;
        } else {
            if (spanContext.isValid()) {
                try {
                    simpleRateLimiter = new SimpleRateLimiter(spanContext);
                } catch (NumberFormatException unused) {
                    ((zzlj) internalLogger).log(2, InternalLogger.Target.MAINTAINER, (Function0) new yf$$ExternalSyntheticLambda2(spanContext, 11), (Throwable) null, false, (Map) null);
                }
            }
            simpleRateLimiter = null;
        }
        if (simpleRateLimiter != null) {
            ((DatadogSpanBuilder) this.data).withParentContext(simpleRateLimiter);
        }
        return this;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public SpanBuilder setStartTimestamp(long j) {
        ((DatadogSpanBuilder) this.data).withStartTimestamp(TimeUnit.MILLISECONDS.toMicros(j));
        return this;
    }

    public void start() {
        ArrayList arrayList = (ArrayList) this.allHeaders;
        ArrayList arrayList2 = (ArrayList) this.headers;
        ArrayList arrayList3 = (ArrayList) this.data;
        if (this.notModified) {
            return;
        }
        this.notModified = true;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SearchViewAnimationHelper.AnonymousClass1 anonymousClass1 = (SearchViewAnimationHelper.AnonymousClass1) it.next();
            switch (anonymousClass1.$r8$classId) {
                case 0:
                    SearchViewAnimationHelper searchViewAnimationHelper = anonymousClass1.this$0;
                    searchViewAnimationHelper.animationDelegate.onAnimationStart(true);
                    searchViewAnimationHelper.rootView.setVisibility(0);
                    SearchBar searchBar = searchViewAnimationHelper.searchBar;
                    searchBar.searchBarAnimationHelper.getClass();
                    View view = searchBar.centerView;
                    if (view == null) {
                        break;
                    } else {
                        view.setAlpha(RecyclerView.DECELERATION_RATE);
                        break;
                    }
                default:
                    SearchViewAnimationHelper searchViewAnimationHelper2 = anonymousClass1.this$0;
                    searchViewAnimationHelper2.animationDelegate.onAnimationStart(false);
                    searchViewAnimationHelper2.searchView.setTransitionState(1, true);
                    break;
            }
        }
        this.statusCode = arrayList2.size();
        if (!arrayList3.isEmpty()) {
            this.statusCode++;
        }
        if (this.statusCode == 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((SearchViewAnimationHelper.AnonymousClass1) it2.next()).onAnimationsEnd();
            }
            this.notModified = false;
            return;
        }
        DynamicAnimation$OnAnimationEndListener dynamicAnimation$OnAnimationEndListener = new DynamicAnimation$OnAnimationEndListener() { // from class: com.google.android.material.animation.AnimationCoordinator$1
            @Override // androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener
            public final void onAnimationEnd(SpringAnimation springAnimation, boolean z, float f, float f2) {
                ArrayList arrayList4 = springAnimation.mEndListeners;
                int indexOf = arrayList4.indexOf(this);
                if (indexOf >= 0) {
                    arrayList4.set(indexOf, null);
                }
                NetworkResponse networkResponse = NetworkResponse.this;
                int i = networkResponse.statusCode - 1;
                networkResponse.statusCode = i;
                if (i == 0) {
                    Iterator it3 = ((ArrayList) networkResponse.allHeaders).iterator();
                    while (it3.hasNext()) {
                        ((SearchViewAnimationHelper.AnonymousClass1) it3.next()).onAnimationsEnd();
                    }
                    networkResponse.notModified = false;
                }
            }
        };
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            SpringAnimation springAnimation = (SpringAnimation) it3.next();
            springAnimation.addEndListener(dynamicAnimation$OnAnimationEndListener);
            springAnimation.start();
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, new ArrayList(arrayList3));
        animatorSet.addListener(new Transition.AnonymousClass3(this, 3));
        animatorSet.start();
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public Span startSpan() {
        DatadogSpanBuilder datadogSpanBuilder = (DatadogSpanBuilder) this.data;
        if (!this.notModified) {
            datadogSpanBuilder.withTag("internal", "span.kind");
            this.notModified = true;
        }
        DatadogSpan start = datadogSpanBuilder.start();
        String str = (String) this.headers;
        if (str != null) {
            start.setOperationName(str);
        }
        int i = this.statusCode;
        if (i != -1) {
            start.setMetric(i);
        }
        return new OtelSpan(start);
    }

    public void updateNetworkType(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.headers;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            NetworkTypeObserver$ListenerHolder networkTypeObserver$ListenerHolder = (NetworkTypeObserver$ListenerHolder) it.next();
            if (networkTypeObserver$ListenerHolder.listener.get() == null) {
                copyOnWriteArrayList.remove(networkTypeObserver$ListenerHolder);
            }
        }
        synchronized (this.allHeaders) {
            try {
                if (this.notModified && this.statusCode == i) {
                    return;
                }
                this.notModified = true;
                this.statusCode = i;
                Iterator it2 = ((CopyOnWriteArrayList) this.headers).iterator();
                while (it2.hasNext()) {
                    NetworkTypeObserver$ListenerHolder networkTypeObserver$ListenerHolder2 = (NetworkTypeObserver$ListenerHolder) it2.next();
                    networkTypeObserver$ListenerHolder2.executor.execute(new AFd1lSDK$$ExternalSyntheticLambda0(networkTypeObserver$ListenerHolder2, 7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public NetworkResponse(DatadogSpanBuilder datadogSpanBuilder, DatadogTracer datadogTracer, InternalLogger internalLogger) {
        this.data = datadogSpanBuilder;
        this.notModified = false;
        this.headers = null;
        this.statusCode = -1;
        this.allHeaders = internalLogger;
    }

    public NetworkResponse(Context context) {
        Executor executor = Log.get();
        this.data = executor;
        this.headers = new CopyOnWriteArrayList();
        this.allHeaders = new Object();
        this.statusCode = 0;
        executor.execute(new DispatchQueue$$ExternalSyntheticLambda0(13, this, context));
    }

    public NetworkResponse(int i, byte[] bArr, Map map, List list, boolean z) {
        this.statusCode = i;
        this.data = bArr;
        this.headers = map;
        if (list == null) {
            this.allHeaders = null;
        } else {
            this.allHeaders = Collections.unmodifiableList(list);
        }
        this.notModified = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NetworkResponse(int i, byte[] bArr, boolean z, List list) {
        this(i, bArr, r0, list, z);
        Map treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Header header = (Header) it.next();
                treeMap.put(header.mName, header.mValue);
            }
        }
    }

    public NetworkResponse() {
        this.data = new ArrayList();
        this.headers = new ArrayList();
        this.allHeaders = new ArrayList();
        this.statusCode = 0;
        this.notModified = false;
    }
}
