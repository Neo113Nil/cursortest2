package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class VO {

    /* renamed from: a, reason: collision with root package name */
    public final int f28987a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28988b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28989c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28990d;

    /* renamed from: e, reason: collision with root package name */
    public final C2764Qj f28991e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28992f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28993g;

    public /* synthetic */ VO(C3029c1 c3029c1) {
        this.f28987a = c3029c1.f30191a;
        this.f28988b = c3029c1.f30192b;
        this.f28989c = c3029c1.f30193c;
        this.f28990d = c3029c1.f30194d;
        this.f28991e = (C2764Qj) c3029c1.f30197g;
        this.f28992f = c3029c1.f30195e;
        this.f28993g = c3029c1.f30196f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VO.class == obj.getClass()) {
            VO vo = (VO) obj;
            if (this.f28987a == vo.f28987a && this.f28988b == vo.f28988b && this.f28989c == vo.f28989c && this.f28990d == vo.f28990d && this.f28992f == vo.f28992f && this.f28993g == vo.f28993g && this.f28991e.equals(vo.f28991e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f28987a);
        Integer valueOf2 = Integer.valueOf(this.f28988b);
        Integer valueOf3 = Integer.valueOf(this.f28989c);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(valueOf, valueOf2, valueOf3, bool, bool, Integer.valueOf(this.f28990d), this.f28991e, Integer.valueOf(this.f28992f), Integer.valueOf(this.f28993g), bool, bool);
    }
}
