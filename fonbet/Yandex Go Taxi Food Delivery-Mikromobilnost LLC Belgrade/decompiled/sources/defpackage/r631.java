package defpackage;

import android.content.Context;
import flex.core.velocity.FpsMonitoringHelper;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class r631 implements wwq, uyg, wyi0, mas, me7 {
    public final ofa0 a;
    public final tyg b;
    public final vwq c;
    public final hzk w;
    public final ne7 x;

    public r631(o631 o631Var) {
        this.a = new ofa0(o631Var);
        this.b = new tyg(o631Var);
        this.c = new vwq(o631Var);
        hzk hzkVar = new hzk();
        hzkVar.a = o631Var;
        hzkVar.b = new FpsMonitoringHelper();
        this.w = hzkVar;
        this.x = new ne7(o631Var);
    }

    @Override // defpackage.me7
    public final void a(String str, String str2) {
        this.x.b(str, str2);
    }

    @Override // defpackage.wwq
    public final void b(String str, u7u0 u7u0Var, String str2, String str3) {
        this.c.b(str, u7u0Var, str2, str3);
    }

    @Override // defpackage.wyi0
    public final void c(long j, String str, String str2) {
        this.a.c(j, str, str2);
    }

    @Override // defpackage.wwq, defpackage.uyg
    public final void clearNetworkPageInfo(String str) {
        this.c.clearNetworkPageInfo(str);
        this.b.clearNetworkPageInfo(str);
    }

    @Override // defpackage.me7
    public final void d(String str, String str2) {
        this.x.d(str, str2);
    }

    @Override // defpackage.wwq
    public final void e(String str, String str2) {
        this.c.e(str, str2);
    }

    @Override // defpackage.uyg
    public final void endDecodingDocument(String str, long j, String str2, String str3) {
        throw null;
    }

    @Override // defpackage.uyg
    public final void endDecodingDocument(String str, syg sygVar, String str2) {
        this.b.endDecodingDocument(str, sygVar, str2);
    }

    @Override // defpackage.uyg
    public final void endDecodingSection(String str, String str2) {
        this.b.endDecodingSection(str, str2);
    }

    @Override // defpackage.mas
    public final void g(String str) {
        this.w.g(str);
    }

    @Override // defpackage.l631
    public final Map getVelocityContext(cnr0 cnr0Var) {
        return b.f();
    }

    @Override // defpackage.mas
    public final void j(Context context) {
        this.w.j(context);
    }

    @Override // defpackage.wyi0
    public final void l(String str, String str2, i3y i3yVar) {
        this.a.y(str, str2, (Map) i3yVar.getValue());
    }

    @Override // defpackage.uyg
    public final void logDecodingSharedDataSlice(String str, String str2, xez0 xez0Var, Map map) {
        logDecodingSharedDataSlice(str, xez0Var.b - xez0Var.a);
    }

    @Override // defpackage.uyg
    public final void logJsonCreationTimings(String str, String str2, xez0 xez0Var, Map map) {
        logJsonCreationTimings(str, xez0Var.b - xez0Var.a);
    }

    @Override // defpackage.wyi0
    public final void m(String str, String str2, i3y i3yVar) {
        this.a.z(str, str2, (Map) i3yVar.getValue());
    }

    @Override // defpackage.wyi0
    public final void p(String str, String str2) {
        this.a.p(str, str2);
    }

    @Override // defpackage.wyi0
    public final void q(long j, String str, String str2) {
        this.a.q(j, str, str2);
    }

    @Override // defpackage.uyg
    public final void startDecodingDocument(String str, String str2) {
        this.b.startDecodingDocument(str, str2);
    }

    @Override // defpackage.uyg
    public final void startDecodingSection(String str, String str2) {
        this.b.startDecodingSection(str, str2);
    }

    @Override // defpackage.mas
    public final void t(String str) {
        this.w.o(str);
    }

    @Override // defpackage.wyi0
    public final void u(String str, String str2) {
        this.a.u(str, str2);
    }

    @Override // defpackage.uyg
    public final void endDecodingSection(String str, String str2, String str3, Map map) {
        this.b.endDecodingSection(str, str2);
    }

    @Override // defpackage.uyg
    public final void logDecodingSharedDataSlice(String str, long j) {
        this.b.logDecodingSharedDataSlice(str, j);
    }

    @Override // defpackage.uyg
    public final void logJsonCreationTimings(String str, long j) {
        this.b.logJsonCreationTimings(str, j);
    }
}
