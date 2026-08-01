package B0;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.C0160a;
import h.C0161b;
import h.C0163d;
import h.C0164e;
import h.DialogInterfaceC0165f;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class g implements P.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f46a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f47b;

    public g(Context context) {
        int i = DialogInterfaceC0165f.i(context, 0);
        this.f47b = new C0161b(new ContextThemeWrapper(context, DialogInterfaceC0165f.i(context, i)));
        this.f46a = i;
    }

    @Override // P.o
    public boolean a(View view) {
        ((BottomSheetBehavior) this.f47b).H(this.f46a);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0165f b() {
        C0161b c0161b = (C0161b) this.f47b;
        DialogInterfaceC0165f dialogInterfaceC0165f = new DialogInterfaceC0165f(c0161b.f3179a, this.f46a);
        View view = c0161b.e;
        C0164e c0164e = dialogInterfaceC0165f.f3207f;
        if (view != null) {
            c0164e.f3197n = view;
        } else {
            CharSequence charSequence = c0161b.f3182d;
            if (charSequence != null) {
                c0164e.f3190d = charSequence;
                TextView textView = c0164e.f3195l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0161b.f3181c;
            if (drawable != null) {
                c0164e.j = drawable;
                ImageView imageView = c0164e.f3194k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0164e.f3194k.setImageDrawable(drawable);
                }
            }
        }
        if (c0161b.f3184g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0161b.f3180b.inflate(c0164e.f3201r, (ViewGroup) null);
            int i = c0161b.i ? c0164e.f3202s : c0164e.f3203t;
            Object obj = c0161b.f3184g;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0163d(c0161b.f3179a, i, R.id.text1, null);
            }
            c0164e.f3198o = r7;
            c0164e.f3199p = c0161b.j;
            if (c0161b.f3185h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0160a(c0161b, c0164e));
            }
            if (c0161b.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0164e.e = alertController$RecycleListView;
        }
        dialogInterfaceC0165f.setCancelable(true);
        dialogInterfaceC0165f.setCanceledOnTouchOutside(true);
        dialogInterfaceC0165f.setOnCancelListener(null);
        dialogInterfaceC0165f.setOnDismissListener(null);
        l.n nVar = c0161b.f3183f;
        if (nVar != null) {
            dialogInterfaceC0165f.setOnKeyListener(nVar);
        }
        return dialogInterfaceC0165f;
    }

    public g() {
        this.f46a = 1;
        this.f47b = Collections.singletonList(null);
    }

    public g(ArrayList arrayList) {
        this.f46a = 0;
        this.f47b = arrayList;
    }

    public g(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f47b = bottomSheetBehavior;
        this.f46a = i;
    }
}
