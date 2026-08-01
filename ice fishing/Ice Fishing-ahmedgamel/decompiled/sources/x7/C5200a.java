package x7;

import java.util.Comparator;
import kotlin.jvm.internal.h;

/* renamed from: x7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5200a implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public static final C5200a f41775u = new C5200a(0);

    /* renamed from: v, reason: collision with root package name */
    public static final C5200a f41776v = new C5200a(1);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41777n;

    public /* synthetic */ C5200a(int i) {
        this.f41777n = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f41777n) {
            case 0:
                Comparable a9 = (Comparable) obj;
                Comparable b9 = (Comparable) obj2;
                h.e(a9, "a");
                h.e(b9, "b");
                return a9.compareTo(b9);
            default:
                Comparable a10 = (Comparable) obj;
                Comparable b10 = (Comparable) obj2;
                h.e(a10, "a");
                h.e(b10, "b");
                return b10.compareTo(a10);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f41777n) {
            case 0:
                return f41776v;
            default:
                return f41775u;
        }
    }
}
