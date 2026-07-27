package i;

import a.AbstractC0069a;
import java.util.concurrent.Executors;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185a extends AbstractC0069a {

    /* renamed from: k, reason: collision with root package name */
    public static volatile C0185a f2332k;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2333j;

    public C0185a(int i2) {
        switch (i2) {
            case 1:
                this.f2333j = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f2333j = new C0185a(1);
                break;
        }
    }
}
