package io.flutter.view;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import defpackage.qi;
import defpackage.ri;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final qi reflectionAccessors = new qi();
    private final SparseArray<ri> flutterIdToOrigin = new SparseArray<>();
    private final Map<ri, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    public AccessibilityViewEmbedder(View view, int i) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l;
        int i;
        Method method;
        for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); i2++) {
            qi qiVar = this.reflectionAccessors;
            Field field = qiVar.c;
            if (field != null && (method = qiVar.d) != null) {
                try {
                    l = (Long) method.invoke(field.get(accessibilityNodeInfo), Integer.valueOf(i2));
                    l.getClass();
                } catch (ArrayIndexOutOfBoundsException | IllegalAccessException | InvocationTargetException unused) {
                }
                if (l == null) {
                    int longValue = (int) (l.longValue() >> 32);
                    ri riVar = new ri(view, longValue);
                    if (this.originToFlutterId.containsKey(riVar)) {
                        i = this.originToFlutterId.get(riVar).intValue();
                    } else {
                        int i3 = this.nextFlutterId;
                        this.nextFlutterId = i3 + 1;
                        cacheVirtualIdMappings(view, longValue, i3);
                        i = i3;
                    }
                    accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i);
                }
            }
            l = null;
            if (l == null) {
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i, int i2) {
        ri riVar = new ri(view, i);
        this.originToFlutterId.put(riVar, Integer.valueOf(i2));
        this.flutterIdToOrigin.put(i2, riVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
        accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
        accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        this.reflectionAccessors.getClass();
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
        Parcel obtain2 = Parcel.obtain();
        obtain2.setDataPosition(0);
        obtain.writeToParcel(obtain2, 0);
        obtain2.setDataPosition(0);
        long readLong = obtain2.readLong();
        if (qi.a(0, readLong)) {
            obtain2.readInt();
        }
        if (qi.a(1, readLong)) {
            obtain2.readLong();
        }
        if (qi.a(2, readLong)) {
            obtain2.readInt();
        }
        Long valueOf = qi.a(3, readLong) ? Long.valueOf(obtain2.readLong()) : null;
        obtain2.recycle();
        if (valueOf == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new ri(view, (int) (valueOf.longValue() >> 32)));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        ri riVar = this.flutterIdToOrigin.get(i);
        if (riVar == null) {
            return null;
        }
        View view = riVar.a;
        if (!this.embeddedViewToDisplayBounds.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(riVar.b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0012 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long l;
        Method method = this.reflectionAccessors.b;
        if (method != null) {
            try {
                l = (Long) method.invoke(accessibilityRecord, null);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
            if (l != null) {
                return null;
            }
            return this.originToFlutterId.get(new ri(view, (int) (l.longValue() >> 32)));
        }
        l = null;
        if (l != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessibilityNodeInfo getRootNode(View view, int i, Rect rect) {
        Long l;
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Method method = this.reflectionAccessors.a;
        if (method != null) {
            try {
                l = (Long) method.invoke(createAccessibilityNodeInfo, null);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
            if (l != null) {
                return null;
            }
            this.embeddedViewToDisplayBounds.put(view, rect);
            cacheVirtualIdMappings(view, (int) (l.longValue() >> 32), i);
            return convertToFlutterNode(createAccessibilityNodeInfo, i, view);
        }
        l = null;
        if (l != null) {
        }
    }

    public boolean onAccessibilityHoverEvent(int i, MotionEvent motionEvent) {
        ri riVar = this.flutterIdToOrigin.get(i);
        if (riVar == null) {
            return false;
        }
        View view = riVar.a;
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i2] = pointerProperties;
            motionEvent.getPointerProperties(i2, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i2, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i2] = pointerCoords2;
            pointerCoords2.x -= rect.left;
            pointerCoords2.y -= rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        ri riVar = this.flutterIdToOrigin.get(i);
        if (riVar == null || (accessibilityNodeProvider = riVar.a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(riVar.b, i2, bundle);
    }

    public View platformViewOfNode(int i) {
        ri riVar = this.flutterIdToOrigin.get(i);
        if (riVar == null) {
            return null;
        }
        return riVar.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Long l;
        Long l2;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Method method = this.reflectionAccessors.b;
        if (method != null) {
            try {
                l = (Long) method.invoke(accessibilityEvent, null);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
            if (l != null) {
                int longValue = (int) (l.longValue() >> 32);
                Integer num = this.originToFlutterId.get(new ri(view, longValue));
                if (num == null) {
                    int i = this.nextFlutterId;
                    this.nextFlutterId = i + 1;
                    Integer valueOf = Integer.valueOf(i);
                    cacheVirtualIdMappings(view, longValue, i);
                    num = valueOf;
                }
                obtain.setSource(this.rootAccessibilityView, num.intValue());
                obtain.setClassName(accessibilityEvent.getClassName());
                obtain.setPackageName(accessibilityEvent.getPackageName());
                for (int i2 = 0; i2 < obtain.getRecordCount(); i2++) {
                    AccessibilityRecord record = obtain.getRecord(i2);
                    Method method2 = this.reflectionAccessors.b;
                    if (method2 != null) {
                        try {
                            l2 = (Long) method2.invoke(record, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                        if (l2 == null) {
                            ri riVar = new ri(view, (int) (l2.longValue() >> 32));
                            if (this.originToFlutterId.containsKey(riVar)) {
                                record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(riVar).intValue());
                            }
                        }
                    }
                    l2 = null;
                    if (l2 == null) {
                    }
                }
                return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
            }
            return false;
        }
        l = null;
        if (l != null) {
        }
        return false;
    }
}
