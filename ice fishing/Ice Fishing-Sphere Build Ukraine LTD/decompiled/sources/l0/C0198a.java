package l0;

import L.C0026b;
import android.window.BackEvent;
import e0.C0126b;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198a {

    /* renamed from: a, reason: collision with root package name */
    public final C0026b f2694a;

    public C0198a(C0126b c0126b, int i2) {
        switch (i2) {
            case 1:
                E.a aVar = new E.a(22);
                C0026b c0026b = new C0026b(c0126b, "flutter/navigation", m0.i.f2778a, 8);
                this.f2694a = c0026b;
                c0026b.J(aVar);
                break;
            default:
                E.a aVar2 = new E.a(20);
                C0026b c0026b2 = new C0026b(c0126b, "flutter/backgesture", m0.o.f2782a, 8);
                this.f2694a = c0026b2;
                c0026b2.J(aVar2);
                break;
        }
    }

    public static HashMap a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }
}
