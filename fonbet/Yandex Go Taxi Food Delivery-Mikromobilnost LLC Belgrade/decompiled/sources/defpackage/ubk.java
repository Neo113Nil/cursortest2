package defpackage;

import android.view.inputmethod.InputMethodManager;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.Expression;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class ubk implements nbk {
    public static void b(Div2View div2View, String str) {
        div2View.logError(new RuntimeException("Failed to handle set_cursor_action", new IllegalArgumentException(str)));
    }

    public static Integer c(int i, long j) {
        if (0 <= j && j <= i) {
            long j2 = j >> 31;
            return Integer.valueOf((j2 == 0 || j2 == -1) ? (int) j : j > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        }
        if (j == -1) {
            return Integer.valueOf(i);
        }
        return null;
    }

    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, Div2View div2View, rvo rvoVar) {
        int i;
        if (!(jbkVar instanceof abk)) {
            return false;
        }
        m8k m8kVar = ((abk) jbkVar).b;
        Expression expression = m8kVar.a;
        l8k l8kVar = m8kVar.b;
        String str2 = (String) expression.a(rvoVar);
        List f = vi91.f(div2View, str2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (obj instanceof DivInputView) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            b(div2View, "No input view with id '" + str2 + '\'');
            return true;
        }
        if (arrayList.size() > 1) {
            b(div2View, "Found multiple input views with id '" + str2 + '\'');
            return true;
        }
        DivInputView divInputView = (DivInputView) a.P(arrayList);
        int length = divInputView.length();
        long longValue = ((Number) l8kVar.b.a(rvoVar)).longValue();
        Integer c = c(length, longValue);
        if (c == null) {
            b(div2View, "Wrong start value " + longValue);
            return true;
        }
        int intValue = c.intValue();
        Expression expression2 = l8kVar.a;
        if (expression2 != null) {
            long longValue2 = ((Number) expression2.a(rvoVar)).longValue();
            Integer c2 = c(length, longValue2);
            if (c2 == null) {
                b(div2View, "Wrong end value " + longValue2);
                return true;
            }
            i = c2.intValue();
        } else {
            i = intValue;
        }
        if (!divInputView.isFocused()) {
            divInputView.requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) divInputView.getContext().getSystemService(InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(divInputView, 1);
            }
        }
        divInputView.setSelection(intValue, i);
        return true;
    }
}
