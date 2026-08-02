package ru.yandex.taxi.scooters.experiments;

import defpackage.a650;
import defpackage.e8x;
import defpackage.fk5;
import defpackage.gsq0;
import defpackage.ixi;
import defpackage.tkn0;
import defpackage.v5g0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/experiments/g0;", "Lw96;", "Companion", "tkn0", "skn0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g0 extends w96 {
    public static final tkn0 Companion = new tkn0();
    public static final g0 m = new g0(2046);
    public final boolean b;
    public final v5g0 c;
    public final String d;
    public final String e;
    public final Integer f;
    public final a650 g;
    public final FinishCard h;
    public final fk5 i;
    public final e8x j;
    public final ScootersCardV2 k;
    public final ixi l;

    public /* synthetic */ g0(int i, boolean z, v5g0 v5g0Var, String str, String str2, Integer num, a650 a650Var, FinishCard finishCard, fk5 fk5Var, e8x e8xVar, ScootersCardV2 scootersCardV2, ixi ixiVar) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = v5g0Var;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = a650Var;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = finishCard;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = fk5Var;
        }
        if ((i & 256) == 0) {
            this.j = new e8x(0);
        } else {
            this.j = e8xVar;
        }
        if ((i & 512) == 0) {
            this.k = new ScootersCardV2(0);
        } else {
            this.k = scootersCardV2;
        }
        if ((i & 1024) == 0) {
            this.l = null;
        } else {
            this.l = ixiVar;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.w96
    public final boolean h() {
        return getB() && this != m;
    }

    public g0() {
        this(2047);
    }

    public g0(int i) {
        e8x e8xVar = new e8x(0);
        ScootersCardV2 scootersCardV2 = new ScootersCardV2(0);
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = "";
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = e8xVar;
        this.k = scootersCardV2;
        this.l = null;
    }
}
