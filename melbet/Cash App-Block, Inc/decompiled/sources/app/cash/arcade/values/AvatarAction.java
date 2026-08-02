package app.cash.arcade.values;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

@SerialName("AvatarAction")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/cash/arcade/values/AvatarAction;", "Lapp/cash/arcade/values/TitleBarAction;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class AvatarAction implements TitleBarAction {
    public static final AvatarAction INSTANCE = new AvatarAction();
    public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Font$$ExternalSyntheticLambda0(6));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AvatarAction);
    }

    public final int hashCode() {
        return 1803190347;
    }

    public final KSerializer serializer() {
        return (KSerializer) $cachedSerializer$delegate.getValue();
    }

    public final String toString() {
        return "AvatarAction";
    }
}
