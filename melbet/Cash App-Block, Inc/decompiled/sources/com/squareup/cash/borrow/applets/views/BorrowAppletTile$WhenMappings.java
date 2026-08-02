package com.squareup.cash.borrow.applets.views;

import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.protos.lending.sync_values.BorrowData;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class BorrowAppletTile$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon.values().length];
        try {
            ClientDriven.Companion companion = BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ClientDriven.Companion companion2 = BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon.Companion;
            iArr[0] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
