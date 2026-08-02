package com.fillr.core.validator;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v3 com.fillr.core.validator.CardType, still in use, count: 1, list:
  (r3v3 com.fillr.core.validator.CardType) from 0x00be: INVOKE 
  (r10v5 java.util.HashMap)
  (wrap:android.util.Pair:0x00ba: INVOKE ("3528"), ("3589") STATIC call: com.fillr.core.validator.CardType.getNewPair(java.lang.String, java.lang.String):android.util.Pair A[MD:(java.lang.String, java.lang.String):android.util.Pair (m), WRAPPED])
  (r3v3 com.fillr.core.validator.CardType)
 VIRTUAL call: java.util.HashMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes8.dex */
public final class CardType {
    /* JADX INFO: Fake field, exist only in values array */
    AMEX("American Express"),
    /* JADX INFO: Fake field, exist only in values array */
    DINERSCLUB("Diners Club"),
    /* JADX INFO: Fake field, exist only in values array */
    DISCOVER("Discover"),
    /* JADX INFO: Fake field, exist only in values array */
    JCB("JCB"),
    /* JADX INFO: Fake field, exist only in values array */
    MASTERCARD("MasterCard"),
    /* JADX INFO: Fake field, exist only in values array */
    VISA("Visa"),
    /* JADX INFO: Fake field, exist only in values array */
    VISA_ELECTRON("Visa Electron"),
    /* JADX INFO: Fake field, exist only in values array */
    DANKORT("Dankort"),
    /* JADX INFO: Fake field, exist only in values array */
    LASER("Laser"),
    /* JADX INFO: Fake field, exist only in values array */
    MAESTRO("Maestro"),
    UNKNOWN("Unknown"),
    INSUFFICIENT_DIGITS("More digits required");

    public static final HashMap intervalLookup;
    public static final int minDigits;
    public final String name;

    static {
        CardType cardType = AMEX;
        CardType cardType2 = DINERSCLUB;
        CardType cardType3 = DISCOVER;
        CardType cardType4 = MASTERCARD;
        CardType cardType5 = VISA_ELECTRON;
        CardType cardType6 = LASER;
        CardType cardType7 = MAESTRO;
        minDigits = 1;
        HashMap hashMap = new HashMap();
        intervalLookup = hashMap;
        hashMap.put(getNewPair("2221", "2720"), cardType4);
        hashMap.put(getNewPair("300", "305"), cardType2);
        hashMap.put(getNewPair("309", null), cardType2);
        hashMap.put(getNewPair("34", null), cardType);
        hashMap.put(getNewPair("3528", "3589"), r3);
        hashMap.put(getNewPair("36", null), cardType2);
        hashMap.put(getNewPair("37", null), cardType);
        hashMap.put(getNewPair("38", "39"), cardType2);
        hashMap.put(getNewPair("4026", null), cardType5);
        hashMap.put(getNewPair("417500", null), cardType5);
        hashMap.put(getNewPair("4405", null), cardType5);
        hashMap.put(getNewPair("4508", null), cardType5);
        hashMap.put(getNewPair("4844", null), cardType5);
        hashMap.put(getNewPair("4913", null), cardType5);
        hashMap.put(getNewPair("4917", null), cardType5);
        hashMap.put(getNewPair("4", null), r5);
        hashMap.put(getNewPair("5019", null), r7);
        hashMap.put(getNewPair("50", null), cardType7);
        hashMap.put(getNewPair("51", "55"), cardType4);
        hashMap.put(getNewPair("56", "59"), cardType7);
        hashMap.put(getNewPair("6011", null), cardType3);
        hashMap.put(getNewPair("61", null), cardType7);
        hashMap.put(getNewPair("62", null), cardType3);
        hashMap.put(getNewPair("6304", null), cardType6);
        hashMap.put(getNewPair("63", null), cardType7);
        hashMap.put(getNewPair("644", "649"), cardType3);
        hashMap.put(getNewPair("65", null), cardType3);
        hashMap.put(getNewPair("6706", null), cardType6);
        hashMap.put(getNewPair("6709", null), cardType6);
        hashMap.put(getNewPair("6771", null), cardType6);
        hashMap.put(getNewPair("66", "69"), cardType7);
        hashMap.put(getNewPair("88", null), cardType3);
        for (Map.Entry entry : hashMap.entrySet()) {
            int max = Math.max(minDigits, ((String) ((Pair) entry.getKey()).first).length());
            minDigits = max;
            if (((Pair) entry.getKey()).second != null) {
                minDigits = Math.max(max, ((String) ((Pair) entry.getKey()).second).length());
            }
        }
    }

    public CardType(String str) {
        this.name = str;
    }

    public static Pair getNewPair(String str, String str2) {
        if (str2 == null) {
            str2 = str;
        }
        return new Pair(str, str2);
    }

    public static CardType valueOf(String str) {
        return (CardType) Enum.valueOf(CardType.class, str);
    }

    public static CardType[] values() {
        return (CardType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.name;
    }
}
