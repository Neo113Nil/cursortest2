package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.compose.ui.platform.AccessibilityIterators$ParagraphTextSegmentIterator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.screens.InstrumentSelectionData;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.protos.cash.ui.Image;

/* loaded from: classes6.dex */
public abstract class zzafe {
    public static AccessibilityIterators$ParagraphTextSegmentIterator getInstance() {
        if (AccessibilityIterators$ParagraphTextSegmentIterator.instance == null) {
            AccessibilityIterators$ParagraphTextSegmentIterator.instance = new AccessibilityIterators$ParagraphTextSegmentIterator(4, false);
        }
        AccessibilityIterators$ParagraphTextSegmentIterator accessibilityIterators$ParagraphTextSegmentIterator = AccessibilityIterators$ParagraphTextSegmentIterator.instance;
        accessibilityIterators$ParagraphTextSegmentIterator.getClass();
        return accessibilityIterators$ParagraphTextSegmentIterator;
    }

    public static final InstrumentAvatarViewModel.Image toAvatarImage(Image image) {
        image.getClass();
        String str = image.light_url;
        if (str == null) {
            return null;
        }
        String str2 = image.dark_url;
        if (str2 == null) {
            str2 = str;
        }
        return new InstrumentAvatarViewModel.Image(str, str2);
    }

    public static final InstrumentAvatarViewModel.FallbackIcon toFallbackIcon(InstrumentSelectionData.InstrumentOption.IconStyle iconStyle) {
        iconStyle.getClass();
        if (iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.NewLink) {
            return InstrumentAvatarViewModel.FallbackIcon.Add.INSTANCE;
        }
        if (iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.Card) {
            return new InstrumentAvatarViewModel.FallbackIcon.Card(null);
        }
        if (iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.Bank) {
            return InstrumentAvatarViewModel.FallbackIcon.Bank.INSTANCE;
        }
        if (iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.Balance) {
            return new InstrumentAvatarViewModel.FallbackIcon.Balance(((InstrumentSelectionData.InstrumentOption.IconStyle.Balance) iconStyle).currencyCode);
        }
        if (iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.AppIcon) {
            return InstrumentAvatarViewModel.FallbackIcon.AppIcon.INSTANCE;
        }
        if (iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.GooglePayIcon) {
            return InstrumentAvatarViewModel.FallbackIcon.GooglePayIcon.INSTANCE;
        }
        if (iconStyle instanceof InstrumentSelectionData.InstrumentOption.IconStyle.EmojiIcon) {
            return new InstrumentAvatarViewModel.FallbackIcon.EmojiIcon(((InstrumentSelectionData.InstrumentOption.IconStyle.EmojiIcon) iconStyle).iconId);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing icon style to determine fallback icon");
        return null;
    }
}
