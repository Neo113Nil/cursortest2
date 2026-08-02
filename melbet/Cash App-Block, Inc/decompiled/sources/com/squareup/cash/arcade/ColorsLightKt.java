package com.squareup.cash.arcade;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.squareup.cash.arcade.Colors;

/* loaded from: classes.dex */
public abstract class ColorsLightKt {
    public static final Colors.Base baseColorsLight = new Colors.Base(ColorKt.Color(-758216), ColorKt.Color(-3388669), ColorKt.Color(-16722689), ColorKt.Color(-16726544), ColorKt.Color(-13922841), ColorKt.Color(-16745279), ColorKt.Color(-758216), ColorKt.Color(-15278370), ColorKt.Color(-15748097), ColorKt.Color(-16161324), ColorKt.Color(-16719853), ColorKt.Color(-3997753), ColorKt.Color(-9830538), ColorKt.Color(-16714475), ColorKt.Color(-16718573), ColorKt.Color(-16722670), ColorKt.Color(-16726511), ColorKt.Color(-16730609), ColorKt.Color(-16734450), ColorKt.Color(-16738291), ColorKt.Color(-16741876), ColorKt.Color(-16745718), ColorKt.Color(-16749303), ColorKt.Color(-16752632), ColorKt.Color(-16756217), ColorKt.Color(-16759546), ColorKt.Color(-16762875), ColorKt.Color(-16765948), ColorKt.Color(-16768765), ColorKt.Color(-16772094), ColorKt.Color(-2556140), ColorKt.Color(-3937536), ColorKt.Color(-16770143), ColorKt.Color(-677120), ColorKt.Color(-16722637), ColorKt.Color(-16728276), ColorKt.Color(-4718408), ColorKt.Color(-37155), ColorKt.Color(-6422370), ColorKt.Color(-13395457), ColorKt.Color(-36550), ColorKt.Color(-19427), ColorKt.Color(-892631), ColorKt.Color(-1051397), ColorKt.Color(-302908), ColorKt.Color(-5160449), ColorKt.Color(-9107805), ColorKt.Color(-12621057), ColorKt.Color(-46518), ColorKt.Color(-2875617), ColorKt.Color(-16722689), ColorKt.Color(-13354174), ColorKt.Color(-337347), ColorKt.Color(-12457023), ColorKt.Color(-11861830), ColorKt.Color(-16722353), ColorKt.Color(-16727481), ColorKt.Color(-16728762), ColorKt.Color(-16730045), ColorKt.Color(-16777216), ColorKt.Color(0), ColorKt.Color(-1), ColorKt.Color(-16723639), ColorKt.Color(-16746196), ColorKt.Color(-15724528), ColorKt.Color(-15066598), ColorKt.Color(-14803426), ColorKt.Color(-14474461), ColorKt.Color(-14013910), ColorKt.Color(-13421773), ColorKt.Color(-10921639), ColorKt.Color(-10066330), ColorKt.Color(-7895161), ColorKt.Color(-6974059), ColorKt.Color(-3355444), ColorKt.Color(-2434342), ColorKt.Color(-1513240), ColorKt.Color(-986896), ColorKt.Color(-526345), ColorKt.Color(-5468417), ColorKt.Color(-10092135), ColorKt.Color(-537137), ColorKt.Color(-13497073), ColorKt.Color(-805705), ColorKt.Color(-360826), ColorKt.Color(-364657), ColorKt.Color(-506030), ColorKt.Color(-2948082), ColorKt.Color(-2685938), ColorKt.Color(-7339254), ColorKt.Color(-11922666), ColorKt.Color(-2238721), ColorKt.Color(-3160833), ColorKt.Color(-5268225), ColorKt.Color(-7112449), ColorKt.Color(-1184769), ColorKt.Color(-10682136), ColorKt.Color(-11861830), ColorKt.Color(-12713831), ColorKt.Color(-13500294), ColorKt.Color(-14352295));
    public static final Colors colorsLight = m3376createLightmxwnekA$default(3, 0);

