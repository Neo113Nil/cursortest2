package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class e5 extends Mq3SeTnW {
    public final AccessibilityManager Qr9iLBAD;
    public lg eVhOlqcC;
    public final Chip jb9XjC4I;
    public final /* synthetic */ Chip ygLcUYwZ;
    public static final Rect lDXGDhIF = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final re sjUBp5pO = new re(18);
    public static final re OxcuoDLp = new re(19);
    public final Rect wxUZMvaN = new Rect();
    public final Rect VgvYg0wo = new Rect();
    public final Rect P7K7Inc8 = new Rect();
    public final int[] b2ZJblxo = new int[2];
    public int k3x7lurq = Integer.MIN_VALUE;
    public int ow5vqvCr = Integer.MIN_VALUE;
    public int OnDfzHZD = Integer.MIN_VALUE;

    public e5(Chip chip, Chip chip2) {
        this.ygLcUYwZ = chip;
        this.jb9XjC4I = chip2;
        this.Qr9iLBAD = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.Mq3SeTnW
    public final tg0 NCTxEWno(View view) {
        lg lgVar = this.eVhOlqcC;
        if (lgVar != null) {
            return lgVar;
        }
        lg lgVar2 = new lg(this);
        this.eVhOlqcC = lgVar2;
        return lgVar2;
    }

    public final boolean OnDfzHZD(int i, Rect rect) {
        int i2;
        Object obj;
        nSmgoSB5 nsmgosb5;
        ArrayList arrayList = new ArrayList();
        ow5vqvCr(arrayList);
        a80 a80Var = new a80(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            a80Var.NCTxEWno(((Integer) arrayList.get(i3)).intValue(), k3x7lurq(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.ow5vqvCr;
        int i5 = Integer.MIN_VALUE;
        nSmgoSB5 nsmgosb52 = i4 == Integer.MIN_VALUE ? null : (nSmgoSB5) ej0.eVhOlqcC(a80Var, i4);
        re reVar = sjUBp5pO;
        re reVar2 = OxcuoDLp;
        Chip chip = this.jb9XjC4I;
        int i6 = -1;
        if (i == 1 || i == 2) {
            boolean z = chip.getLayoutDirection() == 1;
            reVar2.getClass();
            int MdtA4re8 = a80Var.MdtA4re8();
            ArrayList arrayList2 = new ArrayList(MdtA4re8);
            for (int i7 = 0; i7 < MdtA4re8; i7++) {
                arrayList2.add((nSmgoSB5) a80Var.wxUZMvaN(i7));
            }
            Collections.sort(arrayList2, new ph(reVar, z));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (nsmgosb52 != null) {
                    size = arrayList2.indexOf(nsmgosb52);
                }
                int i8 = size - 1;
                obj = i8 >= 0 ? arrayList2.get(i8) : null;
            } else {
                if (i != 2) {
                    m1.sjUBp5pO("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (nsmgosb52 == null ? -1 : arrayList2.lastIndexOf(nsmgosb52)) + 1;
                i2 = 0;
                obj = lastIndexOf < size2 ? arrayList2.get(lastIndexOf) : null;
            }
            nsmgosb5 = (nSmgoSB5) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                m1.sjUBp5pO("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i9 = this.ow5vqvCr;
            if (i9 != Integer.MIN_VALUE) {
                ygLcUYwZ(i9).qoPGr6Ce.getBoundsInScreen(rect2);
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
                        m1.sjUBp5pO("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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
                    m1.sjUBp5pO("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            reVar2.getClass();
            int MdtA4re82 = a80Var.MdtA4re8();
            Rect rect4 = new Rect();
            nsmgosb5 = null;
            for (int i10 = 0; i10 < MdtA4re82; i10++) {
                nSmgoSB5 nsmgosb53 = (nSmgoSB5) a80Var.wxUZMvaN(i10);
                if (nsmgosb53 != nsmgosb52) {
                    reVar.getClass();
                    nsmgosb53.qoPGr6Ce.getBoundsInScreen(rect4);
                    if (ej0.lwWCatUu(i, rect2, rect4)) {
                        if (ej0.lwWCatUu(i, rect2, rect3) && !ej0.qoPGr6Ce(i, rect2, rect4, rect3)) {
                            if (!ej0.qoPGr6Ce(i, rect2, rect3, rect4)) {
                                int i7xS8jrb = ej0.i7xS8jrb(i, rect2, rect4);
                                int Mq3SeTnW = ej0.Mq3SeTnW(i, rect2, rect4);
                                int i11 = (Mq3SeTnW * Mq3SeTnW) + (i7xS8jrb * 13 * i7xS8jrb);
                                int i7xS8jrb2 = ej0.i7xS8jrb(i, rect2, rect3);
                                int Mq3SeTnW2 = ej0.Mq3SeTnW(i, rect2, rect3);
                                if (i11 >= (Mq3SeTnW2 * Mq3SeTnW2) + (i7xS8jrb2 * 13 * i7xS8jrb2)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        nsmgosb5 = nsmgosb53;
                    }
                }
            }
            i2 = 0;
        }
        nSmgoSB5 nsmgosb54 = nsmgosb5;
        if (nsmgosb54 != null) {
            if (a80Var.NCTxEWno) {
                ej0.amk52bBQ(a80Var);
            }
            int i12 = a80Var.VgvYg0wo;
            int i13 = i2;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                if (a80Var.wxUZMvaN[i13] == nsmgosb54) {
                    i6 = i13;
                    break;
                }
                i13++;
            }
            i5 = a80Var.qoPGr6Ce(i6);
        }
        return sjUBp5pO(i5);
    }

    public final void OxcuoDLp(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.Qr9iLBAD.isEnabled() || (parent = (view = this.jb9XjC4I).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            nSmgoSB5 ygLcUYwZ = ygLcUYwZ(i);
            obtain.getText().add(ygLcUYwZ.P7K7Inc8());
            AccessibilityNodeInfo accessibilityNodeInfo = ygLcUYwZ.qoPGr6Ce;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }

    public final boolean eVhOlqcC(int i) {
        if (this.ow5vqvCr != i) {
            return false;
        }
        this.ow5vqvCr = Integer.MIN_VALUE;
        lDXGDhIF(i, false);
        OxcuoDLp(i, 8);
        return true;
    }

    public final nSmgoSB5 k3x7lurq(int i) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        nSmgoSB5 nsmgosb5 = new nSmgoSB5(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = lDXGDhIF;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        Chip chip = this.jb9XjC4I;
        obtain.setParent(chip);
        AccessibilityNodeInfo accessibilityNodeInfo = nsmgosb5.qoPGr6Ce;
        if (i == 1) {
            Chip chip2 = this.ygLcUYwZ;
            CharSequence closeIconContentDescription = chip2.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip2.getText();
                accessibilityNodeInfo.setContentDescription(chip2.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            closeIconTouchBoundsInt = chip2.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            nsmgosb5.NCTxEWno(aZz0PFXp.wxUZMvaN);
            accessibilityNodeInfo.setEnabled(chip2.isEnabled());
            accessibilityNodeInfo.setClassName(Button.class.getName());
        } else {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.gjV1z5T1);
        }
        if (nsmgosb5.P7K7Inc8() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.VgvYg0wo;
        obtain.getBoundsInParent(rect2);
        Rect rect3 = this.wxUZMvaN;
        obtain.getBoundsInScreen(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(chip.getContext().getPackageName());
        nsmgosb5.NCTxEWno = i;
        obtain.setSource(chip, i);
        if (this.k3x7lurq == i) {
            obtain.setAccessibilityFocused(true);
            nsmgosb5.qoPGr6Ce(128);
        } else {
            obtain.setAccessibilityFocused(false);
            nsmgosb5.qoPGr6Ce(64);
        }
        boolean z = this.ow5vqvCr == i;
        if (z) {
            nsmgosb5.qoPGr6Ce(2);
        } else if (obtain.isFocusable()) {
            nsmgosb5.qoPGr6Ce(1);
        }
        obtain.setFocused(z);
        int[] iArr = this.b2ZJblxo;
        chip.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            obtain.setBoundsInParent(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            chip.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            obtain.setBoundsInScreen(rect4);
            obtain.getBoundsInScreen(rect3);
        }
        Rect rect5 = this.P7K7Inc8;
        if (chip.getLocalVisibleRect(rect5)) {
            rect5.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect5)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
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
        return nsmgosb5;
    }

    public final void lDXGDhIF(int i, boolean z) {
        Chip chip = this.ygLcUYwZ;
        if (i == 1) {
            chip.ygLcUYwZ = z;
        }
        g5 g5Var = chip.P7K7Inc8;
        boolean z2 = chip.ygLcUYwZ;
        boolean z3 = false;
        if (g5Var.KRabZ4CU != null) {
            z3 = g5Var.gmkaJpmS(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : g5.VM67d7Sv);
        }
        if (z3) {
            chip.refreshDrawableState();
        }
    }

    public final void ow5vqvCr(ArrayList arrayList) {
        g5 g5Var;
        arrayList.add(0);
        Rect rect = Chip.gjV1z5T1;
        Chip chip = this.ygLcUYwZ;
        if (!chip.MdtA4re8() || (g5Var = chip.P7K7Inc8) == null || !g5Var.bvfAo0eO || chip.jb9XjC4I == null) {
            return;
        }
        arrayList.add(1);
    }

    public final boolean sjUBp5pO(int i) {
        int i2;
        Chip chip = this.jb9XjC4I;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.ow5vqvCr) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            eVhOlqcC(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.ow5vqvCr = i;
        lDXGDhIF(i, true);
        OxcuoDLp(i, 8);
        return true;
    }

    @Override // defpackage.Mq3SeTnW
    public final void wxUZMvaN(View view, nSmgoSB5 nsmgosb5) {
        AccessibilityNodeInfo accessibilityNodeInfo = nsmgosb5.qoPGr6Ce;
        this.qoPGr6Ce.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.ygLcUYwZ;
        g5 g5Var = chip.P7K7Inc8;
        accessibilityNodeInfo.setCheckable(g5Var != null && g5Var.VGmz0ccI);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final nSmgoSB5 ygLcUYwZ(int i) {
        if (i != -1) {
            return k3x7lurq(i);
        }
        Chip chip = this.jb9XjC4I;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(chip);
        nSmgoSB5 nsmgosb5 = new nSmgoSB5(obtain);
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        chip.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        ow5vqvCr(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nsmgosb5.qoPGr6Ce.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return nsmgosb5;
    }
}
