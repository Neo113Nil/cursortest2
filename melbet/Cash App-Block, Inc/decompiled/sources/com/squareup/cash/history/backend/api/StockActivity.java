package com.squareup.cash.history.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;

/* loaded from: classes6.dex */
public final class StockActivity {
    public final Money amount;
    public final long dateInMillis;
    public final Side side;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Side {
        public static final /* synthetic */ Side[] $VALUES;
        public static final Side BUY;
        public static final Side SELL;

        static {
            Side side = new Side("BUY", 0);
            BUY = side;
            Side side2 = new Side("SELL", 1);
            SELL = side2;
            $VALUES = new Side[]{side, side2};
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }

    public StockActivity(Money money, Side side, long j) {
        this.amount = money;
        this.side = side;
        this.dateInMillis = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockActivity)) {
            return false;
        }
        StockActivity stockActivity = (StockActivity) obj;
        return this.amount.equals(stockActivity.amount) && this.side == stockActivity.side && this.dateInMillis == stockActivity.dateInMillis;
    }

    public final int hashCode() {
        return Long.hashCode(this.dateInMillis) + ((this.side.hashCode() + (this.amount.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StockActivity(amount=");
        sb.append(this.amount);
        sb.append(", side=");
        sb.append(this.side);
        sb.append(", dateInMillis=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.dateInMillis, ")", sb);
    }
}
