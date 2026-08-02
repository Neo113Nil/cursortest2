package com.squareup.cash.moneybot.views.markdown;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.room.Room;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class MoneybotMarkdownStylesKt {
    public static final FontListFontFamily CashSansMono;
    public static final FontListFontFamily cashSansForMarkdown;

    static {
        FontListFontFamily fontListFontFamily = Fonts.CashSans;
        fontListFontFamily.getClass();
        List list = fontListFontFamily.fonts;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(((ResourceFont) obj).weight, FontWeight.Bold)) {
                arrayList.add(obj);
            }
        }
        FontWeight fontWeight = FontWeight.Bold;
        cashSansForMarkdown = new FontListFontFamily(CollectionsKt.plus((Iterable) CollectionsKt__CollectionsKt.listOf((Object[]) new ResourceFont[]{Room.m1163FontYpTlLL0$default(R.font.cashsans_medium, fontWeight, 0), Room.m1163FontYpTlLL0$default(R.font.cashsans_medium_itl, fontWeight, 1)}), (Collection) arrayList));
        List asList = Arrays.asList(Room.m1163FontYpTlLL0$default(R.font.cashsansmono_regular, FontWeight.Normal, 0), Room.m1163FontYpTlLL0$default(R.font.cashsansmono_medium, FontWeight.Medium, 0));
        asList.getClass();
        CashSansMono = new FontListFontFamily(asList);
    }

    public static final TextStyle getBodyMediumMono(Composer composer) {
        return TextStyle.m994copyp1EtxEg$default(((Typography) ((GapComposer) composer).consume(ArcadeThemeKt.LocalTypography)).bodyMedium, 0L, 0L, null, CashSansMono, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183);
    }
}
