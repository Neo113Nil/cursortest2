package defpackage;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.yandex.mob.network.MobNetworkErrorType;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes11.dex */
public abstract class umb1 {
    public static final SpannedString a(CharSequence charSequence, Drawable drawable) {
        CustomImageSpan customImageSpan = new CustomImageSpan(drawable, 0, true, false, null, 26, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.setSpan(customImageSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }

    public static final MobNetworkErrorType b(gq20 gq20Var) {
        if (gq20Var instanceof fq20) {
            return ((fq20) gq20Var).a;
        }
        return null;
    }

    public static apy0 c() {
        return apy0.c;
    }
}
