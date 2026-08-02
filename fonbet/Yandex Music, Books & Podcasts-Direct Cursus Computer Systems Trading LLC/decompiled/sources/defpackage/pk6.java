package defpackage;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class pk6 extends aur implements Function2 {
    public final /* synthetic */ qk6 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ ok6 m;
    public final /* synthetic */ rk6 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk6(qk6 qk6Var, long j, long j2, ok6 ok6Var, rk6 rk6Var, Continuation continuation) {
        super(2, continuation);
        this.j = qk6Var;
        this.k = j;
        this.l = j2;
        this.m = ok6Var;
        this.n = rk6Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new pk6(this.j, this.k, this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pk6) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02db A[LOOP:10: B:101:0x02db->B:108:0x02ed, LOOP_START, PHI: r11
      0x02db: PHI (r11v29 int) = (r11v28 int), (r11v30 int) binds: [B:100:0x02d9, B:108:0x02ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029c A[LOOP:12: B:112:0x029c->B:119:0x02ae, LOOP_START, PHI: r0
      0x029c: PHI (r0v11 int) = (r0v10 int), (r0v12 int) binds: [B:111:0x029a, B:119:0x02ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0244 A[LOOP:14: B:123:0x0244->B:131:0x026a, LOOP_START, PHI: r0 r5 r6 r8 r22
      0x0244: PHI (r0v2 long) = (r0v1 long), (r0v3 long) binds: [B:122:0x0242, B:131:0x026a] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r5v18 int) = (r5v17 int), (r5v21 int) binds: [B:122:0x0242, B:131:0x026a] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:122:0x0242, B:131:0x026a] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r8v6 int) = (r8v5 int), (r8v7 int) binds: [B:122:0x0242, B:131:0x026a] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r22v2 long) = (r22v1 long), (r22v3 long) binds: [B:122:0x0242, B:131:0x026a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f0 A[LOOP:16: B:136:0x01f0->B:145:0x020a, LOOP_START, PHI: r5
      0x01f0: PHI (r5v15 int) = (r5v14 int), (r5v16 int) binds: [B:135:0x01ee, B:145:0x020a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a5 A[LOOP:18: B:149:0x01a5->B:159:0x01c1, LOOP_START, PHI: r5 r13
      0x01a5: PHI (r5v7 int) = (r5v6 int), (r5v8 int) binds: [B:148:0x01a3, B:159:0x01c1] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r13v17 int) = (r13v16 int), (r13v18 int) binds: [B:148:0x01a3, B:159:0x01c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0317 A[LOOP:8: B:90:0x0317->B:97:0x0329, LOOP_START, PHI: r3
      0x0317: PHI (r3v7 int) = (r3v6 int), (r3v8 int) binds: [B:89:0x0315, B:97:0x0329] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        char c;
        long j;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long j2;
        int i13;
        int i14;
        long j3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        int i24 = this.m.a;
        rk6 rk6Var = this.n;
        int i25 = rk6Var.c;
        int i26 = rk6Var.d;
        int i27 = rk6Var.b;
        int i28 = rk6Var.a;
        qk6 qk6Var = this.j;
        wpe wpeVar = qk6Var.f;
        long j4 = this.k;
        long j5 = this.l;
        if (wpeVar == null) {
            int i29 = (int) (j4 >> 32);
            int i30 = i28 + i29;
            int i31 = i30 + 1;
            int i32 = i30 + i24;
            int i33 = (int) (j4 & 4294967295L);
            int i34 = i33 - i26;
            int i35 = i34 - i24;
            int i36 = i33 + i25;
            if (i31 <= i32) {
                while (true) {
                    if (i35 <= i36) {
                        int i37 = i35;
                        while (true) {
                            qk6Var.a(new geh(i31, i37), j5);
                            if (i37 == i36) {
                                break;
                            }
                            i37++;
                        }
                    }
                    if (i31 == i32) {
                        break;
                    }
                    i31++;
                }
            }
            int i38 = i29 - i27;
            int i39 = i38 - i24;
            int i40 = i38 - 1;
            int i41 = i36 + i24;
            if (i39 <= i40) {
                int i42 = i39;
                while (true) {
                    i22 = i36;
                    if (i34 <= i41) {
                        int i43 = i34;
                        i23 = i43;
                        while (true) {
                            qk6Var.a(new geh(i42, i43), j5);
                            if (i43 == i41) {
                                break;
                            }
                            i43++;
                        }
                    } else {
                        i23 = i34;
                    }
                    if (i42 == i40) {
                        break;
                    }
                    i42++;
                    i36 = i22;
                    i34 = i23;
                }
            } else {
                i22 = i36;
                i23 = i34;
            }
            int i44 = i22 + 1;
            if (i44 <= i41) {
                while (true) {
                    if (i38 <= i32) {
                        int i45 = i38;
                        while (true) {
                            qk6Var.a(new geh(i45, i44), j5);
                            if (i45 == i32) {
                                break;
                            }
                            i45++;
                        }
                    }
                    if (i44 == i41) {
                        break;
                    }
                    i44++;
                }
            }
            int i46 = i23 - 1;
            if (i35 <= i46) {
                while (true) {
                    if (i39 <= i30) {
                        int i47 = i39;
                        while (true) {
                            qk6Var.a(new geh(i47, i35), j5);
                            if (i47 == i30) {
                                break;
                            }
                            i47++;
                        }
                    }
                    if (i35 == i46) {
                        break;
                    }
                    i35++;
                }
            }
            qk6Var.g = rk6Var;
            qk6Var.f = new wpe(j4);
        } else {
            long j6 = wpeVar.a;
            HashMap hashMap = qk6Var.e;
            long c2 = wpe.c(j4, j6);
            int i48 = (int) (c2 >> 32);
            if (i48 < 0 || qk6Var.g.a != i28) {
                i = i48;
                rk6 rk6Var2 = qk6Var.g;
                c = ' ';
                int i49 = rk6Var2.a;
                int i50 = ((int) (j6 >> 32)) + i49 + i24;
                int i51 = (i28 - i49) + i50 + i + 1;
                j = j5;
                int i52 = (int) (j6 & 4294967295L);
                int i53 = (i52 - rk6Var2.d) - i24;
                int i54 = i52 + rk6Var2.c + i24;
                if (i51 <= i50) {
                    while (true) {
                        if (i53 <= i54) {
                            int i55 = i53;
                            i2 = i55;
                            while (true) {
                                duf dufVar = (duf) hashMap.remove(new geh(i51, i55));
                                if (dufVar != null) {
                                    dufVar.cancel();
                                }
                                if (i55 == i54) {
                                    break;
                                }
                                i55++;
                            }
                        } else {
                            i2 = i53;
                        }
                        if (i51 == i50) {
                            break;
                        }
                        i51++;
                        i53 = i2;
                    }
                }
            } else {
                j = j5;
                i = i48;
                c = ' ';
            }
            if (i > 0 || qk6Var.g.b != i27) {
                rk6 rk6Var3 = qk6Var.g;
                int i56 = rk6Var3.b;
                int i57 = (((int) (j6 >> c)) - i56) - i24;
                int i58 = ((i57 - (i27 - i56)) + i) - 1;
                int i59 = (int) (j6 & 4294967295L);
                int i60 = (i59 - rk6Var3.d) - i24;
                int i61 = i59 + rk6Var3.c + i24;
                if (i57 <= i58) {
                    while (true) {
                        i3 = i27;
                        if (i60 <= i61) {
                            int i62 = i60;
                            while (true) {
                                duf dufVar2 = (duf) hashMap.remove(new geh(i57, i62));
                                if (dufVar2 != null) {
                                    dufVar2.cancel();
                                }
                                if (i62 == i61) {
                                    break;
                                }
                                i62++;
                            }
                        }
                        if (i57 == i58) {
                            break;
                        }
                        i57++;
                        i27 = i3;
                    }
                    i4 = (int) (c2 & 4294967295L);
                    if (i4 >= 0 || qk6Var.g.c != i25) {
                        rk6 rk6Var4 = qk6Var.g;
                        int i63 = rk6Var4.c;
                        i5 = ((int) (j6 & 4294967295L)) + i63 + i24;
                        int i64 = (int) (j6 >> c);
                        int i65 = (i64 - rk6Var4.b) - i24;
                        int i66 = i64 + rk6Var4.a + i24;
                        i6 = (i25 - i63) + i5 + i4 + 1;
                        if (i6 <= i5) {
                            while (true) {
                                i7 = i4;
                                if (i65 <= i66) {
                                    int i67 = i65;
                                    while (true) {
                                        duf dufVar3 = (duf) hashMap.remove(new geh(i67, i6));
                                        if (dufVar3 != null) {
                                            dufVar3.cancel();
                                        }
                                        if (i67 == i66) {
                                            break;
                                        }
                                        i67++;
                                    }
                                }
                                if (i6 == i5) {
                                    break;
                                }
                                i6++;
                                i4 = i7;
                            }
                            if (i7 <= 0 || qk6Var.g.d != i26) {
                                rk6 rk6Var5 = qk6Var.g;
                                int i68 = rk6Var5.d;
                                i8 = (((int) (j6 & 4294967295L)) - i68) - i24;
                                int i69 = (int) (j6 >> c);
                                int i70 = (i69 - rk6Var5.b) - i24;
                                int i71 = i69 + rk6Var5.a + i24;
                                i9 = ((i8 - (i26 - i68)) + i7) - 1;
                                if (i8 <= i9) {
                                    while (true) {
                                        if (i70 <= i71) {
                                            int i72 = i70;
                                            while (true) {
                                                duf dufVar4 = (duf) hashMap.remove(new geh(i72, i8));
                                                if (dufVar4 != null) {
                                                    dufVar4.cancel();
                                                }
                                                if (i72 == i71) {
                                                    break;
                                                }
                                                i72++;
                                            }
                                        }
                                        if (i8 == i9) {
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                            }
                            long c3 = wpe.c(j4, j6);
                            i10 = (int) (c3 >> c);
                            if (i10 <= 0 || qk6Var.g.a != i28) {
                                i11 = ((int) (j6 >> c)) + qk6Var.g.a + i24 + 1;
                                i12 = ((int) (j4 >> c)) + i28 + i24;
                                int i73 = (int) (j4 & 4294967295L);
                                int i74 = (i73 - i26) - i24;
                                int i75 = i73 + i25 + i24;
                                if (i11 <= i12) {
                                    while (true) {
                                        j2 = j6;
                                        if (i74 <= i75) {
                                            int i76 = i74;
                                            while (true) {
                                                i13 = i10;
                                                i14 = i28;
                                                j3 = j;
                                                qk6Var.a(new geh(i11, i76), j3);
                                                if (i76 == i75) {
                                                    break;
                                                }
                                                i76++;
                                                j = j3;
                                                i28 = i14;
                                                i10 = i13;
                                            }
                                        } else {
                                            i13 = i10;
                                            i14 = i28;
                                            j3 = j;
                                        }
                                        if (i11 == i12) {
                                            break;
                                        }
                                        i11++;
                                        j = j3;
                                        j6 = j2;
                                        i28 = i14;
                                        i10 = i13;
                                    }
                                    if (i13 >= 0 || qk6Var.g.b != i26) {
                                        i15 = (((int) (j4 >> c)) - i3) - i24;
                                        i16 = ((((int) (j2 >> c)) - qk6Var.g.b) - i24) - 1;
                                        int i77 = (int) (j4 & 4294967295L);
                                        int i78 = (i77 - i26) - i24;
                                        int i79 = i77 + i25 + i24;
                                        if (i15 <= i16) {
                                            while (true) {
                                                if (i78 <= i79) {
                                                    int i80 = i78;
                                                    while (true) {
                                                        qk6Var.a(new geh(i15, i80), j3);
                                                        if (i80 == i79) {
                                                            break;
                                                        }
                                                        i80++;
                                                    }
                                                }
                                                if (i15 == i16) {
                                                    break;
                                                }
                                                i15++;
                                            }
                                        }
                                    }
                                    i17 = (int) (c3 & 4294967295L);
                                    if (i17 <= 0 || qk6Var.g.c != i25) {
                                        int i81 = (int) (j4 >> c);
                                        int i82 = (i81 - i3) - i24;
                                        int i83 = i81 + i14 + i24;
                                        i18 = ((int) (j2 & 4294967295L)) + qk6Var.g.c + i24 + 1;
                                        i19 = ((int) (j4 & 4294967295L)) + i25 + i24;
                                        if (i18 <= i19) {
                                            while (true) {
                                                if (i82 <= i83) {
                                                    int i84 = i82;
                                                    while (true) {
                                                        qk6Var.a(new geh(i84, i18), j3);
                                                        if (i84 == i83) {
                                                            break;
                                                        }
                                                        i84++;
                                                    }
                                                }
                                                if (i18 == i19) {
                                                    break;
                                                }
                                                i18++;
                                            }
                                        }
                                    }
                                    if (i17 >= 0 || qk6Var.g.d != i26) {
                                        int i85 = (int) (j4 >> c);
                                        int i86 = (i85 - i3) - i24;
                                        int i87 = i85 + i14 + i24;
                                        i20 = (((int) (j4 & 4294967295L)) - i26) - i24;
                                        i21 = ((((int) (j2 & 4294967295L)) - qk6Var.g.d) - i24) - 1;
                                        if (i20 <= i21) {
                                            while (true) {
                                                if (i86 <= i87) {
                                                    int i88 = i86;
                                                    while (true) {
                                                        qk6Var.a(new geh(i88, i20), j3);
                                                        if (i88 == i87) {
                                                            break;
                                                        }
                                                        i88++;
                                                    }
                                                }
                                                if (i20 == i21) {
                                                    break;
                                                }
                                                i20++;
                                            }
                                        }
                                    }
                                    qk6Var.g = rk6Var;
                                    qk6Var.f = new wpe(j4);
                                }
                            }
                            j2 = j6;
                            i13 = i10;
                            i14 = i28;
                            j3 = j;
                            if (i13 >= 0) {
                            }
                            i15 = (((int) (j4 >> c)) - i3) - i24;
                            i16 = ((((int) (j2 >> c)) - qk6Var.g.b) - i24) - 1;
                            int i772 = (int) (j4 & 4294967295L);
                            int i782 = (i772 - i26) - i24;
                            int i792 = i772 + i25 + i24;
                            if (i15 <= i16) {
                            }
                            i17 = (int) (c3 & 4294967295L);
                            if (i17 <= 0) {
                            }
                            int i812 = (int) (j4 >> c);
                            int i822 = (i812 - i3) - i24;
                            int i832 = i812 + i14 + i24;
                            i18 = ((int) (j2 & 4294967295L)) + qk6Var.g.c + i24 + 1;
                            i19 = ((int) (j4 & 4294967295L)) + i25 + i24;
                            if (i18 <= i19) {
                            }
                            if (i17 >= 0) {
                            }
                            int i852 = (int) (j4 >> c);
                            int i862 = (i852 - i3) - i24;
                            int i872 = i852 + i14 + i24;
                            i20 = (((int) (j4 & 4294967295L)) - i26) - i24;
                            i21 = ((((int) (j2 & 4294967295L)) - qk6Var.g.d) - i24) - 1;
                            if (i20 <= i21) {
                            }
                            qk6Var.g = rk6Var;
                            qk6Var.f = new wpe(j4);
                        }
                    }
                    i7 = i4;
                    if (i7 <= 0) {
                    }
                    rk6 rk6Var52 = qk6Var.g;
                    int i682 = rk6Var52.d;
                    i8 = (((int) (j6 & 4294967295L)) - i682) - i24;
                    int i692 = (int) (j6 >> c);
                    int i702 = (i692 - rk6Var52.b) - i24;
                    int i712 = i692 + rk6Var52.a + i24;
                    i9 = ((i8 - (i26 - i682)) + i7) - 1;
                    if (i8 <= i9) {
                    }
                    long c32 = wpe.c(j4, j6);
                    i10 = (int) (c32 >> c);
                    if (i10 <= 0) {
                    }
                    i11 = ((int) (j6 >> c)) + qk6Var.g.a + i24 + 1;
                    i12 = ((int) (j4 >> c)) + i28 + i24;
                    int i732 = (int) (j4 & 4294967295L);
                    int i742 = (i732 - i26) - i24;
                    int i752 = i732 + i25 + i24;
                    if (i11 <= i12) {
                    }
                    j2 = j6;
                    i13 = i10;
                    i14 = i28;
                    j3 = j;
                    if (i13 >= 0) {
                    }
                    i15 = (((int) (j4 >> c)) - i3) - i24;
                    i16 = ((((int) (j2 >> c)) - qk6Var.g.b) - i24) - 1;
                    int i7722 = (int) (j4 & 4294967295L);
                    int i7822 = (i7722 - i26) - i24;
                    int i7922 = i7722 + i25 + i24;
                    if (i15 <= i16) {
                    }
                    i17 = (int) (c32 & 4294967295L);
                    if (i17 <= 0) {
                    }
                    int i8122 = (int) (j4 >> c);
                    int i8222 = (i8122 - i3) - i24;
                    int i8322 = i8122 + i14 + i24;
                    i18 = ((int) (j2 & 4294967295L)) + qk6Var.g.c + i24 + 1;
                    i19 = ((int) (j4 & 4294967295L)) + i25 + i24;
                    if (i18 <= i19) {
                    }
                    if (i17 >= 0) {
                    }
                    int i8522 = (int) (j4 >> c);
                    int i8622 = (i8522 - i3) - i24;
                    int i8722 = i8522 + i14 + i24;
                    i20 = (((int) (j4 & 4294967295L)) - i26) - i24;
                    i21 = ((((int) (j2 & 4294967295L)) - qk6Var.g.d) - i24) - 1;
                    if (i20 <= i21) {
                    }
                    qk6Var.g = rk6Var;
                    qk6Var.f = new wpe(j4);
                }
            }
            i3 = i27;
            i4 = (int) (c2 & 4294967295L);
            if (i4 >= 0) {
            }
            rk6 rk6Var42 = qk6Var.g;
            int i632 = rk6Var42.c;
            i5 = ((int) (j6 & 4294967295L)) + i632 + i24;
            int i642 = (int) (j6 >> c);
            int i652 = (i642 - rk6Var42.b) - i24;
            int i662 = i642 + rk6Var42.a + i24;
            i6 = (i25 - i632) + i5 + i4 + 1;
            if (i6 <= i5) {
            }
            i7 = i4;
            if (i7 <= 0) {
            }
            rk6 rk6Var522 = qk6Var.g;
            int i6822 = rk6Var522.d;
            i8 = (((int) (j6 & 4294967295L)) - i6822) - i24;
            int i6922 = (int) (j6 >> c);
            int i7022 = (i6922 - rk6Var522.b) - i24;
            int i7122 = i6922 + rk6Var522.a + i24;
            i9 = ((i8 - (i26 - i6822)) + i7) - 1;
            if (i8 <= i9) {
            }
            long c322 = wpe.c(j4, j6);
            i10 = (int) (c322 >> c);
            if (i10 <= 0) {
            }
            i11 = ((int) (j6 >> c)) + qk6Var.g.a + i24 + 1;
            i12 = ((int) (j4 >> c)) + i28 + i24;
            int i7322 = (int) (j4 & 4294967295L);
            int i7422 = (i7322 - i26) - i24;
            int i7522 = i7322 + i25 + i24;
            if (i11 <= i12) {
            }
            j2 = j6;
            i13 = i10;
            i14 = i28;
            j3 = j;
            if (i13 >= 0) {
            }
            i15 = (((int) (j4 >> c)) - i3) - i24;
            i16 = ((((int) (j2 >> c)) - qk6Var.g.b) - i24) - 1;
            int i77222 = (int) (j4 & 4294967295L);
            int i78222 = (i77222 - i26) - i24;
            int i79222 = i77222 + i25 + i24;
            if (i15 <= i16) {
            }
            i17 = (int) (c322 & 4294967295L);
            if (i17 <= 0) {
            }
            int i81222 = (int) (j4 >> c);
            int i82222 = (i81222 - i3) - i24;
            int i83222 = i81222 + i14 + i24;
            i18 = ((int) (j2 & 4294967295L)) + qk6Var.g.c + i24 + 1;
            i19 = ((int) (j4 & 4294967295L)) + i25 + i24;
            if (i18 <= i19) {
            }
            if (i17 >= 0) {
            }
            int i85222 = (int) (j4 >> c);
            int i86222 = (i85222 - i3) - i24;
            int i87222 = i85222 + i14 + i24;
            i20 = (((int) (j4 & 4294967295L)) - i26) - i24;
            i21 = ((((int) (j2 & 4294967295L)) - qk6Var.g.d) - i24) - 1;
            if (i20 <= i21) {
            }
            qk6Var.g = rk6Var;
            qk6Var.f = new wpe(j4);
        }
        return Unit.a;
    }
}
