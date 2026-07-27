package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class VO {

    /* renamed from: a, reason: collision with root package name */
    public final int f28191a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28192b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28193c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28194d;

    /* renamed from: e, reason: collision with root package name */
    public final C2744Qj f28195e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28196f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28197g;

    public /* synthetic */ VO(C3006c1 c3006c1) {
        this.f28191a = c3006c1.f29408a;
        this.f28192b = c3006c1.f29409b;
        this.f28193c = c3006c1.f29410c;
        this.f28194d = c3006c1.f29411d;
        this.f28195e = (C2744Qj) c3006c1.f29414g;
        this.f28196f = c3006c1.f29412e;
        this.f28197g = c3006c1.f29413f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VO.class == obj.getClass()) {
            VO vo = (VO) obj;
            if (this.f28191a == vo.f28191a && this.f28192b == vo.f28192b && this.f28193c == vo.f28193c && this.f28194d == vo.f28194d && this.f28196f == vo.f28196f && this.f28197g == vo.f28197g && this.f28195e.equals(vo.f28195e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f28191a);
        Integer valueOf2 = Integer.valueOf(this.f28192b);
        Integer valueOf3 = Integer.valueOf(this.f28193c);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(valueOf, valueOf2, valueOf3, bool, bool, Integer.valueOf(this.f28194d), this.f28195e, Integer.valueOf(this.f28196f), Integer.valueOf(this.f28197g), bool, bool);
    }
}
