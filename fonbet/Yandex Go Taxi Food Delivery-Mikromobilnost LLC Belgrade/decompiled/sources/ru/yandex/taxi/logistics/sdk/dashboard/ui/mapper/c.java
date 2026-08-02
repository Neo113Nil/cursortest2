package ru.yandex.taxi.logistics.sdk.dashboard.ui.mapper;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.a4b1;
import defpackage.a5z0;
import defpackage.bif0;
import defpackage.c221;
import defpackage.cqu;
import defpackage.df70;
import defpackage.dif0;
import defpackage.dqu;
import defpackage.ef70;
import defpackage.eif0;
import defpackage.fif0;
import defpackage.g191;
import defpackage.g8a1;
import defpackage.hhg;
import defpackage.jd3;
import defpackage.jl40;
import defpackage.jqf0;
import defpackage.kd3;
import defpackage.kqf0;
import defpackage.ky;
import defpackage.l121;
import defpackage.l690;
import defpackage.ldc;
import defpackage.m4z0;
import defpackage.mcu;
import defpackage.mox0;
import defpackage.n4z0;
import defpackage.nki0;
import defpackage.nox0;
import defpackage.ny61;
import defpackage.o37;
import defpackage.oh4;
import defpackage.oki0;
import defpackage.p121;
import defpackage.p37;
import defpackage.q8s;
import defpackage.qa6;
import defpackage.qfc;
import defpackage.r37;
import defpackage.ra90;
import defpackage.rg90;
import defpackage.s37;
import defpackage.s4z0;
import defpackage.so5;
import defpackage.sre;
import defpackage.t4z0;
import defpackage.tgg0;
import defpackage.tre;
import defpackage.u3b1;
import defpackage.ugg0;
import defpackage.v4z0;
import defpackage.w3b1;
import defpackage.w4v;
import defpackage.w4z0;
import defpackage.w511;
import defpackage.wa6;
import defpackage.wjf0;
import defpackage.x4c;
import defpackage.x4z0;
import defpackage.xjf0;
import defpackage.xk4;
import defpackage.y4z0;
import defpackage.yau;
import defpackage.yfa;
import defpackage.z3b1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.HorizontalAlignmentModel;
import ru.yandex.taxi.logistics.sdk.dashboard.ui.state.ImagePositionState;
import ru.yandex.taxi.logistics.sdk.ui_models.progress_bar.PartialProgressBarStyleSides;

/* loaded from: classes5.dex */
public final class c {
    public final g191 a;
    public final xk4 b;
    public final yfa c;
    public final dqu d;
    public final oh4 e;
    public final oh4 f;
    public final q8s g;

