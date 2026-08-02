package defpackage;

import java.util.LinkedHashMap;
import kotlin.text.Regex;

/* loaded from: classes14.dex */
public final class x2h {
    public static final LinkedHashMap c = new LinkedHashMap();
    public final String a;
    public final String b;

    public x2h(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a(String str) {
        LinkedHashMap linkedHashMap = c;
        String str2 = this.a;
        Object obj = linkedHashMap.get(str2);
        if (obj == null) {
            obj = new Regex(str2);
            linkedHashMap.put(str2, obj);
        }
        return ((Regex) obj).j(str, this.b);
    }

    public final boolean b(String str) {
        LinkedHashMap linkedHashMap = c;
        String str2 = this.a;
        Object obj = linkedHashMap.get(str2);
        if (obj == null) {
            obj = new Regex(str2);
            linkedHashMap.put(str2, obj);
        }
        return ((Regex) obj).a(str);
    }
}
