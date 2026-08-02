package defpackage;

import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalytics;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalyticsFactory;

/* loaded from: classes3.dex */
public final class bza implements EasyLoginAnalyticsFactory {
    public final /* synthetic */ gza a;

    public bza(gza gzaVar) {
        this.a = gzaVar;
    }

    @Override // ru.kinopoisk.sdk.easylogin.api.EasyLoginAnalyticsFactory
    public final EasyLoginAnalytics createAnalytics(String str) {
        str.getClass();
        return new aza(this.a, str);
    }
}
