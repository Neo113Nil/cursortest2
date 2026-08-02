package defpackage;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.widget.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.listitem.ListItemLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.yandex.div.internal.widget.tabs.ScrollableViewPager;
import com.ybsdk.core.design.coordinator.AnchorBottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
public final class r52 extends kq31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r52(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kq31
    public int a(View view, int i) {
        View view2;
        boolean swipeToRevealLayoutExists;
        KeyEvent.Callback callback;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.a;
        Object obj = this.b;
        switch (i8) {
            case 0:
                return view.getLeft();
            case 1:
                return view.getLeft();
            case 2:
                ListItemLayout listItemLayout = (ListItemLayout) obj;
                view2 = listItemLayout.contentView;
                if (view2 instanceof gyw0) {
                    swipeToRevealLayoutExists = listItemLayout.swipeToRevealLayoutExists();
                    if (swipeToRevealLayoutExists) {
                        callback = listItemLayout.contentView;
                        gyw0 gyw0Var = (gyw0) callback;
                        i2 = listItemLayout.originalContentViewLeft;
                        i3 = listItemLayout.originalContentViewLeft;
                        if (listItemLayout.swipeToRevealLayoutRight instanceof p2k0) {
                            int l = l((p2k0) listItemLayout.swipeToRevealLayoutRight);
                            i5 = listItemLayout.originalContentViewLeft;
                            i2 = i5 - (gyw0Var.getSwipeMaxOvershoot() + l);
                        }
                        if (listItemLayout.swipeToRevealLayoutLeft instanceof p2k0) {
                            int l2 = l((p2k0) listItemLayout.swipeToRevealLayoutLeft);
                            i4 = listItemLayout.originalContentViewLeft;
                            i3 = gyw0Var.getSwipeMaxOvershoot() + l2 + i4;
                        }
                        return Math.max(i2, Math.min(i, i3));
                    }
                }
                return 0;
            case 3:
            case 4:
            default:
                return super.a(view, i);
            case 5:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                c9y c9yVar = sideSheetBehavior.a;
                switch (c9yVar.a) {
                    case 0:
                        i6 = -c9yVar.b.E;
                        break;
                    default:
                        i6 = c9yVar.a();
                        break;
                }
                c9y c9yVar2 = sideSheetBehavior.a;
                switch (c9yVar2.a) {
                    case 0:
                        i7 = c9yVar2.b.H;
                        break;
                    default:
                        i7 = c9yVar2.b.F;
                        break;
                }
                return sb2.k(i, i6, i7);
        }
    }

    @Override // defpackage.kq31
    public int b(View view, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                AnchorBottomSheetBehavior anchorBottomSheetBehavior = (AnchorBottomSheetBehavior) obj;
                if (!anchorBottomSheetBehavior.T && i2 > 0) {
                    int[] iArr = anchorBottomSheetBehavior.y;
                    if (i >= iArr[iArr.length - 1] - i2) {
                        return iArr[iArr.length - 1];
                    }
                }
                if (!anchorBottomSheetBehavior.U && i2 > 0) {
                    int i4 = i2 + i;
                    int i5 = anchorBottomSheetBehavior.B;
                    if (i4 >= i5) {
                        return i5;
                    }
                }
                int i6 = anchorBottomSheetBehavior.A;
                return i < i6 ? i6 : Math.min(i, anchorBottomSheetBehavior.C ? anchorBottomSheetBehavior.I : anchorBottomSheetBehavior.B);
            case 1:
                return sb2.k(i, ((BottomSheetBehavior) obj).F(), d());
            case 5:
                return view.getTop();
            default:
                return super.b(view, i, i2);
        }
    }

    @Override // defpackage.kq31
    public int c(View view) {
        View view2;
        KeyEvent.Callback callback;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                ListItemLayout listItemLayout = (ListItemLayout) obj;
                view2 = listItemLayout.contentView;
                if (!(view2 instanceof gyw0)) {
                    return 0;
                }
                callback = listItemLayout.contentView;
                gyw0 gyw0Var = (gyw0) callback;
                int intrinsicWidth = listItemLayout.swipeToRevealLayoutLeft instanceof p2k0 ? ((p2k0) listItemLayout.swipeToRevealLayoutLeft).getIntrinsicWidth() + gyw0Var.getSwipeMaxOvershoot() : 0;
                if (listItemLayout.swipeToRevealLayoutRight instanceof p2k0) {
                    return intrinsicWidth + gyw0Var.getSwipeMaxOvershoot() + ((p2k0) listItemLayout.swipeToRevealLayoutRight).getIntrinsicWidth();
                }
                return intrinsicWidth;
            case 5:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                return sideSheetBehavior.E + sideSheetBehavior.H;
            default:
                return super.c(view);
        }
    }

    @Override // defpackage.kq31
    public int d() {
        int i;
        int i2;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                AnchorBottomSheetBehavior anchorBottomSheetBehavior = (AnchorBottomSheetBehavior) obj;
                if (anchorBottomSheetBehavior.C && anchorBottomSheetBehavior.U) {
                    i = anchorBottomSheetBehavior.I;
                    i2 = anchorBottomSheetBehavior.A;
                } else {
                    i = anchorBottomSheetBehavior.B;
                    i2 = anchorBottomSheetBehavior.A;
                }
                return i - i2;
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                int i4 = BottomSheetBehavior.K0;
                return bottomSheetBehavior.e0 ? bottomSheetBehavior.s0 : bottomSheetBehavior.c0;
            default:
                return super.d();
        }
    }

    @Override // defpackage.kq31
    public void e(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 3:
                ((ScrollableViewPager) obj).mIsSwipeLocked = ((i & 2) == 0 && (i & 1) == 0) ? false : true;
                break;
            case 4:
                ((com.yandex.alicekit.core.views.ScrollableViewPager) obj).mIsSwipeLocked = ((i & 2) == 0 && (i & 1) == 0) ? false : true;
                break;
        }
    }

    @Override // defpackage.kq31
    public void h(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                if (i == 1) {
                    ((AnchorBottomSheetBehavior) obj).H(1, false);
                    break;
                }
                break;
            case 1:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                    if (bottomSheetBehavior.g0) {
                        bottomSheetBehavior.X(1);
                        break;
                    }
                }
                break;
            case 5:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                    if (sideSheetBehavior.z) {
                        sideSheetBehavior.v(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.kq31
    public void i(View view, int i, int i2) {
        a aVar;
        View view2;
        boolean swipeToRevealLayoutExists;
        a aVar2;
        p2k0 p2k0Var;
        Object obj;
        int absoluteRevealGravity;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ((AnchorBottomSheetBehavior) obj2).w(i2);
                break;
            case 1:
                ((BottomSheetBehavior) obj2).B(i2);
                break;
            case 2:
                ListItemLayout listItemLayout = (ListItemLayout) obj2;
                aVar = listItemLayout.viewDragHelper;
                if (aVar != null) {
                    view2 = listItemLayout.contentView;
                    if (view2 instanceof gyw0) {
                        swipeToRevealLayoutExists = listItemLayout.swipeToRevealLayoutExists();
                        if (swipeToRevealLayoutExists) {
                            listItemLayout.updateSwipeProgress(i);
                            aVar2 = listItemLayout.viewDragHelper;
                            if (aVar2.a == 1) {
                                p2k0Var = listItemLayout.activeSwipeToRevealLayout;
                                if (p2k0Var != null) {
                                    obj = listItemLayout.activeSwipeToRevealLayout;
                                    absoluteRevealGravity = listItemLayout.getAbsoluteRevealGravity((View) obj);
                                    listItemLayout.setSwipeStateInternal(1, absoluteRevealGravity);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference = sideSheetBehavior.J;
                View view3 = weakReference != null ? (View) weakReference.get() : null;
                if (view3 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams()) != null) {
                    c9y c9yVar = sideSheetBehavior.a;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (c9yVar.a) {
                        case 0:
                            if (left <= c9yVar.b.F) {
                                marginLayoutParams.leftMargin = right;
                                break;
                            }
                            break;
                        default:
                            int i4 = c9yVar.b.F;
                            if (left <= i4) {
                                marginLayoutParams.rightMargin = i4 - left;
                                break;
                            }
                            break;
                    }
                    view3.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.O;
                if (!linkedHashSet.isEmpty()) {
                    c9y c9yVar2 = sideSheetBehavior.a;
                    switch (c9yVar2.a) {
                        case 0:
                            c9yVar2.b();
                            c9yVar2.a();
                            break;
                        default:
                            int i5 = c9yVar2.b.F;
                            c9yVar2.a();
                            break;
                    }
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        ((uas0) it.next()).getClass();
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01be, code lost:
    
        if (r13 > r11.a0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x020c, code lost:
    
        if (java.lang.Math.abs(r12.getTop() - r11.F()) < java.lang.Math.abs(r12.getTop() - r11.a0)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x023a, code lost:
    
        if (java.lang.Math.abs(r13 - r11.a0) < java.lang.Math.abs(r13 - r11.c0)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0254, code lost:
    
        if (java.lang.Math.abs(r13 - r11.Z) < java.lang.Math.abs(r13 - r11.c0)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0264, code lost:
    
        if (r13 < java.lang.Math.abs(r13 - r0)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0273, code lost:
    
        if (java.lang.Math.abs(r13 - r14) < java.lang.Math.abs(r13 - r0)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (java.lang.Math.abs((r0.b.D * r13) + r12.getRight()) > 0.5f) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (java.lang.Math.abs(r13) > 500.0f) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        if (r12.getLeft() > ((r13.a() + r13.b.F) / 2)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r7 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (r12.getRight() < ((r13.a() - r13.b()) / 2)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        if (java.lang.Math.abs(r13) > 500.0f) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (java.lang.Math.abs(r13 - r11.a.a()) < java.lang.Math.abs(r13 - r11.a.b())) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0049, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005c, code lost:
    
        if (java.lang.Math.abs((r0.b.D * r13) + r12.getLeft()) > 0.5f) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0020, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0024, code lost:
    
        if (r13 > 0.0f) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0161, code lost:
    
        if (r7 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0170, code lost:
    
        if (r12 == 5) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r13 < 0.0f) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019c, code lost:
    
        if (r7 != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0031. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0065. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0017. Please report as an issue. */
    @Override // defpackage.kq31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(View view, float f, float f2) {
        View view2;
        boolean swipeToRevealLayoutExists;
        int i;
        int i2;
        boolean swipeToRevealLayoutExistsForGravity;
        int swipeRevealViewRevealedOffset;
        int swipeToActionOffset;
        int swipeViewClosedOffset;
        int i3;
        int i4;
        View view3;
        boolean z;
        boolean z2;
        boolean z3;
        int i5 = this.a;
        int i6 = 4;
        int i7 = 3;
        Object obj = this.b;
        switch (i5) {
            case 0:
                ((AnchorBottomSheetBehavior) obj).z(f2, view);
                break;
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        break;
                    }
                    i6 = 3;
                } else if (!bottomSheetBehavior.e0 || !bottomSheetBehavior.Y(f2, view)) {
                    if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                        if (!bottomSheetBehavior.b) {
                            int top2 = view.getTop();
                            break;
                        }
                    } else {
                        int top3 = view.getTop();
                        if (bottomSheetBehavior.b) {
                            break;
                        } else {
                            int i8 = bottomSheetBehavior.a0;
                            int i9 = bottomSheetBehavior.c0;
                            if (top3 >= i8) {
                                break;
                            } else {
                                break;
                            }
                            i6 = 6;
                        }
                    }
                } else {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.w) {
                        if (view.getTop() <= (bottomSheetBehavior.F() + bottomSheetBehavior.s0) / 2) {
                            if (!bottomSheetBehavior.b) {
                                break;
                            }
                            i6 = 3;
                        }
                    }
                    i6 = 5;
                }
                bottomSheetBehavior.Z(i6, view, true);
                break;
            case 2:
                ListItemLayout listItemLayout = (ListItemLayout) obj;
                view2 = listItemLayout.contentView;
                if (view2 instanceof gyw0) {
                    swipeToRevealLayoutExists = listItemLayout.swipeToRevealLayoutExists();
                    if (swipeToRevealLayoutExists) {
                        int left = view.getLeft();
                        i = listItemLayout.originalContentViewLeft;
                        if (left != i) {
                            i2 = listItemLayout.originalContentViewLeft;
                            int i10 = left > i2 ? 3 : 5;
                            p2k0 p2k0Var = i10 == 3 ? (p2k0) listItemLayout.swipeToRevealLayoutLeft : (p2k0) listItemLayout.swipeToRevealLayoutRight;
                            if (p2k0Var != null) {
                                swipeToRevealLayoutExistsForGravity = listItemLayout.swipeToRevealLayoutExistsForGravity(i10);
                                if (swipeToRevealLayoutExistsForGravity) {
                                    if (i10 != 3) {
                                        f = -f;
                                    }
                                    swipeRevealViewRevealedOffset = listItemLayout.getSwipeRevealViewRevealedOffset(i10);
                                    swipeToActionOffset = listItemLayout.getSwipeToActionOffset(i10);
                                    boolean z4 = p2k0Var.getPrimaryActionSwipeMode() != 0;
                                    r7 = p2k0Var.getPrimaryActionSwipeMode() == 2;
                                    if (f > 500.0f) {
                                        if (z4) {
                                            i4 = listItemLayout.lastStableSwipeState;
                                            if (i4 == 3) {
                                            }
                                            i6 = 5;
                                        }
                                    } else if (f >= -500.0f) {
                                        if (!z4 || Math.abs(left - swipeToActionOffset) >= Math.abs(left - swipeRevealViewRevealedOffset)) {
                                            if (z4 && r7) {
                                                swipeRevealViewRevealedOffset = swipeToActionOffset;
                                            }
                                            int abs = Math.abs(left - swipeRevealViewRevealedOffset);
                                            swipeViewClosedOffset = listItemLayout.getSwipeViewClosedOffset();
                                            if (abs < Math.abs(left - swipeViewClosedOffset)) {
                                                if (z4) {
                                                }
                                            }
                                        }
                                        i6 = 5;
                                    } else if (!r7) {
                                        i3 = listItemLayout.lastStableSwipeState;
                                        break;
                                    }
                                    view3 = listItemLayout.contentView;
                                    listItemLayout.startSettling(view3, i6, i10);
                                    break;
                                }
                                i6 = 3;
                                view3 = listItemLayout.contentView;
                                listItemLayout.startSettling(view3, i6, i10);
                            }
                        }
                    }
                }
                break;
            case 5:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                switch (sideSheetBehavior.a.a) {
                }
                if (!z) {
                    c9y c9yVar = sideSheetBehavior.a;
                    switch (c9yVar.a) {
                        case 0:
                            break;
                        default:
                            break;
                    }
                    if (z2) {
                        switch (sideSheetBehavior.a.a) {
                            case 0:
                                if (Math.abs(f) > Math.abs(f2)) {
                                    break;
                                }
                                z3 = false;
                                break;
                            default:
                                if (Math.abs(f) > Math.abs(f2)) {
                                    break;
                                }
                                z3 = false;
                                break;
                        }
                        if (!z3) {
                            c9y c9yVar2 = sideSheetBehavior.a;
                            switch (c9yVar2.a) {
                                case 0:
                                    break;
                                default:
                                    break;
                            }
                        }
                        i7 = 5;
                    } else {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left2 = view.getLeft();
                            break;
                        }
                        i7 = 5;
                    }
                }
                sideSheetBehavior.x(i7, view, true);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (((defpackage.gyw0) r9).isSwipeEnabled() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if (r3.canScrollVertically(-1) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c6, code lost:
    
        if (r3.canScrollVertically(-1) != false) goto L77;
     */
    @Override // defpackage.kq31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(int i, View view) {
        View view2;
        boolean swipeToRevealLayoutExists;
        View view3;
        a aVar;
        View view4;
        KeyEvent.Callback callback;
        WeakReference weakReference;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                AnchorBottomSheetBehavior anchorBottomSheetBehavior = (AnchorBottomSheetBehavior) obj;
                int i3 = anchorBottomSheetBehavior.E;
                if (i3 != 1 && i3 != 7 && !anchorBottomSheetBehavior.O) {
                    if (i3 == 3 && anchorBottomSheetBehavior.M == i) {
                        WeakReference weakReference2 = anchorBottomSheetBehavior.K;
                        r3 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (r3 != null) {
                            break;
                        }
                    }
                    WeakReference weakReference3 = anchorBottomSheetBehavior.J;
                    if (weakReference3 != null && weakReference3.get() == view) {
                    }
                }
                break;
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                int i4 = bottomSheetBehavior.k0;
                if (i4 != 1 && !bottomSheetBehavior.D0) {
                    if (i4 == 3 && bottomSheetBehavior.A0 == i) {
                        if (bottomSheetBehavior.x) {
                            WeakReference weakReference4 = bottomSheetBehavior.C0;
                            if (weakReference4 != null) {
                                r3 = (View) weakReference4.get();
                            }
                        } else {
                            ArrayList arrayList = bottomSheetBehavior.w0;
                            if (!arrayList.isEmpty()) {
                                r3 = (View) ((WeakReference) arrayList.get(0)).get();
                            }
                        }
                        if (r3 != null) {
                            break;
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference5 = bottomSheetBehavior.t0;
                    if (weakReference5 != null && weakReference5.get() == view) {
                    }
                }
                break;
            case 2:
                ListItemLayout listItemLayout = (ListItemLayout) obj;
                view2 = listItemLayout.contentView;
                if (view2 instanceof gyw0) {
                    callback = listItemLayout.contentView;
                    break;
                }
                swipeToRevealLayoutExists = listItemLayout.swipeToRevealLayoutExists();
                if (swipeToRevealLayoutExists) {
                    view3 = listItemLayout.contentView;
                    if (view3 != null) {
                        aVar = listItemLayout.viewDragHelper;
                        view4 = listItemLayout.contentView;
                        aVar.c(i, view4);
                        break;
                    }
                }
                break;
            case 3:
            case 4:
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                if (sideSheetBehavior.A == 1 || (weakReference = sideSheetBehavior.I) == null || weakReference.get() != view) {
                    break;
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int l(p2k0 p2k0Var) {
        int marginStart;
        int marginEnd;
        View view;
        View view2;
        ListItemLayout listItemLayout = (ListItemLayout) this.b;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) p2k0Var).getLayoutParams();
        if (p2k0Var.getPrimaryActionSwipeMode() != 0) {
            view = listItemLayout.contentView;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginStart = xeb1.a((View) p2k0Var) ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
            view2 = listItemLayout.contentView;
            marginEnd = view2.getMeasuredWidth();
        } else {
            marginStart = marginLayoutParams.getMarginStart() + p2k0Var.getIntrinsicWidth();
            marginEnd = marginLayoutParams.getMarginEnd();
        }
        return marginEnd + marginStart;
    }
}
