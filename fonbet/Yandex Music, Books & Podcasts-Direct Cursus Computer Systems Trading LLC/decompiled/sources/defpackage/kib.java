package defpackage;

import com.yandex.plus.paymentsdk.internal.method.card.a;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public abstract class kib {
    public static final Object a = new Object();
    public static final WeakHashMap b = new WeakHashMap();

    public static a a(String str) {
        a aVar;
        str.getClass();
        synchronized (a) {
            aVar = (a) b.get(str);
        }
        return aVar;
    }
}
