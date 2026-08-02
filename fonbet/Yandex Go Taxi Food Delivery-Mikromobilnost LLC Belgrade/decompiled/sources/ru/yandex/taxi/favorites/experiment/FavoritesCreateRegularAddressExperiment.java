package ru.yandex.taxi.favorites.experiment;

import defpackage.c6z;
import defpackage.gip;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.n;
import defpackage.nnm;
import defpackage.thp;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.xn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/favorites/experiment/FavoritesCreateRegularAddressExperiment;", "Lxn11;", "Lc6z;", "Companion", "a", "ButtonType", "ButtonAction", "gip", "fip", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FavoritesCreateRegularAddressExperiment implements xn11, c6z {
    public static final gip Companion = new gip();
    public static final i3y[] h;
    public static final FavoritesCreateRegularAddressExperiment i;
    public final boolean b;
    public final Map c;
    public final FormattedText d;
    public final FormattedText e;
    public final String f;
    public final List g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/favorites/experiment/FavoritesCreateRegularAddressExperiment$ButtonAction;", "", "Companion", "ru/yandex/taxi/favorites/experiment/c", "CREATE_GEO_POINT", "CHANGE_REGULAR_ADDRESS", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes5.dex */
    public static final class ButtonAction {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonAction[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ButtonAction CHANGE_REGULAR_ADDRESS;
        public static final ButtonAction CREATE_GEO_POINT;
        public static final c Companion;
        public static final ButtonAction UNKNOWN;

        static {
            ButtonAction buttonAction = new ButtonAction("CREATE_GEO_POINT", 0);
            CREATE_GEO_POINT = buttonAction;
            ButtonAction buttonAction2 = new ButtonAction("CHANGE_REGULAR_ADDRESS", 1);
            CHANGE_REGULAR_ADDRESS = buttonAction2;
            ButtonAction buttonAction3 = new ButtonAction("UNKNOWN", 2);
            UNKNOWN = buttonAction3;
            ButtonAction[] buttonActionArr = {buttonAction, buttonAction2, buttonAction3};
            $VALUES = buttonActionArr;
            $ENTRIES = kotlin.enums.a.a(buttonActionArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new thp(6));
        }

        public static ButtonAction valueOf(String str) {
            return (ButtonAction) Enum.valueOf(ButtonAction.class, str);
        }

        public static ButtonAction[] values() {
            return (ButtonAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/favorites/experiment/FavoritesCreateRegularAddressExperiment$ButtonType;", "", "Companion", "ru/yandex/taxi/favorites/experiment/d", "ACTION", "DEFAULT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes5.dex */
    public static final class ButtonType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ButtonType ACTION;
        public static final d Companion;
        public static final ButtonType DEFAULT;

        static {
            ButtonType buttonType = new ButtonType("ACTION", 0);
            ACTION = buttonType;
            ButtonType buttonType2 = new ButtonType("DEFAULT", 1);
            DEFAULT = buttonType2;
            ButtonType[] buttonTypeArr = {buttonType, buttonType2};
            $VALUES = buttonTypeArr;
            $ENTRIES = kotlin.enums.a.a(buttonTypeArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new thp(7));
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new thp(2)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new thp(3))};
        i = new FavoritesCreateRegularAddressExperiment(0);
    }

    public /* synthetic */ FavoritesCreateRegularAddressExperiment(int i2, boolean z, Map map, FormattedText formattedText, FormattedText formattedText2, String str, List list) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText;
        }
        if ((i2 & 8) == 0) {
            this.e = FormattedText.c;
        } else {
            this.e = formattedText2;
        }
        if ((i2 & 16) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i2 & 32) == 0) {
            this.g = EmptyList.a;
        } else {
            this.g = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoritesCreateRegularAddressExperiment)) {
            return false;
        }
        FavoritesCreateRegularAddressExperiment favoritesCreateRegularAddressExperiment = (FavoritesCreateRegularAddressExperiment) obj;
        return this.b == favoritesCreateRegularAddressExperiment.b && jl40.l(this.c, favoritesCreateRegularAddressExperiment.c) && jl40.l(this.d, favoritesCreateRegularAddressExperiment.d) && jl40.l(this.e, favoritesCreateRegularAddressExperiment.e) && jl40.l(this.f, favoritesCreateRegularAddressExperiment.f) && jl40.l(this.g, favoritesCreateRegularAddressExperiment.g);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d.a), 31, this.e.a);
        String str = this.f;
        return this.g.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder l = nnm.l("FavoritesCreateRegularAddressExperiment(enabled=", ", l10n=", ", title=", this.c, this.b);
        n.C(l, this.d, ", subtitle=", this.e, ", imageTag=");
        return tse0.j(this.f, ", buttons=", Extension.C_BRAKE, l, this.g);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/favorites/experiment/FavoritesCreateRegularAddressExperiment$a;", "", "Companion", "ru/yandex/taxi/favorites/experiment/a", "ru/yandex/taxi/favorites/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class a {
        public static final b Companion = new b();
        public static final i3y[] d;
        public final FormattedText a;
        public final ButtonType b;
        public final ButtonAction c;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new thp(4)), kotlin.a.b(lazyThreadSafetyMode, new thp(5))};
        }

        public /* synthetic */ a(int i, FormattedText formattedText, ButtonType buttonType, ButtonAction buttonAction) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = ButtonType.DEFAULT;
            } else {
                this.b = buttonType;
            }
            if ((i & 4) == 0) {
                this.c = ButtonAction.UNKNOWN;
            } else {
                this.c = buttonAction;
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
            return jl40.l(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Button(title=" + this.a + ", type=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
        }

        public a() {
            FormattedText formattedText = FormattedText.c;
            ButtonType buttonType = ButtonType.DEFAULT;
            ButtonAction buttonAction = ButtonAction.UNKNOWN;
            this.a = formattedText;
            this.b = buttonType;
            this.c = buttonAction;
        }
    }

    public FavoritesCreateRegularAddressExperiment() {
        this(0);
    }

    public FavoritesCreateRegularAddressExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        FormattedText formattedText = FormattedText.c;
        this.b = false;
        this.c = f;
        this.d = formattedText;
        this.e = formattedText;
        this.f = null;
        this.g = EmptyList.a;
    }
}
