package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SpannableTextStrategyInteractor;
import ru.yandex.taxi.widget.address.AddressItemBuilder$AddressType;

/* loaded from: classes6.dex */
public final class xw0 {
    public final FrameLayout a;

    public xw0(FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    public final ListItemComponent a(AddressItemBuilder$AddressType addressItemBuilder$AddressType) {
        int i = zrh0.address_item_widget;
        FrameLayout frameLayout = this.a;
        ListItemComponent listItemComponent = (ListItemComponent) LayoutInflater.from(frameLayout.getContext()).inflate(i, (ViewGroup) frameLayout, false);
        ViewGroup.LayoutParams layoutParams = listItemComponent.getLayoutParams();
        listItemComponent.setTitleSpannableTextStrategy(SpannableTextStrategyInteractor.SpannableTextStrategy.SCALE_SIZE_BY_55_TEXT_SIZE);
        listItemComponent.setTitleMaxLines(2);
        listItemComponent.setTitleColorAttr(xng0.textMain);
        listItemComponent.setSubtitleColorAttr(xng0.textMain);
        int dimensionPixelSize = frameLayout.getContext().getResources().getDimensionPixelSize(mrg0.component_text_size_caption);
        listItemComponent.setLayoutParams(layoutParams);
        if (addressItemBuilder$AddressType == AddressItemBuilder$AddressType.TAXI) {
            listItemComponent.title().setImportantForAccessibility(2);
            listItemComponent.subtitle().setAccessibilityLiveRegion(1);
            listItemComponent.setSubtitleContentDescriptionResId(Integer.valueOf(kyh0.address_title_content_description));
        }
        listItemComponent.setSubtitleUseMinimumWidth(true);
        listItemComponent.ellipsizeSubtitleMiddle(true).autofitSubTitle(dimensionPixelSize, 1).invalidateComponent();
        return listItemComponent;
    }
}
