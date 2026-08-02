package com.squareup.cash.arcade;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.squareup.cash.arcade.Colors;

/* loaded from: classes.dex */
public abstract class ColorsDarkKt {
    public static final Colors.Base baseColorsDark = new Colors.Base(ColorKt.Color(-758216), ColorKt.Color(-3388669), ColorKt.Color(-16722689), ColorKt.Color(-16726544), ColorKt.Color(-13922841), ColorKt.Color(-16745279), ColorKt.Color(-758216), ColorKt.Color(-15278370), ColorKt.Color(-15748097), ColorKt.Color(-16161324), ColorKt.Color(-16719853), ColorKt.Color(-3997753), ColorKt.Color(-9830538), ColorKt.Color(-16714475), ColorKt.Color(-16718573), ColorKt.Color(-16722670), ColorKt.Color(-16726511), ColorKt.Color(-16730609), ColorKt.Color(-16734450), ColorKt.Color(-16738291), ColorKt.Color(-16741876), ColorKt.Color(-16745718), ColorKt.Color(-16749303), ColorKt.Color(-16752632), ColorKt.Color(-16756217), ColorKt.Color(-16759546), ColorKt.Color(-16762875), ColorKt.Color(-16765948), ColorKt.Color(-16768765), ColorKt.Color(-16772094), ColorKt.Color(-2556140), ColorKt.Color(-3937536), ColorKt.Color(-16770143), ColorKt.Color(-677120), ColorKt.Color(-16722637), ColorKt.Color(-16728276), ColorKt.Color(-4718408), ColorKt.Color(-37155), ColorKt.Color(-6422370), ColorKt.Color(-13395457), ColorKt.Color(-36550), ColorKt.Color(-19427), ColorKt.Color(-892631), ColorKt.Color(-1051397), ColorKt.Color(-302908), ColorKt.Color(-5160449), ColorKt.Color(-9107805), ColorKt.Color(-12621057), ColorKt.Color(-46518), ColorKt.Color(-2875617), ColorKt.Color(-16722689), ColorKt.Color(-13354174), ColorKt.Color(-337347), ColorKt.Color(-12457023), ColorKt.Color(-11861830), ColorKt.Color(-16722353), ColorKt.Color(-16727481), ColorKt.Color(-16728762), ColorKt.Color(-16730045), ColorKt.Color(-16777216), ColorKt.Color(0), ColorKt.Color(-1), ColorKt.Color(-16723639), ColorKt.Color(-16746196), ColorKt.Color(-15724528), ColorKt.Color(-15066598), ColorKt.Color(-14803426), ColorKt.Color(-14474461), ColorKt.Color(-14013910), ColorKt.Color(-13421773), ColorKt.Color(-10921639), ColorKt.Color(-10066330), ColorKt.Color(-7895161), ColorKt.Color(-6974059), ColorKt.Color(-3355444), ColorKt.Color(-2434342), ColorKt.Color(-1513240), ColorKt.Color(-986896), ColorKt.Color(-526345), ColorKt.Color(-5468417), ColorKt.Color(-10092135), ColorKt.Color(-537137), ColorKt.Color(-13497073), ColorKt.Color(-805705), ColorKt.Color(-360826), ColorKt.Color(-364657), ColorKt.Color(-506030), ColorKt.Color(-2948082), ColorKt.Color(-2685938), ColorKt.Color(-7339254), ColorKt.Color(-11922666), ColorKt.Color(-2238721), ColorKt.Color(-3160833), ColorKt.Color(-5268225), ColorKt.Color(-7112449), ColorKt.Color(-1184769), ColorKt.Color(-10682136), ColorKt.Color(-11861830), ColorKt.Color(-12713831), ColorKt.Color(-13500294), ColorKt.Color(-14352295));
    public static final Colors colorsDark = m3375createDarkmxwnekA$default(3, 0);

