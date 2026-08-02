package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.widgets.common.SignOutButton;

/* loaded from: classes4.dex */
public final class q861 implements zo31 {
    public final SignOutButton a;
    public final AppCompatImageView b;
    public final TextView c;

    public q861(SignOutButton signOutButton, AppCompatImageView appCompatImageView, TextView textView) {
        this.a = signOutButton;
        this.b = appCompatImageView;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
