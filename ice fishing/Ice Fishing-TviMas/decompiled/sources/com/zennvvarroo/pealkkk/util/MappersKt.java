package com.zennvvarroo.pealkkk.util;

import com.zennvvarroo.pealkkk.data.model.AreaColor;
import com.zennvvarroo.pealkkk.data.model.ItemCategory;
import com.zennvvarroo.pealkkk.data.model.StockState;
import com.zennvvarroo.pealkkk.data.model.StoredItem;
import com.zennvvarroo.pealkkk.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mappers.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"areaColorToPaint", "Landroidx/compose/ui/graphics/Color;", "c", "Lcom/zennvvarroo/pealkkk/data/model/AreaColor;", "(Lcom/zennvvarroo/pealkkk/data/model/AreaColor;)J", "categoryLabel", "", "Lcom/zennvvarroo/pealkkk/data/model/ItemCategory;", "getStockState", "Lcom/zennvvarroo/pealkkk/data/model/StockState;", "item", "Lcom/zennvvarroo/pealkkk/data/model/StoredItem;", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappersKt {

    /* compiled from: Mappers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AreaColor.values().length];
            try {
                iArr[AreaColor.CYAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AreaColor.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AreaColor.GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AreaColor.ORANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AreaColor.YELLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ItemCategory.values().length];
            try {
                iArr2[ItemCategory.TOOLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ItemCategory.KITCHEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ItemCategory.ELECTRONICS.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ItemCategory.DOCUMENTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ItemCategory.CLEANING.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ItemCategory.CLOTHING.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ItemCategory.FOOD.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ItemCategory.OFFICE.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ItemCategory.OTHER.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final long areaColorToPaint(AreaColor c) {
        Intrinsics.checkNotNullParameter(c, "c");
        int i = WhenMappings.$EnumSwitchMapping$0[c.ordinal()];
        if (i == 1) {
            return ColorKt.getPeakCyan();
        }
        if (i == 2) {
            return ColorKt.getPeakBlue();
        }
        if (i == 3) {
            return ColorKt.getPeakGreen();
        }
        if (i == 4) {
            return ColorKt.getPeakOrange();
        }
        if (i == 5) {
            return ColorKt.getPeakYellow();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String categoryLabel(ItemCategory c) {
        Intrinsics.checkNotNullParameter(c, "c");
        switch (WhenMappings.$EnumSwitchMapping$1[c.ordinal()]) {
            case 1:
                return "Tools";
            case 2:
                return "Kitchen";
            case 3:
                return "Electronics";
            case 4:
                return "Documents";
            case 5:
                return "Cleaning";
            case 6:
                return "Clothing";
            case 7:
                return "Food";
            case 8:
                return "Office";
            case 9:
                return "Other";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final StockState getStockState(StoredItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getQuantity() <= 0 ? StockState.EMPTY : (item.getMinimumQuantity() <= 0 || item.getQuantity() > item.getMinimumQuantity()) ? StockState.AVAILABLE : StockState.LOW;
    }
}
