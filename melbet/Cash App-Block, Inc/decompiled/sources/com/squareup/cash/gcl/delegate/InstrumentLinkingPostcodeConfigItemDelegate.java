package com.squareup.cash.gcl.delegate;

import com.squareup.cash.R;
import com.squareup.cash.gcl.InstrumentLinkingPostcodeItem;
import com.squareup.cash.gcl.data.MarketAttributes;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.api.Region;

/* loaded from: classes6.dex */
public final class InstrumentLinkingPostcodeConfigItemDelegate implements GlobalConfigItemDelegate {
    public final /* synthetic */ int $r8$classId;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[Region.AUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Region.CAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Region.GBR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Region.USA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Region.XXL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ InstrumentLinkingPostcodeConfigItemDelegate(AndroidStringManager androidStringManager, int i) {
        this.$r8$classId = i;
        this.stringManager = androidStringManager;
    }

    @Override // com.squareup.cash.gcl.delegate.GlobalConfigItemDelegate
    public final Object get(MarketAttributes marketAttributes) {
        int i = this.$r8$classId;
        AndroidStringManager androidStringManager = this.stringManager;
        switch (i) {
            case 0:
                int i2 = WhenMappings.$EnumSwitchMapping$0[marketAttributes.region.ordinal()];
                if (i2 == 1) {
                    return androidStringManager.get(R.string.card_postal_hint_au);
                }
                if (i2 == 2) {
                    return androidStringManager.get(R.string.card_postal_hint_ca);
                }
                if (i2 == 3) {
                    return androidStringManager.get(R.string.card_postal_hint_gb);
                }
                if (i2 != 4 && i2 == 5) {
                    return androidStringManager.get(R.string.card_postal_hint_ie);
                }
                return androidStringManager.get(R.string.card_postal_hint_us);
            case 1:
                int i3 = InstrumentLinkingDebitCardSubTitleConfigItemDelegate$WhenMappings.$EnumSwitchMapping$0[marketAttributes.region.ordinal()];
                return i3 != 1 ? i3 != 2 ? i3 != 3 ? androidStringManager.get(R.string.input_card_info_subtitle_debit) : androidStringManager.get(R.string.input_card_info_subtitle_debit_au) : androidStringManager.get(R.string.input_card_info_subtitle_debit_canada) : androidStringManager.get(R.string.input_card_info_subtitle_debit_uk);
            default:
                return InstrumentLinkingDebitCardTitleConfigItemDelegate$WhenMappings.$EnumSwitchMapping$0[marketAttributes.region.ordinal()] == 1 ? androidStringManager.get(R.string.input_card_info_title_debit_au) : androidStringManager.get(R.string.input_card_info_title_debit);
        }
    }

    @Override // com.squareup.cash.gcl.delegate.GlobalConfigItemDelegate
    public final /* bridge */ /* synthetic */ InstrumentLinkingPostcodeItem getItem() {
        switch (this.$r8$classId) {
            case 0:
                return InstrumentLinkingPostcodeItem.INSTANCE;
            case 1:
                return InstrumentLinkingPostcodeItem.INSTANCE$3;
            default:
                return InstrumentLinkingPostcodeItem.INSTANCE$4;
        }
    }
}
