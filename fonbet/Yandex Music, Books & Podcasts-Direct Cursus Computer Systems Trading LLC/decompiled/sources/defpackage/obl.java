package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final /* synthetic */ class obl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sbl b;

    public /* synthetic */ obl(sbl sblVar, int i) {
        this.a = i;
        this.b = sblVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i = this.a;
        sbl sblVar = this.b;
        switch (i) {
            case 0:
                View view = sblVar.j;
                ViewGroup viewGroup = sblVar.e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(sblVar.A ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = sblVar.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (sblVar.A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof ns7) {
                        ns7 ns7Var = (ns7) view;
                        Rect rect = ns7Var.a;
                        ValueAnimator valueAnimator = ns7Var.E;
                        if (sblVar.A) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            ns7Var.G = true;
                            ns7Var.F = 0.0f;
                            ns7Var.invalidate(rect);
                        } else {
                            int i2 = sblVar.z;
                            if (i2 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                ns7Var.G = false;
                                ns7Var.F = 0.0f;
                                ns7Var.invalidate(rect);
                            } else if (i2 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                ns7Var.G = false;
                                ns7Var.F = 1.0f;
                                ns7Var.invalidate(rect);
                            }
                        }
                    }
                }
                Iterator it = sblVar.y.iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    view2.setVisibility((sblVar.A && sbl.j(view2)) ? 4 : 0);
                }
                break;
            case 1:
                ValueAnimator valueAnimator2 = sblVar.r;
                View view3 = sblVar.k;
                nbl nblVar = sblVar.a;
                ViewGroup viewGroup2 = sblVar.g;
                ViewGroup viewGroup3 = sblVar.f;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (nblVar.getWidth() - nblVar.getPaddingLeft()) - nblVar.getPaddingRight();
                    while (viewGroup2.getChildCount() > 1) {
                        int childCount = viewGroup2.getChildCount() - 2;
                        View childAt = viewGroup2.getChildAt(childCount);
                        viewGroup2.removeViewAt(childCount);
                        viewGroup3.addView(childAt, 0);
                    }
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    int c = sbl.c(sblVar.i);
                    int childCount2 = viewGroup3.getChildCount() - 1;
                    for (int i3 = 0; i3 < childCount2; i3++) {
                        c += sbl.c(viewGroup3.getChildAt(i3));
                    }
                    if (c <= width) {
                        ViewGroup viewGroup4 = sblVar.h;
                        if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                            sblVar.q.cancel();
                            valueAnimator2.start();
                            break;
                        }
                    } else {
                        if (view3 != null) {
                            view3.setVisibility(0);
                            c += sbl.c(view3);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i4 = 0; i4 < childCount2; i4++) {
                            View childAt2 = viewGroup3.getChildAt(i4);
                            c -= sbl.c(childAt2);
                            arrayList.add(childAt2);
                            if (c <= width) {
                                if (arrayList.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList.size());
                                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                        viewGroup2.addView((View) arrayList.get(i5), viewGroup2.getChildCount() - 1);
                                    }
                                    break;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                        }
                    }
                }
                break;
            case 2:
                sblVar.k();
                break;
            case 3:
                sblVar.n.start();
                break;
            case 4:
                sblVar.m.start();
                break;
            case 5:
                sblVar.l.start();
                sblVar.e(sblVar.u, 2000L);
                break;
            default:
                sblVar.i(2);
                break;
        }
    }
}
