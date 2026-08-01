package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3004c implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29399n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29393u = new C3004c(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29394v = new C3004c(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29395w = new C3004c(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29396x = new C3004c(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29397y = new C3004c(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29398z = new C3004c(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29383A = new C3004c(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29384B = new C3004c(7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29385C = new C3004c(8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29386D = new C3004c(9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29387E = new C3004c(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29388F = new C3004c(11);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29389G = new C3004c(12);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29390H = new C3004c(13);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29391I = new C3004c(18);
    public static final /* synthetic */ C3004c J = new C3004c(20);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C3004c f29392K = new C3004c(21);

    public /* synthetic */ C3004c(int i) {
        this.f29399n = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
    
        return java.lang.Integer.compare(r3, r10.f26246a.length);
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        switch (this.f29399n) {
            case 0:
                return ((C2951b) Collections.max((List) obj)).compareTo((C2951b) Collections.max((List) obj2));
            case 1:
                return Integer.compare(((C3165f) ((List) obj).get(0)).f30010y, ((C3165f) ((List) obj2).get(0)).f30010y);
            case 2:
                return ((C3379j) ((List) obj).get(0)).compareTo((C3379j) ((List) obj2).get(0));
            case 3:
                List list = (List) obj2;
                List list2 = (List) obj;
                return IB.f(C3595n.c((C3595n) Collections.max(list2, f29386D), (C3595n) Collections.max(list, f29398z))).b(list2.size(), list.size()).a((C3595n) Collections.max(list2, f29383A), (C3595n) Collections.max(list, f29384B), f29385C).e();
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
                return C3595n.c((C3595n) obj, (C3595n) obj2);
            case 6:
                return C3595n.d((C3595n) obj, (C3595n) obj2);
            case 7:
                return C3595n.d((C3595n) obj, (C3595n) obj2);
            case 8:
                return C3595n.d((C3595n) obj, (C3595n) obj2);
            case 9:
                return C3595n.c((C3595n) obj, (C3595n) obj2);
            case 10:
                return Float.compare(((H) obj).f25199c, ((H) obj2).f25199c);
            case 11:
                return ((H) obj).f25197a - ((H) obj2).f25197a;
            case 12:
                return Integer.compare(((X3) obj).f28476a.f28650b, ((X3) obj2).f28476a.f28650b);
            case 13:
                return Long.compare(((W3) obj).f28311b, ((W3) obj2).f28311b);
            case 14:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 15:
                M5 m52 = (M5) obj;
                M5 m53 = (M5) obj2;
                int i6 = 0;
                while (true) {
                    int length = m52.f26246a.length;
                    if (i < length && i6 < m53.f26246a.length) {
                        int compare = Integer.compare(M5.f(m52.b(i)), M5.f(m53.b(i6)));
                        if (compare != 0) {
                            return compare;
                        }
                        i++;
                        i6++;
                    }
                }
                break;
            case 16:
                G8 g82 = (G8) obj;
                G8 g83 = (G8) obj2;
                int i9 = g82.f24939c - g83.f24939c;
                return i9 != 0 ? i9 : Long.compare(g82.f24937a, g83.f24937a);
            case 17:
                E8 e82 = (E8) obj;
                E8 e83 = (E8) obj2;
                float f3 = e82.f24547b;
                float f9 = e83.f24547b;
                if (f3 < f9) {
                    return -1;
                }
                if (f3 <= f9) {
                    float f10 = e82.f24546a;
                    float f11 = e83.f24546a;
                    if (f10 < f11) {
                        return -1;
                    }
                    if (f10 <= f11) {
                        float f12 = (e82.f24549d - f3) * (e82.f24548c - f10);
                        float f13 = (e83.f24549d - f9) * (e83.f24548c - f11);
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
                int compare2 = Double.compare(mv.f26374e, mv2.f26374e);
                return compare2 == 0 ? Long.compare(mv2.f26371b, mv.f26371b) : compare2;
            case 19:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 20:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            default:
                return ((DP) obj2).f24426j - ((DP) obj).f24426j;
        }
    }
}
