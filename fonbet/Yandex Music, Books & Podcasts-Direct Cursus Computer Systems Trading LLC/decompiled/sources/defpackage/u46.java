package defpackage;

import android.util.Patterns;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes6.dex */
public final class u46 {
    public x46 a;
    public t46 b;
    public x7c c;
    public mrr d;
    public String e;
    public String f;
    public final String g = v3g.E((frt) sk3.I(frt.class)).c;

    public static boolean a(u46 u46Var) {
        return !((x46) Preconditions.nonNull(u46Var.a)).b.isChecked() || Patterns.EMAIL_ADDRESS.matcher(((x46) Preconditions.nonNull(u46Var.a)).a.getText().toString()).matches();
    }
}
