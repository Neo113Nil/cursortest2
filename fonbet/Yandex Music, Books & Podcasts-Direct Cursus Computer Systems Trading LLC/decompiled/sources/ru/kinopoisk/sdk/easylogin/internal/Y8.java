package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.jhp;
import defpackage.n8g;
import defpackage.o7t;
import defpackage.t75;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1258v5;

/* loaded from: classes5.dex */
public final class Y8 implements F {

    @NotNull
    public static final a e = new a(null);
    public static volatile Y8 f;
    public final String a;

    @NotNull
    public final C1258v5 b;

    @NotNull
    public final List<C1258v5> c;
    public C1258v5 d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/Y8$a;", "", "Lru/kinopoisk/sdk/easylogin/internal/Y8;", "_instance", "Lru/kinopoisk/sdk/easylogin/internal/Y8;", "libs_android_utils_common"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Y8(@NotNull String str, @NotNull String[] strArr, String str2) {
        str.getClass();
        strArr.getClass();
        this.a = str2;
        C1258v5.c.getClass();
        C1258v5 a2 = C1258v5.a.a(str);
        this.b = a2;
        List c = t75.c(a2);
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str3 : strArr) {
            C1258v5.c.getClass();
            arrayList.add(C1258v5.a.a(str3));
        }
        this.c = CollectionsKt.g0(c, arrayList);
    }

    public static Context a(Y8 y8, T t, Context context) {
        Iterable a2;
        t.getClass();
        context.getClass();
        Configuration configuration = context.getResources().getConfiguration();
        configuration.getClass();
        String str = y8.a;
        if (str == null || str.length() == 0) {
            LocaleList locales = configuration.getLocales();
            locales.getClass();
            n8g b = t75.b();
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                String language = locales.get(i).getLanguage();
                language.getClass();
                b.add(language);
            }
            a2 = t75.a(b);
        } else {
            a2 = t75.c(Locale.forLanguageTag(y8.a).getLanguage());
        }
        C1258v5 c1258v5 = (C1258v5) jhp.f(jhp.e(new o7t(CollectionsKt.F(a2), new Z8(y8))));
        if (c1258v5 == null) {
            c1258v5 = y8.b;
        }
        y8.d = c1258v5;
        LocaleList localeList = new LocaleList(c1258v5.a);
        if (!Intrinsics.d(LocaleList.getDefault(), localeList)) {
            LocaleList.setDefault(localeList);
        }
        return context;
    }
}
