package com.google.common.base;

import androidx.tracing.Trace;
import com.google.common.base.Ticker;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class Stopwatch {
    public boolean isRunning;
    public long startTick;
    public final Ticker.AnonymousClass1 ticker = Ticker.SYSTEM_TICKER;

    /* renamed from: com.google.common.base.Stopwatch$1, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            $SwitchMap$java$util$concurrent$TimeUnit = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public final void start() {
        Trace.checkState("This stopwatch is already running.", !this.isRunning);
        this.isRunning = true;
        this.ticker.getClass();
        this.startTick = System.nanoTime();
    }

    public final String toString() {
        long j;
        String str;
        if (this.isRunning) {
            this.ticker.getClass();
            j = System.nanoTime() - this.startTick;
        } else {
            j = 0;
        }
        TimeUnit timeUnit = j / 86400000000000L > 0 ? TimeUnit.DAYS : j / 3600000000000L > 0 ? TimeUnit.HOURS : j / 60000000000L > 0 ? TimeUnit.MINUTES : j / 1000000000 > 0 ? TimeUnit.SECONDS : j / 1000000 > 0 ? TimeUnit.MILLISECONDS : j / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        double convert = j / r0.convert(1L, timeUnit);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(convert)));
        sb.append(" ");
        switch (AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                Path$$ExternalSyntheticBUOutline0.m$2();
                return null;
        }
        sb.append(str);
        return sb.toString();
    }
}
