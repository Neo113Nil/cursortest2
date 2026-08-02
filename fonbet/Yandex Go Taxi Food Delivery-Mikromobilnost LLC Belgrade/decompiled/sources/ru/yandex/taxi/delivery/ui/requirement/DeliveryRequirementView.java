package ru.yandex.taxi.delivery.ui.requirement;

import android.content.Context;
import android.graphics.drawable.Drawable;
import defpackage.deh0;
import defpackage.e95;
import defpackage.fli;
import defpackage.g7v;
import defpackage.hqh0;
import defpackage.i7v;
import defpackage.nac;
import defpackage.o7v;
import defpackage.pav;
import defpackage.pwh;
import defpackage.tje;
import defpackage.zlj0;
import kotlin.Metadata;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000b*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/delivery/ui/requirement/DeliveryRequirementView;", "Lru/yandex/taxi/design/DividerAwareComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lpav;)V", "Lru/yandex/taxi/design/ListItemComponent;", "Lo7v;", "image", "Lzy11;", "setTrailImage", "(Lru/yandex/taxi/design/ListItemComponent;Lo7v;)V", "setLeadImage", "setBadgeImage", "Lzlj0;", "model", "bindModel", "(Lzlj0;)V", "Lpav;", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "booleanListItemComponent", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "defaultListItemComponent", "Lru/yandex/taxi/design/ListItemComponent;", "", "setupRequirementsInitialized", "Z", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryRequirementView extends DividerAwareComponent {
    private final ListItemSwitchComponent booleanListItemComponent;
    private final ListItemComponent defaultListItemComponent;
    private final pav imageLoader;
    private boolean setupRequirementsInitialized;

    public DeliveryRequirementView(Context context, pav pavVar) {
        super(context, null, 0, 6, null);
        this.imageLoader = pavVar;
        c.q(this, hqh0.delivery_requirement_view, true);
        ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) findViewById(deh0.delivery_switch_requirement);
        this.booleanListItemComponent = listItemSwitchComponent;
        ListItemComponent listItemComponent = (ListItemComponent) findViewById(deh0.delivery_default_requirement);
        this.defaultListItemComponent = listItemComponent;
        listItemSwitchComponent.setTrailCompanionMode(0);
        listItemComponent.setTrailCompanionMode(1);
        listItemComponent.setTrailCompanionImageSize((int) tje.x(context, 51.0f), (int) tje.x(context, 48.0f));
    }

    private final void setBadgeImage(ListItemComponent listItemComponent, o7v o7vVar) {
        listItemComponent.getTrailCompanionImageView().setVisibility(o7vVar != null ? 0 : 8);
        if (o7vVar instanceof i7v) {
            ((nac) this.imageLoader.a(listItemComponent.getTrailCompanionImageView())).c(((i7v) o7vVar).a);
        } else if (o7vVar instanceof g7v) {
            listItemComponent.setTrailCompanionImage(((g7v) o7vVar).a);
        } else {
            listItemComponent.getTrailCompanionImageView().setVisibility(8);
        }
    }

    private final void setLeadImage(ListItemComponent listItemComponent, o7v o7vVar) {
        if (o7vVar instanceof i7v) {
            ((nac) this.imageLoader.a(listItemComponent.getLeadImageView())).c(((i7v) o7vVar).a);
        } else if (o7vVar instanceof g7v) {
            listItemComponent.setLeadImage(((g7v) o7vVar).a);
        } else {
            listItemComponent.setLeadImage((Drawable) null);
        }
    }

    private final void setTrailImage(ListItemComponent listItemComponent, o7v o7vVar) {
        if (o7vVar instanceof i7v) {
            ((nac) this.imageLoader.a(listItemComponent.getTrailImageView())).c(((i7v) o7vVar).a);
        } else if (o7vVar instanceof g7v) {
            listItemComponent.setTrailImage(((g7v) o7vVar).a);
        } else {
            listItemComponent.setTrailImage((Drawable) null);
        }
    }

    public final void bindModel(zlj0 model) {
        ListItemComponent listItemComponent;
        if (model instanceof fli) {
            int w = (int) tje.w(10, getContext());
            this.defaultListItemComponent.setLeadImagePadding(w, 0, w, 0);
        }
        boolean z = model instanceof pwh;
        ListItemSwitchComponent listItemSwitchComponent = this.booleanListItemComponent;
        if (z) {
            listItemSwitchComponent.setVisibility(0);
            this.defaultListItemComponent.setVisibility(8);
            if (this.setupRequirementsInitialized) {
                this.booleanListItemComponent.setCheckedWithAnimation(((pwh) model).b);
            } else {
                this.setupRequirementsInitialized = true;
                this.booleanListItemComponent.setChecked(((pwh) model).b);
            }
            listItemComponent = this.booleanListItemComponent;
        } else {
            listItemSwitchComponent.setVisibility(8);
            this.defaultListItemComponent.setVisibility(0);
            setTrailImage(this.defaultListItemComponent, model.a().g);
            listItemComponent = this.defaultListItemComponent;
        }
        e95 a = model.a();
        String str = a.a;
        String str2 = a.f;
        String str3 = a.e;
        listItemComponent.setTitle(str);
        listItemComponent.setSubtitle(a.b);
        if (str3 != null || str2 != null) {
            listItemComponent.setTrailCompanionMode(0);
        }
        listItemComponent.setTrailCompanionText(str3);
        listItemComponent.setTrailCompanionSubtext(str2);
        setLeadImage(listItemComponent, a.d);
        if (a.h) {
            listItemComponent.startProgressAnimation();
        } else {
            listItemComponent.stopProgressAnimation();
        }
    }
}
