package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Alignment;
import com.yandex.go.slot.api.ui.SlotItemUiState$Body$Ellipsize;
import defpackage.sts0;
import defpackage.tls;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.utils.CustomImagePositionedSpan;

/* loaded from: classes12.dex */
public final class sts0 extends lys {
    public static final /* synthetic */ int U = 0;
    public final wls S;
    public qts0 T;

    public sts0(u3j u3jVar, wls wlsVar) {
        super(u3jVar);
        this.S = wlsVar;
        for (ListItemComponent listItemComponent : scc.g(u3jVar.b, u3jVar.c)) {
            listItemComponent.setLeadFrameMinimumWidth(0);
            listItemComponent.setLeadImagePadding(0);
            listItemComponent.setMinHeight(0);
            listItemComponent.trailFrame.setMinimumWidth(0);
            listItemComponent.trailFrame.setVisibility(8);
            listItemComponent.setVerticalPadding(0);
            listItemComponent.clearLeadView();
        }
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        d0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener, qts0] */
    @Override // defpackage.wys
    public final void c(Object obj) {
        z3j z3jVar = (z3j) obj;
        u3j u3jVar = (u3j) ((zo31) this.R);
        ListItemComponent listItemComponent = u3jVar.b;
        GoFrameLayout goFrameLayout = u3jVar.a;
        c0(listItemComponent, z3jVar.a);
        ListItemComponent listItemComponent2 = u3jVar.c;
        c0(listItemComponent2, z3jVar.b);
        int i = z3jVar.c;
        int i2 = z3jVar.d;
        ListItemComponent listItemComponent3 = u3jVar.b;
        TextView title = listItemComponent3.title();
        View view = this.a;
        title.setPaddingRelative(c.h(i, view), tje.u(i2, view.getContext()), title.getPaddingEnd(), title.getPaddingBottom());
        TextView subtitle = listItemComponent3.subtitle();
        subtitle.setPaddingRelative(tje.u(i, view.getContext()), subtitle.getPaddingTop(), subtitle.getPaddingEnd(), subtitle.getPaddingBottom());
        TextView title2 = listItemComponent2.title();
        title2.setPaddingRelative(title2.getPaddingStart(), tje.u(i2, view.getContext()), title2.getPaddingEnd(), title2.getPaddingBottom());
        CharSequence charSequence = z3jVar.a.a;
        final String str = z3jVar.e;
        if (str == null) {
            listItemComponent3.setTitleMovementMethod(null);
            u3jVar.d.setVisibility(8);
        } else {
            final SpannedString c = charSequence != null ? seb1.c(charSequence) : null;
            final Drawable t = vng.t(b2h0.ic_outline_detailed_price_info, view.getContext());
            if (t != null) {
                final CustomImagePositionedSpan customImagePositionedSpan = new CustomImagePositionedSpan(t, 0);
                d0();
                f0(c, str, customImagePositionedSpan, t, tje.L(view.getContext()));
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.detailed_price.ui.adapter.SlotLineViewHolder$getOnAttachStateChangeListener$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View p0) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                        sts0 sts0Var = sts0.this;
                        int i3 = sts0.U;
                        sts0Var.d0();
                    }
                });
                listItemComponent3.setTitleMovementMethod(LinkMovementMethod.getInstance());
                ?? r8 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: qts0
                    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                    public final void onTouchExplorationStateChanged(boolean z) {
                        sts0.this.f0(c, str, customImagePositionedSpan, t, z);
                    }
                };
                this.T = r8;
                tje.B(listItemComponent3.getContext()).addTouchExplorationStateChangeListener(r8);
            }
        }
        goFrameLayout.setContentDescription(z3jVar.g);
        goFrameLayout.setImportantForAccessibility(1);
        listItemComponent3.setImportantForAccessibility(2);
        listItemComponent2.setImportantForAccessibility(2);
        listItemComponent3.title().setImportantForAccessibility(2);
        b.q(view, z3jVar.f);
    }

    public final void c0(ListItemComponent listItemComponent, bss0 bss0Var) {
        int i;
        int i2;
        int i3;
        zo31 zo31Var = (zo31) this.R;
        if (bss0Var == null) {
            listItemComponent.setVisibility(8);
            return;
        }
        ass0 ass0Var = bss0Var.g;
        int i4 = 0;
        listItemComponent.setVisibility(0);
        CharSequence charSequence = bss0Var.a;
        listItemComponent.setTitle(charSequence != null ? seb1.c(charSequence) : null);
        listItemComponent.setTitleTextColor(bss0Var.b);
        Integer num = bss0Var.c;
        listItemComponent.setTitleTextSizePx(num != null ? num.intValue() : (int) c.F(13.0f, ((u3j) zo31Var).a));
        SlotItemUiState$Body$Alignment slotItemUiState$Body$Alignment = ass0Var.a;
        int[] iArr = rts0.a;
        int i5 = iArr[slotItemUiState$Body$Alignment.ordinal()];
        if (i5 == 1) {
            i = 0;
        } else if (i5 == 2) {
            i = 1;
        } else {
            if (i5 != 3) {
                w511.b();
                return;
            }
            i = 2;
        }
        listItemComponent.setTitleAlignment(i);
        SlotItemUiState$Body$Ellipsize slotItemUiState$Body$Ellipsize = ass0Var.d;
        int[] iArr2 = rts0.b;
        int i6 = iArr2[slotItemUiState$Body$Ellipsize.ordinal()];
        if (i6 == 1) {
            i2 = 2;
        } else if (i6 == 2) {
            i2 = 1;
        } else {
            if (i6 != 3) {
                w511.b();
                return;
            }
            i2 = 0;
        }
        listItemComponent.setTitleEllipsizeMode(i2);
        CharSequence charSequence2 = bss0Var.d;
        listItemComponent.setSubtitle(charSequence2 != null ? seb1.c(charSequence2) : null);
        listItemComponent.setSubtitleTextColor(bss0Var.e);
        Integer num2 = bss0Var.f;
        listItemComponent.setSubtitleTextSizePx(num2 != null ? num2.intValue() : (int) c.F(13.0f, ((u3j) zo31Var).a));
        int i7 = iArr[ass0Var.a.ordinal()];
        if (i7 == 1) {
            i3 = 0;
        } else if (i7 == 2) {
            i3 = 1;
        } else {
            if (i7 != 3) {
                w511.b();
                return;
            }
            i3 = 2;
        }
        listItemComponent.setSubtitleAlignment(i3);
        int i8 = iArr2[ass0Var.e.ordinal()];
        if (i8 == 1) {
            i4 = 2;
        } else if (i8 == 2) {
            i4 = 1;
        } else if (i8 != 3) {
            w511.b();
            return;
        }
        listItemComponent.setSubTitleEllipsizeMode(i4);
    }

    public final void d0() {
        qts0 qts0Var = this.T;
        if (qts0Var != null) {
            tje.B(((u3j) ((zo31) this.R)).a.getContext()).removeTouchExplorationStateChangeListener(qts0Var);
            this.T = null;
        }
    }

    public final void e0(CustomImagePositionedSpan customImagePositionedSpan, Drawable drawable, View view, String str) {
        int paddingStart = view.getPaddingStart() + customImagePositionedSpan.getPosition().x;
        int paddingTop = view.getPaddingTop() + customImagePositionedSpan.getPosition().y;
        Rect rect = new Rect(paddingStart, paddingTop, drawable.getIntrinsicWidth() + paddingStart, drawable.getIntrinsicHeight() + paddingTop);
        u3j u3jVar = (u3j) ((zo31) this.R);
        Space space = u3jVar.d;
        space.setLayoutParams(new FrameLayout.LayoutParams(rect.width(), 0));
        space.setTranslationX(rect.left);
        space.setTranslationY(rect.top - tje.u(2, space.getContext()));
        space.setVisibility(4);
        this.S.invoke(u3jVar.d, str);
    }

    public final void f0(SpannedString spannedString, String str, CustomImagePositionedSpan customImagePositionedSpan, Drawable drawable, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) spannedString);
        spannableStringBuilder.append((CharSequence) " ");
        final ycm0 ycm0Var = z ? null : new ycm0(this, customImagePositionedSpan, drawable, str);
        ClickableSpan clickableSpan = ycm0Var != null ? new ClickableSpan() { // from class: ru.yandex.taxi.utils.SpanUtilsKt$appendClickablePositionedImage$clickableSpan$1$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                tls.this.invoke(widget);
            }
        } : null;
        int length = spannableStringBuilder.length();
        if (clickableSpan != null) {
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(clickableSpan, length2, spannableStringBuilder.length(), 17);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
        }
        spannableStringBuilder.setSpan(customImagePositionedSpan, length, spannableStringBuilder.length(), 17);
        SpannedString spannedString2 = new SpannedString(spannableStringBuilder);
        ListItemComponent listItemComponent = ((u3j) ((zo31) this.R)).b;
        listItemComponent.setTitle(spannedString2);
        if (z) {
            c.z(new npb(this, customImagePositionedSpan, drawable, listItemComponent, str, 9), listItemComponent.title());
        } else {
            listItemComponent.title().setOnClickListener(null);
        }
    }
}
