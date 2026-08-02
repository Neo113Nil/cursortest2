package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.a;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import ru.yandex.music.R;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes6.dex */
public class f6w extends bf6 {
    public g6w k;
    public vos l;

    public static f6w B(x7c x7cVar, mrr mrrVar, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("arg_topic", x7cVar);
        bundle.putSerializable("arg_source", mrrVar);
        bundle.putString("arg_initial_message", str);
        bundle.putString("arg_payload", str2);
        bundle.putString("arg_hint_text", str3);
        f6w f6wVar = new f6w();
        f6wVar.setArguments(bundle);
        return f6wVar;
    }

    public final void D(bf6 bf6Var) {
        y supportFragmentManager = ((t) Preconditions.nonNull(l())).getSupportFragmentManager();
        a l = su4.l(supportFragmentManager, supportFragmentManager);
        l.g(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_right, R.anim.slide_out_left);
        l.e(R.id.content_frame, bf6Var, null);
        l.c(null);
        l.j();
    }

    @Override // defpackage.bf6, defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.k = new g6w(getContext());
        Bundle bundle2 = (Bundle) Preconditions.nonNull(getArguments());
        g6w g6wVar = this.k;
        x7c x7cVar = (x7c) Preconditions.nonNull(bundle2.getSerializable("arg_topic"));
        mrr mrrVar = (mrr) Preconditions.nonNull(bundle2.getSerializable("arg_source"));
        String string = bundle2.getString("arg_initial_message");
        String string2 = bundle2.getString("arg_payload");
        String string3 = bundle2.getString("arg_hint_text");
        g6wVar.e = x7cVar;
        g6wVar.f = mrrVar;
        Context context = g6wVar.a;
        x7cVar.getClass();
        context.getClass();
        Integer num = x7cVar.c;
        g6wVar.j = num != null ? context.getString(num.intValue()) : null;
        g6wVar.g = string;
        g6wVar.h = string2;
        g6wVar.i = string3;
    }

    @Override // androidx.fragment.app.o
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        ((vos) Preconditions.nonNull(this.l)).a(menu);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_write_feedback, viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        g6w g6wVar = (g6w) Preconditions.nonNull(this.k);
        String obj = ((i6w) Preconditions.nonNull(g6wVar.c)).b.getText().toString();
        if (!obj.equals(g6wVar.j)) {
            orr orrVar = g6wVar.b;
            x7c x7cVar = (x7c) Preconditions.nonNull(g6wVar.e);
            orrVar.getClass();
            x7cVar.getClass();
            orrVar.a().edit().putString(x7cVar.name(), obj).apply();
        }
        g6wVar.c = null;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((g6w) Preconditions.nonNull(this.k)).d = this;
        this.l = new vos((hq0) Preconditions.nonNull((hq0) l()));
        g6w g6wVar = (g6w) Preconditions.nonNull(this.k);
        i6w i6wVar = new i6w(view, this.l);
        g6wVar.c = i6wVar;
        i6wVar.f = new f4m(25, g6wVar);
        x7c x7cVar = (x7c) Preconditions.nonNull(g6wVar.e);
        String str = g6wVar.g;
        if (str == null) {
            orr orrVar = g6wVar.b;
            orrVar.getClass();
            x7cVar.getClass();
            str = orrVar.a().getString(x7cVar.name(), null);
            if (str == null) {
                str = g6wVar.j;
            }
        }
        i6w i6wVar2 = g6wVar.c;
        String str2 = g6wVar.i;
        lum lumVar = i6wVar2.e;
        EditText editText = i6wVar2.b;
        vos vosVar = i6wVar2.d;
        Context context = i6wVar2.c;
        x7cVar.getClass();
        context.getClass();
        String string = context.getString(x7cVar.a);
        string.getClass();
        qd supportActionBar = vosVar.a.getSupportActionBar();
        Assertions.assertNonNull(supportActionBar, "setSubtitle(): actionBar is null");
        if (supportActionBar != null) {
            supportActionBar.q(string);
        }
        qd supportActionBar2 = vosVar.a.getSupportActionBar();
        Assertions.assertNonNull(supportActionBar2, "showToolbar(): actionBar is null");
        if (supportActionBar2 != null) {
            supportActionBar2.u();
        }
        TextView textView = i6wVar2.a;
        Integer num = x7cVar.b;
        sht.d(textView, num != null ? context.getString(num.intValue()) : null);
        if (!y7g.G(str2)) {
            editText.setHint(str2);
        }
        if (str == null) {
            str = "";
        }
        editText.setText(str);
        editText.setSelection(editText.length());
        editText.requestFocus();
        Context context2 = editText.getContext();
        context2.getClass();
        c3x.S(editText, context2);
        x7c.d.getClass();
        boolean contains = u75.d(x7c.SUBSCRIPTION, x7c.NO_ARTIST_TRACKS, x7c.CONTENT_PROBLEM, x7c.APP_PROBLEM, x7c.ENHANCEMENT, x7c.ANOTHER).contains(x7cVar);
        lumVar.getClass();
        int i = 1;
        lumVar.h0(new o37(lumVar, h6w.NEXT_STEP, contains, i));
        lumVar.h0(new o37(lumVar, h6w.SEND, !contains, i));
    }
}
