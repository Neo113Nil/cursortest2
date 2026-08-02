package defpackage;

import androidx.fragment.app.t;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class h65 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k65 b;
    public final /* synthetic */ aau c;
    public final /* synthetic */ int d;

    public /* synthetic */ h65(k65 k65Var, aau aauVar, int i, int i2) {
        this.a = i2;
        this.b = k65Var;
        this.c = aauVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List c;
        List c2;
        switch (this.a) {
            case 0:
                x1u x1uVar = this.c.a;
                final k65 k65Var = this.b;
                k65Var.getClass();
                g5u g5uVar = ((l65) k65Var.f.getValue()).b;
                d5u d5uVar = g5uVar instanceof d5u ? (d5u) g5uVar : null;
                if (d5uVar == null || (c = d5uVar.a) == null) {
                    c = t75.c(x1uVar);
                }
                List list = c;
                rmb a = k65Var.c.a(new jab(qkb.Videoclips, 1, 2, list.size()), null);
                int i = this.d;
                u5l b = a.b(lsq.p(x1uVar, i, 0));
                final int i2 = 1;
                g0l.r(k65Var.e, "you_will_like_it", list, wmn.e, k65Var.d, b, new icr(i), new Function0() { // from class: j65
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i2;
                        k65 k65Var2 = k65Var;
                        switch (i3) {
                            case 0:
                                t tVar = k65Var2.b.a;
                                jyr jyrVar = VideoClipActivity.y;
                                tVar.startActivity(l3l.e(tVar, null, 6));
                                break;
                            default:
                                t tVar2 = k65Var2.b.a;
                                jyr jyrVar2 = VideoClipActivity.y;
                                tVar2.startActivity(l3l.e(tVar2, null, 6));
                                break;
                        }
                        return Unit.a;
                    }
                }, 640);
                break;
            default:
                x1u x1uVar2 = this.c.a;
                final k65 k65Var2 = this.b;
                k65Var2.getClass();
                g5u g5uVar2 = ((l65) k65Var2.f.getValue()).a;
                d5u d5uVar2 = g5uVar2 instanceof d5u ? (d5u) g5uVar2 : null;
                if (d5uVar2 == null || (c2 = d5uVar2.a) == null) {
                    c2 = t75.c(x1uVar2);
                }
                List list2 = c2;
                rmb a2 = k65Var2.c.a(new jab(qkb.Videoclips, 1, 1, list2.size()), null);
                int i3 = this.d;
                u5l b2 = a2.b(lsq.p(x1uVar2, 0, i3));
                final int i4 = 0;
                g0l.r(k65Var2.e, "collection", list2, wmn.e, k65Var2.d, b2, new icr(i3), new Function0() { // from class: j65
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i32 = i4;
                        k65 k65Var22 = k65Var2;
                        switch (i32) {
                            case 0:
                                t tVar = k65Var22.b.a;
                                jyr jyrVar = VideoClipActivity.y;
                                tVar.startActivity(l3l.e(tVar, null, 6));
                                break;
                            default:
                                t tVar2 = k65Var22.b.a;
                                jyr jyrVar2 = VideoClipActivity.y;
                                tVar2.startActivity(l3l.e(tVar2, null, 6));
                                break;
                        }
                        return Unit.a;
                    }
                }, 640);
                break;
        }
        return Unit.a;
    }
}
