package ru.CryptoPro.reprov.array.normalizer;

/* loaded from: classes4.dex */
class DecompData {
    static final short BASE = 0;
    static final int DECOMP_MASK = 32767;
    static final int DECOMP_RECURSE = 32768;
    static final int MAX_CANONICAL = 21754;
    static final int MAX_COMPAT = 11177;
    static final CompactByteArray canonClass;
    static final String canonClassA;
    static final String canonClassB;
    static final String contents;
    static final CompactCharArray offsets;
    static final String offsetsA;
    static final String offsetsB;

    static {
        String str = new String(DecompDataOffs.offsetsACh);
        offsetsA = str;
        String str2 = new String(DecompDataOffs.offsetsBCh);
        offsetsB = str2;
        offsets = new CompactCharArray(str, str2);
        contents = new String(DecompDataCont.contentsCh);
        String str3 = new String(DecompDataCan.canonClassACh);
        canonClassA = str3;
        String str4 = new String(DecompDataCan.canonClassBCh);
        canonClassB = str4;
        canonClass = new CompactByteArray(str3, str4);
    }
}
