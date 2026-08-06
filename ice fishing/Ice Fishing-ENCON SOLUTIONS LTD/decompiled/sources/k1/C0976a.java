package k1;

import java.util.Comparator;
import kotlin.jvm.internal.i;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0976a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final C0976a f8063b = new C0976a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0976a f8064c = new C0976a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8065a;

    public /* synthetic */ C0976a(int i2) {
        this.f8065a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8065a) {
            case 0:
                Comparable a2 = (Comparable) obj;
                Comparable b2 = (Comparable) obj2;
                i.e(a2, "a");
                i.e(b2, "b");
                return a2.compareTo(b2);
            default:
                Comparable a3 = (Comparable) obj;
                Comparable b3 = (Comparable) obj2;
                i.e(a3, "a");
                i.e(b3, "b");
                return b3.compareTo(a3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f8065a) {
            case 0:
                return f8064c;
            default:
                return f8063b;
        }
    }
}
