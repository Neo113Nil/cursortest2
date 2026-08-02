package com.squareup.cash.shopping.presenters;

import androidx.media3.extractor.text.CueEncoder;
import app.cash.directory.data.Directory$Section;
import com.squareup.cash.shopping.db.ImageType;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.customersearch.api.SearchCommonPlaceholderSection;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.franklin.api.UiAlias;
import okio.ByteString;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class ShopHubMapperKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$5;

    static {
        int[] iArr = new int[Directory$Section.Type.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            CueEncoder cueEncoder = Directory$Section.Type.Companion;
            iArr[4] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            CueEncoder cueEncoder2 = Directory$Section.Type.Companion;
            iArr[0] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            CueEncoder cueEncoder3 = Directory$Section.Type.Companion;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            CueEncoder cueEncoder4 = Directory$Section.Type.Companion;
            iArr[7] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[SearchCommonPlaceholderSection.Identifier.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            RadioType.Companion companion = SearchCommonPlaceholderSection.Identifier.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            RadioType.Companion companion2 = SearchCommonPlaceholderSection.Identifier.Companion;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[ImageType.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            ImageType imageType = ImageType.CARD;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        int[] iArr4 = new int[Button.ButtonAction.values().length];
        try {
            iArr4[2] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            ContactAliasType.Companion companion3 = Button.ButtonAction.Companion;
            iArr4[0] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            ContactAliasType.Companion companion4 = Button.ButtonAction.Companion;
            iArr4[1] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        int[] iArr5 = new int[Section.Layout.values().length];
        try {
            iArr5[0] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            ByteString.Companion companion5 = Section.Layout.Companion;
            iArr5[2] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            ByteString.Companion companion6 = Section.Layout.Companion;
            iArr5[4] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            ByteString.Companion companion7 = Section.Layout.Companion;
            iArr5[6] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            ByteString.Companion companion8 = Section.Layout.Companion;
            iArr5[1] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            ByteString.Companion companion9 = Section.Layout.Companion;
            iArr5[3] = 6;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            ByteString.Companion companion10 = Section.Layout.Companion;
            iArr5[5] = 7;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            ByteString.Companion companion11 = Section.Layout.Companion;
            iArr5[7] = 8;
        } catch (NoSuchFieldError unused21) {
        }
        int[] iArr6 = new int[Metadata.EntityType.values().length];
        try {
            iArr6[2] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            UiAlias.Type.Companion companion12 = Metadata.EntityType.Companion;
            iArr6[4] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        $EnumSwitchMapping$5 = iArr6;
    }
}
