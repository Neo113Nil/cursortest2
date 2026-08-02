package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;

/* loaded from: classes3.dex */
public final class p0a extends x97 {
    public final Context n;
    public final ogu o;
    public final py9 p;

    public p0a(Context context, ogu oguVar, py9 py9Var, tgu tguVar, vgu vguVar) {
        this.n = context;
        this.o = oguVar;
        this.p = py9Var;
        String str = tguVar.a;
        if (str != null) {
            tgu tguVar2 = (tgu) x97.D(g.a, new f98(vguVar, str, (Continuation) null, 2));
            if (tguVar2 != null) {
                tguVar = tguVar2;
            }
        }
        oguVar.b("DIV2.TEXT_VIEW", new o0a(0, this), tguVar.b.a);
        oguVar.b("DIV2.IMAGE_VIEW", new o0a(17, this), tguVar.c.a);
        oguVar.b("DIV2.IMAGE_GIF_VIEW", new o0a(1, this), tguVar.d.a);
        oguVar.b("DIV2.OVERLAP_CONTAINER_VIEW", new o0a(2, this), tguVar.e.a);
        oguVar.b("DIV2.LINEAR_CONTAINER_VIEW", new o0a(3, this), tguVar.f.a);
        oguVar.b("DIV2.WRAP_CONTAINER_VIEW", new o0a(4, this), tguVar.g.a);
        oguVar.b("DIV2.GRID_VIEW", new o0a(5, this), tguVar.h.a);
        oguVar.b("DIV2.GALLERY_VIEW", new o0a(6, this), tguVar.i.a);
        oguVar.b("DIV2.PAGER_VIEW", new o0a(7, this), tguVar.j.a);
        oguVar.b("DIV2.TAB_VIEW", new o0a(8, this), tguVar.k.a);
        oguVar.b("DIV2.STATE", new o0a(9, this), tguVar.l.a);
        oguVar.b("DIV2.CUSTOM", new o0a(10, this), tguVar.m.a);
        oguVar.b("DIV2.INDICATOR", new o0a(11, this), tguVar.n.a);
        oguVar.b("DIV2.SLIDER", new o0a(12, this), tguVar.o.a);
        oguVar.b("DIV2.INPUT", new o0a(13, this), tguVar.p.a);
        oguVar.b("DIV2.SELECT", new o0a(14, this), tguVar.q.a);
        oguVar.b("DIV2.VIDEO", new o0a(15, this), tguVar.r.a);
        oguVar.b("DIV2.SWITCH", new o0a(16, this), tguVar.s.a);
    }

    @Override // defpackage.x97
    public final Object M(gb8 gb8Var, xzb xzbVar) {
        ViewGroup viewGroup = (ViewGroup) s(gb8Var, xzbVar);
        Iterable iterable = gb8Var.c.y;
        if (iterable == null) {
            iterable = c5b.a;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            viewGroup.addView(W((jc8) it.next(), xzbVar));
        }
        return viewGroup;
    }

    @Override // defpackage.x97
    public final Object P(mb8 mb8Var, xzb xzbVar) {
        return new cj9(this.n, null, 0, 6, null);
    }

    public final View W(jc8 jc8Var, xzb xzbVar) {
        if (!((Boolean) this.p.U(jc8Var, xzbVar)).booleanValue()) {
            return new Space(this.n);
        }
        View view = (View) U(jc8Var, xzbVar);
        view.setBackground(m7j.a);
        return view;
    }

    @Override // defpackage.x97
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final View s(jc8 jc8Var, xzb xzbVar) {
        String str;
        if (jc8Var instanceof cb8) {
            jt8 jt8Var = ((cb8) jc8Var).c;
            str = vq1.c0(jt8Var, xzbVar) ? "DIV2.WRAP_CONTAINER_VIEW" : jt8Var.I.a(xzbVar) == gt8.OVERLAP ? "DIV2.OVERLAP_CONTAINER_VIEW" : "DIV2.LINEAR_CONTAINER_VIEW";
        } else if (jc8Var instanceof db8) {
            str = "DIV2.CUSTOM";
        } else if (jc8Var instanceof eb8) {
            str = "DIV2.GALLERY_VIEW";
        } else if (jc8Var instanceof fb8) {
            str = "DIV2.IMAGE_GIF_VIEW";
        } else if (jc8Var instanceof gb8) {
            str = "DIV2.GRID_VIEW";
        } else if (jc8Var instanceof hb8) {
            str = "DIV2.IMAGE_VIEW";
        } else if (jc8Var instanceof ib8) {
            str = "DIV2.INDICATOR";
        } else if (jc8Var instanceof jb8) {
            str = "DIV2.INPUT";
        } else if (jc8Var instanceof kb8) {
            str = "DIV2.PAGER_VIEW";
        } else if (jc8Var instanceof lb8) {
            str = "DIV2.SELECT";
        } else if (jc8Var instanceof nb8) {
            str = "DIV2.SLIDER";
        } else if (jc8Var instanceof pb8) {
            str = "DIV2.SWITCH";
        } else if (jc8Var instanceof ob8) {
            str = "DIV2.STATE";
        } else if (jc8Var instanceof qb8) {
            str = "DIV2.TAB_VIEW";
        } else if (jc8Var instanceof rb8) {
            str = "DIV2.TEXT_VIEW";
        } else if (jc8Var instanceof sb8) {
            str = "DIV2.VIDEO";
        } else {
            if (!(jc8Var instanceof mb8)) {
                b6e.s();
                return null;
            }
            str = "";
        }
        return this.o.a(str);
    }
}
