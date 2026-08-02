package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public class hmr extends bf6 {
    public final void B() {
        o instantiate = o.instantiate(getContext(), getArguments().getString("restoreFragClass", null));
        instantiate.setArguments(getArguments().getBundle("restoreFragArgs"));
        String string = getArguments().getString("restoreFragTag");
        y fragmentManager = getFragmentManager();
        int id = getId();
        if (fragmentManager != null) {
            a aVar = new a(fragmentManager);
            aVar.e(id, instantiate, string);
            try {
                aVar.k(true, true);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final void D(int i, String str, String str2, Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle(4);
            setArguments(arguments);
        }
        arguments.putInt("title", i);
        arguments.putString("restoreFragClass", str);
        arguments.putString("restoreFragTag", str2);
        arguments.putBundle("restoreFragArgs", bundle);
    }

    @Override // androidx.fragment.app.o
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        int i = getArguments().getInt("title");
        if (toolbar != null) {
            if (i == -1) {
                jyr jyrVar = sht.a;
                toolbar.setVisibility(8);
            } else if (i != 0) {
                toolbar.setTitle(i);
            } else {
                toolbar.setTitle("");
            }
            ((hq0) l()).setSupportActionBar(toolbar);
            qdq.d(toolbar, false, true, false, false);
        }
    }
}
