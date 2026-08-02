package ru.yandex.taxi.search.address.view;

import android.R;
import android.content.Context;
import android.view.View;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a0h0;
import defpackage.agh0;
import defpackage.mrg0;
import defpackage.peh0;
import defpackage.rp31;
import defpackage.sf30;
import defpackage.sls;
import defpackage.sqh0;
import defpackage.vng;
import defpackage.wnb1;
import defpackage.xqg0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0015¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/yandex/taxi/search/address/view/NoInternetConnectionModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "", "titleText", "infoText", "Lkotlin/Function0;", "Lzy11;", "callTaxiByPhoneAction", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lsls;)V", "update", "(Ljava/lang/String;Ljava/lang/String;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Lsls;", "Lru/yandex/taxi/design/ListTitleComponent;", "title", "Lru/yandex/taxi/design/ListTitleComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "info", "Lru/yandex/taxi/design/ListTextComponent;", "Lru/yandex/taxi/widget/buttons/IconCircleButton;", "callTaxiByPhone", "Lru/yandex/taxi/widget/buttons/IconCircleButton;", "content", "Landroid/view/View;", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoInternetConnectionModalView extends ModalView {
    private final IconCircleButton callTaxiByPhone;
    private final sls callTaxiByPhoneAction;
    private final View content;
    private final ListTextComponent info;
    private final ListTitleComponent title;

    public NoInternetConnectionModalView(Context context, String str, String str2, sls slsVar) {
        super(context);
        this.callTaxiByPhoneAction = slsVar;
        ru.yandex.taxi.design.utils.c.q(this, sqh0.no_internet_connection_modal_view, true);
        int i = peh0.no_internet_connection_error_title;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ListTitleComponent listTitleComponent = (ListTitleComponent) ((View) rp31.d(this, i));
        this.title = listTitleComponent;
        this.info = (ListTextComponent) ((View) rp31.d(this, peh0.no_internet_connection_error_info));
        IconCircleButton iconCircleButton = (IconCircleButton) ((View) rp31.d(this, peh0.no_internet_connection_call_taxi_by_phone_button));
        this.callTaxiByPhone = iconCircleButton;
        View view = (View) rp31.d(this, agh0.content);
        this.content = view;
        setInterceptOnBackPress(false);
        setDismissOnTouchOutside(false);
        setClickable(false);
        listTitleComponent.setClickable(true);
        iconCircleButton.setIconTint(R.color.white);
        iconCircleButton.setIconBackground(vng.t(a0h0.bg_button_call_taxi_by_phone, getContext()));
        wnb1.d(view.getResources().getDimensionPixelSize(mrg0.modal_view_corner_radius), view);
        update(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(NoInternetConnectionModalView noInternetConnectionModalView) {
        noInternetConnectionModalView.dismiss();
        noInternetConnectionModalView.callTaxiByPhoneAction.invoke();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return xqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.callTaxiByPhone.setDebounceClickListener(new sf30(21, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.callTaxiByPhone.setDebounceClickListener(null);
    }

    public final void update(String titleText, String infoText) {
        this.title.setTitle(titleText);
        this.info.setText(infoText);
    }
}
