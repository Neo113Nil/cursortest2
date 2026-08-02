package defpackage;

import io.flutter.embedding.engine.FlutterEngine;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class u30 implements t30 {
    public static u30 b;
    public final HashMap a;

    public u30(int i) {
        switch (i) {
            case 1:
                this.a = new HashMap();
                break;
            case 2:
                this.a = new HashMap();
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    public static u30 a() {
        if (b == null) {
            b = new u30(1);
        }
        return b;
    }

    public void b(String str, FlutterEngine flutterEngine) {
        HashMap hashMap = this.a;
        if (flutterEngine != null) {
            hashMap.put(str, flutterEngine);
        } else {
            hashMap.remove(str);
        }
    }
}
