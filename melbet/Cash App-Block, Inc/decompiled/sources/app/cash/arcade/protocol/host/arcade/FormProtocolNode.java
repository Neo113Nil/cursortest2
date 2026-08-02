package app.cash.arcade.protocol.host.arcade;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import androidx.camera.view.ScreenFlashView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.UiPropertyChange;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import app.cash.redwood.widget.Widget;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.caverock.androidsvg.SVG;
import com.squareup.cash.arcade.treehouse.FormBinding;
import com.squareup.cash.arcade.treehouse.ReceiptScaffoldBinding;
import com.squareup.cash.arcade.treehouse.ScaffoldBinding;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class FormProtocolNode extends ProtocolNode {
    public final /* synthetic */ int $r8$classId = 0;
    public Widget _widget;
    public final AndroidSvg body;
    public final AndroidSvg footer;
    public final AndroidSvg header;
    public final WidgetHostProtocol protocol;

    public FormProtocolNode(int i, FormBinding formBinding, FormHostProtocol formHostProtocol) {
        super(i);
        this.protocol = formHostProtocol;
        this._widget = formBinding;
        this.header = new AndroidSvg(formBinding.header);
        this.body = new AndroidSvg(formBinding.body);
        this.footer = new AndroidSvg(formBinding.footer);
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void apply(UiPropertyChange uiPropertyChange, SVG svg) {
        int i = this.$r8$classId;
        WidgetHostProtocol widgetHostProtocol = this.protocol;
        svg.getClass();
        switch (i) {
            case 0:
                ((FormHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(20, uiPropertyChange.tag);
                break;
            case 1:
                ReceiptScaffoldBinding receiptScaffoldBinding = (ReceiptScaffoldBinding) this._widget;
                if (receiptScaffoldBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    int i2 = uiPropertyChange.tag;
                    if (i2 != 1) {
                        ((ClickableCellHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(75, i2);
                        break;
                    } else {
                        Object obj = uiPropertyChange.value;
                        obj.getClass();
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        FrameLayout frameLayout = receiptScaffoldBinding.footerSlot;
                        ValueAnimator valueAnimator = receiptScaffoldBinding.animator;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        int[] iArr = booleanValue ? new int[]{Math.min(frameLayout.getHeight(), (int) frameLayout.getTranslationY()), 0} : new int[]{Math.max(0, (int) frameLayout.getTranslationY()), frameLayout.getHeight()};
                        ValueAnimator ofInt = ValueAnimator.ofInt(Arrays.copyOf(iArr, iArr.length));
                        ofInt.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(receiptScaffoldBinding, 13));
                        ofInt.addListener(new ScreenFlashView.AnonymousClass2(receiptScaffoldBinding, 2));
                        ofInt.setDuration(250L);
                        ofInt.setInterpolator(new FastOutSlowInInterpolator(0));
                        ofInt.start();
                        receiptScaffoldBinding.animator = ofInt;
                        break;
                    }
                }
            default:
                ((FormHostProtocol) widgetHostProtocol).mismatchHandler.m1946onUnknownPropertyLKUuuww(42, uiPropertyChange.tag);
                break;
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    /* renamed from: children-dBpC-2Y */
    public final AndroidSvg mo1195childrendBpC2Y(int i) {
        int i2 = this.$r8$classId;
        AndroidSvg androidSvg = this.header;
        AndroidSvg androidSvg2 = this.body;
        AndroidSvg androidSvg3 = this.footer;
        WidgetHostProtocol widgetHostProtocol = this.protocol;
        switch (i2) {
            case 0:
                if (i != 1) {
                    if (i == 2) {
                        break;
                    } else if (i == 3) {
                        break;
                    } else {
                        ((FormHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(20, i);
                        break;
                    }
                }
                break;
            case 1:
                if (i != 1) {
                    if (i == 2) {
                        break;
                    } else if (i == 3) {
                        break;
                    } else {
                        ((ClickableCellHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(75, i);
                        break;
                    }
                }
                break;
            default:
                if (i != 1) {
                    if (i == 2) {
                        break;
                    } else if (i == 3) {
                        break;
                    } else {
                        ((FormHostProtocol) widgetHostProtocol).mismatchHandler.m1945onUnknownChildreniETOA3M(42, i);
                        break;
                    }
                }
                break;
        }
        return androidSvg2;
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void detach() {
        switch (this.$r8$classId) {
            case 0:
                this.header.detach();
                this.body.detach();
                this.footer.detach();
                this._widget = null;
                break;
            case 1:
                this.header.detach();
                this.body.detach();
                this.footer.detach();
                this._widget = null;
                break;
            default:
                this.header.detach();
                this.body.detach();
                this.footer.detach();
                this._widget = null;
                break;
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final Widget getWidget() {
        switch (this.$r8$classId) {
            case 0:
                FormBinding formBinding = (FormBinding) this._widget;
                if (formBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            case 1:
                ReceiptScaffoldBinding receiptScaffoldBinding = (ReceiptScaffoldBinding) this._widget;
                if (receiptScaffoldBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
            default:
                ScaffoldBinding scaffoldBinding = (ScaffoldBinding) this._widget;
                if (scaffoldBinding == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("detached");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final String getWidgetName() {
        switch (this.$r8$classId) {
            case 0:
                return "Form";
            case 1:
                return "ReceiptScaffold";
            default:
                return "Scaffold";
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    /* renamed from: getWidgetTag-BlhN7y0 */
    public final int mo1196getWidgetTagBlhN7y0() {
        switch (this.$r8$classId) {
            case 0:
                return 20;
            case 1:
                return 75;
            default:
                return 42;
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void visitIds(PreviewView.AnonymousClass1 anonymousClass1) {
        int i = this.$r8$classId;
        AndroidSvg androidSvg = this.footer;
        AndroidSvg androidSvg2 = this.body;
        AndroidSvg androidSvg3 = this.header;
        anonymousClass1.getClass();
        switch (i) {
            case 0:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg3.visitIds(anonymousClass1);
                androidSvg2.visitIds(anonymousClass1);
                androidSvg.visitIds(anonymousClass1);
                break;
            case 1:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg3.visitIds(anonymousClass1);
                androidSvg2.visitIds(anonymousClass1);
                androidSvg.visitIds(anonymousClass1);
                break;
            default:
                anonymousClass1.m125visitou3jOuA(this.id);
                androidSvg3.visitIds(anonymousClass1);
                androidSvg2.visitIds(anonymousClass1);
                androidSvg.visitIds(anonymousClass1);
                break;
        }
    }

    public FormProtocolNode(int i, ScaffoldBinding scaffoldBinding, FormHostProtocol formHostProtocol) {
        super(i);
        this.protocol = formHostProtocol;
        this._widget = scaffoldBinding;
        this.header = new AndroidSvg(scaffoldBinding.header);
        this.body = new AndroidSvg(scaffoldBinding.body);
        this.footer = new AndroidSvg(scaffoldBinding.footer);
    }

    public FormProtocolNode(int i, ReceiptScaffoldBinding receiptScaffoldBinding, ClickableCellHostProtocol clickableCellHostProtocol) {
        super(i);
        this.protocol = clickableCellHostProtocol;
        this._widget = receiptScaffoldBinding;
        this.header = new AndroidSvg(receiptScaffoldBinding.header);
        this.body = new AndroidSvg(receiptScaffoldBinding.body);
        this.footer = new AndroidSvg(receiptScaffoldBinding.footer);
    }
}
