package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class VolleyLog {
    public static final boolean DEBUG = Log.isLoggable("Volley", 2);
    public static final String CLASS_NAME = VolleyLog.class.getName();

    public final class MarkerLog {
        public static final boolean ENABLED = VolleyLog.DEBUG;
        public final ArrayList mMarkers = new ArrayList();
        public boolean mFinished = false;

        public final class Marker {
            public final String name;
            public final long thread;
            public final long time;

            public Marker(long j, long j2, String str) {
                this.name = str;
                this.thread = j;
                this.time = j2;
            }
        }

        public final synchronized void add(long j, String str) {
            if (this.mFinished) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.mMarkers.add(new Marker(j, SystemClock.elapsedRealtime(), str));
        }

        public final void finalize() {
            if (this.mFinished) {
                return;
            }
            finish("Request on the loose");
            VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }

        public final synchronized void finish(String str) {
            long j;
            this.mFinished = true;
            ArrayList arrayList = this.mMarkers;
            if (arrayList.size() == 0) {
                j = 0;
            } else {
                j = ((Marker) arrayList.get(arrayList.size() - 1)).time - ((Marker) arrayList.get(0)).time;
            }
            if (j <= 0) {
                return;
            }
            long j2 = ((Marker) this.mMarkers.get(0)).time;
            VolleyLog.d("(%-4d ms) %s", Long.valueOf(j), str);
            Iterator it = this.mMarkers.iterator();
            while (it.hasNext()) {
                Marker marker = (Marker) it.next();
                long j3 = marker.time;
                VolleyLog.d("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(marker.thread), marker.name);
                j2 = j3;
            }
        }
    }

    public static String buildMessage(String str, Object... objArr) {
        String str2;
        String format2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i].getClassName().equals(CLASS_NAME)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(substring.substring(substring.lastIndexOf(36) + 1), ".");
                m108m.append(stackTrace[i].getMethodName());
                str2 = m108m.toString();
                break;
            }
            i++;
        }
        Locale locale = Locale.US;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m("[", Thread.currentThread().getId(), "] ", str2), ": ", format2);
    }

    public static void d(String str, Object... objArr) {
        Log.d("Volley", buildMessage(str, objArr));
    }

    public static void e(String str, Object... objArr) {
        Log.e("Volley", buildMessage(str, objArr));
    }

    public static void v(String str, Object... objArr) {
        if (DEBUG) {
            Log.v("Volley", buildMessage(str, objArr));
        }
    }
}
