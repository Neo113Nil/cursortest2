package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.FocusStrategy;
import androidx.media3.extractor.text.CueEncoder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.CoroutinesRoom;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {
    public static final Rect INVALID_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail);
    public static final CueEncoder NODE_ADAPTER = new CueEncoder(9);
    public static final CoroutinesRoom.Companion SPARSE_VALUES_ADAPTER = new CoroutinesRoom.Companion(9);
    public final Chip mHost;
    public final AccessibilityManager mManager;
    public MyNodeProvider mNodeProvider;
    public final Rect mTempScreenRect = new Rect();
    public final Rect mTempParentRect = new Rect();
    public final Rect mTempVisibleRect = new Rect();
    public final int[] mTempGlobalRect = new int[2];
    public int mAccessibilityFocusedVirtualViewId = PKIFailureInfo.systemUnavail;
    public int mKeyboardFocusedVirtualViewId = PKIFailureInfo.systemUnavail;
    public int mHoveredVirtualViewId = PKIFailureInfo.systemUnavail;

    public final class MyNodeProvider extends Extras.Key {
        public MyNodeProvider() {
            super(14);
        }

        @Override // coil3.Extras.Key
        public final AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
            return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(ExploreByTouchHelper.this.obtainAccessibilityNodeInfo(i).mInfo));
        }

        @Override // coil3.Extras.Key
        public final AccessibilityNodeInfoCompat findFocus(int i) {
            ExploreByTouchHelper exploreByTouchHelper = ExploreByTouchHelper.this;
            int i2 = i == 2 ? exploreByTouchHelper.mAccessibilityFocusedVirtualViewId : exploreByTouchHelper.mKeyboardFocusedVirtualViewId;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return createAccessibilityNodeInfo(i2);
        }

        @Override // coil3.Extras.Key
        public final boolean performAction(int i, int i2, Bundle bundle) {
            int i3;
            ExploreByTouchHelper exploreByTouchHelper = ExploreByTouchHelper.this;
            Chip chip = exploreByTouchHelper.mHost;
            if (i == -1) {
                return chip.performAccessibilityAction(i2, bundle);
            }
            if (i2 == 1) {
                return exploreByTouchHelper.requestKeyboardFocusForVirtualView(i);
            }
            if (i2 == 2) {
                return exploreByTouchHelper.clearKeyboardFocusForVirtualView(i);
            }
            boolean z = false;
            if (i2 == 64) {
                AccessibilityManager accessibilityManager = exploreByTouchHelper.mManager;
                if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = exploreByTouchHelper.mAccessibilityFocusedVirtualViewId) == i) {
                    return false;
                }
                if (i3 != Integer.MIN_VALUE) {
                    exploreByTouchHelper.mAccessibilityFocusedVirtualViewId = PKIFailureInfo.systemUnavail;
                    chip.invalidate();
                    exploreByTouchHelper.sendEventForVirtualView(i3, 65536);
                }
                exploreByTouchHelper.mAccessibilityFocusedVirtualViewId = i;
                chip.invalidate();
                exploreByTouchHelper.sendEventForVirtualView(i, 32768);
                return true;
            }
            if (i2 == 128) {
                if (exploreByTouchHelper.mAccessibilityFocusedVirtualViewId != i) {
                    return false;
                }
                exploreByTouchHelper.mAccessibilityFocusedVirtualViewId = PKIFailureInfo.systemUnavail;
                chip.invalidate();
                exploreByTouchHelper.sendEventForVirtualView(i, 65536);
                return true;
            }
            Chip chip2 = Chip.this;
            if (i2 == 16) {
                if (i == 0) {
                    return chip2.performClick();
                }
                if (i == 1) {
                    chip2.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip2.onCloseIconClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip2);
                        z = true;
                    }
                    if (chip2.touchHelperEnabled) {
                        chip2.touchHelper.sendEventForVirtualView(1, 1);
                    }
                }
            }
            return z;
        }
    }

    public ExploreByTouchHelper(Chip chip) {
        this.mHost = chip;
        this.mManager = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = PKIFailureInfo.systemUnavail;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final AccessibilityNodeInfoCompat createNodeForChild(int i) {
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        AccessibilityNodeInfo accessibilityNodeInfo = obtain.mInfo;
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = INVALID_BOUNDS;
        accessibilityNodeInfo.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.mHost;
        obtain.setParent(chip);
        onPopulateNodeForVirtualView(i, obtain);
        if (obtain.getText() == null && accessibilityNodeInfo.getContentDescription() == null) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.mTempParentRect;
        accessibilityNodeInfo.getBoundsInParent(rect2);
        Rect rect3 = this.mTempScreenRect;
        obtain.getBoundsInScreen(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfo.getActions();
        if ((actions & 64) != 0) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        obtain.setSource(chip, i);
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            obtain.setAccessibilityFocused(true);
            obtain.addAction(128);
        } else {
            obtain.setAccessibilityFocused(false);
            obtain.addAction(64);
        }
        boolean z = this.mKeyboardFocusedVirtualViewId == i;
        if (z) {
            obtain.addAction(2);
        } else if (accessibilityNodeInfo.isFocusable()) {
            obtain.addAction(1);
        }
        obtain.setFocused(z);
        int[] iArr = this.mTempGlobalRect;
        chip.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            accessibilityNodeInfo.setBoundsInParent(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (obtain.mParentVirtualDescendantId != -1) {
                AccessibilityNodeInfoCompat obtain2 = AccessibilityNodeInfoCompat.obtain();
                AccessibilityNodeInfo accessibilityNodeInfo2 = obtain2.mInfo;
                Rect rect5 = new Rect();
                for (int i2 = obtain.mParentVirtualDescendantId; i2 != -1; i2 = obtain2.mParentVirtualDescendantId) {
                    obtain2.setParent(chip, -1);
                    accessibilityNodeInfo2.setBoundsInParent(rect);
                    onPopulateNodeForVirtualView(i2, obtain2);
                    accessibilityNodeInfo2.getBoundsInParent(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            chip.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            obtain.setBoundsInScreen(rect4);
            obtain.getBoundsInScreen(rect3);
        }
        Rect rect6 = this.mTempVisibleRect;
        if (chip.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect6)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= RecyclerView.DECELERATION_RATE || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            obtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return obtain;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final Extras.Key getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new MyNodeProvider();
        }
        return this.mNodeProvider;
    }

    public abstract void getVisibleVirtualViews(ArrayList arrayList);

    public final boolean moveFocus(int i, Rect rect) {
        int i2;
        Object obj;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat((Object) null);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            sparseArrayCompat.put(((Integer) arrayList.get(i3)).intValue(), createNodeForChild(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.mKeyboardFocusedVirtualViewId;
        int i5 = PKIFailureInfo.systemUnavail;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = i4 == Integer.MIN_VALUE ? null : (AccessibilityNodeInfoCompat) SieveCacheKt.commonGet(sparseArrayCompat, i4);
        CueEncoder cueEncoder = NODE_ADAPTER;
        CoroutinesRoom.Companion companion = SPARSE_VALUES_ADAPTER;
        Chip chip = this.mHost;
        int i6 = -1;
        if (i == 1 || i == 2) {
            boolean z = chip.getLayoutDirection() == 1;
            companion.getClass();
            int size = sparseArrayCompat.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                arrayList2.add((AccessibilityNodeInfoCompat) sparseArrayCompat.valueAt(i7));
            }
            Collections.sort(arrayList2, new FocusStrategy.SequentialComparator(z, cueEncoder));
            if (i == 1) {
                i2 = 0;
                int size2 = arrayList2.size();
                if (accessibilityNodeInfoCompat2 != null) {
                    size2 = arrayList2.indexOf(accessibilityNodeInfoCompat2);
                }
                int i8 = size2 - 1;
                obj = i8 >= 0 ? arrayList2.get(i8) : null;
            } else {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$3("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size3 = arrayList2.size();
                int lastIndexOf = (accessibilityNodeInfoCompat2 == null ? -1 : arrayList2.lastIndexOf(accessibilityNodeInfoCompat2)) + 1;
                i2 = 0;
                obj = lastIndexOf < size3 ? arrayList2.get(lastIndexOf) : null;
            }
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                a$$ExternalSyntheticBUOutline0.m$3("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i9 = this.mKeyboardFocusedVirtualViewId;
            if (i9 != Integer.MIN_VALUE) {
                obtainAccessibilityNodeInfo(i9).getBoundsInScreen(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        a$$ExternalSyntheticBUOutline0.m$3("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    a$$ExternalSyntheticBUOutline0.m$3("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            companion.getClass();
            int size4 = sparseArrayCompat.size();
            Rect rect4 = new Rect();
            accessibilityNodeInfoCompat = null;
            for (int i10 = 0; i10 < size4; i10++) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3 = (AccessibilityNodeInfoCompat) sparseArrayCompat.valueAt(i10);
                if (accessibilityNodeInfoCompat3 != accessibilityNodeInfoCompat2) {
                    cueEncoder.getClass();
                    accessibilityNodeInfoCompat3.getBoundsInScreen(rect4);
                    if (FocusStrategy.isCandidate(i, rect2, rect4)) {
                        if (FocusStrategy.isCandidate(i, rect2, rect3) && !FocusStrategy.beamBeats(i, rect2, rect4, rect3)) {
                            if (!FocusStrategy.beamBeats(i, rect2, rect3, rect4)) {
                                int majorAxisDistance = FocusStrategy.majorAxisDistance(i, rect2, rect4);
                                int minorAxisDistance = FocusStrategy.minorAxisDistance(i, rect2, rect4);
                                int i11 = (minorAxisDistance * minorAxisDistance) + (majorAxisDistance * 13 * majorAxisDistance);
                                int majorAxisDistance2 = FocusStrategy.majorAxisDistance(i, rect2, rect3);
                                int minorAxisDistance2 = FocusStrategy.minorAxisDistance(i, rect2, rect3);
                                if (i11 >= (minorAxisDistance2 * minorAxisDistance2) + (majorAxisDistance2 * 13 * majorAxisDistance2)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        accessibilityNodeInfoCompat = accessibilityNodeInfoCompat3;
                    }
                }
            }
            i2 = 0;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat4 = accessibilityNodeInfoCompat;
        if (accessibilityNodeInfoCompat4 != null) {
            if (sparseArrayCompat.garbage) {
                SieveCacheKt.access$gc(sparseArrayCompat);
            }
            int i12 = sparseArrayCompat.size;
            int i13 = i2;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                if (sparseArrayCompat.values[i13] == accessibilityNodeInfoCompat4) {
                    i6 = i13;
                    break;
                }
                i13++;
            }
            i5 = sparseArrayCompat.keyAt(i6);
        }
        return requestKeyboardFocusForVirtualView(i5);
    }

    public final AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int i) {
        if (i != -1) {
            return createNodeForChild(i);
        }
        Chip chip = this.mHost;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(obtain);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            accessibilityNodeInfoCompat.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return accessibilityNodeInfoCompat;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
        Chip chip = Chip.this;
        ChipDrawable chipDrawable = chip.chipDrawable;
        accessibilityNodeInfoCompat.setCheckable(chipDrawable != null && chipDrawable.checkable);
        accessibilityNodeInfoCompat.setClickable(chip.isClickable());
        accessibilityNodeInfoCompat.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfoCompat.setText(chip.getText());
    }

    public abstract void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    public abstract void onVirtualViewKeyboardFocusChanged(int i, boolean z);

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        Chip chip = this.mHost;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.mKeyboardFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final void sendEventForVirtualView(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = (view = this.mHost).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
            obtain.getText().add(obtainAccessibilityNodeInfo.getText());
            AccessibilityNodeInfo accessibilityNodeInfo = obtainAccessibilityNodeInfo.mInfo;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                return;
            } else {
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                obtain.setSource(view, i);
                obtain.setPackageName(view.getContext().getPackageName());
            }
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
