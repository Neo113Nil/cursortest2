package androidx.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.widget.TextViewOnReceiveContentListener;
import com.google.android.gms.internal.measurement.zzabh;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes.dex */
public abstract class ViewCompat {
    public static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final ViewCompat$$ExternalSyntheticLambda0 NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = new ViewCompat$$ExternalSyntheticLambda0();
    public static final AccessibilityPaneVisibilityManager sAccessibilityPaneVisibilityManager = new AccessibilityPaneVisibilityManager();
    public static WeakHashMap sViewPropertyAnimatorMap;

    /* renamed from: androidx.core.view.ViewCompat$2, reason: invalid class name */
    public final class AnonymousClass2 extends MapBuilder.Itr {
        @Override // kotlin.collections.builders.MapBuilder.Itr
        public final Object frameworkGet(View view) {
            return Api28Impl.getAccessibilityPaneTitle(view);
        }

        @Override // kotlin.collections.builders.MapBuilder.Itr
        public final void frameworkSet(View view, Object obj) {
            Api28Impl.setAccessibilityPaneTitle(view, (CharSequence) obj);
        }

        @Override // kotlin.collections.builders.MapBuilder.Itr
        public final boolean shouldUpdate(Object obj, Object obj2) {
            return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass3 extends MapBuilder.Itr {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i) {
            super(R.id.tag_state_description, CharSequence.class, 64, 30);
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
                    break;
                default:
                    break;
            }
        }

        @Override // kotlin.collections.builders.MapBuilder.Itr
        public final Object frameworkGet(View view) {
            switch (this.$r8$classId) {
                case 0:
                    return Api30Impl.getStateDescription(view);
                default:
                    return Boolean.valueOf(Api28Impl.isAccessibilityHeading(view));
            }
        }

        @Override // kotlin.collections.builders.MapBuilder.Itr
        public final void frameworkSet(View view, Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    Api30Impl.setStateDescription(view, (CharSequence) obj);
                    break;
                default:
                    Api28Impl.setAccessibilityHeading(view, ((Boolean) obj).booleanValue());
                    break;
            }
        }

