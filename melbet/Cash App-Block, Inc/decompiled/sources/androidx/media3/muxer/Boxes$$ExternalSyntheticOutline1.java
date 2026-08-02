package androidx.media3.muxer;

import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.UUID;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public abstract /* synthetic */ class Boxes$$ExternalSyntheticOutline1 {
    public static String m(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m$1(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static int m$2(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static int m(int i, int i2, String str) {
        return str.length() + i + i2;
    }

    public static ParcelableSnapshotMutableIntState m(int i, GapComposer gapComposer) {
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = new ParcelableSnapshotMutableIntState(i);
        gapComposer.updateRememberedValue(parcelableSnapshotMutableIntState);
        return parcelableSnapshotMutableIntState;
    }

    public static ClassCastException m(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String m() {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        return uuid;
    }

    public static int m$1(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static String m1148m(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String m(int i, String str) {
        return i + str;
    }

    public static String m(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static String m(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String m(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String m(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(Class cls, String str) {
        return str + cls;
    }

    public static String m(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    public static String m(Exception exc, String str) {
        return str + exc;
    }

    public static String m(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    public static String m(String str, Object obj) {
        return str + obj;
    }

    public static int m(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    public static String m(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m1149m(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static KotlinNothingValueException m1150m(String str) {
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(str);
        return new KotlinNothingValueException();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m1151m(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static void m(GapComposer gapComposer, boolean z, boolean z2, boolean z3) {
        gapComposer.end(z);
        gapComposer.end(z2);
        gapComposer.end(z3);
    }

    public static void m(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
    }

    public static void m(StringBuilder sb, String str, String str2, int i, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }

    public static void m(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }
}
