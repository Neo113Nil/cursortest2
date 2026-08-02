package com.squareup.cash.arcade;

import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.room.Room;
import com.squareup.cash.R;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Fonts {
    public static final FontListFontFamily CashSans;
    public static final FontListFontFamily CashSansMono;

    static {
        FontWeight fontWeight = FontWeight.Black;
        ResourceFont m1163FontYpTlLL0$default = Room.m1163FontYpTlLL0$default(R.font.cashsans_black, fontWeight, 0);
        ResourceFont m1163FontYpTlLL0$default2 = Room.m1163FontYpTlLL0$default(R.font.cashsans_black_itl, fontWeight, 1);
        FontWeight fontWeight2 = FontWeight.Bold;
        ResourceFont m1163FontYpTlLL0$default3 = Room.m1163FontYpTlLL0$default(R.font.cashsans_bold, fontWeight2, 0);
        ResourceFont m1163FontYpTlLL0$default4 = Room.m1163FontYpTlLL0$default(R.font.cashsans_bold_itl, fontWeight2, 1);
        FontWeight fontWeight3 = FontWeight.ExtraLight;
        ResourceFont m1163FontYpTlLL0$default5 = Room.m1163FontYpTlLL0$default(R.font.cashsans_extlight, fontWeight3, 0);
        ResourceFont m1163FontYpTlLL0$default6 = Room.m1163FontYpTlLL0$default(R.font.cashsans_extlight_itl, fontWeight3, 1);
        FontWeight fontWeight4 = FontWeight.Light;
        ResourceFont m1163FontYpTlLL0$default7 = Room.m1163FontYpTlLL0$default(R.font.cashsans_light, fontWeight4, 0);
        ResourceFont m1163FontYpTlLL0$default8 = Room.m1163FontYpTlLL0$default(R.font.cashsans_light_itl, fontWeight4, 1);
        FontWeight fontWeight5 = FontWeight.Medium;
        ResourceFont m1163FontYpTlLL0$default9 = Room.m1163FontYpTlLL0$default(R.font.cashsans_medium, fontWeight5, 0);
        ResourceFont m1163FontYpTlLL0$default10 = Room.m1163FontYpTlLL0$default(R.font.cashsans_medium_itl, fontWeight5, 1);
        FontWeight fontWeight6 = FontWeight.Normal;
        ResourceFont m1163FontYpTlLL0$default11 = Room.m1163FontYpTlLL0$default(R.font.cashsans_regular, fontWeight6, 0);
        ResourceFont m1163FontYpTlLL0$default12 = Room.m1163FontYpTlLL0$default(R.font.cashsans_regular_itl, fontWeight6, 1);
        FontWeight fontWeight7 = FontWeight.SemiBold;
        List asList = Arrays.asList(m1163FontYpTlLL0$default, m1163FontYpTlLL0$default2, m1163FontYpTlLL0$default3, m1163FontYpTlLL0$default4, m1163FontYpTlLL0$default5, m1163FontYpTlLL0$default6, m1163FontYpTlLL0$default7, m1163FontYpTlLL0$default8, m1163FontYpTlLL0$default9, m1163FontYpTlLL0$default10, m1163FontYpTlLL0$default11, m1163FontYpTlLL0$default12, Room.m1163FontYpTlLL0$default(R.font.cashsans_semibold, fontWeight7, 0), Room.m1163FontYpTlLL0$default(R.font.cashsans_semibold_itl, fontWeight7, 1));
        asList.getClass();
        CashSans = new FontListFontFamily(asList);
        List asList2 = Arrays.asList(Room.m1163FontYpTlLL0$default(R.font.cashsansmono_regular, fontWeight6, 0), Room.m1163FontYpTlLL0$default(R.font.cashsansmono_medium, fontWeight5, 0));
        asList2.getClass();
        CashSansMono = new FontListFontFamily(asList2);
    }

    public static FontListFontFamily getCashSans() {
        return CashSans;
    }
}
