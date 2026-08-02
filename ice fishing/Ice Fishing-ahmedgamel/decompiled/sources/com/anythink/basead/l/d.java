package com.anythink.basead.l;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.l.c;
import com.anythink.basead.l.c.ah;
import com.anythink.basead.l.c.at;
import com.anythink.basead.l.c.k;
import com.anythink.basead.l.c.l;
import com.anythink.basead.l.f;
import com.anythink.core.common.h.bk;
import com.anythink.core.common.h.bl;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    private static final String f10238d = "d";

    /* renamed from: a, reason: collision with root package name */
    c f10239a;

    /* renamed from: e, reason: collision with root package name */
    private Context f10242e;

    /* renamed from: f, reason: collision with root package name */
    private r f10243f;

    /* renamed from: g, reason: collision with root package name */
    private x f10244g;
    private a i;

    /* renamed from: j, reason: collision with root package name */
    private long f10246j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10248l = true;

    /* renamed from: b, reason: collision with root package name */
    String f10240b = "<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"/><meta name=\"viewport\"content=\"width=device-width, initial-scale=1.0\"/><title>TopOn</title></head><body>%s</body></html>";

    /* renamed from: c, reason: collision with root package name */
    String f10241c = "<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"/><meta name=\"viewport\"content=\"width=device-width, initial-scale=1.0\"/><title>TopOn</title></head>%s</html>";

    /* renamed from: h, reason: collision with root package name */
    private a f10245h = new a() { // from class: com.anythink.basead.l.d.1
        /* JADX WARN: Removed duplicated region for block: B:31:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
        @Override // com.anythink.basead.l.d.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(r rVar) {
            boolean z6;
            String str;
            String str2 = "";
            if (!d.this.f10243f.n()) {
                r rVar2 = d.this.f10243f;
                bk bkVar = (bk) d.this.f10244g.f14954o;
                x unused = d.this.f10244g;
                if (rVar2.a(bkVar) == null) {
                    z6 = false;
                    str = d.this.f10243f.a();
                    String unused2 = d.f10238d;
                    System.currentTimeMillis();
                    long unused3 = d.this.f10246j;
                    if (d.this.f10248l) {
                        if (z6) {
                            x xVar = d.this.f10244g;
                            String str3 = d.this.f10244g.f14943c;
                            String aD = d.this.f10243f.aD();
                            String v9 = d.this.f10243f.v();
                            long currentTimeMillis = System.currentTimeMillis() - d.this.f10246j;
                            StringBuilder sb = new StringBuilder();
                            sb.append(d.this.f10247k);
                            String sb2 = sb.toString();
                            String E8 = d.this.f10243f.E();
                            String H8 = d.this.f10243f.H();
                            String arrays = d.this.f10243f.aH().f() != null ? Arrays.toString(d.this.f10243f.aH().f()) : "";
                            c cVar = d.this.f10239a;
                            if (cVar != null && cVar.a().size() > 0) {
                                str2 = d.this.f10239a.a().toString();
                            }
                            com.anythink.core.common.u.e.a(xVar, str3, aD, v9, "1", currentTimeMillis, "", sb2, E8, H8, arrays, str2);
                        } else {
                            x xVar2 = d.this.f10244g;
                            String str4 = d.this.f10244g.f14943c;
                            String aD2 = d.this.f10243f.aD();
                            String v10 = d.this.f10243f.v();
                            long currentTimeMillis2 = System.currentTimeMillis() - d.this.f10246j;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(d.this.f10247k);
                            String sb4 = sb3.toString();
                            String E9 = d.this.f10243f.E();
                            String H9 = d.this.f10243f.H();
                            String arrays2 = d.this.f10243f.aH().f() != null ? Arrays.toString(d.this.f10243f.aH().f()) : "";
                            c cVar2 = d.this.f10239a;
                            if (cVar2 != null && cVar2.a().size() > 0) {
                                str2 = d.this.f10239a.a().toString();
                            }
                            com.anythink.core.common.u.e.a(xVar2, str4, aD2, v10, "-4", currentTimeMillis2, str, sb4, E9, H9, arrays2, str2);
                        }
                    }
                    if (d.this.i == null) {
                        d.this.i.a(rVar);
                        return;
                    }
                    return;
                }
            }
            z6 = true;
            str = "";
            String unused22 = d.f10238d;
            System.currentTimeMillis();
            long unused32 = d.this.f10246j;
            if (d.this.f10248l) {
            }
            if (d.this.i == null) {
            }
        }

        @Override // com.anythink.basead.l.d.a
        public final void a(String str, String str2) {
            if (d.this.f10248l) {
                x xVar = d.this.f10244g;
                String str3 = d.this.f10244g.f14943c;
                String aD = d.this.f10243f.aD();
                String v9 = d.this.f10243f.v();
                long currentTimeMillis = System.currentTimeMillis() - d.this.f10246j;
                StringBuilder sb = new StringBuilder();
                sb.append(d.this.f10247k);
                String sb2 = sb.toString();
                String E8 = d.this.f10243f.E();
                String H8 = d.this.f10243f.H();
                String str4 = "";
                String arrays = d.this.f10243f.aH().f() != null ? Arrays.toString(d.this.f10243f.aH().f()) : "";
                c cVar = d.this.f10239a;
                if (cVar != null && cVar.a().size() > 0) {
                    str4 = d.this.f10239a.a().toString();
                }
                com.anythink.core.common.u.e.a(xVar, str3, aD, v9, str, currentTimeMillis, str2, sb2, E8, H8, arrays, str4);
            }
            if (d.this.i != null) {
                d.this.i.a(str, str2);
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private int f10247k = -1;

    /* renamed from: com.anythink.basead.l.d$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10252a;

        static {
            int[] iArr = new int[f.a.values().length];
            f10252a = iArr;
            try {
                iArr[f.a.AD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10252a[f.a.AD_FIRSTQUARTILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10252a[f.a.AD_MIDPOINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10252a[f.a.AD_THIRDQUARTILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10252a[f.a.AD_COMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10252a[f.a.AD_PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10252a[f.a.AD_RESUME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10252a[f.a.AD_UNMUTE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10252a[f.a.AD_MUTE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10252a[f.a.AD_REWIND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10252a[f.a.AD_FULLSCREEN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10252a[f.a.AD_CLOSE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public interface a {
        void a(r rVar);

        void a(String str, String str2);
    }

    public d(Context context, r rVar, x xVar) {
        this.f10242e = context;
        this.f10243f = rVar;
        this.f10244g = xVar;
    }

    public final void a(a aVar) {
        String af = this.f10243f.af();
        this.i = aVar;
        this.f10246j = System.currentTimeMillis();
        this.f10248l = true;
        c cVar = new c(this.f10244g, new c.a() { // from class: com.anythink.basead.l.d.2
            @Override // com.anythink.basead.l.c.a
            public final void a(int i, String str) {
                String unused = d.f10238d;
                if (d.this.f10245h != null) {
                    d.this.f10245h.a(String.valueOf(i), str);
                }
            }

            @Override // com.anythink.basead.l.c.a
            public final void a(com.anythink.basead.l.b.a[] aVarArr, JSONArray jSONArray) {
                d.a(d.this, aVarArr, jSONArray);
            }
        });
        this.f10239a = cVar;
        cVar.a(af);
    }

    public final void a(a aVar, String str) {
        JSONArray jSONArray;
        if (TextUtils.isEmpty(str)) {
            aVar.a("-3", "Local vast parse result is empty.");
            return;
        }
        try {
            jSONArray = new JSONArray(str);
        } catch (Throwable unused) {
            aVar.a("-3", "Local vast parse result fail.");
            jSONArray = null;
        }
        if (jSONArray == null) {
            return;
        }
        this.i = aVar;
        this.f10248l = false;
        c cVar = new c(this.f10244g, true, new c.a() { // from class: com.anythink.basead.l.d.3
            @Override // com.anythink.basead.l.c.a
            public final void a(int i, String str2) {
                String unused2 = d.f10238d;
                if (d.this.f10245h != null) {
                    d.this.f10245h.a(String.valueOf(i), str2);
                }
            }

            @Override // com.anythink.basead.l.c.a
            public final void a(com.anythink.basead.l.b.a[] aVarArr, JSONArray jSONArray2) {
                d.a(d.this, aVarArr, jSONArray2);
            }
        });
        this.f10239a = cVar;
        cVar.a(jSONArray);
    }

    private void a(com.anythink.basead.l.b.a[] aVarArr, JSONArray jSONArray) {
        if (aVarArr == null) {
            a aVar = this.f10245h;
            if (aVar != null) {
                aVar.a("-3", "Parsers results are null.");
                return;
            }
            return;
        }
        if (aVarArr.length != 2) {
            a aVar2 = this.f10245h;
            if (aVar2 != null) {
                aVar2.a("-3", "2 VAST result parsers are required.");
                return;
            }
            return;
        }
        com.anythink.basead.l.b.a aVar3 = aVarArr[0];
        if (((com.anythink.basead.l.b.b) aVar3) != null) {
            com.anythink.basead.l.b.a aVar4 = aVarArr[1];
            if (((com.anythink.basead.l.b.b) aVar4) != null) {
                boolean a9 = a((com.anythink.basead.l.b.b) aVar3, (com.anythink.basead.l.b.b) aVar4);
                jSONArray.length();
                a aVar5 = this.f10245h;
                if (aVar5 != null) {
                    if (!a9) {
                        aVar5.a("-3", "Do fillAdxOfferFormVast is fail.");
                        return;
                    }
                    if (this.f10248l) {
                        com.anythink.core.common.a.a.a().a(this.f10242e, this.f10244g.f14941a, jSONArray.toString());
                    }
                    this.f10245h.a(this.f10243f);
                    return;
                }
                return;
            }
        }
        a aVar6 = this.f10245h;
        if (aVar6 != null) {
            aVar6.a("-3", "One of parsers is null.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0240 A[Catch: all -> 0x010c, TryCatch #5 {all -> 0x010c, blocks: (B:35:0x00dd, B:38:0x00eb, B:40:0x00f1, B:48:0x0136, B:50:0x013c, B:51:0x0143, B:53:0x0149, B:54:0x0154, B:56:0x015e, B:58:0x0168, B:65:0x0194, B:67:0x01a9, B:69:0x01b0, B:71:0x01b7, B:72:0x01bc, B:74:0x01c2, B:75:0x01cc, B:77:0x01d2, B:79:0x01d9, B:81:0x01e0, B:82:0x01e5, B:84:0x01eb, B:85:0x01f0, B:87:0x01f6, B:88:0x0203, B:90:0x0209, B:93:0x0219, B:98:0x0221, B:102:0x0228, B:106:0x023a, B:108:0x0240, B:109:0x024d, B:111:0x0253, B:114:0x0263, B:119:0x026b, B:122:0x0272, B:124:0x027f, B:126:0x0285, B:127:0x0294, B:129:0x029c, B:131:0x02a8, B:132:0x02b0, B:136:0x02b5, B:140:0x02bc, B:145:0x02cf, B:148:0x02d6, B:150:0x02e5, B:153:0x02ec, B:155:0x02fb, B:158:0x0302, B:160:0x0310, B:163:0x0317, B:165:0x0325, B:168:0x032c, B:170:0x033a, B:173:0x0341, B:175:0x034f, B:178:0x0356, B:180:0x0364, B:183:0x036b, B:135:0x0378, B:187:0x037c, B:195:0x0107, B:196:0x0110, B:197:0x0121, B:199:0x0132), top: B:34:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0285 A[Catch: all -> 0x010c, TryCatch #5 {all -> 0x010c, blocks: (B:35:0x00dd, B:38:0x00eb, B:40:0x00f1, B:48:0x0136, B:50:0x013c, B:51:0x0143, B:53:0x0149, B:54:0x0154, B:56:0x015e, B:58:0x0168, B:65:0x0194, B:67:0x01a9, B:69:0x01b0, B:71:0x01b7, B:72:0x01bc, B:74:0x01c2, B:75:0x01cc, B:77:0x01d2, B:79:0x01d9, B:81:0x01e0, B:82:0x01e5, B:84:0x01eb, B:85:0x01f0, B:87:0x01f6, B:88:0x0203, B:90:0x0209, B:93:0x0219, B:98:0x0221, B:102:0x0228, B:106:0x023a, B:108:0x0240, B:109:0x024d, B:111:0x0253, B:114:0x0263, B:119:0x026b, B:122:0x0272, B:124:0x027f, B:126:0x0285, B:127:0x0294, B:129:0x029c, B:131:0x02a8, B:132:0x02b0, B:136:0x02b5, B:140:0x02bc, B:145:0x02cf, B:148:0x02d6, B:150:0x02e5, B:153:0x02ec, B:155:0x02fb, B:158:0x0302, B:160:0x0310, B:163:0x0317, B:165:0x0325, B:168:0x032c, B:170:0x033a, B:173:0x0341, B:175:0x034f, B:178:0x0356, B:180:0x0364, B:183:0x036b, B:135:0x0378, B:187:0x037c, B:195:0x0107, B:196:0x0110, B:197:0x0121, B:199:0x0132), top: B:34:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029c A[Catch: all -> 0x010c, TryCatch #5 {all -> 0x010c, blocks: (B:35:0x00dd, B:38:0x00eb, B:40:0x00f1, B:48:0x0136, B:50:0x013c, B:51:0x0143, B:53:0x0149, B:54:0x0154, B:56:0x015e, B:58:0x0168, B:65:0x0194, B:67:0x01a9, B:69:0x01b0, B:71:0x01b7, B:72:0x01bc, B:74:0x01c2, B:75:0x01cc, B:77:0x01d2, B:79:0x01d9, B:81:0x01e0, B:82:0x01e5, B:84:0x01eb, B:85:0x01f0, B:87:0x01f6, B:88:0x0203, B:90:0x0209, B:93:0x0219, B:98:0x0221, B:102:0x0228, B:106:0x023a, B:108:0x0240, B:109:0x024d, B:111:0x0253, B:114:0x0263, B:119:0x026b, B:122:0x0272, B:124:0x027f, B:126:0x0285, B:127:0x0294, B:129:0x029c, B:131:0x02a8, B:132:0x02b0, B:136:0x02b5, B:140:0x02bc, B:145:0x02cf, B:148:0x02d6, B:150:0x02e5, B:153:0x02ec, B:155:0x02fb, B:158:0x0302, B:160:0x0310, B:163:0x0317, B:165:0x0325, B:168:0x032c, B:170:0x033a, B:173:0x0341, B:175:0x034f, B:178:0x0356, B:180:0x0364, B:183:0x036b, B:135:0x0378, B:187:0x037c, B:195:0x0107, B:196:0x0110, B:197:0x0121, B:199:0x0132), top: B:34:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9 A[Catch: all -> 0x010c, TryCatch #5 {all -> 0x010c, blocks: (B:35:0x00dd, B:38:0x00eb, B:40:0x00f1, B:48:0x0136, B:50:0x013c, B:51:0x0143, B:53:0x0149, B:54:0x0154, B:56:0x015e, B:58:0x0168, B:65:0x0194, B:67:0x01a9, B:69:0x01b0, B:71:0x01b7, B:72:0x01bc, B:74:0x01c2, B:75:0x01cc, B:77:0x01d2, B:79:0x01d9, B:81:0x01e0, B:82:0x01e5, B:84:0x01eb, B:85:0x01f0, B:87:0x01f6, B:88:0x0203, B:90:0x0209, B:93:0x0219, B:98:0x0221, B:102:0x0228, B:106:0x023a, B:108:0x0240, B:109:0x024d, B:111:0x0253, B:114:0x0263, B:119:0x026b, B:122:0x0272, B:124:0x027f, B:126:0x0285, B:127:0x0294, B:129:0x029c, B:131:0x02a8, B:132:0x02b0, B:136:0x02b5, B:140:0x02bc, B:145:0x02cf, B:148:0x02d6, B:150:0x02e5, B:153:0x02ec, B:155:0x02fb, B:158:0x0302, B:160:0x0310, B:163:0x0317, B:165:0x0325, B:168:0x032c, B:170:0x033a, B:173:0x0341, B:175:0x034f, B:178:0x0356, B:180:0x0364, B:183:0x036b, B:135:0x0378, B:187:0x037c, B:195:0x0107, B:196:0x0110, B:197:0x0121, B:199:0x0132), top: B:34:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b0 A[Catch: all -> 0x010c, TryCatch #5 {all -> 0x010c, blocks: (B:35:0x00dd, B:38:0x00eb, B:40:0x00f1, B:48:0x0136, B:50:0x013c, B:51:0x0143, B:53:0x0149, B:54:0x0154, B:56:0x015e, B:58:0x0168, B:65:0x0194, B:67:0x01a9, B:69:0x01b0, B:71:0x01b7, B:72:0x01bc, B:74:0x01c2, B:75:0x01cc, B:77:0x01d2, B:79:0x01d9, B:81:0x01e0, B:82:0x01e5, B:84:0x01eb, B:85:0x01f0, B:87:0x01f6, B:88:0x0203, B:90:0x0209, B:93:0x0219, B:98:0x0221, B:102:0x0228, B:106:0x023a, B:108:0x0240, B:109:0x024d, B:111:0x0253, B:114:0x0263, B:119:0x026b, B:122:0x0272, B:124:0x027f, B:126:0x0285, B:127:0x0294, B:129:0x029c, B:131:0x02a8, B:132:0x02b0, B:136:0x02b5, B:140:0x02bc, B:145:0x02cf, B:148:0x02d6, B:150:0x02e5, B:153:0x02ec, B:155:0x02fb, B:158:0x0302, B:160:0x0310, B:163:0x0317, B:165:0x0325, B:168:0x032c, B:170:0x033a, B:173:0x0341, B:175:0x034f, B:178:0x0356, B:180:0x0364, B:183:0x036b, B:135:0x0378, B:187:0x037c, B:195:0x0107, B:196:0x0110, B:197:0x0121, B:199:0x0132), top: B:34:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b7 A[Catch: all -> 0x010c, TryCatch #5 {all -> 0x010c, blocks: (B:35:0x00dd, B:38:0x00eb, B:40:0x00f1, B:48:0x0136, B:50:0x013c, B:51:0x0143, B:53:0x0149, B:54:0x0154, B:56:0x015e, B:58:0x0168, B:65:0x0194, B:67:0x01a9, B:69:0x01b0, B:71:0x01b7, B:72:0x01bc, B:74:0x01c2, B:75:0x01cc, B:77:0x01d2, B:79:0x01d9, B:81:0x01e0, B:82:0x01e5, B:84:0x01eb, B:85:0x01f0, B:87:0x01f6, B:88:0x0203, B:90:0x0209, B:93:0x0219, B:98:0x0221, B:102:0x0228, B:106:0x023a, B:108:0x0240, B:109:0x024d, B:111:0x0253, B:114:0x0263, B:119:0x026b, B:122:0x0272, B:124:0x027f, B:126:0x0285, B:127:0x0294, B:129:0x029c, B:131:0x02a8, B:132:0x02b0, B:136:0x02b5, B:140:0x02bc, B:145:0x02cf, B:148:0x02d6, B:150:0x02e5, B:153:0x02ec, B:155:0x02fb, B:158:0x0302, B:160:0x0310, B:163:0x0317, B:165:0x0325, B:168:0x032c, B:170:0x033a, B:173:0x0341, B:175:0x034f, B:178:0x0356, B:180:0x0364, B:183:0x036b, B:135:0x0378, B:187:0x037c, B:195:0x0107, B:196:0x0110, B:197:0x0121, B:199:0x0132), top: B:34:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c2 A[Catch: all -> 0x010c, TryCatch #5 {all -> 0x010c, blocks: (B:35:0x00dd, B:38:0x00eb, B:40:0x00f1, B:48:0x0136, B:50:0x013c, B:51:0x0143, B:53:0x0149, B:54:0x0154, B:56:0x015e, B:58:0x0168, B:65:0x0194, B:67:0x01a9, B:69:0x01b0, B:71:0x01b7, B:72:0x01bc, B:74:0x01c2, B:75:0x01cc, B:77:0x01d2, B:79:0x01d9, B:81:0x01e0, B:82:0x01e5, B:84:0x01eb, B:85:0x01f0, B:87:0x01f6, B:88:0x0203, B:90:0x0209, B:93:0x0219, B:98:0x0221, B:102:0x0228, B:106:0x023a, B:108:0x0240, B:109:0x024d, B:111:0x0253, B:114:0x0263, B:119:0x026b, B:122:0x0272, B:124:0x027f, B:126:0x0285, B:127:0x0294, B:129:0x029c, B:131:0x02a8, B:132:0x02b0, B:136:0x02b5, B:140:0x02bc, B:145:0x02cf, B:148:0x02d6, B:150:0x02e5, B:153:0x02ec, B:155:0x02fb, B:158:0x0302, B:160:0x0310, B:163:0x0317, B:165:0x0325, B:168:0x032c, B:170:0x033a, B:173:0x0341, B:175:0x034f, B:178:0x0356, B:180:0x0364, B:183:0x036b, B:135:0x0378, B:187:0x037c, B:195:0x0107, B:196:0x0110, B:197:0x0121, B:199:0x0132), top: B:34:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2 A[Catch: all -> 0x010c, TryCatch #5 {all -> 0x010c, blocks: (B:35:0x00dd, B:38:0x00eb, B:40:0x00f1, B:48:0x0136, B:50:0x013c, B:51:0x0143, B:53:0x0149, B:54:0x0154, B:56:0x015e, B:58:0x0168, B:65:0x0194, B:67:0x01a9, B:69:0x01b0, B:71:0x01b7, B:72:0x01bc, B:74:0x01c2, B:75:0x01cc, B:77:0x01d2, B:79:0x01d9, B:81:0x01e0, B:82:0x01e5, B:84:0x01eb, B:85:0x01f0, B:87:0x01f6, B:88:0x0203, B:90:0x0209, B:93:0x0219, B:98:0x0221, B:102:0x0228, B:106:0x023a, B:108:0x0240, B:109:0x024d, B:111:0x0253, B:114:0x0263, B:119:0x026b, B:122:0x0272, B:124:0x027f, B:126:0x0285, B:127:0x0294, B:129:0x029c, B:131:0x02a8, B:132:0x02b0, B:136:0x02b5, B:140:0x02bc, B:145:0x02cf, B:148:0x02d6, B:150:0x02e5, B:153:0x02ec, B:155:0x02fb, B:158:0x0302, B:160:0x0310, B:163:0x0317, B:165:0x0325, B:168:0x032c, B:170:0x033a, B:173:0x0341, B:175:0x034f, B:178:0x0356, B:180:0x0364, B:183:0x036b, B:135:0x0378, B:187:0x037c, B:195:0x0107, B:196:0x0110, B:197:0x0121, B:199:0x0132), top: B:34:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01eb A[Catch: all -> 0x010c, TryCatch #5 {all -> 0x010c, blocks: (B:35:0x00dd, B:38:0x00eb, B:40:0x00f1, B:48:0x0136, B:50:0x013c, B:51:0x0143, B:53:0x0149, B:54:0x0154, B:56:0x015e, B:58:0x0168, B:65:0x0194, B:67:0x01a9, B:69:0x01b0, B:71:0x01b7, B:72:0x01bc, B:74:0x01c2, B:75:0x01cc, B:77:0x01d2, B:79:0x01d9, B:81:0x01e0, B:82:0x01e5, B:84:0x01eb, B:85:0x01f0, B:87:0x01f6, B:88:0x0203, B:90:0x0209, B:93:0x0219, B:98:0x0221, B:102:0x0228, B:106:0x023a, B:108:0x0240, B:109:0x024d, B:111:0x0253, B:114:0x0263, B:119:0x026b, B:122:0x0272, B:124:0x027f, B:126:0x0285, B:127:0x0294, B:129:0x029c, B:131:0x02a8, B:132:0x02b0, B:136:0x02b5, B:140:0x02bc, B:145:0x02cf, B:148:0x02d6, B:150:0x02e5, B:153:0x02ec, B:155:0x02fb, B:158:0x0302, B:160:0x0310, B:163:0x0317, B:165:0x0325, B:168:0x032c, B:170:0x033a, B:173:0x0341, B:175:0x034f, B:178:0x0356, B:180:0x0364, B:183:0x036b, B:135:0x0378, B:187:0x037c, B:195:0x0107, B:196:0x0110, B:197:0x0121, B:199:0x0132), top: B:34:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f6 A[Catch: all -> 0x010c, TryCatch #5 {all -> 0x010c, blocks: (B:35:0x00dd, B:38:0x00eb, B:40:0x00f1, B:48:0x0136, B:50:0x013c, B:51:0x0143, B:53:0x0149, B:54:0x0154, B:56:0x015e, B:58:0x0168, B:65:0x0194, B:67:0x01a9, B:69:0x01b0, B:71:0x01b7, B:72:0x01bc, B:74:0x01c2, B:75:0x01cc, B:77:0x01d2, B:79:0x01d9, B:81:0x01e0, B:82:0x01e5, B:84:0x01eb, B:85:0x01f0, B:87:0x01f6, B:88:0x0203, B:90:0x0209, B:93:0x0219, B:98:0x0221, B:102:0x0228, B:106:0x023a, B:108:0x0240, B:109:0x024d, B:111:0x0253, B:114:0x0263, B:119:0x026b, B:122:0x0272, B:124:0x027f, B:126:0x0285, B:127:0x0294, B:129:0x029c, B:131:0x02a8, B:132:0x02b0, B:136:0x02b5, B:140:0x02bc, B:145:0x02cf, B:148:0x02d6, B:150:0x02e5, B:153:0x02ec, B:155:0x02fb, B:158:0x0302, B:160:0x0310, B:163:0x0317, B:165:0x0325, B:168:0x032c, B:170:0x033a, B:173:0x0341, B:175:0x034f, B:178:0x0356, B:180:0x0364, B:183:0x036b, B:135:0x0378, B:187:0x037c, B:195:0x0107, B:196:0x0110, B:197:0x0121, B:199:0x0132), top: B:34:0x00dd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(com.anythink.basead.l.b.b bVar, com.anythink.basead.l.b.b bVar2) {
        String str;
        String str2;
        String str3;
        int i;
        int i4;
        boolean z6;
        String a9;
        char c9;
        try {
            bl aH = this.f10243f.aH();
            bVar.b(bVar, 0);
            bVar.a(bVar, 0);
            bVar.c(bVar, 0);
            String d9 = com.anythink.basead.l.b.b.d(bVar);
            String e9 = com.anythink.basead.l.b.b.e(bVar);
            String c10 = com.anythink.basead.l.b.b.c(bVar);
            String f2 = bVar.f(bVar);
            String b9 = bVar2.b(bVar2);
            bVar2.a(bVar2);
            int j6 = m.j(this.f10242e);
            if (String.valueOf(this.f10244g.f14949j).equals("2") && this.f10243f.aJ() == 3) {
                String D8 = this.f10244g.f14954o.D();
                switch (D8.hashCode()) {
                    case -559799608:
                        if (D8.equals(y.f14965c)) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1507809730:
                        if (D8.equals(y.f14963a)) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1507809854:
                        if (D8.equals(y.f14964b)) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1622564786:
                        if (D8.equals(y.f14966d)) {
                            c9 = 3;
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                if (c9 == 0) {
                    j6 = q.a(this.f10242e, 67.0f);
                } else if (c9 == 1) {
                    j6 = q.a(this.f10242e, 90.0f);
                } else if (c9 == 2) {
                    j6 = q.a(this.f10242e, 300.0f);
                } else if (c9 == 3) {
                    j6 = q.a(this.f10242e, 120.0f);
                }
            }
            String a10 = bVar2.a(bVar2, 0, j6);
            long b10 = e.b(b9);
            int e10 = bVar2.e();
            int f9 = bVar2.f();
            l a11 = com.anythink.basead.l.b.b.a(bVar2.c().a().get(0).a());
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String str4 = "";
                if (a11 == null || com.anythink.basead.l.b.b.a(a11) == null) {
                    str = c10;
                    str2 = "";
                    str3 = str2;
                    i = -1;
                } else {
                    com.anythink.basead.l.b.b.a(a11);
                    int intValue = com.anythink.basead.l.b.b.a(a11).intValue();
                    if (intValue == 1) {
                        this.f10247k = 1;
                        a9 = a11.e().a();
                        if (!TextUtils.isEmpty(a9)) {
                            a9 = a(a9);
                        }
                    } else if (intValue != 2) {
                        if (intValue == 3) {
                            this.f10247k = 3;
                        }
                        a9 = "";
                    } else {
                        this.f10247k = 2;
                        str4 = a11.c().a();
                        a9 = "";
                    }
                    if (a11.f() != null) {
                        a11.f().a();
                    }
                    if (a11.g() != null) {
                        arrayList.add(a11.g().a());
                    }
                    at a12 = com.anythink.basead.l.b.b.a(a11.h());
                    if (a12 != null && e.a((CharSequence) a12.b())) {
                        arrayList2.add(a12.b());
                    }
                    try {
                        i = Integer.parseInt(a11.a());
                    } catch (Throwable unused) {
                        i = -1;
                    }
                    try {
                        i4 = Integer.parseInt(a11.b());
                        str3 = a9;
                        str = c10;
                        str2 = str4;
                    } catch (Throwable unused2) {
                        str3 = a9;
                        str = c10;
                        str2 = str4;
                        i4 = -1;
                        this.f10243f.m(d9);
                        this.f10243f.n(e9);
                        this.f10243f.t(a10);
                        if (b10 > 0) {
                        }
                        if (e10 > 0) {
                        }
                        if (f9 > 0) {
                        }
                        if (!TextUtils.isEmpty(str2)) {
                        }
                        if (!TextUtils.isEmpty(str3)) {
                        }
                        if (!TextUtils.isEmpty(f2)) {
                        }
                        if (bVar.a() != null) {
                        }
                        if (bVar.b() != null) {
                        }
                        if (!TextUtils.isEmpty(str)) {
                        }
                        while (r5 < r3) {
                        }
                        this.f10243f.E();
                        this.f10243f.aI();
                        this.f10243f.z();
                        this.f10243f.x();
                        this.f10243f.H();
                        this.f10243f.ah();
                        return true;
                    }
                    this.f10243f.m(d9);
                    this.f10243f.n(e9);
                    this.f10243f.t(a10);
                    if (b10 > 0) {
                        this.f10243f.a(b10);
                    }
                    if (e10 > 0) {
                        this.f10243f.k(e10);
                    }
                    if (f9 > 0) {
                        this.f10243f.l(f9);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        this.f10243f.p(str2);
                        this.f10243f.q(str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        this.f10243f.f(str3);
                        if (i > 0) {
                            this.f10243f.c(i);
                        }
                        if (i4 > 0) {
                            this.f10243f.d(i4);
                        }
                    }
                    if (!TextUtils.isEmpty(f2)) {
                        this.f10243f.w(f2);
                    }
                    if (bVar.a() != null) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<ah> it = bVar.a().iterator();
                        while (it.hasNext()) {
                            ah next = it.next();
                            if (!TextUtils.isEmpty(next.a())) {
                                arrayList3.add(next.a());
                            }
                        }
                        z6 = false;
                        try {
                            aH.e(a(aH.f(), (String[]) arrayList3.toArray(new String[0])));
                        } catch (Throwable unused3) {
                            return z6;
                        }
                    }
                    if (bVar.b() != null) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator<k> it2 = bVar.b().iterator();
                        while (it2.hasNext()) {
                            k next2 = it2.next();
                            if (!TextUtils.isEmpty(next2.a())) {
                                arrayList4.add(next2.a());
                            }
                        }
                        z6 = false;
                        aH.f(a(aH.g(), (String[]) arrayList4.toArray(new String[0])));
                    }
                    if (!TextUtils.isEmpty(str)) {
                        aH.p(a(aH.T(), new String[]{str}));
                    }
                    for (f.a aVar : f.a.values()) {
                        ArrayList<String> a13 = bVar.a(aVar);
                        if (a13.size() > 0) {
                            switch (AnonymousClass4.f10252a[aVar.ordinal()]) {
                                case 1:
                                    aH.g(a(aH.h(), (String[]) a13.toArray(new String[0])));
                                    break;
                                case 2:
                                    aH.h(a(aH.i(), (String[]) a13.toArray(new String[0])));
                                    break;
                                case 3:
                                    aH.i(a(aH.j(), (String[]) a13.toArray(new String[0])));
                                    break;
                                case 4:
                                    aH.j(a(aH.k(), (String[]) a13.toArray(new String[0])));
                                    break;
                                case 5:
                                    aH.k(a(aH.l(), (String[]) a13.toArray(new String[0])));
                                    break;
                                case 6:
                                    aH.l(a(aH.m(), (String[]) a13.toArray(new String[0])));
                                    break;
                                case 7:
                                    aH.o(a(aH.R(), (String[]) a13.toArray(new String[0])));
                                    break;
                                case 8:
                                    aH.n(a(aH.p(), (String[]) a13.toArray(new String[0])));
                                    break;
                                case 9:
                                    try {
                                        aH.m(a(aH.o(), (String[]) a13.toArray(new String[0])));
                                        break;
                                    } catch (Throwable unused4) {
                                        return false;
                                    }
                            }
                        }
                    }
                    this.f10243f.E();
                    this.f10243f.aI();
                    this.f10243f.z();
                    this.f10243f.x();
                    this.f10243f.H();
                    this.f10243f.ah();
                    return true;
                }
                i4 = -1;
                this.f10243f.m(d9);
                this.f10243f.n(e9);
                this.f10243f.t(a10);
                if (b10 > 0) {
                }
                if (e10 > 0) {
                }
                if (f9 > 0) {
                }
                if (!TextUtils.isEmpty(str2)) {
                }
                if (!TextUtils.isEmpty(str3)) {
                }
                if (!TextUtils.isEmpty(f2)) {
                }
                if (bVar.a() != null) {
                }
                if (bVar.b() != null) {
                }
                if (!TextUtils.isEmpty(str)) {
                }
                while (r5 < r3) {
                }
                this.f10243f.E();
                this.f10243f.aI();
                this.f10243f.z();
                this.f10243f.x();
                this.f10243f.H();
                this.f10243f.ah();
                return true;
            } catch (Throwable unused5) {
                return false;
            }
        } catch (Throwable unused6) {
            return false;
        }
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String replaceAll = q.e(str).replaceAll("<!DOCTYPE html>", "");
            if (replaceAll.contains("<html")) {
                return replaceAll;
            }
            if (replaceAll.startsWith("<body")) {
                return String.format(this.f10241c, replaceAll);
            }
            return String.format(this.f10240b, replaceAll);
        } catch (Throwable unused) {
            return str;
        }
    }

    private static String[] a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        if (strArr2 == null || strArr2.length == 0) {
            return strArr;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static /* synthetic */ void a(d dVar, com.anythink.basead.l.b.a[] aVarArr, JSONArray jSONArray) {
        if (aVarArr == null) {
            a aVar = dVar.f10245h;
            if (aVar != null) {
                aVar.a("-3", "Parsers results are null.");
                return;
            }
            return;
        }
        if (aVarArr.length != 2) {
            a aVar2 = dVar.f10245h;
            if (aVar2 != null) {
                aVar2.a("-3", "2 VAST result parsers are required.");
                return;
            }
            return;
        }
        com.anythink.basead.l.b.a aVar3 = aVarArr[0];
        if (((com.anythink.basead.l.b.b) aVar3) != null) {
            com.anythink.basead.l.b.a aVar4 = aVarArr[1];
            if (((com.anythink.basead.l.b.b) aVar4) != null) {
                boolean a9 = dVar.a((com.anythink.basead.l.b.b) aVar3, (com.anythink.basead.l.b.b) aVar4);
                jSONArray.length();
                a aVar5 = dVar.f10245h;
                if (aVar5 != null) {
                    if (!a9) {
                        aVar5.a("-3", "Do fillAdxOfferFormVast is fail.");
                        return;
                    }
                    if (dVar.f10248l) {
                        com.anythink.core.common.a.a.a().a(dVar.f10242e, dVar.f10244g.f14941a, jSONArray.toString());
                    }
                    dVar.f10245h.a(dVar.f10243f);
                    return;
                }
                return;
            }
        }
        a aVar6 = dVar.f10245h;
        if (aVar6 != null) {
            aVar6.a("-3", "One of parsers is null.");
        }
    }
}
