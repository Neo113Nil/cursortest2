package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class zy9 implements u1f {
    public Integer a;

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0257, code lost:
    
        if (r4 == null) goto L134;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(zy9 zy9Var, xzb xzbVar, xzb xzbVar2) {
        if (zy9Var != null) {
            if (this instanceof xy9) {
                xy9 xy9Var = (xy9) this;
                Object c = zy9Var.c();
                wir wirVar = c instanceof wir ? (wir) c : null;
                if (wirVar != null) {
                    wir wirVar2 = xy9Var.b;
                    if (Intrinsics.d(wirVar2.a, wirVar.a) && Intrinsics.d(wirVar2.b.a(xzbVar), wirVar.b.a(xzbVar2))) {
                        return true;
                    }
                }
            } else if (this instanceof vy9) {
                vy9 vy9Var = (vy9) this;
                Object c2 = zy9Var.c();
                jhj jhjVar = c2 instanceof jhj ? (jhj) c2 : null;
                if (jhjVar != null) {
                    jhj jhjVar2 = vy9Var.b;
                    if (Intrinsics.d(jhjVar2.a, jhjVar.a) && ((Number) jhjVar2.b.a(xzbVar)).doubleValue() == ((Number) jhjVar.b.a(xzbVar2)).doubleValue()) {
                        return true;
                    }
                }
            } else if (this instanceof uy9) {
                uy9 uy9Var = (uy9) this;
                Object c3 = zy9Var.c();
                jre jreVar = c3 instanceof jre ? (jre) c3 : null;
                if (jreVar != null) {
                    jre jreVar2 = uy9Var.b;
                    if (Intrinsics.d(jreVar2.a, jreVar.a) && ((Number) jreVar2.b.a(xzbVar)).longValue() == ((Number) jreVar.b.a(xzbVar2)).longValue()) {
                        return true;
                    }
                }
            } else if (this instanceof ry9) {
                ry9 ry9Var = (ry9) this;
                Object c4 = zy9Var.c();
                yb3 yb3Var = c4 instanceof yb3 ? (yb3) c4 : null;
                if (yb3Var != null) {
                    yb3 yb3Var2 = ry9Var.b;
                    if (Intrinsics.d(yb3Var2.a, yb3Var.a) && ((Boolean) yb3Var2.b.a(xzbVar)).booleanValue() == ((Boolean) yb3Var.b.a(xzbVar2)).booleanValue()) {
                        return true;
                    }
                }
            } else if (this instanceof sy9) {
                sy9 sy9Var = (sy9) this;
                Object c5 = zy9Var.c();
                ga5 ga5Var = c5 instanceof ga5 ? (ga5) c5 : null;
                if (ga5Var != null) {
                    ga5 ga5Var2 = sy9Var.b;
                    if (Intrinsics.d(ga5Var2.a, ga5Var.a) && ((Number) ga5Var2.b.a(xzbVar)).intValue() == ((Number) ga5Var.b.a(xzbVar2)).intValue()) {
                        return true;
                    }
                }
            } else if (this instanceof yy9) {
                yy9 yy9Var = (yy9) this;
                Object c6 = zy9Var.c();
                qqt qqtVar = c6 instanceof qqt ? (qqt) c6 : null;
                if (qqtVar != null) {
                    qqt qqtVar2 = yy9Var.b;
                    if (Intrinsics.d(qqtVar2.a, qqtVar.a) && Intrinsics.d(qqtVar2.b.a(xzbVar), qqtVar.b.a(xzbVar2))) {
                        return true;
                    }
                }
            } else if (this instanceof ty9) {
                ty9 ty9Var = (ty9) this;
                Object c7 = zy9Var.c();
                m28 m28Var = c7 instanceof m28 ? (m28) c7 : null;
                if (m28Var != null) {
                    m28 m28Var2 = ty9Var.b;
                    if (Intrinsics.d(m28Var2.a, m28Var.a) && Intrinsics.d(m28Var2.b.a(xzbVar), m28Var.b.a(xzbVar2))) {
                        return true;
                    }
                }
            } else if (this instanceof qy9) {
                qy9 qy9Var = (qy9) this;
                Object c8 = zy9Var.c();
                kz0 kz0Var = c8 instanceof kz0 ? (kz0) c8 : null;
                if (kz0Var != null) {
                    kz0 kz0Var2 = qy9Var.b;
                    if (Intrinsics.d(kz0Var2.a, kz0Var.a) && Intrinsics.d(kz0Var2.b.a(xzbVar), kz0Var.b.a(xzbVar2))) {
                        return true;
                    }
                }
            } else {
                if (!(this instanceof wy9)) {
                    b6e.s();
                    return false;
                }
                wy9 wy9Var = (wy9) this;
                Object c9 = zy9Var.c();
                cym cymVar = c9 instanceof cym ? (cym) c9 : null;
                if (cymVar != null) {
                    cym cymVar2 = wy9Var.b;
                    if (Intrinsics.d(cymVar2.a.a(xzbVar), cymVar.a.a(xzbVar2)) && Intrinsics.d(cymVar2.b, cymVar.b) && cymVar2.c.equals(cymVar.c)) {
                        List list = cymVar2.d;
                        List list2 = cymVar.d;
                        if (list != null) {
                            if (list2 != null && list.size() == list2.size()) {
                                int i = 0;
                                for (Object obj : list) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        u75.n();
                                        throw null;
                                    }
                                    if (!((bd8) obj).a((bd8) list2.get(i), xzbVar, xzbVar2)) {
                                        break;
                                    }
                                    i = i2;
                                }
                                if (cymVar2.e == cymVar.e) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int hashCode;
        int intValue;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = ern.a(getClass()).hashCode();
        if (this instanceof xy9) {
            wir wirVar = ((xy9) this).b;
            Integer num2 = wirVar.c;
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                hashCode = wirVar.b.hashCode() + wirVar.a.hashCode() + ern.a(wir.class).hashCode();
                wirVar.c = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof vy9) {
            jhj jhjVar = ((vy9) this).b;
            Integer num3 = jhjVar.c;
            if (num3 != null) {
                intValue = num3.intValue();
            } else {
                hashCode = jhjVar.b.hashCode() + jhjVar.a.hashCode() + ern.a(jhj.class).hashCode();
                jhjVar.c = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof uy9) {
            jre jreVar = ((uy9) this).b;
            Integer num4 = jreVar.c;
            if (num4 != null) {
                intValue = num4.intValue();
            } else {
                hashCode = jreVar.b.hashCode() + jreVar.a.hashCode() + ern.a(jre.class).hashCode();
                jreVar.c = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof ry9) {
            yb3 yb3Var = ((ry9) this).b;
            Integer num5 = yb3Var.c;
            if (num5 != null) {
                intValue = num5.intValue();
            } else {
                hashCode = yb3Var.b.hashCode() + yb3Var.a.hashCode() + ern.a(yb3.class).hashCode();
                yb3Var.c = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof sy9) {
            ga5 ga5Var = ((sy9) this).b;
            Integer num6 = ga5Var.c;
            if (num6 != null) {
                intValue = num6.intValue();
            } else {
                hashCode = ga5Var.b.hashCode() + ga5Var.a.hashCode() + ern.a(ga5.class).hashCode();
                ga5Var.c = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof yy9) {
            qqt qqtVar = ((yy9) this).b;
            Integer num7 = qqtVar.c;
            if (num7 != null) {
                intValue = num7.intValue();
            } else {
                hashCode = qqtVar.b.hashCode() + qqtVar.a.hashCode() + ern.a(qqt.class).hashCode();
                qqtVar.c = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof ty9) {
            m28 m28Var = ((ty9) this).b;
            Integer num8 = m28Var.c;
            if (num8 != null) {
                intValue = num8.intValue();
            } else {
                hashCode = m28Var.b.hashCode() + m28Var.a.hashCode() + ern.a(m28.class).hashCode();
                m28Var.c = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else if (this instanceof qy9) {
            kz0 kz0Var = ((qy9) this).b;
            Integer num9 = kz0Var.c;
            if (num9 != null) {
                intValue = num9.intValue();
            } else {
                hashCode = kz0Var.b.hashCode() + kz0Var.a.hashCode() + ern.a(kz0.class).hashCode();
                kz0Var.c = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else {
            if (!(this instanceof wy9)) {
                b6e.s();
                return 0;
            }
            cym cymVar = ((wy9) this).b;
            Integer num10 = cymVar.f;
            if (num10 != null) {
                intValue = num10.intValue();
            } else {
                int hashCode3 = cymVar.c.hashCode() + cymVar.b.hashCode() + cymVar.a.hashCode() + ern.a(cym.class).hashCode();
                List list = cymVar.d;
                int i = 0;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        i += ((bd8) it.next()).b();
                    }
                }
                hashCode = cymVar.e.hashCode() + hashCode3 + i;
                cymVar.f = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        }
        int i2 = hashCode2 + intValue;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    public final Object c() {
        if (this instanceof xy9) {
            return ((xy9) this).b;
        }
        if (this instanceof vy9) {
            return ((vy9) this).b;
        }
        if (this instanceof uy9) {
            return ((uy9) this).b;
        }
        if (this instanceof ry9) {
            return ((ry9) this).b;
        }
        if (this instanceof sy9) {
            return ((sy9) this).b;
        }
        if (this instanceof yy9) {
            return ((yy9) this).b;
        }
        if (this instanceof ty9) {
            return ((ty9) this).b;
        }
        if (this instanceof qy9) {
            return ((qy9) this).b;
        }
        if (this instanceof wy9) {
            return ((wy9) this).b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((cz9) rj3.b.I9.getValue()).b(rj3.a, this);
    }
}
