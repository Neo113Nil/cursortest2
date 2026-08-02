package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.a;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class kl2 extends ll2 {
    public final View A;
    public final /* synthetic */ ol2 B;
    public final Function2 v;
    public final ImageView w;
    public final TextView x;
    public final ImageView y;
    public final View z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl2(ol2 ol2Var, View view, Function2 function2) {
        super(view);
        view.getClass();
        function2.getClass();
        this.B = ol2Var;
        this.v = function2;
        this.w = (ImageView) t(R.id.paymentsdk_bank_icon);
        this.x = (TextView) t(R.id.paymentsdk_bank_title);
        this.y = (ImageView) t(R.id.paymentsdk_bank_radio_button);
        this.z = t(R.id.paymentsdk_bank_container);
        this.A = t(R.id.paymentsdk_bank_divider);
    }

    @Override // defpackage.ll2
    public final void u(int i) {
        ol2 ol2Var = this.B;
        hl2 hl2Var = (hl2) ol2Var.g.get(i);
        this.z.setOnClickListener(new jl2(0, this, ol2Var, hl2Var));
        this.A.setVisibility(ol2Var.c() + (-1) != i ? 0 : 8);
        boolean z = ol2Var.h == i;
        boolean z2 = hl2Var instanceof fl2;
        TextView textView = this.x;
        ImageView imageView = this.w;
        if (z2) {
            b1o c = a.c(imageView.getContext());
            c.getClass();
            c.j(new z0o(imageView, 0));
            PackageManager packageManager = this.a.getContext().getPackageManager();
            ResolveInfo resolveInfo = ((fl2) hl2Var).g;
            imageView.setImageDrawable(resolveInfo.activityInfo.loadIcon(packageManager));
            textView.setText(resolveInfo.activityInfo.loadLabel(packageManager));
        } else if (hl2Var instanceof gl2) {
            textView.setText(hl2Var.a);
            b1o c2 = a.c(imageView.getContext());
            Uri uri = ((gl2) hl2Var).g;
            c2.getClass();
            ((k0o) new k0o(c2.a, c2, Drawable.class, c2.b).H(uri).g()).F(imageView);
        }
        ImageView imageView2 = this.y;
        imageView2.setVisibility(0);
        imageView2.setSelected(z);
    }
}
