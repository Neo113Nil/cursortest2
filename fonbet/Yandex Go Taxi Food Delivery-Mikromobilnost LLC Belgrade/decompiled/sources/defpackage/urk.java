package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.gallery.ScrollPosition;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivGallery;
import defpackage.ffx;
import defpackage.trk;
import defpackage.urk;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface urk {
    int B(View view);

    int C();

    int D();

    int a();

    int b();

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        if (r14 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0131, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default void c(View view, int i, int i2, int i3, int i4, boolean z) {
        rvo rvoVar;
        int i5;
        int i6;
        DivGallery.ContentAlignment contentAlignment;
        Object a;
        DivGallery.ContentAlignment contentAlignment2;
        Object a2;
        m3k m3kVar;
        int D = D();
        int measuredWidth = (getView().getMeasuredWidth() - getView().getPaddingLeft()) - getView().getPaddingRight();
        int measuredHeight = (getView().getMeasuredHeight() - getView().getPaddingTop()) - getView().getPaddingBottom();
        if (D == 0 ? getView().getMeasuredHeight() == 0 || measuredHeight == 0 || view.getMeasuredHeight() == 0 : D == 1 && (getView().getMeasuredWidth() == 0 || measuredWidth == 0 || view.getMeasuredWidth() == 0)) {
            g(i, i2, i3, i4, view);
            if (z) {
                return;
            }
            s().add(view);
            return;
        }
        Integer num = (Integer) view.getTag(ngh0.div_gallery_item_index);
        cxk y = num != null ? y(num.intValue()) : null;
        egk d = (y == null || (m3kVar = y.a) == null) ? null : m3kVar.d();
        if (y == null || (rvoVar = y.b) == null) {
            rvoVar = getBindingContext().b;
        }
        Expression expression = getDiv().j;
        if (D == 1) {
            Expression h = d != null ? d.h() : null;
            if (h != null && (a2 = h.a(rvoVar)) != null) {
                int i7 = srk.b[((DivAlignmentHorizontal) a2).ordinal()];
                if (i7 == 1) {
                    contentAlignment2 = DivGallery.ContentAlignment.START;
                } else if (i7 == 2) {
                    contentAlignment2 = DivGallery.ContentAlignment.CENTER;
                } else if (i7 == 3) {
                    contentAlignment2 = DivGallery.ContentAlignment.END;
                } else if (i7 == 4) {
                    contentAlignment2 = DivGallery.ContentAlignment.START;
                } else {
                    if (i7 != 5) {
                        w511.b();
                        return;
                    }
                    contentAlignment2 = DivGallery.ContentAlignment.END;
                }
            }
            contentAlignment2 = (DivGallery.ContentAlignment) expression.a(rvoVar);
            i5 = measuredWidth - (i3 - i);
            int i8 = srk.a[contentAlignment2.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    i5 /= 2;
                } else if (i8 != 3) {
                    w511.b();
                    return;
                }
                if (D == 0) {
                    Expression o = d != null ? d.o() : null;
                    if (o != null && (a = o.a(rvoVar)) != null) {
                        int i9 = srk.c[((DivAlignmentVertical) a).ordinal()];
                        if (i9 == 1 || i9 == 2) {
                            contentAlignment = DivGallery.ContentAlignment.START;
                        } else if (i9 == 3) {
                            contentAlignment = DivGallery.ContentAlignment.CENTER;
                        } else {
                            if (i9 != 4) {
                                w511.b();
                                return;
                            }
                            contentAlignment = DivGallery.ContentAlignment.END;
                        }
                    }
                    contentAlignment = (DivGallery.ContentAlignment) expression.a(rvoVar);
                    i6 = measuredHeight - (i4 - i2);
                    int i10 = srk.a[contentAlignment.ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i6 /= 2;
                        } else if (i10 != 3) {
                            w511.b();
                            return;
                        }
                        g(i + i5, i2 + i6, i3 + i5, i4 + i6, view);
                        k(view, false);
                        if (z) {
                            return;
                        }
                        s().remove(view);
                        return;
                    }
                }
                i6 = 0;
                g(i + i5, i2 + i6, i3 + i5, i4 + i6, view);
                k(view, false);
                if (z) {
                }
            }
        }
        i5 = 0;
        if (D == 0) {
        }
        i6 = 0;
        g(i + i5, i2 + i6, i3 + i5, i4 + i6, view);
        k(view, false);
        if (z) {
        }
    }

    int e();

    void g(int i, int i2, int i3, int i4, View view);

    aw5 getBindingContext();

    DivGallery getDiv();

    RecyclerView getView();

    void i(int i, ScrollPosition scrollPosition);

    void j(int i, int i2, ScrollPosition scrollPosition);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.yandex.div.core.view2.i] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.yandex.div.core.view2.Div2View] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.yandex.div.core.view2.i] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    default void k(View view, boolean z) {
        msk mskVar;
        aw5 bindingContext;
        int B = B(view);
        if (B == -1) {
            return;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        if (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            mskVar = childAt;
            if (childAt == null) {
                ny61.s();
                return;
            }
        } else {
            mskVar = 0;
        }
        if (mskVar == 0) {
            return;
        }
        ?? r1 = getBindingContext().a;
        if (!z) {
            cxk y = y(B);
            if (y == null) {
                return;
            }
            m3k m3kVar = y.a;
            r1.getDiv2Component().G().h(getBindingContext().a(y.b), mskVar, m3kVar);
            r1.bindViewToDiv$div_release(mskVar, m3kVar);
            return;
        }
        m3k takeBindingDiv$div_release = r1.takeBindingDiv$div_release(mskVar);
        if (takeBindingDiv$div_release == null) {
            return;
        }
        msk mskVar2 = mskVar instanceof msk ? mskVar : null;
        if (mskVar2 == null || (bindingContext = mskVar2.getBindingContext()) == null) {
            return;
        }
        r1.getDiv2Component().G().d(bindingContext, mskVar, takeBindingDiv$div_release);
        r1.unbindViewFromDiv$div_release(mskVar);
    }

    default void n() {
        Iterator it = s().iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            c(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
        }
        s().clear();
    }

    default void q(final int i, final int i2, final ScrollPosition scrollPosition) {
        RecyclerView view = getView();
        if (!ffx.V(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper$instantScroll$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    int i3 = i;
                    urk urkVar = this;
                    if (i3 == 0) {
                        int i4 = (urkVar.D() == 0 && ffx.W(this.getView())) ? i2 : -i2;
                        this.getView().scrollBy(i4, i4);
                        return;
                    }
                    urkVar.getView().scrollBy(-this.getView().getScrollX(), -this.getView().getScrollY());
                    RecyclerView.e layoutManager = this.getView().getLayoutManager();
                    View X = layoutManager != null ? layoutManager.X(i) : null;
                    while (X == null && (this.getView().canScrollVertically(1) || this.getView().canScrollHorizontally(1))) {
                        RecyclerView.e layoutManager2 = this.getView().getLayoutManager();
                        if (layoutManager2 != null) {
                            layoutManager2.i1();
                        }
                        RecyclerView.e layoutManager3 = this.getView().getLayoutManager();
                        X = layoutManager3 != null ? layoutManager3.X(i) : null;
                        if (X != null) {
                            break;
                        } else {
                            this.getView().scrollBy(this.getView().getWidth(), this.getView().getHeight());
                        }
                    }
                    if (X != null) {
                        int i5 = trk.a[scrollPosition.ordinal()];
                        if (i5 != 1) {
                            if (i5 != 2) {
                                return;
                            }
                            int t = this.t(X) - i2;
                            if (ffx.W(this.getView())) {
                                t = -t;
                            }
                            this.getView().scrollBy(t, t);
                            return;
                        }
                        int[] iArr = {0, 0};
                        int[] iArr2 = {0, 0};
                        this.getView().getLocationOnScreen(iArr2);
                        X.getLocationOnScreen(iArr);
                        this.getView().scrollBy(((X.getWidth() - this.getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((X.getHeight() - this.getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
                    }
                }
            });
            return;
        }
        if (i == 0) {
            if (D() != 0 || !ffx.W(getView())) {
                i2 = -i2;
            }
            getView().scrollBy(i2, i2);
            return;
        }
        getView().scrollBy(-getView().getScrollX(), -getView().getScrollY());
        RecyclerView.e layoutManager = getView().getLayoutManager();
        View X = layoutManager != null ? layoutManager.X(i) : null;
        while (X == null && (getView().canScrollVertically(1) || getView().canScrollHorizontally(1))) {
            RecyclerView.e layoutManager2 = getView().getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.i1();
            }
            RecyclerView.e layoutManager3 = getView().getLayoutManager();
            X = layoutManager3 != null ? layoutManager3.X(i) : null;
            if (X != null) {
                break;
            } else {
                getView().scrollBy(getView().getWidth(), getView().getHeight());
            }
        }
        if (X != null) {
            int i3 = trk.a[scrollPosition.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                int t = t(X) - i2;
                if (ffx.W(getView())) {
                    t = -t;
                }
                getView().scrollBy(t, t);
                return;
            }
            int[] iArr = {0, 0};
            int[] iArr2 = {0, 0};
            getView().getLocationOnScreen(iArr2);
            X.getLocationOnScreen(iArr);
            getView().scrollBy(((X.getWidth() - getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((X.getHeight() - getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
        }
    }

    HashSet s();

    default int t(View view) {
        int i;
        int paddingTop;
        if (D() == 0) {
            int width = ffx.W(view) ? getView().getWidth() - view.getRight() : view.getLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            i = width - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            paddingTop = getView().getPaddingStart();
        } else {
            int top = view.getTop();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i = top - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            paddingTop = getView().getPaddingTop();
        }
        return i - paddingTop;
    }

    int width();

    RecyclerView.e x();

    cxk y(int i);
}
