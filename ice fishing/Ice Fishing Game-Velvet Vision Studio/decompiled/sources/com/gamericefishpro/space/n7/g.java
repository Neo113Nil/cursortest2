package com.gamericefishpro.space.n7;

import com.gamericefishpro.space.t0.y0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.gamericefishpro.space.b7.a {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final Pair g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final a m;
    public final int n;
    public final int o;
    public final Map p;
    public final com.gamericefishpro.space.i7.d q;
    public final a0 r;

    public g(List board, int i, int i2, int i3, int i4, int i5, Pair pair, boolean z, int i6, boolean z2, boolean z3, boolean z4, a defeatReason, int i7, int i8, Map powerUps, com.gamericefishpro.space.i7.d dVar, a0 a0Var) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(defeatReason, "defeatReason");
        Intrinsics.checkNotNullParameter(powerUps, "powerUps");
        this.a = board;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = pair;
        this.h = z;
        this.i = i6;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = defeatReason;
        this.n = i7;
        this.o = i8;
        this.p = powerUps;
        this.q = dVar;
        this.r = a0Var;
    }

    public static g a(g gVar, ArrayList arrayList, int i, int i2, int i3, int i4, int i5, Pair pair, boolean z, int i6, boolean z2, boolean z3, boolean z4, a aVar, int i7, int i8, LinkedHashMap linkedHashMap, com.gamericefishpro.space.i7.d dVar, a0 a0Var, int i9) {
        List board = (i9 & 1) != 0 ? gVar.a : arrayList;
        int i10 = (i9 & 2) != 0 ? gVar.b : i;
        int i11 = (i9 & 4) != 0 ? gVar.c : i2;
        int i12 = (i9 & 8) != 0 ? gVar.d : i3;
        int i13 = (i9 & 16) != 0 ? gVar.e : i4;
        int i14 = (i9 & 32) != 0 ? gVar.f : i5;
        Pair pair2 = (i9 & 64) != 0 ? gVar.g : pair;
        boolean z5 = (i9 & 128) != 0 ? gVar.h : z;
        int i15 = (i9 & 256) != 0 ? gVar.i : i6;
        boolean z6 = (i9 & 512) != 0 ? gVar.j : z2;
        boolean z7 = (i9 & 1024) != 0 ? gVar.k : z3;
        boolean z8 = (i9 & 2048) != 0 ? gVar.l : z4;
        a defeatReason = (i9 & 4096) != 0 ? gVar.m : aVar;
        int i16 = (i9 & 8192) != 0 ? gVar.n : i7;
        int i17 = i10;
        int i18 = (i9 & 16384) != 0 ? gVar.o : i8;
        Map powerUps = (i9 & 32768) != 0 ? gVar.p : linkedHashMap;
        int i19 = i18;
        com.gamericefishpro.space.i7.d dVar2 = (i9 & 65536) != 0 ? gVar.q : dVar;
        a0 a0Var2 = (i9 & 131072) != 0 ? gVar.r : a0Var;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(defeatReason, "defeatReason");
        Intrinsics.checkNotNullParameter(powerUps, "powerUps");
        return new g(board, i17, i11, i12, i13, i14, pair2, z5, i15, z6, z7, z8, defeatReason, i16, i19, powerUps, dVar2, a0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.a, gVar.a) && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d && this.e == gVar.e && this.f == gVar.f && Intrinsics.a(this.g, gVar.g) && this.h == gVar.h && this.i == gVar.i && this.j == gVar.j && this.k == gVar.k && this.l == gVar.l && this.m == gVar.m && this.n == gVar.n && this.o == gVar.o && Intrinsics.a(this.p, gVar.p) && this.q == gVar.q && Intrinsics.a(this.r, gVar.r);
    }

    public final int hashCode() {
        int iT = com.gamericefishpro.space.m5.a.t(this.f, com.gamericefishpro.space.m5.a.t(this.e, com.gamericefishpro.space.m5.a.t(this.d, com.gamericefishpro.space.m5.a.t(this.c, com.gamericefishpro.space.m5.a.t(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
        Pair pair = this.g;
        int iHashCode = (this.p.hashCode() + com.gamericefishpro.space.m5.a.t(this.o, com.gamericefishpro.space.m5.a.t(this.n, (this.m.hashCode() + y0.c(y0.c(y0.c(com.gamericefishpro.space.m5.a.t(this.i, y0.c((iT + (pair == null ? 0 : pair.hashCode())) * 31, 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l)) * 31, 31), 31)) * 31;
        com.gamericefishpro.space.i7.d dVar = this.q;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a0 a0Var = this.r;
        return iHashCode2 + (a0Var != null ? a0Var.hashCode() : 0);
    }

    public final String toString() {
        return "GameUiState(board=" + this.a + ", score=" + this.b + ", targetScore=" + this.c + ", movesLeft=" + this.d + ", timeLeft=" + this.e + ", totalTime=" + this.f + ", selectedTile=" + this.g + ", isProcessing=" + this.h + ", comboMultiplier=" + this.i + ", showExitDialog=" + this.j + ", isWin=" + this.k + ", isDefeat=" + this.l + ", defeatReason=" + this.m + ", earnedStars=" + this.n + ", coins=" + this.o + ", powerUps=" + this.p + ", activePowerUp=" + this.q + ", powerUpPreview=" + this.r + ")";
    }
}
