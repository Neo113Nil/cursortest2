package com.yandex.plus.pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.plus.home.repository.api.model.webconfig.q;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.j66;
import defpackage.mhp;
import defpackage.qdb;
import defpackage.t9f;
import defpackage.u7g;
import defpackage.udb;
import defpackage.vhp;
import defpackage.wq5;
import defpackage.xhp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0003/0.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010 ¨\u00061"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;", "Landroid/os/Parcelable;", "", "purchaseToken", "Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams$Strategy;", "strategy", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams$Strategy;)V", "", "seen0", "Lxhp;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams$Strategy;Lxhp;)V", "self", "Lwq5;", "output", "Lmhp;", "serialDesc", "", "write$Self$pay_sdk_release", "(Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;Lwq5;Lmhp;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams$Strategy;", "copy", "(Ljava/lang/String;Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams$Strategy;)Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPurchaseToken", "Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams$Strategy;", "getStrategy", "Companion", "Strategy", "$serializer", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes5.dex */
public final /* data */ class PlusPayInAppReplacementParams implements Parcelable {

    @NotNull
    private final String purchaseToken;

    @NotNull
    private final Strategy strategy;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PlusPayInAppReplacementParams> CREATOR = new Creator();

    @NotNull
    private static final arf[] $childSerializers = {null, btf.a(bwf.b, new q(23))};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final t9f serializer() {
            return PlusPayInAppReplacementParams$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Creator implements Parcelable.Creator<PlusPayInAppReplacementParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayInAppReplacementParams createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PlusPayInAppReplacementParams(parcel.readString(), Strategy.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayInAppReplacementParams[] newArray(int i) {
            return new PlusPayInAppReplacementParams[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000f"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams$Strategy;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHARGE_FULL_PRICE", "DEFERRED", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    @vhp
    public static final class Strategy implements Parcelable {
        private static final /* synthetic */ qdb $ENTRIES;
        private static final /* synthetic */ Strategy[] $VALUES;

        @NotNull
        private static final arf $cachedSerializer$delegate;

        @NotNull
        public static final Parcelable.Creator<Strategy> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Strategy CHARGE_FULL_PRICE = new Strategy("CHARGE_FULL_PRICE", 0);
        public static final Strategy DEFERRED = new Strategy("DEFERRED", 1);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams$Strategy$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/api/model/PlusPayInAppReplacementParams$Strategy;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ t9f get$cachedSerializer() {
                return (t9f) Strategy.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final t9f serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final class Creator implements Parcelable.Creator<Strategy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Strategy createFromParcel(Parcel parcel) {
                parcel.getClass();
                return Strategy.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Strategy[] newArray(int i) {
                return new Strategy[i];
            }
        }

        private static final /* synthetic */ Strategy[] $values() {
            return new Strategy[]{CHARGE_FULL_PRICE, DEFERRED};
        }

        static {
            Strategy[] $values = $values();
            $VALUES = $values;
            $ENTRIES = j66.Q($values);
            INSTANCE = new Companion(null);
            CREATOR = new Creator();
            $cachedSerializer$delegate = btf.a(bwf.b, new q(24));
        }

        private Strategy(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t9f _init_$_anonymous_() {
            Strategy[] values = values();
            values.getClass();
            return new udb("com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams.Strategy", values);
        }

        @NotNull
        public static qdb getEntries() {
            return $ENTRIES;
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(name());
        }
    }

    public /* synthetic */ PlusPayInAppReplacementParams(int i, String str, Strategy strategy, xhp xhpVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, PlusPayInAppReplacementParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.purchaseToken = str;
        this.strategy = strategy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ t9f _childSerializers$_anonymous_() {
        return Strategy.INSTANCE.serializer();
    }

    public static /* synthetic */ PlusPayInAppReplacementParams copy$default(PlusPayInAppReplacementParams plusPayInAppReplacementParams, String str, Strategy strategy, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPayInAppReplacementParams.purchaseToken;
        }
        if ((i & 2) != 0) {
            strategy = plusPayInAppReplacementParams.strategy;
        }
        return plusPayInAppReplacementParams.copy(str, strategy);
    }

    public static final /* synthetic */ void write$Self$pay_sdk_release(PlusPayInAppReplacementParams self, wq5 output, mhp serialDesc) {
        arf[] arfVarArr = $childSerializers;
        output.p(serialDesc, 0, self.purchaseToken);
        output.k(serialDesc, 1, (t9f) arfVarArr[1].getValue(), self.strategy);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Strategy getStrategy() {
        return this.strategy;
    }

    @NotNull
    public final PlusPayInAppReplacementParams copy(@NotNull String purchaseToken, @NotNull Strategy strategy) {
        purchaseToken.getClass();
        strategy.getClass();
        return new PlusPayInAppReplacementParams(purchaseToken, strategy);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayInAppReplacementParams)) {
            return false;
        }
        PlusPayInAppReplacementParams plusPayInAppReplacementParams = (PlusPayInAppReplacementParams) other;
        return Intrinsics.d(this.purchaseToken, plusPayInAppReplacementParams.purchaseToken) && this.strategy == plusPayInAppReplacementParams.strategy;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    public final Strategy getStrategy() {
        return this.strategy;
    }

    public int hashCode() {
        return this.strategy.hashCode() + (this.purchaseToken.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PlusPayInAppReplacementParams(purchaseToken=" + this.purchaseToken + ", strategy=" + this.strategy + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.purchaseToken);
        this.strategy.writeToParcel(dest, flags);
    }

    public PlusPayInAppReplacementParams(@NotNull String str, @NotNull Strategy strategy) {
        str.getClass();
        strategy.getClass();
        this.purchaseToken = str;
        this.strategy = strategy;
    }
}
