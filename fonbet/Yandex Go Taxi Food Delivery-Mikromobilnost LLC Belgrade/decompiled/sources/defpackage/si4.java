package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import ru.yandex.taxi.widget.BackportNumberPicker;

/* loaded from: classes6.dex */
public final class si4 extends AccessibilityNodeProviderCompat {
    public final Rect b = new Rect();
    public final int[] c = new int[2];
    public int d = Integer.MIN_VALUE;
    public final /* synthetic */ BackportNumberPicker e;

    public si4(BackportNumberPicker backportNumberPicker) {
        this.e = backportNumberPicker;
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final wh b(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        String[] strArr;
        String[] strArr2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String virtualInputTextDescription;
        int i10;
        int i11;
        int[] iArr = this.c;
        Rect rect = this.b;
        BackportNumberPicker backportNumberPicker = this.e;
        if (i == -1) {
            int scrollX = backportNumberPicker.getScrollX();
            int scrollY = backportNumberPicker.getScrollY();
            int right = (backportNumberPicker.getRight() - backportNumberPicker.getLeft()) + backportNumberPicker.getScrollX();
            int bottom = (backportNumberPicker.getBottom() - backportNumberPicker.getTop()) + backportNumberPicker.getScrollY();
            wh h = wh.h();
            AccessibilityNodeInfo accessibilityNodeInfo = h.a;
            h.p(backportNumberPicker.getClass().getName());
            h.z(backportNumberPicker.getContext().getPackageName());
            h.c = -1;
            accessibilityNodeInfo.setSource(backportNumberPicker);
            if (backportNumberPicker.getWrapSelectorWheel() || backportNumberPicker.getValue() > backportNumberPicker.getMinValue()) {
                accessibilityNodeInfo.addChild(backportNumberPicker, 3);
            }
            accessibilityNodeInfo.addChild(backportNumberPicker, 2);
            if (backportNumberPicker.getWrapSelectorWheel() || backportNumberPicker.getValue() < backportNumberPicker.getMaxValue()) {
                accessibilityNodeInfo.addChild(backportNumberPicker, 1);
            }
            h.A((View) backportNumberPicker.getParentForAccessibility());
            h.v(backportNumberPicker.isEnabled());
            h.B(true);
            h.j(this.d == -1);
            h.G(backportNumberPicker.isShown());
            rect.set(scrollX, scrollY, right, bottom);
            backportNumberPicker.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            h.l(rect);
            if (this.d != -1) {
                h.a(64);
            }
            if (this.d == -1) {
                h.a(128);
            }
            if (backportNumberPicker.isEnabled()) {
                if (backportNumberPicker.getWrapSelectorWheel() || backportNumberPicker.getValue() < backportNumberPicker.getMaxValue()) {
                    h.a(4096);
                }
                if (backportNumberPicker.getWrapSelectorWheel() || backportNumberPicker.getValue() > backportNumberPicker.getMinValue()) {
                    h.a(8192);
                }
            }
            return h;
        }
        String str = null;
        if (i == 1) {
            i2 = backportNumberPicker.mValue;
            int i12 = i2 + 1;
            z = backportNumberPicker.mWrapSelectorWheel;
            if (z) {
                i12 = backportNumberPicker.getWrappedSelectorIndex(i12);
            }
            if (i12 <= backportNumberPicker.mMaxValue) {
                strArr = backportNumberPicker.mSpokenValues;
                if (strArr == null) {
                    str = j();
                } else {
                    strArr2 = backportNumberPicker.mSpokenValues;
                    i5 = backportNumberPicker.mMinValue;
                    str = strArr2[i12 - i5];
                }
            }
            String str2 = str;
            int scrollX2 = backportNumberPicker.getScrollX();
            i3 = backportNumberPicker.mBottomSelectionDividerBottom;
            i4 = backportNumberPicker.mSelectionDividerHeight;
            return f(1, scrollX2, i3 - i4, (backportNumberPicker.getRight() - backportNumberPicker.getLeft()) + backportNumberPicker.getScrollX(), (backportNumberPicker.getBottom() - backportNumberPicker.getTop()) + backportNumberPicker.getScrollY(), str2);
        }
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            String h2 = h();
            int scrollX3 = backportNumberPicker.getScrollX();
            int scrollY2 = backportNumberPicker.getScrollY();
            int right2 = (backportNumberPicker.getRight() - backportNumberPicker.getLeft()) + backportNumberPicker.getScrollX();
            i10 = backportNumberPicker.mTopSelectionDividerTop;
            i11 = backportNumberPicker.mSelectionDividerHeight;
            return f(3, scrollX3, scrollY2, right2, i11 + i10, h2);
        }
        int scrollX4 = backportNumberPicker.getScrollX();
        i6 = backportNumberPicker.mTopSelectionDividerTop;
        i7 = backportNumberPicker.mSelectionDividerHeight;
        int i13 = i7 + i6;
        int right3 = (backportNumberPicker.getRight() - backportNumberPicker.getLeft()) + backportNumberPicker.getScrollX();
        i8 = backportNumberPicker.mBottomSelectionDividerBottom;
        i9 = backportNumberPicker.mSelectionDividerHeight;
        int i14 = i8 - i9;
        AccessibilityNodeInfo createAccessibilityNodeInfo = backportNumberPicker.mInputText.createAccessibilityNodeInfo();
        wh whVar = new wh(createAccessibilityNodeInfo);
        whVar.c = 2;
        createAccessibilityNodeInfo.setSource(backportNumberPicker, 2);
        whVar.j(this.d == 2);
        if (this.d != 2) {
            whVar.a(64);
        }
        if (this.d == 2) {
            whVar.a(128);
        }
        whVar.G(backportNumberPicker.isShown());
        virtualInputTextDescription = backportNumberPicker.getVirtualInputTextDescription();
        whVar.E(virtualInputTextDescription);
        rect.set(scrollX4, i13, right3, i14);
        backportNumberPicker.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        whVar.l(rect);
        return whVar;
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final List c(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return Collections.EMPTY_LIST;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        ArrayList arrayList = new ArrayList();
        if (i == -1) {
            g(3, lowerCase, arrayList);
            g(2, lowerCase, arrayList);
            g(1, lowerCase, arrayList);
            return arrayList;
        }
        if (i != 1 && i != 2 && i != 3) {
            return null;
        }
        g(i, lowerCase, arrayList);
        return arrayList;
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final boolean e(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        int i5;
        int i6;
        BackportNumberPicker backportNumberPicker = this.e;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (i2 != 16) {
                            if (i2 != 64) {
                                if (i2 == 128 && this.d == i) {
                                    this.d = Integer.MIN_VALUE;
                                    l(i, 65536);
                                    int right = backportNumberPicker.getRight();
                                    i6 = backportNumberPicker.mTopSelectionDividerTop;
                                    backportNumberPicker.invalidate(0, 0, right, i6);
                                    return true;
                                }
                            } else if (this.d != i) {
                                this.d = i;
                                l(i, 32768);
                                int right2 = backportNumberPicker.getRight();
                                i5 = backportNumberPicker.mTopSelectionDividerTop;
                                backportNumberPicker.invalidate(0, 0, right2, i5);
                                return true;
                            }
                        } else if (backportNumberPicker.isEnabled()) {
                            backportNumberPicker.changeValueByOne(false);
                            l(i, 1);
                            return true;
                        }
                    }
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 16) {
                            if (i2 != 64) {
                                if (i2 != 128) {
                                    return backportNumberPicker.mInputText.performAccessibilityAction(i2, bundle);
                                }
                                if (this.d == i) {
                                    this.d = Integer.MIN_VALUE;
                                    l(i, 65536);
                                    backportNumberPicker.mInputText.invalidate();
                                    return true;
                                }
                            } else if (this.d != i) {
                                this.d = i;
                                l(i, 32768);
                                backportNumberPicker.mInputText.invalidate();
                                return true;
                            }
                        } else if (backportNumberPicker.isEnabled()) {
                            backportNumberPicker.showSoftInput();
                            return true;
                        }
                    } else if (backportNumberPicker.isEnabled() && backportNumberPicker.mInputText.isFocused()) {
                        backportNumberPicker.mInputText.clearFocus();
                        return true;
                    }
                } else if (backportNumberPicker.isEnabled() && !backportNumberPicker.mInputText.isFocused()) {
                    return backportNumberPicker.mInputText.requestFocus();
                }
            } else if (i2 != 16) {
                if (i2 != 64) {
                    if (i2 == 128 && this.d == i) {
                        this.d = Integer.MIN_VALUE;
                        l(i, 65536);
                        i4 = backportNumberPicker.mBottomSelectionDividerBottom;
                        backportNumberPicker.invalidate(0, i4, backportNumberPicker.getRight(), backportNumberPicker.getBottom());
                        return true;
                    }
                } else if (this.d != i) {
                    this.d = i;
                    l(i, 32768);
                    i3 = backportNumberPicker.mBottomSelectionDividerBottom;
                    backportNumberPicker.invalidate(0, i3, backportNumberPicker.getRight(), backportNumberPicker.getBottom());
                    return true;
                }
            } else if (backportNumberPicker.isEnabled()) {
                backportNumberPicker.changeValueByOne(true);
                l(i, 1);
                return true;
            }
        } else if (i2 != 64) {
            if (i2 != 128) {
                if (i2 != 4096) {
                    if (i2 == 8192 && backportNumberPicker.isEnabled() && (backportNumberPicker.getWrapSelectorWheel() || backportNumberPicker.getValue() > backportNumberPicker.getMinValue())) {
                        backportNumberPicker.changeValueByOne(false);
                        return true;
                    }
                } else if (backportNumberPicker.isEnabled() && (backportNumberPicker.getWrapSelectorWheel() || backportNumberPicker.getValue() < backportNumberPicker.getMaxValue())) {
                    backportNumberPicker.changeValueByOne(true);
                    return true;
                }
            } else if (this.d == i) {
                this.d = Integer.MIN_VALUE;
                backportNumberPicker.performAccessibilityAction(128, null);
                return true;
            }
        } else if (this.d != i) {
            this.d = i;
            backportNumberPicker.performAccessibilityAction(64, null);
            return true;
        }
        return false;
    }

    public final wh f(int i, int i2, int i3, int i4, int i5, String str) {
        wh h = wh.h();
        h.p(Button.class.getName());
        BackportNumberPicker backportNumberPicker = this.e;
        h.z(backportNumberPicker.getContext().getPackageName());
        h.c = i;
        h.a.setSource(backportNumberPicker, i);
        h.A(backportNumberPicker);
        h.E(str);
        h.q(true);
        h.y(true);
        h.v(backportNumberPicker.isEnabled());
        Rect rect = this.b;
        rect.set(i2, i3, i4, i5);
        h.G(backportNumberPicker.isShown());
        h.k(rect);
        int[] iArr = this.c;
        backportNumberPicker.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        h.l(rect);
        if (this.d != i) {
            h.a(64);
        }
        if (this.d == i) {
            h.a(128);
        }
        if (backportNumberPicker.isEnabled()) {
            h.a(16);
        }
        return h;
    }

    public final void g(int i, String str, ArrayList arrayList) {
        if (i == 1) {
            String j = j();
            if (TextUtils.isEmpty(j) || !j.toLowerCase(Locale.getDefault()).contains(str)) {
                return;
            }
            arrayList.add(b(1));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            String i2 = i();
            if (TextUtils.isEmpty(i2) || !i2.toLowerCase(Locale.getDefault()).contains(str)) {
                return;
            }
            arrayList.add(b(3));
            return;
        }
        BackportNumberPicker backportNumberPicker = this.e;
        Editable text = backportNumberPicker.mInputText.getText();
        if (!TextUtils.isEmpty(text) && text.toString().toLowerCase(Locale.getDefault()).contains(str)) {
            arrayList.add(b(2));
            return;
        }
        Editable text2 = backportNumberPicker.mInputText.getText();
        if (TextUtils.isEmpty(text2) || !text2.toString().toLowerCase(Locale.getDefault()).contains(str)) {
            return;
        }
        arrayList.add(b(2));
    }

    public final String h() {
        int i;
        boolean z;
        int i2;
        String[] strArr;
        String[] strArr2;
        int i3;
        BackportNumberPicker backportNumberPicker = this.e;
        i = backportNumberPicker.mValue;
        int i4 = i - 1;
        z = backportNumberPicker.mWrapSelectorWheel;
        if (z) {
            i4 = backportNumberPicker.getWrappedSelectorIndex(i4);
        }
        i2 = backportNumberPicker.mMinValue;
        if (i4 < i2) {
            return null;
        }
        strArr = backportNumberPicker.mSpokenValues;
        if (strArr == null) {
            return i();
        }
        strArr2 = backportNumberPicker.mSpokenValues;
        i3 = backportNumberPicker.mMinValue;
        return strArr2[i4 - i3];
    }

    public final String i() {
        int i;
        boolean z;
        int i2;
        int i3;
        String formatNumber;
        BackportNumberPicker backportNumberPicker = this.e;
        i = backportNumberPicker.mValue;
        int i4 = i - 1;
        z = backportNumberPicker.mWrapSelectorWheel;
        if (z) {
            i4 = backportNumberPicker.getWrappedSelectorIndex(i4);
        }
        i2 = backportNumberPicker.mMinValue;
        if (i4 < i2) {
            return null;
        }
        if (backportNumberPicker.mDisplayedValues == null) {
            formatNumber = backportNumberPicker.formatNumber(i4);
            return formatNumber;
        }
        String[] strArr = backportNumberPicker.mDisplayedValues;
        i3 = backportNumberPicker.mMinValue;
        return strArr[i4 - i3];
    }

    public final String j() {
        int i;
        boolean z;
        int i2;
        String formatNumber;
        BackportNumberPicker backportNumberPicker = this.e;
        i = backportNumberPicker.mValue;
        int i3 = i + 1;
        z = backportNumberPicker.mWrapSelectorWheel;
        if (z) {
            i3 = backportNumberPicker.getWrappedSelectorIndex(i3);
        }
        if (i3 > backportNumberPicker.mMaxValue) {
            return null;
        }
        if (backportNumberPicker.mDisplayedValues == null) {
            formatNumber = backportNumberPicker.formatNumber(i3);
            return formatNumber;
        }
        String[] strArr = backportNumberPicker.mDisplayedValues;
        i2 = backportNumberPicker.mMinValue;
        return strArr[i3 - i2];
    }

    public final void k(int i, int i2, String str) {
        boolean isAccessibilityManagerEnabled;
        BackportNumberPicker backportNumberPicker = this.e;
        isAccessibilityManagerEnabled = backportNumberPicker.isAccessibilityManagerEnabled();
        if (isAccessibilityManagerEnabled) {
            AccessibilityEvent q = Build.VERSION.SDK_INT >= 30 ? ai.q(i2) : AccessibilityEvent.obtain(i2);
            q.setClassName(Button.class.getName());
            q.setPackageName(backportNumberPicker.getContext().getPackageName());
            q.getText().add(str);
            q.setEnabled(backportNumberPicker.isEnabled());
            q.setSource(backportNumberPicker, i);
            backportNumberPicker.requestSendAccessibilityEvent(backportNumberPicker, q);
        }
    }

    public final void l(int i, int i2) {
        boolean isAccessibilityManagerEnabled;
        BackportNumberPicker backportNumberPicker = this.e;
        if (i == 1) {
            if (backportNumberPicker.getWrapSelectorWheel() || backportNumberPicker.getValue() < backportNumberPicker.getMaxValue()) {
                k(i, i2, h());
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            if (backportNumberPicker.getWrapSelectorWheel() || backportNumberPicker.getValue() > backportNumberPicker.getMinValue()) {
                k(i, i2, h());
                return;
            }
            return;
        }
        isAccessibilityManagerEnabled = backportNumberPicker.isAccessibilityManagerEnabled();
        if (isAccessibilityManagerEnabled) {
            AccessibilityEvent q = Build.VERSION.SDK_INT >= 30 ? ai.q(i2) : AccessibilityEvent.obtain(i2);
            q.setEventType(i2);
            backportNumberPicker.mInputText.onInitializeAccessibilityEvent(q);
            backportNumberPicker.mInputText.onPopulateAccessibilityEvent(q);
            q.setSource(backportNumberPicker, 2);
            backportNumberPicker.requestSendAccessibilityEvent(backportNumberPicker, q);
        }
    }
}
