package defpackage;

import com.yandex.music.shared.player.download2.DoNotRetryException;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class bjm {
    public final b7q a;
    public final ejm b;
    public final apo c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;

    public bjm(b7q b7qVar, euk eukVar, apo apoVar) {
        b7qVar.getClass();
        eukVar.getClass();
        this.a = b7qVar;
        this.b = eukVar;
        this.c = apoVar;
        this.d = b7qVar.b(hag.I(oco.class), true);
        this.e = b7qVar.b(hag.I(kvs.class), true);
        this.f = b7qVar.b(hag.I(uzn.class), true);
        this.g = b7qVar.b(hag.I(nbo.class), true);
        b7qVar.b(hag.I(tcl.class), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x027e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARN: Type inference failed for: r10v20, types: [f9f] */
    /* JADX WARN: Type inference failed for: r11v20, types: [mbo] */
    /* JADX WARN: Type inference failed for: r12v25, types: [f9f] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v21, types: [f9f] */
    /* JADX WARN: Type inference failed for: r13v22, types: [f9f] */
    /* JADX WARN: Type inference failed for: r14v12, types: [mbo] */
    /* JADX WARN: Type inference failed for: r14v17, types: [mbo] */
    /* JADX WARN: Type inference failed for: r15v21, types: [mbo] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x020f -> B:80:0x0218). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0338 -> B:13:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(final bjm bjmVar, zvs zvsVar, be6 be6Var, boolean z, uim uimVar, cg6 cg6Var) {
        ajm ajmVar;
        int i;
        int i2;
        String str;
        String str2;
        boolean z2;
        tao taoVar;
        pbo pboVar;
        lm4 lm4Var;
        ajm ajmVar2;
        int i3;
        int i4;
        final be6 be6Var2;
        final uim uimVar2;
        lm4 a;
        tao taoVar2;
        pbo pboVar2;
        ajm ajmVar3;
        int i5;
        int i6;
        int i7;
        final be6 be6Var3;
        boolean z3;
        final uim uimVar3;
        final zvs zvsVar2;
        String str3;
        String str4;
        be6 be6Var4;
        lm4 lm4Var2;
        uim uimVar4;
        pbo pboVar3;
        boolean z4;
        Exception e;
        InternalDownloadException internalDownloadException;
        ?? r12;
        int i8;
        Object obj;
        zvs zvsVar3;
        xim ximVar;
        pbo pboVar4;
        lm4 lm4Var3;
        String str5;
        uim uimVar5;
        lm4 lm4Var4;
        tao taoVar3;
        pbo pboVar5;
        final zvs zvsVar4;
        Exception e2;
        InternalDownloadException internalDownloadException2;
        lm4 lm4Var5;
        lm4 lm4Var6;
        boolean z5;
        int i9;
        pbo pboVar6;
        int i10;
        be6 be6Var5;
        zvs zvsVar5;
        Object obj2;
        pbo pboVar7;
        final bjm bjmVar2 = bjmVar;
        zvs zvsVar6 = zvsVar;
        bjmVar2.getClass();
        jyr jyrVar = bjmVar2.g;
        if (cg6Var instanceof ajm) {
            ajmVar = (ajm) cg6Var;
            int i11 = ajmVar.v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                ajmVar.v = i11 - Integer.MIN_VALUE;
                Object obj3 = ajmVar.t;
                nm6 nm6Var = nm6.a;
                i = ajmVar.v;
                String str6 = " caught, expected ";
                String str7 = "Unexpected checked ";
                String str8 = "RetryCheckFail";
                if (i == 0) {
                    if (i == 1) {
                        int i12 = ajmVar.s;
                        i8 = ajmVar.r;
                        int i13 = ajmVar.q;
                        z3 = ajmVar.p;
                        tao taoVar4 = ajmVar.o;
                        r12 = ajmVar.n;
                        ?? r14 = ajmVar.m;
                        uim uimVar6 = ajmVar.l;
                        be6Var4 = ajmVar.k;
                        zvsVar2 = ajmVar.j;
                        try {
                            try {
                                qgg.h0(obj3);
                                zvsVar3 = zvsVar2;
                                str3 = "RetryCheckFail";
                                uimVar4 = uimVar6;
                                obj = obj3;
                                str4 = " caught, expected ";
                                taoVar2 = taoVar4;
                                pboVar3 = r14;
                                i7 = i12;
                                i6 = i13;
                            } catch (Exception e3) {
                                e = e3;
                                str4 = " caught, expected ";
                                str3 = "RetryCheckFail";
                                z4 = z3;
                                lm4Var2 = r12;
                                pboVar3 = r14;
                                uimVar4 = uimVar6;
                                i5 = i8;
                                i6 = i13;
                                taoVar2 = taoVar4;
                                i7 = i12;
                                if (e instanceof IOException) {
                                }
                                internalDownloadException = (InternalDownloadException) (e instanceof InternalDownloadException ? null : e);
                                if (internalDownloadException != null) {
                                }
                            }
                            ximVar = (xim) obj;
                            return ximVar;
                        } catch (DoNotRetryException e4) {
                            throw e4.a;
                        } catch (InterruptedException e5) {
                            throw e5;
                        } catch (RuntimeException e6) {
                            throw e6;
                        }
                    }
                    if (i == 2) {
                        int i14 = ajmVar.r;
                        int i15 = ajmVar.q;
                        boolean z6 = ajmVar.p;
                        tao taoVar5 = ajmVar.o;
                        ?? r10 = ajmVar.n;
                        ?? r11 = ajmVar.m;
                        uim uimVar7 = ajmVar.l;
                        be6 be6Var6 = ajmVar.k;
                        zvs zvsVar7 = ajmVar.j;
                        qgg.h0(obj3);
                        z4 = z6;
                        String str9 = " caught, expected ";
                        String str10 = "RetryCheckFail";
                        pboVar2 = r11;
                        be6Var3 = be6Var6;
                        taoVar2 = taoVar5;
                        ajmVar3 = ajmVar;
                        uimVar3 = uimVar7;
                        i6 = i15;
                        Object obj4 = obj3;
                        lm4 lm4Var7 = r10;
                        i7 = ((Boolean) obj4).booleanValue() ? 1 : 0;
                        a = lm4Var7;
                        zvsVar2 = zvsVar7;
                        str6 = str9;
                        str8 = str10;
                        i5 = i14;
                        z3 = z4;
                        bjmVar2 = bjmVar;
                        if (i7 == 0) {
                            ((Function1) pboVar2.d).invoke((ArrayList) taoVar2.e);
                            rj7.f();
                            return null;
                        }
                        try {
                        } catch (Exception e7) {
                            e = e7;
                            str4 = str6;
                            str3 = str8;
                            pboVar4 = pboVar2;
                            lm4Var3 = a;
                        }
                        mn7 mn7Var = dm6.b;
                        lm4 lm4Var8 = a;
                        final int i16 = 0;
                        str3 = str8;
                        lm4Var3 = lm4Var8;
                        str4 = str6;
                        try {
                        } catch (Exception e8) {
                            e = e8;
                            pboVar4 = pboVar2;
                        }
                        Function0 function0 = new Function0(bjmVar2) { // from class: yim
                            public final /* synthetic */ bjm b;

                            {
                                this.b = bjmVar2;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        this.b.b(zvsVar2, be6Var3, uimVar3);
                                        break;
                                    default:
                                        this.b.b(zvsVar2, be6Var3, uimVar3);
                                        break;
                                }
                                return wim.a;
                            }
                        };
                        ajmVar3.j = zvsVar2;
                        ajmVar3.k = be6Var3;
                        ajmVar3.l = uimVar3;
                        pboVar4 = pboVar2;
                        try {
                        } catch (Exception e9) {
                            e = e9;
                            pboVar3 = pboVar4;
                            z4 = z3;
                            lm4Var2 = lm4Var3;
                            uimVar4 = uimVar3;
                            ajmVar = ajmVar3;
                            be6Var4 = be6Var3;
                            if (e instanceof IOException) {
                            }
                            internalDownloadException = (InternalDownloadException) (e instanceof InternalDownloadException ? null : e);
                            if (internalDownloadException != null) {
                            }
                        }
                        ajmVar3.m = pboVar4;
                        ajmVar3.n = lm4Var3;
                        ajmVar3.o = taoVar2;
                        ajmVar3.p = z3;
                        ajmVar3.q = i6;
                        ajmVar3.r = i5;
                        ajmVar3.s = i7;
                        try {
                        } catch (Exception e10) {
                            e = e10;
                            pboVar3 = pboVar4;
                            z4 = z3;
                            lm4Var2 = lm4Var3;
                            uimVar4 = uimVar3;
                            ajmVar = ajmVar3;
                            be6Var4 = be6Var3;
                            if (e instanceof IOException) {
                            }
                            internalDownloadException = (InternalDownloadException) (e instanceof InternalDownloadException ? null : e);
                            if (internalDownloadException != null) {
                            }
                        }
                        ajmVar3.v = 1;
                        Object S = sk3.S(mn7Var, function0, ajmVar3);
                        if (S == nm6Var) {
                            return nm6Var;
                        }
                        ajm ajmVar4 = ajmVar3;
                        be6Var4 = be6Var3;
                        i8 = i5;
                        r12 = lm4Var3;
                        uimVar4 = uimVar3;
                        ajmVar = ajmVar4;
                        pboVar3 = pboVar4;
                        zvsVar3 = zvsVar2;
                        obj = S;
                        try {
                        } catch (Exception e11) {
                            e = e11;
                            zvsVar2 = zvsVar3;
                            z4 = z3;
                            lm4Var2 = r12;
                            i5 = i8;
                            if (e instanceof IOException) {
                                j66.h0((IOException) e);
                            }
                            internalDownloadException = (InternalDownloadException) (e instanceof InternalDownloadException ? null : e);
                            if (internalDownloadException != null) {
                                if (pboVar3.a) {
                                    Assertions.throwOrSkip(str3, new FailedAssertionException("Unexpected checked " + e + str4 + lm4Var2.f(), e));
                                }
                                throw e;
                            }
                            str9 = str4;
                            str10 = str3;
                            ajmVar.j = zvsVar2;
                            ajmVar.k = be6Var4;
                            ajmVar.l = uimVar4;
                            ajmVar.m = pboVar3;
                            ajmVar.n = lm4Var2;
                            ajmVar.o = taoVar2;
                            ajmVar.p = z4;
                            ajmVar.q = i6;
                            ajmVar.r = i5;
                            ajmVar.s = i7;
                            ajmVar.v = 2;
                            Object m = taoVar2.m(internalDownloadException, e, ajmVar);
                            if (m == nm6Var) {
                                return nm6Var;
                            }
                            zvs zvsVar8 = zvsVar2;
                            obj4 = m;
                            i14 = i5;
                            zvsVar7 = zvsVar8;
                            pboVar2 = pboVar3;
                            be6Var3 = be6Var4;
                            ajmVar3 = ajmVar;
                            uimVar3 = uimVar4;
                            lm4Var7 = lm4Var2;
                            i7 = ((Boolean) obj4).booleanValue() ? 1 : 0;
                            a = lm4Var7;
                            zvsVar2 = zvsVar7;
                            str6 = str9;
                            str8 = str10;
                            i5 = i14;
                            z3 = z4;
                            bjmVar2 = bjmVar;
                            if (i7 == 0) {
                            }
                        }
                        ximVar = (xim) obj;
                        return ximVar;
                    }
                    if (i == 3) {
                        int i17 = ajmVar.s;
                        i10 = ajmVar.r;
                        i9 = ajmVar.q;
                        z5 = ajmVar.p;
                        taoVar3 = ajmVar.o;
                        ?? r13 = ajmVar.n;
                        ?? r142 = ajmVar.m;
                        uimVar5 = ajmVar.l;
                        be6 be6Var7 = ajmVar.k;
                        zvsVar4 = ajmVar.j;
                        try {
                            try {
                                qgg.h0(obj3);
                                str = " caught, expected ";
                                str5 = "Unexpected checked ";
                                str2 = "RetryCheckFail";
                                pboVar6 = r142;
                                i4 = i17;
                                ajmVar2 = ajmVar;
                                be6Var5 = be6Var7;
                                zvsVar5 = zvsVar4;
                                obj2 = obj3;
                                lm4Var6 = r13;
                            } catch (Exception e12) {
                                e2 = e12;
                                str = " caught, expected ";
                                str5 = "Unexpected checked ";
                                str2 = "RetryCheckFail";
                                z2 = z5;
                                i3 = i9;
                                i2 = i10;
                                pboVar5 = r142;
                                i4 = i17;
                                be6Var2 = be6Var7;
                                lm4Var4 = r13;
                                if (e2 instanceof IOException) {
                                }
                                internalDownloadException2 = (InternalDownloadException) (e2 instanceof InternalDownloadException ? null : e2);
                                if (internalDownloadException2 != null) {
                                }
                            }
                            ximVar = (xim) obj2;
                            return ximVar;
                        } catch (DoNotRetryException e13) {
                            throw e13.a;
                        } catch (InterruptedException e14) {
                            throw e14;
                        } catch (RuntimeException e15) {
                            throw e15;
                        }
                    }
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i18 = ajmVar.r;
                    int i19 = ajmVar.q;
                    boolean z7 = ajmVar.p;
                    taoVar3 = ajmVar.o;
                    ?? r132 = ajmVar.n;
                    ?? r15 = ajmVar.m;
                    uim uimVar8 = ajmVar.l;
                    be6 be6Var8 = ajmVar.k;
                    zvs zvsVar9 = ajmVar.j;
                    qgg.h0(obj3);
                    i3 = i19;
                    be6Var2 = be6Var8;
                    str = " caught, expected ";
                    String str11 = "RetryCheckFail";
                    z2 = z7;
                    String str12 = "Unexpected checked ";
                    ajm ajmVar5 = ajmVar;
                    uimVar2 = uimVar8;
                    i2 = i18;
                    zvsVar6 = zvsVar9;
                    lm4 lm4Var9 = r132;
                    pbo pboVar8 = r15;
                    lm4 lm4Var10 = lm4Var9;
                    taoVar = taoVar3;
                    i4 = ((Boolean) obj3).booleanValue() ? 1 : 0;
                    pboVar = pboVar8;
                    str2 = str11;
                    lm4Var = lm4Var10;
                    str7 = str12;
                    ajmVar2 = ajmVar5;
                    zvsVar4 = zvsVar6;
                    if (i4 == 0) {
                        ((Function1) pboVar.d).invoke((ArrayList) taoVar.e);
                        rj7.f();
                        return null;
                    }
                    try {
                    } catch (Exception e16) {
                        e2 = e16;
                        pboVar7 = pboVar;
                        str5 = str7;
                    }
                    mn7 mn7Var2 = dm6.b;
                    final int i20 = 1;
                    str5 = str7;
                    pboVar7 = pboVar;
                    try {
                    } catch (Exception e17) {
                        e2 = e17;
                        pboVar5 = pboVar7;
                        taoVar3 = taoVar;
                        lm4Var5 = lm4Var;
                        uimVar5 = uimVar2;
                        ajmVar = ajmVar2;
                        lm4Var4 = lm4Var5;
                        if (e2 instanceof IOException) {
                            j66.h0((IOException) e2);
                        }
                        internalDownloadException2 = (InternalDownloadException) (e2 instanceof InternalDownloadException ? null : e2);
                        if (internalDownloadException2 != null) {
                            if (pboVar5.a) {
                                Assertions.throwOrSkip(str2, new FailedAssertionException(str5 + e2 + str + lm4Var4.f(), e2));
                            }
                            throw e2;
                        }
                        str12 = str5;
                        str11 = str2;
                        ajmVar.j = zvsVar4;
                        ajmVar.k = be6Var2;
                        ajmVar.l = uimVar5;
                        ajmVar.m = pboVar5;
                        ajmVar.n = lm4Var4;
                        ajmVar.o = taoVar3;
                        ajmVar.p = z2;
                        ajmVar.q = i3;
                        ajmVar.r = i2;
                        ajmVar.s = i4;
                        ajmVar.v = 4;
                        Object m2 = taoVar3.m(internalDownloadException2, e2, ajmVar);
                        if (m2 == nm6Var) {
                            return nm6Var;
                        }
                        zvs zvsVar10 = zvsVar4;
                        obj3 = m2;
                        zvsVar6 = zvsVar10;
                        pbo pboVar9 = pboVar5;
                        ajmVar5 = ajmVar;
                        uimVar2 = uimVar5;
                        pboVar8 = pboVar9;
                        lm4Var9 = lm4Var4;
                        lm4 lm4Var102 = lm4Var9;
                        taoVar = taoVar3;
                        i4 = ((Boolean) obj3).booleanValue() ? 1 : 0;
                        pboVar = pboVar8;
                        str2 = str11;
                        lm4Var = lm4Var102;
                        str7 = str12;
                        ajmVar2 = ajmVar5;
                        zvsVar4 = zvsVar6;
                        if (i4 == 0) {
                        }
                    }
                    Function0 function02 = new Function0(bjmVar) { // from class: yim
                        public final /* synthetic */ bjm b;

                        {
                            this.b = bjmVar;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i20) {
                                case 0:
                                    this.b.b(zvsVar4, be6Var2, uimVar2);
                                    break;
                                default:
                                    this.b.b(zvsVar4, be6Var2, uimVar2);
                                    break;
                            }
                            return wim.a;
                        }
                    };
                    ajmVar2.j = zvsVar4;
                    ajmVar2.k = be6Var2;
                    ajmVar2.l = uimVar2;
                    ajmVar2.m = pboVar7;
                    ajmVar2.n = lm4Var;
                    ajmVar2.o = taoVar;
                    ajmVar2.p = z2;
                    ajmVar2.q = i3;
                    ajmVar2.r = i2;
                    ajmVar2.s = i4;
                    try {
                    } catch (Exception e18) {
                        e2 = e18;
                        pboVar5 = pboVar7;
                        taoVar3 = taoVar;
                        lm4Var5 = lm4Var;
                        uimVar5 = uimVar2;
                        ajmVar = ajmVar2;
                        lm4Var4 = lm4Var5;
                        if (e2 instanceof IOException) {
                        }
                        internalDownloadException2 = (InternalDownloadException) (e2 instanceof InternalDownloadException ? null : e2);
                        if (internalDownloadException2 != null) {
                        }
                    }
                    ajmVar2.v = 3;
                    Object S2 = sk3.S(mn7Var2, function02, ajmVar2);
                    if (S2 == nm6Var) {
                        return nm6Var;
                    }
                    i10 = i2;
                    i9 = i3;
                    z5 = z2;
                    pboVar6 = pboVar7;
                    taoVar3 = taoVar;
                    lm4Var6 = lm4Var;
                    uimVar5 = uimVar2;
                    be6Var5 = be6Var2;
                    zvsVar5 = zvsVar4;
                    obj2 = S2;
                    try {
                    } catch (Exception e19) {
                        e2 = e19;
                        int i21 = i9;
                        i2 = i10;
                        pboVar5 = pboVar6;
                        z2 = z5;
                        i3 = i21;
                        zvsVar4 = zvsVar5;
                        be6Var2 = be6Var5;
                        lm4Var5 = lm4Var6;
                        ajmVar = ajmVar2;
                        lm4Var4 = lm4Var5;
                        if (e2 instanceof IOException) {
                        }
                        internalDownloadException2 = (InternalDownloadException) (e2 instanceof InternalDownloadException ? null : e2);
                        if (internalDownloadException2 != null) {
                        }
                    }
                    ximVar = (xim) obj2;
                    return ximVar;
                }
                qgg.h0(obj3);
                jyr jyrVar2 = bjmVar2.d;
                i2 = 0;
                if (z) {
                    oco ocoVar = (oco) jyrVar2.getValue();
                    pbo a2 = ((nbo) jyrVar.getValue()).a(maa.b);
                    a = ern.a(InternalDownloadException.class);
                    taoVar2 = new tao(a2, new mx7(ocoVar.a, zvsVar6, null));
                    pboVar2 = a2;
                    ajmVar3 = ajmVar;
                    i5 = 0;
                    i6 = 0;
                    i7 = 1;
                    be6Var3 = be6Var;
                    z3 = z;
                    uimVar3 = uimVar;
                    zvsVar2 = zvsVar6;
                    if (i7 == 0) {
                    }
                } else {
                    str = " caught, expected ";
                    str2 = "RetryCheckFail";
                    oco ocoVar2 = (oco) jyrVar2.getValue();
                    pbo a3 = ((nbo) jyrVar.getValue()).a(maa.c);
                    lm4 a4 = ern.a(InternalDownloadException.class);
                    z2 = z;
                    taoVar = new tao(a3, new mx7(ocoVar2.a, zvsVar6, null));
                    pboVar = a3;
                    lm4Var = a4;
                    ajmVar2 = ajmVar;
                    i3 = 0;
                    i4 = 1;
                    be6Var2 = be6Var;
                    uimVar2 = uimVar;
                    zvsVar4 = zvsVar6;
                    if (i4 == 0) {
                    }
                }
            }
        }
        ajmVar = new ajm(bjmVar2, cg6Var);
        Object obj32 = ajmVar.t;
        nm6 nm6Var2 = nm6.a;
        i = ajmVar.v;
        String str62 = " caught, expected ";
        String str72 = "Unexpected checked ";
        String str82 = "RetryCheckFail";
        if (i == 0) {
        }
    }

    public final void b(zvs zvsVar, be6 be6Var, uim uimVar) {
        pxs pxsVar;
        ejm ejmVar = this.b;
        eps epsVar = new eps(this.a, maa.c, zvsVar, (uimVar == null || (pxsVar = uimVar.b) == null) ? null : o2g.k0(pxsVar), uimVar != null ? uimVar.c : null, be6Var);
        try {
            try {
                xzi l = this.c.l();
                ejmVar.b(zvsVar);
                ejmVar.p(zvsVar);
                l.v(zvsVar);
                epsVar.t(new suh(9, l, zvsVar));
                l.E(zvsVar);
                ejmVar.B(zvsVar);
                ejmVar.f(zvsVar);
                ejmVar.l(zvsVar);
            } catch (IOException e) {
                j66.h0(e);
                InternalDownloadException a = eob.a(e, null);
                szf.W(ejmVar, zvsVar, a);
                szf.V(ejmVar, zvsVar, a);
                throw a;
            }
        } catch (Throwable th) {
            ejmVar.l(zvsVar);
            throw th;
        }
    }
}
