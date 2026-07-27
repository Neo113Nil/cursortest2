package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ay extends w<ba> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13596a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f13597b = 2;
    private String aA;
    private String ak;
    private String al;
    private String am;
    private String an;
    private String ao;
    private String ap;
    private String aq;
    private String ar;
    private String as;
    private String at;
    private long au;
    private int av;
    private String aw;
    private String ax;
    private String ay;
    private String az;

    /* renamed from: c, reason: collision with root package name */
    public int f13598c;

    /* renamed from: d, reason: collision with root package name */
    public long f13599d;

    /* renamed from: e, reason: collision with root package name */
    String f13600e = "";

    private String aF() {
        return this.aA;
    }

    private String aG() {
        return this.aw;
    }

    private String aH() {
        return this.ax;
    }

    private String aI() {
        return this.ay;
    }

    private String aJ() {
        return this.az;
    }

    private int aK() {
        return this.f13598c;
    }

    private long aL() {
        return this.f13599d;
    }

    private long aM() {
        return this.au;
    }

    private void c(long j6) {
        this.f13599d = j6;
    }

    public final void X(String str) {
        this.ax = str;
    }

    public final void Y(String str) {
        this.ay = str;
    }

    public final void Z(String str) {
        this.az = str;
    }

    @Override // com.anythink.core.common.h.w
    public final /* synthetic */ List a(ba baVar) {
        boolean z3;
        ba baVar2 = baVar;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (TextUtils.equals(String.valueOf(baVar2.F()), "0") && !TextUtils.isEmpty(this.f14147v)) {
            arrayList.add(this.f14147v);
        }
        if (TextUtils.equals(String.valueOf(baVar2.F()), "2")) {
            String D8 = baVar2.D();
            if (!TextUtils.isEmpty(this.f14147v)) {
                arrayList.add(this.f14147v);
            }
            String d2 = d(baVar2);
            if (!TextUtils.isEmpty(d2)) {
                arrayList.add(d2);
            }
            if (arrayList.size() == 0) {
                stringBuffer.append(D8);
                stringBuffer.append(" url,");
            }
        }
        if (TextUtils.equals(String.valueOf(baVar2.F()), "1")) {
            if (TextUtils.isEmpty(this.f14142q)) {
                stringBuffer.append("icon_u,");
                z3 = false;
            } else {
                arrayList.add(this.f14142q);
                z3 = true;
            }
            if (TextUtils.isEmpty(this.f14144s)) {
                stringBuffer.append("full_u,");
                z3 = false;
            } else {
                arrayList.add(this.f14144s);
            }
            if (TextUtils.isEmpty(this.f14147v)) {
                stringBuffer.append("video_u,");
                z3 = false;
            } else {
                arrayList.add(this.f14147v);
            }
        } else {
            z3 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(baVar2.F());
        if (TextUtils.equals(sb.toString(), "3")) {
            if (TextUtils.isEmpty(this.f14142q)) {
                stringBuffer.append("icon_u,");
                z3 = false;
            } else {
                arrayList.add(this.f14142q);
            }
            if (TextUtils.isEmpty(this.f14144s)) {
                stringBuffer.append("full_u,");
                z3 = false;
            } else {
                arrayList.add(this.f14144s);
            }
            if (this.f14111A == 1) {
                if (TextUtils.isEmpty(this.f14147v)) {
                    stringBuffer.append("video_u,");
                    z3 = false;
                } else {
                    arrayList.add(this.f14147v);
                }
            }
        }
        if (TextUtils.equals(String.valueOf(baVar2.F()), "4")) {
            if (!TextUtils.isEmpty(this.f14147v)) {
                arrayList.add(this.f14147v);
                if (!TextUtils.isEmpty(this.f14144s)) {
                    arrayList.add(this.f14144s);
                }
            } else if (TextUtils.isEmpty(this.f14144s)) {
                stringBuffer.append("full_u,");
                z3 = false;
            } else {
                arrayList.add(this.f14144s);
            }
        }
        if (z3) {
            return arrayList;
        }
        this.f13600e = stringBuffer.substring(0, stringBuffer.length() - 1);
        return null;
    }

    public final String aA() {
        return this.ap;
    }

    public final String aB() {
        return this.aq;
    }

    public final String aC() {
        return this.ar;
    }

    public final String aD() {
        return this.as;
    }

    public final String aE() {
        return this.at;
    }

    public final void aa(String str) {
        this.ak = str;
    }

    public final void ab(String str) {
        this.al = str;
    }

    public final void ac(String str) {
        this.am = str;
    }

    public final void ad(String str) {
        this.an = str;
    }

    public final void ae(String str) {
        this.ao = str;
    }

    public final void af(String str) {
        this.ap = str;
    }

    public final void ag(String str) {
        this.aq = str;
    }

    public final void ah(String str) {
        this.ar = str;
    }

    public final void ai(String str) {
        this.as = str;
    }

    public final void aj(String str) {
        this.at = str;
    }

    public final String ak(String str) {
        try {
            JSONObject jSONObject = new JSONObject(this.aA);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                str = str.replaceAll("\\{" + next + "\\}", jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    public final String ay() {
        return this.an;
    }

    public final String az() {
        return this.ao;
    }

    @Override // com.anythink.core.common.h.w
    public final int b() {
        return 1;
    }

    public final String e() {
        return this.ak;
    }

    public final String f() {
        return this.al;
    }

    public final String g() {
        return this.am;
    }

    private List<String> c(ba baVar) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(String.valueOf(baVar.F()), "2")) {
            String d2 = d(baVar);
            if (!TextUtils.isEmpty(d2) && TextUtils.equals(d2, this.f14144s) && !TextUtils.isEmpty(this.f14142q)) {
                arrayList.add(this.f14142q);
            }
        }
        return arrayList;
    }

    @Override // com.anythink.core.common.h.w
    public final /* synthetic */ List b(ba baVar) {
        ba baVar2 = baVar;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(String.valueOf(baVar2.F()), "2")) {
            String d2 = d(baVar2);
            if (!TextUtils.isEmpty(d2) && TextUtils.equals(d2, this.f14144s) && !TextUtils.isEmpty(this.f14142q)) {
                arrayList.add(this.f14142q);
            }
        }
        return arrayList;
    }

    public final int d() {
        return this.av;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.anythink.core.common.h.w
    public String d(ba baVar) {
        char c9;
        if (TextUtils.equals(String.valueOf(baVar.F()), "2")) {
            String D8 = baVar.D();
            switch (D8.hashCode()) {
                case -559799608:
                    if (D8.equals(y.f14179c)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1507809730:
                    if (D8.equals(y.f14177a)) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1507809854:
                    if (D8.equals(y.f14178b)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1622564786:
                    if (D8.equals(y.f14180d)) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            if (c9 != 0) {
                if (c9 != 1) {
                    if (c9 != 2) {
                        if (!TextUtils.isEmpty(this.aw)) {
                            return this.aw;
                        }
                    } else if (!TextUtils.isEmpty(this.az)) {
                        return this.az;
                    }
                } else if (!TextUtils.isEmpty(this.ay)) {
                    return this.ay;
                }
            } else if (!TextUtils.isEmpty(this.ax)) {
                return this.ax;
            }
            return this.f14144s;
        }
        return "";
    }

    public final void b(String str) {
        this.aw = str;
    }

    private void b(int i) {
        this.f13598c = i;
    }

    public final void b(long j6) {
        this.au = j6;
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private List<String> b2(ba baVar) {
        boolean z3;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (TextUtils.equals(String.valueOf(baVar.F()), "0") && !TextUtils.isEmpty(this.f14147v)) {
            arrayList.add(this.f14147v);
        }
        if (TextUtils.equals(String.valueOf(baVar.F()), "2")) {
            String D8 = baVar.D();
            if (!TextUtils.isEmpty(this.f14147v)) {
                arrayList.add(this.f14147v);
            }
            String d2 = d(baVar);
            if (!TextUtils.isEmpty(d2)) {
                arrayList.add(d2);
            }
            if (arrayList.size() == 0) {
                stringBuffer.append(D8);
                stringBuffer.append(" url,");
            }
        }
        if (TextUtils.equals(String.valueOf(baVar.F()), "1")) {
            if (!TextUtils.isEmpty(this.f14142q)) {
                arrayList.add(this.f14142q);
                z3 = true;
            } else {
                stringBuffer.append("icon_u,");
                z3 = false;
            }
            if (!TextUtils.isEmpty(this.f14144s)) {
                arrayList.add(this.f14144s);
            } else {
                stringBuffer.append("full_u,");
                z3 = false;
            }
            if (!TextUtils.isEmpty(this.f14147v)) {
                arrayList.add(this.f14147v);
            } else {
                stringBuffer.append("video_u,");
                z3 = false;
            }
        } else {
            z3 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(baVar.F());
        if (TextUtils.equals(sb.toString(), "3")) {
            if (!TextUtils.isEmpty(this.f14142q)) {
                arrayList.add(this.f14142q);
            } else {
                stringBuffer.append("icon_u,");
                z3 = false;
            }
            if (!TextUtils.isEmpty(this.f14144s)) {
                arrayList.add(this.f14144s);
            } else {
                stringBuffer.append("full_u,");
                z3 = false;
            }
            if (this.f14111A == 1) {
                if (!TextUtils.isEmpty(this.f14147v)) {
                    arrayList.add(this.f14147v);
                } else {
                    stringBuffer.append("video_u,");
                    z3 = false;
                }
            }
        }
        if (TextUtils.equals(String.valueOf(baVar.F()), "4")) {
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
        this.f13600e = stringBuffer.substring(0, stringBuffer.length() - 1);
        return null;
    }

    public final void a(String str) {
        this.aA = str;
    }

    public final void a(int i) {
        this.av = i;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final boolean a2(ba baVar) {
        return baVar == null || System.currentTimeMillis() - this.au > baVar.M();
    }

    @Override // com.anythink.core.common.h.w
    public final String a() {
        return this.f13600e;
    }
}
