package kotlin.text;

import android.text.Editable;

/* loaded from: classes.dex */
public final class CatchingFishMVIIntent extends Editable.Factory {
    public static Class CatchingFishCoroutine;
    public static final Object CatchingFishParcelableFAB = new Object();
    public static volatile CatchingFishMVIIntent CatchingFishSnackbar;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = CatchingFishCoroutine;
        return cls != null ? new CatchingFishCustomViewJUnit(cls, charSequence) : super.newEditable(charSequence);
    }
}
