package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public class o30 {
    public final k30 a;
    public final int b;

    public o30(@NonNull Context context, int i) {
        this.a = new k30(new ContextThemeWrapper(context, p30.e(context, i)));
        this.b = i;
    }

    public final void a(int i) {
        k30 k30Var = this.a;
        k30Var.f = k30Var.a.getText(i);
    }

    public final void b(int i) {
        k30 k30Var = this.a;
        k30Var.d = k30Var.a.getText(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @NonNull
    public p30 create() {
        k30 k30Var = this.a;
        p30 p30Var = new p30(k30Var.a, this.b);
        View view = k30Var.e;
        n30 n30Var = p30Var.f;
        if (view != null) {
            n30Var.w = view;
        } else {
            CharSequence charSequence = k30Var.d;
            if (charSequence != null) {
                n30Var.d = charSequence;
                TextView textView = n30Var.u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = k30Var.c;
            if (drawable != null) {
                n30Var.s = drawable;
                ImageView imageView = n30Var.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    n30Var.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = k30Var.f;
        if (charSequence2 != null) {
            n30Var.e = charSequence2;
            TextView textView2 = n30Var.v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = k30Var.g;
        if (charSequence3 != null) {
            n30Var.c(-1, charSequence3, k30Var.h);
        }
        CharSequence charSequence4 = k30Var.i;
        if (charSequence4 != null) {
            n30Var.c(-2, charSequence4, k30Var.j);
        }
        CharSequence charSequence5 = k30Var.k;
        if (charSequence5 != null) {
            n30Var.c(-3, charSequence5, k30Var.l);
        }
        if (k30Var.p != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) k30Var.b.inflate(n30Var.A, (ViewGroup) null);
            int i = k30Var.s ? n30Var.B : n30Var.C;
            Object obj = k30Var.p;
            ?? r8 = obj;
            if (obj == null) {
                r8 = new m30(k30Var.a, i, R.id.text1, null);
            }
            n30Var.x = r8;
            n30Var.y = k30Var.t;
            if (k30Var.q != null) {
                alertController$RecycleListView.setOnItemClickListener(new j30(0, k30Var, n30Var));
            }
            if (k30Var.s) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            n30Var.f = alertController$RecycleListView;
        }
        View view2 = k30Var.r;
        if (view2 != null) {
            n30Var.g = view2;
            n30Var.h = false;
        }
        p30Var.setCancelable(k30Var.m);
        if (k30Var.m) {
            p30Var.setCanceledOnTouchOutside(true);
        }
        p30Var.setOnCancelListener(k30Var.n);
        p30Var.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = k30Var.o;
        if (onKeyListener != null) {
            p30Var.setOnKeyListener(onKeyListener);
        }
        return p30Var;
    }

    @NonNull
    public Context getContext() {
        return this.a.a;
    }

    public o30 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        k30 k30Var = this.a;
        k30Var.i = k30Var.a.getText(i);
        k30Var.j = onClickListener;
        return this;
    }

    public o30 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        k30 k30Var = this.a;
        k30Var.g = k30Var.a.getText(i);
        k30Var.h = onClickListener;
        return this;
    }

    public o30 setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public o30 setView(View view) {
        this.a.r = view;
        return this;
    }

    public o30(Context context) {
        this(context, p30.e(context, 0));
    }
}
