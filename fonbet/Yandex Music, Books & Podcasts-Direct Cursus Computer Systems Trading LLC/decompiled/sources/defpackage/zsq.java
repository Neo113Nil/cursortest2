package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zsq {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00c7, code lost:
    
        if (r2 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00d5, code lost:
    
        if (r2 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00e3, code lost:
    
        if (r2 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00f1, code lost:
    
        if (r2 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00ff, code lost:
    
        if (r2 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0034, code lost:
    
        if (r2 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x004c, code lost:
    
        if (r2 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x005b, code lost:
    
        if (r2 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x006a, code lost:
    
        if (r2 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0095, code lost:
    
        if (r2 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00b9, code lost:
    
        if (r2 == null) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zsq(xsq xsqVar, int i, int i2) {
        String str;
        String str2;
        xsqVar.getClass();
        boolean z = xsqVar instanceof csq;
        String str3 = "";
        if (!z) {
            if (!(xsqVar instanceof dsq)) {
                if (xsqVar instanceof fsq) {
                    g24 g24Var = (g24) CollectionsKt.S(((fsq) xsqVar).g.b, i2);
                    if (g24Var != null) {
                        str = g24Var.a;
                    } else if (g24Var != null) {
                        b6e.s();
                        throw null;
                    }
                } else if (xsqVar instanceof gsq) {
                    str = ((gsq) xsqVar).g.a;
                } else if (xsqVar instanceof hsq) {
                    str = ((hsq) xsqVar).g.b;
                } else if (xsqVar instanceof isq) {
                    str = ((isq) xsqVar).g.b;
                } else if (xsqVar instanceof jsq) {
                    rs4 rs4Var = (rs4) CollectionsKt.S(((jsq) xsqVar).g.a, i2);
                    pd3 pd3Var = rs4Var != null ? rs4Var.c : null;
                    if (pd3Var != null) {
                        je3 je3Var = (je3) CollectionsKt.firstOrNull(pd3Var.a);
                        if (je3Var != null) {
                            str = je3Var.a();
                        }
                    } else if (pd3Var != null) {
                        b6e.s();
                        throw null;
                    }
                } else if (xsqVar instanceof msq) {
                    str3 = ((msq) xsqVar).g.a;
                } else if (xsqVar instanceof nsq) {
                    str = ((nsq) xsqVar).g.b;
                } else if (xsqVar instanceof osq) {
                    str = ((osq) xsqVar).g.a;
                } else if (xsqVar instanceof psq) {
                    str = ((psq) xsqVar).g.a;
                } else if (xsqVar instanceof rsq) {
                    str = ((rsq) xsqVar).g.a;
                } else if (xsqVar instanceof ssq) {
                    str = ((ssq) xsqVar).g.a;
                } else if (xsqVar instanceof tsq) {
                    str = ((tsq) xsqVar).g.e;
                } else {
                    if (!(xsqVar instanceof usq)) {
                        b6e.s();
                        throw null;
                    }
                    str3 = ((usq) xsqVar).g.a;
                }
            }
            if (xsqVar instanceof isq) {
                str2 = "CHART_FAVORITES";
            } else if (xsqVar instanceof osq) {
                str2 = "QUIZ";
            } else if (xsqVar instanceof rsq) {
                str2 = "STATS";
            } else if (xsqVar instanceof tsq) {
                str2 = "TEXT_FACT";
            } else if (z) {
                str2 = "ARTISTS";
            } else if (xsqVar instanceof dsq) {
                str2 = "VIDEO";
            } else if (xsqVar instanceof hsq) {
                str2 = "CHART_ARTIST";
            } else if (xsqVar instanceof usq) {
                str2 = "THEN_NOW_COMPARISON";
            } else if (xsqVar instanceof nsq) {
                str2 = "PAY_CARD";
            } else if (xsqVar instanceof fsq) {
                str2 = "CAROUSEL";
            } else if (xsqVar instanceof gsq) {
                str2 = "CHART";
            } else if (xsqVar instanceof jsq) {
                str2 = "COLLAGE";
            } else if (xsqVar instanceof msq) {
                str2 = "TEXT_EXTENDED";
            } else if (xsqVar instanceof psq) {
                str2 = "SINGLE_ENTITY";
            } else {
                if (!(xsqVar instanceof ssq)) {
                    b6e.s();
                    throw null;
                }
                str2 = "TEXT";
            }
            this.a = str3;
            this.b = str2;
            this.c = i;
            this.d = i2;
            return;
        }
        str = ((csq) xsqVar).g.a.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsq)) {
            return false;
        }
        zsq zsqVar = (zsq) obj;
        return Intrinsics.d(this.a, zsqVar.a) && Intrinsics.d(this.b, zsqVar.b) && this.c == zsqVar.c && this.d == zsqVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f1d.a(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("SlideAnalyticsInfo(id=", this.a, ", type=", this.b, ", slideIndex=");
        m.append(this.c);
        m.append(", horizontalContentIndex=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
