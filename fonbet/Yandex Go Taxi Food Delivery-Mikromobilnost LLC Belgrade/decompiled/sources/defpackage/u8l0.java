package defpackage;

import android.text.SpannableStringBuilder;
import kotlin.Pair;
import ru.yandex.taxi.utils.StyledTypefaceSpan;

/* loaded from: classes6.dex */
public final class u8l0 {
    public final x9l0 a;
    public final ck31 b;
    public final zuj0 c;
    public final tt2 d;
    public final w0c0 e;
    public final a3v f;
    public final Pair g = new Pair(null, Boolean.FALSE);

    public u8l0(x9l0 x9l0Var, ck31 ck31Var, zuj0 zuj0Var, tt2 tt2Var, w0c0 w0c0Var, a3v a3vVar) {
        this.a = x9l0Var;
        this.b = ck31Var;
        this.c = zuj0Var;
        this.d = tt2Var;
        this.e = w0c0Var;
        this.f = a3vVar;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        int length2 = spannableStringBuilder.length();
        int[] iArr = up11.a;
        spannableStringBuilder.setSpan(new StyledTypefaceSpan(eja1.w(3, 0), 0, 2, null), length, length2, 33);
    }
}
