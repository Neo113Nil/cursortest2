package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.InternalMetrics;
import com.google.android.gms.dynamite.zzg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class EventInternal implements JsonStream.Streamable {
    public final String apiKey;

    /* renamed from: app, reason: collision with root package name */
    public AppWithState f940app;
    public List breadcrumbs;
    public String context;
    public DeviceWithState device;
    public final ArrayList errors;
    public final FeatureFlags featureFlags;
    public String groupingDiscriminator;
    public String groupingHash;
    public InternalMetrics internalMetrics;
    public final ObjectJsonStreamer jsonStreamer;
    public final Logger logger;
    public final Metadata metadata;
    public final Throwable originalError;
    public Collection projectPackages;
    public Request request;
    public Response response;
    public Session session;
    public SeverityReason severityReason;
    public final List threads;
    public TraceCorrelation traceCorrelation;
    public User userImpl;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EventInternal(Throwable th, ImmutableConfig immutableConfig, SeverityReason severityReason, Metadata metadata, FeatureFlags featureFlags) {
        this(r1, r2, r3, r4, metadata.copy(), new FeatureFlags(featureFlags.flags), th, immutableConfig.projectPackages, severityReason, new ThreadState(th, severityReason.unhandled, immutableConfig).threads, new User(null, null, null), CollectionsKt.toSet(immutableConfig.redactedKeys));
        ArrayList arrayList;
        String str = immutableConfig.apiKey;
        Logger logger = immutableConfig.logger;
        ArrayList arrayList2 = new ArrayList();
        CollectionsKt.toSet(immutableConfig.discardClasses);
        if (th == null) {
            arrayList = new ArrayList();
        } else {
            Collection collection = immutableConfig.projectPackages;
            Logger logger2 = immutableConfig.logger;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Throwable th2 = th; th2 != null && linkedHashSet.add(th2); th2 = th2.getCause()) {
            }
            List<Throwable> list = CollectionsKt.toList(linkedHashSet);
            ArrayList arrayList3 = new ArrayList();
            for (Throwable th3 : list) {
                StackTraceElement[] stackTrace = th3.getStackTrace();
                if (stackTrace == null) {
                    stackTrace = new StackTraceElement[0];
                }
                arrayList3.add(new Error(new ErrorInternal(th3.getClass().getName(), th3.getLocalizedMessage(), new Stacktrace(stackTrace, collection, logger2), ErrorType.ANDROID), logger2));
            }
            arrayList = arrayList3;
        }
    }

    public final LinkedHashSet getErrorTypesFromStackframes$bugsnag_android_core_release() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.errors;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ErrorType errorType = ((Error) it.next()).impl.f939type;
            if (errorType != null) {
                arrayList.add(errorType);
            }
        }
        Set set = CollectionsKt.toSet(arrayList);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Error) it2.next()).impl.stacktrace);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            List list = (List) it3.next();
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                ErrorType errorType2 = ((Stackframe) it4.next()).f943type;
                if (errorType2 != null) {
                    arrayList5.add(errorType2);
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList5, arrayList4);
        }
        return SetsKt___SetsKt.plus(set, (Iterable) arrayList4);
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        JsonStream jsonStream2 = new JsonStream(jsonStream.out, this.jsonStreamer);
        jsonStream2.beginObject();
        jsonStream2.name("context");
        jsonStream2.value(this.context);
        jsonStream2.name("groupingDiscriminator");
        jsonStream2.value(this.groupingDiscriminator);
        jsonStream2.name("metaData");
        jsonStream2.value(this.metadata);
        jsonStream2.name("severity");
        jsonStream2.value(this.severityReason.currentSeverity);
        jsonStream2.name("severityReason");
        jsonStream2.value(this.severityReason);
        jsonStream2.name("unhandled");
        jsonStream2.value(this.severityReason.unhandled);
        jsonStream2.name("exceptions");
        jsonStream2.beginArray();
        Iterator it = this.errors.iterator();
        while (it.hasNext()) {
            jsonStream2.value((Error) it.next());
        }
        jsonStream2.endArray();
        jsonStream2.name("request");
        jsonStream2.value(this.request);
        jsonStream2.name("response");
        jsonStream2.value(this.response);
        jsonStream2.name("projectPackages");
        jsonStream2.beginArray();
        Iterator it2 = this.projectPackages.iterator();
        while (it2.hasNext()) {
            jsonStream2.value((String) it2.next());
        }
        jsonStream2.endArray();
        jsonStream2.name("user");
        jsonStream2.value(this.userImpl);
        jsonStream2.name("app");
        AppWithState appWithState = this.f940app;
        if (appWithState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("app");
            throw null;
        }
        jsonStream2.value(appWithState);
        jsonStream2.name("device");
        DeviceWithState deviceWithState = this.device;
        if (deviceWithState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("device");
            throw null;
        }
        jsonStream2.value(deviceWithState);
        jsonStream2.name("breadcrumbs");
        jsonStream2.value(this.breadcrumbs);
        jsonStream2.name("groupingHash");
        jsonStream2.value(this.groupingHash);
        Map jsonableMap = this.internalMetrics.toJsonableMap();
        if (!jsonableMap.isEmpty()) {
            jsonStream2.name("usage");
            jsonStream2.beginObject();
            for (Map.Entry entry : jsonableMap.entrySet()) {
                jsonStream2.name((String) entry.getKey());
                jsonStream2.value(entry.getValue());
            }
            jsonStream2.endObject();
        }
        jsonStream2.name("threads");
        jsonStream2.beginArray();
        Iterator it3 = this.threads.iterator();
        while (it3.hasNext()) {
            jsonStream2.value((Thread) it3.next());
        }
        jsonStream2.endArray();
        jsonStream2.name("featureFlags");
        jsonStream2.value(this.featureFlags);
        TraceCorrelation traceCorrelation = this.traceCorrelation;
        if (traceCorrelation != null) {
            jsonStream2.name("correlation");
            jsonStream2.value(traceCorrelation);
        }
        Session session = this.session;
        if (session != null) {
            Session copySession = Session.copySession(session);
            jsonStream2.name("session");
            jsonStream2.beginObject();
            jsonStream2.name("id");
            jsonStream2.value(copySession.id);
            jsonStream2.name("startedAt");
            jsonStream2.value(copySession.startedAt);
            jsonStream2.name("events");
            jsonStream2.beginObject();
            jsonStream2.name("handled");
            jsonStream2.value(copySession.handledCount.intValue());
            jsonStream2.name("unhandled");
            jsonStream2.value(copySession.unhandledCount.intValue());
            jsonStream2.endObject();
            jsonStream2.endObject();
        }
        jsonStream2.endObject();
    }

    public /* synthetic */ EventInternal(Throwable th, ImmutableConfig immutableConfig, SeverityReason severityReason, Metadata metadata, FeatureFlags featureFlags, int i) {
        this(th, immutableConfig, severityReason, metadata, (i & 16) != 0 ? new FeatureFlags() : featureFlags);
    }

    public EventInternal(String str, Logger logger, ArrayList arrayList, ArrayList arrayList2, Metadata metadata, FeatureFlags featureFlags, Throwable th, Collection collection, SeverityReason severityReason, ArrayList arrayList3, User user, Set set) {
        ObjectJsonStreamer objectJsonStreamer = new ObjectJsonStreamer();
        objectJsonStreamer.redactedKeys = CollectionsKt.toSet(objectJsonStreamer.redactedKeys);
        this.jsonStreamer = objectJsonStreamer;
        this.internalMetrics = new zzg(10);
        this.logger = logger;
        this.apiKey = str;
        this.breadcrumbs = arrayList;
        this.errors = arrayList2;
        this.metadata = metadata;
        this.featureFlags = featureFlags;
        this.originalError = th;
        this.projectPackages = collection;
        this.severityReason = severityReason;
        this.threads = arrayList3;
        this.userImpl = user;
        if (set != null) {
            Set set2 = set;
            objectJsonStreamer.redactedKeys = CollectionsKt.toSet(set2);
            metadata.jsonStreamer.redactedKeys = CollectionsKt.toSet(set2);
        }
    }
}