        @Override // kotlin.collections.builders.MapBuilder.Itr
        public final boolean shouldUpdate(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                default:
                    Boolean bool = (Boolean) obj;
                    Boolean bool2 = (Boolean) obj2;
                    return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            }
        }
    }

    public final class AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap mPanesToVisible = new WeakHashMap();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes3.dex */
    public abstract class Api20Impl {
        public static WindowInsets dispatchApplyWindowInsets(View view, WindowInsets windowInsets) {
            int i = ViewGroupCompat.$r8$clinit;
            return view.dispatchApplyWindowInsets(windowInsets);
        }
    }

    public abstract class Api21Impl {
        public static void callCompatInsetAnimationCallback(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static WindowInsetsCompat computeSystemWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                return WindowInsetsCompat.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        public static void setOnApplyWindowInsetsListener(final View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener != null ? new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.Api21Impl.1
                public WindowInsetsCompat mLastInsets = null;

                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view2);
                    int i = Build.VERSION.SDK_INT;
                    OnApplyWindowInsetsListener onApplyWindowInsetsListener3 = onApplyWindowInsetsListener;
                    if (i < 30) {
                        Api21Impl.callCompatInsetAnimationCallback(windowInsets, view);
                        if (windowInsetsCompat.equals(this.mLastInsets)) {
                            return onApplyWindowInsetsListener3.onApplyWindowInsets(view2, windowInsetsCompat).toWindowInsets();
                        }
                    }
                    this.mLastInsets = windowInsetsCompat;
                    WindowInsetsCompat onApplyWindowInsets = onApplyWindowInsetsListener3.onApplyWindowInsets(view2, windowInsetsCompat);
                    if (i >= 30) {
                        return onApplyWindowInsets.toWindowInsets();
                    }
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    view2.requestApplyInsets();
                    return onApplyWindowInsets.toWindowInsets();
                }
            } : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener2);
            }
            if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
                return;
            }
            if (onApplyWindowInsetsListener2 != null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener2);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            }
        }
    }

    public abstract class Api23Impl {
        public static WindowInsetsCompat getRootWindowInsets(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets, null);
            WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
            impl.setRootWindowInsets(windowInsetsCompat);
            View rootView = view.getRootView();
            impl.copyRootViewBounds(rootView);
            impl.initDisplayShape(rootView);
            impl.initTypeBoundingRectsMaps();
            return windowInsetsCompat;
        }
    }

    /* loaded from: classes3.dex */
    public abstract class Api24Impl {
        public static void setPointerIcon(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* loaded from: classes3.dex */
    public abstract class Api26Impl {
        public static int getImportantForAutofill(View view) {
            return view.getImportantForAutofill();
        }

        public static void setAutofillHints(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void setImportantForAutofill(View view, int i) {
            view.setImportantForAutofill(i);
        }
    }

    public abstract class Api28Impl {
        public static CharSequence getAccessibilityPaneTitle(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean isAccessibilityHeading(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean isScreenReaderFocusable(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void setAccessibilityHeading(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void setAccessibilityPaneTitle(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }
    }

    public abstract class Api29Impl {
        public static View.AccessibilityDelegate getAccessibilityDelegate(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void saveAttributeDataForStyleable(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* loaded from: classes3.dex */
    public abstract class Api30Impl {
        public static WindowInsets dispatchApplyWindowInsets(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static CharSequence getStateDescription(View view) {
            return view.getStateDescription();
        }

        public static WindowInsetsControllerCompat getWindowInsetsController(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new WindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }

        public static void setStateDescription(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes3.dex */
    public abstract class Api31Impl {
        public static String[] getReceiveContentMimeTypes(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static ContentInfoCompat performReceiveContent(View view, ContentInfoCompat contentInfoCompat) {
            ContentInfo wrapped = contentInfoCompat.mCompat.getWrapped();
            Objects.requireNonNull(wrapped);
            ContentInfo performReceiveContent = view.performReceiveContent(wrapped);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == wrapped ? contentInfoCompat : new ContentInfoCompat(new ContentInfoCompat.Compat31Impl(performReceiveContent));
        }
    }

    public static int addAccessibilityAction(View view, String str, AccessibilityViewCommand accessibilityViewCommand) {
        int i;
        ArrayList actionList = getActionList(view);
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                int i3 = -1;
                for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                    int i5 = ACCESSIBILITY_ACTIONS_RESOURCE_IDS[i4];
                    boolean z = true;
                    for (int i6 = 0; i6 < actionList.size(); i6++) {
                        z &= ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) actionList.get(i6)).getId() != i5;
                    }
                    if (z) {
                        i3 = i5;
                    }
                }
                i = i3;
            } else {
                if (TextUtils.equals(str, ((AccessibilityNodeInfo.AccessibilityAction) ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) actionList.get(i2)).mAction).getLabel())) {
                    i = ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) actionList.get(i2)).getId();
                    break;
                }
                i2++;
            }
        }
        if (i != -1) {
            AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, i, str, accessibilityViewCommand, null);
            ensureAccessibilityDelegateCompat(view);
            removeActionWithId(view, accessibilityActionCompat.getId());
            getActionList(view).add(accessibilityActionCompat);
            notifyViewAccessibilityStateChangedIfNeeded(view, 0);
        }
        return i;
    }

    public static void addOverlayView(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static ViewPropertyAnimatorCompat animate(View view) {
        if (sViewPropertyAnimatorMap == null) {
            sViewPropertyAnimatorMap = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) sViewPropertyAnimatorMap.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        sViewPropertyAnimatorMap.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    public static WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets dispatchApplyWindowInsets = Build.VERSION.SDK_INT >= 30 ? Api30Impl.dispatchApplyWindowInsets(view, windowInsets) : Api20Impl.dispatchApplyWindowInsets(view, windowInsets);
            if (!dispatchApplyWindowInsets.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(dispatchApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void ensureAccessibilityDelegateCompat(View view) {
        View.AccessibilityDelegate accessibilityDelegate = Api29Impl.getAccessibilityDelegate(view);
        AccessibilityDelegateCompat accessibilityDelegateCompat = accessibilityDelegate == null ? null : accessibilityDelegate instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter ? ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) accessibilityDelegate).mCompat : new AccessibilityDelegateCompat(accessibilityDelegate);
        if (accessibilityDelegateCompat == null) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        setAccessibilityDelegate(view, accessibilityDelegateCompat);
    }

    public static ArrayList getActionList(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] getOnReceiveContentMimeTypes(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.getReceiveContentMimeTypes(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static WindowInsetsControllerCompat getWindowInsetsController(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getWindowInsetsController(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new WindowInsetsControllerCompat(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void notifyViewAccessibilityStateChangedIfNeeded(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = Api28Impl.getAccessibilityPaneTitle(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(Api28Impl.getAccessibilityPaneTitle(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(Api28Impl.getAccessibilityPaneTitle(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            if (!onApplyWindowInsets.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(onApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ContentInfoCompat performReceiveContent(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.performReceiveContent(view, contentInfoCompat);
        }
        TextViewOnReceiveContentListener textViewOnReceiveContentListener = (TextViewOnReceiveContentListener) view.getTag(R.id.tag_on_receive_content_listener);
        OnReceiveContentViewBehavior onReceiveContentViewBehavior = NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR;
        if (textViewOnReceiveContentListener == null) {
            if (view instanceof OnReceiveContentViewBehavior) {
                onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
            }
            return onReceiveContentViewBehavior.onReceiveContent(contentInfoCompat);
        }
        ContentInfoCompat onReceiveContent = TextViewOnReceiveContentListener.onReceiveContent(view, contentInfoCompat);
        if (onReceiveContent == null) {
            return null;
        }
        if (view instanceof OnReceiveContentViewBehavior) {
            onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
        }
        return onReceiveContentViewBehavior.onReceiveContent(onReceiveContent);
    }

    public static void removeActionWithId(View view, int i) {
        ArrayList actionList = getActionList(view);
        for (int i2 = 0; i2 < actionList.size(); i2++) {
            if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) actionList.get(i2)).getId() == i) {
                actionList.remove(i2);
                return;
            }
        }
    }

    public static void replaceAccessibilityAction(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, String str, AccessibilityViewCommand accessibilityViewCommand) {
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2 = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, accessibilityActionCompat.mId, str, accessibilityViewCommand, accessibilityActionCompat.mViewCommandArgumentClass);
        ensureAccessibilityDelegateCompat(view);
        removeActionWithId(view, accessibilityActionCompat2.getId());
        getActionList(view).add(accessibilityActionCompat2);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    public static void setAccessibilityDelegate(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (Api29Impl.getAccessibilityDelegate(view) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.mBridge);
    }

    public static void setAccessibilityPaneTitle(View view, CharSequence charSequence) {
        new AnonymousClass2(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).set(view, charSequence);
        AccessibilityPaneVisibilityManager accessibilityPaneVisibilityManager = sAccessibilityPaneVisibilityManager;
        if (charSequence == null) {
            accessibilityPaneVisibilityManager.mPanesToVisible.remove(view);
            view.removeOnAttachStateChangeListener(accessibilityPaneVisibilityManager);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(accessibilityPaneVisibilityManager);
        } else {
            accessibilityPaneVisibilityManager.mPanesToVisible.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(accessibilityPaneVisibilityManager);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(accessibilityPaneVisibilityManager);
            }
        }
    }

    public static void setWindowInsetsAnimationCallback(View view, zzabh zzabhVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsAnimationCompat.Impl30.setCallback(view, zzabhVar);
        } else {
            WindowInsetsAnimationCompat.Impl21.setCallback(view, zzabhVar);
        }
    }
}
