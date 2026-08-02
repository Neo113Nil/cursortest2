package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;
import ru.yandex.music.concert.ConcertActivity;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes5.dex */
public class vu5 extends bf6 implements ty5 {
    public String k;
    public String l;
    public eps m;

    @Override // defpackage.ty5
    public final void C(String str) {
        w1g.z(getContext(), str);
    }

    @Override // defpackage.ty5
    public final void J(us5 us5Var) {
        Context context = getContext();
        String str = us5Var.a;
        int i = ConcertActivity.w0;
        startActivity(bkp.j0(context, str, null));
    }

    @Override // defpackage.ty5
    public final void e() {
        t l = l();
        Assertions.assertNonNull(l);
        if (l != null) {
            l().finish();
        }
    }

    @Override // defpackage.bf6, defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle arguments = getArguments();
        this.k = Preconditions.nonEmpty(arguments.getString("arg.concert.id"));
        this.l = arguments.getString("arg.artist.id");
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.view_concert, viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        eps epsVar = this.m;
        epsVar.d = ty5.V;
        epsVar.c = r26.W;
        ArrayList arrayList = (ArrayList) epsVar.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((sv5) it.next()).b = null;
        }
        arrayList.clear();
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        cr crVar = new cr(getContext(), view);
        Context context = getContext();
        String str = this.k;
        String str2 = this.l;
        fnb m = this.g.m();
        eps epsVar = new eps();
        epsVar.b = new ArrayList();
        epsVar.c = r26.W;
        epsVar.d = ty5.V;
        epsVar.e = (z66) sk3.I(z66.class);
        epsVar.f = (hu5) sk3.I(hu5.class);
        epsVar.a = context;
        epsVar.g = new dn9(str, str2, m);
        this.m = epsVar;
        epsVar.d = this;
        epsVar.c = crVar;
        String str3 = this.k;
        z66 z66Var = (z66) epsVar.e;
        if (!z66Var.g()) {
            hld.I((Context) epsVar.a, z66Var);
            ((ty5) epsVar.d).e();
            return;
        }
        hu5 hu5Var = (hu5) epsVar.f;
        r26 r26Var = (r26) epsVar.c;
        Objects.requireNonNull(r26Var);
        sy5 sy5Var = new sy5(0, r26Var);
        sy5 sy5Var2 = new sy5(1, epsVar);
        he0 he0Var = new he0(19, epsVar);
        hu5Var.getClass();
        str3.getClass();
        x97.y(cmd.a, dm6.b(), null, new ov(sy5Var, hu5Var, str3, sy5Var2, he0Var, (Continuation) null, 12), 2);
    }

    @Override // defpackage.ty5
    public final void s(String str, String str2) {
        a0g.D(requireActivity(), str, str2);
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getN() {
        wjb wjbVar = wjb.ConcertScreen;
        hlb hlbVar = hlb.Fullscreen;
        glb glbVar = glb.Fullscreen;
        return new cvo(wjbVar, new dvo(""), new avo(pkb.Concert, this.k));
    }
}
