package i;

import a.AbstractC0069a;
import java.util.concurrent.Executors;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185a extends AbstractC0069a {

    /* renamed from: j, reason: collision with root package name */
    public static volatile C0185a f2340j;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2341i;

    public C0185a(int i2) {
        switch (i2) {
            case 1:
                this.f2341i = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f2341i = new C0185a(1);
                break;
        }
    }
}
