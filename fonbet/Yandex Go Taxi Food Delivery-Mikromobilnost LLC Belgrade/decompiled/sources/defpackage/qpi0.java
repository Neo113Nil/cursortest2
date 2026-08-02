package defpackage;

import java.util.HashMap;
import kotlin.text.Regex;

/* loaded from: classes8.dex */
public final class qpi0 {
    public final HashMap a = new HashMap();

    public final Regex a(String str) {
        HashMap hashMap = this.a;
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new Regex(str);
            hashMap.put(str, obj);
        }
        return (Regex) obj;
    }
}
