package defpackage;

import android.os.Bundle;
import com.yandex.go.taxi.order.porch.PorchFragment;

/* loaded from: classes14.dex */
public final class yae0 {
    public static PorchFragment a(String str, String str2, boolean z) {
        PorchFragment porchFragment = new PorchFragment();
        Bundle bundle = new Bundle(3);
        bundle.putString("comment", str);
        bundle.putString("porch", str2);
        bundle.putBoolean("is_letter_allow", z);
        porchFragment.setArguments(bundle);
        return porchFragment;
    }
}
