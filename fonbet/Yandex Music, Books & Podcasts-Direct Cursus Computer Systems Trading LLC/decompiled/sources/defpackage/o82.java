package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import ru.yandex.music.R;
import ru.yandex.music.ui.view.CoverView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo82;", "Lbf6;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class o82 extends bf6 {
    public final cvo k;

    public o82() {
        cvl cvlVar;
        wjb wjbVar = wjb.PlaylistScreen;
        hlb hlbVar = hlb.Fullscreen;
        pkb pkbVar = pkb.Playlist;
        Bundle arguments = getArguments();
        smk smkVar = arguments != null ? (smk) arguments.getParcelable("extra_playlist") : null;
        this.k = new cvo(wjbVar, hlbVar, (glb) null, (dvo) null, new avo(pkbVar, (smkVar == null || (cvlVar = smkVar.b) == null) ? "" : cvlVar.e()), 44);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_auto_playlist_gag, viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        smk smkVar = arguments != null ? (smk) arguments.getParcelable("extra_playlist") : null;
        if (smkVar == null) {
            return;
        }
        sld sldVar = new sld(smkVar, new ix6(9, this));
        Context context = getContext();
        context.getClass();
        q82 q82Var = new q82(context, view);
        q82Var.g = sldVar;
        q13 q13Var = q82Var.a;
        s9f[] s9fVarArr = q82.h;
        ImageView imageView = (ImageView) q13Var.a(s9fVarArr[0]);
        co6 co6Var = smkVar.k.d;
        int b = frv.b();
        Context context2 = imageView.getContext();
        context2.getClass();
        pce X = i4w.X(co6Var, context2, b);
        X.f(imageView);
        rce a = X.a();
        l18 l18Var = l18.b;
        bdt I = hag.I(cce.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ((cce) qdcVar.C(I)).d(a);
        CoverView coverView = (CoverView) q82Var.b.a(s9fVarArr[1]);
        co6 co6Var2 = smkVar.l.d;
        int b2 = frv.b();
        Context context3 = coverView.getContext();
        context3.getClass();
        pce X2 = i4w.X(co6Var2, context3, b2);
        X2.f(coverView);
        rce a2 = X2.a();
        bdt I2 = hag.I(cce.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        ((cce) qdcVar2.C(I2)).d(a2);
        boolean equals = "playlistOfTheDay".equals(smkVar.a);
        q13 q13Var2 = q82Var.e;
        if (equals) {
            ((Button) q13Var2.a(s9fVarArr[4])).setVisibility(8);
            ((Button) q82Var.f.a(s9fVarArr[5])).setVisibility(0);
            ((TextView) q82Var.c.a(s9fVarArr[2])).setText(R.string.auto_playlist_of_the_day_gag_screen_title);
            ((TextView) q82Var.d.a(s9fVarArr[3])).setText(R.string.auto_playlist_of_the_day_gag_screen_text);
            return;
        }
        ((Button) q13Var2.a(s9fVarArr[4])).setVisibility(0);
        ((Button) q82Var.f.a(s9fVarArr[5])).setVisibility(8);
        ((TextView) q82Var.c.a(s9fVarArr[2])).setText(smkVar.b.b);
        TextView textView = (TextView) q82Var.d.a(s9fVarArr[3]);
        String str = smkVar.i;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    @Override // defpackage.jnb
    /* renamed from: z, reason: from getter */
    public final cvo getK() {
        return this.k;
    }
}
