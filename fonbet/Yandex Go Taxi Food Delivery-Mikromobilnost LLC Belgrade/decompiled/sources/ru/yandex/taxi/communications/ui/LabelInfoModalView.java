package ru.yandex.taxi.communications.ui;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.c230;
import defpackage.e230;
import defpackage.iqx;
import defpackage.jdh0;
import defpackage.mzh0;
import defpackage.qje;
import defpackage.rqx;
import defpackage.tje;
import defpackage.xng0;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.communications.ui.LabelInfoModalView;
import ru.yandex.taxi.design.ButtonComponent;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/communications/ui/LabelInfoModalView;", "Lru/yandex/taxi/communications/ui/CommunicationInternalSlideableModalView;", "Landroid/content/Context;", "context", "", "Liqx$a;", "info", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "", "isArrowsPermanentlyHidden", "()Z", "Le230;", "insetsType", "()Le230;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LabelInfoModalView extends CommunicationInternalSlideableModalView {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LabelInfoModalView(Context context, List<iqx.a> list) {
        super(r6, 3);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i = 1;
        linearLayout.setOrientation(1);
        RecyclerView recyclerView = new RecyclerView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = tje.u(4, recyclerView.getContext());
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setAdapter(new rqx(list));
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        linearLayout.addView(recyclerView);
        ButtonComponent buttonComponent = new ButtonComponent(context, null, 0, 6, null);
        buttonComponent.setId(jdh0.label_modal_view_close_button);
        buttonComponent.setText(buttonComponent.getContext().getString(mzh0.common_close));
        buttonComponent.setButtonBackground(qje.t(xng0.controlMinor, buttonComponent.getContext()));
        buttonComponent.setButtonTitleColor(qje.t(xng0.textOnControlMinor, buttonComponent.getContext()));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(tje.u(8, buttonComponent.getContext()), tje.u(4, buttonComponent.getContext()), tje.u(8, buttonComponent.getContext()), tje.u(8, buttonComponent.getContext()));
        buttonComponent.setLayoutParams(layoutParams2);
        linearLayout.addView(buttonComponent);
        ButtonComponent buttonComponent2 = (ButtonComponent) findViewById(jdh0.label_modal_view_close_button);
        if (buttonComponent2 != null) {
            final int i2 = 0;
            buttonComponent2.setOnClickListener(new Runnable(this) { // from class: qqx
                public final /* synthetic */ LabelInfoModalView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    LabelInfoModalView labelInfoModalView = this.b;
                    switch (i3) {
                        case 0:
                            labelInfoModalView.dismiss();
                            break;
                        default:
                            labelInfoModalView.dismiss();
                            break;
                    }
                }
            });
        }
        setOnBackPressedListener(new Runnable(this) { // from class: qqx
            public final /* synthetic */ LabelInfoModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                LabelInfoModalView labelInfoModalView = this.b;
                switch (i3) {
                    case 0:
                        labelInfoModalView.dismiss();
                        break;
                    default:
                        labelInfoModalView.dismiss();
                        break;
                }
            }
        });
        setDismissOnTouchOutside(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getRouteSummaryIsVisible() {
        return true;
    }
}
