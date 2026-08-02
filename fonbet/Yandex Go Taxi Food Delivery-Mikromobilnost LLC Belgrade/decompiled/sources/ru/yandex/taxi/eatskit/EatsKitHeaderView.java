package ru.yandex.taxi.eatskit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.cma1;
import defpackage.dcn;
import defpackage.dna;
import defpackage.evu0;
import defpackage.h1p;
import defpackage.jqr;
import defpackage.nrg0;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.rdh0;
import defpackage.tse;
import defpackage.vph0;
import defpackage.xng0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.eatskit.dto.ServiceHeaderMode;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000b*\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010#\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0015\u0010-\u001a\u00020\u000e8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0015\u0010/\u001a\u00020\u000e8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0015\u00103\u001a\u0002008Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0015\u00107\u001a\u0002048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0015\u00109\u001a\u00020\u000e8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010,R(\u0010@\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lru/yandex/taxi/eatskit/EatsKitHeaderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "serviceLogoColor", "Lzy11;", "applyTheme", "(I)V", "Landroidx/appcompat/widget/AppCompatTextView;", "resId", "setDimenTextSize", "(Landroidx/appcompat/widget/AppCompatTextView;I)V", "Lh1p;", Constants.KEY_SERVICE, "", "serviceName", "Lru/yandex/taxi/eatskit/dto/ServiceHeaderMode;", "serviceHeaderMode", "Lpwy0;", "themeSwitcherProvider", "Ltse;", "coroutineScope", "init$eatskit", "(Lh1p;Ljava/lang/CharSequence;Lru/yandex/taxi/eatskit/dto/ServiceHeaderMode;Lpwy0;Ltse;)V", "init", "title", "subtitle", "updateTitle$eatskit", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "updateTitle", "", BackendConfig.Restrictions.ENABLED, "setEnabled", "(Z)V", "Ldcn;", "binding", "Ldcn;", "getHeaderSubtitleView", "()Landroidx/appcompat/widget/AppCompatTextView;", "headerSubtitleView", "getHeaderTitleView", "headerTitleView", "Lcom/yandex/go/design/view/GoLinearLayout;", "getServiceLogoContainer", "()Lcom/yandex/go/design/view/GoLinearLayout;", "serviceLogoContainer", "Lcom/yandex/go/design/view/GoImageView;", "getServiceLogoView", "()Lcom/yandex/go/design/view/GoImageView;", "serviceLogoView", "getServiceNameView", "serviceNameView", "Landroid/graphics/drawable/Drawable;", "value", "getServiceLogo", "()Landroid/graphics/drawable/Drawable;", "setServiceLogo", "(Landroid/graphics/drawable/Drawable;)V", "serviceLogo", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EatsKitHeaderView extends FrameLayout {
    private final dcn binding;

    public EatsKitHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        LayoutInflater.from(context).inflate(vph0.eats_header_view, this);
        int i2 = rdh0.header_subtitle;
        AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i2, this);
        if (appCompatTextView != null) {
            i2 = rdh0.header_title;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i2, this);
            if (appCompatTextView2 != null && (O = cma1.O((i2 = rdh0.service_logo_container), this)) != null) {
                this.binding = new dcn(this, appCompatTextView, appCompatTextView2, dna.o(O));
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTheme(int serviceLogoColor) {
        setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        ((AppCompatTextView) this.binding.d.f).setTextColor(qje.t(serviceLogoColor, getContext()));
        CharSequence text = this.binding.b.getText();
        if (text == null || evu0.J(text)) {
            this.binding.c.setTextColor(qje.t(xng0.textMinor, getContext()));
        } else {
            this.binding.c.setTextColor(qje.t(xng0.textMain, getContext()));
            this.binding.b.setTextColor(qje.t(xng0.textMinor, getContext()));
        }
    }

    private final AppCompatTextView getHeaderSubtitleView() {
        return this.binding.b;
    }

    private final AppCompatTextView getHeaderTitleView() {
        return this.binding.c;
    }

    private final GoLinearLayout getServiceLogoContainer() {
        return (GoLinearLayout) this.binding.d.e;
    }

    private final GoImageView getServiceLogoView() {
        return (GoImageView) this.binding.d.c;
    }

    private final AppCompatTextView getServiceNameView() {
        return (AppCompatTextView) this.binding.d.f;
    }

    private final void setDimenTextSize(AppCompatTextView appCompatTextView, int i) {
        appCompatTextView.setTextSize(0, appCompatTextView.getResources().getDimensionPixelSize(i));
    }

    public static /* synthetic */ void updateTitle$eatskit$default(EatsKitHeaderView eatsKitHeaderView, CharSequence charSequence, CharSequence charSequence2, int i, Object obj) {
        if ((i & 2) != 0) {
            charSequence2 = null;
        }
        eatsKitHeaderView.updateTitle$eatskit(charSequence, charSequence2);
    }

    public final Drawable getServiceLogo() {
        return ((GoImageView) this.binding.d.c).getDrawable();
    }

    public final void init$eatskit(h1p service, CharSequence serviceName, ServiceHeaderMode serviceHeaderMode, pwy0 themeSwitcherProvider, tse coroutineScope) {
        ((GoLinearLayout) this.binding.d.e).setVisibility(serviceHeaderMode != ServiceHeaderMode.HEADER_INVISIBLE ? 0 : 8);
        ((GoImageView) this.binding.d.c).setVisibility(serviceHeaderMode == ServiceHeaderMode.HEADER_WITH_LOGO ? 0 : 8);
        ((GoImageView) this.binding.d.c).setImageResource(service.getLogoId());
        ((AppCompatTextView) this.binding.d.f).setText(serviceName);
        e.H(coroutineScope, new jqr(themeSwitcherProvider.a(), new EatsKitHeaderView$init$1(this, service, null), 3));
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        dcn dcnVar = this.binding;
        if (!enabled) {
            ((GoImageView) dcnVar.d.c).setAlpha(0.4f);
            ((AppCompatTextView) this.binding.d.f).setVisibility(8);
            this.binding.c.setVisibility(8);
            this.binding.b.setVisibility(8);
            return;
        }
        ((GoImageView) dcnVar.d.c).setAlpha(1.0f);
        ((AppCompatTextView) this.binding.d.f).setVisibility(0);
        this.binding.c.setVisibility(0);
        if (this.binding.b.getText().length() > 0) {
            this.binding.b.setVisibility(0);
        }
    }

    public final void setServiceLogo(Drawable drawable) {
        ((GoImageView) this.binding.d.c).setImageDrawable(drawable);
    }

    public final void updateTitle$eatskit(CharSequence title, CharSequence subtitle) {
        this.binding.c.setText(title);
        if (subtitle == null || evu0.J(subtitle)) {
            setDimenTextSize(this.binding.c, nrg0.eats_text_size_caption);
            this.binding.b.setText("");
            this.binding.b.setVisibility(8);
        } else {
            setDimenTextSize(this.binding.c, nrg0.eats_text_size_body);
            setDimenTextSize(this.binding.b, nrg0.eats_text_size_caption);
            this.binding.b.setText(subtitle);
            if (isEnabled()) {
                this.binding.b.setVisibility(0);
            }
        }
    }

    public EatsKitHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EatsKitHeaderView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EatsKitHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
