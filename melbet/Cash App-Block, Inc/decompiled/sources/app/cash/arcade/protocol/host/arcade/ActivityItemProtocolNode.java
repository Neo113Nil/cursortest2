package app.cash.arcade.protocol.host.arcade;

import androidx.camera.view.PreviewView;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.redwood.protocol.host.ProtocolNode;
import app.cash.redwood.protocol.host.UiPropertyChange;
import app.cash.redwood.widget.Widget;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.caverock.androidsvg.SVG;
import com.squareup.cash.history.views.ActivityItemLayout;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;

/* loaded from: classes3.dex */
public final class ActivityItemProtocolNode extends ProtocolNode {
    public ActivityItemLayout _widget;
    public final AndroidSvg action;
    public final AndroidSvg avatar;
    public final SwitchHostProtocol protocol;
    public final AndroidSvg subtitle;
    public final AndroidSvg title;
    public final AndroidSvg unread;

    public final class OnClick {
        public final SVG eventSink;
        public final int id;

        public OnClick(int i, SVG svg) {
            svg.getClass();
            this.id = i;
            this.eventSink = svg;
        }
    }

    public ActivityItemProtocolNode(int i, ActivityItemLayout activityItemLayout, SwitchHostProtocol switchHostProtocol) {
        super(i);
        this.protocol = switchHostProtocol;
        this._widget = activityItemLayout;
        this.unread = new AndroidSvg(activityItemLayout.unread);
        this.avatar = new AndroidSvg(activityItemLayout.avatar);
        this.title = new AndroidSvg(activityItemLayout.title);
        this.subtitle = new AndroidSvg(activityItemLayout.subtitle);
        this.action = new AndroidSvg(activityItemLayout.action);
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void apply(UiPropertyChange uiPropertyChange, SVG svg) {
        svg.getClass();
        ActivityItemLayout activityItemLayout = this._widget;
        if (activityItemLayout == null) {
            a$$ExternalSyntheticBUOutline0.m$1("detached");
            return;
        }
        int i = uiPropertyChange.tag;
        Object obj = uiPropertyChange.value;
        if (i != 1) {
            if (i != 2) {
                this.protocol.mismatchHandler.m1946onUnknownPropertyLKUuuww(14, i);
                return;
            } else {
                return;
            }
        }
        obj.getClass();
        PageFetcher$generateNewPagingSource$3 pageFetcher$generateNewPagingSource$3 = ((Boolean) obj).booleanValue() ? new PageFetcher$generateNewPagingSource$3(0, new OnClick(this.id, svg), OnClick.class, "invoke", "invoke()V", 0, 3) : null;
        if (pageFetcher$generateNewPagingSource$3 != null) {
            activityItemLayout.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(pageFetcher$generateNewPagingSource$3, 3));
        } else {
            activityItemLayout.setOnClickListener(null);
            activityItemLayout.setClickable(false);
        }
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    /* renamed from: children-dBpC-2Y, reason: not valid java name */
    public final AndroidSvg mo1195childrendBpC2Y(int i) {
        if (i == 1) {
            return this.unread;
        }
        if (i == 2) {
            return this.avatar;
        }
        if (i == 3) {
            return this.title;
        }
        if (i == 4) {
            return this.subtitle;
        }
        if (i == 5) {
            return this.action;
        }
        this.protocol.mismatchHandler.m1945onUnknownChildreniETOA3M(14, i);
        return null;
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void detach() {
        this.unread.detach();
        this.avatar.detach();
        this.title.detach();
        this.subtitle.detach();
        this.action.detach();
        this._widget = null;
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final Widget getWidget() {
        ActivityItemLayout activityItemLayout = this._widget;
        if (activityItemLayout != null) {
            return activityItemLayout;
        }
        a$$ExternalSyntheticBUOutline0.m$1("detached");
        return null;
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final String getWidgetName() {
        return "ActivityItem";
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    /* renamed from: getWidgetTag-BlhN7y0, reason: not valid java name */
    public final int mo1196getWidgetTagBlhN7y0() {
        return 14;
    }

    @Override // app.cash.redwood.protocol.host.ProtocolNode
    public final void visitIds(PreviewView.AnonymousClass1 anonymousClass1) {
        anonymousClass1.getClass();
        anonymousClass1.m125visitou3jOuA(this.id);
        this.unread.visitIds(anonymousClass1);
        this.avatar.visitIds(anonymousClass1);
        this.title.visitIds(anonymousClass1);
        this.subtitle.visitIds(anonymousClass1);
        this.action.visitIds(anonymousClass1);
    }
}
