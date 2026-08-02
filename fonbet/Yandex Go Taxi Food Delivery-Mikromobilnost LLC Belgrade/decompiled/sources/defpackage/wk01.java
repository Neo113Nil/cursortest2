package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainState$Success$OpenScenario;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes3.dex */
public final class wk01 implements xk01 {
    public final boolean A;
    public final boolean B;
    public final vm01 C;
    public final ActionButtonEntity D;
    public final List E;
    public final Set F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;
    public final TransferScenario a;
    public final TransferDirection b;
    public final String c;
    public final BigDecimal d;
    public final String e;
    public final cf6 f;
    public final ak1 g;
    public final vg6 h;
    public final wjq0 i;
    public final unq j;
    public final String k;
    public final Boolean l;
    public final List m;
    public final String n;
    public final boolean o;
    public final eh01 p;
    public final u031 q;
    public final String r;
    public final boolean s;
    public final boolean t;
    public final String u;
    public final TransferMainState$Success$OpenScenario v;
    public final String w;
    public final boolean x;
    public final String y;
    public final boolean z;

    public wk01(TransferScenario transferScenario, TransferDirection transferDirection, String str, BigDecimal bigDecimal, String str2, cf6 cf6Var, ak1 ak1Var, vg6 vg6Var, wjq0 wjq0Var, unq unqVar, String str3, Boolean bool, List list, String str4, boolean z, eh01 eh01Var, u031 u031Var, String str5, boolean z2, boolean z3, String str6, TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario, String str7, boolean z4, String str8, boolean z5, boolean z6, boolean z7, vm01 vm01Var, ActionButtonEntity actionButtonEntity, List list2, Set set, String str9, String str10, String str11, String str12) {
        this.a = transferScenario;
        this.b = transferDirection;
        this.c = str;
        this.d = bigDecimal;
        this.e = str2;
        this.f = cf6Var;
        this.g = ak1Var;
        this.h = vg6Var;
        this.i = wjq0Var;
        this.j = unqVar;
        this.k = str3;
        this.l = bool;
        this.m = list;
        this.n = str4;
        this.o = z;
        this.p = eh01Var;
        this.q = u031Var;
        this.r = str5;
        this.s = z2;
        this.t = z3;
        this.u = str6;
        this.v = transferMainState$Success$OpenScenario;
        this.w = str7;
        this.x = z4;
        this.y = str8;
        this.z = z5;
        this.A = z6;
        this.B = z7;
        this.C = vm01Var;
        this.D = actionButtonEntity;
        this.E = list2;
        this.F = set;
        this.G = str9;
        this.H = str10;
        this.I = str11;
        this.J = str12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.Set] */
    public static wk01 b(wk01 wk01Var, String str, BigDecimal bigDecimal, String str2, cf6 cf6Var, ak1 ak1Var, vg6 vg6Var, wjq0 wjq0Var, unq unqVar, String str3, Boolean bool, ArrayList arrayList, eh01 eh01Var, u031 u031Var, boolean z, boolean z2, String str4, TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario, boolean z3, String str5, boolean z4, vm01 vm01Var, ActionButtonEntity actionButtonEntity, LinkedHashSet linkedHashSet, String str6, String str7, String str8, String str9, int i, int i2) {
        String str10;
        boolean z5;
        String str11;
        boolean z6;
        boolean z7;
        vm01 vm01Var2;
        List list;
        LinkedHashSet linkedHashSet2;
        TransferScenario transferScenario = wk01Var.a;
        TransferDirection transferDirection = wk01Var.b;
        String str12 = (i & 4) != 0 ? wk01Var.c : str;
        BigDecimal bigDecimal2 = (i & 8) != 0 ? wk01Var.d : bigDecimal;
        String str13 = (i & 16) != 0 ? wk01Var.e : str2;
        cf6 cf6Var2 = (i & 32) != 0 ? wk01Var.f : cf6Var;
        ak1 ak1Var2 = (i & 64) != 0 ? wk01Var.g : ak1Var;
        vg6 vg6Var2 = (i & 128) != 0 ? wk01Var.h : vg6Var;
        wjq0 wjq0Var2 = (i & 256) != 0 ? wk01Var.i : wjq0Var;
        unq unqVar2 = (i & 512) != 0 ? wk01Var.j : unqVar;
        String str14 = (i & 1024) != 0 ? wk01Var.k : str3;
        Boolean bool2 = (i & 2048) != 0 ? wk01Var.l : bool;
        List list2 = (i & 4096) != 0 ? wk01Var.m : arrayList;
        String str15 = wk01Var.n;
        String str16 = str12;
        BigDecimal bigDecimal3 = bigDecimal2;
        String str17 = str13;
        cf6 cf6Var3 = cf6Var2;
        ak1 ak1Var3 = ak1Var2;
        vg6 vg6Var3 = vg6Var2;
        wjq0 wjq0Var3 = wjq0Var2;
        unq unqVar3 = unqVar2;
        String str18 = str14;
        Boolean bool3 = bool2;
        List list3 = list2;
        boolean z8 = wk01Var.o;
        eh01 eh01Var2 = (i & 32768) != 0 ? wk01Var.p : eh01Var;
        u031 u031Var2 = (i & 65536) != 0 ? wk01Var.q : u031Var;
        String str19 = wk01Var.r;
        if ((i & 262144) != 0) {
            str10 = str19;
            z5 = wk01Var.s;
        } else {
            str10 = str19;
            z5 = z;
        }
        boolean z9 = (i & 524288) != 0 ? wk01Var.t : z2;
        String str20 = (i & 1048576) != 0 ? wk01Var.u : str4;
        TransferMainState$Success$OpenScenario transferMainState$Success$OpenScenario2 = (i & 2097152) != 0 ? wk01Var.v : transferMainState$Success$OpenScenario;
        String str21 = wk01Var.w;
        if ((i & SelfTester_JCP.ENCRYPT_CNT) != 0) {
            str11 = str21;
            z6 = wk01Var.x;
        } else {
            str11 = str21;
            z6 = z3;
        }
        String str22 = (i & 16777216) != 0 ? wk01Var.y : str5;
        boolean z10 = (i & SelfTester_JCP.DECRYPT_CFB) != 0 ? wk01Var.z : z4;
        boolean z11 = wk01Var.A;
        boolean z12 = wk01Var.B;
        if ((i & SelfTester_JCP.IMITA) != 0) {
            z7 = z12;
            vm01Var2 = wk01Var.C;
        } else {
            z7 = z12;
            vm01Var2 = vm01Var;
        }
        ActionButtonEntity actionButtonEntity2 = (i & 536870912) != 0 ? wk01Var.D : actionButtonEntity;
        List list4 = wk01Var.E;
        if ((i & Integer.MIN_VALUE) != 0) {
            list = list4;
            linkedHashSet2 = wk01Var.F;
        } else {
            list = list4;
            linkedHashSet2 = linkedHashSet;
        }
        String str23 = (i2 & 1) != 0 ? wk01Var.G : str6;
        String str24 = (i2 & 2) != 0 ? wk01Var.H : str7;
        String str25 = (i2 & 4) != 0 ? wk01Var.I : str8;
        String str26 = (i2 & 8) != 0 ? wk01Var.J : str9;
        wk01Var.getClass();
        return new wk01(transferScenario, transferDirection, str16, bigDecimal3, str17, cf6Var3, ak1Var3, vg6Var3, wjq0Var3, unqVar3, str18, bool3, list3, str15, z8, eh01Var2, u031Var2, str10, z5, z9, str20, transferMainState$Success$OpenScenario2, str11, z6, str22, z10, z11, z7, vm01Var2, actionButtonEntity2, list, linkedHashSet2, str23, str24, str25, str26);
    }

