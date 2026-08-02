package androidx.camera.video;

import android.os.Looper;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class Recorder$$ExternalSyntheticOutline1 {
    public static String m(String str, int i, String str2, String str3, String str4) {
        return str + str2 + str3 + i + str4;
    }

    public static /* synthetic */ String stringValueOf$1(int i) {
        switch (i) {
            case 1:
                return "INITIALIZING";
            case 2:
                return "IDLING";
            case 3:
                return "DISABLED";
            case 4:
                return "ENABLED";
            case 5:
                return "ERROR_ENCODER";
            case 6:
                return "ERROR_SOURCE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String stringValueOf$3(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RELEASED" : "READY" : "PENDING_RELEASE" : "INITIALIZING" : "NOT_INITIALIZED";
    }

    public static /* synthetic */ String stringValueOf$4(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "INACTIVE" : "ACTIVE_NON_STREAMING" : "ACTIVE_STREAMING";
    }

    public static /* synthetic */ String stringValueOf$5(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "RELEASED" : "STARTED" : "CONFIGURED";
    }

    public static /* synthetic */ String stringValueOf$6(int i) {
        switch (i) {
            case 1:
                return "CONFIGURED";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "STOPPING";
            case 5:
                return "PENDING_START";
            case 6:
                return "PENDING_START_PAUSED";
            case 7:
                return "PENDING_RELEASE";
            case 8:
                return "ERROR";
            case 9:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static int m(TextStyle textStyle, int i, int i2) {
        return (textStyle.hashCode() + i) * i2;
    }

    public static int m(Function3 function3, int i, int i2) {
        return (function3.hashCode() + i) * i2;
    }

    public static ParcelableSnapshotMutableState m(boolean z, GapComposer gapComposer) {
        ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.valueOf(z));
        gapComposer.updateRememberedValue(mutableStateOf$default);
        return mutableStateOf$default;
    }

    public static Color m(GapComposer gapComposer, boolean z, long j) {
        gapComposer.end(z);
        return new Color(j);
    }

    public static String m(float f, String str, StringBuilder sb) {
        sb.append(f);
        sb.append(str);
        return sb.toString();
    }

    public static String m(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(int i, StringBuilder sb) {
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }

    public static int m(int i, int i2, Function1 function1) {
        return (function1.hashCode() + i) * i2;
    }

    public static String m(String str, StringBuilder sb, ArrayList arrayList) {
        sb.append(arrayList);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, Object obj, char c) {
        sb.append(obj);
        sb.append(c);
        return sb.toString();
    }

    public static String m(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    public static KotlinNothingValueException m(String str) {
        ListUtilsKt.throwNoSuchElementException(str);
        return new KotlinNothingValueException();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m104m(float f, String str, StringBuilder sb) {
        sb.append((Object) Dp.m1038toStringimpl(f));
        sb.append(str);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m105m(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void m(int i, GapComposer gapComposer, int i2, ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1) {
        gapComposer.updateRememberedValue(Integer.valueOf(i));
        gapComposer.apply(Integer.valueOf(i2), composeUiNode$Companion$SetModifier$1);
    }

    public static void m(int i, ComposableLambdaImpl composableLambdaImpl, ColumnScopeInstance columnScopeInstance, GapComposer gapComposer, boolean z) {
        composableLambdaImpl.invoke(columnScopeInstance, gapComposer, Integer.valueOf(i));
        gapComposer.end(z);
    }

    public static void m(int i, Function2 function2, GapComposer gapComposer, boolean z) {
        function2.invoke(gapComposer, Integer.valueOf(i));
        gapComposer.end(z);
    }

    public static void m(long j, ParcelableSnapshotMutableState parcelableSnapshotMutableState) {
        parcelableSnapshotMutableState.setValue(new Offset(j));
    }

    public static void m(long j, String str, StringBuilder sb) {
        sb.append((Object) Color.m682toStringimpl(j));
        sb.append(str);
    }

    public static /* synthetic */ void m(Object obj) {
        throw new ClassCastException();
    }

    public static boolean m(MutableLiveData mutableLiveData) {
        mutableLiveData.getClass();
        return Looper.getMainLooper().isCurrentThread();
    }

    public static int m(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) / i4;
    }
}
