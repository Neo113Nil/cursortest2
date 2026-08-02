package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class je0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ AndroidComposeView s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je0(AndroidComposeView androidComposeView, int i) {
        super(1);
        this.r = i;
        this.s = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        loc locVar;
        switch (this.r) {
            case 0:
                int i = ((sne) obj).a;
                AndroidComposeView androidComposeView = this.s;
                boolean z = true;
                if (i == 1) {
                    z = androidComposeView.isInTouchMode();
                } else if (i != 2) {
                    z = false;
                } else if (androidComposeView.isInTouchMode()) {
                    z = androidComposeView.requestFocusFromTouch();
                }
                return Boolean.valueOf(z);
            case 1:
                KeyEvent keyEvent = ((qaf) obj).a;
                AndroidComposeView androidComposeView2 = this.s;
                int[] iArr = androidComposeView2.x0;
                long R = saf.R(keyEvent);
                if (faf.a(R, faf.g)) {
                    locVar = new loc(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (faf.a(R, faf.e)) {
                    locVar = new loc(4);
                } else if (faf.a(R, faf.d)) {
                    locVar = new loc(3);
                } else {
                    locVar = faf.a(R, faf.b) ? true : faf.a(R, faf.k) ? new loc(5) : faf.a(R, faf.c) ? true : faf.a(R, faf.l) ? new loc(6) : faf.a(R, faf.f) ? true : faf.a(R, faf.i) ? true : faf.a(R, faf.m) ? new loc(7) : faf.a(R, faf.a) ? true : faf.a(R, faf.j) ? new loc(8) : null;
                }
                if (locVar != null) {
                    int i2 = locVar.a;
                    if (saf.U(keyEvent) == 2) {
                        Integer K = yd5.K(i2);
                        ynn y = androidComposeView2.y();
                        Boolean d = ((uoc) androidComposeView2.getFocusOwner()).d(i2, y, new oe0(locVar, 1));
                        if (d != null ? d.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i2 == 1 || i2 == 2)) {
                            return Boolean.FALSE;
                        }
                        if (K != null) {
                            int intValue = K.intValue();
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View view = androidComposeView2;
                            while (true) {
                                if (view != null) {
                                    View rootView = androidComposeView2.getRootView();
                                    rootView.getClass();
                                    view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
                                    if (view != null) {
                                        if (!view.equals(androidComposeView2)) {
                                            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == androidComposeView2) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    view = null;
                                }
                            }
                            if (Intrinsics.d(view, androidComposeView2)) {
                                view = null;
                            }
                            if (view != null) {
                                Rect D = y != null ? uwf.D(y) : null;
                                if (D == null) {
                                    xq0.q("Invalid rect");
                                    return null;
                                }
                                view.getLocationInWindow(iArr);
                                int i3 = iArr[0];
                                int i4 = iArr[1];
                                androidComposeView2.getLocationInWindow(iArr);
                                D.offset(iArr[0] - i3, iArr[1] - i4);
                                if (yd5.H(view, K, D)) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((uoc) androidComposeView2.getFocusOwner()).b(i2, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean d2 = ((uoc) androidComposeView2.getFocusOwner()).d(i2, null, new oe0(locVar, 0));
                        return Boolean.valueOf(d2 != null ? d2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            case 2:
                Function0 function0 = (Function0) obj;
                AndroidComposeView androidComposeView3 = this.s;
                Handler handler = androidComposeView3.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = androidComposeView3.getHandler();
                    if (handler2 != null) {
                        handler2.post(new ti(1, function0));
                    }
                }
                return Unit.a;
            default:
                AndroidComposeView androidComposeView4 = this.s;
                return new th0(androidComposeView4, androidComposeView4.getTextInputService(), (mm6) obj);
        }
    }
}
