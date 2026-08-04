package com.gamericefishpro.space.f7;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d0.q0;
import com.gamericefishpro.space.d7.n;
import com.gamericefishpro.space.d7.o;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.d0;
import com.gamericefishpro.space.pi.e0;
import com.gamericefishpro.space.pi.x;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ Context A;
    public Object d;
    public Object e;
    public Object i;
    public int v;
    public int w;
    public /* synthetic */ Object y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, Context context, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.z = jVar;
        this.A = context;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        h hVar = new h(this.z, this.A, aVar);
        hVar.y = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:20:0x00db  */
    /* JADX WARN: Code duplicated, block: B:23:0x0139  */
    /* JADX WARN: Code duplicated, block: B:27:0x0153  */
    /* JADX WARN: Code duplicated, block: B:31:0x016f A[PHI: r2 r3 r8 r9 r10 r11
      0x016f: PHI (r2v12 int) = (r2v10 int), (r2v13 int) binds: [B:29:0x016b, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r3v7 java.lang.String) = (r3v3 java.lang.String), (r3v10 java.lang.String) binds: [B:29:0x016b, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r8v17 java.lang.String) = (r8v13 java.lang.String), (r8v20 java.lang.String) binds: [B:29:0x016b, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r9v16 com.gamericefishpro.space.pi.d0) = (r9v12 com.gamericefishpro.space.pi.d0), (r9v19 com.gamericefishpro.space.pi.d0) binds: [B:29:0x016b, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r10v13 java.lang.Object) = (r10v10 java.lang.Object), (r10v18 java.lang.Object) binds: [B:29:0x016b, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x016f: PHI (r11v9 com.gamericefishpro.space.pi.d0) = (r11v7 com.gamericefishpro.space.pi.d0), (r11v11 com.gamericefishpro.space.pi.d0) binds: [B:29:0x016b, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0185  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:45:0x01da  */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        x xVar;
        Object objA;
        o oVar;
        e0 e0VarE;
        e0 e0VarE2;
        d0 d0VarE;
        e0 e0VarE3;
        Object objR;
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        int i;
        String str;
        Object objX;
        d0 d0Var4;
        String str2;
        String str3;
        Object objX2;
        String str4;
        Object objX3;
        String str5;
        String str6;
        d0 d0Var5;
        String str7;
        String str8;
        Object objX4;
        String str9;
        String str10;
        String str11;
        String str12;
        o oVar2;
        Object objH;
        o oVar3;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = this.w;
        j jVar = this.z;
        com.gamericefishpro.space.th.a aVar2 = null;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.wa.b.P(obj);
                xVar = (x) this.y;
                n nVar = jVar.b;
                this.y = xVar;
                this.w = 1;
                objA = nVar.a(this);
                if (objA != aVar) {
                    oVar = (o) objA;
                    if (oVar != null) {
                        jVar.getClass();
                        return new com.gamericefishpro.space.h7.a(oVar.b, oVar.c, oVar.d, oVar.e, oVar.f);
                    }
                    String string = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    a0.u(xVar, null, new e(string, aVar2, 0), 3);
                    Context context = this.A;
                    e0 e0VarE4 = a0.e(xVar, null, new f(jVar, context, aVar2, 2), 3);
                    e0VarE = a0.e(xVar, null, new f(jVar, context, aVar2, 1), 3);
                    e0VarE2 = a0.e(xVar, null, new com.gamericefishpro.space.b0.o(jVar, string, aVar2, 7), 3);
                    int i3 = 0;
                    d0VarE = a0.e(xVar, null, new f(jVar, context, aVar2, i3), 3);
                    e0VarE3 = a0.e(xVar, null, new g(2, i3, aVar2), 3);
                    this.y = e0VarE;
                    this.d = e0VarE2;
                    this.e = d0VarE;
                    this.i = e0VarE3;
                    this.v = 0;
                    this.w = 2;
                    objR = e0VarE4.r(this);
                    if (objR != aVar) {
                        d0Var = e0VarE;
                        d0Var2 = e0VarE2;
                        d0Var3 = e0VarE3;
                        i = 0;
                        str = (String) objR;
                        this.y = d0Var2;
                        this.d = d0VarE;
                        this.e = d0Var3;
                        this.i = str;
                        this.v = i;
                        this.w = 3;
                        objX = d0Var.x(this);
                        if (objX != aVar) {
                            d0Var4 = d0Var3;
                            str2 = str;
                            str3 = (String) objX;
                            this.y = d0VarE;
                            this.d = d0Var4;
                            this.e = str2;
                            this.i = str3;
                            this.v = i;
                            this.w = 4;
                            objX2 = d0Var2.x(this);
                            if (objX2 != aVar) {
                                str4 = (String) objX2;
                                this.y = d0Var4;
                                this.d = str2;
                                this.e = str3;
                                this.i = str4;
                                this.v = i;
                                this.w = 5;
                                objX3 = d0VarE.x(this);
                                if (objX3 != aVar) {
                                    String str13 = str2;
                                    str5 = str3;
                                    str6 = str4;
                                    d0Var5 = d0Var4;
                                    str7 = str13;
                                    str8 = (String) objX3;
                                    this.y = str7;
                                    this.d = str5;
                                    this.e = str6;
                                    this.i = str8;
                                    this.v = i;
                                    this.w = 6;
                                    objX4 = d0Var5.x(this);
                                    if (objX4 != aVar) {
                                        str9 = str8;
                                        str10 = str6;
                                        str11 = str7;
                                        str12 = str5;
                                        Intrinsics.checkNotNullExpressionValue(objX4, "await(...)");
                                        oVar2 = new o(1, str11, str12, str10, str9, (String) objX4, false, false, 0);
                                        n nVar2 = jVar.b;
                                        this.y = oVar2;
                                        this.d = null;
                                        this.e = null;
                                        this.i = null;
                                        this.w = 7;
                                        objH = com.gamericefishpro.space.hj.c.H(nVar2.a, this, new q0(6, nVar2, oVar2), false, true);
                                        if (objH != aVar) {
                                            objH = Unit.a;
                                        }
                                        if (objH != aVar) {
                                            oVar3 = oVar2;
                                            jVar.getClass();
                                            return new com.gamericefishpro.space.h7.a(oVar3.b, oVar3.c, oVar3.d, oVar3.e, oVar3.f);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                xVar = (x) this.y;
                com.gamericefishpro.space.wa.b.P(obj);
                objA = obj;
                oVar = (o) objA;
                if (oVar != null) {
                    jVar.getClass();
                    return new com.gamericefishpro.space.h7.a(oVar.b, oVar.c, oVar.d, oVar.e, oVar.f);
                }
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                a0.u(xVar, null, new e(string2, aVar2, 0), 3);
                Context context2 = this.A;
                e0 e0VarE5 = a0.e(xVar, null, new f(jVar, context2, aVar2, 2), 3);
                e0VarE = a0.e(xVar, null, new f(jVar, context2, aVar2, 1), 3);
                e0VarE2 = a0.e(xVar, null, new com.gamericefishpro.space.b0.o(jVar, string2, aVar2, 7), 3);
                int i4 = 0;
                d0VarE = a0.e(xVar, null, new f(jVar, context2, aVar2, i4), 3);
                e0VarE3 = a0.e(xVar, null, new g(2, i4, aVar2), 3);
                this.y = e0VarE;
                this.d = e0VarE2;
                this.e = d0VarE;
                this.i = e0VarE3;
                this.v = 0;
                this.w = 2;
                objR = e0VarE5.r(this);
                if (objR != aVar) {
                    d0Var = e0VarE;
                    d0Var2 = e0VarE2;
                    d0Var3 = e0VarE3;
                    i = 0;
                    str = (String) objR;
                    this.y = d0Var2;
                    this.d = d0VarE;
                    this.e = d0Var3;
                    this.i = str;
                    this.v = i;
                    this.w = 3;
                    objX = d0Var.x(this);
                    if (objX != aVar) {
                        d0Var4 = d0Var3;
                        str2 = str;
                        str3 = (String) objX;
                        this.y = d0VarE;
                        this.d = d0Var4;
                        this.e = str2;
                        this.i = str3;
                        this.v = i;
                        this.w = 4;
                        objX2 = d0Var2.x(this);
                        if (objX2 != aVar) {
                            str4 = (String) objX2;
                            this.y = d0Var4;
                            this.d = str2;
                            this.e = str3;
                            this.i = str4;
                            this.v = i;
                            this.w = 5;
                            objX3 = d0VarE.x(this);
                            if (objX3 != aVar) {
                                String str14 = str2;
                                str5 = str3;
                                str6 = str4;
                                d0Var5 = d0Var4;
                                str7 = str14;
                                str8 = (String) objX3;
                                this.y = str7;
                                this.d = str5;
                                this.e = str6;
                                this.i = str8;
                                this.v = i;
                                this.w = 6;
                                objX4 = d0Var5.x(this);
                                if (objX4 != aVar) {
                                    str9 = str8;
                                    str10 = str6;
                                    str11 = str7;
                                    str12 = str5;
                                    Intrinsics.checkNotNullExpressionValue(objX4, "await(...)");
                                    oVar2 = new o(1, str11, str12, str10, str9, (String) objX4, false, false, 0);
                                    n nVar3 = jVar.b;
                                    this.y = oVar2;
                                    this.d = null;
                                    this.e = null;
                                    this.i = null;
                                    this.w = 7;
                                    objH = com.gamericefishpro.space.hj.c.H(nVar3.a, this, new q0(6, nVar3, oVar2), false, true);
                                    if (objH != aVar) {
                                        objH = Unit.a;
                                    }
                                    if (objH != aVar) {
                                        oVar3 = oVar2;
                                        jVar.getClass();
                                        return new com.gamericefishpro.space.h7.a(oVar3.b, oVar3.c, oVar3.d, oVar3.e, oVar3.f);
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 2:
                i = this.v;
                d0Var3 = (d0) this.i;
                d0 d0Var6 = (d0) this.e;
                d0Var2 = (d0) this.d;
                d0 d0Var7 = (d0) this.y;
                com.gamericefishpro.space.wa.b.P(obj);
                d0Var = d0Var7;
                d0VarE = d0Var6;
                objR = obj;
                str = (String) objR;
                this.y = d0Var2;
                this.d = d0VarE;
                this.e = d0Var3;
                this.i = str;
                this.v = i;
                this.w = 3;
                objX = d0Var.x(this);
                if (objX != aVar) {
                    d0Var4 = d0Var3;
                    str2 = str;
                    str3 = (String) objX;
                    this.y = d0VarE;
                    this.d = d0Var4;
                    this.e = str2;
                    this.i = str3;
                    this.v = i;
                    this.w = 4;
                    objX2 = d0Var2.x(this);
                    if (objX2 != aVar) {
                        str4 = (String) objX2;
                        this.y = d0Var4;
                        this.d = str2;
                        this.e = str3;
                        this.i = str4;
                        this.v = i;
                        this.w = 5;
                        objX3 = d0VarE.x(this);
                        if (objX3 != aVar) {
                            String str15 = str2;
                            str5 = str3;
                            str6 = str4;
                            d0Var5 = d0Var4;
                            str7 = str15;
                            str8 = (String) objX3;
                            this.y = str7;
                            this.d = str5;
                            this.e = str6;
                            this.i = str8;
                            this.v = i;
                            this.w = 6;
                            objX4 = d0Var5.x(this);
                            if (objX4 != aVar) {
                                str9 = str8;
                                str10 = str6;
                                str11 = str7;
                                str12 = str5;
                                Intrinsics.checkNotNullExpressionValue(objX4, "await(...)");
                                oVar2 = new o(1, str11, str12, str10, str9, (String) objX4, false, false, 0);
                                n nVar4 = jVar.b;
                                this.y = oVar2;
                                this.d = null;
                                this.e = null;
                                this.i = null;
                                this.w = 7;
                                objH = com.gamericefishpro.space.hj.c.H(nVar4.a, this, new q0(6, nVar4, oVar2), false, true);
                                if (objH != aVar) {
                                    objH = Unit.a;
                                }
                                if (objH != aVar) {
                                    oVar3 = oVar2;
                                    jVar.getClass();
                                    return new com.gamericefishpro.space.h7.a(oVar3.b, oVar3.c, oVar3.d, oVar3.e, oVar3.f);
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 3:
                i = this.v;
                String str16 = (String) this.i;
                d0 d0Var8 = (d0) this.e;
                d0 d0Var9 = (d0) this.d;
                d0Var2 = (d0) this.y;
                com.gamericefishpro.space.wa.b.P(obj);
                d0VarE = d0Var9;
                d0Var4 = d0Var8;
                str2 = str16;
                objX = obj;
                str3 = (String) objX;
                this.y = d0VarE;
                this.d = d0Var4;
                this.e = str2;
                this.i = str3;
                this.v = i;
                this.w = 4;
                objX2 = d0Var2.x(this);
                if (objX2 != aVar) {
                    str4 = (String) objX2;
                    this.y = d0Var4;
                    this.d = str2;
                    this.e = str3;
                    this.i = str4;
                    this.v = i;
                    this.w = 5;
                    objX3 = d0VarE.x(this);
                    if (objX3 != aVar) {
                        String str17 = str2;
                        str5 = str3;
                        str6 = str4;
                        d0Var5 = d0Var4;
                        str7 = str17;
                        str8 = (String) objX3;
                        this.y = str7;
                        this.d = str5;
                        this.e = str6;
                        this.i = str8;
                        this.v = i;
                        this.w = 6;
                        objX4 = d0Var5.x(this);
                        if (objX4 != aVar) {
                            str9 = str8;
                            str10 = str6;
                            str11 = str7;
                            str12 = str5;
                            Intrinsics.checkNotNullExpressionValue(objX4, "await(...)");
                            oVar2 = new o(1, str11, str12, str10, str9, (String) objX4, false, false, 0);
                            n nVar5 = jVar.b;
                            this.y = oVar2;
                            this.d = null;
                            this.e = null;
                            this.i = null;
                            this.w = 7;
                            objH = com.gamericefishpro.space.hj.c.H(nVar5.a, this, new q0(6, nVar5, oVar2), false, true);
                            if (objH != aVar) {
                                objH = Unit.a;
                            }
                            if (objH != aVar) {
                                oVar3 = oVar2;
                                jVar.getClass();
                                return new com.gamericefishpro.space.h7.a(oVar3.b, oVar3.c, oVar3.d, oVar3.e, oVar3.f);
                            }
                        }
                    }
                }
                return aVar;
            case 4:
                i = this.v;
                str3 = (String) this.i;
                str2 = (String) this.e;
                d0Var4 = (d0) this.d;
                d0 d0Var10 = (d0) this.y;
                com.gamericefishpro.space.wa.b.P(obj);
                d0VarE = d0Var10;
                objX2 = obj;
                str4 = (String) objX2;
                this.y = d0Var4;
                this.d = str2;
                this.e = str3;
                this.i = str4;
                this.v = i;
                this.w = 5;
                objX3 = d0VarE.x(this);
                if (objX3 != aVar) {
                    String str18 = str2;
                    str5 = str3;
                    str6 = str4;
                    d0Var5 = d0Var4;
                    str7 = str18;
                    str8 = (String) objX3;
                    this.y = str7;
                    this.d = str5;
                    this.e = str6;
                    this.i = str8;
                    this.v = i;
                    this.w = 6;
                    objX4 = d0Var5.x(this);
                    if (objX4 != aVar) {
                        str9 = str8;
                        str10 = str6;
                        str11 = str7;
                        str12 = str5;
                        Intrinsics.checkNotNullExpressionValue(objX4, "await(...)");
                        oVar2 = new o(1, str11, str12, str10, str9, (String) objX4, false, false, 0);
                        n nVar6 = jVar.b;
                        this.y = oVar2;
                        this.d = null;
                        this.e = null;
                        this.i = null;
                        this.w = 7;
                        objH = com.gamericefishpro.space.hj.c.H(nVar6.a, this, new q0(6, nVar6, oVar2), false, true);
                        if (objH != aVar) {
                            objH = Unit.a;
                        }
                        if (objH != aVar) {
                            oVar3 = oVar2;
                            jVar.getClass();
                            return new com.gamericefishpro.space.h7.a(oVar3.b, oVar3.c, oVar3.d, oVar3.e, oVar3.f);
                        }
                    }
                }
                return aVar;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                i = this.v;
                str6 = (String) this.i;
                str5 = (String) this.e;
                str7 = (String) this.d;
                d0Var5 = (d0) this.y;
                com.gamericefishpro.space.wa.b.P(obj);
                objX3 = obj;
                str8 = (String) objX3;
                this.y = str7;
                this.d = str5;
                this.e = str6;
                this.i = str8;
                this.v = i;
                this.w = 6;
                objX4 = d0Var5.x(this);
                if (objX4 != aVar) {
                    str9 = str8;
                    str10 = str6;
                    str11 = str7;
                    str12 = str5;
                    Intrinsics.checkNotNullExpressionValue(objX4, "await(...)");
                    oVar2 = new o(1, str11, str12, str10, str9, (String) objX4, false, false, 0);
                    n nVar7 = jVar.b;
                    this.y = oVar2;
                    this.d = null;
                    this.e = null;
                    this.i = null;
                    this.w = 7;
                    objH = com.gamericefishpro.space.hj.c.H(nVar7.a, this, new q0(6, nVar7, oVar2), false, true);
                    if (objH != aVar) {
                        objH = Unit.a;
                    }
                    if (objH != aVar) {
                        oVar3 = oVar2;
                        jVar.getClass();
                        return new com.gamericefishpro.space.h7.a(oVar3.b, oVar3.c, oVar3.d, oVar3.e, oVar3.f);
                    }
                }
                return aVar;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                String str19 = (String) this.i;
                String str20 = (String) this.e;
                String str21 = (String) this.d;
                String str22 = (String) this.y;
                com.gamericefishpro.space.wa.b.P(obj);
                str9 = str19;
                objX4 = obj;
                str10 = str20;
                str12 = str21;
                str11 = str22;
                Intrinsics.checkNotNullExpressionValue(objX4, "await(...)");
                oVar2 = new o(1, str11, str12, str10, str9, (String) objX4, false, false, 0);
                n nVar8 = jVar.b;
                this.y = oVar2;
                this.d = null;
                this.e = null;
                this.i = null;
                this.w = 7;
                objH = com.gamericefishpro.space.hj.c.H(nVar8.a, this, new q0(6, nVar8, oVar2), false, true);
                if (objH != aVar) {
                    objH = Unit.a;
                }
                if (objH != aVar) {
                    oVar3 = oVar2;
                    jVar.getClass();
                    return new com.gamericefishpro.space.h7.a(oVar3.b, oVar3.c, oVar3.d, oVar3.e, oVar3.f);
                }
                return aVar;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                oVar3 = (o) this.y;
                com.gamericefishpro.space.wa.b.P(obj);
                jVar.getClass();
                return new com.gamericefishpro.space.h7.a(oVar3.b, oVar3.c, oVar3.d, oVar3.e, oVar3.f);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
