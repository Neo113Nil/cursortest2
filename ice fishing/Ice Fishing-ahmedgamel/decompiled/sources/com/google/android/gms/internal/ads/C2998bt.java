package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.bt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2998bt implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29341a;

    /* renamed from: b, reason: collision with root package name */
    public final G1.a f29342b;

    public /* synthetic */ C2998bt(G1.a aVar, int i) {
        this.f29341a = i;
        this.f29342b = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Integer a() {
        boolean z3;
        Bundle bundle = ((C2739Qe) this.f29342b.f1051v).f27041n.getBundle("extras");
        int i = -1;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        z3 = false;
                        break;
                    }
                    z3 = -1;
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        z3 = true;
                        break;
                    }
                    z3 = -1;
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        z3 = 2;
                        break;
                    }
                    z3 = -1;
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        z3 = 3;
                        break;
                    }
                    z3 = -1;
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        z3 = 4;
                        break;
                    }
                    z3 = -1;
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        z3 = 5;
                        break;
                    }
                    z3 = -1;
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        z3 = 6;
                        break;
                    }
                    z3 = -1;
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        z3 = 7;
                        break;
                    }
                    z3 = -1;
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        z3 = 8;
                        break;
                    }
                    z3 = -1;
                    break;
                default:
                    z3 = -1;
                    break;
            }
            switch (z3) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f29341a) {
            case 0:
                String str = ((C2739Qe) this.f29342b.f1051v).f27044w;
                AbstractC3341iD.j(str);
                return str;
            case 1:
                return Integer.valueOf(this.f29342b.f1050u);
            case 2:
                return Boolean.valueOf(((C2739Qe) this.f29342b.f1051v).f27039E);
            case 3:
                return Boolean.valueOf(((C2739Qe) this.f29342b.f1051v).f27038D);
            case 4:
                String str2 = ((C2739Qe) this.f29342b.f1051v).f27035A;
                AbstractC3341iD.j(str2);
                return str2;
            default:
                return a();
        }
    }
}
