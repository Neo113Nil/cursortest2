package com.squareup.cash.borrow.views;

import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class BulletinTileKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[BorrowAppletBulletinsTile.Data.Bulletin.Accessory.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[BorrowAppletBulletinsTile.Data.Bulletin.IconShape.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            UiControl.Type.Companion companion = BorrowAppletBulletinsTile.Data.Bulletin.IconShape.Companion;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr3 = new int[BorrowAppletBulletinsTile.Data.Bulletin.Icon.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            ClientDriven.Companion companion2 = BorrowAppletBulletinsTile.Data.Bulletin.Icon.Companion;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            ClientDriven.Companion companion3 = BorrowAppletBulletinsTile.Data.Bulletin.Icon.Companion;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            ClientDriven.Companion companion4 = BorrowAppletBulletinsTile.Data.Bulletin.Icon.Companion;
            iArr3[3] = 4;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
