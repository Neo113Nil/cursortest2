package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;

/* loaded from: classes4.dex */
public final class qbo {
    public static final HashSet d = u4r0.c("mc.yandex.ru");
    public static final HashSet e = u4r0.c("esia-portal1.test.gosuslugi.ru", "esia.gosuslugi.ru", "gosuslugi.ru", "www.gosuslugi.ru", "esia-dev.test.gosuslugi.ru", "www.esia-dev.test.gosuslugi.ru", "www.esia-portal1.test.gosuslugi.ru", "www.esia.gosuslugi.ru", "download.gosuslugi.ru", "www2.gosuslugi.ru", "epgu.gosuslugi.ru", "roles.gosuslugi.ru", "map.gosuslugi.ru", "oplata.gosuslugi.ru", "lk.gosuslugi.ru", "new.gosuslugi.ru", "beta.gosuslugi.ru", "af.gosuslugi.ru");
    public static final HashSet f = u4r0.c("", "/registration", "/recovery", "/esia-help", "/help/faq/c-1", "/registration/policiesTerms.xhtml", "/registration/policiesPrivacy.xhtml", "/feedback", "/map/co", "/notify/v1/gov/link", "/sso-max-support/api/public/v1/qr", "/c/qnlkt9");
    public static final Regex g = new Regex(".*(\\.(bmp|gif|jpe?g|png|tiff?|mid|mp2|mp3|mp4|wav|avi|woff|woff2|svg|css|mov|mpeg|ram|m4v|pdf|rm|smil|wmv|swf|wma|zip|rar|gz|tar|ico))$", RegexOption.IGNORE_CASE);
    public static final List h = Collections.singletonList("_incapsula_resource");
    public final h9e a;
    public final IKeyStorage b;
    public String c = "";

    public qbo(h9e h9eVar, IKeyStorage iKeyStorage) {
        this.a = h9eVar;
        this.b = iKeyStorage;
    }
}
