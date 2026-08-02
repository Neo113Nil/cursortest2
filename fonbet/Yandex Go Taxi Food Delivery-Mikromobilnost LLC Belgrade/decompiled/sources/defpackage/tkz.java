package defpackage;

import android.content.ClipboardManager;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;

/* loaded from: classes2.dex */
public final class tkz extends y {
    public tkz() {
        super(qkz.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        skz skzVar = (skz) x0Var;
        View view = skzVar.a;
        bb1.L(view, new nl(8, (ClipboardManager) view.getContext().getSystemService(ClipboardManager.class), this, skzVar));
        hdd0 hdd0Var = (hdd0) getItem(i);
        TextView textView = (TextView) skzVar.N.a(skz.O[0]);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) ugb1.c(hdd0Var.b, view.getContext()));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) hdd0Var.d);
        Throwable th = hdd0Var.e;
        if (th != null) {
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) ljo.b(th));
        }
        textView.setText(new SpannedString(spannableStringBuilder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new skz(LayoutInflater.from(viewGroup.getContext()).inflate(gmh0.pay_sdk_item_log_entry, viewGroup, false));
    }
}
