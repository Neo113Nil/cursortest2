package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Ul, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2812Ul implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27973a;

    public /* synthetic */ C2812Ul(int i) {
        this.f27973a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f27973a) {
            case 0:
                return com.anythink.expressad.foundation.g.a.f.f19122d;
            case 1:
                return EnumC3121e9.AD_LOADER;
            case 2:
                return com.anythink.expressad.foundation.g.a.f.f19119a;
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
                return new C4175xn();
            case 9:
                return new C2663Ln();
            case 10:
                return new C2731Pn();
            case 11:
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C2782Sn(c3360ig);
            case 12:
                return new C2814Un(11, 12, 1007);
            case 13:
                return new C2814Un(19, 20, 1008);
            case 14:
                return new C2814Un(13, 14, 1004);
            case 15:
                return new C2814Un(1001, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 1003);
            case 16:
                return new C2814Un(15, 16, 1005);
            case 17:
                return new C2814Un(17, 18, 1006);
            case 18:
                return new C3207fo(Ju.SIGNALS, com.anythink.expressad.foundation.d.j.cL);
            case 19:
                return new C3207fo(Ju.PRELOADED_LOADER, "t_load_as");
            case 20:
                return new C3691oo();
            case 21:
                return new C2528Do();
            case 22:
                u2.D d2 = C4835j.f39733C.f39738c;
                String uuid = UUID.randomUUID().toString();
                AbstractC3341iD.j(uuid);
                return uuid;
            case 23:
                return new C2699Np();
            case 24:
                C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig2);
                return new C3963tr(c3360ig2);
            case 25:
                return new Fr();
            case 26:
                return new C2997bs();
            case 27:
                C3360ig c3360ig3 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig3);
                return new C3749ps(c3360ig3, 0);
            case 28:
                Object arrayList = new ArrayList();
                C3301ha c3301ha = AbstractC3569ma.id;
                q2.r rVar = q2.r.f40207e;
                if (!((String) rVar.f40210c.a(c3301ha)).isEmpty()) {
                    arrayList = Arrays.asList(((String) rVar.f40210c.a(c3301ha)).split(","));
                }
                AbstractC3341iD.j(arrayList);
                return arrayList;
            default:
                C3360ig c3360ig4 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig4);
                return new C3749ps(c3360ig4, 1);
        }
    }
}
