package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Vl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2851Vl implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29029a;

    public /* synthetic */ C2851Vl(int i) {
        this.f29029a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f29029a) {
            case 0:
                return com.anythink.expressad.foundation.g.a.f.f19909d;
            case 1:
                return EnumC3144e9.AD_LOADER;
            case 2:
                return com.anythink.expressad.foundation.g.a.f.f19906a;
            case 3:
                return null;
            case 4:
                return new Er();
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return new C4252yn();
            case 9:
                return new C2700Mn();
            case 10:
                return new C2768Qn();
            case 11:
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C2819Tn(c3383ig);
            case 12:
                return new C2853Vn(11, 12, 1007);
            case 13:
                return new C2853Vn(19, 20, 1008);
            case 14:
                return new C2853Vn(13, 14, 1004);
            case 15:
                return new C2853Vn(1001, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 1003);
            case 16:
                return new C2853Vn(15, 16, 1005);
            case 17:
                return new C2853Vn(17, 18, 1006);
            case 18:
                return new C3284go(Ju.SIGNALS, com.anythink.expressad.foundation.d.j.cL);
            case 19:
                return new C3284go(Ju.PRELOADED_LOADER, "t_load_as");
            case 20:
                return new C3768po();
            case 21:
                return new C2565Eo();
            case 22:
                w2.D d9 = C4906k.f40186C.f40191c;
                String uuid = UUID.randomUUID().toString();
                AbstractC3364iD.j(uuid);
                return uuid;
            case 23:
                return new C2719Np();
            case 24:
                C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig2);
                return new C3986tr(c3383ig2);
            case 25:
                return new Fr();
            case 26:
                return new C3020bs();
            case 27:
                C3383ig c3383ig3 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig3);
                return new C3772ps(c3383ig3, 0);
            case 28:
                Object arrayList = new ArrayList();
                C3324ha c3324ha = AbstractC3592ma.id;
                s2.r rVar = s2.r.f40506e;
                if (!((String) rVar.f40509c.a(c3324ha)).isEmpty()) {
                    arrayList = Arrays.asList(((String) rVar.f40509c.a(c3324ha)).split(","));
                }
                AbstractC3364iD.j(arrayList);
                return arrayList;
            default:
                C3383ig c3383ig4 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig4);
                return new C3772ps(c3383ig4, 1);
        }
    }
}
