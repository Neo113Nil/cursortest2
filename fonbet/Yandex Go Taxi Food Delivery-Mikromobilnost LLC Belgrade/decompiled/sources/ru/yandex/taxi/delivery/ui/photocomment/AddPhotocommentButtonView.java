package ru.yandex.taxi.delivery.ui.photocomment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.widget.ImageView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.widget.k;
import defpackage.deh0;
import defpackage.dzg0;
import defpackage.e90;
import defpackage.hki;
import defpackage.kyh0;
import defpackage.m17;
import defpackage.mzg0;
import defpackage.nvh0;
import defpackage.tls;
import defpackage.vng;
import defpackage.x1i0;
import defpackage.z1i0;
import kotlin.Metadata;
import ru.yandex.taxi.widget.buttons.CircleButtonImageView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/delivery/ui/photocomment/AddPhotocommentButtonView;", "Lru/yandex/taxi/widget/buttons/CircleButtonImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lm17;", "model", "Lzy11;", "bindModel", "(Lm17;)V", "Lhki;", "pointType", "showPopupMenu", "(Lhki;)V", "Landroidx/appcompat/widget/k;", "popupContextMenu", "Landroidx/appcompat/widget/k;", "Lkotlin/Function1;", "onCameraChosenListener", "Ltls;", "getOnCameraChosenListener", "()Ltls;", "setOnCameraChosenListener", "(Ltls;)V", "onFilesChosenListener", "getOnFilesChosenListener", "setOnFilesChosenListener", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddPhotocommentButtonView extends CircleButtonImageView {
    private tls onCameraChosenListener;
    private tls onFilesChosenListener;
    private final k popupContextMenu;

    public AddPhotocommentButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, x1i0.CircleButtonImage);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, z1i0.PhotocommentsPopupMenu);
        k kVar = new k(contextThemeWrapper, this, 8388613);
        this.popupContextMenu = kVar;
        new SupportMenuInflater(contextThemeWrapper).inflate(nvh0.delivery_photocomment_attach_menu, kVar.a);
        kVar.c.e(true);
        setBackground(vng.t(dzg0.fab_component, getContext()));
        setContentDescription(getContext().getString(kyh0.delivery_photocomment_button_content_description));
        setImageResource(mzg0.ic_delivery_photocomment_attach);
        setScaleType(ImageView.ScaleType.CENTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$0(AddPhotocommentButtonView addPhotocommentButtonView, hki hkiVar, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == deh0.action_photo) {
            tls tlsVar = addPhotocommentButtonView.onCameraChosenListener;
            if (tlsVar != null) {
                tlsVar.invoke(hkiVar);
            }
            return true;
        }
        if (itemId != deh0.action_files) {
            return false;
        }
        tls tlsVar2 = addPhotocommentButtonView.onFilesChosenListener;
        if (tlsVar2 != null) {
            tlsVar2.invoke(hkiVar);
        }
        return true;
    }

    public final void bindModel(m17 model) {
        setVisibility(model.b ? 0 : 8);
        if (model.b) {
            if (model.a) {
                setAlpha(1.0f);
                setContentDescription(getContext().getString(kyh0.delivery_photocomment_button_content_description));
            } else {
                setAlpha(0.5f);
                setContentDescription(getContext().getString(kyh0.delivery_photocomment_button_blocked_content_description));
            }
        }
    }

    public final tls getOnCameraChosenListener() {
        return this.onCameraChosenListener;
    }

    public final tls getOnFilesChosenListener() {
        return this.onFilesChosenListener;
    }

    public final void setOnCameraChosenListener(tls tlsVar) {
        this.onCameraChosenListener = tlsVar;
    }

    public final void setOnFilesChosenListener(tls tlsVar) {
        this.onFilesChosenListener = tlsVar;
    }

    public final void showPopupMenu(hki pointType) {
        k kVar = this.popupContextMenu;
        kVar.d = new e90(1, this, pointType);
        kVar.a();
    }
}
