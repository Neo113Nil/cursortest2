package ru.yandex.taxi.payment_options.model.pci_dss;

import defpackage.dgb1;
import defpackage.j73;
import defpackage.jst;
import defpackage.k4o;
import defpackage.mp8;
import defpackage.qp8;
import defpackage.unr0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/payment_options/model/pci_dss/CardType;", "", "", "analyticsName", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "", "validLengths", "[I", "Companion", "mp8", "AMEX", "DINERSCLUB", "UNIONPAY", "DISCOVER", "JCB", "MASTERCARD", "VISA", "MAESTRO", "MIR", "UZCARD", "HUMO", "ELCART", "BELKART", "MAAL", "TROY", "DINACARD", "UNKNOWN", "INSUFFICIENT_DIGITS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardType[] $VALUES;
    public static final CardType AMEX;
    private static final int[] AMEX_DINERS_SPACER;
    public static final CardType BELKART;
    public static final mp8 Companion;
    public static final CardType DINACARD;
    public static final CardType DINERSCLUB;
    public static final CardType DISCOVER;
    public static final CardType ELCART;
    public static final CardType HUMO;
    public static final CardType INSUFFICIENT_DIGITS;
    public static final CardType JCB;
    public static final CardType MAAL;
    public static final CardType MAESTRO;
    public static final CardType MASTERCARD;
    public static final CardType MIR;
    private static final int[] NORMAL_SPACER;
    public static final CardType TROY;
    public static final CardType UNIONPAY;
    public static final CardType UNKNOWN;
    public static final CardType UZCARD;
    public static final CardType VISA;
    private static final Map<Pair<String, String>, CardType> intervalLookup;
    private static int minDigits;
    private final String analyticsName;
    private final int[] validLengths;

    static {
        CardType cardType = new CardType("AMEX", 0, new int[]{15}, "amex");
        AMEX = cardType;
        CardType cardType2 = new CardType("DINERSCLUB", 1, new int[]{14, 16, 19}, "dinersclub");
        DINERSCLUB = cardType2;
        CardType cardType3 = new CardType("UNIONPAY", 2, new int[]{16, 17, 18, 19}, "unionpay");
        UNIONPAY = cardType3;
        CardType cardType4 = new CardType("DISCOVER", 3, new int[]{16, 17, 18, 19}, "discover");
        DISCOVER = cardType4;
        CardType cardType5 = new CardType("JCB", 4, new int[]{16, 17, 18, 19}, "jcb");
        JCB = cardType5;
        CardType cardType6 = new CardType("MASTERCARD", 5, new int[]{16}, "mastercard");
        MASTERCARD = cardType6;
        CardType cardType7 = new CardType("VISA", 6, new int[]{13, 16, 18, 19}, "visa");
        VISA = cardType7;
        CardType cardType8 = new CardType("MAESTRO", 7, new int[]{12, 13, 14, 15, 16, 17, 18, 19}, "maestro");
        MAESTRO = cardType8;
        CardType cardType9 = new CardType("MIR", 8, new int[]{16, 17, 18, 19}, "mir");
        MIR = cardType9;
        CardType cardType10 = new CardType("UZCARD", 9, new int[]{16}, "uzcard");
        UZCARD = cardType10;
        CardType cardType11 = new CardType("HUMO", 10, new int[]{16}, "humo");
        HUMO = cardType11;
        CardType cardType12 = new CardType("ELCART", 11, new int[]{16, 17, 18, 19}, "elcart");
        ELCART = cardType12;
        CardType cardType13 = new CardType("BELKART", 12, new int[]{16, 17, 18, 19}, "belkart");
        BELKART = cardType13;
        CardType cardType14 = new CardType("MAAL", 13, new int[]{16}, "maal");
        MAAL = cardType14;
        CardType cardType15 = new CardType("TROY", 14, new int[]{16}, "troy");
        TROY = cardType15;
        CardType cardType16 = new CardType("DINACARD", 15, new int[]{16}, "dinacard");
        DINACARD = cardType16;
        CardType cardType17 = new CardType("UNKNOWN", 16, new int[]{16, 17, 18, 19}, "unknown");
        UNKNOWN = cardType17;
        CardType cardType18 = new CardType("INSUFFICIENT_DIGITS", 17, new int[]{16}, "insufficient_digits");
        INSUFFICIENT_DIGITS = cardType18;
        CardType[] cardTypeArr = {cardType, cardType2, cardType3, cardType4, cardType5, cardType6, cardType7, cardType8, cardType9, cardType10, cardType11, cardType12, cardType13, cardType14, cardType15, cardType16, cardType17, cardType18};
        $VALUES = cardTypeArr;
        $ENTRIES = a.a(cardTypeArr);
        Companion = new mp8();
        AMEX_DINERS_SPACER = new int[]{4, 11};
        NORMAL_SPACER = new int[]{4, 9, 14};
        minDigits = 1;
        Map<Pair<String, String>, CardType> i = b.i(new Pair(dgb1.a("2200", "2204"), cardType9), new Pair(dgb1.a("222100", "272099"), cardType6), new Pair(dgb1.a("300", "305"), cardType2), new Pair(dgb1.a("309", null), cardType2), new Pair(dgb1.a("34", null), cardType), new Pair(dgb1.a("3528", "3589"), cardType5), new Pair(dgb1.a("365770", "365773"), cardType15), new Pair(dgb1.a("360000", "365769"), cardType2), new Pair(dgb1.a("365774", "369999"), cardType2), new Pair(dgb1.a("37", null), cardType), new Pair(dgb1.a("38", "39"), cardType2), new Pair(dgb1.a("4", null), cardType7), new Pair(dgb1.a("50", null), cardType8), new Pair(dgb1.a("51", "55"), cardType6), new Pair(dgb1.a("56", "59"), cardType8), new Pair(dgb1.a("6011", null), cardType4), new Pair(dgb1.a("61", null), cardType8), new Pair(dgb1.a("620000", "629117"), cardType3), new Pair(dgb1.a("629118", null), cardType16), new Pair(dgb1.a("629119", "629999"), cardType3), new Pair(dgb1.a("63", null), cardType8), new Pair(dgb1.a("644", "649"), cardType4), new Pair(dgb1.a("650", null), cardType15), new Pair(dgb1.a("654997", null), cardType15), new Pair(dgb1.a("655671", "655683"), cardType16), new Pair(dgb1.a("657000", "657371"), cardType15), new Pair(dgb1.a("657372", "657398"), cardType16), new Pair(dgb1.a("657399", "657999"), cardType15), new Pair(dgb1.a("6587", null), cardType15), new Pair(dgb1.a("660000", "669053"), cardType8), new Pair(dgb1.a("669054", null), cardType14), new Pair(dgb1.a("669055", "699999"), cardType8), new Pair(dgb1.a("81", null), cardType3), new Pair(dgb1.a("860", null), cardType10), new Pair(dgb1.a("88", null), cardType4), new Pair(dgb1.a("900", null), cardType15), new Pair(dgb1.a("901", null), cardType15), new Pair(dgb1.a("9792", null), cardType15), new Pair(dgb1.a("9860", null), cardType11), new Pair(dgb1.a("989101", "989189"), cardType16), new Pair(dgb1.a("9417", null), cardType12), new Pair(dgb1.a("951266", null), cardType14), new Pair(dgb1.a("9112", null), cardType13));
        intervalLookup = i;
        Iterator<Map.Entry<Pair<String, String>, CardType>> it = i.entrySet().iterator();
        while (it.hasNext()) {
            Pair<String, String> key = it.next().getKey();
            int i2 = minDigits;
            int length = ((String) key.c()).length();
            i2 = i2 < length ? length : i2;
            int length2 = ((String) key.f()).length();
            if (i2 < length2) {
                i2 = length2;
            }
            minDigits = i2;
        }
    }

    public CardType(String str, int i, int[] iArr, String str2) {
        this.analyticsName = str2;
        if (iArr.length == 0) {
            unr0.z(jst.e, "card length can't be empty");
            iArr = new int[16];
        }
        this.validLengths = iArr;
    }

    public static CardType valueOf(String str) {
        return (CardType) Enum.valueOf(CardType.class, str);
    }

    public static CardType[] values() {
        return (CardType[]) $VALUES.clone();
    }

    public final int b() {
        return this == AMEX ? 4 : 3;
    }

    /* renamed from: c, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final boolean f(int i) {
        return j73.w(i, this.validLengths);
    }

    public final int g() {
        return this == INSUFFICIENT_DIGITS ? minDigits : j73.Q(this.validLengths);
    }

    public final int[] h() {
        int i = qp8.a[ordinal()];
        return (i == 1 || i == 2) ? AMEX_DINERS_SPACER : NORMAL_SPACER;
    }
}
