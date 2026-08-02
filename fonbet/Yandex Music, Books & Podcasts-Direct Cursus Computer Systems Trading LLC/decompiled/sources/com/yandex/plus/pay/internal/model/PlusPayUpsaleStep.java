package com.yandex.plus.pay.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.j66;
import defpackage.qdb;
import defpackage.t9f;
import defpackage.udb;
import defpackage.vhp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u0010"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHECKOUT", "UPSALE", "PRESALE", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes5.dex */
public final class PlusPayUpsaleStep implements Parcelable {
    private static final /* synthetic */ qdb $ENTRIES;
    private static final /* synthetic */ PlusPayUpsaleStep[] $VALUES;

    @NotNull
    private static final arf $cachedSerializer$delegate;

    @NotNull
    public static final Parcelable.Creator<PlusPayUpsaleStep> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final PlusPayUpsaleStep CHECKOUT = new PlusPayUpsaleStep("CHECKOUT", 0);
    public static final PlusPayUpsaleStep UPSALE = new PlusPayUpsaleStep("UPSALE", 1);
    public static final PlusPayUpsaleStep PRESALE = new PlusPayUpsaleStep("PRESALE", 2);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep$Companion;", "", "<init>", "()V", "Lt9f;", "Lcom/yandex/plus/pay/internal/model/PlusPayUpsaleStep;", "serializer", "()Lt9f;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ t9f get$cachedSerializer() {
            return (t9f) PlusPayUpsaleStep.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final t9f serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final /* synthetic */ PlusPayUpsaleStep[] $values() {
        return new PlusPayUpsaleStep[]{CHECKOUT, UPSALE, PRESALE};
    }

    static {
        PlusPayUpsaleStep[] $values = $values();
        $VALUES = $values;
        $ENTRIES = j66.Q($values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<PlusPayUpsaleStep>() { // from class: com.yandex.plus.pay.internal.model.PlusPayUpsaleStep.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlusPayUpsaleStep createFromParcel(Parcel parcel) {
                parcel.getClass();
                return PlusPayUpsaleStep.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PlusPayUpsaleStep[] newArray(int i) {
                return new PlusPayUpsaleStep[i];
            }
        };
        $cachedSerializer$delegate = btf.a(bwf.b, new a(17));
    }

    private PlusPayUpsaleStep(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t9f _init_$_anonymous_() {
        PlusPayUpsaleStep[] values = values();
        values.getClass();
        return new udb("com.yandex.plus.pay.internal.model.PlusPayUpsaleStep", values);
    }

    @NotNull
    public static qdb getEntries() {
        return $ENTRIES;
    }

    public static PlusPayUpsaleStep valueOf(String str) {
        return (PlusPayUpsaleStep) Enum.valueOf(PlusPayUpsaleStep.class, str);
    }

    public static PlusPayUpsaleStep[] values() {
        return (PlusPayUpsaleStep[]) $VALUES.clone();
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
