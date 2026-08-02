package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import ru.yandex.music.R;
import ru.yandex.music.catalog.info.FullInfoActivity;

/* loaded from: classes4.dex */
public class rxc {
    public static final /* synthetic */ s9f[] i = {new yxm(rxc.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), f1d.c(ern.a, rxc.class, "cover", "getCover()Landroid/widget/ImageView;", 0), new yxm(rxc.class, "coverBlurred", "getCoverBlurred()Landroid/widget/ImageView;", 0), new yxm(rxc.class, "uploadCover", "getUploadCover()Landroid/widget/Button;", 0), new yxm(rxc.class, "uploadCoverProgress", "getUploadCoverProgress()Landroid/view/View;", 0)};
    public final FullInfoActivity a;
    public final q13 b;
    public final q13 c;
    public final q13 d;
    public final q13 e;
    public final q13 f;
    public int g;
    public h4b h;

    public rxc(FullInfoActivity fullInfoActivity, View view) {
        this.a = fullInfoActivity;
        this.b = new q13(new etb(view, 8));
        this.c = new q13(new etb(view, 9));
        this.d = new q13(new etb(view, 10));
        this.e = new q13(new etb(view, 11));
        q13 q13Var = new q13(new etb(view, 12));
        this.f = q13Var;
        qdq.d(e(), false, (r3 & 2) == 0, false, (r3 & 8) == 0);
        qdq.c(13, c());
        qdq.c(13, (View) q13Var.a(i[4]));
    }

    public static final void a(rxc rxcVar) {
        h4b h4bVar;
        n7b n7bVar;
        int i2 = rxcVar.g + 1;
        rxcVar.g = i2;
        if (i2 != 2 || (h4bVar = rxcVar.h) == null || (n7bVar = (n7b) ((iz7) h4bVar.a).b) == null) {
            return;
        }
        ((FullInfoActivity) n7bVar.a).supportStartPostponedEnterTransition();
    }

    public void b(ixc ixcVar) {
        FullInfoActivity fullInfoActivity = this.a;
        ixcVar.getClass();
        ((Button) this.e.a(i[3])).setOnClickListener(new ol(19, this));
        e().setTitle("");
        Drawable navigationIcon = e().getNavigationIcon();
        if (navigationIcon != null) {
            Context context = e().getContext();
            context.getClass();
            navigationIcon.setColorFilter(ksw.C(context, R.attr.iconPrimary));
        }
        d().setColorFilter((ColorFilter) sht.a.getValue());
        co6 co6Var = new co6(ixcVar.c, ixcVar.d, null);
        tqn tqnVar = new tqn();
        qxc qxcVar = new qxc(tqnVar, this);
        pce X = i4w.X(co6Var, fullInfoActivity, wct.s());
        X.d = qxcVar;
        X.d();
        X.s = dq3.DISABLED;
        rce a = X.a();
        l18 l18Var = l18.b;
        bdt I = hag.I(cce.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        pxc pxcVar = new pxc(this, tqnVar, ((cce) qdcVar.C(I)).d(a));
        pce X2 = i4w.X(co6Var, fullInfoActivity, frv.b() * 3);
        X2.d = pxcVar;
        X2.d();
        rce a2 = X2.a();
        bdt I2 = hag.I(cce.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        ((cce) qdcVar2.C(I2)).d(a2);
        oxc oxcVar = new oxc(this);
        pce X3 = i4w.X(co6Var, fullInfoActivity, wct.s());
        X3.d = oxcVar;
        X3.d();
        if (Build.VERSION.SDK_INT >= 31) {
            X3.j = xee.L(xz0.X(new e7t[]{new i83(0)}));
        } else {
            X3.j = xee.L(xz0.X(new e7t[]{new g3r(true)}));
        }
        rce a3 = X3.a();
        bdt I3 = hag.I(cce.class);
        qdc qdcVar3 = l18Var.a;
        qdcVar3.getClass();
        ((cce) qdcVar3.C(I3)).d(a3);
    }

    public final ImageView c() {
        return (ImageView) this.c.a(i[1]);
    }

    public final ImageView d() {
        return (ImageView) this.d.a(i[2]);
    }

    public final Toolbar e() {
        return (Toolbar) this.b.a(i[0]);
    }
}
