package ru.CryptoPro.reprov.x509;

import java.util.Comparator;

/* loaded from: classes4.dex */
class AVAComparator implements Comparator {
    private static final Comparator INSTANCE = new AVAComparator();

    private AVAComparator() {
    }

    public static Comparator getInstance() {
        return INSTANCE;
    }

    @Override // java.util.Comparator
    public int compare(AVA ava, AVA ava2) {
        boolean hasRFC2253Keyword = ava.hasRFC2253Keyword();
        return hasRFC2253Keyword == ava2.hasRFC2253Keyword() ? ava.toRFC2253CanonicalString().compareTo(ava2.toRFC2253CanonicalString()) : hasRFC2253Keyword ? -1 : 1;
    }
}
