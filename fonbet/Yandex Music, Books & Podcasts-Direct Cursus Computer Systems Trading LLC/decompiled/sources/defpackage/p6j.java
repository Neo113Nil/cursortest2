package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import ru.yandex.music.R;

@vx7
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp6j;", "Lhmr;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class p6j extends hmr {
    public z0j k;

    @Override // defpackage.bf6, defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        z0j z0jVar = new z0j(requireContext, arguments.getBoolean("extra_hide_toolbar", true));
        this.k = z0jVar;
        q6j q6jVar = (q6j) z0jVar.d;
        if (q6jVar != null) {
            ((ViewGroup) q6jVar.b.a(q6j.d[0])).setVisibility(0);
        }
        z0j z0jVar2 = this.k;
        if (z0jVar2 != null) {
            z0jVar2.c = new qec(18, this);
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.no_connection_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        q6j q6jVar;
        z0j z0jVar = this.k;
        if (z0jVar != null && (q6jVar = (q6j) z0jVar.d) != null) {
            ((ViewGroup) q6jVar.b.a(q6j.d[0])).setVisibility(8);
        }
        this.k = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        z0j z0jVar = this.k;
        if (z0jVar != null) {
            q6j q6jVar = (q6j) z0jVar.d;
            if (q6jVar != null) {
                q6jVar.a = null;
            }
            z0jVar.d = null;
        }
        super.onDestroyView();
    }

    @Override // defpackage.hmr, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        mle mleVar;
        gle gleVar;
        gle gleVar2;
        view.getClass();
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        requireContext.getClass();
        jyr jyrVar = ogp.h;
        if (jyrVar == null || (gleVar2 = (gle) jyrVar.getValue()) == null || (mleVar = (mle) gleVar2.b.getValue()) == null) {
            mleVar = mle.b;
        }
        kle c = mleVar.c();
        jyr jyrVar2 = ogp.h;
        if (((jyrVar2 == null || (gleVar = (gle) jyrVar2.getValue()) == null) ? null : (rke) gleVar.a.getValue()) != null) {
            rke.a(requireContext).c(c);
        }
        Bundle arguments = getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("extra_mode")) : null;
        q6j q6jVar = new q6j(view, (valueOf != null && valueOf.intValue() == 1) ? hmj.b : (valueOf != null && valueOf.intValue() == 2) ? hmj.c : (valueOf != null && valueOf.intValue() == 3) ? hmj.d : hmj.a);
        z0j z0jVar = this.k;
        if (z0jVar != null) {
            z0jVar.d = q6jVar;
            if (z0jVar.b) {
                ((View) q6jVar.c.a(q6j.d[1])).setVisibility(8);
            }
            q6jVar.a = (cib) z0jVar.e;
        }
    }
}
