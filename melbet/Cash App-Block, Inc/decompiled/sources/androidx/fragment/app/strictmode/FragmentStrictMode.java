package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyIterator;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class FragmentStrictMode {
    public static final Policy defaultPolicy = Policy.LAX;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Flag {
        public static final /* synthetic */ Flag[] $VALUES;
        public static final Flag DETECT_FRAGMENT_REUSE;
        public static final Flag DETECT_FRAGMENT_TAG_USAGE;
        public static final Flag DETECT_RETAIN_INSTANCE_USAGE;
        public static final Flag DETECT_SET_USER_VISIBLE_HINT;
        public static final Flag DETECT_TARGET_FRAGMENT_USAGE;
        public static final Flag DETECT_WRONG_FRAGMENT_CONTAINER;
        public static final Flag DETECT_WRONG_NESTED_HIERARCHY;
        public static final Flag PENALTY_DEATH;
        public static final Flag PENALTY_LOG;

        static {
            Flag flag = new Flag("PENALTY_LOG", 0);
            PENALTY_LOG = flag;
            Flag flag2 = new Flag("PENALTY_DEATH", 1);
            PENALTY_DEATH = flag2;
            Flag flag3 = new Flag("DETECT_FRAGMENT_REUSE", 2);
            DETECT_FRAGMENT_REUSE = flag3;
            Flag flag4 = new Flag("DETECT_FRAGMENT_TAG_USAGE", 3);
            DETECT_FRAGMENT_TAG_USAGE = flag4;
            Flag flag5 = new Flag("DETECT_WRONG_NESTED_HIERARCHY", 4);
            DETECT_WRONG_NESTED_HIERARCHY = flag5;
            Flag flag6 = new Flag("DETECT_RETAIN_INSTANCE_USAGE", 5);
            DETECT_RETAIN_INSTANCE_USAGE = flag6;
            Flag flag7 = new Flag("DETECT_SET_USER_VISIBLE_HINT", 6);
            DETECT_SET_USER_VISIBLE_HINT = flag7;
            Flag flag8 = new Flag("DETECT_TARGET_FRAGMENT_USAGE", 7);
            DETECT_TARGET_FRAGMENT_USAGE = flag8;
            Flag flag9 = new Flag("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
            DETECT_WRONG_FRAGMENT_CONTAINER = flag9;
            $VALUES = new Flag[]{flag, flag2, flag3, flag4, flag5, flag6, flag7, flag8, flag9};
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) $VALUES.clone();
        }
    }

    public final class Policy {
        public static final Policy LAX;
        public final Set flags;
        public final LinkedHashMap mAllowedViolations;

        static {
            EmptySet emptySet = EmptySet.INSTANCE;
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            LAX = new Policy(emptySet, emptyMap);
        }

        public Policy(EmptySet emptySet, EmptyMap emptyMap) {
            emptySet.getClass();
            emptyMap.getClass();
            this.flags = emptySet;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            EmptySet.INSTANCE.getClass();
            EmptyIterator.INSTANCE.getClass();
            this.mAllowedViolations = linkedHashMap;
        }
    }

    public static Policy getNearestPolicy(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager().getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return defaultPolicy;
    }

    public static void handlePolicyViolation(Policy policy, Violation violation) {
        Fragment fragment = violation.fragment;
        String name = fragment.getClass().getName();
        Set set = policy.flags;
        if (set.contains(Flag.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), violation);
        }
        if (set.contains(Flag.PENALTY_DEATH)) {
            DispatchQueue$$ExternalSyntheticLambda0 dispatchQueue$$ExternalSyntheticLambda0 = new DispatchQueue$$ExternalSyntheticLambda0(10, name, violation);
            if (!fragment.isAdded()) {
                dispatchQueue$$ExternalSyntheticLambda0.run();
                throw null;
            }
            Handler handler = fragment.getParentFragmentManager().mHost.handler;
            if (Intrinsics.areEqual(handler.getLooper(), Looper.myLooper())) {
                dispatchQueue$$ExternalSyntheticLambda0.run();
                throw null;
            }
            handler.post(dispatchQueue$$ExternalSyntheticLambda0);
        }
    }

    public static void logIfDebuggingEnabled(Violation violation) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.fragment.getClass().getName()), violation);
        }
    }

    public static final void onFragmentReuse(Fragment fragment, String str) {
        fragment.getClass();
        str.getClass();
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        logIfDebuggingEnabled(fragmentReuseViolation);
        Policy nearestPolicy = getNearestPolicy(fragment);
        if (nearestPolicy.flags.contains(Flag.DETECT_FRAGMENT_REUSE) && shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), FragmentReuseViolation.class)) {
            handlePolicyViolation(nearestPolicy, fragmentReuseViolation);
        }
    }

    public static final void onFragmentTagUsage(Fragment fragment, ViewGroup viewGroup) {
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        logIfDebuggingEnabled(fragmentTagUsageViolation);
        Policy nearestPolicy = getNearestPolicy(fragment);
        if (nearestPolicy.flags.contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), FragmentTagUsageViolation.class)) {
            handlePolicyViolation(nearestPolicy, fragmentTagUsageViolation);
        }
    }

    public static final void onGetRetainInstanceUsage(Fragment fragment) {
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment, "Attempting to get retain instance for fragment " + fragment);
        logIfDebuggingEnabled(getRetainInstanceUsageViolation);
        Policy nearestPolicy = getNearestPolicy(fragment);
        if (nearestPolicy.flags.contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), GetRetainInstanceUsageViolation.class)) {
            handlePolicyViolation(nearestPolicy, getRetainInstanceUsageViolation);
        }
    }

    public static final void onGetTargetFragmentRequestCodeUsage(Fragment fragment) {
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment, "Attempting to get target request code from fragment " + fragment);
        logIfDebuggingEnabled(getTargetFragmentRequestCodeUsageViolation);
        Policy nearestPolicy = getNearestPolicy(fragment);
        if (nearestPolicy.flags.contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            handlePolicyViolation(nearestPolicy, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    public static final void onGetTargetFragmentUsage(Fragment fragment) {
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment, "Attempting to get target fragment from fragment " + fragment);
        logIfDebuggingEnabled(getTargetFragmentUsageViolation);
        Policy nearestPolicy = getNearestPolicy(fragment);
        if (nearestPolicy.flags.contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), GetTargetFragmentUsageViolation.class)) {
            handlePolicyViolation(nearestPolicy, getTargetFragmentUsageViolation);
        }
    }

    public static final void onSetRetainInstanceUsage(Fragment fragment) {
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment, "Attempting to set retain instance for fragment " + fragment);
        logIfDebuggingEnabled(setRetainInstanceUsageViolation);
        Policy nearestPolicy = getNearestPolicy(fragment);
        if (nearestPolicy.flags.contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), SetRetainInstanceUsageViolation.class)) {
            handlePolicyViolation(nearestPolicy, setRetainInstanceUsageViolation);
        }
    }

    public static final void onSetTargetFragmentUsage(Fragment fragment, Fragment fragment2, int i) {
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i + " for fragment " + fragment);
        logIfDebuggingEnabled(setTargetFragmentUsageViolation);
        Policy nearestPolicy = getNearestPolicy(fragment);
        if (nearestPolicy.flags.contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), SetTargetFragmentUsageViolation.class)) {
            handlePolicyViolation(nearestPolicy, setTargetFragmentUsageViolation);
        }
    }

    public static final void onSetUserVisibleHint(Fragment fragment, boolean z) {
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, "Attempting to set user visible hint to " + z + " for fragment " + fragment);
        logIfDebuggingEnabled(setUserVisibleHintViolation);
        Policy nearestPolicy = getNearestPolicy(fragment);
        if (nearestPolicy.flags.contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), SetUserVisibleHintViolation.class)) {
            handlePolicyViolation(nearestPolicy, setUserVisibleHintViolation);
        }
    }

    public static boolean shouldHandlePolicyViolation(Policy policy, Class cls, Class cls2) {
        Set set = (Set) policy.mAllowedViolations.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), Violation.class) || !CollectionsKt.contains(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
