package defpackage;

import android.text.Editable;

/* loaded from: classes.dex */
public final class v3b extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile v3b b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new f4r(cls, charSequence) : super.newEditable(charSequence);
    }
}
