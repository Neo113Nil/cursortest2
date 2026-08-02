package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.connectsdk.service.DeviceService;
import ru.yandex.music.R;
import ru.yandex.music.catalog.info.FullInfoActivity;

/* loaded from: classes4.dex */
public final class m0c extends rxc {
    public static final /* synthetic */ s9f[] o = {new yxm(m0c.class, "content", "getContent()Landroid/view/ViewGroup;", 0), f1d.c(ern.a, m0c.class, "scrollView", "getScrollView()Landroid/widget/ScrollView;", 0), new yxm(m0c.class, "copyrightInfo", "getCopyrightInfo()Landroid/widget/TextView;", 0), new yxm(m0c.class, "title", "getTitle()Landroid/widget/TextView;", 0), new yxm(m0c.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0), new yxm(m0c.class, "info", "getInfo()Landroid/widget/TextView;", 0), new yxm(m0c.class, DeviceService.KEY_DESC, "getDescription()Landroid/widget/TextView;", 0)};
    public final q13 j;
    public final q13 k;
    public final q13 l;
    public final q13 m;
    public final q13 n;

    public m0c(FullInfoActivity fullInfoActivity, View view) {
        super(fullInfoActivity, view);
        this.j = new q13(new etb(view, 3));
        this.k = new q13(new etb(view, 4));
        this.l = new q13(new etb(view, 5));
        this.m = new q13(new etb(view, 6));
        this.n = new q13(new etb(view, 7));
        s9f[] s9fVarArr = o;
        s9f s9fVar = s9fVarArr[0];
        s9fVar.getClass();
        try {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.content);
            if (viewGroup != null) {
                qdq.c(5, viewGroup);
            }
            s9f s9fVar2 = s9fVarArr[1];
            s9fVar2.getClass();
            try {
                ScrollView scrollView = (ScrollView) view.findViewById(R.id.scroll_view);
                if (scrollView != null) {
                    qdq.c(5, scrollView);
                }
                c().setOnApplyWindowInsetsListener(null);
            } catch (ClassCastException e) {
                l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar2), e);
                throw null;
            }
        } catch (ClassCastException e2) {
            l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar), e2);
            throw null;
        }
    }

    @Override // defpackage.rxc
    public final void b(ixc ixcVar) {
        String str;
        ixcVar.getClass();
        super.b(ixcVar);
        el6 copyrightInfo = ixcVar.c.getCopyrightInfo();
        s9f[] s9fVarArr = o;
        if (copyrightInfo != null) {
            TextView textView = (TextView) this.j.a(s9fVarArr[2]);
            String str2 = copyrightInfo.a;
            sht.e(textView, (str2 == null || (str = copyrightInfo.b) == null) ? str2 != null ? g3o.c(R.string.photo_copyright_format_short, str2) : null : g3o.c(R.string.photo_copyright_format, str, str2));
        }
        sht.e((TextView) this.k.a(s9fVarArr[3]), ixcVar.f);
        sht.e((TextView) this.l.a(s9fVarArr[4]), ixcVar.g);
        sht.e((TextView) this.m.a(s9fVarArr[5]), ixcVar.h);
        sht.e((TextView) this.n.a(s9fVarArr[6]), ixcVar.i);
        c().setOnClickListener(new ol(18, this));
    }
}
