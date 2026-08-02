package com.bugsnag.android;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.caverock.androidsvg.SVGParser;
import com.datadog.android.core.InternalSdkCore;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import org.xml.sax.Attributes;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class Thread$State$EnumUnboxingLocalUtility {
    public static int[] _values() {
        return CameraSelector$$ExternalSyntheticOutline0.values(5);
    }

    public static /* synthetic */ long getBaseStepMs(int i) {
        if (i == 1) {
            return 500L;
        }
        if (i == 2) {
            return 2000L;
        }
        if (i == 3) {
            return 5000L;
        }
        throw null;
    }

    public static /* synthetic */ String getDescriptor(int i) {
        switch (i) {
            case 1:
                return "NEW";
            case 2:
                return "BLOCKED";
            case 3:
                return "RUNNABLE";
            case 4:
                return "TERMINATED";
            case 5:
                return "TIMED_WAITING";
            case 6:
                return "WAITING";
            case 7:
                return "UNKNOWN";
            default:
                throw null;
        }
    }

    public static /* synthetic */ short getIdentifier(int i) {
        if (i == 1) {
            return (short) 0;
        }
        if (i == 2) {
            return (short) 1;
        }
        throw null;
    }

    public static /* synthetic */ boolean getIsComplete(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ int getMaxBatchesPerUploadJob(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 20;
        }
        if (i == 3) {
            return 100;
        }
        throw null;
    }

    public static /* synthetic */ String getString(int i) {
        if (i == 1) {
            return "_dd.local.head_sampling_rate_key";
        }
        if (i == 2) {
            return "_dd.local.tail_sampling_rate_key";
        }
        if (i == 3) {
            return "_dd.local.view_instrumentation_type_key";
        }
        throw null;
    }

    public static /* synthetic */ long getWindowDurationMs(int i) {
        if (i == 1) {
            return 3000L;
        }
        if (i == 2) {
            return 10000L;
        }
        if (i == 3) {
            return 35000L;
        }
        throw null;
    }

    public static StringBuilder m(Boolean bool, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(bool);
        sb.append(str4);
        return sb;
    }

    public static /* synthetic */ String name$1(int i) {
        if (i == 1) {
            return "EVENT";
        }
        if (i == 2) {
            return "META";
        }
        throw null;
    }

    public static /* synthetic */ String stringValueOf(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    public static /* synthetic */ String stringValueOf$10(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "RARE" : "AVERAGE" : "FREQUENT";
    }

    public static /* synthetic */ String stringValueOf$3(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int valueOf$1(String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Name is null");
            return 0;
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        a$$ExternalSyntheticBUOutline0.m$3("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
        return 0;
    }

    public static int m(Attributes attributes, int i) {
        return SVGParser.SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
    }

    public static String m(StringBuilder sb, Boolean bool, String str) {
        sb.append(bool);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, Long l, String str) {
        sb.append(l);
        sb.append(str);
        return sb.toString();
    }

    public static int m(int i, int i2, int i3) {
        return (CameraSelector$$ExternalSyntheticOutline0.ordinal(i) + i2) * i3;
    }

    public static Map m(String str, String str2) {
        return MapsKt__MapsJVMKt.mapOf(new Pair(str, str2));
    }

    public static void m(StringBuilder sb, Boolean bool, String str, Boolean bool2, String str2) {
        sb.append(bool);
        sb.append(str);
        sb.append(bool2);
        sb.append(str2);
    }

    public static void m(StringBuilder sb, Boolean bool, String str, String str2, String str3) {
        sb.append(bool);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void m(StringBuilder sb, Long l, String str, Long l2, String str2) {
        sb.append(l);
        sb.append(str);
        sb.append(l2);
        sb.append(str2);
    }

    public static void m(StringBuilder sb, String str, String str2, Boolean bool, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(bool);
        sb.append(str3);
    }

    public static /* synthetic */ void m(AtomicReference atomicReference, InternalSdkCore internalSdkCore) {
        while (!atomicReference.compareAndSet(internalSdkCore, null) && atomicReference.get() == internalSdkCore) {
        }
    }

    public static int m(int i, int i2, int i3, int i4) {
        return ((i + i2) - i3) % i4;
    }
}
