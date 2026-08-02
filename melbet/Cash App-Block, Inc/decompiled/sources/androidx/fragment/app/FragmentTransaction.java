package androidx.fragment.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public abstract class FragmentTransaction {
    public boolean mAddToBackStack;
    public boolean mAllowAddToBackStack;
    public int mBreadCrumbShortTitleRes;
    public CharSequence mBreadCrumbShortTitleText;
    public int mBreadCrumbTitleRes;
    public CharSequence mBreadCrumbTitleText;
    public final ClassLoader mClassLoader;
    public ArrayList mCommitRunnables;
    public int mEnterAnim;
    public int mExitAnim;
    public final FragmentFactory mFragmentFactory;
    public String mName;
    public final ArrayList mOps;
    public int mPopEnterAnim;
    public int mPopExitAnim;
    public boolean mReorderingAllowed;
    public ArrayList mSharedElementSourceNames;
    public ArrayList mSharedElementTargetNames;
    public int mTransition;

    @Deprecated
    public FragmentTransaction() {
        this.mOps = new ArrayList();
        this.mAllowAddToBackStack = true;
        this.mReorderingAllowed = false;
        this.mFragmentFactory = null;
        this.mClassLoader = null;
    }

    public final void addOp(Op op) {
        this.mOps.add(op);
        op.mEnterAnim = this.mEnterAnim;
        op.mExitAnim = this.mExitAnim;
        op.mPopEnterAnim = this.mPopEnterAnim;
        op.mPopExitAnim = this.mPopExitAnim;
    }

    public final void addToBackStack(String str) {
        if (!this.mAllowAddToBackStack) {
            a$$ExternalSyntheticBUOutline0.m$1("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.mAddToBackStack = true;
            this.mName = str;
        }
    }

    public abstract int commit();

    public void doAddOp(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.onFragmentReuse(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            f$$ExternalSyntheticLambda0.m("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.");
            return;
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline2.m(sb, fragment.mTag, " now ", str));
                return;
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                DifferentialMotionFlingController$$ExternalSyntheticLambda0.m(fragment, " with tag ", str, " to container view with no id", "Can't add fragment ");
                return;
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline2.m(fragment.mFragmentId, i, " now ", sb2));
                return;
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        addOp(new Op(fragment, i2));
    }

    public final void replace(int i, String str, Fragment fragment) {
        if (i != 0) {
            doAddOp(i, fragment, str, 2);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Must use non-zero containerViewId");
        }
    }

    public FragmentTransaction(FragmentFactory fragmentFactory, ClassLoader classLoader) {
        this.mOps = new ArrayList();
        this.mAllowAddToBackStack = true;
        this.mReorderingAllowed = false;
        this.mFragmentFactory = fragmentFactory;
        this.mClassLoader = classLoader;
    }

    /* loaded from: classes3.dex */
    public final class Op {
        public int mCmd;
        public Lifecycle.State mCurrentMaxState;
        public int mEnterAnim;
        public int mExitAnim;
        public Fragment mFragment;
        public boolean mFromExpandedOp;
        public Lifecycle.State mOldMaxState;
        public int mPopEnterAnim;
        public int mPopExitAnim;

        public Op(Op op) {
            this.mCmd = op.mCmd;
            this.mFragment = op.mFragment;
            this.mFromExpandedOp = op.mFromExpandedOp;
            this.mEnterAnim = op.mEnterAnim;
            this.mExitAnim = op.mExitAnim;
            this.mPopEnterAnim = op.mPopEnterAnim;
            this.mPopExitAnim = op.mPopExitAnim;
            this.mOldMaxState = op.mOldMaxState;
            this.mCurrentMaxState = op.mCurrentMaxState;
        }

        public Op(int i, Fragment fragment, int i2) {
            this.mCmd = i;
            this.mFragment = fragment;
            this.mFromExpandedOp = true;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.mOldMaxState = state;
            this.mCurrentMaxState = state;
        }

        public Op(Fragment fragment, Lifecycle.State state) {
            this.mCmd = 10;
            this.mFragment = fragment;
            this.mFromExpandedOp = false;
            this.mOldMaxState = fragment.mMaxState;
            this.mCurrentMaxState = state;
        }

        public Op(Fragment fragment, int i) {
            this.mCmd = i;
            this.mFragment = fragment;
            this.mFromExpandedOp = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.mOldMaxState = state;
            this.mCurrentMaxState = state;
        }
    }
}
