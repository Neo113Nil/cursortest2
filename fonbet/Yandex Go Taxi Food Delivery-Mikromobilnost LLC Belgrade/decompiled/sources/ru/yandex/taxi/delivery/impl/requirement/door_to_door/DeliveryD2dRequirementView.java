package ru.yandex.taxi.delivery.impl.requirement.door_to_door;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ci8;
import defpackage.g18;
import defpackage.jgv;
import defpackage.jqr;
import defpackage.l3i;
import defpackage.m3i;
import defpackage.n3i;
import defpackage.n7v;
import defpackage.nac;
import defpackage.o3i;
import defpackage.pav;
import defpackage.qje;
import defpackage.xng0;
import defpackage.xyw0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.delivery.impl.requirement.door_to_door.DeliveryD2dRequirementView;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u000fJ\u0019\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/yandex/taxi/delivery/impl/requirement/door_to_door/DeliveryD2dRequirementView;", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "Lm3i;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Ln3i;", "presenter", "Ljgv;", "imageUrlResolver", "<init>", "(Landroid/content/Context;Lpav;Ln3i;Ljgv;)V", "Lzy11;", "applyLeadTheme", "()V", "applyTrailTheme", "onAttachedToWindow", "onDetachedFromWindow", "Ll3i;", "model", "bind", "(Ll3i;)V", "", "isVisible", "setVisibility", "(Z)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "setTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/content/Context;", "Lpav;", "Ln3i;", "Ljgv;", "Lg18;", "imageLoadTask", "Lg18;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryD2dRequirementView extends ListItemSwitchComponent implements m3i {
    private final Context context;
    private g18 imageLoadTask;
    private final pav imageLoader;
    private final jgv imageUrlResolver;
    private final n3i presenter;

    public DeliveryD2dRequirementView(Context context, pav pavVar, n3i n3iVar, jgv jgvVar) {
        super(context, null, 0, 6, null);
        this.context = context;
        this.imageLoader = pavVar;
        this.presenter = n3iVar;
        this.imageUrlResolver = jgvVar;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    private final void applyLeadTheme() {
        setLeadTint(qje.t(xng0.textMain, getContext()));
    }

    private final void applyTrailTheme() {
        setTrailTint(qje.t(xng0.textMain, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(DeliveryD2dRequirementView deliveryD2dRequirementView, l3i l3iVar, boolean z) {
        n3i n3iVar = deliveryD2dRequirementView.presenter;
        String str = l3iVar.e;
        o3i o3iVar = n3iVar.z;
        Boolean valueOf = Boolean.valueOf(z);
        r0 r0Var = o3iVar.a;
        r0Var.getClass();
        r0Var.m(null, valueOf);
        n3iVar.A.c(str, z);
    }

    @Override // defpackage.m3i
    public void bind(final l3i model) {
        g18 g18Var = this.imageLoadTask;
        if (g18Var != null) {
            g18Var.cancel();
        }
        if (model == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        setTitle(model.a);
        setSubtitle(model.b);
        n7v n7vVar = model.c;
        if (n7vVar != null) {
            String a = this.imageUrlResolver.a(n7vVar);
            if (a != null) {
                this.imageLoadTask = ((nac) this.imageLoader.a(getLeadImageView())).c(a);
            }
        } else {
            setLeadView(null);
        }
        setChecked(model.d);
        setOnClickListener(new ci8(28, this));
        setOnCheckedListener(new xyw0() { // from class: r3i
            @Override // defpackage.xyw0
            public final void a(boolean z) {
                DeliveryD2dRequirementView.bind$lambda$2(DeliveryD2dRequirementView.this, model, z);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n3i n3iVar = this.presenter;
        n3iVar.Bg(this);
        int i = 3;
        e.H(n3iVar.Jg(), new jqr(new m0(((k) n3iVar.x).j.b(), n3iVar.z.b, new DeliveryD2dRequirementPresenter$observeModel$1(3, null)), new DeliveryD2dRequirementPresenter$observeModel$2(n3iVar, null), i));
        e.H(n3iVar.Jg(), new jqr(n3iVar.y.a(), new DeliveryD2dRequirementPresenter$observeTheme$1(n3iVar, null), i));
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        g18 g18Var = this.imageLoadTask;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.m3i
    public void setTheme(ThemeType themeType) {
        applyTheme(themeType);
        applyLeadTheme();
        applyTrailTheme();
    }

    public void setVisibility(boolean isVisible) {
        setVisibility(isVisible ? 0 : 8);
    }
}
