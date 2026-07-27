package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2959b implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29372n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29366u = new C2959b(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29367v = new C2959b(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29368w = new C2959b(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29369x = new C2959b(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29370y = new C2959b(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29371z = new C2959b(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29356A = new C2959b(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29357B = new C2959b(7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29358C = new C2959b(8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29359D = new C2959b(9);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29360E = new C2959b(10);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29361F = new C2959b(11);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29362G = new C2959b(12);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29363H = new C2959b(17);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29364I = new C2959b(19);
    public static final /* synthetic */ C2959b J = new C2959b(20);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C2959b f29365K = new C2959b(21);

    public /* synthetic */ C2959b(int i) {
        this.f29372n = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length;
        int i = 0;
        switch (this.f29372n) {
            case 0:
                return Integer.compare(((C3122e) ((List) obj).get(0)).f30269y, ((C3122e) ((List) obj2).get(0)).f30269y);
            case 1:
                return ((C3340i) ((List) obj).get(0)).compareTo((C3340i) ((List) obj2).get(0));
            case 2:
                List list = (List) obj2;
                List list2 = (List) obj;
                return LB.f(C3500l.c((C3500l) Collections.max(list2, f29358C), (C3500l) Collections.max(list, f29370y))).b(list2.size(), list.size()).a((C3500l) Collections.max(list2, f29371z), (C3500l) Collections.max(list, f29356A), f29357B).e();
            case 3:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj;
                if (num2.intValue() == -1) {
                    return num.intValue() == -1 ? 0 : -1;
                }
                if (num.intValue() == -1) {
                    return 1;
                }
                return num2.intValue() - num.intValue();
            case 4:
                return C3500l.c((C3500l) obj, (C3500l) obj2);
            case 5:
                return C3500l.d((C3500l) obj, (C3500l) obj2);
            case 6:
                return C3500l.d((C3500l) obj, (C3500l) obj2);
            case 7:
                return C3500l.d((C3500l) obj, (C3500l) obj2);
            case 8:
                return C3500l.c((C3500l) obj, (C3500l) obj2);
            case 9:
                return Float.compare(((G) obj).f25080c, ((G) obj2).f25080c);
            case 10:
                return ((G) obj).f25078a - ((G) obj2).f25078a;
            case 11:
                return Integer.compare(((V3) obj).f28208a.f28361b, ((V3) obj2).f28208a.f28361b);
            case 12:
                return Long.compare(((U3) obj).f27920b, ((U3) obj2).f27920b);
            case 13:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 14:
                J5 j52 = (J5) obj;
                J5 j53 = (J5) obj2;
                int i4 = 0;
                while (true) {
                    length = j52.f25735a.length;
                    if (i < length && i4 < j53.f25735a.length) {
                        int compare = Integer.compare(J5.f(j52.b(i)), J5.f(j53.b(i4)));
                        if (compare != 0) {
                            return compare;
                        }
                        i++;
                        i4++;
                    }
                }
                return Integer.compare(length, j53.f25735a.length);
            case 15:
                D8 d82 = (D8) obj;
                D8 d83 = (D8) obj2;
                int i9 = d82.f24346c - d83.f24346c;
                return i9 != 0 ? i9 : Long.compare(d82.f24344a, d83.f24344a);
            case 16:
                A8 a82 = (A8) obj;
                A8 a83 = (A8) obj2;
                float f6 = a82.f23834b;
                float f9 = a83.f23834b;
                if (f6 < f9) {
                    return -1;
                }
                if (f6 <= f9) {
                    float f10 = a82.f23833a;
                    float f11 = a83.f23833a;
                    if (f10 < f11) {
                        return -1;
                    }
                    if (f10 <= f11) {
                        float f12 = (a82.f23836d - f6) * (a82.f23835c - f10);
                        float f13 = (a83.f23836d - f9) * (a83.f23835c - f11);
                        if (f12 > f13) {
                            return -1;
                        }
                        if (f12 >= f13) {
                            return 0;
                        }
                    }
                }
                return 1;
            case 17:
                Ov ov = (Ov) obj2;
                Ov ov2 = (Ov) obj;
                int compare2 = Double.compare(ov.f26784e, ov2.f26784e);
                return compare2 == 0 ? Long.compare(ov2.f26781b, ov.f26781b) : compare2;
            case 18:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 19:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 20:
                return ((TP) obj2).f27771j - ((TP) obj).f27771j;
            default:
                return ((C3205fR) Collections.max((List) obj)).compareTo((C3205fR) Collections.max((List) obj2));
        }
    }
}
