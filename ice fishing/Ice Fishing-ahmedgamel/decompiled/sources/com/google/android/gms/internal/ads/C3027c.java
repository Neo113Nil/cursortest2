package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3027c implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30182n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30176u = new C3027c(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30177v = new C3027c(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30178w = new C3027c(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30179x = new C3027c(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30180y = new C3027c(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30181z = new C3027c(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30166A = new C3027c(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30167B = new C3027c(7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30168C = new C3027c(8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30169D = new C3027c(9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30170E = new C3027c(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30171F = new C3027c(11);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30172G = new C3027c(12);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30173H = new C3027c(13);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30174I = new C3027c(18);
    public static final /* synthetic */ C3027c J = new C3027c(20);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C3027c f30175K = new C3027c(21);

    public /* synthetic */ C3027c(int i) {
        this.f30182n = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
    
        return java.lang.Integer.compare(r3, r10.f27037a.length);
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        switch (this.f30182n) {
            case 0:
                return ((C2974b) Collections.max((List) obj)).compareTo((C2974b) Collections.max((List) obj2));
            case 1:
                return Integer.compare(((C3188f) ((List) obj).get(0)).f30797y, ((C3188f) ((List) obj2).get(0)).f30797y);
            case 2:
                return ((C3402j) ((List) obj).get(0)).compareTo((C3402j) ((List) obj2).get(0));
            case 3:
                List list = (List) obj2;
                List list2 = (List) obj;
                return IB.f(C3618n.c((C3618n) Collections.max(list2, f30169D), (C3618n) Collections.max(list, f30181z))).b(list2.size(), list.size()).a((C3618n) Collections.max(list2, f30166A), (C3618n) Collections.max(list, f30167B), f30168C).e();
            case 4:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj;
                if (num2.intValue() == -1) {
                    return num.intValue() == -1 ? 0 : -1;
                }
                if (num.intValue() == -1) {
                    return 1;
                }
                return num2.intValue() - num.intValue();
            case 5:
                return C3618n.c((C3618n) obj, (C3618n) obj2);
            case 6:
                return C3618n.d((C3618n) obj, (C3618n) obj2);
            case 7:
                return C3618n.d((C3618n) obj, (C3618n) obj2);
            case 8:
                return C3618n.d((C3618n) obj, (C3618n) obj2);
            case 9:
                return C3618n.c((C3618n) obj, (C3618n) obj2);
            case 10:
                return Float.compare(((H) obj).f25971c, ((H) obj2).f25971c);
            case 11:
                return ((H) obj).f25969a - ((H) obj2).f25969a;
            case 12:
                return Integer.compare(((X3) obj).f29256a.f29427b, ((X3) obj2).f29256a.f29427b);
            case 13:
                return Long.compare(((W3) obj).f29109b, ((W3) obj2).f29109b);
            case 14:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 15:
                M5 m52 = (M5) obj;
                M5 m53 = (M5) obj2;
                int i4 = 0;
                while (true) {
                    int length = m52.f27037a.length;
                    if (i < length && i4 < m53.f27037a.length) {
                        int compare = Integer.compare(M5.f(m52.b(i)), M5.f(m53.b(i4)));
                        if (compare != 0) {
                            return compare;
                        }
                        i++;
                        i4++;
                    }
                }
                break;
            case 16:
                G8 g82 = (G8) obj;
                G8 g83 = (G8) obj2;
                int i6 = g82.f25729c - g83.f25729c;
                return i6 != 0 ? i6 : Long.compare(g82.f25727a, g83.f25727a);
            case 17:
                E8 e82 = (E8) obj;
                E8 e83 = (E8) obj2;
                float f2 = e82.f25308b;
                float f9 = e83.f25308b;
                if (f2 < f9) {
                    return -1;
                }
                if (f2 <= f9) {
                    float f10 = e82.f25307a;
                    float f11 = e83.f25307a;
                    if (f10 < f11) {
                        return -1;
                    }
                    if (f10 <= f11) {
                        float f12 = (e82.f25310d - f2) * (e82.f25309c - f10);
                        float f13 = (e83.f25310d - f9) * (e83.f25309c - f11);
                        if (f12 > f13) {
                            return -1;
                        }
                        if (f12 >= f13) {
                            return 0;
                        }
                    }
                }
                return 1;
            case 18:
                Mv mv = (Mv) obj2;
                Mv mv2 = (Mv) obj;
                int compare2 = Double.compare(mv.f27159e, mv2.f27159e);
                return compare2 == 0 ? Long.compare(mv2.f27156b, mv.f27156b) : compare2;
            case 19:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 20:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            default:
                return ((DP) obj2).f25171j - ((DP) obj).f25171j;
        }
    }
}
