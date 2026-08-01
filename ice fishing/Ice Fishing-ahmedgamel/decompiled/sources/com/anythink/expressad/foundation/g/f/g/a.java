package com.anythink.expressad.foundation.g.f.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19323a = -2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f19324b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19325c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f19326d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19327e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f19328f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f19329g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final int f19330h = 7;
    public static final int i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f19331j = 9;

    /* renamed from: k, reason: collision with root package name */
    public static final int f19332k = 10;

    /* renamed from: l, reason: collision with root package name */
    public static final int f19333l = 11;

    /* renamed from: m, reason: collision with root package name */
    public static final int f19334m = 12;

    /* renamed from: n, reason: collision with root package name */
    public static final int f19335n = 13;

    /* renamed from: o, reason: collision with root package name */
    public static final int f19336o = 14;

    /* renamed from: p, reason: collision with root package name */
    public static final int f19337p = 15;

    public static String a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        if (aVar == null) {
            return "Network error,Load failed";
        }
        try {
            int i6 = aVar.f19228a;
            com.anythink.expressad.foundation.g.f.f.c cVar = aVar.f19230c;
            int i9 = cVar != null ? cVar.f19319a : 0;
            if (i6 == -2) {
                return "Network is canceled";
            }
            if (i6 == 1) {
                return "Network error,Load failed";
            }
            if (i6 == 880023) {
                return "timeout";
            }
            if (i6 == 880041) {
                return "Network error,UnknownHostException";
            }
            if (i6 == 14) {
                return "Network error,I/O exception response null";
            }
            if (i6 == 15) {
                return "Network error,I/O exception contents null";
            }
            switch (i6) {
                case 3:
                    return "Network error,timeout exception";
                case 4:
                    return "Network unknown error";
                case 5:
                    return "Network error,https is not work,please check your phone time";
                case 6:
                    return i9 != 0 ? "Network error,please check state code".concat(String.valueOf(i9)) : "Network error,please check ";
                case 7:
                    return i9 != 0 ? "The server returns an exception state code ".concat(String.valueOf(i9)) : "The server returns an exception ";
                case 8:
                    return "Cast exception, return data can't be casted correctly";
                case 9:
                case 12:
                    return "Network error,disconnected network exception";
                case 10:
                    return "Network error,socket timeout exception";
                case 11:
                    return "Network error,sslp exception";
                default:
                    return "Network error,I/O exception";
            }
        } catch (Exception e9) {
            e9.printStackTrace();
            return "Network error,Load failed";
        }
    }
}
