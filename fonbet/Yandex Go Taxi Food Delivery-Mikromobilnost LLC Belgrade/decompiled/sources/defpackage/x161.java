package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.widgets.common.bottombar.BottomBarTabView;

/* loaded from: classes4.dex */
public final class x161 implements zo31 {
    public final BottomBarTabView a;
    public final ImageView b;
    public final TextView c;

    public x161(BottomBarTabView bottomBarTabView, ImageView imageView, TextView textView) {
        this.a = bottomBarTabView;
        this.b = imageView;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
