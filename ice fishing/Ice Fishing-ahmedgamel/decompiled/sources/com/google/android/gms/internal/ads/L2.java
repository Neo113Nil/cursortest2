package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import r2.C4906k;

/* loaded from: classes2.dex */
public final /* synthetic */ class L2 implements UA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26845a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ L2 f26821b = new L2(1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ L2 f26822c = new L2(2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ L2 f26823d = new L2(3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ L2 f26824e = new L2(4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ L2 f26825f = new L2(5);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ L2 f26826g = new L2(6);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ L2 f26827h = new L2(7);
    public static final /* synthetic */ L2 i = new L2(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ L2 f26828j = new L2(9);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ L2 f26829k = new L2(10);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ L2 f26830l = new L2(11);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ L2 f26831m = new L2(12);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ L2 f26832n = new L2(13);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ L2 f26833o = new L2(14);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ L2 f26834p = new L2(15);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ L2 f26835q = new L2(17);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ L2 f26836r = new L2(18);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ L2 f26837s = new L2(19);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ L2 f26838t = new L2(20);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ L2 f26839u = new L2(21);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ L2 f26840v = new L2(22);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ L2 f26841w = new L2(23);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ L2 f26842x = new L2(24);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ L2 f26843y = new L2(25);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ L2 f26844z = new L2(26);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ L2 f26818A = new L2(27);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ L2 f26819B = new L2(28);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ L2 f26820C = new L2(29);

    public /* synthetic */ L2(int i4) {
        this.f26845a = i4;
    }

    @Override // com.google.android.gms.internal.ads.UA
    public final Object apply(Object obj) {
        switch (this.f26845a) {
            case 0:
                break;
            case 1:
                Z2 z22 = (Z2) obj;
                int i4 = U2.f28646G;
                break;
            case 2:
                Throwable th = (Throwable) obj;
                C2950ac c2950ac = AbstractC3218fc.f31040a;
                if (((Boolean) AbstractC2721Oa.i.r()).booleanValue()) {
                    C4906k.f40186C.f40196h.d("prepareClickUrl.attestation1", th);
                    break;
                }
                break;
            case 3:
                List list = C4244yf.f35970l;
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                CB cb = C2781Rj.f28005a;
                break;
            case 8:
                ArrayList arrayList = new ArrayList();
                for (BinderC3379ib binderC3379ib : (List) obj) {
                    if (binderC3379ib != null) {
                        arrayList.add(binderC3379ib);
                    }
                }
                break;
            case 9:
                ArrayList arrayList2 = new ArrayList();
                for (C3175en c3175en : (List) obj) {
                    if (c3175en != null) {
                        arrayList2.add(c3175en);
                    }
                }
                break;
            case 10:
                break;
            case 11:
                ArrayList arrayList3 = (ArrayList) obj;
                break;
            case 12:
                K2.b bVar = (K2.b) obj;
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
                String str = ((Zt) obj).f29744b;
                if (TextUtils.isEmpty(str)) {
                    break;
                } else if (!x2.f.c()) {
                    break;
                }
                break;
            case 19:
                String str2 = ((Zt) obj).f29743a;
                if (TextUtils.isEmpty(str2)) {
                    break;
                } else if (!x2.f.c()) {
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
