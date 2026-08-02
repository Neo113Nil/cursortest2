package ru.yandex.taxi.scooters.presentation.common.ui;

import android.content.Context;
import android.view.View;
import defpackage.eqb;
import defpackage.i3y;
import defpackage.sls;
import defpackage.tje;
import defpackage.xng0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001b\u0010\u001d\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/scooters/presentation/common/ui/ChipView;", "T", "Lru/yandex/taxi/design/ButtonComponent;", "Landroid/content/Context;", "context", "Leqb;", "chipInfo", "Lkotlin/Function0;", "Lzy11;", "onClick", "<init>", "(Landroid/content/Context;Leqb;Lsls;)V", "refreshState", "()V", "Leqb;", "", "selectedBackground$delegate", "Li3y;", "getSelectedBackground", "()I", "selectedBackground", "defaultBackground$delegate", "getDefaultBackground", "defaultBackground", "selectedTitleColor$delegate", "getSelectedTitleColor", "selectedTitleColor", "defaultTitleColor$delegate", "getDefaultTitleColor", "defaultTitleColor", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChipView<T> extends ButtonComponent {
    private final eqb chipInfo;

    /* renamed from: defaultBackground$delegate, reason: from kotlin metadata */
    private final i3y defaultBackground;

    /* renamed from: defaultTitleColor$delegate, reason: from kotlin metadata */
    private final i3y defaultTitleColor;

    /* renamed from: selectedBackground$delegate, reason: from kotlin metadata */
    private final i3y selectedBackground;

    /* renamed from: selectedTitleColor$delegate, reason: from kotlin metadata */
    private final i3y selectedTitleColor;

    public ChipView(Context context, eqb eqbVar, final sls slsVar) {
        super(context, null, 0, 6, null);
        this.chipInfo = eqbVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        this.selectedBackground = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ru.yandex.taxi.scooters.presentation.common.ui.a
            public final /* synthetic */ ChipView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int selectedBackground_delegate$lambda$0;
                int i2 = i;
                ChipView chipView = this.b;
                switch (i2) {
                    case 0:
                        selectedBackground_delegate$lambda$0 = ChipView.selectedBackground_delegate$lambda$0(chipView);
                        break;
                    case 1:
                        selectedBackground_delegate$lambda$0 = ChipView.defaultBackground_delegate$lambda$0(chipView);
                        break;
                    case 2:
                        selectedBackground_delegate$lambda$0 = ChipView.selectedTitleColor_delegate$lambda$0(chipView);
                        break;
                    default:
                        selectedBackground_delegate$lambda$0 = ChipView.defaultTitleColor_delegate$lambda$0(chipView);
                        break;
                }
                return Integer.valueOf(selectedBackground_delegate$lambda$0);
            }
        });
        final int i2 = 1;
        this.defaultBackground = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ru.yandex.taxi.scooters.presentation.common.ui.a
            public final /* synthetic */ ChipView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int selectedBackground_delegate$lambda$0;
                int i22 = i2;
                ChipView chipView = this.b;
                switch (i22) {
                    case 0:
                        selectedBackground_delegate$lambda$0 = ChipView.selectedBackground_delegate$lambda$0(chipView);
                        break;
                    case 1:
                        selectedBackground_delegate$lambda$0 = ChipView.defaultBackground_delegate$lambda$0(chipView);
                        break;
                    case 2:
                        selectedBackground_delegate$lambda$0 = ChipView.selectedTitleColor_delegate$lambda$0(chipView);
                        break;
                    default:
                        selectedBackground_delegate$lambda$0 = ChipView.defaultTitleColor_delegate$lambda$0(chipView);
                        break;
                }
                return Integer.valueOf(selectedBackground_delegate$lambda$0);
            }
        });
        final int i3 = 2;
        this.selectedTitleColor = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ru.yandex.taxi.scooters.presentation.common.ui.a
            public final /* synthetic */ ChipView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int selectedBackground_delegate$lambda$0;
                int i22 = i3;
                ChipView chipView = this.b;
                switch (i22) {
                    case 0:
                        selectedBackground_delegate$lambda$0 = ChipView.selectedBackground_delegate$lambda$0(chipView);
                        break;
                    case 1:
                        selectedBackground_delegate$lambda$0 = ChipView.defaultBackground_delegate$lambda$0(chipView);
                        break;
                    case 2:
                        selectedBackground_delegate$lambda$0 = ChipView.selectedTitleColor_delegate$lambda$0(chipView);
                        break;
                    default:
                        selectedBackground_delegate$lambda$0 = ChipView.defaultTitleColor_delegate$lambda$0(chipView);
                        break;
                }
                return Integer.valueOf(selectedBackground_delegate$lambda$0);
            }
        });
        final int i4 = 3;
        this.defaultTitleColor = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ru.yandex.taxi.scooters.presentation.common.ui.a
            public final /* synthetic */ ChipView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int selectedBackground_delegate$lambda$0;
                int i22 = i4;
                ChipView chipView = this.b;
                switch (i22) {
                    case 0:
                        selectedBackground_delegate$lambda$0 = ChipView.selectedBackground_delegate$lambda$0(chipView);
                        break;
                    case 1:
                        selectedBackground_delegate$lambda$0 = ChipView.defaultBackground_delegate$lambda$0(chipView);
                        break;
                    case 2:
                        selectedBackground_delegate$lambda$0 = ChipView.selectedTitleColor_delegate$lambda$0(chipView);
                        break;
                    default:
                        selectedBackground_delegate$lambda$0 = ChipView.defaultTitleColor_delegate$lambda$0(chipView);
                        break;
                }
                return Integer.valueOf(selectedBackground_delegate$lambda$0);
            }
        });
        setId(View.generateViewId());
        setText(eqbVar.b);
        int u = tje.u(14, getContext());
        setPadding(u, 0, u, 0);
        setButtonSize(1);
        setRoundedCornersRadius(tje.u(100, getContext()));
        setOnClickListener(new Runnable() { // from class: ru.yandex.taxi.scooters.presentation.common.ui.b
            @Override // java.lang.Runnable
            public final void run() {
                ChipView._init_$lambda$0(ChipView.this, slsVar);
            }
        });
        refreshState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ChipView chipView, sls slsVar) {
        chipView.chipInfo.c = !r0.c;
        slsVar.invoke();
        chipView.refreshState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int defaultBackground_delegate$lambda$0(ChipView chipView) {
        return c.c(xng0.controlMinor, chipView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int defaultTitleColor_delegate$lambda$0(ChipView chipView) {
        return c.c(xng0.textOnControlMinor, chipView);
    }

    private final int getDefaultBackground() {
        return ((Number) this.defaultBackground.getValue()).intValue();
    }

    private final int getDefaultTitleColor() {
        return ((Number) this.defaultTitleColor.getValue()).intValue();
    }

    private final int getSelectedBackground() {
        return ((Number) this.selectedBackground.getValue()).intValue();
    }

    private final int getSelectedTitleColor() {
        return ((Number) this.selectedTitleColor.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int selectedBackground_delegate$lambda$0(ChipView chipView) {
        return c.c(xng0.controlMain, chipView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int selectedTitleColor_delegate$lambda$0(ChipView chipView) {
        return c.c(xng0.textOnControl, chipView);
    }

    public final void refreshState() {
        setButtonBackground(this.chipInfo.c ? getSelectedBackground() : getDefaultBackground());
        setButtonTitleColor(this.chipInfo.c ? getSelectedTitleColor() : getDefaultTitleColor());
        setSelected(this.chipInfo.c);
    }
}
