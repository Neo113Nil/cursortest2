package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.bt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3021bt implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30129a;

    /* renamed from: b, reason: collision with root package name */
    public final I1.a f30130b;

    public /* synthetic */ C3021bt(I1.a aVar, int i) {
        this.f30129a = i;
        this.f30130b = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Integer a() {
        boolean z6;
        Bundle bundle = ((C2759Qe) this.f30130b.f1304v).f27826n.getBundle("extras");
        int i = -1;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        z6 = false;
                        break;
                    }
                    z6 = -1;
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        z6 = true;
                        break;
                    }
                    z6 = -1;
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        z6 = 2;
                        break;
                    }
                    z6 = -1;
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        z6 = 3;
                        break;
                    }
                    z6 = -1;
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        z6 = 4;
                        break;
                    }
                    z6 = -1;
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        z6 = 5;
                        break;
                    }
                    z6 = -1;
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        z6 = 6;
                        break;
                    }
                    z6 = -1;
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        z6 = 7;
                        break;
                    }
                    z6 = -1;
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        z6 = 8;
                        break;
                    }
                    z6 = -1;
                    break;
                default:
                    z6 = -1;
                    break;
            }
            switch (z6) {
                case false:
                    i = 0;
                    break;
                case true:
                    i = 1;
                    break;
                case true:
                    i = 2;
                    break;
                case true:
                    i = 3;
                    break;
                case true:
                    i = 4;
                    break;
                case true:
                    i = 5;
                    break;
                case true:
                    i = 6;
                    break;
                case true:
                    i = 7;
                    break;
                case true:
                    i = 8;
                    break;
            }
        }
        return Integer.valueOf(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f30129a) {
            case 0:
                String str = ((C2759Qe) this.f30130b.f1304v).f27829w;
                AbstractC3364iD.j(str);
                return str;
            case 1:
                return Integer.valueOf(this.f30130b.f1303u);
            case 2:
                return Boolean.valueOf(((C2759Qe) this.f30130b.f1304v).f27824E);
            case 3:
                return Boolean.valueOf(((C2759Qe) this.f30130b.f1304v).f27823D);
            case 4:
                String str2 = ((C2759Qe) this.f30130b.f1304v).f27820A;
                AbstractC3364iD.j(str2);
                return str2;
            default:
                return a();
        }
    }
}
