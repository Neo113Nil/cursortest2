package l0;

import L.C0051b;
import android.window.BackEvent;
import e0.C0126b;
import java.util.Arrays;
import java.util.HashMap;
import m0.C0211i;
import m0.C0217o;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198a {

    /* renamed from: a, reason: collision with root package name */
    public final C0051b f2686a;

    public C0198a(C0126b c0126b, int i2) {
        switch (i2) {
            case 1:
                E.a aVar = new E.a(22);
                C0051b c0051b = new C0051b(c0126b, "flutter/navigation", C0211i.f2770a, 8);
                this.f2686a = c0051b;
                c0051b.J(aVar);
                break;
            default:
                E.a aVar2 = new E.a(20);
                C0051b c0051b2 = new C0051b(c0126b, "flutter/backgesture", C0217o.f2774a, 8);
                this.f2686a = c0051b2;
                c0051b2.J(aVar2);
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
