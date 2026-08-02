package ru.yandex.taxi.search.address.view;

import android.view.View;
import defpackage.cmi;
import defpackage.dnr;
import defpackage.eph0;
import defpackage.f51;
import defpackage.hks;
import defpackage.i3y;
import defpackage.mrg0;
import defpackage.sjs;
import defpackage.tje;
import defpackage.tjs;
import defpackage.ujs;
import defpackage.vjs;
import defpackage.x9v0;
import defpackage.zch0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.search.view.AddressSearchView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0003\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lru/yandex/taxi/search/address/view/FullscreenDestinationSearchView;", "Lru/yandex/taxi/search/view/AddressSearchView;", "Ltjs;", "builder", "<init>", "(Ltjs;)V", "Lzy11;", "onAttachedToWindow", "()V", "", "getContentViewLayoutRes", "()I", "", "subtitle", "onSubtitleChanged", "(Ljava/lang/String;)V", "Lx9v0;", "model", "onItemSelectedLongTap", "(Lx9v0;)V", "title", "setTitle", "Lhks;", ClidProvider.STATE, "updateNextButtonState", "(Lhks;)V", "onDismiss", "Ltjs;", "getBuilder", "()Ltjs;", "Landroid/view/View;", "bottomShadowView$delegate", "Li3y;", "getBottomShadowView", "()Landroid/view/View;", "bottomShadowView", "Companion", "vjs", "ujs", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FullscreenDestinationSearchView extends AddressSearchView {
    public static final ujs Companion = new ujs();

    /* renamed from: bottomShadowView$delegate, reason: from kotlin metadata */
    private final i3y bottomShadowView;
    private final tjs builder;

    public FullscreenDestinationSearchView(tjs tjsVar) {
        super(tjsVar);
        this.builder = tjsVar;
        this.bottomShadowView = kotlin.a.a(new dnr(6, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View bottomShadowView_delegate$lambda$0(FullscreenDestinationSearchView fullscreenDestinationSearchView) {
        View findViewById = fullscreenDestinationSearchView.findViewById(zch0.bottom_shadow);
        if (findViewById == null) {
            return null;
        }
        fullscreenDestinationSearchView.presenter.ph(findViewById);
        findViewById.setVisibility(4);
        return findViewById;
    }

    public static final tjs builder(f51 f51Var) {
        Companion.getClass();
        tjs tjsVar = new tjs(f51Var);
        tjsVar.C = true;
        tjsVar.D = true;
        return tjsVar;
    }

    private final View getBottomShadowView() {
        return (View) this.bottomShadowView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$0(FullscreenDestinationSearchView fullscreenDestinationSearchView) {
        vjs vjsVar = fullscreenDestinationSearchView.builder.A;
        if (vjsVar != null) {
            vjsVar.onBack();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0$1(FullscreenDestinationSearchView fullscreenDestinationSearchView, View view) {
        vjs vjsVar = fullscreenDestinationSearchView.builder.A;
        if (vjsVar != null) {
            vjsVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateNextButtonState$lambda$0$0(FullscreenDestinationSearchView fullscreenDestinationSearchView) {
        fullscreenDestinationSearchView.presenter.jh();
        vjs vjsVar = fullscreenDestinationSearchView.builder.A;
        if (vjsVar != null) {
            vjsVar.f();
        }
    }

    public final tjs getBuilder() {
        return this.builder;
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView, ru.yandex.taxi.search.view.BaseAddressSearchView
    public int getContentViewLayoutRes() {
        return eph0.destination_search_view;
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView, ru.yandex.taxi.search.view.BaseAddressSearchView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ListItemComponent listItemComponent = (ListItemComponent) findViewById(zch0.source_header);
        if (listItemComponent != null) {
            listItemComponent.setLeadContainerClickListener(new sjs(this, 1));
            listItemComponent.setOnClickListener(new cmi(24, this));
            listItemComponent.setSubtitleSingleLine(true);
            listItemComponent.setSubTitleEllipsizeMode(2);
        }
        suggestsViewField().setTopPadding(0);
        this.addressInputHolder.a.setOnFocusChangeListener(null);
        addShadowScrollListener(getBottomShadowView());
        String str = this.builder.B;
        if (str != null) {
            setTitle(str);
        }
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView, ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onDismiss() {
        vjs vjsVar = this.builder.A;
        if (vjsVar != null) {
            vjsVar.onBack();
        }
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView, ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onItemSelectedLongTap(x9v0 model) {
        if (this.builder.D) {
            super.onItemSelectedLongTap(model);
        }
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView
    public void onSubtitleChanged(String subtitle) {
        super.onSubtitleChanged(subtitle);
        ListItemComponent listItemComponent = (ListItemComponent) findViewById(zch0.source_header);
        if (listItemComponent != null) {
            listItemComponent.setSubtitle(subtitle);
            if (subtitle.length() == 0) {
                listItemComponent.hideSubtitle();
            } else {
                listItemComponent.showSubtitle();
            }
        }
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView
    public void setTitle(String title) {
        super.setTitle(title);
        ListItemComponent listItemComponent = (ListItemComponent) findViewById(zch0.source_header);
        if (listItemComponent != null) {
            listItemComponent.setTitle(title);
        }
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView
    public void updateNextButtonState(hks state) {
        super.updateNextButtonState(state);
        ListItemComponent listItemComponent = (ListItemComponent) findViewById(zch0.source_header);
        if (listItemComponent != null) {
            if (!this.builder.C || !state.b) {
                listItemComponent.clearTrailView();
                listItemComponent.setTrailContainerClickListener(null);
            } else {
                listItemComponent.setTrailTextSize(tje.r(mrg0.component_text_size_caption, listItemComponent.getContext()));
                listItemComponent.setTrailTextStyle(3);
                listItemComponent.setTrailCompanionText(state.a);
                listItemComponent.setTrailContainerClickListener(new sjs(this, 0));
            }
        }
    }
}
