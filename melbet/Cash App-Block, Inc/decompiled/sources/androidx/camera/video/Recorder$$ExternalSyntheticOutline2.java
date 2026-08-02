package androidx.camera.video;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import com.squareup.wire.GrpcMethod;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes.dex */
public abstract /* synthetic */ class Recorder$$ExternalSyntheticOutline2 {
    public static String m(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String m$1(String str, String str2) {
        return str + str2;
    }

    public static float m$1(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static int m(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int m(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static MutableInteractionSourceImpl m(GapComposer gapComposer) {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = new MutableInteractionSourceImpl();
        gapComposer.updateRememberedValue(mutableInteractionSourceImpl);
        return mutableInteractionSourceImpl;
    }

    public static ParcelableSnapshotMutableFloatState m(float f, GapComposer gapComposer) {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = new ParcelableSnapshotMutableFloatState(f);
        gapComposer.updateRememberedValue(parcelableSnapshotMutableFloatState);
        return parcelableSnapshotMutableFloatState;
    }

    public static ProvidedValue m(long j, DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal) {
        return dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(new Color(j));
    }

    /* renamed from: m, reason: collision with other method in class */
    public static FocusRequester m106m(GapComposer gapComposer) {
        FocusRequester focusRequester = new FocusRequester();
        gapComposer.updateRememberedValue(focusRequester);
        return focusRequester;
    }

    public static ClassCastException m(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static float m(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }

    public static String m(int i, int i2, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static String m(long j, String str) {
        return str + j;
    }

    public static String m(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m107m(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder m(String str, int i, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static StringBuilder m108m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static KotlinNothingValueException m(Object obj) {
        SafeTrace.throwOnFailure(obj);
        return new KotlinNothingValueException();
    }

    public static KotlinNothingValueException m(String str) {
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck(str);
        return new KotlinNothingValueException();
    }

    public static NoWhenBranchMatchedException m(GapComposer gapComposer, int i, boolean z) {
        gapComposer.startReplaceGroup(i);
        gapComposer.end(z);
        return new NoWhenBranchMatchedException();
    }

    public static void m(int i, GapComposer gapComposer, ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1, GapComposer gapComposer2, OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1) {
        Updater.m576setimpl(gapComposer, Integer.valueOf(i), composeUiNode$Companion$SetModifier$1);
        Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
    }

    public static void m(int i, ComposableLambdaImpl composableLambdaImpl, GapComposer gapComposer, boolean z) {
        composableLambdaImpl.invoke(gapComposer, Integer.valueOf(i));
        gapComposer.end(z);
    }

    public static void m(int i, Function2 function2, GapComposer gapComposer, boolean z, boolean z2) {
        function2.invoke(gapComposer, Integer.valueOf(i));
        gapComposer.end(z);
        gapComposer.end(z2);
    }

    public static void m(GrpcMethod grpcMethod, long j) {
        grpcMethod.getCanvas().restore();
        grpcMethod.m4000setSizeuvyYCjk(j);
    }

    public static void m(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(list);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static int m(float f, float f2, float f3) {
        return Math.round((f / f2) * f3);
    }
}
