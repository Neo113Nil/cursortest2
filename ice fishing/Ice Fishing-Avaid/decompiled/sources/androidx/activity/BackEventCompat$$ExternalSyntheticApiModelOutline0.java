package androidx.activity;

import android.app.RemoteAction;
import android.graphics.RenderNode;
import android.media.ApplicationMediaCapabilities;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.window.BackEvent;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class BackEventCompat$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ RemoteAction m(Object obj) {
        return (RemoteAction) obj;
    }

    public static /* synthetic */ RenderNode m(String str) {
        return new RenderNode(str);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ ApplicationMediaCapabilities.Builder m5m() {
        return new ApplicationMediaCapabilities.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimationControlListener m6m(Object obj) {
        return (WindowInsetsAnimationControlListener) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimationController m7m(Object obj) {
        return (WindowInsetsAnimationController) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DeleteGesture m8m(Object obj) {
        return (DeleteGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DeleteRangeGesture m9m(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ EditorBoundsInfo.Builder m10m() {
        return new EditorBoundsInfo.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m11m(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SelectRangeGesture m12m(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* synthetic */ BackEvent m(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public static /* synthetic */ BackEvent m(float f, float f2, float f3, int i, long j) {
        return new BackEvent(f, f2, f3, i, j);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m15m() {
        return SelectGesture.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m20m() {
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m27m(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return DeleteRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean m$2(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    public static /* bridge */ /* synthetic */ Class m$3() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class m$4() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class m$5() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class m$6() {
        return RemoveSpaceGesture.class;
    }
}
