package ru.yandex.taxi.summary.requirements.list.ui;

import android.content.Context;
import com.yandex.go.requirements.comment.api.summary.data.models.CommentViewSource;
import com.yandex.go.requirements.comment.summary.ui.v1.RequirementsCommentView;
import defpackage.d1g;
import defpackage.gyc;
import defpackage.iqj0;
import defpackage.kot0;
import defpackage.n3w;
import defpackage.q5z;
import defpackage.tls;
import defpackage.uot0;
import defpackage.vot0;
import defpackage.yot0;
import defpackage.zot0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class SpecialNeedsPresenter$provideSpecialRequirements$commentModel$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zot0 zot0Var = (zot0) obj;
        vot0 vot0Var = (vot0) this.receiver;
        vot0Var.H.c(zot0Var.g);
        ru.yandex.taxi.preorder.summary.tariffpage.requirements.a aVar = vot0Var.A;
        yot0 yot0Var = zot0Var.e;
        String str = yot0Var != null ? yot0Var.c : null;
        String str2 = yot0Var != null ? yot0Var.e : null;
        uot0 uot0Var = new uot0(zot0Var, vot0Var);
        aVar.getClass();
        gyc gycVar = aVar.b.a;
        CommentViewSource commentViewSource = CommentViewSource.TARIFF_CARD;
        gycVar.getClass();
        commentViewSource.getClass();
        d1g d1gVar = (d1g) gycVar.a;
        n3w a = n3w.a(uot0Var);
        Context h0 = d1gVar.a.h0();
        q5z.h(h0);
        aVar.d(new RequirementsCommentView(h0, str, str2, (iqj0) d1gVar.m7.get(), new kot0((uot0) a.a)));
        return zy11.a;
    }
}
