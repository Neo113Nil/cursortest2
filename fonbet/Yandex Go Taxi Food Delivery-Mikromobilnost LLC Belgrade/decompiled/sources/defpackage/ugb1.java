package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.repository.api.model.offers.Price;
import com.ybsdk.core.utils.image.CenteredImageSpan;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ugb1 {
    public static final uju0 a(List list, List list2) {
        List<sju0> list3 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        for (sju0 sju0Var : list3) {
            String str = sju0Var.a;
            ArrayList<rju0> arrayList2 = sju0Var.b;
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            for (rju0 rju0Var : arrayList2) {
                String str2 = rju0Var.a;
                Price price = rju0Var.b;
                arrayList3.add(new e0g0(str2, new nze0(price.getAmount(), price.getCurrency()), qje.c0(Integer.valueOf(rju0Var.c))));
            }
            arrayList.add(new tju0(str, arrayList3));
        }
        List<ykv> list4 = list2;
        ArrayList arrayList4 = new ArrayList(tcc.n(list4, 10));
        for (ykv ykvVar : list4) {
            arrayList4.add(new zkv(ykvVar.b, ykvVar.c, ykvVar.a));
        }
        return new uju0(qje.c0(arrayList4), arrayList);
    }

    public static final SpannableString b(String str, Drawable drawable, int i) {
        CenteredImageSpan centeredImageSpan = new CenteredImageSpan(drawable, i);
        SpannableString spannableString = new SpannableString(str.concat(" "));
        spannableString.setSpan(centeredImageSpan, spannableString.length() - 1, spannableString.length(), 17);
        return spannableString;
    }

    public static final SpannedString c(LogPriority logPriority, Context context) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        switch (jlz.a[logPriority.ordinal()]) {
            case 1:
                i = vpg0.pay_sdk_log_verbose_color;
                break;
            case 2:
                i = vpg0.pay_sdk_log_debug_color;
                break;
            case 3:
                i = vpg0.pay_sdk_log_info_color;
                break;
            case 4:
                i = vpg0.pay_sdk_log_warning_color;
                break;
            case 5:
                i = vpg0.pay_sdk_log_error_color;
                break;
            case 6:
                i = vpg0.pay_sdk_log_assert_color;
                break;
            default:
                w511.b();
                return null;
        }
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(context.getColor(i));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) logPriority.name());
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }
}
