package ru.yandex.music.catalog.juicybottommenu.adapter.holders;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.connectsdk.service.DeviceService;
import defpackage.ern;
import defpackage.f1d;
import defpackage.hy7;
import defpackage.l1j;
import defpackage.q13;
import defpackage.ql;
import defpackage.s13;
import defpackage.s9f;
import defpackage.w8f;
import defpackage.weo;
import defpackage.yxm;
import ru.yandex.music.R;
import ru.yandex.music.ui.view.EllipsizingTextView;

/* loaded from: classes4.dex */
public final class b extends s13 {
    public static final /* synthetic */ s9f[] x = {new yxm(b.class, DeviceService.KEY_DESC, "getDescription()Lru/yandex/music/ui/view/EllipsizingTextView;", 0), f1d.c(ern.a, b.class, "container", "getContainer()Landroid/widget/FrameLayout;", 0)};
    public final q13 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ViewGroup viewGroup, w8f w8fVar) {
        super(viewGroup, R.layout.item_juicy_description_menu);
        w8fVar.getClass();
        View view = this.a;
        view.getClass();
        q13 q13Var = new q13(new ql(view, 20));
        this.w = q13Var;
        View view2 = this.a;
        view2.getClass();
        s9f[] s9fVarArr = x;
        s9f s9fVar = s9fVarArr[1];
        s9fVar.getClass();
        try {
            View findViewById = view2.findViewById(R.id.catalog_description_container);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
            ((FrameLayout) findViewById).setOnClickListener(new hy7(0, w8fVar));
            EllipsizingTextView ellipsizingTextView = (EllipsizingTextView) q13Var.a(s9fVarArr[0]);
            Context context = this.u;
            context.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "... ");
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(weo.M(context, android.R.attr.textColorLink));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(context.getText(R.string.expand_more));
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            ellipsizingTextView.setEllipsisText(new SpannedString(spannableStringBuilder));
        } catch (ClassCastException e) {
            l1j.n(f1d.f("Invalid view binding (see cause) for ", s9fVar), e);
            throw null;
        }
    }

    @Override // defpackage.s13
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void e(String str) {
        str.getClass();
        super.e(str);
        ((EllipsizingTextView) this.w.a(x[0])).setText(str);
    }
}
