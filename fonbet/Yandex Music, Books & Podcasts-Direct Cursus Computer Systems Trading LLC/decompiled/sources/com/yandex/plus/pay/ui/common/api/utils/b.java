package com.yandex.plus.pay.ui.common.api.utils;

import android.text.SpannableStringBuilder;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.b5b;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.jhp;
import defpackage.nrn;
import defpackage.o7t;
import defpackage.tah;
import defpackage.v75;
import defpackage.xq0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;

/* loaded from: classes5.dex */
public abstract class b {
    public static final LinkedHashMap a(PlusPayRichText plusPayRichText) {
        List<PlusPayRichText.Item> items = plusPayRichText.getItems();
        int a = tah.a(v75.o(items, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : items) {
            linkedHashMap.put("{{" + ((PlusPayRichText.Item) obj).getKey() + "}}", obj);
        }
        return linkedHashMap;
    }

    public static final String b(PlusPayRichText plusPayRichText) {
        plusPayRichText.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(plusPayRichText.getText());
        for (Map.Entry entry : a(plusPayRichText).entrySet()) {
            String str = (String) entry.getKey();
            PlusPayRichText.Item item = (PlusPayRichText.Item) entry.getValue();
            List<IntRange> k = jhp.k(new o7t(Regex.c(new Regex(str, nrn.LITERAL), spannableStringBuilder), a.b));
            if (!(item instanceof PlusPayRichText.Item.Icon) && !(item instanceof PlusPayRichText.Item.TextColor) && !(item instanceof PlusPayRichText.Item.Highlight) && !(item instanceof PlusPayRichText.Item.Link) && !(item instanceof PlusPayRichText.Item.Strikethrough) && !(item instanceof PlusPayRichText.Item.Text)) {
                b6e.s();
                return null;
            }
            String data = item.getData();
            if (data == null) {
                data = item.getAltText();
            }
            if (data == null) {
                xq0.x("error ");
                return null;
            }
            c5b c5bVar = c5b.a;
            for (IntRange intRange : k) {
                spannableStringBuilder.replace(intRange.a, intRange.b + 1, (CharSequence) data);
                int i = intRange.a;
                new IntRange(i, data.length() + i, 1);
                c5bVar.getClass();
                b5b.a.getClass();
            }
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        spannableStringBuilder2.getClass();
        return spannableStringBuilder2;
    }
}
