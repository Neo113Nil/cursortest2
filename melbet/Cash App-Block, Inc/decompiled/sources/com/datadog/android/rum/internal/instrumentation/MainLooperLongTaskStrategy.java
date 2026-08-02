package com.datadog.android.rum.internal.instrumentation;

import android.content.Context;
import android.os.Looper;
import android.util.Printer;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.tracking.TrackingStrategy;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final class MainLooperLongTaskStrategy implements Printer, TrackingStrategy {
    public InternalSdkCore sdkCore;
    public long startUptimeNs;
    public String target = "";
    public final long thresholdMs;
    public final long thresholdNS;

    public final class CompositePrinter implements Printer {
        public static final CompositePrinter INSTANCE = new CompositePrinter();
        public static final AtomicBoolean isRegistered = new AtomicBoolean(false);
        public static final CopyOnWriteArraySet registeredPrinters = new CopyOnWriteArraySet();

        @Override // android.util.Printer
        public final void println(String str) {
            Iterator it = registeredPrinters.iterator();
            while (it.hasNext()) {
                ((Printer) it.next()).println(str);
            }
        }
    }

    public MainLooperLongTaskStrategy(long j) {
        this.thresholdMs = j;
        this.thresholdNS = TimeUnit.MILLISECONDS.toNanos(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MainLooperLongTaskStrategy.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.thresholdMs == ((MainLooperLongTaskStrategy) obj).thresholdMs;
    }

    public final int hashCode() {
        return Long.hashCode(this.thresholdMs);
    }

    @Override // android.util.Printer
    public final void println(String str) {
        InternalSdkCore internalSdkCore;
        if (str != null) {
            InternalSdkCore internalSdkCore2 = this.sdkCore;
            if (internalSdkCore2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sdkCore");
                throw null;
            }
            internalSdkCore2.getTimeProvider().getClass();
            long nanoTime = System.nanoTime();
            if (StringsKt__StringsJVMKt.startsWith(str, ">>>>> Dispatching to ", false)) {
                this.target = str.substring(21);
                this.startUptimeNs = nanoTime;
                return;
            }
            if (StringsKt__StringsJVMKt.startsWith(str, "<<<<< Finished to ", false)) {
                long j = nanoTime - this.startUptimeNs;
                if (j <= this.thresholdNS || (internalSdkCore = this.sdkCore) == null) {
                    return;
                }
                RumMonitor rumMonitor = GlobalRumMonitor.get(internalSdkCore);
                AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
                if (advancedRumMonitor != null) {
                    advancedRumMonitor.addLongTask(j, this.target);
                }
            }
        }
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void register(InternalSdkCore internalSdkCore, Context context) {
        internalSdkCore.getClass();
        context.getClass();
        this.sdkCore = internalSdkCore;
        CompositePrinter compositePrinter = CompositePrinter.INSTANCE;
        if (CompositePrinter.isRegistered.compareAndSet(false, true)) {
            Looper.getMainLooper().setMessageLogging(compositePrinter);
        }
        CompositePrinter.registeredPrinters.add(this);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(this.thresholdMs, "MainLooperLongTaskStrategy(", ")");
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void unregister(Context context) {
        CompositePrinter compositePrinter = CompositePrinter.INSTANCE;
        CompositePrinter.registeredPrinters.remove(this);
    }
}
