package defpackage;

import android.view.View;
import androidx.fragment.app.t;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes3.dex */
public final class gdl extends se3 {
    public boolean a = true;
    public final /* synthetic */ jdl b;
    public final /* synthetic */ View c;

    public gdl(jdl jdlVar, View view) {
        this.b = jdlVar;
        this.c = view;
    }

    @Override // defpackage.se3
    public final void b(View view, float f) {
        jdl jdlVar = this.b;
        f1d.s(f, jdlVar.x, null);
        f1d.s(f, jdlVar.n.c, null);
    }

    @Override // defpackage.se3
    public final void c(int i, View view) {
        upl uplVar;
        jdl jdlVar = this.b;
        cjl cjlVar = jdlVar.n;
        if (i == 1) {
            if (this.a) {
                ddl ddlVar = jdl.G;
                mwk G = jdlVar.B().G();
                if (G == null || (uplVar = (upl) dag.p(G, new vpl())) == null) {
                    uplVar = upl.a;
                }
                if (uplVar == upl.b) {
                    BottomSheetBehavior bottomSheetBehavior = jdlVar.s;
                    if (bottomSheetBehavior == null) {
                        Intrinsics.j("behavior");
                        throw null;
                    }
                    bottomSheetBehavior.setState(4);
                    t tVar = ((a9l) jdlVar.p.getValue()).a;
                    jyr jyrVar = VideoClipActivity.y;
                    tVar.startActivity(l3l.e(tVar, null, 6));
                }
            }
            if (this.a) {
                ddl ddlVar2 = jdl.G;
                jdlVar.B().C.f();
            }
            xdr xdrVar = cjlVar.b;
            aal aalVar = aal.d;
            xdrVar.getClass();
            xdrVar.m(null, aalVar);
            return;
        }
        if (i == 3) {
            this.a = false;
            ddl ddlVar3 = jdl.G;
            jdlVar.B().K(hql.a);
            f1d.s(1.0f, cjlVar.c, null);
            xdr xdrVar2 = cjlVar.b;
            aal aalVar2 = aal.b;
            xdrVar2.getClass();
            xdrVar2.m(null, aalVar2);
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            f1d.s(-1.0f, cjlVar.c, null);
            xdr xdrVar3 = cjlVar.b;
            aal aalVar3 = aal.a;
            xdrVar3.getClass();
            xdrVar3.m(null, aalVar3);
            return;
        }
        this.a = true;
        ddl ddlVar4 = jdl.G;
        jdlVar.B().K(hql.b);
        f1d.s(0.0f, cjlVar.c, null);
        this.c.setKeepScreenOn(false);
        xdr xdrVar4 = cjlVar.b;
        aal aalVar4 = aal.c;
        xdrVar4.getClass();
        xdrVar4.m(null, aalVar4);
    }
}
