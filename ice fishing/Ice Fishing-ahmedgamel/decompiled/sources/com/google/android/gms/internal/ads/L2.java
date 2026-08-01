package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p2.C4835j;

/* loaded from: classes2.dex */
public final /* synthetic */ class L2 implements UA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26045a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ L2 f26021b = new L2(1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ L2 f26022c = new L2(2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ L2 f26023d = new L2(3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ L2 f26024e = new L2(4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ L2 f26025f = new L2(5);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ L2 f26026g = new L2(6);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ L2 f26027h = new L2(7);
    public static final /* synthetic */ L2 i = new L2(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ L2 f26028j = new L2(9);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ L2 f26029k = new L2(10);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ L2 f26030l = new L2(11);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ L2 f26031m = new L2(12);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ L2 f26032n = new L2(13);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ L2 f26033o = new L2(14);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ L2 f26034p = new L2(15);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ L2 f26035q = new L2(17);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ L2 f26036r = new L2(18);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ L2 f26037s = new L2(19);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ L2 f26038t = new L2(20);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ L2 f26039u = new L2(21);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ L2 f26040v = new L2(22);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ L2 f26041w = new L2(23);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ L2 f26042x = new L2(24);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ L2 f26043y = new L2(25);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ L2 f26044z = new L2(26);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ L2 f26018A = new L2(27);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ L2 f26019B = new L2(28);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ L2 f26020C = new L2(29);

    public /* synthetic */ L2(int i6) {
        this.f26045a = i6;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final Object apply(Object obj) {
        switch (this.f26045a) {
            case 0:
                break;
            case 1:
                Z2 z22 = (Z2) obj;
                int i6 = U2.f27849G;
                break;
            case 2:
                Throwable th = (Throwable) obj;
                C2927ac c2927ac = AbstractC3195fc.f30252a;
                if (((Boolean) AbstractC2701Oa.i.r()).booleanValue()) {
                    C4835j.f39733C.f39743h.d("prepareClickUrl.attestation1", th);
                    break;
                }
                break;
            case 3:
                List list = C4221yf.f35180l;
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                CB cb = C2761Rj.f27321a;
                break;
            case 8:
                ArrayList arrayList = new ArrayList();
                for (BinderC3356ib binderC3356ib : (List) obj) {
                    if (binderC3356ib != null) {
                        arrayList.add(binderC3356ib);
                    }
                }
                break;
            case 9:
                ArrayList arrayList2 = new ArrayList();
                for (C3099dn c3099dn : (List) obj) {
                    if (c3099dn != null) {
                        arrayList2.add(c3099dn);
                    }
                }
                break;
            case 10:
                break;
            case 11:
                ArrayList arrayList3 = (ArrayList) obj;
                break;
            case 12:
                I2.b bVar = (I2.b) obj;
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                String str = ((Zt) obj).f28974b;
                if (TextUtils.isEmpty(str)) {
                    break;
                } else if (!v2.f.c()) {
                    break;
                }
                break;
            case 19:
                String str2 = ((Zt) obj).f28973a;
                if (TextUtils.isEmpty(str2)) {
                    break;
                } else if (!v2.f.c()) {
                    break;
                }
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                break;
        }
        return null;
    }
}
