package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import ru.yandex.music.R;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes6.dex */
public class t46 extends bf6 {
    public u46 k;
    public vos l;

    @Override // defpackage.bf6, defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.k = new u46();
        Bundle bundle2 = (Bundle) Preconditions.nonNull(getArguments());
        u46 u46Var = this.k;
        x7c x7cVar = (x7c) Preconditions.nonNull((x7c) bundle2.getSerializable("atg_topic"));
        mrr mrrVar = (mrr) Preconditions.nonNull((mrr) bundle2.getSerializable("arg_source"));
        String str = (String) Preconditions.nonNull(bundle2.getString("arg_message"));
        String string = bundle2.getString("arg_payload");
        u46Var.c = x7cVar;
        u46Var.d = mrrVar;
        u46Var.e = str;
        u46Var.f = string;
    }

    @Override // androidx.fragment.app.o
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        ((vos) Preconditions.nonNull(this.l)).a(menu);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_confirm_email, viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        ((u46) Preconditions.nonNull(this.k)).getClass();
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        ((u46) Preconditions.nonNull(this.k)).a = null;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((u46) Preconditions.nonNull(this.k)).b = this;
        this.l = new vos((hq0) Preconditions.nonNull((hq0) l()));
        u46 u46Var = (u46) Preconditions.nonNull(this.k);
        x46 x46Var = new x46(view, this.l);
        u46Var.a = x46Var;
        x46Var.f = new znk(18, u46Var);
        x7c x7cVar = u46Var.c;
        if (x7cVar != null) {
            x7c x7cVar2 = (x7c) Preconditions.nonNull(x7cVar);
            String str = u46Var.g;
            x7cVar2.getClass();
            Context context = x46Var.c;
            context.getClass();
            String string = context.getString(x7cVar2.a);
            string.getClass();
            vos vosVar = x46Var.d;
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
            if (str == null) {
                str = "";
            }
            EditText editText = x46Var.a;
            editText.setText(str);
            jyr jyrVar = sht.a;
            editText.setSelection(editText.length());
            editText.requestFocus();
            c3x.S(editText, context);
            x46Var.b.setChecked(false);
        }
    }
}
