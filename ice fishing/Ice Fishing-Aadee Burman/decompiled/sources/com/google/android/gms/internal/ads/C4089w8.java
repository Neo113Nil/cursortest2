package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p2.C4835j;
import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.w8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4089w8 implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34801a;

    public /* synthetic */ C4089w8(int i) {
        this.f34801a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f34801a) {
            case 0:
                return new C4035v8();
            case 1:
                C2742Qh c2742Qh = new C2742Qh();
                c2742Qh.f27053a = null;
                return c2742Qh;
            case 2:
                return C4835j.f39730C.f39740h;
            case 3:
                ExecutorService executorService = AbstractC3413jg.f31274g;
                AbstractC3341iD.j(executorService);
                return new C4019ut(3, executorService);
            case 4:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 5:
                String str = C4900p.f40196g.f40202f;
                AbstractC3341iD.j(str);
                return str;
            case 6:
                return new ArrayDeque();
            case 7:
                return new V2(29);
            case 8:
                return new C2866Yb(14);
            case 9:
                return new C2866Yb(17);
            case 10:
                return C4835j.f39730C.f39756y;
            case 11:
                return new C2607Ii();
            case 12:
                return EnumC3121e9.APP_OPEN;
            case 13:
                return "app_open_ad";
            case 14:
                return EnumC3121e9.BANNER;
            case 15:
                return com.anythink.expressad.foundation.g.a.f.f19123e;
            case 16:
                return new C2858Xj();
            case 17:
                return new C3311hk();
            case 18:
                return new C3097dl();
            case 19:
                C3418jl c3418jl = new C3418jl();
                C3301ha c3301ha = AbstractC3569ma.f32090O1;
                q2.r rVar = q2.r.f40204e;
                c3418jl.f31310n = ((Integer) rVar.f40207c.a(c3301ha)).intValue();
                c3418jl.f31311u = ((Integer) rVar.f40207c.a(AbstractC3569ma.we)).intValue();
                return c3418jl;
            case 20:
                Set set = Collections.EMPTY_SET;
                AbstractC3341iD.j(set);
                return set;
            case 21:
                Set set2 = Collections.EMPTY_SET;
                AbstractC3341iD.j(set2);
                return set2;
            case 22:
                Set set3 = Collections.EMPTY_SET;
                AbstractC3341iD.j(set3);
                return set3;
            case 23:
                Set set4 = Collections.EMPTY_SET;
                AbstractC3341iD.j(set4);
                return set4;
            case 24:
                Set set5 = Collections.EMPTY_SET;
                AbstractC3341iD.j(set5);
                return set5;
            case 25:
                Set set6 = Collections.EMPTY_SET;
                AbstractC3341iD.j(set6);
                return set6;
            case 26:
                Set set7 = Collections.EMPTY_SET;
                AbstractC3341iD.j(set7);
                return set7;
            case 27:
                Set set8 = Collections.EMPTY_SET;
                AbstractC3341iD.j(set8);
                return set8;
            case 28:
                return new C4119wl();
            default:
                return EnumC3121e9.INTERSTITIAL;
        }
    }

    public C4089w8(C3849rl c3849rl) {
        this.f34801a = 21;
    }
}
