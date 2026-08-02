package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.window.Api33Impl;
import androidx.core.os.BuildCompat;
import androidx.core.os.BuildCompat$$ExternalSyntheticBackportWithForwarding1;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.navigationevent.NavigationEvent_androidKt;
import com.squareup.cash.localization.LanguageManagerKt;
import java.util.ArrayList;
import java.util.List;
import kotlinx.collections.immutable.implementations.immutableList.ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class AccessibilityNodeInfoCompat {
    public final AccessibilityNodeInfo mInfo;
    public int mParentVirtualDescendantId = -1;
    public int mVirtualDescendantId = -1;

    public abstract class Api36MinorImpl {
        public static AccessibilityNodeInfo.AccessibilityAction getActionSetExtendedSelection() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
        }
    }

    public AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.mInfo = accessibilityNodeInfo;
    }

    public static String getActionSymbolicName(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case PKIFailureInfo.certRevoked /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case PKIFailureInfo.unsupportedVersion /* 131072 */:
                return "ACTION_SET_SELECTION";
            case PKIFailureInfo.transactionIdInUse /* 262144 */:
                return "ACTION_EXPAND";
            case PKIFailureInfo.signerNotTrusted /* 524288 */:
                return "ACTION_COLLAPSE";
            case PKIFailureInfo.badSenderNonce /* 2097152 */:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i) {
                                            case R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] getClickableSpans(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static AccessibilityNodeInfoCompat obtain() {
        return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
    }

    public static AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    public final void addAction(AccessibilityActionCompat accessibilityActionCompat) {
        this.mInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.mAction);
    }

    public final void addChild(AndroidViewHolder androidViewHolder) {
        this.mInfo.addChild(androidViewHolder);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.mInfo;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.mInfo;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.mVirtualDescendantId == accessibilityNodeInfoCompat.mVirtualDescendantId && this.mParentVirtualDescendantId == accessibilityNodeInfoCompat.mParentVirtualDescendantId;
    }

    public final ArrayList extrasIntList(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final boolean getBooleanProperty(int i) {
        Bundle extras = this.mInfo.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final void getBoundsInScreen(Rect rect) {
        this.mInfo.getBoundsInScreen(rect);
    }

    public final Bundle getExtras() {
        return this.mInfo.getExtras();
    }

    public final int getMovementGranularities() {
        return this.mInfo.getMovementGranularities();
    }

    public final CharSequence getText() {
        boolean isEmpty = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (isEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList extrasIntList = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList extrasIntList2 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList extrasIntList3 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList extrasIntList4 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < extrasIntList.size(); i++) {
            spannableString.setSpan(new AccessibilityClickableSpanCompat(((Integer) extrasIntList4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) extrasIntList.get(i)).intValue(), ((Integer) extrasIntList2.get(i)).intValue(), ((Integer) extrasIntList3.get(i)).intValue());
        }
        return spannableString;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final boolean isClickable() {
        return this.mInfo.isClickable();
    }

    public final boolean isFocusable() {
        return this.mInfo.isFocusable();
    }

    public final boolean isFocused() {
        return this.mInfo.isFocused();
    }

    public final void setAccessibilityDataSensitive(boolean z) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i >= 34) {
            LanguageManagerKt.setAccessibilityDataSensitive(accessibilityNodeInfo, z);
            return;
        }
        Bundle extras = accessibilityNodeInfo.getExtras();
        if (extras != null) {
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65)) | (z ? 64 : 0));
        }
    }

    public final void setAccessibilityFocused(boolean z) {
        this.mInfo.setAccessibilityFocused(z);
    }

    public final void setAvailableExtraData(ArrayList arrayList) {
        this.mInfo.setAvailableExtraData(arrayList);
    }

    public final void setBoundsInScreen(Rect rect) {
        this.mInfo.setBoundsInScreen(rect);
    }

    public final void setCheckable(boolean z) {
        this.mInfo.setCheckable(z);
    }

    public final void setChecked(boolean z) {
        this.mInfo.setChecked(z);
    }

    public final void setClassName(CharSequence charSequence) {
        this.mInfo.setClassName(charSequence);
    }

    public final void setClickable(boolean z) {
        this.mInfo.setClickable(z);
    }

    public final void setCollectionInfo(Toolbar.AnonymousClass1 anonymousClass1) {
        this.mInfo.setCollectionInfo(anonymousClass1 == null ? null : (AccessibilityNodeInfo.CollectionInfo) anonymousClass1.this$0);
    }

    public final void setCollectionItemInfo(Recorder.AnonymousClass6 anonymousClass6) {
        this.mInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) anonymousClass6.this$0);
    }

    public final void setContentDescription(CharSequence charSequence) {
        this.mInfo.setContentDescription(charSequence);
    }

    public final void setContentInvalid() {
        this.mInfo.setContentInvalid(true);
    }

    public final void setDrawingOrder(int i) {
        this.mInfo.setDrawingOrder(i);
    }

    public final void setEditable(boolean z) {
        this.mInfo.setEditable(z);
    }

    public final void setEnabled(boolean z) {
        this.mInfo.setEnabled(z);
    }

    public final void setError(CharSequence charSequence) {
        this.mInfo.setError(charSequence);
    }

    public final void setFocusable(boolean z) {
        this.mInfo.setFocusable(z);
    }

    public final void setFocused(boolean z) {
        this.mInfo.setFocused(z);
    }

    public final void setHeading(boolean z) {
        this.mInfo.setHeading(z);
    }

    public final void setImportantForAccessibility(boolean z) {
        this.mInfo.setImportantForAccessibility(z);
    }

    public final void setLiveRegion(int i) {
        this.mInfo.setLiveRegion(i);
    }

    public final void setLongClickable(boolean z) {
        this.mInfo.setLongClickable(z);
    }

    public final void setMaxTextLength(int i) {
        this.mInfo.setMaxTextLength(i);
    }

    public final void setMovementGranularities(int i) {
        this.mInfo.setMovementGranularities(i);
    }

    public final void setPackageName(String str) {
        this.mInfo.setPackageName(str);
    }

    public final void setPaneTitle(CharSequence charSequence) {
        this.mInfo.setPaneTitle(charSequence);
    }

    public final void setParent(View view) {
        this.mParentVirtualDescendantId = -1;
        this.mInfo.setParent(view);
    }

    public final void setPassword(boolean z) {
        this.mInfo.setPassword(z);
    }

    public final void setRangeInfo(ObjectRef objectRef) {
        this.mInfo.setRangeInfo((AccessibilityNodeInfo.RangeInfo) objectRef.value);
    }

    public final void setRoleDescription(String str) {
        this.mInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", str);
    }

    public final void setScreenReaderFocusable(boolean z) {
        this.mInfo.setScreenReaderFocusable(z);
    }

    public final void setScrollable(boolean z) {
        this.mInfo.setScrollable(z);
    }

    public final void setSelected(boolean z) {
        this.mInfo.setSelected(z);
    }

    public final void setSource(View view, int i) {
        this.mVirtualDescendantId = i;
        this.mInfo.setSource(view, i);
    }

    public final void setStateDescription(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (i >= 30) {
            WindowCompat$Api35Impl.setStateDescription(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void setText(CharSequence charSequence) {
        this.mInfo.setText(charSequence);
    }

    public final void setTextEntryKey() {
        this.mInfo.setTextEntryKey(true);
    }

    public final void setTextSelection(int i, int i2) {
        this.mInfo.setTextSelection(i, i2);
    }

    public final void setTraversalAfter(View view) {
        this.mInfo.setTraversalAfter(view);
    }

    public final void setTraversalBefore(AndroidViewHolder androidViewHolder) {
        this.mInfo.setTraversalBefore(androidViewHolder);
    }

    public final void setViewIdResourceName(String str) {
        this.mInfo.setViewIdResourceName(str);
    }

    public final void setVisibleToUser(boolean z) {
        this.mInfo.setVisibleToUser(z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        accessibilityNodeInfo.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            LanguageManagerKt.getBoundsInWindow(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(getText());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i >= 30 ? WindowCompat$Api35Impl.getStateDescription(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; supplementalDescription: ");
        sb.append(i >= 36 ? NavigationEvent_androidKt.getSupplementalDescription(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        sb.append(accessibilityNodeInfo.getTooltipText());
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i >= 33 ? Api33Impl.getUniqueId(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        int checked = i >= 36 ? accessibilityNodeInfo.getChecked() : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb.append(checked == 1 ? "TRUE" : checked == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(i >= 36 ? NavigationEvent_androidKt.isFieldRequired(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; expandedState: ");
        int expandedState = i >= 36 ? NavigationEvent_androidKt.getExpandedState(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (expandedState == 0) {
            str = "UNDEFINED";
        } else if (expandedState == 1) {
            str = "COLLAPSED";
        } else if (expandedState != 2) {
            str = expandedState != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i >= 34 ? LanguageManagerKt.getContainerTitle(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(getBooleanProperty(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i >= 33 ? Api33Impl.isTextSelectable(accessibilityNodeInfo) : getBooleanProperty(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i >= 34 ? LanguageManagerKt.isAccessibilityDataSensitive(accessibilityNodeInfo) : getBooleanProperty(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new AccessibilityActionCompat(actionList.get(i2), 0, null, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) arrayList.get(i3);
            int id = accessibilityActionCompat.getId();
            Object obj = accessibilityActionCompat.mAction;
            String actionSymbolicName = getActionSymbolicName(id);
            if (actionSymbolicName.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                actionSymbolicName = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
            sb.append(actionSymbolicName);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final AccessibilityNodeInfo unwrap() {
        return this.mInfo;
    }

    public final void addChild(View view, int i) {
        this.mInfo.addChild(view, i);
    }

    public final void setTraversalAfter(View view, int i) {
        this.mInfo.setTraversalAfter(view, i);
    }

    public final void setTraversalBefore(View view, int i) {
        this.mInfo.setTraversalBefore(view, i);
    }

    public final void setParent(View view, int i) {
        this.mParentVirtualDescendantId = i;
        this.mInfo.setParent(view, i);
    }

    public final void addAction(int i) {
        this.mInfo.addAction(i);
    }

    /* loaded from: classes.dex */
    public final class AccessibilityActionCompat {
        public static final AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS;
        public static final AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS;
        public static final AccessibilityActionCompat ACTION_CLICK;
        public static final AccessibilityActionCompat ACTION_DISMISS;
        public static final AccessibilityActionCompat ACTION_EXPAND;
        public static final AccessibilityActionCompat ACTION_SCROLL_BACKWARD;
        public static final AccessibilityActionCompat ACTION_SCROLL_DOWN;
        public static final AccessibilityActionCompat ACTION_SCROLL_FORWARD;
        public static final AccessibilityActionCompat ACTION_SCROLL_IN_DIRECTION;
        public static final AccessibilityActionCompat ACTION_SCROLL_LEFT;
        public static final AccessibilityActionCompat ACTION_SCROLL_RIGHT;
        public static final AccessibilityActionCompat ACTION_SCROLL_TO_POSITION;
        public static final AccessibilityActionCompat ACTION_SCROLL_UP;
        public final Object mAction;
        public final AccessibilityViewCommand mCommand;
        public final int mId;
        public final Class mViewCommandArgumentClass;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new AccessibilityActionCompat(1, (String) null);
            new AccessibilityActionCompat(2, (String) null);
            new AccessibilityActionCompat(4, (String) null);
            new AccessibilityActionCompat(8, (String) null);
            ACTION_CLICK = new AccessibilityActionCompat(16, (String) null);
            new AccessibilityActionCompat(32, (String) null);
            ACTION_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(64, (String) null);
            ACTION_CLEAR_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(128, (String) null);
            new AccessibilityActionCompat(AccessibilityViewCommand.MoveAtGranularityArguments.class, 256);
            new AccessibilityActionCompat(AccessibilityViewCommand.MoveAtGranularityArguments.class, 512);
            new AccessibilityActionCompat(AccessibilityViewCommand.MoveHtmlArguments.class, 1024);
            new AccessibilityActionCompat(AccessibilityViewCommand.MoveHtmlArguments.class, 2048);
            ACTION_SCROLL_FORWARD = new AccessibilityActionCompat(4096, (String) null);
            ACTION_SCROLL_BACKWARD = new AccessibilityActionCompat(PKIFailureInfo.certRevoked, (String) null);
            new AccessibilityActionCompat(16384, (String) null);
            new AccessibilityActionCompat(32768, (String) null);
            new AccessibilityActionCompat(65536, (String) null);
            new AccessibilityActionCompat(AccessibilityViewCommand.SetSelectionArguments.class, PKIFailureInfo.unsupportedVersion);
            ACTION_EXPAND = new AccessibilityActionCompat(PKIFailureInfo.transactionIdInUse, (String) null);
            new AccessibilityActionCompat(PKIFailureInfo.signerNotTrusted, (String) null);
            ACTION_DISMISS = new AccessibilityActionCompat(PKIFailureInfo.badCertTemplate, (String) null);
            new AccessibilityActionCompat(AccessibilityViewCommand.SetTextArguments.class, PKIFailureInfo.badSenderNonce);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            ACTION_SCROLL_TO_POSITION = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AccessibilityViewCommand.ScrollToPositionArguments.class);
            ACTION_SCROLL_UP = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            ACTION_SCROLL_LEFT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            ACTION_SCROLL_DOWN = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            ACTION_SCROLL_RIGHT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AccessibilityViewCommand.SetProgressArguments.class);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, AccessibilityViewCommand.MoveWindowArguments.class);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
            int i = Build.VERSION.SDK_INT;
            new AccessibilityActionCompat(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            new AccessibilityActionCompat(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            new AccessibilityActionCompat(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            new AccessibilityActionCompat(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            new AccessibilityActionCompat(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            new AccessibilityActionCompat(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            ACTION_SCROLL_IN_DIRECTION = new AccessibilityActionCompat(i >= 34 ? LanguageManagerKt.getActionScrollInDirection() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
            BuildCompat buildCompat = BuildCompat.INSTANCE;
            if (i >= 36 && BuildCompat$$ExternalSyntheticBackportWithForwarding1.m() >= 3600001) {
                accessibilityAction = Api36MinorImpl.getActionSetExtendedSelection();
            }
            new AccessibilityActionCompat(accessibilityAction, R.id.ALT, null, null, null);
        }

        public AccessibilityActionCompat(Object obj, int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class cls) {
            this.mId = i;
            this.mCommand = accessibilityViewCommand;
            if (obj == null) {
                this.mAction = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.mAction = obj;
            }
            this.mViewCommandArgumentClass = cls;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof AccessibilityActionCompat)) {
                return false;
            }
            Object obj2 = ((AccessibilityActionCompat) obj).mAction;
            Object obj3 = this.mAction;
            return obj3 == null ? obj2 == null : obj3.equals(obj2);
        }

        public final int getId() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.mAction).getId();
        }

        public final int hashCode() {
            Object obj = this.mAction;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
            String actionSymbolicName = AccessibilityNodeInfoCompat.getActionSymbolicName(this.mId);
            if (actionSymbolicName.equals("ACTION_UNKNOWN")) {
                Object obj = this.mAction;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    actionSymbolicName = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(actionSymbolicName);
            return sb.toString();
        }

        public AccessibilityActionCompat(Class cls, int i) {
            this(null, i, null, null, cls);
        }

        public AccessibilityActionCompat(int i, String str) {
            this(null, i, str, null, null);
        }
    }
}
