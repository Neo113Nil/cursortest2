package ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment;

import defpackage.c6z;
import defpackage.eti;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jgi;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/DeliveryTariffsCommentRedirectionsExperiment;", "Lxn11;", "Lc6z;", "Companion", "b", "a", "ru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/h", "mti", "ScreenDto", "eti", "dti", "explicit_comment_courier"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DeliveryTariffsCommentRedirectionsExperiment implements xn11, c6z {
    public static final eti Companion = new eti();
    public static final i3y[] e;
    public static final DeliveryTariffsCommentRedirectionsExperiment f;
    public final boolean b;
    public final Map c;
    public final List d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/DeliveryTariffsCommentRedirectionsExperiment$ScreenDto;", "", "Companion", "ru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/i", "EXPLICIT_COMMENT", "ADDRESS_DETAILS", "explicit_comment_courier"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ScreenDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ScreenDto[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ScreenDto ADDRESS_DETAILS;
        public static final i Companion;
        public static final ScreenDto EXPLICIT_COMMENT;

        static {
            ScreenDto screenDto = new ScreenDto("EXPLICIT_COMMENT", 0);
            EXPLICIT_COMMENT = screenDto;
            ScreenDto screenDto2 = new ScreenDto("ADDRESS_DETAILS", 1);
            ADDRESS_DETAILS = screenDto2;
            ScreenDto[] screenDtoArr = {screenDto, screenDto2};
            $VALUES = screenDtoArr;
            $ENTRIES = kotlin.enums.a.a(screenDtoArr);
            Companion = new i();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(25));
        }

        public static ScreenDto valueOf(String str) {
            return (ScreenDto) Enum.valueOf(ScreenDto.class, str);
        }

        public static ScreenDto[] values() {
            return (ScreenDto[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new jgi(20)), kotlin.a.b(lazyThreadSafetyMode, new jgi(21))};
        f = new DeliveryTariffsCommentRedirectionsExperiment(0);
    }

    public /* synthetic */ DeliveryTariffsCommentRedirectionsExperiment(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryTariffsCommentRedirectionsExperiment)) {
            return false;
        }
        DeliveryTariffsCommentRedirectionsExperiment deliveryTariffsCommentRedirectionsExperiment = (DeliveryTariffsCommentRedirectionsExperiment) obj;
        return this.b == deliveryTariffsCommentRedirectionsExperiment.b && jl40.l(this.c, deliveryTariffsCommentRedirectionsExperiment.c) && jl40.l(this.d, deliveryTariffsCommentRedirectionsExperiment.d);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return ly3.s(nnm.l("DeliveryTariffsCommentRedirectionsExperiment(enabled=", ", l10n=", ", tariffRules=", this.c, this.b), this.d, Extension.C_BRAKE);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/DeliveryTariffsCommentRedirectionsExperiment$b;", "", "Companion", "ru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/j", "ru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/k", "explicit_comment_courier"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final k Companion = new k();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(26))};
        public final String a;
        public final List b;

        public /* synthetic */ b(int i, String str, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return nnm.h("TariffRule(tariff=", this.a, ", rules=", Extension.C_BRAKE, this.b);
        }

        public b() {
            this.a = "";
            this.b = EmptyList.a;
        }
    }

    public DeliveryTariffsCommentRedirectionsExperiment() {
        this(0);
    }

    public DeliveryTariffsCommentRedirectionsExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = EmptyList.a;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/DeliveryTariffsCommentRedirectionsExperiment$a;", "", "Companion", "ru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/b", "ru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/c", "explicit_comment_courier"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final c Companion = new c();
        public static final i3y[] h = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(22)), null, null, null, null};
        public final h a;
        public final int b;
        public final List c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        public /* synthetic */ a(int i, h hVar, int i2, List list, String str, String str2, String str3, String str4) {
            this.a = (i & 1) == 0 ? g.INSTANCE : hVar;
            if ((i & 2) == 0) {
                this.b = Integer.MAX_VALUE;
            } else {
                this.b = i2;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str2;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str3;
            }
            if ((i & 64) == 0) {
                this.g = "";
            } else {
                this.g = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && this.b == aVar.b && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.c(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Rule(ruleType=");
            sb.append(this.a);
            sb.append(", maxAttempts=");
            sb.append(this.b);
            sb.append(", partsToParse=");
            oyr.D(", titleKey=", this.d, ", descriptionKey=", sb, this.c);
            g8e.D(sb, this.e, ", positiveButtonTitleKey=", this.f, ", negativeButtonTitleKey=");
            return oyr.t(sb, this.g, Extension.C_BRAKE);
        }

        public a() {
            this.a = g.INSTANCE;
            this.b = Integer.MAX_VALUE;
            this.c = EmptyList.a;
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = "";
        }
    }
}