    @Override // defpackage.xk01
    public final Set a() {
        return this.F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk01)) {
            return false;
        }
        wk01 wk01Var = (wk01) obj;
        return this.a == wk01Var.a && this.b == wk01Var.b && jl40.l(this.c, wk01Var.c) && this.d.equals(wk01Var.d) && jl40.l(this.e, wk01Var.e) && jl40.l(this.f, wk01Var.f) && this.g.equals(wk01Var.g) && jl40.l(this.h, wk01Var.h) && jl40.l(this.i, wk01Var.i) && jl40.l(this.j, wk01Var.j) && jl40.l(this.k, wk01Var.k) && jl40.l(this.l, wk01Var.l) && jl40.l(this.m, wk01Var.m) && jl40.l(this.n, wk01Var.n) && this.o == wk01Var.o && jl40.l(this.p, wk01Var.p) && jl40.l(this.q, wk01Var.q) && jl40.l(this.r, wk01Var.r) && this.s == wk01Var.s && this.t == wk01Var.t && jl40.l(this.u, wk01Var.u) && this.v == wk01Var.v && jl40.l(this.w, wk01Var.w) && this.x == wk01Var.x && this.y.equals(wk01Var.y) && this.z == wk01Var.z && this.A == wk01Var.A && this.B == wk01Var.B && jl40.l(this.C, wk01Var.C) && jl40.l(this.D, wk01Var.D) && jl40.l(this.E, wk01Var.E) && this.F.equals(wk01Var.F) && jl40.l(this.G, wk01Var.G) && jl40.l(this.H, wk01Var.H) && jl40.l(this.I, wk01Var.I) && jl40.l(this.J, wk01Var.J);
    }

    public final int hashCode() {
        TransferScenario transferScenario = this.a;
        int f = smw0.f(this.d, unr0.b((this.b.hashCode() + ((transferScenario == null ? 0 : transferScenario.hashCode()) * 31)) * 31, 31, this.c), 31);
        String str = this.e;
        int hashCode = (f + (str == null ? 0 : str.hashCode())) * 31;
        cf6 cf6Var = this.f;
        int hashCode2 = (this.g.hashCode() + ((hashCode + (cf6Var == null ? 0 : cf6Var.hashCode())) * 31)) * 31;
        vg6 vg6Var = this.h;
        int hashCode3 = (hashCode2 + (vg6Var == null ? 0 : vg6Var.hashCode())) * 31;
        wjq0 wjq0Var = this.i;
        int hashCode4 = (hashCode3 + (wjq0Var == null ? 0 : wjq0Var.hashCode())) * 31;
        unq unqVar = this.j;
        int hashCode5 = (hashCode4 + (unqVar == null ? 0 : unqVar.hashCode())) * 31;
        String str2 = this.k;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.l;
        int e = unr0.e(unr0.b(unr0.c((hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.m), 31, this.n), 31, this.o);
        eh01 eh01Var = this.p;
        int hashCode7 = (this.q.hashCode() + ((e + (eh01Var == null ? 0 : eh01Var.hashCode())) * 31)) * 31;
        String str3 = this.r;
        int e2 = unr0.e(unr0.e((hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.s), 31, this.t);
        String str4 = this.u;
        int hashCode8 = (this.v.hashCode() + ((e2 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.w;
        int e3 = unr0.e(unr0.e(unr0.e(unr0.b(unr0.e((hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B);
        vm01 vm01Var = this.C;
        int hashCode9 = (e3 + (vm01Var == null ? 0 : vm01Var.hashCode())) * 31;
        ActionButtonEntity actionButtonEntity = this.D;
        int hashCode10 = (hashCode9 + (actionButtonEntity == null ? 0 : actionButtonEntity.hashCode())) * 31;
        List list = this.E;
        int e4 = g8e.e(this.F, (hashCode10 + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str6 = this.G;
        int hashCode11 = (e4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.H;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.I;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.J;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(scenario=");
        sb.append(this.a);
        sb.append(", direction=");
        sb.append(this.b);
        sb.append(", currency=");
        sb.append(this.c);
        sb.append(", transferringAmount=");
        sb.append(this.d);
        sb.append(", comment=");
        sb.append(this.e);
        sb.append(", bottomSheetContent=");
        sb.append(this.f);
        sb.append(", selectedMainAgreement=");
        sb.append(this.g);
        sb.append(", bottomSheetState=");
        sb.append(this.h);
        sb.append(", selectedTransferSubject=");
        sb.append(this.i);
        sb.append(", fee=");
        sb.append(this.j);
        sb.append(", preConfirmAction=");
        tse0.A(sb, this.k, ", dropPreConfirmActionAfterUse=", this.l, ", agreements=");
        oyr.D(", mainAgreementBottomSheetTitle=", this.n, ", showOpenAccountsFromMarker=", sb, this.m);
        sb.append(this.o);
        sb.append(", lastSelectedCircleButton=");
        sb.append(this.p);
        sb.append(", validation=");
        sb.append(this.q);
        sb.append(", toolbarTitle=");
        sb.append(this.r);
        sb.append(", callCheckOnResume=");
        nnm.v(", ignoreAmountInCheckOnResume=", ", transferId=", sb, this.s, this.t);
        sb.append(this.u);
        sb.append(", openScenario=");
        sb.append(this.v);
        sb.append(", phone=");
        tse0.y(this.w, ", dialogShowing=", ", dialogComment=", sb, this.x);
        tse0.y(this.y, ", deeplinkBottomSheetShowing=", ", isAmountEditable=", sb, this.z);
        nnm.v(", isCommentEditable=", ", widgetWithToggle=", sb, this.A, this.B);
        sb.append(this.C);
        sb.append(", primaryButton=");
        sb.append(this.D);
        sb.append(", autotopupWhitelistNspkMembersConfirmation=");
        sb.append(this.E);
        sb.append(", m2mSelectedActionCompletedBankIds=");
        sb.append(this.F);
        sb.append(", b2cResolvedInfoText=");
        g8e.D(sb, this.G, ", b2cPlanToken=", this.H, ", b2cTermsInMonth=");
        return g8e.r(sb, this.I, ", destinationCountry=", this.J, Extension.C_BRAKE);
    }
}
