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
public final class TextAlign {
    public static final /* synthetic */ TextAlign[] $VALUES;
    public static final Lazy $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final TextAlign Natural;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/arcade/values/TextAlign$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/arcade/values/TextAlign;", "serializer", "()Lkotlinx/serialization/KSerializer;", "values"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) TextAlign.$cachedSerializer$delegate.getValue();
        }
    }

    static {
        TextAlign textAlign = new TextAlign("Natural", 0);
        Natural = textAlign;
        $VALUES = new TextAlign[]{textAlign, new TextAlign("Left", 1), new TextAlign("Center", 2), new TextAlign("Right", 3)};
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Shape$$ExternalSyntheticLambda0(9));
    }

    public static TextAlign valueOf(String str) {
        return (TextAlign) Enum.valueOf(TextAlign.class, str);
    }

    public static TextAlign[] values() {
        return (TextAlign[]) $VALUES.clone();
    }
}
