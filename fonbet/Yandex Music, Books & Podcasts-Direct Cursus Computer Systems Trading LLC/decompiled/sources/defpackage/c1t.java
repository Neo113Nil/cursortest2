package defpackage;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLES20;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.y;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c1t implements w8p {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public c1t(String str, String str2, int i) {
        this.a = i;
        switch (i) {
            case 6:
                int glCreateProgram = GLES20.glCreateProgram();
                this.b = glCreateProgram;
                tt0.w();
                d(glCreateProgram, 35633, str);
                d(glCreateProgram, 35632, str2);
                GLES20.glLinkProgram(glCreateProgram);
                int[] iArr = {0};
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                tt0.x("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), iArr[0] == 1);
                GLES20.glUseProgram(glCreateProgram);
                this.e = new HashMap();
                int[] iArr2 = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
                this.c = new o6c[iArr2[0]];
                for (int i2 = 0; i2 < iArr2[0]; i2++) {
                    int i3 = this.b;
                    int[] iArr3 = new int[1];
                    GLES20.glGetProgramiv(i3, 35722, iArr3, 0);
                    int i4 = iArr3[0];
                    byte[] bArr = new byte[i4];
                    GLES20.glGetActiveAttrib(i3, i2, i4, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            break;
                        } else if (bArr[i5] == 0) {
                            i4 = i5;
                        } else {
                            i5++;
                        }
                    }
                    String str3 = new String(bArr, 0, i4);
                    GLES20.glGetAttribLocation(i3, str3);
                    o6c o6cVar = new o6c(24);
                    ((o6c[]) this.c)[i2] = o6cVar;
                    ((HashMap) this.e).put(str3, o6cVar);
                }
                this.f = new HashMap();
                int[] iArr4 = new int[1];
                GLES20.glGetProgramiv(this.b, 35718, iArr4, 0);
                this.d = new qee[iArr4[0]];
                for (int i6 = 0; i6 < iArr4[0]; i6++) {
                    int i7 = this.b;
                    int[] iArr5 = new int[1];
                    GLES20.glGetProgramiv(i7, 35719, iArr5, 0);
                    int i8 = iArr5[0];
                    byte[] bArr2 = new byte[i8];
                    GLES20.glGetActiveUniform(i7, i6, i8, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
                    int i9 = 0;
                    while (true) {
                        if (i9 >= i8) {
                            break;
                        } else if (bArr2[i9] == 0) {
                            i8 = i9;
                        } else {
                            i9++;
                        }
                    }
                    String str4 = new String(bArr2, 0, i8);
                    GLES20.glGetUniformLocation(i7, str4);
                    qee qeeVar = new qee(24);
                    ((qee[]) this.d)[i6] = qeeVar;
                    ((HashMap) this.f).put(str4, qeeVar);
                }
                tt0.w();
                return;
            default:
                int glCreateProgram2 = GLES20.glCreateProgram();
                this.b = glCreateProgram2;
                ot0.v();
                c(glCreateProgram2, 35633, str);
                c(glCreateProgram2, 35632, str2);
                GLES20.glLinkProgram(glCreateProgram2);
                int[] iArr6 = {0};
                GLES20.glGetProgramiv(glCreateProgram2, 35714, iArr6, 0);
                boolean z = iArr6[0] == 1;
                String str5 = "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram2);
                if (!z) {
                    throw new zcd(str5);
                }
                GLES20.glUseProgram(glCreateProgram2);
                this.e = new HashMap();
                int[] iArr7 = new int[1];
                GLES20.glGetProgramiv(glCreateProgram2, 35721, iArr7, 0);
                this.c = new b2c[iArr7[0]];
                for (int i10 = 0; i10 < iArr7[0]; i10++) {
                    int i11 = this.b;
                    int[] iArr8 = new int[1];
                    GLES20.glGetProgramiv(i11, 35722, iArr8, 0);
                    int i12 = iArr8[0];
                    byte[] bArr3 = new byte[i12];
                    GLES20.glGetActiveAttrib(i11, i10, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr3, 0);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            break;
                        } else if (bArr3[i13] == 0) {
                            i12 = i13;
                        } else {
                            i13++;
                        }
                    }
                    String str6 = new String(bArr3, 0, i12);
                    GLES20.glGetAttribLocation(i11, str6);
                    b2c b2cVar = new b2c();
                    ((b2c[]) this.c)[i10] = b2cVar;
                    ((HashMap) this.e).put(str6, b2cVar);
                }
                this.f = new HashMap();
                int[] iArr9 = new int[1];
                GLES20.glGetProgramiv(this.b, 35718, iArr9, 0);
                this.d = new ofc[iArr9[0]];
                for (int i14 = 0; i14 < iArr9[0]; i14++) {
                    int i15 = this.b;
                    int[] iArr10 = new int[1];
                    GLES20.glGetProgramiv(i15, 35719, iArr10, 0);
                    int i16 = iArr10[0];
                    byte[] bArr4 = new byte[i16];
                    GLES20.glGetActiveUniform(i15, i14, i16, new int[1], 0, new int[1], 0, new int[1], 0, bArr4, 0);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= i16) {
                            break;
                        } else if (bArr4[i17] == 0) {
                            i16 = i17;
                        } else {
                            i17++;
                        }
                    }
                    String str7 = new String(bArr4, 0, i16);
                    GLES20.glGetUniformLocation(i15, str7);
                    ofc ofcVar = new ofc(24);
                    ((ofc[]) this.d)[i14] = ofcVar;
                    ((HashMap) this.f).put(str7, ofcVar);
                }
                ot0.v();
                return;
        }
    }

    public static void c(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        boolean z = iArr[0] == 1;
        String str2 = GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str;
        if (!z) {
            throw new zcd(str2);
        }
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        ot0.v();
    }

    public static void d(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        tt0.x(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        tt0.w();
    }

    public void a(double d, float f) {
        int length = ((float[]) this.c).length + 1;
        int binarySearch = Arrays.binarySearch((double[]) this.d, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.d = Arrays.copyOf((double[]) this.d, length);
        this.c = Arrays.copyOf((float[]) this.c, length);
        this.e = new double[length];
        double[] dArr = (double[]) this.d;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        ((double[]) this.d)[binarySearch] = d;
        ((float[]) this.c)[binarySearch] = f;
    }

    @Override // defpackage.w8p
    public void b(d7k d7kVar) {
        ojs ojsVar;
        ojs ojsVar2;
        SparseArray sparseArray;
        int i;
        v94 v94Var;
        char c;
        int i2;
        int i3;
        ojs ojsVar3;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        v94 v94Var2 = (v94) this.c;
        ebt ebtVar = (ebt) this.f;
        SparseArray sparseArray3 = ebtVar.h;
        SparseBooleanArray sparseBooleanArray = ebtVar.i;
        et7 et7Var = ebtVar.f;
        List list = ebtVar.c;
        int i4 = ebtVar.a;
        if (d7kVar.v() == 2) {
            if (i4 == 1 || i4 == 2 || ebtVar.n == 1) {
                ojsVar = (ojs) list.get(0);
            } else {
                ojsVar = new ojs(((ojs) list.get(0)).d());
                list.add(ojsVar);
            }
            if ((d7kVar.v() & 128) != 0) {
                d7kVar.I(1);
                int B = d7kVar.B();
                d7kVar.I(3);
                d7kVar.f(v94Var2.b, 0, 2);
                v94Var2.q(0);
                v94Var2.t(3);
                ebtVar.t = v94Var2.i(13);
                d7kVar.f(v94Var2.b, 0, 2);
                v94Var2.q(0);
                v94Var2.t(4);
                d7kVar.I(v94Var2.i(12));
                if (i4 == 2 && ebtVar.r == null) {
                    gbt a = et7Var.a(21, new anx(21, (String) null, 0, (ArrayList) null, dvt.c));
                    ebtVar.r = a;
                    if (a != null) {
                        a.e(ojsVar, ebtVar.m, new cp2(B, 21, RemoteCameraConfig.Notification.ID));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a2 = d7kVar.a();
                while (a2 > 0) {
                    d7kVar.f(v94Var2.b, 0, 5);
                    v94Var2.q(0);
                    int i5 = v94Var2.i(8);
                    v94Var2.t(3);
                    int i6 = v94Var2.i(13);
                    v94Var2.t(4);
                    int i7 = v94Var2.i(12);
                    int i8 = d7kVar.b;
                    int i9 = i8 + i7;
                    int i10 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i11 = 0;
                    int i12 = a2;
                    while (true) {
                        if (d7kVar.b >= i9) {
                            v94Var = v94Var2;
                            break;
                        }
                        int v = d7kVar.v();
                        v94Var = v94Var2;
                        int v2 = d7kVar.b + d7kVar.v();
                        if (v2 > i9) {
                            break;
                        }
                        SparseArray sparseArray4 = sparseArray3;
                        if (v == 5) {
                            long x = d7kVar.x();
                            if (x == 1094921523) {
                                i10 = 129;
                            } else if (x == 1161904947) {
                                i10 = 135;
                            } else {
                                if (x != 1094921524) {
                                    if (x == 1212503619) {
                                        i10 = 36;
                                    }
                                }
                                i10 = 172;
                            }
                            i2 = v2;
                            i3 = B;
                            ojsVar3 = ojsVar;
                        } else if (v == 106) {
                            i2 = v2;
                            i3 = B;
                            ojsVar3 = ojsVar;
                            i10 = 129;
                        } else if (v == 122) {
                            i3 = B;
                            ojsVar3 = ojsVar;
                            i10 = 135;
                            i2 = v2;
                        } else {
                            if (v == 127) {
                                int v3 = d7kVar.v();
                                if (v3 != 21) {
                                    if (v3 == 14) {
                                        i10 = 136;
                                    } else if (v3 == 33) {
                                        i10 = 139;
                                    }
                                }
                                i10 = 172;
                            } else if (v == 123) {
                                i10 = 138;
                            } else if (v == 10) {
                                str = d7kVar.t(3, StandardCharsets.UTF_8).trim();
                                i2 = v2;
                                i11 = d7kVar.v();
                                i3 = B;
                                ojsVar3 = ojsVar;
                            } else {
                                if (v == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (d7kVar.b < v2) {
                                        String trim = d7kVar.t(3, StandardCharsets.UTF_8).trim();
                                        d7kVar.v();
                                        ojs ojsVar4 = ojsVar;
                                        byte[] bArr = new byte[4];
                                        d7kVar.f(bArr, 0, 4);
                                        arrayList2.add(new fbt(trim, bArr));
                                        ojsVar = ojsVar4;
                                        v2 = v2;
                                        B = B;
                                    }
                                    i2 = v2;
                                    i3 = B;
                                    ojsVar3 = ojsVar;
                                    arrayList = arrayList2;
                                    i10 = 89;
                                } else {
                                    i2 = v2;
                                    i3 = B;
                                    ojsVar3 = ojsVar;
                                    if (v == 111) {
                                        i10 = 257;
                                    }
                                }
                                d7kVar.I(i2 - d7kVar.b);
                                ojsVar = ojsVar3;
                                v94Var2 = v94Var;
                                sparseArray3 = sparseArray4;
                                B = i3;
                            }
                            i2 = v2;
                            i3 = B;
                            ojsVar3 = ojsVar;
                        }
                        d7kVar.I(i2 - d7kVar.b);
                        ojsVar = ojsVar3;
                        v94Var2 = v94Var;
                        sparseArray3 = sparseArray4;
                        B = i3;
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i13 = B;
                    ojs ojsVar5 = ojsVar;
                    d7kVar.H(i9);
                    anx anxVar = new anx(i10, str, i11, arrayList, Arrays.copyOfRange(d7kVar.a, i8, i9));
                    if (i5 == 6 || i5 == 5) {
                        i5 = i10;
                    }
                    int i14 = i12 - (i7 + 5);
                    int i15 = i4 == 2 ? i5 : i6;
                    if (sparseBooleanArray.get(i15)) {
                        c = 21;
                    } else {
                        c = 21;
                        gbt a3 = (i4 == 2 && i5 == 21) ? ebtVar.r : et7Var.a(i5, anxVar);
                        if (i4 != 2 || i6 < sparseIntArray.get(i15, RemoteCameraConfig.Notification.ID)) {
                            sparseIntArray.put(i15, i6);
                            sparseArray2.put(i15, a3);
                        }
                    }
                    a2 = i14;
                    ojsVar = ojsVar5;
                    v94Var2 = v94Var;
                    sparseArray3 = sparseArray5;
                    B = i13;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i16 = B;
                ojs ojsVar6 = ojsVar;
                int size = sparseIntArray.size();
                int i17 = 0;
                while (i17 < size) {
                    int keyAt = sparseIntArray.keyAt(i17);
                    int valueAt = sparseIntArray.valueAt(i17);
                    sparseBooleanArray.put(keyAt, true);
                    ebtVar.j.put(valueAt, true);
                    gbt gbtVar = (gbt) sparseArray2.valueAt(i17);
                    if (gbtVar != null) {
                        if (gbtVar != ebtVar.r) {
                            i = i16;
                            ojsVar2 = ojsVar6;
                            gbtVar.e(ojsVar2, ebtVar.m, new cp2(i, keyAt, RemoteCameraConfig.Notification.ID));
                        } else {
                            ojsVar2 = ojsVar6;
                            i = i16;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, gbtVar);
                    } else {
                        ojsVar2 = ojsVar6;
                        sparseArray = sparseArray6;
                        i = i16;
                    }
                    i17++;
                    sparseArray6 = sparseArray;
                    i16 = i;
                    ojsVar6 = ojsVar2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i4 == 2) {
                    if (ebtVar.o) {
                        return;
                    }
                    ebtVar.m.K();
                    ebtVar.n = 0;
                    ebtVar.o = true;
                    return;
                }
                sparseArray7.remove(this.b);
                int i18 = i4 == 1 ? 0 : ebtVar.n - 1;
                ebtVar.n = i18;
                if (i18 == 0) {
                    ebtVar.m.K();
                    ebtVar.o = true;
                }
            }
        }
    }

    public void f(View view, int i, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((g8c) this.c).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m(i);
        ((au1) this.d).O(childCount, z);
        if (z) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        opn b0 = RecyclerView.b0(view);
        qon qonVar = recyclerView.m;
        if (qonVar != null && b0 != null) {
            qonVar.o(b0);
        }
        ArrayList arrayList = recyclerView.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((apn) recyclerView.C.get(size)).b(view);
            }
        }
    }

    public void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((g8c) this.c).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m(i);
        ((au1) this.d).O(childCount, z);
        if (z) {
            p(view);
        }
        opn b0 = RecyclerView.b0(view);
        if (b0 != null) {
            if (!b0.m() && !b0.r()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(b0);
                xq0.s(sb, recyclerView.M());
                return;
            } else {
                if (RecyclerView.k1) {
                    Log.d("RecyclerView", "reAttach " + b0);
                }
                b0.j &= -257;
            }
        } else if (RecyclerView.j1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String M = recyclerView.M();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(M);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void h(int i) {
        int m = m(i);
        ((au1) this.d).P(m);
        RecyclerView recyclerView = (RecyclerView) ((g8c) this.c).a;
        View childAt = recyclerView.getChildAt(m);
        if (childAt != null) {
            opn b0 = RecyclerView.b0(childAt);
            if (b0 != null) {
                if (b0.m() && !b0.r()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(b0);
                    xq0.s(sb, recyclerView.M());
                    return;
                } else {
                    if (RecyclerView.k1) {
                        Log.d("RecyclerView", "tmpDetach " + b0);
                    }
                    b0.a(256);
                }
            }
        } else if (RecyclerView.j1) {
            jj4.g(m, "No view at offset ", recyclerView.M());
            return;
        }
        recyclerView.detachViewFromParent(m);
    }

    public t3a i() {
        en9 en9Var = (en9) this.c;
        y yVar = (y) this.d;
        int i = this.b;
        bnd bndVar = (bnd) this.e;
        vx6 vx6Var = (vx6) this.f;
        return new t3a(yVar, i, new znk(29, en9Var), new qxp(en9Var), new xzi(en9Var), bndVar, vx6Var);
    }

    public int j(String str) {
        switch (this.a) {
            case 5:
                int glGetAttribLocation = GLES20.glGetAttribLocation(this.b, str);
                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                ot0.v();
                return glGetAttribLocation;
            default:
                int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.b, str);
                GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                tt0.w();
                return glGetAttribLocation2;
        }
    }

    public View k(int i) {
        return ((RecyclerView) ((g8c) this.c).a).getChildAt(m(i));
    }

    public int l() {
        return ((RecyclerView) ((g8c) this.c).a).getChildCount() - ((ArrayList) this.e).size();
    }

    public int m(int i) {
        au1 au1Var = (au1) this.d;
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((g8c) this.c).a).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int C = i - (i2 - au1Var.C(i2));
            if (C == 0) {
                while (au1Var.L(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += C;
        }
        return -1;
    }

    public View n(int i) {
        return ((RecyclerView) ((g8c) this.c).a).getChildAt(i);
    }

    public int o() {
        return ((RecyclerView) ((g8c) this.c).a).getChildCount();
    }

    public void p(View view) {
        ((ArrayList) this.e).add(view);
        g8c g8cVar = (g8c) this.c;
        opn b0 = RecyclerView.b0(view);
        if (b0 != null) {
            View view2 = b0.a;
            RecyclerView recyclerView = (RecyclerView) g8cVar.a;
            int i = b0.q;
            if (i != -1) {
                b0.p = i;
            } else {
                b0.p = view2.getImportantForAccessibility();
            }
            if (!recyclerView.e0()) {
                view2.setImportantForAccessibility(4);
            } else {
                b0.q = 4;
                recyclerView.b1.add(b0);
            }
        }
    }

    public boolean q(c1t c1tVar, int i) {
        return c1tVar != null && Objects.equals(((gxn[]) this.c)[i], ((gxn[]) c1tVar.c)[i]) && Objects.equals(((zsb[]) this.d)[i], ((zsb[]) c1tVar.d)[i]);
    }

    public boolean r(int i) {
        return ((gxn[]) this.c)[i] != null;
    }

    public void s() {
        Activity activity;
        ViewGroup viewGroup = (ViewGroup) this.c;
        View view = viewGroup;
        while (true) {
            activity = null;
            if (view == null) {
                break;
            }
            Context context = view.getContext();
            Activity activity2 = context instanceof Activity ? (Activity) context : null;
            if (activity2 != null) {
                activity = activity2;
                break;
            } else {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
        }
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        int i = window.getAttributes().flags;
        if ((67108864 & i) == 0 && (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 && (window.getDecorView().getSystemUiVisibility() & 1024) == 0) {
            return;
        }
        h5n h5nVar = new h5n(7, this);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(viewGroup, h5nVar);
        kqv a = odu.a(viewGroup);
        if (a != null) {
            u(a);
        }
    }

    public void t(View view) {
        if (((ArrayList) this.e).remove(view)) {
            g8c g8cVar = (g8c) this.c;
            opn b0 = RecyclerView.b0(view);
            if (b0 != null) {
                RecyclerView recyclerView = (RecyclerView) g8cVar.a;
                int i = b0.p;
                if (recyclerView.e0()) {
                    b0.q = i;
                    recyclerView.b1.add(b0);
                } else {
                    b0.a.setImportantForAccessibility(i);
                }
                b0.p = 0;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((au1) this.d).toString() + ", hidden list:" + ((ArrayList) this.e).size();
            case 7:
                return "pos =" + Arrays.toString((double[]) this.d) + " period=" + Arrays.toString((float[]) this.c);
            default:
                return super.toString();
        }
    }

    public void u(kqv kqvVar) {
        int i = kqvVar.a.g(1).b;
        ViewGroup viewGroup = (ViewGroup) this.c;
        int[] iArr = (int[]) this.d;
        viewGroup.getLocationInWindow(iArr);
        int i2 = iArr[1];
        this.b = (i <= 0 || i2 >= i) ? 0 : i - i2;
        View view = (View) this.f;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            int i3 = marginLayoutParams.topMargin;
            int i4 = this.b;
            if (i3 == i4) {
                return;
            }
            marginLayoutParams.topMargin = i4;
            view.requestLayout();
        }
    }

    @Override // defpackage.w8p
    public void e(ojs ojsVar, t2c t2cVar, cp2 cp2Var) {
    }

    public c1t(int i, sfm sfmVar, ns4 ns4Var, pdp pdpVar) {
        this.a = 2;
        sfmVar.getClass();
        pdpVar.getClass();
        this.b = i;
        this.c = sfmVar;
        this.d = pdpVar;
        vdr w = sfmVar.w(i, ern.a(mtq.class), new mtq(new ys4(0, ovn.y(ns4Var, new v5(20, this))), ns4Var));
        this.e = w;
        this.f = asq.K(w, new sm4(9));
    }

    public c1t(en9 en9Var, y yVar, int i, bnd bndVar, vx6 vx6Var) {
        this.a = 4;
        this.c = en9Var;
        this.d = yVar;
        this.b = i;
        this.e = bndVar;
        this.f = vx6Var;
    }

    public c1t() {
        this.a = 3;
        this.b = wct.t();
        bdt I = hag.I(i0j.class);
        l18 l18Var = l18.b;
        this.c = l18Var.b(I, true);
        this.d = l18Var.b(hag.I(o36.class), true);
        this.e = l18Var.b(hag.I(nmj.class), true);
        this.f = l18Var.b(hag.I(rw5.class), true);
    }

    public c1t(ViewGroup viewGroup) {
        this.a = 9;
        this.c = viewGroup;
        this.d = new int[2];
        jb jbVar = new jb(9, this);
        this.e = jbVar;
        if (viewGroup.isAttachedToWindow()) {
            s();
        } else {
            viewGroup.addOnAttachStateChangeListener(jbVar);
        }
    }

    public c1t(g8c g8cVar) {
        this.a = 1;
        this.b = 0;
        this.c = g8cVar;
        this.d = new au1(1);
        this.e = new ArrayList();
    }

    public /* synthetic */ c1t(int i) {
        this.a = i;
    }

    public c1t(gxn[] gxnVarArr, zsb[] zsbVarArr, e3t e3tVar, Object obj) {
        this.a = 0;
        vq1.v(gxnVarArr.length == zsbVarArr.length);
        this.c = gxnVarArr;
        this.d = (zsb[]) zsbVarArr.clone();
        this.e = e3tVar;
        this.f = obj;
        this.b = gxnVarArr.length;
    }

    public c1t(bgi bgiVar, mju mjuVar, byte[] bArr, n20[] n20VarArr, int i) {
        this.a = 11;
        this.c = bgiVar;
        this.d = mjuVar;
        this.e = bArr;
        this.f = n20VarArr;
        this.b = i;
    }

    public c1t(ebt ebtVar, int i) {
        this.a = 10;
        this.f = ebtVar;
        this.c = new v94(new byte[5], 5);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.b = i;
    }
}
