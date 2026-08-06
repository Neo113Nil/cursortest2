package Z0;

import a1.C0093i;
import a1.C0099o;
import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final I0.b f1952a;

    public a(R0.b bVar, int i2) {
        switch (i2) {
            case 1:
                m0.j jVar = new m0.j(27, false);
                I0.b bVar2 = new I0.b(bVar, "flutter/navigation", C0093i.f2034a, 9);
                this.f1952a = bVar2;
                bVar2.M(jVar);
                break;
            default:
                m0.j jVar2 = new m0.j(25, false);
                I0.b bVar3 = new I0.b(bVar, "flutter/backgesture", C0099o.f2035b, 9);
                this.f1952a = bVar3;
                bVar3.M(jVar2);
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
