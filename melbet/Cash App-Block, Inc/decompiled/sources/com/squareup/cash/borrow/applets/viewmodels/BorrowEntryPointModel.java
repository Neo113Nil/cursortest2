package com.squareup.cash.borrow.applets.viewmodels;

import com.squareup.protos.lending.sync_values.BorrowData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BorrowEntryPointModel {

    public final class Installed implements BorrowEntryPointModel {
        public final String clientRoute;
        public final BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile fullWidthTile;

        public Installed(String str, BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile fullWidthTile) {
            str.getClass();
            fullWidthTile.getClass();
            this.clientRoute = str;
            this.fullWidthTile = fullWidthTile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Installed)) {
                return false;
            }
            Installed installed = (Installed) obj;
            return Intrinsics.areEqual(this.clientRoute, installed.clientRoute) && Intrinsics.areEqual(this.fullWidthTile, installed.fullWidthTile);
        }

        public final int hashCode() {
            return this.fullWidthTile.hashCode() + (this.clientRoute.hashCode() * 31);
        }

        public final String toString() {
            return "Installed(clientRoute=" + this.clientRoute + ", fullWidthTile=" + this.fullWidthTile + ")";
        }
    }

    public final class Uninstalled implements BorrowEntryPointModel {
        public final String clientRoute;
        public final BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile halfWidthTile;

        public Uninstalled(String str, BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile halfWidthTile) {
            str.getClass();
            halfWidthTile.getClass();
            this.clientRoute = str;
            this.halfWidthTile = halfWidthTile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return Intrinsics.areEqual(this.clientRoute, uninstalled.clientRoute) && Intrinsics.areEqual(this.halfWidthTile, uninstalled.halfWidthTile);
        }

        public final int hashCode() {
            return this.halfWidthTile.hashCode() + (this.clientRoute.hashCode() * 31);
        }

        public final String toString() {
            return "Uninstalled(clientRoute=" + this.clientRoute + ", halfWidthTile=" + this.halfWidthTile + ")";
        }
    }
}
