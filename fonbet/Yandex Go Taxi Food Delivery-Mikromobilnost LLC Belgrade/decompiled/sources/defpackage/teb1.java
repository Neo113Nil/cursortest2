package defpackage;

import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.yandex.plus.home.common.utils.PlusClickableSpan;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class teb1 {
    public static final void a(SpannableStringBuilder spannableStringBuilder, String str, Integer num, sls slsVar) {
        Object[] objArr = {new PlusClickableSpan(true, slsVar), num != null ? new ForegroundColorSpan(num.intValue()) : null};
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        Iterator it = j73.A(objArr).iterator();
        while (it.hasNext()) {
            spannableStringBuilder.setSpan(it.next(), length, spannableStringBuilder.length(), 33);
        }
    }

    public static void b(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static final boolean c(List list) {
        if (list == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof bry)) {
                return false;
            }
        }
        return true;
    }
}
