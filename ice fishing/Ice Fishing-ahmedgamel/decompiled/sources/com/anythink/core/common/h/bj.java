package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class bj extends w<bk> {
    public static final int ao = 1;
    public static final int ap = 2;
    public static final int aq = 3;
    public static final int ar = 4;
    public static final int as = 5;
    public static final int at = 6;
    long aA;
    long aB;
    private String aD;
    private String aE;
    private String aF;
    private String aG;
    private String aH;
    private int aI;
    private int aJ;
    long ak;
    String al;
    String am;
    int an;
    String au;
    String av;
    bl aw;
    int ax;
    String ay;
    long az;

    /* renamed from: b, reason: collision with root package name */
    private int f13642b;

    /* renamed from: c, reason: collision with root package name */
    private int f13643c;

    /* renamed from: d, reason: collision with root package name */
    private int f13644d;

    /* renamed from: e, reason: collision with root package name */
    private int f13645e;

    /* renamed from: a, reason: collision with root package name */
    private final String f13641a = getClass().getSimpleName();
    String aC = "";

    private String aM() {
        return this.av;
    }

    private int aN() {
        return this.f13642b;
    }

    private int aO() {
        return this.f13643c;
    }

    private int aP() {
        return this.f13644d;
    }

    private int aQ() {
        return this.f13645e;
    }

    private int e() {
        return this.ax;
    }

    private long f() {
        return this.ak;
    }

    private String g() {
        return this.al;
    }

    public final void X(String str) {
        this.aD = str;
    }

    public final void Y(String str) {
        this.aE = str;
    }

    public final void Z(String str) {
        this.aF = str;
    }

    public final String aA() {
        return this.aD;
    }

    public final String aB() {
        return this.aE;
    }

    public final String aC() {
        return this.aF;
    }

    public final String aD() {
        return this.aG;
    }

    public final String aE() {
        return this.aH;
    }

    public final int aF() {
        return this.aI;
    }

    public final int aG() {
        return this.aJ;
    }

    public final bl aH() {
        return this.aw;
    }

    public final String aI() {
        return this.am;
    }

    public final int aJ() {
        return this.an;
    }

    public final String aK() {
        return this.au;
    }

    public final String aL() {
        return this.ay;
    }

    public final void aa(String str) {
        this.aG = str;
    }

    public final void ab(String str) {
        this.aH = str;
    }

    public final void ac(String str) {
        this.al = str;
    }

    public final void ad(String str) {
        this.am = str;
    }

    public final void ae(String str) {
        this.au = str;
    }

    public final void af(String str) {
        this.av = str;
    }

    public final void ag(String str) {
        this.ay = str;
    }

    public final boolean ay() {
        return System.currentTimeMillis() >= this.aB;
    }

    public final long az() {
        return this.aB;
    }

    @Override // com.anythink.core.common.h.w
    public final /* synthetic */ List b(bk bkVar) {
        bk bkVar2 = bkVar;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(bkVar2.F());
        if (TextUtils.equals(sb.toString(), "2") && this.an == 3 && !TextUtils.isEmpty(this.f14142q)) {
            arrayList.add(this.f14142q);
        }
        if (TextUtils.equals(String.valueOf(bkVar2.F()), "4") && 1 != this.an && !TextUtils.isEmpty(this.f14142q)) {
            arrayList.add(this.f14142q);
        }
        return arrayList;
    }

    public final void c(long j6) {
        this.aA = j6;
    }

    public final void d(long j6) {
        this.aB = j6;
    }

    public final void r(int i) {
        this.aI = i;
    }

    public final void s(int i) {
        this.aJ = i;
    }

    public final void t(int i) {
        this.an = i;
    }

    public final void u(int i) {
        this.f13642b = i;
    }

    public final void v(int i) {
        this.f13643c = i;
    }

    public final void w(int i) {
        this.f13644d = i;
    }

    public final void x(int i) {
        this.f13645e = i;
    }

    private void a(int i) {
        this.ax = i;
    }

    private long d() {
        return this.az;
    }

    public final void e(long j6) {
        this.ak = j6;
    }

    public final void a(bl blVar) {
        this.aw = blVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0112, code lost:
    
        if (r6 != 4) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0070  */
    @Override // com.anythink.core.common.h.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> a(bk bkVar) {
        boolean z3;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (TextUtils.equals(String.valueOf(bkVar.F()), "0") && !TextUtils.isEmpty(this.f14147v)) {
            arrayList.add(this.f14147v);
        }
        if (TextUtils.equals(String.valueOf(bkVar.F()), "1")) {
            if (!n()) {
                if (!TextUtils.isEmpty(this.f14142q)) {
                    arrayList.add(this.f14142q);
                }
                if (!TextUtils.isEmpty(this.f14144s)) {
                    arrayList.add(this.f14144s);
                } else {
                    stringBuffer.append("full_u,");
                    z3 = false;
                    if (TextUtils.isEmpty(this.f14147v)) {
                        arrayList.add(this.f14147v);
                    } else {
                        if (bkVar.ap() != 1 && bkVar.aq() <= 0) {
                            stringBuffer.append("video_u,");
                        } else if (bkVar.aq() != 1) {
                            if (!TextUtils.isEmpty(this.f14144s)) {
                                if (!arrayList.contains(this.f14144s)) {
                                    arrayList.add(this.f14144s);
                                }
                            } else {
                                stringBuffer.append("full_u,");
                            }
                        }
                        z3 = false;
                    }
                }
            }
            z3 = true;
            if (TextUtils.isEmpty(this.f14147v)) {
            }
        } else {
            z3 = true;
        }
        if (TextUtils.equals(String.valueOf(bkVar.F()), "3")) {
            if (!n()) {
                if (!TextUtils.isEmpty(this.f14142q)) {
                    arrayList.add(this.f14142q);
                }
                if (!TextUtils.isEmpty(this.f14144s)) {
                    arrayList.add(this.f14144s);
                } else {
                    stringBuffer.append("full_u,");
                    z3 = false;
                }
            }
            if (L() && (this.f14111A == 1 || bkVar.aI())) {
                arrayList.add(this.f14147v);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(bkVar.F());
        if (TextUtils.equals(sb.toString(), "2")) {
            int i = this.an;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (TextUtils.isEmpty(this.f14147v)) {
                            if (!TextUtils.isEmpty(this.f14144s)) {
                                arrayList.add(this.f14144s);
                            } else {
                                stringBuffer.append("full_u,");
                                z3 = false;
                            }
                        } else {
                            arrayList.add(this.f14147v);
                            if (!TextUtils.isEmpty(this.f14144s)) {
                                arrayList.add(this.f14144s);
                            }
                        }
                    }
                }
                if (TextUtils.isEmpty(this.au)) {
                    stringBuffer.append("img_list,");
                    z3 = false;
                }
            } else if (TextUtils.isEmpty(this.f14147v)) {
                if (!TextUtils.isEmpty(this.f14144s)) {
                    arrayList.add(this.f14144s);
                } else {
                    stringBuffer.append("full_u,");
                    z3 = false;
                }
            } else {
                arrayList.add(this.f14147v);
                if (!TextUtils.isEmpty(this.f14144s)) {
                    arrayList.add(this.f14144s);
                }
            }
        }
        if (TextUtils.equals(String.valueOf(bkVar.F()), "4")) {
            if (TextUtils.isEmpty(this.f14147v)) {
                if (!TextUtils.isEmpty(this.f14144s)) {
                    arrayList.add(this.f14144s);
                } else {
                    stringBuffer.append("full_u,");
                    z3 = false;
                }
            } else {
                arrayList.add(this.f14147v);
                if (!TextUtils.isEmpty(this.f14144s)) {
                    arrayList.add(this.f14144s);
                }
            }
        }
        if (z3) {
            return arrayList;
        }
        this.aC = stringBuffer.substring(0, stringBuffer.length() - 1);
        return null;
    }

    public final void b(long j6) {
        this.az = j6;
        this.aB = this.aA + j6;
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private List<String> b2(bk bkVar) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(bkVar.F());
        if (TextUtils.equals(sb.toString(), "2") && this.an == 3 && !TextUtils.isEmpty(this.f14142q)) {
            arrayList.add(this.f14142q);
        }
        if (TextUtils.equals(String.valueOf(bkVar.F()), "4") && 1 != this.an && !TextUtils.isEmpty(this.f14142q)) {
            arrayList.add(this.f14142q);
        }
        return arrayList;
    }

    @Override // com.anythink.core.common.h.w
    public String a() {
        return this.aC;
    }

    public final boolean a(boolean z3, boolean z6) {
        return z3 ? z6 ? this.f13642b == 1 : this.f13643c == 1 : z6 ? this.f13644d == 1 : this.f13645e == 1;
    }
}
