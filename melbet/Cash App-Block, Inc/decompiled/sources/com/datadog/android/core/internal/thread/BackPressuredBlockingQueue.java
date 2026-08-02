package com.datadog.android.core.internal.thread;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.animation.BoundsAnimation$animate$1;
import app.cash.trifle.KeyHandle$keyPair$2;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.internal.thread.NamedCallable;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class BackPressuredBlockingQueue extends LinkedBlockingQueue {
    public final int backpressureMitigation;
    public final int capacity;
    public final String executorContext;
    public final AtomicLong lastDumpTimestamp;
    public final InternalLogger logger;
    public final int notifyThreshold;
    public final Function1 onItemDropped;
    public final Function0 onThresholdReached;
    public final Strings timeProvider;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraSelector$$ExternalSyntheticOutline0.values(2).length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackPressuredBlockingQueue(InternalLogger internalLogger, String str, int i, Function0 function0, Function1 function1, int i2, Strings strings) {
        super(i);
        internalLogger.getClass();
        strings.getClass();
        this.lastDumpTimestamp = new AtomicLong(0L);
        this.logger = internalLogger;
        this.executorContext = str;
        this.capacity = i;
        this.notifyThreshold = 1024;
        this.onThresholdReached = function0;
        this.onItemDropped = function1;
        this.backpressureMitigation = i2;
        this.timeProvider = strings;
    }

    public final void notifyItemDropped(Object obj) {
        String obj2;
        this.onItemDropped.invoke(obj);
        NamedCallable namedCallable = obj instanceof NamedCallable ? (NamedCallable) obj : null;
        if (namedCallable == null || (obj2 = namedCallable.name) == null) {
            obj2 = obj.toString();
        }
        ((zzlj) this.logger).log(5, InternalLogger.Target.MAINTAINER, (Function0) new DatadogInterceptor$intercept$1(obj2, 10), (Throwable) null, false, MapsKt__MapsKt.mapOf(new Pair("backpressure.capacity", Integer.valueOf(this.capacity)), new Pair("executor.context", this.executorContext)));
    }

    public final void notifyThresholdReached() {
        String str;
        this.timeProvider.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        AtomicLong atomicLong = this.lastDumpTimestamp;
        long j = atomicLong.get();
        LinkedHashMap linkedHashMap = null;
        if (currentTimeMillis - j > 5000 && atomicLong.compareAndSet(j, currentTimeMillis)) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Object[] array2 = toArray();
            array2.getClass();
            for (Object obj : array2) {
                NamedCallable namedCallable = obj instanceof NamedCallable ? (NamedCallable) obj : null;
                if (namedCallable != null && (str = namedCallable.name) != null) {
                    Integer num = (Integer) linkedHashMap2.get(str);
                    linkedHashMap2.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
            linkedHashMap = linkedHashMap2;
        }
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("capacity", Integer.valueOf(this.capacity));
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            mapBuilder.put("dump", linkedHashMap);
        }
        MapBuilder build = mapBuilder.build();
        this.onThresholdReached.invoke();
        ((zzlj) this.logger).log(4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), (Function0) new KeyHandle$keyPair$2(this, 18), (Throwable) null, false, MapsKt__MapsKt.mapOf(new Pair("backpressure", build), new Pair("executor.context", this.executorContext)));
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean offer(Object obj) {
        obj.getClass();
        BoundsAnimation$animate$1 boundsAnimation$animate$1 = new BoundsAnimation$animate$1(this, 27);
        if (remainingCapacity() != 0) {
            if (super.size() + 1 == this.notifyThreshold) {
                notifyThresholdReached();
            }
            return ((Boolean) boundsAnimation$animate$1.invoke(obj)).booleanValue();
        }
        int i = this.backpressureMitigation;
        int i2 = i == 0 ? -1 : WhenMappings.$EnumSwitchMapping$0[CameraSelector$$ExternalSyntheticOutline0.ordinal(i)];
        if (i2 != -1) {
            if (i2 == 1) {
                Object take = take();
                take.getClass();
                notifyItemDropped(take);
                return ((Boolean) boundsAnimation$animate$1.invoke(obj)).booleanValue();
            }
            if (i2 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
            }
        }
        notifyItemDropped(obj);
        return true;
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
    public final void put(Object obj) {
        obj.getClass();
        if (super.size() + 1 == this.notifyThreshold) {
            notifyThresholdReached();
        }
        super.put(obj);
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
    public final boolean offer(Object obj, long j, TimeUnit timeUnit) {
        obj.getClass();
        if (!super.offer(obj, j, timeUnit)) {
            return offer(obj);
        }
        if (super.size() != this.notifyThreshold) {
            return true;
        }
        notifyThresholdReached();
        return true;
    }
}
