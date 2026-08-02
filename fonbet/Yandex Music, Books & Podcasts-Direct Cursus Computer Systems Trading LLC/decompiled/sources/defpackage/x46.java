package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.util.EnumSet;
import java.util.HashMap;
import ru.yandex.music.R;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes6.dex */
public final class x46 {
    public final EditText a;
    public final SwitchCompat b;
    public final Context c;
    public final vos d;
    public final lum e;
    public znk f;

    public x46(View view, vos vosVar) {
        EditText editText = (EditText) view.findViewById(R.id.input_email);
        this.a = editText;
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.switcher_need_answer);
        this.b = switchCompat;
        editText.addTextChangedListener(new v46(0, this));
        switchCompat.setOnCheckedChangeListener(new mj4(1, this));
        this.c = view.getContext();
        this.d = vosVar;
        jj4 jj4Var = new jj4(12);
        int[] iArr = {R.menu.single_text_action};
        vosVar.getClass();
        EnumSet allOf = EnumSet.allOf(w46.class);
        HashMap hashMap = vosVar.b;
        hashMap.remove(w46.class);
        uos uosVar = new uos(iArr, allOf, jj4Var);
        hashMap.put(w46.class, uosVar);
        hq0 hq0Var = vosVar.a;
        hq0Var.invalidateOptionsMenu();
        lum lumVar = uosVar.b;
        this.e = lumVar;
        qd supportActionBar = hq0Var.getSupportActionBar();
        Assertions.assertNonNull(supportActionBar, "setTitle(): actionBar is null");
        if (supportActionBar != null) {
            supportActionBar.r(R.string.feedback_subject_title);
        }
        lumVar.h0(new he0(20, this));
        lumVar.j0(new n(17, this));
    }
}
