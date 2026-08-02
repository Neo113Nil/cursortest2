package com.squareup.cash.formview.components;

import android.content.Context;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FormSpacings {
    public final Context context;
    public final MapBuilder spacingsInDp;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SpacingType {
        public static final /* synthetic */ SpacingType[] $VALUES;
        public static final SpacingType ADDRESS;
        public static final SpacingType ALL_ELEMENTS;
        public static final SpacingType AVATAR;
        public static final SpacingType CAPTIONED_TILE;
        public static final SpacingType CARD;
        public static final SpacingType CARD_PREVIEW;
        public static final SpacingType CASHTAG;
        public static final SpacingType CELL_DEFAULT;
        public static final SpacingType CHECKBOX;
        public static final SpacingType COPYABLE_ELEMENT_GROUP;
        public static final SpacingType DATE_INPUT;
        public static final SpacingType DETAIL_ROW;
        public static final SpacingType DIVIDER;
        public static final SpacingType EMOJI_PICKER;
        public static final SpacingType GIFT_CARD;
        public static final SpacingType HERO;
        public static final SpacingType LARGE_LABEL;
        public static final SpacingType LIST_ORDERED;
        public static final SpacingType LIST_UNORDERED;
        public static final SpacingType LOCAL_IMAGE;
        public static final SpacingType MEDIUM_LABEL;
        public static final SpacingType MONEY;
        public static final SpacingType MONEY_INPUT_DECORATED;
        public static final SpacingType MULTILINE_TEXT_INPUT;
        public static final SpacingType NOTICE;
        public static final SpacingType OPTION_PICKER;
        public static final SpacingType PAYMENT_PLAN_SCHEDULE;
        public static final SpacingType PAYMENT_PLAN_SUMMARY;
        public static final SpacingType PRIMARY_BUTTON;
        public static final SpacingType REMOTE_IMAGE;
        public static final SpacingType SECONDARY_BUTTON;
        public static final SpacingType SECTION_HEADER;
        public static final SpacingType SELECTABLE_INPUT;
        public static final SpacingType SELECTABLE_ROW;
        public static final SpacingType SELECTABLE_ROW_INSET;
        public static final SpacingType SMALL_LABEL;
        public static final SpacingType SPACER;
        public static final SpacingType TEXT_INPUT;
        public static final SpacingType TIMELINE;

        static {
            SpacingType spacingType = new SpacingType("ALL_ELEMENTS", 0);
            ALL_ELEMENTS = spacingType;
            SpacingType spacingType2 = new SpacingType("ADDRESS", 1);
            ADDRESS = spacingType2;
            SpacingType spacingType3 = new SpacingType("AVATAR", 2);
            AVATAR = spacingType3;
            SpacingType spacingType4 = new SpacingType("CARD_PREVIEW", 3);
            CARD_PREVIEW = spacingType4;
            SpacingType spacingType5 = new SpacingType("CASHTAG", 4);
            CASHTAG = spacingType5;
            SpacingType spacingType6 = new SpacingType("DATE_INPUT", 5);
            DATE_INPUT = spacingType6;
            SpacingType spacingType7 = new SpacingType("DETAIL_ROW", 6);
            DETAIL_ROW = spacingType7;
            SpacingType spacingType8 = new SpacingType("DIVIDER", 7);
            DIVIDER = spacingType8;
            SpacingType spacingType9 = new SpacingType("LARGE_LABEL", 8);
            LARGE_LABEL = spacingType9;
            SpacingType spacingType10 = new SpacingType("LOCAL_IMAGE", 9);
            LOCAL_IMAGE = spacingType10;
            SpacingType spacingType11 = new SpacingType("MEDIUM_LABEL", 10);
            MEDIUM_LABEL = spacingType11;
            SpacingType spacingType12 = new SpacingType("MONEY", 11);
            MONEY = spacingType12;
            SpacingType spacingType13 = new SpacingType("MULTILINE_TEXT_INPUT", 12);
            MULTILINE_TEXT_INPUT = spacingType13;
            SpacingType spacingType14 = new SpacingType("OPTION_PICKER", 13);
            OPTION_PICKER = spacingType14;
            SpacingType spacingType15 = new SpacingType("PRIMARY_BUTTON", 14);
            PRIMARY_BUTTON = spacingType15;
            SpacingType spacingType16 = new SpacingType("REMOTE_IMAGE", 15);
            REMOTE_IMAGE = spacingType16;
            SpacingType spacingType17 = new SpacingType("SECONDARY_BUTTON", 16);
            SECONDARY_BUTTON = spacingType17;
            SpacingType spacingType18 = new SpacingType("SELECTABLE_ROW", 17);
            SELECTABLE_ROW = spacingType18;
            SpacingType spacingType19 = new SpacingType("SELECTABLE_ROW_INSET", 18);
            SELECTABLE_ROW_INSET = spacingType19;
            SpacingType spacingType20 = new SpacingType("SELECTABLE_INPUT", 19);
            SELECTABLE_INPUT = spacingType20;
            SpacingType spacingType21 = new SpacingType("SMALL_LABEL", 20);
            SMALL_LABEL = spacingType21;
            SpacingType spacingType22 = new SpacingType("SPACER", 21);
            SPACER = spacingType22;
            SpacingType spacingType23 = new SpacingType("TEXT_INPUT", 22);
            TEXT_INPUT = spacingType23;
            SpacingType spacingType24 = new SpacingType("TIMELINE", 23);
            TIMELINE = spacingType24;
            SpacingType spacingType25 = new SpacingType("CAPTIONED_TILE", 24);
            CAPTIONED_TILE = spacingType25;
            SpacingType spacingType26 = new SpacingType("HERO", 25);
            HERO = spacingType26;
            SpacingType spacingType27 = new SpacingType("INLINE_MESSAGE", 26);
            SpacingType spacingType28 = new SpacingType("GIFT_CARD", 27);
            GIFT_CARD = spacingType28;
            SpacingType spacingType29 = new SpacingType("CARD", 28);
            CARD = spacingType29;
            SpacingType spacingType30 = new SpacingType("NOTICE", 29);
            NOTICE = spacingType30;
            SpacingType spacingType31 = new SpacingType("COPYABLE_ELEMENT_GROUP", 30);
            COPYABLE_ELEMENT_GROUP = spacingType31;
            SpacingType spacingType32 = new SpacingType("EMOJI_PICKER", 31);
            EMOJI_PICKER = spacingType32;
            SpacingType spacingType33 = new SpacingType("PAYMENT_PLAN_SUMMARY", 32);
            PAYMENT_PLAN_SUMMARY = spacingType33;
            SpacingType spacingType34 = new SpacingType("PAYMENT_PLAN_SCHEDULE", 33);
            PAYMENT_PLAN_SCHEDULE = spacingType34;
            SpacingType spacingType35 = new SpacingType("CHECKBOX", 34);
            CHECKBOX = spacingType35;
            SpacingType spacingType36 = new SpacingType("MONEY_INPUT_DECORATED", 35);
            MONEY_INPUT_DECORATED = spacingType36;
            SpacingType spacingType37 = new SpacingType("LIST_ORDERED", 36);
            LIST_ORDERED = spacingType37;
            SpacingType spacingType38 = new SpacingType("LIST_UNORDERED", 37);
            LIST_UNORDERED = spacingType38;
            SpacingType spacingType39 = new SpacingType("CELL_DEFAULT", 38);
            CELL_DEFAULT = spacingType39;
            SpacingType spacingType40 = new SpacingType("SECTION_HEADER", 39);
            SECTION_HEADER = spacingType40;
            $VALUES = new SpacingType[]{spacingType, spacingType2, spacingType3, spacingType4, spacingType5, spacingType6, spacingType7, spacingType8, spacingType9, spacingType10, spacingType11, spacingType12, spacingType13, spacingType14, spacingType15, spacingType16, spacingType17, spacingType18, spacingType19, spacingType20, spacingType21, spacingType22, spacingType23, spacingType24, spacingType25, spacingType26, spacingType27, spacingType28, spacingType29, spacingType30, spacingType31, spacingType32, spacingType33, spacingType34, spacingType35, spacingType36, spacingType37, spacingType38, spacingType39, spacingType40};
        }

        public static SpacingType valueOf(String str) {
            return (SpacingType) Enum.valueOf(SpacingType.class, str);
        }

        public static SpacingType[] values() {
            return (SpacingType[]) $VALUES.clone();
        }
    }

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FormBlocker.Element.ButtonElement.Style.values().length];
            try {
                iArr[FormBlocker.Element.ButtonElement.Style.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.ButtonElement.Style.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormBlocker.Element.ButtonElement.Style.TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FormBlocker.Element.TextElement.Size.values().length];
            try {
                iArr2[FormBlocker.Element.TextElement.Size.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FormBlocker.Element.TextElement.Size.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FormBlocker.Element.TextElement.Size.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FormBlocker.Element.TextElement.Size.EXTRA_LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public FormSpacings(Context context) {
        context.getClass();
        this.context = context;
        MapBuilder mapBuilder = new MapBuilder();
        SpacingType spacingType = SpacingType.ALL_ELEMENTS;
        Matcher$$ExternalSyntheticOutline0.m(RecyclerView.DECELERATION_RATE, mapBuilder, new Pair(null, spacingType));
        SpacingType spacingType2 = SpacingType.SPACER;
        Matcher$$ExternalSyntheticOutline0.m(RecyclerView.DECELERATION_RATE, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(RecyclerView.DECELERATION_RATE, mapBuilder, new Pair(spacingType2, spacingType), spacingType, spacingType2));
        SpacingType spacingType3 = SpacingType.LOCAL_IMAGE;
        SpacingType spacingType4 = SpacingType.SMALL_LABEL;
        Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, new Pair(spacingType3, spacingType4));
        SpacingType spacingType5 = SpacingType.MEDIUM_LABEL;
        Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, new Pair(spacingType3, spacingType5));
        SpacingType spacingType6 = SpacingType.LARGE_LABEL;
        Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, new Pair(spacingType3, spacingType6), spacingType6, spacingType5));
        SpacingType spacingType7 = SpacingType.ADDRESS;
        Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, new Pair(spacingType4, spacingType7), spacingType5, spacingType7), spacingType6, spacingType7));
        SpacingType spacingType8 = SpacingType.TEXT_INPUT;
        Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, new Pair(spacingType4, spacingType8), spacingType5, spacingType8), spacingType6, spacingType8));
        SpacingType spacingType9 = SpacingType.DATE_INPUT;
        Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, new Pair(spacingType4, spacingType9), spacingType5, spacingType9), spacingType6, spacingType9));
        SpacingType spacingType10 = SpacingType.MULTILINE_TEXT_INPUT;
        Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, new Pair(spacingType4, spacingType10), spacingType5, spacingType10), spacingType6, spacingType10));
        SpacingType spacingType11 = SpacingType.PRIMARY_BUTTON;
        Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, new Pair(spacingType4, spacingType11), spacingType5, spacingType11), spacingType6, spacingType11));
        SpacingType spacingType12 = SpacingType.SECONDARY_BUTTON;
        Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, new Pair(spacingType4, spacingType12), spacingType5, spacingType12), spacingType6, spacingType12));
        SpacingType spacingType13 = SpacingType.OPTION_PICKER;
        Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, new Pair(spacingType4, spacingType13), spacingType5, spacingType13), spacingType6, spacingType13));
        SpacingType spacingType14 = SpacingType.DETAIL_ROW;
        Matcher$$ExternalSyntheticOutline0.m(48.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(48.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(48.0f, mapBuilder, new Pair(spacingType4, spacingType14), spacingType5, spacingType14), spacingType6, spacingType14));
        SpacingType spacingType15 = SpacingType.SELECTABLE_ROW;
        Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, new Pair(spacingType4, spacingType15), spacingType5, spacingType15), spacingType6, spacingType15));
        SpacingType spacingType16 = SpacingType.SELECTABLE_ROW_INSET;
        Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, new Pair(spacingType4, spacingType16), spacingType5, spacingType16), spacingType6, spacingType16));
        SpacingType spacingType17 = SpacingType.TIMELINE;
        Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, new Pair(spacingType4, spacingType17), spacingType5, spacingType17), spacingType6, spacingType17));
        SpacingType spacingType18 = SpacingType.MONEY_INPUT_DECORATED;
        Matcher$$ExternalSyntheticOutline0.m(8.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(8.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(8.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, new Pair(spacingType4, spacingType18), spacingType5, spacingType18), spacingType6, spacingType18), spacingType8, spacingType4), spacingType11, spacingType4), spacingType12, spacingType4), spacingType11, spacingType11), spacingType12, spacingType12));
        SpacingType spacingType19 = SpacingType.DIVIDER;
        Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, new Pair(spacingType19, spacingType), spacingType, spacingType19));
        SpacingType spacingType20 = SpacingType.PAYMENT_PLAN_SCHEDULE;
        Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, new Pair(spacingType20, spacingType));
        SpacingType spacingType21 = SpacingType.PAYMENT_PLAN_SUMMARY;
        Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, new Pair(spacingType21, spacingType), spacingType, spacingType20), spacingType, spacingType21));
        SpacingType spacingType22 = SpacingType.SELECTABLE_INPUT;
        Matcher$$ExternalSyntheticOutline0.m(8.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, new Pair(spacingType, spacingType22), spacingType22, spacingType), spacingType7, spacingType12), spacingType14, spacingType14));
        Matcher$$ExternalSyntheticOutline0.m(RecyclerView.DECELERATION_RATE, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(RecyclerView.DECELERATION_RATE, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, new Pair(SpacingType.CARD_PREVIEW, spacingType14), spacingType15, spacingType15), spacingType16, spacingType16));
        SpacingType spacingType23 = SpacingType.REMOTE_IMAGE;
        Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(32.0f, mapBuilder, new Pair(spacingType23, spacingType), spacingType, spacingType23), spacingType23, spacingType15), spacingType23, spacingType16));
        SpacingType spacingType24 = SpacingType.CELL_DEFAULT;
        Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, new Pair(spacingType23, spacingType24));
        SpacingType spacingType25 = SpacingType.CHECKBOX;
        Matcher$$ExternalSyntheticOutline0.m(RecyclerView.DECELERATION_RATE, mapBuilder, new Pair(spacingType25, spacingType25));
        SpacingType spacingType26 = SpacingType.LIST_ORDERED;
        Matcher$$ExternalSyntheticOutline0.m(8.0f, mapBuilder, new Pair(spacingType26, spacingType26));
        SpacingType spacingType27 = SpacingType.LIST_UNORDERED;
        Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(RecyclerView.DECELERATION_RATE, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(RecyclerView.DECELERATION_RATE, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(16.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(8.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(8.0f, mapBuilder, Matcher$$ExternalSyntheticOutline0.m(8.0f, mapBuilder, new Pair(spacingType26, spacingType27), spacingType27, spacingType26), spacingType27, spacingType27), spacingType25, spacingType), spacingType, spacingType25), spacingType18, spacingType18), spacingType24, spacingType24), spacingType24, spacingType19), spacingType19, spacingType24));
        SpacingType spacingType28 = SpacingType.SECTION_HEADER;
        mapBuilder.put(Matcher$$ExternalSyntheticOutline0.m(RecyclerView.DECELERATION_RATE, mapBuilder, new Pair(spacingType28, spacingType28), spacingType28, spacingType24), new Dp(RecyclerView.DECELERATION_RATE));
        this.spacingsInDp = mapBuilder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x04cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpacingType toSpacingType(FormBlocker.Element element) {
        FormBlocker.Element.AddressElement addressElement;
        FormBlocker.Element.AvatarElement avatarElement;
        FormBlocker.Element.ButtonElement buttonElement;
        FormBlocker.Element.CashtagElement cashtagElement;
        FormBlocker.Element.DateInputElement dateInputElement;
        FormBlocker.Element.CustomizedCardElement customizedCardElement;
        FormBlocker.Element.DetailRowElement detailRowElement;
        FormBlocker.Element.DividerElement dividerElement;
        FormBlocker.Element.LocalImageElement localImageElement;
        FormBlocker.Element.MoneyElement moneyElement;
        FormBlocker.Element.MultilineTextInputElement multilineTextInputElement;
        FormBlocker.Element.OptionPickerElement optionPickerElement;
        FormBlocker.Element.RemoteImageElement remoteImageElement;
        FormBlocker.Element.SpacerElement spacerElement;
        FormBlocker.Element.FixedSpacerElement fixedSpacerElement;
        FormBlocker.Element.TextElement textElement;
        FormBlocker.Element.LegalTextElement legalTextElement;
        FormBlocker.Element.LocationElement locationElement;
        FormBlocker.Element.TextInputElement textInputElement;
        FormBlocker.Element.TimelineElement timelineElement;
        FormBlocker.Element.SelectableRowElement selectableRowElement;
        FormBlocker.Element.SelectableInputElement selectableInputElement;
        FormBlocker.Element.CallToActionElement callToActionElement;
        FormBlocker.Element.CaptionedTileElement captionedTileElement;
        FormBlocker.Element.HeroElement heroElement;
        FormBlocker.Element.HeroHeaderElement heroHeaderElement;
        FormBlocker.Element.GiftCardElement giftCardElement;
        FormBlocker.Element.CardElement cardElement;
        FormBlocker.Element.MoneyInputElement moneyInputElement;
        FormBlocker.Element.NoticeElement noticeElement;
        FormBlocker.Element.CopyableElementGroup copyableElementGroup;
        FormBlocker.Element.EmojiPickerElement emojiPickerElement;
        FormBlocker.Element.FamilyUpsellElement familyUpsellElement;
        FormBlocker.Element.UpsellElement upsellElement;
        FormBlocker.Element.MerchantTransactionElement merchantTransactionElement;
        FormBlocker.Element.MerchantTransactionOptionPicker merchantTransactionOptionPicker;
        FormBlocker.Element.PaymentPlanScheduleElement paymentPlanScheduleElement;
        FormBlocker.Element.PaymentPlanSummaryElement paymentPlanSummaryElement;
        FormBlocker.Element.ProfilePreviewElement profilePreviewElement;
        FormBlocker.Element.CheckBoxElement checkBoxElement;
        FormBlocker.Element.ListOrderedElement listOrderedElement;
        FormBlocker.Element.ListUnorderedElement listUnorderedElement;
        FormBlocker.Element.CellDefaultElement cellDefaultElement;
        FormBlocker.Element.SectionHeaderElement sectionHeaderElement;
        FormBlocker.Element.TextElement textElement2;
        int i;
        FormBlocker.Element.ButtonElement buttonElement2;
        int i2;
        FormBlocker.Element.AbstractC0072Element abstractC0072Element = element.element;
        FormBlocker.Element.MoneyInputElement moneyInputElement2 = null;
        r0 = null;
        FormBlocker.Element.SelectableRowElement selectableRowElement2 = null;
        moneyInputElement2 = null;
        if (abstractC0072Element != null) {
            FormBlocker.Element.AbstractC0072Element.AddressElement addressElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.AddressElement ? (FormBlocker.Element.AbstractC0072Element.AddressElement) abstractC0072Element : null;
            if (addressElement2 != null) {
                addressElement = addressElement2.getValue();
                if (addressElement == null) {
                    return SpacingType.ADDRESS;
                }
                if (abstractC0072Element != null) {
                    FormBlocker.Element.AbstractC0072Element.AvatarElement avatarElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.AvatarElement ? (FormBlocker.Element.AbstractC0072Element.AvatarElement) abstractC0072Element : null;
                    if (avatarElement2 != null) {
                        avatarElement = avatarElement2.getValue();
                        if (avatarElement == null) {
                            return SpacingType.AVATAR;
                        }
                        if (abstractC0072Element != null) {
                            FormBlocker.Element.AbstractC0072Element.ButtonElement buttonElement3 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.ButtonElement ? (FormBlocker.Element.AbstractC0072Element.ButtonElement) abstractC0072Element : null;
                            if (buttonElement3 != null) {
                                buttonElement = buttonElement3.getValue();
                                if (buttonElement == null) {
                                    if (abstractC0072Element != null) {
                                        FormBlocker.Element.AbstractC0072Element.ButtonElement buttonElement4 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.ButtonElement ? (FormBlocker.Element.AbstractC0072Element.ButtonElement) abstractC0072Element : null;
                                        if (buttonElement4 != null) {
                                            buttonElement2 = buttonElement4.getValue();
                                            buttonElement2.getClass();
                                            FormBlocker.Element.ButtonElement.Style style = buttonElement2.style;
                                            style.getClass();
                                            i2 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                                            if (i2 != 1) {
                                                return SpacingType.PRIMARY_BUTTON;
                                            }
                                            if (i2 == 2 || i2 == 3) {
                                                return SpacingType.SECONDARY_BUTTON;
                                            }
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                    }
                                    buttonElement2 = null;
                                    buttonElement2.getClass();
                                    FormBlocker.Element.ButtonElement.Style style2 = buttonElement2.style;
                                    style2.getClass();
                                    i2 = WhenMappings.$EnumSwitchMapping$0[style2.ordinal()];
                                    if (i2 != 1) {
                                    }
                                } else {
                                    if (abstractC0072Element != null) {
                                        FormBlocker.Element.AbstractC0072Element.CashtagElement cashtagElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CashtagElement ? (FormBlocker.Element.AbstractC0072Element.CashtagElement) abstractC0072Element : null;
                                        if (cashtagElement2 != null) {
                                            cashtagElement = cashtagElement2.getValue();
                                            if (cashtagElement == null) {
                                                return SpacingType.CASHTAG;
                                            }
                                            if (abstractC0072Element != null) {
                                                FormBlocker.Element.AbstractC0072Element.DateInputElement dateInputElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.DateInputElement ? (FormBlocker.Element.AbstractC0072Element.DateInputElement) abstractC0072Element : null;
                                                if (dateInputElement2 != null) {
                                                    dateInputElement = dateInputElement2.getValue();
                                                    if (dateInputElement == null) {
                                                        return SpacingType.DATE_INPUT;
                                                    }
                                                    if (abstractC0072Element != null) {
                                                        FormBlocker.Element.AbstractC0072Element.CustomizedCardElement customizedCardElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CustomizedCardElement ? (FormBlocker.Element.AbstractC0072Element.CustomizedCardElement) abstractC0072Element : null;
                                                        if (customizedCardElement2 != null) {
                                                            customizedCardElement = customizedCardElement2.getValue();
                                                            if (customizedCardElement == null) {
                                                                return SpacingType.CARD_PREVIEW;
                                                            }
                                                            if (abstractC0072Element != null) {
                                                                FormBlocker.Element.AbstractC0072Element.DetailRowElement detailRowElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.DetailRowElement ? (FormBlocker.Element.AbstractC0072Element.DetailRowElement) abstractC0072Element : null;
                                                                if (detailRowElement2 != null) {
                                                                    detailRowElement = detailRowElement2.getValue();
                                                                    if (detailRowElement == null) {
                                                                        return SpacingType.DETAIL_ROW;
                                                                    }
                                                                    if (abstractC0072Element != null) {
                                                                        FormBlocker.Element.AbstractC0072Element.DividerElement dividerElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.DividerElement ? (FormBlocker.Element.AbstractC0072Element.DividerElement) abstractC0072Element : null;
                                                                        if (dividerElement2 != null) {
                                                                            dividerElement = dividerElement2.getValue();
                                                                            if (dividerElement == null) {
                                                                                return SpacingType.DIVIDER;
                                                                            }
                                                                            if (abstractC0072Element != null) {
                                                                                FormBlocker.Element.AbstractC0072Element.LocalImageElement localImageElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.LocalImageElement ? (FormBlocker.Element.AbstractC0072Element.LocalImageElement) abstractC0072Element : null;
                                                                                if (localImageElement2 != null) {
                                                                                    localImageElement = localImageElement2.getValue();
                                                                                    if (localImageElement == null) {
                                                                                        return SpacingType.LOCAL_IMAGE;
                                                                                    }
                                                                                    if (abstractC0072Element != null) {
                                                                                        FormBlocker.Element.AbstractC0072Element.MoneyElement moneyElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.MoneyElement ? (FormBlocker.Element.AbstractC0072Element.MoneyElement) abstractC0072Element : null;
                                                                                        if (moneyElement2 != null) {
                                                                                            moneyElement = moneyElement2.getValue();
                                                                                            if (moneyElement == null) {
                                                                                                return SpacingType.MONEY;
                                                                                            }
                                                                                            if (abstractC0072Element != null) {
                                                                                                FormBlocker.Element.AbstractC0072Element.MultilineTextInputElement multilineTextInputElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.MultilineTextInputElement ? (FormBlocker.Element.AbstractC0072Element.MultilineTextInputElement) abstractC0072Element : null;
                                                                                                if (multilineTextInputElement2 != null) {
                                                                                                    multilineTextInputElement = multilineTextInputElement2.getValue();
                                                                                                    if (multilineTextInputElement == null) {
                                                                                                        return SpacingType.MULTILINE_TEXT_INPUT;
                                                                                                    }
                                                                                                    if (abstractC0072Element != null) {
                                                                                                        FormBlocker.Element.AbstractC0072Element.OptionPickerElement optionPickerElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.OptionPickerElement ? (FormBlocker.Element.AbstractC0072Element.OptionPickerElement) abstractC0072Element : null;
                                                                                                        if (optionPickerElement2 != null) {
                                                                                                            optionPickerElement = optionPickerElement2.getValue();
                                                                                                            if (optionPickerElement == null) {
                                                                                                                return SpacingType.OPTION_PICKER;
                                                                                                            }
                                                                                                            if (abstractC0072Element != null) {
                                                                                                                FormBlocker.Element.AbstractC0072Element.RemoteImageElement remoteImageElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.RemoteImageElement ? (FormBlocker.Element.AbstractC0072Element.RemoteImageElement) abstractC0072Element : null;
                                                                                                                if (remoteImageElement2 != null) {
                                                                                                                    remoteImageElement = remoteImageElement2.getValue();
                                                                                                                    if (remoteImageElement == null) {
                                                                                                                        return SpacingType.REMOTE_IMAGE;
                                                                                                                    }
                                                                                                                    if (abstractC0072Element != null) {
                                                                                                                        FormBlocker.Element.AbstractC0072Element.SpacerElement spacerElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.SpacerElement ? (FormBlocker.Element.AbstractC0072Element.SpacerElement) abstractC0072Element : null;
                                                                                                                        if (spacerElement2 != null) {
                                                                                                                            spacerElement = spacerElement2.getValue();
                                                                                                                            if (spacerElement == null) {
                                                                                                                                return SpacingType.SPACER;
                                                                                                                            }
                                                                                                                            if (abstractC0072Element != null) {
                                                                                                                                FormBlocker.Element.AbstractC0072Element.FixedSpacerElement fixedSpacerElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.FixedSpacerElement ? (FormBlocker.Element.AbstractC0072Element.FixedSpacerElement) abstractC0072Element : null;
                                                                                                                                if (fixedSpacerElement2 != null) {
                                                                                                                                    fixedSpacerElement = fixedSpacerElement2.getValue();
                                                                                                                                    if (fixedSpacerElement == null) {
                                                                                                                                        return SpacingType.SPACER;
                                                                                                                                    }
                                                                                                                                    if (abstractC0072Element != null) {
                                                                                                                                        FormBlocker.Element.AbstractC0072Element.TextElement textElement3 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.TextElement ? (FormBlocker.Element.AbstractC0072Element.TextElement) abstractC0072Element : null;
                                                                                                                                        if (textElement3 != null) {
                                                                                                                                            textElement = textElement3.getValue();
                                                                                                                                            if (textElement == null) {
                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.TextElement textElement4 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.TextElement ? (FormBlocker.Element.AbstractC0072Element.TextElement) abstractC0072Element : null;
                                                                                                                                                    if (textElement4 != null) {
                                                                                                                                                        textElement2 = textElement4.getValue();
                                                                                                                                                        textElement2.getClass();
                                                                                                                                                        FormBlocker.Element.TextElement.Size size = textElement2.size;
                                                                                                                                                        size.getClass();
                                                                                                                                                        i = WhenMappings.$EnumSwitchMapping$1[size.ordinal()];
                                                                                                                                                        if (i != 1) {
                                                                                                                                                            return SpacingType.SMALL_LABEL;
                                                                                                                                                        }
                                                                                                                                                        if (i == 2) {
                                                                                                                                                            return SpacingType.MEDIUM_LABEL;
                                                                                                                                                        }
                                                                                                                                                        if (i == 3 || i == 4) {
                                                                                                                                                            return SpacingType.LARGE_LABEL;
                                                                                                                                                        }
                                                                                                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                                                                                        return null;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                textElement2 = null;
                                                                                                                                                textElement2.getClass();
                                                                                                                                                FormBlocker.Element.TextElement.Size size2 = textElement2.size;
                                                                                                                                                size2.getClass();
                                                                                                                                                i = WhenMappings.$EnumSwitchMapping$1[size2.ordinal()];
                                                                                                                                                if (i != 1) {
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.LegalTextElement legalTextElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.LegalTextElement ? (FormBlocker.Element.AbstractC0072Element.LegalTextElement) abstractC0072Element : null;
                                                                                                                                                    if (legalTextElement2 != null) {
                                                                                                                                                        legalTextElement = legalTextElement2.getValue();
                                                                                                                                                        if (legalTextElement == null) {
                                                                                                                                                            return SpacingType.MEDIUM_LABEL;
                                                                                                                                                        }
                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.LocationElement locationElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.LocationElement ? (FormBlocker.Element.AbstractC0072Element.LocationElement) abstractC0072Element : null;
                                                                                                                                                            if (locationElement2 != null) {
                                                                                                                                                                locationElement = locationElement2.getValue();
                                                                                                                                                                if (locationElement == null) {
                                                                                                                                                                    return SpacingType.ADDRESS;
                                                                                                                                                                }
                                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.TextInputElement textInputElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.TextInputElement ? (FormBlocker.Element.AbstractC0072Element.TextInputElement) abstractC0072Element : null;
                                                                                                                                                                    if (textInputElement2 != null) {
                                                                                                                                                                        textInputElement = textInputElement2.getValue();
                                                                                                                                                                        if (textInputElement == null) {
                                                                                                                                                                            return SpacingType.TEXT_INPUT;
                                                                                                                                                                        }
                                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.TimelineElement timelineElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.TimelineElement ? (FormBlocker.Element.AbstractC0072Element.TimelineElement) abstractC0072Element : null;
                                                                                                                                                                            if (timelineElement2 != null) {
                                                                                                                                                                                timelineElement = timelineElement2.getValue();
                                                                                                                                                                                if (timelineElement == null) {
                                                                                                                                                                                    return SpacingType.TIMELINE;
                                                                                                                                                                                }
                                                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.SelectableRowElement selectableRowElement3 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.SelectableRowElement ? (FormBlocker.Element.AbstractC0072Element.SelectableRowElement) abstractC0072Element : null;
                                                                                                                                                                                    if (selectableRowElement3 != null) {
                                                                                                                                                                                        selectableRowElement = selectableRowElement3.getValue();
                                                                                                                                                                                        if (selectableRowElement == null) {
                                                                                                                                                                                            if (abstractC0072Element != null) {
                                                                                                                                                                                                FormBlocker.Element.AbstractC0072Element.SelectableRowElement selectableRowElement4 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.SelectableRowElement ? (FormBlocker.Element.AbstractC0072Element.SelectableRowElement) abstractC0072Element : null;
                                                                                                                                                                                                if (selectableRowElement4 != null) {
                                                                                                                                                                                                    selectableRowElement2 = selectableRowElement4.getValue();
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            selectableRowElement2.getClass();
                                                                                                                                                                                            return Intrinsics.areEqual(selectableRowElement2.inset_and_outlined, Boolean.TRUE) ? SpacingType.SELECTABLE_ROW_INSET : SpacingType.SELECTABLE_ROW;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.SelectableInputElement selectableInputElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.SelectableInputElement ? (FormBlocker.Element.AbstractC0072Element.SelectableInputElement) abstractC0072Element : null;
                                                                                                                                                                                            if (selectableInputElement2 != null) {
                                                                                                                                                                                                selectableInputElement = selectableInputElement2.getValue();
                                                                                                                                                                                                if (selectableInputElement == null) {
                                                                                                                                                                                                    return SpacingType.SELECTABLE_INPUT;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.CallToActionElement callToActionElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CallToActionElement ? (FormBlocker.Element.AbstractC0072Element.CallToActionElement) abstractC0072Element : null;
                                                                                                                                                                                                    if (callToActionElement2 != null) {
                                                                                                                                                                                                        callToActionElement = callToActionElement2.getValue();
                                                                                                                                                                                                        if (callToActionElement == null) {
                                                                                                                                                                                                            return SpacingType.MONEY;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.CaptionedTileElement captionedTileElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CaptionedTileElement ? (FormBlocker.Element.AbstractC0072Element.CaptionedTileElement) abstractC0072Element : null;
                                                                                                                                                                                                            if (captionedTileElement2 != null) {
                                                                                                                                                                                                                captionedTileElement = captionedTileElement2.getValue();
                                                                                                                                                                                                                if (captionedTileElement == null) {
                                                                                                                                                                                                                    return SpacingType.CAPTIONED_TILE;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.HeroElement heroElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.HeroElement ? (FormBlocker.Element.AbstractC0072Element.HeroElement) abstractC0072Element : null;
                                                                                                                                                                                                                    if (heroElement2 != null) {
                                                                                                                                                                                                                        heroElement = heroElement2.getValue();
                                                                                                                                                                                                                        if (heroElement == null) {
                                                                                                                                                                                                                            return SpacingType.HERO;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.HeroHeaderElement heroHeaderElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.HeroHeaderElement ? (FormBlocker.Element.AbstractC0072Element.HeroHeaderElement) abstractC0072Element : null;
                                                                                                                                                                                                                            if (heroHeaderElement2 != null) {
                                                                                                                                                                                                                                heroHeaderElement = heroHeaderElement2.getValue();
                                                                                                                                                                                                                                if (heroHeaderElement == null) {
                                                                                                                                                                                                                                    return SpacingType.HERO;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.GiftCardElement giftCardElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.GiftCardElement ? (FormBlocker.Element.AbstractC0072Element.GiftCardElement) abstractC0072Element : null;
                                                                                                                                                                                                                                    if (giftCardElement2 != null) {
                                                                                                                                                                                                                                        giftCardElement = giftCardElement2.getValue();
                                                                                                                                                                                                                                        if (giftCardElement == null) {
                                                                                                                                                                                                                                            return SpacingType.GIFT_CARD;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.CardElement cardElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CardElement ? (FormBlocker.Element.AbstractC0072Element.CardElement) abstractC0072Element : null;
                                                                                                                                                                                                                                            if (cardElement2 != null) {
                                                                                                                                                                                                                                                cardElement = cardElement2.getValue();
                                                                                                                                                                                                                                                if (cardElement == null) {
                                                                                                                                                                                                                                                    return SpacingType.CARD;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.MoneyInputElement moneyInputElement3 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.MoneyInputElement ? (FormBlocker.Element.AbstractC0072Element.MoneyInputElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                    if (moneyInputElement3 != null) {
                                                                                                                                                                                                                                                        moneyInputElement = moneyInputElement3.getValue();
                                                                                                                                                                                                                                                        if (moneyInputElement == null) {
                                                                                                                                                                                                                                                            if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                FormBlocker.Element.AbstractC0072Element.MoneyInputElement moneyInputElement4 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.MoneyInputElement ? (FormBlocker.Element.AbstractC0072Element.MoneyInputElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                if (moneyInputElement4 != null) {
                                                                                                                                                                                                                                                                    moneyInputElement2 = moneyInputElement4.getValue();
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            moneyInputElement2.getClass();
                                                                                                                                                                                                                                                            return Intrinsics.areEqual(moneyInputElement2.show_decorator, Boolean.TRUE) ? SpacingType.MONEY_INPUT_DECORATED : SpacingType.TEXT_INPUT;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.NoticeElement noticeElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.NoticeElement ? (FormBlocker.Element.AbstractC0072Element.NoticeElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                            if (noticeElement2 != null) {
                                                                                                                                                                                                                                                                noticeElement = noticeElement2.getValue();
                                                                                                                                                                                                                                                                if (noticeElement == null) {
                                                                                                                                                                                                                                                                    return SpacingType.NOTICE;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.CopyableElementGroup copyableElementGroup2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CopyableElementGroup ? (FormBlocker.Element.AbstractC0072Element.CopyableElementGroup) abstractC0072Element : null;
                                                                                                                                                                                                                                                                    if (copyableElementGroup2 != null) {
                                                                                                                                                                                                                                                                        copyableElementGroup = copyableElementGroup2.getValue();
                                                                                                                                                                                                                                                                        if (copyableElementGroup == null) {
                                                                                                                                                                                                                                                                            return SpacingType.COPYABLE_ELEMENT_GROUP;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.EmojiPickerElement emojiPickerElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.EmojiPickerElement ? (FormBlocker.Element.AbstractC0072Element.EmojiPickerElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                            if (emojiPickerElement2 != null) {
                                                                                                                                                                                                                                                                                emojiPickerElement = emojiPickerElement2.getValue();
                                                                                                                                                                                                                                                                                if (emojiPickerElement == null) {
                                                                                                                                                                                                                                                                                    return SpacingType.EMOJI_PICKER;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.FamilyUpsellElement familyUpsellElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.FamilyUpsellElement ? (FormBlocker.Element.AbstractC0072Element.FamilyUpsellElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                                    if (familyUpsellElement2 != null) {
                                                                                                                                                                                                                                                                                        familyUpsellElement = familyUpsellElement2.getValue();
                                                                                                                                                                                                                                                                                        if (familyUpsellElement == null) {
                                                                                                                                                                                                                                                                                            return SpacingType.MONEY;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.UpsellElement upsellElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.UpsellElement ? (FormBlocker.Element.AbstractC0072Element.UpsellElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                                            if (upsellElement2 != null) {
                                                                                                                                                                                                                                                                                                upsellElement = upsellElement2.getValue();
                                                                                                                                                                                                                                                                                                if (upsellElement == null) {
                                                                                                                                                                                                                                                                                                    return SpacingType.MONEY;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.MerchantTransactionElement merchantTransactionElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.MerchantTransactionElement ? (FormBlocker.Element.AbstractC0072Element.MerchantTransactionElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                                                    if (merchantTransactionElement2 != null) {
                                                                                                                                                                                                                                                                                                        merchantTransactionElement = merchantTransactionElement2.getValue();
                                                                                                                                                                                                                                                                                                        if (merchantTransactionElement == null) {
                                                                                                                                                                                                                                                                                                            return SpacingType.MONEY;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.MerchantTransactionPickerElement merchantTransactionPickerElement = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.MerchantTransactionPickerElement ? (FormBlocker.Element.AbstractC0072Element.MerchantTransactionPickerElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                                                            if (merchantTransactionPickerElement != null) {
                                                                                                                                                                                                                                                                                                                merchantTransactionOptionPicker = merchantTransactionPickerElement.getValue();
                                                                                                                                                                                                                                                                                                                if (merchantTransactionOptionPicker == null) {
                                                                                                                                                                                                                                                                                                                    return SpacingType.MONEY;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.PaymentPlanScheduleElement paymentPlanScheduleElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.PaymentPlanScheduleElement ? (FormBlocker.Element.AbstractC0072Element.PaymentPlanScheduleElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                                                                    if (paymentPlanScheduleElement2 != null) {
                                                                                                                                                                                                                                                                                                                        paymentPlanScheduleElement = paymentPlanScheduleElement2.getValue();
                                                                                                                                                                                                                                                                                                                        if (paymentPlanScheduleElement == null) {
                                                                                                                                                                                                                                                                                                                            return SpacingType.PAYMENT_PLAN_SCHEDULE;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.PaymentPlanSummaryElement paymentPlanSummaryElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.PaymentPlanSummaryElement ? (FormBlocker.Element.AbstractC0072Element.PaymentPlanSummaryElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                                                                            if (paymentPlanSummaryElement2 != null) {
                                                                                                                                                                                                                                                                                                                                paymentPlanSummaryElement = paymentPlanSummaryElement2.getValue();
                                                                                                                                                                                                                                                                                                                                if (paymentPlanSummaryElement == null) {
                                                                                                                                                                                                                                                                                                                                    return SpacingType.PAYMENT_PLAN_SUMMARY;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.ProfilePreviewElement profilePreviewElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.ProfilePreviewElement ? (FormBlocker.Element.AbstractC0072Element.ProfilePreviewElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                                                                                    if (profilePreviewElement2 != null) {
                                                                                                                                                                                                                                                                                                                                        profilePreviewElement = profilePreviewElement2.getValue();
                                                                                                                                                                                                                                                                                                                                        if (profilePreviewElement == null) {
                                                                                                                                                                                                                                                                                                                                            return SpacingType.MONEY;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.CheckboxElement checkboxElement = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CheckboxElement ? (FormBlocker.Element.AbstractC0072Element.CheckboxElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                                                                                            if (checkboxElement != null) {
                                                                                                                                                                                                                                                                                                                                                checkBoxElement = checkboxElement.getValue();
                                                                                                                                                                                                                                                                                                                                                if (checkBoxElement == null) {
                                                                                                                                                                                                                                                                                                                                                    return SpacingType.CHECKBOX;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.ListOrderedElement listOrderedElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.ListOrderedElement ? (FormBlocker.Element.AbstractC0072Element.ListOrderedElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                                                                                                    if (listOrderedElement2 != null) {
                                                                                                                                                                                                                                                                                                                                                        listOrderedElement = listOrderedElement2.getValue();
                                                                                                                                                                                                                                                                                                                                                        if (listOrderedElement == null) {
                                                                                                                                                                                                                                                                                                                                                            return SpacingType.LIST_ORDERED;
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.ListUnorderedElement listUnorderedElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.ListUnorderedElement ? (FormBlocker.Element.AbstractC0072Element.ListUnorderedElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                                                                                                            if (listUnorderedElement2 != null) {
                                                                                                                                                                                                                                                                                                                                                                listUnorderedElement = listUnorderedElement2.getValue();
                                                                                                                                                                                                                                                                                                                                                                if (listUnorderedElement == null) {
                                                                                                                                                                                                                                                                                                                                                                    return SpacingType.LIST_UNORDERED;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                                                                                                                    FormBlocker.Element.AbstractC0072Element.CellDefaultElement cellDefaultElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.CellDefaultElement ? (FormBlocker.Element.AbstractC0072Element.CellDefaultElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                                                                                                                    if (cellDefaultElement2 != null) {
                                                                                                                                                                                                                                                                                                                                                                        cellDefaultElement = cellDefaultElement2.getValue();
                                                                                                                                                                                                                                                                                                                                                                        if (cellDefaultElement == null) {
                                                                                                                                                                                                                                                                                                                                                                            return SpacingType.CELL_DEFAULT;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        if (abstractC0072Element != null) {
                                                                                                                                                                                                                                                                                                                                                                            FormBlocker.Element.AbstractC0072Element.SectionHeaderElement sectionHeaderElement2 = abstractC0072Element instanceof FormBlocker.Element.AbstractC0072Element.SectionHeaderElement ? (FormBlocker.Element.AbstractC0072Element.SectionHeaderElement) abstractC0072Element : null;
                                                                                                                                                                                                                                                                                                                                                                            if (sectionHeaderElement2 != null) {
                                                                                                                                                                                                                                                                                                                                                                                sectionHeaderElement = sectionHeaderElement2.getValue();
                                                                                                                                                                                                                                                                                                                                                                                if (sectionHeaderElement == null) {
                                                                                                                                                                                                                                                                                                                                                                                    return SpacingType.SECTION_HEADER;
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                return null;
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        sectionHeaderElement = null;
                                                                                                                                                                                                                                                                                                                                                                        if (sectionHeaderElement == null) {
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                cellDefaultElement = null;
                                                                                                                                                                                                                                                                                                                                                                if (cellDefaultElement == null) {
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        listUnorderedElement = null;
                                                                                                                                                                                                                                                                                                                                                        if (listUnorderedElement == null) {
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                listOrderedElement = null;
                                                                                                                                                                                                                                                                                                                                                if (listOrderedElement == null) {
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        checkBoxElement = null;
                                                                                                                                                                                                                                                                                                                                        if (checkBoxElement == null) {
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                profilePreviewElement = null;
                                                                                                                                                                                                                                                                                                                                if (profilePreviewElement == null) {
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        paymentPlanSummaryElement = null;
                                                                                                                                                                                                                                                                                                                        if (paymentPlanSummaryElement == null) {
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                paymentPlanScheduleElement = null;
                                                                                                                                                                                                                                                                                                                if (paymentPlanScheduleElement == null) {
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        merchantTransactionOptionPicker = null;
                                                                                                                                                                                                                                                                                                        if (merchantTransactionOptionPicker == null) {
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                merchantTransactionElement = null;
                                                                                                                                                                                                                                                                                                if (merchantTransactionElement == null) {
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        upsellElement = null;
                                                                                                                                                                                                                                                                                        if (upsellElement == null) {
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                familyUpsellElement = null;
                                                                                                                                                                                                                                                                                if (familyUpsellElement == null) {
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        emojiPickerElement = null;
                                                                                                                                                                                                                                                                        if (emojiPickerElement == null) {
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                copyableElementGroup = null;
                                                                                                                                                                                                                                                                if (copyableElementGroup == null) {
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        noticeElement = null;
                                                                                                                                                                                                                                                        if (noticeElement == null) {
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                moneyInputElement = null;
                                                                                                                                                                                                                                                if (moneyInputElement == null) {
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        cardElement = null;
                                                                                                                                                                                                                                        if (cardElement == null) {
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                giftCardElement = null;
                                                                                                                                                                                                                                if (giftCardElement == null) {
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        heroHeaderElement = null;
                                                                                                                                                                                                                        if (heroHeaderElement == null) {
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                heroElement = null;
                                                                                                                                                                                                                if (heroElement == null) {
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        captionedTileElement = null;
                                                                                                                                                                                                        if (captionedTileElement == null) {
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                callToActionElement = null;
                                                                                                                                                                                                if (callToActionElement == null) {
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        selectableInputElement = null;
                                                                                                                                                                                        if (selectableInputElement == null) {
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                selectableRowElement = null;
                                                                                                                                                                                if (selectableRowElement == null) {
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        timelineElement = null;
                                                                                                                                                                        if (timelineElement == null) {
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                textInputElement = null;
                                                                                                                                                                if (textInputElement == null) {
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        locationElement = null;
                                                                                                                                                        if (locationElement == null) {
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                legalTextElement = null;
                                                                                                                                                if (legalTextElement == null) {
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    textElement = null;
                                                                                                                                    if (textElement == null) {
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            fixedSpacerElement = null;
                                                                                                                            if (fixedSpacerElement == null) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    spacerElement = null;
                                                                                                                    if (spacerElement == null) {
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            remoteImageElement = null;
                                                                                                            if (remoteImageElement == null) {
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    optionPickerElement = null;
                                                                                                    if (optionPickerElement == null) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            multilineTextInputElement = null;
                                                                                            if (multilineTextInputElement == null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    moneyElement = null;
                                                                                    if (moneyElement == null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            localImageElement = null;
                                                                            if (localImageElement == null) {
                                                                            }
                                                                        }
                                                                    }
                                                                    dividerElement = null;
                                                                    if (dividerElement == null) {
                                                                    }
                                                                }
                                                            }
                                                            detailRowElement = null;
                                                            if (detailRowElement == null) {
                                                            }
                                                        }
                                                    }
                                                    customizedCardElement = null;
                                                    if (customizedCardElement == null) {
                                                    }
                                                }
                                            }
                                            dateInputElement = null;
                                            if (dateInputElement == null) {
                                            }
                                        }
                                    }
                                    cashtagElement = null;
                                    if (cashtagElement == null) {
                                    }
                                }
                            }
                        }
                        buttonElement = null;
                        if (buttonElement == null) {
                        }
                    }
                }
                avatarElement = null;
                if (avatarElement == null) {
                }
            }
        }
        addressElement = null;
        if (addressElement == null) {
        }
    }

    public final int spacingBetween(FormBlocker.Element element, FormBlocker.Element element2) {
        element2.getClass();
        SpacingType spacingType = element != null ? toSpacingType(element) : null;
        SpacingType spacingType2 = toSpacingType(element2);
        Pair pair = new Pair(spacingType, spacingType2);
        MapBuilder mapBuilder = this.spacingsInDp;
        Dp dp = (Dp) mapBuilder.get(pair);
        Context context = this.context;
        if (dp != null) {
            return (int) Views.dip(context, dp.value);
        }
        SpacingType spacingType3 = SpacingType.ALL_ELEMENTS;
        Dp dp2 = (Dp) mapBuilder.get(new Pair(spacingType, spacingType3));
        if (dp2 != null) {
            return (int) Views.dip(context, dp2.value);
        }
        Dp dp3 = (Dp) mapBuilder.get(new Pair(spacingType3, spacingType2));
        return dp3 != null ? (int) Views.dip(context, dp3.value) : Views.dip(context, 16);
    }
}
