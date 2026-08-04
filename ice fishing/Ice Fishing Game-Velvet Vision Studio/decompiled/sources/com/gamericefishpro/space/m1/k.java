package com.gamericefishpro.space.m1;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import com.gamericefishpro.space.h2.a1;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.oh.x;
import com.gamericefishpro.space.t.a0;
import com.gamericefishpro.space.t.d0;
import com.gamericefishpro.space.t.p0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements h {
    public final com.gamericefishpro.space.i2.t a;
    public final com.gamericefishpro.space.i2.t b;
    public final e d;
    public a0 f;
    public u h;
    public final u c = new u(2, null, 14);
    public final i e = new i(this);
    public final d0 g = new d0(1);

    public k(com.gamericefishpro.space.i2.t tVar, com.gamericefishpro.space.i2.t tVar2) {
        this.a = tVar;
        this.b = tVar2;
        this.d = new e(this, tVar2);
    }

    public final boolean a(boolean z) {
        a1 a1Var;
        if (f() != null) {
            u uVarF = f();
            h(null);
            if (uVarF != null) {
                uVarF.B0(s.d, s.i);
                if (!uVarF.d.G) {
                    com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                }
                com.gamericefishpro.space.h1.l lVar = uVarF.d.w;
                f0 f0VarS = com.gamericefishpro.space.h2.k.s(uVarF);
                while (f0VarS != null) {
                    if ((f0VarS.Z.f.v & 1024) != 0) {
                        while (lVar != null) {
                            if ((lVar.i & 1024) != 0) {
                                com.gamericefishpro.space.v0.e eVar = null;
                                com.gamericefishpro.space.h1.l lVarE = lVar;
                                while (lVarE != null) {
                                    if (lVarE instanceof u) {
                                        ((u) lVarE).B0(s.e, s.i);
                                    } else if ((lVarE.i & 1024) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                        int i = 0;
                                        for (com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar2 != null; lVar2 = lVar2.y) {
                                            if ((lVar2.i & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    lVarE = lVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                    }
                                                    if (lVarE != null) {
                                                        eVar.b(lVarE);
                                                        lVarE = null;
                                                    }
                                                    eVar.b(lVar2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                                }
                            }
                            lVar = lVar.w;
                        }
                    }
                    f0VarS = f0VarS.v();
                    lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = y3.C(this.c, i).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new com.gamericefishpro.space.oh.k();
            }
            z3 = false;
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        com.gamericefishpro.space.i2.t tVar = this.a;
        if (tVar.isFocused() || tVar.hasFocus()) {
            tVar.clearFocus();
        } else if (tVar.hasFocus()) {
            View viewFindFocus = tVar.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            tVar.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0158 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0166 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x016b  */
    /* JADX WARN: Code duplicated, block: B:310:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x015f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:341:0x014a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0079 A[ADDED_TO_REGION, LOOP:12: B:41:0x0079->B:69:0x00c7, LOOP_START, PHI: r7
      0x0079: PHI (r7v28 com.gamericefishpro.space.h1.l) = (r7v23 com.gamericefishpro.space.h1.l), (r7v29 com.gamericefishpro.space.h1.l) binds: [B:40:0x0077, B:69:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x007b A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x008a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00de A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0101 A[ADDED_TO_REGION, LOOP:16: B:87:0x0101->B:115:0x014f, LOOP_START, PHI: r1
      0x0101: PHI (r1v14 com.gamericefishpro.space.h1.l) = (r1v9 com.gamericefishpro.space.h1.l), (r1v15 com.gamericefishpro.space.h1.l) binds: [B:86:0x00ff, B:115:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0103 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0112 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0118 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016e, B:130:0x0174, B:131:0x0177, B:133:0x0182, B:136:0x018e, B:140:0x0198, B:143:0x019e, B:144:0x01a3, B:164:0x01df, B:145:0x01a7, B:147:0x01ad, B:149:0x01b1, B:151:0x01b9, B:153:0x01bf, B:155:0x01c3, B:157:0x01c9, B:159:0x01d2, B:160:0x01d6, B:161:0x01d9, B:165:0x01e4, B:166:0x01e7, B:168:0x01ed, B:170:0x01f1, B:173:0x01f8, B:175:0x0200, B:179:0x0210, B:180:0x0212, B:182:0x0217, B:184:0x021b, B:204:0x0256, B:185:0x021e, B:187:0x0224, B:189:0x0228, B:191:0x0230, B:193:0x0236, B:195:0x023a, B:197:0x0240, B:199:0x0249, B:200:0x024d, B:201:0x0250, B:205:0x025b, B:209:0x026b, B:211:0x0270, B:213:0x0274, B:236:0x02b8, B:217:0x0280, B:219:0x0286, B:221:0x028a, B:223:0x0292, B:225:0x0298, B:227:0x029c, B:229:0x02a2, B:231:0x02ab, B:232:0x02af, B:233:0x02b2, B:238:0x02bf, B:240:0x02c6, B:245:0x02d9, B:246:0x02db, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00da, B:79:0x00de, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:59:0x00a6, B:61:0x00ac, B:63:0x00b5, B:64:0x00b9, B:65:0x00bc, B:68:0x00c2, B:69:0x00c7, B:70:0x00ca, B:72:0x00d0, B:74:0x00d4, B:80:0x00e4, B:82:0x00ea, B:83:0x00ed, B:85:0x00f7, B:88:0x0103, B:92:0x010d, B:123:0x0162, B:125:0x0166, B:95:0x0112, B:97:0x0118, B:99:0x011c, B:101:0x0124, B:103:0x012a, B:105:0x012e, B:107:0x0134, B:109:0x013d, B:110:0x0141, B:111:0x0144, B:114:0x014a, B:115:0x014f, B:116:0x0152, B:118:0x0158, B:120:0x015c), top: B:251:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r15v9, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r7v38 */
    public final boolean d(KeyEvent keyEvent, Function0 function0) {
        com.gamericefishpro.space.h1.l lVar;
        f0 f0VarS;
        com.gamericefishpro.space.h2.i iVar;
        com.gamericefishpro.space.h2.i iVar2;
        com.gamericefishpro.space.h1.l lVar2;
        a1 a1Var;
        com.gamericefishpro.space.h1.l lVarE;
        com.gamericefishpro.space.v0.e eVar;
        com.gamericefishpro.space.h1.l lVar3;
        f0 f0VarS2;
        com.gamericefishpro.space.h2.i iVar3;
        com.gamericefishpro.space.h2.i iVar4;
        a1 a1Var2;
        com.gamericefishpro.space.v0.e eVar2;
        com.gamericefishpro.space.h1.l lVarE2;
        a1 a1Var3;
        u uVar = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!i(keyEvent)) {
                Trace.endSection();
                return false;
            }
            u uVarV = a4.v(uVar);
            if (uVarV != null) {
                if (!uVarV.d.G) {
                    com.gamericefishpro.space.e2.a.b("visitLocalDescendants called on an unattached node");
                }
                com.gamericefishpro.space.h1.l lVar4 = uVarV.d;
                if ((lVar4.v & 9216) != 0) {
                    lVar2 = null;
                    for (com.gamericefishpro.space.h1.l lVar5 = lVar4.y; lVar5 != null; lVar5 = lVar5.y) {
                        int i = lVar5.i;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            lVar2 = lVar5;
                        }
                    }
                } else {
                    lVar2 = null;
                }
                if (lVar2 == null) {
                    if (uVarV == null) {
                        if (!uVar.d.G) {
                            com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                        }
                        lVar = uVar.d.w;
                        f0VarS = com.gamericefishpro.space.h2.k.s(uVar);
                        loop15: while (true) {
                            if (f0VarS != null) {
                                iVar = null;
                                break;
                            }
                            if ((f0VarS.Z.f.v & 8192) != 0) {
                                while (lVar != null) {
                                    if ((lVar.i & 8192) != 0) {
                                        lVarE = lVar;
                                        eVar = null;
                                        while (lVarE != null) {
                                            if (lVarE instanceof com.gamericefishpro.space.z1.b) {
                                                iVar = lVarE;
                                                break loop15;
                                            }
                                            if ((lVarE.i & 8192) == 0) {
                                            }
                                            lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                                        }
                                    }
                                    lVar = lVar.w;
                                }
                            }
                            f0VarS = f0VarS.v();
                            if (f0VarS != null) {
                            }
                        }
                        iVar2 = (com.gamericefishpro.space.z1.b) iVar;
                        if (iVar2 != null) {
                            lVar2 = ((com.gamericefishpro.space.h1.l) iVar2).d;
                        } else {
                            lVar2 = null;
                        }
                    } else {
                        if (!uVarV.d.G) {
                            com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                        }
                        lVar3 = uVarV.d;
                        f0VarS2 = com.gamericefishpro.space.h2.k.s(uVarV);
                        loop11: while (true) {
                            if (f0VarS2 != null) {
                                iVar3 = null;
                                break;
                            }
                            if ((f0VarS2.Z.f.v & 8192) != 0) {
                                while (lVar3 != null) {
                                    if ((lVar3.i & 8192) != 0) {
                                        eVar2 = null;
                                        lVarE2 = lVar3;
                                        while (lVarE2 != null) {
                                            if (lVarE2 instanceof com.gamericefishpro.space.z1.b) {
                                                iVar3 = lVarE2;
                                                break loop11;
                                            }
                                            if ((lVarE2.i & 8192) == 0) {
                                            }
                                            lVarE2 = com.gamericefishpro.space.h2.k.e(eVar2);
                                        }
                                    }
                                    lVar3 = lVar3.w;
                                }
                            }
                            f0VarS2 = f0VarS2.v();
                            if (f0VarS2 != null) {
                            }
                        }
                        iVar4 = (com.gamericefishpro.space.z1.b) iVar3;
                        if (iVar4 != null) {
                            lVar2 = ((com.gamericefishpro.space.h1.l) iVar4).d;
                        } else {
                            if (!uVar.d.G) {
                                com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                            }
                            lVar = uVar.d.w;
                            f0VarS = com.gamericefishpro.space.h2.k.s(uVar);
                            loop15: while (true) {
                                if (f0VarS != null) {
                                    iVar = null;
                                    break;
                                }
                                if ((f0VarS.Z.f.v & 8192) != 0) {
                                    while (lVar != null) {
                                        if ((lVar.i & 8192) != 0) {
                                            lVarE = lVar;
                                            eVar = null;
                                            while (lVarE != null) {
                                                if (lVarE instanceof com.gamericefishpro.space.z1.b) {
                                                    iVar = lVarE;
                                                    break loop15;
                                                }
                                                if ((lVarE.i & 8192) == 0) {
                                                }
                                                lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                                            }
                                        }
                                        lVar = lVar.w;
                                    }
                                }
                                f0VarS = f0VarS.v();
                                if (f0VarS != null) {
                                }
                            }
                            iVar2 = (com.gamericefishpro.space.z1.b) iVar;
                            if (iVar2 != null) {
                                lVar2 = ((com.gamericefishpro.space.h1.l) iVar2).d;
                            } else {
                                lVar2 = null;
                            }
                        }
                    }
                }
            } else if (uVarV == null) {
                if (!uVar.d.G) {
                    com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                }
                lVar = uVar.d.w;
                f0VarS = com.gamericefishpro.space.h2.k.s(uVar);
                loop15: while (true) {
                    if (f0VarS != null) {
                        iVar = null;
                        break;
                    }
                    if ((f0VarS.Z.f.v & 8192) != 0) {
                        while (lVar != null) {
                            if ((lVar.i & 8192) != 0) {
                                lVarE = lVar;
                                eVar = null;
                                while (lVarE != null) {
                                    if (lVarE instanceof com.gamericefishpro.space.z1.b) {
                                        iVar = lVarE;
                                        break loop15;
                                    }
                                    if ((lVarE.i & 8192) == 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                        com.gamericefishpro.space.h1.l lVar6 = ((com.gamericefishpro.space.h2.j) lVarE).I;
                                        int i2 = 0;
                                        while (lVar6 != null) {
                                            if ((lVar6.i & 8192) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    lVarE = lVarE;
                                                    eVar = eVar;
                                                    eVar = eVar;
                                                    Unit unit = Unit.a;
                                                    lVarE = lVar6;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                    }
                                                    if (lVarE != null) {
                                                        eVar.b(lVarE);
                                                        lVarE = null;
                                                    }
                                                    eVar.b(lVar6);
                                                }
                                            } else {
                                                lVarE = lVarE;
                                                eVar = eVar;
                                            }
                                            lVar6 = lVar6.y;
                                            lVarE = lVarE;
                                            eVar = eVar;
                                        }
                                        if (i2 == 1) {
                                            lVarE = lVarE;
                                            eVar = eVar;
                                        } else {
                                            lVarE = lVarE;
                                            eVar = eVar;
                                        }
                                    }
                                    lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                                }
                            }
                            lVar = lVar.w;
                        }
                    }
                    f0VarS = f0VarS.v();
                    lVar = (f0VarS != null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
                }
                iVar2 = (com.gamericefishpro.space.z1.b) iVar;
                if (iVar2 != null) {
                    lVar2 = ((com.gamericefishpro.space.h1.l) iVar2).d;
                } else {
                    lVar2 = null;
                }
            } else {
                if (!uVarV.d.G) {
                    com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                }
                lVar3 = uVarV.d;
                f0VarS2 = com.gamericefishpro.space.h2.k.s(uVarV);
                loop11: while (true) {
                    if (f0VarS2 != null) {
                        iVar3 = null;
                        break;
                    }
                    if ((f0VarS2.Z.f.v & 8192) != 0) {
                        while (lVar3 != null) {
                            if ((lVar3.i & 8192) != 0) {
                                eVar2 = null;
                                lVarE2 = lVar3;
                                while (lVarE2 != null) {
                                    if (lVarE2 instanceof com.gamericefishpro.space.z1.b) {
                                        iVar3 = lVarE2;
                                        break loop11;
                                    }
                                    if ((lVarE2.i & 8192) == 0 && (lVarE2 instanceof com.gamericefishpro.space.h2.j)) {
                                        com.gamericefishpro.space.h1.l lVar7 = ((com.gamericefishpro.space.h2.j) lVarE2).I;
                                        int i3 = 0;
                                        while (lVar7 != null) {
                                            if ((lVar7.i & 8192) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    lVarE2 = lVarE2;
                                                    eVar2 = eVar2;
                                                    eVar2 = eVar2;
                                                    Unit unit2 = Unit.a;
                                                    lVarE2 = lVar7;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                    }
                                                    if (lVarE2 != null) {
                                                        eVar2.b(lVarE2);
                                                        lVarE2 = null;
                                                    }
                                                    eVar2.b(lVar7);
                                                }
                                            } else {
                                                lVarE2 = lVarE2;
                                                eVar2 = eVar2;
                                            }
                                            lVar7 = lVar7.y;
                                            lVarE2 = lVarE2;
                                            eVar2 = eVar2;
                                        }
                                        if (i3 == 1) {
                                            lVarE2 = lVarE2;
                                            eVar2 = eVar2;
                                        } else {
                                            lVarE2 = lVarE2;
                                            eVar2 = eVar2;
                                        }
                                    }
                                    lVarE2 = com.gamericefishpro.space.h2.k.e(eVar2);
                                }
                            }
                            lVar3 = lVar3.w;
                        }
                    }
                    f0VarS2 = f0VarS2.v();
                    lVar3 = (f0VarS2 != null || (a1Var2 = f0VarS2.Z) == null) ? null : a1Var2.e;
                }
                iVar4 = (com.gamericefishpro.space.z1.b) iVar3;
                if (iVar4 != null) {
                    lVar2 = ((com.gamericefishpro.space.h1.l) iVar4).d;
                } else {
                    if (!uVar.d.G) {
                        com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                    }
                    lVar = uVar.d.w;
                    f0VarS = com.gamericefishpro.space.h2.k.s(uVar);
                    loop15: while (true) {
                        if (f0VarS != null) {
                            iVar = null;
                            break;
                        }
                        if ((f0VarS.Z.f.v & 8192) != 0) {
                            while (lVar != null) {
                                if ((lVar.i & 8192) != 0) {
                                    lVarE = lVar;
                                    eVar = null;
                                    while (lVarE != null) {
                                        if (lVarE instanceof com.gamericefishpro.space.z1.b) {
                                            iVar = lVarE;
                                            break loop15;
                                        }
                                        if ((lVarE.i & 8192) == 0) {
                                        }
                                        lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                                    }
                                }
                                lVar = lVar.w;
                            }
                        }
                        f0VarS = f0VarS.v();
                        if (f0VarS != null) {
                        }
                    }
                    iVar2 = (com.gamericefishpro.space.z1.b) iVar;
                    if (iVar2 != null) {
                        lVar2 = ((com.gamericefishpro.space.h1.l) iVar2).d;
                    } else {
                        lVar2 = null;
                    }
                }
            }
            if (lVar2 != null) {
                if (!lVar2.d.G) {
                    com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                }
                com.gamericefishpro.space.h1.l lVar8 = lVar2.d.w;
                f0 f0VarS3 = com.gamericefishpro.space.h2.k.s(lVar2);
                ArrayList arrayList = null;
                while (f0VarS3 != null) {
                    if ((f0VarS3.Z.f.v & 8192) != 0) {
                        while (lVar8 != null) {
                            if ((lVar8.i & 8192) != 0) {
                                com.gamericefishpro.space.h1.l lVarE3 = lVar8;
                                com.gamericefishpro.space.v0.e eVar3 = null;
                                while (lVarE3 != null) {
                                    if (lVarE3 instanceof com.gamericefishpro.space.z1.b) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(lVarE3);
                                    } else if ((lVarE3.i & 8192) != 0 && (lVarE3 instanceof com.gamericefishpro.space.h2.j)) {
                                        int i4 = 0;
                                        for (com.gamericefishpro.space.h1.l lVar9 = ((com.gamericefishpro.space.h2.j) lVarE3).I; lVar9 != null; lVar9 = lVar9.y) {
                                            if ((lVar9.i & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    Unit unit3 = Unit.a;
                                                    lVarE3 = lVar9;
                                                } else {
                                                    if (eVar3 == null) {
                                                        eVar3 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                    }
                                                    if (lVarE3 != null) {
                                                        eVar3.b(lVarE3);
                                                        lVarE3 = null;
                                                    }
                                                    eVar3.b(lVar9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    lVarE3 = com.gamericefishpro.space.h2.k.e(eVar3);
                                }
                            }
                            lVar8 = lVar8.w;
                        }
                    }
                    f0VarS3 = f0VarS3.v();
                    lVar8 = (f0VarS3 == null || (a1Var3 = f0VarS3.Z) == null) ? null : a1Var3.e;
                }
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i5 = size - 1;
                            ((com.gamericefishpro.space.z1.b) arrayList.get(size)).getClass();
                            if (i5 < 0) {
                                break;
                            }
                            size = i5;
                        }
                    }
                    Unit unit4 = Unit.a;
                }
                ?? E = lVar2.d;
                ?? eVar4 = 0;
                while (E != 0) {
                    if (E instanceof com.gamericefishpro.space.z1.b) {
                    } else if ((E.i & 8192) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                        com.gamericefishpro.space.h1.l lVar10 = ((com.gamericefishpro.space.h2.j) E).I;
                        int i6 = 0;
                        while (lVar10 != null) {
                            if ((lVar10.i & 8192) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    E = E;
                                    eVar4 = eVar4;
                                    eVar4 = eVar4;
                                    Unit unit5 = Unit.a;
                                    E = lVar10;
                                } else {
                                    if (eVar4 == 0) {
                                        eVar4 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                    }
                                    if (E != 0) {
                                        eVar4.b(E);
                                        E = 0;
                                    }
                                    eVar4.b(lVar10);
                                }
                            } else {
                                E = E;
                                eVar4 = eVar4;
                            }
                            lVar10 = lVar10.y;
                            E = E;
                            eVar4 = eVar4;
                        }
                        if (i6 == 1) {
                            E = E;
                            eVar4 = eVar4;
                        } else {
                            E = E;
                            eVar4 = eVar4;
                        }
                    }
                    E = com.gamericefishpro.space.h2.k.e(eVar4);
                }
                if (((Boolean) function0.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? E2 = lVar2.d;
                ?? eVar5 = 0;
                while (E2 != 0) {
                    if (E2 instanceof com.gamericefishpro.space.z1.b) {
                        if (((com.gamericefishpro.space.z1.b) E2).P(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((E2.i & 8192) != 0 && (E2 instanceof com.gamericefishpro.space.h2.j)) {
                        com.gamericefishpro.space.h1.l lVar11 = ((com.gamericefishpro.space.h2.j) E2).I;
                        int i7 = 0;
                        while (lVar11 != null) {
                            if ((lVar11.i & 8192) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    eVar5 = eVar5;
                                    E2 = E2;
                                    eVar5 = eVar5;
                                    Unit unit6 = Unit.a;
                                    E2 = lVar11;
                                } else {
                                    if (eVar5 == 0) {
                                        eVar5 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                    }
                                    if (E2 != 0) {
                                        eVar5.b(E2);
                                        E2 = 0;
                                    }
                                    eVar5.b(lVar11);
                                }
                            } else {
                                eVar5 = eVar5;
                                E2 = E2;
                            }
                            lVar11 = lVar11.y;
                            eVar5 = eVar5;
                            E2 = E2;
                        }
                        if (i7 == 1) {
                            eVar5 = eVar5;
                            E2 = E2;
                        } else {
                            eVar5 = eVar5;
                            E2 = E2;
                        }
                    }
                    E2 = com.gamericefishpro.space.h2.k.e(eVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((com.gamericefishpro.space.z1.b) arrayList.get(i8)).P(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                    Unit unit7 = Unit.a;
                }
                Unit unit8 = Unit.a;
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [com.gamericefishpro.space.ei.l, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v20, types: [com.gamericefishpro.space.ei.l, kotlin.jvm.functions.Function1] */
    public final Boolean e(int i, com.gamericefishpro.space.n1.c cVar, Function1 function1) {
        boolean zL;
        u uVar;
        a1 a1Var;
        u uVar2 = this.c;
        u uVarV = a4.v(uVar2);
        int i2 = 4;
        com.gamericefishpro.space.i2.t tVar = this.b;
        boolean zBooleanValue = false;
        if (uVarV != null) {
            com.gamericefishpro.space.c3.l layoutDirection = tVar.getLayoutDirection();
            o oVarC0 = uVarV.C0();
            q qVar = oVarC0.h;
            q qVar2 = oVarC0.i;
            if (i == 1) {
                qVar = oVarC0.b;
            } else if (i == 2) {
                qVar = oVarC0.c;
            } else if (i == 5) {
                qVar = oVarC0.d;
            } else if (i == 6) {
                qVar = oVarC0.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new com.gamericefishpro.space.oh.k();
                    }
                    qVar = qVar2;
                }
                if (qVar == q.b) {
                    qVar = null;
                }
                if (qVar == null) {
                    qVar = oVarC0.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    qVar = qVar2;
                } else if (iOrdinal2 != 1) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                if (qVar == q.b) {
                    qVar = null;
                }
                if (qVar == null) {
                    qVar = oVarC0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                a aVar = new a(i);
                k kVar = (k) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t(uVarV)).getFocusOwner();
                u uVarF = kVar.f();
                if (i == 7) {
                    oVarC0.j.invoke(aVar);
                } else {
                    oVarC0.k.invoke(aVar);
                }
                qVar = aVar.b ? q.c : uVarF != kVar.f() ? q.d : q.b;
            }
            q qVar3 = q.c;
            if (!Intrinsics.a(qVar, qVar3)) {
                if (Intrinsics.a(qVar, q.d)) {
                    u uVarV2 = a4.v(uVar2);
                    if (uVarV2 != null) {
                        return (Boolean) function1.invoke(uVarV2);
                    }
                } else {
                    q qVar4 = q.b;
                    if (!Intrinsics.a(qVar, qVar4)) {
                        if (qVar == qVar4) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        if (qVar == qVar3) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        com.gamericefishpro.space.v0.e eVar = qVar.a;
                        int i3 = eVar.i;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = eVar.d;
                            boolean z = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                com.gamericefishpro.space.h2.b bVar = (com.gamericefishpro.space.h2.b) objArr[i4];
                                if (!bVar.d.G) {
                                    com.gamericefishpro.space.e2.a.b("visitChildren called on an unattached node");
                                }
                                com.gamericefishpro.space.v0.e eVar2 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                com.gamericefishpro.space.h1.l lVar = bVar.d;
                                com.gamericefishpro.space.h1.l lVar2 = lVar.y;
                                if (lVar2 == null) {
                                    com.gamericefishpro.space.h2.k.b(eVar2, lVar);
                                } else {
                                    eVar2.b(lVar2);
                                }
                                while (true) {
                                    int i5 = eVar2.i;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    com.gamericefishpro.space.h1.l lVarE = (com.gamericefishpro.space.h1.l) eVar2.l(i5 - 1);
                                    if ((lVarE.v & 1024) == 0) {
                                        com.gamericefishpro.space.h2.k.b(eVar2, lVarE);
                                    } else {
                                        while (lVarE != null) {
                                            if ((lVarE.i & 1024) != 0) {
                                                com.gamericefishpro.space.v0.e eVar3 = null;
                                                while (lVarE != null) {
                                                    if (lVarE instanceof u) {
                                                        if (((Boolean) function1.invoke((u) lVarE)).booleanValue()) {
                                                            z = true;
                                                            break;
                                                        }
                                                    } else if ((lVarE.i & 1024) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                                        int i6 = 0;
                                                        for (com.gamericefishpro.space.h1.l lVar3 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar3 != null; lVar3 = lVar3.y) {
                                                            if ((lVar3.i & 1024) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    lVarE = lVar3;
                                                                } else {
                                                                    if (eVar3 == null) {
                                                                        eVar3 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                                    }
                                                                    if (lVarE != null) {
                                                                        eVar3.b(lVarE);
                                                                        lVarE = null;
                                                                    }
                                                                    eVar3.b(lVar3);
                                                                }
                                                            }
                                                        }
                                                        if (i6 == 1) {
                                                        }
                                                    }
                                                    lVarE = com.gamericefishpro.space.h2.k.e(eVar3);
                                                }
                                                break;
                                            }
                                            lVarE = lVarE.y;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        uVarV = null;
        com.gamericefishpro.space.c3.l layoutDirection2 = tVar.getLayoutDirection();
        com.gamericefishpro.space.f3.f fVar = new com.gamericefishpro.space.f3.f(uVarV, this, function1);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zL = com.gamericefishpro.space.i.a.s(uVar2, fVar);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zL = com.gamericefishpro.space.i.a.l(uVar2, fVar);
            }
            return Boolean.valueOf(zL);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return d5.a0(i, fVar, uVar2, cVar);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                i2 = 3;
            }
            u uVarV3 = a4.v(uVar2);
            if (uVarV3 != null) {
                return d5.a0(i2, fVar, uVarV3, cVar);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) c.a(i))).toString());
        }
        u uVarV4 = a4.v(uVar2);
        if (uVarV4 == null) {
            uVar = null;
            break;
        }
        if (!uVarV4.d.G) {
            com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
        }
        com.gamericefishpro.space.h1.l lVar4 = uVarV4.d.w;
        f0 f0VarS = com.gamericefishpro.space.h2.k.s(uVarV4);
        loop5: while (true) {
            if (f0VarS == null) {
                uVar = null;
                break;
            }
            if ((f0VarS.Z.f.v & 1024) != 0) {
                while (lVar4 != null) {
                    if ((lVar4.i & 1024) != 0) {
                        com.gamericefishpro.space.h1.l lVarE2 = lVar4;
                        com.gamericefishpro.space.v0.e eVar4 = null;
                        while (lVarE2 != null) {
                            if (lVarE2 instanceof u) {
                                u uVar3 = (u) lVarE2;
                                if (uVar3.C0().a) {
                                    uVar = uVar3;
                                    break loop5;
                                }
                            } else if ((lVarE2.i & 1024) != 0 && (lVarE2 instanceof com.gamericefishpro.space.h2.j)) {
                                int i7 = 0;
                                for (com.gamericefishpro.space.h1.l lVar5 = ((com.gamericefishpro.space.h2.j) lVarE2).I; lVar5 != null; lVar5 = lVar5.y) {
                                    if ((lVar5.i & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            lVarE2 = lVar5;
                                        } else {
                                            if (eVar4 == null) {
                                                eVar4 = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                            }
                                            if (lVarE2 != null) {
                                                eVar4.b(lVarE2);
                                                lVarE2 = null;
                                            }
                                            eVar4.b(lVar5);
                                        }
                                    }
                                }
                                if (i7 != 1) {
                                    lVarE2 = com.gamericefishpro.space.h2.k.e(eVar4);
                                }
                            }
                            lVarE2 = com.gamericefishpro.space.h2.k.e(eVar4);
                        }
                    }
                    lVar4 = lVar4.w;
                }
            }
            f0VarS = f0VarS.v();
            lVar4 = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
        }
        if (uVar != null && !uVar.equals(uVar2)) {
            zBooleanValue = ((Boolean) fVar.invoke(uVar)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final u f() {
        u uVar = this.h;
        if (uVar == null || !uVar.G) {
            return null;
        }
        return uVar;
    }

    public final boolean g(int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean boolE = e(i, null, new com.gamericefishpro.space.i2.q(i, 2));
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    public final void h(u uVar) {
        u uVar2 = this.h;
        this.h = uVar;
        d0 d0Var = this.g;
        Object[] objArr = d0Var.a;
        int i = d0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((f) objArr[i2]).a(uVar2, uVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    public final boolean i(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        boolean z;
        long j;
        int iNumberOfTrailingZeros2;
        int i;
        long[] jArr;
        int i2;
        long jH = com.gamericefishpro.space.i.a.h(keyEvent.getKeyCode());
        int iD = a4.D(keyEvent);
        int i3 = -862048943;
        long j2 = 0;
        int i4 = 8;
        int i5 = 0;
        boolean z2 = true;
        if (iD != 2) {
            if (iD != 1) {
                return true;
            }
            a0 a0Var = this.f;
            if (a0Var == null || !a0Var.a(jH)) {
                return false;
            }
            a0 a0Var2 = this.f;
            if (a0Var2 != null) {
                int iHashCode = Long.hashCode(jH) * (-862048943);
                int i6 = iHashCode ^ (iHashCode << 16);
                int i7 = i6 & 127;
                int i8 = a0Var2.c;
                int i9 = i6 >>> 7;
                loop5: while (true) {
                    int i10 = i9 & i8;
                    long[] jArr2 = a0Var2.a;
                    int i11 = i10 >> 3;
                    int i12 = (i10 & 7) << 3;
                    long j3 = ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr2[i11] >>> i12);
                    long j4 = (((long) i7) * 72340172838076673L) ^ j3;
                    for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i10) & i8;
                        if (a0Var2.b[iNumberOfTrailingZeros] == jH) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i5 += 8;
                    i9 = i10 + i5;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    a0Var2.d--;
                    long[] jArr3 = a0Var2.a;
                    int i13 = a0Var2.c;
                    int i14 = iNumberOfTrailingZeros >> 3;
                    int i15 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr3[i14] & (~(255 << i15))) | (254 << i15);
                    jArr3[i14] = j6;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i13) + (i13 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        a0 a0Var3 = this.f;
        if (a0Var3 == null) {
            a0Var3 = new a0(3);
            this.f = a0Var3;
        }
        a0 a0Var4 = a0Var3;
        int iHashCode2 = Long.hashCode(jH) * (-862048943);
        int i16 = iHashCode2 ^ (iHashCode2 << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = a0Var4.c;
        int i20 = i17 & i19;
        int i21 = 0;
        loop0: while (true) {
            long[] jArr4 = a0Var4.a;
            int i22 = i20 >> 3;
            int i23 = i3;
            int i24 = (i20 & 7) << 3;
            long j7 = (jArr4[i22] >>> i24) | ((jArr4[i22 + 1] << (64 - i24)) & ((-i24) >> 63));
            long j8 = i18;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != j2) {
                iNumberOfTrailingZeros2 = (i20 + (Long.numberOfTrailingZeros(j10) >> 3)) & i19;
                long j11 = j2;
                if (a0Var4.b[iNumberOfTrailingZeros2] == jH) {
                    z = true;
                    break loop0;
                }
                j10 &= j10 - 1;
                j2 = j11;
            }
            long j12 = j2;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != j12) {
                int iB = a0Var4.b(i17);
                if (a0Var4.e != 0 || ((a0Var4.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    z = true;
                    j = 128;
                } else {
                    int i25 = a0Var4.c;
                    if (i25 > i4) {
                        long j13 = a0Var4.d;
                        com.gamericefishpro.space.oh.w wVar = x.d;
                        long j14 = 128;
                        if (Long.compareUnsigned(j13 * 32, ((long) i25) * 25) <= 0) {
                            long[] jArr5 = a0Var4.a;
                            int i26 = a0Var4.c;
                            long[] jArr6 = a0Var4.b;
                            int i27 = (i26 + 7) >> 3;
                            int i28 = 0;
                            while (i28 < i27) {
                                int i29 = i4;
                                long j15 = jArr5[i28] & (-9187201950435737472L);
                                jArr5[i28] = (-72340172838076674L) & ((~j15) + (j15 >>> 7));
                                i28++;
                                i4 = i29;
                                j14 = j14;
                                i17 = i17;
                            }
                            i = i17;
                            j = j14;
                            int iS = com.gamericefishpro.space.ph.v.s(jArr5);
                            int i30 = iS - 1;
                            jArr5[i30] = (jArr5[i30] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[iS] = jArr5[0];
                            int i31 = 0;
                            while (i31 != i26) {
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                long j16 = (jArr5[i32] >> i33) & 255;
                                if (j16 != j && j16 == 254) {
                                    int iHashCode3 = Long.hashCode(jArr6[i31]) * i23;
                                    int i34 = iHashCode3 ^ (iHashCode3 << 16);
                                    int i35 = i34 >>> 7;
                                    int iB2 = a0Var4.b(i35);
                                    int i36 = i35 & i26;
                                    boolean z3 = z2;
                                    int i37 = i31;
                                    if (((iB2 - i36) & i26) / 8 == ((i31 - i36) & i26) / 8) {
                                        jArr5[i32] = (jArr5[i32] & (~(255 << i33))) | (((long) (i34 & 127)) << i33);
                                        Intrinsics.checkNotNullParameter(jArr5, "<this>");
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i31 = i37 + 1;
                                    } else {
                                        int i38 = iB2 >> 3;
                                        long j17 = jArr5[i38];
                                        int i39 = (iB2 & 7) << 3;
                                        if (((j17 >> i39) & 255) == j) {
                                            jArr5[i38] = (j17 & (~(255 << i39))) | (((long) (i34 & 127)) << i39);
                                            jArr5[i32] = (jArr5[i32] & (~(255 << i33))) | (j << i33);
                                            jArr6[iB2] = jArr6[i37];
                                            jArr6[i37] = j12;
                                            i2 = i37;
                                        } else {
                                            jArr5[i38] = (((long) (i34 & 127)) << i39) | (j17 & (~(255 << i39)));
                                            long j18 = jArr6[iB2];
                                            jArr6[iB2] = jArr6[i37];
                                            jArr6[i37] = j18;
                                            i2 = i37 - 1;
                                        }
                                        Intrinsics.checkNotNullParameter(jArr5, "<this>");
                                        jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i31 = i2 + 1;
                                    }
                                    z2 = z3;
                                } else {
                                    i31++;
                                }
                            }
                            z = z2;
                            a0Var4.e = p0.a(a0Var4.c) - a0Var4.d;
                        } else {
                            j = 128;
                        }
                        iB = a0Var4.b(i);
                    } else {
                        j = 128;
                    }
                    i = i17;
                    z = true;
                    int iB3 = p0.b(a0Var4.c);
                    long[] jArr7 = a0Var4.a;
                    long[] jArr8 = a0Var4.b;
                    int i40 = a0Var4.c;
                    a0Var4.c(iB3);
                    long[] jArr9 = a0Var4.a;
                    long[] jArr10 = a0Var4.b;
                    int i41 = a0Var4.c;
                    int i42 = 0;
                    while (i42 < i40) {
                        if (((jArr7[i42 >> 3] >> ((i42 & 7) << 3)) & 255) < j) {
                            long j19 = jArr8[i42];
                            int iHashCode4 = Long.hashCode(j19) * i23;
                            int i43 = iHashCode4 ^ (iHashCode4 << 16);
                            jArr = jArr9;
                            int iB4 = a0Var4.b(i43 >>> 7);
                            long j20 = i43 & 127;
                            int i44 = iB4 >> 3;
                            int i45 = (iB4 & 7) << 3;
                            long j21 = (jArr[i44] & (~(255 << i45))) | (j20 << i45);
                            jArr[i44] = j21;
                            jArr[(((iB4 - 7) & i41) + (i41 & 7)) >> 3] = j21;
                            jArr10[iB4] = j19;
                        } else {
                            jArr = jArr9;
                        }
                        i42++;
                        jArr9 = jArr;
                        jArr7 = jArr7;
                        jArr8 = jArr8;
                    }
                    iB = a0Var4.b(i);
                }
                iNumberOfTrailingZeros2 = iB;
                a0Var4.d++;
                int i46 = a0Var4.e;
                long[] jArr11 = a0Var4.a;
                int i47 = iNumberOfTrailingZeros2 >> 3;
                long j22 = jArr11[i47];
                int i48 = (iNumberOfTrailingZeros2 & 7) << 3;
                a0Var4.e = i46 - (((j22 >> i48) & 255) == j ? z : 0);
                int i49 = a0Var4.c;
                long j23 = (j22 & (~(255 << i48))) | (j8 << i48);
                jArr11[i47] = j23;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i49) + (i49 & 7)) >> 3] = j23;
                break;
            }
            i21 += 8;
            i20 = (i20 + i21) & i19;
            i4 = i4;
            i3 = i23;
            j2 = j12;
        }
        a0Var4.b[iNumberOfTrailingZeros2] = jH;
        return z;
    }
}
