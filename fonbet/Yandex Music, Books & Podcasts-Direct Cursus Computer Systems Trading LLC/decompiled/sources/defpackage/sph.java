package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.mediarouter.app.OverlayListView;
import com.yandex.plus.webview.api.WebViewContainer;
import com.yandex.plus.webview.internal.insets.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class sph implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    public sph(aqh aqhVar, boolean z) {
        this.c = aqhVar;
        this.b = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                aqh aqhVar = (aqh) this.c;
                aqhVar.t.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                if (aqhVar.L0) {
                    aqhVar.M0 = true;
                    break;
                } else {
                    boolean z = this.b;
                    irh irhVar = aqhVar.i;
                    int i2 = aqhVar.A.getLayoutParams().height;
                    aqh.m(-1, aqhVar.A);
                    aqhVar.s(aqhVar.g());
                    View decorView = aqhVar.getWindow().getDecorView();
                    decorView.measure(View.MeasureSpec.makeMeasureSpec(aqhVar.getWindow().getAttributes().width, 1073741824), 0);
                    aqh.m(i2, aqhVar.A);
                    if (!(aqhVar.u.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) aqhVar.u.getDrawable()).getBitmap()) == null) {
                        i = 0;
                    } else {
                        i = aqhVar.j(bitmap.getWidth(), bitmap.getHeight());
                        aqhVar.u.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
                    }
                    int k = aqhVar.k(aqhVar.g());
                    int size = aqhVar.G.size();
                    int size2 = aqhVar.l() ? Collections.unmodifiableList(irhVar.v).size() * aqhVar.Z : 0;
                    if (size > 0) {
                        size2 += aqhVar.w0;
                    }
                    int min = Math.min(size2, aqhVar.v0);
                    if (!aqhVar.K0) {
                        min = 0;
                    }
                    int max = Math.max(i, min) + k;
                    Rect rect = new Rect();
                    decorView.getWindowVisibleDisplayFrame(rect);
                    int height = rect.height() - (aqhVar.s.getMeasuredHeight() - aqhVar.t.getMeasuredHeight());
                    if (i <= 0 || max > height) {
                        if (aqhVar.A.getMeasuredHeight() + aqhVar.E.getLayoutParams().height >= aqhVar.t.getMeasuredHeight()) {
                            aqhVar.u.setVisibility(8);
                        }
                        max = min + k;
                        i = 0;
                    } else {
                        aqhVar.u.setVisibility(0);
                        aqh.m(i, aqhVar.u);
                    }
                    if (!aqhVar.g() || max > height) {
                        aqhVar.B.setVisibility(8);
                    } else {
                        aqhVar.B.setVisibility(0);
                    }
                    aqhVar.s(aqhVar.B.getVisibility() == 0);
                    int k2 = aqhVar.k(aqhVar.B.getVisibility() == 0);
                    int max2 = Math.max(i, min) + k2;
                    if (max2 > height) {
                        min -= max2 - height;
                    } else {
                        height = max2;
                    }
                    aqhVar.A.clearAnimation();
                    aqhVar.E.clearAnimation();
                    aqhVar.t.clearAnimation();
                    LinearLayout linearLayout = aqhVar.A;
                    if (z) {
                        aqhVar.f(k2, linearLayout);
                        aqhVar.f(min, aqhVar.E);
                        aqhVar.f(height, aqhVar.t);
                    } else {
                        aqh.m(k2, linearLayout);
                        aqh.m(min, aqhVar.E);
                        aqh.m(height, aqhVar.t);
                    }
                    aqh.m(rect.height(), aqhVar.r);
                    List unmodifiableList = Collections.unmodifiableList(irhVar.v);
                    boolean isEmpty = unmodifiableList.isEmpty();
                    ArrayList arrayList = aqhVar.G;
                    if (isEmpty) {
                        arrayList.clear();
                        aqhVar.F.notifyDataSetChanged();
                        break;
                    } else if (new HashSet(arrayList).equals(new HashSet(unmodifiableList))) {
                        aqhVar.F.notifyDataSetChanged();
                        break;
                    } else {
                        if (z) {
                            OverlayListView overlayListView = aqhVar.E;
                            zph zphVar = aqhVar.F;
                            hashMap = new HashMap();
                            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                            for (int i3 = 0; i3 < overlayListView.getChildCount(); i3++) {
                                Object item = zphVar.getItem(firstVisiblePosition + i3);
                                View childAt = overlayListView.getChildAt(i3);
                                hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                            }
                        } else {
                            hashMap = null;
                        }
                        if (z) {
                            Context context = aqhVar.j;
                            OverlayListView overlayListView2 = aqhVar.E;
                            zph zphVar2 = aqhVar.F;
                            hashMap2 = new HashMap();
                            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                            for (int i4 = 0; i4 < overlayListView2.getChildCount(); i4++) {
                                Object item2 = zphVar2.getItem(firstVisiblePosition2 + i4);
                                View childAt2 = overlayListView2.getChildAt(i4);
                                Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                                childAt2.draw(new Canvas(createBitmap));
                                hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
                            }
                        } else {
                            hashMap2 = null;
                        }
                        ArrayList arrayList2 = aqhVar.G;
                        HashSet hashSet = new HashSet(unmodifiableList);
                        hashSet.removeAll(arrayList2);
                        aqhVar.H = hashSet;
                        HashSet hashSet2 = new HashSet(aqhVar.G);
                        hashSet2.removeAll(unmodifiableList);
                        aqhVar.I = hashSet2;
                        aqhVar.G.addAll(0, aqhVar.H);
                        aqhVar.G.removeAll(aqhVar.I);
                        aqhVar.F.notifyDataSetChanged();
                        if (z && aqhVar.K0) {
                            if (aqhVar.I.size() + aqhVar.H.size() > 0) {
                                aqhVar.E.setEnabled(false);
                                aqhVar.E.requestLayout();
                                aqhVar.L0 = true;
                                aqhVar.E.getViewTreeObserver().addOnGlobalLayoutListener(new uph(aqhVar, hashMap, hashMap2));
                                break;
                            }
                        }
                        aqhVar.H = null;
                        aqhVar.I = null;
                        break;
                    }
                }
            default:
                b bVar = (b) this.c;
                WebViewContainer webViewContainer = bVar.a;
                boolean z2 = bVar.a().getVisibility() == 0;
                boolean z3 = this.b;
                if (z2 != z3) {
                    this.b = !z3;
                    if (!z3) {
                        bVar.a();
                    }
                    WebView webView = webViewContainer.getWebView();
                    ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        ViewGroup.LayoutParams layoutParams2 = webViewContainer.getWebView().getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                        int i5 = marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0;
                        ViewGroup.LayoutParams layoutParams3 = webViewContainer.getWebView().getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        int i6 = marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0;
                        ViewGroup.LayoutParams layoutParams4 = webViewContainer.getWebView().getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        marginLayoutParams.setMargins(i5, i6, marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0, 0);
                        webView.setLayoutParams(marginLayoutParams);
                        break;
                    } else {
                        jj4.j("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    }
                }
                break;
        }
    }

    public sph(b bVar) {
        this.c = bVar;
    }
}
