package i;

import java.util.concurrent.Executors;
import u0.AbstractC1050a;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240a extends AbstractC1050a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0240a f3394d;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3395c;

    public C0240a(int i2) {
        switch (i2) {
            case 1:
                this.f3395c = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0241b());
                break;
            default:
                this.f3395c = new C0240a(1);
                break;
        }
    }
}