    /* renamed from: createLight-mxwnekA$default, reason: not valid java name */
    public static Colors m3376createLightmxwnekA$default(int i, long j) {
        long j2;
        long j3;
        long j4 = (i & 2) != 0 ? Color.Unspecified : j;
        Colors.Base base = baseColorsLight;
        base.getClass();
        long j5 = base.constantClear;
        long j6 = base.brandCashGreen;
        long j7 = base.constantBlack;
        long j8 = base.constantWhite;
        Colors.Semantic.Accent accent = new Colors.Semantic.Accent(ColorKt.Color(-758216), ColorKt.Color(-13395457), ColorKt.Color(-302908), ColorKt.Color(-5160449), ColorKt.Color(-12621057), ColorKt.Color(-46518), ColorKt.Color(-16722689), ColorKt.Color(-337347), ColorKt.Color(-12457023));
        long j9 = base.constantWhite;
        if (j4 != 16) {
            j2 = j4;
            j3 = j2;
        } else {
            j2 = j4;
            j3 = j6;
        }
        long j10 = base.red60;
        long j11 = base.grey65;
        long j12 = base.constantBlack;
        long j13 = base.grey50;
        long j14 = j4 != 16 ? j2 : j6;
        long j15 = base.red70;
        long j16 = base.grey80;
        long j17 = base.grey90;
        long j18 = base.grey95;
        long j19 = base.amber20;
        Colors.Semantic.Background background = new Colors.Semantic.Background(j9, j3, j10, j11, j12, j13, j9, j14, j15, j16, j12, j17, j18, j19);
        long j20 = j3;
        long j21 = j4 != 16 ? j2 : j6;
        long j22 = base.grey10;
        long j23 = base.green20;
        Colors.Semantic.Border border = new Colors.Semantic.Border(j9, j21, j10, j9, j22, j11, j17, j23, j19);
        long j24 = j21;
        Colors.Semantic.Icon icon = new Colors.Semantic.Icon(j4 != 16 ? j2 : j6, j10, j11, j11, base.blue20, j9, j12, j12, j13, j23, j19);
        long Color = ColorKt.Color(-16722689);
        long Color2 = ColorKt.Color(-16726544);
        Colors.Semantic.Service service = new Colors.Semantic.Service(Color, Color2, ColorKt.Color(-554453), ColorKt.Color(-16728602), base.brandOcean, ColorKt.Color(-7334914), base.violet50, base.violet60);
        long j25 = j4 != 16 ? j2 : j6;
        long j26 = base.red60;
        long j27 = base.grey65;
        long j28 = base.constantWhite;
        long j29 = base.constantBlack;
        long j30 = base.purple20;
        long j31 = base.grey50;
        Colors.Semantic semantic = new Colors.Semantic(accent, background, border, icon, service, new Colors.Semantic.Text(j25, j26, j27, j28, j29, j30, j31, j29, j29, j31, base.green20, base.amber20));
        Colors.Component.Avatar avatar = new Colors.Component.Avatar(new Colors.Component.Avatar.Background(base.brandAmber, base.brandPink, base.brandRoyal, base.brandSunshine, base.brandTurquoise, base.brandScarlet, base.brandPurple, base.brandOcean, base.brandSky), new Colors.Component.Avatar.Name(j29), j28);
        Colors.Component.Badge badge = new Colors.Component.Badge(j15, j28);
        Colors.Component.BottomNavigation bottomNavigation = new Colors.Component.BottomNavigation(j9, new Colors.Component.BottomNavigation.Bitcoin(Color2, new Colors.Component.BottomNavigation.Bitcoin.Icon(ColorKt.Color(-1291845633), j9), new Colors.Component.BottomNavigation.Bitcoin.Text(ColorKt.Color(-1291845633), j28)), new Colors.Component.BottomNavigation.Icon(j11, j12), new Colors.Component.BottomNavigation.Keypad(j6, new Colors.Component.BottomNavigation.Keypad.Icon(ColorKt.Color(1929379840), j7), new Colors.Component.BottomNavigation.Keypad.Text(ColorKt.Color(-1728053248), j7)), new Colors.Component.BottomNavigation.Text(j31, j29));
        long j32 = base.red20;
        long j33 = base.red80;
        Colors.Component.Button button = new Colors.Component.Button(new Colors.Component.Button.Destructive(new Colors.Component.Button.Destructive.Prominent(new Colors.Component.Button.Destructive.Prominent.Background(j10, j32, j33), new Colors.Component.Button.Destructive.Prominent.Icon(j9, j9), new Colors.Component.Button.Destructive.Prominent.Text(j28, j28)), new Colors.Component.Button.Destructive.Standard(new Colors.Component.Button.Destructive.Standard.Background(j17, j18, j16), new Colors.Component.Button.Destructive.Standard.Icon(j10, j32, j33), new Colors.Component.Button.Destructive.Standard.Text(j26, j32, j33)), new Colors.Component.Button.Destructive.Subtle(new Colors.Component.Button.Destructive.Subtle.Background(j5, base.red10), new Colors.Component.Button.Destructive.Subtle.Icon(j10, j32, j33), new Colors.Component.Button.Destructive.Subtle.Text(j26, j32, j33))), new Colors.Component.Button.Prominent(new Colors.Component.Button.Prominent.Background(j12, Color.m675copywmQWz5c$default(0.3f, j12, 14), j13, j9), new Colors.Component.Button.Prominent.Icon(j9, Color.m675copywmQWz5c$default(0.5f, j9, 14)), new Colors.Component.Button.Prominent.Text(j28, Color.m675copywmQWz5c$default(0.5f, j28, 14), j28)), new Colors.Component.Button.Standard(new Colors.Component.Button.Standard.Background(j17, j18, j16), new Colors.Component.Button.Standard.Icon(j12, j11), new Colors.Component.Button.Standard.Text(j29, j27)), new Colors.Component.Button.Subtle(new Colors.Component.Button.Subtle.Background(j5, Color.m675copywmQWz5c$default(0.2f, j12, 14)), new Colors.Component.Button.Subtle.Icon(j12, j11, ColorUtilsKt.m2984addLuminanceDxMtmZc(j12, -0.12f)), new Colors.Component.Button.Subtle.Text(j29, j27, ColorUtilsKt.m2984addLuminanceDxMtmZc(j29, -0.12f))));
        Colors.Component.Card card = new Colors.Component.Card(new Colors.Component.Card.Background(j9, j16), new Colors.Component.Card.Border(j17, j11));
        Colors.Component.Cell cell = new Colors.Component.Cell(new Colors.Component.Cell.Background(j9, j16), new Colors.Component.Cell.Body(j29, j27), new Colors.Component.Cell.Controls(new Colors.Component.Cell.Controls.ActivityAmount(j31, j31, j31), new Colors.Component.Cell.Controls.Icon(j12, j12), j29), new Colors.Component.Cell.Label(j29, j27));
        Colors.Component.Checkbox.Active.Background background2 = new Colors.Component.Checkbox.Active.Background(j12, ColorKt.Color(1291845632), ColorKt.Color(855638016));
        long j34 = base.constantClear;
        Colors.Component.Checkbox checkbox = new Colors.Component.Checkbox(new Colors.Component.Checkbox.Active(background2, new Colors.Component.Checkbox.Active.Border(j34), j9), new Colors.Component.Checkbox.Inactive(new Colors.Component.Checkbox.Inactive.Background(j34, j34, j18), new Colors.Component.Checkbox.Inactive.Border(j11, j17)));
        Colors.Component.CopyCode copyCode = new Colors.Component.CopyCode(new Colors.Component.CopyCode.Background(j9, j16), j12, new Colors.Component.CopyCode.Success(j9, j23, j23));
        Colors.Component.FilterBar filterBar = new Colors.Component.FilterBar(new Colors.Component.FilterBar.Chip(new Colors.Component.FilterBar.Chip.Background(j18, j18, j17, j16), new Colors.Component.FilterBar.Chip.Icon(j12, j11), new Colors.Component.FilterBar.Chip.Text(j29, j27)));
        Colors.Component.HalfSheet halfSheet = new Colors.Component.HalfSheet(j9);
        Colors.Component.Header header = new Colors.Component.Header(j29, j13, j29);
        Colors.Component.Input input = new Colors.Component.Input(new Colors.Component.Input.Background(j9, j16, new Colors.Component.Input.Background.Selected(j9, j16)), new Colors.Component.Input.Border(j11, j17, j10, j22), new Colors.Component.Input.Checkbox(new Colors.Component.Input.Checkbox.Inactive(new Colors.Component.Input.Checkbox.Inactive.Border(j11))), new Colors.Component.Input.Chip(new Colors.Component.Input.Chip.Icon(j12, j11)), j22, new Colors.Component.Input.Helper(j12, new Colors.Component.Input.Helper.Text(j29, j26)), new Colors.Component.Input.Icon(j13, j11, j10, new Colors.Component.Input.Icon.Leading(j13, j11, j12), j12, new Colors.Component.Input.Icon.Trailing(j13, j11, j10, j12)), new Colors.Component.Input.Label(j29, j27), new Colors.Component.Input.Radio(new Colors.Component.Input.Radio.Inactive(new Colors.Component.Input.Radio.Inactive.Border(j11))), new Colors.Component.Input.Text(j29, j27, j31));
        Colors.Component.Modal.Button.Destructive.Background background3 = new Colors.Component.Modal.Button.Destructive.Background(j16);
        long j35 = base.red20;
        long j36 = base.red80;
        Colors.Component.Modal modal = new Colors.Component.Modal(j9, new Colors.Component.Modal.Button(new Colors.Component.Modal.Button.Destructive(background3, new Colors.Component.Modal.Button.Destructive.Text(j26, j35, j36)), new Colors.Component.Modal.Button.Primary(new Colors.Component.Modal.Button.Primary.Background(j16), new Colors.Component.Modal.Button.Primary.Destructive(new Colors.Component.Modal.Button.Primary.Destructive.Text(j26, j35, j36)), new Colors.Component.Modal.Button.Primary.Text(j29, j27)), new Colors.Component.Modal.Button.Secondary(new Colors.Component.Modal.Button.Secondary.Background(j16), new Colors.Component.Modal.Button.Secondary.Text(j31, j27))));
        Colors.Component.OptionCard optionCard = new Colors.Component.OptionCard(new Colors.Component.OptionCard.Background(j9, j16), new Colors.Component.OptionCard.Body(j29, j27), new Colors.Component.OptionCard.Border(j11, new Colors.Component.OptionCard.Border.Selected(j22, j17, j22)), new Colors.Component.OptionCard.Label(j29, j27));
        Colors.Component.OptionChip optionChip = new Colors.Component.OptionChip(new Colors.Component.OptionChip.Background(j9, j16), new Colors.Component.OptionChip.Border(j11, j17, j22), new Colors.Component.OptionChip.Icon(j12, j11), new Colors.Component.OptionChip.Text(j29, j27));
        Colors.Component.Radio.Active active = new Colors.Component.Radio.Active(new Colors.Component.Radio.Active.Background(ColorKt.Color(855638016)), new Colors.Component.Radio.Active.Border(j22, ColorKt.Color(1291845632)));
        long j37 = base.constantClear;
        Colors.Component.Radio radio = new Colors.Component.Radio(active, new Colors.Component.Radio.Inactive(new Colors.Component.Radio.Inactive.Background(j37, j37, j18), new Colors.Component.Radio.Inactive.Border(j11, j17)));
        Colors.Component.SearchBar searchBar = new Colors.Component.SearchBar(j9, new Colors.Component.SearchBar.Icon(j13, j11), new Colors.Component.SearchBar.Text(j29, j31));
        Colors.Component.SearchField searchField = new Colors.Component.SearchField(new Colors.Component.SearchField.Background(j18, j16), new Colors.Component.SearchField.Icon(j13, j11), j31, j29);
        Colors.Component.SegmentedControl segmentedControl = new Colors.Component.SegmentedControl(j17, new Colors.Component.SegmentedControl.Button(new Colors.Component.SegmentedControl.Button.Background(j9), j29), new Colors.Component.SegmentedControl.Overlay(new Colors.Component.SegmentedControl.Overlay.Button(new Colors.Component.SegmentedControl.Overlay.Button.Background(Color.m675copywmQWz5c$default(0.32f, j8, 14)), new Colors.Component.SegmentedControl.Overlay.Button.Text(Color.m675copywmQWz5c$default(0.64f, j8, 14), j8))));
        Colors.Component.Sheet sheet = new Colors.Component.Sheet(j9, new Colors.Component.Sheet.Handle(j11));
        Colors.Component.Slider slider = new Colors.Component.Slider(new Colors.Component.Slider.Bar(new Colors.Component.Slider.Bar.Filled(j20), new Colors.Component.Slider.Bar.Unfilled(j17)), new Colors.Component.Slider.Knob(j20, j17), new Colors.Component.Slider.Thumb(j20, j17), new Colors.Component.Slider.Track(new Colors.Component.Slider.Track.Filled(j20), new Colors.Component.Slider.Track.Unfilled(j17)));
        Colors.Component.Timeline.Background background4 = new Colors.Component.Timeline.Background(j9, j16);
        long j38 = base.grey10;
        Colors.Component.Timeline timeline = new Colors.Component.Timeline(background4, new Colors.Component.Timeline.Dot(new Colors.Component.Timeline.Dot.Background(j38, j38, j9, j18, j38, j38), new Colors.Component.Timeline.Dot.Border(j22)), new Colors.Component.Timeline.Line(new Colors.Component.Timeline.Line.Border(j22, j22, j22, base.grey95, j22, j22)));
        Colors.Component.TitleBar titleBar = new Colors.Component.TitleBar(j9, new Colors.Component.TitleBar.Button(new Colors.Component.TitleBar.Button.Background(ColorKt.Color(-1711276033), ColorKt.Color(872415231), ColorKt.Color(-1711276033))), new Colors.Component.TitleBar.Icon(j12, j13), new Colors.Component.TitleBar.Keypad(j6, new Colors.Component.TitleBar.Keypad.Icon(j7, ColorKt.Color(-1308622848))), j29);
        long j39 = base.grey25;
        Colors.Component.Toast toast = new Colors.Component.Toast(new Colors.Component.Toast.Background(j39), new Colors.Component.Toast.Button(new Colors.Component.Toast.Button.Background(j39, base.grey40)));
        long m2985asDisabledDxMtmZc$default = ColorUtilsKt.m2985asDisabledDxMtmZc$default(j2);
        if (m2985asDisabledDxMtmZc$default == 16) {
            m2985asDisabledDxMtmZc$default = Color.m675copywmQWz5c$default(0.75f, j20, 14);
        }
        Colors.Component component = new Colors.Component(avatar, badge, bottomNavigation, button, card, cell, checkbox, copyCode, filterBar, halfSheet, header, input, modal, optionCard, optionChip, radio, searchBar, searchField, segmentedControl, sheet, slider, timeline, titleBar, toast, new Colors.Component.Toggle(new Colors.Component.Toggle.Active(new Colors.Component.Toggle.Active.Background(j20, m2985asDisabledDxMtmZc$default)), new Colors.Component.Toggle.Inactive(new Colors.Component.Toggle.Inactive.Background(j17, j18)), new Colors.Component.Toggle.Knob(new Colors.Component.Toggle.Knob.Background(j8, Color.m675copywmQWz5c$default(0.75f, j8, 14))), new Colors.Component.Toggle.Off(new Colors.Component.Toggle.Off.Background(j17, j18)), new Colors.Component.Toggle.On(new Colors.Component.Toggle.On.Background(j20, ColorKt.Color(-1090464177))), new Colors.Component.Toggle.Thumb(new Colors.Component.Toggle.Thumb.Background(j8, ColorKt.Color(-1073741825)))), new Colors.Component.Tooltip(j12), new Colors.Component.Ui(border.prominent, new Colors.Component.Ui.Dimmer(ColorKt.Color(1929379840)), new Colors.Component.Ui.Divider(j17), new Colors.Component.Ui.Handle(j11), new Colors.Component.Ui.HomeIndicator(j22, new Colors.Component.Ui.HomeIndicator.Inverse(j9))));
        Colors.Surface surface = new Colors.Surface(new Colors.Surface.Keypad(base.brandCashGreen, new Colors.Surface.Keypad.Button(new Colors.Surface.Keypad.Button.Background(ColorKt.Color(436207616)), j12, j29), ColorKt.Color(-14803426), j29), new Colors.Surface.Money(new Colors.Surface.Money.Applet(new Colors.Surface.Money.Applet.Asset(j18), j9, new Colors.Surface.Money.Applet.Button(new Colors.Surface.Money.Applet.Button.Background(j17, j18, j16), new Colors.Surface.Money.Applet.Button.Text(j29, j27)), new Colors.Surface.Money.Applet.Data(new Colors.Surface.Money.Applet.Data.Active(j24), new Colors.Surface.Money.Applet.Data.Inactive(j17))), j18, new Colors.Surface.Money.Ui(new Colors.Surface.Money.Ui.Divider(base.grey80))));
        long j40 = base.brandCashGreen80;
        long j41 = base.grey40;
        long j42 = base.brandCashGreen65;
        long j43 = base.grey50;
        long j44 = base.brandCashGreen;
        long j45 = base.grey80;
        long j46 = base.brandCashGreen50;
        long j47 = base.grey60;
        long j48 = base.brandCashGreen35;
        long j49 = base.grey65;
        return new Colors(true, base, semantic, component, surface, new Colors.Data(new Colors.Data.Part(new Colors.Data.Part.OfFive(j40, j41, j42, j43, j44, j45, j46, j47, j48, j49), new Colors.Data.Part.OfFour(j40, j43, j44, j45, base.brandCashGreen60, j47, base.brandCashGreen40, j49), new Colors.Data.Part.OfOne(j44, j45), new Colors.Data.Part.OfThree(j44, j45, j40, j47, j46, j49), new Colors.Data.Part.OfTwo(j44, j45, j40, j47)), new Colors.Data.Portion(base.grey95, j6), new Colors.Data.Trend(j7, j6)));
    }
}
