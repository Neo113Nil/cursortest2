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
    private int f14428b;

    /* renamed from: c, reason: collision with root package name */
    private int f14429c;

    /* renamed from: d, reason: collision with root package name */
    private int f14430d;

    /* renamed from: e, reason: collision with root package name */
    private int f14431e;

    /* renamed from: a, reason: collision with root package name */
    private final String f14427a = getClass().getSimpleName();
    String aC = "";

    private String aM() {
        return this.av;
    }

    private int aN() {
        return this.f14428b;
    }

    private int aO() {
        return this.f14429c;
    }

    private int aP() {
        return this.f14430d;
    }

    private int aQ() {
        return this.f14431e;
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
        if (TextUtils.equals(sb.toString(), "2") && this.an == 3 && !TextUtils.isEmpty(this.f14928q)) {
            arrayList.add(this.f14928q);
        }
        if (TextUtils.equals(String.valueOf(bkVar2.F()), "4") && 1 != this.an && !TextUtils.isEmpty(this.f14928q)) {
            arrayList.add(this.f14928q);
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
        this.f14428b = i;
    }

    public final void v(int i) {
        this.f14429c = i;
    }

    public final void w(int i) {
        this.f14430d = i;
    }

    public final void x(int i) {
        this.f14431e = i;
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
        boolean z6;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (TextUtils.equals(String.valueOf(bkVar.F()), "0") && !TextUtils.isEmpty(this.f14933v)) {
            arrayList.add(this.f14933v);
        }
        if (TextUtils.equals(String.valueOf(bkVar.F()), "1")) {
            if (!n()) {
                if (!TextUtils.isEmpty(this.f14928q)) {
                    arrayList.add(this.f14928q);
                }
                if (!TextUtils.isEmpty(this.f14930s)) {
                    arrayList.add(this.f14930s);
                } else {
                    stringBuffer.append("full_u,");
                    z6 = false;
                    if (TextUtils.isEmpty(this.f14933v)) {
                        arrayList.add(this.f14933v);
                    } else {
                        if (bkVar.ap() != 1 && bkVar.aq() <= 0) {
                            stringBuffer.append("video_u,");
                        } else if (bkVar.aq() != 1) {
                            if (!TextUtils.isEmpty(this.f14930s)) {
                                if (!arrayList.contains(this.f14930s)) {
                                    arrayList.add(this.f14930s);
                                }
                            } else {
                                stringBuffer.append("full_u,");
                            }
                        }
                        z6 = false;
                    }
                }
            }
            z6 = true;
            if (TextUtils.isEmpty(this.f14933v)) {
            }
        } else {
            z6 = true;
        }
        if (TextUtils.equals(String.valueOf(bkVar.F()), "3")) {
            if (!n()) {
                if (!TextUtils.isEmpty(this.f14928q)) {
                    arrayList.add(this.f14928q);
                }
                if (!TextUtils.isEmpty(this.f14930s)) {
                    arrayList.add(this.f14930s);
                } else {
                    stringBuffer.append("full_u,");
                    z6 = false;
                }
            }
            if (L() && (this.f14897A == 1 || bkVar.aI())) {
                arrayList.add(this.f14933v);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(bkVar.F());
        if (TextUtils.equals(sb.toString(), "2")) {
            int i = this.an;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (TextUtils.isEmpty(this.f14933v)) {
                            if (!TextUtils.isEmpty(this.f14930s)) {
                                arrayList.add(this.f14930s);
                            } else {
                                stringBuffer.append("full_u,");
                                z6 = false;
                            }
                        } else {
                            arrayList.add(this.f14933v);
                            if (!TextUtils.isEmpty(this.f14930s)) {
                                arrayList.add(this.f14930s);
                            }
                        }
                    }
                }
                if (TextUtils.isEmpty(this.au)) {
                    stringBuffer.append("img_list,");
                    z6 = false;
                }
            } else if (TextUtils.isEmpty(this.f14933v)) {
                if (!TextUtils.isEmpty(this.f14930s)) {
                    arrayList.add(this.f14930s);
                } else {
                    stringBuffer.append("full_u,");
                    z6 = false;
                }
            } else {
                arrayList.add(this.f14933v);
                if (!TextUtils.isEmpty(this.f14930s)) {
                    arrayList.add(this.f14930s);
                }
            }
        }
        if (TextUtils.equals(String.valueOf(bkVar.F()), "4")) {
            if (TextUtils.isEmpty(this.f14933v)) {
                if (!TextUtils.isEmpty(this.f14930s)) {
                    arrayList.add(this.f14930s);
                } else {
                    stringBuffer.append("full_u,");
                    z6 = false;
                }
            } else {
                arrayList.add(this.f14933v);
                if (!TextUtils.isEmpty(this.f14930s)) {
                    arrayList.add(this.f14930s);
                }
            }
        }
        if (z6) {
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
        if (TextUtils.equals(sb.toString(), "2") && this.an == 3 && !TextUtils.isEmpty(this.f14928q)) {
            arrayList.add(this.f14928q);
        }
        if (TextUtils.equals(String.valueOf(bkVar.F()), "4") && 1 != this.an && !TextUtils.isEmpty(this.f14928q)) {
            arrayList.add(this.f14928q);
        }
        return arrayList;
    }

    @Override // com.anythink.core.common.h.w
    public String a() {
        return this.aC;
    }

    public final boolean a(boolean z6, boolean z9) {
        return z6 ? z9 ? this.f14428b == 1 : this.f14429c == 1 : z9 ? this.f14430d == 1 : this.f14431e == 1;
    }
}
