package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import r2.C4906k;
import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.w8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4112w8 implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35570a;

    public /* synthetic */ C4112w8(int i) {
        this.f35570a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f35570a) {
            case 0:
                return new C4058v8();
            case 1:
                C2762Qh c2762Qh = new C2762Qh();
                c2762Qh.f27838a = null;
                return c2762Qh;
            case 2:
                return C4906k.f40186C.f40196h;
            case 3:
                ExecutorService executorService = AbstractC3436jg.f32061g;
                AbstractC3364iD.j(executorService);
                return new C4042ut(3, executorService);
            case 4:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 5:
                String str = C4949p.f40498g.f40504f;
                AbstractC3364iD.j(str);
                return str;
            case 6:
                return new ArrayDeque();
            case 7:
                return new V2(29);
            case 8:
                return new C2889Yb(14);
            case 9:
                return new C2889Yb(17);
            case 10:
                return C4906k.f40186C.f40212y;
            case 11:
                return new C2627Ii();
            case 12:
                return EnumC3144e9.APP_OPEN;
            case 13:
                return "app_open_ad";
            case 14:
                return EnumC3144e9.BANNER;
            case 15:
                return com.anythink.expressad.foundation.g.a.f.f19910e;
            case 16:
                return new C2881Xj();
            case 17:
                return new C3334hk();
            case 18:
                return new C3120dl();
            case 19:
                C3441jl c3441jl = new C3441jl();
                C3324ha c3324ha = AbstractC3592ma.f32869O1;
                s2.r rVar = s2.r.f40506e;
                c3441jl.f32097n = ((Integer) rVar.f40509c.a(c3324ha)).intValue();
                c3441jl.f32098u = ((Integer) rVar.f40509c.a(AbstractC3592ma.we)).intValue();
                return c3441jl;
            case 20:
                Set set = Collections.EMPTY_SET;
                AbstractC3364iD.j(set);
                return set;
            case 21:
                Set set2 = Collections.EMPTY_SET;
                AbstractC3364iD.j(set2);
                return set2;
            case 22:
                Set set3 = Collections.EMPTY_SET;
                AbstractC3364iD.j(set3);
                return set3;
            case 23:
                Set set4 = Collections.EMPTY_SET;
                AbstractC3364iD.j(set4);
                return set4;
            case 24:
                Set set5 = Collections.EMPTY_SET;
                AbstractC3364iD.j(set5);
                return set5;
            case 25:
                Set set6 = Collections.EMPTY_SET;
                AbstractC3364iD.j(set6);
                return set6;
            case 26:
                Set set7 = Collections.EMPTY_SET;
                AbstractC3364iD.j(set7);
                return set7;
            case 27:
                Set set8 = Collections.EMPTY_SET;
                AbstractC3364iD.j(set8);
                return set8;
            case 28:
                return new C4196xl();
            default:
                return EnumC3144e9.INTERSTITIAL;
        }
    }

    public C4112w8(C3872rl c3872rl) {
        this.f35570a = 21;
    }
}
