package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.UUID;
import yads.bs1;
import yads.cs1;
import yads.jk0;
import yads.kk0;

/* loaded from: classes7.dex */
public final class sw71 implements fb81 {
    public final int a;
    public final qd81 b;
    public final np81 c = new np81();
    public qd81 d;
    public fb81 e;
    public long f;

    public sw71(int i, qd81 qd81Var) {
        this.a = i;
        this.b = qd81Var;
    }

    @Override // defpackage.fb81
    public final void a(int i, dl81 dl81Var) {
        fb81 fb81Var = this.e;
        int i2 = rf71.a;
        fb81Var.a(i, dl81Var);
    }

    @Override // defpackage.fb81
    public final void b(long j, int i, int i2, int i3, v781 v781Var) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        fb81 fb81Var = this.e;
        int i4 = rf71.a;
        fb81Var.b(j, i, i2, i3, v781Var);
    }

    @Override // defpackage.fb81
    public final int c(jz61 jz61Var, int i, boolean z) {
        fb81 fb81Var = this.e;
        int i2 = rf71.a;
        return fb81Var.c(jz61Var, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    @Override // defpackage.fb81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(qd81 qd81Var) {
        qd81 qd81Var2;
        String str;
        String str2;
        String str3;
        qd81 qd81Var3 = this.b;
        if (qd81Var3 != null) {
            if (qd81Var != qd81Var3) {
                int e = g681.e(qd81Var.E);
                String str4 = qd81Var3.a;
                String str5 = qd81Var3.b;
                if (str5 == null) {
                    str5 = qd81Var.b;
                }
                String str6 = qd81Var.c;
                if ((e == 3 || e == 1) && (str = qd81Var3.c) != null) {
                    str6 = str;
                }
                int i = qd81Var.y;
                if (i == -1) {
                    i = qd81Var3.y;
                }
                int i2 = qd81Var.z;
                if (i2 == -1) {
                    i2 = qd81Var3.z;
                }
                String str7 = qd81Var.B;
                if (str7 == null) {
                    String str8 = qd81Var3.B;
                    String[] split = TextUtils.isEmpty(str8) ? new String[0] : str8.trim().split("(\\s*,\\s*)", -1);
                    if (split.length != 0) {
                        StringBuilder sb = new StringBuilder();
                        int length = split.length;
                        int i3 = 0;
                        while (i3 < length) {
                            String str9 = split[i3];
                            int i4 = length;
                            if (e == g681.e(g681.b(str9))) {
                                if (sb.length() > 0) {
                                    sb.append(",");
                                }
                                sb.append(str9);
                            }
                            i3++;
                            length = i4;
                        }
                        if (sb.length() > 0) {
                            str3 = sb.toString();
                            if ((!TextUtils.isEmpty(str3) ? new String[0] : str3.trim().split("(\\s*,\\s*)", -1)).length == 1) {
                                str7 = str3;
                            }
                        }
                    }
                    str3 = null;
                    if ((!TextUtils.isEmpty(str3) ? new String[0] : str3.trim().split("(\\s*,\\s*)", -1)).length == 1) {
                    }
                }
                cs1 cs1Var = qd81Var.C;
                cs1 cs1Var2 = qd81Var3.C;
                if (cs1Var == null) {
                    cs1Var = cs1Var2;
                } else if (cs1Var2 != null) {
                    bs1[] bs1VarArr = cs1Var2.b;
                    if (bs1VarArr.length != 0) {
                        cs1Var = new cs1((bs1[]) rf71.r(cs1Var.b, bs1VarArr));
                    }
                }
                float f = qd81Var.L;
                if (f == -1.0f && e == 2) {
                    f = qd81Var3.L;
                }
                int i5 = qd81Var.w | qd81Var3.w;
                int i6 = qd81Var.x | qd81Var3.x;
                kk0 kk0Var = qd81Var3.H;
                kk0 kk0Var2 = qd81Var.H;
                ArrayList arrayList = new ArrayList();
                if (kk0Var != null) {
                    String str10 = kk0Var.d;
                    jk0[] jk0VarArr = kk0Var.b;
                    int length2 = jk0VarArr.length;
                    int i7 = 0;
                    while (i7 < length2) {
                        int i8 = i7;
                        jk0 jk0Var = jk0VarArr[i8];
                        int i9 = length2;
                        if (jk0Var.f != null) {
                            arrayList.add(jk0Var);
                        }
                        i7 = i8 + 1;
                        length2 = i9;
                    }
                    str2 = str10;
                } else {
                    str2 = null;
                }
                if (kk0Var2 != null) {
                    if (str2 == null) {
                        str2 = kk0Var2.d;
                    }
                    int size = arrayList.size();
                    jk0[] jk0VarArr2 = kk0Var2.b;
                    String str11 = str2;
                    int length3 = jk0VarArr2.length;
                    int i10 = 0;
                    while (i10 < length3) {
                        int i11 = i10;
                        jk0 jk0Var2 = jk0VarArr2[i11];
                        int i12 = length3;
                        if (jk0Var2.f != null) {
                            UUID uuid = jk0Var2.c;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size) {
                                    arrayList.add(jk0Var2);
                                    break;
                                }
                                int i14 = i13;
                                if (((jk0) arrayList.get(i13)).c.equals(uuid)) {
                                    break;
                                } else {
                                    i13 = i14 + 1;
                                }
                            }
                        }
                        i10 = i11 + 1;
                        length3 = i12;
                    }
                    str2 = str11;
                }
                kk0 kk0Var3 = arrayList.isEmpty() ? null : new kk0(str2, false, (jk0[]) arrayList.toArray(new jk0[0]));
                da81 da81Var = new da81(qd81Var);
                da81Var.a = str4;
                da81Var.b = str5;
                da81Var.c = str6;
                da81Var.d = i5;
                da81Var.e = i6;
                da81Var.f = i;
                da81Var.g = i2;
                da81Var.h = str7;
                da81Var.i = cs1Var;
                da81Var.n = kk0Var3;
                da81Var.r = f;
                qd81Var2 = new qd81(da81Var);
                this.d = qd81Var2;
                fb81 fb81Var = this.e;
                int i15 = rf71.a;
                fb81Var.k(qd81Var2);
            }
            qd81Var.getClass();
        }
        qd81Var2 = qd81Var;
        this.d = qd81Var2;
        fb81 fb81Var2 = this.e;
        int i152 = rf71.a;
        fb81Var2.k(qd81Var2);
    }
}
