package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.sequences.b;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes6.dex */
public abstract class xeb1 {
    public static au2 a;

    public static boolean a(View view) {
        int i;
        if (!(view.getLayoutParams() instanceof FrameLayout.LayoutParams) || (i = ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity) == -1) {
            i = 8388613;
        }
        return (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 7) == 5;
    }

    public static final String b(Spanned spanned, dmt0 dmt0Var) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < spanned.length()) {
            int nextSpanTransition = spanned.nextSpanTransition(i, spanned.length(), CharacterStyle.class);
            List s = b.s(b.k(b.g(new e2k(2, j73.v(spanned.getSpans(i, nextSpanTransition, CharacterStyle.class)), new pzo(5, spanned)), new is8(spanned, i, 15)), new p9t0(4, dmt0Var)));
            Iterator it = s.iterator();
            while (it.hasNext()) {
                sb.append("<" + ((String) it.next()) + ">");
            }
            sb.append(TextUtils.htmlEncode(spanned.subSequence(i, nextSpanTransition).toString()));
            Iterator it2 = new u1l(2, s).iterator();
            while (true) {
                ListIterator listIterator = ((t2k0) it2).a;
                if (listIterator.hasPrevious()) {
                    String str = (String) listIterator.previous();
                    sb.append("</" + evu0.f0(HexString.CHAR_SPACE, str, str) + ">");
                }
            }
            i = nextSpanTransition;
        }
        return sb.toString();
    }
}
