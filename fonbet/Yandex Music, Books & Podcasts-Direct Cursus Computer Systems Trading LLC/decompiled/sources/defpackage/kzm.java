package defpackage;

import java.util.Hashtable;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public class kzm {
    public static final kzm b;
    public static final Hashtable c;
    public static final /* synthetic */ kzm[] d;
    public final String a;

    /* JADX INFO: Fake field, exist only in values array */
    kzm EF0;

    /* JADX INFO: Fake field, exist only in values array */
    kzm EF4;

    static {
        kzm kzmVar = new kzm("HTTP_1_0", 0, "http/1.0");
        kzm kzmVar2 = new kzm("HTTP_1_1", 1, "http/1.1");
        b = kzmVar2;
        fzm fzmVar = new fzm("SPDY_3", 2, "spdy/3.1");
        gzm gzmVar = new gzm("HTTP_2", 3, "h2-13");
        d = new kzm[]{kzmVar, kzmVar2, fzmVar, gzmVar};
        Hashtable hashtable = new Hashtable();
        c = hashtable;
        hashtable.put("http/1.0", kzmVar);
        hashtable.put("http/1.1", kzmVar2);
        hashtable.put("spdy/3.1", fzmVar);
        hashtable.put("h2-13", gzmVar);
    }

    public kzm(String str, int i, String str2) {
        this.a = str2;
    }

    public static kzm a(String str) {
        if (str == null) {
            return null;
        }
        return (kzm) c.get(str.toLowerCase(Locale.US));
    }

    public static kzm valueOf(String str) {
        return (kzm) Enum.valueOf(kzm.class, str);
    }

    public static kzm[] values() {
        return (kzm[]) d.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
