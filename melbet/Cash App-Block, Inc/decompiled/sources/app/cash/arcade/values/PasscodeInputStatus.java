package app.cash.arcade.values;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes3.dex */
public final class PasscodeInputStatus {
    public static final /* synthetic */ PasscodeInputStatus[] $VALUES;
    public static final Lazy $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final PasscodeInputStatus FAILURE;
    public static final PasscodeInputStatus NONE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/PasscodeInputStatus$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/PasscodeInputStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) PasscodeInputStatus.$cachedSerializer$delegate.getValue();
        }
    }

    static {
        PasscodeInputStatus passcodeInputStatus = new PasscodeInputStatus("NONE", 0);
        NONE = passcodeInputStatus;
        PasscodeInputStatus passcodeInputStatus2 = new PasscodeInputStatus("SUCCESS", 1);
        PasscodeInputStatus passcodeInputStatus3 = new PasscodeInputStatus("FAILURE", 2);
        FAILURE = passcodeInputStatus3;
        $VALUES = new PasscodeInputStatus[]{passcodeInputStatus, passcodeInputStatus2, passcodeInputStatus3, new PasscodeInputStatus("TOO_MANY_ATTEMPTS", 3)};
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Shape$$ExternalSyntheticLambda0(5));
    }

    public static PasscodeInputStatus valueOf(String str) {
        return (PasscodeInputStatus) Enum.valueOf(PasscodeInputStatus.class, str);
    }

    public static PasscodeInputStatus[] values() {
        return (PasscodeInputStatus[]) $VALUES.clone();
    }
}
