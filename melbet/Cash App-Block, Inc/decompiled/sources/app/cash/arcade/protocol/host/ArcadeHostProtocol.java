package app.cash.arcade.protocol.host;

import androidx.collection.MutableIntObjectMap;
import app.cash.arcade.protocol.host.arcade.ButtonHostProtocol;
import app.cash.arcade.protocol.host.arcade.ClickableCellHostProtocol;
import app.cash.arcade.protocol.host.arcade.FormHostProtocol;
import app.cash.arcade.protocol.host.arcade.IconHostProtocol;
import app.cash.arcade.protocol.host.arcade.ImageHostProtocol;
import app.cash.arcade.protocol.host.arcade.InputFieldHostProtocol;
import app.cash.arcade.protocol.host.arcade.LegacyAmountPickerHostProtocol;
import app.cash.arcade.protocol.host.arcade.NavBarHostProtocol;
import app.cash.arcade.protocol.host.arcade.RadioHostProtocol;
import app.cash.arcade.protocol.host.arcade.RoundedRectHostProtocol;
import app.cash.arcade.protocol.host.arcade.SearchBarHostProtocol;
import app.cash.arcade.protocol.host.arcade.SpinnerHostProtocol;
import app.cash.arcade.protocol.host.arcade.SwitchHostProtocol;
import app.cash.arcade.protocol.host.arcade.TextFieldHostProtocol;
import app.cash.arcade.protocol.host.arcade.TextHostProtocol;
import app.cash.arcade.protocol.host.arcade.TimelineHostProtocol;
import app.cash.arcade.protocol.host.arcade.TimelineItemHostProtocol;
import app.cash.arcade.protocol.host.arcade.ToastHostProtocol;
import app.cash.arcade.protocol.host.arcade.ToggleHostProtocol;
import app.cash.arcade.protocol.host.redwoodlayout.RowHostProtocol;
import app.cash.arcade.protocol.host.redwoodlazylayout.LazyListHostProtocol;
import app.cash.redwood.protocol.host.WidgetHostProtocol;
import com.fillr.n;
import kotlinx.serialization.json.JsonImpl;

/* loaded from: classes.dex */
public final class ArcadeHostProtocol {
    public final JsonImpl json;
    public final n.b mismatchHandler;
    public final MutableIntObjectMap widgets;

    public ArcadeHostProtocol(JsonImpl jsonImpl, n.b bVar) {
        this.json = jsonImpl;
        this.mismatchHandler = bVar;
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(62);
        mutableIntObjectMap.put(5, new NavBarHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(11, new ButtonHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(13, new TextHostProtocol(jsonImpl, bVar));
        mutableIntObjectMap.put(14, new SwitchHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(15, new RadioHostProtocol(jsonImpl, bVar, 4));
        mutableIntObjectMap.put(16, new IconHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(18, new ImageHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(19, new TextFieldHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(20, new FormHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(21, new TextFieldHostProtocol(jsonImpl, bVar, 3));
        mutableIntObjectMap.put(22, new SpinnerHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(25, new FormHostProtocol(jsonImpl, bVar, 2));
        mutableIntObjectMap.put(34, new RoundedRectHostProtocol(jsonImpl, bVar, 2));
        mutableIntObjectMap.put(35, new RadioHostProtocol(jsonImpl, bVar, 3));
        mutableIntObjectMap.put(36, new RadioHostProtocol(jsonImpl, bVar, 2));
        mutableIntObjectMap.put(39, new ToggleHostProtocol(jsonImpl, bVar, 2));
        mutableIntObjectMap.put(40, new SwitchHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(41, new SearchBarHostProtocol(jsonImpl, bVar, 2));
        mutableIntObjectMap.put(42, new FormHostProtocol(jsonImpl, bVar, 5));
        mutableIntObjectMap.put(43, new ImageHostProtocol(jsonImpl, bVar, 2));
        mutableIntObjectMap.put(44, new TextFieldHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(45, new LegacyAmountPickerHostProtocol(jsonImpl, bVar));
        mutableIntObjectMap.put(46, new FormHostProtocol(jsonImpl, bVar, 3));
        mutableIntObjectMap.put(47, new NavBarHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(48, new TimelineHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(49, new TimelineItemHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(51, new ClickableCellHostProtocol(jsonImpl, bVar, 2));
        mutableIntObjectMap.put(52, new FormHostProtocol(jsonImpl, bVar, 4));
        mutableIntObjectMap.put(53, new NavBarHostProtocol(jsonImpl, bVar, 2));
        mutableIntObjectMap.put(54, new FormHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(55, new SearchBarHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(56, new ClickableCellHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(57, new ImageHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(60, new TextFieldHostProtocol(jsonImpl, bVar, 2));
        mutableIntObjectMap.put(62, new RoundedRectHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(64, new ClickableCellHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(66, new ImageHostProtocol(jsonImpl, bVar, 3));
        mutableIntObjectMap.put(67, new ToastHostProtocol(jsonImpl, bVar, 2));
        mutableIntObjectMap.put(68, new SwitchHostProtocol(jsonImpl, bVar, 2));
        mutableIntObjectMap.put(69, new TimelineItemHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(70, new RadioHostProtocol(jsonImpl, bVar, 5));
        mutableIntObjectMap.put(71, new SearchBarHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(72, new RoundedRectHostProtocol(jsonImpl, bVar, 3));
        mutableIntObjectMap.put(73, new TimelineHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(74, new SpinnerHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(75, new ClickableCellHostProtocol(jsonImpl, bVar, 3));
        mutableIntObjectMap.put(76, new ToggleHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(77, new RadioHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(78, new ToggleHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(79, new ToastHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(80, new InputFieldHostProtocol(jsonImpl, bVar));
        mutableIntObjectMap.put(81, new RoundedRectHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(82, new ToastHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(83, new SwitchHostProtocol(jsonImpl, bVar, 3));
        mutableIntObjectMap.put(84, new TimelineHostProtocol(jsonImpl, bVar, 2));
        mutableIntObjectMap.put(85, new RadioHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(1000001, new RowHostProtocol(jsonImpl, bVar, 0));
        mutableIntObjectMap.put(1000002, new RowHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(1000003, new ImageHostProtocol(jsonImpl, bVar, 4));
        mutableIntObjectMap.put(1000004, new IconHostProtocol(jsonImpl, bVar, 1));
        mutableIntObjectMap.put(2000001, new LazyListHostProtocol(jsonImpl, bVar));
        mutableIntObjectMap.put(2000002, new ButtonHostProtocol(jsonImpl, bVar, 1));
        this.widgets = mutableIntObjectMap;
    }

    /* renamed from: widget-WCEpcRY, reason: not valid java name */
    public final WidgetHostProtocol m1194widgetWCEpcRY(int i) {
        WidgetHostProtocol widgetHostProtocol = (WidgetHostProtocol) this.widgets.get(i);
        if (widgetHostProtocol != null) {
            return widgetHostProtocol;
        }
        this.mismatchHandler.m1947onUnknownWidgetWCEpcRY(i);
        return null;
    }
}
