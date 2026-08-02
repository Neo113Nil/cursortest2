package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class whk implements adu {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public whk(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
    }

    public static whk a(View view) {
        int i = R.id.brandIcon;
        ImageView imageView = (ImageView) dag.v(R.id.brandIcon, view);
        if (imageView != null) {
            i = R.id.confirmButton;
            TextView textView = (TextView) dag.v(R.id.confirmButton, view);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.exitButtonsContainer;
                if (((LinearLayout) dag.v(R.id.exitButtonsContainer, view)) != null) {
                    i = R.id.headerLayout;
                    if (((FrameLayout) dag.v(R.id.headerLayout, view)) != null) {
                        i = R.id.hideButton;
                        TextView textView2 = (TextView) dag.v(R.id.hideButton, view);
                        if (textView2 != null) {
                            i = R.id.iconImageView;
                            if (((ImageView) dag.v(R.id.iconImageView, view)) != null) {
                                i = R.id.titleConfirmExitTextView;
                                TextView textView3 = (TextView) dag.v(R.id.titleConfirmExitTextView, view);
                                if (textView3 != null) {
                                    return new whk(constraintLayout, imageView, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
