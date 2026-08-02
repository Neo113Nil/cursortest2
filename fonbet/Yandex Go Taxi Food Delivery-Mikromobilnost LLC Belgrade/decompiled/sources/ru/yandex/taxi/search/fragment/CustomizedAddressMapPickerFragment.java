package ru.yandex.taxi.search.fragment;

import android.content.Context;
import com.yandex.go.search.router.Origin;
import defpackage.b1c0;
import defpackage.f1h0;
import defpackage.gdc;
import defpackage.kdc;
import defpackage.knf;
import defpackage.mqg0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.address.map.f;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/search/fragment/CustomizedAddressMapPickerFragment;", "Lru/yandex/taxi/search/fragment/AddressMapPickerFragment;", "<init>", "()V", "Lb1c0;", "setupPinV2DataRepository", "()Lb1c0;", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "", "defaultDrawable", CA20Status.STATUS_USER_I, "errorDrawable", "Lkdc;", "bgColor", "Lkdc;", "contentColor", "Companion", "knf", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CustomizedAddressMapPickerFragment extends AddressMapPickerFragment {
    private static final String ARG_BG_COLOR = "bg_color";
    private static final String ARG_CONTENT_COLOR = "content_color";
    private static final String ARG_DEFAULT_PIN_DRAWABLE = "source_pin_drawable";
    private static final String ARG_ERROR_PIN_DRAWABLE = "error_pin_drawable";
    public static final knf Companion = new knf();
    private int defaultDrawable = f1h0.ic_source_pin_24;
    private int errorDrawable = f1h0.ic_error_pin_24;
    private kdc bgColor = new gdc(mqg0.component_gray_550);
    private kdc contentColor = new gdc(mqg0.component_white);

    public static final CustomizedAddressMapPickerFragment newInstance(int i, PointType pointType, String str, Origin origin, boolean z, boolean z2, boolean z3) {
        knf knfVar = Companion;
        int i2 = f1h0.ic_source_pin_24;
        int i3 = f1h0.ic_error_pin_24;
        int i4 = mqg0.component_gray_550;
        int i5 = mqg0.component_white;
        knfVar.getClass();
        return knf.a(i, pointType, str, origin, z, z2, i2, i3, i4, i5, z3);
    }

    @Override // ru.yandex.taxi.search.fragment.AddressMapPickerFragment, ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        this.defaultDrawable = requireArguments().getInt(ARG_DEFAULT_PIN_DRAWABLE, f1h0.ic_source_pin_24);
        this.errorDrawable = requireArguments().getInt(ARG_ERROR_PIN_DRAWABLE, f1h0.ic_error_pin_24);
        this.bgColor = new gdc(requireArguments().getInt(ARG_BG_COLOR, mqg0.component_gray_550));
        this.contentColor = new gdc(requireArguments().getInt(ARG_CONTENT_COLOR, mqg0.component_white));
        super.onAttach(context);
    }

    @Override // ru.yandex.taxi.search.fragment.AddressMapPickerFragment, ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public b1c0 setupPinV2DataRepository() {
        return new f(requireContext(), this.defaultDrawable, this.errorDrawable, getAddressResolveRepository(), this.bgColor, this.contentColor);
    }

    public static final CustomizedAddressMapPickerFragment newInstance(int i, PointType pointType, String str, Origin origin, boolean z, boolean z2, int i2, int i3, int i4, int i5, boolean z3) {
        Companion.getClass();
        return knf.a(i, pointType, str, origin, z, z2, i2, i3, i4, i5, z3);
    }
}
