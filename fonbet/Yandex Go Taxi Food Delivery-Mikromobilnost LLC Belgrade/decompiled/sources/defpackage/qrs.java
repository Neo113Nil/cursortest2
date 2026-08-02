package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.yandex.alicekit.core.json.schema.HtmlString;
import com.yandex.alicekit.core.views.EllipsizingTextView;
import com.yandex.div.legacy.view.DivView;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class qrs extends RecyclerView.Adapter {
    public final DivView a;
    public final rrk b;
    public int c = -1;
    public final /* synthetic */ trs w;

    public qrs(trs trsVar, DivView divView, rrk rrkVar) {
        this.w = trsVar;
        this.a = divView;
        this.b = rrkVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        rrk rrkVar = this.b;
        int size = rrkVar.y.size();
        return rrkVar.C == null ? size : size + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i < this.b.y.size() ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0186  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(x0 x0Var, int i) {
        Drawable drawable;
        ViewGroup.LayoutParams layoutParams;
        rrs rrsVar = (rrs) x0Var;
        int itemViewType = getItemViewType(i);
        rrk rrkVar = this.b;
        if (itemViewType == 0) {
            zjk zjkVar = (zjk) rrkVar.y.get(i);
            int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(atg0.div_gallery_horizontal_internal_item_padding);
            View view = rrsVar.a;
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.removeAllViews();
            cee ceeVar = rrsVar.Q.e;
            DivView divView = rrsVar.N;
            View b = ceeVar.b(divView, zjkVar, n15.a(rrsVar.O.e(), String.valueOf(i)));
            b5l b2 = zjkVar.F.b();
            if (b2 != null && "match_parent".equals(b2.a) && (layoutParams = view.getLayoutParams()) != null) {
                layoutParams.width = -1;
                view.setLayoutParams(layoutParams);
            }
            divView.setActionHandlerForView(view, (x3k) zjkVar.c);
            viewGroup.addView(b);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(b.getLayoutParams());
            layoutParams2.setMargins(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            b.setLayoutParams(layoutParams2);
            return;
        }
        apf apfVar = rrkVar.C;
        if (apfVar == null) {
            z83.j("Internal error, gallery tail is null");
            return;
        }
        HtmlString htmlString = (HtmlString) apfVar.w;
        trs trsVar = rrsVar.Q;
        DivView divView2 = rrsVar.N;
        View view2 = rrsVar.a;
        EllipsizingTextView ellipsizingTextView = (EllipsizingTextView) view2.findViewById(ogh0.div_gallery_tail_text);
        if (TextUtils.isEmpty(htmlString)) {
            ellipsizingTextView.setVisibility(8);
        } else {
            ellipsizingTextView.setVisibility(0);
            ellipsizingTextView.setText(htmlString);
            trsVar.d.d((String) apfVar.x).b(ellipsizingTextView);
            ellipsizingTextView.setTextAlignment(4);
        }
        divView2.setActionHandlerForView(view2, (x3k) apfVar.b);
        ImageView imageView = (ImageView) view2.findViewById(ogh0.div_gallery_tail_icon);
        qv4 qv4Var = (qv4) apfVar.c;
        Uri uri = (Uri) qv4Var.x;
        if (uri != null) {
            divView2.addLoadReference(trsVar.c.loadImage(uri.toString(), new zsk(1, new tpl(divView2, imageView, 2)), 0), imageView);
            return;
        }
        int i2 = qv4Var.c;
        int i3 = qv4Var.b;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        gradientDrawable.setDither(true);
        if (i3 != i2) {
            gradientDrawable.setStroke(rrsVar.P, i3);
        }
        imageView.setBackground(gradientDrawable);
        int i4 = qv4Var.w;
        Context context = divView2.getContext();
        int i5 = fzg0.div_gallery_tail_arrow;
        eu11.a.getClass();
        Drawable drawable2 = null;
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            drawable = vng.t(i5, context);
            if (drawable == null) {
                new Resources.NotFoundException(oyr.i(i5, "This should never happen "));
                i991.c();
            }
        } else {
            try {
                try {
                    Drawable drawable3 = context.getDrawable(i5);
                    if (drawable3 == null) {
                        throw new Resources.NotFoundException("ContextCompat returned null " + i5);
                    }
                    drawable = drawable3;
                } catch (Resources.NotFoundException unused) {
                    drawable = VectorDrawableCompat.create(context.getResources(), i5, context.getTheme());
                    if (drawable == null) {
                        try {
                            new Resources.NotFoundException("This should never happen " + i5);
                            i991.c();
                        } catch (Resources.NotFoundException unused2) {
                            new Resources.NotFoundException(oyr.i(i5, "Get resource as vector fallback failed "));
                            i991.c();
                            if (drawable == null) {
                            }
                            imageView.setImageDrawable(drawable2);
                        }
                    }
                }
            } catch (Resources.NotFoundException unused3) {
                drawable = null;
                new Resources.NotFoundException(oyr.i(i5, "Get resource as vector fallback failed "));
                i991.c();
                if (drawable == null) {
                }
                imageView.setImageDrawable(drawable2);
            }
        }
        if (drawable == null) {
            z83.j("Vector drawable parsing error");
        } else {
            drawable.mutate();
            drawable.setTint(i4);
            drawable.setTintMode(PorterDuff.Mode.SRC_IN);
            int dimensionPixelSize = divView2.getResources().getDimensionPixelSize(atg0.div_gallery_tail_arrow_size);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawable2 = drawable;
        }
        imageView.setImageDrawable(drawable2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        trs trsVar = this.w;
        View b = trsVar.b.b(i == 0 ? "GalleryDivViewBuilder.ITEM" : "GalleryDivViewBuilder.TAIL");
        int i2 = this.c;
        rrk rrkVar = this.b;
        if (i2 == -1) {
            Iterator it = rrkVar.y.iterator();
            n0l n0lVar = null;
            while (it.hasNext()) {
                n0l a = ((zjk) it.next()).D.a();
                if (n0lVar == null || (a != null && a.b > n0lVar.b)) {
                    n0lVar = a;
                }
            }
            if (n0lVar != null) {
                this.c = mj91.b(n0lVar, viewGroup.getResources().getDisplayMetrics());
            }
        }
        if (this.c > 0) {
            b.setLayoutParams(new ViewGroup.LayoutParams(-2, this.c));
        }
        return new rrs(trsVar, b, this.a, rrkVar);
    }
}
