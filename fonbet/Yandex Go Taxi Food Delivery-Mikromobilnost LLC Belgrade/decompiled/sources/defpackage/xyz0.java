package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import ru.yandex.taxi.utils.TouchDelegateComposite;

/* loaded from: classes15.dex */
public final class xyz0 {
    public static void a(View view, TouchDelegate touchDelegate, View view2) {
        TouchDelegate touchDelegate2 = view.getTouchDelegate();
        if (touchDelegate2 == null) {
            view.setTouchDelegate(touchDelegate);
            return;
        }
        if (touchDelegate2 instanceof TouchDelegateComposite) {
            jst.e.getClass();
            ((TouchDelegateComposite) touchDelegate2).addDelegate(touchDelegate);
        } else {
            jst.e.getClass();
            TouchDelegateComposite touchDelegateComposite = new TouchDelegateComposite(view2);
            touchDelegateComposite.addDelegate(touchDelegate2);
            touchDelegateComposite.addDelegate(touchDelegate);
        }
    }

    public static void b(ViewGroup viewGroup, int i, View... viewArr) {
        if (viewArr.length == 0) {
            jst.e.getClass();
        } else {
            View view = viewArr[0];
            view.post(new mbb(viewArr, viewGroup, view.getContext().getResources().getDimensionPixelOffset(i), view, 6));
        }
    }

    public static TouchDelegate c(int i, View view, ViewGroup viewGroup) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        viewGroup.offsetDescendantRectToMyCoords((View) view.getParent(), rect);
        rect.top -= i;
        rect.left -= i;
        rect.bottom += i;
        rect.right += i;
        return new TouchDelegate(rect, view);
    }
}
