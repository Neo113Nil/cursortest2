package ru.yandex.taxi.stories.presentation.story;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import defpackage.bmu0;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jl40;
import defpackage.q5z;
import defpackage.qeb1;
import defpackage.tje;
import defpackage.xby;
import defpackage.zxs0;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;

/* loaded from: classes6.dex */
public final class h {
    public final ru.yandex.taxi.widget.c a;
    public final i3y b = kotlin.a.a(new bmu0(9));

    public h(ru.yandex.taxi.widget.c cVar) {
        this.a = cVar;
    }

    public final zxs0 a(ike ikeVar, TypedContentWidget typedContentWidget) {
        int parseInt;
        if (typedContentWidget == null) {
            return new zxs0("", r0);
        }
        String str = typedContentWidget.a;
        FormattedText formattedText = typedContentWidget.d;
        if (formattedText.d()) {
            return new zxs0(ru.yandex.taxi.widget.c.f(this.a, formattedText, false, null, 14), formattedText.e() ? null : tje.h(ikeVar, null, null, new StoryTextInteractor$deferredFormattedText$1(this, formattedText, null), 3));
        }
        Spanned c = qeb1.c(str);
        Matcher matcher = ((Pattern) this.b.getValue()).matcher(str);
        Spanned spanned = c;
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            if (group2 != null) {
                try {
                    parseInt = Integer.parseInt(group2);
                } catch (NumberFormatException e) {
                    xby.d.k(e, String.format("invalid font size: %s", Arrays.copyOf(new Object[]{group2}, 1)));
                }
                spanned = c;
                spanned = c;
                if (jl40.l(group, group3) && parseInt > 0) {
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(c);
                    valueOf.setSpan(new AbsoluteSizeSpan(parseInt, true), 0, valueOf.length(), 33);
                    spanned = valueOf;
                }
            }
            parseInt = 0;
            spanned = c;
            spanned = c;
            if (jl40.l(group, group3)) {
                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(c);
                valueOf2.setSpan(new AbsoluteSizeSpan(parseInt, true), 0, valueOf2.length(), 33);
                spanned = valueOf2;
            }
        }
        String str2 = typedContentWidget.b;
        Spanned spanned2 = spanned;
        if (str2 != null) {
            Integer S = q5z.S(str2);
            spanned2 = spanned;
            if (S != null) {
                SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(spanned);
                valueOf3.setSpan(new ForegroundColorSpan(S.intValue()), 0, valueOf3.length(), 33);
                spanned2 = valueOf3;
            }
        }
        return new zxs0(spanned2, r0);
    }
}
