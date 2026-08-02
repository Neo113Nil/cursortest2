package ru.yandex.taxi.web.deeplink;

import defpackage.b64;
import defpackage.gs21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.smw0;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.xn11;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/web/deeplink/WebViewFromDeeplinkExperiment;", "Lxn11;", "Companion", "a", "AuthVariant", "ru/yandex/taxi/web/deeplink/d", "hq41", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class WebViewFromDeeplinkExperiment implements xn11 {
    public static final d Companion = new d();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gs21(27))};
    public static final WebViewFromDeeplinkExperiment d = new WebViewFromDeeplinkExperiment(0);
    public static final a e = new a(0);
    public final List b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/web/deeplink/WebViewFromDeeplinkExperiment$AuthVariant;", "", "", "authVariantName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "ru/yandex/taxi/web/deeplink/c", JCP.RAW_PREFIX, IDialogId.INTENT_EXTRA_IN_HEADER, "PASSPORT", "PASSPORT_WITH_HEADER", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AuthVariant {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AuthVariant[] $VALUES;
        public static final c Companion;
        public static final AuthVariant HEADER;
        public static final AuthVariant NONE;
        public static final AuthVariant PASSPORT;
        public static final AuthVariant PASSPORT_WITH_HEADER;
        private final String authVariantName;

        static {
            AuthVariant authVariant = new AuthVariant(JCP.RAW_PREFIX, 0, "none");
            NONE = authVariant;
            AuthVariant authVariant2 = new AuthVariant(IDialogId.INTENT_EXTRA_IN_HEADER, 1, "header");
            HEADER = authVariant2;
            AuthVariant authVariant3 = new AuthVariant("PASSPORT", 2, "passport");
            PASSPORT = authVariant3;
            AuthVariant authVariant4 = new AuthVariant("PASSPORT_WITH_HEADER", 3, "passportWithHeader");
            PASSPORT_WITH_HEADER = authVariant4;
            AuthVariant[] authVariantArr = {authVariant, authVariant2, authVariant3, authVariant4};
            $VALUES = authVariantArr;
            $ENTRIES = kotlin.enums.a.a(authVariantArr);
            Companion = new c();
        }

        public AuthVariant(String str, int i, String str2) {
            this.authVariantName = str2;
        }

        public static AuthVariant valueOf(String str) {
            return (AuthVariant) Enum.valueOf(AuthVariant.class, str);
        }

        public static AuthVariant[] values() {
            return (AuthVariant[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final String getAuthVariantName() {
            return this.authVariantName;
        }
    }

    public /* synthetic */ WebViewFromDeeplinkExperiment(int i, List list) {
        if ((i & 1) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final a a(String str) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((a) obj).a, str)) {
                break;
            }
        }
        a aVar = (a) obj;
        return aVar == null ? e : aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebViewFromDeeplinkExperiment) && jl40.l(this.b, ((WebViewFromDeeplinkExperiment) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return tse0.k("WebViewFromDeeplinkExperiment(urlWithIds=", Extension.C_BRAKE, this.b);
    }

    public WebViewFromDeeplinkExperiment(int i) {
        this.b = EmptyList.a;
    }

    public WebViewFromDeeplinkExperiment() {
        this(0);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/web/deeplink/WebViewFromDeeplinkExperiment$a;", "", "Companion", "ru/yandex/taxi/web/deeplink/e", "ru/yandex/taxi/web/deeplink/f", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final f Companion = new f();
        public final String a;
        public final String b;
        public final boolean c;
        public final String d;
        public final boolean e;
        public final boolean f;

        public /* synthetic */ a(int i, String str, String str2, boolean z, String str3, boolean z2, boolean z3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = false;
            } else {
                this.e = z2;
            }
            if ((i & 32) == 0) {
                this.f = false;
            } else {
                this.f = z3;
            }
        }

        public static a a(a aVar, String str) {
            String str2 = aVar.a;
            boolean z = aVar.c;
            String str3 = aVar.d;
            boolean z2 = aVar.e;
            boolean z3 = aVar.f;
            aVar.getClass();
            return new a(str2, str, str3, z, z2, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && this.c == aVar.c && jl40.l(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + unr0.e(unr0.b(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder v = b64.v("UrlWithId(id=", this.a, ", url=", this.b, ", addHeaderTaxiUserId=");
            unr0.A(", auth=", this.d, ", restoreEdaSuperApp=", v, this.c);
            return smw0.k(", showOnCommitVisible=", Extension.C_BRAKE, v, this.e, this.f);
        }

        public a() {
            this(0);
        }

        public a(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
            this.e = z2;
            this.f = z3;
        }

        public /* synthetic */ a(int i) {
            this("", "", "", false, false, false);
        }
    }
}
