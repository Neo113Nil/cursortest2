package com.yandex.pulse.metrics;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.DeadSystemException;
import android.util.Log;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.ApplicationParams;
import com.yandex.pulse.LibraryParams;
import com.yandex.pulse.histogram.ComponentHistograms;
import com.yandex.pulse.metrics.o;
import defpackage.b5i;
import defpackage.b6;
import defpackage.bar;
import defpackage.c5i;
import defpackage.d5i;
import defpackage.dyg;
import defpackage.e5i;
import defpackage.f8g;
import defpackage.g3d;
import defpackage.h4i;
import defpackage.i4i;
import defpackage.j4i;
import defpackage.jj4;
import defpackage.jyr;
import defpackage.le0;
import defpackage.lyd;
import defpackage.m4i;
import defpackage.oe5;
import defpackage.pk4;
import defpackage.q4i;
import defpackage.qxf;
import defpackage.r4i;
import defpackage.ryd;
import defpackage.s4i;
import defpackage.t0j;
import defpackage.t4i;
import defpackage.u4i;
import defpackage.uvg;
import defpackage.v4i;
import defpackage.vm4;
import defpackage.w4i;
import defpackage.wyd;
import defpackage.x4i;
import defpackage.xee;
import defpackage.xq0;
import defpackage.xyd;
import defpackage.xz0;
import defpackage.y4i;
import defpackage.ype;
import defpackage.zvh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 o2\u00020\u0001:\u0004pqbrB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u000eJ\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\b¢\u0006\u0004\b&\u0010 J\u0015\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020)2\u0006\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020.¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\f¢\u0006\u0004\b1\u0010\u000eJ\r\u00102\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u00020\f¢\u0006\u0004\b3\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u00107R\u0016\u0010W\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR0\u0010]\u001a\u001e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.0[j\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020.`\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR0\u0010c\u001a\u001e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020b0[j\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020b`\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010^R\u0016\u0010d\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010eR\u0014\u0010j\u001a\u00020g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006s"}, d2 = {"Lcom/yandex/pulse/metrics/MetricsService;", "", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "backgroundExecutor", "Lm4i;", "logUploaderClient", "", "enableHistogramLogging", "<init>", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Lm4i;Z)V", "", "loadSessionId", "()V", "collectMetrics", "", "logType", "Lh4i;", "createLog", "(I)Lh4i;", "Llyd;", "histogram", "Lwyd;", "snapshot", "recordDelta", "(Llyd;Lwyd;)V", "recordDeltaWithLogging", "startSchedulerIfNecessary", "startScheduledUpload", "inIdle", "handleIdleSinceLastTransmission", "(Z)V", "newConnectionType", "onConnectionTypeChanged", "(I)V", "processCleanExitBeacon", "appInForeground", "initializeAndStartService", "Lcom/yandex/pulse/ApplicationParams;", "params", "Lcom/yandex/pulse/histogram/ComponentHistograms;", "registerApplication", "(Lcom/yandex/pulse/ApplicationParams;)Lcom/yandex/pulse/histogram/ComponentHistograms;", "", "libraryName", "Lcom/yandex/pulse/LibraryParams;", "registerLibrary", "(Ljava/lang/String;Lcom/yandex/pulse/LibraryParams;)Lcom/yandex/pulse/histogram/ComponentHistograms;", "onAppEnterForeground", "onAppEnterBackground", "onApplicationNotIdle", "Landroid/content/Context;", "Ljava/util/concurrent/Executor;", "Lm4i;", "Z", "Lcom/yandex/pulse/metrics/NetworkChangeDetector;", "networkChangeDetector", "Lcom/yandex/pulse/metrics/NetworkChangeDetector;", "Lt0j;", "networkMetricsProvider", "Lt0j;", "Lcom/yandex/pulse/metrics/MetricsState;", "metricsState", "Lcom/yandex/pulse/metrics/MetricsState;", "Lq4i;", "reportingService", "Lq4i;", "Li4i;", "logManager", "Li4i;", "Lxyd;", "histogramSnapshotManager", "Lxyd;", "Ly4i;", "stateManager", "Ly4i;", "Lr4i;", "rotationScheduler", "Lr4i;", "Lvm4;", "cleanExitBeacon", "Lvm4;", "Lbar;", "stabilityMetricsProvider", "Lbar;", "idleSinceLastTransmission", "sessionId", "I", "applicationParams", "Lcom/yandex/pulse/ApplicationParams;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "libraryParams", "Ljava/util/HashMap;", "Ld5i;", "applicationSystemProfile", "Ld5i;", "Lt4i;", "librarySystemProfile", "currentPrefix", "Ljava/lang/String;", "currentLibrary", "Lj4i;", "getLogStore", "()Lj4i;", "logStore", "", "getRotationInterval", "()J", "rotationInterval", "Companion", "b6", "s4i", "u4i", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class MetricsService {

    @NotNull
    private static final String TAG = "Pulse";
    private ApplicationParams applicationParams;
    private d5i applicationSystemProfile;

    @NotNull
    private final Executor backgroundExecutor;
    private vm4 cleanExitBeacon;

    @NotNull
    private final Context context;
    private String currentLibrary;

    @NotNull
    private String currentPrefix;
    private final boolean enableHistogramLogging;
    private xyd histogramSnapshotManager;
    private boolean idleSinceLastTransmission;

    @NotNull
    private final HashMap<String, LibraryParams> libraryParams;

    @NotNull
    private final HashMap<String, t4i> librarySystemProfile;
    private i4i logManager;

    @NotNull
    private final m4i logUploaderClient;
    private MetricsState metricsState;
    private NetworkChangeDetector networkChangeDetector;
    private t0j networkMetricsProvider;
    private q4i reportingService;
    private r4i rotationScheduler;
    private int sessionId;
    private bar stabilityMetricsProvider;
    private y4i stateManager;

    @NotNull
    public static final s4i Companion = new s4i();
    private static final long ROTATION_INTERVAL_MS = 300000;
    private static final long CELLULAR_ROTATION_INTERVAL_MS = 900000;

    public MetricsService(@NotNull Context context, @NotNull Executor executor, @NotNull m4i m4iVar, boolean z) {
        context.getClass();
        executor.getClass();
        m4iVar.getClass();
        this.context = context;
        this.backgroundExecutor = executor;
        this.logUploaderClient = m4iVar;
        this.enableHistogramLogging = z;
        this.libraryParams = new HashMap<>();
        this.librarySystemProfile = new HashMap<>();
        this.currentPrefix = "";
    }

    private final void collectMetrics() {
        m1 m1Var;
        boolean z;
        if (this.logManager == null) {
            Intrinsics.j("logManager");
            throw null;
        }
        this.librarySystemProfile.size();
        this.libraryParams.size();
        i4i i4iVar = this.logManager;
        if (i4iVar == null) {
            Intrinsics.j("logManager");
            throw null;
        }
        i4iVar.a = createLog(1);
        i4i i4iVar2 = this.logManager;
        if (i4iVar2 == null) {
            Intrinsics.j("logManager");
            throw null;
        }
        h4i h4iVar = i4iVar2.a;
        h4iVar.getClass();
        t0j t0jVar = this.networkMetricsProvider;
        if (t0jVar == null) {
            Intrinsics.j("networkMetricsProvider");
            throw null;
        }
        pk4 pk4Var = h4iVar.d;
        p pVar = (p) ((a) pk4Var.b).getSystemProfile().m30toBuilder();
        if (t0jVar.b) {
            boolean z2 = t0jVar.d;
        }
        k1 newBuilder = o.k.newBuilder();
        boolean z3 = t0jVar.b;
        newBuilder.d();
        ((o.k) newBuilder.b).setConnectionTypeIsAmbiguous(z3);
        switch (t0jVar.c) {
            case 1:
                m1Var = m1.CONNECTION_ETHERNET;
                break;
            case 2:
                m1Var = m1.CONNECTION_WIFI;
                break;
            case 3:
                m1Var = m1.CONNECTION_2G;
                break;
            case 4:
                m1Var = m1.CONNECTION_3G;
                break;
            case 5:
                m1Var = m1.CONNECTION_4G;
                break;
            case 6:
                m1Var = m1.CONNECTION_NONE;
                break;
            case 7:
                m1Var = m1.CONNECTION_BLUETOOTH;
                break;
            default:
                m1Var = m1.CONNECTION_UNKNOWN;
                break;
        }
        newBuilder.d();
        ((o.k) newBuilder.b).setConnectionType(m1Var);
        o.k kVar = (o.k) newBuilder.b();
        int i = t0jVar.a.e;
        t0jVar.c = i;
        if (i != 0) {
            t0jVar.d = true;
        }
        t0jVar.b = false;
        pVar.d();
        ((o) pVar.b).setNetwork(kVar);
        Object obj = h4iVar.b;
        if (obj != null) {
            oe5[] oe5VarArr = (oe5[]) ((b6) obj).c;
            ArrayList arrayList = new ArrayList(oe5VarArr.length);
            for (oe5 oe5Var : oe5VarArr) {
                n0 newBuilder2 = o.g.newBuilder();
                int G = f8g.G(oe5Var.a);
                newBuilder2.d();
                ((o.g) newBuilder2.b).setNameId(G);
                int G2 = f8g.G(oe5Var.b);
                newBuilder2.d();
                ((o.g) newBuilder2.b).setGroupId(G2);
                arrayList.add((o.g) newBuilder2.b());
            }
            List w0 = CollectionsKt.w0(arrayList);
            pVar.d();
            ((o) pVar.b).addAllFieldTrial(w0);
        }
        o oVar = (o) pVar.b();
        pk4Var.d();
        ((a) pk4Var.b).setSystemProfile(oVar);
        bar barVar = this.stabilityMetricsProvider;
        if (barVar == null) {
            Intrinsics.j("stabilityMetricsProvider");
            throw null;
        }
        jyr jyrVar = barVar.c;
        MetricsState metricsState = barVar.a;
        b5i b5iVar = metricsState.d;
        int cleanResumeCount = b5iVar.h().getCleanResumeCount();
        if (cleanResumeCount != 0) {
            ((lyd) jyrVar.getValue()).a(0, cleanResumeCount);
            c5i c5iVar = (c5i) b5iVar.h().m30toBuilder();
            c5iVar.getClass();
            c5iVar.d();
            ((m) c5iVar.b).setCleanResumeCount(0);
            m mVar = (m) c5iVar.b();
            b5iVar.d();
            ((l) b5iVar.b).setStability(mVar);
            z = true;
        } else {
            z = false;
        }
        int afterCrashResumeCount = b5iVar.h().getAfterCrashResumeCount();
        if (afterCrashResumeCount != 0) {
            ((lyd) jyrVar.getValue()).a(1, afterCrashResumeCount);
            c5i c5iVar2 = (c5i) b5iVar.h().m30toBuilder();
            c5iVar2.getClass();
            c5iVar2.d();
            ((m) c5iVar2.b).setAfterCrashResumeCount(0);
            m mVar2 = (m) c5iVar2.b();
            b5iVar.d();
            ((l) b5iVar.b).setStability(mVar2);
            z = true;
        }
        if (z) {
            metricsState.a();
        }
        ApplicationParams applicationParams = this.applicationParams;
        if (applicationParams != null) {
            this.currentLibrary = null;
            this.currentPrefix = applicationParams.histogramPrefix;
            Object obj2 = ComponentHistograms.b;
            ComponentHistograms B = xee.B();
            xyd xydVar = this.histogramSnapshotManager;
            if (xydVar == null) {
                Intrinsics.j("histogramSnapshotManager");
                throw null;
            }
            B.d(xydVar);
        }
        for (Map.Entry<String, LibraryParams> entry : this.libraryParams.entrySet()) {
            String key = entry.getKey();
            LibraryParams value = entry.getValue();
            this.currentLibrary = key;
            this.currentPrefix = value.histogramPrefix;
            Object obj3 = ComponentHistograms.b;
            key.getClass();
            ComponentHistograms D = xee.D(key);
            xyd xydVar2 = this.histogramSnapshotManager;
            if (xydVar2 == null) {
                Intrinsics.j("histogramSnapshotManager");
                throw null;
            }
            D.d(xydVar2);
        }
        i4i i4iVar3 = this.logManager;
        if (i4iVar3 == null) {
            Intrinsics.j("logManager");
            throw null;
        }
        j4i logStore = getLogStore();
        logStore.getClass();
        h4i h4iVar2 = i4iVar3.a;
        h4iVar2.getClass();
        pk4 pk4Var2 = h4iVar2.d;
        ArrayList arrayList2 = h4iVar2.e.a;
        try {
            List w02 = CollectionsKt.w0(arrayList2);
            arrayList2.clear();
            pk4Var2.d();
            ((a) pk4Var2.b).addAllHistogramEvent(w02);
            t4i[] t4iVarArr = h4iVar2.c;
            ype it = xz0.B(t4iVarArr).iterator();
            while (it.c) {
                int nextInt = it.nextInt();
                ryd rydVar = (ryd) h4iVar2.f.get(t4iVarArr[nextInt].d);
                if (rydVar != null) {
                    qxf qxfVar = (qxf) ((a) pk4Var2.b).getLibraryMetrics(nextInt).m30toBuilder();
                    arrayList2 = rydVar.a;
                    try {
                        List w03 = CollectionsKt.w0(arrayList2);
                        arrayList2.clear();
                        qxfVar.d();
                        ((f) qxfVar.b).addAllHistogramEvent(w03);
                        f fVar = (f) qxfVar.b();
                        pk4Var2.d();
                        ((a) pk4Var2.b).setLibraryMetrics(nextInt, fVar);
                    } finally {
                    }
                }
            }
            h4i h4iVar3 = i4iVar3.a;
            h4iVar3.getClass();
            byte[] byteArray = ((a) h4iVar3.d.b()).toByteArray();
            byteArray.getClass();
            if (!(byteArray.length == 0)) {
                h4i h4iVar4 = i4iVar3.a;
                h4iVar4.getClass();
                int i2 = h4iVar4.a;
                if (i2 == 0) {
                    logStore.d.R(byteArray);
                } else if (i2 == 1) {
                    logStore.e.R(byteArray);
                }
            }
            i4iVar3.a = null;
        } finally {
        }
    }

    private final h4i createLog(int logType) {
        Context context = this.context;
        y4i y4iVar = this.stateManager;
        if (y4iVar == null) {
            Intrinsics.j("stateManager");
            throw null;
        }
        String clientId = ((l) y4iVar.a.d.b).getClientId();
        clientId.getClass();
        int i = this.sessionId;
        d5i d5iVar = this.applicationSystemProfile;
        Collection<t4i> values = this.librarySystemProfile.values();
        values.getClass();
        Object[] array = values.toArray(new t4i[0]);
        if (array != null) {
            return new h4i(context, clientId, i, logType, d5iVar, (t4i[]) array);
        }
        jj4.j("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return null;
    }

    private final j4i getLogStore() {
        q4i q4iVar = this.reportingService;
        if (q4iVar != null) {
            return q4iVar.b;
        }
        Intrinsics.j("reportingService");
        throw null;
    }

    private final long getRotationInterval() {
        int i = NetworkChangeDetector.j;
        NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
        if (networkChangeDetector != null) {
            int i2 = networkChangeDetector.e;
            return (i2 == 3 || i2 == 4 || i2 == 5) ? CELLULAR_ROTATION_INTERVAL_MS : ROTATION_INTERVAL_MS;
        }
        Intrinsics.j("networkChangeDetector");
        throw null;
    }

    private final void handleIdleSinceLastTransmission(boolean inIdle) {
        if (!inIdle && this.idleSinceLastTransmission) {
            startSchedulerIfNecessary();
        }
        this.idleSinceLastTransmission = inIdle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initializeAndStartService$lambda-0, reason: not valid java name */
    public static final long m20initializeAndStartService$lambda0(MetricsService metricsService) {
        metricsService.getClass();
        return metricsService.getRotationInterval();
    }

    private final void loadSessionId() {
        MetricsState metricsState = this.metricsState;
        if (metricsState == null) {
            Intrinsics.j("metricsState");
            throw null;
        }
        int sessionId = ((l) metricsState.d.b).getSessionId() + 1;
        this.sessionId = sessionId;
        MetricsState metricsState2 = this.metricsState;
        if (metricsState2 == null) {
            Intrinsics.j("metricsState");
            throw null;
        }
        b5i b5iVar = metricsState2.d;
        b5iVar.d();
        ((l) b5iVar.b).setSessionId(sessionId);
        MetricsState metricsState3 = this.metricsState;
        if (metricsState3 != null) {
            metricsState3.a();
        } else {
            Intrinsics.j("metricsState");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConnectionTypeChanged(int newConnectionType) {
        t0j t0jVar = this.networkMetricsProvider;
        if (t0jVar == null) {
            Intrinsics.j("networkMetricsProvider");
            throw null;
        }
        if (newConnectionType == 6) {
            t0jVar.d = true;
            return;
        }
        boolean z = t0jVar.d;
        if (!z) {
            int i = t0jVar.c;
        }
        int i2 = t0jVar.c;
        if (newConnectionType != i2 && i2 != 6 && z) {
            t0jVar.b = true;
        }
        t0jVar.d = true;
        t0jVar.c = newConnectionType;
    }

    private final void processCleanExitBeacon() {
        vm4 vm4Var = this.cleanExitBeacon;
        if (vm4Var == null) {
            Intrinsics.j("cleanExitBeacon");
            throw null;
        }
        if (vm4Var.b) {
            return;
        }
        vm4Var.a(true);
        bar barVar = this.stabilityMetricsProvider;
        if (barVar == null) {
            Intrinsics.j("stabilityMetricsProvider");
            throw null;
        }
        MetricsState metricsState = barVar.a;
        b5i b5iVar = metricsState.d;
        g3d m30toBuilder = b5iVar.h().m30toBuilder();
        c5i c5iVar = (c5i) m30toBuilder;
        c5iVar.getClass();
        int afterCrashResumeCount = ((m) c5iVar.b).getAfterCrashResumeCount() + 1;
        c5iVar.d();
        ((m) c5iVar.b).setAfterCrashResumeCount(afterCrashResumeCount);
        m mVar = (m) ((c5i) m30toBuilder).b();
        b5iVar.d();
        ((l) b5iVar.b).setStability(mVar);
        metricsState.a();
        bar barVar2 = this.stabilityMetricsProvider;
        if (barVar2 != null) {
            barVar2.b = true;
        } else {
            Intrinsics.j("stabilityMetricsProvider");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordDelta(lyd histogram, wyd snapshot) {
        i4i i4iVar = this.logManager;
        if (i4iVar == null) {
            Intrinsics.j("logManager");
            throw null;
        }
        h4i h4iVar = i4iVar.a;
        h4iVar.getClass();
        String str = this.currentLibrary;
        String str2 = this.currentPrefix;
        if (str == null) {
            String str3 = histogram.a;
            str2.getClass();
            str3.getClass();
            snapshot.getClass();
            h4i.a(h4iVar.e, str2, str3, snapshot);
            return;
        }
        String str4 = histogram.a;
        str2.getClass();
        str4.getClass();
        snapshot.getClass();
        HashMap hashMap = h4iVar.f;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new ryd());
        }
        Object obj = hashMap.get(str);
        obj.getClass();
        h4i.a((ryd) obj, str2, str4, snapshot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordDeltaWithLogging(lyd histogram, wyd snapshot) {
        recordDelta(histogram, snapshot);
        Log.i(TAG, "Histogram recorded: " + this.currentPrefix + histogram.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startScheduledUpload() {
        if (this.idleSinceLastTransmission) {
            r4i r4iVar = this.rotationScheduler;
            if (r4iVar == null) {
                Intrinsics.j("rotationScheduler");
                throw null;
            }
            r4iVar.stop();
            r4i r4iVar2 = this.rotationScheduler;
            if (r4iVar2 != null) {
                r4iVar2.taskDone(m20initializeAndStartService$lambda0((MetricsService) r4iVar2.a.b));
                return;
            } else {
                Intrinsics.j("rotationScheduler");
                throw null;
            }
        }
        if (getLogStore().P()) {
            q4i q4iVar = this.reportingService;
            if (q4iVar == null) {
                Intrinsics.j("reportingService");
                throw null;
            }
            q4iVar.a();
            r4i r4iVar3 = this.rotationScheduler;
            if (r4iVar3 != null) {
                r4iVar3.taskDone(m20initializeAndStartService$lambda0((MetricsService) r4iVar3.a.b));
                return;
            } else {
                Intrinsics.j("rotationScheduler");
                throw null;
            }
        }
        collectMetrics();
        q4i q4iVar2 = this.reportingService;
        if (q4iVar2 == null) {
            Intrinsics.j("reportingService");
            throw null;
        }
        q4iVar2.a();
        r4i r4iVar4 = this.rotationScheduler;
        if (r4iVar4 == null) {
            Intrinsics.j("rotationScheduler");
            throw null;
        }
        r4iVar4.taskDone(m20initializeAndStartService$lambda0((MetricsService) r4iVar4.a.b));
        handleIdleSinceLastTransmission(true);
    }

    private final void startSchedulerIfNecessary() {
        r4i r4iVar = this.rotationScheduler;
        if (r4iVar == null) {
            Intrinsics.j("rotationScheduler");
            throw null;
        }
        r4iVar.start(15000L);
        q4i q4iVar = this.reportingService;
        if (q4iVar != null) {
            q4iVar.a();
        } else {
            Intrinsics.j("reportingService");
            throw null;
        }
    }

    public final void initializeAndStartService(boolean appInForeground) {
        MetricsService metricsService;
        Function2 function2;
        NetworkChangeDetector networkChangeDetector = new NetworkChangeDetector(this.context, new v4i(this));
        this.networkChangeDetector = networkChangeDetector;
        this.networkMetricsProvider = new t0j(networkChangeDetector);
        this.metricsState = new MetricsState(this.context.getFilesDir(), this.backgroundExecutor);
        m4i m4iVar = this.logUploaderClient;
        MetricsState metricsState = this.metricsState;
        if (metricsState == null) {
            Intrinsics.j("metricsState");
            throw null;
        }
        this.reportingService = new q4i(m4iVar, metricsState);
        this.logManager = new i4i();
        if (this.enableHistogramLogging) {
            metricsService = this;
            function2 = new le0(2, metricsService, MetricsService.class, "recordDeltaWithLogging", "recordDeltaWithLogging(Lcom/yandex/pulse/histogram/HistogramBase;Lcom/yandex/pulse/histogram/HistogramSamples;)V", 0, 29);
        } else {
            w4i w4iVar = new w4i(2, this, MetricsService.class, "recordDelta", "recordDelta(Lcom/yandex/pulse/histogram/HistogramBase;Lcom/yandex/pulse/histogram/HistogramSamples;)V", 0, 0);
            metricsService = this;
            function2 = w4iVar;
        }
        metricsService.histogramSnapshotManager = new xyd(new x4i(function2));
        MetricsState metricsState2 = metricsService.metricsState;
        if (metricsState2 == null) {
            Intrinsics.j("metricsState");
            throw null;
        }
        metricsService.stateManager = new y4i(metricsState2);
        metricsService.rotationScheduler = new r4i(new dyg(11, this), new uvg(15, this));
        MetricsState metricsState3 = metricsService.metricsState;
        if (metricsState3 == null) {
            Intrinsics.j("metricsState");
            throw null;
        }
        metricsService.cleanExitBeacon = new vm4(metricsState3);
        MetricsState metricsState4 = metricsService.metricsState;
        if (metricsState4 == null) {
            Intrinsics.j("metricsState");
            throw null;
        }
        metricsService.stabilityMetricsProvider = new bar(metricsState4);
        processCleanExitBeacon();
        q4i q4iVar = metricsService.reportingService;
        if (q4iVar == null) {
            Intrinsics.j("reportingService");
            throw null;
        }
        j4i j4iVar = q4iVar.b;
        j4iVar.d.P();
        j4iVar.e.P();
        j4iVar.f = true;
        e5i e5iVar = new e5i(new dyg(10, q4iVar));
        e5iVar.a = 15000L;
        q4iVar.e = e5iVar;
        loadSessionId();
        q4i q4iVar2 = metricsService.reportingService;
        if (q4iVar2 == null) {
            Intrinsics.j("reportingService");
            throw null;
        }
        if (!q4iVar2.c) {
            q4iVar2.c = true;
            q4iVar2.a();
        }
        if (appInForeground) {
            onAppEnterForeground();
            return;
        }
        q4i q4iVar3 = metricsService.reportingService;
        if (q4iVar3 == null) {
            Intrinsics.j("reportingService");
            throw null;
        }
        e5i e5iVar2 = q4iVar3.e;
        if (e5iVar2 != null) {
            e5iVar2.stop();
        }
    }

    public final void onAppEnterBackground() {
        vm4 vm4Var = this.cleanExitBeacon;
        if (vm4Var == null) {
            Intrinsics.j("cleanExitBeacon");
            throw null;
        }
        vm4Var.a(true);
        NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
        if (networkChangeDetector == null) {
            Intrinsics.j("networkChangeDetector");
            throw null;
        }
        if (networkChangeDetector.g) {
            Context context = networkChangeDetector.a;
            context.getClass();
            try {
                context.unregisterReceiver(networkChangeDetector);
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof DeadSystemException)) {
                    throw e;
                }
            }
            networkChangeDetector.g = false;
        }
        r4i r4iVar = this.rotationScheduler;
        if (r4iVar == null) {
            Intrinsics.j("rotationScheduler");
            throw null;
        }
        r4iVar.stop();
        q4i q4iVar = this.reportingService;
        if (q4iVar == null) {
            Intrinsics.j("reportingService");
            throw null;
        }
        e5i e5iVar = q4iVar.e;
        if (e5iVar != null) {
            e5iVar.stop();
        }
        collectMetrics();
        j4i logStore = getLogStore();
        if (logStore.f) {
            logStore.d.Q();
            logStore.e.Q();
        }
        MetricsState metricsState = this.metricsState;
        if (metricsState == null) {
            Intrinsics.j("metricsState");
            throw null;
        }
        if (metricsState.e) {
            metricsState.e = false;
            metricsState.b.removeMessages(0);
            metricsState.c.execute(new zvh(1, metricsState, ((l) metricsState.d.b()).toByteArray()));
        }
    }

    public final void onAppEnterForeground() {
        vm4 vm4Var = this.cleanExitBeacon;
        Intent intent = null;
        if (vm4Var == null) {
            Intrinsics.j("cleanExitBeacon");
            throw null;
        }
        vm4Var.a(false);
        bar barVar = this.stabilityMetricsProvider;
        if (barVar == null) {
            Intrinsics.j("stabilityMetricsProvider");
            throw null;
        }
        if (barVar.b) {
            barVar.b = false;
        } else {
            MetricsState metricsState = barVar.a;
            b5i b5iVar = metricsState.d;
            g3d m30toBuilder = b5iVar.h().m30toBuilder();
            c5i c5iVar = (c5i) m30toBuilder;
            c5iVar.getClass();
            int cleanResumeCount = ((m) c5iVar.b).getCleanResumeCount() + 1;
            c5iVar.d();
            ((m) c5iVar.b).setCleanResumeCount(cleanResumeCount);
            m mVar = (m) ((c5i) m30toBuilder).b();
            b5iVar.d();
            ((l) b5iVar.b).setStability(mVar);
            metricsState.a();
        }
        NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
        if (networkChangeDetector == null) {
            Intrinsics.j("networkChangeDetector");
            throw null;
        }
        if (!networkChangeDetector.g) {
            if (networkChangeDetector.h) {
                networkChangeDetector.c.sendEmptyMessage(1);
            }
            Context context = networkChangeDetector.a;
            IntentFilter intentFilter = networkChangeDetector.d;
            context.getClass();
            try {
                intent = context.registerReceiver(networkChangeDetector, intentFilter);
            } catch (IllegalArgumentException unused) {
            }
            networkChangeDetector.i = intent != null;
            networkChangeDetector.g = true;
        }
        startSchedulerIfNecessary();
    }

    public final void onApplicationNotIdle() {
        handleIdleSinceLastTransmission(false);
    }

    @NotNull
    public final ComponentHistograms registerApplication(@NotNull ApplicationParams params) {
        params.getClass();
        if (this.applicationParams != null || this.applicationSystemProfile != null) {
            xq0.q("Pulse application already registered");
            return null;
        }
        this.applicationSystemProfile = new u4i(params);
        this.applicationParams = params;
        Log.i(TAG, "Application " + params.packageName + ':' + params.versionString + " was registered with prefix " + params.histogramPrefix);
        Object obj = ComponentHistograms.b;
        return xee.B();
    }

    @NotNull
    public final ComponentHistograms registerLibrary(@NotNull String libraryName, @NotNull LibraryParams params) {
        libraryName.getClass();
        params.getClass();
        if (libraryName.equals("")) {
            xq0.x("Wrong library name");
            return null;
        }
        if (this.libraryParams.containsKey(libraryName) || this.librarySystemProfile.containsKey(libraryName)) {
            xq0.x("Duplicate library registration");
            return null;
        }
        this.librarySystemProfile.put(libraryName, new t4i(libraryName, params));
        this.libraryParams.put(libraryName, params);
        Log.i(TAG, "Library " + params.packageName + ':' + params.versionString + " was registered with prefix " + params.histogramPrefix);
        Object obj = ComponentHistograms.b;
        return xee.D(libraryName);
    }
}