    public c(g191 g191Var, xk4 xk4Var, yfa yfaVar, dqu dquVar, oh4 oh4Var, oh4 oh4Var2, q8s q8sVar) {
        this.a = g191Var;
        this.b = xk4Var;
        this.c = yfaVar;
        this.d = dquVar;
        this.e = oh4Var;
        this.f = oh4Var2;
        this.g = q8sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        if (r13 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yau yauVar, boolean z, ContinuationImpl continuationImpl) {
        TileMapper$map$8 tileMapper$map$8;
        int i;
        FormattedText formattedText;
        boolean z2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        boolean z3;
        yau yauVar2;
        FormattedText formattedText2;
        CharSequence charSequence4;
        if (continuationImpl instanceof TileMapper$map$8) {
            tileMapper$map$8 = (TileMapper$map$8) continuationImpl;
            int i2 = tileMapper$map$8.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tileMapper$map$8.label = i2 - Integer.MIN_VALUE;
                Object obj = tileMapper$map$8.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tileMapper$map$8.label;
                q8s q8sVar = this.g;
                CharSequence charSequence5 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(yauVar instanceof m4z0)) {
                        if (!(yauVar instanceof v4z0)) {
                            if (jl40.l(yauVar, l121.a)) {
                                return null;
                            }
                            w511.b();
                            return null;
                        }
                        v4z0 v4z0Var = (v4z0) yauVar;
                        String str = v4z0Var.a;
                        String str2 = v4z0Var.b;
                        qfc qfcVar = v4z0Var.c;
                        yfa yfaVar = this.c;
                        ldc e = qfcVar != null ? yfaVar.e(qfcVar, z) : null;
                        qfc qfcVar2 = v4z0Var.d;
                        return new w4z0(str, str2, e, qfcVar2 != null ? yfaVar.e(qfcVar2, z) : null, v4z0Var.e);
                    }
                    FormattedText formattedText3 = ((m4z0) yauVar).a;
                    tileMapper$map$8.L$0 = yauVar;
                    tileMapper$map$8.Z$0 = z;
                    tileMapper$map$8.label = 1;
                    obj = q8sVar.a(formattedText3, tileMapper$map$8);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            charSequence2 = (CharSequence) tileMapper$map$8.L$3;
                            charSequence4 = (CharSequence) tileMapper$map$8.L$2;
                            kotlin.b.b(obj);
                            charSequence5 = (CharSequence) obj;
                            charSequence = charSequence4;
                            return new n4z0(charSequence, charSequence2, charSequence5);
                        }
                        z3 = tileMapper$map$8.Z$0;
                        charSequence3 = (CharSequence) tileMapper$map$8.L$2;
                        yauVar2 = (yau) tileMapper$map$8.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence6 = (CharSequence) obj;
                        z2 = z3;
                        charSequence2 = charSequence6;
                        yau yauVar3 = yauVar2;
                        charSequence = charSequence3;
                        yauVar = yauVar3;
                        formattedText2 = ((m4z0) yauVar).c;
                        if (formattedText2 != null) {
                            tileMapper$map$8.L$0 = null;
                            tileMapper$map$8.L$1 = null;
                            tileMapper$map$8.L$2 = charSequence;
                            tileMapper$map$8.L$3 = charSequence2;
                            tileMapper$map$8.Z$0 = z2;
                            tileMapper$map$8.I$0 = 0;
                            tileMapper$map$8.label = 3;
                            obj = q8sVar.a(formattedText2, tileMapper$map$8);
                            if (obj != coroutineSingletons) {
                                charSequence4 = charSequence;
                                charSequence5 = (CharSequence) obj;
                                charSequence = charSequence4;
                            }
                            return coroutineSingletons;
                        }
                        return new n4z0(charSequence, charSequence2, charSequence5);
                    }
                    z = tileMapper$map$8.Z$0;
                    yauVar = (yau) tileMapper$map$8.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence7 = (CharSequence) obj;
                formattedText = ((m4z0) yauVar).b;
                if (formattedText != null) {
                    z2 = z;
                    charSequence = charSequence7;
                    charSequence2 = null;
                    formattedText2 = ((m4z0) yauVar).c;
                    if (formattedText2 != null) {
                    }
                    return new n4z0(charSequence, charSequence2, charSequence5);
                }
                tileMapper$map$8.L$0 = yauVar;
                tileMapper$map$8.L$1 = null;
                tileMapper$map$8.L$2 = charSequence7;
                tileMapper$map$8.Z$0 = z;
                tileMapper$map$8.I$0 = 0;
                tileMapper$map$8.label = 2;
                obj = q8sVar.a(formattedText, tileMapper$map$8);
                if (obj != coroutineSingletons) {
                    yau yauVar4 = yauVar;
                    charSequence3 = charSequence7;
                    z3 = z;
                    yauVar2 = yauVar4;
                    CharSequence charSequence62 = (CharSequence) obj;
                    z2 = z3;
                    charSequence2 = charSequence62;
                    yau yauVar32 = yauVar2;
                    charSequence = charSequence3;
                    yauVar = yauVar32;
                    formattedText2 = ((m4z0) yauVar).c;
                    if (formattedText2 != null) {
                    }
                    return new n4z0(charSequence, charSequence2, charSequence5);
                }
                return coroutineSingletons;
            }
        }
        tileMapper$map$8 = new TileMapper$map$8(this, continuationImpl);
        Object obj2 = tileMapper$map$8.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tileMapper$map$8.label;
        q8s q8sVar2 = this.g;
        CharSequence charSequence52 = null;
        if (i != 0) {
        }
        CharSequence charSequence72 = (CharSequence) obj2;
        formattedText = ((m4z0) yauVar).b;
        if (formattedText != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(bif0 bif0Var, ContinuationImpl continuationImpl) {
        TileMapper$map$26 tileMapper$map$26;
        int i;
        rg90 rg90Var;
        rg90 rg90Var2;
        PartialProgressBarStyleSides partialProgressBarStyleSides;
        String str;
        if (continuationImpl instanceof TileMapper$map$26) {
            tileMapper$map$26 = (TileMapper$map$26) continuationImpl;
            int i2 = tileMapper$map$26.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tileMapper$map$26.label = i2 - Integer.MIN_VALUE;
                Object obj = tileMapper$map$26.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tileMapper$map$26.label;
                CharSequence charSequence = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (bif0Var != null) {
                        g8a1 g8a1Var = bif0Var.d;
                        if (g8a1Var instanceof eif0) {
                            eif0 eif0Var = (eif0) g8a1Var;
                            String str2 = eif0Var.b;
                            yfa yfaVar = this.c;
                            ldc f = yfaVar.f(str2);
                            long j = f != null ? f.a : ldc.l;
                            ldc f2 = yfaVar.f(eif0Var.c);
                            long j2 = f2 != null ? f2.a : ldc.l;
                            int i3 = eif0Var.d;
                            int i4 = x4z0.a[eif0Var.e.ordinal()];
                            if (i4 == 1) {
                                partialProgressBarStyleSides = PartialProgressBarStyleSides.SQUARE;
                            } else {
                                if (i4 != 2) {
                                    w511.b();
                                    return null;
                                }
                                partialProgressBarStyleSides = PartialProgressBarStyleSides.ROUNDED;
                            }
                            rg90Var = new rg90(j, j2, i3, partialProgressBarStyleSides, eif0Var.f);
                            if (bif0Var != null || rg90Var == null) {
                                return null;
                            }
                            FormattedText formattedText = bif0Var.a;
                            if (formattedText != null) {
                                tileMapper$map$26.L$0 = bif0Var;
                                tileMapper$map$26.L$1 = rg90Var;
                                tileMapper$map$26.L$2 = null;
                                tileMapper$map$26.I$0 = 0;
                                tileMapper$map$26.label = 1;
                                obj = this.g.a(formattedText, tileMapper$map$26);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                rg90Var2 = rg90Var;
                            }
                            CharSequence charSequence2 = charSequence;
                            double d = bif0Var.b;
                            str = bif0Var.c;
                            if (str == null) {
                                str = "";
                            }
                            return new dif0(charSequence2, d, str, rg90Var, bif0Var.e != null ? new l690(r13.a, r13.c, r13.b, r13.d) : new l690(0.0f, 0.0f, 0.0f, 0.0f));
                        }
                        if (!(g8a1Var instanceof fif0)) {
                            w511.b();
                            return null;
                        }
                    }
                    rg90Var = null;
                    if (bif0Var != null) {
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg90Var2 = (rg90) tileMapper$map$26.L$1;
                bif0Var = (bif0) tileMapper$map$26.L$0;
                kotlin.b.b(obj);
                charSequence = (CharSequence) obj;
                rg90Var = rg90Var2;
                CharSequence charSequence22 = charSequence;
                double d2 = bif0Var.b;
                str = bif0Var.c;
                if (str == null) {
                }
                return new dif0(charSequence22, d2, str, rg90Var, bif0Var.e != null ? new l690(r13.a, r13.c, r13.b, r13.d) : new l690(0.0f, 0.0f, 0.0f, 0.0f));
            }
        }
        tileMapper$map$26 = new TileMapper$map$26(this, continuationImpl);
        Object obj2 = tileMapper$map$26.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tileMapper$map$26.label;
        CharSequence charSequence3 = null;
        if (i != 0) {
        }
        charSequence3 = (CharSequence) obj2;
        rg90Var = rg90Var2;
        CharSequence charSequence222 = charSequence3;
        double d22 = bif0Var.b;
        str = bif0Var.c;
        if (str == null) {
        }
        return new dif0(charSequence222, d22, str, rg90Var, bif0Var.e != null ? new l690(r13.a, r13.c, r13.b, r13.d) : new l690(0.0f, 0.0f, 0.0f, 0.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x015c, code lost:
    
        if (r2 == r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x017b, code lost:
    
        if (r2 == r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e2, code lost:
    
        if (r2 == r4) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(s4z0 s4z0Var, boolean z, ContinuationImpl continuationImpl) {
        TileMapper$map$13 tileMapper$map$13;
        Object obj;
        int i;
        boolean z2;
        CharSequence charSequence;
        so5 so5Var;
        Object b;
        CharSequence charSequence2;
        s4z0 s4z0Var2 = s4z0Var;
        if (continuationImpl instanceof TileMapper$map$13) {
            tileMapper$map$13 = (TileMapper$map$13) continuationImpl;
            int i2 = tileMapper$map$13.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tileMapper$map$13.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tileMapper$map$13.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tileMapper$map$13.label;
                yfa yfaVar = this.c;
                wa6 wa6Var = null;
                p37 p37Var = null;
                so5 so5Var2 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (s4z0Var2 instanceof mox0) {
                        mox0 mox0Var = (mox0) s4z0Var2;
                        w4v w4vVar = mox0Var.a;
                        ra90 b2 = w4vVar != null ? oh4.b(this.e, w4vVar, null, null, z, 6) : null;
                        w4v w4vVar2 = mox0Var.b;
                        return new nox0(b2, w4vVar2 != null ? oh4.b(this.e, w4vVar2, null, null, z, 6) : null);
                    }
                    if (s4z0Var2 instanceof df70) {
                        w4v w4vVar3 = ((df70) s4z0Var2).a;
                        return new ef70(w4vVar3 != null ? oh4.b(this.e, w4vVar3, null, null, z, 6) : null);
                    }
                    z2 = z;
                    if (s4z0Var2 instanceof jqf0) {
                        jqf0 jqf0Var = (jqf0) s4z0Var2;
                        String str = jqf0Var.a;
                        qfc qfcVar = jqf0Var.b;
                        ldc e = qfcVar != null ? yfaVar.e(qfcVar, z2) : null;
                        HorizontalAlignmentModel horizontalAlignmentModel = jqf0Var.c;
                        if (horizontalAlignmentModel != null) {
                            this.d.getClass();
                            int i3 = cqu.a[horizontalAlignmentModel.ordinal()];
                            if (i3 == 1) {
                                so5Var = x4c.G;
                            } else if (i3 == 2) {
                                so5Var = x4c.H;
                            } else {
                                if (i3 != 3) {
                                    w511.b();
                                    return null;
                                }
                                so5Var = x4c.I;
                            }
                            so5Var2 = so5Var;
                        }
                        return new kqf0(str, e, so5Var2, jqf0Var.d);
                    }
                    if (s4z0Var2 instanceof tgg0) {
                        tgg0 tgg0Var = (tgg0) s4z0Var2;
                        String str2 = tgg0Var.a;
                        String str3 = tgg0Var.b;
                        String str4 = tgg0Var.c;
                        String str5 = tgg0Var.d;
                        float f = tgg0Var.e;
                        qfc qfcVar2 = tgg0Var.f;
                        ldc e2 = qfcVar2 != null ? yfaVar.e(qfcVar2, z2) : null;
                        qfc qfcVar3 = tgg0Var.g;
                        ldc e3 = qfcVar3 != null ? yfaVar.e(qfcVar3, z2) : null;
                        qfc qfcVar4 = tgg0Var.h;
                        ldc e4 = qfcVar4 != null ? yfaVar.e(qfcVar4, z2) : null;
                        qfc qfcVar5 = tgg0Var.i;
                        return new ugg0(str2, str3, str4, str5, f, e2, e3, e4, qfcVar5 != null ? yfaVar.e(qfcVar5, z2) : null);
                    }
                    boolean z3 = s4z0Var2 instanceof jd3;
                    q8s q8sVar = this.g;
                    if (z3) {
                        FormattedText formattedText = ((jd3) s4z0Var2).a;
                        tileMapper$map$13.L$0 = null;
                        tileMapper$map$13.Z$0 = z2;
                        tileMapper$map$13.label = 1;
                        obj2 = q8sVar.a(formattedText, tileMapper$map$13);
                    } else if (s4z0Var2 instanceof r37) {
                        FormattedText formattedText2 = ((r37) s4z0Var2).a;
                        tileMapper$map$13.L$0 = s4z0Var2;
                        tileMapper$map$13.Z$0 = z2;
                        tileMapper$map$13.label = 2;
                        obj2 = q8sVar.a(formattedText2, tileMapper$map$13);
                    } else {
                        if (!(s4z0Var2 instanceof wjf0)) {
                            if (jl40.l(s4z0Var2, c221.a)) {
                                return null;
                            }
                            w511.b();
                            return null;
                        }
                        FormattedText formattedText3 = ((wjf0) s4z0Var2).b;
                        if (formattedText3 != null) {
                            tileMapper$map$13.L$0 = s4z0Var2;
                            tileMapper$map$13.L$1 = null;
                            tileMapper$map$13.Z$0 = z2;
                            tileMapper$map$13.I$0 = 0;
                            tileMapper$map$13.label = 3;
                            obj2 = q8sVar.a(formattedText3, tileMapper$map$13);
                        } else {
                            charSequence = null;
                        }
                    }
                    return obj;
                }
                if (i == 1) {
                    kotlin.b.b(obj2);
                    return new kd3((CharSequence) obj2);
                }
                if (i == 2) {
                    s4z0Var2 = (s4z0) tileMapper$map$13.L$0;
                    kotlin.b.b(obj2);
                    CharSequence charSequence3 = (CharSequence) obj2;
                    r37 r37Var = (r37) s4z0Var2;
                    ky P = this.a.P(r37Var.b, charSequence3.toString());
                    o37 o37Var = r37Var.c;
                    if (o37Var != null) {
                        ldc f2 = yfaVar.f(o37Var.a);
                        long j = f2 != null ? f2.a : ldc.l;
                        int i4 = o37Var.b;
                        qa6 qa6Var = o37Var.c;
                        if (qa6Var != null) {
                            ldc f3 = yfaVar.f(qa6Var.a);
                            wa6Var = new wa6(f3 != null ? f3.a : ldc.l, qa6Var.b);
                        }
                        p37Var = new p37(j, i4, wa6Var);
                    }
                    return new s37(charSequence3, P, p37Var, r37Var.d);
                }
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) tileMapper$map$13.L$1;
                    kotlin.b.b(obj2);
                    return new xjf0((dif0) obj2, charSequence2);
                }
                boolean z4 = tileMapper$map$13.Z$0;
                s4z0 s4z0Var3 = (s4z0) tileMapper$map$13.L$0;
                kotlin.b.b(obj2);
                z2 = z4;
                s4z0Var2 = s4z0Var3;
                charSequence = (CharSequence) obj2;
                bif0 bif0Var = ((wjf0) s4z0Var2).a;
                tileMapper$map$13.L$0 = null;
                tileMapper$map$13.L$1 = charSequence;
                tileMapper$map$13.Z$0 = z2;
                tileMapper$map$13.label = 4;
                b = b(bif0Var, tileMapper$map$13);
                if (b != obj) {
                    CharSequence charSequence4 = charSequence;
                    obj2 = b;
                    charSequence2 = charSequence4;
                    return new xjf0((dif0) obj2, charSequence2);
                }
                return obj;
            }
        }
        tileMapper$map$13 = new TileMapper$map$13(this, continuationImpl);
        Object obj22 = tileMapper$map$13.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tileMapper$map$13.label;
        yfa yfaVar2 = this.c;
        wa6 wa6Var2 = null;
        p37 p37Var2 = null;
        so5 so5Var22 = null;
        if (i != 0) {
        }
        bif0 bif0Var2 = ((wjf0) s4z0Var2).a;
        tileMapper$map$13.L$0 = null;
        tileMapper$map$13.L$1 = charSequence;
        tileMapper$map$13.Z$0 = z2;
        tileMapper$map$13.label = 4;
        b = b(bif0Var2, tileMapper$map$13);
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0070, code lost:
    
        if (r3 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(y4z0 y4z0Var, boolean z, ContinuationImpl continuationImpl) {
        TileMapper$map$1 tileMapper$map$1;
        int i;
        mcu mcuVar;
        s4z0 s4z0Var;
        boolean z2;
        mcu mcuVar2;
        t4z0 t4z0Var;
        y4z0 y4z0Var2;
        boolean z3;
        mcu mcuVar3;
        z3b1 z3b1Var;
        a4b1 a4b1Var;
        int i2;
        ImagePositionState imagePositionState;
        a4b1 a4b1Var2;
        y4z0 y4z0Var3 = y4z0Var;
        boolean z4 = z;
        if (continuationImpl instanceof TileMapper$map$1) {
            tileMapper$map$1 = (TileMapper$map$1) continuationImpl;
            int i3 = tileMapper$map$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tileMapper$map$1.label = i3 - Integer.MIN_VALUE;
                Object obj = tileMapper$map$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tileMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    yau yauVar = y4z0Var3.a;
                    if (yauVar == null) {
                        mcuVar = null;
                        s4z0Var = y4z0Var3.b;
                        if (s4z0Var == null) {
                            z2 = z4;
                            mcuVar2 = mcuVar;
                            t4z0Var = null;
                            u3b1 u3b1Var = y4z0Var3.c;
                            if (u3b1Var != null) {
                            }
                            z3b1Var = y4z0Var3.d;
                            if (z3b1Var != null) {
                            }
                            hhg hhgVar = y4z0Var3.e;
                            if (hhgVar != null) {
                            }
                            w4v w4vVar = y4z0Var3.f;
                            if (w4vVar != null) {
                            }
                            i2 = x4z0.b[y4z0Var3.g.ordinal()];
                            if (i2 == 1) {
                            }
                            return new a5z0(mcuVar2, t4z0Var, r14, a4b1Var, r16, r17, imagePositionState, y4z0Var3.h, y4z0Var3.j, y4z0Var3.i);
                        }
                        tileMapper$map$1.L$0 = y4z0Var3;
                        tileMapper$map$1.L$1 = null;
                        tileMapper$map$1.L$2 = mcuVar;
                        tileMapper$map$1.Z$0 = z4;
                        tileMapper$map$1.I$0 = 0;
                        tileMapper$map$1.label = 2;
                        Object c = c(s4z0Var, z4, tileMapper$map$1);
                        if (c != obj2) {
                            y4z0Var2 = y4z0Var3;
                            z3 = z4;
                            mcuVar3 = mcuVar;
                            obj = c;
                            z2 = z3;
                            mcuVar2 = mcuVar3;
                            t4z0Var = (t4z0) obj;
                            y4z0Var3 = y4z0Var2;
                            u3b1 u3b1Var2 = y4z0Var3.c;
                            if (u3b1Var2 != null) {
                            }
                            z3b1Var = y4z0Var3.d;
                            if (z3b1Var != null) {
                            }
                            hhg hhgVar2 = y4z0Var3.e;
                            if (hhgVar2 != null) {
                            }
                            w4v w4vVar2 = y4z0Var3.f;
                            if (w4vVar2 != null) {
                            }
                            i2 = x4z0.b[y4z0Var3.g.ordinal()];
                            if (i2 == 1) {
                            }
                            return new a5z0(mcuVar2, t4z0Var, r14, a4b1Var, r16, r17, imagePositionState, y4z0Var3.h, y4z0Var3.j, y4z0Var3.i);
                        }
                        return obj2;
                    }
                    tileMapper$map$1.L$0 = y4z0Var3;
                    tileMapper$map$1.L$1 = null;
                    tileMapper$map$1.Z$0 = z4;
                    tileMapper$map$1.I$0 = 0;
                    tileMapper$map$1.label = 1;
                    obj = a(yauVar, z4, tileMapper$map$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = tileMapper$map$1.Z$0;
                        mcuVar3 = (mcu) tileMapper$map$1.L$2;
                        y4z0Var2 = (y4z0) tileMapper$map$1.L$0;
                        kotlin.b.b(obj);
                        z2 = z3;
                        mcuVar2 = mcuVar3;
                        t4z0Var = (t4z0) obj;
                        y4z0Var3 = y4z0Var2;
                        u3b1 u3b1Var22 = y4z0Var3.c;
                        w3b1 a = u3b1Var22 != null ? this.f.a(u3b1Var22, z2) : null;
                        z3b1Var = y4z0Var3.d;
                        if (z3b1Var != null) {
                            yfa yfaVar = this.b.a;
                            if (z3b1Var instanceof nki0) {
                                a4b1Var2 = new oki0(((nki0) z3b1Var).a);
                            } else if (z3b1Var instanceof sre) {
                                sre sreVar = (sre) z3b1Var;
                                String str = sreVar.a;
                                qfc qfcVar = sreVar.b;
                                ldc e = qfcVar != null ? yfaVar.e(qfcVar, z2) : null;
                                qfc qfcVar2 = sreVar.c;
                                a4b1Var2 = new tre(str, e, qfcVar2 != null ? yfaVar.e(qfcVar2, z2) : null, sreVar.d);
                            } else {
                                if (!z3b1Var.equals(p121.a)) {
                                    w511.b();
                                    return null;
                                }
                                a4b1Var2 = null;
                            }
                            a4b1Var = a4b1Var2;
                        } else {
                            a4b1Var = null;
                        }
                        hhg hhgVar22 = y4z0Var3.e;
                        ky P = hhgVar22 != null ? this.a.P(hhgVar22, null) : null;
                        w4v w4vVar22 = y4z0Var3.f;
                        ra90 b = w4vVar22 != null ? oh4.b(this.e, w4vVar22, null, null, z2, 6) : null;
                        i2 = x4z0.b[y4z0Var3.g.ordinal()];
                        if (i2 == 1) {
                            imagePositionState = ImagePositionState.TOP;
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                            imagePositionState = ImagePositionState.TRAIL;
                        }
                        return new a5z0(mcuVar2, t4z0Var, a, a4b1Var, P, b, imagePositionState, y4z0Var3.h, y4z0Var3.j, y4z0Var3.i);
                    }
                    boolean z5 = tileMapper$map$1.Z$0;
                    y4z0 y4z0Var4 = (y4z0) tileMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    z4 = z5;
                    y4z0Var3 = y4z0Var4;
                }
                mcuVar = (mcu) obj;
                s4z0Var = y4z0Var3.b;
                if (s4z0Var == null) {
                }
            }
        }
        tileMapper$map$1 = new TileMapper$map$1(this, continuationImpl);
        Object obj3 = tileMapper$map$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tileMapper$map$1.label;
        if (i != 0) {
        }
        mcuVar = (mcu) obj3;
        s4z0Var = y4z0Var3.b;
        if (s4z0Var == null) {
        }
    }
}
