package ru.yandex.taxi.favorites.list.ui.adapter.holder;

import android.text.TextUtils;
import com.yandex.go.address.models.FavoriteAddress;
import defpackage.j73;
import defpackage.kyh0;
import defpackage.o1c;
import defpackage.o2x;
import defpackage.wys;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.favorites.list.ui.adapter.holder.a;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes5.dex */
public final class a extends wys {
    public static final /* synthetic */ int U = 0;
    public final ListItemComponent R;
    public final e S;
    public final o1c T;

    public a(ListItemComponent listItemComponent, e eVar, o1c o1cVar) {
        super(listItemComponent);
        this.R = listItemComponent;
        this.S = eVar;
        this.T = o1cVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        o2x o2xVar = (o2x) obj;
        final FavoriteAddress favoriteAddress = o2xVar.d;
        boolean z = o2xVar.e;
        String q = favoriteAddress.q();
        ListItemComponent listItemComponent = this.R;
        listItemComponent.setTitle(q);
        listItemComponent.setSubtitle(favoriteAddress.p());
        String str = o2xVar.g;
        if (str != null) {
            listItemComponent.setContentDescription(TextUtils.join(",", j73.A(new String[]{favoriteAddress.q(), favoriteAddress.p(), str})));
        }
        listItemComponent.setDividers(DividerPosition.BOTTOM, !o2xVar.f ? DividerType.NONE : z ? DividerType.ICON_MARGIN : DividerType.MARGIN);
        final int i = 0;
        listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: ddp
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                FavoriteAddress favoriteAddress2 = favoriteAddress;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        aVar.T.onPickedAddress(favoriteAddress2);
                        break;
                    default:
                        aVar.T.H9(favoriteAddress2);
                        break;
                }
            }
        });
        final int i2 = 1;
        listItemComponent.setTrailContainerClickListener(new Runnable(this) { // from class: ddp
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                FavoriteAddress favoriteAddress2 = favoriteAddress;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        aVar.T.onPickedAddress(favoriteAddress2);
                        break;
                    default:
                        aVar.T.H9(favoriteAddress2);
                        break;
                }
            }
        });
        listItemComponent.setTrailImportantForAccessibility(1);
        listItemComponent.setTrailContentDescription(listItemComponent.getContext().getString(kyh0.common_edit));
        listItemComponent.setLeadImage(o2xVar.b);
        if (z) {
            b0(new FavoriteAddressHolder$showLeadIcon$1$1(this, favoriteAddress, listItemComponent, null));
        }
    }
}
