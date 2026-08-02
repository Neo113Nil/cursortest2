package ru.yandex.taxi.communications.model;

import defpackage.akz0;
import defpackage.b64;
import defpackage.bgc;
import defpackage.bze;
import defpackage.c4v;
import defpackage.fsc;
import defpackage.g00;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.m0e;
import defpackage.o8s0;
import defpackage.ocm;
import defpackage.t0e;
import defpackage.ug2;
import defpackage.unr0;
import defpackage.uzg;
import defpackage.xvz;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/communications/model/CommunicationItem;", "", "Companion", "a", "DisplayOnType", "ru/yandex/taxi/communications/model/a", "fsc", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CommunicationItem {
    public static final fsc Companion = new fsc();
    public static final i3y[] l;
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final c4v d;
    public final c4v e;
    public final ug2 f;
    public final a g;
    public final o8s0 h;
    public final t0e i;
    public final jsq0 j;
    public final Map k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/communications/model/CommunicationItem$DisplayOnType;", "", "Companion", "ru/yandex/taxi/communications/model/b", "MULTIORDER", "DETAILS", "TAXI_SEARCH", "DETAILS_TOP", "RIDE_AUTO", "RIDE_CUSTOM", "CHANGE_ORDER_UNIVERSAL_ERROR_CUSTOM", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DisplayOnType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DisplayOnType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final DisplayOnType CHANGE_ORDER_UNIVERSAL_ERROR_CUSTOM;
        public static final b Companion;
        public static final DisplayOnType DETAILS;
        public static final DisplayOnType DETAILS_TOP;
        public static final DisplayOnType MULTIORDER;
        public static final DisplayOnType RIDE_AUTO;
        public static final DisplayOnType RIDE_CUSTOM;
        public static final DisplayOnType TAXI_SEARCH;

        static {
            DisplayOnType displayOnType = new DisplayOnType("MULTIORDER", 0);
            MULTIORDER = displayOnType;
            DisplayOnType displayOnType2 = new DisplayOnType("DETAILS", 1);
            DETAILS = displayOnType2;
            DisplayOnType displayOnType3 = new DisplayOnType("TAXI_SEARCH", 2);
            TAXI_SEARCH = displayOnType3;
            DisplayOnType displayOnType4 = new DisplayOnType("DETAILS_TOP", 3);
            DETAILS_TOP = displayOnType4;
            DisplayOnType displayOnType5 = new DisplayOnType("RIDE_AUTO", 4);
            RIDE_AUTO = displayOnType5;
            DisplayOnType displayOnType6 = new DisplayOnType("RIDE_CUSTOM", 5);
            RIDE_CUSTOM = displayOnType6;
            DisplayOnType displayOnType7 = new DisplayOnType("CHANGE_ORDER_UNIVERSAL_ERROR_CUSTOM", 6);
            CHANGE_ORDER_UNIVERSAL_ERROR_CUSTOM = displayOnType7;
            DisplayOnType[] displayOnTypeArr = {displayOnType, displayOnType2, displayOnType3, displayOnType4, displayOnType5, displayOnType6, displayOnType7};
            $VALUES = displayOnTypeArr;
            $ENTRIES = kotlin.enums.a.a(displayOnTypeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bgc(7));
        }

        public static DisplayOnType valueOf(String str) {
            return (DisplayOnType) Enum.valueOf(DisplayOnType.class, str);
        }

        public static DisplayOnType[] values() {
            return (DisplayOnType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new bgc(5)), kotlin.a.b(lazyThreadSafetyMode, new bgc(6))};
    }

    public CommunicationItem(int i, String str, FormattedText formattedText, FormattedText formattedText2, c4v c4vVar, c4v c4vVar2, ug2 ug2Var, a aVar, o8s0 o8s0Var, t0e t0eVar, jsq0 jsq0Var, Map map) {
        this.a = (i & 1) == 0 ? "" : str;
        int i2 = 0;
        if ((i & 2) == 0) {
            this.b = new FormattedText(i2);
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = new FormattedText(i2);
        } else {
            this.c = formattedText2;
        }
        int i3 = 3;
        String str2 = null;
        if ((i & 8) == 0) {
            this.d = new c4v(str2, str2, i3);
        } else {
            this.d = c4vVar;
        }
        if ((i & 16) == 0) {
            this.e = new c4v(str2, str2, i3);
        } else {
            this.e = c4vVar2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = ug2Var;
        }
        if ((i & 64) == 0) {
            a.Companion.getClass();
            this.g = a.j;
        } else {
            this.g = aVar;
        }
        if ((i & 128) == 0) {
            this.h = new o8s0(15);
        } else {
            this.h = o8s0Var;
        }
        if ((i & 256) == 0) {
            this.i = new m0e(0);
        } else {
            this.i = t0eVar;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = jsq0Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = map;
        }
    }

    public static CommunicationItem a(CommunicationItem communicationItem, FormattedText formattedText, FormattedText formattedText2, a aVar, int i) {
        String str = communicationItem.a;
        if ((i & 2) != 0) {
            formattedText = communicationItem.b;
        }
        FormattedText formattedText3 = formattedText;
        if ((i & 4) != 0) {
            formattedText2 = communicationItem.c;
        }
        FormattedText formattedText4 = formattedText2;
        c4v c4vVar = communicationItem.d;
        c4v c4vVar2 = communicationItem.e;
        ug2 ug2Var = communicationItem.f;
        if ((i & 64) != 0) {
            aVar = communicationItem.g;
        }
        return new CommunicationItem(str, formattedText3, formattedText4, c4vVar, c4vVar2, ug2Var, aVar, communicationItem.h, communicationItem.i, communicationItem.j, communicationItem.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunicationItem)) {
            return false;
        }
        CommunicationItem communicationItem = (CommunicationItem) obj;
        return jl40.l(this.a, communicationItem.a) && jl40.l(this.b, communicationItem.b) && jl40.l(this.c, communicationItem.c) && jl40.l(this.d, communicationItem.d) && jl40.l(this.e, communicationItem.e) && jl40.l(this.f, communicationItem.f) && jl40.l(this.g, communicationItem.g) && jl40.l(this.h, communicationItem.h) && jl40.l(this.i, communicationItem.i) && jl40.l(this.j, communicationItem.j) && jl40.l(this.k, communicationItem.k);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c.a)) * 31)) * 31;
        ug2 ug2Var = this.f;
        int hashCode2 = (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((hashCode + (ug2Var == null ? 0 : ug2Var.hashCode())) * 31)) * 31)) * 31)) * 31;
        jsq0 jsq0Var = this.j;
        int hashCode3 = (hashCode2 + (jsq0Var == null ? 0 : jsq0Var.a.hashCode())) * 31;
        Map map = this.k;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = xvz.q("CommunicationItem(id=", this.a, ", title=", ", text=", this.b);
        q.append(this.c);
        q.append(", icon=");
        q.append(this.d);
        q.append(", image=");
        q.append(this.e);
        q.append(", animation=");
        q.append(this.f);
        q.append(", widgets=");
        q.append(this.g);
        q.append(", showPolicy=");
        q.append(this.h);
        q.append(", configuration=");
        q.append(this.i);
        q.append(", displayOnTypes=");
        q.append(this.j);
        q.append(", analyticsPayload=");
        return b64.r(q, this.k, Extension.C_BRAKE);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/model/CommunicationItem$a;", "", "Companion", "ru/yandex/taxi/communications/model/d", "ru/yandex/taxi/communications/model/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final d Companion = new d();
        public static final i3y[] i = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bgc(8)), null, null, null};
        public static final a j = new a(null, 0 == true ? 1 : 0, 255);
        public final uzg a;
        public final ActionButton b;
        public final akz0 c;
        public final ocm d;
        public final List e;
        public final g00 f;
        public final bze g;
        public final FormattedText h;

        public /* synthetic */ a(int i2, uzg uzgVar, ActionButton actionButton, akz0 akz0Var, ocm ocmVar, List list, g00 g00Var, bze bzeVar, FormattedText formattedText) {
            if ((i2 & 1) == 0) {
                this.a = null;
            } else {
                this.a = uzgVar;
            }
            if ((i2 & 2) == 0) {
                this.b = null;
            } else {
                this.b = actionButton;
            }
            if ((i2 & 4) == 0) {
                this.c = null;
            } else {
                this.c = akz0Var;
            }
            if ((i2 & 8) == 0) {
                this.d = null;
            } else {
                this.d = ocmVar;
            }
            if ((i2 & 16) == 0) {
                this.e = EmptyList.a;
            } else {
                this.e = list;
            }
            if ((i2 & 32) == 0) {
                this.f = null;
            } else {
                this.f = g00Var;
            }
            if ((i2 & 64) == 0) {
                this.g = null;
            } else {
                this.g = bzeVar;
            }
            if ((i2 & 128) == 0) {
                this.h = null;
            } else {
                this.h = formattedText;
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
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g) && jl40.l(this.h, aVar.h);
        }

        public final int hashCode() {
            uzg uzgVar = this.a;
            int hashCode = (uzgVar == null ? 0 : uzgVar.hashCode()) * 31;
            ActionButton actionButton = this.b;
            int hashCode2 = (hashCode + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
            akz0 akz0Var = this.c;
            int hashCode3 = (hashCode2 + (akz0Var == null ? 0 : akz0Var.hashCode())) * 31;
            ocm ocmVar = this.d;
            int c = unr0.c((hashCode3 + (ocmVar == null ? 0 : ocmVar.hashCode())) * 31, 31, this.e);
            g00 g00Var = this.f;
            int hashCode4 = (c + (g00Var == null ? 0 : g00Var.hashCode())) * 31;
            bze bzeVar = this.g;
            int hashCode5 = (hashCode4 + (bzeVar == null ? 0 : bzeVar.hashCode())) * 31;
            FormattedText formattedText = this.h;
            return hashCode5 + (formattedText != null ? formattedText.a.hashCode() : 0);
        }

        public final String toString() {
            return "Widgets(deeplinkArrowButton=" + this.a + ", actionButton=" + this.b + ", toggle=" + this.c + ", driveArrowButton=" + this.d + ", actionButtons=" + this.e + ", actionsArrowButton=" + this.f + ", counterArrowActionButton=" + this.g + ", trailText=" + this.h + Extension.C_BRAKE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 0 == true ? 1 : 0, 255);
        }

        public a(uzg uzgVar, ActionButton actionButton, akz0 akz0Var, ocm ocmVar, List list, g00 g00Var, bze bzeVar, FormattedText formattedText) {
            this.a = uzgVar;
            this.b = actionButton;
            this.c = akz0Var;
            this.d = ocmVar;
            this.e = list;
            this.f = g00Var;
            this.g = bzeVar;
            this.h = formattedText;
        }

        public /* synthetic */ a(g00 g00Var, bze bzeVar, int i2) {
            this(null, null, null, null, EmptyList.a, (i2 & 32) != 0 ? null : g00Var, (i2 & 64) != 0 ? null : bzeVar, null);
        }
    }

    public CommunicationItem() {
        this(null, null, null, null, null, 2047);
    }

    public CommunicationItem(String str, FormattedText formattedText, FormattedText formattedText2, c4v c4vVar, c4v c4vVar2, ug2 ug2Var, a aVar, o8s0 o8s0Var, t0e t0eVar, jsq0 jsq0Var, Map map) {
        this.a = str;
        this.b = formattedText;
        this.c = formattedText2;
        this.d = c4vVar;
        this.e = c4vVar2;
        this.f = ug2Var;
        this.g = aVar;
        this.h = o8s0Var;
        this.i = t0eVar;
        this.j = jsq0Var;
        this.k = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CommunicationItem(FormattedText formattedText, FormattedText formattedText2, c4v c4vVar, a aVar, jsq0 jsq0Var, int i) {
        this(r3, r4, r5, r15, r7, null, r9, new o8s0(15), new m0e(0), (i & 512) != 0 ? null : jsq0Var, null);
        String str;
        a aVar2;
        if ((i & 1) != 0) {
            str = "";
        } else {
            str = "money_not_enough_informer";
        }
        String str2 = str;
        int i2 = 0;
        FormattedText formattedText3 = (i & 2) != 0 ? new FormattedText(i2) : formattedText;
        FormattedText formattedText4 = (i & 4) != 0 ? new FormattedText(i2) : formattedText2;
        int i3 = 3;
        String str3 = null;
        c4v c4vVar2 = (i & 8) != 0 ? new c4v(str3, str3, i3) : c4vVar;
        c4v c4vVar3 = new c4v(str3, str3, i3);
        if ((i & 64) != 0) {
            a.Companion.getClass();
            aVar2 = a.j;
        } else {
            aVar2 = aVar;
        }
    }
}
