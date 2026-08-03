package y1;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8596g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f8597h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, int i10) {
        super(1);
        this.f8596g = i10;
        this.f8597h = rVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        d1.b bVar;
        boolean requestFocus;
        switch (this.f8596g) {
            case 0:
                KeyEvent keyEvent = ((p1.b) obj).f5424a;
                long d10 = v6.a.d(keyEvent.getKeyCode());
                if (p1.a.a(d10, p1.a.f5409c)) {
                    bVar = new d1.b(2);
                } else if (p1.a.a(d10, p1.a.f5410d)) {
                    bVar = new d1.b(1);
                } else if (p1.a.a(d10, p1.a.f5416j)) {
                    bVar = new d1.b(keyEvent.isShiftPressed() ? 2 : 1);
                } else {
                    bVar = p1.a.a(d10, p1.a.f5414h) ? new d1.b(4) : p1.a.a(d10, p1.a.f5413g) ? new d1.b(3) : (p1.a.a(d10, p1.a.f5411e) || p1.a.a(d10, p1.a.f5419m)) ? new d1.b(5) : (p1.a.a(d10, p1.a.f5412f) || p1.a.a(d10, p1.a.f5420n)) ? new d1.b(6) : (p1.a.a(d10, p1.a.f5415i) || p1.a.a(d10, p1.a.f5417k) || p1.a.a(d10, p1.a.f5421o)) ? new d1.b(7) : (p1.a.a(d10, p1.a.f5408b) || p1.a.a(d10, p1.a.f5418l)) ? new d1.b(8) : null;
                }
                if (bVar != null) {
                    int i10 = bVar.f1568a;
                    if (bc.a0.u(keyEvent) == 2) {
                        Integer num = i10 == 5 ? 33 : i10 == 6 ? 130 : i10 == 3 ? 17 : i10 == 4 ? 66 : i10 == 1 ? 2 : i10 == 2 ? 1 : null;
                        r rVar = this.f8597h;
                        e1.c embeddedViewFocusRect = rVar.getEmbeddedViewFocusRect();
                        Boolean e10 = ((d1.i) rVar.getFocusOwner()).e(i10, embeddedViewFocusRect, new o(bVar, 1));
                        if (e10 != null ? e10.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i10 == 1 || i10 == 2)) {
                            return Boolean.FALSE;
                        }
                        if (num != null) {
                            int intValue = num.intValue();
                            Object obj2 = d1.f8498f.get();
                            pc.j.b(obj2);
                            d1 d1Var = (d1) obj2;
                            View view = rVar;
                            while (true) {
                                if (view != null) {
                                    View rootView = rVar.getRootView();
                                    pc.j.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                    view = d1Var.b(intValue, view, (ViewGroup) rootView);
                                    if (view != null) {
                                        if (!view.equals(rVar)) {
                                            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == rVar) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    view = null;
                                }
                            }
                            if (pc.j.a(view, rVar)) {
                                view = null;
                            }
                            if (view != null) {
                                Rect rect = embeddedViewFocusRect != null ? new Rect((int) embeddedViewFocusRect.f1931a, (int) embeddedViewFocusRect.f1932b, (int) embeddedViewFocusRect.f1933c, (int) embeddedViewFocusRect.f1934d) : null;
                                if (rect == null) {
                                    throw new IllegalStateException("Invalid rect");
                                }
                                View rootView2 = rVar.getRootView();
                                pc.j.c(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
                                ViewGroup viewGroup = (ViewGroup) rootView2;
                                viewGroup.offsetDescendantRectToMyCoords(rVar, rect);
                                viewGroup.offsetRectIntoDescendantCoords(view, rect);
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroup2 = (ViewGroup) view;
                                    if (viewGroup2.isFocused()) {
                                        requestFocus = true;
                                    } else if (viewGroup2.isFocusable() && !viewGroup2.hasFocus()) {
                                        requestFocus = viewGroup2.requestFocus(num.intValue(), rect);
                                    } else if (view instanceof r) {
                                        requestFocus = ((r) view).requestFocus(num.intValue(), rect);
                                    } else {
                                        View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup2, rect, num.intValue());
                                        int intValue2 = num.intValue();
                                        requestFocus = findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(intValue2, rect) : viewGroup2.requestFocus(intValue2, rect);
                                    }
                                } else {
                                    requestFocus = view.requestFocus(num.intValue(), rect);
                                }
                                if (requestFocus) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((d1.i) rVar.getFocusOwner()).b(i10, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean e11 = ((d1.i) rVar.getFocusOwner()).e(i10, null, new o(bVar, 0));
                        return Boolean.valueOf(e11 != null ? e11.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            default:
                oc.a aVar = (oc.a) obj;
                r rVar2 = this.f8597h;
                Handler handler = rVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = rVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new y0.a(aVar, 1));
                    }
                }
                return ac.o.f277a;
        }
    }
}
