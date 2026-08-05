package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hd0 {
    public final View MdtA4re8;
    public final Object NCTxEWno;
    public final Object P7K7Inc8;
    public final Object VgvYg0wo;
    public final Object b2ZJblxo;
    public final TextView qoPGr6Ce;
    public final Object wxUZMvaN;

    public hd0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.wxUZMvaN = layoutParams;
        this.VgvYg0wo = new Rect();
        this.P7K7Inc8 = new int[2];
        this.b2ZJblxo = new int[2];
        this.NCTxEWno = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.MdtA4re8 = inflate;
        this.qoPGr6Ce = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(hd0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public /* synthetic */ hd0(ViewGroup viewGroup, TextView textView, TextView textView2, TextView textView3, View view, View view2, TextView textView4) {
        this.NCTxEWno = viewGroup;
        this.qoPGr6Ce = textView;
        this.MdtA4re8 = textView2;
        this.wxUZMvaN = textView3;
        this.VgvYg0wo = view;
        this.P7K7Inc8 = view2;
        this.b2ZJblxo = textView4;
    }

    public hd0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, RecyclerView recyclerView, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, TextView textView2, TextView textView3) {
        this.NCTxEWno = imageView;
        this.qoPGr6Ce = textView;
        this.MdtA4re8 = recyclerView;
        this.wxUZMvaN = appCompatButton;
        this.VgvYg0wo = appCompatButton2;
        this.P7K7Inc8 = textView2;
        this.b2ZJblxo = textView3;
    }

    public hd0(ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView2, TextView textView3, TextView textView4, RecyclerView recyclerView3) {
        this.qoPGr6Ce = textView;
        this.NCTxEWno = recyclerView;
        this.MdtA4re8 = recyclerView2;
        this.wxUZMvaN = textView2;
        this.VgvYg0wo = textView3;
        this.P7K7Inc8 = textView4;
        this.b2ZJblxo = recyclerView3;
    }
}
