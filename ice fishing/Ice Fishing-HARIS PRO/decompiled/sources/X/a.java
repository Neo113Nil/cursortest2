package X;

import V.v;
import android.text.Editable;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1374a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f1375b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f1376c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f1376c;
        return cls != null ? new v(cls, charSequence) : super.newEditable(charSequence);
    }
}
