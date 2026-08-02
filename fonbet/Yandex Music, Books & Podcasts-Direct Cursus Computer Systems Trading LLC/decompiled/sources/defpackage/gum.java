package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class gum {
    public static final /* synthetic */ s9f[] n = {new yxm(gum.class, "avatarIconView", "getAvatarIconView()Landroidx/compose/ui/platform/ComposeView;", 0), f1d.c(ern.a, gum.class, "nameTextView", "getNameTextView()Landroid/widget/TextView;", 0), new yxm(gum.class, "loginTextView", "getLoginTextView()Landroid/widget/TextView;", 0), new yxm(gum.class, "backgroundImageView", "getBackgroundImageView()Landroid/widget/ImageView;", 0), new yxm(gum.class, "actionList", "getActionList()Landroidx/recyclerview/widget/RecyclerView;", 0), new yxm(gum.class, "loader", "getLoader()Landroid/view/View;", 0), new yxm(gum.class, "frameView", "getFrameView()Landroid/view/View;", 0), new yxm(gum.class, "contentView", "getContentView()Landroid/view/View;", 0), new yxm(gum.class, "noConnectionView", "getNoConnectionView()Landroid/view/View;", 0), new yxm(gum.class, "plusPanel", "getPlusPanel()Landroidx/compose/ui/platform/ComposeView;", 0), new yxm(gum.class, "easyLoginButton", "getEasyLoginButton()Landroidx/compose/ui/platform/ComposeView;", 0)};
    public final View a;
    public final q13 b;
    public final Context c;
    public final jyr d;
    public final q13 e;
    public final q13 f;
    public final q13 g;
    public final q13 h;
    public final m8f i;
    public final q13 j;
    public final q13 k;
    public final q13 l;
    public final q13 m;

    public gum(View view) {
        this.a = view;
        this.b = new q13(new o8f(view, 25));
        Context context = view.getContext();
        context.getClass();
        this.c = context;
        this.d = btf.b(new hvl(27));
        this.e = new q13(new o8f(view, 26));
        this.f = new q13(new o8f(view, 27));
        q13 q13Var = new q13(new o8f(view, 28));
        this.g = new q13(new o8f(view, 29));
        this.h = new q13(new fum(view, 0));
        m8f m8fVar = new m8f(0);
        this.i = m8fVar;
        this.j = new q13(new fum(view, 1));
        this.k = new q13(new fum(view, 2));
        this.l = new q13(new o8f(view, 23));
        this.m = new q13(new o8f(view, 24));
        s9f[] s9fVarArr = n;
        s9f s9fVar = s9fVarArr[3];
        s9fVar.getClass();
        try {
            View findViewById = view.findViewById(R.id.image_view_background);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ((ImageView) findViewById).setColorFilter((ColorFilter) sht.b.getValue());
            ((RecyclerView) q13Var.a(s9fVarArr[4])).setAdapter(m8fVar);
            ((RecyclerView) q13Var.a(s9fVarArr[4])).s(new g8f(0.0f, 0.0f, context.getResources().getDimension(R.dimen.juicy_bottom_sheet_list_item_corner_radius), context.getResources().getDimension(R.dimen.juicy_bottom_sheet_list_item_small_padding), weo.M(context, R.attr.bgPlaceholder)));
            zs4.a((RecyclerView) q13Var.a(s9fVarArr[4]));
        } catch (ClassCastException e) {
            l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar), e);
            throw null;
        }
    }

    public final void a(boolean z) {
        kle b = z ? ogp.r().b() : ogp.r().d();
        Context context = this.c;
        context.getClass();
        b.getClass();
        if (ogp.v() != null) {
            rke.a(context).c(b);
        }
        s9f[] s9fVarArr = n;
        wxf.K((View) this.k.a(s9fVarArr[8]), !z);
        wxf.K((View) this.j.a(s9fVarArr[7]), z);
        wxf.K((ComposeView) this.m.a(s9fVarArr[10]), z && ((Boolean) this.d.getValue()).booleanValue());
    }
}
