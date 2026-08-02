package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class TestTagKt {
    public static final Class[] AcceptableClasses = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean access$containsDescendant(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final boolean canBeSavedToBundle(Object obj) {
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() == NeverEqualPolicy.INSTANCE || snapshotMutableState.getPolicy() == NeverEqualPolicy.INSTANCE$3 || snapshotMutableState.getPolicy() == NeverEqualPolicy.INSTANCE$1) {
                Object value = snapshotMutableState.getValue();
                if (value == null) {
                    return true;
                }
                return canBeSavedToBundle(value);
            }
        } else if (!(obj instanceof Function) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (AcceptableClasses[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: dot-p89u6pk, reason: not valid java name */
    public static final float m941dotp89u6pk(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final int findDepthToTag(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object parentOrViewTreeDisjointParent = BundleKt.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return i3;
    }

    public static final View findViewTreeComposeViewRoot(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = Math.min(findDepthToTag(view, R.id.view_tree_lifecycle_owner), findDepthToTag(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (getComposeViewContext(view) == null) {
                i++;
                Object parentOrViewTreeDisjointParent = BundleKt.getParentOrViewTreeDisjointParent(view);
                View view4 = view2;
                view2 = view;
                view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final ComposeViewContext getComposeViewContext(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (ComposeViewContext) weakReference.get();
        }
        return null;
    }

    public static boolean getIsShowingLayoutBounds() {
        try {
            if (AndroidComposeView.systemPropertiesClass == null) {
                AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
            }
            if (AndroidComposeView.getBooleanMethod == null) {
                Class cls = AndroidComposeView.systemPropertiesClass;
                AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = AndroidComposeView.getBooleanMethod;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return Intrinsics.areEqual(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: invertTo-JiSxe2E, reason: not valid java name */
    public static final boolean m942invertToJiSxe2E(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != RecyclerView.DECELERATION_RATE) {
            float f30 = 1.0f / f29;
            fArr2[0] = Recorder$$ExternalSyntheticOutline2.m$1(f8, f26, (f6 * f28) - (f7 * f27), f30);
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = Recorder$$ExternalSyntheticOutline2.m$1(f16, f20, (f14 * f22) - (f15 * f21), f30);
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = Recorder$$ExternalSyntheticOutline2.m$1(f4, f24, (f28 * f) - (f3 * f25), f30);
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = Recorder$$ExternalSyntheticOutline2.m$1(f12, f18, (f9 * f22) - (f11 * f19), f30);
            fArr2[8] = Recorder$$ExternalSyntheticOutline2.m$1(f8, f23, (f5 * f27) - (f6 * f25), f30);
            fArr2[9] = (((f2 * f25) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = Recorder$$ExternalSyntheticOutline2.m$1(f16, f17, (f13 * f21) - (f14 * f19), f30);
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = Recorder$$ExternalSyntheticOutline2.m$1(f3, f23, (f * f26) - (f2 * f24), f30);
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = Recorder$$ExternalSyntheticOutline2.m$1(f11, f17, (f9 * f20) - (f10 * f18), f30);
        }
        return !(f29 == RecyclerView.DECELERATION_RATE);
    }

    public static final Modifier testTag(Modifier modifier, String str) {
        return modifier.then(new TestTagElement(str));
    }
}