    /* renamed from: createDark-mxwnekA$default, reason: not valid java name */
    public static Colors m3375createDarkmxwnekA$default(int i, long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7 = (i & 2) != 0 ? Color.Unspecified : j;
        Colors.Base base = baseColorsDark;
        base.getClass();
        long j8 = base.constantClear;
        long j9 = base.constantBlack;
        long j10 = base.brandCashGreen;
        long j11 = base.constantWhite;
        Colors.Semantic.Accent accent = new Colors.Semantic.Accent(ColorKt.Color(-825554), ColorKt.Color(-14052097), ColorKt.Color(-305472), ColorKt.Color(-5425153), ColorKt.Color(-13278465), ColorKt.Color(-49088), ColorKt.Color(-16724747), ColorKt.Color(-337869), ColorKt.Color(-13047106));
        long j12 = base.constantBlack;
        if (j7 != 16) {
            j2 = j7;
            j3 = j2;
        } else {
            j2 = j7;
            j3 = j10;
        }
        long j13 = base.red50;
        long j14 = base.grey45;
        long j15 = base.constantWhite;
        long j16 = base.grey60;
        long j17 = base.red70;
        long j18 = base.grey40;
        long j19 = base.grey25;
        long j20 = base.grey15;
        long j21 = base.amber10;
        Colors.Semantic.Background background = new Colors.Semantic.Background(j12, j3, j13, j14, j15, j16, j12, j12, j17, j18, j15, j19, j20, j21);
        long j22 = j3;
        long j23 = j7 != 16 ? j2 : j10;
        long j24 = base.green10;
        Colors.Semantic.Border border = new Colors.Semantic.Border(j12, j23, j13, j12, j15, j14, j19, j24, j21);
        if (j7 != 16) {
            j4 = j15;
            j5 = j12;
            j6 = j2;
        } else {
            j4 = j15;
            j5 = j12;
            j6 = j10;
        }
        long j25 = j23;
        Colors.Semantic.Icon icon = new Colors.Semantic.Icon(j6, j13, j14, j14, base.blue10, j5, j4, j4, j16, j24, j21);
        long j26 = j4;
        long Color = ColorKt.Color(-16722689);
        long Color2 = ColorKt.Color(-16726544);
        Colors.Semantic.Service service = new Colors.Semantic.Service(Color, Color2, ColorKt.Color(-554453), ColorKt.Color(-16726032), base.brandOcean, ColorKt.Color(-5160449), base.violet40, base.violet80);
        long j27 = j7 != 16 ? j2 : j10;
        long j28 = base.red50;
        long j29 = base.grey45;
        long j30 = base.constantBlack;
        long j31 = base.constantWhite;
        long j32 = base.purple10;
        long j33 = base.grey60;
        Colors.Semantic semantic = new Colors.Semantic(accent, background, border, icon, service, new Colors.Semantic.Text(j27, j28, j29, j30, j31, j32, j33, j31, j31, j33, base.green10, base.amber10));
        Colors.Component.Avatar avatar = new Colors.Component.Avatar(new Colors.Component.Avatar.Background(base.brandAmber, base.brandPink, base.brandRoyal, base.brandSunshine, base.brandTurquoise, base.brandScarlet, base.brandPurple, base.brandOcean, base.brandSky), new Colors.Component.Avatar.Name(j31), j30);
        Colors.Component.Badge badge = new Colors.Component.Badge(j17, j31);
        Colors.Component.BottomNavigation.Bitcoin bitcoin = new Colors.Component.BottomNavigation.Bitcoin(Color2, new Colors.Component.BottomNavigation.Bitcoin.Icon(ColorKt.Color(-1291845633), j26), new Colors.Component.BottomNavigation.Bitcoin.Text(ColorKt.Color(-1291845633), j31));
        Colors.Component.BottomNavigation.Icon icon2 = new Colors.Component.BottomNavigation.Icon(j14, j26);
        long j34 = base.grey45;
        long j35 = j5;
        Colors.Component.BottomNavigation bottomNavigation = new Colors.Component.BottomNavigation(j35, bitcoin, icon2, new Colors.Component.BottomNavigation.Keypad(j9, new Colors.Component.BottomNavigation.Keypad.Icon(j34, j26), new Colors.Component.BottomNavigation.Keypad.Text(j34, j31)), new Colors.Component.BottomNavigation.Text(j33, j31));
        long j36 = base.red90;
        Colors.Component.Button.Destructive.Prominent prominent = new Colors.Component.Button.Destructive.Prominent(new Colors.Component.Button.Destructive.Prominent.Background(j13, j36, base.red30), new Colors.Component.Button.Destructive.Prominent.Icon(j35, j35), new Colors.Component.Button.Destructive.Prominent.Text(j30, j30));
        Colors.Component.Button.Destructive.Standard.Background background2 = new Colors.Component.Button.Destructive.Standard.Background(j19, j20, j18);
        long j37 = base.red40;
        Colors.Component.Button button = new Colors.Component.Button(new Colors.Component.Button.Destructive(prominent, new Colors.Component.Button.Destructive.Standard(background2, new Colors.Component.Button.Destructive.Standard.Icon(j13, j36, j37), new Colors.Component.Button.Destructive.Standard.Text(j28, j36, j37)), new Colors.Component.Button.Destructive.Subtle(new Colors.Component.Button.Destructive.Subtle.Background(j8, base.red100), new Colors.Component.Button.Destructive.Subtle.Icon(j13, j36, j37), new Colors.Component.Button.Destructive.Subtle.Text(j28, j36, j37))), new Colors.Component.Button.Prominent(new Colors.Component.Button.Prominent.Background(j26, Color.m675copywmQWz5c$default(0.3f, j26, 14), j16, j35), new Colors.Component.Button.Prominent.Icon(j35, Color.m675copywmQWz5c$default(0.4f, j35, 14)), new Colors.Component.Button.Prominent.Text(j30, Color.m675copywmQWz5c$default(0.4f, j30, 14), j30)), new Colors.Component.Button.Standard(new Colors.Component.Button.Standard.Background(j19, j20, j18), new Colors.Component.Button.Standard.Icon(j26, j14), new Colors.Component.Button.Standard.Text(j31, j29)), new Colors.Component.Button.Subtle(new Colors.Component.Button.Subtle.Background(j8, Color.m675copywmQWz5c$default(0.2f, j26, 14)), new Colors.Component.Button.Subtle.Icon(j26, j14, ColorUtilsKt.m2984addLuminanceDxMtmZc(j26, 0.12f)), new Colors.Component.Button.Subtle.Text(j31, j29, ColorUtilsKt.m2984addLuminanceDxMtmZc(j31, 0.12f))));
        Colors.Component.Card card = new Colors.Component.Card(new Colors.Component.Card.Background(j35, j18), new Colors.Component.Card.Border(j19, j14));
        Colors.Component.Cell cell = new Colors.Component.Cell(new Colors.Component.Cell.Background(j35, j18), new Colors.Component.Cell.Body(j31, j29), new Colors.Component.Cell.Controls(new Colors.Component.Cell.Controls.ActivityAmount(j33, j33, j33), new Colors.Component.Cell.Controls.Icon(j26, j26), j31), new Colors.Component.Cell.Label(j31, j29));
        Colors.Component.Checkbox.Active.Background background3 = new Colors.Component.Checkbox.Active.Background(j26, ColorKt.Color(1308622847), ColorKt.Color(872415231));
        long j38 = base.constantClear;
        Colors.Component.Checkbox checkbox = new Colors.Component.Checkbox(new Colors.Component.Checkbox.Active(background3, new Colors.Component.Checkbox.Active.Border(j38), j35), new Colors.Component.Checkbox.Inactive(new Colors.Component.Checkbox.Inactive.Background(j38, j38, j20), new Colors.Component.Checkbox.Inactive.Border(j14, j19)));
        Colors.Component.CopyCode copyCode = new Colors.Component.CopyCode(new Colors.Component.CopyCode.Background(j35, j18), j26, new Colors.Component.CopyCode.Success(j35, j24, j24));
        Colors.Component.FilterBar filterBar = new Colors.Component.FilterBar(new Colors.Component.FilterBar.Chip(new Colors.Component.FilterBar.Chip.Background(j20, j20, j19, j18), new Colors.Component.FilterBar.Chip.Icon(j26, j14), new Colors.Component.FilterBar.Chip.Text(j31, j29)));
        Colors.Component.HalfSheet halfSheet = new Colors.Component.HalfSheet(j35);
        Colors.Component.Header header = new Colors.Component.Header(j31, j16, j31);
        Colors.Component.Input input = new Colors.Component.Input(new Colors.Component.Input.Background(j35, j18, new Colors.Component.Input.Background.Selected(j35, j18)), new Colors.Component.Input.Border(j14, j19, j13, j26), new Colors.Component.Input.Checkbox(new Colors.Component.Input.Checkbox.Inactive(new Colors.Component.Input.Checkbox.Inactive.Border(j14))), new Colors.Component.Input.Chip(new Colors.Component.Input.Chip.Icon(j26, j14)), j26, new Colors.Component.Input.Helper(j26, new Colors.Component.Input.Helper.Text(j31, j28)), new Colors.Component.Input.Icon(j16, j14, j13, new Colors.Component.Input.Icon.Leading(j16, j14, j26), j26, new Colors.Component.Input.Icon.Trailing(j16, j14, j13, j26)), new Colors.Component.Input.Label(j31, j29), new Colors.Component.Input.Radio(new Colors.Component.Input.Radio.Inactive(new Colors.Component.Input.Radio.Inactive.Border(j14))), new Colors.Component.Input.Text(j31, j29, j33));
        Colors.Component.Modal.Button.Destructive.Background background4 = new Colors.Component.Modal.Button.Destructive.Background(j18);
        long j39 = base.red90;
        Colors.Component.Modal modal = new Colors.Component.Modal(j35, new Colors.Component.Modal.Button(new Colors.Component.Modal.Button.Destructive(background4, new Colors.Component.Modal.Button.Destructive.Text(j28, j39, base.red40)), new Colors.Component.Modal.Button.Primary(new Colors.Component.Modal.Button.Primary.Background(j18), new Colors.Component.Modal.Button.Primary.Destructive(new Colors.Component.Modal.Button.Primary.Destructive.Text(j28, j39, base.red30)), new Colors.Component.Modal.Button.Primary.Text(j31, j29)), new Colors.Component.Modal.Button.Secondary(new Colors.Component.Modal.Button.Secondary.Background(j18), new Colors.Component.Modal.Button.Secondary.Text(j33, j29))));
        Colors.Component.OptionCard optionCard = new Colors.Component.OptionCard(new Colors.Component.OptionCard.Background(j35, j18), new Colors.Component.OptionCard.Body(j31, j29), new Colors.Component.OptionCard.Border(j14, new Colors.Component.OptionCard.Border.Selected(j26, j19, j26)), new Colors.Component.OptionCard.Label(j31, j29));
        Colors.Component.OptionChip optionChip = new Colors.Component.OptionChip(new Colors.Component.OptionChip.Background(j35, j18), new Colors.Component.OptionChip.Border(j14, j19, j26), new Colors.Component.OptionChip.Icon(j26, j14), new Colors.Component.OptionChip.Text(j31, j29));
        Colors.Component.Radio.Active active = new Colors.Component.Radio.Active(new Colors.Component.Radio.Active.Background(ColorKt.Color(872415231)), new Colors.Component.Radio.Active.Border(j26, ColorKt.Color(1308622847)));
        long j40 = base.constantClear;
        Colors.Component.Radio radio = new Colors.Component.Radio(active, new Colors.Component.Radio.Inactive(new Colors.Component.Radio.Inactive.Background(j40, j40, j20), new Colors.Component.Radio.Inactive.Border(j14, j19)));
        Colors.Component.SearchBar searchBar = new Colors.Component.SearchBar(j35, new Colors.Component.SearchBar.Icon(j16, j14), new Colors.Component.SearchBar.Text(j31, j33));
        Colors.Component.SearchField searchField = new Colors.Component.SearchField(new Colors.Component.SearchField.Background(j20, j18), new Colors.Component.SearchField.Icon(j16, j14), j33, j31);
        Colors.Component.SegmentedControl.Button button2 = new Colors.Component.SegmentedControl.Button(new Colors.Component.SegmentedControl.Button.Background(j35), j31);
        Colors.Component.SegmentedControl.Overlay.Button.Background background5 = new Colors.Component.SegmentedControl.Overlay.Button.Background(Color.m675copywmQWz5c$default(0.32f, j11, 14));
        long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.64f, j11, 14);
        long j41 = base.constantWhite;
        Colors.Component.SegmentedControl segmentedControl = new Colors.Component.SegmentedControl(j19, button2, new Colors.Component.SegmentedControl.Overlay(new Colors.Component.SegmentedControl.Overlay.Button(background5, new Colors.Component.SegmentedControl.Overlay.Button.Text(m675copywmQWz5c$default, j41))));
        Colors.Component.Sheet sheet = new Colors.Component.Sheet(j35, new Colors.Component.Sheet.Handle(j14));
        Colors.Component.Slider slider = new Colors.Component.Slider(new Colors.Component.Slider.Bar(new Colors.Component.Slider.Bar.Filled(j22), new Colors.Component.Slider.Bar.Unfilled(j19)), new Colors.Component.Slider.Knob(j22, j19), new Colors.Component.Slider.Thumb(j22, j19), new Colors.Component.Slider.Track(new Colors.Component.Slider.Track.Filled(j22), new Colors.Component.Slider.Track.Unfilled(j19)));
        Colors.Component.Timeline timeline = new Colors.Component.Timeline(new Colors.Component.Timeline.Background(j35, j18), new Colors.Component.Timeline.Dot(new Colors.Component.Timeline.Dot.Background(j41, j41, j35, j20, j41, j41), new Colors.Component.Timeline.Dot.Border(j26)), new Colors.Component.Timeline.Line(new Colors.Component.Timeline.Line.Border(j26, j26, j26, base.grey15, j26, j26)));
        Colors.Component.TitleBar titleBar = new Colors.Component.TitleBar(j35, new Colors.Component.TitleBar.Button(new Colors.Component.TitleBar.Button.Background(ColorKt.Color(-1728053248), ColorKt.Color(872415231), ColorKt.Color(-1711276033))), new Colors.Component.TitleBar.Icon(j26, j16), new Colors.Component.TitleBar.Keypad(j9, new Colors.Component.TitleBar.Keypad.Icon(j26, ColorKt.Color(-1291845633))), j31);
        long j42 = base.grey90;
        Colors.Component.Toast toast = new Colors.Component.Toast(new Colors.Component.Toast.Background(j42), new Colors.Component.Toast.Button(new Colors.Component.Toast.Button.Background(j42, base.grey80)));
        long m2985asDisabledDxMtmZc$default = ColorUtilsKt.m2985asDisabledDxMtmZc$default(j2);
        if (m2985asDisabledDxMtmZc$default == 16) {
            m2985asDisabledDxMtmZc$default = Color.m675copywmQWz5c$default(0.75f, j22, 14);
        }
        Colors.Component component = new Colors.Component(avatar, badge, bottomNavigation, button, card, cell, checkbox, copyCode, filterBar, halfSheet, header, input, modal, optionCard, optionChip, radio, searchBar, searchField, segmentedControl, sheet, slider, timeline, titleBar, toast, new Colors.Component.Toggle(new Colors.Component.Toggle.Active(new Colors.Component.Toggle.Active.Background(j22, m2985asDisabledDxMtmZc$default)), new Colors.Component.Toggle.Inactive(new Colors.Component.Toggle.Inactive.Background(j19, j20)), new Colors.Component.Toggle.Knob(new Colors.Component.Toggle.Knob.Background(j11, Color.m675copywmQWz5c$default(0.75f, j11, 14))), new Colors.Component.Toggle.Off(new Colors.Component.Toggle.Off.Background(j19, j20)), new Colors.Component.Toggle.On(new Colors.Component.Toggle.On.Background(j22, ColorKt.Color(-1090470586))), new Colors.Component.Toggle.Thumb(new Colors.Component.Toggle.Thumb.Background(j11, ColorKt.Color(-1073741825)))), new Colors.Component.Tooltip(j26), new Colors.Component.Ui(j26, new Colors.Component.Ui.Dimmer(ColorKt.Color(-1507186134)), new Colors.Component.Ui.Divider(j19), new Colors.Component.Ui.Handle(j14), new Colors.Component.Ui.HomeIndicator(j26, new Colors.Component.Ui.HomeIndicator.Inverse(j35))));
        Colors.Surface surface = new Colors.Surface(new Colors.Surface.Keypad(base.constantBlack, new Colors.Surface.Keypad.Button(new Colors.Surface.Keypad.Button.Background(j19), j26, j31), ColorKt.Color(-1973791), j31), new Colors.Surface.Money(new Colors.Surface.Money.Applet(new Colors.Surface.Money.Applet.Asset(j18), j20, new Colors.Surface.Money.Applet.Button(new Colors.Surface.Money.Applet.Button.Background(j18, j19, j14), new Colors.Surface.Money.Applet.Button.Text(j31, j29)), new Colors.Surface.Money.Applet.Data(new Colors.Surface.Money.Applet.Data.Active(j25), new Colors.Surface.Money.Applet.Data.Inactive(base.grey40))), j35, new Colors.Surface.Money.Ui(new Colors.Surface.Money.Ui.Divider(j19))));
        long j43 = base.brandCashGreen80;
        long j44 = base.grey95;
        long j45 = base.brandCashGreen65;
        long j46 = base.grey80;
        long j47 = base.brandCashGreen;
        long j48 = base.grey45;
        long j49 = base.brandCashGreen50;
        long j50 = base.grey65;
        long j51 = base.brandCashGreen35;
        long j52 = base.grey60;
        return new Colors(false, base, semantic, component, surface, new Colors.Data(new Colors.Data.Part(new Colors.Data.Part.OfFive(j43, j44, j45, j46, j47, j48, j49, j50, j51, j52), new Colors.Data.Part.OfFour(j43, j46, j47, j48, base.brandCashGreen60, j50, base.brandCashGreen40, j52), new Colors.Data.Part.OfOne(j47, j48), new Colors.Data.Part.OfThree(j47, j48, j43, j50, j49, j52), new Colors.Data.Part.OfTwo(j47, j48, j43, j50)), new Colors.Data.Portion(base.grey30, j10), new Colors.Data.Trend(j11, j10)));
    }
}
