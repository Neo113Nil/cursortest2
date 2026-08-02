package com.yandex.passport.internal.storage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class f implements Function1 {
    public static final f b = new f(0);
    public static final f c = new f(1);
    public static final f d = new f(2);
    public static final f e = new f(3);
    public static final f f = new f(4);
    public static final f g = new f(5);
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                return str == null ? "" : str;
            case 1:
                String str2 = (String) obj;
                return str2 == null ? "" : str2;
            case 2:
                String str3 = (String) obj;
                return str3 == null ? "" : str3;
            case 3:
                String str4 = (String) obj;
                return str4 == null ? "" : str4;
            case 4:
                String str5 = (String) obj;
                return str5 == null ? "" : str5;
            default:
                String str6 = (String) obj;
                return str6 == null ? "" : str6;
        }
    }
}
