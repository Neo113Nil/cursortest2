package com.gamericefishpro.space.n9;

import android.util.Log;
import com.gamericefishpro.space.i9.g5;
import com.gamericefishpro.space.i9.w7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ c h;
    public final g5 i;

    public b(c cVar, String str, int i, g5 g5Var, int i2) {
        this.g = i2;
        this.h = cVar;
        this.a = str;
        this.b = i;
        this.i = g5Var;
    }

    public static Boolean c(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, com.gamericefishpro.space.i9.v1 v1Var, v0 v0Var) {
        List listU;
        com.gamericefishpro.space.v8.c0.g(v1Var);
        if (str != null && v1Var.p() && v1Var.x() != 1 && (v1Var.x() != 7 ? v1Var.q() : v1Var.v() != 0)) {
            int iX = v1Var.x();
            boolean zT = v1Var.t();
            String strR = (zT || iX == 2 || iX == 7) ? v1Var.r() : v1Var.r().toUpperCase(Locale.ENGLISH);
            if (v1Var.v() == 0) {
                listU = null;
            } else {
                listU = v1Var.u();
                if (!zT) {
                    ArrayList arrayList = new ArrayList(listU.size());
                    Iterator it = listU.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listU = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iX == 2 ? strR : null;
            if (iX != 7 ? strR != null : listU != null && !listU.isEmpty()) {
                if (!zT && iX != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iX - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zT ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (v0Var != null) {
                                    v0Var.B.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strR));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strR));
                    case 4:
                        return Boolean.valueOf(str.contains(strR));
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        return Boolean.valueOf(str.equals(strR));
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (listU != null) {
                            return Boolean.valueOf(listU.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0111  */
    public static Boolean e(BigDecimal bigDecimal, com.gamericefishpro.space.i9.s1 s1Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i;
        com.gamericefishpro.space.v8.c0.g(s1Var);
        if (s1Var.p()) {
            if (s1Var.z() != 1 && (s1Var.z() != 5 ? s1Var.s() : s1Var.u() && s1Var.w())) {
                int iZ = s1Var.z();
                try {
                    if (s1Var.z() == 5) {
                        if (z0.X(s1Var.v()) && z0.X(s1Var.x())) {
                            BigDecimal bigDecimal5 = new BigDecimal(s1Var.v());
                            bigDecimal4 = new BigDecimal(s1Var.x());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iZ == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i = iZ - 1;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (z0.X(s1Var.t())) {
                        bigDecimal2 = new BigDecimal(s1Var.t());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iZ == 5) {
                            i = iZ - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i = iZ - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x035f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x039f A[EDGE_INSN: B:158:0x039f->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2 A[EDGE_INSN: B:159:0x03b2->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:199:0x0343 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac A[LOOP:1: B:59:0x0189->B:64:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean a(Long l, Long l2, com.gamericefishpro.space.i9.a3 a3Var, long j, r rVar, boolean z) {
        HashSet hashSet;
        Iterator it;
        com.gamericefishpro.space.t.e eVar;
        Iterator it2;
        Iterator it3;
        com.gamericefishpro.space.i9.p1 p1Var;
        boolean z2;
        String strW;
        Object obj;
        Boolean boolE;
        Boolean boolE2;
        String str;
        com.gamericefishpro.space.i9.s1 s1VarS;
        long j2;
        Boolean boolE3;
        com.gamericefishpro.space.i9.d3 d3Var;
        Long lValueOf;
        Double dValueOf;
        com.gamericefishpro.space.i9.p1 p1Var2;
        Boolean boolE4;
        int i;
        w7.a();
        c cVar = this.h;
        r1 r1Var = (r1) cVar.d;
        g gVar = r1Var.v;
        v0 v0Var = r1Var.y;
        p0 p0Var = r1Var.C;
        d0 d0Var = e0.F0;
        String str2 = this.a;
        boolean zB = gVar.B(str2, d0Var);
        com.gamericefishpro.space.i9.n1 n1Var = (com.gamericefishpro.space.i9.n1) this.i;
        long j3 = n1Var.A() ? rVar.e : j;
        r1.l(v0Var);
        t0 t0Var = v0Var.G;
        t0 t0Var2 = v0Var.B;
        boolean zIsLoggable = Log.isLoggable(v0Var.B(), 2);
        int i2 = this.b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            r1.l(v0Var);
            t0Var.d("Evaluating filter. audience, filter, event", Integer.valueOf(i2), n1Var.p() ? Integer.valueOf(n1Var.q()) : null, p0Var.a(n1Var.r()));
            r1.l(v0Var);
            z0 z0Var = cVar.e.z;
            m4.T(z0Var);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (n1Var.p()) {
                i = 0;
                z0.J(sb, 0, "filter_id", Integer.valueOf(n1Var.q()));
            } else {
                i = 0;
            }
            z0.J(sb, i, "event_name", ((r1) z0Var.d).C.a(n1Var.r()));
            String strF = z0.F(n1Var.x(), n1Var.y(), n1Var.A());
            if (!strF.isEmpty()) {
                z0.J(sb, 0, "filter_type", strF);
            }
            if (n1Var.v()) {
                z0.K(sb, 1, "event_count_filter", n1Var.w());
            }
            if (n1Var.t() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = n1Var.s().iterator();
                while (it4.hasNext()) {
                    z0Var.C(sb, 2, (com.gamericefishpro.space.i9.p1) it4.next());
                }
            }
            z0.D(1, sb);
            sb.append("}\n}\n");
            t0Var.b(sb.toString(), "Filter definition");
        }
        if (!n1Var.p() || n1Var.q() > 256) {
            r1.l(v0Var);
            t0Var2.c("Invalid event filter ID. appId, id", v0.z(str2), String.valueOf(n1Var.p() ? Integer.valueOf(n1Var.q()) : null));
            return false;
        }
        boolean z3 = n1Var.x() || n1Var.y() || n1Var.A();
        if (z && !z3) {
            r1.l(v0Var);
            t0Var.c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i2), n1Var.p() ? Integer.valueOf(n1Var.q()) : null);
            return true;
        }
        String strS = a3Var.s();
        if (!n1Var.v()) {
            hashSet = new HashSet();
            it = n1Var.s().iterator();
            while (true) {
                if (it.hasNext()) {
                    eVar = new com.gamericefishpro.space.t.e(0);
                    it2 = a3Var.p().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = n1Var.s().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zB = zB;
                                    v0Var = v0Var;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                p1Var = (com.gamericefishpro.space.i9.p1) it3.next();
                                if (p1Var.t()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strW = p1Var.w();
                                if (strW.isEmpty()) {
                                    obj = eVar.get(strW);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zB = zB;
                                                v0Var = v0Var;
                                                if (obj == null) {
                                                    r1.l(v0Var);
                                                    t0Var2.c("Unknown param type. event, param", p0Var.a(strS), p0Var.b(strW));
                                                    break;
                                                }
                                                r1.l(v0Var);
                                                t0Var.c("Missing param for filter. event, param", p0Var.a(strS), p0Var.b(strW));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (p1Var.p()) {
                                                if (p1Var.r()) {
                                                    zB = zB;
                                                    v0Var = v0Var;
                                                    r1.l(v0Var);
                                                    t0Var2.c("No filter for String param. event, param", p0Var.a(strS), p0Var.b(strW));
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (z0.X(str)) {
                                                    zB = zB;
                                                    v0Var = v0Var;
                                                    r1.l(v0Var);
                                                    t0Var2.c("Invalid param value for number filter. event, param", p0Var.a(strS), p0Var.b(strW));
                                                    break;
                                                }
                                                s1VarS = p1Var.s();
                                                if (z0.X(str)) {
                                                    zB = zB;
                                                    v0Var = v0Var;
                                                    j2 = 0;
                                                    boolE3 = e(new BigDecimal(str), s1VarS, 0.0d);
                                                } else {
                                                    boolE3 = null;
                                                }
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                v0Var = v0Var;
                                                zB = zB;
                                            } else {
                                                com.gamericefishpro.space.i9.v1 v1VarQ = p1Var.q();
                                                r1.l(v0Var);
                                                boolE3 = d((String) obj, v1VarQ, v0Var);
                                            }
                                            j2 = 0;
                                            if (boolE3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolE3.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            v0Var = v0Var;
                                            zB = zB;
                                        } else if (p1Var.r()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolE2 = e(new BigDecimal(dDoubleValue), p1Var.s(), Math.ulp(dDoubleValue));
                                            if (boolE2 != null) {
                                                if (boolE2.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            r1.l(v0Var);
                                            t0Var2.c("No number filter for double param. event, param", p0Var.a(strS), p0Var.b(strW));
                                        }
                                    } else if (p1Var.r()) {
                                        boolE = e(new BigDecimal(((Long) obj).longValue()), p1Var.s(), 0.0d);
                                        if (boolE != null) {
                                            if (boolE.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        r1.l(v0Var);
                                        t0Var2.c("No number filter for long param. event, param", p0Var.a(strS), p0Var.b(strW));
                                    }
                                } else {
                                    r1.l(v0Var);
                                    t0Var2.b(p0Var.a(strS), "Event has empty param name. event");
                                }
                            }
                        } else {
                            d3Var = (com.gamericefishpro.space.i9.d3) it2.next();
                            if (!hashSet.contains(d3Var.q())) {
                                if (d3Var.t()) {
                                    String strQ = d3Var.q();
                                    if (d3Var.t()) {
                                        lValueOf = Long.valueOf(d3Var.u());
                                    } else {
                                        lValueOf = null;
                                    }
                                    eVar.put(strQ, lValueOf);
                                } else if (d3Var.x()) {
                                    String strQ2 = d3Var.q();
                                    if (d3Var.x()) {
                                        dValueOf = Double.valueOf(d3Var.y());
                                    } else {
                                        dValueOf = null;
                                    }
                                    eVar.put(strQ2, dValueOf);
                                } else if (d3Var.r()) {
                                    eVar.put(d3Var.q(), d3Var.s());
                                } else {
                                    r1.l(v0Var);
                                    t0Var2.c("Unknown value for param. event, param", p0Var.a(strS), p0Var.b(d3Var.q()));
                                }
                            }
                        }
                    }
                } else {
                    p1Var2 = (com.gamericefishpro.space.i9.p1) it.next();
                    if (p1Var2.w().isEmpty()) {
                        r1.l(v0Var);
                        t0Var2.b(p0Var.a(strS), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(p1Var2.w());
                    }
                }
                zB = zB;
                v0Var = v0Var;
                break;
            }
        }
        try {
            boolE4 = e(new BigDecimal(j3), n1Var.w(), 0.0d);
        } catch (NumberFormatException unused) {
            boolE4 = null;
        }
        if (boolE4 != null) {
            if (boolE4.booleanValue()) {
                hashSet = new HashSet();
                it = n1Var.s().iterator();
                while (true) {
                    if (it.hasNext()) {
                        eVar = new com.gamericefishpro.space.t.e(0);
                        it2 = a3Var.p().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = n1Var.s().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zB = zB;
                                        v0Var = v0Var;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    p1Var = (com.gamericefishpro.space.i9.p1) it3.next();
                                    if (p1Var.t() || !p1Var.u()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    strW = p1Var.w();
                                    if (strW.isEmpty()) {
                                        obj = eVar.get(strW);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zB = zB;
                                                    v0Var = v0Var;
                                                    if (obj == null) {
                                                        r1.l(v0Var);
                                                        t0Var2.c("Unknown param type. event, param", p0Var.a(strS), p0Var.b(strW));
                                                        break;
                                                    }
                                                    r1.l(v0Var);
                                                    t0Var.c("Missing param for filter. event, param", p0Var.a(strS), p0Var.b(strW));
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (p1Var.p()) {
                                                    if (p1Var.r()) {
                                                        zB = zB;
                                                        v0Var = v0Var;
                                                        r1.l(v0Var);
                                                        t0Var2.c("No filter for String param. event, param", p0Var.a(strS), p0Var.b(strW));
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (z0.X(str)) {
                                                        zB = zB;
                                                        v0Var = v0Var;
                                                        r1.l(v0Var);
                                                        t0Var2.c("Invalid param value for number filter. event, param", p0Var.a(strS), p0Var.b(strW));
                                                        break;
                                                    }
                                                    s1VarS = p1Var.s();
                                                    if (z0.X(str)) {
                                                        boolE3 = null;
                                                    } else {
                                                        try {
                                                            zB = zB;
                                                            v0Var = v0Var;
                                                            j2 = 0;
                                                            try {
                                                                boolE3 = e(new BigDecimal(str), s1VarS, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolE3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zB = zB;
                                                            v0Var = v0Var;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (boolE3 != null) {
                                                        break;
                                                    }
                                                    if (boolE3.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    v0Var = v0Var;
                                                    zB = zB;
                                                } else {
                                                    com.gamericefishpro.space.i9.v1 v1VarQ2 = p1Var.q();
                                                    r1.l(v0Var);
                                                    boolE3 = d((String) obj, v1VarQ2, v0Var);
                                                }
                                                j2 = 0;
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                v0Var = v0Var;
                                                zB = zB;
                                            } else if (p1Var.r()) {
                                                r1.l(v0Var);
                                                t0Var2.c("No number filter for double param. event, param", p0Var.a(strS), p0Var.b(strW));
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolE2 = e(new BigDecimal(dDoubleValue2), p1Var.s(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolE2 = null;
                                                }
                                                if (boolE2 != null) {
                                                    if (boolE2.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (p1Var.r()) {
                                            r1.l(v0Var);
                                            t0Var2.c("No number filter for long param. event, param", p0Var.a(strS), p0Var.b(strW));
                                        } else {
                                            try {
                                                boolE = e(new BigDecimal(((Long) obj).longValue()), p1Var.s(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolE = null;
                                            }
                                            if (boolE != null) {
                                                if (boolE.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        r1.l(v0Var);
                                        t0Var2.b(p0Var.a(strS), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                d3Var = (com.gamericefishpro.space.i9.d3) it2.next();
                                if (!hashSet.contains(d3Var.q())) {
                                    if (d3Var.t()) {
                                        String strQ3 = d3Var.q();
                                        if (d3Var.t()) {
                                            lValueOf = Long.valueOf(d3Var.u());
                                        } else {
                                            lValueOf = null;
                                        }
                                        eVar.put(strQ3, lValueOf);
                                    } else if (d3Var.x()) {
                                        String strQ4 = d3Var.q();
                                        if (d3Var.x()) {
                                            dValueOf = Double.valueOf(d3Var.y());
                                        } else {
                                            dValueOf = null;
                                        }
                                        eVar.put(strQ4, dValueOf);
                                    } else if (d3Var.r()) {
                                        eVar.put(d3Var.q(), d3Var.s());
                                    } else {
                                        r1.l(v0Var);
                                        t0Var2.c("Unknown value for param. event, param", p0Var.a(strS), p0Var.b(d3Var.q()));
                                    }
                                }
                            }
                        }
                    } else {
                        p1Var2 = (com.gamericefishpro.space.i9.p1) it.next();
                        if (p1Var2.w().isEmpty()) {
                            r1.l(v0Var);
                            t0Var2.b(p0Var.a(strS), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(p1Var2.w());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zB = zB;
        v0Var = v0Var;
        break;
        r1.l(v0Var);
        t0Var.b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.d = bool2;
        if (!z3 || !a3Var.t()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(a3Var.u());
        if (n1Var.y()) {
            if (zB && n1Var.v()) {
                lValueOf2 = l;
            }
            this.f = lValueOf2;
            return true;
        }
        if (zB && n1Var.v()) {
            lValueOf2 = l2;
        }
        this.e = lValueOf2;
        return true;
    }

    public boolean b(Long l, Long l2, com.gamericefishpro.space.i9.r3 r3Var, boolean z) {
        boolean z2;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        w7.a();
        r1 r1Var = (r1) this.h.d;
        g gVar = r1Var.v;
        p0 p0Var = r1Var.C;
        v0 v0Var = r1Var.y;
        boolean zB = gVar.B(this.a, e0.D0);
        com.gamericefishpro.space.i9.u1 u1Var = (com.gamericefishpro.space.i9.u1) this.i;
        boolean zT = u1Var.t();
        boolean zU = u1Var.u();
        boolean zW = u1Var.w();
        boolean z3 = zT || zU || zW;
        if (z && !z3) {
            r1.l(v0Var);
            v0Var.G.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), u1Var.p() ? Integer.valueOf(u1Var.q()) : null);
            return true;
        }
        com.gamericefishpro.space.i9.p1 p1VarS = u1Var.s();
        boolean zU2 = p1VarS.u();
        if (!r3Var.u()) {
            z2 = zW;
            if (!r3Var.y()) {
                if (!r3Var.s()) {
                    r1.l(v0Var);
                    v0Var.B.b(p0Var.c(r3Var.r()), "User property has no value, property");
                } else if (p1VarS.p()) {
                    String strT = r3Var.t();
                    com.gamericefishpro.space.i9.v1 v1VarQ = p1VarS.q();
                    r1.l(v0Var);
                    boolC = c(d(strT, v1VarQ, v0Var), zU2);
                } else if (!p1VarS.r()) {
                    r1.l(v0Var);
                    v0Var.B.b(p0Var.c(r3Var.r()), "No string or number filter defined. property");
                } else if (z0.X(r3Var.t())) {
                    String strT2 = r3Var.t();
                    com.gamericefishpro.space.i9.s1 s1VarS = p1VarS.s();
                    if (z0.X(strT2)) {
                        try {
                            boolE = e(new BigDecimal(strT2), s1VarS, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolE = null;
                        }
                    } else {
                        boolE = null;
                    }
                    boolC = c(boolE, zU2);
                } else {
                    r1.l(v0Var);
                    v0Var.B.c("Invalid user property value for Numeric number filter. property, value", p0Var.c(r3Var.r()), r3Var.t());
                }
                boolC = null;
            } else if (p1VarS.r()) {
                double dZ = r3Var.z();
                try {
                    boolE2 = e(new BigDecimal(dZ), p1VarS.s(), Math.ulp(dZ));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, zU2);
            } else {
                r1.l(v0Var);
                v0Var.B.b(p0Var.c(r3Var.r()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (p1VarS.r()) {
            z2 = zW;
            try {
                boolE3 = e(new BigDecimal(r3Var.v()), p1VarS.s(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, zU2);
        } else {
            r1.l(v0Var);
            v0Var.B.b(p0Var.c(r3Var.r()), "No number filter for long property. property");
            z2 = zW;
            boolC = null;
        }
        r1.l(v0Var);
        v0Var.G.b(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!z2 || boolC.booleanValue()) {
            if (!z || u1Var.t()) {
                this.d = boolC;
            }
            if (boolC.booleanValue() && z3 && r3Var.p()) {
                long jQ = r3Var.q();
                if (l != null) {
                    jQ = l.longValue();
                }
                if (zB && u1Var.t() && !u1Var.u() && l2 != null) {
                    jQ = l2.longValue();
                }
                if (u1Var.u()) {
                    this.f = Long.valueOf(jQ);
                } else {
                    this.e = Long.valueOf(jQ);
                }
            }
        }
        return true;
    }
}
