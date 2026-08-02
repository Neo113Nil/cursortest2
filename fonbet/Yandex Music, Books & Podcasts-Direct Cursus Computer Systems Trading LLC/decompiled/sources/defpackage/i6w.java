package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.EnumSet;
import java.util.HashMap;
import ru.yandex.music.R;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes6.dex */
public final class i6w {
    public final TextView a;
    public final EditText b;
    public final Context c;
    public final vos d;
    public final lum e;
    public f4m f;

    public i6w(View view, vos vosVar) {
        this.a = (TextView) view.findViewById(R.id.text_view_description);
        EditText editText = (EditText) view.findViewById(R.id.input_message);
        this.b = editText;
        editText.addTextChangedListener(new v46(1, this));
        this.c = view.getContext();
        this.d = vosVar;
        tiu tiuVar = new tiu(5);
        int[] iArr = {R.menu.write_feedback_message};
        vosVar.getClass();
        EnumSet allOf = EnumSet.allOf(h6w.class);
        HashMap hashMap = vosVar.b;
        hashMap.remove(h6w.class);
        uos uosVar = new uos(iArr, allOf, tiuVar);
        hashMap.put(h6w.class, uosVar);
        hq0 hq0Var = vosVar.a;
        hq0Var.invalidateOptionsMenu();
        lum lumVar = uosVar.b;
        this.e = lumVar;
        qd supportActionBar = hq0Var.getSupportActionBar();
        Assertions.assertNonNull(supportActionBar, "setTitle(): actionBar is null");
        if (supportActionBar != null) {
            supportActionBar.r(R.string.feedback_subject_title);
        }
        lumVar.h0(new bhp(23, this));
        lumVar.j0(new tot(10, this));
    }

    public final TextView a(h6w h6wVar) {
        Object obj = ((HashMap) this.e.a).get(h6wVar);
        Assertions.assertNonNull(obj, "getItemView() called before fill()");
        return (TextView) ((MenuItem) Preconditions.nonNull((MenuItem) obj)).getActionView();
    }
}
