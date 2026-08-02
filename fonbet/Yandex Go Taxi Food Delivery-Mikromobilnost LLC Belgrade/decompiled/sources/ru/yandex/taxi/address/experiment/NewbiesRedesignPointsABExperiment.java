package ru.yandex.taxi.address.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ic50;
import defpackage.j660;
import defpackage.k4o;
import defpackage.k660;
import defpackage.mv0;
import defpackage.vn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/address/experiment/NewbiesRedesignPointsABExperiment;", "Lvn11;", "Lc6z;", "Companion", "ru/yandex/taxi/address/experiment/o", "SummaryAddressStyle", "k660", "ru/yandex/taxi/address/experiment/f", "sourcedestination"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NewbiesRedesignPointsABExperiment implements vn11, c6z {
    public static final k660 Companion = new k660();
    public static final i3y[] y;
    public final boolean b;
    public final Map c;
    public final mv0 d;
    public final mv0 e;
    public final mv0 f;
    public final mv0 g;
    public final mv0 h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final SummaryAddressStyle v;
    public final SummaryAddressStyle w;
    public final List x;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/address/experiment/NewbiesRedesignPointsABExperiment$SummaryAddressStyle;", "", "Companion", "ru/yandex/taxi/address/experiment/p", "CITY_WITH_ADDRESS", "ONLY_CITY", "CITY_WITH_ADDRESS_REVERSED", "sourcedestination"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class SummaryAddressStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SummaryAddressStyle[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final SummaryAddressStyle CITY_WITH_ADDRESS;
        public static final SummaryAddressStyle CITY_WITH_ADDRESS_REVERSED;
        public static final p Companion;
        public static final SummaryAddressStyle ONLY_CITY;

        static {
            SummaryAddressStyle summaryAddressStyle = new SummaryAddressStyle("CITY_WITH_ADDRESS", 0);
            CITY_WITH_ADDRESS = summaryAddressStyle;
            SummaryAddressStyle summaryAddressStyle2 = new SummaryAddressStyle("ONLY_CITY", 1);
            ONLY_CITY = summaryAddressStyle2;
            SummaryAddressStyle summaryAddressStyle3 = new SummaryAddressStyle("CITY_WITH_ADDRESS_REVERSED", 2);
            CITY_WITH_ADDRESS_REVERSED = summaryAddressStyle3;
            SummaryAddressStyle[] summaryAddressStyleArr = {summaryAddressStyle, summaryAddressStyle2, summaryAddressStyle3};
            $VALUES = summaryAddressStyleArr;
            $ENTRIES = kotlin.enums.a.a(summaryAddressStyleArr);
            Companion = new p();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j660(11));
        }

        public static SummaryAddressStyle valueOf(String str) {
            return (SummaryAddressStyle) Enum.valueOf(SummaryAddressStyle.class, str);
        }

        public static SummaryAddressStyle[] values() {
            return (SummaryAddressStyle[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        y = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ic50(27)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ic50(28)), kotlin.a.b(lazyThreadSafetyMode, new ic50(29)), kotlin.a.b(lazyThreadSafetyMode, new j660(0))};
    }

    public /* synthetic */ NewbiesRedesignPointsABExperiment(int i, boolean z, Map map, mv0 mv0Var, mv0 mv0Var2, mv0 mv0Var3, mv0 mv0Var4, mv0 mv0Var5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SummaryAddressStyle summaryAddressStyle, SummaryAddressStyle summaryAddressStyle2, List list) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = new mv0(0);
        } else {
            this.d = mv0Var;
        }
        if ((i & 8) == 0) {
            this.e = new mv0(0);
        } else {
            this.e = mv0Var2;
        }
        if ((i & 16) == 0) {
            this.f = new mv0(0);
        } else {
            this.f = mv0Var3;
        }
        if ((i & 32) == 0) {
            this.g = new mv0(0);
        } else {
            this.g = mv0Var4;
        }
        if ((i & 64) == 0) {
            this.h = new mv0(0);
        } else {
            this.h = mv0Var5;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str;
        }
        if ((i & 256) == 0) {
            this.j = "";
        } else {
            this.j = str2;
        }
        if ((i & 512) == 0) {
            this.k = "";
        } else {
            this.k = str3;
        }
        if ((i & 1024) == 0) {
            this.l = "";
        } else {
            this.l = str4;
        }
        if ((i & 2048) == 0) {
            this.m = "";
        } else {
            this.m = str5;
        }
        if ((i & 4096) == 0) {
            this.n = "";
        } else {
            this.n = str6;
        }
        if ((i & 8192) == 0) {
            this.o = "";
        } else {
            this.o = str7;
        }
        if ((i & 16384) == 0) {
            this.p = "";
        } else {
            this.p = str8;
        }
        if ((32768 & i) == 0) {
            this.q = "";
        } else {
            this.q = str9;
        }
        if ((65536 & i) == 0) {
            this.r = null;
        } else {
            this.r = str10;
        }
        if ((131072 & i) == 0) {
            this.s = null;
        } else {
            this.s = str11;
        }
        if ((262144 & i) == 0) {
            this.t = "";
        } else {
            this.t = str12;
        }
        if ((524288 & i) == 0) {
            this.u = "";
        } else {
            this.u = str13;
        }
        this.v = (1048576 & i) == 0 ? SummaryAddressStyle.ONLY_CITY : summaryAddressStyle;
        this.w = (2097152 & i) == 0 ? SummaryAddressStyle.ONLY_CITY : summaryAddressStyle2;
        this.x = (i & SelfTester_JCP.ENCRYPT_CBC) == 0 ? EmptyList.a : list;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    public NewbiesRedesignPointsABExperiment() {
        this(8388607);
    }

    public NewbiesRedesignPointsABExperiment(int i) {
        Map f = kotlin.collections.b.f();
        mv0 mv0Var = new mv0(0);
        mv0 mv0Var2 = new mv0(0);
        mv0 mv0Var3 = new mv0(0);
        mv0 mv0Var4 = new mv0(0);
        mv0 mv0Var5 = new mv0(0);
        SummaryAddressStyle summaryAddressStyle = SummaryAddressStyle.ONLY_CITY;
        this.b = false;
        this.c = f;
        this.d = mv0Var;
        this.e = mv0Var2;
        this.f = mv0Var3;
        this.g = mv0Var4;
        this.h = mv0Var5;
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = "";
        this.p = "";
        this.q = "";
        this.r = null;
        this.s = null;
        this.t = "";
        this.u = "";
        this.v = summaryAddressStyle;
        this.w = summaryAddressStyle;
        this.x = EmptyList.a;
    }
}
