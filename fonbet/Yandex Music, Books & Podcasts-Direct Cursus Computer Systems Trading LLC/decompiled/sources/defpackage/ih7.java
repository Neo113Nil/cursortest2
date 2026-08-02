package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public abstract class ih7 {
    public static final ArrayList a;

    static {
        w6n w6nVar = uqq.a;
        List<String> h = u75.h("yandexmusic://", "https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/");
        ArrayList arrayList = new ArrayList();
        for (String str : h) {
            Regex regex = new Regex(hrg.q("(", str, ")landing/main\\?.*tab=foryou(?:&|$).*"));
            w6n w6nVar2 = uqq.a;
            z75.t(arrayList, u75.h(new duo(regex.a, "$1landing/mobile_foryou", w6nVar2), new duo(new Regex(hrg.q("(", str, ")landing/main\\?.*tab=popular(?:&|$).*")).a, "$1landing/mobile_popular", w6nVar2), new duo(new Regex(hrg.q("(", str, ")landing/main.*")).a, "$1landing/mobile_foryou", w6nVar2)));
        }
        List<String> h2 = u75.h("yandexmusic://", "https://music\\.(?:yandex|ya)\\.(?:by|ru|ua|kz|com|uz)/");
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : h2) {
            Pattern pattern = new Regex(hrg.q("(", str2, ")home/popular\\?.*")).a;
            x6n x6nVar = x6n.a;
            z75.t(arrayList2, u75.h(new duo(pattern, "$1landing/mobile_popular", x6nVar), new duo(new Regex(hrg.q("(", str2, ")home/foryou\\?.*")).a, "$1home", x6nVar)));
        }
        a = v75.p(u75.h(arrayList, arrayList2));
    }
}
